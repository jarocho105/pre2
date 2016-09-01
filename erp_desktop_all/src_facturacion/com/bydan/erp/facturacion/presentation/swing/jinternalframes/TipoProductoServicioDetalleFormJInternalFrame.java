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


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoProductoServicioConstantesFunciones;

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
public class TipoProductoServicioDetalleFormJInternalFrame extends TipoProductoServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProductoServicio;
	
	protected JMenuBar jmenuBarDetalleTipoProductoServicio;
	
	protected JMenu jmenuDetalleTipoProductoServicio;
	protected JMenu jmenuDetalleArchivoTipoProductoServicio;
	protected JMenu jmenuDetalleAccionesTipoProductoServicio;
	protected JMenu jmenuDetalleDatosTipoProductoServicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProductoServicio;	
	protected GridBagConstraints gridBagConstraintsTipoProductoServicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProductoServicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProductoServicio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProductoServicioSessionBean tipoproductoservicioSessionBean;
	
	

	public CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame=null;
	public CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaContableTipo=false;
	public CuentaContableTipoSessionBean cuentacontabletipoSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
		
	
	public TipoProductoServicioLogic tipoproductoservicioLogic;
	
	public JScrollPane jScrollPanelDatosTipoProductoServicio;
	public JScrollPane jScrollPanelDatosEdicionTipoProductoServicio;
	public JScrollPane jScrollPanelDatosGeneralTipoProductoServicio;
	
	protected JPanel jPanelCamposTipoProductoServicio;    
	protected JPanel jPanelCamposOcultosTipoProductoServicio;    	
	protected JPanel jPanelAccionesTipoProductoServicio;
	protected JPanel jPanelAccionesFormularioTipoProductoServicio;
    
	
	
	protected Integer iXPanelCamposTipoProductoServicio=0;
	protected Integer iYPanelCamposTipoProductoServicio=0;
	
	protected Integer iXPanelCamposOcultosTipoProductoServicio=0;
	protected Integer iYPanelCamposOcultosTipoProductoServicio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProductoServicio;
	public JButton jButtonModificarTipoProductoServicio;
	public JButton jButtonActualizarTipoProductoServicio;
    public JButton jButtonEliminarTipoProductoServicio;
	public JButton jButtonCancelarTipoProductoServicio;
    public JButton jButtonGuardarCambiosTipoProductoServicio;
	public JButton jButtonGuardarCambiosTablaTipoProductoServicio;
	protected JButton jButtonCerrarTipoProductoServicio;
	
	
	protected JButton jButtonProcesarInformacionTipoProductoServicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProductoServicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProductoServicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProductoServicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProductoServicio;
	protected JButton jButtonModificarToolBarTipoProductoServicio;
	protected JButton jButtonActualizarToolBarTipoProductoServicio;
    protected JButton jButtonEliminarToolBarTipoProductoServicio;
	protected JButton jButtonCancelarToolBarTipoProductoServicio;
    protected JButton jButtonGuardarCambiosToolBarTipoProductoServicio;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProductoServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProductoServicio;
	protected JButton jButtonCerrarToolBarTipoProductoServicio;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProductoServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProductoServicio;
	protected JMenuItem jMenuItemModificarTipoProductoServicio;
	protected JMenuItem jMenuItemActualizarTipoProductoServicio;
    protected JMenuItem jMenuItemEliminarTipoProductoServicio;
	protected JMenuItem jMenuItemCancelarTipoProductoServicio;
    protected JMenuItem jMenuItemGuardarCambiosTipoProductoServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProductoServicio;
	protected JMenuItem jMenuItemCerrarTipoProductoServicio;
	protected JMenuItem jMenuItemDetalleCerrarTipoProductoServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProductoServicio;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProductoServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProductoServicio;
	protected JMenuItem jMenuItemMostrarOcultarTipoProductoServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProductoServicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProductoServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProductoServicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProductoServicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProductoServicio;
	public JLabel jLabelIdTipoProductoServicio;
	public JTextFieldMe jTextFieldidTipoProductoServicio;
	public JButton jButtonidTipoProductoServicioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProductoServicio;
	public JLabel jLabelnombreTipoProductoServicio;
	public JTextArea jTextAreanombreTipoProductoServicio;
	public JScrollPane jscrollPanenombreTipoProductoServicio;
	public JButton jButtonnombreTipoProductoServicioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProductoServicio;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoProductoServicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProductoServicio=new JPanel();
				this.jPanelAccionesFormularioTipoProductoServicio=new JPanel();
				this.jmenuBarDetalleTipoProductoServicio=new JMenuBar();
				this.jTtoolBarDetalleTipoProductoServicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProductoServicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProductoServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProductoServicio() {
		return this.jButtonActualizarToolBarTipoProductoServicio;
	}
	
	public JButton getjButtonEliminarToolBarTipoProductoServicio() {
		return this.jButtonEliminarToolBarTipoProductoServicio;
	}
	
	public JButton getjButtonCancelarToolBarTipoProductoServicio() {
		return this.jButtonCancelarToolBarTipoProductoServicio;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProductoServicio() {
		return this.jButtonProcesarInformacionTipoProductoServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProductoServicio)	{
		this.jButtonProcesarInformacionTipoProductoServicio = jButtonProcesarInformacionTipoProductoServicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProductoServicio() {
		return this.jComboBoxTiposAccionesTipoProductoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProductoServicio(
			JComboBox jComboBoxTiposRelacionesTipoProductoServicio) {
		this.jComboBoxTiposRelacionesTipoProductoServicio = jComboBoxTiposRelacionesTipoProductoServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProductoServicio(
			JComboBox jComboBoxTiposAccionesTipoProductoServicio) {
		this.jComboBoxTiposAccionesTipoProductoServicio = jComboBoxTiposAccionesTipoProductoServicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProductoServicio() {
		return this.jComboBoxTiposAccionesFormularioTipoProductoServicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProductoServicio(
			JComboBox jComboBoxTiposAccionesFormularioTipoProductoServicio) {
		this.jComboBoxTiposAccionesFormularioTipoProductoServicio = jComboBoxTiposAccionesFormularioTipoProductoServicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoproductoservicioSessionBean=new TipoProductoServicioSessionBean();
		
		this.tipoproductoservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproductoservicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProductoServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Producto Servicio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProductoServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProductoServicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProductoServicio=new JButtonMe();
				this.jButtonModificarToolBarTipoProductoServicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProductoServicio,this.jTtoolBarDetalleTipoProductoServicio,
							"actualizar","actualizar","Actualizar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProductoServicio,this.jTtoolBarDetalleTipoProductoServicio,
							"eliminar","eliminar","Eliminar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProductoServicio,this.jTtoolBarDetalleTipoProductoServicio,
							"cancelar","cancelar","Cancelar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProductoServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProductoServicio,this.jTtoolBarDetalleTipoProductoServicio,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProductoServicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProductoServicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProductoServicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProductoServicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProductoServicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProductoServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProductoServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProductoServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProductoServicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProductoServicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProductoServicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProductoServicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProductoServicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProductoServicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProductoServicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProductoServicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProductoServicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProductoServicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProductoServicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProductoServicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProductoServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProductoServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProductoServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProductoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProductoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProductoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProductoServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProductoServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProductoServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProductoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProductoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProductoServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProductoServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProductoServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProductoServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProductoServicio.add(this.jMenuItemDetalleCerrarTipoProductoServicio);
		
		this.jmenuDetalleAccionesTipoProductoServicio.add(this.jMenuItemActualizarTipoProductoServicio);
		this.jmenuDetalleAccionesTipoProductoServicio.add(this.jMenuItemEliminarTipoProductoServicio);
		this.jmenuDetalleAccionesTipoProductoServicio.add(this.jMenuItemCancelarTipoProductoServicio);		
		
		//this.jmenuDetalleDatosTipoProductoServicio.add(this.jMenuItemDetalleAbrirOrderByTipoProductoServicio);				
		this.jmenuDetalleDatosTipoProductoServicio.add(this.jMenuItemDetalleMostarOcultarTipoProductoServicio);				
				
		//this.jmenuDetalleAccionesTipoProductoServicio.add(this.jMenuItemGuardarCambiosTipoProductoServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProductoServicio.add(this.jmenuDetalleArchivoTipoProductoServicio);		
		this.jmenuBarDetalleTipoProductoServicio.add(this.jmenuDetalleAccionesTipoProductoServicio);		
		this.jmenuBarDetalleTipoProductoServicio.add(this.jmenuDetalleDatosTipoProductoServicio);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProductoServicio.add(this.jmenuDetalleTipoProductoServicio);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProductoServicio);				
	}
	
	
	public void inicializarElementosCamposTipoProductoServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProductoServicio = new JLabelMe();
		jLabelIdTipoProductoServicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProductoServicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProductoServicio.setToolTipText(TipoProductoServicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProductoServicio= new GridBagLayout();

		this.jPanelidTipoProductoServicio.setLayout(this.gridaBagLayoutTipoProductoServicio);

		jTextFieldidTipoProductoServicio = new JTextFieldMe();
		jTextFieldidTipoProductoServicio.setText("Id");

		jTextFieldidTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoProductoServicio = new JLabelMe();
		this.jLabelnombreTipoProductoServicio.setText(""+TipoProductoServicioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProductoServicio.setToolTipText("Nombre");
		this.jLabelnombreTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProductoServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProductoServicio.setToolTipText(TipoProductoServicioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProductoServicio = new GridBagLayout();
		this.jPanelnombreTipoProductoServicio.setLayout(this.gridaBagLayoutTipoProductoServicio);


		jTextAreanombreTipoProductoServicio= new JTextAreaMe();
		jTextAreanombreTipoProductoServicio.setEnabled(false);
		jTextAreanombreTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProductoServicio.setLineWrap(true);
		jTextAreanombreTipoProductoServicio.setWrapStyleWord(true);
		jTextAreanombreTipoProductoServicio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProductoServicio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProductoServicio = new JScrollPane(jTextAreanombreTipoProductoServicio);
		jscrollPanenombreTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoProductoServicioBusqueda= new JButtonMe();
		this.jButtonnombreTipoProductoServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProductoServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProductoServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProductoServicioBusqueda.setText("U");
		this.jButtonnombreTipoProductoServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProductoServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProductoServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProductoServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProductoServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProductoServicioBusqueda"));

		if(this.tipoproductoservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProductoServicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProductoServicio() {
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
		//this.jInternalFrameDetalleTipoProductoServicio = new TipoProductoServicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Producto Servicio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProductoServicio= new GridBagLayout();
		

		
		String sToolTipTipoProductoServicio="";
		sToolTipTipoProductoServicio=TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProductoServicio+="(Facturacion.TipoProductoServicio)";
		}
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProductoServicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProductoServicio = new JButtonMe();
		this.jButtonModificarTipoProductoServicio = new JButtonMe();
        this.jButtonActualizarTipoProductoServicio = new JButtonMe();
        this.jButtonEliminarTipoProductoServicio = new JButtonMe();
        this.jButtonCancelarTipoProductoServicio = new JButtonMe();
        this.jButtonGuardarCambiosTipoProductoServicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProductoServicio = new JButtonMe();
		this.jButtonCerrarTipoProductoServicio = new JButtonMe();
		
		this.jScrollPanelDatosTipoProductoServicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProductoServicio = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProductoServicio = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Producto Servicio";
		
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProductoServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProductoServicio.setName("jPanelCamposTipoProductoServicio"); 

		this.jPanelCamposOcultosTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProductoServicio.setName("jPanelCamposOcultosTipoProductoServicio"); 

        this.jPanelAccionesTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProductoServicio.setToolTipText("Acciones");
        this.jPanelAccionesTipoProductoServicio.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProductoServicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProductoServicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProductoServicio.setText("Nuevo");
		this.jButtonModificarTipoProductoServicio.setText("Editar");
        this.jButtonActualizarTipoProductoServicio.setText("Actualizar");
        this.jButtonEliminarTipoProductoServicio.setText("Eliminar");
        this.jButtonCancelarTipoProductoServicio.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProductoServicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProductoServicio.setText("Guardar");
		this.jButtonCerrarTipoProductoServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProductoServicio,"nuevo_button","Nuevo",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProductoServicio,"modificar_button","Editar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProductoServicio,"actualizar_button","Actualizar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProductoServicio,"eliminar_button","Eliminar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProductoServicio,"cancelar_button","Cancelar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProductoServicio,"guardarcambios_button","Guardar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProductoServicio,"guardarcambiostabla_button","Guardar",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProductoServicio,"cerrar_button","Salir",this.tipoproductoservicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProductoServicio.setToolTipText("Nuevo"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProductoServicio.setToolTipText("Editar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProductoServicio.setToolTipText("Actualizar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProductoServicio.setToolTipText("Eliminar)"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProductoServicio.setToolTipText("Cancelar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProductoServicio.setToolTipText("Guardar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProductoServicio.setToolTipText("Guardar"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProductoServicio.setToolTipText("Salir"+" "+TipoProductoServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProductoServicio";
		inputMap = this.jButtonNuevoTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProductoServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProductoServicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProductoServicio";
		inputMap = this.jButtonActualizarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProductoServicio"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProductoServicio";
		inputMap = this.jButtonEliminarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProductoServicio"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProductoServicio";
		inputMap = this.jButtonCancelarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProductoServicio"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProductoServicio";
		inputMap = this.jButtonCerrarTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProductoServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProductoServicio";
		inputMap = this.jButtonGuardarCambiosTablaTipoProductoServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProductoServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProductoServicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProductoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProductoServicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProductoServicio.setToolTipText("Nuevo TipoProductoServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProductoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProductoServicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProductoServicio.setToolTipText("Sin Cerrar Ventana TipoProductoServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProductoServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProductoServicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProductoServicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProductoServicio.setText("Accion");
		this.jComboBoxTiposAccionesTipoProductoServicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProductoServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProductoServicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProductoServicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProductoServicio = new JLabelMe();
		
		this.jLabelAccionesTipoProductoServicio.setText("Acciones");		
		this.jLabelAccionesTipoProductoServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProductoServicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProductoServicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProductoServicio=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProductoServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProductoServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProductoServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProductoServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProductoServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProductoServicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProductoServicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProductoServicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProductoServicio = new GridBagLayout();
		
		this.jPanelCamposTipoProductoServicio.setLayout(gridaBagLayoutCamposTipoProductoServicio);
		this.jPanelCamposOcultosTipoProductoServicio.setLayout(gridaBagLayoutCamposOcultosTipoProductoServicio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicio.gridy = 0;
	this.gridBagConstraintsTipoProductoServicio.gridx = 0;
	this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProductoServicio.add(jLabelIdTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);



	this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicio.gridy = 0;
	this.gridBagConstraintsTipoProductoServicio.gridx = 1;
	this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProductoServicio.add(jTextFieldidTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);


	this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicio.gridy = 0;
	this.gridBagConstraintsTipoProductoServicio.gridx = 0;
	this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProductoServicio.add(jLabelnombreTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		//this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;
		this.gridBagConstraintsTipoProductoServicio.gridx = 2;
		this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
		this.gridBagConstraintsTipoProductoServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProductoServicio.add(jButtonnombreTipoProductoServicioBusqueda, this.gridBagConstraintsTipoProductoServicio);
	}

	this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicio.gridy = 0;
	this.gridBagConstraintsTipoProductoServicio.gridx = 1;
	this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProductoServicio.add(jscrollPanenombreTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProductoServicio.gridy = iYPanelCamposTipoProductoServicio;
	this.gridBagConstraintsTipoProductoServicio.gridx = iXPanelCamposTipoProductoServicio++;
	this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProductoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProductoServicio.add(this.jPanelidTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);



	if(iXPanelCamposTipoProductoServicio % 1==0) {
		iXPanelCamposTipoProductoServicio=0;
		iYPanelCamposTipoProductoServicio++;
	}
	this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProductoServicio.gridy = iYPanelCamposTipoProductoServicio;
	this.gridBagConstraintsTipoProductoServicio.gridx = iXPanelCamposTipoProductoServicio++;
	this.gridBagConstraintsTipoProductoServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProductoServicio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProductoServicio.add(this.jPanelnombreTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);



	if(iXPanelCamposTipoProductoServicio % 1==0) {
		iXPanelCamposTipoProductoServicio=0;
		iYPanelCamposTipoProductoServicio++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProductoServicio= new GridBagLayout();
		this.jPanelAccionesTipoProductoServicio.setLayout(gridaBagLayoutAccionesTipoProductoServicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProductoServicio= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProductoServicio.setLayout(gridaBagLayoutAccionesFormularioTipoProductoServicio);
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProductoServicio.add(this.jComboBoxTiposAccionesFormularioTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);

		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProductoServicio.add(this.jCheckBoxPostAccionNuevoTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProductoServicio.add(this.jCheckBoxPostAccionSinCerrarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoproductoservicioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProductoServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProductoServicio.add(this.jCheckBoxPostAccionSinMensajeTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProductoServicio.add(this.jButtonModificarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);							

		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;
		this.gridBagConstraintsTipoProductoServicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProductoServicio.add(this.jButtonEliminarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
			
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProductoServicio.add(this.jButtonActualizarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);


		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;		
		this.gridBagConstraintsTipoProductoServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProductoServicio.add(this.jButtonGuardarCambiosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);	
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = 0;		
		this.gridBagConstraintsTipoProductoServicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProductoServicio.add(this.jButtonCancelarTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProductoServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProductoServicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproductoservicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();						
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;		
			//this.gridBagConstraintsTipoProductoServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProductoServicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProductoServicio.gridx =0;
		this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProductoServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProductoServicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProductoServicio = new TipoProductoServicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Producto Servicio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Producto Servicio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Producto Servicio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProductoServicioModel tipoproductoservicioModel=new TipoProductoServicioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProductoServicioModel.TipoProductoServicioFocusTraversalPolicy tipoproductoservicioFocusTraversalPolicy = tipoproductoservicioModel.new TipoProductoServicioFocusTraversalPolicy(this);
			
			//tipoproductoservicioFocusTraversalPolicy.settipoproductoservicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoproductoservicioModel);
			
			
			this.jContentPaneDetalleTipoProductoServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProductoServicio = new GridBagLayout();	
			this.jContentPaneDetalleTipoProductoServicio.setLayout(gridaBagLayoutDetalleTipoProductoServicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProductoServicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProductoServicio.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProductoServicio.add(jTtoolBarDetalleTipoProductoServicio, gridBagConstraintsTipoProductoServicio);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProductoServicio=   new JScrollPane(jContentPaneDetalleTipoProductoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProductoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProductoServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProductoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProductoServicio.gridx = 0;
	        
			this.jContentPaneDetalleTipoProductoServicio.add(jPanelCamposTipoProductoServicio, gridBagConstraintsTipoProductoServicio);
			
			
			
			
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
						&& tipoproductoservicioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(this.puedeCargarPorParteCuentaContableTipo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.tipoproductoservicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProductoServicio= new GridBagConstraints();
						this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProductoServicio.gridx = 0;
						this.jContentPaneDetalleTipoProductoServicio.add(this.jTabbedPaneRelacionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProductoServicio.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProductoServicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
					this.gridBagConstraintsTipoProductoServicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProductoServicio.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProductoServicio.add(jPanelCamposOcultosTipoProductoServicio, gridBagConstraintsTipoProductoServicio);
				
					this.jPanelCamposOcultosTipoProductoServicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoProductoServicio.gridx = 0;
	        this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProductoServicio.add(this.jPanelAccionesFormularioTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);							
			
			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
	        this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoProductoServicio.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProductoServicio.add(this.jPanelAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProductoServicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProductoServicio=   new JScrollPane(this.jPanelCamposTipoProductoServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProductoServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;
			this.gridBagConstraintsTipoProductoServicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProductoServicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProductoServicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);			
			
			this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProductoServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
			
			
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		
			
		this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProductoServicio, this.gridBagConstraintsTipoProductoServicio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProductoServicio;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProductoServicio;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		this.cuentacontabletipoSessionBean.setConGuardarRelaciones(false);
		this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(true);

		this.cuentacontabletipoBeanSwingJInternalFrame=null;//new CuentaContableTipoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentacontabletipoBeanSwingJInternalFramePopup=new CuentaContableTipoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentacontabletipoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {

				CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(true);

				this.cuentacontabletipoBeanSwingJInternalFrame=new CuentaContableTipoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentacontabletipoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentacontabletipoBeanSwingJInternalFrame.setcuentacontabletipoSessionBean(this.cuentacontabletipoSessionBean);

				//this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
				//this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProductoServicio.gridx = 0;
				//this.jContentPaneDetalleTipoProductoServicio.add(this.cuentacontabletipoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProductoServicio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProductoServicio.add("Cuenta Contable Tipos",this.cuentacontabletipoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProductoServicio.setComponentAt(iIndexTab,this.cuentacontabletipoBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(false);
				this.cuentacontabletipoBeanSwingJInternalFrame=null;//new CuentaContableTipoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaContableTipo) {
					this.jTabbedPaneRelacionesTipoProductoServicio.add("Cuenta Contable Tipos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		this.parametroinventariodefectoSessionBean.setConGuardarRelaciones(false);
		this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametroinventariodefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoServicioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsTipoProductoServicio = new GridBagConstraints();
				//this.gridBagConstraintsTipoProductoServicio.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProductoServicio.gridx = 0;
				//this.jContentPaneDetalleTipoProductoServicio.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProductoServicio);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProductoServicio.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProductoServicio.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesTipoProductoServicio.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuentaContableTipoBeanSwingJInternalFrame(List<TipoProductoServicio> tipoproductoservicios,TipoProductoServicio tipoproductoservicio,CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentacontabletipoBeanSwingJInternalFrame=new CuentaContableTipoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentacontabletipoBeanSwingJInternalFrame.getCuentaContableTipoLogic().setConnexion(this.tipoproductoservicioLogic.getConnexion());

					cuentacontabletipoBeanSwingJInternalFrame.settipoproductoserviciosForeignKey(tipoproductoservicios);
					cuentacontabletipoBeanSwingJInternalFrame.settipoproductoservicioForeignKey(tipoproductoservicio);
					cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProductoServicio(true);
					cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setlidTipoProductoServicioActual(tipoproductoservicio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentacontabletipoBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaContableTipo(cuentacontabletipoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentacontabletipoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProductoServicio(true);
					cuentacontabletipoBeanSwingJInternalFrame.setid_tipo_producto_servicioFK_IdTipoProductoServicio(tipoproductoservicio.getId());

					if(!this.conCargarFormDetalle) {
						cuentacontabletipoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentacontabletipoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoServicioForeignKey(tipoproductoservicio,1,false,true,true);
					cuentacontabletipoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentacontabletipoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProductoServicio");
					cuentacontabletipoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProductoServicio");
					cuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContableTipo(true);
					cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaContableTipo("n",cuentacontabletipoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentacontabletipoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentacontabletipoBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentacontabletipoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContableTipo("relacionado");
					} else {
						cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContableTipo("no_relacionado");
					}

					cuentacontabletipoBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaContableTipo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<TipoProductoServicio> tipoproductoservicios,TipoProductoServicio tipoproductoservicio,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.tipoproductoservicioLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.settipoproductoserviciosForeignKey(tipoproductoservicios);
					parametroinventariodefectoBeanSwingJInternalFrame.settipoproductoservicioForeignKey(tipoproductoservicio);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProductoServicio(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidTipoProductoServicioActual(tipoproductoservicio.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProductoServicio(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_tipo_producto_servicioFK_IdTipoProductoServicio(tipoproductoservicio.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoServicioForeignKey(tipoproductoservicio,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProductoServicio");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProductoServicio");
					parametroinventariodefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroInventarioDefecto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroInventarioDefecto("n",parametroinventariodefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametroinventariodefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametroinventariodefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("relacionado");
					} else {
						parametroinventariodefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroInventarioDefecto("no_relacionado");
					}

					parametroinventariodefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroInventarioDefecto().setVisible(false);

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
