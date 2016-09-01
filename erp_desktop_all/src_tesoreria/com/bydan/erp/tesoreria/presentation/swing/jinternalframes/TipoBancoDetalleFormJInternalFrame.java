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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoBancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoBancoDetalleFormJInternalFrame extends TipoBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoBanco;
	
	protected JMenuBar jmenuBarDetalleTipoBanco;
	
	protected JMenu jmenuDetalleTipoBanco;
	protected JMenu jmenuDetalleArchivoTipoBanco;
	protected JMenu jmenuDetalleAccionesTipoBanco;
	protected JMenu jmenuDetalleDatosTipoBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoBanco;	
	protected GridBagConstraints gridBagConstraintsTipoBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoBancoSessionBean tipobancoSessionBean;
	
	

	public BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame=null;
	public BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBanco=false;
	public BancoSessionBean bancoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoBancoLogic tipobancoLogic;
	
	public JScrollPane jScrollPanelDatosTipoBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoBanco;
	
	protected JPanel jPanelCamposTipoBanco;    
	protected JPanel jPanelCamposOcultosTipoBanco;    	
	protected JPanel jPanelAccionesTipoBanco;
	protected JPanel jPanelAccionesFormularioTipoBanco;
    
	
	
	protected Integer iXPanelCamposTipoBanco=0;
	protected Integer iYPanelCamposTipoBanco=0;
	
	protected Integer iXPanelCamposOcultosTipoBanco=0;
	protected Integer iYPanelCamposOcultosTipoBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoBanco;
	public JButton jButtonModificarTipoBanco;
	public JButton jButtonActualizarTipoBanco;
    public JButton jButtonEliminarTipoBanco;
	public JButton jButtonCancelarTipoBanco;
    public JButton jButtonGuardarCambiosTipoBanco;
	public JButton jButtonGuardarCambiosTablaTipoBanco;
	protected JButton jButtonCerrarTipoBanco;
	
	
	protected JButton jButtonProcesarInformacionTipoBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoBanco;
	protected JButton jButtonModificarToolBarTipoBanco;
	protected JButton jButtonActualizarToolBarTipoBanco;
    protected JButton jButtonEliminarToolBarTipoBanco;
	protected JButton jButtonCancelarToolBarTipoBanco;
    protected JButton jButtonGuardarCambiosToolBarTipoBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoBanco;
	protected JButton jButtonCerrarToolBarTipoBanco;
	
	protected JButton jButtonProcesarInformacionToolBarTipoBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoBanco;
	protected JMenuItem jMenuItemModificarTipoBanco;
	protected JMenuItem jMenuItemActualizarTipoBanco;
    protected JMenuItem jMenuItemEliminarTipoBanco;
	protected JMenuItem jMenuItemCancelarTipoBanco;
    protected JMenuItem jMenuItemGuardarCambiosTipoBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoBanco;
	protected JMenuItem jMenuItemCerrarTipoBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoBanco;
	public JLabel jLabelIdTipoBanco;
	public JTextFieldMe jTextFieldidTipoBanco;
	public JButton jButtonidTipoBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoBanco;
	public JLabel jLabelnombreTipoBanco;
	public JTextArea jTextAreanombreTipoBanco;
	public JScrollPane jscrollPanenombreTipoBanco;
	public JButton jButtonnombreTipoBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sriTipoBanco;
	public JLabel jLabelcodigo_sriTipoBanco;
	public JTextField jTextFieldcodigo_sriTipoBanco;
	public JButton jButtoncodigo_sriTipoBancoBusqueda= new JButtonMe();

	public JPanel jPaneles_defectoTipoBanco;
	public JLabel jLabeles_defectoTipoBanco;
	public JCheckBox jCheckBoxes_defectoTipoBanco;
	public JButton jButtones_defectoTipoBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoBanco;
	public JLabel jLabelid_empresaTipoBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoBanco;
	public JButton jButtonid_empresaTipoBanco= new JButtonMe();
	public JButton jButtonid_empresaTipoBancoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoBancoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoBanco;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoBanco=new JPanel();
				this.jPanelAccionesFormularioTipoBanco=new JPanel();
				this.jmenuBarDetalleTipoBanco=new JMenuBar();
				this.jTtoolBarDetalleTipoBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoBanco() {
		return this.jButtonActualizarToolBarTipoBanco;
	}
	
	public JButton getjButtonEliminarToolBarTipoBanco() {
		return this.jButtonEliminarToolBarTipoBanco;
	}
	
	public JButton getjButtonCancelarToolBarTipoBanco() {
		return this.jButtonCancelarToolBarTipoBanco;
	}		
	
	public JButton getjButtonProcesarInformacionTipoBanco() {
		return this.jButtonProcesarInformacionTipoBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoBanco)	{
		this.jButtonProcesarInformacionTipoBanco = jButtonProcesarInformacionTipoBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoBanco() {
		return this.jComboBoxTiposAccionesTipoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoBanco(
			JComboBox jComboBoxTiposRelacionesTipoBanco) {
		this.jComboBoxTiposRelacionesTipoBanco = jComboBoxTiposRelacionesTipoBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoBanco(
			JComboBox jComboBoxTiposAccionesTipoBanco) {
		this.jComboBoxTiposAccionesTipoBanco = jComboBoxTiposAccionesTipoBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoBanco() {
		return this.jComboBoxTiposAccionesFormularioTipoBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoBanco(
			JComboBox jComboBoxTiposAccionesFormularioTipoBanco) {
		this.jComboBoxTiposAccionesFormularioTipoBanco = jComboBoxTiposAccionesFormularioTipoBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipobancoSessionBean=new TipoBancoSessionBean();
		
		this.tipobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipobancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bancoSessionBean=new BancoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Banco MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoBanco=new JButtonMe();
				this.jButtonModificarToolBarTipoBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoBanco,this.jTtoolBarDetalleTipoBanco,
							"actualizar","actualizar","Actualizar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoBanco,this.jTtoolBarDetalleTipoBanco,
							"eliminar","eliminar","Eliminar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoBanco,this.jTtoolBarDetalleTipoBanco,
							"cancelar","cancelar","Cancelar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoBanco,this.jTtoolBarDetalleTipoBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoBanco.add(this.jMenuItemDetalleCerrarTipoBanco);
		
		this.jmenuDetalleAccionesTipoBanco.add(this.jMenuItemActualizarTipoBanco);
		this.jmenuDetalleAccionesTipoBanco.add(this.jMenuItemEliminarTipoBanco);
		this.jmenuDetalleAccionesTipoBanco.add(this.jMenuItemCancelarTipoBanco);		
		
		//this.jmenuDetalleDatosTipoBanco.add(this.jMenuItemDetalleAbrirOrderByTipoBanco);				
		this.jmenuDetalleDatosTipoBanco.add(this.jMenuItemDetalleMostarOcultarTipoBanco);				
				
		//this.jmenuDetalleAccionesTipoBanco.add(this.jMenuItemGuardarCambiosTipoBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoBanco.add(this.jmenuDetalleArchivoTipoBanco);		
		this.jmenuBarDetalleTipoBanco.add(this.jmenuDetalleAccionesTipoBanco);		
		this.jmenuBarDetalleTipoBanco.add(this.jmenuDetalleDatosTipoBanco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoBanco.add(this.jmenuDetalleTipoBanco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoBanco);				
	}
	
	
	public void inicializarElementosCamposTipoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoBanco = new JLabelMe();
		jLabelIdTipoBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoBanco.setToolTipText(TipoBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoBanco= new GridBagLayout();

		this.jPanelidTipoBanco.setLayout(this.gridaBagLayoutTipoBanco);

		jTextFieldidTipoBanco = new JTextFieldMe();
		jTextFieldidTipoBanco.setText("Id");

		jTextFieldidTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoBanco = new JLabelMe();
		this.jLabelnombreTipoBanco.setText(""+TipoBancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoBanco.setToolTipText("Nombre");
		this.jLabelnombreTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoBanco.setToolTipText(TipoBancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoBanco = new GridBagLayout();
		this.jPanelnombreTipoBanco.setLayout(this.gridaBagLayoutTipoBanco);


		jTextAreanombreTipoBanco= new JTextAreaMe();
		jTextAreanombreTipoBanco.setEnabled(false);
		jTextAreanombreTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoBanco.setLineWrap(true);
		jTextAreanombreTipoBanco.setWrapStyleWord(true);
		jTextAreanombreTipoBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoBanco.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoBanco = new JScrollPane(jTextAreanombreTipoBanco);
		jscrollPanenombreTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoBancoBusqueda= new JButtonMe();
		this.jButtonnombreTipoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoBancoBusqueda.setText("U");
		this.jButtonnombreTipoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoBancoBusqueda"));

		if(this.tipobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoBancoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sriTipoBanco = new JLabelMe();
		this.jLabelcodigo_sriTipoBanco.setText(""+TipoBancoConstantesFunciones.LABEL_CODIGOSRI+" : *");
		this.jLabelcodigo_sriTipoBanco.setToolTipText("Codigo Sri");
		this.jLabelcodigo_sriTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_sriTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sriTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sriTipoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sriTipoBanco.setToolTipText(TipoBancoConstantesFunciones.LABEL_CODIGOSRI);
		this.gridaBagLayoutTipoBanco = new GridBagLayout();
		this.jPanelcodigo_sriTipoBanco.setLayout(this.gridaBagLayoutTipoBanco);


		jTextFieldcodigo_sriTipoBanco= new JTextFieldMe();

		jTextFieldcodigo_sriTipoBanco.setEnabled(false);
		jTextFieldcodigo_sriTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sriTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sriTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sriTipoBancoBusqueda= new JButtonMe();
		this.jButtoncodigo_sriTipoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriTipoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sriTipoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sriTipoBancoBusqueda.setText("U");
		this.jButtoncodigo_sriTipoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sriTipoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sriTipoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sriTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sriTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sriTipoBancoBusqueda"));

		if(this.tipobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sriTipoBancoBusqueda.setVisible(false);		}


					
		this.jLabeles_defectoTipoBanco = new JLabelMe();
		this.jLabeles_defectoTipoBanco.setText(""+TipoBancoConstantesFunciones.LABEL_ESDEFECTO+" : *");
		this.jLabeles_defectoTipoBanco.setToolTipText("Es Defecto");
		this.jLabeles_defectoTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_defectoTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_defectoTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_defectoTipoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_defectoTipoBanco.setToolTipText(TipoBancoConstantesFunciones.LABEL_ESDEFECTO);
		this.gridaBagLayoutTipoBanco = new GridBagLayout();
		this.jPaneles_defectoTipoBanco.setLayout(this.gridaBagLayoutTipoBanco);


		jCheckBoxes_defectoTipoBanco= new JCheckBoxMe();
		jCheckBoxes_defectoTipoBanco.setEnabled(false);

		jCheckBoxes_defectoTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_defectoTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_defectoTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_defectoTipoBancoBusqueda= new JButtonMe();
		this.jButtones_defectoTipoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_defectoTipoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_defectoTipoBancoBusqueda.setText("U");
		this.jButtones_defectoTipoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_defectoTipoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_defectoTipoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_defectoTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_defectoTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_defectoTipoBancoBusqueda"));

		if(this.tipobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_defectoTipoBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoBanco = new JLabelMe();
		this.jLabelid_empresaTipoBanco.setText(""+TipoBancoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoBanco.setToolTipText("Empresa");
		this.jLabelid_empresaTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoBanco.setToolTipText(TipoBancoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoBanco = new GridBagLayout();
		this.jPanelid_empresaTipoBanco.setLayout(this.gridaBagLayoutTipoBanco);


		jComboBoxid_empresaTipoBanco= new JComboBoxMe();
		jComboBoxid_empresaTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoBanco.setEnabled(false);

		this.jButtonid_empresaTipoBanco= new JButtonMe();
		this.jButtonid_empresaTipoBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoBanco.setText("Buscar");
		this.jButtonid_empresaTipoBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBanco"));

		this.jButtonid_empresaTipoBancoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBancoBusqueda.setText("U");
		this.jButtonid_empresaTipoBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoBusqueda"));

		if(this.tipobancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoBancoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoBancoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoBancoUpdate.setText("U");
		this.jButtonid_empresaTipoBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoBancoUpdate"));



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
		//this.jInternalFrameDetalleTipoBanco = new TipoBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoBanco= new GridBagLayout();
		

		
		String sToolTipTipoBanco="";
		sToolTipTipoBanco=TipoBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoBanco+="(Tesoreria.TipoBanco)";
		}
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoBanco = new JButtonMe();
		this.jButtonModificarTipoBanco = new JButtonMe();
        this.jButtonActualizarTipoBanco = new JButtonMe();
        this.jButtonEliminarTipoBanco = new JButtonMe();
        this.jButtonCancelarTipoBanco = new JButtonMe();
        this.jButtonGuardarCambiosTipoBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoBanco = new JButtonMe();
		this.jButtonCerrarTipoBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoBanco = new JScrollPane();
				
		
		
		this.jPanelCamposTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Banco";
		
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoBanco.setName("jPanelCamposTipoBanco"); 

		this.jPanelCamposOcultosTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoBanco.setName("jPanelCamposOcultosTipoBanco"); 

        this.jPanelAccionesTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoBanco.setText("Nuevo");
		this.jButtonModificarTipoBanco.setText("Editar");
        this.jButtonActualizarTipoBanco.setText("Actualizar");
        this.jButtonEliminarTipoBanco.setText("Eliminar");
        this.jButtonCancelarTipoBanco.setText("Cancelar");
        this.jButtonGuardarCambiosTipoBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoBanco.setText("Guardar");
		this.jButtonCerrarTipoBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoBanco,"nuevo_button","Nuevo",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoBanco,"modificar_button","Editar",this.tipobancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoBanco,"actualizar_button","Actualizar",this.tipobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoBanco,"eliminar_button","Eliminar",this.tipobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoBanco,"cancelar_button","Cancelar",this.tipobancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoBanco,"guardarcambios_button","Guardar",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoBanco,"guardarcambiostabla_button","Guardar",this.tipobancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoBanco,"cerrar_button","Salir",this.tipobancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoBanco.setToolTipText("Nuevo"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoBanco.setToolTipText("Editar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoBanco.setToolTipText("Actualizar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoBanco.setToolTipText("Eliminar)"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoBanco.setToolTipText("Cancelar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoBanco.setToolTipText("Guardar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoBanco.setToolTipText("Guardar"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoBanco.setToolTipText("Salir"+" "+TipoBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoBanco";
		inputMap = this.jButtonNuevoTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoBanco";
		inputMap = this.jButtonActualizarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoBanco";
		inputMap = this.jButtonEliminarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoBanco";
		inputMap = this.jButtonCancelarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoBanco"));
		
		//CERRAR		
		sMapKey = "CerrarTipoBanco";
		inputMap = this.jButtonCerrarTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoBanco.setToolTipText("Nuevo TipoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoBanco.setToolTipText("Sin Cerrar Ventana TipoBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoBanco = new JLabelMe();
		
		this.jLabelAccionesTipoBanco.setText("Acciones");		
		this.jLabelAccionesTipoBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoBanco = new GridBagLayout();
		
		this.jPanelCamposTipoBanco.setLayout(gridaBagLayoutCamposTipoBanco);
		this.jPanelCamposOcultosTipoBanco.setLayout(gridaBagLayoutCamposOcultosTipoBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 0;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoBanco.add(jLabelIdTipoBanco, this.gridBagConstraintsTipoBanco);



	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 1;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoBanco.add(jTextFieldidTipoBanco, this.gridBagConstraintsTipoBanco);


	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 0;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoBanco.add(jLabelid_empresaTipoBanco, this.gridBagConstraintsTipoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = 2;
		this.gridBagConstraintsTipoBanco.ipadx = 0;
		this.gridBagConstraintsTipoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBanco.add(jButtonid_empresaTipoBancoBusqueda, this.gridBagConstraintsTipoBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = 3;
		this.gridBagConstraintsTipoBanco.ipadx = 0;
		this.gridBagConstraintsTipoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoBanco.add(jButtonid_empresaTipoBancoUpdate, this.gridBagConstraintsTipoBanco);
	}

	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 1;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoBanco.add(jComboBoxid_empresaTipoBanco, this.gridBagConstraintsTipoBanco);


	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 0;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoBanco.add(jLabelnombreTipoBanco, this.gridBagConstraintsTipoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = 2;
		this.gridBagConstraintsTipoBanco.ipadx = 0;
		this.gridBagConstraintsTipoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoBanco.add(jButtonnombreTipoBancoBusqueda, this.gridBagConstraintsTipoBanco);
	}

	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 1;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoBanco.add(jscrollPanenombreTipoBanco, this.gridBagConstraintsTipoBanco);


	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 0;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sriTipoBanco.add(jLabelcodigo_sriTipoBanco, this.gridBagConstraintsTipoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = 2;
		this.gridBagConstraintsTipoBanco.ipadx = 0;
		this.gridBagConstraintsTipoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sriTipoBanco.add(jButtoncodigo_sriTipoBancoBusqueda, this.gridBagConstraintsTipoBanco);
	}

	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 1;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sriTipoBanco.add(jTextFieldcodigo_sriTipoBanco, this.gridBagConstraintsTipoBanco);


	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 0;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_defectoTipoBanco.add(jLabeles_defectoTipoBanco, this.gridBagConstraintsTipoBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = 2;
		this.gridBagConstraintsTipoBanco.ipadx = 0;
		this.gridBagConstraintsTipoBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_defectoTipoBanco.add(jButtones_defectoTipoBancoBusqueda, this.gridBagConstraintsTipoBanco);
	}

	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoBanco.gridy = 0;
	this.gridBagConstraintsTipoBanco.gridx = 1;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_defectoTipoBanco.add(jCheckBoxes_defectoTipoBanco, this.gridBagConstraintsTipoBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBanco.gridy = iYPanelCamposTipoBanco;
	this.gridBagConstraintsTipoBanco.gridx = iXPanelCamposTipoBanco++;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBanco.add(this.jPanelidTipoBanco, this.gridBagConstraintsTipoBanco);



	if(iXPanelCamposTipoBanco % 1==0) {
		iXPanelCamposTipoBanco=0;
		iYPanelCamposTipoBanco++;
	}
	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBanco.gridy = iYPanelCamposTipoBanco;
	this.gridBagConstraintsTipoBanco.gridx = iXPanelCamposTipoBanco++;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBanco.add(this.jPanelnombreTipoBanco, this.gridBagConstraintsTipoBanco);



	if(iXPanelCamposTipoBanco % 1==0) {
		iXPanelCamposTipoBanco=0;
		iYPanelCamposTipoBanco++;
	}
	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBanco.gridy = iYPanelCamposTipoBanco;
	this.gridBagConstraintsTipoBanco.gridx = iXPanelCamposTipoBanco++;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBanco.add(this.jPanelcodigo_sriTipoBanco, this.gridBagConstraintsTipoBanco);



	if(iXPanelCamposTipoBanco % 1==0) {
		iXPanelCamposTipoBanco=0;
		iYPanelCamposTipoBanco++;
	}
	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBanco.gridy = iYPanelCamposTipoBanco;
	this.gridBagConstraintsTipoBanco.gridx = iXPanelCamposTipoBanco++;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoBanco.add(this.jPaneles_defectoTipoBanco, this.gridBagConstraintsTipoBanco);



	if(iXPanelCamposTipoBanco % 1==0) {
		iXPanelCamposTipoBanco=0;
		iYPanelCamposTipoBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoBanco.gridy = iYPanelCamposOcultosTipoBanco;
	this.gridBagConstraintsTipoBanco.gridx = iXPanelCamposOcultosTipoBanco++;
	this.gridBagConstraintsTipoBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoBanco.add(this.jPanelid_empresaTipoBanco, this.gridBagConstraintsTipoBanco);



	if(iXPanelCamposOcultosTipoBanco % 1==0) {
		iXPanelCamposOcultosTipoBanco=0;
		iYPanelCamposOcultosTipoBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoBanco= new GridBagLayout();
		this.jPanelAccionesTipoBanco.setLayout(gridaBagLayoutAccionesTipoBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoBanco= new GridBagLayout();
		this.jPanelAccionesFormularioTipoBanco.setLayout(gridaBagLayoutAccionesFormularioTipoBanco);
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBanco.add(this.jComboBoxTiposAccionesFormularioTipoBanco, this.gridBagConstraintsTipoBanco);

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoBanco.add(this.jCheckBoxPostAccionNuevoTipoBanco, this.gridBagConstraintsTipoBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBanco.add(this.jCheckBoxPostAccionSinCerrarTipoBanco, this.gridBagConstraintsTipoBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipobancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipobancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoBanco.add(this.jCheckBoxPostAccionSinMensajeTipoBanco, this.gridBagConstraintsTipoBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoBanco.add(this.jButtonModificarTipoBanco, this.gridBagConstraintsTipoBanco);							

		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoBanco.gridy = 0;
		this.gridBagConstraintsTipoBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoBanco.add(this.jButtonEliminarTipoBanco, this.gridBagConstraintsTipoBanco);
		
			
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = 0;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBanco.add(this.jButtonActualizarTipoBanco, this.gridBagConstraintsTipoBanco);


		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = 0;		
		this.gridBagConstraintsTipoBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoBanco.add(this.jButtonGuardarCambiosTipoBanco, this.gridBagConstraintsTipoBanco);	
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = 0;		
		this.gridBagConstraintsTipoBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoBanco.add(this.jButtonCancelarTipoBanco, this.gridBagConstraintsTipoBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipobancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoBanco.gridx = 0;		
			//this.gridBagConstraintsTipoBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoBanco.gridx =0;
		this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoBanco, this.gridBagConstraintsTipoBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoBanco = new TipoBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoBancoModel tipobancoModel=new TipoBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoBancoModel.TipoBancoFocusTraversalPolicy tipobancoFocusTraversalPolicy = tipobancoModel.new TipoBancoFocusTraversalPolicy(this);
			
			//tipobancoFocusTraversalPolicy.settipobancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipobancoModel);
			
			
			this.jContentPaneDetalleTipoBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoBanco = new GridBagLayout();	
			this.jContentPaneDetalleTipoBanco.setLayout(gridaBagLayoutDetalleTipoBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoBanco.gridx = 0;
					
				
				this.jContentPaneDetalleTipoBanco.add(jTtoolBarDetalleTipoBanco, gridBagConstraintsTipoBanco);								
				
}
			
			this.jScrollPanelDatosEdicionTipoBanco=   new JScrollPane(jContentPaneDetalleTipoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoBanco.gridx = 0;
	        
			this.jContentPaneDetalleTipoBanco.add(jPanelCamposTipoBanco, gridBagConstraintsTipoBanco);
			
			
			
			
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
						&& tipobancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBanco(this.puedeCargarPorParteBanco,false,-1);
					
					if(this.tipobancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoBanco= new GridBagConstraints();
						this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoBanco.gridx = 0;
						this.jContentPaneDetalleTipoBanco.add(this.jTabbedPaneRelacionesTipoBanco, this.gridBagConstraintsTipoBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoBanco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBanco(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoBanco = new GridBagConstraints();
					this.gridBagConstraintsTipoBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoBanco.gridx = 0;
					
				
					this.jContentPaneDetalleTipoBanco.add(jPanelCamposOcultosTipoBanco, gridBagConstraintsTipoBanco);
				
					this.jPanelCamposOcultosTipoBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoBanco.gridx = 0;
	        this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoBanco.add(this.jPanelAccionesFormularioTipoBanco, this.gridBagConstraintsTipoBanco);							
			
			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
	        this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoBanco.add(this.jPanelAccionesTipoBanco, this.gridBagConstraintsTipoBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoBanco=   new JScrollPane(this.jPanelCamposTipoBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoBanco.gridx = 0;
			this.gridBagConstraintsTipoBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoBanco, this.gridBagConstraintsTipoBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoBanco, this.gridBagConstraintsTipoBanco);			
			
			this.gridBagConstraintsTipoBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoBanco, this.gridBagConstraintsTipoBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoBanco, this.gridBagConstraintsTipoBanco);
			
			
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoBanco, this.gridBagConstraintsTipoBanco);
		
			
		this.gridBagConstraintsTipoBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoBanco, this.gridBagConstraintsTipoBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoBanco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBanco(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bancoSessionBean=new BancoSessionBean();
		this.bancoSessionBean.setConGuardarRelaciones(false);
		this.bancoSessionBean.setEsGuardarRelacionado(true);

		this.bancoBeanSwingJInternalFrame=null;//new BancoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bancoBeanSwingJInternalFramePopup=new BancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bancoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bancoSessionBean.getEsGuardarRelacionado()) {

				BancoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				BancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bancoSessionBean.setEsGuardarRelacionado(true);

				this.bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bancoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bancoBeanSwingJInternalFrame.setbancoSessionBean(this.bancoSessionBean);

				//this.gridBagConstraintsTipoBanco = new GridBagConstraints();
				//this.gridBagConstraintsTipoBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoBanco.gridx = 0;
				//this.jContentPaneDetalleTipoBanco.add(this.bancoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoBanco.add("Bancos",this.bancoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoBanco.setComponentAt(iIndexTab,this.bancoBeanSwingJInternalFrame.getContentPane());
				}

				//BancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bancoSessionBean.setEsGuardarRelacionado(false);
				this.bancoBeanSwingJInternalFrame=null;//new BancoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bancoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBanco) {
					this.jTabbedPaneRelacionesTipoBanco.add("Bancos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBancoBeanSwingJInternalFrame(List<TipoBanco> tipobancos,TipoBanco tipobanco,BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bancoBeanSwingJInternalFrame=new BancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bancoBeanSwingJInternalFrame.getBancoLogic().setConnexion(this.tipobancoLogic.getConnexion());

					bancoBeanSwingJInternalFrame.settipobancosForeignKey(tipobancos);
					bancoBeanSwingJInternalFrame.settipobancoForeignKey(tipobanco);
					bancoBeanSwingJInternalFrame.bancoSessionBean.setisBusquedaDesdeForeignKeySesionTipoBanco(true);
					bancoBeanSwingJInternalFrame.bancoSessionBean.setlidTipoBancoActual(tipobanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bancoBeanSwingJInternalFrame.cargarCombosForeignKeyBanco(bancoBeanSwingJInternalFrame.isCargarCombosDependencia);
					bancoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoBanco(true);
					bancoBeanSwingJInternalFrame.setid_tipo_bancoFK_IdTipoBanco(tipobanco.getId());

					if(!this.conCargarFormDetalle) {
						bancoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bancoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoBancoForeignKey(tipobanco,1,false,true,true);
					bancoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bancoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoBanco");
					bancoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoBanco");
					bancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBanco(true);
					bancoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBanco("n",bancoBeanSwingJInternalFrame.isGuardarCambiosEnLote, bancoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bancoBeanSwingJInternalFrame.setAutoscrolls(true);
					bancoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bancoBeanSwingJInternalFrame.actualizarEstadoPanelsBanco("relacionado");
					} else {
						bancoBeanSwingJInternalFrame.actualizarEstadoPanelsBanco("no_relacionado");
					}

					bancoBeanSwingJInternalFrame.getjButtonRecargarInformacionBanco().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
