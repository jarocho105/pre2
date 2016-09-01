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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoIdentificacionConstantesFunciones;

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
public class TipoIdentificacionDetalleFormJInternalFrame extends TipoIdentificacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoIdentificacion;
	
	protected JMenuBar jmenuBarDetalleTipoIdentificacion;
	
	protected JMenu jmenuDetalleTipoIdentificacion;
	protected JMenu jmenuDetalleArchivoTipoIdentificacion;
	protected JMenu jmenuDetalleAccionesTipoIdentificacion;
	protected JMenu jmenuDetalleDatosTipoIdentificacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIdentificacion;	
	protected GridBagConstraints gridBagConstraintsTipoIdentificacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoIdentificacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoIdentificacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	
	

	public ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFrame=null;
	public ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConyuge=false;
	public ConyugeSessionBean conyugeSessionBean;

	public CobradorBeanSwingJInternalFrame cobradorBeanSwingJInternalFrame=null;
	public CobradorBeanSwingJInternalFrame cobradorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCobrador=false;
	public CobradorSessionBean cobradorSessionBean;

	public RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFrame=null;
	public RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRepresentanteLegal=false;
	public RepresentanteLegalSessionBean representantelegalSessionBean;

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;

	public AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFrame=null;
	public AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAccionista=false;
	public AccionistaSessionBean accionistaSessionBean;

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
		
	
	public TipoIdentificacionLogic tipoidentificacionLogic;
	
	public JScrollPane jScrollPanelDatosTipoIdentificacion;
	public JScrollPane jScrollPanelDatosEdicionTipoIdentificacion;
	public JScrollPane jScrollPanelDatosGeneralTipoIdentificacion;
	
	protected JPanel jPanelCamposTipoIdentificacion;    
	protected JPanel jPanelCamposOcultosTipoIdentificacion;    	
	protected JPanel jPanelAccionesTipoIdentificacion;
	protected JPanel jPanelAccionesFormularioTipoIdentificacion;
    
	
	
	protected Integer iXPanelCamposTipoIdentificacion=0;
	protected Integer iYPanelCamposTipoIdentificacion=0;
	
	protected Integer iXPanelCamposOcultosTipoIdentificacion=0;
	protected Integer iYPanelCamposOcultosTipoIdentificacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoIdentificacion;
	public JButton jButtonModificarTipoIdentificacion;
	public JButton jButtonActualizarTipoIdentificacion;
    public JButton jButtonEliminarTipoIdentificacion;
	public JButton jButtonCancelarTipoIdentificacion;
    public JButton jButtonGuardarCambiosTipoIdentificacion;
	public JButton jButtonGuardarCambiosTablaTipoIdentificacion;
	protected JButton jButtonCerrarTipoIdentificacion;
	
	
	protected JButton jButtonProcesarInformacionTipoIdentificacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoIdentificacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoIdentificacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoIdentificacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIdentificacion;
	protected JButton jButtonModificarToolBarTipoIdentificacion;
	protected JButton jButtonActualizarToolBarTipoIdentificacion;
    protected JButton jButtonEliminarToolBarTipoIdentificacion;
	protected JButton jButtonCancelarToolBarTipoIdentificacion;
    protected JButton jButtonGuardarCambiosToolBarTipoIdentificacion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoIdentificacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIdentificacion;
	protected JButton jButtonCerrarToolBarTipoIdentificacion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoIdentificacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIdentificacion;
	protected JMenuItem jMenuItemModificarTipoIdentificacion;
	protected JMenuItem jMenuItemActualizarTipoIdentificacion;
    protected JMenuItem jMenuItemEliminarTipoIdentificacion;
	protected JMenuItem jMenuItemCancelarTipoIdentificacion;
    protected JMenuItem jMenuItemGuardarCambiosTipoIdentificacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIdentificacion;
	protected JMenuItem jMenuItemCerrarTipoIdentificacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoIdentificacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIdentificacion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoIdentificacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIdentificacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoIdentificacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIdentificacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIdentificacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIdentificacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoIdentificacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoIdentificacion;
	public JLabel jLabelIdTipoIdentificacion;
	public JTextFieldMe jTextFieldidTipoIdentificacion;
	public JButton jButtonidTipoIdentificacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoIdentificacion;
	public JLabel jLabelcodigoTipoIdentificacion;
	public JTextField jTextFieldcodigoTipoIdentificacion;
	public JButton jButtoncodigoTipoIdentificacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoIdentificacion;
	public JLabel jLabelnombreTipoIdentificacion;
	public JTextArea jTextAreanombreTipoIdentificacion;
	public JScrollPane jscrollPanenombreTipoIdentificacion;
	public JButton jButtonnombreTipoIdentificacionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoIdentificacion;
	
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
	
	public TipoIdentificacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoIdentificacion=new JPanel();
				this.jPanelAccionesFormularioTipoIdentificacion=new JPanel();
				this.jmenuBarDetalleTipoIdentificacion=new JMenuBar();
				this.jTtoolBarDetalleTipoIdentificacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoIdentificacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIdentificacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIdentificacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoIdentificacion() {
		return this.jButtonActualizarToolBarTipoIdentificacion;
	}
	
	public JButton getjButtonEliminarToolBarTipoIdentificacion() {
		return this.jButtonEliminarToolBarTipoIdentificacion;
	}
	
	public JButton getjButtonCancelarToolBarTipoIdentificacion() {
		return this.jButtonCancelarToolBarTipoIdentificacion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoIdentificacion() {
		return this.jButtonProcesarInformacionTipoIdentificacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIdentificacion)	{
		this.jButtonProcesarInformacionTipoIdentificacion = jButtonProcesarInformacionTipoIdentificacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIdentificacion() {
		return this.jComboBoxTiposAccionesTipoIdentificacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIdentificacion(
			JComboBox jComboBoxTiposRelacionesTipoIdentificacion) {
		this.jComboBoxTiposRelacionesTipoIdentificacion = jComboBoxTiposRelacionesTipoIdentificacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIdentificacion(
			JComboBox jComboBoxTiposAccionesTipoIdentificacion) {
		this.jComboBoxTiposAccionesTipoIdentificacion = jComboBoxTiposAccionesTipoIdentificacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoIdentificacion() {
		return this.jComboBoxTiposAccionesFormularioTipoIdentificacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoIdentificacion(
			JComboBox jComboBoxTiposAccionesFormularioTipoIdentificacion) {
		this.jComboBoxTiposAccionesFormularioTipoIdentificacion = jComboBoxTiposAccionesFormularioTipoIdentificacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoidentificacionSessionBean=new TipoIdentificacionSessionBean();
		
		this.tipoidentificacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoidentificacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoidentificacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.conyugeSessionBean=new ConyugeSessionBean();
		//this.cobradorSessionBean=new CobradorSessionBean();
		//this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		//this.subclienteSessionBean=new SubClienteSessionBean();
		//this.accionistaSessionBean=new AccionistaSessionBean();
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIdentificacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Identificacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoIdentificacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoIdentificacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoIdentificacion=new JButtonMe();
				this.jButtonModificarToolBarTipoIdentificacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoIdentificacion,this.jTtoolBarDetalleTipoIdentificacion,
							"actualizar","actualizar","Actualizar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoIdentificacion,this.jTtoolBarDetalleTipoIdentificacion,
							"eliminar","eliminar","Eliminar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoIdentificacion,this.jTtoolBarDetalleTipoIdentificacion,
							"cancelar","cancelar","Cancelar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoIdentificacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoIdentificacion,this.jTtoolBarDetalleTipoIdentificacion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoIdentificacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoIdentificacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoIdentificacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoIdentificacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoIdentificacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIdentificacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIdentificacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIdentificacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoIdentificacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoIdentificacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoIdentificacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoIdentificacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoIdentificacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoIdentificacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoIdentificacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoIdentificacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoIdentificacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoIdentificacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoIdentificacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoIdentificacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoIdentificacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIdentificacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIdentificacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIdentificacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIdentificacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIdentificacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoIdentificacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoIdentificacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoIdentificacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIdentificacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIdentificacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIdentificacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIdentificacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIdentificacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIdentificacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoIdentificacion.add(this.jMenuItemDetalleCerrarTipoIdentificacion);
		
		this.jmenuDetalleAccionesTipoIdentificacion.add(this.jMenuItemActualizarTipoIdentificacion);
		this.jmenuDetalleAccionesTipoIdentificacion.add(this.jMenuItemEliminarTipoIdentificacion);
		this.jmenuDetalleAccionesTipoIdentificacion.add(this.jMenuItemCancelarTipoIdentificacion);		
		
		//this.jmenuDetalleDatosTipoIdentificacion.add(this.jMenuItemDetalleAbrirOrderByTipoIdentificacion);				
		this.jmenuDetalleDatosTipoIdentificacion.add(this.jMenuItemDetalleMostarOcultarTipoIdentificacion);				
				
		//this.jmenuDetalleAccionesTipoIdentificacion.add(this.jMenuItemGuardarCambiosTipoIdentificacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoIdentificacion.add(this.jmenuDetalleArchivoTipoIdentificacion);		
		this.jmenuBarDetalleTipoIdentificacion.add(this.jmenuDetalleAccionesTipoIdentificacion);		
		this.jmenuBarDetalleTipoIdentificacion.add(this.jmenuDetalleDatosTipoIdentificacion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoIdentificacion.add(this.jmenuDetalleTipoIdentificacion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoIdentificacion);				
	}
	
	
	public void inicializarElementosCamposTipoIdentificacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoIdentificacion = new JLabelMe();
		jLabelIdTipoIdentificacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoIdentificacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoIdentificacion.setToolTipText(TipoIdentificacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoIdentificacion= new GridBagLayout();

		this.jPanelidTipoIdentificacion.setLayout(this.gridaBagLayoutTipoIdentificacion);

		jTextFieldidTipoIdentificacion = new JTextFieldMe();
		jTextFieldidTipoIdentificacion.setText("Id");

		jTextFieldidTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoIdentificacion = new JLabelMe();
		this.jLabelcodigoTipoIdentificacion.setText(""+TipoIdentificacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoIdentificacion.setToolTipText("Codigo");
		this.jLabelcodigoTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoIdentificacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoIdentificacion.setToolTipText(TipoIdentificacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoIdentificacion = new GridBagLayout();
		this.jPanelcodigoTipoIdentificacion.setLayout(this.gridaBagLayoutTipoIdentificacion);


		jTextFieldcodigoTipoIdentificacion= new JTextFieldMe();

		jTextFieldcodigoTipoIdentificacion.setEnabled(false);
		jTextFieldcodigoTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoIdentificacionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoIdentificacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoIdentificacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoIdentificacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoIdentificacionBusqueda.setText("U");
		this.jButtoncodigoTipoIdentificacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoIdentificacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoIdentificacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoIdentificacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoIdentificacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoIdentificacionBusqueda"));

		if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoIdentificacionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoIdentificacion = new JLabelMe();
		this.jLabelnombreTipoIdentificacion.setText(""+TipoIdentificacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoIdentificacion.setToolTipText("Nombre");
		this.jLabelnombreTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoIdentificacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoIdentificacion.setToolTipText(TipoIdentificacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoIdentificacion = new GridBagLayout();
		this.jPanelnombreTipoIdentificacion.setLayout(this.gridaBagLayoutTipoIdentificacion);


		jTextAreanombreTipoIdentificacion= new JTextAreaMe();
		jTextAreanombreTipoIdentificacion.setEnabled(false);
		jTextAreanombreTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIdentificacion.setLineWrap(true);
		jTextAreanombreTipoIdentificacion.setWrapStyleWord(true);
		jTextAreanombreTipoIdentificacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoIdentificacion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoIdentificacion = new JScrollPane(jTextAreanombreTipoIdentificacion);
		jscrollPanenombreTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoIdentificacionBusqueda= new JButtonMe();
		this.jButtonnombreTipoIdentificacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIdentificacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIdentificacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoIdentificacionBusqueda.setText("U");
		this.jButtonnombreTipoIdentificacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoIdentificacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoIdentificacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoIdentificacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoIdentificacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoIdentificacionBusqueda"));

		if(this.tipoidentificacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoIdentificacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoIdentificacion() {
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
		//this.jInternalFrameDetalleTipoIdentificacion = new TipoIdentificacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Identificacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIdentificacion= new GridBagLayout();
		

		
		String sToolTipTipoIdentificacion="";
		sToolTipTipoIdentificacion=TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIdentificacion+="(Cartera.TipoIdentificacion)";
		}
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIdentificacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoIdentificacion = new JButtonMe();
		this.jButtonModificarTipoIdentificacion = new JButtonMe();
        this.jButtonActualizarTipoIdentificacion = new JButtonMe();
        this.jButtonEliminarTipoIdentificacion = new JButtonMe();
        this.jButtonCancelarTipoIdentificacion = new JButtonMe();
        this.jButtonGuardarCambiosTipoIdentificacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoIdentificacion = new JButtonMe();
		this.jButtonCerrarTipoIdentificacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoIdentificacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoIdentificacion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoIdentificacion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Identificacion";
		
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Identificaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIdentificacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoIdentificacion.setName("jPanelCamposTipoIdentificacion"); 

		this.jPanelCamposOcultosTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoIdentificacion.setName("jPanelCamposOcultosTipoIdentificacion"); 

        this.jPanelAccionesTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIdentificacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoIdentificacion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoIdentificacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoIdentificacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoIdentificacion.setText("Nuevo");
		this.jButtonModificarTipoIdentificacion.setText("Editar");
        this.jButtonActualizarTipoIdentificacion.setText("Actualizar");
        this.jButtonEliminarTipoIdentificacion.setText("Eliminar");
        this.jButtonCancelarTipoIdentificacion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoIdentificacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoIdentificacion.setText("Guardar");
		this.jButtonCerrarTipoIdentificacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIdentificacion,"nuevo_button","Nuevo",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoIdentificacion,"modificar_button","Editar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoIdentificacion,"actualizar_button","Actualizar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoIdentificacion,"eliminar_button","Eliminar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoIdentificacion,"cancelar_button","Cancelar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoIdentificacion,"guardarcambios_button","Guardar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIdentificacion,"guardarcambiostabla_button","Guardar",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIdentificacion,"cerrar_button","Salir",this.tipoidentificacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoIdentificacion.setToolTipText("Nuevo"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoIdentificacion.setToolTipText("Editar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoIdentificacion.setToolTipText("Actualizar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoIdentificacion.setToolTipText("Eliminar)"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoIdentificacion.setToolTipText("Cancelar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoIdentificacion.setToolTipText("Guardar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoIdentificacion.setToolTipText("Guardar"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIdentificacion.setToolTipText("Salir"+" "+TipoIdentificacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIdentificacion";
		inputMap = this.jButtonNuevoTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIdentificacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIdentificacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoIdentificacion";
		inputMap = this.jButtonActualizarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoIdentificacion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoIdentificacion";
		inputMap = this.jButtonEliminarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoIdentificacion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoIdentificacion";
		inputMap = this.jButtonCancelarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoIdentificacion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoIdentificacion";
		inputMap = this.jButtonCerrarTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIdentificacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIdentificacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoIdentificacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIdentificacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIdentificacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoIdentificacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoIdentificacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoIdentificacion.setToolTipText("Nuevo TipoIdentificacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoIdentificacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoIdentificacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoIdentificacion.setToolTipText("Sin Cerrar Ventana TipoIdentificacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoIdentificacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoIdentificacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoIdentificacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIdentificacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoIdentificacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoIdentificacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoIdentificacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoIdentificacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoIdentificacion = new JLabelMe();
		
		this.jLabelAccionesTipoIdentificacion.setText("Acciones");		
		this.jLabelAccionesTipoIdentificacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIdentificacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIdentificacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoIdentificacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoIdentificacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoIdentificacion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoIdentificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoIdentificacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoIdentificacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIdentificacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIdentificacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoIdentificacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIdentificacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIdentificacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoIdentificacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoIdentificacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoIdentificacion = new GridBagLayout();
		
		this.jPanelCamposTipoIdentificacion.setLayout(gridaBagLayoutCamposTipoIdentificacion);
		this.jPanelCamposOcultosTipoIdentificacion.setLayout(gridaBagLayoutCamposOcultosTipoIdentificacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIdentificacion.gridy = 0;
	this.gridBagConstraintsTipoIdentificacion.gridx = 0;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoIdentificacion.add(jLabelIdTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);



	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIdentificacion.gridy = 0;
	this.gridBagConstraintsTipoIdentificacion.gridx = 1;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoIdentificacion.add(jTextFieldidTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);


	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIdentificacion.gridy = 0;
	this.gridBagConstraintsTipoIdentificacion.gridx = 0;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoIdentificacion.add(jLabelcodigoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;
		this.gridBagConstraintsTipoIdentificacion.gridx = 2;
		this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
		this.gridBagConstraintsTipoIdentificacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoIdentificacion.add(jButtoncodigoTipoIdentificacionBusqueda, this.gridBagConstraintsTipoIdentificacion);
	}

	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIdentificacion.gridy = 0;
	this.gridBagConstraintsTipoIdentificacion.gridx = 1;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoIdentificacion.add(jTextFieldcodigoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);


	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIdentificacion.gridy = 0;
	this.gridBagConstraintsTipoIdentificacion.gridx = 0;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoIdentificacion.add(jLabelnombreTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;
		this.gridBagConstraintsTipoIdentificacion.gridx = 2;
		this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
		this.gridBagConstraintsTipoIdentificacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoIdentificacion.add(jButtonnombreTipoIdentificacionBusqueda, this.gridBagConstraintsTipoIdentificacion);
	}

	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIdentificacion.gridy = 0;
	this.gridBagConstraintsTipoIdentificacion.gridx = 1;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoIdentificacion.add(jscrollPanenombreTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIdentificacion.gridy = iYPanelCamposTipoIdentificacion;
	this.gridBagConstraintsTipoIdentificacion.gridx = iXPanelCamposTipoIdentificacion++;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIdentificacion.add(this.jPanelidTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);



	if(iXPanelCamposTipoIdentificacion % 1==0) {
		iXPanelCamposTipoIdentificacion=0;
		iYPanelCamposTipoIdentificacion++;
	}
	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIdentificacion.gridy = iYPanelCamposTipoIdentificacion;
	this.gridBagConstraintsTipoIdentificacion.gridx = iXPanelCamposTipoIdentificacion++;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIdentificacion.add(this.jPanelcodigoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);



	if(iXPanelCamposTipoIdentificacion % 1==0) {
		iXPanelCamposTipoIdentificacion=0;
		iYPanelCamposTipoIdentificacion++;
	}
	this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIdentificacion.gridy = iYPanelCamposTipoIdentificacion;
	this.gridBagConstraintsTipoIdentificacion.gridx = iXPanelCamposTipoIdentificacion++;
	this.gridBagConstraintsTipoIdentificacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIdentificacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIdentificacion.add(this.jPanelnombreTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);



	if(iXPanelCamposTipoIdentificacion % 1==0) {
		iXPanelCamposTipoIdentificacion=0;
		iYPanelCamposTipoIdentificacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoIdentificacion= new GridBagLayout();
		this.jPanelAccionesTipoIdentificacion.setLayout(gridaBagLayoutAccionesTipoIdentificacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoIdentificacion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoIdentificacion.setLayout(gridaBagLayoutAccionesFormularioTipoIdentificacion);
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIdentificacion.add(this.jComboBoxTiposAccionesFormularioTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);

		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIdentificacion.add(this.jCheckBoxPostAccionNuevoTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIdentificacion.add(this.jCheckBoxPostAccionSinCerrarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoidentificacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoidentificacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIdentificacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIdentificacion.add(this.jCheckBoxPostAccionSinMensajeTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoIdentificacion.add(this.jButtonModificarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);							

		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;
		this.gridBagConstraintsTipoIdentificacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoIdentificacion.add(this.jButtonEliminarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
			
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIdentificacion.add(this.jButtonActualizarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);


		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;		
		this.gridBagConstraintsTipoIdentificacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIdentificacion.add(this.jButtonGuardarCambiosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);	
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = 0;		
		this.gridBagConstraintsTipoIdentificacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoIdentificacion.add(this.jButtonCancelarTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIdentificacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIdentificacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoidentificacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIdentificacion.gridx = 0;		
			//this.gridBagConstraintsTipoIdentificacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIdentificacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIdentificacion.gridx =0;
		this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIdentificacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoIdentificacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoIdentificacion = new TipoIdentificacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Identificacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Identificacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Identificacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoIdentificacionModel tipoidentificacionModel=new TipoIdentificacionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoIdentificacionModel.TipoIdentificacionFocusTraversalPolicy tipoidentificacionFocusTraversalPolicy = tipoidentificacionModel.new TipoIdentificacionFocusTraversalPolicy(this);
			
			//tipoidentificacionFocusTraversalPolicy.settipoidentificacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoidentificacionModel);
			
			
			this.jContentPaneDetalleTipoIdentificacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoIdentificacion = new GridBagLayout();	
			this.jContentPaneDetalleTipoIdentificacion.setLayout(gridaBagLayoutDetalleTipoIdentificacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIdentificacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoIdentificacion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoIdentificacion.add(jTtoolBarDetalleTipoIdentificacion, gridBagConstraintsTipoIdentificacion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoIdentificacion=   new JScrollPane(jContentPaneDetalleTipoIdentificacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIdentificacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIdentificacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIdentificacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoIdentificacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIdentificacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIdentificacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIdentificacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoIdentificacion.gridx = 0;
	        
			this.jContentPaneDetalleTipoIdentificacion.add(jPanelCamposTipoIdentificacion, gridBagConstraintsTipoIdentificacion);
			
			
			
			
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
						&& tipoidentificacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAccionista(this.puedeCargarPorParteAccionista,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCobrador(this.puedeCargarPorParteCobrador,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConyuge(this.puedeCargarPorParteConyuge,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(this.puedeCargarPorParteRepresentanteLegal,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					
					if(this.tipoidentificacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoIdentificacion= new GridBagConstraints();
						this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoIdentificacion.gridx = 0;
						this.jContentPaneDetalleTipoIdentificacion.add(this.jTabbedPaneRelacionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoIdentificacion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAccionista(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCobrador(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameConyuge(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoIdentificacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
					this.gridBagConstraintsTipoIdentificacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoIdentificacion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoIdentificacion.add(jPanelCamposOcultosTipoIdentificacion, gridBagConstraintsTipoIdentificacion);
				
					this.jPanelCamposOcultosTipoIdentificacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;//22;		
	        this.gridBagConstraintsTipoIdentificacion.gridx = 0;
	        this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoIdentificacion.add(this.jPanelAccionesFormularioTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);							
			
			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
	        this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones;//22;		
	        this.gridBagConstraintsTipoIdentificacion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoIdentificacion.add(this.jPanelAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoIdentificacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoIdentificacion=   new JScrollPane(this.jPanelCamposTipoIdentificacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIdentificacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIdentificacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIdentificacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoIdentificacion.gridx = 0;
			this.gridBagConstraintsTipoIdentificacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoIdentificacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoIdentificacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIdentificacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);			
			
			this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
			this.gridBagConstraintsTipoIdentificacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIdentificacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
			
			
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		
			
		this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
		this.gridBagConstraintsTipoIdentificacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIdentificacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIdentificacion, this.gridBagConstraintsTipoIdentificacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoIdentificacion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoIdentificacion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAccionista(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.accionistaSessionBean=new AccionistaSessionBean();
		this.accionistaSessionBean.setConGuardarRelaciones(false);
		this.accionistaSessionBean.setEsGuardarRelacionado(true);

		this.accionistaBeanSwingJInternalFrame=null;//new AccionistaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.accionistaBeanSwingJInternalFramePopup=new AccionistaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.accionistaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {

				AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				AccionistaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.accionistaSessionBean.setEsGuardarRelacionado(true);

				this.accionistaBeanSwingJInternalFrame=new AccionistaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.accionistaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.accionistaBeanSwingJInternalFrame.setaccionistaSessionBean(this.accionistaSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.accionistaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Accionistas",this.accionistaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.accionistaBeanSwingJInternalFrame.getContentPane());
				}

				//AccionistaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.accionistaSessionBean.setEsGuardarRelacionado(false);
				this.accionistaBeanSwingJInternalFrame=null;//new AccionistaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.accionistaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAccionista) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Accionistas",new JPanel());
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCobrador(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cobradorSessionBean=new CobradorSessionBean();
		this.cobradorSessionBean.setConGuardarRelaciones(false);
		this.cobradorSessionBean.setEsGuardarRelacionado(true);

		this.cobradorBeanSwingJInternalFrame=null;//new CobradorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cobradorBeanSwingJInternalFramePopup=new CobradorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cobradorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cobradorSessionBean.getEsGuardarRelacionado()) {

				CobradorJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				CobradorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cobradorSessionBean.setEsGuardarRelacionado(true);

				this.cobradorBeanSwingJInternalFrame=new CobradorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cobradorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cobradorBeanSwingJInternalFrame.setcobradorSessionBean(this.cobradorSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.cobradorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Cobradores",this.cobradorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.cobradorBeanSwingJInternalFrame.getContentPane());
				}

				//CobradorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cobradorSessionBean.setEsGuardarRelacionado(false);
				this.cobradorBeanSwingJInternalFrame=null;//new CobradorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cobradorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCobrador) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Cobradores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameConyuge(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.conyugeSessionBean=new ConyugeSessionBean();
		this.conyugeSessionBean.setConGuardarRelaciones(false);
		this.conyugeSessionBean.setEsGuardarRelacionado(true);

		this.conyugeBeanSwingJInternalFrame=null;//new ConyugeBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.conyugeBeanSwingJInternalFramePopup=new ConyugeBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.conyugeBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {

				ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.conyugeSessionBean.setEsGuardarRelacionado(true);

				this.conyugeBeanSwingJInternalFrame=new ConyugeBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.conyugeBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.conyugeBeanSwingJInternalFrame.setconyugeSessionBean(this.conyugeSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.conyugeBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Conyuges",this.conyugeBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.conyugeBeanSwingJInternalFrame.getContentPane());
				}

				//ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.conyugeSessionBean.setEsGuardarRelacionado(false);
				this.conyugeBeanSwingJInternalFrame=null;//new ConyugeBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConyuge) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Conyuges",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRepresentanteLegal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.representantelegalSessionBean=new RepresentanteLegalSessionBean();
		this.representantelegalSessionBean.setConGuardarRelaciones(false);
		this.representantelegalSessionBean.setEsGuardarRelacionado(true);

		this.representantelegalBeanSwingJInternalFrame=null;//new RepresentanteLegalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.representantelegalBeanSwingJInternalFramePopup=new RepresentanteLegalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.representantelegalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {

				RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				RepresentanteLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.representantelegalSessionBean.setEsGuardarRelacionado(true);

				this.representantelegalBeanSwingJInternalFrame=new RepresentanteLegalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.representantelegalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.representantelegalBeanSwingJInternalFrame.setrepresentantelegalSessionBean(this.representantelegalSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.representantelegalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Representante Legales",this.representantelegalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.representantelegalBeanSwingJInternalFrame.getContentPane());
				}

				//RepresentanteLegalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.representantelegalSessionBean.setEsGuardarRelacionado(false);
				this.representantelegalBeanSwingJInternalFrame=null;//new RepresentanteLegalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.representantelegalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRepresentanteLegal) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Representante Legales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIdentificacionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsTipoIdentificacion = new GridBagConstraints();
				//this.gridBagConstraintsTipoIdentificacion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIdentificacion.gridx = 0;
				//this.jContentPaneDetalleTipoIdentificacion.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIdentificacion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIdentificacion.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesTipoIdentificacion.add("Sub Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarConyugeBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,ConyugeBeanSwingJInternalFrame conyugeBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//conyugeBeanSwingJInternalFrame=new ConyugeBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					conyugeBeanSwingJInternalFrame.getConyugeLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					conyugeBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					conyugeBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					conyugeBeanSwingJInternalFrame.conyugeSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					conyugeBeanSwingJInternalFrame.conyugeSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					conyugeBeanSwingJInternalFrame.cargarCombosForeignKeyConyuge(conyugeBeanSwingJInternalFrame.isCargarCombosDependencia);
					conyugeBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					conyugeBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					conyugeBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					conyugeBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
					conyugeBeanSwingJInternalFrame.inicializarActualizarBindingTablaConyuge(true);
					conyugeBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConyuge("n",conyugeBeanSwingJInternalFrame.isGuardarCambiosEnLote, conyugeBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					conyugeBeanSwingJInternalFrame.inicializarActualizarBindingConyuge(false);
					conyugeBeanSwingJInternalFrame.setAutoscrolls(true);
					conyugeBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						conyugeBeanSwingJInternalFrame.actualizarEstadoPanelsConyuge("relacionado");
					} else {
						conyugeBeanSwingJInternalFrame.actualizarEstadoPanelsConyuge("no_relacionado");
					}

					conyugeBeanSwingJInternalFrame.getjButtonRecargarInformacionConyuge().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCobradorBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,CobradorBeanSwingJInternalFrame cobradorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cobradorBeanSwingJInternalFrame=new CobradorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cobradorBeanSwingJInternalFrame.getCobradorLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					cobradorBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					cobradorBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					cobradorBeanSwingJInternalFrame.cobradorSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					cobradorBeanSwingJInternalFrame.cobradorSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cobradorBeanSwingJInternalFrame.cargarCombosForeignKeyCobrador(cobradorBeanSwingJInternalFrame.isCargarCombosDependencia);
					cobradorBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					cobradorBeanSwingJInternalFrame.setid_tipo_identificacionFK_IdTipoIdentificacion(tipoidentificacion.getId());

					if(!this.conCargarFormDetalle) {
						cobradorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cobradorBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIdentificacionForeignKey(tipoidentificacion,1,false,true,true);
					cobradorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cobradorBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					cobradorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
					cobradorBeanSwingJInternalFrame.inicializarActualizarBindingTablaCobrador(true);
					cobradorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCobrador("n",cobradorBeanSwingJInternalFrame.isGuardarCambiosEnLote, cobradorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cobradorBeanSwingJInternalFrame.setAutoscrolls(true);
					cobradorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cobradorBeanSwingJInternalFrame.actualizarEstadoPanelsCobrador("relacionado");
					} else {
						cobradorBeanSwingJInternalFrame.actualizarEstadoPanelsCobrador("no_relacionado");
					}

					cobradorBeanSwingJInternalFrame.getjButtonRecargarInformacionCobrador().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRepresentanteLegalBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,RepresentanteLegalBeanSwingJInternalFrame representantelegalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//representantelegalBeanSwingJInternalFrame=new RepresentanteLegalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					representantelegalBeanSwingJInternalFrame.getRepresentanteLegalLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					representantelegalBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					representantelegalBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					representantelegalBeanSwingJInternalFrame.representantelegalSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					representantelegalBeanSwingJInternalFrame.cargarCombosForeignKeyRepresentanteLegal(representantelegalBeanSwingJInternalFrame.isCargarCombosDependencia);
					representantelegalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					representantelegalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					representantelegalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					representantelegalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
					representantelegalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRepresentanteLegal(true);
					representantelegalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRepresentanteLegal("n",representantelegalBeanSwingJInternalFrame.isGuardarCambiosEnLote, representantelegalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					representantelegalBeanSwingJInternalFrame.setAutoscrolls(true);
					representantelegalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						representantelegalBeanSwingJInternalFrame.actualizarEstadoPanelsRepresentanteLegal("relacionado");
					} else {
						representantelegalBeanSwingJInternalFrame.actualizarEstadoPanelsRepresentanteLegal("no_relacionado");
					}

					representantelegalBeanSwingJInternalFrame.getjButtonRecargarInformacionRepresentanteLegal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubClienteBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					subclienteBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					subclienteBeanSwingJInternalFrame.setid_tipo_identificacionFK_IdTipoIdentificacion(tipoidentificacion.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIdentificacionForeignKey(tipoidentificacion,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAccionistaBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,AccionistaBeanSwingJInternalFrame accionistaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//accionistaBeanSwingJInternalFrame=new AccionistaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					accionistaBeanSwingJInternalFrame.getAccionistaLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					accionistaBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					accionistaBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					accionistaBeanSwingJInternalFrame.accionistaSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					accionistaBeanSwingJInternalFrame.accionistaSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					accionistaBeanSwingJInternalFrame.cargarCombosForeignKeyAccionista(accionistaBeanSwingJInternalFrame.isCargarCombosDependencia);
					accionistaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					accionistaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					accionistaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					accionistaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
					accionistaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAccionista(true);
					accionistaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAccionista("n",accionistaBeanSwingJInternalFrame.isGuardarCambiosEnLote, accionistaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					accionistaBeanSwingJInternalFrame.setAutoscrolls(true);
					accionistaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						accionistaBeanSwingJInternalFrame.actualizarEstadoPanelsAccionista("relacionado");
					} else {
						accionistaBeanSwingJInternalFrame.actualizarEstadoPanelsAccionista("no_relacionado");
					}

					accionistaBeanSwingJInternalFrame.getjButtonRecargarInformacionAccionista().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					clienteBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					clienteBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					clienteBeanSwingJInternalFrame.setid_tipo_identificacionFK_IdTipoIdentificacion(tipoidentificacion.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIdentificacionForeignKey(tipoidentificacion,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
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

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<TipoIdentificacion> tipoidentificacions,TipoIdentificacion tipoidentificacion,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.tipoidentificacionLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.settipoidentificacionsForeignKey(tipoidentificacions);
					parametrocarteradefectoBeanSwingJInternalFrame.settipoidentificacionForeignKey(tipoidentificacion);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoIdentificacion(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidTipoIdentificacionActual(tipoidentificacion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIdentificacion(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_tipo_identificacionFK_IdTipoIdentificacion(tipoidentificacion.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIdentificacionForeignKey(tipoidentificacion,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIdentificacion");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIdentificacion");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

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
