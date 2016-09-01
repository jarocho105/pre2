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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.TipoProductoServicioInvenConstantesFunciones;

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
public class TipoProductoServicioInvenDetalleFormJInternalFrame extends TipoProductoServicioInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProductoServicioInven;
	
	protected JMenuBar jmenuBarDetalleTipoProductoServicioInven;
	
	protected JMenu jmenuDetalleTipoProductoServicioInven;
	protected JMenu jmenuDetalleArchivoTipoProductoServicioInven;
	protected JMenu jmenuDetalleAccionesTipoProductoServicioInven;
	protected JMenu jmenuDetalleDatosTipoProductoServicioInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProductoServicioInven;	
	protected GridBagConstraints gridBagConstraintsTipoProductoServicioInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProductoServicioInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProductoServicioInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProductoServicioInvenSessionBean tipoproductoservicioinvenSessionBean;
	
	

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
		
	
	public TipoProductoServicioInvenLogic tipoproductoservicioinvenLogic;
	
	public JScrollPane jScrollPanelDatosTipoProductoServicioInven;
	public JScrollPane jScrollPanelDatosEdicionTipoProductoServicioInven;
	public JScrollPane jScrollPanelDatosGeneralTipoProductoServicioInven;
	
	protected JPanel jPanelCamposTipoProductoServicioInven;    
	protected JPanel jPanelCamposOcultosTipoProductoServicioInven;    	
	protected JPanel jPanelAccionesTipoProductoServicioInven;
	protected JPanel jPanelAccionesFormularioTipoProductoServicioInven;
    
	
	
	protected Integer iXPanelCamposTipoProductoServicioInven=0;
	protected Integer iYPanelCamposTipoProductoServicioInven=0;
	
	protected Integer iXPanelCamposOcultosTipoProductoServicioInven=0;
	protected Integer iYPanelCamposOcultosTipoProductoServicioInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProductoServicioInven;
	public JButton jButtonModificarTipoProductoServicioInven;
	public JButton jButtonActualizarTipoProductoServicioInven;
    public JButton jButtonEliminarTipoProductoServicioInven;
	public JButton jButtonCancelarTipoProductoServicioInven;
    public JButton jButtonGuardarCambiosTipoProductoServicioInven;
	public JButton jButtonGuardarCambiosTablaTipoProductoServicioInven;
	protected JButton jButtonCerrarTipoProductoServicioInven;
	
	
	protected JButton jButtonProcesarInformacionTipoProductoServicioInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProductoServicioInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProductoServicioInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProductoServicioInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProductoServicioInven;
	protected JButton jButtonModificarToolBarTipoProductoServicioInven;
	protected JButton jButtonActualizarToolBarTipoProductoServicioInven;
    protected JButton jButtonEliminarToolBarTipoProductoServicioInven;
	protected JButton jButtonCancelarToolBarTipoProductoServicioInven;
    protected JButton jButtonGuardarCambiosToolBarTipoProductoServicioInven;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProductoServicioInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProductoServicioInven;
	protected JButton jButtonCerrarToolBarTipoProductoServicioInven;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProductoServicioInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProductoServicioInven;
	protected JMenuItem jMenuItemModificarTipoProductoServicioInven;
	protected JMenuItem jMenuItemActualizarTipoProductoServicioInven;
    protected JMenuItem jMenuItemEliminarTipoProductoServicioInven;
	protected JMenuItem jMenuItemCancelarTipoProductoServicioInven;
    protected JMenuItem jMenuItemGuardarCambiosTipoProductoServicioInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProductoServicioInven;
	protected JMenuItem jMenuItemCerrarTipoProductoServicioInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoProductoServicioInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProductoServicioInven;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProductoServicioInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProductoServicioInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoProductoServicioInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProductoServicioInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProductoServicioInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProductoServicioInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProductoServicioInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProductoServicioInven;
	public JLabel jLabelIdTipoProductoServicioInven;
	public JTextFieldMe jTextFieldidTipoProductoServicioInven;
	public JButton jButtonidTipoProductoServicioInvenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProductoServicioInven;
	public JLabel jLabelnombreTipoProductoServicioInven;
	public JTextArea jTextAreanombreTipoProductoServicioInven;
	public JScrollPane jscrollPanenombreTipoProductoServicioInven;
	public JButton jButtonnombreTipoProductoServicioInvenBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProductoServicioInven;
	
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
	
	public TipoProductoServicioInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProductoServicioInven=new JPanel();
				this.jPanelAccionesFormularioTipoProductoServicioInven=new JPanel();
				this.jmenuBarDetalleTipoProductoServicioInven=new JMenuBar();
				this.jTtoolBarDetalleTipoProductoServicioInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProductoServicioInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProductoServicioInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProductoServicioInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProductoServicioInven() {
		return this.jButtonActualizarToolBarTipoProductoServicioInven;
	}
	
	public JButton getjButtonEliminarToolBarTipoProductoServicioInven() {
		return this.jButtonEliminarToolBarTipoProductoServicioInven;
	}
	
	public JButton getjButtonCancelarToolBarTipoProductoServicioInven() {
		return this.jButtonCancelarToolBarTipoProductoServicioInven;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProductoServicioInven() {
		return this.jButtonProcesarInformacionTipoProductoServicioInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProductoServicioInven)	{
		this.jButtonProcesarInformacionTipoProductoServicioInven = jButtonProcesarInformacionTipoProductoServicioInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProductoServicioInven() {
		return this.jComboBoxTiposAccionesTipoProductoServicioInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProductoServicioInven(
			JComboBox jComboBoxTiposRelacionesTipoProductoServicioInven) {
		this.jComboBoxTiposRelacionesTipoProductoServicioInven = jComboBoxTiposRelacionesTipoProductoServicioInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProductoServicioInven(
			JComboBox jComboBoxTiposAccionesTipoProductoServicioInven) {
		this.jComboBoxTiposAccionesTipoProductoServicioInven = jComboBoxTiposAccionesTipoProductoServicioInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProductoServicioInven() {
		return this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProductoServicioInven(
			JComboBox jComboBoxTiposAccionesFormularioTipoProductoServicioInven) {
		this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven = jComboBoxTiposAccionesFormularioTipoProductoServicioInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoproductoservicioinvenSessionBean=new TipoProductoServicioInvenSessionBean();
		
		this.tipoproductoservicioinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoproductoservicioinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProductoServicioInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Producto Servicio Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProductoServicioInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProductoServicioInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProductoServicioInven=new JButtonMe();
				this.jButtonModificarToolBarTipoProductoServicioInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProductoServicioInven,this.jTtoolBarDetalleTipoProductoServicioInven,
							"actualizar","actualizar","Actualizar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProductoServicioInven,this.jTtoolBarDetalleTipoProductoServicioInven,
							"eliminar","eliminar","Eliminar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProductoServicioInven,this.jTtoolBarDetalleTipoProductoServicioInven,
							"cancelar","cancelar","Cancelar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProductoServicioInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProductoServicioInven,this.jTtoolBarDetalleTipoProductoServicioInven,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProductoServicioInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProductoServicioInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProductoServicioInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProductoServicioInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProductoServicioInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProductoServicioInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProductoServicioInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProductoServicioInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProductoServicioInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProductoServicioInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProductoServicioInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProductoServicioInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProductoServicioInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProductoServicioInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProductoServicioInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProductoServicioInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProductoServicioInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProductoServicioInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProductoServicioInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProductoServicioInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProductoServicioInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProductoServicioInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProductoServicioInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProductoServicioInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProductoServicioInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProductoServicioInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProductoServicioInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProductoServicioInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProductoServicioInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProductoServicioInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProductoServicioInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProductoServicioInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProductoServicioInven.add(this.jMenuItemDetalleCerrarTipoProductoServicioInven);
		
		this.jmenuDetalleAccionesTipoProductoServicioInven.add(this.jMenuItemActualizarTipoProductoServicioInven);
		this.jmenuDetalleAccionesTipoProductoServicioInven.add(this.jMenuItemEliminarTipoProductoServicioInven);
		this.jmenuDetalleAccionesTipoProductoServicioInven.add(this.jMenuItemCancelarTipoProductoServicioInven);		
		
		//this.jmenuDetalleDatosTipoProductoServicioInven.add(this.jMenuItemDetalleAbrirOrderByTipoProductoServicioInven);				
		this.jmenuDetalleDatosTipoProductoServicioInven.add(this.jMenuItemDetalleMostarOcultarTipoProductoServicioInven);				
				
		//this.jmenuDetalleAccionesTipoProductoServicioInven.add(this.jMenuItemGuardarCambiosTipoProductoServicioInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProductoServicioInven.add(this.jmenuDetalleArchivoTipoProductoServicioInven);		
		this.jmenuBarDetalleTipoProductoServicioInven.add(this.jmenuDetalleAccionesTipoProductoServicioInven);		
		this.jmenuBarDetalleTipoProductoServicioInven.add(this.jmenuDetalleDatosTipoProductoServicioInven);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProductoServicioInven.add(this.jmenuDetalleTipoProductoServicioInven);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProductoServicioInven);				
	}
	
	
	public void inicializarElementosCamposTipoProductoServicioInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProductoServicioInven = new JLabelMe();
		jLabelIdTipoProductoServicioInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProductoServicioInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProductoServicioInven.setToolTipText(TipoProductoServicioInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProductoServicioInven= new GridBagLayout();

		this.jPanelidTipoProductoServicioInven.setLayout(this.gridaBagLayoutTipoProductoServicioInven);

		jTextFieldidTipoProductoServicioInven = new JTextFieldMe();
		jTextFieldidTipoProductoServicioInven.setText("Id");

		jTextFieldidTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoProductoServicioInven = new JLabelMe();
		this.jLabelnombreTipoProductoServicioInven.setText(""+TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProductoServicioInven.setToolTipText("Nombre");
		this.jLabelnombreTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProductoServicioInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProductoServicioInven.setToolTipText(TipoProductoServicioInvenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProductoServicioInven = new GridBagLayout();
		this.jPanelnombreTipoProductoServicioInven.setLayout(this.gridaBagLayoutTipoProductoServicioInven);


		jTextAreanombreTipoProductoServicioInven= new JTextAreaMe();
		jTextAreanombreTipoProductoServicioInven.setEnabled(false);
		jTextAreanombreTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProductoServicioInven.setLineWrap(true);
		jTextAreanombreTipoProductoServicioInven.setWrapStyleWord(true);
		jTextAreanombreTipoProductoServicioInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProductoServicioInven.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProductoServicioInven = new JScrollPane(jTextAreanombreTipoProductoServicioInven);
		jscrollPanenombreTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProductoServicioInvenBusqueda= new JButtonMe();
		this.jButtonnombreTipoProductoServicioInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProductoServicioInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProductoServicioInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProductoServicioInvenBusqueda.setText("U");
		this.jButtonnombreTipoProductoServicioInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProductoServicioInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProductoServicioInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProductoServicioInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProductoServicioInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProductoServicioInvenBusqueda"));

		if(this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProductoServicioInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProductoServicioInven() {
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
		//this.jInternalFrameDetalleTipoProductoServicioInven = new TipoProductoServicioInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Producto Servicio Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProductoServicioInven= new GridBagLayout();
		

		
		String sToolTipTipoProductoServicioInven="";
		sToolTipTipoProductoServicioInven=TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProductoServicioInven+="(Inventario.TipoProductoServicioInven)";
		}
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProductoServicioInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProductoServicioInven = new JButtonMe();
		this.jButtonModificarTipoProductoServicioInven = new JButtonMe();
        this.jButtonActualizarTipoProductoServicioInven = new JButtonMe();
        this.jButtonEliminarTipoProductoServicioInven = new JButtonMe();
        this.jButtonCancelarTipoProductoServicioInven = new JButtonMe();
        this.jButtonGuardarCambiosTipoProductoServicioInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven = new JButtonMe();
		this.jButtonCerrarTipoProductoServicioInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoProductoServicioInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProductoServicioInven = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProductoServicioInven = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Producto Servicio Inventario";
		
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Producto Servicio Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProductoServicioInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProductoServicioInven.setName("jPanelCamposTipoProductoServicioInven"); 

		this.jPanelCamposOcultosTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProductoServicioInven.setName("jPanelCamposOcultosTipoProductoServicioInven"); 

        this.jPanelAccionesTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProductoServicioInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoProductoServicioInven.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProductoServicioInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProductoServicioInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProductoServicioInven.setText("Nuevo");
		this.jButtonModificarTipoProductoServicioInven.setText("Editar");
        this.jButtonActualizarTipoProductoServicioInven.setText("Actualizar");
        this.jButtonEliminarTipoProductoServicioInven.setText("Eliminar");
        this.jButtonCancelarTipoProductoServicioInven.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProductoServicioInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.setText("Guardar");
		this.jButtonCerrarTipoProductoServicioInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProductoServicioInven,"nuevo_button","Nuevo",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProductoServicioInven,"modificar_button","Editar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProductoServicioInven,"actualizar_button","Actualizar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProductoServicioInven,"eliminar_button","Eliminar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProductoServicioInven,"cancelar_button","Cancelar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProductoServicioInven,"guardarcambios_button","Guardar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProductoServicioInven,"guardarcambiostabla_button","Guardar",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProductoServicioInven,"cerrar_button","Salir",this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProductoServicioInven.setToolTipText("Nuevo"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProductoServicioInven.setToolTipText("Editar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProductoServicioInven.setToolTipText("Actualizar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProductoServicioInven.setToolTipText("Eliminar)"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProductoServicioInven.setToolTipText("Cancelar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProductoServicioInven.setToolTipText("Guardar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.setToolTipText("Guardar"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProductoServicioInven.setToolTipText("Salir"+" "+TipoProductoServicioInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProductoServicioInven";
		inputMap = this.jButtonNuevoTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProductoServicioInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProductoServicioInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProductoServicioInven";
		inputMap = this.jButtonActualizarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProductoServicioInven"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProductoServicioInven";
		inputMap = this.jButtonEliminarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProductoServicioInven"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProductoServicioInven";
		inputMap = this.jButtonCancelarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProductoServicioInven"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProductoServicioInven";
		inputMap = this.jButtonCerrarTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProductoServicioInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProductoServicioInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoProductoServicioInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProductoServicioInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProductoServicioInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProductoServicioInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProductoServicioInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProductoServicioInven.setToolTipText("Nuevo TipoProductoServicioInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven.setToolTipText("Sin Cerrar Ventana TipoProductoServicioInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProductoServicioInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProductoServicioInven = new JLabelMe();
		
		this.jLabelAccionesTipoProductoServicioInven.setText("Acciones");		
		this.jLabelAccionesTipoProductoServicioInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicioInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProductoServicioInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProductoServicioInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProductoServicioInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProductoServicioInven=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProductoServicioInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProductoServicioInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProductoServicioInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProductoServicioInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProductoServicioInven = new GridBagLayout();
		
		this.jPanelCamposTipoProductoServicioInven.setLayout(gridaBagLayoutCamposTipoProductoServicioInven);
		this.jPanelCamposOcultosTipoProductoServicioInven.setLayout(gridaBagLayoutCamposOcultosTipoProductoServicioInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
	this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
	this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProductoServicioInven.add(jLabelIdTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);



	this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
	this.gridBagConstraintsTipoProductoServicioInven.gridx = 1;
	this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProductoServicioInven.add(jTextFieldidTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);


	this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
	this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
	this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProductoServicioInven.add(jLabelnombreTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 2;
		this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
		this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProductoServicioInven.add(jButtonnombreTipoProductoServicioInvenBusqueda, this.gridBagConstraintsTipoProductoServicioInven);
	}

	this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
	this.gridBagConstraintsTipoProductoServicioInven.gridx = 1;
	this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
	this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProductoServicioInven.add(jscrollPanenombreTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProductoServicioInven.gridy = iYPanelCamposTipoProductoServicioInven;
	this.gridBagConstraintsTipoProductoServicioInven.gridx = iXPanelCamposTipoProductoServicioInven++;
	this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProductoServicioInven.add(this.jPanelidTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);



	if(iXPanelCamposTipoProductoServicioInven % 1==0) {
		iXPanelCamposTipoProductoServicioInven=0;
		iYPanelCamposTipoProductoServicioInven++;
	}
	this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProductoServicioInven.gridy = iYPanelCamposTipoProductoServicioInven;
	this.gridBagConstraintsTipoProductoServicioInven.gridx = iXPanelCamposTipoProductoServicioInven++;
	this.gridBagConstraintsTipoProductoServicioInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProductoServicioInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProductoServicioInven.add(this.jPanelnombreTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);



	if(iXPanelCamposTipoProductoServicioInven % 1==0) {
		iXPanelCamposTipoProductoServicioInven=0;
		iYPanelCamposTipoProductoServicioInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProductoServicioInven= new GridBagLayout();
		this.jPanelAccionesTipoProductoServicioInven.setLayout(gridaBagLayoutAccionesTipoProductoServicioInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProductoServicioInven= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProductoServicioInven.setLayout(gridaBagLayoutAccionesFormularioTipoProductoServicioInven);
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProductoServicioInven.add(this.jComboBoxTiposAccionesFormularioTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);

		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProductoServicioInven.add(this.jCheckBoxPostAccionNuevoTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProductoServicioInven.add(this.jCheckBoxPostAccionSinCerrarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoproductoservicioinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProductoServicioInven.add(this.jCheckBoxPostAccionSinMensajeTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProductoServicioInven.add(this.jButtonModificarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);							

		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;
		this.gridBagConstraintsTipoProductoServicioInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProductoServicioInven.add(this.jButtonEliminarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
			
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProductoServicioInven.add(this.jButtonActualizarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);


		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProductoServicioInven.add(this.jButtonGuardarCambiosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);	
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = 0;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProductoServicioInven.add(this.jButtonCancelarTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProductoServicioInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProductoServicioInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoproductoservicioinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;		
			//this.gridBagConstraintsTipoProductoServicioInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProductoServicioInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProductoServicioInven.gridx =0;
		this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProductoServicioInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProductoServicioInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProductoServicioInven = new TipoProductoServicioInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Producto Servicio Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Producto Servicio Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Producto Servicio Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProductoServicioInvenModel tipoproductoservicioinvenModel=new TipoProductoServicioInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProductoServicioInvenModel.TipoProductoServicioInvenFocusTraversalPolicy tipoproductoservicioinvenFocusTraversalPolicy = tipoproductoservicioinvenModel.new TipoProductoServicioInvenFocusTraversalPolicy(this);
			
			//tipoproductoservicioinvenFocusTraversalPolicy.settipoproductoservicioinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoproductoservicioinvenModel);
			
			
			this.jContentPaneDetalleTipoProductoServicioInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProductoServicioInven = new GridBagLayout();	
			this.jContentPaneDetalleTipoProductoServicioInven.setLayout(gridaBagLayoutDetalleTipoProductoServicioInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProductoServicioInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
				this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProductoServicioInven.add(jTtoolBarDetalleTipoProductoServicioInven, gridBagConstraintsTipoProductoServicioInven);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProductoServicioInven=   new JScrollPane(jContentPaneDetalleTipoProductoServicioInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProductoServicioInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
	        
			this.jContentPaneDetalleTipoProductoServicioInven.add(jPanelCamposTipoProductoServicioInven, gridBagConstraintsTipoProductoServicioInven);
			
			
			
			
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
						&& tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.tipoproductoservicioinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProductoServicioInven= new GridBagConstraints();
						this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
						this.jContentPaneDetalleTipoProductoServicioInven.add(this.jTabbedPaneRelacionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProductoServicioInven.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProductoServicioInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
					this.gridBagConstraintsTipoProductoServicioInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProductoServicioInven.add(jPanelCamposOcultosTipoProductoServicioInven, gridBagConstraintsTipoProductoServicioInven);
				
					this.jPanelCamposOcultosTipoProductoServicioInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
	        this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProductoServicioInven.add(this.jPanelAccionesFormularioTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);							
			
			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
	        this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProductoServicioInven.add(this.jPanelAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProductoServicioInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProductoServicioInven=   new JScrollPane(this.jPanelCamposTipoProductoServicioInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProductoServicioInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicioInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProductoServicioInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
			this.gridBagConstraintsTipoProductoServicioInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProductoServicioInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProductoServicioInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);			
			
			this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
			this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
			
			
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		
			
		this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
		this.gridBagConstraintsTipoProductoServicioInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProductoServicioInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProductoServicioInven, this.gridBagConstraintsTipoProductoServicioInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProductoServicioInven;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProductoServicioInven;
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProductoServicioInvenJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsTipoProductoServicioInven = new GridBagConstraints();
				//this.gridBagConstraintsTipoProductoServicioInven.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProductoServicioInven.gridx = 0;
				//this.jContentPaneDetalleTipoProductoServicioInven.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProductoServicioInven);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProductoServicioInven.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProductoServicioInven.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesTipoProductoServicioInven.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<TipoProductoServicioInven> tipoproductoservicioinvens,TipoProductoServicioInven tipoproductoservicioinven,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.tipoproductoservicioinvenLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.settipoproductoservicioinvensForeignKey(tipoproductoservicioinvens);
					parametroinventariodefectoBeanSwingJInternalFrame.settipoproductoservicioinvenForeignKey(tipoproductoservicioinven);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProductoServicioInven(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidTipoProductoServicioInvenActual(tipoproductoservicioinven.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProductoServicioInven(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_tipo_producto_servicio_invenFK_IdTipoProductoServicioInven(tipoproductoservicioinven.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProductoServicioInvenForeignKey(tipoproductoservicioinven,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProductoServicioInven");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProductoServicioInven");
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
