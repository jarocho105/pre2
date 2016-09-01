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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.VendedorVisitaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class VendedorVisitaDetalleFormJInternalFrame extends VendedorVisitaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVendedorVisita;
	
	protected JMenuBar jmenuBarDetalleVendedorVisita;
	
	protected JMenu jmenuDetalleVendedorVisita;
	protected JMenu jmenuDetalleArchivoVendedorVisita;
	protected JMenu jmenuDetalleAccionesVendedorVisita;
	protected JMenu jmenuDetalleDatosVendedorVisita;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVendedorVisita;	
	protected GridBagConstraints gridBagConstraintsVendedorVisita;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VendedorVisitaBeanSwingJInternalFrameAdditional jInternalFrameDetalleVendedorVisita;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public VendedorVisitaSessionBean vendedorvisitaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public VendedorVisitaLogic vendedorvisitaLogic;
	
	public JScrollPane jScrollPanelDatosVendedorVisita;
	public JScrollPane jScrollPanelDatosEdicionVendedorVisita;
	public JScrollPane jScrollPanelDatosGeneralVendedorVisita;
	
	protected JPanel jPanelCamposVendedorVisita;    
	protected JPanel jPanelCamposOcultosVendedorVisita;    	
	protected JPanel jPanelAccionesVendedorVisita;
	protected JPanel jPanelAccionesFormularioVendedorVisita;
    
	
	
	protected Integer iXPanelCamposVendedorVisita=0;
	protected Integer iYPanelCamposVendedorVisita=0;
	
	protected Integer iXPanelCamposOcultosVendedorVisita=0;
	protected Integer iYPanelCamposOcultosVendedorVisita=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVendedorVisita;
	public JButton jButtonModificarVendedorVisita;
	public JButton jButtonActualizarVendedorVisita;
    public JButton jButtonEliminarVendedorVisita;
	public JButton jButtonCancelarVendedorVisita;
    public JButton jButtonGuardarCambiosVendedorVisita;
	public JButton jButtonGuardarCambiosTablaVendedorVisita;
	protected JButton jButtonCerrarVendedorVisita;
	
	
	protected JButton jButtonProcesarInformacionVendedorVisita;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVendedorVisita;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVendedorVisita;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVendedorVisita;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVendedorVisita;
	protected JButton jButtonModificarToolBarVendedorVisita;
	protected JButton jButtonActualizarToolBarVendedorVisita;
    protected JButton jButtonEliminarToolBarVendedorVisita;
	protected JButton jButtonCancelarToolBarVendedorVisita;
    protected JButton jButtonGuardarCambiosToolBarVendedorVisita;
	protected JButton jButtonGuardarCambiosTablaToolBarVendedorVisita;
	protected JButton jButtonMostrarOcultarTablaToolBarVendedorVisita;
	protected JButton jButtonCerrarToolBarVendedorVisita;
	
	protected JButton jButtonProcesarInformacionToolBarVendedorVisita;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVendedorVisita;
	protected JMenuItem jMenuItemModificarVendedorVisita;
	protected JMenuItem jMenuItemActualizarVendedorVisita;
    protected JMenuItem jMenuItemEliminarVendedorVisita;
	protected JMenuItem jMenuItemCancelarVendedorVisita;
    protected JMenuItem jMenuItemGuardarCambiosVendedorVisita;
	protected JMenuItem jMenuItemGuardarCambiosTablaVendedorVisita;
	protected JMenuItem jMenuItemCerrarVendedorVisita;
	protected JMenuItem jMenuItemDetalleCerrarVendedorVisita;
	protected JMenuItem jMenuItemDetalleMostarOcultarVendedorVisita;
	
	protected JMenuItem jMenuItemProcesarInformacionVendedorVisita;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVendedorVisita;
	protected JMenuItem jMenuItemMostrarOcultarVendedorVisita;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVendedorVisita;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVendedorVisita;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVendedorVisita;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVendedorVisita;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVendedorVisita;
	public JLabel jLabelIdVendedorVisita;
	public JLabel jLabelidVendedorVisita;
	public JButton jButtonidVendedorVisitaBusqueda= new JButtonMe();

	public JPanel jPanelvisita_realVendedorVisita;
	public JLabel jLabelvisita_realVendedorVisita;
	public JTextField jTextFieldvisita_realVendedorVisita;
	public JButton jButtonvisita_realVendedorVisitaBusqueda= new JButtonMe();

	public JPanel jPanelvisita_propuestaVendedorVisita;
	public JLabel jLabelvisita_propuestaVendedorVisita;
	public JTextField jTextFieldvisita_propuestaVendedorVisita;
	public JButton jButtonvisita_propuestaVendedorVisitaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVendedorVisita;
	public JLabel jLabelid_empresaVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVendedorVisita;
	public JButton jButtonid_empresaVendedorVisita= new JButtonMe();
	public JButton jButtonid_empresaVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_empresaVendedorVisitaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioVendedorVisita;
	public JLabel jLabelid_ejercicioVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioVendedorVisita;
	public JButton jButtonid_ejercicioVendedorVisita= new JButtonMe();
	public JButton jButtonid_ejercicioVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioVendedorVisitaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoVendedorVisita;
	public JLabel jLabelid_periodoVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoVendedorVisita;
	public JButton jButtonid_periodoVendedorVisita= new JButtonMe();
	public JButton jButtonid_periodoVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_periodoVendedorVisitaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorVendedorVisita;
	public JLabel jLabelid_vendedorVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorVendedorVisita;
	public JButton jButtonid_vendedorVendedorVisita= new JButtonMe();
	public JButton jButtonid_vendedorVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorVendedorVisitaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorVendedorVisitaArbol= new JButtonMe();

	public JPanel jPanelid_anioVendedorVisita;
	public JLabel jLabelid_anioVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioVendedorVisita;
	public JButton jButtonid_anioVendedorVisita= new JButtonMe();
	public JButton jButtonid_anioVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_anioVendedorVisitaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesVendedorVisita;
	public JLabel jLabelid_mesVendedorVisita;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesVendedorVisita;
	public JButton jButtonid_mesVendedorVisita= new JButtonMe();
	public JButton jButtonid_mesVendedorVisitaUpdate= new JButtonMe();
	public JButton jButtonid_mesVendedorVisitaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVendedorVisita;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VendedorVisitaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVendedorVisita=new JPanel();
				this.jPanelAccionesFormularioVendedorVisita=new JPanel();
				this.jmenuBarDetalleVendedorVisita=new JMenuBar();
				this.jTtoolBarDetalleVendedorVisita=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VendedorVisitaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VendedorVisitaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VendedorVisita No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVendedorVisita() {
		return this.jButtonActualizarToolBarVendedorVisita;
	}
	
	public JButton getjButtonEliminarToolBarVendedorVisita() {
		return this.jButtonEliminarToolBarVendedorVisita;
	}
	
	public JButton getjButtonCancelarToolBarVendedorVisita() {
		return this.jButtonCancelarToolBarVendedorVisita;
	}		
	
	public JButton getjButtonProcesarInformacionVendedorVisita() {
		return this.jButtonProcesarInformacionVendedorVisita;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVendedorVisita)	{
		this.jButtonProcesarInformacionVendedorVisita = jButtonProcesarInformacionVendedorVisita;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVendedorVisita() {
		return this.jComboBoxTiposAccionesVendedorVisita;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVendedorVisita(
			JComboBox jComboBoxTiposRelacionesVendedorVisita) {
		this.jComboBoxTiposRelacionesVendedorVisita = jComboBoxTiposRelacionesVendedorVisita;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVendedorVisita(
			JComboBox jComboBoxTiposAccionesVendedorVisita) {
		this.jComboBoxTiposAccionesVendedorVisita = jComboBoxTiposAccionesVendedorVisita;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVendedorVisita() {
		return this.jComboBoxTiposAccionesFormularioVendedorVisita;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVendedorVisita(
			JComboBox jComboBoxTiposAccionesFormularioVendedorVisita) {
		this.jComboBoxTiposAccionesFormularioVendedorVisita = jComboBoxTiposAccionesFormularioVendedorVisita;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
		
		this.vendedorvisitaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorvisitaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vendedorvisitaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VendedorVisitaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VendedorVisitaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VendedorVisitaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vendedor Visita MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
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
	
		VendedorVisitaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVendedorVisita= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVendedorVisita=new JButtonMe();
				this.jButtonModificarToolBarVendedorVisita=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVendedorVisita,this.jTtoolBarDetalleVendedorVisita,
							"actualizar","actualizar","Actualizar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVendedorVisita,this.jTtoolBarDetalleVendedorVisita,
							"eliminar","eliminar","Eliminar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVendedorVisita,this.jTtoolBarDetalleVendedorVisita,
							"cancelar","cancelar","Cancelar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVendedorVisita=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVendedorVisita,this.jTtoolBarDetalleVendedorVisita,
							"guardarcambios","guardarcambios","Guardar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVendedorVisita=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVendedorVisita=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVendedorVisita=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVendedorVisita=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVendedorVisita=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVendedorVisita= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVendedorVisita.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVendedorVisita,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVendedorVisita= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVendedorVisita.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVendedorVisita,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVendedorVisita= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVendedorVisita.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVendedorVisita,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVendedorVisita= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVendedorVisita.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVendedorVisita,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVendedorVisita= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVendedorVisita.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVendedorVisita,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVendedorVisita= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVendedorVisita.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVendedorVisita,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVendedorVisita= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVendedorVisita.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVendedorVisita,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVendedorVisita= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVendedorVisita.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVendedorVisita,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVendedorVisita= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVendedorVisita.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVendedorVisita,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVendedorVisita= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVendedorVisita.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVendedorVisita,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVendedorVisita.add(this.jMenuItemDetalleCerrarVendedorVisita);
		
		this.jmenuDetalleAccionesVendedorVisita.add(this.jMenuItemActualizarVendedorVisita);
		this.jmenuDetalleAccionesVendedorVisita.add(this.jMenuItemEliminarVendedorVisita);
		this.jmenuDetalleAccionesVendedorVisita.add(this.jMenuItemCancelarVendedorVisita);		
		
		//this.jmenuDetalleDatosVendedorVisita.add(this.jMenuItemDetalleAbrirOrderByVendedorVisita);				
		this.jmenuDetalleDatosVendedorVisita.add(this.jMenuItemDetalleMostarOcultarVendedorVisita);				
				
		//this.jmenuDetalleAccionesVendedorVisita.add(this.jMenuItemGuardarCambiosVendedorVisita);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVendedorVisita.add(this.jmenuDetalleArchivoVendedorVisita);		
		this.jmenuBarDetalleVendedorVisita.add(this.jmenuDetalleAccionesVendedorVisita);		
		this.jmenuBarDetalleVendedorVisita.add(this.jmenuDetalleDatosVendedorVisita);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVendedorVisita);				
	}
	
	
	public void inicializarElementosCamposVendedorVisita() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVendedorVisita = new JLabelMe();
		jLabelIdVendedorVisita.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVendedorVisita = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVendedorVisita= new GridBagLayout();

		this.jPanelidVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);

		jLabelidVendedorVisita = new JLabel();
		jLabelidVendedorVisita.setText("Id");

		jLabelidVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvisita_realVendedorVisita = new JLabelMe();
		this.jLabelvisita_realVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_VISITAREAL+" : *");
		this.jLabelvisita_realVendedorVisita.setToolTipText("Visita Real");
		this.jLabelvisita_realVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvisita_realVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvisita_realVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvisita_realVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvisita_realVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvisita_realVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelvisita_realVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jTextFieldvisita_realVendedorVisita= new JTextFieldMe();
		jTextFieldvisita_realVendedorVisita.setEnabled(false);
		jTextFieldvisita_realVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvisita_realVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvisita_realVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvisita_realVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvisita_realVendedorVisita.setText("0.0");

		this.jButtonvisita_realVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonvisita_realVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvisita_realVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvisita_realVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvisita_realVendedorVisitaBusqueda.setText("U");
		this.jButtonvisita_realVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvisita_realVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvisita_realVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvisita_realVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvisita_realVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"visita_realVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvisita_realVendedorVisitaBusqueda.setVisible(false);		}


					
		this.jLabelvisita_propuestaVendedorVisita = new JLabelMe();
		this.jLabelvisita_propuestaVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA+" : *");
		this.jLabelvisita_propuestaVendedorVisita.setToolTipText("Visita Propuesta");
		this.jLabelvisita_propuestaVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvisita_propuestaVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvisita_propuestaVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvisita_propuestaVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvisita_propuestaVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvisita_propuestaVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelvisita_propuestaVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jTextFieldvisita_propuestaVendedorVisita= new JTextFieldMe();
		jTextFieldvisita_propuestaVendedorVisita.setEnabled(false);
		jTextFieldvisita_propuestaVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvisita_propuestaVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvisita_propuestaVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvisita_propuestaVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvisita_propuestaVendedorVisita.setText("0.0");

		this.jButtonvisita_propuestaVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonvisita_propuestaVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvisita_propuestaVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvisita_propuestaVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvisita_propuestaVendedorVisitaBusqueda.setText("U");
		this.jButtonvisita_propuestaVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvisita_propuestaVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvisita_propuestaVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvisita_propuestaVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvisita_propuestaVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"visita_propuestaVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvisita_propuestaVendedorVisitaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVendedorVisita() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVendedorVisita = new JLabelMe();
		this.jLabelid_empresaVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVendedorVisita.setToolTipText("Empresa");
		this.jLabelid_empresaVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelid_empresaVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jComboBoxid_empresaVendedorVisita= new JComboBoxMe();
		jComboBoxid_empresaVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVendedorVisita.setEnabled(false);

		this.jButtonid_empresaVendedorVisita= new JButtonMe();
		this.jButtonid_empresaVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVendedorVisita.setText("Buscar");
		this.jButtonid_empresaVendedorVisita.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVendedorVisita.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorVisita,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorVisita"));

		this.jButtonid_empresaVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonid_empresaVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVendedorVisitaBusqueda.setText("U");
		this.jButtonid_empresaVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVendedorVisitaBusqueda.setVisible(false);		}

		this.jButtonid_empresaVendedorVisitaUpdate= new JButtonMe();
		this.jButtonid_empresaVendedorVisitaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorVisitaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVendedorVisitaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVendedorVisitaUpdate.setText("U");
		this.jButtonid_empresaVendedorVisitaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVendedorVisitaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVendedorVisitaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVendedorVisitaUpdate"));



					
		this.jLabelid_ejercicioVendedorVisita = new JLabelMe();
		this.jLabelid_ejercicioVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioVendedorVisita.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelid_ejercicioVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jComboBoxid_ejercicioVendedorVisita= new JComboBoxMe();
		jComboBoxid_ejercicioVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioVendedorVisita= new JButtonMe();
		this.jButtonid_ejercicioVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioVendedorVisita.setText("Buscar");
		this.jButtonid_ejercicioVendedorVisita.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioVendedorVisita.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioVendedorVisita,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioVendedorVisita"));

		this.jButtonid_ejercicioVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioVendedorVisitaBusqueda.setText("U");
		this.jButtonid_ejercicioVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioVendedorVisitaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioVendedorVisitaUpdate= new JButtonMe();
		this.jButtonid_ejercicioVendedorVisitaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioVendedorVisitaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioVendedorVisitaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioVendedorVisitaUpdate.setText("U");
		this.jButtonid_ejercicioVendedorVisitaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioVendedorVisitaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioVendedorVisitaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioVendedorVisitaUpdate"));



					
		this.jLabelid_periodoVendedorVisita = new JLabelMe();
		this.jLabelid_periodoVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoVendedorVisita.setToolTipText("Periodo");
		this.jLabelid_periodoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelid_periodoVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jComboBoxid_periodoVendedorVisita= new JComboBoxMe();
		jComboBoxid_periodoVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodoVendedorVisita= new JButtonMe();
		this.jButtonid_periodoVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoVendedorVisita.setText("Buscar");
		this.jButtonid_periodoVendedorVisita.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoVendedorVisita.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoVendedorVisita,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoVendedorVisita"));

		this.jButtonid_periodoVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonid_periodoVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoVendedorVisitaBusqueda.setText("U");
		this.jButtonid_periodoVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoVendedorVisitaBusqueda.setVisible(false);		}

		this.jButtonid_periodoVendedorVisitaUpdate= new JButtonMe();
		this.jButtonid_periodoVendedorVisitaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoVendedorVisitaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoVendedorVisitaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoVendedorVisitaUpdate.setText("U");
		this.jButtonid_periodoVendedorVisitaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoVendedorVisitaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoVendedorVisitaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoVendedorVisitaUpdate"));



					
		this.jLabelid_vendedorVendedorVisita = new JLabelMe();
		this.jLabelid_vendedorVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorVendedorVisita.setToolTipText("Vendedor");
		this.jLabelid_vendedorVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelid_vendedorVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jComboBoxid_vendedorVendedorVisita= new JComboBoxMe();
		jComboBoxid_vendedorVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorVendedorVisita= new JButtonMe();
		this.jButtonid_vendedorVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorVendedorVisita.setText("Buscar");
		this.jButtonid_vendedorVendedorVisita.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorVendedorVisita.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorVisita,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorVisita"));

		this.jButtonid_vendedorVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonid_vendedorVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVendedorVisitaBusqueda.setText("U");
		this.jButtonid_vendedorVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorVendedorVisitaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorVendedorVisitaUpdate= new JButtonMe();
		this.jButtonid_vendedorVendedorVisitaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorVisitaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorVendedorVisitaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorVendedorVisitaUpdate.setText("U");
		this.jButtonid_vendedorVendedorVisitaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorVendedorVisitaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorVisitaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorVisitaUpdate"));


		jButtonid_vendedorVendedorVisitaArbol= new JButtonMe();
		jButtonid_vendedorVendedorVisitaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorVisitaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorVisitaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorVendedorVisitaArbol.setText("Arbol");
		jButtonid_vendedorVendedorVisitaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorVendedorVisitaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorVendedorVisitaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorVendedorVisitaArbol"));



					
		this.jLabelid_anioVendedorVisita = new JLabelMe();
		this.jLabelid_anioVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioVendedorVisita.setToolTipText("Anio");
		this.jLabelid_anioVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelid_anioVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jComboBoxid_anioVendedorVisita= new JComboBoxMe();
		jComboBoxid_anioVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioVendedorVisita.setEnabled(false);

		this.jButtonid_anioVendedorVisita= new JButtonMe();
		this.jButtonid_anioVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioVendedorVisita.setText("Buscar");
		this.jButtonid_anioVendedorVisita.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioVendedorVisita.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioVendedorVisita,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioVendedorVisita"));

		this.jButtonid_anioVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonid_anioVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioVendedorVisitaBusqueda.setText("U");
		this.jButtonid_anioVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioVendedorVisitaBusqueda.setVisible(false);		}

		this.jButtonid_anioVendedorVisitaUpdate= new JButtonMe();
		this.jButtonid_anioVendedorVisitaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioVendedorVisitaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioVendedorVisitaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioVendedorVisitaUpdate.setText("U");
		this.jButtonid_anioVendedorVisitaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioVendedorVisitaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioVendedorVisitaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioVendedorVisitaUpdate"));



					
		this.jLabelid_mesVendedorVisita = new JLabelMe();
		this.jLabelid_mesVendedorVisita.setText(""+VendedorVisitaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesVendedorVisita.setToolTipText("Mes");
		this.jLabelid_mesVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesVendedorVisita=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesVendedorVisita.setToolTipText(VendedorVisitaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutVendedorVisita = new GridBagLayout();
		this.jPanelid_mesVendedorVisita.setLayout(this.gridaBagLayoutVendedorVisita);


		jComboBoxid_mesVendedorVisita= new JComboBoxMe();
		jComboBoxid_mesVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesVendedorVisita.setEnabled(false);

		this.jButtonid_mesVendedorVisita= new JButtonMe();
		this.jButtonid_mesVendedorVisita.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesVendedorVisita.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesVendedorVisita.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesVendedorVisita.setText("Buscar");
		this.jButtonid_mesVendedorVisita.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesVendedorVisita.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesVendedorVisita,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesVendedorVisita"));

		this.jButtonid_mesVendedorVisitaBusqueda= new JButtonMe();
		this.jButtonid_mesVendedorVisitaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesVendedorVisitaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesVendedorVisitaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesVendedorVisitaBusqueda.setText("U");
		this.jButtonid_mesVendedorVisitaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesVendedorVisitaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesVendedorVisitaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesVendedorVisitaBusqueda"));

		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesVendedorVisitaBusqueda.setVisible(false);		}

		this.jButtonid_mesVendedorVisitaUpdate= new JButtonMe();
		this.jButtonid_mesVendedorVisitaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesVendedorVisitaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesVendedorVisitaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesVendedorVisitaUpdate.setText("U");
		this.jButtonid_mesVendedorVisitaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesVendedorVisitaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesVendedorVisitaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesVendedorVisitaUpdate"));



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
		//this.jInternalFrameDetalleVendedorVisita = new VendedorVisitaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vendedor Visita DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVendedorVisita= new GridBagLayout();
		

		
		String sToolTipVendedorVisita="";
		sToolTipVendedorVisita=VendedorVisitaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVendedorVisita+="(Facturacion.VendedorVisita)";
		}
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVendedorVisita+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVendedorVisita = new JButtonMe();
		this.jButtonModificarVendedorVisita = new JButtonMe();
        this.jButtonActualizarVendedorVisita = new JButtonMe();
        this.jButtonEliminarVendedorVisita = new JButtonMe();
        this.jButtonCancelarVendedorVisita = new JButtonMe();
        this.jButtonGuardarCambiosVendedorVisita = new JButtonMe();
		this.jButtonGuardarCambiosTablaVendedorVisita = new JButtonMe();
		this.jButtonCerrarVendedorVisita = new JButtonMe();
		
		this.jScrollPanelDatosVendedorVisita = new JScrollPane();   
        this.jScrollPanelDatosEdicionVendedorVisita = new JScrollPane();
		this.jScrollPanelDatosGeneralVendedorVisita = new JScrollPane();
				
		
		
		this.jPanelCamposVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vendedor Visita";
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vendedor Visitas" + this.sPath));
		} else {
			this.jScrollPanelDatosVendedorVisita.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVendedorVisita.setName("jPanelCamposVendedorVisita"); 

		this.jPanelCamposOcultosVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVendedorVisita.setName("jPanelCamposOcultosVendedorVisita"); 

        this.jPanelAccionesVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVendedorVisita.setToolTipText("Acciones");
        this.jPanelAccionesVendedorVisita.setName("Acciones"); 

		this.jPanelAccionesFormularioVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVendedorVisita.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVendedorVisita.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVendedorVisita.setText("Nuevo");
		this.jButtonModificarVendedorVisita.setText("Editar");
        this.jButtonActualizarVendedorVisita.setText("Actualizar");
        this.jButtonEliminarVendedorVisita.setText("Eliminar");
        this.jButtonCancelarVendedorVisita.setText("Cancelar");
        this.jButtonGuardarCambiosVendedorVisita.setText("Guardar");
		this.jButtonGuardarCambiosTablaVendedorVisita.setText("Guardar");
		this.jButtonCerrarVendedorVisita.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVendedorVisita,"nuevo_button","Nuevo",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVendedorVisita,"modificar_button","Editar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVendedorVisita,"actualizar_button","Actualizar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVendedorVisita,"eliminar_button","Eliminar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVendedorVisita,"cancelar_button","Cancelar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVendedorVisita,"guardarcambios_button","Guardar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVendedorVisita,"guardarcambiostabla_button","Guardar",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVendedorVisita,"cerrar_button","Salir",this.vendedorvisitaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVendedorVisita.setToolTipText("Nuevo"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVendedorVisita.setToolTipText("Editar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVendedorVisita.setToolTipText("Actualizar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVendedorVisita.setToolTipText("Eliminar)"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVendedorVisita.setToolTipText("Cancelar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVendedorVisita.setToolTipText("Guardar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVendedorVisita.setToolTipText("Guardar"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVendedorVisita.setToolTipText("Salir"+" "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVendedorVisita";
		inputMap = this.jButtonNuevoVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVendedorVisita.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVendedorVisita"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVendedorVisita";
		inputMap = this.jButtonActualizarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVendedorVisita"));
		
		//ELIMINAR
		sMapKey = "EliminarVendedorVisita";
		inputMap = this.jButtonEliminarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVendedorVisita"));
		
		//CANCELAR	
		sMapKey = "CancelarVendedorVisita";
		inputMap = this.jButtonCancelarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVendedorVisita"));
		
		//CERRAR		
		sMapKey = "CerrarVendedorVisita";
		inputMap = this.jButtonCerrarVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVendedorVisita"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVendedorVisita";
		inputMap = this.jButtonGuardarCambiosTablaVendedorVisita.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVendedorVisita.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVendedorVisita"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVendedorVisita = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVendedorVisita.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVendedorVisita.setToolTipText("Nuevo VendedorVisita");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVendedorVisita = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVendedorVisita.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVendedorVisita.setToolTipText("Sin Cerrar Ventana VendedorVisita");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVendedorVisita = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVendedorVisita.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVendedorVisita.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVendedorVisita.setText("Accion");
		this.jComboBoxTiposAccionesVendedorVisita.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVendedorVisita = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVendedorVisita.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVendedorVisita.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVendedorVisita = new JLabelMe();
		
		this.jLabelAccionesVendedorVisita.setText("Acciones");		
		this.jLabelAccionesVendedorVisita.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorVisita.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVendedorVisita.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVendedorVisita();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVendedorVisita();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVendedorVisita=new JTabbedPane();
		this.jTabbedPaneRelacionesVendedorVisita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVendedorVisita,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVendedorVisita.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorVisita.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVendedorVisita.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVendedorVisita, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVendedorVisita.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVendedorVisita.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVendedorVisita.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVendedorVisita, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVendedorVisita = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVendedorVisita = new GridBagLayout();
		
		this.jPanelCamposVendedorVisita.setLayout(gridaBagLayoutCamposVendedorVisita);
		this.jPanelCamposOcultosVendedorVisita.setLayout(gridaBagLayoutCamposOcultosVendedorVisita);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVendedorVisita.add(jLabelIdVendedorVisita, this.gridBagConstraintsVendedorVisita);



	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVendedorVisita.add(jLabelidVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVendedorVisita.add(jLabelid_empresaVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVendedorVisita.add(jButtonid_empresaVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 3;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVendedorVisita.add(jButtonid_empresaVendedorVisitaUpdate, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVendedorVisita.add(jComboBoxid_empresaVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioVendedorVisita.add(jLabelid_ejercicioVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioVendedorVisita.add(jButtonid_ejercicioVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 3;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioVendedorVisita.add(jButtonid_ejercicioVendedorVisitaUpdate, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioVendedorVisita.add(jComboBoxid_ejercicioVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoVendedorVisita.add(jLabelid_periodoVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoVendedorVisita.add(jButtonid_periodoVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 3;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoVendedorVisita.add(jButtonid_periodoVendedorVisitaUpdate, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoVendedorVisita.add(jComboBoxid_periodoVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorVendedorVisita.add(jLabelid_vendedorVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 2;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorVendedorVisita.add(jButtonid_vendedorVendedorVisita, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 3;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorVendedorVisita.add(jButtonid_vendedorVendedorVisitaArbol, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 4;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVendedorVisita.add(jButtonid_vendedorVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 5;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorVendedorVisita.add(jButtonid_vendedorVendedorVisitaUpdate, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorVendedorVisita.add(jComboBoxid_vendedorVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvisita_realVendedorVisita.add(jLabelvisita_realVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelvisita_realVendedorVisita.add(jButtonvisita_realVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvisita_realVendedorVisita.add(jTextFieldvisita_realVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvisita_propuestaVendedorVisita.add(jLabelvisita_propuestaVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelvisita_propuestaVendedorVisita.add(jButtonvisita_propuestaVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvisita_propuestaVendedorVisita.add(jTextFieldvisita_propuestaVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioVendedorVisita.add(jLabelid_anioVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioVendedorVisita.add(jButtonid_anioVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 3;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioVendedorVisita.add(jButtonid_anioVendedorVisitaUpdate, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioVendedorVisita.add(jComboBoxid_anioVendedorVisita, this.gridBagConstraintsVendedorVisita);


	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 0;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesVendedorVisita.add(jLabelid_mesVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 2;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesVendedorVisita.add(jButtonid_mesVendedorVisitaBusqueda, this.gridBagConstraintsVendedorVisita);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		//this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = 3;
		this.gridBagConstraintsVendedorVisita.ipadx = 0;
		this.gridBagConstraintsVendedorVisita.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesVendedorVisita.add(jButtonid_mesVendedorVisitaUpdate, this.gridBagConstraintsVendedorVisita);
	}

	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVendedorVisita.gridy = 0;
	this.gridBagConstraintsVendedorVisita.gridx = 1;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesVendedorVisita.add(jComboBoxid_mesVendedorVisita, this.gridBagConstraintsVendedorVisita);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorVisita.add(this.jPanelidVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposVendedorVisita % 1==0) {
		iXPanelCamposVendedorVisita=0;
		iYPanelCamposVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorVisita.add(this.jPanelid_ejercicioVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposVendedorVisita % 1==0) {
		iXPanelCamposVendedorVisita=0;
		iYPanelCamposVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorVisita.add(this.jPanelid_periodoVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposVendedorVisita % 1==0) {
		iXPanelCamposVendedorVisita=0;
		iYPanelCamposVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorVisita.add(this.jPanelid_vendedorVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposVendedorVisita % 1==0) {
		iXPanelCamposVendedorVisita=0;
		iYPanelCamposVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorVisita.add(this.jPanelvisita_realVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposVendedorVisita % 1==0) {
		iXPanelCamposVendedorVisita=0;
		iYPanelCamposVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVendedorVisita.add(this.jPanelvisita_propuestaVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposVendedorVisita % 1==0) {
		iXPanelCamposVendedorVisita=0;
		iYPanelCamposVendedorVisita++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposOcultosVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposOcultosVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedorVisita.add(this.jPanelid_empresaVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposOcultosVendedorVisita % 1==0) {
		iXPanelCamposOcultosVendedorVisita=0;
		iYPanelCamposOcultosVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposOcultosVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposOcultosVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedorVisita.add(this.jPanelid_anioVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposOcultosVendedorVisita % 1==0) {
		iXPanelCamposOcultosVendedorVisita=0;
		iYPanelCamposOcultosVendedorVisita++;
	}
	this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVendedorVisita.gridy = iYPanelCamposOcultosVendedorVisita;
	this.gridBagConstraintsVendedorVisita.gridx = iXPanelCamposOcultosVendedorVisita++;
	this.gridBagConstraintsVendedorVisita.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVendedorVisita.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVendedorVisita.add(this.jPanelid_mesVendedorVisita, this.gridBagConstraintsVendedorVisita);



	if(iXPanelCamposOcultosVendedorVisita % 1==0) {
		iXPanelCamposOcultosVendedorVisita=0;
		iYPanelCamposOcultosVendedorVisita++;
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
			
		GridBagLayout gridaBagLayoutAccionesVendedorVisita= new GridBagLayout();
		this.jPanelAccionesVendedorVisita.setLayout(gridaBagLayoutAccionesVendedorVisita);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVendedorVisita= new GridBagLayout();
		this.jPanelAccionesFormularioVendedorVisita.setLayout(gridaBagLayoutAccionesFormularioVendedorVisita);
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVendedorVisita.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVendedorVisita.add(this.jComboBoxTiposAccionesFormularioVendedorVisita, this.gridBagConstraintsVendedorVisita);

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVendedorVisita.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVendedorVisita.add(this.jCheckBoxPostAccionNuevoVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVendedorVisita.add(this.jCheckBoxPostAccionSinCerrarVendedorVisita, this.gridBagConstraintsVendedorVisita);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVendedorVisita.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVendedorVisita.add(this.jCheckBoxPostAccionSinMensajeVendedorVisita, this.gridBagConstraintsVendedorVisita);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx = iPosXAccion++;
			
		this.jPanelAccionesVendedorVisita.add(this.jButtonModificarVendedorVisita, this.gridBagConstraintsVendedorVisita);							

		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVendedorVisita.gridy = 0;
		this.gridBagConstraintsVendedorVisita.gridx =iPosXAccion++;
			
		this.jPanelAccionesVendedorVisita.add(this.jButtonEliminarVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = 0;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXAccion++;
		
		this.jPanelAccionesVendedorVisita.add(this.jButtonActualizarVendedorVisita, this.gridBagConstraintsVendedorVisita);


		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = 0;		
		this.gridBagConstraintsVendedorVisita.gridx = iPosXAccion++;
		
		this.jPanelAccionesVendedorVisita.add(this.jButtonGuardarCambiosVendedorVisita, this.gridBagConstraintsVendedorVisita);	
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = 0;		
		this.gridBagConstraintsVendedorVisita.gridx =iPosXAccion++;
		
		this.jPanelAccionesVendedorVisita.add(this.jButtonCancelarVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVendedorVisita = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVendedorVisita);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();						
			this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVendedorVisita.gridx = 0;		
			//this.gridBagConstraintsVendedorVisita.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVendedorVisita.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVendedorVisita.gridx =0;
		this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVendedorVisita.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVendedorVisita, this.gridBagConstraintsVendedorVisita);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVendedorVisita = new VendedorVisitaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vendedor Visita DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vendedor Visita DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Visita Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VendedorVisitaModel vendedorvisitaModel=new VendedorVisitaModel(this);
			
			//SI USARA CLASE INTERNA
			//VendedorVisitaModel.VendedorVisitaFocusTraversalPolicy vendedorvisitaFocusTraversalPolicy = vendedorvisitaModel.new VendedorVisitaFocusTraversalPolicy(this);
			
			//vendedorvisitaFocusTraversalPolicy.setvendedorvisitaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vendedorvisitaModel);
			
			
			this.jContentPaneDetalleVendedorVisita = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVendedorVisita = new GridBagLayout();	
			this.jContentPaneDetalleVendedorVisita.setLayout(gridaBagLayoutDetalleVendedorVisita);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVendedorVisita = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
				this.gridBagConstraintsVendedorVisita.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVendedorVisita.gridx = 0;
					
				
				this.jContentPaneDetalleVendedorVisita.add(jTtoolBarDetalleVendedorVisita, gridBagConstraintsVendedorVisita);								
				
}
			
			this.jScrollPanelDatosEdicionVendedorVisita=   new JScrollPane(jContentPaneDetalleVendedorVisita,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVendedorVisita.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorVisita.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorVisita.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVendedorVisita=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVendedorVisita.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorVisita.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVendedorVisita.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVendedorVisita.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVendedorVisita.gridx = 0;
	        
			this.jContentPaneDetalleVendedorVisita.add(jPanelCamposVendedorVisita, gridBagConstraintsVendedorVisita);
			
			
			
			
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
						&& vendedorvisitaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVendedorVisita= new GridBagConstraints();
						this.gridBagConstraintsVendedorVisita.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVendedorVisita.gridx = 0;
						this.jContentPaneDetalleVendedorVisita.add(this.jTabbedPaneRelacionesVendedorVisita, this.gridBagConstraintsVendedorVisita);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVendedorVisita.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVendedorVisita.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
					this.gridBagConstraintsVendedorVisita.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVendedorVisita.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVendedorVisita.gridx = 0;
					
				
					this.jContentPaneDetalleVendedorVisita.add(jPanelCamposOcultosVendedorVisita, gridBagConstraintsVendedorVisita);
				
					this.jPanelCamposOcultosVendedorVisita.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVendedorVisita.gridx = 0;
	        this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVendedorVisita.add(this.jPanelAccionesFormularioVendedorVisita, this.gridBagConstraintsVendedorVisita);							
			
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
	        this.gridBagConstraintsVendedorVisita.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVendedorVisita.gridx = 0;
	        
			
			this.jContentPaneDetalleVendedorVisita.add(this.jPanelAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVendedorVisita);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVendedorVisita=   new JScrollPane(this.jPanelCamposVendedorVisita,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVendedorVisita.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorVisita.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVendedorVisita.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVendedorVisita.gridx = 0;
			this.gridBagConstraintsVendedorVisita.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVendedorVisita.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVendedorVisita.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVendedorVisita.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVendedorVisita, this.gridBagConstraintsVendedorVisita);			
			
			this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
			this.gridBagConstraintsVendedorVisita.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVendedorVisita.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVendedorVisita, this.gridBagConstraintsVendedorVisita);
			
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVendedorVisita, this.gridBagConstraintsVendedorVisita);
		
			
		this.gridBagConstraintsVendedorVisita = new GridBagConstraints();
		this.gridBagConstraintsVendedorVisita.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVendedorVisita.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVendedorVisita, this.gridBagConstraintsVendedorVisita);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVendedorVisita;//jContentPane;
		
		return jScrollPanelDatosEdicionVendedorVisita;
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
