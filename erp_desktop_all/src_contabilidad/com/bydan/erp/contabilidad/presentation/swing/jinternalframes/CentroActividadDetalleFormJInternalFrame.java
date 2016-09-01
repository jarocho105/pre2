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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.CentroActividadConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class CentroActividadDetalleFormJInternalFrame extends CentroActividadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCentroActividad;
	
	protected JMenuBar jmenuBarDetalleCentroActividad;
	
	protected JMenu jmenuDetalleCentroActividad;
	protected JMenu jmenuDetalleArchivoCentroActividad;
	protected JMenu jmenuDetalleAccionesCentroActividad;
	protected JMenu jmenuDetalleDatosCentroActividad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroActividad;	
	protected GridBagConstraints gridBagConstraintsCentroActividad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CentroActividadBeanSwingJInternalFrameAdditional jInternalFrameDetalleCentroActividad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoflujocaja="";
	
	public CentroActividadSessionBean centroactividadSessionBean;
	
	

	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;
	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePagoAuto=false;
	public PagoAutoSessionBean pagoautoSessionBean;

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;
	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriPago=false;
	public AutoriPagoSessionBean autoripagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean;	
	
	public CentroActividadLogic centroactividadLogic;
	
	public JScrollPane jScrollPanelDatosCentroActividad;
	public JScrollPane jScrollPanelDatosEdicionCentroActividad;
	public JScrollPane jScrollPanelDatosGeneralCentroActividad;
	
	protected JPanel jPanelCamposCentroActividad;    
	protected JPanel jPanelCamposOcultosCentroActividad;    	
	protected JPanel jPanelAccionesCentroActividad;
	protected JPanel jPanelAccionesFormularioCentroActividad;
    
	
	
	protected Integer iXPanelCamposCentroActividad=0;
	protected Integer iYPanelCamposCentroActividad=0;
	
	protected Integer iXPanelCamposOcultosCentroActividad=0;
	protected Integer iYPanelCamposOcultosCentroActividad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCentroActividad;
	public JButton jButtonModificarCentroActividad;
	public JButton jButtonActualizarCentroActividad;
    public JButton jButtonEliminarCentroActividad;
	public JButton jButtonCancelarCentroActividad;
    public JButton jButtonGuardarCambiosCentroActividad;
	public JButton jButtonGuardarCambiosTablaCentroActividad;
	protected JButton jButtonCerrarCentroActividad;
	
	
	protected JButton jButtonProcesarInformacionCentroActividad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCentroActividad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCentroActividad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCentroActividad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroActividad;
	protected JButton jButtonModificarToolBarCentroActividad;
	protected JButton jButtonActualizarToolBarCentroActividad;
    protected JButton jButtonEliminarToolBarCentroActividad;
	protected JButton jButtonCancelarToolBarCentroActividad;
    protected JButton jButtonGuardarCambiosToolBarCentroActividad;
	protected JButton jButtonGuardarCambiosTablaToolBarCentroActividad;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroActividad;
	protected JButton jButtonCerrarToolBarCentroActividad;
	
	protected JButton jButtonProcesarInformacionToolBarCentroActividad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroActividad;
	protected JMenuItem jMenuItemModificarCentroActividad;
	protected JMenuItem jMenuItemActualizarCentroActividad;
    protected JMenuItem jMenuItemEliminarCentroActividad;
	protected JMenuItem jMenuItemCancelarCentroActividad;
    protected JMenuItem jMenuItemGuardarCambiosCentroActividad;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroActividad;
	protected JMenuItem jMenuItemCerrarCentroActividad;
	protected JMenuItem jMenuItemDetalleCerrarCentroActividad;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroActividad;
	
	protected JMenuItem jMenuItemProcesarInformacionCentroActividad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroActividad;
	protected JMenuItem jMenuItemMostrarOcultarCentroActividad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroActividad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroActividad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroActividad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCentroActividad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCentroActividad;
	public JLabel jLabelIdCentroActividad;
	public JLabel jLabelidCentroActividad;
	public JButton jButtonidCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCentroActividad;
	public JLabel jLabelcodigoCentroActividad;
	public JTextField jTextFieldcodigoCentroActividad;
	public JButton jButtoncodigoCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelnombreCentroActividad;
	public JLabel jLabelnombreCentroActividad;
	public JTextArea jTextAreanombreCentroActividad;
	public JScrollPane jscrollPanenombreCentroActividad;
	public JButton jButtonnombreCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelconsolidadoCentroActividad;
	public JLabel jLabelconsolidadoCentroActividad;
	public JCheckBox jCheckBoxconsolidadoCentroActividad;
	public JButton jButtonconsolidadoCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelcon_proyectoCentroActividad;
	public JLabel jLabelcon_proyectoCentroActividad;
	public JCheckBox jCheckBoxcon_proyectoCentroActividad;
	public JButton jButtoncon_proyectoCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelobservacionCentroActividad;
	public JLabel jLabelobservacionCentroActividad;
	public JTextArea jTextAreaobservacionCentroActividad;
	public JScrollPane jscrollPaneobservacionCentroActividad;
	public JButton jButtonobservacionCentroActividadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCentroActividad;
	public JLabel jLabelid_empresaCentroActividad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCentroActividad;
	public JButton jButtonid_empresaCentroActividad= new JButtonMe();
	public JButton jButtonid_empresaCentroActividadUpdate= new JButtonMe();
	public JButton jButtonid_empresaCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoCentroActividad;
	public JLabel jLabelid_tipo_movimientoCentroActividad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoCentroActividad;
	public JButton jButtonid_tipo_movimientoCentroActividad= new JButtonMe();
	public JButton jButtonid_tipo_movimientoCentroActividadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoCentroActividadBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_grupo_flujo_cajaCentroActividad;
	public JLabel jLabelid_tipo_grupo_flujo_cajaCentroActividad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_flujo_cajaCentroActividad;
	public JButton jButtonid_tipo_grupo_flujo_cajaCentroActividad= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCentroActividad;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CentroActividadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCentroActividad=new JPanel();
				this.jPanelAccionesFormularioCentroActividad=new JPanel();
				this.jmenuBarDetalleCentroActividad=new JMenuBar();
				this.jTtoolBarDetalleCentroActividad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CentroActividadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroActividadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroActividad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCentroActividad() {
		return this.jButtonActualizarToolBarCentroActividad;
	}
	
	public JButton getjButtonEliminarToolBarCentroActividad() {
		return this.jButtonEliminarToolBarCentroActividad;
	}
	
	public JButton getjButtonCancelarToolBarCentroActividad() {
		return this.jButtonCancelarToolBarCentroActividad;
	}		
	
	public JButton getjButtonProcesarInformacionCentroActividad() {
		return this.jButtonProcesarInformacionCentroActividad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroActividad)	{
		this.jButtonProcesarInformacionCentroActividad = jButtonProcesarInformacionCentroActividad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroActividad() {
		return this.jComboBoxTiposAccionesCentroActividad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroActividad(
			JComboBox jComboBoxTiposRelacionesCentroActividad) {
		this.jComboBoxTiposRelacionesCentroActividad = jComboBoxTiposRelacionesCentroActividad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroActividad(
			JComboBox jComboBoxTiposAccionesCentroActividad) {
		this.jComboBoxTiposAccionesCentroActividad = jComboBoxTiposAccionesCentroActividad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCentroActividad() {
		return this.jComboBoxTiposAccionesFormularioCentroActividad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCentroActividad(
			JComboBox jComboBoxTiposAccionesFormularioCentroActividad) {
		this.jComboBoxTiposAccionesFormularioCentroActividad = jComboBoxTiposAccionesFormularioCentroActividad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.centroactividadSessionBean=new CentroActividadSessionBean();
		
		this.centroactividadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centroactividadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centroactividadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pagoautoSessionBean=new PagoAutoSessionBean();
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.autoripagoSessionBean=new AutoriPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroActividadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Actividad MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
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
	
		CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCentroActividad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCentroActividad=new JButtonMe();
				this.jButtonModificarToolBarCentroActividad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCentroActividad,this.jTtoolBarDetalleCentroActividad,
							"actualizar","actualizar","Actualizar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCentroActividad,this.jTtoolBarDetalleCentroActividad,
							"eliminar","eliminar","Eliminar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCentroActividad,this.jTtoolBarDetalleCentroActividad,
							"cancelar","cancelar","Cancelar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCentroActividad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCentroActividad,this.jTtoolBarDetalleCentroActividad,
							"guardarcambios","guardarcambios","Guardar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCentroActividad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCentroActividad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCentroActividad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCentroActividad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCentroActividad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroActividad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroActividad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroActividad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCentroActividad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCentroActividad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCentroActividad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCentroActividad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCentroActividad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCentroActividad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCentroActividad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCentroActividad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCentroActividad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCentroActividad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCentroActividad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCentroActividad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCentroActividad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroActividad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroActividad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroActividad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroActividad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroActividad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCentroActividad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCentroActividad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCentroActividad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroActividad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroActividad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroActividad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroActividad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroActividad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroActividad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCentroActividad.add(this.jMenuItemDetalleCerrarCentroActividad);
		
		this.jmenuDetalleAccionesCentroActividad.add(this.jMenuItemActualizarCentroActividad);
		this.jmenuDetalleAccionesCentroActividad.add(this.jMenuItemEliminarCentroActividad);
		this.jmenuDetalleAccionesCentroActividad.add(this.jMenuItemCancelarCentroActividad);		
		
		//this.jmenuDetalleDatosCentroActividad.add(this.jMenuItemDetalleAbrirOrderByCentroActividad);				
		this.jmenuDetalleDatosCentroActividad.add(this.jMenuItemDetalleMostarOcultarCentroActividad);				
				
		//this.jmenuDetalleAccionesCentroActividad.add(this.jMenuItemGuardarCambiosCentroActividad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCentroActividad.add(this.jmenuDetalleArchivoCentroActividad);		
		this.jmenuBarDetalleCentroActividad.add(this.jmenuDetalleAccionesCentroActividad);		
		this.jmenuBarDetalleCentroActividad.add(this.jmenuDetalleDatosCentroActividad);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCentroActividad.add(this.jmenuDetalleCentroActividad);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCentroActividad);				
	}
	
	
	public void inicializarElementosCamposCentroActividad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCentroActividad = new JLabelMe();
		jLabelIdCentroActividad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCentroActividad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCentroActividad= new GridBagLayout();

		this.jPanelidCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);

		jLabelidCentroActividad = new JLabel();
		jLabelidCentroActividad.setText("Id");

		jLabelidCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCentroActividad = new JLabelMe();
		this.jLabelcodigoCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCentroActividad.setToolTipText("Codigo");
		this.jLabelcodigoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelcodigoCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jTextFieldcodigoCentroActividad= new JTextFieldMe();

		jTextFieldcodigoCentroActividad.setEnabled(false);
		jTextFieldcodigoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCentroActividadBusqueda= new JButtonMe();
		this.jButtoncodigoCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCentroActividadBusqueda.setText("U");
		this.jButtoncodigoCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCentroActividadBusqueda.setVisible(false);		}


					
		this.jLabelnombreCentroActividad = new JLabelMe();
		this.jLabelnombreCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCentroActividad.setToolTipText("Nombre");
		this.jLabelnombreCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelnombreCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jTextAreanombreCentroActividad= new JTextAreaMe();
		jTextAreanombreCentroActividad.setEnabled(false);
		jTextAreanombreCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCentroActividad.setLineWrap(true);
		jTextAreanombreCentroActividad.setWrapStyleWord(true);
		jTextAreanombreCentroActividad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCentroActividad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCentroActividad = new JScrollPane(jTextAreanombreCentroActividad);
		jscrollPanenombreCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCentroActividadBusqueda= new JButtonMe();
		this.jButtonnombreCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCentroActividadBusqueda.setText("U");
		this.jButtonnombreCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCentroActividadBusqueda.setVisible(false);		}


					
		this.jLabelconsolidadoCentroActividad = new JLabelMe();
		this.jLabelconsolidadoCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_CONSOLIDADO+" : *");
		this.jLabelconsolidadoCentroActividad.setToolTipText("Consolidado");
		this.jLabelconsolidadoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconsolidadoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelconsolidadoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelconsolidadoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelconsolidadoCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelconsolidadoCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_CONSOLIDADO);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelconsolidadoCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jCheckBoxconsolidadoCentroActividad= new JCheckBoxMe();
		jCheckBoxconsolidadoCentroActividad.setEnabled(false);

		jCheckBoxconsolidadoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconsolidadoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxconsolidadoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxconsolidadoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonconsolidadoCentroActividadBusqueda= new JButtonMe();
		this.jButtonconsolidadoCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconsolidadoCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonconsolidadoCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonconsolidadoCentroActividadBusqueda.setText("U");
		this.jButtonconsolidadoCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonconsolidadoCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonconsolidadoCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxconsolidadoCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxconsolidadoCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"consolidadoCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonconsolidadoCentroActividadBusqueda.setVisible(false);		}


					
		this.jLabelcon_proyectoCentroActividad = new JLabelMe();
		this.jLabelcon_proyectoCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_CONPROYECTO+" : *");
		this.jLabelcon_proyectoCentroActividad.setToolTipText("Con Proyecto");
		this.jLabelcon_proyectoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_proyectoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_proyectoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_proyectoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_proyectoCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_proyectoCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_CONPROYECTO);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelcon_proyectoCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jCheckBoxcon_proyectoCentroActividad= new JCheckBoxMe();
		jCheckBoxcon_proyectoCentroActividad.setEnabled(false);

		jCheckBoxcon_proyectoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_proyectoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_proyectoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_proyectoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_proyectoCentroActividadBusqueda= new JButtonMe();
		this.jButtoncon_proyectoCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_proyectoCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_proyectoCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_proyectoCentroActividadBusqueda.setText("U");
		this.jButtoncon_proyectoCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_proyectoCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_proyectoCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_proyectoCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_proyectoCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_proyectoCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_proyectoCentroActividadBusqueda.setVisible(false);		}


					
		this.jLabelobservacionCentroActividad = new JLabelMe();
		this.jLabelobservacionCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionCentroActividad.setToolTipText("Observacion");
		this.jLabelobservacionCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelobservacionCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jTextAreaobservacionCentroActividad= new JTextAreaMe();
		jTextAreaobservacionCentroActividad.setEnabled(false);
		jTextAreaobservacionCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionCentroActividad.setLineWrap(true);
		jTextAreaobservacionCentroActividad.setWrapStyleWord(true);
		jTextAreaobservacionCentroActividad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionCentroActividad.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionCentroActividad = new JScrollPane(jTextAreaobservacionCentroActividad);
		jscrollPaneobservacionCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonobservacionCentroActividadBusqueda= new JButtonMe();
		this.jButtonobservacionCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionCentroActividadBusqueda.setText("U");
		this.jButtonobservacionCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionCentroActividadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCentroActividad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCentroActividad = new JLabelMe();
		this.jLabelid_empresaCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCentroActividad.setToolTipText("Empresa");
		this.jLabelid_empresaCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelid_empresaCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jComboBoxid_empresaCentroActividad= new JComboBoxMe();
		jComboBoxid_empresaCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCentroActividad.setEnabled(false);

		this.jButtonid_empresaCentroActividad= new JButtonMe();
		this.jButtonid_empresaCentroActividad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroActividad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroActividad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroActividad.setText("Buscar");
		this.jButtonid_empresaCentroActividad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCentroActividad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroActividad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroActividad"));

		this.jButtonid_empresaCentroActividadBusqueda= new JButtonMe();
		this.jButtonid_empresaCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroActividadBusqueda.setText("U");
		this.jButtonid_empresaCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCentroActividadBusqueda.setVisible(false);		}

		this.jButtonid_empresaCentroActividadUpdate= new JButtonMe();
		this.jButtonid_empresaCentroActividadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroActividadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroActividadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroActividadUpdate.setText("U");
		this.jButtonid_empresaCentroActividadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCentroActividadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroActividadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroActividadUpdate"));



					
		this.jLabelid_tipo_movimientoCentroActividad = new JLabelMe();
		this.jLabelid_tipo_movimientoCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoCentroActividad.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelid_tipo_movimientoCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jComboBoxid_tipo_movimientoCentroActividad= new JComboBoxMe();
		jComboBoxid_tipo_movimientoCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoCentroActividad= new JButtonMe();
		this.jButtonid_tipo_movimientoCentroActividad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoCentroActividad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoCentroActividad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoCentroActividad.setText("Buscar");
		this.jButtonid_tipo_movimientoCentroActividad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoCentroActividad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoCentroActividad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoCentroActividad"));

		this.jButtonid_tipo_movimientoCentroActividadBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoCentroActividadBusqueda.setText("U");
		this.jButtonid_tipo_movimientoCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoCentroActividadBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoCentroActividadUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoCentroActividadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoCentroActividadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoCentroActividadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoCentroActividadUpdate.setText("U");
		this.jButtonid_tipo_movimientoCentroActividadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoCentroActividadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoCentroActividadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoCentroActividadUpdate"));



					
		this.jLabelid_tipo_grupo_flujo_cajaCentroActividad = new JLabelMe();
		this.jLabelid_tipo_grupo_flujo_cajaCentroActividad.setText(""+CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA+" : *");
		this.jLabelid_tipo_grupo_flujo_cajaCentroActividad.setToolTipText("Tipo Grupo Flujo Caja");
		this.jLabelid_tipo_grupo_flujo_cajaCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_flujo_cajaCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_flujo_cajaCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_flujo_cajaCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_flujo_cajaCentroActividad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_flujo_cajaCentroActividad.setToolTipText(CentroActividadConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
		this.gridaBagLayoutCentroActividad = new GridBagLayout();
		this.jPanelid_tipo_grupo_flujo_cajaCentroActividad.setLayout(this.gridaBagLayoutCentroActividad);


		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad= new JComboBoxMe();
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_flujo_cajaCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad= new JButtonMe();
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad.setText("Buscar");
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_flujo_cajaCentroActividad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_flujo_cajaCentroActividad"));

		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setText("U");
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_flujo_cajaCentroActividadBusqueda"));

		if(this.centroactividadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.setText("U");
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_flujo_cajaCentroActividad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_flujo_cajaCentroActividadUpdate"));



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
		//this.jInternalFrameDetalleCentroActividad = new CentroActividadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Centro Actividad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroActividad= new GridBagLayout();
		

		
		String sToolTipCentroActividad="";
		sToolTipCentroActividad=CentroActividadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroActividad+="(Contabilidad.CentroActividad)";
		}
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroActividad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCentroActividad = new JButtonMe();
		this.jButtonModificarCentroActividad = new JButtonMe();
        this.jButtonActualizarCentroActividad = new JButtonMe();
        this.jButtonEliminarCentroActividad = new JButtonMe();
        this.jButtonCancelarCentroActividad = new JButtonMe();
        this.jButtonGuardarCambiosCentroActividad = new JButtonMe();
		this.jButtonGuardarCambiosTablaCentroActividad = new JButtonMe();
		this.jButtonCerrarCentroActividad = new JButtonMe();
		
		this.jScrollPanelDatosCentroActividad = new JScrollPane();   
        this.jScrollPanelDatosEdicionCentroActividad = new JScrollPane();
		this.jScrollPanelDatosGeneralCentroActividad = new JScrollPane();
				
		
		
		this.jPanelCamposCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Actividad";
		
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Actividades" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroActividad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCentroActividad.setName("jPanelCamposCentroActividad"); 

		this.jPanelCamposOcultosCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCentroActividad.setName("jPanelCamposOcultosCentroActividad"); 

        this.jPanelAccionesCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroActividad.setToolTipText("Acciones");
        this.jPanelAccionesCentroActividad.setName("Acciones"); 

		this.jPanelAccionesFormularioCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCentroActividad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCentroActividad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCentroActividad.setText("Nuevo");
		this.jButtonModificarCentroActividad.setText("Editar");
        this.jButtonActualizarCentroActividad.setText("Actualizar");
        this.jButtonEliminarCentroActividad.setText("Eliminar");
        this.jButtonCancelarCentroActividad.setText("Cancelar");
        this.jButtonGuardarCambiosCentroActividad.setText("Guardar");
		this.jButtonGuardarCambiosTablaCentroActividad.setText("Guardar");
		this.jButtonCerrarCentroActividad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroActividad,"nuevo_button","Nuevo",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCentroActividad,"modificar_button","Editar",this.centroactividadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCentroActividad,"actualizar_button","Actualizar",this.centroactividadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCentroActividad,"eliminar_button","Eliminar",this.centroactividadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCentroActividad,"cancelar_button","Cancelar",this.centroactividadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCentroActividad,"guardarcambios_button","Guardar",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroActividad,"guardarcambiostabla_button","Guardar",this.centroactividadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroActividad,"cerrar_button","Salir",this.centroactividadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCentroActividad.setToolTipText("Nuevo"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCentroActividad.setToolTipText("Editar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCentroActividad.setToolTipText("Actualizar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCentroActividad.setToolTipText("Eliminar)"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCentroActividad.setToolTipText("Cancelar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCentroActividad.setToolTipText("Guardar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCentroActividad.setToolTipText("Guardar"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroActividad.setToolTipText("Salir"+" "+CentroActividadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroActividad";
		inputMap = this.jButtonNuevoCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroActividad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroActividad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCentroActividad";
		inputMap = this.jButtonActualizarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCentroActividad"));
		
		//ELIMINAR
		sMapKey = "EliminarCentroActividad";
		inputMap = this.jButtonEliminarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCentroActividad"));
		
		//CANCELAR	
		sMapKey = "CancelarCentroActividad";
		inputMap = this.jButtonCancelarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCentroActividad"));
		
		//CERRAR		
		sMapKey = "CerrarCentroActividad";
		inputMap = this.jButtonCerrarCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroActividad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroActividad";
		inputMap = this.jButtonGuardarCambiosTablaCentroActividad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroActividad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroActividad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCentroActividad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCentroActividad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCentroActividad.setToolTipText("Nuevo CentroActividad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCentroActividad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCentroActividad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCentroActividad.setToolTipText("Sin Cerrar Ventana CentroActividad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCentroActividad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCentroActividad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCentroActividad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroActividad.setText("Accion");
		this.jComboBoxTiposAccionesCentroActividad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCentroActividad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCentroActividad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCentroActividad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCentroActividad = new JLabelMe();
		
		this.jLabelAccionesCentroActividad.setText("Acciones");		
		this.jLabelAccionesCentroActividad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroActividad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroActividad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCentroActividad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCentroActividad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCentroActividad=new JTabbedPane();
		this.jTabbedPaneRelacionesCentroActividad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCentroActividad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCentroActividad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroActividad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroActividad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroActividad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCentroActividad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroActividad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroActividad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCentroActividad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCentroActividad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCentroActividad = new GridBagLayout();
		
		this.jPanelCamposCentroActividad.setLayout(gridaBagLayoutCamposCentroActividad);
		this.jPanelCamposOcultosCentroActividad.setLayout(gridaBagLayoutCamposOcultosCentroActividad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCentroActividad.add(jLabelIdCentroActividad, this.gridBagConstraintsCentroActividad);



	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCentroActividad.add(jLabelidCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCentroActividad.add(jLabelid_empresaCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroActividad.add(jButtonid_empresaCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 3;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroActividad.add(jButtonid_empresaCentroActividadUpdate, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCentroActividad.add(jComboBoxid_empresaCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCentroActividad.add(jLabelcodigoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCentroActividad.add(jButtoncodigoCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCentroActividad.add(jTextFieldcodigoCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCentroActividad.add(jLabelnombreCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCentroActividad.add(jButtonnombreCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCentroActividad.add(jscrollPanenombreCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoCentroActividad.add(jLabelid_tipo_movimientoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoCentroActividad.add(jButtonid_tipo_movimientoCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 3;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoCentroActividad.add(jButtonid_tipo_movimientoCentroActividadUpdate, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoCentroActividad.add(jComboBoxid_tipo_movimientoCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_flujo_cajaCentroActividad.add(jLabelid_tipo_grupo_flujo_cajaCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_flujo_cajaCentroActividad.add(jButtonid_tipo_grupo_flujo_cajaCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 3;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_flujo_cajaCentroActividad.add(jButtonid_tipo_grupo_flujo_cajaCentroActividadUpdate, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_flujo_cajaCentroActividad.add(jComboBoxid_tipo_grupo_flujo_cajaCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelconsolidadoCentroActividad.add(jLabelconsolidadoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelconsolidadoCentroActividad.add(jButtonconsolidadoCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelconsolidadoCentroActividad.add(jCheckBoxconsolidadoCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_proyectoCentroActividad.add(jLabelcon_proyectoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_proyectoCentroActividad.add(jButtoncon_proyectoCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_proyectoCentroActividad.add(jCheckBoxcon_proyectoCentroActividad, this.gridBagConstraintsCentroActividad);


	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 0;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionCentroActividad.add(jLabelobservacionCentroActividad, this.gridBagConstraintsCentroActividad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		//this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = 2;
		this.gridBagConstraintsCentroActividad.ipadx = 0;
		this.gridBagConstraintsCentroActividad.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionCentroActividad.add(jButtonobservacionCentroActividadBusqueda, this.gridBagConstraintsCentroActividad);
	}

	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroActividad.gridy = 0;
	this.gridBagConstraintsCentroActividad.gridx = 1;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionCentroActividad.add(jscrollPaneobservacionCentroActividad, this.gridBagConstraintsCentroActividad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelidCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelcodigoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelnombreCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelid_tipo_movimientoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelid_tipo_grupo_flujo_cajaCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelconsolidadoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelcon_proyectoCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroActividad.add(this.jPanelobservacionCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposCentroActividad % 1==0) {
		iXPanelCamposCentroActividad=0;
		iYPanelCamposCentroActividad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroActividad.gridy = iYPanelCamposOcultosCentroActividad;
	this.gridBagConstraintsCentroActividad.gridx = iXPanelCamposOcultosCentroActividad++;
	this.gridBagConstraintsCentroActividad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroActividad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroActividad.add(this.jPanelid_empresaCentroActividad, this.gridBagConstraintsCentroActividad);



	if(iXPanelCamposOcultosCentroActividad % 1==0) {
		iXPanelCamposOcultosCentroActividad=0;
		iYPanelCamposOcultosCentroActividad++;
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
			
		GridBagLayout gridaBagLayoutAccionesCentroActividad= new GridBagLayout();
		this.jPanelAccionesCentroActividad.setLayout(gridaBagLayoutAccionesCentroActividad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCentroActividad= new GridBagLayout();
		this.jPanelAccionesFormularioCentroActividad.setLayout(gridaBagLayoutAccionesFormularioCentroActividad);
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroActividad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroActividad.add(this.jComboBoxTiposAccionesFormularioCentroActividad, this.gridBagConstraintsCentroActividad);

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroActividad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroActividad.add(this.jCheckBoxPostAccionNuevoCentroActividad, this.gridBagConstraintsCentroActividad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroActividad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroActividad.add(this.jCheckBoxPostAccionSinCerrarCentroActividad, this.gridBagConstraintsCentroActividad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.centroactividadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.centroactividadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroActividad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroActividad.add(this.jCheckBoxPostAccionSinMensajeCentroActividad, this.gridBagConstraintsCentroActividad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx = iPosXAccion++;
			
		this.jPanelAccionesCentroActividad.add(this.jButtonModificarCentroActividad, this.gridBagConstraintsCentroActividad);							

		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroActividad.gridy = 0;
		this.gridBagConstraintsCentroActividad.gridx =iPosXAccion++;
			
		this.jPanelAccionesCentroActividad.add(this.jButtonEliminarCentroActividad, this.gridBagConstraintsCentroActividad);
		
			
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = 0;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroActividad.add(this.jButtonActualizarCentroActividad, this.gridBagConstraintsCentroActividad);


		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = 0;		
		this.gridBagConstraintsCentroActividad.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroActividad.add(this.jButtonGuardarCambiosCentroActividad, this.gridBagConstraintsCentroActividad);	
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = 0;		
		this.gridBagConstraintsCentroActividad.gridx =iPosXAccion++;
		
		this.jPanelAccionesCentroActividad.add(this.jButtonCancelarCentroActividad, this.gridBagConstraintsCentroActividad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroActividad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroActividad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centroactividadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();						
			this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroActividad.gridx = 0;		
			//this.gridBagConstraintsCentroActividad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroActividad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroActividad.gridx =0;
		this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroActividad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroActividad, this.gridBagConstraintsCentroActividad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CentroActividadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCentroActividad = new CentroActividadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Centro Actividad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Centro Actividad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Actividad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CentroActividadModel centroactividadModel=new CentroActividadModel(this);
			
			//SI USARA CLASE INTERNA
			//CentroActividadModel.CentroActividadFocusTraversalPolicy centroactividadFocusTraversalPolicy = centroactividadModel.new CentroActividadFocusTraversalPolicy(this);
			
			//centroactividadFocusTraversalPolicy.setcentroactividadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(centroactividadModel);
			
			
			this.jContentPaneDetalleCentroActividad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCentroActividad = new GridBagLayout();	
			this.jContentPaneDetalleCentroActividad.setLayout(gridaBagLayoutDetalleCentroActividad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroActividad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCentroActividad.gridx = 0;
					
				
				this.jContentPaneDetalleCentroActividad.add(jTtoolBarDetalleCentroActividad, gridBagConstraintsCentroActividad);								
				
}
			
			this.jScrollPanelDatosEdicionCentroActividad=   new JScrollPane(jContentPaneDetalleCentroActividad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroActividad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroActividad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroActividad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCentroActividad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroActividad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroActividad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroActividad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCentroActividad.gridx = 0;
	        
			this.jContentPaneDetalleCentroActividad.add(jPanelCamposCentroActividad, gridBagConstraintsCentroActividad);
			
			
			
			
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
						&& centroactividadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(this.puedeCargarPorParteAutoriPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(this.puedeCargarPorPartePagoAuto,false,-1);
					
					if(this.centroactividadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCentroActividad= new GridBagConstraints();
						this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCentroActividad.gridx = 0;
						this.jContentPaneDetalleCentroActividad.add(this.jTabbedPaneRelacionesCentroActividad, this.gridBagConstraintsCentroActividad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCentroActividad.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCentroActividad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCentroActividad = new GridBagConstraints();
					this.gridBagConstraintsCentroActividad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCentroActividad.gridx = 0;
					
				
					this.jContentPaneDetalleCentroActividad.add(jPanelCamposOcultosCentroActividad, gridBagConstraintsCentroActividad);
				
					this.jPanelCamposOcultosCentroActividad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsCentroActividad.gridx = 0;
	        this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCentroActividad.add(this.jPanelAccionesFormularioCentroActividad, this.gridBagConstraintsCentroActividad);							
			
			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
	        this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsCentroActividad.gridx = 0;
	        
			
			this.jContentPaneDetalleCentroActividad.add(this.jPanelAccionesCentroActividad, this.gridBagConstraintsCentroActividad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCentroActividad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCentroActividad=   new JScrollPane(this.jPanelCamposCentroActividad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroActividad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroActividad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroActividad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCentroActividad.gridx = 0;
			this.gridBagConstraintsCentroActividad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCentroActividad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCentroActividad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCentroActividad, this.gridBagConstraintsCentroActividad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroActividad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCentroActividad, this.gridBagConstraintsCentroActividad);			
			
			this.gridBagConstraintsCentroActividad = new GridBagConstraints();
			this.gridBagConstraintsCentroActividad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroActividad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCentroActividad, this.gridBagConstraintsCentroActividad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroActividad, this.gridBagConstraintsCentroActividad);
			
			
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroActividad, this.gridBagConstraintsCentroActividad);
		
			
		this.gridBagConstraintsCentroActividad = new GridBagConstraints();
		this.gridBagConstraintsCentroActividad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroActividad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroActividad, this.gridBagConstraintsCentroActividad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCentroActividad;//jContentPane;
		
		return jScrollPanelDatosEdicionCentroActividad;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAutoriPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoripagoSessionBean=new AutoriPagoSessionBean();
		this.autoripagoSessionBean.setConGuardarRelaciones(false);
		this.autoripagoSessionBean.setEsGuardarRelacionado(true);

		this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoripagoBeanSwingJInternalFramePopup=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoripagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {

				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoripagoSessionBean.setEsGuardarRelacionado(true);

				this.autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoripagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoripagoBeanSwingJInternalFrame.setautoripagoSessionBean(this.autoripagoSessionBean);

				//this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				//this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCentroActividad.gridx = 0;
				//this.jContentPaneDetalleCentroActividad.add(this.autoripagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCentroActividad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCentroActividad.add("Autori Pagos",this.autoripagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCentroActividad.setComponentAt(iIndexTab,this.autoripagoBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoripagoSessionBean.setEsGuardarRelacionado(false);
				this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriPago) {
					this.jTabbedPaneRelacionesCentroActividad.add("Autori Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				//this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCentroActividad.gridx = 0;
				//this.jContentPaneDetalleCentroActividad.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCentroActividad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCentroActividad.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCentroActividad.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesCentroActividad.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePagoAuto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pagoautoSessionBean=new PagoAutoSessionBean();
		this.pagoautoSessionBean.setConGuardarRelaciones(false);
		this.pagoautoSessionBean.setEsGuardarRelacionado(true);

		this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pagoautoBeanSwingJInternalFramePopup=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pagoautoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {

				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;
				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pagoautoSessionBean.setEsGuardarRelacionado(true);

				this.pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pagoautoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pagoautoBeanSwingJInternalFrame.setpagoautoSessionBean(this.pagoautoSessionBean);

				//this.gridBagConstraintsCentroActividad = new GridBagConstraints();
				//this.gridBagConstraintsCentroActividad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCentroActividad.gridx = 0;
				//this.jContentPaneDetalleCentroActividad.add(this.pagoautoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCentroActividad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCentroActividad.add("Pago Autos",this.pagoautoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCentroActividad.setComponentAt(iIndexTab,this.pagoautoBeanSwingJInternalFrame.getContentPane());
				}

				//PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pagoautoSessionBean.setEsGuardarRelacionado(false);
				this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePagoAuto) {
					this.jTabbedPaneRelacionesCentroActividad.add("Pago Autos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPagoAutoBeanSwingJInternalFrame(List<CentroActividad> centroactividads,CentroActividad centroactividad,PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pagoautoBeanSwingJInternalFrame.getPagoAutoLogic().setConnexion(this.centroactividadLogic.getConnexion());

					pagoautoBeanSwingJInternalFrame.setcentroactividadsForeignKey(centroactividads);
					pagoautoBeanSwingJInternalFrame.setcentroactividadForeignKey(centroactividad);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setisBusquedaDesdeForeignKeySesionCentroActividad(true);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setlidCentroActividadActual(centroactividad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pagoautoBeanSwingJInternalFrame.cargarCombosForeignKeyPagoAuto(pagoautoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pagoautoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCentroActividad(true);
					pagoautoBeanSwingJInternalFrame.setid_centro_actividadFK_IdCentroActividad(centroactividad.getId());

					if(!this.conCargarFormDetalle) {
						pagoautoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pagoautoBeanSwingJInternalFrame.setSelectedItemCombosFrameCentroActividadForeignKey(centroactividad,1,false,true,true);
					pagoautoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pagoautoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCentroActividad");
					pagoautoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCentroActividad");
					pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(true);
					pagoautoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPagoAuto("n",pagoautoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pagoautoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pagoautoBeanSwingJInternalFrame.setAutoscrolls(true);
					pagoautoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("relacionado");
					} else {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("no_relacionado");
					}

					pagoautoBeanSwingJInternalFrame.getjButtonRecargarInformacionPagoAuto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteBeanSwingJInternalFrame(List<CentroActividad> centroactividads,CentroActividad centroactividad,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.centroactividadLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setcentroactividadsForeignKey(centroactividads);
					clienteBeanSwingJInternalFrame.setcentroactividadForeignKey(centroactividad);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionCentroActividad(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidCentroActividadActual(centroactividad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaCentroActividad(true);
					clienteBeanSwingJInternalFrame.setid_centro_actividadFK_IdCentroActividad(centroactividad.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameCentroActividadForeignKey(centroactividad,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdCentroActividad");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCentroActividad");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriPagoBeanSwingJInternalFrame(List<CentroActividad> centroactividads,CentroActividad centroactividad,AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoripagoBeanSwingJInternalFrame.getAutoriPagoLogic().setConnexion(this.centroactividadLogic.getConnexion());

					autoripagoBeanSwingJInternalFrame.setcentroactividadsForeignKey(centroactividads);
					autoripagoBeanSwingJInternalFrame.setcentroactividadForeignKey(centroactividad);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setisBusquedaDesdeForeignKeySesionCentroActividad(true);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setlidCentroActividadActual(centroactividad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoripagoBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriPago(autoripagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoripagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCentroActividad(true);
					autoripagoBeanSwingJInternalFrame.setid_centro_actividadFK_IdCentroActividad(centroactividad.getId());

					if(!this.conCargarFormDetalle) {
						autoripagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoripagoBeanSwingJInternalFrame.setSelectedItemCombosFrameCentroActividadForeignKey(centroactividad,1,false,true,true);
					autoripagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoripagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCentroActividad");
					autoripagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCentroActividad");
					autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(true);
					autoripagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriPago("n",autoripagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoripagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoripagoBeanSwingJInternalFrame.setAutoscrolls(true);
					autoripagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("relacionado");
					} else {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("no_relacionado");
					}

					autoripagoBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriPago().setVisible(false);

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
