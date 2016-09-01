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



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.puntoventa.util.ConexionConstantesFunciones;

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
public class ConexionDetalleFormJInternalFrame extends ConexionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConexion;
	
	protected JMenuBar jmenuBarDetalleConexion;
	
	protected JMenu jmenuDetalleConexion;
	protected JMenu jmenuDetalleArchivoConexion;
	protected JMenu jmenuDetalleAccionesConexion;
	protected JMenu jmenuDetalleDatosConexion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConexion;	
	protected GridBagConstraints gridBagConstraintsConexion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConexionBeanSwingJInternalFrameAdditional jInternalFrameDetalleConexion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoConexionBeanSwingJInternalFrame tipoconexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoconexion="";
	
	public ConexionSessionBean conexionSessionBean;
	
	

	public TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFrame=null;
	public TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTarjetaCreditoConexion=false;
	public TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean;

	public NumeroRecapBeanSwingJInternalFrame numerorecapBeanSwingJInternalFrame=null;
	public NumeroRecapBeanSwingJInternalFrame numerorecapBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNumeroRecap=false;
	public NumeroRecapSessionBean numerorecapSessionBean;

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
	
	public TipoConexionSessionBean tipoconexionSessionBean;	
	
	public ConexionLogic conexionLogic;
	
	public JScrollPane jScrollPanelDatosConexion;
	public JScrollPane jScrollPanelDatosEdicionConexion;
	public JScrollPane jScrollPanelDatosGeneralConexion;
	
	protected JPanel jPanelCamposConexion;    
	protected JPanel jPanelCamposOcultosConexion;    	
	protected JPanel jPanelAccionesConexion;
	protected JPanel jPanelAccionesFormularioConexion;
    
	
	
	protected Integer iXPanelCamposConexion=0;
	protected Integer iYPanelCamposConexion=0;
	
	protected Integer iXPanelCamposOcultosConexion=0;
	protected Integer iYPanelCamposOcultosConexion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConexion;
	public JButton jButtonModificarConexion;
	public JButton jButtonActualizarConexion;
    public JButton jButtonEliminarConexion;
	public JButton jButtonCancelarConexion;
    public JButton jButtonGuardarCambiosConexion;
	public JButton jButtonGuardarCambiosTablaConexion;
	protected JButton jButtonCerrarConexion;
	
	
	protected JButton jButtonProcesarInformacionConexion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConexion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConexion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConexion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConexion;
	protected JButton jButtonModificarToolBarConexion;
	protected JButton jButtonActualizarToolBarConexion;
    protected JButton jButtonEliminarToolBarConexion;
	protected JButton jButtonCancelarToolBarConexion;
    protected JButton jButtonGuardarCambiosToolBarConexion;
	protected JButton jButtonGuardarCambiosTablaToolBarConexion;
	protected JButton jButtonMostrarOcultarTablaToolBarConexion;
	protected JButton jButtonCerrarToolBarConexion;
	
	protected JButton jButtonProcesarInformacionToolBarConexion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConexion;
	protected JMenuItem jMenuItemModificarConexion;
	protected JMenuItem jMenuItemActualizarConexion;
    protected JMenuItem jMenuItemEliminarConexion;
	protected JMenuItem jMenuItemCancelarConexion;
    protected JMenuItem jMenuItemGuardarCambiosConexion;
	protected JMenuItem jMenuItemGuardarCambiosTablaConexion;
	protected JMenuItem jMenuItemCerrarConexion;
	protected JMenuItem jMenuItemDetalleCerrarConexion;
	protected JMenuItem jMenuItemDetalleMostarOcultarConexion;
	
	protected JMenuItem jMenuItemProcesarInformacionConexion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConexion;
	protected JMenuItem jMenuItemMostrarOcultarConexion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConexion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConexion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConexion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConexion;
	public JLabel jLabelIdConexion;
	public JLabel jLabelidConexion;
	public JButton jButtonidConexionBusqueda= new JButtonMe();

	public JPanel jPanelnombreConexion;
	public JLabel jLabelnombreConexion;
	public JTextArea jTextAreanombreConexion;
	public JScrollPane jscrollPanenombreConexion;
	public JButton jButtonnombreConexionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_maquinaConexion;
	public JLabel jLabelnombre_maquinaConexion;
	public JTextArea jTextAreanombre_maquinaConexion;
	public JScrollPane jscrollPanenombre_maquinaConexion;
	public JButton jButtonnombre_maquinaConexionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_conexionConexion;
	public JLabel jLabelid_tipo_conexionConexion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_conexionConexion;
	public JButton jButtonid_tipo_conexionConexion= new JButtonMe();
	public JButton jButtonid_tipo_conexionConexionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_conexionConexionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConexion;
	
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
	
	public ConexionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConexion=new JPanel();
				this.jPanelAccionesFormularioConexion=new JPanel();
				this.jmenuBarDetalleConexion=new JMenuBar();
				this.jTtoolBarDetalleConexion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConexionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConexionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Conexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConexion() {
		return this.jButtonActualizarToolBarConexion;
	}
	
	public JButton getjButtonEliminarToolBarConexion() {
		return this.jButtonEliminarToolBarConexion;
	}
	
	public JButton getjButtonCancelarToolBarConexion() {
		return this.jButtonCancelarToolBarConexion;
	}		
	
	public JButton getjButtonProcesarInformacionConexion() {
		return this.jButtonProcesarInformacionConexion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConexion)	{
		this.jButtonProcesarInformacionConexion = jButtonProcesarInformacionConexion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConexion() {
		return this.jComboBoxTiposAccionesConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConexion(
			JComboBox jComboBoxTiposRelacionesConexion) {
		this.jComboBoxTiposRelacionesConexion = jComboBoxTiposRelacionesConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConexion(
			JComboBox jComboBoxTiposAccionesConexion) {
		this.jComboBoxTiposAccionesConexion = jComboBoxTiposAccionesConexion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConexion() {
		return this.jComboBoxTiposAccionesFormularioConexion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConexion(
			JComboBox jComboBoxTiposAccionesFormularioConexion) {
		this.jComboBoxTiposAccionesFormularioConexion = jComboBoxTiposAccionesFormularioConexion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.conexionSessionBean=new ConexionSessionBean();
		
		this.conexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conexionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		//this.numerorecapSessionBean=new NumeroRecapSessionBean();
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConexionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConexionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conexion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
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
	
		ConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConexion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConexion=new JButtonMe();
				this.jButtonModificarToolBarConexion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConexion,this.jTtoolBarDetalleConexion,
							"actualizar","actualizar","Actualizar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConexion,this.jTtoolBarDetalleConexion,
							"eliminar","eliminar","Eliminar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConexion,this.jTtoolBarDetalleConexion,
							"cancelar","cancelar","Cancelar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConexion,this.jTtoolBarDetalleConexion,
							"guardarcambios","guardarcambios","Guardar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConexion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConexion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConexion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConexion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConexion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConexion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConexion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConexion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConexion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConexion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConexion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConexion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConexion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConexion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConexion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConexion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConexion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConexion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConexion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConexion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConexion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConexion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConexion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConexion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConexion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConexion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConexion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConexion.add(this.jMenuItemDetalleCerrarConexion);
		
		this.jmenuDetalleAccionesConexion.add(this.jMenuItemActualizarConexion);
		this.jmenuDetalleAccionesConexion.add(this.jMenuItemEliminarConexion);
		this.jmenuDetalleAccionesConexion.add(this.jMenuItemCancelarConexion);		
		
		//this.jmenuDetalleDatosConexion.add(this.jMenuItemDetalleAbrirOrderByConexion);				
		this.jmenuDetalleDatosConexion.add(this.jMenuItemDetalleMostarOcultarConexion);				
				
		//this.jmenuDetalleAccionesConexion.add(this.jMenuItemGuardarCambiosConexion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConexion.add(this.jmenuDetalleArchivoConexion);		
		this.jmenuBarDetalleConexion.add(this.jmenuDetalleAccionesConexion);		
		this.jmenuBarDetalleConexion.add(this.jmenuDetalleDatosConexion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleConexion.add(this.jmenuDetalleConexion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConexion);				
	}
	
	
	public void inicializarElementosCamposConexion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConexion = new JLabelMe();
		jLabelIdConexion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConexion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConexion.setToolTipText(ConexionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConexion= new GridBagLayout();

		this.jPanelidConexion.setLayout(this.gridaBagLayoutConexion);

		jLabelidConexion = new JLabel();
		jLabelidConexion.setText("Id");

		jLabelidConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreConexion = new JLabelMe();
		this.jLabelnombreConexion.setText(""+ConexionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConexion.setToolTipText("Nombre");
		this.jLabelnombreConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConexion.setToolTipText(ConexionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConexion = new GridBagLayout();
		this.jPanelnombreConexion.setLayout(this.gridaBagLayoutConexion);


		jTextAreanombreConexion= new JTextAreaMe();
		jTextAreanombreConexion.setEnabled(false);
		jTextAreanombreConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConexion.setLineWrap(true);
		jTextAreanombreConexion.setWrapStyleWord(true);
		jTextAreanombreConexion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConexion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConexion = new JScrollPane(jTextAreanombreConexion);
		jscrollPanenombreConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConexionBusqueda= new JButtonMe();
		this.jButtonnombreConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConexionBusqueda.setText("U");
		this.jButtonnombreConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConexionBusqueda"));

		if(this.conexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConexionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_maquinaConexion = new JLabelMe();
		this.jLabelnombre_maquinaConexion.setText(""+ConexionConstantesFunciones.LABEL_NOMBREMAQUINA+" : *");
		this.jLabelnombre_maquinaConexion.setToolTipText("Nombre Maquina");
		this.jLabelnombre_maquinaConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_maquinaConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_maquinaConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_maquinaConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_maquinaConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_maquinaConexion.setToolTipText(ConexionConstantesFunciones.LABEL_NOMBREMAQUINA);
		this.gridaBagLayoutConexion = new GridBagLayout();
		this.jPanelnombre_maquinaConexion.setLayout(this.gridaBagLayoutConexion);


		jTextAreanombre_maquinaConexion= new JTextAreaMe();
		jTextAreanombre_maquinaConexion.setEnabled(false);
		jTextAreanombre_maquinaConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_maquinaConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_maquinaConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_maquinaConexion.setLineWrap(true);
		jTextAreanombre_maquinaConexion.setWrapStyleWord(true);
		jTextAreanombre_maquinaConexion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_maquinaConexion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_maquinaConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_maquinaConexion = new JScrollPane(jTextAreanombre_maquinaConexion);
		jscrollPanenombre_maquinaConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_maquinaConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_maquinaConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_maquinaConexionBusqueda= new JButtonMe();
		this.jButtonnombre_maquinaConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_maquinaConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_maquinaConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_maquinaConexionBusqueda.setText("U");
		this.jButtonnombre_maquinaConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_maquinaConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_maquinaConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_maquinaConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_maquinaConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_maquinaConexionBusqueda"));

		if(this.conexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_maquinaConexionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConexion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_conexionConexion = new JLabelMe();
		this.jLabelid_tipo_conexionConexion.setText(""+ConexionConstantesFunciones.LABEL_IDTIPOCONEXION+" : *");
		this.jLabelid_tipo_conexionConexion.setToolTipText("Tipo Conexion");
		this.jLabelid_tipo_conexionConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_conexionConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_conexionConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_conexionConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_conexionConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_conexionConexion.setToolTipText(ConexionConstantesFunciones.LABEL_IDTIPOCONEXION);
		this.gridaBagLayoutConexion = new GridBagLayout();
		this.jPanelid_tipo_conexionConexion.setLayout(this.gridaBagLayoutConexion);


		jComboBoxid_tipo_conexionConexion= new JComboBoxMe();
		jComboBoxid_tipo_conexionConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conexionConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_conexionConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_conexionConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_conexionConexion= new JButtonMe();
		this.jButtonid_tipo_conexionConexion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_conexionConexion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_conexionConexion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_conexionConexion.setText("Buscar");
		this.jButtonid_tipo_conexionConexion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_conexionConexion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_conexionConexion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_conexionConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_conexionConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_conexionConexion"));

		this.jButtonid_tipo_conexionConexionBusqueda= new JButtonMe();
		this.jButtonid_tipo_conexionConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conexionConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conexionConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_conexionConexionBusqueda.setText("U");
		this.jButtonid_tipo_conexionConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_conexionConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_conexionConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_conexionConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_conexionConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_conexionConexionBusqueda"));

		if(this.conexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_conexionConexionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_conexionConexionUpdate= new JButtonMe();
		this.jButtonid_tipo_conexionConexionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conexionConexionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_conexionConexionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_conexionConexionUpdate.setText("U");
		this.jButtonid_tipo_conexionConexionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_conexionConexionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_conexionConexionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_conexionConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_conexionConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_conexionConexionUpdate"));



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
		//this.jInternalFrameDetalleConexion = new ConexionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Conexion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConexion= new GridBagLayout();
		

		
		String sToolTipConexion="";
		sToolTipConexion=ConexionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConexion+="(PuntoVenta.Conexion)";
		}
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			sToolTipConexion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConexion = new JButtonMe();
		this.jButtonModificarConexion = new JButtonMe();
        this.jButtonActualizarConexion = new JButtonMe();
        this.jButtonEliminarConexion = new JButtonMe();
        this.jButtonCancelarConexion = new JButtonMe();
        this.jButtonGuardarCambiosConexion = new JButtonMe();
		this.jButtonGuardarCambiosTablaConexion = new JButtonMe();
		this.jButtonCerrarConexion = new JButtonMe();
		
		this.jScrollPanelDatosConexion = new JScrollPane();   
        this.jScrollPanelDatosEdicionConexion = new JScrollPane();
		this.jScrollPanelDatosGeneralConexion = new JScrollPane();
				
		
		
		this.jPanelCamposConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Conexion";
		
		if(!this.conexionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conexiones" + this.sPath));
		} else {
			this.jScrollPanelDatosConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConexion.setName("jPanelCamposConexion"); 

		this.jPanelCamposOcultosConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConexion.setName("jPanelCamposOcultosConexion"); 

        this.jPanelAccionesConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConexion.setToolTipText("Acciones");
        this.jPanelAccionesConexion.setName("Acciones"); 

		this.jPanelAccionesFormularioConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConexion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConexion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConexion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConexion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConexion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConexion.setText("Nuevo");
		this.jButtonModificarConexion.setText("Editar");
        this.jButtonActualizarConexion.setText("Actualizar");
        this.jButtonEliminarConexion.setText("Eliminar");
        this.jButtonCancelarConexion.setText("Cancelar");
        this.jButtonGuardarCambiosConexion.setText("Guardar");
		this.jButtonGuardarCambiosTablaConexion.setText("Guardar");
		this.jButtonCerrarConexion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConexion,"nuevo_button","Nuevo",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConexion,"modificar_button","Editar",this.conexionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConexion,"actualizar_button","Actualizar",this.conexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConexion,"eliminar_button","Eliminar",this.conexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConexion,"cancelar_button","Cancelar",this.conexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConexion,"guardarcambios_button","Guardar",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConexion,"guardarcambiostabla_button","Guardar",this.conexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConexion,"cerrar_button","Salir",this.conexionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConexion.setToolTipText("Nuevo"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConexion.setToolTipText("Editar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConexion.setToolTipText("Actualizar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConexion.setToolTipText("Eliminar)"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConexion.setToolTipText("Cancelar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConexion.setToolTipText("Guardar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConexion.setToolTipText("Guardar"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConexion.setToolTipText("Salir"+" "+ConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConexion";
		inputMap = this.jButtonNuevoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConexion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConexion";
		inputMap = this.jButtonActualizarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConexion"));
		
		//ELIMINAR
		sMapKey = "EliminarConexion";
		inputMap = this.jButtonEliminarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConexion"));
		
		//CANCELAR	
		sMapKey = "CancelarConexion";
		inputMap = this.jButtonCancelarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConexion"));
		
		//CERRAR		
		sMapKey = "CerrarConexion";
		inputMap = this.jButtonCerrarConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConexion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConexion";
		inputMap = this.jButtonGuardarCambiosTablaConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConexion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConexion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConexion.setToolTipText("Nuevo Conexion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConexion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConexion.setToolTipText("Sin Cerrar Ventana Conexion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConexion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConexion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConexion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConexion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConexion.setText("Accion");
		this.jComboBoxTiposAccionesConexion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConexion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConexion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConexion = new JLabelMe();
		
		this.jLabelAccionesConexion.setText("Acciones");		
		this.jLabelAccionesConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConexion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConexion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConexion=new JTabbedPane();
		this.jTabbedPaneRelacionesConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConexion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConexion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConexion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConexion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConexion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConexion = new GridBagLayout();
		
		this.jPanelCamposConexion.setLayout(gridaBagLayoutCamposConexion);
		this.jPanelCamposOcultosConexion.setLayout(gridaBagLayoutCamposOcultosConexion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 0;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConexion.add(jLabelIdConexion, this.gridBagConstraintsConexion);



	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 1;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConexion.add(jLabelidConexion, this.gridBagConstraintsConexion);


	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 0;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_conexionConexion.add(jLabelid_tipo_conexionConexion, this.gridBagConstraintsConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConexion = new GridBagConstraints();
		//this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx = 2;
		this.gridBagConstraintsConexion.ipadx = 0;
		this.gridBagConstraintsConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_conexionConexion.add(jButtonid_tipo_conexionConexionBusqueda, this.gridBagConstraintsConexion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConexion = new GridBagConstraints();
		//this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx = 3;
		this.gridBagConstraintsConexion.ipadx = 0;
		this.gridBagConstraintsConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_conexionConexion.add(jButtonid_tipo_conexionConexionUpdate, this.gridBagConstraintsConexion);
	}

	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 1;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_conexionConexion.add(jComboBoxid_tipo_conexionConexion, this.gridBagConstraintsConexion);


	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 0;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConexion.add(jLabelnombreConexion, this.gridBagConstraintsConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConexion = new GridBagConstraints();
		//this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx = 2;
		this.gridBagConstraintsConexion.ipadx = 0;
		this.gridBagConstraintsConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConexion.add(jButtonnombreConexionBusqueda, this.gridBagConstraintsConexion);
	}

	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 1;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConexion.add(jscrollPanenombreConexion, this.gridBagConstraintsConexion);


	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 0;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_maquinaConexion.add(jLabelnombre_maquinaConexion, this.gridBagConstraintsConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConexion = new GridBagConstraints();
		//this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx = 2;
		this.gridBagConstraintsConexion.ipadx = 0;
		this.gridBagConstraintsConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_maquinaConexion.add(jButtonnombre_maquinaConexionBusqueda, this.gridBagConstraintsConexion);
	}

	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConexion.gridy = 0;
	this.gridBagConstraintsConexion.gridx = 1;
	this.gridBagConstraintsConexion.ipadx = 0;
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_maquinaConexion.add(jscrollPanenombre_maquinaConexion, this.gridBagConstraintsConexion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConexion.gridy = iYPanelCamposConexion;
	this.gridBagConstraintsConexion.gridx = iXPanelCamposConexion++;
	this.gridBagConstraintsConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConexion.add(this.jPanelidConexion, this.gridBagConstraintsConexion);



	if(iXPanelCamposConexion % 1==0) {
		iXPanelCamposConexion=0;
		iYPanelCamposConexion++;
	}
	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConexion.gridy = iYPanelCamposConexion;
	this.gridBagConstraintsConexion.gridx = iXPanelCamposConexion++;
	this.gridBagConstraintsConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConexion.add(this.jPanelid_tipo_conexionConexion, this.gridBagConstraintsConexion);



	if(iXPanelCamposConexion % 1==0) {
		iXPanelCamposConexion=0;
		iYPanelCamposConexion++;
	}
	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConexion.gridy = iYPanelCamposConexion;
	this.gridBagConstraintsConexion.gridx = iXPanelCamposConexion++;
	this.gridBagConstraintsConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConexion.add(this.jPanelnombreConexion, this.gridBagConstraintsConexion);



	if(iXPanelCamposConexion % 1==0) {
		iXPanelCamposConexion=0;
		iYPanelCamposConexion++;
	}
	this.gridBagConstraintsConexion = new GridBagConstraints();
	this.gridBagConstraintsConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConexion.gridy = iYPanelCamposConexion;
	this.gridBagConstraintsConexion.gridx = iXPanelCamposConexion++;
	this.gridBagConstraintsConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConexion.add(this.jPanelnombre_maquinaConexion, this.gridBagConstraintsConexion);



	if(iXPanelCamposConexion % 1==0) {
		iXPanelCamposConexion=0;
		iYPanelCamposConexion++;
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
			
		GridBagLayout gridaBagLayoutAccionesConexion= new GridBagLayout();
		this.jPanelAccionesConexion.setLayout(gridaBagLayoutAccionesConexion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConexion= new GridBagLayout();
		this.jPanelAccionesFormularioConexion.setLayout(gridaBagLayoutAccionesFormularioConexion);
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConexion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConexion.add(this.jComboBoxTiposAccionesFormularioConexion, this.gridBagConstraintsConexion);

		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConexion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConexion.add(this.jCheckBoxPostAccionNuevoConexion, this.gridBagConstraintsConexion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.conexionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConexion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConexion.add(this.jCheckBoxPostAccionSinCerrarConexion, this.gridBagConstraintsConexion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.conexionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.conexionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConexion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConexion.add(this.jCheckBoxPostAccionSinMensajeConexion, this.gridBagConstraintsConexion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx = iPosXAccion++;
			
		this.jPanelAccionesConexion.add(this.jButtonModificarConexion, this.gridBagConstraintsConexion);							

		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConexion.gridy = 0;
		this.gridBagConstraintsConexion.gridx =iPosXAccion++;
			
		this.jPanelAccionesConexion.add(this.jButtonEliminarConexion, this.gridBagConstraintsConexion);
		
			
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = 0;		
		this.gridBagConstraintsConexion.gridx = iPosXAccion++;
		
		this.jPanelAccionesConexion.add(this.jButtonActualizarConexion, this.gridBagConstraintsConexion);


		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = 0;		
		this.gridBagConstraintsConexion.gridx = iPosXAccion++;
		
		this.jPanelAccionesConexion.add(this.jButtonGuardarCambiosConexion, this.gridBagConstraintsConexion);	
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = 0;		
		this.gridBagConstraintsConexion.gridx =iPosXAccion++;
		
		this.jPanelAccionesConexion.add(this.jButtonCancelarConexion, this.gridBagConstraintsConexion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConexion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConexion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conexionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConexion = new GridBagConstraints();						
			this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConexion.gridx = 0;		
			//this.gridBagConstraintsConexion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConexion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConexion.gridx =0;
		this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConexion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConexion, this.gridBagConstraintsConexion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConexionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConexion = new ConexionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Conexion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Conexion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conexion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConexionModel conexionModel=new ConexionModel(this);
			
			//SI USARA CLASE INTERNA
			//ConexionModel.ConexionFocusTraversalPolicy conexionFocusTraversalPolicy = conexionModel.new ConexionFocusTraversalPolicy(this);
			
			//conexionFocusTraversalPolicy.setconexionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(conexionModel);
			
			
			this.jContentPaneDetalleConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConexion = new GridBagLayout();	
			this.jContentPaneDetalleConexion.setLayout(gridaBagLayoutDetalleConexion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConexion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConexion = new GridBagConstraints();
				this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConexion.gridx = 0;
					
				
				this.jContentPaneDetalleConexion.add(jTtoolBarDetalleConexion, gridBagConstraintsConexion);								
				
}
			
			this.jScrollPanelDatosEdicionConexion=   new JScrollPane(jContentPaneDetalleConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConexion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConexion.gridx = 0;
	        
			this.jContentPaneDetalleConexion.add(jPanelCamposConexion, gridBagConstraintsConexion);
			
			
			
			
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
						&& conexionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNumeroRecap(this.puedeCargarPorParteNumeroRecap,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(this.puedeCargarPorParteTarjetaCreditoConexion,false,-1);
					
					if(this.conexionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConexion= new GridBagConstraints();
						this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConexion.gridx = 0;
						this.jContentPaneDetalleConexion.add(this.jTabbedPaneRelacionesConexion, this.gridBagConstraintsConexion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConexion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNumeroRecap(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConexion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConexion = new GridBagConstraints();
					this.gridBagConstraintsConexion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConexion.gridx = 0;
					
				
					this.jContentPaneDetalleConexion.add(jPanelCamposOcultosConexion, gridBagConstraintsConexion);
				
					this.jPanelCamposOcultosConexion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsConexion.gridx = 0;
	        this.gridBagConstraintsConexion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConexion.add(this.jPanelAccionesFormularioConexion, this.gridBagConstraintsConexion);							
			
			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
	        this.gridBagConstraintsConexion.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsConexion.gridx = 0;
	        
			
			this.jContentPaneDetalleConexion.add(this.jPanelAccionesConexion, this.gridBagConstraintsConexion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConexion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConexion=   new JScrollPane(this.jPanelCamposConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConexion.gridx = 0;
			this.gridBagConstraintsConexion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConexion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConexion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConexion, this.gridBagConstraintsConexion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConexion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConexion, this.gridBagConstraintsConexion);			
			
			this.gridBagConstraintsConexion = new GridBagConstraints();
			this.gridBagConstraintsConexion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConexion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConexion, this.gridBagConstraintsConexion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConexion, this.gridBagConstraintsConexion);
			
			
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConexion, this.gridBagConstraintsConexion);
		
			
		this.gridBagConstraintsConexion = new GridBagConstraints();
		this.gridBagConstraintsConexion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConexion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConexion, this.gridBagConstraintsConexion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConexion;//jContentPane;
		
		return jScrollPanelDatosEdicionConexion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsConexion = new GridBagConstraints();
				//this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConexion.gridx = 0;
				//this.jContentPaneDetalleConexion.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConexion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConexion.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConexion.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesConexion.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNumeroRecap(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.numerorecapSessionBean=new NumeroRecapSessionBean();
		this.numerorecapSessionBean.setConGuardarRelaciones(false);
		this.numerorecapSessionBean.setEsGuardarRelacionado(true);

		this.numerorecapBeanSwingJInternalFrame=null;//new NumeroRecapBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.numerorecapBeanSwingJInternalFramePopup=new NumeroRecapBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.numerorecapBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {

				NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
				NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.numerorecapSessionBean.setEsGuardarRelacionado(true);

				this.numerorecapBeanSwingJInternalFrame=new NumeroRecapBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.numerorecapBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.numerorecapBeanSwingJInternalFrame.setnumerorecapSessionBean(this.numerorecapSessionBean);

				//this.gridBagConstraintsConexion = new GridBagConstraints();
				//this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConexion.gridx = 0;
				//this.jContentPaneDetalleConexion.add(this.numerorecapBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConexion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConexion.add("Numero Recapes",this.numerorecapBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConexion.setComponentAt(iIndexTab,this.numerorecapBeanSwingJInternalFrame.getContentPane());
				}

				//NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.numerorecapSessionBean.setEsGuardarRelacionado(false);
				this.numerorecapBeanSwingJInternalFrame=null;//new NumeroRecapBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.numerorecapSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNumeroRecap) {
					this.jTabbedPaneRelacionesConexion.add("Numero Recapes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(false);
		this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(true);

		this.tarjetacreditoconexionBeanSwingJInternalFrame=null;//new TarjetaCreditoConexionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tarjetacreditoconexionBeanSwingJInternalFramePopup=new TarjetaCreditoConexionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tarjetacreditoconexionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {

				TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
				TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConexionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(true);

				this.tarjetacreditoconexionBeanSwingJInternalFrame=new TarjetaCreditoConexionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tarjetacreditoconexionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tarjetacreditoconexionBeanSwingJInternalFrame.settarjetacreditoconexionSessionBean(this.tarjetacreditoconexionSessionBean);

				//this.gridBagConstraintsConexion = new GridBagConstraints();
				//this.gridBagConstraintsConexion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConexion.gridx = 0;
				//this.jContentPaneDetalleConexion.add(this.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConexion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConexion.add("Tarjeta Credito Conexiones",this.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConexion.setComponentAt(iIndexTab,this.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane());
				}

				//TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(false);
				this.tarjetacreditoconexionBeanSwingJInternalFrame=null;//new TarjetaCreditoConexionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTarjetaCreditoConexion) {
					this.jTabbedPaneRelacionesConexion.add("Tarjeta Credito Conexiones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTarjetaCreditoConexionBeanSwingJInternalFrame(List<Conexion> conexions,Conexion conexion,TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tarjetacreditoconexionBeanSwingJInternalFrame=new TarjetaCreditoConexionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tarjetacreditoconexionBeanSwingJInternalFrame.getTarjetaCreditoConexionLogic().setConnexion(this.conexionLogic.getConnexion());

					tarjetacreditoconexionBeanSwingJInternalFrame.setconexionsForeignKey(conexions);
					tarjetacreditoconexionBeanSwingJInternalFrame.setconexionForeignKey(conexion);
					tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setisBusquedaDesdeForeignKeySesionConexion(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setlidConexionActual(conexion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tarjetacreditoconexionBeanSwingJInternalFrame.cargarCombosForeignKeyTarjetaCreditoConexion(tarjetacreditoconexionBeanSwingJInternalFrame.isCargarCombosDependencia);
					tarjetacreditoconexionBeanSwingJInternalFrame.setVisibilidadBusquedasParaConexion(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.setid_conexionFK_IdConexion(conexion.getId());

					if(!this.conCargarFormDetalle) {
						tarjetacreditoconexionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tarjetacreditoconexionBeanSwingJInternalFrame.setSelectedItemCombosFrameConexionForeignKey(conexion,1,false,true,true);
					tarjetacreditoconexionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tarjetacreditoconexionBeanSwingJInternalFrame.procesarBusqueda("FK_IdConexion");
					tarjetacreditoconexionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConexion");
					tarjetacreditoconexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCreditoConexion(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n",tarjetacreditoconexionBeanSwingJInternalFrame.isGuardarCambiosEnLote, tarjetacreditoconexionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tarjetacreditoconexionBeanSwingJInternalFrame.setAutoscrolls(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoConexion("relacionado");
					} else {
						tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoConexion("no_relacionado");
					}

					tarjetacreditoconexionBeanSwingJInternalFrame.getjButtonRecargarInformacionTarjetaCreditoConexion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNumeroRecapBeanSwingJInternalFrame(List<Conexion> conexions,Conexion conexion,NumeroRecapBeanSwingJInternalFrame numerorecapBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//numerorecapBeanSwingJInternalFrame=new NumeroRecapBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					numerorecapBeanSwingJInternalFrame.getNumeroRecapLogic().setConnexion(this.conexionLogic.getConnexion());

					numerorecapBeanSwingJInternalFrame.setconexionsForeignKey(conexions);
					numerorecapBeanSwingJInternalFrame.setconexionForeignKey(conexion);
					numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.setisBusquedaDesdeForeignKeySesionConexion(true);
					numerorecapBeanSwingJInternalFrame.numerorecapSessionBean.setlidConexionActual(conexion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					numerorecapBeanSwingJInternalFrame.cargarCombosForeignKeyNumeroRecap(numerorecapBeanSwingJInternalFrame.isCargarCombosDependencia);
					numerorecapBeanSwingJInternalFrame.setVisibilidadBusquedasParaConexion(true);
					numerorecapBeanSwingJInternalFrame.setid_conexionFK_IdConexion(conexion.getId());

					if(!this.conCargarFormDetalle) {
						numerorecapBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					numerorecapBeanSwingJInternalFrame.setSelectedItemCombosFrameConexionForeignKey(conexion,1,false,true,true);
					numerorecapBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					numerorecapBeanSwingJInternalFrame.procesarBusqueda("FK_IdConexion");
					numerorecapBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConexion");
					numerorecapBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroRecap(true);
					numerorecapBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNumeroRecap("n",numerorecapBeanSwingJInternalFrame.isGuardarCambiosEnLote, numerorecapBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					numerorecapBeanSwingJInternalFrame.setAutoscrolls(true);
					numerorecapBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						numerorecapBeanSwingJInternalFrame.actualizarEstadoPanelsNumeroRecap("relacionado");
					} else {
						numerorecapBeanSwingJInternalFrame.actualizarEstadoPanelsNumeroRecap("no_relacionado");
					}

					numerorecapBeanSwingJInternalFrame.getjButtonRecargarInformacionNumeroRecap().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<Conexion> conexions,Conexion conexion,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.conexionLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.setconexionsForeignKey(conexions);
					formapagopuntoventaBeanSwingJInternalFrame.setconexionForeignKey(conexion);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionConexion(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidConexionActual(conexion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaConexion(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_conexionFK_IdConexion(conexion.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameConexionForeignKey(conexion,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdConexion");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConexion");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

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
