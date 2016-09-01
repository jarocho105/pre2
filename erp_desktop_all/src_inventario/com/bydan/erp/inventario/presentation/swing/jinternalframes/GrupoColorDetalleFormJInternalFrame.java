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
import com.bydan.erp.inventario.util.GrupoColorConstantesFunciones;

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
public class GrupoColorDetalleFormJInternalFrame extends GrupoColorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGrupoColor;
	
	protected JMenuBar jmenuBarDetalleGrupoColor;
	
	protected JMenu jmenuDetalleGrupoColor;
	protected JMenu jmenuDetalleArchivoGrupoColor;
	protected JMenu jmenuDetalleAccionesGrupoColor;
	protected JMenu jmenuDetalleDatosGrupoColor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoColor;	
	protected GridBagConstraints gridBagConstraintsGrupoColor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GrupoColorBeanSwingJInternalFrameAdditional jInternalFrameDetalleGrupoColor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public GrupoColorSessionBean grupocolorSessionBean;
	
	

	public ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame=null;
	public ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteColorProducto=false;
	public ColorProductoSessionBean colorproductoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public GrupoColorLogic grupocolorLogic;
	
	public JScrollPane jScrollPanelDatosGrupoColor;
	public JScrollPane jScrollPanelDatosEdicionGrupoColor;
	public JScrollPane jScrollPanelDatosGeneralGrupoColor;
	
	protected JPanel jPanelCamposGrupoColor;    
	protected JPanel jPanelCamposOcultosGrupoColor;    	
	protected JPanel jPanelAccionesGrupoColor;
	protected JPanel jPanelAccionesFormularioGrupoColor;
    
	
	
	protected Integer iXPanelCamposGrupoColor=0;
	protected Integer iYPanelCamposGrupoColor=0;
	
	protected Integer iXPanelCamposOcultosGrupoColor=0;
	protected Integer iYPanelCamposOcultosGrupoColor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGrupoColor;
	public JButton jButtonModificarGrupoColor;
	public JButton jButtonActualizarGrupoColor;
    public JButton jButtonEliminarGrupoColor;
	public JButton jButtonCancelarGrupoColor;
    public JButton jButtonGuardarCambiosGrupoColor;
	public JButton jButtonGuardarCambiosTablaGrupoColor;
	protected JButton jButtonCerrarGrupoColor;
	
	
	protected JButton jButtonProcesarInformacionGrupoColor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGrupoColor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGrupoColor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGrupoColor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoColor;
	protected JButton jButtonModificarToolBarGrupoColor;
	protected JButton jButtonActualizarToolBarGrupoColor;
    protected JButton jButtonEliminarToolBarGrupoColor;
	protected JButton jButtonCancelarToolBarGrupoColor;
    protected JButton jButtonGuardarCambiosToolBarGrupoColor;
	protected JButton jButtonGuardarCambiosTablaToolBarGrupoColor;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoColor;
	protected JButton jButtonCerrarToolBarGrupoColor;
	
	protected JButton jButtonProcesarInformacionToolBarGrupoColor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoColor;
	protected JMenuItem jMenuItemModificarGrupoColor;
	protected JMenuItem jMenuItemActualizarGrupoColor;
    protected JMenuItem jMenuItemEliminarGrupoColor;
	protected JMenuItem jMenuItemCancelarGrupoColor;
    protected JMenuItem jMenuItemGuardarCambiosGrupoColor;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoColor;
	protected JMenuItem jMenuItemCerrarGrupoColor;
	protected JMenuItem jMenuItemDetalleCerrarGrupoColor;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoColor;
	
	protected JMenuItem jMenuItemProcesarInformacionGrupoColor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoColor;
	protected JMenuItem jMenuItemMostrarOcultarGrupoColor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoColor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoColor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoColor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGrupoColor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGrupoColor;
	public JLabel jLabelIdGrupoColor;
	public JLabel jLabelidGrupoColor;
	public JButton jButtonidGrupoColorBusqueda= new JButtonMe();

	public JPanel jPanelcodigoGrupoColor;
	public JLabel jLabelcodigoGrupoColor;
	public JTextField jTextFieldcodigoGrupoColor;
	public JButton jButtoncodigoGrupoColorBusqueda= new JButtonMe();

	public JPanel jPanelnombreGrupoColor;
	public JLabel jLabelnombreGrupoColor;
	public JTextArea jTextAreanombreGrupoColor;
	public JScrollPane jscrollPanenombreGrupoColor;
	public JButton jButtonnombreGrupoColorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGrupoColor;
	public JLabel jLabelid_empresaGrupoColor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGrupoColor;
	public JButton jButtonid_empresaGrupoColor= new JButtonMe();
	public JButton jButtonid_empresaGrupoColorUpdate= new JButtonMe();
	public JButton jButtonid_empresaGrupoColorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalGrupoColor;
	public JLabel jLabelid_sucursalGrupoColor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalGrupoColor;
	public JButton jButtonid_sucursalGrupoColor= new JButtonMe();
	public JButton jButtonid_sucursalGrupoColorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalGrupoColorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGrupoColor;
	
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
	
	public GrupoColorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGrupoColor=new JPanel();
				this.jPanelAccionesFormularioGrupoColor=new JPanel();
				this.jmenuBarDetalleGrupoColor=new JMenuBar();
				this.jTtoolBarDetalleGrupoColor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GrupoColorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoColorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoColor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGrupoColor() {
		return this.jButtonActualizarToolBarGrupoColor;
	}
	
	public JButton getjButtonEliminarToolBarGrupoColor() {
		return this.jButtonEliminarToolBarGrupoColor;
	}
	
	public JButton getjButtonCancelarToolBarGrupoColor() {
		return this.jButtonCancelarToolBarGrupoColor;
	}		
	
	public JButton getjButtonProcesarInformacionGrupoColor() {
		return this.jButtonProcesarInformacionGrupoColor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoColor)	{
		this.jButtonProcesarInformacionGrupoColor = jButtonProcesarInformacionGrupoColor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoColor() {
		return this.jComboBoxTiposAccionesGrupoColor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoColor(
			JComboBox jComboBoxTiposRelacionesGrupoColor) {
		this.jComboBoxTiposRelacionesGrupoColor = jComboBoxTiposRelacionesGrupoColor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoColor(
			JComboBox jComboBoxTiposAccionesGrupoColor) {
		this.jComboBoxTiposAccionesGrupoColor = jComboBoxTiposAccionesGrupoColor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGrupoColor() {
		return this.jComboBoxTiposAccionesFormularioGrupoColor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGrupoColor(
			JComboBox jComboBoxTiposAccionesFormularioGrupoColor) {
		this.jComboBoxTiposAccionesFormularioGrupoColor = jComboBoxTiposAccionesFormularioGrupoColor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.grupocolorSessionBean=new GrupoColorSessionBean();
		
		this.grupocolorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupocolorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupocolorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.colorproductoSessionBean=new ColorProductoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoColorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Color MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
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
	
		GrupoColorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGrupoColor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGrupoColor=new JButtonMe();
				this.jButtonModificarToolBarGrupoColor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGrupoColor,this.jTtoolBarDetalleGrupoColor,
							"actualizar","actualizar","Actualizar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGrupoColor,this.jTtoolBarDetalleGrupoColor,
							"eliminar","eliminar","Eliminar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGrupoColor,this.jTtoolBarDetalleGrupoColor,
							"cancelar","cancelar","Cancelar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGrupoColor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGrupoColor,this.jTtoolBarDetalleGrupoColor,
							"guardarcambios","guardarcambios","Guardar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGrupoColor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGrupoColor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGrupoColor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGrupoColor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGrupoColor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoColor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoColor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoColor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGrupoColor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGrupoColor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGrupoColor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGrupoColor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGrupoColor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGrupoColor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGrupoColor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGrupoColor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGrupoColor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGrupoColor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGrupoColor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGrupoColor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGrupoColor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoColor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoColor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoColor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoColor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoColor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGrupoColor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGrupoColor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGrupoColor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoColor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoColor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoColor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoColor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoColor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoColor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGrupoColor.add(this.jMenuItemDetalleCerrarGrupoColor);
		
		this.jmenuDetalleAccionesGrupoColor.add(this.jMenuItemActualizarGrupoColor);
		this.jmenuDetalleAccionesGrupoColor.add(this.jMenuItemEliminarGrupoColor);
		this.jmenuDetalleAccionesGrupoColor.add(this.jMenuItemCancelarGrupoColor);		
		
		//this.jmenuDetalleDatosGrupoColor.add(this.jMenuItemDetalleAbrirOrderByGrupoColor);				
		this.jmenuDetalleDatosGrupoColor.add(this.jMenuItemDetalleMostarOcultarGrupoColor);				
				
		//this.jmenuDetalleAccionesGrupoColor.add(this.jMenuItemGuardarCambiosGrupoColor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGrupoColor.add(this.jmenuDetalleArchivoGrupoColor);		
		this.jmenuBarDetalleGrupoColor.add(this.jmenuDetalleAccionesGrupoColor);		
		this.jmenuBarDetalleGrupoColor.add(this.jmenuDetalleDatosGrupoColor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGrupoColor.add(this.jmenuDetalleGrupoColor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGrupoColor);				
	}
	
	
	public void inicializarElementosCamposGrupoColor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGrupoColor = new JLabelMe();
		jLabelIdGrupoColor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGrupoColor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGrupoColor.setToolTipText(GrupoColorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGrupoColor= new GridBagLayout();

		this.jPanelidGrupoColor.setLayout(this.gridaBagLayoutGrupoColor);

		jLabelidGrupoColor = new JLabel();
		jLabelidGrupoColor.setText("Id");

		jLabelidGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoGrupoColor = new JLabelMe();
		this.jLabelcodigoGrupoColor.setText(""+GrupoColorConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoGrupoColor.setToolTipText("Codigo");
		this.jLabelcodigoGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoGrupoColor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoGrupoColor.setToolTipText(GrupoColorConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutGrupoColor = new GridBagLayout();
		this.jPanelcodigoGrupoColor.setLayout(this.gridaBagLayoutGrupoColor);


		jTextFieldcodigoGrupoColor= new JTextFieldMe();

		jTextFieldcodigoGrupoColor.setEnabled(false);
		jTextFieldcodigoGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoGrupoColorBusqueda= new JButtonMe();
		this.jButtoncodigoGrupoColorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoColorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoGrupoColorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoGrupoColorBusqueda.setText("U");
		this.jButtoncodigoGrupoColorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoGrupoColorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoGrupoColorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoGrupoColorBusqueda"));

		if(this.grupocolorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoGrupoColorBusqueda.setVisible(false);		}


					
		this.jLabelnombreGrupoColor = new JLabelMe();
		this.jLabelnombreGrupoColor.setText(""+GrupoColorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreGrupoColor.setToolTipText("Nombre");
		this.jLabelnombreGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreGrupoColor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreGrupoColor.setToolTipText(GrupoColorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutGrupoColor = new GridBagLayout();
		this.jPanelnombreGrupoColor.setLayout(this.gridaBagLayoutGrupoColor);


		jTextAreanombreGrupoColor= new JTextAreaMe();
		jTextAreanombreGrupoColor.setEnabled(false);
		jTextAreanombreGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreGrupoColor.setLineWrap(true);
		jTextAreanombreGrupoColor.setWrapStyleWord(true);
		jTextAreanombreGrupoColor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreGrupoColor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreGrupoColor = new JScrollPane(jTextAreanombreGrupoColor);
		jscrollPanenombreGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreGrupoColorBusqueda= new JButtonMe();
		this.jButtonnombreGrupoColorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoColorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreGrupoColorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreGrupoColorBusqueda.setText("U");
		this.jButtonnombreGrupoColorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreGrupoColorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreGrupoColorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreGrupoColorBusqueda"));

		if(this.grupocolorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreGrupoColorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGrupoColor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGrupoColor = new JLabelMe();
		this.jLabelid_empresaGrupoColor.setText(""+GrupoColorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGrupoColor.setToolTipText("Empresa");
		this.jLabelid_empresaGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGrupoColor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGrupoColor.setToolTipText(GrupoColorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGrupoColor = new GridBagLayout();
		this.jPanelid_empresaGrupoColor.setLayout(this.gridaBagLayoutGrupoColor);


		jComboBoxid_empresaGrupoColor= new JComboBoxMe();
		jComboBoxid_empresaGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGrupoColor.setEnabled(false);

		this.jButtonid_empresaGrupoColor= new JButtonMe();
		this.jButtonid_empresaGrupoColor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoColor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoColor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGrupoColor.setText("Buscar");
		this.jButtonid_empresaGrupoColor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGrupoColor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoColor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoColor"));

		this.jButtonid_empresaGrupoColorBusqueda= new JButtonMe();
		this.jButtonid_empresaGrupoColorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoColorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoColorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoColorBusqueda.setText("U");
		this.jButtonid_empresaGrupoColorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGrupoColorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoColorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoColorBusqueda"));

		if(this.grupocolorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGrupoColorBusqueda.setVisible(false);		}

		this.jButtonid_empresaGrupoColorUpdate= new JButtonMe();
		this.jButtonid_empresaGrupoColorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoColorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGrupoColorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGrupoColorUpdate.setText("U");
		this.jButtonid_empresaGrupoColorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGrupoColorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGrupoColorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGrupoColorUpdate"));



					
		this.jLabelid_sucursalGrupoColor = new JLabelMe();
		this.jLabelid_sucursalGrupoColor.setText(""+GrupoColorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalGrupoColor.setToolTipText("Sucursal");
		this.jLabelid_sucursalGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalGrupoColor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalGrupoColor.setToolTipText(GrupoColorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutGrupoColor = new GridBagLayout();
		this.jPanelid_sucursalGrupoColor.setLayout(this.gridaBagLayoutGrupoColor);


		jComboBoxid_sucursalGrupoColor= new JComboBoxMe();
		jComboBoxid_sucursalGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalGrupoColor.setEnabled(false);

		this.jButtonid_sucursalGrupoColor= new JButtonMe();
		this.jButtonid_sucursalGrupoColor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGrupoColor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGrupoColor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGrupoColor.setText("Buscar");
		this.jButtonid_sucursalGrupoColor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalGrupoColor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGrupoColor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGrupoColor"));

		this.jButtonid_sucursalGrupoColorBusqueda= new JButtonMe();
		this.jButtonid_sucursalGrupoColorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGrupoColorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGrupoColorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGrupoColorBusqueda.setText("U");
		this.jButtonid_sucursalGrupoColorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalGrupoColorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGrupoColorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGrupoColorBusqueda"));

		if(this.grupocolorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalGrupoColorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalGrupoColorUpdate= new JButtonMe();
		this.jButtonid_sucursalGrupoColorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGrupoColorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGrupoColorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGrupoColorUpdate.setText("U");
		this.jButtonid_sucursalGrupoColorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalGrupoColorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGrupoColorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalGrupoColor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGrupoColor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGrupoColorUpdate"));



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
		//this.jInternalFrameDetalleGrupoColor = new GrupoColorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Grupo Color DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoColor= new GridBagLayout();
		

		
		String sToolTipGrupoColor="";
		sToolTipGrupoColor=GrupoColorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoColor+="(Inventario.GrupoColor)";
		}
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoColor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGrupoColor = new JButtonMe();
		this.jButtonModificarGrupoColor = new JButtonMe();
        this.jButtonActualizarGrupoColor = new JButtonMe();
        this.jButtonEliminarGrupoColor = new JButtonMe();
        this.jButtonCancelarGrupoColor = new JButtonMe();
        this.jButtonGuardarCambiosGrupoColor = new JButtonMe();
		this.jButtonGuardarCambiosTablaGrupoColor = new JButtonMe();
		this.jButtonCerrarGrupoColor = new JButtonMe();
		
		this.jScrollPanelDatosGrupoColor = new JScrollPane();   
        this.jScrollPanelDatosEdicionGrupoColor = new JScrollPane();
		this.jScrollPanelDatosGeneralGrupoColor = new JScrollPane();
				
		
		
		this.jPanelCamposGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Color";
		
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Colores" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoColor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGrupoColor.setName("jPanelCamposGrupoColor"); 

		this.jPanelCamposOcultosGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGrupoColor.setName("jPanelCamposOcultosGrupoColor"); 

        this.jPanelAccionesGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoColor.setToolTipText("Acciones");
        this.jPanelAccionesGrupoColor.setName("Acciones"); 

		this.jPanelAccionesFormularioGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGrupoColor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGrupoColor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGrupoColor.setText("Nuevo");
		this.jButtonModificarGrupoColor.setText("Editar");
        this.jButtonActualizarGrupoColor.setText("Actualizar");
        this.jButtonEliminarGrupoColor.setText("Eliminar");
        this.jButtonCancelarGrupoColor.setText("Cancelar");
        this.jButtonGuardarCambiosGrupoColor.setText("Guardar");
		this.jButtonGuardarCambiosTablaGrupoColor.setText("Guardar");
		this.jButtonCerrarGrupoColor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoColor,"nuevo_button","Nuevo",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGrupoColor,"modificar_button","Editar",this.grupocolorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGrupoColor,"actualizar_button","Actualizar",this.grupocolorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGrupoColor,"eliminar_button","Eliminar",this.grupocolorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGrupoColor,"cancelar_button","Cancelar",this.grupocolorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGrupoColor,"guardarcambios_button","Guardar",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoColor,"guardarcambiostabla_button","Guardar",this.grupocolorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoColor,"cerrar_button","Salir",this.grupocolorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGrupoColor.setToolTipText("Nuevo"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGrupoColor.setToolTipText("Editar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGrupoColor.setToolTipText("Actualizar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGrupoColor.setToolTipText("Eliminar)"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGrupoColor.setToolTipText("Cancelar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGrupoColor.setToolTipText("Guardar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGrupoColor.setToolTipText("Guardar"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoColor.setToolTipText("Salir"+" "+GrupoColorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoColor";
		inputMap = this.jButtonNuevoGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoColor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoColor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGrupoColor";
		inputMap = this.jButtonActualizarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGrupoColor"));
		
		//ELIMINAR
		sMapKey = "EliminarGrupoColor";
		inputMap = this.jButtonEliminarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGrupoColor"));
		
		//CANCELAR	
		sMapKey = "CancelarGrupoColor";
		inputMap = this.jButtonCancelarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGrupoColor"));
		
		//CERRAR		
		sMapKey = "CerrarGrupoColor";
		inputMap = this.jButtonCerrarGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoColor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoColor";
		inputMap = this.jButtonGuardarCambiosTablaGrupoColor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoColor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoColor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGrupoColor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGrupoColor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGrupoColor.setToolTipText("Nuevo GrupoColor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGrupoColor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGrupoColor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGrupoColor.setToolTipText("Sin Cerrar Ventana GrupoColor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGrupoColor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGrupoColor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGrupoColor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoColor.setText("Accion");
		this.jComboBoxTiposAccionesGrupoColor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGrupoColor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGrupoColor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGrupoColor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGrupoColor = new JLabelMe();
		
		this.jLabelAccionesGrupoColor.setText("Acciones");		
		this.jLabelAccionesGrupoColor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoColor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoColor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGrupoColor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGrupoColor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGrupoColor=new JTabbedPane();
		this.jTabbedPaneRelacionesGrupoColor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGrupoColor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGrupoColor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoColor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoColor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoColor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGrupoColor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoColor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGrupoColor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGrupoColor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGrupoColor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGrupoColor = new GridBagLayout();
		
		this.jPanelCamposGrupoColor.setLayout(gridaBagLayoutCamposGrupoColor);
		this.jPanelCamposOcultosGrupoColor.setLayout(gridaBagLayoutCamposOcultosGrupoColor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 0;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGrupoColor.add(jLabelIdGrupoColor, this.gridBagConstraintsGrupoColor);



	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 1;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGrupoColor.add(jLabelidGrupoColor, this.gridBagConstraintsGrupoColor);


	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 0;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGrupoColor.add(jLabelid_empresaGrupoColor, this.gridBagConstraintsGrupoColor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 2;
		this.gridBagConstraintsGrupoColor.ipadx = 0;
		this.gridBagConstraintsGrupoColor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoColor.add(jButtonid_empresaGrupoColorBusqueda, this.gridBagConstraintsGrupoColor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 3;
		this.gridBagConstraintsGrupoColor.ipadx = 0;
		this.gridBagConstraintsGrupoColor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGrupoColor.add(jButtonid_empresaGrupoColorUpdate, this.gridBagConstraintsGrupoColor);
	}

	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 1;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGrupoColor.add(jComboBoxid_empresaGrupoColor, this.gridBagConstraintsGrupoColor);


	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 0;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalGrupoColor.add(jLabelid_sucursalGrupoColor, this.gridBagConstraintsGrupoColor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 2;
		this.gridBagConstraintsGrupoColor.ipadx = 0;
		this.gridBagConstraintsGrupoColor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGrupoColor.add(jButtonid_sucursalGrupoColorBusqueda, this.gridBagConstraintsGrupoColor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 3;
		this.gridBagConstraintsGrupoColor.ipadx = 0;
		this.gridBagConstraintsGrupoColor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGrupoColor.add(jButtonid_sucursalGrupoColorUpdate, this.gridBagConstraintsGrupoColor);
	}

	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 1;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalGrupoColor.add(jComboBoxid_sucursalGrupoColor, this.gridBagConstraintsGrupoColor);


	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 0;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoGrupoColor.add(jLabelcodigoGrupoColor, this.gridBagConstraintsGrupoColor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 2;
		this.gridBagConstraintsGrupoColor.ipadx = 0;
		this.gridBagConstraintsGrupoColor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoGrupoColor.add(jButtoncodigoGrupoColorBusqueda, this.gridBagConstraintsGrupoColor);
	}

	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 1;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoGrupoColor.add(jTextFieldcodigoGrupoColor, this.gridBagConstraintsGrupoColor);


	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 0;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreGrupoColor.add(jLabelnombreGrupoColor, this.gridBagConstraintsGrupoColor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		//this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = 2;
		this.gridBagConstraintsGrupoColor.ipadx = 0;
		this.gridBagConstraintsGrupoColor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreGrupoColor.add(jButtonnombreGrupoColorBusqueda, this.gridBagConstraintsGrupoColor);
	}

	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGrupoColor.gridy = 0;
	this.gridBagConstraintsGrupoColor.gridx = 1;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreGrupoColor.add(jscrollPanenombreGrupoColor, this.gridBagConstraintsGrupoColor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoColor.gridy = iYPanelCamposGrupoColor;
	this.gridBagConstraintsGrupoColor.gridx = iXPanelCamposGrupoColor++;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoColor.add(this.jPanelidGrupoColor, this.gridBagConstraintsGrupoColor);



	if(iXPanelCamposGrupoColor % 1==0) {
		iXPanelCamposGrupoColor=0;
		iYPanelCamposGrupoColor++;
	}
	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoColor.gridy = iYPanelCamposGrupoColor;
	this.gridBagConstraintsGrupoColor.gridx = iXPanelCamposGrupoColor++;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoColor.add(this.jPanelcodigoGrupoColor, this.gridBagConstraintsGrupoColor);



	if(iXPanelCamposGrupoColor % 1==0) {
		iXPanelCamposGrupoColor=0;
		iYPanelCamposGrupoColor++;
	}
	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoColor.gridy = iYPanelCamposGrupoColor;
	this.gridBagConstraintsGrupoColor.gridx = iXPanelCamposGrupoColor++;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGrupoColor.add(this.jPanelnombreGrupoColor, this.gridBagConstraintsGrupoColor);



	if(iXPanelCamposGrupoColor % 1==0) {
		iXPanelCamposGrupoColor=0;
		iYPanelCamposGrupoColor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoColor.gridy = iYPanelCamposOcultosGrupoColor;
	this.gridBagConstraintsGrupoColor.gridx = iXPanelCamposOcultosGrupoColor++;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoColor.add(this.jPanelid_empresaGrupoColor, this.gridBagConstraintsGrupoColor);



	if(iXPanelCamposOcultosGrupoColor % 1==0) {
		iXPanelCamposOcultosGrupoColor=0;
		iYPanelCamposOcultosGrupoColor++;
	}
	this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGrupoColor.gridy = iYPanelCamposOcultosGrupoColor;
	this.gridBagConstraintsGrupoColor.gridx = iXPanelCamposOcultosGrupoColor++;
	this.gridBagConstraintsGrupoColor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGrupoColor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGrupoColor.add(this.jPanelid_sucursalGrupoColor, this.gridBagConstraintsGrupoColor);



	if(iXPanelCamposOcultosGrupoColor % 1==0) {
		iXPanelCamposOcultosGrupoColor=0;
		iYPanelCamposOcultosGrupoColor++;
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
			
		GridBagLayout gridaBagLayoutAccionesGrupoColor= new GridBagLayout();
		this.jPanelAccionesGrupoColor.setLayout(gridaBagLayoutAccionesGrupoColor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGrupoColor= new GridBagLayout();
		this.jPanelAccionesFormularioGrupoColor.setLayout(gridaBagLayoutAccionesFormularioGrupoColor);
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoColor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoColor.add(this.jComboBoxTiposAccionesFormularioGrupoColor, this.gridBagConstraintsGrupoColor);

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGrupoColor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGrupoColor.add(this.jCheckBoxPostAccionNuevoGrupoColor, this.gridBagConstraintsGrupoColor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoColor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoColor.add(this.jCheckBoxPostAccionSinCerrarGrupoColor, this.gridBagConstraintsGrupoColor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.grupocolorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.grupocolorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGrupoColor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGrupoColor.add(this.jCheckBoxPostAccionSinMensajeGrupoColor, this.gridBagConstraintsGrupoColor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx = iPosXAccion++;
			
		this.jPanelAccionesGrupoColor.add(this.jButtonModificarGrupoColor, this.gridBagConstraintsGrupoColor);							

		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoColor.gridy = 0;
		this.gridBagConstraintsGrupoColor.gridx =iPosXAccion++;
			
		this.jPanelAccionesGrupoColor.add(this.jButtonEliminarGrupoColor, this.gridBagConstraintsGrupoColor);
		
			
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = 0;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoColor.add(this.jButtonActualizarGrupoColor, this.gridBagConstraintsGrupoColor);


		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = 0;		
		this.gridBagConstraintsGrupoColor.gridx = iPosXAccion++;
		
		this.jPanelAccionesGrupoColor.add(this.jButtonGuardarCambiosGrupoColor, this.gridBagConstraintsGrupoColor);	
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = 0;		
		this.gridBagConstraintsGrupoColor.gridx =iPosXAccion++;
		
		this.jPanelAccionesGrupoColor.add(this.jButtonCancelarGrupoColor, this.gridBagConstraintsGrupoColor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoColor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoColor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupocolorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();						
			this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoColor.gridx = 0;		
			//this.gridBagConstraintsGrupoColor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoColor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoColor.gridx =0;
		this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoColor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoColor, this.gridBagConstraintsGrupoColor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GrupoColorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGrupoColor = new GrupoColorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Grupo Color DATOS");
			
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
			
	        //this.setTitle("[FOR] - Grupo Color DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Grupo Color Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GrupoColorModel grupocolorModel=new GrupoColorModel(this);
			
			//SI USARA CLASE INTERNA
			//GrupoColorModel.GrupoColorFocusTraversalPolicy grupocolorFocusTraversalPolicy = grupocolorModel.new GrupoColorFocusTraversalPolicy(this);
			
			//grupocolorFocusTraversalPolicy.setgrupocolorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(grupocolorModel);
			
			
			this.jContentPaneDetalleGrupoColor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGrupoColor = new GridBagLayout();	
			this.jContentPaneDetalleGrupoColor.setLayout(gridaBagLayoutDetalleGrupoColor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoColor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGrupoColor = new GridBagConstraints();
				this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGrupoColor.gridx = 0;
					
				
				this.jContentPaneDetalleGrupoColor.add(jTtoolBarDetalleGrupoColor, gridBagConstraintsGrupoColor);								
				
}
			
			this.jScrollPanelDatosEdicionGrupoColor=   new JScrollPane(jContentPaneDetalleGrupoColor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoColor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoColor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoColor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGrupoColor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoColor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoColor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoColor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGrupoColor.gridx = 0;
	        
			this.jContentPaneDetalleGrupoColor.add(jPanelCamposGrupoColor, gridBagConstraintsGrupoColor);
			
			
			
			
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
						&& grupocolorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameColorProducto(this.puedeCargarPorParteColorProducto,false,-1);
					
					if(this.grupocolorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGrupoColor= new GridBagConstraints();
						this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGrupoColor.gridx = 0;
						this.jContentPaneDetalleGrupoColor.add(this.jTabbedPaneRelacionesGrupoColor, this.gridBagConstraintsGrupoColor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGrupoColor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameColorProducto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGrupoColor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGrupoColor = new GridBagConstraints();
					this.gridBagConstraintsGrupoColor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGrupoColor.gridx = 0;
					
				
					this.jContentPaneDetalleGrupoColor.add(jPanelCamposOcultosGrupoColor, gridBagConstraintsGrupoColor);
				
					this.jPanelCamposOcultosGrupoColor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsGrupoColor.gridx = 0;
	        this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGrupoColor.add(this.jPanelAccionesFormularioGrupoColor, this.gridBagConstraintsGrupoColor);							
			
			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
	        this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsGrupoColor.gridx = 0;
	        
			
			this.jContentPaneDetalleGrupoColor.add(this.jPanelAccionesGrupoColor, this.gridBagConstraintsGrupoColor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGrupoColor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGrupoColor=   new JScrollPane(this.jPanelCamposGrupoColor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGrupoColor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoColor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGrupoColor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGrupoColor.gridx = 0;
			this.gridBagConstraintsGrupoColor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGrupoColor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGrupoColor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGrupoColor, this.gridBagConstraintsGrupoColor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoColor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGrupoColor, this.gridBagConstraintsGrupoColor);			
			
			this.gridBagConstraintsGrupoColor = new GridBagConstraints();
			this.gridBagConstraintsGrupoColor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGrupoColor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGrupoColor, this.gridBagConstraintsGrupoColor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoColor, this.gridBagConstraintsGrupoColor);
			
			
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoColor, this.gridBagConstraintsGrupoColor);
		
			
		this.gridBagConstraintsGrupoColor = new GridBagConstraints();
		this.gridBagConstraintsGrupoColor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoColor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoColor, this.gridBagConstraintsGrupoColor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGrupoColor;//jContentPane;
		
		return jScrollPanelDatosEdicionGrupoColor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameColorProducto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.colorproductoSessionBean=new ColorProductoSessionBean();
		this.colorproductoSessionBean.setConGuardarRelaciones(false);
		this.colorproductoSessionBean.setEsGuardarRelacionado(true);

		this.colorproductoBeanSwingJInternalFrame=null;//new ColorProductoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.colorproductoBeanSwingJInternalFramePopup=new ColorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.colorproductoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {

				ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL=GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL;
				ColorProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GrupoColorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.colorproductoSessionBean.setEsGuardarRelacionado(true);

				this.colorproductoBeanSwingJInternalFrame=new ColorProductoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.colorproductoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.colorproductoBeanSwingJInternalFrame.setcolorproductoSessionBean(this.colorproductoSessionBean);

				//this.gridBagConstraintsGrupoColor = new GridBagConstraints();
				//this.gridBagConstraintsGrupoColor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGrupoColor.gridx = 0;
				//this.jContentPaneDetalleGrupoColor.add(this.colorproductoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGrupoColor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGrupoColor.add("Color Productoes",this.colorproductoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGrupoColor.setComponentAt(iIndexTab,this.colorproductoBeanSwingJInternalFrame.getContentPane());
				}

				//ColorProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.colorproductoSessionBean.setEsGuardarRelacionado(false);
				this.colorproductoBeanSwingJInternalFrame=null;//new ColorProductoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.colorproductoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteColorProducto) {
					this.jTabbedPaneRelacionesGrupoColor.add("Color Productoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarColorProductoBeanSwingJInternalFrame(List<GrupoColor> grupocolors,GrupoColor grupocolor,ColorProductoBeanSwingJInternalFrame colorproductoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//colorproductoBeanSwingJInternalFrame=new ColorProductoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					colorproductoBeanSwingJInternalFrame.getColorProductoLogic().setConnexion(this.grupocolorLogic.getConnexion());

					colorproductoBeanSwingJInternalFrame.setgrupocolorsForeignKey(grupocolors);
					colorproductoBeanSwingJInternalFrame.setgrupocolorForeignKey(grupocolor);
					colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setisBusquedaDesdeForeignKeySesionGrupoColor(true);
					colorproductoBeanSwingJInternalFrame.colorproductoSessionBean.setlidGrupoColorActual(grupocolor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					colorproductoBeanSwingJInternalFrame.cargarCombosForeignKeyColorProducto(colorproductoBeanSwingJInternalFrame.isCargarCombosDependencia);
					colorproductoBeanSwingJInternalFrame.setVisibilidadBusquedasParaGrupoColor(true);
					colorproductoBeanSwingJInternalFrame.setid_grupo_colorFK_IdGrupoColor(grupocolor.getId());

					if(!this.conCargarFormDetalle) {
						colorproductoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					colorproductoBeanSwingJInternalFrame.setSelectedItemCombosFrameGrupoColorForeignKey(grupocolor,1,false,true,true);
					colorproductoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					colorproductoBeanSwingJInternalFrame.procesarBusqueda("FK_IdGrupoColor");
					colorproductoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGrupoColor");
					colorproductoBeanSwingJInternalFrame.inicializarActualizarBindingTablaColorProducto(true);
					colorproductoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesColorProducto("n",colorproductoBeanSwingJInternalFrame.isGuardarCambiosEnLote, colorproductoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					colorproductoBeanSwingJInternalFrame.setAutoscrolls(true);
					colorproductoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						colorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsColorProducto("relacionado");
					} else {
						colorproductoBeanSwingJInternalFrame.actualizarEstadoPanelsColorProducto("no_relacionado");
					}

					colorproductoBeanSwingJInternalFrame.getjButtonRecargarInformacionColorProducto().setVisible(false);

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
