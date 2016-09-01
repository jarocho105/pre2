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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.UtilidadTipoPrecioConstantesFunciones;

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
public class UtilidadTipoPrecioDetalleFormJInternalFrame extends UtilidadTipoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleUtilidadTipoPrecio;
	
	protected JMenuBar jmenuBarDetalleUtilidadTipoPrecio;
	
	protected JMenu jmenuDetalleUtilidadTipoPrecio;
	protected JMenu jmenuDetalleArchivoUtilidadTipoPrecio;
	protected JMenu jmenuDetalleAccionesUtilidadTipoPrecio;
	protected JMenu jmenuDetalleDatosUtilidadTipoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutUtilidadTipoPrecio;	
	protected GridBagConstraints gridBagConstraintsUtilidadTipoPrecio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected UtilidadTipoPrecioBeanSwingJInternalFrameAdditional jInternalFrameDetalleUtilidadTipoPrecio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";
	
	public UtilidadTipoPrecioSessionBean utilidadtipoprecioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;	
	
	public UtilidadTipoPrecioLogic utilidadtipoprecioLogic;
	
	public JScrollPane jScrollPanelDatosUtilidadTipoPrecio;
	public JScrollPane jScrollPanelDatosEdicionUtilidadTipoPrecio;
	public JScrollPane jScrollPanelDatosGeneralUtilidadTipoPrecio;
	
	protected JPanel jPanelCamposUtilidadTipoPrecio;    
	protected JPanel jPanelCamposOcultosUtilidadTipoPrecio;    	
	protected JPanel jPanelAccionesUtilidadTipoPrecio;
	protected JPanel jPanelAccionesFormularioUtilidadTipoPrecio;
    
	
	
	protected Integer iXPanelCamposUtilidadTipoPrecio=0;
	protected Integer iYPanelCamposUtilidadTipoPrecio=0;
	
	protected Integer iXPanelCamposOcultosUtilidadTipoPrecio=0;
	protected Integer iYPanelCamposOcultosUtilidadTipoPrecio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoUtilidadTipoPrecio;
	public JButton jButtonModificarUtilidadTipoPrecio;
	public JButton jButtonActualizarUtilidadTipoPrecio;
    public JButton jButtonEliminarUtilidadTipoPrecio;
	public JButton jButtonCancelarUtilidadTipoPrecio;
    public JButton jButtonGuardarCambiosUtilidadTipoPrecio;
	public JButton jButtonGuardarCambiosTablaUtilidadTipoPrecio;
	protected JButton jButtonCerrarUtilidadTipoPrecio;
	
	
	protected JButton jButtonProcesarInformacionUtilidadTipoPrecio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoUtilidadTipoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarUtilidadTipoPrecio;
	protected JButton jButtonModificarToolBarUtilidadTipoPrecio;
	protected JButton jButtonActualizarToolBarUtilidadTipoPrecio;
    protected JButton jButtonEliminarToolBarUtilidadTipoPrecio;
	protected JButton jButtonCancelarToolBarUtilidadTipoPrecio;
    protected JButton jButtonGuardarCambiosToolBarUtilidadTipoPrecio;
	protected JButton jButtonGuardarCambiosTablaToolBarUtilidadTipoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarUtilidadTipoPrecio;
	protected JButton jButtonCerrarToolBarUtilidadTipoPrecio;
	
	protected JButton jButtonProcesarInformacionToolBarUtilidadTipoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoUtilidadTipoPrecio;
	protected JMenuItem jMenuItemModificarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemActualizarUtilidadTipoPrecio;
    protected JMenuItem jMenuItemEliminarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemCancelarUtilidadTipoPrecio;
    protected JMenuItem jMenuItemGuardarCambiosUtilidadTipoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaUtilidadTipoPrecio;
	protected JMenuItem jMenuItemCerrarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarUtilidadTipoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarUtilidadTipoPrecio;
	
	protected JMenuItem jMenuItemProcesarInformacionUtilidadTipoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosUtilidadTipoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarUtilidadTipoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesUtilidadTipoPrecio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesUtilidadTipoPrecio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioUtilidadTipoPrecio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidUtilidadTipoPrecio;
	public JLabel jLabelIdUtilidadTipoPrecio;
	public JLabel jLabelidUtilidadTipoPrecio;
	public JButton jButtonidUtilidadTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeUtilidadTipoPrecio;
	public JLabel jLabelporcentajeUtilidadTipoPrecio;
	public JTextField jTextFieldporcentajeUtilidadTipoPrecio;
	public JButton jButtonporcentajeUtilidadTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaUtilidadTipoPrecio;
	public JLabel jLabelid_empresaUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaUtilidadTipoPrecio;
	public JButton jButtonid_empresaUtilidadTipoPrecio= new JButtonMe();
	public JButton jButtonid_empresaUtilidadTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_empresaUtilidadTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalUtilidadTipoPrecio;
	public JLabel jLabelid_sucursalUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalUtilidadTipoPrecio;
	public JButton jButtonid_sucursalUtilidadTipoPrecio= new JButtonMe();
	public JButton jButtonid_sucursalUtilidadTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalUtilidadTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioUtilidadTipoPrecio;
	public JLabel jLabelid_tipo_precioUtilidadTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioUtilidadTipoPrecio;
	public JButton jButtonid_tipo_precioUtilidadTipoPrecio= new JButtonMe();
	public JButton jButtonid_tipo_precioUtilidadTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioUtilidadTipoPrecioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesUtilidadTipoPrecio;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public UtilidadTipoPrecioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposUtilidadTipoPrecio=new JPanel();
				this.jPanelAccionesFormularioUtilidadTipoPrecio=new JPanel();
				this.jmenuBarDetalleUtilidadTipoPrecio=new JMenuBar();
				this.jTtoolBarDetalleUtilidadTipoPrecio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public UtilidadTipoPrecioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public UtilidadTipoPrecioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("UtilidadTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarUtilidadTipoPrecio() {
		return this.jButtonActualizarToolBarUtilidadTipoPrecio;
	}
	
	public JButton getjButtonEliminarToolBarUtilidadTipoPrecio() {
		return this.jButtonEliminarToolBarUtilidadTipoPrecio;
	}
	
	public JButton getjButtonCancelarToolBarUtilidadTipoPrecio() {
		return this.jButtonCancelarToolBarUtilidadTipoPrecio;
	}		
	
	public JButton getjButtonProcesarInformacionUtilidadTipoPrecio() {
		return this.jButtonProcesarInformacionUtilidadTipoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionUtilidadTipoPrecio)	{
		this.jButtonProcesarInformacionUtilidadTipoPrecio = jButtonProcesarInformacionUtilidadTipoPrecio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesUtilidadTipoPrecio() {
		return this.jComboBoxTiposAccionesUtilidadTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposRelacionesUtilidadTipoPrecio) {
		this.jComboBoxTiposRelacionesUtilidadTipoPrecio = jComboBoxTiposRelacionesUtilidadTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesUtilidadTipoPrecio(
			JComboBox jComboBoxTiposAccionesUtilidadTipoPrecio) {
		this.jComboBoxTiposAccionesUtilidadTipoPrecio = jComboBoxTiposAccionesUtilidadTipoPrecio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioUtilidadTipoPrecio() {
		return this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioUtilidadTipoPrecio(
			JComboBox jComboBoxTiposAccionesFormularioUtilidadTipoPrecio) {
		this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio = jComboBoxTiposAccionesFormularioUtilidadTipoPrecio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.utilidadtipoprecioSessionBean=new UtilidadTipoPrecioSessionBean();
		
		this.utilidadtipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadtipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		UtilidadTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		UtilidadTipoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Utilidad Tipo Precio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
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
	
		UtilidadTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleUtilidadTipoPrecio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarUtilidadTipoPrecio=new JButtonMe();
				this.jButtonModificarToolBarUtilidadTipoPrecio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarUtilidadTipoPrecio,this.jTtoolBarDetalleUtilidadTipoPrecio,
							"actualizar","actualizar","Actualizar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarUtilidadTipoPrecio,this.jTtoolBarDetalleUtilidadTipoPrecio,
							"eliminar","eliminar","Eliminar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarUtilidadTipoPrecio,this.jTtoolBarDetalleUtilidadTipoPrecio,
							"cancelar","cancelar","Cancelar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarUtilidadTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarUtilidadTipoPrecio,this.jTtoolBarDetalleUtilidadTipoPrecio,
							"guardarcambios","guardarcambios","Guardar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleUtilidadTipoPrecio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleUtilidadTipoPrecio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoUtilidadTipoPrecio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesUtilidadTipoPrecio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosUtilidadTipoPrecio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoUtilidadTipoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoUtilidadTipoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoUtilidadTipoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarUtilidadTipoPrecio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarUtilidadTipoPrecio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarUtilidadTipoPrecio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarUtilidadTipoPrecio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarUtilidadTipoPrecio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarUtilidadTipoPrecio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarUtilidadTipoPrecio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarUtilidadTipoPrecio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarUtilidadTipoPrecio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarUtilidadTipoPrecio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarUtilidadTipoPrecio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarUtilidadTipoPrecio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosUtilidadTipoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosUtilidadTipoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosUtilidadTipoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarUtilidadTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarUtilidadTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarUtilidadTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarUtilidadTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarUtilidadTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarUtilidadTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarUtilidadTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarUtilidadTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarUtilidadTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoUtilidadTipoPrecio.add(this.jMenuItemDetalleCerrarUtilidadTipoPrecio);
		
		this.jmenuDetalleAccionesUtilidadTipoPrecio.add(this.jMenuItemActualizarUtilidadTipoPrecio);
		this.jmenuDetalleAccionesUtilidadTipoPrecio.add(this.jMenuItemEliminarUtilidadTipoPrecio);
		this.jmenuDetalleAccionesUtilidadTipoPrecio.add(this.jMenuItemCancelarUtilidadTipoPrecio);		
		
		//this.jmenuDetalleDatosUtilidadTipoPrecio.add(this.jMenuItemDetalleAbrirOrderByUtilidadTipoPrecio);				
		this.jmenuDetalleDatosUtilidadTipoPrecio.add(this.jMenuItemDetalleMostarOcultarUtilidadTipoPrecio);				
				
		//this.jmenuDetalleAccionesUtilidadTipoPrecio.add(this.jMenuItemGuardarCambiosUtilidadTipoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleUtilidadTipoPrecio.add(this.jmenuDetalleArchivoUtilidadTipoPrecio);		
		this.jmenuBarDetalleUtilidadTipoPrecio.add(this.jmenuDetalleAccionesUtilidadTipoPrecio);		
		this.jmenuBarDetalleUtilidadTipoPrecio.add(this.jmenuDetalleDatosUtilidadTipoPrecio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleUtilidadTipoPrecio);				
	}
	
	
	public void inicializarElementosCamposUtilidadTipoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdUtilidadTipoPrecio = new JLabelMe();
		jLabelIdUtilidadTipoPrecio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidUtilidadTipoPrecio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidUtilidadTipoPrecio.setToolTipText(UtilidadTipoPrecioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutUtilidadTipoPrecio= new GridBagLayout();

		this.jPanelidUtilidadTipoPrecio.setLayout(this.gridaBagLayoutUtilidadTipoPrecio);

		jLabelidUtilidadTipoPrecio = new JLabel();
		jLabelidUtilidadTipoPrecio.setText("Id");

		jLabelidUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeUtilidadTipoPrecio = new JLabelMe();
		this.jLabelporcentajeUtilidadTipoPrecio.setText(""+UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeUtilidadTipoPrecio.setToolTipText("Porcentaje");
		this.jLabelporcentajeUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeUtilidadTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeUtilidadTipoPrecio.setToolTipText(UtilidadTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutUtilidadTipoPrecio = new GridBagLayout();
		this.jPanelporcentajeUtilidadTipoPrecio.setLayout(this.gridaBagLayoutUtilidadTipoPrecio);


		jTextFieldporcentajeUtilidadTipoPrecio= new JTextFieldMe();
		jTextFieldporcentajeUtilidadTipoPrecio.setEnabled(false);
		jTextFieldporcentajeUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeUtilidadTipoPrecio.setText("0.0");

		this.jButtonporcentajeUtilidadTipoPrecioBusqueda= new JButtonMe();
		this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setText("U");
		this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeUtilidadTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeUtilidadTipoPrecioBusqueda"));

		if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeUtilidadTipoPrecioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysUtilidadTipoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaUtilidadTipoPrecio = new JLabelMe();
		this.jLabelid_empresaUtilidadTipoPrecio.setText(""+UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaUtilidadTipoPrecio.setToolTipText("Empresa");
		this.jLabelid_empresaUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaUtilidadTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaUtilidadTipoPrecio.setToolTipText(UtilidadTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutUtilidadTipoPrecio = new GridBagLayout();
		this.jPanelid_empresaUtilidadTipoPrecio.setLayout(this.gridaBagLayoutUtilidadTipoPrecio);


		jComboBoxid_empresaUtilidadTipoPrecio= new JComboBoxMe();
		jComboBoxid_empresaUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaUtilidadTipoPrecio.setEnabled(false);

		this.jButtonid_empresaUtilidadTipoPrecio= new JButtonMe();
		this.jButtonid_empresaUtilidadTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaUtilidadTipoPrecio.setText("Buscar");
		this.jButtonid_empresaUtilidadTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaUtilidadTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadTipoPrecio"));

		this.jButtonid_empresaUtilidadTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setText("U");
		this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadTipoPrecioBusqueda"));

		if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaUtilidadTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_empresaUtilidadTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_empresaUtilidadTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaUtilidadTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaUtilidadTipoPrecioUpdate.setText("U");
		this.jButtonid_empresaUtilidadTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaUtilidadTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaUtilidadTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaUtilidadTipoPrecioUpdate"));



					
		this.jLabelid_sucursalUtilidadTipoPrecio = new JLabelMe();
		this.jLabelid_sucursalUtilidadTipoPrecio.setText(""+UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalUtilidadTipoPrecio.setToolTipText("Sucursal");
		this.jLabelid_sucursalUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalUtilidadTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalUtilidadTipoPrecio.setToolTipText(UtilidadTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutUtilidadTipoPrecio = new GridBagLayout();
		this.jPanelid_sucursalUtilidadTipoPrecio.setLayout(this.gridaBagLayoutUtilidadTipoPrecio);


		jComboBoxid_sucursalUtilidadTipoPrecio= new JComboBoxMe();
		jComboBoxid_sucursalUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalUtilidadTipoPrecio.setEnabled(false);

		this.jButtonid_sucursalUtilidadTipoPrecio= new JButtonMe();
		this.jButtonid_sucursalUtilidadTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalUtilidadTipoPrecio.setText("Buscar");
		this.jButtonid_sucursalUtilidadTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalUtilidadTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadTipoPrecio"));

		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setText("U");
		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadTipoPrecioBusqueda"));

		if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalUtilidadTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalUtilidadTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_sucursalUtilidadTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalUtilidadTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalUtilidadTipoPrecioUpdate.setText("U");
		this.jButtonid_sucursalUtilidadTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalUtilidadTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalUtilidadTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalUtilidadTipoPrecioUpdate"));



					
		this.jLabelid_tipo_precioUtilidadTipoPrecio = new JLabelMe();
		this.jLabelid_tipo_precioUtilidadTipoPrecio.setText(""+UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioUtilidadTipoPrecio.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioUtilidadTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioUtilidadTipoPrecio.setToolTipText(UtilidadTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutUtilidadTipoPrecio = new GridBagLayout();
		this.jPanelid_tipo_precioUtilidadTipoPrecio.setLayout(this.gridaBagLayoutUtilidadTipoPrecio);


		jComboBoxid_tipo_precioUtilidadTipoPrecio= new JComboBoxMe();
		jComboBoxid_tipo_precioUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioUtilidadTipoPrecio= new JButtonMe();
		this.jButtonid_tipo_precioUtilidadTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioUtilidadTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioUtilidadTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioUtilidadTipoPrecio.setText("Buscar");
		this.jButtonid_tipo_precioUtilidadTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioUtilidadTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioUtilidadTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioUtilidadTipoPrecio"));

		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setText("U");
		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioUtilidadTipoPrecioBusqueda"));

		if(this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioUtilidadTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.setText("U");
		this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioUtilidadTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioUtilidadTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioUtilidadTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioUtilidadTipoPrecioUpdate"));



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
		//this.jInternalFrameDetalleUtilidadTipoPrecio = new UtilidadTipoPrecioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Utilidad Tipo Precio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutUtilidadTipoPrecio= new GridBagLayout();
		

		
		String sToolTipUtilidadTipoPrecio="";
		sToolTipUtilidadTipoPrecio=UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipUtilidadTipoPrecio+="(Inventario.UtilidadTipoPrecio)";
		}
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipUtilidadTipoPrecio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoUtilidadTipoPrecio = new JButtonMe();
		this.jButtonModificarUtilidadTipoPrecio = new JButtonMe();
        this.jButtonActualizarUtilidadTipoPrecio = new JButtonMe();
        this.jButtonEliminarUtilidadTipoPrecio = new JButtonMe();
        this.jButtonCancelarUtilidadTipoPrecio = new JButtonMe();
        this.jButtonGuardarCambiosUtilidadTipoPrecio = new JButtonMe();
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio = new JButtonMe();
		this.jButtonCerrarUtilidadTipoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosUtilidadTipoPrecio = new JScrollPane();   
        this.jScrollPanelDatosEdicionUtilidadTipoPrecio = new JScrollPane();
		this.jScrollPanelDatosGeneralUtilidadTipoPrecio = new JScrollPane();
				
		
		
		this.jPanelCamposUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Utilidad Tipo Precio";
		
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Utilidad Tipo Precioes" + this.sPath));
		} else {
			this.jScrollPanelDatosUtilidadTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposUtilidadTipoPrecio.setName("jPanelCamposUtilidadTipoPrecio"); 

		this.jPanelCamposOcultosUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosUtilidadTipoPrecio.setName("jPanelCamposOcultosUtilidadTipoPrecio"); 

        this.jPanelAccionesUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesUtilidadTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesUtilidadTipoPrecio.setName("Acciones"); 

		this.jPanelAccionesFormularioUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioUtilidadTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioUtilidadTipoPrecio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoUtilidadTipoPrecio.setText("Nuevo");
		this.jButtonModificarUtilidadTipoPrecio.setText("Editar");
        this.jButtonActualizarUtilidadTipoPrecio.setText("Actualizar");
        this.jButtonEliminarUtilidadTipoPrecio.setText("Eliminar");
        this.jButtonCancelarUtilidadTipoPrecio.setText("Cancelar");
        this.jButtonGuardarCambiosUtilidadTipoPrecio.setText("Guardar");
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.setText("Guardar");
		this.jButtonCerrarUtilidadTipoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoUtilidadTipoPrecio,"nuevo_button","Nuevo",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarUtilidadTipoPrecio,"modificar_button","Editar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarUtilidadTipoPrecio,"actualizar_button","Actualizar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarUtilidadTipoPrecio,"eliminar_button","Eliminar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarUtilidadTipoPrecio,"cancelar_button","Cancelar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosUtilidadTipoPrecio,"guardarcambios_button","Guardar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaUtilidadTipoPrecio,"guardarcambiostabla_button","Guardar",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarUtilidadTipoPrecio,"cerrar_button","Salir",this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoUtilidadTipoPrecio.setToolTipText("Nuevo"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarUtilidadTipoPrecio.setToolTipText("Editar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarUtilidadTipoPrecio.setToolTipText("Actualizar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarUtilidadTipoPrecio.setToolTipText("Eliminar)"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarUtilidadTipoPrecio.setToolTipText("Cancelar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosUtilidadTipoPrecio.setToolTipText("Guardar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.setToolTipText("Guardar"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarUtilidadTipoPrecio.setToolTipText("Salir"+" "+UtilidadTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoUtilidadTipoPrecio";
		inputMap = this.jButtonNuevoUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoUtilidadTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoUtilidadTipoPrecio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarUtilidadTipoPrecio";
		inputMap = this.jButtonActualizarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarUtilidadTipoPrecio"));
		
		//ELIMINAR
		sMapKey = "EliminarUtilidadTipoPrecio";
		inputMap = this.jButtonEliminarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarUtilidadTipoPrecio"));
		
		//CANCELAR	
		sMapKey = "CancelarUtilidadTipoPrecio";
		inputMap = this.jButtonCancelarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarUtilidadTipoPrecio"));
		
		//CERRAR		
		sMapKey = "CerrarUtilidadTipoPrecio";
		inputMap = this.jButtonCerrarUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarUtilidadTipoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaUtilidadTipoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaUtilidadTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaUtilidadTipoPrecio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoUtilidadTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoUtilidadTipoPrecio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoUtilidadTipoPrecio.setToolTipText("Nuevo UtilidadTipoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio.setToolTipText("Sin Cerrar Ventana UtilidadTipoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesUtilidadTipoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesUtilidadTipoPrecio = new JLabelMe();
		
		this.jLabelAccionesUtilidadTipoPrecio.setText("Acciones");		
		this.jLabelAccionesUtilidadTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesUtilidadTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposUtilidadTipoPrecio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysUtilidadTipoPrecio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesUtilidadTipoPrecio=new JTabbedPane();
		this.jTabbedPaneRelacionesUtilidadTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesUtilidadTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposUtilidadTipoPrecio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosUtilidadTipoPrecio = new GridBagLayout();
		
		this.jPanelCamposUtilidadTipoPrecio.setLayout(gridaBagLayoutCamposUtilidadTipoPrecio);
		this.jPanelCamposOcultosUtilidadTipoPrecio.setLayout(gridaBagLayoutCamposOcultosUtilidadTipoPrecio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidUtilidadTipoPrecio.add(jLabelIdUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 1;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidUtilidadTipoPrecio.add(jLabelidUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaUtilidadTipoPrecio.add(jLabelid_empresaUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 2;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadTipoPrecio.add(jButtonid_empresaUtilidadTipoPrecioBusqueda, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 3;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaUtilidadTipoPrecio.add(jButtonid_empresaUtilidadTipoPrecioUpdate, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 1;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaUtilidadTipoPrecio.add(jComboBoxid_empresaUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalUtilidadTipoPrecio.add(jLabelid_sucursalUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 2;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUtilidadTipoPrecio.add(jButtonid_sucursalUtilidadTipoPrecioBusqueda, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 3;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalUtilidadTipoPrecio.add(jButtonid_sucursalUtilidadTipoPrecioUpdate, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 1;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalUtilidadTipoPrecio.add(jComboBoxid_sucursalUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioUtilidadTipoPrecio.add(jLabelid_tipo_precioUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 2;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioUtilidadTipoPrecio.add(jButtonid_tipo_precioUtilidadTipoPrecioBusqueda, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 3;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioUtilidadTipoPrecio.add(jButtonid_tipo_precioUtilidadTipoPrecioUpdate, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 1;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioUtilidadTipoPrecio.add(jComboBoxid_tipo_precioUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeUtilidadTipoPrecio.add(jLabelporcentajeUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 2;
		this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeUtilidadTipoPrecio.add(jButtonporcentajeUtilidadTipoPrecioBusqueda, this.gridBagConstraintsUtilidadTipoPrecio);
	}

	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = 1;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeUtilidadTipoPrecio.add(jTextFieldporcentajeUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = iYPanelCamposUtilidadTipoPrecio;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = iXPanelCamposUtilidadTipoPrecio++;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadTipoPrecio.add(this.jPanelidUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(iXPanelCamposUtilidadTipoPrecio % 1==0) {
		iXPanelCamposUtilidadTipoPrecio=0;
		iYPanelCamposUtilidadTipoPrecio++;
	}
	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = iYPanelCamposUtilidadTipoPrecio;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = iXPanelCamposUtilidadTipoPrecio++;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadTipoPrecio.add(this.jPanelid_tipo_precioUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(iXPanelCamposUtilidadTipoPrecio % 1==0) {
		iXPanelCamposUtilidadTipoPrecio=0;
		iYPanelCamposUtilidadTipoPrecio++;
	}
	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = iYPanelCamposUtilidadTipoPrecio;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = iXPanelCamposUtilidadTipoPrecio++;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposUtilidadTipoPrecio.add(this.jPanelporcentajeUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(iXPanelCamposUtilidadTipoPrecio % 1==0) {
		iXPanelCamposUtilidadTipoPrecio=0;
		iYPanelCamposUtilidadTipoPrecio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = iYPanelCamposOcultosUtilidadTipoPrecio;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = iXPanelCamposOcultosUtilidadTipoPrecio++;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadTipoPrecio.add(this.jPanelid_empresaUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(iXPanelCamposOcultosUtilidadTipoPrecio % 1==0) {
		iXPanelCamposOcultosUtilidadTipoPrecio=0;
		iYPanelCamposOcultosUtilidadTipoPrecio++;
	}
	this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsUtilidadTipoPrecio.gridy = iYPanelCamposOcultosUtilidadTipoPrecio;
	this.gridBagConstraintsUtilidadTipoPrecio.gridx = iXPanelCamposOcultosUtilidadTipoPrecio++;
	this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsUtilidadTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosUtilidadTipoPrecio.add(this.jPanelid_sucursalUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);



	if(iXPanelCamposOcultosUtilidadTipoPrecio % 1==0) {
		iXPanelCamposOcultosUtilidadTipoPrecio=0;
		iYPanelCamposOcultosUtilidadTipoPrecio++;
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
			
		GridBagLayout gridaBagLayoutAccionesUtilidadTipoPrecio= new GridBagLayout();
		this.jPanelAccionesUtilidadTipoPrecio.setLayout(gridaBagLayoutAccionesUtilidadTipoPrecio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioUtilidadTipoPrecio= new GridBagLayout();
		this.jPanelAccionesFormularioUtilidadTipoPrecio.setLayout(gridaBagLayoutAccionesFormularioUtilidadTipoPrecio);
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadTipoPrecio.add(this.jComboBoxTiposAccionesFormularioUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioUtilidadTipoPrecio.add(this.jCheckBoxPostAccionNuevoUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUtilidadTipoPrecio.add(this.jCheckBoxPostAccionSinCerrarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.utilidadtipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioUtilidadTipoPrecio.add(this.jCheckBoxPostAccionSinMensajeUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccion++;
			
		this.jPanelAccionesUtilidadTipoPrecio.add(this.jButtonModificarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);							

		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =iPosXAccion++;
			
		this.jPanelAccionesUtilidadTipoPrecio.add(this.jButtonEliminarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadTipoPrecio.add(this.jButtonActualizarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);


		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesUtilidadTipoPrecio.add(this.jButtonGuardarCambiosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);	
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = 0;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =iPosXAccion++;
		
		this.jPanelAccionesUtilidadTipoPrecio.add(this.jButtonCancelarUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutUtilidadTipoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutUtilidadTipoPrecio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.utilidadtipoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;		
			//this.gridBagConstraintsUtilidadTipoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsUtilidadTipoPrecio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =0;
		this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsUtilidadTipoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(UtilidadTipoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleUtilidadTipoPrecio = new UtilidadTipoPrecioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Utilidad Tipo Precio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Utilidad Tipo Precio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidad Tipo Precio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			UtilidadTipoPrecioModel utilidadtipoprecioModel=new UtilidadTipoPrecioModel(this);
			
			//SI USARA CLASE INTERNA
			//UtilidadTipoPrecioModel.UtilidadTipoPrecioFocusTraversalPolicy utilidadtipoprecioFocusTraversalPolicy = utilidadtipoprecioModel.new UtilidadTipoPrecioFocusTraversalPolicy(this);
			
			//utilidadtipoprecioFocusTraversalPolicy.setutilidadtipoprecioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(utilidadtipoprecioModel);
			
			
			this.jContentPaneDetalleUtilidadTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleUtilidadTipoPrecio = new GridBagLayout();	
			this.jContentPaneDetalleUtilidadTipoPrecio.setLayout(gridaBagLayoutDetalleUtilidadTipoPrecio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosUtilidadTipoPrecio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
					
				
				this.jContentPaneDetalleUtilidadTipoPrecio.add(jTtoolBarDetalleUtilidadTipoPrecio, gridBagConstraintsUtilidadTipoPrecio);								
				
}
			
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio=   new JScrollPane(jContentPaneDetalleUtilidadTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	        
			this.jContentPaneDetalleUtilidadTipoPrecio.add(jPanelCamposUtilidadTipoPrecio, gridBagConstraintsUtilidadTipoPrecio);
			
			
			
			
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
						&& utilidadtipoprecioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.utilidadtipoprecioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsUtilidadTipoPrecio= new GridBagConstraints();
						this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
						this.jContentPaneDetalleUtilidadTipoPrecio.add(this.jTabbedPaneRelacionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesUtilidadTipoPrecio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosUtilidadTipoPrecio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
					this.gridBagConstraintsUtilidadTipoPrecio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
					
				
					this.jContentPaneDetalleUtilidadTipoPrecio.add(jPanelCamposOcultosUtilidadTipoPrecio, gridBagConstraintsUtilidadTipoPrecio);
				
					this.jPanelCamposOcultosUtilidadTipoPrecio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	        this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleUtilidadTipoPrecio.add(this.jPanelAccionesFormularioUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);							
			
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
	        this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
	        
			
			this.jContentPaneDetalleUtilidadTipoPrecio.add(this.jPanelAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionUtilidadTipoPrecio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio=   new JScrollPane(this.jPanelCamposUtilidadTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionUtilidadTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
			this.gridBagConstraintsUtilidadTipoPrecio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsUtilidadTipoPrecio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsUtilidadTipoPrecio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);			
			
			this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
			
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		
			
		this.gridBagConstraintsUtilidadTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsUtilidadTipoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsUtilidadTipoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesUtilidadTipoPrecio, this.gridBagConstraintsUtilidadTipoPrecio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralUtilidadTipoPrecio;//jContentPane;
		
		return jScrollPanelDatosEdicionUtilidadTipoPrecio;
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
