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
import com.bydan.erp.contabilidad.util.TipoGrupoFlujoCajaConstantesFunciones;

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
public class TipoGrupoFlujoCajaDetalleFormJInternalFrame extends TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGrupoFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleTipoGrupoFlujoCaja;
	
	protected JMenu jmenuDetalleTipoGrupoFlujoCaja;
	protected JMenu jmenuDetalleArchivoTipoGrupoFlujoCaja;
	protected JMenu jmenuDetalleAccionesTipoGrupoFlujoCaja;
	protected JMenu jmenuDetalleDatosTipoGrupoFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGrupoFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean;
	
	

	public LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame=null;
	public LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLineaFlujoCaja=false;
	public LineaFlujoCajaSessionBean lineaflujocajaSessionBean;

	public CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame=null;
	public CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCentroActividad=false;
	public CentroActividadSessionBean centroactividadSessionBean;
	
		
	
	public TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosTipoGrupoFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoFlujoCaja;
	
	protected JPanel jPanelCamposTipoGrupoFlujoCaja;    
	protected JPanel jPanelCamposOcultosTipoGrupoFlujoCaja;    	
	protected JPanel jPanelAccionesTipoGrupoFlujoCaja;
	protected JPanel jPanelAccionesFormularioTipoGrupoFlujoCaja;
    
	
	
	protected Integer iXPanelCamposTipoGrupoFlujoCaja=0;
	protected Integer iYPanelCamposTipoGrupoFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosTipoGrupoFlujoCaja=0;
	protected Integer iYPanelCamposOcultosTipoGrupoFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGrupoFlujoCaja;
	public JButton jButtonModificarTipoGrupoFlujoCaja;
	public JButton jButtonActualizarTipoGrupoFlujoCaja;
    public JButton jButtonEliminarTipoGrupoFlujoCaja;
	public JButton jButtonCancelarTipoGrupoFlujoCaja;
    public JButton jButtonGuardarCambiosTipoGrupoFlujoCaja;
	public JButton jButtonGuardarCambiosTablaTipoGrupoFlujoCaja;
	protected JButton jButtonCerrarTipoGrupoFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionTipoGrupoFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonModificarToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonActualizarToolBarTipoGrupoFlujoCaja;
    protected JButton jButtonEliminarToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonCancelarToolBarTipoGrupoFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoFlujoCaja;
	protected JButton jButtonCerrarToolBarTipoGrupoFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemModificarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemActualizarTipoGrupoFlujoCaja;
    protected JMenuItem jMenuItemEliminarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemCancelarTipoGrupoFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemCerrarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGrupoFlujoCaja;
	public JLabel jLabelIdTipoGrupoFlujoCaja;
	public JTextFieldMe jTextFieldidTipoGrupoFlujoCaja;
	public JButton jButtonidTipoGrupoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoGrupoFlujoCaja;
	public JLabel jLabelcodigoTipoGrupoFlujoCaja;
	public JTextField jTextFieldcodigoTipoGrupoFlujoCaja;
	public JButton jButtoncodigoTipoGrupoFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGrupoFlujoCaja;
	public JLabel jLabelnombreTipoGrupoFlujoCaja;
	public JTextArea jTextAreanombreTipoGrupoFlujoCaja;
	public JScrollPane jscrollPanenombreTipoGrupoFlujoCaja;
	public JButton jButtonnombreTipoGrupoFlujoCajaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGrupoFlujoCaja;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGrupoFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioTipoGrupoFlujoCaja=new JPanel();
				this.jmenuBarDetalleTipoGrupoFlujoCaja=new JMenuBar();
				this.jTtoolBarDetalleTipoGrupoFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGrupoFlujoCaja() {
		return this.jButtonActualizarToolBarTipoGrupoFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarTipoGrupoFlujoCaja() {
		return this.jButtonEliminarToolBarTipoGrupoFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarTipoGrupoFlujoCaja() {
		return this.jButtonCancelarToolBarTipoGrupoFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGrupoFlujoCaja() {
		return this.jButtonProcesarInformacionTipoGrupoFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoFlujoCaja)	{
		this.jButtonProcesarInformacionTipoGrupoFlujoCaja = jButtonProcesarInformacionTipoGrupoFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposAccionesTipoGrupoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposRelacionesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja = jComboBoxTiposRelacionesTipoGrupoFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposAccionesTipoGrupoFlujoCaja) {
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja = jComboBoxTiposAccionesTipoGrupoFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja = jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
		
		this.tipogrupoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		//this.centroactividadSessionBean=new CentroActividadSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGrupoFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGrupoFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGrupoFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarTipoGrupoFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGrupoFlujoCaja,this.jTtoolBarDetalleTipoGrupoFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGrupoFlujoCaja,this.jTtoolBarDetalleTipoGrupoFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGrupoFlujoCaja,this.jTtoolBarDetalleTipoGrupoFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja,this.jTtoolBarDetalleTipoGrupoFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGrupoFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGrupoFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGrupoFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGrupoFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGrupoFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGrupoFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGrupoFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGrupoFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGrupoFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGrupoFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGrupoFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGrupoFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGrupoFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGrupoFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGrupoFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGrupoFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGrupoFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGrupoFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGrupoFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGrupoFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGrupoFlujoCaja.add(this.jMenuItemDetalleCerrarTipoGrupoFlujoCaja);
		
		this.jmenuDetalleAccionesTipoGrupoFlujoCaja.add(this.jMenuItemActualizarTipoGrupoFlujoCaja);
		this.jmenuDetalleAccionesTipoGrupoFlujoCaja.add(this.jMenuItemEliminarTipoGrupoFlujoCaja);
		this.jmenuDetalleAccionesTipoGrupoFlujoCaja.add(this.jMenuItemCancelarTipoGrupoFlujoCaja);		
		
		//this.jmenuDetalleDatosTipoGrupoFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja);				
		this.jmenuDetalleDatosTipoGrupoFlujoCaja.add(this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja);				
				
		//this.jmenuDetalleAccionesTipoGrupoFlujoCaja.add(this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGrupoFlujoCaja.add(this.jmenuDetalleArchivoTipoGrupoFlujoCaja);		
		this.jmenuBarDetalleTipoGrupoFlujoCaja.add(this.jmenuDetalleAccionesTipoGrupoFlujoCaja);		
		this.jmenuBarDetalleTipoGrupoFlujoCaja.add(this.jmenuDetalleDatosTipoGrupoFlujoCaja);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoGrupoFlujoCaja.add(this.jmenuDetalleTipoGrupoFlujoCaja);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGrupoFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposTipoGrupoFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGrupoFlujoCaja = new JLabelMe();
		jLabelIdTipoGrupoFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGrupoFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGrupoFlujoCaja.setToolTipText(TipoGrupoFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGrupoFlujoCaja= new GridBagLayout();

		this.jPanelidTipoGrupoFlujoCaja.setLayout(this.gridaBagLayoutTipoGrupoFlujoCaja);

		jTextFieldidTipoGrupoFlujoCaja = new JTextFieldMe();
		jTextFieldidTipoGrupoFlujoCaja.setText("Id");

		jTextFieldidTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoGrupoFlujoCaja = new JLabelMe();
		this.jLabelcodigoTipoGrupoFlujoCaja.setText(""+TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoGrupoFlujoCaja.setToolTipText("Codigo");
		this.jLabelcodigoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoGrupoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoGrupoFlujoCaja.setToolTipText(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoGrupoFlujoCaja = new GridBagLayout();
		this.jPanelcodigoTipoGrupoFlujoCaja.setLayout(this.gridaBagLayoutTipoGrupoFlujoCaja);


		jTextFieldcodigoTipoGrupoFlujoCaja= new JTextFieldMe();

		jTextFieldcodigoTipoGrupoFlujoCaja.setEnabled(false);
		jTextFieldcodigoTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setText("U");
		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoGrupoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoGrupoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoGrupoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoGrupoFlujoCajaBusqueda"));

		if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoGrupoFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoGrupoFlujoCaja = new JLabelMe();
		this.jLabelnombreTipoGrupoFlujoCaja.setText(""+TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGrupoFlujoCaja.setToolTipText("Nombre");
		this.jLabelnombreTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGrupoFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGrupoFlujoCaja.setToolTipText(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGrupoFlujoCaja = new GridBagLayout();
		this.jPanelnombreTipoGrupoFlujoCaja.setLayout(this.gridaBagLayoutTipoGrupoFlujoCaja);


		jTextAreanombreTipoGrupoFlujoCaja= new JTextAreaMe();
		jTextAreanombreTipoGrupoFlujoCaja.setEnabled(false);
		jTextAreanombreTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoFlujoCaja.setLineWrap(true);
		jTextAreanombreTipoGrupoFlujoCaja.setWrapStyleWord(true);
		jTextAreanombreTipoGrupoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGrupoFlujoCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGrupoFlujoCaja = new JScrollPane(jTextAreanombreTipoGrupoFlujoCaja);
		jscrollPanenombreTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGrupoFlujoCajaBusqueda= new JButtonMe();
		this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setText("U");
		this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGrupoFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGrupoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGrupoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGrupoFlujoCajaBusqueda"));

		if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGrupoFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGrupoFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoGrupoFlujoCaja = new TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Grupo Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoFlujoCaja= new GridBagLayout();
		

		
		String sToolTipTipoGrupoFlujoCaja="";
		sToolTipTipoGrupoFlujoCaja=TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoFlujoCaja+="(Contabilidad.TipoGrupoFlujoCaja)";
		}
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonModificarTipoGrupoFlujoCaja = new JButtonMe();
        this.jButtonActualizarTipoGrupoFlujoCaja = new JButtonMe();
        this.jButtonEliminarTipoGrupoFlujoCaja = new JButtonMe();
        this.jButtonCancelarTipoGrupoFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja = new JButtonMe();
		this.jButtonCerrarTipoGrupoFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Flujo Caja";
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGrupoFlujoCaja.setName("jPanelCamposTipoGrupoFlujoCaja"); 

		this.jPanelCamposOcultosTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGrupoFlujoCaja.setName("jPanelCamposOcultosTipoGrupoFlujoCaja"); 

        this.jPanelAccionesTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGrupoFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGrupoFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGrupoFlujoCaja.setText("Nuevo");
		this.jButtonModificarTipoGrupoFlujoCaja.setText("Editar");
        this.jButtonActualizarTipoGrupoFlujoCaja.setText("Actualizar");
        this.jButtonEliminarTipoGrupoFlujoCaja.setText("Eliminar");
        this.jButtonCancelarTipoGrupoFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGrupoFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.setText("Guardar");
		this.jButtonCerrarTipoGrupoFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoFlujoCaja,"nuevo_button","Nuevo",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGrupoFlujoCaja,"modificar_button","Editar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGrupoFlujoCaja,"actualizar_button","Actualizar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGrupoFlujoCaja,"eliminar_button","Eliminar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGrupoFlujoCaja,"cancelar_button","Cancelar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGrupoFlujoCaja,"guardarcambios_button","Guardar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja,"guardarcambiostabla_button","Guardar",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoFlujoCaja,"cerrar_button","Salir",this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGrupoFlujoCaja.setToolTipText("Nuevo"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGrupoFlujoCaja.setToolTipText("Editar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGrupoFlujoCaja.setToolTipText("Actualizar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGrupoFlujoCaja.setToolTipText("Eliminar)"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGrupoFlujoCaja.setToolTipText("Cancelar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGrupoFlujoCaja.setToolTipText("Guardar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.setToolTipText("Guardar"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoFlujoCaja.setToolTipText("Salir"+" "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoFlujoCaja";
		inputMap = this.jButtonNuevoTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGrupoFlujoCaja";
		inputMap = this.jButtonActualizarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGrupoFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGrupoFlujoCaja";
		inputMap = this.jButtonEliminarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGrupoFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGrupoFlujoCaja";
		inputMap = this.jButtonCancelarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGrupoFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoFlujoCaja";
		inputMap = this.jButtonCerrarTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja.setToolTipText("Nuevo TipoGrupoFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja.setToolTipText("Sin Cerrar Ventana TipoGrupoFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGrupoFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoFlujoCaja.setText("Acciones");		
		this.jLabelAccionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGrupoFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGrupoFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGrupoFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGrupoFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGrupoFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGrupoFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposTipoGrupoFlujoCaja.setLayout(gridaBagLayoutCamposTipoGrupoFlujoCaja);
		this.jPanelCamposOcultosTipoGrupoFlujoCaja.setLayout(gridaBagLayoutCamposOcultosTipoGrupoFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGrupoFlujoCaja.add(jLabelIdTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);



	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGrupoFlujoCaja.add(jTextFieldidTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);


	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoGrupoFlujoCaja.add(jLabelcodigoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoGrupoFlujoCaja.add(jButtoncodigoTipoGrupoFlujoCajaBusqueda, this.gridBagConstraintsTipoGrupoFlujoCaja);
	}

	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoGrupoFlujoCaja.add(jTextFieldcodigoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);


	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGrupoFlujoCaja.add(jLabelnombreTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 2;
		this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGrupoFlujoCaja.add(jButtonnombreTipoGrupoFlujoCajaBusqueda, this.gridBagConstraintsTipoGrupoFlujoCaja);
	}

	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 1;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGrupoFlujoCaja.add(jscrollPanenombreTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iYPanelCamposTipoGrupoFlujoCaja;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iXPanelCamposTipoGrupoFlujoCaja++;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoFlujoCaja.add(this.jPanelidTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);



	if(iXPanelCamposTipoGrupoFlujoCaja % 1==0) {
		iXPanelCamposTipoGrupoFlujoCaja=0;
		iYPanelCamposTipoGrupoFlujoCaja++;
	}
	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iYPanelCamposTipoGrupoFlujoCaja;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iXPanelCamposTipoGrupoFlujoCaja++;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoFlujoCaja.add(this.jPanelcodigoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);



	if(iXPanelCamposTipoGrupoFlujoCaja % 1==0) {
		iXPanelCamposTipoGrupoFlujoCaja=0;
		iYPanelCamposTipoGrupoFlujoCaja++;
	}
	this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iYPanelCamposTipoGrupoFlujoCaja;
	this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iXPanelCamposTipoGrupoFlujoCaja++;
	this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoFlujoCaja.add(this.jPanelnombreTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);



	if(iXPanelCamposTipoGrupoFlujoCaja % 1==0) {
		iXPanelCamposTipoGrupoFlujoCaja=0;
		iYPanelCamposTipoGrupoFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesTipoGrupoFlujoCaja.setLayout(gridaBagLayoutAccionesTipoGrupoFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGrupoFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGrupoFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioTipoGrupoFlujoCaja);
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoFlujoCaja.add(this.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);

		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoFlujoCaja.add(this.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoFlujoCaja.add(this.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoFlujoCaja.add(this.jButtonModificarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);							

		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoFlujoCaja.add(this.jButtonEliminarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
			
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoFlujoCaja.add(this.jButtonActualizarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);


		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoFlujoCaja.add(this.jButtonGuardarCambiosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);	
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = 0;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoFlujoCaja.add(this.jButtonCancelarTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =0;
		this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGrupoFlujoCaja = new TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Grupo Flujo Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Grupo Flujo Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Flujo Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGrupoFlujoCajaModel tipogrupoflujocajaModel=new TipoGrupoFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGrupoFlujoCajaModel.TipoGrupoFlujoCajaFocusTraversalPolicy tipogrupoflujocajaFocusTraversalPolicy = tipogrupoflujocajaModel.new TipoGrupoFlujoCajaFocusTraversalPolicy(this);
			
			//tipogrupoflujocajaFocusTraversalPolicy.settipogrupoflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogrupoflujocajaModel);
			
			
			this.jContentPaneDetalleTipoGrupoFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGrupoFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetalleTipoGrupoFlujoCaja.setLayout(gridaBagLayoutDetalleTipoGrupoFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGrupoFlujoCaja.add(jTtoolBarDetalleTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja=   new JScrollPane(jContentPaneDetalleTipoGrupoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetalleTipoGrupoFlujoCaja.add(jPanelCamposTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);
			
			
			
			
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
						&& tipogrupoflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCentroActividad(this.puedeCargarPorParteCentroActividad,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(this.puedeCargarPorParteLineaFlujoCaja,false,-1);
					
					if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGrupoFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
						this.jContentPaneDetalleTipoGrupoFlujoCaja.add(this.jTabbedPaneRelacionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCentroActividad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGrupoFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsTipoGrupoFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGrupoFlujoCaja.add(jPanelCamposOcultosTipoGrupoFlujoCaja, gridBagConstraintsTipoGrupoFlujoCaja);
				
					this.jPanelCamposOcultosTipoGrupoFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
	        this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGrupoFlujoCaja.add(this.jPanelAccionesFormularioTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);							
			
			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGrupoFlujoCaja.add(this.jPanelAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGrupoFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja=   new JScrollPane(this.jPanelCamposTipoGrupoFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
			this.gridBagConstraintsTipoGrupoFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGrupoFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGrupoFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);			
			
			this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
			
			
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		
			
		this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoFlujoCaja, this.gridBagConstraintsTipoGrupoFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGrupoFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGrupoFlujoCaja;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCentroActividad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.centroactividadSessionBean=new CentroActividadSessionBean();
		this.centroactividadSessionBean.setConGuardarRelaciones(false);
		this.centroactividadSessionBean.setEsGuardarRelacionado(true);

		this.centroactividadBeanSwingJInternalFrame=null;//new CentroActividadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.centroactividadBeanSwingJInternalFramePopup=new CentroActividadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.centroactividadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {

				CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CentroActividadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.centroactividadSessionBean.setEsGuardarRelacionado(true);

				this.centroactividadBeanSwingJInternalFrame=new CentroActividadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.centroactividadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.centroactividadBeanSwingJInternalFrame.setcentroactividadSessionBean(this.centroactividadSessionBean);

				//this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
				//this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
				//this.jContentPaneDetalleTipoGrupoFlujoCaja.add(this.centroactividadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGrupoFlujoCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.add("Centro Actividades",this.centroactividadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setComponentAt(iIndexTab,this.centroactividadBeanSwingJInternalFrame.getContentPane());
				}

				//CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.centroactividadSessionBean.setEsGuardarRelacionado(false);
				this.centroactividadBeanSwingJInternalFrame=null;//new CentroActividadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.centroactividadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCentroActividad) {
					this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.add("Centro Actividades",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		this.lineaflujocajaSessionBean.setConGuardarRelaciones(false);
		this.lineaflujocajaSessionBean.setEsGuardarRelacionado(true);

		this.lineaflujocajaBeanSwingJInternalFrame=null;//new LineaFlujoCajaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.lineaflujocajaBeanSwingJInternalFramePopup=new LineaFlujoCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.lineaflujocajaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {

				LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				LineaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoGrupoFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.lineaflujocajaSessionBean.setEsGuardarRelacionado(true);

				this.lineaflujocajaBeanSwingJInternalFrame=new LineaFlujoCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.lineaflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.lineaflujocajaBeanSwingJInternalFrame.setlineaflujocajaSessionBean(this.lineaflujocajaSessionBean);

				//this.gridBagConstraintsTipoGrupoFlujoCaja = new GridBagConstraints();
				//this.gridBagConstraintsTipoGrupoFlujoCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoGrupoFlujoCaja.gridx = 0;
				//this.jContentPaneDetalleTipoGrupoFlujoCaja.add(this.lineaflujocajaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoGrupoFlujoCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.add("Linea Flujo Cajas",this.lineaflujocajaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setComponentAt(iIndexTab,this.lineaflujocajaBeanSwingJInternalFrame.getContentPane());
				}

				//LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.lineaflujocajaSessionBean.setEsGuardarRelacionado(false);
				this.lineaflujocajaBeanSwingJInternalFrame=null;//new LineaFlujoCajaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLineaFlujoCaja) {
					this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.add("Linea Flujo Cajas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarLineaFlujoCajaBeanSwingJInternalFrame(List<TipoGrupoFlujoCaja> tipogrupoflujocajas,TipoGrupoFlujoCaja tipogrupoflujocaja,LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//lineaflujocajaBeanSwingJInternalFrame=new LineaFlujoCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					lineaflujocajaBeanSwingJInternalFrame.getLineaFlujoCajaLogic().setConnexion(this.tipogrupoflujocajaLogic.getConnexion());

					lineaflujocajaBeanSwingJInternalFrame.settipogrupoflujocajasForeignKey(tipogrupoflujocajas);
					lineaflujocajaBeanSwingJInternalFrame.settipogrupoflujocajaForeignKey(tipogrupoflujocaja);
					lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja(true);
					lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setlidTipoGrupoFlujoCajaActual(tipogrupoflujocaja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					lineaflujocajaBeanSwingJInternalFrame.cargarCombosForeignKeyLineaFlujoCaja(lineaflujocajaBeanSwingJInternalFrame.isCargarCombosDependencia);
					lineaflujocajaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGrupoFlujoCaja(true);
					lineaflujocajaBeanSwingJInternalFrame.setid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja(tipogrupoflujocaja.getId());

					if(!this.conCargarFormDetalle) {
						lineaflujocajaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					lineaflujocajaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGrupoFlujoCajaForeignKey(tipogrupoflujocaja,1,false,true,true);
					lineaflujocajaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					lineaflujocajaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGrupoFlujoCaja");
					lineaflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGrupoFlujoCaja");
					lineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaFlujoCaja(true);
					lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLineaFlujoCaja("n",lineaflujocajaBeanSwingJInternalFrame.isGuardarCambiosEnLote, lineaflujocajaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					lineaflujocajaBeanSwingJInternalFrame.setAutoscrolls(true);
					lineaflujocajaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaFlujoCaja("relacionado");
					} else {
						lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaFlujoCaja("no_relacionado");
					}

					lineaflujocajaBeanSwingJInternalFrame.getjButtonRecargarInformacionLineaFlujoCaja().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCentroActividadBeanSwingJInternalFrame(List<TipoGrupoFlujoCaja> tipogrupoflujocajas,TipoGrupoFlujoCaja tipogrupoflujocaja,CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//centroactividadBeanSwingJInternalFrame=new CentroActividadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					centroactividadBeanSwingJInternalFrame.getCentroActividadLogic().setConnexion(this.tipogrupoflujocajaLogic.getConnexion());

					centroactividadBeanSwingJInternalFrame.settipogrupoflujocajasForeignKey(tipogrupoflujocajas);
					centroactividadBeanSwingJInternalFrame.settipogrupoflujocajaForeignKey(tipogrupoflujocaja);
					centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja(true);
					centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.setlidTipoGrupoFlujoCajaActual(tipogrupoflujocaja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					centroactividadBeanSwingJInternalFrame.cargarCombosForeignKeyCentroActividad(centroactividadBeanSwingJInternalFrame.isCargarCombosDependencia);
					centroactividadBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoGrupoFlujoCaja(true);
					centroactividadBeanSwingJInternalFrame.setid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja(tipogrupoflujocaja.getId());

					if(!this.conCargarFormDetalle) {
						centroactividadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					centroactividadBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoGrupoFlujoCajaForeignKey(tipogrupoflujocaja,1,false,true,true);
					centroactividadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					centroactividadBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoGrupoFlujoCaja");
					centroactividadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoGrupoFlujoCaja");
					centroactividadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroActividad(true);
					centroactividadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCentroActividad("n",centroactividadBeanSwingJInternalFrame.isGuardarCambiosEnLote, centroactividadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					centroactividadBeanSwingJInternalFrame.setAutoscrolls(true);
					centroactividadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						centroactividadBeanSwingJInternalFrame.actualizarEstadoPanelsCentroActividad("relacionado");
					} else {
						centroactividadBeanSwingJInternalFrame.actualizarEstadoPanelsCentroActividad("no_relacionado");
					}

					centroactividadBeanSwingJInternalFrame.getjButtonRecargarInformacionCentroActividad().setVisible(false);

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
