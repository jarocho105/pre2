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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TransaccionIngresoEgresoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TransaccionIngresoEgresoDetalleFormJInternalFrame extends TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccionIngresoEgreso;
	
	protected JMenuBar jmenuBarDetalleTransaccionIngresoEgreso;
	
	protected JMenu jmenuDetalleTransaccionIngresoEgreso;
	protected JMenu jmenuDetalleArchivoTransaccionIngresoEgreso;
	protected JMenu jmenuDetalleAccionesTransaccionIngresoEgreso;
	protected JMenu jmenuDetalleDatosTransaccionIngresoEgreso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionIngresoEgreso;	
	protected GridBagConstraints gridBagConstraintsTransaccionIngresoEgreso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccionIngresoEgreso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";
	
	public TransaccionIngresoEgresoSessionBean transaccioningresoegresoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;	
	
	public TransaccionIngresoEgresoLogic transaccioningresoegresoLogic;
	
	public JScrollPane jScrollPanelDatosTransaccionIngresoEgreso;
	public JScrollPane jScrollPanelDatosEdicionTransaccionIngresoEgreso;
	public JScrollPane jScrollPanelDatosGeneralTransaccionIngresoEgreso;
	
	protected JPanel jPanelCamposTransaccionIngresoEgreso;    
	protected JPanel jPanelCamposOcultosTransaccionIngresoEgreso;    	
	protected JPanel jPanelAccionesTransaccionIngresoEgreso;
	protected JPanel jPanelAccionesFormularioTransaccionIngresoEgreso;
    
	
	
	protected Integer iXPanelCamposTransaccionIngresoEgreso=0;
	protected Integer iYPanelCamposTransaccionIngresoEgreso=0;
	
	protected Integer iXPanelCamposOcultosTransaccionIngresoEgreso=0;
	protected Integer iYPanelCamposOcultosTransaccionIngresoEgreso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccionIngresoEgreso;
	public JButton jButtonModificarTransaccionIngresoEgreso;
	public JButton jButtonActualizarTransaccionIngresoEgreso;
    public JButton jButtonEliminarTransaccionIngresoEgreso;
	public JButton jButtonCancelarTransaccionIngresoEgreso;
    public JButton jButtonGuardarCambiosTransaccionIngresoEgreso;
	public JButton jButtonGuardarCambiosTablaTransaccionIngresoEgreso;
	protected JButton jButtonCerrarTransaccionIngresoEgreso;
	
	
	protected JButton jButtonProcesarInformacionTransaccionIngresoEgreso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccionIngresoEgreso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionIngresoEgreso;
	protected JButton jButtonModificarToolBarTransaccionIngresoEgreso;
	protected JButton jButtonActualizarToolBarTransaccionIngresoEgreso;
    protected JButton jButtonEliminarToolBarTransaccionIngresoEgreso;
	protected JButton jButtonCancelarToolBarTransaccionIngresoEgreso;
    protected JButton jButtonGuardarCambiosToolBarTransaccionIngresoEgreso;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccionIngresoEgreso;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionIngresoEgreso;
	protected JButton jButtonCerrarToolBarTransaccionIngresoEgreso;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccionIngresoEgreso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemModificarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemActualizarTransaccionIngresoEgreso;
    protected JMenuItem jMenuItemEliminarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemCancelarTransaccionIngresoEgreso;
    protected JMenuItem jMenuItemGuardarCambiosTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemCerrarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionIngresoEgreso;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionIngresoEgreso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionIngresoEgreso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionIngresoEgreso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccionIngresoEgreso;
	public JLabel jLabelIdTransaccionIngresoEgreso;
	public JLabel jLabelidTransaccionIngresoEgreso;
	public JButton jButtonidTransaccionIngresoEgresoBusqueda= new JButtonMe();

	public JPanel jPaneles_ingresoTransaccionIngresoEgreso;
	public JLabel jLabeles_ingresoTransaccionIngresoEgreso;
	public JCheckBox jCheckBoxes_ingresoTransaccionIngresoEgreso;
	public JButton jButtones_ingresoTransaccionIngresoEgresoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransaccionIngresoEgreso;
	public JLabel jLabelid_empresaTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransaccionIngresoEgreso;
	public JButton jButtonid_empresaTransaccionIngresoEgreso= new JButtonMe();
	public JButton jButtonid_empresaTransaccionIngresoEgresoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransaccionIngresoEgresoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTransaccionIngresoEgreso;
	public JLabel jLabelid_moduloTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTransaccionIngresoEgreso;
	public JButton jButtonid_moduloTransaccionIngresoEgreso= new JButtonMe();
	public JButton jButtonid_moduloTransaccionIngresoEgresoUpdate= new JButtonMe();
	public JButton jButtonid_moduloTransaccionIngresoEgresoBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionTransaccionIngresoEgreso;
	public JLabel jLabelid_transaccionTransaccionIngresoEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionTransaccionIngresoEgreso;
	public JButton jButtonid_transaccionTransaccionIngresoEgreso= new JButtonMe();
	public JButton jButtonid_transaccionTransaccionIngresoEgresoUpdate= new JButtonMe();
	public JButton jButtonid_transaccionTransaccionIngresoEgresoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccionIngresoEgreso;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionIngresoEgresoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccionIngresoEgreso=new JPanel();
				this.jPanelAccionesFormularioTransaccionIngresoEgreso=new JPanel();
				this.jmenuBarDetalleTransaccionIngresoEgreso=new JMenuBar();
				this.jTtoolBarDetalleTransaccionIngresoEgreso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionIngresoEgresoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionIngresoEgresoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionIngresoEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransaccionIngresoEgreso() {
		return this.jButtonActualizarToolBarTransaccionIngresoEgreso;
	}
	
	public JButton getjButtonEliminarToolBarTransaccionIngresoEgreso() {
		return this.jButtonEliminarToolBarTransaccionIngresoEgreso;
	}
	
	public JButton getjButtonCancelarToolBarTransaccionIngresoEgreso() {
		return this.jButtonCancelarToolBarTransaccionIngresoEgreso;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccionIngresoEgreso() {
		return this.jButtonProcesarInformacionTransaccionIngresoEgreso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionIngresoEgreso)	{
		this.jButtonProcesarInformacionTransaccionIngresoEgreso = jButtonProcesarInformacionTransaccionIngresoEgreso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionIngresoEgreso() {
		return this.jComboBoxTiposAccionesTransaccionIngresoEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposRelacionesTransaccionIngresoEgreso) {
		this.jComboBoxTiposRelacionesTransaccionIngresoEgreso = jComboBoxTiposRelacionesTransaccionIngresoEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposAccionesTransaccionIngresoEgreso) {
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso = jComboBoxTiposAccionesTransaccionIngresoEgreso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccionIngresoEgreso() {
		return this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccionIngresoEgreso(
			JComboBox jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso) {
		this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso = jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccioningresoegresoSessionBean=new TransaccionIngresoEgresoSessionBean();
		
		this.transaccioningresoegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioningresoegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionIngresoEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionIngresoEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionIngresoEgresoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion Ingreso Egreso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
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
	
		TransaccionIngresoEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccionIngresoEgreso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccionIngresoEgreso=new JButtonMe();
				this.jButtonModificarToolBarTransaccionIngresoEgreso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccionIngresoEgreso,this.jTtoolBarDetalleTransaccionIngresoEgreso,
							"actualizar","actualizar","Actualizar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccionIngresoEgreso,this.jTtoolBarDetalleTransaccionIngresoEgreso,
							"eliminar","eliminar","Eliminar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccionIngresoEgreso,this.jTtoolBarDetalleTransaccionIngresoEgreso,
							"cancelar","cancelar","Cancelar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccionIngresoEgreso,this.jTtoolBarDetalleTransaccionIngresoEgreso,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccionIngresoEgreso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccionIngresoEgreso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccionIngresoEgreso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccionIngresoEgreso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccionIngresoEgreso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionIngresoEgreso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionIngresoEgreso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionIngresoEgreso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccionIngresoEgreso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccionIngresoEgreso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccionIngresoEgreso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccionIngresoEgreso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccionIngresoEgreso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccionIngresoEgreso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccionIngresoEgreso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccionIngresoEgreso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccionIngresoEgreso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccionIngresoEgreso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccionIngresoEgreso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccionIngresoEgreso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccionIngresoEgreso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionIngresoEgreso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionIngresoEgreso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionIngresoEgreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionIngresoEgreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionIngresoEgreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccionIngresoEgreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccionIngresoEgreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccionIngresoEgreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionIngresoEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionIngresoEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionIngresoEgreso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccionIngresoEgreso.add(this.jMenuItemDetalleCerrarTransaccionIngresoEgreso);
		
		this.jmenuDetalleAccionesTransaccionIngresoEgreso.add(this.jMenuItemActualizarTransaccionIngresoEgreso);
		this.jmenuDetalleAccionesTransaccionIngresoEgreso.add(this.jMenuItemEliminarTransaccionIngresoEgreso);
		this.jmenuDetalleAccionesTransaccionIngresoEgreso.add(this.jMenuItemCancelarTransaccionIngresoEgreso);		
		
		//this.jmenuDetalleDatosTransaccionIngresoEgreso.add(this.jMenuItemDetalleAbrirOrderByTransaccionIngresoEgreso);				
		this.jmenuDetalleDatosTransaccionIngresoEgreso.add(this.jMenuItemDetalleMostarOcultarTransaccionIngresoEgreso);				
				
		//this.jmenuDetalleAccionesTransaccionIngresoEgreso.add(this.jMenuItemGuardarCambiosTransaccionIngresoEgreso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccionIngresoEgreso.add(this.jmenuDetalleArchivoTransaccionIngresoEgreso);		
		this.jmenuBarDetalleTransaccionIngresoEgreso.add(this.jmenuDetalleAccionesTransaccionIngresoEgreso);		
		this.jmenuBarDetalleTransaccionIngresoEgreso.add(this.jmenuDetalleDatosTransaccionIngresoEgreso);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccionIngresoEgreso);				
	}
	
	
	public void inicializarElementosCamposTransaccionIngresoEgreso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccionIngresoEgreso = new JLabelMe();
		jLabelIdTransaccionIngresoEgreso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccionIngresoEgreso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccionIngresoEgreso.setToolTipText(TransaccionIngresoEgresoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccionIngresoEgreso= new GridBagLayout();

		this.jPanelidTransaccionIngresoEgreso.setLayout(this.gridaBagLayoutTransaccionIngresoEgreso);

		jLabelidTransaccionIngresoEgreso = new JLabel();
		jLabelidTransaccionIngresoEgreso.setText("Id");

		jLabelidTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeles_ingresoTransaccionIngresoEgreso = new JLabelMe();
		this.jLabeles_ingresoTransaccionIngresoEgreso.setText(""+TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO+" : *");
		this.jLabeles_ingresoTransaccionIngresoEgreso.setToolTipText("Es Ingreso");
		this.jLabeles_ingresoTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_ingresoTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_ingresoTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_ingresoTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_ingresoTransaccionIngresoEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_ingresoTransaccionIngresoEgreso.setToolTipText(TransaccionIngresoEgresoConstantesFunciones.LABEL_ESINGRESO);
		this.gridaBagLayoutTransaccionIngresoEgreso = new GridBagLayout();
		this.jPaneles_ingresoTransaccionIngresoEgreso.setLayout(this.gridaBagLayoutTransaccionIngresoEgreso);


		jCheckBoxes_ingresoTransaccionIngresoEgreso= new JCheckBoxMe();
		jCheckBoxes_ingresoTransaccionIngresoEgreso.setEnabled(false);

		jCheckBoxes_ingresoTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_ingresoTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_ingresoTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_ingresoTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda= new JButtonMe();
		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setText("U");
		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_ingresoTransaccionIngresoEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_ingresoTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_ingresoTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_ingresoTransaccionIngresoEgresoBusqueda"));

		if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_ingresoTransaccionIngresoEgresoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccionIngresoEgreso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransaccionIngresoEgreso = new JLabelMe();
		this.jLabelid_empresaTransaccionIngresoEgreso.setText(""+TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransaccionIngresoEgreso.setToolTipText("Empresa");
		this.jLabelid_empresaTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransaccionIngresoEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransaccionIngresoEgreso.setToolTipText(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransaccionIngresoEgreso = new GridBagLayout();
		this.jPanelid_empresaTransaccionIngresoEgreso.setLayout(this.gridaBagLayoutTransaccionIngresoEgreso);


		jComboBoxid_empresaTransaccionIngresoEgreso= new JComboBoxMe();
		jComboBoxid_empresaTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransaccionIngresoEgreso.setEnabled(false);

		this.jButtonid_empresaTransaccionIngresoEgreso= new JButtonMe();
		this.jButtonid_empresaTransaccionIngresoEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionIngresoEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionIngresoEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransaccionIngresoEgreso.setText("Buscar");
		this.jButtonid_empresaTransaccionIngresoEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransaccionIngresoEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionIngresoEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionIngresoEgreso"));

		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda= new JButtonMe();
		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setText("U");
		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionIngresoEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionIngresoEgresoBusqueda"));

		if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransaccionIngresoEgresoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransaccionIngresoEgresoUpdate= new JButtonMe();
		this.jButtonid_empresaTransaccionIngresoEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionIngresoEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransaccionIngresoEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransaccionIngresoEgresoUpdate.setText("U");
		this.jButtonid_empresaTransaccionIngresoEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransaccionIngresoEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransaccionIngresoEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransaccionIngresoEgresoUpdate"));



					
		this.jLabelid_moduloTransaccionIngresoEgreso = new JLabelMe();
		this.jLabelid_moduloTransaccionIngresoEgreso.setText(""+TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTransaccionIngresoEgreso.setToolTipText("Modulo");
		this.jLabelid_moduloTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTransaccionIngresoEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTransaccionIngresoEgreso.setToolTipText(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTransaccionIngresoEgreso = new GridBagLayout();
		this.jPanelid_moduloTransaccionIngresoEgreso.setLayout(this.gridaBagLayoutTransaccionIngresoEgreso);


		jComboBoxid_moduloTransaccionIngresoEgreso= new JComboBoxMe();
		jComboBoxid_moduloTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloTransaccionIngresoEgreso.setEnabled(false);

		this.jButtonid_moduloTransaccionIngresoEgreso= new JButtonMe();
		this.jButtonid_moduloTransaccionIngresoEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccionIngresoEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccionIngresoEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransaccionIngresoEgreso.setText("Buscar");
		this.jButtonid_moduloTransaccionIngresoEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTransaccionIngresoEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionIngresoEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionIngresoEgreso"));

		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda= new JButtonMe();
		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setText("U");
		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionIngresoEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionIngresoEgresoBusqueda"));

		if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTransaccionIngresoEgresoBusqueda.setVisible(false);		}

		this.jButtonid_moduloTransaccionIngresoEgresoUpdate= new JButtonMe();
		this.jButtonid_moduloTransaccionIngresoEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionIngresoEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransaccionIngresoEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransaccionIngresoEgresoUpdate.setText("U");
		this.jButtonid_moduloTransaccionIngresoEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTransaccionIngresoEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransaccionIngresoEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransaccionIngresoEgresoUpdate"));



					
		this.jLabelid_transaccionTransaccionIngresoEgreso = new JLabelMe();
		this.jLabelid_transaccionTransaccionIngresoEgreso.setText(""+TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionTransaccionIngresoEgreso.setToolTipText("Transaccion");
		this.jLabelid_transaccionTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionTransaccionIngresoEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionTransaccionIngresoEgreso.setToolTipText(TransaccionIngresoEgresoConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutTransaccionIngresoEgreso = new GridBagLayout();
		this.jPanelid_transaccionTransaccionIngresoEgreso.setLayout(this.gridaBagLayoutTransaccionIngresoEgreso);


		jComboBoxid_transaccionTransaccionIngresoEgreso= new JComboBoxMe();
		jComboBoxid_transaccionTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionTransaccionIngresoEgreso= new JButtonMe();
		this.jButtonid_transaccionTransaccionIngresoEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTransaccionIngresoEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTransaccionIngresoEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionTransaccionIngresoEgreso.setText("Buscar");
		this.jButtonid_transaccionTransaccionIngresoEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionTransaccionIngresoEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTransaccionIngresoEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTransaccionIngresoEgreso"));

		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda= new JButtonMe();
		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setText("U");
		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTransaccionIngresoEgresoBusqueda"));

		if(this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionTransaccionIngresoEgresoBusqueda.setVisible(false);		}

		this.jButtonid_transaccionTransaccionIngresoEgresoUpdate= new JButtonMe();
		this.jButtonid_transaccionTransaccionIngresoEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransaccionIngresoEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionTransaccionIngresoEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionTransaccionIngresoEgresoUpdate.setText("U");
		this.jButtonid_transaccionTransaccionIngresoEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionTransaccionIngresoEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionTransaccionIngresoEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionTransaccionIngresoEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionTransaccionIngresoEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionTransaccionIngresoEgresoUpdate"));



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
		//this.jInternalFrameDetalleTransaccionIngresoEgreso = new TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transaccion Ingreso Egreso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionIngresoEgreso= new GridBagLayout();
		

		
		String sToolTipTransaccionIngresoEgreso="";
		sToolTipTransaccionIngresoEgreso=TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionIngresoEgreso+="(Inventario.TransaccionIngresoEgreso)";
		}
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionIngresoEgreso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonModificarTransaccionIngresoEgreso = new JButtonMe();
        this.jButtonActualizarTransaccionIngresoEgreso = new JButtonMe();
        this.jButtonEliminarTransaccionIngresoEgreso = new JButtonMe();
        this.jButtonCancelarTransaccionIngresoEgreso = new JButtonMe();
        this.jButtonGuardarCambiosTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso = new JButtonMe();
		this.jButtonCerrarTransaccionIngresoEgreso = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionIngresoEgreso = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccionIngresoEgreso = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccionIngresoEgreso = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion Ingreso Egreso";
		
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Ingreso Egresoes" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionIngresoEgreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccionIngresoEgreso.setName("jPanelCamposTransaccionIngresoEgreso"); 

		this.jPanelCamposOcultosTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccionIngresoEgreso.setName("jPanelCamposOcultosTransaccionIngresoEgreso"); 

        this.jPanelAccionesTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionIngresoEgreso.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionIngresoEgreso.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccionIngresoEgreso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccionIngresoEgreso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccionIngresoEgreso.setText("Nuevo");
		this.jButtonModificarTransaccionIngresoEgreso.setText("Editar");
        this.jButtonActualizarTransaccionIngresoEgreso.setText("Actualizar");
        this.jButtonEliminarTransaccionIngresoEgreso.setText("Eliminar");
        this.jButtonCancelarTransaccionIngresoEgreso.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccionIngresoEgreso.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.setText("Guardar");
		this.jButtonCerrarTransaccionIngresoEgreso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionIngresoEgreso,"nuevo_button","Nuevo",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccionIngresoEgreso,"modificar_button","Editar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccionIngresoEgreso,"actualizar_button","Actualizar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccionIngresoEgreso,"eliminar_button","Eliminar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccionIngresoEgreso,"cancelar_button","Cancelar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccionIngresoEgreso,"guardarcambios_button","Guardar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso,"guardarcambiostabla_button","Guardar",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionIngresoEgreso,"cerrar_button","Salir",this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccionIngresoEgreso.setToolTipText("Nuevo"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccionIngresoEgreso.setToolTipText("Editar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccionIngresoEgreso.setToolTipText("Actualizar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccionIngresoEgreso.setToolTipText("Eliminar)"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccionIngresoEgreso.setToolTipText("Cancelar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccionIngresoEgreso.setToolTipText("Guardar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.setToolTipText("Guardar"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionIngresoEgreso.setToolTipText("Salir"+" "+TransaccionIngresoEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionIngresoEgreso";
		inputMap = this.jButtonNuevoTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionIngresoEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionIngresoEgreso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccionIngresoEgreso";
		inputMap = this.jButtonActualizarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccionIngresoEgreso"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccionIngresoEgreso";
		inputMap = this.jButtonEliminarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccionIngresoEgreso"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccionIngresoEgreso";
		inputMap = this.jButtonCancelarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccionIngresoEgreso"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccionIngresoEgreso";
		inputMap = this.jButtonCerrarTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionIngresoEgreso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionIngresoEgreso";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionIngresoEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionIngresoEgreso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso.setToolTipText("Nuevo TransaccionIngresoEgreso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso.setToolTipText("Sin Cerrar Ventana TransaccionIngresoEgreso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccionIngresoEgreso = new JLabelMe();
		
		this.jLabelAccionesTransaccionIngresoEgreso.setText("Acciones");		
		this.jLabelAccionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccionIngresoEgreso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccionIngresoEgreso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccionIngresoEgreso=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccionIngresoEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccionIngresoEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccionIngresoEgreso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccionIngresoEgreso = new GridBagLayout();
		
		this.jPanelCamposTransaccionIngresoEgreso.setLayout(gridaBagLayoutCamposTransaccionIngresoEgreso);
		this.jPanelCamposOcultosTransaccionIngresoEgreso.setLayout(gridaBagLayoutCamposOcultosTransaccionIngresoEgreso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccionIngresoEgreso.add(jLabelIdTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 1;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccionIngresoEgreso.add(jLabelidTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);


	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransaccionIngresoEgreso.add(jLabelid_empresaTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 2;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionIngresoEgreso.add(jButtonid_empresaTransaccionIngresoEgresoBusqueda, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 3;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransaccionIngresoEgreso.add(jButtonid_empresaTransaccionIngresoEgresoUpdate, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 1;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransaccionIngresoEgreso.add(jComboBoxid_empresaTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);


	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTransaccionIngresoEgreso.add(jLabelid_moduloTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 2;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransaccionIngresoEgreso.add(jButtonid_moduloTransaccionIngresoEgresoBusqueda, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 3;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransaccionIngresoEgreso.add(jButtonid_moduloTransaccionIngresoEgresoUpdate, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 1;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTransaccionIngresoEgreso.add(jComboBoxid_moduloTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);


	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionTransaccionIngresoEgreso.add(jLabelid_transaccionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 2;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionTransaccionIngresoEgreso.add(jButtonid_transaccionTransaccionIngresoEgresoBusqueda, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 3;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionTransaccionIngresoEgreso.add(jButtonid_transaccionTransaccionIngresoEgresoUpdate, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 1;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionTransaccionIngresoEgreso.add(jComboBoxid_transaccionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);


	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_ingresoTransaccionIngresoEgreso.add(jLabeles_ingresoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 2;
		this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_ingresoTransaccionIngresoEgreso.add(jButtones_ingresoTransaccionIngresoEgresoBusqueda, this.gridBagConstraintsTransaccionIngresoEgreso);
	}

	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 1;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_ingresoTransaccionIngresoEgreso.add(jCheckBoxes_ingresoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iYPanelCamposTransaccionIngresoEgreso;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iXPanelCamposTransaccionIngresoEgreso++;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionIngresoEgreso.add(this.jPanelidTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(iXPanelCamposTransaccionIngresoEgreso % 1==0) {
		iXPanelCamposTransaccionIngresoEgreso=0;
		iYPanelCamposTransaccionIngresoEgreso++;
	}
	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iYPanelCamposTransaccionIngresoEgreso;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iXPanelCamposTransaccionIngresoEgreso++;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionIngresoEgreso.add(this.jPanelid_transaccionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(iXPanelCamposTransaccionIngresoEgreso % 1==0) {
		iXPanelCamposTransaccionIngresoEgreso=0;
		iYPanelCamposTransaccionIngresoEgreso++;
	}
	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iYPanelCamposTransaccionIngresoEgreso;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iXPanelCamposTransaccionIngresoEgreso++;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionIngresoEgreso.add(this.jPaneles_ingresoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(iXPanelCamposTransaccionIngresoEgreso % 1==0) {
		iXPanelCamposTransaccionIngresoEgreso=0;
		iYPanelCamposTransaccionIngresoEgreso++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iYPanelCamposOcultosTransaccionIngresoEgreso;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iXPanelCamposOcultosTransaccionIngresoEgreso++;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionIngresoEgreso.add(this.jPanelid_empresaTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(iXPanelCamposOcultosTransaccionIngresoEgreso % 1==0) {
		iXPanelCamposOcultosTransaccionIngresoEgreso=0;
		iYPanelCamposOcultosTransaccionIngresoEgreso++;
	}
	this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iYPanelCamposOcultosTransaccionIngresoEgreso;
	this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iXPanelCamposOcultosTransaccionIngresoEgreso++;
	this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionIngresoEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionIngresoEgreso.add(this.jPanelid_moduloTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);



	if(iXPanelCamposOcultosTransaccionIngresoEgreso % 1==0) {
		iXPanelCamposOcultosTransaccionIngresoEgreso=0;
		iYPanelCamposOcultosTransaccionIngresoEgreso++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransaccionIngresoEgreso= new GridBagLayout();
		this.jPanelAccionesTransaccionIngresoEgreso.setLayout(gridaBagLayoutAccionesTransaccionIngresoEgreso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccionIngresoEgreso= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccionIngresoEgreso.setLayout(gridaBagLayoutAccionesFormularioTransaccionIngresoEgreso);
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionIngresoEgreso.add(this.jComboBoxTiposAccionesFormularioTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionIngresoEgreso.add(this.jCheckBoxPostAccionNuevoTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionIngresoEgreso.add(this.jCheckBoxPostAccionSinCerrarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transaccioningresoegresoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionIngresoEgreso.add(this.jCheckBoxPostAccionSinMensajeTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccionIngresoEgreso.add(this.jButtonModificarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);							

		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccionIngresoEgreso.add(this.jButtonEliminarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
			
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionIngresoEgreso.add(this.jButtonActualizarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);


		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionIngresoEgreso.add(this.jButtonGuardarCambiosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);	
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = 0;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccionIngresoEgreso.add(this.jButtonCancelarTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionIngresoEgreso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionIngresoEgreso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioningresoegresoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;		
			//this.gridBagConstraintsTransaccionIngresoEgreso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionIngresoEgreso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =0;
		this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionIngresoEgreso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionIngresoEgresoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccionIngresoEgreso = new TransaccionIngresoEgresoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transaccion Ingreso Egreso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transaccion Ingreso Egreso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Ingreso Egreso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionIngresoEgresoModel transaccioningresoegresoModel=new TransaccionIngresoEgresoModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionIngresoEgresoModel.TransaccionIngresoEgresoFocusTraversalPolicy transaccioningresoegresoFocusTraversalPolicy = transaccioningresoegresoModel.new TransaccionIngresoEgresoFocusTraversalPolicy(this);
			
			//transaccioningresoegresoFocusTraversalPolicy.settransaccioningresoegresoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccioningresoegresoModel);
			
			
			this.jContentPaneDetalleTransaccionIngresoEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccionIngresoEgreso = new GridBagLayout();	
			this.jContentPaneDetalleTransaccionIngresoEgreso.setLayout(gridaBagLayoutDetalleTransaccionIngresoEgreso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionIngresoEgreso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
				this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccionIngresoEgreso.add(jTtoolBarDetalleTransaccionIngresoEgreso, gridBagConstraintsTransaccionIngresoEgreso);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso=   new JScrollPane(jContentPaneDetalleTransaccionIngresoEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	        
			this.jContentPaneDetalleTransaccionIngresoEgreso.add(jPanelCamposTransaccionIngresoEgreso, gridBagConstraintsTransaccionIngresoEgreso);
			
			
			
			
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
						&& transaccioningresoegresoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transaccioningresoegresoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccionIngresoEgreso= new GridBagConstraints();
						this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
						this.jContentPaneDetalleTransaccionIngresoEgreso.add(this.jTabbedPaneRelacionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccionIngresoEgreso.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccionIngresoEgreso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
					this.gridBagConstraintsTransaccionIngresoEgreso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccionIngresoEgreso.add(jPanelCamposOcultosTransaccionIngresoEgreso, gridBagConstraintsTransaccionIngresoEgreso);
				
					this.jPanelCamposOcultosTransaccionIngresoEgreso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	        this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccionIngresoEgreso.add(this.jPanelAccionesFormularioTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);							
			
			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
	        this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccionIngresoEgreso.add(this.jPanelAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccionIngresoEgreso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso=   new JScrollPane(this.jPanelCamposTransaccionIngresoEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionIngresoEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
			this.gridBagConstraintsTransaccionIngresoEgreso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccionIngresoEgreso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccionIngresoEgreso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);			
			
			this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
			this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
			
			
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		
			
		this.gridBagConstraintsTransaccionIngresoEgreso = new GridBagConstraints();
		this.gridBagConstraintsTransaccionIngresoEgreso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionIngresoEgreso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionIngresoEgreso, this.gridBagConstraintsTransaccionIngresoEgreso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccionIngresoEgreso;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccionIngresoEgreso;
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
