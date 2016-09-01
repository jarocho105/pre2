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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.LibroContableConstantesFunciones;

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
public class LibroContableDetalleFormJInternalFrame extends LibroContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLibroContable;
	
	protected JMenuBar jmenuBarDetalleLibroContable;
	
	protected JMenu jmenuDetalleLibroContable;
	protected JMenu jmenuDetalleArchivoLibroContable;
	protected JMenu jmenuDetalleAccionesLibroContable;
	protected JMenu jmenuDetalleDatosLibroContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLibroContable;	
	protected GridBagConstraints gridBagConstraintsLibroContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LibroContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleLibroContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public LibroContableSessionBean librocontableSessionBean;
	
	

	public ParametroFactuPrincipalBeanSwingJInternalFrame parametrofactuprincipalBeanSwingJInternalFrame=null;
	public ParametroFactuPrincipalBeanSwingJInternalFrame parametrofactuprincipalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroFactuPrincipal=false;
	public ParametroFactuPrincipalSessionBean parametrofactuprincipalSessionBean;

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public LibroContableLogic librocontableLogic;
	
	public JScrollPane jScrollPanelDatosLibroContable;
	public JScrollPane jScrollPanelDatosEdicionLibroContable;
	public JScrollPane jScrollPanelDatosGeneralLibroContable;
	
	protected JPanel jPanelCamposLibroContable;    
	protected JPanel jPanelCamposOcultosLibroContable;    	
	protected JPanel jPanelAccionesLibroContable;
	protected JPanel jPanelAccionesFormularioLibroContable;
    
	
	
	protected Integer iXPanelCamposLibroContable=0;
	protected Integer iYPanelCamposLibroContable=0;
	
	protected Integer iXPanelCamposOcultosLibroContable=0;
	protected Integer iYPanelCamposOcultosLibroContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLibroContable;
	public JButton jButtonModificarLibroContable;
	public JButton jButtonActualizarLibroContable;
    public JButton jButtonEliminarLibroContable;
	public JButton jButtonCancelarLibroContable;
    public JButton jButtonGuardarCambiosLibroContable;
	public JButton jButtonGuardarCambiosTablaLibroContable;
	protected JButton jButtonCerrarLibroContable;
	
	
	protected JButton jButtonProcesarInformacionLibroContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLibroContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLibroContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLibroContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLibroContable;
	protected JButton jButtonModificarToolBarLibroContable;
	protected JButton jButtonActualizarToolBarLibroContable;
    protected JButton jButtonEliminarToolBarLibroContable;
	protected JButton jButtonCancelarToolBarLibroContable;
    protected JButton jButtonGuardarCambiosToolBarLibroContable;
	protected JButton jButtonGuardarCambiosTablaToolBarLibroContable;
	protected JButton jButtonMostrarOcultarTablaToolBarLibroContable;
	protected JButton jButtonCerrarToolBarLibroContable;
	
	protected JButton jButtonProcesarInformacionToolBarLibroContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLibroContable;
	protected JMenuItem jMenuItemModificarLibroContable;
	protected JMenuItem jMenuItemActualizarLibroContable;
    protected JMenuItem jMenuItemEliminarLibroContable;
	protected JMenuItem jMenuItemCancelarLibroContable;
    protected JMenuItem jMenuItemGuardarCambiosLibroContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaLibroContable;
	protected JMenuItem jMenuItemCerrarLibroContable;
	protected JMenuItem jMenuItemDetalleCerrarLibroContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarLibroContable;
	
	protected JMenuItem jMenuItemProcesarInformacionLibroContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLibroContable;
	protected JMenuItem jMenuItemMostrarOcultarLibroContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLibroContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLibroContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLibroContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLibroContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLibroContable;
	public JLabel jLabelIdLibroContable;
	public JLabel jLabelidLibroContable;
	public JButton jButtonidLibroContableBusqueda= new JButtonMe();

	public JPanel jPanelcodigoLibroContable;
	public JLabel jLabelcodigoLibroContable;
	public JTextField jTextFieldcodigoLibroContable;
	public JButton jButtoncodigoLibroContableBusqueda= new JButtonMe();

	public JPanel jPanelnombreLibroContable;
	public JLabel jLabelnombreLibroContable;
	public JTextArea jTextAreanombreLibroContable;
	public JScrollPane jscrollPanenombreLibroContable;
	public JButton jButtonnombreLibroContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaLibroContable;
	public JLabel jLabelid_empresaLibroContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLibroContable;
	public JButton jButtonid_empresaLibroContable= new JButtonMe();
	public JButton jButtonid_empresaLibroContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaLibroContableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLibroContable;
	
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
	
	public LibroContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLibroContable=new JPanel();
				this.jPanelAccionesFormularioLibroContable=new JPanel();
				this.jmenuBarDetalleLibroContable=new JMenuBar();
				this.jTtoolBarDetalleLibroContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LibroContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LibroContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LibroContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLibroContable() {
		return this.jButtonActualizarToolBarLibroContable;
	}
	
	public JButton getjButtonEliminarToolBarLibroContable() {
		return this.jButtonEliminarToolBarLibroContable;
	}
	
	public JButton getjButtonCancelarToolBarLibroContable() {
		return this.jButtonCancelarToolBarLibroContable;
	}		
	
	public JButton getjButtonProcesarInformacionLibroContable() {
		return this.jButtonProcesarInformacionLibroContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLibroContable)	{
		this.jButtonProcesarInformacionLibroContable = jButtonProcesarInformacionLibroContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLibroContable() {
		return this.jComboBoxTiposAccionesLibroContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLibroContable(
			JComboBox jComboBoxTiposRelacionesLibroContable) {
		this.jComboBoxTiposRelacionesLibroContable = jComboBoxTiposRelacionesLibroContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLibroContable(
			JComboBox jComboBoxTiposAccionesLibroContable) {
		this.jComboBoxTiposAccionesLibroContable = jComboBoxTiposAccionesLibroContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLibroContable() {
		return this.jComboBoxTiposAccionesFormularioLibroContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLibroContable(
			JComboBox jComboBoxTiposAccionesFormularioLibroContable) {
		this.jComboBoxTiposAccionesFormularioLibroContable = jComboBoxTiposAccionesFormularioLibroContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.librocontableSessionBean=new LibroContableSessionBean();
		
		this.librocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.librocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.librocontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrofactuprincipalSessionBean=new ParametroFactuPrincipalSessionBean();
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LibroContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Libro Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
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
	
		LibroContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLibroContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLibroContable=new JButtonMe();
				this.jButtonModificarToolBarLibroContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLibroContable,this.jTtoolBarDetalleLibroContable,
							"actualizar","actualizar","Actualizar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLibroContable,this.jTtoolBarDetalleLibroContable,
							"eliminar","eliminar","Eliminar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLibroContable,this.jTtoolBarDetalleLibroContable,
							"cancelar","cancelar","Cancelar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLibroContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLibroContable,this.jTtoolBarDetalleLibroContable,
							"guardarcambios","guardarcambios","Guardar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLibroContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLibroContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLibroContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLibroContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLibroContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLibroContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLibroContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLibroContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLibroContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLibroContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLibroContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLibroContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLibroContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLibroContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLibroContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLibroContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLibroContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLibroContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLibroContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLibroContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLibroContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLibroContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLibroContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLibroContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLibroContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLibroContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLibroContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLibroContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLibroContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLibroContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLibroContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLibroContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLibroContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLibroContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLibroContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLibroContable.add(this.jMenuItemDetalleCerrarLibroContable);
		
		this.jmenuDetalleAccionesLibroContable.add(this.jMenuItemActualizarLibroContable);
		this.jmenuDetalleAccionesLibroContable.add(this.jMenuItemEliminarLibroContable);
		this.jmenuDetalleAccionesLibroContable.add(this.jMenuItemCancelarLibroContable);		
		
		//this.jmenuDetalleDatosLibroContable.add(this.jMenuItemDetalleAbrirOrderByLibroContable);				
		this.jmenuDetalleDatosLibroContable.add(this.jMenuItemDetalleMostarOcultarLibroContable);				
				
		//this.jmenuDetalleAccionesLibroContable.add(this.jMenuItemGuardarCambiosLibroContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLibroContable.add(this.jmenuDetalleArchivoLibroContable);		
		this.jmenuBarDetalleLibroContable.add(this.jmenuDetalleAccionesLibroContable);		
		this.jmenuBarDetalleLibroContable.add(this.jmenuDetalleDatosLibroContable);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLibroContable.add(this.jmenuDetalleLibroContable);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLibroContable);				
	}
	
	
	public void inicializarElementosCamposLibroContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLibroContable = new JLabelMe();
		jLabelIdLibroContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLibroContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLibroContable.setToolTipText(LibroContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLibroContable= new GridBagLayout();

		this.jPanelidLibroContable.setLayout(this.gridaBagLayoutLibroContable);

		jLabelidLibroContable = new JLabel();
		jLabelidLibroContable.setText("Id");

		jLabelidLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoLibroContable = new JLabelMe();
		this.jLabelcodigoLibroContable.setText(""+LibroContableConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoLibroContable.setToolTipText("Codigo");
		this.jLabelcodigoLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoLibroContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoLibroContable.setToolTipText(LibroContableConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutLibroContable = new GridBagLayout();
		this.jPanelcodigoLibroContable.setLayout(this.gridaBagLayoutLibroContable);


		jTextFieldcodigoLibroContable= new JTextFieldMe();

		jTextFieldcodigoLibroContable.setEnabled(false);
		jTextFieldcodigoLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoLibroContableBusqueda= new JButtonMe();
		this.jButtoncodigoLibroContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLibroContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoLibroContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoLibroContableBusqueda.setText("U");
		this.jButtoncodigoLibroContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoLibroContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoLibroContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoLibroContableBusqueda"));

		if(this.librocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoLibroContableBusqueda.setVisible(false);		}


					
		this.jLabelnombreLibroContable = new JLabelMe();
		this.jLabelnombreLibroContable.setText(""+LibroContableConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreLibroContable.setToolTipText("Nombre");
		this.jLabelnombreLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreLibroContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreLibroContable.setToolTipText(LibroContableConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutLibroContable = new GridBagLayout();
		this.jPanelnombreLibroContable.setLayout(this.gridaBagLayoutLibroContable);


		jTextAreanombreLibroContable= new JTextAreaMe();
		jTextAreanombreLibroContable.setEnabled(false);
		jTextAreanombreLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLibroContable.setLineWrap(true);
		jTextAreanombreLibroContable.setWrapStyleWord(true);
		jTextAreanombreLibroContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreLibroContable.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreLibroContable = new JScrollPane(jTextAreanombreLibroContable);
		jscrollPanenombreLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreLibroContableBusqueda= new JButtonMe();
		this.jButtonnombreLibroContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLibroContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLibroContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreLibroContableBusqueda.setText("U");
		this.jButtonnombreLibroContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreLibroContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreLibroContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreLibroContableBusqueda"));

		if(this.librocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreLibroContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLibroContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaLibroContable = new JLabelMe();
		this.jLabelid_empresaLibroContable.setText(""+LibroContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLibroContable.setToolTipText("Empresa");
		this.jLabelid_empresaLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLibroContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLibroContable.setToolTipText(LibroContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLibroContable = new GridBagLayout();
		this.jPanelid_empresaLibroContable.setLayout(this.gridaBagLayoutLibroContable);


		jComboBoxid_empresaLibroContable= new JComboBoxMe();
		jComboBoxid_empresaLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLibroContable.setEnabled(false);

		this.jButtonid_empresaLibroContable= new JButtonMe();
		this.jButtonid_empresaLibroContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLibroContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLibroContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLibroContable.setText("Buscar");
		this.jButtonid_empresaLibroContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLibroContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLibroContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLibroContable"));

		this.jButtonid_empresaLibroContableBusqueda= new JButtonMe();
		this.jButtonid_empresaLibroContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLibroContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLibroContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLibroContableBusqueda.setText("U");
		this.jButtonid_empresaLibroContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLibroContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLibroContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLibroContableBusqueda"));

		if(this.librocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLibroContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaLibroContableUpdate= new JButtonMe();
		this.jButtonid_empresaLibroContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLibroContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLibroContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLibroContableUpdate.setText("U");
		this.jButtonid_empresaLibroContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLibroContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLibroContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLibroContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLibroContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLibroContableUpdate"));



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
		//this.jInternalFrameDetalleLibroContable = new LibroContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Libro Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLibroContable= new GridBagLayout();
		

		
		String sToolTipLibroContable="";
		sToolTipLibroContable=LibroContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLibroContable+="(Facturacion.LibroContable)";
		}
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipLibroContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLibroContable = new JButtonMe();
		this.jButtonModificarLibroContable = new JButtonMe();
        this.jButtonActualizarLibroContable = new JButtonMe();
        this.jButtonEliminarLibroContable = new JButtonMe();
        this.jButtonCancelarLibroContable = new JButtonMe();
        this.jButtonGuardarCambiosLibroContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaLibroContable = new JButtonMe();
		this.jButtonCerrarLibroContable = new JButtonMe();
		
		this.jScrollPanelDatosLibroContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionLibroContable = new JScrollPane();
		this.jScrollPanelDatosGeneralLibroContable = new JScrollPane();
				
		
		
		this.jPanelCamposLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Libro Contable";
		
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Libro Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosLibroContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLibroContable.setName("jPanelCamposLibroContable"); 

		this.jPanelCamposOcultosLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLibroContable.setName("jPanelCamposOcultosLibroContable"); 

        this.jPanelAccionesLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLibroContable.setToolTipText("Acciones");
        this.jPanelAccionesLibroContable.setName("Acciones"); 

		this.jPanelAccionesFormularioLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLibroContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLibroContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLibroContable.setText("Nuevo");
		this.jButtonModificarLibroContable.setText("Editar");
        this.jButtonActualizarLibroContable.setText("Actualizar");
        this.jButtonEliminarLibroContable.setText("Eliminar");
        this.jButtonCancelarLibroContable.setText("Cancelar");
        this.jButtonGuardarCambiosLibroContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaLibroContable.setText("Guardar");
		this.jButtonCerrarLibroContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLibroContable,"nuevo_button","Nuevo",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLibroContable,"modificar_button","Editar",this.librocontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLibroContable,"actualizar_button","Actualizar",this.librocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLibroContable,"eliminar_button","Eliminar",this.librocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLibroContable,"cancelar_button","Cancelar",this.librocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLibroContable,"guardarcambios_button","Guardar",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLibroContable,"guardarcambiostabla_button","Guardar",this.librocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLibroContable,"cerrar_button","Salir",this.librocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLibroContable.setToolTipText("Nuevo"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLibroContable.setToolTipText("Editar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLibroContable.setToolTipText("Actualizar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLibroContable.setToolTipText("Eliminar)"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLibroContable.setToolTipText("Cancelar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLibroContable.setToolTipText("Guardar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLibroContable.setToolTipText("Guardar"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLibroContable.setToolTipText("Salir"+" "+LibroContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLibroContable";
		inputMap = this.jButtonNuevoLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLibroContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLibroContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLibroContable";
		inputMap = this.jButtonActualizarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLibroContable"));
		
		//ELIMINAR
		sMapKey = "EliminarLibroContable";
		inputMap = this.jButtonEliminarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLibroContable"));
		
		//CANCELAR	
		sMapKey = "CancelarLibroContable";
		inputMap = this.jButtonCancelarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLibroContable"));
		
		//CERRAR		
		sMapKey = "CerrarLibroContable";
		inputMap = this.jButtonCerrarLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLibroContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLibroContable";
		inputMap = this.jButtonGuardarCambiosTablaLibroContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLibroContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLibroContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLibroContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLibroContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLibroContable.setToolTipText("Nuevo LibroContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLibroContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLibroContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLibroContable.setToolTipText("Sin Cerrar Ventana LibroContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLibroContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLibroContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLibroContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLibroContable.setText("Accion");
		this.jComboBoxTiposAccionesLibroContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLibroContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLibroContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLibroContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLibroContable = new JLabelMe();
		
		this.jLabelAccionesLibroContable.setText("Acciones");		
		this.jLabelAccionesLibroContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLibroContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLibroContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLibroContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLibroContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLibroContable=new JTabbedPane();
		this.jTabbedPaneRelacionesLibroContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLibroContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLibroContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLibroContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLibroContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLibroContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLibroContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLibroContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLibroContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLibroContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLibroContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLibroContable = new GridBagLayout();
		
		this.jPanelCamposLibroContable.setLayout(gridaBagLayoutCamposLibroContable);
		this.jPanelCamposOcultosLibroContable.setLayout(gridaBagLayoutCamposOcultosLibroContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 0;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLibroContable.add(jLabelIdLibroContable, this.gridBagConstraintsLibroContable);



	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 1;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLibroContable.add(jLabelidLibroContable, this.gridBagConstraintsLibroContable);


	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 0;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLibroContable.add(jLabelid_empresaLibroContable, this.gridBagConstraintsLibroContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		//this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx = 2;
		this.gridBagConstraintsLibroContable.ipadx = 0;
		this.gridBagConstraintsLibroContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLibroContable.add(jButtonid_empresaLibroContableBusqueda, this.gridBagConstraintsLibroContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		//this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx = 3;
		this.gridBagConstraintsLibroContable.ipadx = 0;
		this.gridBagConstraintsLibroContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLibroContable.add(jButtonid_empresaLibroContableUpdate, this.gridBagConstraintsLibroContable);
	}

	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 1;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLibroContable.add(jComboBoxid_empresaLibroContable, this.gridBagConstraintsLibroContable);


	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 0;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoLibroContable.add(jLabelcodigoLibroContable, this.gridBagConstraintsLibroContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		//this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx = 2;
		this.gridBagConstraintsLibroContable.ipadx = 0;
		this.gridBagConstraintsLibroContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoLibroContable.add(jButtoncodigoLibroContableBusqueda, this.gridBagConstraintsLibroContable);
	}

	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 1;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoLibroContable.add(jTextFieldcodigoLibroContable, this.gridBagConstraintsLibroContable);


	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 0;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreLibroContable.add(jLabelnombreLibroContable, this.gridBagConstraintsLibroContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		//this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx = 2;
		this.gridBagConstraintsLibroContable.ipadx = 0;
		this.gridBagConstraintsLibroContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreLibroContable.add(jButtonnombreLibroContableBusqueda, this.gridBagConstraintsLibroContable);
	}

	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLibroContable.gridy = 0;
	this.gridBagConstraintsLibroContable.gridx = 1;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreLibroContable.add(jscrollPanenombreLibroContable, this.gridBagConstraintsLibroContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLibroContable.gridy = iYPanelCamposLibroContable;
	this.gridBagConstraintsLibroContable.gridx = iXPanelCamposLibroContable++;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLibroContable.add(this.jPanelidLibroContable, this.gridBagConstraintsLibroContable);



	if(iXPanelCamposLibroContable % 1==0) {
		iXPanelCamposLibroContable=0;
		iYPanelCamposLibroContable++;
	}
	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLibroContable.gridy = iYPanelCamposLibroContable;
	this.gridBagConstraintsLibroContable.gridx = iXPanelCamposLibroContable++;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLibroContable.add(this.jPanelcodigoLibroContable, this.gridBagConstraintsLibroContable);



	if(iXPanelCamposLibroContable % 1==0) {
		iXPanelCamposLibroContable=0;
		iYPanelCamposLibroContable++;
	}
	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLibroContable.gridy = iYPanelCamposLibroContable;
	this.gridBagConstraintsLibroContable.gridx = iXPanelCamposLibroContable++;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLibroContable.add(this.jPanelnombreLibroContable, this.gridBagConstraintsLibroContable);



	if(iXPanelCamposLibroContable % 1==0) {
		iXPanelCamposLibroContable=0;
		iYPanelCamposLibroContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLibroContable = new GridBagConstraints();
	this.gridBagConstraintsLibroContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLibroContable.gridy = iYPanelCamposOcultosLibroContable;
	this.gridBagConstraintsLibroContable.gridx = iXPanelCamposOcultosLibroContable++;
	this.gridBagConstraintsLibroContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLibroContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLibroContable.add(this.jPanelid_empresaLibroContable, this.gridBagConstraintsLibroContable);



	if(iXPanelCamposOcultosLibroContable % 1==0) {
		iXPanelCamposOcultosLibroContable=0;
		iYPanelCamposOcultosLibroContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesLibroContable= new GridBagLayout();
		this.jPanelAccionesLibroContable.setLayout(gridaBagLayoutAccionesLibroContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLibroContable= new GridBagLayout();
		this.jPanelAccionesFormularioLibroContable.setLayout(gridaBagLayoutAccionesFormularioLibroContable);
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLibroContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLibroContable.add(this.jComboBoxTiposAccionesFormularioLibroContable, this.gridBagConstraintsLibroContable);

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLibroContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLibroContable.add(this.jCheckBoxPostAccionNuevoLibroContable, this.gridBagConstraintsLibroContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLibroContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLibroContable.add(this.jCheckBoxPostAccionSinCerrarLibroContable, this.gridBagConstraintsLibroContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.librocontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.librocontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLibroContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLibroContable.add(this.jCheckBoxPostAccionSinMensajeLibroContable, this.gridBagConstraintsLibroContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesLibroContable.add(this.jButtonModificarLibroContable, this.gridBagConstraintsLibroContable);							

		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLibroContable.gridy = 0;
		this.gridBagConstraintsLibroContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesLibroContable.add(this.jButtonEliminarLibroContable, this.gridBagConstraintsLibroContable);
		
			
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = 0;		
		this.gridBagConstraintsLibroContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesLibroContable.add(this.jButtonActualizarLibroContable, this.gridBagConstraintsLibroContable);


		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = 0;		
		this.gridBagConstraintsLibroContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesLibroContable.add(this.jButtonGuardarCambiosLibroContable, this.gridBagConstraintsLibroContable);	
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = 0;		
		this.gridBagConstraintsLibroContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesLibroContable.add(this.jButtonCancelarLibroContable, this.gridBagConstraintsLibroContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLibroContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLibroContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.librocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLibroContable = new GridBagConstraints();						
			this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLibroContable.gridx = 0;		
			//this.gridBagConstraintsLibroContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLibroContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLibroContable.gridx =0;
		this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLibroContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLibroContable, this.gridBagConstraintsLibroContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LibroContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLibroContable = new LibroContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Libro Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Libro Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Libro Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LibroContableModel librocontableModel=new LibroContableModel(this);
			
			//SI USARA CLASE INTERNA
			//LibroContableModel.LibroContableFocusTraversalPolicy librocontableFocusTraversalPolicy = librocontableModel.new LibroContableFocusTraversalPolicy(this);
			
			//librocontableFocusTraversalPolicy.setlibrocontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(librocontableModel);
			
			
			this.jContentPaneDetalleLibroContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLibroContable = new GridBagLayout();	
			this.jContentPaneDetalleLibroContable.setLayout(gridaBagLayoutDetalleLibroContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLibroContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLibroContable = new GridBagConstraints();
				this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLibroContable.gridx = 0;
					
				
				this.jContentPaneDetalleLibroContable.add(jTtoolBarDetalleLibroContable, gridBagConstraintsLibroContable);								
				
}
			
			this.jScrollPanelDatosEdicionLibroContable=   new JScrollPane(jContentPaneDetalleLibroContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLibroContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLibroContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLibroContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLibroContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLibroContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLibroContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLibroContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLibroContable.gridx = 0;
	        
			this.jContentPaneDetalleLibroContable.add(jPanelCamposLibroContable, gridBagConstraintsLibroContable);
			
			
			
			
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
						&& librocontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroFactuPrincipal(this.puedeCargarPorParteParametroFactuPrincipal,false,-1);
					
					if(this.librocontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLibroContable= new GridBagConstraints();
						this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLibroContable.gridx = 0;
						this.jContentPaneDetalleLibroContable.add(this.jTabbedPaneRelacionesLibroContable, this.gridBagConstraintsLibroContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLibroContable.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroFactuPrincipal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLibroContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLibroContable = new GridBagConstraints();
					this.gridBagConstraintsLibroContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLibroContable.gridx = 0;
					
				
					this.jContentPaneDetalleLibroContable.add(jPanelCamposOcultosLibroContable, gridBagConstraintsLibroContable);
				
					this.jPanelCamposOcultosLibroContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsLibroContable.gridx = 0;
	        this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLibroContable.add(this.jPanelAccionesFormularioLibroContable, this.gridBagConstraintsLibroContable);							
			
			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
	        this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsLibroContable.gridx = 0;
	        
			
			this.jContentPaneDetalleLibroContable.add(this.jPanelAccionesLibroContable, this.gridBagConstraintsLibroContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLibroContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLibroContable=   new JScrollPane(this.jPanelCamposLibroContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLibroContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLibroContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLibroContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLibroContable.gridx = 0;
			this.gridBagConstraintsLibroContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLibroContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLibroContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLibroContable, this.gridBagConstraintsLibroContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLibroContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLibroContable, this.gridBagConstraintsLibroContable);			
			
			this.gridBagConstraintsLibroContable = new GridBagConstraints();
			this.gridBagConstraintsLibroContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLibroContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLibroContable, this.gridBagConstraintsLibroContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLibroContable, this.gridBagConstraintsLibroContable);
			
			
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLibroContable, this.gridBagConstraintsLibroContable);
		
			
		this.gridBagConstraintsLibroContable = new GridBagConstraints();
		this.gridBagConstraintsLibroContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLibroContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLibroContable, this.gridBagConstraintsLibroContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLibroContable;//jContentPane;
		
		return jScrollPanelDatosEdicionLibroContable;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDefinicion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.definicionSessionBean=new DefinicionSessionBean();
		this.definicionSessionBean.setConGuardarRelaciones(false);
		this.definicionSessionBean.setEsGuardarRelacionado(true);

		this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.definicionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.definicionSessionBean.getEsGuardarRelacionado()) {

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsLibroContable = new GridBagConstraints();
				//this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLibroContable.gridx = 0;
				//this.jContentPaneDetalleLibroContable.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLibroContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLibroContable.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLibroContable.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesLibroContable.add("Definiciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroFactuPrincipal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrofactuprincipalSessionBean=new ParametroFactuPrincipalSessionBean();
		this.parametrofactuprincipalSessionBean.setConGuardarRelaciones(false);
		this.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(true);

		this.parametrofactuprincipalBeanSwingJInternalFrame=null;//new ParametroFactuPrincipalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrofactuprincipalBeanSwingJInternalFramePopup=new ParametroFactuPrincipalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrofactuprincipalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {

				ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL=LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LibroContableJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(true);

				this.parametrofactuprincipalBeanSwingJInternalFrame=new ParametroFactuPrincipalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrofactuprincipalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrofactuprincipalBeanSwingJInternalFrame.setparametrofactuprincipalSessionBean(this.parametrofactuprincipalSessionBean);

				//this.gridBagConstraintsLibroContable = new GridBagConstraints();
				//this.gridBagConstraintsLibroContable.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLibroContable.gridx = 0;
				//this.jContentPaneDetalleLibroContable.add(this.parametrofactuprincipalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLibroContable);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLibroContable.add("Parametro Principal s",this.parametrofactuprincipalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLibroContable.setComponentAt(iIndexTab,this.parametrofactuprincipalBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(false);
				this.parametrofactuprincipalBeanSwingJInternalFrame=null;//new ParametroFactuPrincipalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroFactuPrincipal) {
					this.jTabbedPaneRelacionesLibroContable.add("Parametro Principal s",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroFactuPrincipalBeanSwingJInternalFrame(List<LibroContable> librocontables,LibroContable librocontable,ParametroFactuPrincipalBeanSwingJInternalFrame parametrofactuprincipalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrofactuprincipalBeanSwingJInternalFrame=new ParametroFactuPrincipalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrofactuprincipalBeanSwingJInternalFrame.getParametroFactuPrincipalLogic().setConnexion(this.librocontableLogic.getConnexion());

					parametrofactuprincipalBeanSwingJInternalFrame.setlibrocontablesForeignKey(librocontables);
					parametrofactuprincipalBeanSwingJInternalFrame.setlibrocontableForeignKey(librocontable);
					parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.setisBusquedaDesdeForeignKeySesionLibroContable(true);
					parametrofactuprincipalBeanSwingJInternalFrame.parametrofactuprincipalSessionBean.setlidLibroContableActual(librocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrofactuprincipalBeanSwingJInternalFrame.cargarCombosForeignKeyParametroFactuPrincipal(parametrofactuprincipalBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrofactuprincipalBeanSwingJInternalFrame.setVisibilidadBusquedasParaLibroContable(true);
					parametrofactuprincipalBeanSwingJInternalFrame.setid_libro_contableFK_IdLibroContable(librocontable.getId());

					if(!this.conCargarFormDetalle) {
						parametrofactuprincipalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrofactuprincipalBeanSwingJInternalFrame.setSelectedItemCombosFrameLibroContableForeignKey(librocontable,1,false,true,true);
					parametrofactuprincipalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrofactuprincipalBeanSwingJInternalFrame.procesarBusqueda("FK_IdLibroContable");
					parametrofactuprincipalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLibroContable");
					parametrofactuprincipalBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroFactuPrincipal(true);
					parametrofactuprincipalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroFactuPrincipal("n",parametrofactuprincipalBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrofactuprincipalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrofactuprincipalBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrofactuprincipalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrofactuprincipalBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFactuPrincipal("relacionado");
					} else {
						parametrofactuprincipalBeanSwingJInternalFrame.actualizarEstadoPanelsParametroFactuPrincipal("no_relacionado");
					}

					parametrofactuprincipalBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroFactuPrincipal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDefinicionBeanSwingJInternalFrame(List<LibroContable> librocontables,LibroContable librocontable,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.librocontableLogic.getConnexion());

					definicionBeanSwingJInternalFrame.setlibrocontablesForeignKey(librocontables);
					definicionBeanSwingJInternalFrame.setlibrocontableForeignKey(librocontable);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionLibroContable(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidLibroContableActual(librocontable.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaLibroContable(true);
					definicionBeanSwingJInternalFrame.setid_libro_contableFK_IdLibroContable(librocontable.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameLibroContableForeignKey(librocontable,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdLibroContable");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLibroContable");
					definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(true);
					definicionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDefinicion("n",definicionBeanSwingJInternalFrame.isGuardarCambiosEnLote, definicionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					definicionBeanSwingJInternalFrame.setAutoscrolls(true);
					definicionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("relacionado");
					} else {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");
					}

					definicionBeanSwingJInternalFrame.getjButtonRecargarInformacionDefinicion().setVisible(false);

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
