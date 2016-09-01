/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.DepositoBancoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class DepositoBancoDetalleFormJInternalFrame extends DepositoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDepositoBanco;
	
	protected JMenuBar jmenuBarDetalleDepositoBanco;
	
	protected JMenu jmenuDetalleDepositoBanco;
	protected JMenu jmenuDetalleArchivoDepositoBanco;
	protected JMenu jmenuDetalleAccionesDepositoBanco;
	protected JMenu jmenuDetalleDatosDepositoBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDepositoBanco;	
	protected GridBagConstraints gridBagConstraintsDepositoBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DepositoBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDepositoBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public DepositoBancoSessionBean depositobancoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public BancoSessionBean bancoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public DepositoBancoLogic depositobancoLogic;
	
	public JScrollPane jScrollPanelDatosDepositoBanco;
	public JScrollPane jScrollPanelDatosEdicionDepositoBanco;
	public JScrollPane jScrollPanelDatosGeneralDepositoBanco;
	
	protected JPanel jPanelCamposDepositoBanco;    
	protected JPanel jPanelCamposOcultosDepositoBanco;    	
	protected JPanel jPanelAccionesDepositoBanco;
	protected JPanel jPanelAccionesFormularioDepositoBanco;
    
	
	
	protected Integer iXPanelCamposDepositoBanco=0;
	protected Integer iYPanelCamposDepositoBanco=0;
	
	protected Integer iXPanelCamposOcultosDepositoBanco=0;
	protected Integer iYPanelCamposOcultosDepositoBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDepositoBanco;
	public JButton jButtonModificarDepositoBanco;
	public JButton jButtonActualizarDepositoBanco;
    public JButton jButtonEliminarDepositoBanco;
	public JButton jButtonCancelarDepositoBanco;
    public JButton jButtonGuardarCambiosDepositoBanco;
	public JButton jButtonGuardarCambiosTablaDepositoBanco;
	protected JButton jButtonCerrarDepositoBanco;
	
	
	protected JButton jButtonProcesarInformacionDepositoBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDepositoBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDepositoBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDepositoBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDepositoBanco;
	protected JButton jButtonModificarToolBarDepositoBanco;
	protected JButton jButtonActualizarToolBarDepositoBanco;
    protected JButton jButtonEliminarToolBarDepositoBanco;
	protected JButton jButtonCancelarToolBarDepositoBanco;
    protected JButton jButtonGuardarCambiosToolBarDepositoBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarDepositoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarDepositoBanco;
	protected JButton jButtonCerrarToolBarDepositoBanco;
	
	protected JButton jButtonProcesarInformacionToolBarDepositoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDepositoBanco;
	protected JMenuItem jMenuItemModificarDepositoBanco;
	protected JMenuItem jMenuItemActualizarDepositoBanco;
    protected JMenuItem jMenuItemEliminarDepositoBanco;
	protected JMenuItem jMenuItemCancelarDepositoBanco;
    protected JMenuItem jMenuItemGuardarCambiosDepositoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaDepositoBanco;
	protected JMenuItem jMenuItemCerrarDepositoBanco;
	protected JMenuItem jMenuItemDetalleCerrarDepositoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarDepositoBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionDepositoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDepositoBanco;
	protected JMenuItem jMenuItemMostrarOcultarDepositoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDepositoBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDepositoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDepositoBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDepositoBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDepositoBanco;
	public JLabel jLabelIdDepositoBanco;
	public JLabel jLabelidDepositoBanco;
	public JButton jButtonidDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelfechaDepositoBanco;
	public JLabel jLabelfechaDepositoBanco;
	//public JFormattedTextField jDateChooserfechaDepositoBanco;

	public JDateChooser jDateChooserfechaDepositoBanco;
	public JButton jButtonfechaDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_efectivoDepositoBanco;
	public JLabel jLabelvalor_efectivoDepositoBanco;
	public JTextField jTextFieldvalor_efectivoDepositoBanco;
	public JButton jButtonvalor_efectivoDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_chequeDepositoBanco;
	public JLabel jLabelvalor_chequeDepositoBanco;
	public JTextField jTextFieldvalor_chequeDepositoBanco;
	public JButton jButtonvalor_chequeDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDepositoBanco;
	public JLabel jLabeldescripcionDepositoBanco;
	public JTextArea jTextAreadescripcionDepositoBanco;
	public JScrollPane jscrollPanedescripcionDepositoBanco;
	public JButton jButtondescripcionDepositoBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDepositoBanco;
	public JLabel jLabelid_empresaDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDepositoBanco;
	public JButton jButtonid_empresaDepositoBanco= new JButtonMe();
	public JButton jButtonid_empresaDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDepositoBanco;
	public JLabel jLabelid_sucursalDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDepositoBanco;
	public JButton jButtonid_sucursalDepositoBanco= new JButtonMe();
	public JButton jButtonid_sucursalDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioDepositoBanco;
	public JLabel jLabelid_usuarioDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioDepositoBanco;
	public JButton jButtonid_usuarioDepositoBanco= new JButtonMe();
	public JButton jButtonid_usuarioDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoDepositoBanco;
	public JLabel jLabelid_bancoDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoDepositoBanco;
	public JButton jButtonid_bancoDepositoBanco= new JButtonMe();
	public JButton jButtonid_bancoDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_bancoDepositoBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDepositoBanco;
	public JLabel jLabelid_asiento_contableDepositoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDepositoBanco;
	public JButton jButtonid_asiento_contableDepositoBanco= new JButtonMe();
	public JButton jButtonid_asiento_contableDepositoBancoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDepositoBancoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDepositoBanco;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DepositoBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDepositoBanco=new JPanel();
				this.jPanelAccionesFormularioDepositoBanco=new JPanel();
				this.jmenuBarDetalleDepositoBanco=new JMenuBar();
				this.jTtoolBarDetalleDepositoBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DepositoBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DepositoBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DepositoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarDepositoBanco() {
		return this.jButtonActualizarToolBarDepositoBanco;
	}
	
	public JButton getjButtonEliminarToolBarDepositoBanco() {
		return this.jButtonEliminarToolBarDepositoBanco;
	}
	
	public JButton getjButtonCancelarToolBarDepositoBanco() {
		return this.jButtonCancelarToolBarDepositoBanco;
	}		
	
	public JButton getjButtonProcesarInformacionDepositoBanco() {
		return this.jButtonProcesarInformacionDepositoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDepositoBanco)	{
		this.jButtonProcesarInformacionDepositoBanco = jButtonProcesarInformacionDepositoBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDepositoBanco() {
		return this.jComboBoxTiposAccionesDepositoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDepositoBanco(
			JComboBox jComboBoxTiposRelacionesDepositoBanco) {
		this.jComboBoxTiposRelacionesDepositoBanco = jComboBoxTiposRelacionesDepositoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDepositoBanco(
			JComboBox jComboBoxTiposAccionesDepositoBanco) {
		this.jComboBoxTiposAccionesDepositoBanco = jComboBoxTiposAccionesDepositoBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDepositoBanco() {
		return this.jComboBoxTiposAccionesFormularioDepositoBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDepositoBanco(
			JComboBox jComboBoxTiposAccionesFormularioDepositoBanco) {
		this.jComboBoxTiposAccionesFormularioDepositoBanco = jComboBoxTiposAccionesFormularioDepositoBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.depositobancoSessionBean=new DepositoBancoSessionBean();
		
		this.depositobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.depositobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.depositobancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DepositoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DepositoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deposito Banco MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		DepositoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDepositoBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDepositoBanco=new JButtonMe();
				this.jButtonModificarToolBarDepositoBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDepositoBanco,this.jTtoolBarDetalleDepositoBanco,
							"actualizar","actualizar","Actualizar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDepositoBanco,this.jTtoolBarDetalleDepositoBanco,
							"eliminar","eliminar","Eliminar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDepositoBanco,this.jTtoolBarDetalleDepositoBanco,
							"cancelar","cancelar","Cancelar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDepositoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDepositoBanco,this.jTtoolBarDetalleDepositoBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDepositoBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDepositoBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDepositoBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDepositoBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDepositoBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDepositoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDepositoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDepositoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDepositoBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDepositoBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDepositoBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDepositoBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDepositoBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDepositoBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDepositoBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDepositoBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDepositoBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDepositoBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDepositoBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDepositoBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDepositoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDepositoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDepositoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDepositoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDepositoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDepositoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDepositoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDepositoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDepositoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDepositoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDepositoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDepositoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDepositoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDepositoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDepositoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDepositoBanco.add(this.jMenuItemDetalleCerrarDepositoBanco);
		
		this.jmenuDetalleAccionesDepositoBanco.add(this.jMenuItemActualizarDepositoBanco);
		this.jmenuDetalleAccionesDepositoBanco.add(this.jMenuItemEliminarDepositoBanco);
		this.jmenuDetalleAccionesDepositoBanco.add(this.jMenuItemCancelarDepositoBanco);		
		
		//this.jmenuDetalleDatosDepositoBanco.add(this.jMenuItemDetalleAbrirOrderByDepositoBanco);				
		this.jmenuDetalleDatosDepositoBanco.add(this.jMenuItemDetalleMostarOcultarDepositoBanco);				
				
		//this.jmenuDetalleAccionesDepositoBanco.add(this.jMenuItemGuardarCambiosDepositoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDepositoBanco.add(this.jmenuDetalleArchivoDepositoBanco);		
		this.jmenuBarDetalleDepositoBanco.add(this.jmenuDetalleAccionesDepositoBanco);		
		this.jmenuBarDetalleDepositoBanco.add(this.jmenuDetalleDatosDepositoBanco);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDepositoBanco);				
	}
	
	
	public void inicializarElementosCamposDepositoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDepositoBanco = new JLabelMe();
		jLabelIdDepositoBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDepositoBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDepositoBanco= new GridBagLayout();

		this.jPanelidDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);

		jLabelidDepositoBanco = new JLabel();
		jLabelidDepositoBanco.setText("Id");

		jLabelidDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaDepositoBanco = new JLabelMe();
		this.jLabelfechaDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDepositoBanco.setToolTipText("Fecha");
		this.jLabelfechaDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelfechaDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		//jFormattedTextFieldfechaDepositoBanco= new JFormattedTextFieldMe();

		jDateChooserfechaDepositoBanco= new JDateChooser();
		jDateChooserfechaDepositoBanco.setEnabled(false);
		jDateChooserfechaDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDepositoBanco.setDate(new Date());
		jDateChooserfechaDepositoBanco.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDepositoBanco.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDepositoBancoBusqueda= new JButtonMe();
		this.jButtonfechaDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDepositoBancoBusqueda.setText("U");
		this.jButtonfechaDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDepositoBancoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_efectivoDepositoBanco = new JLabelMe();
		this.jLabelvalor_efectivoDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO+" : *");
		this.jLabelvalor_efectivoDepositoBanco.setToolTipText("Valor Efectivo");
		this.jLabelvalor_efectivoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_efectivoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_efectivoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_efectivoDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_efectivoDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_efectivoDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_VALOREFECTIVO);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelvalor_efectivoDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jTextFieldvalor_efectivoDepositoBanco= new JTextFieldMe();
		jTextFieldvalor_efectivoDepositoBanco.setEnabled(false);
		jTextFieldvalor_efectivoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_efectivoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_efectivoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_efectivoDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_efectivoDepositoBanco.setText("0.0");

		this.jButtonvalor_efectivoDepositoBancoBusqueda= new JButtonMe();
		this.jButtonvalor_efectivoDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_efectivoDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_efectivoDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_efectivoDepositoBancoBusqueda.setText("U");
		this.jButtonvalor_efectivoDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_efectivoDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_efectivoDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_efectivoDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_efectivoDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_efectivoDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_efectivoDepositoBancoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_chequeDepositoBanco = new JLabelMe();
		this.jLabelvalor_chequeDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE+" : *");
		this.jLabelvalor_chequeDepositoBanco.setToolTipText("Valor Cheque");
		this.jLabelvalor_chequeDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_chequeDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_chequeDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_chequeDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_chequeDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_chequeDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_VALORCHEQUE);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelvalor_chequeDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jTextFieldvalor_chequeDepositoBanco= new JTextFieldMe();
		jTextFieldvalor_chequeDepositoBanco.setEnabled(false);
		jTextFieldvalor_chequeDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_chequeDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_chequeDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_chequeDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_chequeDepositoBanco.setText("0.0");

		this.jButtonvalor_chequeDepositoBancoBusqueda= new JButtonMe();
		this.jButtonvalor_chequeDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_chequeDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_chequeDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_chequeDepositoBancoBusqueda.setText("U");
		this.jButtonvalor_chequeDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_chequeDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_chequeDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_chequeDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_chequeDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_chequeDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_chequeDepositoBancoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDepositoBanco = new JLabelMe();
		this.jLabeldescripcionDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDepositoBanco.setToolTipText("Descripcion");
		this.jLabeldescripcionDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPaneldescripcionDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jTextAreadescripcionDepositoBanco= new JTextAreaMe();
		jTextAreadescripcionDepositoBanco.setEnabled(false);
		jTextAreadescripcionDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDepositoBanco.setLineWrap(true);
		jTextAreadescripcionDepositoBanco.setWrapStyleWord(true);
		jTextAreadescripcionDepositoBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDepositoBanco.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDepositoBanco = new JScrollPane(jTextAreadescripcionDepositoBanco);
		jscrollPanedescripcionDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDepositoBancoBusqueda= new JButtonMe();
		this.jButtondescripcionDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDepositoBancoBusqueda.setText("U");
		this.jButtondescripcionDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDepositoBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDepositoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDepositoBanco = new JLabelMe();
		this.jLabelid_empresaDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDepositoBanco.setToolTipText("Empresa");
		this.jLabelid_empresaDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelid_empresaDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jComboBoxid_empresaDepositoBanco= new JComboBoxMe();
		jComboBoxid_empresaDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDepositoBanco.setEnabled(false);

		this.jButtonid_empresaDepositoBanco= new JButtonMe();
		this.jButtonid_empresaDepositoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepositoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepositoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDepositoBanco.setText("Buscar");
		this.jButtonid_empresaDepositoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDepositoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepositoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepositoBanco"));

		this.jButtonid_empresaDepositoBancoBusqueda= new JButtonMe();
		this.jButtonid_empresaDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDepositoBancoBusqueda.setText("U");
		this.jButtonid_empresaDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDepositoBancoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDepositoBancoUpdate= new JButtonMe();
		this.jButtonid_empresaDepositoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepositoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDepositoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDepositoBancoUpdate.setText("U");
		this.jButtonid_empresaDepositoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDepositoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDepositoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDepositoBancoUpdate"));



					
		this.jLabelid_sucursalDepositoBanco = new JLabelMe();
		this.jLabelid_sucursalDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDepositoBanco.setToolTipText("Sucursal");
		this.jLabelid_sucursalDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelid_sucursalDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jComboBoxid_sucursalDepositoBanco= new JComboBoxMe();
		jComboBoxid_sucursalDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDepositoBanco.setEnabled(false);

		this.jButtonid_sucursalDepositoBanco= new JButtonMe();
		this.jButtonid_sucursalDepositoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDepositoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDepositoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDepositoBanco.setText("Buscar");
		this.jButtonid_sucursalDepositoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDepositoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDepositoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDepositoBanco"));

		this.jButtonid_sucursalDepositoBancoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDepositoBancoBusqueda.setText("U");
		this.jButtonid_sucursalDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDepositoBancoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDepositoBancoUpdate= new JButtonMe();
		this.jButtonid_sucursalDepositoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepositoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDepositoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDepositoBancoUpdate.setText("U");
		this.jButtonid_sucursalDepositoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDepositoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDepositoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDepositoBancoUpdate"));



					
		this.jLabelid_usuarioDepositoBanco = new JLabelMe();
		this.jLabelid_usuarioDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioDepositoBanco.setToolTipText("Usuario");
		this.jLabelid_usuarioDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelid_usuarioDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jComboBoxid_usuarioDepositoBanco= new JComboBoxMe();
		jComboBoxid_usuarioDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioDepositoBanco.setEnabled(false);

		this.jButtonid_usuarioDepositoBanco= new JButtonMe();
		this.jButtonid_usuarioDepositoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDepositoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDepositoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDepositoBanco.setText("Buscar");
		this.jButtonid_usuarioDepositoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioDepositoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDepositoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDepositoBanco"));

		this.jButtonid_usuarioDepositoBancoBusqueda= new JButtonMe();
		this.jButtonid_usuarioDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDepositoBancoBusqueda.setText("U");
		this.jButtonid_usuarioDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioDepositoBancoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioDepositoBancoUpdate= new JButtonMe();
		this.jButtonid_usuarioDepositoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDepositoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDepositoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDepositoBancoUpdate.setText("U");
		this.jButtonid_usuarioDepositoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioDepositoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDepositoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDepositoBancoUpdate"));



					
		this.jLabelid_bancoDepositoBanco = new JLabelMe();
		this.jLabelid_bancoDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoDepositoBanco.setToolTipText("Banco");
		this.jLabelid_bancoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelid_bancoDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jComboBoxid_bancoDepositoBanco= new JComboBoxMe();
		jComboBoxid_bancoDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoDepositoBanco= new JButtonMe();
		this.jButtonid_bancoDepositoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoDepositoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoDepositoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoDepositoBanco.setText("Buscar");
		this.jButtonid_bancoDepositoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoDepositoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoDepositoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoDepositoBanco"));

		this.jButtonid_bancoDepositoBancoBusqueda= new JButtonMe();
		this.jButtonid_bancoDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoDepositoBancoBusqueda.setText("U");
		this.jButtonid_bancoDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoDepositoBancoBusqueda.setVisible(false);		}

		this.jButtonid_bancoDepositoBancoUpdate= new JButtonMe();
		this.jButtonid_bancoDepositoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDepositoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDepositoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoDepositoBancoUpdate.setText("U");
		this.jButtonid_bancoDepositoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoDepositoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoDepositoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoDepositoBancoUpdate"));



					
		this.jLabelid_asiento_contableDepositoBanco = new JLabelMe();
		this.jLabelid_asiento_contableDepositoBanco.setText(""+DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" :");
		this.jLabelid_asiento_contableDepositoBanco.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDepositoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDepositoBanco.setToolTipText(DepositoBancoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDepositoBanco = new GridBagLayout();
		this.jPanelid_asiento_contableDepositoBanco.setLayout(this.gridaBagLayoutDepositoBanco);


		jComboBoxid_asiento_contableDepositoBanco= new JComboBoxMe();
		jComboBoxid_asiento_contableDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDepositoBanco= new JButtonMe();
		this.jButtonid_asiento_contableDepositoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDepositoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDepositoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDepositoBanco.setText("Buscar");
		this.jButtonid_asiento_contableDepositoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDepositoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDepositoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDepositoBanco"));

		this.jButtonid_asiento_contableDepositoBancoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDepositoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDepositoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDepositoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDepositoBancoBusqueda.setText("U");
		this.jButtonid_asiento_contableDepositoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDepositoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDepositoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDepositoBancoBusqueda"));

		if(this.depositobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDepositoBancoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDepositoBancoUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDepositoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDepositoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDepositoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDepositoBancoUpdate.setText("U");
		this.jButtonid_asiento_contableDepositoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDepositoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDepositoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDepositoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDepositoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDepositoBancoUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleDepositoBanco = new DepositoBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Deposito Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDepositoBanco= new GridBagLayout();
		

		
		String sToolTipDepositoBanco="";
		sToolTipDepositoBanco=DepositoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDepositoBanco+="(PuntoVenta.DepositoBanco)";
		}
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDepositoBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDepositoBanco = new JButtonMe();
		this.jButtonModificarDepositoBanco = new JButtonMe();
        this.jButtonActualizarDepositoBanco = new JButtonMe();
        this.jButtonEliminarDepositoBanco = new JButtonMe();
        this.jButtonCancelarDepositoBanco = new JButtonMe();
        this.jButtonGuardarCambiosDepositoBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaDepositoBanco = new JButtonMe();
		this.jButtonCerrarDepositoBanco = new JButtonMe();
		
		this.jScrollPanelDatosDepositoBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionDepositoBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralDepositoBanco = new JScrollPane();
				
		
		
		this.jPanelCamposDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Deposito Banco";
		
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deposito Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosDepositoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDepositoBanco.setName("jPanelCamposDepositoBanco"); 

		this.jPanelCamposOcultosDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDepositoBanco.setName("jPanelCamposOcultosDepositoBanco"); 

        this.jPanelAccionesDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDepositoBanco.setToolTipText("Acciones");
        this.jPanelAccionesDepositoBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDepositoBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDepositoBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDepositoBanco.setText("Nuevo");
		this.jButtonModificarDepositoBanco.setText("Editar");
        this.jButtonActualizarDepositoBanco.setText("Actualizar");
        this.jButtonEliminarDepositoBanco.setText("Eliminar");
        this.jButtonCancelarDepositoBanco.setText("Cancelar");
        this.jButtonGuardarCambiosDepositoBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaDepositoBanco.setText("Guardar");
		this.jButtonCerrarDepositoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDepositoBanco,"nuevo_button","Nuevo",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDepositoBanco,"modificar_button","Editar",this.depositobancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDepositoBanco,"actualizar_button","Actualizar",this.depositobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDepositoBanco,"eliminar_button","Eliminar",this.depositobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDepositoBanco,"cancelar_button","Cancelar",this.depositobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDepositoBanco,"guardarcambios_button","Guardar",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDepositoBanco,"guardarcambiostabla_button","Guardar",this.depositobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDepositoBanco,"cerrar_button","Salir",this.depositobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDepositoBanco.setToolTipText("Nuevo"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDepositoBanco.setToolTipText("Editar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDepositoBanco.setToolTipText("Actualizar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDepositoBanco.setToolTipText("Eliminar)"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDepositoBanco.setToolTipText("Cancelar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDepositoBanco.setToolTipText("Guardar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDepositoBanco.setToolTipText("Guardar"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDepositoBanco.setToolTipText("Salir"+" "+DepositoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoDepositoBanco";
		inputMap = this.jButtonNuevoDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDepositoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDepositoBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDepositoBanco";
		inputMap = this.jButtonActualizarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDepositoBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarDepositoBanco";
		inputMap = this.jButtonEliminarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDepositoBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarDepositoBanco";
		inputMap = this.jButtonCancelarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDepositoBanco"));
		
		//CERRAR		
		sMapKey = "CerrarDepositoBanco";
		inputMap = this.jButtonCerrarDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDepositoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDepositoBanco";
		inputMap = this.jButtonGuardarCambiosTablaDepositoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDepositoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDepositoBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDepositoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDepositoBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDepositoBanco.setToolTipText("Nuevo DepositoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDepositoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDepositoBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDepositoBanco.setToolTipText("Sin Cerrar Ventana DepositoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDepositoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDepositoBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDepositoBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDepositoBanco.setText("Accion");
		this.jComboBoxTiposAccionesDepositoBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDepositoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDepositoBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDepositoBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDepositoBanco = new JLabelMe();
		
		this.jLabelAccionesDepositoBanco.setText("Acciones");		
		this.jLabelAccionesDepositoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepositoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDepositoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDepositoBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDepositoBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDepositoBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesDepositoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDepositoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDepositoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepositoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDepositoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDepositoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDepositoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDepositoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDepositoBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDepositoBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDepositoBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDepositoBanco = new GridBagLayout();
		
		this.jPanelCamposDepositoBanco.setLayout(gridaBagLayoutCamposDepositoBanco);
		this.jPanelCamposOcultosDepositoBanco.setLayout(gridaBagLayoutCamposOcultosDepositoBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDepositoBanco.add(jLabelIdDepositoBanco, this.gridBagConstraintsDepositoBanco);



	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDepositoBanco.add(jLabelidDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDepositoBanco.add(jLabelid_empresaDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDepositoBanco.add(jButtonid_empresaDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 3;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDepositoBanco.add(jButtonid_empresaDepositoBancoUpdate, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDepositoBanco.add(jComboBoxid_empresaDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDepositoBanco.add(jLabelid_sucursalDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDepositoBanco.add(jButtonid_sucursalDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 3;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDepositoBanco.add(jButtonid_sucursalDepositoBancoUpdate, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDepositoBanco.add(jComboBoxid_sucursalDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioDepositoBanco.add(jLabelid_usuarioDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDepositoBanco.add(jButtonid_usuarioDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 3;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDepositoBanco.add(jButtonid_usuarioDepositoBancoUpdate, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioDepositoBanco.add(jComboBoxid_usuarioDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoDepositoBanco.add(jLabelid_bancoDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoDepositoBanco.add(jButtonid_bancoDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 3;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoDepositoBanco.add(jButtonid_bancoDepositoBancoUpdate, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoDepositoBanco.add(jComboBoxid_bancoDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDepositoBanco.add(jLabelid_asiento_contableDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 2;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDepositoBanco.add(jButtonid_asiento_contableDepositoBanco, this.gridBagConstraintsDepositoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 3;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDepositoBanco.add(jButtonid_asiento_contableDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 4;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDepositoBanco.add(jButtonid_asiento_contableDepositoBancoUpdate, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDepositoBanco.add(jComboBoxid_asiento_contableDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDepositoBanco.add(jLabelfechaDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDepositoBanco.add(jButtonfechaDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDepositoBanco.add(jDateChooserfechaDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_efectivoDepositoBanco.add(jLabelvalor_efectivoDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_efectivoDepositoBanco.add(jButtonvalor_efectivoDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_efectivoDepositoBanco.add(jTextFieldvalor_efectivoDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_chequeDepositoBanco.add(jLabelvalor_chequeDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_chequeDepositoBanco.add(jButtonvalor_chequeDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_chequeDepositoBanco.add(jTextFieldvalor_chequeDepositoBanco, this.gridBagConstraintsDepositoBanco);


	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 0;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDepositoBanco.add(jLabeldescripcionDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		//this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = 2;
		this.gridBagConstraintsDepositoBanco.ipadx = 0;
		this.gridBagConstraintsDepositoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDepositoBanco.add(jButtondescripcionDepositoBancoBusqueda, this.gridBagConstraintsDepositoBanco);
	}

	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDepositoBanco.gridy = 0;
	this.gridBagConstraintsDepositoBanco.gridx = 1;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDepositoBanco.add(jscrollPanedescripcionDepositoBanco, this.gridBagConstraintsDepositoBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPanelidDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPanelid_bancoDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPanelid_asiento_contableDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPanelfechaDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPanelvalor_efectivoDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPanelvalor_chequeDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDepositoBanco.add(this.jPaneldescripcionDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposDepositoBanco % 1==0) {
		iXPanelCamposDepositoBanco=0;
		iYPanelCamposDepositoBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposOcultosDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposOcultosDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDepositoBanco.add(this.jPanelid_empresaDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposOcultosDepositoBanco % 1==0) {
		iXPanelCamposOcultosDepositoBanco=0;
		iYPanelCamposOcultosDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposOcultosDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposOcultosDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDepositoBanco.add(this.jPanelid_sucursalDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposOcultosDepositoBanco % 1==0) {
		iXPanelCamposOcultosDepositoBanco=0;
		iYPanelCamposOcultosDepositoBanco++;
	}
	this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDepositoBanco.gridy = iYPanelCamposOcultosDepositoBanco;
	this.gridBagConstraintsDepositoBanco.gridx = iXPanelCamposOcultosDepositoBanco++;
	this.gridBagConstraintsDepositoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDepositoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDepositoBanco.add(this.jPanelid_usuarioDepositoBanco, this.gridBagConstraintsDepositoBanco);



	if(iXPanelCamposOcultosDepositoBanco % 1==0) {
		iXPanelCamposOcultosDepositoBanco=0;
		iYPanelCamposOcultosDepositoBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesDepositoBanco= new GridBagLayout();
		this.jPanelAccionesDepositoBanco.setLayout(gridaBagLayoutAccionesDepositoBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDepositoBanco= new GridBagLayout();
		this.jPanelAccionesFormularioDepositoBanco.setLayout(gridaBagLayoutAccionesFormularioDepositoBanco);
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDepositoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDepositoBanco.add(this.jComboBoxTiposAccionesFormularioDepositoBanco, this.gridBagConstraintsDepositoBanco);

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDepositoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDepositoBanco.add(this.jCheckBoxPostAccionNuevoDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDepositoBanco.add(this.jCheckBoxPostAccionSinCerrarDepositoBanco, this.gridBagConstraintsDepositoBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.depositobancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.depositobancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDepositoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDepositoBanco.add(this.jCheckBoxPostAccionSinMensajeDepositoBanco, this.gridBagConstraintsDepositoBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesDepositoBanco.add(this.jButtonModificarDepositoBanco, this.gridBagConstraintsDepositoBanco);							

		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDepositoBanco.gridy = 0;
		this.gridBagConstraintsDepositoBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesDepositoBanco.add(this.jButtonEliminarDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = 0;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesDepositoBanco.add(this.jButtonActualizarDepositoBanco, this.gridBagConstraintsDepositoBanco);


		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = 0;		
		this.gridBagConstraintsDepositoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesDepositoBanco.add(this.jButtonGuardarCambiosDepositoBanco, this.gridBagConstraintsDepositoBanco);	
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = 0;		
		this.gridBagConstraintsDepositoBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesDepositoBanco.add(this.jButtonCancelarDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDepositoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDepositoBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.depositobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();						
			this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDepositoBanco.gridx = 0;		
			//this.gridBagConstraintsDepositoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDepositoBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDepositoBanco.gridx =0;
		this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDepositoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDepositoBanco, this.gridBagConstraintsDepositoBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DepositoBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDepositoBanco = new DepositoBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Deposito Banco DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Deposito Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Deposito Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DepositoBancoModel depositobancoModel=new DepositoBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//DepositoBancoModel.DepositoBancoFocusTraversalPolicy depositobancoFocusTraversalPolicy = depositobancoModel.new DepositoBancoFocusTraversalPolicy(this);
			
			//depositobancoFocusTraversalPolicy.setdepositobancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(depositobancoModel);
			
			
			this.jContentPaneDetalleDepositoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDepositoBanco = new GridBagLayout();	
			this.jContentPaneDetalleDepositoBanco.setLayout(gridaBagLayoutDetalleDepositoBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDepositoBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
				this.gridBagConstraintsDepositoBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDepositoBanco.gridx = 0;
					
				
				this.jContentPaneDetalleDepositoBanco.add(jTtoolBarDetalleDepositoBanco, gridBagConstraintsDepositoBanco);								
				
}
			
			this.jScrollPanelDatosEdicionDepositoBanco=   new JScrollPane(jContentPaneDetalleDepositoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDepositoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepositoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepositoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDepositoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDepositoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepositoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDepositoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDepositoBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDepositoBanco.gridx = 0;
	        
			this.jContentPaneDetalleDepositoBanco.add(jPanelCamposDepositoBanco, gridBagConstraintsDepositoBanco);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& depositobancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.depositobancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDepositoBanco= new GridBagConstraints();
						this.gridBagConstraintsDepositoBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDepositoBanco.gridx = 0;
						this.jContentPaneDetalleDepositoBanco.add(this.jTabbedPaneRelacionesDepositoBanco, this.gridBagConstraintsDepositoBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDepositoBanco.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDepositoBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
					this.gridBagConstraintsDepositoBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDepositoBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDepositoBanco.gridx = 0;
					
				
					this.jContentPaneDetalleDepositoBanco.add(jPanelCamposOcultosDepositoBanco, gridBagConstraintsDepositoBanco);
				
					this.jPanelCamposOcultosDepositoBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDepositoBanco.gridx = 0;
	        this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDepositoBanco.add(this.jPanelAccionesFormularioDepositoBanco, this.gridBagConstraintsDepositoBanco);							
			
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
	        this.gridBagConstraintsDepositoBanco.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDepositoBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleDepositoBanco.add(this.jPanelAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDepositoBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDepositoBanco=   new JScrollPane(this.jPanelCamposDepositoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDepositoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepositoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDepositoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDepositoBanco.gridx = 0;
			this.gridBagConstraintsDepositoBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDepositoBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDepositoBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDepositoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDepositoBanco, this.gridBagConstraintsDepositoBanco);			
			
			this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
			this.gridBagConstraintsDepositoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDepositoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDepositoBanco, this.gridBagConstraintsDepositoBanco);
			
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDepositoBanco, this.gridBagConstraintsDepositoBanco);
		
			
		this.gridBagConstraintsDepositoBanco = new GridBagConstraints();
		this.gridBagConstraintsDepositoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDepositoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDepositoBanco, this.gridBagConstraintsDepositoBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDepositoBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionDepositoBanco;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
