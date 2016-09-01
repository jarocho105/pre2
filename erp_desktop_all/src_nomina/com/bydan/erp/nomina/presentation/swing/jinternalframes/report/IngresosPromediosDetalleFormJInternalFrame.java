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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.IngresosPromediosConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class IngresosPromediosDetalleFormJInternalFrame extends IngresosPromediosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleIngresosPromedios;
	
	protected JMenuBar jmenuBarDetalleIngresosPromedios;
	
	protected JMenu jmenuDetalleIngresosPromedios;
	protected JMenu jmenuDetalleArchivoIngresosPromedios;
	protected JMenu jmenuDetalleAccionesIngresosPromedios;
	protected JMenu jmenuDetalleDatosIngresosPromedios;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIngresosPromedios;	
	protected GridBagConstraints gridBagConstraintsIngresosPromedios;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected IngresosPromediosBeanSwingJInternalFrameAdditional jInternalFrameDetalleIngresosPromedios;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public IngresosPromediosSessionBean ingresospromediosSessionBean;
	
	
	
	
	public EstructuraSessionBean estructuraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public IngresosPromediosLogic ingresospromediosLogic;
	
	public JScrollPane jScrollPanelDatosIngresosPromedios;
	public JScrollPane jScrollPanelDatosEdicionIngresosPromedios;
	public JScrollPane jScrollPanelDatosGeneralIngresosPromedios;
	
	protected JPanel jPanelCamposIngresosPromedios;    
	protected JPanel jPanelCamposOcultosIngresosPromedios;    	
	protected JPanel jPanelAccionesIngresosPromedios;
	protected JPanel jPanelAccionesFormularioIngresosPromedios;
    
	
	
	protected Integer iXPanelCamposIngresosPromedios=0;
	protected Integer iYPanelCamposIngresosPromedios=0;
	
	protected Integer iXPanelCamposOcultosIngresosPromedios=0;
	protected Integer iYPanelCamposOcultosIngresosPromedios=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoIngresosPromedios;
	public JButton jButtonModificarIngresosPromedios;
	public JButton jButtonActualizarIngresosPromedios;
    public JButton jButtonEliminarIngresosPromedios;
	public JButton jButtonCancelarIngresosPromedios;
    public JButton jButtonGuardarCambiosIngresosPromedios;
	public JButton jButtonGuardarCambiosTablaIngresosPromedios;
	protected JButton jButtonCerrarIngresosPromedios;
	
	
	protected JButton jButtonProcesarInformacionIngresosPromedios;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoIngresosPromedios;
	protected JCheckBox jCheckBoxPostAccionSinCerrarIngresosPromedios;
	protected JCheckBox jCheckBoxPostAccionSinMensajeIngresosPromedios;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIngresosPromedios;
	protected JButton jButtonModificarToolBarIngresosPromedios;
	protected JButton jButtonActualizarToolBarIngresosPromedios;
    protected JButton jButtonEliminarToolBarIngresosPromedios;
	protected JButton jButtonCancelarToolBarIngresosPromedios;
    protected JButton jButtonGuardarCambiosToolBarIngresosPromedios;
	protected JButton jButtonGuardarCambiosTablaToolBarIngresosPromedios;
	protected JButton jButtonMostrarOcultarTablaToolBarIngresosPromedios;
	protected JButton jButtonCerrarToolBarIngresosPromedios;
	
	protected JButton jButtonProcesarInformacionToolBarIngresosPromedios;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIngresosPromedios;
	protected JMenuItem jMenuItemModificarIngresosPromedios;
	protected JMenuItem jMenuItemActualizarIngresosPromedios;
    protected JMenuItem jMenuItemEliminarIngresosPromedios;
	protected JMenuItem jMenuItemCancelarIngresosPromedios;
    protected JMenuItem jMenuItemGuardarCambiosIngresosPromedios;
	protected JMenuItem jMenuItemGuardarCambiosTablaIngresosPromedios;
	protected JMenuItem jMenuItemCerrarIngresosPromedios;
	protected JMenuItem jMenuItemDetalleCerrarIngresosPromedios;
	protected JMenuItem jMenuItemDetalleMostarOcultarIngresosPromedios;
	
	protected JMenuItem jMenuItemProcesarInformacionIngresosPromedios;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIngresosPromedios;
	protected JMenuItem jMenuItemMostrarOcultarIngresosPromedios;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIngresosPromedios;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIngresosPromedios;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIngresosPromedios;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioIngresosPromedios;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidIngresosPromedios;
	public JLabel jLabelIdIngresosPromedios;
	public JLabel jLabelidIngresosPromedios;
	public JButton jButtonidIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelcodigoIngresosPromedios;
	public JLabel jLabelcodigoIngresosPromedios;
	public JTextField jTextFieldcodigoIngresosPromedios;
	public JButton jButtoncodigoIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cargoIngresosPromedios;
	public JLabel jLabelcodigo_cargoIngresosPromedios;
	public JTextField jTextFieldcodigo_cargoIngresosPromedios;
	public JButton jButtoncodigo_cargoIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_datoIngresosPromedios;
	public JLabel jLabelcodigo_datoIngresosPromedios;
	public JTextField jTextFieldcodigo_datoIngresosPromedios;
	public JButton jButtoncodigo_datoIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelnombreIngresosPromedios;
	public JLabel jLabelnombreIngresosPromedios;
	public JTextArea jTextAreanombreIngresosPromedios;
	public JScrollPane jscrollPanenombreIngresosPromedios;
	public JButton jButtonnombreIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_pagoIngresosPromedios;
	public JLabel jLabelvalor_pagoIngresosPromedios;
	public JTextField jTextFieldvalor_pagoIngresosPromedios;
	public JButton jButtonvalor_pagoIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_rubro_empleaIngresosPromedios;
	public JLabel jLabelnombre_rubro_empleaIngresosPromedios;
	public JTextArea jTextAreanombre_rubro_empleaIngresosPromedios;
	public JScrollPane jscrollPanenombre_rubro_empleaIngresosPromedios;
	public JButton jButtonnombre_rubro_empleaIngresosPromediosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_estructuraIngresosPromedios;
	public JLabel jLabelid_estructuraIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraIngresosPromedios;
	public JButton jButtonid_estructuraIngresosPromedios= new JButtonMe();
	public JButton jButtonid_estructuraIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_estructuraIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaIngresosPromedios;
	public JLabel jLabelid_empresaIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaIngresosPromedios;
	public JButton jButtonid_empresaIngresosPromedios= new JButtonMe();
	public JButton jButtonid_empresaIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_empresaIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelid_anioIngresosPromedios;
	public JLabel jLabelid_anioIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioIngresosPromedios;
	public JButton jButtonid_anioIngresosPromedios= new JButtonMe();
	public JButton jButtonid_anioIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_anioIngresosPromediosBusqueda= new JButtonMe();

	public JPanel jPanelid_mesIngresosPromedios;
	public JLabel jLabelid_mesIngresosPromedios;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesIngresosPromedios;
	public JButton jButtonid_mesIngresosPromedios= new JButtonMe();
	public JButton jButtonid_mesIngresosPromediosUpdate= new JButtonMe();
	public JButton jButtonid_mesIngresosPromediosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesIngresosPromedios;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
	public int iHeightFormulario=990;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public IngresosPromediosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposIngresosPromedios=new JPanel();
				this.jPanelAccionesFormularioIngresosPromedios=new JPanel();
				this.jmenuBarDetalleIngresosPromedios=new JMenuBar();
				this.jTtoolBarDetalleIngresosPromedios=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public IngresosPromediosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosPromediosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("IngresosPromedios No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarIngresosPromedios() {
		return this.jButtonActualizarToolBarIngresosPromedios;
	}
	
	public JButton getjButtonEliminarToolBarIngresosPromedios() {
		return this.jButtonEliminarToolBarIngresosPromedios;
	}
	
	public JButton getjButtonCancelarToolBarIngresosPromedios() {
		return this.jButtonCancelarToolBarIngresosPromedios;
	}		
	
	public JButton getjButtonProcesarInformacionIngresosPromedios() {
		return this.jButtonProcesarInformacionIngresosPromedios;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIngresosPromedios)	{
		this.jButtonProcesarInformacionIngresosPromedios = jButtonProcesarInformacionIngresosPromedios;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIngresosPromedios() {
		return this.jComboBoxTiposAccionesIngresosPromedios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIngresosPromedios(
			JComboBox jComboBoxTiposRelacionesIngresosPromedios) {
		this.jComboBoxTiposRelacionesIngresosPromedios = jComboBoxTiposRelacionesIngresosPromedios;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIngresosPromedios(
			JComboBox jComboBoxTiposAccionesIngresosPromedios) {
		this.jComboBoxTiposAccionesIngresosPromedios = jComboBoxTiposAccionesIngresosPromedios;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIngresosPromedios() {
		return this.jComboBoxTiposAccionesFormularioIngresosPromedios;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIngresosPromedios(
			JComboBox jComboBoxTiposAccionesFormularioIngresosPromedios) {
		this.jComboBoxTiposAccionesFormularioIngresosPromedios = jComboBoxTiposAccionesFormularioIngresosPromedios;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
		
		this.ingresospromediosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingresospromediosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ingresospromediosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IngresosPromediosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IngresosPromediosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IngresosPromediosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ingresos Promedios MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
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
	
		IngresosPromediosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleIngresosPromedios= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarIngresosPromedios=new JButtonMe();
				this.jButtonModificarToolBarIngresosPromedios=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarIngresosPromedios,this.jTtoolBarDetalleIngresosPromedios,
							"actualizar","actualizar","Actualizar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarIngresosPromedios,this.jTtoolBarDetalleIngresosPromedios,
							"eliminar","eliminar","Eliminar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarIngresosPromedios,this.jTtoolBarDetalleIngresosPromedios,
							"cancelar","cancelar","Cancelar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarIngresosPromedios=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarIngresosPromedios,this.jTtoolBarDetalleIngresosPromedios,
							"guardarcambios","guardarcambios","Guardar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleIngresosPromedios=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleIngresosPromedios=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoIngresosPromedios=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesIngresosPromedios=new JMenuMe("Acciones");
		this.jmenuDetalleDatosIngresosPromedios=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIngresosPromedios= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIngresosPromedios.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIngresosPromedios,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarIngresosPromedios= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarIngresosPromedios.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarIngresosPromedios,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarIngresosPromedios= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarIngresosPromedios.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarIngresosPromedios,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarIngresosPromedios= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarIngresosPromedios.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarIngresosPromedios,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarIngresosPromedios= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarIngresosPromedios.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarIngresosPromedios,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosIngresosPromedios= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIngresosPromedios.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIngresosPromedios,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIngresosPromedios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIngresosPromedios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIngresosPromedios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarIngresosPromedios= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarIngresosPromedios.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarIngresosPromedios,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIngresosPromedios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIngresosPromedios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIngresosPromedios,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIngresosPromedios= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIngresosPromedios.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIngresosPromedios,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoIngresosPromedios.add(this.jMenuItemDetalleCerrarIngresosPromedios);
		
		this.jmenuDetalleAccionesIngresosPromedios.add(this.jMenuItemActualizarIngresosPromedios);
		this.jmenuDetalleAccionesIngresosPromedios.add(this.jMenuItemEliminarIngresosPromedios);
		this.jmenuDetalleAccionesIngresosPromedios.add(this.jMenuItemCancelarIngresosPromedios);		
		
		//this.jmenuDetalleDatosIngresosPromedios.add(this.jMenuItemDetalleAbrirOrderByIngresosPromedios);				
		this.jmenuDetalleDatosIngresosPromedios.add(this.jMenuItemDetalleMostarOcultarIngresosPromedios);				
				
		//this.jmenuDetalleAccionesIngresosPromedios.add(this.jMenuItemGuardarCambiosIngresosPromedios);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleIngresosPromedios.add(this.jmenuDetalleArchivoIngresosPromedios);		
		this.jmenuBarDetalleIngresosPromedios.add(this.jmenuDetalleAccionesIngresosPromedios);		
		this.jmenuBarDetalleIngresosPromedios.add(this.jmenuDetalleDatosIngresosPromedios);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleIngresosPromedios);				
	}
	
	
	public void inicializarElementosCamposIngresosPromedios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdIngresosPromedios = new JLabelMe();
		jLabelIdIngresosPromedios.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidIngresosPromedios = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutIngresosPromedios= new GridBagLayout();

		this.jPanelidIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);

		jLabelidIngresosPromedios = new JLabel();
		jLabelidIngresosPromedios.setText("Id");

		jLabelidIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoIngresosPromedios = new JLabelMe();
		this.jLabelcodigoIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoIngresosPromedios.setToolTipText("Codigo");
		this.jLabelcodigoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelcodigoIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jTextFieldcodigoIngresosPromedios= new JTextFieldMe();

		jTextFieldcodigoIngresosPromedios.setEnabled(false);
		jTextFieldcodigoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoIngresosPromediosBusqueda= new JButtonMe();
		this.jButtoncodigoIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoIngresosPromediosBusqueda.setText("U");
		this.jButtoncodigoIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoIngresosPromediosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cargoIngresosPromedios = new JLabelMe();
		this.jLabelcodigo_cargoIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO+" : *");
		this.jLabelcodigo_cargoIngresosPromedios.setToolTipText("Codigo Cargo");
		this.jLabelcodigo_cargoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cargoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cargoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cargoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cargoIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cargoIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelcodigo_cargoIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jTextFieldcodigo_cargoIngresosPromedios= new JTextFieldMe();

		jTextFieldcodigo_cargoIngresosPromedios.setEnabled(false);
		jTextFieldcodigo_cargoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cargoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cargoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cargoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cargoIngresosPromediosBusqueda= new JButtonMe();
		this.jButtoncodigo_cargoIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cargoIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cargoIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cargoIngresosPromediosBusqueda.setText("U");
		this.jButtoncodigo_cargoIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cargoIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cargoIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cargoIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cargoIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cargoIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cargoIngresosPromediosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_datoIngresosPromedios = new JLabelMe();
		this.jLabelcodigo_datoIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_CODIGODATO+" : *");
		this.jLabelcodigo_datoIngresosPromedios.setToolTipText("Codigo Dato");
		this.jLabelcodigo_datoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_datoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_datoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_datoIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_datoIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelcodigo_datoIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jTextFieldcodigo_datoIngresosPromedios= new JTextFieldMe();

		jTextFieldcodigo_datoIngresosPromedios.setEnabled(false);
		jTextFieldcodigo_datoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_datoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_datoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_datoIngresosPromediosBusqueda= new JButtonMe();
		this.jButtoncodigo_datoIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_datoIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_datoIngresosPromediosBusqueda.setText("U");
		this.jButtoncodigo_datoIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_datoIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_datoIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_datoIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_datoIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_datoIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_datoIngresosPromediosBusqueda.setVisible(false);		}


					
		this.jLabelnombreIngresosPromedios = new JLabelMe();
		this.jLabelnombreIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreIngresosPromedios.setToolTipText("Nombre");
		this.jLabelnombreIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelnombreIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jTextAreanombreIngresosPromedios= new JTextAreaMe();
		jTextAreanombreIngresosPromedios.setEnabled(false);
		jTextAreanombreIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreIngresosPromedios.setLineWrap(true);
		jTextAreanombreIngresosPromedios.setWrapStyleWord(true);
		jTextAreanombreIngresosPromedios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreIngresosPromedios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreIngresosPromedios = new JScrollPane(jTextAreanombreIngresosPromedios);
		jscrollPanenombreIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonnombreIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreIngresosPromediosBusqueda.setText("U");
		this.jButtonnombreIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreIngresosPromediosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_pagoIngresosPromedios = new JLabelMe();
		this.jLabelvalor_pagoIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_VALORPAGO+" : *");
		this.jLabelvalor_pagoIngresosPromedios.setToolTipText("Valor Pago");
		this.jLabelvalor_pagoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_pagoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_pagoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_pagoIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_pagoIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelvalor_pagoIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jTextFieldvalor_pagoIngresosPromedios= new JTextFieldMe();
		jTextFieldvalor_pagoIngresosPromedios.setEnabled(false);
		jTextFieldvalor_pagoIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_pagoIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_pagoIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_pagoIngresosPromedios.setText("0.0");

		this.jButtonvalor_pagoIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonvalor_pagoIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_pagoIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_pagoIngresosPromediosBusqueda.setText("U");
		this.jButtonvalor_pagoIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_pagoIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_pagoIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_pagoIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_pagoIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_pagoIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_pagoIngresosPromediosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_rubro_empleaIngresosPromedios = new JLabelMe();
		this.jLabelnombre_rubro_empleaIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA+" : *");
		this.jLabelnombre_rubro_empleaIngresosPromedios.setToolTipText("Nombre Rubro Emplea");
		this.jLabelnombre_rubro_empleaIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_rubro_empleaIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_rubro_empleaIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_rubro_empleaIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_rubro_empleaIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_rubro_empleaIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelnombre_rubro_empleaIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jTextAreanombre_rubro_empleaIngresosPromedios= new JTextAreaMe();
		jTextAreanombre_rubro_empleaIngresosPromedios.setEnabled(false);
		jTextAreanombre_rubro_empleaIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rubro_empleaIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rubro_empleaIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_rubro_empleaIngresosPromedios.setLineWrap(true);
		jTextAreanombre_rubro_empleaIngresosPromedios.setWrapStyleWord(true);
		jTextAreanombre_rubro_empleaIngresosPromedios.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_rubro_empleaIngresosPromedios.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_rubro_empleaIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_rubro_empleaIngresosPromedios = new JScrollPane(jTextAreanombre_rubro_empleaIngresosPromedios);
		jscrollPanenombre_rubro_empleaIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rubro_empleaIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_rubro_empleaIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setText("U");
		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_rubro_empleaIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_rubro_empleaIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_rubro_empleaIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysIngresosPromedios() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_estructuraIngresosPromedios = new JLabelMe();
		this.jLabelid_estructuraIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraIngresosPromedios.setToolTipText("Estructura");
		this.jLabelid_estructuraIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelid_estructuraIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jComboBoxid_estructuraIngresosPromedios= new JComboBoxMe();
		jComboBoxid_estructuraIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraIngresosPromedios= new JButtonMe();
		this.jButtonid_estructuraIngresosPromedios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraIngresosPromedios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraIngresosPromedios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraIngresosPromedios.setText("Buscar");
		this.jButtonid_estructuraIngresosPromedios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraIngresosPromedios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraIngresosPromedios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraIngresosPromedios"));

		this.jButtonid_estructuraIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonid_estructuraIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraIngresosPromediosBusqueda.setText("U");
		this.jButtonid_estructuraIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraIngresosPromediosBusqueda.setVisible(false);		}

		this.jButtonid_estructuraIngresosPromediosUpdate= new JButtonMe();
		this.jButtonid_estructuraIngresosPromediosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraIngresosPromediosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraIngresosPromediosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraIngresosPromediosUpdate.setText("U");
		this.jButtonid_estructuraIngresosPromediosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraIngresosPromediosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraIngresosPromediosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraIngresosPromediosUpdate"));



					
		this.jLabelid_empresaIngresosPromedios = new JLabelMe();
		this.jLabelid_empresaIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaIngresosPromedios.setToolTipText("Empresa");
		this.jLabelid_empresaIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelid_empresaIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jComboBoxid_empresaIngresosPromedios= new JComboBoxMe();
		jComboBoxid_empresaIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaIngresosPromedios.setEnabled(false);

		this.jButtonid_empresaIngresosPromedios= new JButtonMe();
		this.jButtonid_empresaIngresosPromedios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIngresosPromedios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIngresosPromedios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIngresosPromedios.setText("Buscar");
		this.jButtonid_empresaIngresosPromedios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaIngresosPromedios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIngresosPromedios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIngresosPromedios"));

		this.jButtonid_empresaIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonid_empresaIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaIngresosPromediosBusqueda.setText("U");
		this.jButtonid_empresaIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaIngresosPromediosBusqueda.setVisible(false);		}

		this.jButtonid_empresaIngresosPromediosUpdate= new JButtonMe();
		this.jButtonid_empresaIngresosPromediosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngresosPromediosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngresosPromediosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaIngresosPromediosUpdate.setText("U");
		this.jButtonid_empresaIngresosPromediosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaIngresosPromediosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIngresosPromediosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIngresosPromediosUpdate"));



					
		this.jLabelid_anioIngresosPromedios = new JLabelMe();
		this.jLabelid_anioIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioIngresosPromedios.setToolTipText("Anio");
		this.jLabelid_anioIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelid_anioIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jComboBoxid_anioIngresosPromedios= new JComboBoxMe();
		jComboBoxid_anioIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_anioIngresosPromedios= new JButtonMe();
		this.jButtonid_anioIngresosPromedios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioIngresosPromedios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioIngresosPromedios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioIngresosPromedios.setText("Buscar");
		this.jButtonid_anioIngresosPromedios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioIngresosPromedios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioIngresosPromedios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioIngresosPromedios"));

		this.jButtonid_anioIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonid_anioIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioIngresosPromediosBusqueda.setText("U");
		this.jButtonid_anioIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioIngresosPromediosBusqueda.setVisible(false);		}

		this.jButtonid_anioIngresosPromediosUpdate= new JButtonMe();
		this.jButtonid_anioIngresosPromediosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioIngresosPromediosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioIngresosPromediosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioIngresosPromediosUpdate.setText("U");
		this.jButtonid_anioIngresosPromediosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioIngresosPromediosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioIngresosPromediosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioIngresosPromediosUpdate"));



					
		this.jLabelid_mesIngresosPromedios = new JLabelMe();
		this.jLabelid_mesIngresosPromedios.setText(""+IngresosPromediosConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesIngresosPromedios.setToolTipText("Mes");
		this.jLabelid_mesIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesIngresosPromedios=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesIngresosPromedios.setToolTipText(IngresosPromediosConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutIngresosPromedios = new GridBagLayout();
		this.jPanelid_mesIngresosPromedios.setLayout(this.gridaBagLayoutIngresosPromedios);


		jComboBoxid_mesIngresosPromedios= new JComboBoxMe();
		jComboBoxid_mesIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesIngresosPromedios= new JButtonMe();
		this.jButtonid_mesIngresosPromedios.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesIngresosPromedios.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesIngresosPromedios.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesIngresosPromedios.setText("Buscar");
		this.jButtonid_mesIngresosPromedios.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesIngresosPromedios.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesIngresosPromedios,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesIngresosPromedios"));

		this.jButtonid_mesIngresosPromediosBusqueda= new JButtonMe();
		this.jButtonid_mesIngresosPromediosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesIngresosPromediosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesIngresosPromediosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesIngresosPromediosBusqueda.setText("U");
		this.jButtonid_mesIngresosPromediosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesIngresosPromediosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesIngresosPromediosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesIngresosPromediosBusqueda"));

		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesIngresosPromediosBusqueda.setVisible(false);		}

		this.jButtonid_mesIngresosPromediosUpdate= new JButtonMe();
		this.jButtonid_mesIngresosPromediosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesIngresosPromediosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesIngresosPromediosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesIngresosPromediosUpdate.setText("U");
		this.jButtonid_mesIngresosPromediosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesIngresosPromediosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesIngresosPromediosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesIngresosPromediosUpdate"));



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
		//this.jInternalFrameDetalleIngresosPromedios = new IngresosPromediosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ingresos Promedios DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIngresosPromedios= new GridBagLayout();
		

		
		String sToolTipIngresosPromedios="";
		sToolTipIngresosPromedios=IngresosPromediosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIngresosPromedios+="(Nomina.IngresosPromedios)";
		}
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			sToolTipIngresosPromedios+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoIngresosPromedios = new JButtonMe();
		this.jButtonModificarIngresosPromedios = new JButtonMe();
        this.jButtonActualizarIngresosPromedios = new JButtonMe();
        this.jButtonEliminarIngresosPromedios = new JButtonMe();
        this.jButtonCancelarIngresosPromedios = new JButtonMe();
        this.jButtonGuardarCambiosIngresosPromedios = new JButtonMe();
		this.jButtonGuardarCambiosTablaIngresosPromedios = new JButtonMe();
		this.jButtonCerrarIngresosPromedios = new JButtonMe();
		
		this.jScrollPanelDatosIngresosPromedios = new JScrollPane();   
        this.jScrollPanelDatosEdicionIngresosPromedios = new JScrollPane();
		this.jScrollPanelDatosGeneralIngresosPromedios = new JScrollPane();
				
		
		
		this.jPanelCamposIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ingresos Promedios";
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Promedioses" + this.sPath));
		} else {
			this.jScrollPanelDatosIngresosPromedios.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposIngresosPromedios.setName("jPanelCamposIngresosPromedios"); 

		this.jPanelCamposOcultosIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosIngresosPromedios.setName("jPanelCamposOcultosIngresosPromedios"); 

        this.jPanelAccionesIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIngresosPromedios.setToolTipText("Acciones");
        this.jPanelAccionesIngresosPromedios.setName("Acciones"); 

		this.jPanelAccionesFormularioIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioIngresosPromedios.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIngresosPromedios.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoIngresosPromedios.setText("Nuevo");
		this.jButtonModificarIngresosPromedios.setText("Editar");
        this.jButtonActualizarIngresosPromedios.setText("Actualizar");
        this.jButtonEliminarIngresosPromedios.setText("Eliminar");
        this.jButtonCancelarIngresosPromedios.setText("Cancelar");
        this.jButtonGuardarCambiosIngresosPromedios.setText("Guardar");
		this.jButtonGuardarCambiosTablaIngresosPromedios.setText("Guardar");
		this.jButtonCerrarIngresosPromedios.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIngresosPromedios,"nuevo_button","Nuevo",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarIngresosPromedios,"modificar_button","Editar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarIngresosPromedios,"actualizar_button","Actualizar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarIngresosPromedios,"eliminar_button","Eliminar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarIngresosPromedios,"cancelar_button","Cancelar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosIngresosPromedios,"guardarcambios_button","Guardar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIngresosPromedios,"guardarcambiostabla_button","Guardar",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIngresosPromedios,"cerrar_button","Salir",this.ingresospromediosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoIngresosPromedios.setToolTipText("Nuevo"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarIngresosPromedios.setToolTipText("Editar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarIngresosPromedios.setToolTipText("Actualizar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarIngresosPromedios.setToolTipText("Eliminar)"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarIngresosPromedios.setToolTipText("Cancelar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosIngresosPromedios.setToolTipText("Guardar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaIngresosPromedios.setToolTipText("Guardar"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIngresosPromedios.setToolTipText("Salir"+" "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIngresosPromedios";
		inputMap = this.jButtonNuevoIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIngresosPromedios.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIngresosPromedios"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarIngresosPromedios";
		inputMap = this.jButtonActualizarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarIngresosPromedios"));
		
		//ELIMINAR
		sMapKey = "EliminarIngresosPromedios";
		inputMap = this.jButtonEliminarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarIngresosPromedios"));
		
		//CANCELAR	
		sMapKey = "CancelarIngresosPromedios";
		inputMap = this.jButtonCancelarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarIngresosPromedios"));
		
		//CERRAR		
		sMapKey = "CerrarIngresosPromedios";
		inputMap = this.jButtonCerrarIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIngresosPromedios"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIngresosPromedios";
		inputMap = this.jButtonGuardarCambiosTablaIngresosPromedios.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIngresosPromedios"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoIngresosPromedios = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoIngresosPromedios.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoIngresosPromedios.setToolTipText("Nuevo IngresosPromedios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarIngresosPromedios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarIngresosPromedios.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarIngresosPromedios.setToolTipText("Sin Cerrar Ventana IngresosPromedios");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeIngresosPromedios = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeIngresosPromedios.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeIngresosPromedios.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIngresosPromedios.setText("Accion");
		this.jComboBoxTiposAccionesIngresosPromedios.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioIngresosPromedios = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIngresosPromedios.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioIngresosPromedios.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesIngresosPromedios = new JLabelMe();
		
		this.jLabelAccionesIngresosPromedios.setText("Acciones");		
		this.jLabelAccionesIngresosPromedios.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosPromedios.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosPromedios.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposIngresosPromedios();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysIngresosPromedios();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesIngresosPromedios=new JTabbedPane();
		this.jTabbedPaneRelacionesIngresosPromedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesIngresosPromedios,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesIngresosPromedios.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosPromedios.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosPromedios.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIngresosPromedios, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioIngresosPromedios.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIngresosPromedios.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIngresosPromedios.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIngresosPromedios, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposIngresosPromedios = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosIngresosPromedios = new GridBagLayout();
		
		this.jPanelCamposIngresosPromedios.setLayout(gridaBagLayoutCamposIngresosPromedios);
		this.jPanelCamposOcultosIngresosPromedios.setLayout(gridaBagLayoutCamposOcultosIngresosPromedios);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidIngresosPromedios.add(jLabelIdIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidIngresosPromedios.add(jLabelidIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraIngresosPromedios.add(jLabelid_estructuraIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraIngresosPromedios.add(jButtonid_estructuraIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 3;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraIngresosPromedios.add(jButtonid_estructuraIngresosPromediosUpdate, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraIngresosPromedios.add(jComboBoxid_estructuraIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoIngresosPromedios.add(jLabelcodigoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoIngresosPromedios.add(jButtoncodigoIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoIngresosPromedios.add(jTextFieldcodigoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaIngresosPromedios.add(jLabelid_empresaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaIngresosPromedios.add(jButtonid_empresaIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 3;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaIngresosPromedios.add(jButtonid_empresaIngresosPromediosUpdate, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaIngresosPromedios.add(jComboBoxid_empresaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioIngresosPromedios.add(jLabelid_anioIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioIngresosPromedios.add(jButtonid_anioIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 3;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioIngresosPromedios.add(jButtonid_anioIngresosPromediosUpdate, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioIngresosPromedios.add(jComboBoxid_anioIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesIngresosPromedios.add(jLabelid_mesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesIngresosPromedios.add(jButtonid_mesIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 3;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesIngresosPromedios.add(jButtonid_mesIngresosPromediosUpdate, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesIngresosPromedios.add(jComboBoxid_mesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cargoIngresosPromedios.add(jLabelcodigo_cargoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cargoIngresosPromedios.add(jButtoncodigo_cargoIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cargoIngresosPromedios.add(jTextFieldcodigo_cargoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_datoIngresosPromedios.add(jLabelcodigo_datoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_datoIngresosPromedios.add(jButtoncodigo_datoIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_datoIngresosPromedios.add(jTextFieldcodigo_datoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreIngresosPromedios.add(jLabelnombreIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreIngresosPromedios.add(jButtonnombreIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreIngresosPromedios.add(jscrollPanenombreIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_pagoIngresosPromedios.add(jLabelvalor_pagoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_pagoIngresosPromedios.add(jButtonvalor_pagoIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_pagoIngresosPromedios.add(jTextFieldvalor_pagoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 0;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_rubro_empleaIngresosPromedios.add(jLabelnombre_rubro_empleaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		//this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = 2;
		this.gridBagConstraintsIngresosPromedios.ipadx = 0;
		this.gridBagConstraintsIngresosPromedios.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_rubro_empleaIngresosPromedios.add(jButtonnombre_rubro_empleaIngresosPromediosBusqueda, this.gridBagConstraintsIngresosPromedios);
	}

	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosPromedios.gridy = 0;
	this.gridBagConstraintsIngresosPromedios.gridx = 1;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_rubro_empleaIngresosPromedios.add(jscrollPanenombre_rubro_empleaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelidIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelid_estructuraIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelcodigoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelid_anioIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelid_mesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelcodigo_cargoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelcodigo_datoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelnombreIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelvalor_pagoIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosPromedios.add(this.jPanelnombre_rubro_empleaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposIngresosPromedios % 1==0) {
		iXPanelCamposIngresosPromedios=0;
		iYPanelCamposIngresosPromedios++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosPromedios.gridy = iYPanelCamposOcultosIngresosPromedios;
	this.gridBagConstraintsIngresosPromedios.gridx = iXPanelCamposOcultosIngresosPromedios++;
	this.gridBagConstraintsIngresosPromedios.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosPromedios.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosIngresosPromedios.add(this.jPanelid_empresaIngresosPromedios, this.gridBagConstraintsIngresosPromedios);



	if(iXPanelCamposOcultosIngresosPromedios % 1==0) {
		iXPanelCamposOcultosIngresosPromedios=0;
		iYPanelCamposOcultosIngresosPromedios++;
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
			
		GridBagLayout gridaBagLayoutAccionesIngresosPromedios= new GridBagLayout();
		this.jPanelAccionesIngresosPromedios.setLayout(gridaBagLayoutAccionesIngresosPromedios);
		
		GridBagLayout gridaBagLayoutAccionesFormularioIngresosPromedios= new GridBagLayout();
		this.jPanelAccionesFormularioIngresosPromedios.setLayout(gridaBagLayoutAccionesFormularioIngresosPromedios);
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIngresosPromedios.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIngresosPromedios.add(this.jComboBoxTiposAccionesFormularioIngresosPromedios, this.gridBagConstraintsIngresosPromedios);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccion++;
			
		this.jPanelAccionesIngresosPromedios.add(this.jButtonModificarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);							

		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosPromedios.gridy = 0;
		this.gridBagConstraintsIngresosPromedios.gridx =iPosXAccion++;
			
		this.jPanelAccionesIngresosPromedios.add(this.jButtonEliminarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = 0;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccion++;
		
		this.jPanelAccionesIngresosPromedios.add(this.jButtonActualizarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);


		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = 0;		
		this.gridBagConstraintsIngresosPromedios.gridx = iPosXAccion++;
		
		this.jPanelAccionesIngresosPromedios.add(this.jButtonGuardarCambiosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);	
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = 0;		
		this.gridBagConstraintsIngresosPromedios.gridx =iPosXAccion++;
		
		this.jPanelAccionesIngresosPromedios.add(this.jButtonCancelarIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIngresosPromedios = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIngresosPromedios);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();						
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngresosPromedios.gridx = 0;		
			//this.gridBagConstraintsIngresosPromedios.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIngresosPromedios.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIngresosPromedios.gridx =0;
		this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIngresosPromedios.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleIngresosPromedios = new IngresosPromediosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ingresos Promedios DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ingresos Promedios DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ingresos Promedios Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			IngresosPromediosModel ingresospromediosModel=new IngresosPromediosModel(this);
			
			//SI USARA CLASE INTERNA
			//IngresosPromediosModel.IngresosPromediosFocusTraversalPolicy ingresospromediosFocusTraversalPolicy = ingresospromediosModel.new IngresosPromediosFocusTraversalPolicy(this);
			
			//ingresospromediosFocusTraversalPolicy.setingresospromediosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ingresospromediosModel);
			
			
			this.jContentPaneDetalleIngresosPromedios = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleIngresosPromedios = new GridBagLayout();	
			this.jContentPaneDetalleIngresosPromedios.setLayout(gridaBagLayoutDetalleIngresosPromedios);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIngresosPromedios = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
				this.gridBagConstraintsIngresosPromedios.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsIngresosPromedios.gridx = 0;
					
				
				this.jContentPaneDetalleIngresosPromedios.add(jTtoolBarDetalleIngresosPromedios, gridBagConstraintsIngresosPromedios);								
				
}
			
			this.jScrollPanelDatosEdicionIngresosPromedios=   new JScrollPane(jContentPaneDetalleIngresosPromedios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIngresosPromedios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosPromedios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosPromedios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralIngresosPromedios=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIngresosPromedios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosPromedios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosPromedios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			
			
	        this.gridBagConstraintsIngresosPromedios.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsIngresosPromedios.gridx = 0;
	        
			this.jContentPaneDetalleIngresosPromedios.add(jPanelCamposIngresosPromedios, gridBagConstraintsIngresosPromedios);
			
			
			
			
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
						//&& ingresospromediosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsIngresosPromedios= new GridBagConstraints();
						this.gridBagConstraintsIngresosPromedios.gridy = iGridyRelaciones++;
						this.gridBagConstraintsIngresosPromedios.gridx = 0;
						this.jContentPaneDetalleIngresosPromedios.add(this.jTabbedPaneRelacionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesIngresosPromedios.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosIngresosPromedios.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
					this.gridBagConstraintsIngresosPromedios.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsIngresosPromedios.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsIngresosPromedios.gridx = 0;
					
				
					this.jContentPaneDetalleIngresosPromedios.add(jPanelCamposOcultosIngresosPromedios, gridBagConstraintsIngresosPromedios);
				
					this.jPanelCamposOcultosIngresosPromedios.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsIngresosPromedios.gridx = 0;
	        this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleIngresosPromedios.add(this.jPanelAccionesFormularioIngresosPromedios, this.gridBagConstraintsIngresosPromedios);							
			
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
	        this.gridBagConstraintsIngresosPromedios.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsIngresosPromedios.gridx = 0;
	        
			
			this.jContentPaneDetalleIngresosPromedios.add(this.jPanelAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionIngresosPromedios);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionIngresosPromedios=   new JScrollPane(this.jPanelCamposIngresosPromedios,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIngresosPromedios.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosPromedios.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosPromedios.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsIngresosPromedios.gridx = 0;
			this.gridBagConstraintsIngresosPromedios.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsIngresosPromedios.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsIngresosPromedios.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIngresosPromedios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioIngresosPromedios, this.gridBagConstraintsIngresosPromedios);			
			
			this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
			this.gridBagConstraintsIngresosPromedios.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIngresosPromedios.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
			
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		
			
		this.gridBagConstraintsIngresosPromedios = new GridBagConstraints();
		this.gridBagConstraintsIngresosPromedios.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIngresosPromedios.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIngresosPromedios, this.gridBagConstraintsIngresosPromedios);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralIngresosPromedios;//jContentPane;
		
		return jScrollPanelDatosEdicionIngresosPromedios;
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
