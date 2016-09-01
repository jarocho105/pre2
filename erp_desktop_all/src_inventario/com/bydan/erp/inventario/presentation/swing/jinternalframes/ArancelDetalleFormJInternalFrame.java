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
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.ArancelConstantesFunciones;

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
public class ArancelDetalleFormJInternalFrame extends ArancelBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleArancel;
	
	protected JMenuBar jmenuBarDetalleArancel;
	
	protected JMenu jmenuDetalleArancel;
	protected JMenu jmenuDetalleArchivoArancel;
	protected JMenu jmenuDetalleAccionesArancel;
	protected JMenu jmenuDetalleDatosArancel;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutArancel;	
	protected GridBagConstraints gridBagConstraintsArancel;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ArancelBeanSwingJInternalFrameAdditional jInternalFrameDetalleArancel;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ArancelSessionBean arancelSessionBean;
	
	

	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame=null;
	public ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProducto=false;
	public ProductoSessionBean productoSessionBean;

	public DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame=null;
	public DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetallePedidoCompraImpor=false;
	public DetallePedidoCompraImporSessionBean detallepedidocompraimporSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ArancelLogic arancelLogic;
	
	public JScrollPane jScrollPanelDatosArancel;
	public JScrollPane jScrollPanelDatosEdicionArancel;
	public JScrollPane jScrollPanelDatosGeneralArancel;
	
	protected JPanel jPanelCamposArancel;    
	protected JPanel jPanelCamposOcultosArancel;    	
	protected JPanel jPanelAccionesArancel;
	protected JPanel jPanelAccionesFormularioArancel;
    
	
	
	protected Integer iXPanelCamposArancel=0;
	protected Integer iYPanelCamposArancel=0;
	
	protected Integer iXPanelCamposOcultosArancel=0;
	protected Integer iYPanelCamposOcultosArancel=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoArancel;
	public JButton jButtonModificarArancel;
	public JButton jButtonActualizarArancel;
    public JButton jButtonEliminarArancel;
	public JButton jButtonCancelarArancel;
    public JButton jButtonGuardarCambiosArancel;
	public JButton jButtonGuardarCambiosTablaArancel;
	protected JButton jButtonCerrarArancel;
	
	
	protected JButton jButtonProcesarInformacionArancel;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoArancel;
	protected JCheckBox jCheckBoxPostAccionSinCerrarArancel;
	protected JCheckBox jCheckBoxPostAccionSinMensajeArancel;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarArancel;
	protected JButton jButtonModificarToolBarArancel;
	protected JButton jButtonActualizarToolBarArancel;
    protected JButton jButtonEliminarToolBarArancel;
	protected JButton jButtonCancelarToolBarArancel;
    protected JButton jButtonGuardarCambiosToolBarArancel;
	protected JButton jButtonGuardarCambiosTablaToolBarArancel;
	protected JButton jButtonMostrarOcultarTablaToolBarArancel;
	protected JButton jButtonCerrarToolBarArancel;
	
	protected JButton jButtonProcesarInformacionToolBarArancel;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoArancel;
	protected JMenuItem jMenuItemModificarArancel;
	protected JMenuItem jMenuItemActualizarArancel;
    protected JMenuItem jMenuItemEliminarArancel;
	protected JMenuItem jMenuItemCancelarArancel;
    protected JMenuItem jMenuItemGuardarCambiosArancel;
	protected JMenuItem jMenuItemGuardarCambiosTablaArancel;
	protected JMenuItem jMenuItemCerrarArancel;
	protected JMenuItem jMenuItemDetalleCerrarArancel;
	protected JMenuItem jMenuItemDetalleMostarOcultarArancel;
	
	protected JMenuItem jMenuItemProcesarInformacionArancel;
	protected JMenuItem jMenuItemNuevoGuardarCambiosArancel;
	protected JMenuItem jMenuItemMostrarOcultarArancel;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesArancel;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesArancel;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesArancel;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioArancel;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidArancel;
	public JLabel jLabelIdArancel;
	public JLabel jLabelidArancel;
	public JButton jButtonidArancelBusqueda= new JButtonMe();

	public JPanel jPanelcodigoArancel;
	public JLabel jLabelcodigoArancel;
	public JTextField jTextFieldcodigoArancel;
	public JButton jButtoncodigoArancelBusqueda= new JButtonMe();

	public JPanel jPanelnombreArancel;
	public JLabel jLabelnombreArancel;
	public JTextArea jTextAreanombreArancel;
	public JScrollPane jscrollPanenombreArancel;
	public JButton jButtonnombreArancelBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeArancel;
	public JLabel jLabelporcentajeArancel;
	public JTextField jTextFieldporcentajeArancel;
	public JButton jButtonporcentajeArancelBusqueda= new JButtonMe();

	public JPanel jPanelobservacionArancel;
	public JLabel jLabelobservacionArancel;
	public JTextArea jTextAreaobservacionArancel;
	public JScrollPane jscrollPaneobservacionArancel;
	public JButton jButtonobservacionArancelBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaArancel;
	public JLabel jLabelid_empresaArancel;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaArancel;
	public JButton jButtonid_empresaArancel= new JButtonMe();
	public JButton jButtonid_empresaArancelUpdate= new JButtonMe();
	public JButton jButtonid_empresaArancelBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesArancel;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ArancelDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposArancel=new JPanel();
				this.jPanelAccionesFormularioArancel=new JPanel();
				this.jmenuBarDetalleArancel=new JMenuBar();
				this.jTtoolBarDetalleArancel=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ArancelDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ArancelDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Arancel No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarArancel() {
		return this.jButtonActualizarToolBarArancel;
	}
	
	public JButton getjButtonEliminarToolBarArancel() {
		return this.jButtonEliminarToolBarArancel;
	}
	
	public JButton getjButtonCancelarToolBarArancel() {
		return this.jButtonCancelarToolBarArancel;
	}		
	
	public JButton getjButtonProcesarInformacionArancel() {
		return this.jButtonProcesarInformacionArancel;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionArancel)	{
		this.jButtonProcesarInformacionArancel = jButtonProcesarInformacionArancel;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesArancel() {
		return this.jComboBoxTiposAccionesArancel;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesArancel(
			JComboBox jComboBoxTiposRelacionesArancel) {
		this.jComboBoxTiposRelacionesArancel = jComboBoxTiposRelacionesArancel;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesArancel(
			JComboBox jComboBoxTiposAccionesArancel) {
		this.jComboBoxTiposAccionesArancel = jComboBoxTiposAccionesArancel;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioArancel() {
		return this.jComboBoxTiposAccionesFormularioArancel;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioArancel(
			JComboBox jComboBoxTiposAccionesFormularioArancel) {
		this.jComboBoxTiposAccionesFormularioArancel = jComboBoxTiposAccionesFormularioArancel;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.arancelSessionBean=new ArancelSessionBean();
		
		this.arancelSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.arancelSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.arancelSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.productoSessionBean=new ProductoSessionBean();
		//this.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ArancelJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ArancelJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ArancelJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Arancel MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
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
	
		ArancelJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleArancel= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarArancel=new JButtonMe();
				this.jButtonModificarToolBarArancel=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarArancel,this.jTtoolBarDetalleArancel,
							"actualizar","actualizar","Actualizar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarArancel,this.jTtoolBarDetalleArancel,
							"eliminar","eliminar","Eliminar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarArancel,this.jTtoolBarDetalleArancel,
							"cancelar","cancelar","Cancelar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarArancel=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarArancel,this.jTtoolBarDetalleArancel,
							"guardarcambios","guardarcambios","Guardar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarArancel,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarArancel,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarArancel,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleArancel=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleArancel=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoArancel=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesArancel=new JMenuMe("Acciones");
		this.jmenuDetalleDatosArancel=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoArancel= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoArancel.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoArancel,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarArancel= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarArancel.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarArancel,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarArancel= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarArancel.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarArancel,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarArancel= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarArancel.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarArancel,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarArancel= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarArancel.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarArancel,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosArancel= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosArancel.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosArancel,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarArancel= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarArancel.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarArancel,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarArancel= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarArancel.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarArancel,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarArancel= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarArancel.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarArancel,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarArancel= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarArancel.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarArancel,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarArancel, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoArancel.add(this.jMenuItemDetalleCerrarArancel);
		
		this.jmenuDetalleAccionesArancel.add(this.jMenuItemActualizarArancel);
		this.jmenuDetalleAccionesArancel.add(this.jMenuItemEliminarArancel);
		this.jmenuDetalleAccionesArancel.add(this.jMenuItemCancelarArancel);		
		
		//this.jmenuDetalleDatosArancel.add(this.jMenuItemDetalleAbrirOrderByArancel);				
		this.jmenuDetalleDatosArancel.add(this.jMenuItemDetalleMostarOcultarArancel);				
				
		//this.jmenuDetalleAccionesArancel.add(this.jMenuItemGuardarCambiosArancel);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleArancel.add(this.jmenuDetalleArchivoArancel);		
		this.jmenuBarDetalleArancel.add(this.jmenuDetalleAccionesArancel);		
		this.jmenuBarDetalleArancel.add(this.jmenuDetalleDatosArancel);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleArancel, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleArancel.add(this.jmenuDetalleArancel);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleArancel);				
	}
	
	
	public void inicializarElementosCamposArancel() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdArancel = new JLabelMe();
		jLabelIdArancel.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidArancel = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidArancel.setToolTipText(ArancelConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutArancel= new GridBagLayout();

		this.jPanelidArancel.setLayout(this.gridaBagLayoutArancel);

		jLabelidArancel = new JLabel();
		jLabelidArancel.setText("Id");

		jLabelidArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoArancel = new JLabelMe();
		this.jLabelcodigoArancel.setText(""+ArancelConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoArancel.setToolTipText("Codigo");
		this.jLabelcodigoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoArancel=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoArancel.setToolTipText(ArancelConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutArancel = new GridBagLayout();
		this.jPanelcodigoArancel.setLayout(this.gridaBagLayoutArancel);


		jTextFieldcodigoArancel= new JTextFieldMe();

		jTextFieldcodigoArancel.setEnabled(false);
		jTextFieldcodigoArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoArancelBusqueda= new JButtonMe();
		this.jButtoncodigoArancelBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoArancelBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoArancelBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoArancelBusqueda.setText("U");
		this.jButtoncodigoArancelBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoArancelBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoArancelBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoArancelBusqueda"));

		if(this.arancelSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoArancelBusqueda.setVisible(false);		}


					
		this.jLabelnombreArancel = new JLabelMe();
		this.jLabelnombreArancel.setText(""+ArancelConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreArancel.setToolTipText("Nombre");
		this.jLabelnombreArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreArancel=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreArancel.setToolTipText(ArancelConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutArancel = new GridBagLayout();
		this.jPanelnombreArancel.setLayout(this.gridaBagLayoutArancel);


		jTextAreanombreArancel= new JTextAreaMe();
		jTextAreanombreArancel.setEnabled(false);
		jTextAreanombreArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreArancel.setLineWrap(true);
		jTextAreanombreArancel.setWrapStyleWord(true);
		jTextAreanombreArancel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreArancel.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreArancel = new JScrollPane(jTextAreanombreArancel);
		jscrollPanenombreArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreArancelBusqueda= new JButtonMe();
		this.jButtonnombreArancelBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreArancelBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreArancelBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreArancelBusqueda.setText("U");
		this.jButtonnombreArancelBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreArancelBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreArancelBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreArancelBusqueda"));

		if(this.arancelSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreArancelBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeArancel = new JLabelMe();
		this.jLabelporcentajeArancel.setText(""+ArancelConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeArancel.setToolTipText("Porcentaje");
		this.jLabelporcentajeArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeArancel=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeArancel.setToolTipText(ArancelConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutArancel = new GridBagLayout();
		this.jPanelporcentajeArancel.setLayout(this.gridaBagLayoutArancel);


		jTextFieldporcentajeArancel= new JTextFieldMe();
		jTextFieldporcentajeArancel.setEnabled(false);
		jTextFieldporcentajeArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeArancel.setText("0.0");

		this.jButtonporcentajeArancelBusqueda= new JButtonMe();
		this.jButtonporcentajeArancelBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeArancelBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeArancelBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeArancelBusqueda.setText("U");
		this.jButtonporcentajeArancelBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeArancelBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeArancelBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeArancelBusqueda"));

		if(this.arancelSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeArancelBusqueda.setVisible(false);		}


					
		this.jLabelobservacionArancel = new JLabelMe();
		this.jLabelobservacionArancel.setText(""+ArancelConstantesFunciones.LABEL_OBSERVACION+" :");
		this.jLabelobservacionArancel.setToolTipText("Observacion");
		this.jLabelobservacionArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionArancel=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionArancel.setToolTipText(ArancelConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutArancel = new GridBagLayout();
		this.jPanelobservacionArancel.setLayout(this.gridaBagLayoutArancel);


		jTextAreaobservacionArancel= new JTextAreaMe();
		jTextAreaobservacionArancel.setEnabled(false);
		jTextAreaobservacionArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionArancel.setLineWrap(true);
		jTextAreaobservacionArancel.setWrapStyleWord(true);
		jTextAreaobservacionArancel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionArancel.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionArancel = new JScrollPane(jTextAreaobservacionArancel);
		jscrollPaneobservacionArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonobservacionArancelBusqueda= new JButtonMe();
		this.jButtonobservacionArancelBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionArancelBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionArancelBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionArancelBusqueda.setText("U");
		this.jButtonobservacionArancelBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionArancelBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionArancelBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionArancelBusqueda"));

		if(this.arancelSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionArancelBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysArancel() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaArancel = new JLabelMe();
		this.jLabelid_empresaArancel.setText(""+ArancelConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaArancel.setToolTipText("Empresa");
		this.jLabelid_empresaArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaArancel,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaArancel=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaArancel.setToolTipText(ArancelConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutArancel = new GridBagLayout();
		this.jPanelid_empresaArancel.setLayout(this.gridaBagLayoutArancel);


		jComboBoxid_empresaArancel= new JComboBoxMe();
		jComboBoxid_empresaArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaArancel,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaArancel.setEnabled(false);

		this.jButtonid_empresaArancel= new JButtonMe();
		this.jButtonid_empresaArancel.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaArancel.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaArancel.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaArancel.setText("Buscar");
		this.jButtonid_empresaArancel.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaArancel.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaArancel,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaArancel"));

		this.jButtonid_empresaArancelBusqueda= new JButtonMe();
		this.jButtonid_empresaArancelBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaArancelBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaArancelBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaArancelBusqueda.setText("U");
		this.jButtonid_empresaArancelBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaArancelBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaArancelBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaArancelBusqueda"));

		if(this.arancelSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaArancelBusqueda.setVisible(false);		}

		this.jButtonid_empresaArancelUpdate= new JButtonMe();
		this.jButtonid_empresaArancelUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaArancelUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaArancelUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaArancelUpdate.setText("U");
		this.jButtonid_empresaArancelUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaArancelUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaArancelUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaArancel.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaArancel.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaArancelUpdate"));



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
		//this.jInternalFrameDetalleArancel = new ArancelBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Arancel DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutArancel= new GridBagLayout();
		

		
		String sToolTipArancel="";
		sToolTipArancel=ArancelConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipArancel+="(Inventario.Arancel)";
		}
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			sToolTipArancel+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoArancel = new JButtonMe();
		this.jButtonModificarArancel = new JButtonMe();
        this.jButtonActualizarArancel = new JButtonMe();
        this.jButtonEliminarArancel = new JButtonMe();
        this.jButtonCancelarArancel = new JButtonMe();
        this.jButtonGuardarCambiosArancel = new JButtonMe();
		this.jButtonGuardarCambiosTablaArancel = new JButtonMe();
		this.jButtonCerrarArancel = new JButtonMe();
		
		this.jScrollPanelDatosArancel = new JScrollPane();   
        this.jScrollPanelDatosEdicionArancel = new JScrollPane();
		this.jScrollPanelDatosGeneralArancel = new JScrollPane();
				
		
		
		this.jPanelCamposArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Arancel";
		
		if(!this.arancelSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Aranceles" + this.sPath));
		} else {
			this.jScrollPanelDatosArancel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposArancel.setName("jPanelCamposArancel"); 

		this.jPanelCamposOcultosArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosArancel.setName("jPanelCamposOcultosArancel"); 

        this.jPanelAccionesArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesArancel.setToolTipText("Acciones");
        this.jPanelAccionesArancel.setName("Acciones"); 

		this.jPanelAccionesFormularioArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioArancel.setToolTipText("Acciones");
        this.jPanelAccionesFormularioArancel.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosArancel, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposArancel, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosArancel, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoArancel.setText("Nuevo");
		this.jButtonModificarArancel.setText("Editar");
        this.jButtonActualizarArancel.setText("Actualizar");
        this.jButtonEliminarArancel.setText("Eliminar");
        this.jButtonCancelarArancel.setText("Cancelar");
        this.jButtonGuardarCambiosArancel.setText("Guardar");
		this.jButtonGuardarCambiosTablaArancel.setText("Guardar");
		this.jButtonCerrarArancel.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoArancel,"nuevo_button","Nuevo",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarArancel,"modificar_button","Editar",this.arancelSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarArancel,"actualizar_button","Actualizar",this.arancelSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarArancel,"eliminar_button","Eliminar",this.arancelSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarArancel,"cancelar_button","Cancelar",this.arancelSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosArancel,"guardarcambios_button","Guardar",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaArancel,"guardarcambiostabla_button","Guardar",this.arancelSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarArancel,"cerrar_button","Salir",this.arancelSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarArancel, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarArancel, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoArancel.setToolTipText("Nuevo"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarArancel.setToolTipText("Editar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarArancel.setToolTipText("Actualizar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarArancel.setToolTipText("Eliminar)"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarArancel.setToolTipText("Cancelar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosArancel.setToolTipText("Guardar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaArancel.setToolTipText("Guardar"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarArancel.setToolTipText("Salir"+" "+ArancelConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoArancel";
		inputMap = this.jButtonNuevoArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoArancel.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoArancel"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarArancel";
		inputMap = this.jButtonActualizarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarArancel"));
		
		//ELIMINAR
		sMapKey = "EliminarArancel";
		inputMap = this.jButtonEliminarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarArancel"));
		
		//CANCELAR	
		sMapKey = "CancelarArancel";
		inputMap = this.jButtonCancelarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarArancel"));
		
		//CERRAR		
		sMapKey = "CerrarArancel";
		inputMap = this.jButtonCerrarArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarArancel"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaArancel";
		inputMap = this.jButtonGuardarCambiosTablaArancel.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaArancel.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaArancel"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoArancel = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoArancel.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoArancel.setToolTipText("Nuevo Arancel");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoArancel, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarArancel = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarArancel.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarArancel.setToolTipText("Sin Cerrar Ventana Arancel");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarArancel, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeArancel = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeArancel.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeArancel.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeArancel, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesArancel = new JComboBoxMe();
		//this.jComboBoxTiposAccionesArancel.setText("Accion");
		this.jComboBoxTiposAccionesArancel.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioArancel = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioArancel.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioArancel.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesArancel = new JLabelMe();
		
		this.jLabelAccionesArancel.setText("Acciones");		
		this.jLabelAccionesArancel.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArancel.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArancel.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposArancel();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysArancel();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesArancel=new JTabbedPane();
		this.jTabbedPaneRelacionesArancel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesArancel,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesArancel.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArancel.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArancel.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesArancel, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioArancel.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioArancel.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioArancel.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioArancel, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposArancel = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosArancel = new GridBagLayout();
		
		this.jPanelCamposArancel.setLayout(gridaBagLayoutCamposArancel);
		this.jPanelCamposOcultosArancel.setLayout(gridaBagLayoutCamposOcultosArancel);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 0;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidArancel.add(jLabelIdArancel, this.gridBagConstraintsArancel);



	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 1;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidArancel.add(jLabelidArancel, this.gridBagConstraintsArancel);


	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 0;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaArancel.add(jLabelid_empresaArancel, this.gridBagConstraintsArancel);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 2;
		this.gridBagConstraintsArancel.ipadx = 0;
		this.gridBagConstraintsArancel.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaArancel.add(jButtonid_empresaArancelBusqueda, this.gridBagConstraintsArancel);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 3;
		this.gridBagConstraintsArancel.ipadx = 0;
		this.gridBagConstraintsArancel.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaArancel.add(jButtonid_empresaArancelUpdate, this.gridBagConstraintsArancel);
	}

	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 1;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaArancel.add(jComboBoxid_empresaArancel, this.gridBagConstraintsArancel);


	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 0;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoArancel.add(jLabelcodigoArancel, this.gridBagConstraintsArancel);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 2;
		this.gridBagConstraintsArancel.ipadx = 0;
		this.gridBagConstraintsArancel.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoArancel.add(jButtoncodigoArancelBusqueda, this.gridBagConstraintsArancel);
	}

	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 1;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoArancel.add(jTextFieldcodigoArancel, this.gridBagConstraintsArancel);


	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 0;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreArancel.add(jLabelnombreArancel, this.gridBagConstraintsArancel);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 2;
		this.gridBagConstraintsArancel.ipadx = 0;
		this.gridBagConstraintsArancel.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreArancel.add(jButtonnombreArancelBusqueda, this.gridBagConstraintsArancel);
	}

	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 1;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreArancel.add(jscrollPanenombreArancel, this.gridBagConstraintsArancel);


	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 0;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeArancel.add(jLabelporcentajeArancel, this.gridBagConstraintsArancel);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 2;
		this.gridBagConstraintsArancel.ipadx = 0;
		this.gridBagConstraintsArancel.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeArancel.add(jButtonporcentajeArancelBusqueda, this.gridBagConstraintsArancel);
	}

	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 1;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeArancel.add(jTextFieldporcentajeArancel, this.gridBagConstraintsArancel);


	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 0;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionArancel.add(jLabelobservacionArancel, this.gridBagConstraintsArancel);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArancel = new GridBagConstraints();
		//this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = 2;
		this.gridBagConstraintsArancel.ipadx = 0;
		this.gridBagConstraintsArancel.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionArancel.add(jButtonobservacionArancelBusqueda, this.gridBagConstraintsArancel);
	}

	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArancel.gridy = 0;
	this.gridBagConstraintsArancel.gridx = 1;
	this.gridBagConstraintsArancel.ipadx = 0;
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionArancel.add(jscrollPaneobservacionArancel, this.gridBagConstraintsArancel);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArancel.gridy = iYPanelCamposArancel;
	this.gridBagConstraintsArancel.gridx = iXPanelCamposArancel++;
	this.gridBagConstraintsArancel.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArancel.add(this.jPanelidArancel, this.gridBagConstraintsArancel);



	if(iXPanelCamposArancel % 1==0) {
		iXPanelCamposArancel=0;
		iYPanelCamposArancel++;
	}
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArancel.gridy = iYPanelCamposArancel;
	this.gridBagConstraintsArancel.gridx = iXPanelCamposArancel++;
	this.gridBagConstraintsArancel.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArancel.add(this.jPanelcodigoArancel, this.gridBagConstraintsArancel);



	if(iXPanelCamposArancel % 1==0) {
		iXPanelCamposArancel=0;
		iYPanelCamposArancel++;
	}
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArancel.gridy = iYPanelCamposArancel;
	this.gridBagConstraintsArancel.gridx = iXPanelCamposArancel++;
	this.gridBagConstraintsArancel.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArancel.add(this.jPanelnombreArancel, this.gridBagConstraintsArancel);



	if(iXPanelCamposArancel % 1==0) {
		iXPanelCamposArancel=0;
		iYPanelCamposArancel++;
	}
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArancel.gridy = iYPanelCamposArancel;
	this.gridBagConstraintsArancel.gridx = iXPanelCamposArancel++;
	this.gridBagConstraintsArancel.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArancel.add(this.jPanelporcentajeArancel, this.gridBagConstraintsArancel);



	if(iXPanelCamposArancel % 1==0) {
		iXPanelCamposArancel=0;
		iYPanelCamposArancel++;
	}
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArancel.gridy = iYPanelCamposArancel;
	this.gridBagConstraintsArancel.gridx = iXPanelCamposArancel++;
	this.gridBagConstraintsArancel.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArancel.add(this.jPanelobservacionArancel, this.gridBagConstraintsArancel);



	if(iXPanelCamposArancel % 1==0) {
		iXPanelCamposArancel=0;
		iYPanelCamposArancel++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsArancel = new GridBagConstraints();
	this.gridBagConstraintsArancel.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArancel.gridy = iYPanelCamposOcultosArancel;
	this.gridBagConstraintsArancel.gridx = iXPanelCamposOcultosArancel++;
	this.gridBagConstraintsArancel.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArancel.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosArancel.add(this.jPanelid_empresaArancel, this.gridBagConstraintsArancel);



	if(iXPanelCamposOcultosArancel % 1==0) {
		iXPanelCamposOcultosArancel=0;
		iYPanelCamposOcultosArancel++;
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
			
		GridBagLayout gridaBagLayoutAccionesArancel= new GridBagLayout();
		this.jPanelAccionesArancel.setLayout(gridaBagLayoutAccionesArancel);
		
		GridBagLayout gridaBagLayoutAccionesFormularioArancel= new GridBagLayout();
		this.jPanelAccionesFormularioArancel.setLayout(gridaBagLayoutAccionesFormularioArancel);
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsArancel.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioArancel.add(this.jComboBoxTiposAccionesFormularioArancel, this.gridBagConstraintsArancel);

		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsArancel.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioArancel.add(this.jCheckBoxPostAccionNuevoArancel, this.gridBagConstraintsArancel);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.arancelSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsArancel.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioArancel.add(this.jCheckBoxPostAccionSinCerrarArancel, this.gridBagConstraintsArancel);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.arancelSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.arancelSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsArancel.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioArancel.add(this.jCheckBoxPostAccionSinMensajeArancel, this.gridBagConstraintsArancel);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx = iPosXAccion++;
			
		this.jPanelAccionesArancel.add(this.jButtonModificarArancel, this.gridBagConstraintsArancel);							

		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArancel.gridy = 0;
		this.gridBagConstraintsArancel.gridx =iPosXAccion++;
			
		this.jPanelAccionesArancel.add(this.jButtonEliminarArancel, this.gridBagConstraintsArancel);
		
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = 0;		
		this.gridBagConstraintsArancel.gridx = iPosXAccion++;
		
		this.jPanelAccionesArancel.add(this.jButtonActualizarArancel, this.gridBagConstraintsArancel);


		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = 0;		
		this.gridBagConstraintsArancel.gridx = iPosXAccion++;
		
		this.jPanelAccionesArancel.add(this.jButtonGuardarCambiosArancel, this.gridBagConstraintsArancel);	
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = 0;		
		this.gridBagConstraintsArancel.gridx =iPosXAccion++;
		
		this.jPanelAccionesArancel.add(this.jButtonCancelarArancel, this.gridBagConstraintsArancel);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutArancel = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutArancel);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.arancelSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsArancel = new GridBagConstraints();						
			this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;
			this.gridBagConstraintsArancel.gridx = 0;		
			//this.gridBagConstraintsArancel.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsArancel.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy =iGridyPrincipal++;
		this.gridBagConstraintsArancel.gridx =0;
		this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsArancel.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosArancel, this.gridBagConstraintsArancel);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ArancelJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleArancel = new ArancelBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Arancel DATOS");
			
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
			
	        //this.setTitle("[FOR] - Arancel DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Arancel Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ArancelModel arancelModel=new ArancelModel(this);
			
			//SI USARA CLASE INTERNA
			//ArancelModel.ArancelFocusTraversalPolicy arancelFocusTraversalPolicy = arancelModel.new ArancelFocusTraversalPolicy(this);
			
			//arancelFocusTraversalPolicy.setarancelJInternalFrame(this);
			
			this.setFocusTraversalPolicy(arancelModel);
			
			
			this.jContentPaneDetalleArancel = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleArancel = new GridBagLayout();	
			this.jContentPaneDetalleArancel.setLayout(gridaBagLayoutDetalleArancel);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosArancel = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsArancel = new GridBagConstraints();
				this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsArancel.gridx = 0;
					
				
				this.jContentPaneDetalleArancel.add(jTtoolBarDetalleArancel, gridBagConstraintsArancel);								
				
}
			
			this.jScrollPanelDatosEdicionArancel=   new JScrollPane(jContentPaneDetalleArancel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionArancel.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArancel.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArancel.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralArancel=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralArancel.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArancel.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArancel.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			
			
	        this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsArancel.gridx = 0;
	        
			this.jContentPaneDetalleArancel.add(jPanelCamposArancel, gridBagConstraintsArancel);
			
			
			
			
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
						&& arancelSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(this.puedeCargarPorParteDetallePedidoCompraImpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(this.puedeCargarPorParteProducto,false,-1);
					
					if(this.arancelSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsArancel= new GridBagConstraints();
						this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;
						this.gridBagConstraintsArancel.gridx = 0;
						this.jContentPaneDetalleArancel.add(this.jTabbedPaneRelacionesArancel, this.gridBagConstraintsArancel);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesArancel.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosArancel.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsArancel = new GridBagConstraints();
					this.gridBagConstraintsArancel.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsArancel.gridx = 0;
					
				
					this.jContentPaneDetalleArancel.add(jPanelCamposOcultosArancel, gridBagConstraintsArancel);
				
					this.jPanelCamposOcultosArancel.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsArancel.gridx = 0;
	        this.gridBagConstraintsArancel.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleArancel.add(this.jPanelAccionesFormularioArancel, this.gridBagConstraintsArancel);							
			
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
	        this.gridBagConstraintsArancel.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsArancel.gridx = 0;
	        
			
			this.jContentPaneDetalleArancel.add(this.jPanelAccionesArancel, this.gridBagConstraintsArancel);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionArancel);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionArancel=   new JScrollPane(this.jPanelCamposArancel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionArancel.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArancel.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArancel.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsArancel.gridx = 0;
			this.gridBagConstraintsArancel.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsArancel.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsArancel.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionArancel, this.gridBagConstraintsArancel);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsArancel.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioArancel, this.gridBagConstraintsArancel);			
			
			this.gridBagConstraintsArancel = new GridBagConstraints();
			this.gridBagConstraintsArancel.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsArancel.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesArancel, this.gridBagConstraintsArancel);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposArancel, this.gridBagConstraintsArancel);
			
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosArancel, this.gridBagConstraintsArancel);
		
			
		this.gridBagConstraintsArancel = new GridBagConstraints();
		this.gridBagConstraintsArancel.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsArancel.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesArancel, this.gridBagConstraintsArancel);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralArancel;//jContentPane;
		
		return jScrollPanelDatosEdicionArancel;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetallePedidoCompraImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
		this.detallepedidocompraimporSessionBean.setConGuardarRelaciones(false);
		this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(true);

		this.detallepedidocompraimporBeanSwingJInternalFrame=null;//new DetallePedidoCompraImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallepedidocompraimporBeanSwingJInternalFramePopup=new DetallePedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallepedidocompraimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {

				DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=ArancelJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ArancelJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(true);

				this.detallepedidocompraimporBeanSwingJInternalFrame=new DetallePedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallepedidocompraimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallepedidocompraimporBeanSwingJInternalFrame.setdetallepedidocompraimporSessionBean(this.detallepedidocompraimporSessionBean);

				//this.gridBagConstraintsArancel = new GridBagConstraints();
				//this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsArancel.gridx = 0;
				//this.jContentPaneDetalleArancel.add(this.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsArancel);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesArancel.add("Detalle Pedido Compras",this.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesArancel.setComponentAt(iIndexTab,this.detallepedidocompraimporBeanSwingJInternalFrame.getContentPane());
				}

				//DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				this.detallepedidocompraimporBeanSwingJInternalFrame=null;//new DetallePedidoCompraImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetallePedidoCompraImpor) {
					this.jTabbedPaneRelacionesArancel.add("Detalle Pedido Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.productoSessionBean=new ProductoSessionBean();
		this.productoSessionBean.setConGuardarRelaciones(false);
		this.productoSessionBean.setEsGuardarRelacionado(true);

		this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.productoBeanSwingJInternalFramePopup=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.productoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.productoSessionBean.getEsGuardarRelacionado()) {

				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL=ArancelJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ArancelJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.productoSessionBean.setEsGuardarRelacionado(true);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.productoBeanSwingJInternalFrame.setproductoSessionBean(this.productoSessionBean);

				//this.gridBagConstraintsArancel = new GridBagConstraints();
				//this.gridBagConstraintsArancel.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsArancel.gridx = 0;
				//this.jContentPaneDetalleArancel.add(this.productoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsArancel);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesArancel.add("Productos",this.productoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesArancel.setComponentAt(iIndexTab,this.productoBeanSwingJInternalFrame.getContentPane());
				}

				//ProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.productoSessionBean.setEsGuardarRelacionado(false);
				this.productoBeanSwingJInternalFrame=null;//new ProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.productoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProducto) {
					this.jTabbedPaneRelacionesArancel.add("Productos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProductoBeanSwingJInternalFrame(List<Arancel> arancels,Arancel arancel,ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.arancelLogic.getConnexion());

					productoBeanSwingJInternalFrame.setarancelsForeignKey(arancels);
					productoBeanSwingJInternalFrame.setarancelForeignKey(arancel);
					productoBeanSwingJInternalFrame.productoSessionBean.setisBusquedaDesdeForeignKeySesionArancel(true);
					productoBeanSwingJInternalFrame.productoSessionBean.setlidArancelActual(arancel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					productoBeanSwingJInternalFrame.cargarCombosForeignKeyProducto(productoBeanSwingJInternalFrame.isCargarCombosDependencia);
					productoBeanSwingJInternalFrame.setVisibilidadBusquedasParaArancel(true);
					productoBeanSwingJInternalFrame.setid_arancelFK_IdArancel(arancel.getId());

					if(!this.conCargarFormDetalle) {
						productoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					productoBeanSwingJInternalFrame.setSelectedItemCombosFrameArancelForeignKey(arancel,1,false,true,true);
					productoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					productoBeanSwingJInternalFrame.procesarBusqueda("FK_IdArancel");
					productoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdArancel");
					productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto(true);
					productoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProducto("n",productoBeanSwingJInternalFrame.isGuardarCambiosEnLote, productoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					productoBeanSwingJInternalFrame.setAutoscrolls(true);
					productoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("relacionado");
					} else {
						productoBeanSwingJInternalFrame.actualizarEstadoPanelsProducto("no_relacionado");
					}

					productoBeanSwingJInternalFrame.getjButtonRecargarInformacionProducto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetallePedidoCompraImporBeanSwingJInternalFrame(List<Arancel> arancels,Arancel arancel,DetallePedidoCompraImporBeanSwingJInternalFrame detallepedidocompraimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallepedidocompraimporBeanSwingJInternalFrame=new DetallePedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallepedidocompraimporBeanSwingJInternalFrame.getDetallePedidoCompraImporLogic().setConnexion(this.arancelLogic.getConnexion());

					detallepedidocompraimporBeanSwingJInternalFrame.setarancelsForeignKey(arancels);
					detallepedidocompraimporBeanSwingJInternalFrame.setarancelForeignKey(arancel);
					detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionArancel(true);
					detallepedidocompraimporBeanSwingJInternalFrame.detallepedidocompraimporSessionBean.setlidArancelActual(arancel.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallepedidocompraimporBeanSwingJInternalFrame.cargarCombosForeignKeyDetallePedidoCompraImpor(detallepedidocompraimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallepedidocompraimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaArancel(true);
					detallepedidocompraimporBeanSwingJInternalFrame.setid_arancelFK_IdArancel(arancel.getId());

					if(!this.conCargarFormDetalle) {
						detallepedidocompraimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallepedidocompraimporBeanSwingJInternalFrame.setSelectedItemCombosFrameArancelForeignKey(arancel,1,false,true,true);
					detallepedidocompraimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallepedidocompraimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdArancel");
					detallepedidocompraimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdArancel");
					detallepedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetallePedidoCompraImpor(true);
					detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetallePedidoCompraImpor("n",detallepedidocompraimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallepedidocompraimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallepedidocompraimporBeanSwingJInternalFrame.setAutoscrolls(true);
					detallepedidocompraimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompraImpor("relacionado");
					} else {
						detallepedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetallePedidoCompraImpor("no_relacionado");
					}

					detallepedidocompraimporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetallePedidoCompraImpor().setVisible(false);

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
