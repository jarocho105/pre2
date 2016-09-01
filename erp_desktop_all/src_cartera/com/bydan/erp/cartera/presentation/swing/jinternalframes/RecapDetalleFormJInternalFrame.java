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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.RecapConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class RecapDetalleFormJInternalFrame extends RecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRecap;
	
	protected JMenuBar jmenuBarDetalleRecap;
	
	protected JMenu jmenuDetalleRecap;
	protected JMenu jmenuDetalleArchivoRecap;
	protected JMenu jmenuDetalleAccionesRecap;
	protected JMenu jmenuDetalleDatosRecap;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRecap;	
	protected GridBagConstraints gridBagConstraintsRecap;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RecapBeanSwingJInternalFrameAdditional jInternalFrameDetalleRecap;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public RecapSessionBean recapSessionBean;
	
	

	public DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFrame=null;
	public DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleRecap=false;
	public DetalleRecapSessionBean detallerecapSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public RecapLogic recapLogic;
	
	public JScrollPane jScrollPanelDatosRecap;
	public JScrollPane jScrollPanelDatosEdicionRecap;
	public JScrollPane jScrollPanelDatosGeneralRecap;
	
	protected JPanel jPanelCamposRecap;    
	protected JPanel jPanelCamposOcultosRecap;    	
	protected JPanel jPanelAccionesRecap;
	protected JPanel jPanelAccionesFormularioRecap;
    
	
	
	protected Integer iXPanelCamposRecap=0;
	protected Integer iYPanelCamposRecap=0;
	
	protected Integer iXPanelCamposOcultosRecap=0;
	protected Integer iYPanelCamposOcultosRecap=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRecap;
	public JButton jButtonModificarRecap;
	public JButton jButtonActualizarRecap;
    public JButton jButtonEliminarRecap;
	public JButton jButtonCancelarRecap;
    public JButton jButtonGuardarCambiosRecap;
	public JButton jButtonGuardarCambiosTablaRecap;
	protected JButton jButtonCerrarRecap;
	
	
	protected JButton jButtonProcesarInformacionRecap;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRecap;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRecap;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRecap;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRecap;
	protected JButton jButtonModificarToolBarRecap;
	protected JButton jButtonActualizarToolBarRecap;
    protected JButton jButtonEliminarToolBarRecap;
	protected JButton jButtonCancelarToolBarRecap;
    protected JButton jButtonGuardarCambiosToolBarRecap;
	protected JButton jButtonGuardarCambiosTablaToolBarRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarRecap;
	protected JButton jButtonCerrarToolBarRecap;
	
	protected JButton jButtonProcesarInformacionToolBarRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRecap;
	protected JMenuItem jMenuItemModificarRecap;
	protected JMenuItem jMenuItemActualizarRecap;
    protected JMenuItem jMenuItemEliminarRecap;
	protected JMenuItem jMenuItemCancelarRecap;
    protected JMenuItem jMenuItemGuardarCambiosRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaRecap;
	protected JMenuItem jMenuItemCerrarRecap;
	protected JMenuItem jMenuItemDetalleCerrarRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarRecap;
	
	protected JMenuItem jMenuItemProcesarInformacionRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRecap;
	protected JMenuItem jMenuItemMostrarOcultarRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRecap;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRecap;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRecap;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRecap;
	public JLabel jLabelIdRecap;
	public JLabel jLabelidRecap;
	public JButton jButtonidRecapBusqueda= new JButtonMe();

	public JPanel jPanelnumeroRecap;
	public JLabel jLabelnumeroRecap;
	public JTextField jTextFieldnumeroRecap;
	public JButton jButtonnumeroRecapBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionRecap;
	public JLabel jLabelnumero_autorizacionRecap;
	public JTextField jTextFieldnumero_autorizacionRecap;
	public JButton jButtonnumero_autorizacionRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioRecap;
	public JLabel jLabelfecha_inicioRecap;
	//public JFormattedTextField jDateChooserfecha_inicioRecap;

	public JDateChooser jDateChooserfecha_inicioRecap;
	public JButton jButtonfecha_inicioRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finalRecap;
	public JLabel jLabelfecha_finalRecap;
	//public JFormattedTextField jDateChooserfecha_finalRecap;

	public JDateChooser jDateChooserfecha_finalRecap;
	public JButton jButtonfecha_finalRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_elaboracionRecap;
	public JLabel jLabelfecha_elaboracionRecap;
	//public JFormattedTextField jDateChooserfecha_elaboracionRecap;

	public JDateChooser jDateChooserfecha_elaboracionRecap;
	public JButton jButtonfecha_elaboracionRecapBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidadRecap;
	public JLabel jLabelfecha_caducidadRecap;
	//public JFormattedTextField jDateChooserfecha_caducidadRecap;

	public JDateChooser jDateChooserfecha_caducidadRecap;
	public JButton jButtonfecha_caducidadRecapBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaRecap;
	public JLabel jLabelmonto_ivaRecap;
	public JTextField jTextFieldmonto_ivaRecap;
	public JButton jButtonmonto_ivaRecapBusqueda= new JButtonMe();

	public JPanel jPanelsin_monto_ivaRecap;
	public JLabel jLabelsin_monto_ivaRecap;
	public JTextField jTextFieldsin_monto_ivaRecap;
	public JButton jButtonsin_monto_ivaRecapBusqueda= new JButtonMe();

	public JPanel jPanelivaRecap;
	public JLabel jLabelivaRecap;
	public JTextField jTextFieldivaRecap;
	public JButton jButtonivaRecapBusqueda= new JButtonMe();

	public JPanel jPanelotro_impuestoRecap;
	public JLabel jLabelotro_impuestoRecap;
	public JTextField jTextFieldotro_impuestoRecap;
	public JButton jButtonotro_impuestoRecapBusqueda= new JButtonMe();

	public JPanel jPanelvalor_propuestoRecap;
	public JLabel jLabelvalor_propuestoRecap;
	public JTextField jTextFieldvalor_propuestoRecap;
	public JButton jButtonvalor_propuestoRecapBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalRecap;
	public JLabel jLabelsubtotalRecap;
	public JTextField jTextFieldsubtotalRecap;
	public JButton jButtonsubtotalRecapBusqueda= new JButtonMe();

	public JPanel jPanelfinancieroRecap;
	public JLabel jLabelfinancieroRecap;
	public JTextField jTextFieldfinancieroRecap;
	public JButton jButtonfinancieroRecapBusqueda= new JButtonMe();

	public JPanel jPaneltotalRecap;
	public JLabel jLabeltotalRecap;
	public JTextField jTextFieldtotalRecap;
	public JButton jButtontotalRecapBusqueda= new JButtonMe();

	public JPanel jPanelvalor_cambioRecap;
	public JLabel jLabelvalor_cambioRecap;
	public JTextField jTextFieldvalor_cambioRecap;
	public JButton jButtonvalor_cambioRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRecap;
	public JLabel jLabelid_empresaRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRecap;
	public JButton jButtonid_empresaRecap= new JButtonMe();
	public JButton jButtonid_empresaRecapUpdate= new JButtonMe();
	public JButton jButtonid_empresaRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRecap;
	public JLabel jLabelid_sucursalRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRecap;
	public JButton jButtonid_sucursalRecap= new JButtonMe();
	public JButton jButtonid_sucursalRecapUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRecap;
	public JLabel jLabelid_ejercicioRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRecap;
	public JButton jButtonid_ejercicioRecap= new JButtonMe();
	public JButton jButtonid_ejercicioRecapUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRecapBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRecap;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RecapDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRecap=new JPanel();
				this.jPanelAccionesFormularioRecap=new JPanel();
				this.jmenuBarDetalleRecap=new JMenuBar();
				this.jTtoolBarDetalleRecap=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RecapDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RecapDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Recap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRecap() {
		return this.jButtonActualizarToolBarRecap;
	}
	
	public JButton getjButtonEliminarToolBarRecap() {
		return this.jButtonEliminarToolBarRecap;
	}
	
	public JButton getjButtonCancelarToolBarRecap() {
		return this.jButtonCancelarToolBarRecap;
	}		
	
	public JButton getjButtonProcesarInformacionRecap() {
		return this.jButtonProcesarInformacionRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRecap)	{
		this.jButtonProcesarInformacionRecap = jButtonProcesarInformacionRecap;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRecap() {
		return this.jComboBoxTiposAccionesRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRecap(
			JComboBox jComboBoxTiposRelacionesRecap) {
		this.jComboBoxTiposRelacionesRecap = jComboBoxTiposRelacionesRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRecap(
			JComboBox jComboBoxTiposAccionesRecap) {
		this.jComboBoxTiposAccionesRecap = jComboBoxTiposAccionesRecap;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRecap() {
		return this.jComboBoxTiposAccionesFormularioRecap;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRecap(
			JComboBox jComboBoxTiposAccionesFormularioRecap) {
		this.jComboBoxTiposAccionesFormularioRecap = jComboBoxTiposAccionesFormularioRecap;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.recapSessionBean=new RecapSessionBean();
		
		this.recapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.recapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.recapSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallerecapSessionBean=new DetalleRecapSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Recap MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
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
	
		RecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRecap= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRecap=new JButtonMe();
				this.jButtonModificarToolBarRecap=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRecap,this.jTtoolBarDetalleRecap,
							"actualizar","actualizar","Actualizar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRecap,this.jTtoolBarDetalleRecap,
							"eliminar","eliminar","Eliminar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRecap,this.jTtoolBarDetalleRecap,
							"cancelar","cancelar","Cancelar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRecap,this.jTtoolBarDetalleRecap,
							"guardarcambios","guardarcambios","Guardar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRecap,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRecap=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRecap=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRecap=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRecap=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRecap=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRecap= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRecap.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRecap,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRecap= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRecap.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRecap,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRecap= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRecap.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRecap,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRecap= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRecap.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRecap,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRecap, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRecap.add(this.jMenuItemDetalleCerrarRecap);
		
		this.jmenuDetalleAccionesRecap.add(this.jMenuItemActualizarRecap);
		this.jmenuDetalleAccionesRecap.add(this.jMenuItemEliminarRecap);
		this.jmenuDetalleAccionesRecap.add(this.jMenuItemCancelarRecap);		
		
		//this.jmenuDetalleDatosRecap.add(this.jMenuItemDetalleAbrirOrderByRecap);				
		this.jmenuDetalleDatosRecap.add(this.jMenuItemDetalleMostarOcultarRecap);				
				
		//this.jmenuDetalleAccionesRecap.add(this.jMenuItemGuardarCambiosRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRecap.add(this.jmenuDetalleArchivoRecap);		
		this.jmenuBarDetalleRecap.add(this.jmenuDetalleAccionesRecap);		
		this.jmenuBarDetalleRecap.add(this.jmenuDetalleDatosRecap);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRecap.add(this.jmenuDetalleRecap);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRecap);				
	}
	
	
	public void inicializarElementosCamposRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRecap = new JLabelMe();
		jLabelIdRecap.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRecap = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRecap.setToolTipText(RecapConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRecap= new GridBagLayout();

		this.jPanelidRecap.setLayout(this.gridaBagLayoutRecap);

		jLabelidRecap = new JLabel();
		jLabelidRecap.setText("Id");

		jLabelidRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroRecap = new JLabelMe();
		this.jLabelnumeroRecap.setText(""+RecapConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroRecap.setToolTipText("Numero");
		this.jLabelnumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroRecap.setToolTipText(RecapConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelnumeroRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldnumeroRecap= new JTextFieldMe();

		jTextFieldnumeroRecap.setEnabled(false);
		jTextFieldnumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroRecapBusqueda= new JButtonMe();
		this.jButtonnumeroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroRecapBusqueda.setText("U");
		this.jButtonnumeroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroRecapBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionRecap = new JLabelMe();
		this.jLabelnumero_autorizacionRecap.setText(""+RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionRecap.setToolTipText("Numero Autorizacion");
		this.jLabelnumero_autorizacionRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionRecap.setToolTipText(RecapConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelnumero_autorizacionRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldnumero_autorizacionRecap= new JTextFieldMe();

		jTextFieldnumero_autorizacionRecap.setEnabled(false);
		jTextFieldnumero_autorizacionRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionRecapBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionRecapBusqueda.setText("U");
		this.jButtonnumero_autorizacionRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionRecapBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioRecap = new JLabelMe();
		this.jLabelfecha_inicioRecap.setText(""+RecapConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioRecap.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioRecap.setToolTipText(RecapConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelfecha_inicioRecap.setLayout(this.gridaBagLayoutRecap);


		//jFormattedTextFieldfecha_inicioRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioRecap= new JDateChooser();
		jDateChooserfecha_inicioRecap.setEnabled(false);
		jDateChooserfecha_inicioRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioRecap.setDate(new Date());
		jDateChooserfecha_inicioRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioRecapBusqueda= new JButtonMe();
		this.jButtonfecha_inicioRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioRecapBusqueda.setText("U");
		this.jButtonfecha_inicioRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioRecapBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finalRecap = new JLabelMe();
		this.jLabelfecha_finalRecap.setText(""+RecapConstantesFunciones.LABEL_FECHAFINAL+" : *");
		this.jLabelfecha_finalRecap.setToolTipText("Fecha Final");
		this.jLabelfecha_finalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finalRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finalRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finalRecap.setToolTipText(RecapConstantesFunciones.LABEL_FECHAFINAL);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelfecha_finalRecap.setLayout(this.gridaBagLayoutRecap);


		//jFormattedTextFieldfecha_finalRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_finalRecap= new JDateChooser();
		jDateChooserfecha_finalRecap.setEnabled(false);
		jDateChooserfecha_finalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finalRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finalRecap.setDate(new Date());
		jDateChooserfecha_finalRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finalRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finalRecapBusqueda= new JButtonMe();
		this.jButtonfecha_finalRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finalRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finalRecapBusqueda.setText("U");
		this.jButtonfecha_finalRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finalRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finalRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finalRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finalRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finalRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finalRecapBusqueda.setVisible(false);		}


					
		this.jLabelfecha_elaboracionRecap = new JLabelMe();
		this.jLabelfecha_elaboracionRecap.setText(""+RecapConstantesFunciones.LABEL_FECHAELABORACION+" : *");
		this.jLabelfecha_elaboracionRecap.setToolTipText("Fecha Elaboracion");
		this.jLabelfecha_elaboracionRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_elaboracionRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_elaboracionRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_elaboracionRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_elaboracionRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_elaboracionRecap.setToolTipText(RecapConstantesFunciones.LABEL_FECHAELABORACION);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelfecha_elaboracionRecap.setLayout(this.gridaBagLayoutRecap);


		//jFormattedTextFieldfecha_elaboracionRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_elaboracionRecap= new JDateChooser();
		jDateChooserfecha_elaboracionRecap.setEnabled(false);
		jDateChooserfecha_elaboracionRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracionRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracionRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_elaboracionRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_elaboracionRecap.setDate(new Date());
		jDateChooserfecha_elaboracionRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_elaboracionRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_elaboracionRecapBusqueda= new JButtonMe();
		this.jButtonfecha_elaboracionRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracionRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracionRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_elaboracionRecapBusqueda.setText("U");
		this.jButtonfecha_elaboracionRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_elaboracionRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_elaboracionRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_elaboracionRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_elaboracionRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_elaboracionRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_elaboracionRecapBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidadRecap = new JLabelMe();
		this.jLabelfecha_caducidadRecap.setText(""+RecapConstantesFunciones.LABEL_FECHACADUCIDAD+" : *");
		this.jLabelfecha_caducidadRecap.setToolTipText("Fecha Caducad");
		this.jLabelfecha_caducidadRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidadRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidadRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidadRecap.setToolTipText(RecapConstantesFunciones.LABEL_FECHACADUCIDAD);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelfecha_caducidadRecap.setLayout(this.gridaBagLayoutRecap);


		//jFormattedTextFieldfecha_caducidadRecap= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidadRecap= new JDateChooser();
		jDateChooserfecha_caducidadRecap.setEnabled(false);
		jDateChooserfecha_caducidadRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidadRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidadRecap.setDate(new Date());
		jDateChooserfecha_caducidadRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidadRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidadRecapBusqueda= new JButtonMe();
		this.jButtonfecha_caducidadRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidadRecapBusqueda.setText("U");
		this.jButtonfecha_caducidadRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidadRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidadRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidadRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidadRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidadRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidadRecapBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaRecap = new JLabelMe();
		this.jLabelmonto_ivaRecap.setText(""+RecapConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaRecap.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaRecap.setToolTipText(RecapConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelmonto_ivaRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldmonto_ivaRecap= new JTextFieldMe();
		jTextFieldmonto_ivaRecap.setEnabled(false);
		jTextFieldmonto_ivaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaRecap.setText("0.0");

		this.jButtonmonto_ivaRecapBusqueda= new JButtonMe();
		this.jButtonmonto_ivaRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaRecapBusqueda.setText("U");
		this.jButtonmonto_ivaRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaRecapBusqueda.setVisible(false);		}


					
		this.jLabelsin_monto_ivaRecap = new JLabelMe();
		this.jLabelsin_monto_ivaRecap.setText(""+RecapConstantesFunciones.LABEL_SINMONTOIVA+" : *");
		this.jLabelsin_monto_ivaRecap.setToolTipText("Sin Monto Iva");
		this.jLabelsin_monto_ivaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsin_monto_ivaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsin_monto_ivaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsin_monto_ivaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsin_monto_ivaRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsin_monto_ivaRecap.setToolTipText(RecapConstantesFunciones.LABEL_SINMONTOIVA);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelsin_monto_ivaRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldsin_monto_ivaRecap= new JTextFieldMe();
		jTextFieldsin_monto_ivaRecap.setEnabled(false);
		jTextFieldsin_monto_ivaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsin_monto_ivaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsin_monto_ivaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsin_monto_ivaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsin_monto_ivaRecap.setText("0.0");

		this.jButtonsin_monto_ivaRecapBusqueda= new JButtonMe();
		this.jButtonsin_monto_ivaRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsin_monto_ivaRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsin_monto_ivaRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsin_monto_ivaRecapBusqueda.setText("U");
		this.jButtonsin_monto_ivaRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsin_monto_ivaRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsin_monto_ivaRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsin_monto_ivaRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsin_monto_ivaRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sin_monto_ivaRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsin_monto_ivaRecapBusqueda.setVisible(false);		}


					
		this.jLabelivaRecap = new JLabelMe();
		this.jLabelivaRecap.setText(""+RecapConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaRecap.setToolTipText("Iva");
		this.jLabelivaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaRecap.setToolTipText(RecapConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelivaRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldivaRecap= new JTextFieldMe();
		jTextFieldivaRecap.setEnabled(false);
		jTextFieldivaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaRecap.setText("0.0");

		this.jButtonivaRecapBusqueda= new JButtonMe();
		this.jButtonivaRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaRecapBusqueda.setText("U");
		this.jButtonivaRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaRecapBusqueda.setVisible(false);		}


					
		this.jLabelotro_impuestoRecap = new JLabelMe();
		this.jLabelotro_impuestoRecap.setText(""+RecapConstantesFunciones.LABEL_OTROIMPUESTO+" : *");
		this.jLabelotro_impuestoRecap.setToolTipText("Otro Impuesto");
		this.jLabelotro_impuestoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_impuestoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_impuestoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotro_impuestoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotro_impuestoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotro_impuestoRecap.setToolTipText(RecapConstantesFunciones.LABEL_OTROIMPUESTO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelotro_impuestoRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldotro_impuestoRecap= new JTextFieldMe();
		jTextFieldotro_impuestoRecap.setEnabled(false);
		jTextFieldotro_impuestoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_impuestoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_impuestoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotro_impuestoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotro_impuestoRecap.setText("0.0");

		this.jButtonotro_impuestoRecapBusqueda= new JButtonMe();
		this.jButtonotro_impuestoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_impuestoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_impuestoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotro_impuestoRecapBusqueda.setText("U");
		this.jButtonotro_impuestoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotro_impuestoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotro_impuestoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotro_impuestoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotro_impuestoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otro_impuestoRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotro_impuestoRecapBusqueda.setVisible(false);		}


					
		this.jLabelvalor_propuestoRecap = new JLabelMe();
		this.jLabelvalor_propuestoRecap.setText(""+RecapConstantesFunciones.LABEL_VALORPROPUESTO+" : *");
		this.jLabelvalor_propuestoRecap.setToolTipText("Valor Propuesto");
		this.jLabelvalor_propuestoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_propuestoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_propuestoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_propuestoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_propuestoRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_propuestoRecap.setToolTipText(RecapConstantesFunciones.LABEL_VALORPROPUESTO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelvalor_propuestoRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldvalor_propuestoRecap= new JTextFieldMe();
		jTextFieldvalor_propuestoRecap.setEnabled(false);
		jTextFieldvalor_propuestoRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_propuestoRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_propuestoRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_propuestoRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_propuestoRecap.setText("0.0");

		this.jButtonvalor_propuestoRecapBusqueda= new JButtonMe();
		this.jButtonvalor_propuestoRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_propuestoRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_propuestoRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_propuestoRecapBusqueda.setText("U");
		this.jButtonvalor_propuestoRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_propuestoRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_propuestoRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_propuestoRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_propuestoRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_propuestoRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_propuestoRecapBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalRecap = new JLabelMe();
		this.jLabelsubtotalRecap.setText(""+RecapConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalRecap.setToolTipText("Subtotal");
		this.jLabelsubtotalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalRecap.setToolTipText(RecapConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelsubtotalRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldsubtotalRecap= new JTextFieldMe();
		jTextFieldsubtotalRecap.setEnabled(false);
		jTextFieldsubtotalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalRecap.setText("0.0");

		this.jButtonsubtotalRecapBusqueda= new JButtonMe();
		this.jButtonsubtotalRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalRecapBusqueda.setText("U");
		this.jButtonsubtotalRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalRecapBusqueda.setVisible(false);		}


					
		this.jLabelfinancieroRecap = new JLabelMe();
		this.jLabelfinancieroRecap.setText(""+RecapConstantesFunciones.LABEL_FINANCIERO+" : *");
		this.jLabelfinancieroRecap.setToolTipText("Financiero");
		this.jLabelfinancieroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinancieroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinancieroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinancieroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinancieroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinancieroRecap.setToolTipText(RecapConstantesFunciones.LABEL_FINANCIERO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelfinancieroRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldfinancieroRecap= new JTextFieldMe();
		jTextFieldfinancieroRecap.setEnabled(false);
		jTextFieldfinancieroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinancieroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinancieroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinancieroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinancieroRecap.setText("0.0");

		this.jButtonfinancieroRecapBusqueda= new JButtonMe();
		this.jButtonfinancieroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinancieroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinancieroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinancieroRecapBusqueda.setText("U");
		this.jButtonfinancieroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinancieroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinancieroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinancieroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinancieroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financieroRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinancieroRecapBusqueda.setVisible(false);		}


					
		this.jLabeltotalRecap = new JLabelMe();
		this.jLabeltotalRecap.setText(""+RecapConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalRecap.setToolTipText("Total");
		this.jLabeltotalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalRecap.setToolTipText(RecapConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPaneltotalRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldtotalRecap= new JTextFieldMe();
		jTextFieldtotalRecap.setEnabled(false);
		jTextFieldtotalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalRecap.setText("0.0");

		this.jButtontotalRecapBusqueda= new JButtonMe();
		this.jButtontotalRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalRecapBusqueda.setText("U");
		this.jButtontotalRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalRecapBusqueda.setVisible(false);		}


					
		this.jLabelvalor_cambioRecap = new JLabelMe();
		this.jLabelvalor_cambioRecap.setText(""+RecapConstantesFunciones.LABEL_VALORCAMBIO+" : *");
		this.jLabelvalor_cambioRecap.setToolTipText("Valor Cambio");
		this.jLabelvalor_cambioRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cambioRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cambioRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_cambioRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_cambioRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_cambioRecap.setToolTipText(RecapConstantesFunciones.LABEL_VALORCAMBIO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelvalor_cambioRecap.setLayout(this.gridaBagLayoutRecap);


		jTextFieldvalor_cambioRecap= new JTextFieldMe();
		jTextFieldvalor_cambioRecap.setEnabled(false);
		jTextFieldvalor_cambioRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cambioRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cambioRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_cambioRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_cambioRecap.setText("0.0");

		this.jButtonvalor_cambioRecapBusqueda= new JButtonMe();
		this.jButtonvalor_cambioRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cambioRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cambioRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_cambioRecapBusqueda.setText("U");
		this.jButtonvalor_cambioRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_cambioRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_cambioRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_cambioRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_cambioRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_cambioRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_cambioRecapBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRecap = new JLabelMe();
		this.jLabelid_empresaRecap.setText(""+RecapConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRecap.setToolTipText("Empresa");
		this.jLabelid_empresaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRecap.setToolTipText(RecapConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelid_empresaRecap.setLayout(this.gridaBagLayoutRecap);


		jComboBoxid_empresaRecap= new JComboBoxMe();
		jComboBoxid_empresaRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRecap.setEnabled(false);

		this.jButtonid_empresaRecap= new JButtonMe();
		this.jButtonid_empresaRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRecap.setText("Buscar");
		this.jButtonid_empresaRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRecap"));

		this.jButtonid_empresaRecapBusqueda= new JButtonMe();
		this.jButtonid_empresaRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRecapBusqueda.setText("U");
		this.jButtonid_empresaRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRecapBusqueda.setVisible(false);		}

		this.jButtonid_empresaRecapUpdate= new JButtonMe();
		this.jButtonid_empresaRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRecapUpdate.setText("U");
		this.jButtonid_empresaRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRecapUpdate"));



					
		this.jLabelid_sucursalRecap = new JLabelMe();
		this.jLabelid_sucursalRecap.setText(""+RecapConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRecap.setToolTipText("Sucursal");
		this.jLabelid_sucursalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRecap.setToolTipText(RecapConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelid_sucursalRecap.setLayout(this.gridaBagLayoutRecap);


		jComboBoxid_sucursalRecap= new JComboBoxMe();
		jComboBoxid_sucursalRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRecap.setEnabled(false);

		this.jButtonid_sucursalRecap= new JButtonMe();
		this.jButtonid_sucursalRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRecap.setText("Buscar");
		this.jButtonid_sucursalRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRecap"));

		this.jButtonid_sucursalRecapBusqueda= new JButtonMe();
		this.jButtonid_sucursalRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRecapBusqueda.setText("U");
		this.jButtonid_sucursalRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRecapBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRecapUpdate= new JButtonMe();
		this.jButtonid_sucursalRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRecapUpdate.setText("U");
		this.jButtonid_sucursalRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRecapUpdate"));



					
		this.jLabelid_ejercicioRecap = new JLabelMe();
		this.jLabelid_ejercicioRecap.setText(""+RecapConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRecap.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRecap.setToolTipText(RecapConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRecap = new GridBagLayout();
		this.jPanelid_ejercicioRecap.setLayout(this.gridaBagLayoutRecap);


		jComboBoxid_ejercicioRecap= new JComboBoxMe();
		jComboBoxid_ejercicioRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRecap.setEnabled(false);

		this.jButtonid_ejercicioRecap= new JButtonMe();
		this.jButtonid_ejercicioRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRecap.setText("Buscar");
		this.jButtonid_ejercicioRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRecap"));

		this.jButtonid_ejercicioRecapBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRecapBusqueda.setText("U");
		this.jButtonid_ejercicioRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRecapBusqueda"));

		if(this.recapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRecapBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRecapUpdate= new JButtonMe();
		this.jButtonid_ejercicioRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRecapUpdate.setText("U");
		this.jButtonid_ejercicioRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRecapUpdate"));



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
		//this.jInternalFrameDetalleRecap = new RecapBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Recap DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRecap= new GridBagLayout();
		

		
		String sToolTipRecap="";
		sToolTipRecap=RecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRecap+="(Cartera.Recap)";
		}
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			sToolTipRecap+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRecap = new JButtonMe();
		this.jButtonModificarRecap = new JButtonMe();
        this.jButtonActualizarRecap = new JButtonMe();
        this.jButtonEliminarRecap = new JButtonMe();
        this.jButtonCancelarRecap = new JButtonMe();
        this.jButtonGuardarCambiosRecap = new JButtonMe();
		this.jButtonGuardarCambiosTablaRecap = new JButtonMe();
		this.jButtonCerrarRecap = new JButtonMe();
		
		this.jScrollPanelDatosRecap = new JScrollPane();   
        this.jScrollPanelDatosEdicionRecap = new JScrollPane();
		this.jScrollPanelDatosGeneralRecap = new JScrollPane();
				
		
		
		this.jPanelCamposRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Recap";
		
		if(!this.recapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRecap.setName("jPanelCamposRecap"); 

		this.jPanelCamposOcultosRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRecap.setName("jPanelCamposOcultosRecap"); 

        this.jPanelAccionesRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRecap.setToolTipText("Acciones");
        this.jPanelAccionesRecap.setName("Acciones"); 

		this.jPanelAccionesFormularioRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRecap.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRecap.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRecap.setText("Nuevo");
		this.jButtonModificarRecap.setText("Editar");
        this.jButtonActualizarRecap.setText("Actualizar");
        this.jButtonEliminarRecap.setText("Eliminar");
        this.jButtonCancelarRecap.setText("Cancelar");
        this.jButtonGuardarCambiosRecap.setText("Guardar");
		this.jButtonGuardarCambiosTablaRecap.setText("Guardar");
		this.jButtonCerrarRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRecap,"nuevo_button","Nuevo",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRecap,"modificar_button","Editar",this.recapSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRecap,"actualizar_button","Actualizar",this.recapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRecap,"eliminar_button","Eliminar",this.recapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRecap,"cancelar_button","Cancelar",this.recapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRecap,"guardarcambios_button","Guardar",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRecap,"guardarcambiostabla_button","Guardar",this.recapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRecap,"cerrar_button","Salir",this.recapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRecap.setToolTipText("Nuevo"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRecap.setToolTipText("Editar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRecap.setToolTipText("Actualizar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRecap.setToolTipText("Eliminar)"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRecap.setToolTipText("Cancelar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRecap.setToolTipText("Guardar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRecap.setToolTipText("Guardar"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRecap.setToolTipText("Salir"+" "+RecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRecap";
		inputMap = this.jButtonNuevoRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRecap"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRecap";
		inputMap = this.jButtonActualizarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRecap"));
		
		//ELIMINAR
		sMapKey = "EliminarRecap";
		inputMap = this.jButtonEliminarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRecap"));
		
		//CANCELAR	
		sMapKey = "CancelarRecap";
		inputMap = this.jButtonCancelarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRecap"));
		
		//CERRAR		
		sMapKey = "CerrarRecap";
		inputMap = this.jButtonCerrarRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRecap";
		inputMap = this.jButtonGuardarCambiosTablaRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRecap"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRecap.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRecap.setToolTipText("Nuevo Recap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRecap.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRecap.setToolTipText("Sin Cerrar Ventana Recap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRecap.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRecap.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRecap, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRecap.setText("Accion");
		this.jComboBoxTiposAccionesRecap.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRecap.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRecap.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRecap = new JLabelMe();
		
		this.jLabelAccionesRecap.setText("Acciones");		
		this.jLabelAccionesRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRecap();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRecap();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRecap=new JTabbedPane();
		this.jTabbedPaneRelacionesRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRecap.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRecap, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRecap = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRecap = new GridBagLayout();
		
		this.jPanelCamposRecap.setLayout(gridaBagLayoutCamposRecap);
		this.jPanelCamposOcultosRecap.setLayout(gridaBagLayoutCamposOcultosRecap);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRecap.add(jLabelIdRecap, this.gridBagConstraintsRecap);



	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRecap.add(jLabelidRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRecap.add(jLabelid_empresaRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRecap.add(jButtonid_empresaRecapBusqueda, this.gridBagConstraintsRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 3;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRecap.add(jButtonid_empresaRecapUpdate, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRecap.add(jComboBoxid_empresaRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRecap.add(jLabelid_sucursalRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRecap.add(jButtonid_sucursalRecapBusqueda, this.gridBagConstraintsRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 3;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRecap.add(jButtonid_sucursalRecapUpdate, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRecap.add(jComboBoxid_sucursalRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioRecap.add(jLabelid_ejercicioRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRecap.add(jButtonid_ejercicioRecapBusqueda, this.gridBagConstraintsRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 3;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRecap.add(jButtonid_ejercicioRecapUpdate, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioRecap.add(jComboBoxid_ejercicioRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroRecap.add(jLabelnumeroRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroRecap.add(jButtonnumeroRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroRecap.add(jTextFieldnumeroRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionRecap.add(jLabelnumero_autorizacionRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionRecap.add(jButtonnumero_autorizacionRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionRecap.add(jTextFieldnumero_autorizacionRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioRecap.add(jLabelfecha_inicioRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioRecap.add(jButtonfecha_inicioRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioRecap.add(jDateChooserfecha_inicioRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finalRecap.add(jLabelfecha_finalRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finalRecap.add(jButtonfecha_finalRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finalRecap.add(jDateChooserfecha_finalRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_elaboracionRecap.add(jLabelfecha_elaboracionRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_elaboracionRecap.add(jButtonfecha_elaboracionRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_elaboracionRecap.add(jDateChooserfecha_elaboracionRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidadRecap.add(jLabelfecha_caducidadRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidadRecap.add(jButtonfecha_caducidadRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidadRecap.add(jDateChooserfecha_caducidadRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ivaRecap.add(jLabelmonto_ivaRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaRecap.add(jButtonmonto_ivaRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ivaRecap.add(jTextFieldmonto_ivaRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsin_monto_ivaRecap.add(jLabelsin_monto_ivaRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelsin_monto_ivaRecap.add(jButtonsin_monto_ivaRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsin_monto_ivaRecap.add(jTextFieldsin_monto_ivaRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaRecap.add(jLabelivaRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaRecap.add(jButtonivaRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaRecap.add(jTextFieldivaRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotro_impuestoRecap.add(jLabelotro_impuestoRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelotro_impuestoRecap.add(jButtonotro_impuestoRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotro_impuestoRecap.add(jTextFieldotro_impuestoRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_propuestoRecap.add(jLabelvalor_propuestoRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_propuestoRecap.add(jButtonvalor_propuestoRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_propuestoRecap.add(jTextFieldvalor_propuestoRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsubtotalRecap.add(jLabelsubtotalRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalRecap.add(jButtonsubtotalRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsubtotalRecap.add(jTextFieldsubtotalRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinancieroRecap.add(jLabelfinancieroRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinancieroRecap.add(jButtonfinancieroRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinancieroRecap.add(jTextFieldfinancieroRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalRecap.add(jLabeltotalRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalRecap.add(jButtontotalRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalRecap.add(jTextFieldtotalRecap, this.gridBagConstraintsRecap);


	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 0;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_cambioRecap.add(jLabelvalor_cambioRecap, this.gridBagConstraintsRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRecap = new GridBagConstraints();
		//this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = 2;
		this.gridBagConstraintsRecap.ipadx = 0;
		this.gridBagConstraintsRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_cambioRecap.add(jButtonvalor_cambioRecapBusqueda, this.gridBagConstraintsRecap);
	}

	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRecap.gridy = 0;
	this.gridBagConstraintsRecap.gridx = 1;
	this.gridBagConstraintsRecap.ipadx = 0;
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_cambioRecap.add(jTextFieldvalor_cambioRecap, this.gridBagConstraintsRecap);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelidRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelnumeroRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelnumero_autorizacionRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelfecha_inicioRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelfecha_finalRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelfecha_elaboracionRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelfecha_caducidadRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelmonto_ivaRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelsin_monto_ivaRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelivaRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelotro_impuestoRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelvalor_propuestoRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelsubtotalRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelfinancieroRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPaneltotalRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRecap.add(this.jPanelvalor_cambioRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposRecap % 2==0) {
		iXPanelCamposRecap=0;
		iYPanelCamposRecap++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposOcultosRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposOcultosRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRecap.add(this.jPanelid_empresaRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposOcultosRecap % 2==0) {
		iXPanelCamposOcultosRecap=0;
		iYPanelCamposOcultosRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposOcultosRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposOcultosRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRecap.add(this.jPanelid_sucursalRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposOcultosRecap % 2==0) {
		iXPanelCamposOcultosRecap=0;
		iYPanelCamposOcultosRecap++;
	}
	this.gridBagConstraintsRecap = new GridBagConstraints();
	this.gridBagConstraintsRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRecap.gridy = iYPanelCamposOcultosRecap;
	this.gridBagConstraintsRecap.gridx = iXPanelCamposOcultosRecap++;
	this.gridBagConstraintsRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRecap.add(this.jPanelid_ejercicioRecap, this.gridBagConstraintsRecap);



	if(iXPanelCamposOcultosRecap % 2==0) {
		iXPanelCamposOcultosRecap=0;
		iYPanelCamposOcultosRecap++;
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
			
		GridBagLayout gridaBagLayoutAccionesRecap= new GridBagLayout();
		this.jPanelAccionesRecap.setLayout(gridaBagLayoutAccionesRecap);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRecap= new GridBagLayout();
		this.jPanelAccionesFormularioRecap.setLayout(gridaBagLayoutAccionesFormularioRecap);
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRecap.add(this.jComboBoxTiposAccionesFormularioRecap, this.gridBagConstraintsRecap);

		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRecap.add(this.jCheckBoxPostAccionNuevoRecap, this.gridBagConstraintsRecap);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.recapSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRecap.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRecap.add(this.jCheckBoxPostAccionSinCerrarRecap, this.gridBagConstraintsRecap);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.recapSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.recapSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRecap.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRecap.add(this.jCheckBoxPostAccionSinMensajeRecap, this.gridBagConstraintsRecap);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx = iPosXAccion++;
			
		this.jPanelAccionesRecap.add(this.jButtonModificarRecap, this.gridBagConstraintsRecap);							

		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRecap.gridy = 0;
		this.gridBagConstraintsRecap.gridx =iPosXAccion++;
			
		this.jPanelAccionesRecap.add(this.jButtonEliminarRecap, this.gridBagConstraintsRecap);
		
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = 0;		
		this.gridBagConstraintsRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesRecap.add(this.jButtonActualizarRecap, this.gridBagConstraintsRecap);


		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = 0;		
		this.gridBagConstraintsRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesRecap.add(this.jButtonGuardarCambiosRecap, this.gridBagConstraintsRecap);	
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = 0;		
		this.gridBagConstraintsRecap.gridx =iPosXAccion++;
		
		this.jPanelAccionesRecap.add(this.jButtonCancelarRecap, this.gridBagConstraintsRecap);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRecap);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.recapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRecap = new GridBagConstraints();						
			this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRecap.gridx = 0;		
			//this.gridBagConstraintsRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRecap.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRecap.gridx =0;
		this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRecap, this.gridBagConstraintsRecap);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RecapJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRecap = new RecapBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Recap DATOS");
			
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
			
	        //this.setTitle("[FOR] - Recap DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Recap Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RecapModel recapModel=new RecapModel(this);
			
			//SI USARA CLASE INTERNA
			//RecapModel.RecapFocusTraversalPolicy recapFocusTraversalPolicy = recapModel.new RecapFocusTraversalPolicy(this);
			
			//recapFocusTraversalPolicy.setrecapJInternalFrame(this);
			
			this.setFocusTraversalPolicy(recapModel);
			
			
			this.jContentPaneDetalleRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRecap = new GridBagLayout();	
			this.jContentPaneDetalleRecap.setLayout(gridaBagLayoutDetalleRecap);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRecap = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRecap = new GridBagConstraints();
				this.gridBagConstraintsRecap.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRecap.gridx = 0;
					
				
				this.jContentPaneDetalleRecap.add(jTtoolBarDetalleRecap, gridBagConstraintsRecap);								
				
}
			
			this.jScrollPanelDatosEdicionRecap=   new JScrollPane(jContentPaneDetalleRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRecap.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRecap.gridx = 0;
	        
			this.jContentPaneDetalleRecap.add(jPanelCamposRecap, gridBagConstraintsRecap);
			
			
			
			
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
						&& recapSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleRecap(this.puedeCargarPorParteDetalleRecap,false,-1);
					
					if(this.recapSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRecap= new GridBagConstraints();
						this.gridBagConstraintsRecap.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRecap.gridx = 0;
						this.jContentPaneDetalleRecap.add(this.jTabbedPaneRelacionesRecap, this.gridBagConstraintsRecap);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRecap.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleRecap(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRecap.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRecap = new GridBagConstraints();
					this.gridBagConstraintsRecap.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRecap.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRecap.gridx = 0;
					
				
					this.jContentPaneDetalleRecap.add(jPanelCamposOcultosRecap, gridBagConstraintsRecap);
				
					this.jPanelCamposOcultosRecap.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsRecap.gridx = 0;
	        this.gridBagConstraintsRecap.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRecap.add(this.jPanelAccionesFormularioRecap, this.gridBagConstraintsRecap);							
			
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
	        this.gridBagConstraintsRecap.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsRecap.gridx = 0;
	        
			
			this.jContentPaneDetalleRecap.add(this.jPanelAccionesRecap, this.gridBagConstraintsRecap);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRecap);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRecap=   new JScrollPane(this.jPanelCamposRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRecap.gridx = 0;
			this.gridBagConstraintsRecap.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRecap.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRecap.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRecap, this.gridBagConstraintsRecap);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRecap, this.gridBagConstraintsRecap);			
			
			this.gridBagConstraintsRecap = new GridBagConstraints();
			this.gridBagConstraintsRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRecap, this.gridBagConstraintsRecap);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRecap, this.gridBagConstraintsRecap);
			
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRecap, this.gridBagConstraintsRecap);
		
			
		this.gridBagConstraintsRecap = new GridBagConstraints();
		this.gridBagConstraintsRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRecap, this.gridBagConstraintsRecap);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRecap;//jContentPane;
		
		return jScrollPanelDatosEdicionRecap;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleRecap(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallerecapSessionBean=new DetalleRecapSessionBean();
		this.detallerecapSessionBean.setConGuardarRelaciones(false);
		this.detallerecapSessionBean.setEsGuardarRelacionado(true);

		this.detallerecapBeanSwingJInternalFrame=null;//new DetalleRecapBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallerecapBeanSwingJInternalFramePopup=new DetalleRecapBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallerecapBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {

				DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL=RecapJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RecapJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallerecapSessionBean.setEsGuardarRelacionado(true);

				this.detallerecapBeanSwingJInternalFrame=new DetalleRecapBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallerecapBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallerecapBeanSwingJInternalFrame.setdetallerecapSessionBean(this.detallerecapSessionBean);

				//this.gridBagConstraintsRecap = new GridBagConstraints();
				//this.gridBagConstraintsRecap.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRecap.gridx = 0;
				//this.jContentPaneDetalleRecap.add(this.detallerecapBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRecap);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRecap.add("Detalle Recapes",this.detallerecapBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRecap.setComponentAt(iIndexTab,this.detallerecapBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallerecapSessionBean.setEsGuardarRelacionado(false);
				this.detallerecapBeanSwingJInternalFrame=null;//new DetalleRecapBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallerecapSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleRecap) {
					this.jTabbedPaneRelacionesRecap.add("Detalle Recapes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleRecapBeanSwingJInternalFrame(List<Recap> recaps,Recap recap,DetalleRecapBeanSwingJInternalFrame detallerecapBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallerecapBeanSwingJInternalFrame=new DetalleRecapBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallerecapBeanSwingJInternalFrame.getDetalleRecapLogic().setConnexion(this.recapLogic.getConnexion());

					detallerecapBeanSwingJInternalFrame.setrecapsForeignKey(recaps);
					detallerecapBeanSwingJInternalFrame.setrecapForeignKey(recap);
					detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setisBusquedaDesdeForeignKeySesionRecap(true);
					detallerecapBeanSwingJInternalFrame.detallerecapSessionBean.setlidRecapActual(recap.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallerecapBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleRecap(detallerecapBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallerecapBeanSwingJInternalFrame.setVisibilidadBusquedasParaRecap(true);
					detallerecapBeanSwingJInternalFrame.setid_recapFK_IdRecap(recap.getId());

					if(!this.conCargarFormDetalle) {
						detallerecapBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallerecapBeanSwingJInternalFrame.setSelectedItemCombosFrameRecapForeignKey(recap,1,false,true,true);
					detallerecapBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallerecapBeanSwingJInternalFrame.procesarBusqueda("FK_IdRecap");
					detallerecapBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRecap");
					detallerecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRecap(true);
					detallerecapBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleRecap("n",detallerecapBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallerecapBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallerecapBeanSwingJInternalFrame.setAutoscrolls(true);
					detallerecapBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallerecapBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRecap("relacionado");
					} else {
						detallerecapBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRecap("no_relacionado");
					}

					detallerecapBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleRecap().setVisible(false);

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
