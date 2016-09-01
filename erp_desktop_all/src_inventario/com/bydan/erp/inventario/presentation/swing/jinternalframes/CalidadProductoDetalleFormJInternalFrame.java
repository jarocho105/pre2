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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.inventario.util.CalidadProductoConstantesFunciones;

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
public class CalidadProductoDetalleFormJInternalFrame extends CalidadProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCalidadProducto;
	
	protected JMenuBar jmenuBarDetalleCalidadProducto;
	
	protected JMenu jmenuDetalleCalidadProducto;
	protected JMenu jmenuDetalleArchivoCalidadProducto;
	protected JMenu jmenuDetalleAccionesCalidadProducto;
	protected JMenu jmenuDetalleDatosCalidadProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCalidadProducto;	
	protected GridBagConstraints gridBagConstraintsCalidadProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CalidadProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCalidadProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public CalidadProductoSessionBean calidadproductoSessionBean;
	
	

	public BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame=null;
	public BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBodega=false;
	public BodegaSessionBean bodegaSessionBean;

	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame=null;
	public ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroInventarioDefecto=false;
	public ParametroInventarioDefectoSessionBean parametroinventariodefectoSessionBean;
	
		
	
	public CalidadProductoLogic calidadproductoLogic;
	
	public JScrollPane jScrollPanelDatosCalidadProducto;
	public JScrollPane jScrollPanelDatosEdicionCalidadProducto;
	public JScrollPane jScrollPanelDatosGeneralCalidadProducto;
	
	protected JPanel jPanelCamposCalidadProducto;    
	protected JPanel jPanelCamposOcultosCalidadProducto;    	
	protected JPanel jPanelAccionesCalidadProducto;
	protected JPanel jPanelAccionesFormularioCalidadProducto;
    
	
	
	protected Integer iXPanelCamposCalidadProducto=0;
	protected Integer iYPanelCamposCalidadProducto=0;
	
	protected Integer iXPanelCamposOcultosCalidadProducto=0;
	protected Integer iYPanelCamposOcultosCalidadProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCalidadProducto;
	public JButton jButtonModificarCalidadProducto;
	public JButton jButtonActualizarCalidadProducto;
    public JButton jButtonEliminarCalidadProducto;
	public JButton jButtonCancelarCalidadProducto;
    public JButton jButtonGuardarCambiosCalidadProducto;
	public JButton jButtonGuardarCambiosTablaCalidadProducto;
	protected JButton jButtonCerrarCalidadProducto;
	
	
	protected JButton jButtonProcesarInformacionCalidadProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCalidadProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCalidadProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCalidadProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCalidadProducto;
	protected JButton jButtonModificarToolBarCalidadProducto;
	protected JButton jButtonActualizarToolBarCalidadProducto;
    protected JButton jButtonEliminarToolBarCalidadProducto;
	protected JButton jButtonCancelarToolBarCalidadProducto;
    protected JButton jButtonGuardarCambiosToolBarCalidadProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarCalidadProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarCalidadProducto;
	protected JButton jButtonCerrarToolBarCalidadProducto;
	
	protected JButton jButtonProcesarInformacionToolBarCalidadProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCalidadProducto;
	protected JMenuItem jMenuItemModificarCalidadProducto;
	protected JMenuItem jMenuItemActualizarCalidadProducto;
    protected JMenuItem jMenuItemEliminarCalidadProducto;
	protected JMenuItem jMenuItemCancelarCalidadProducto;
    protected JMenuItem jMenuItemGuardarCambiosCalidadProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaCalidadProducto;
	protected JMenuItem jMenuItemCerrarCalidadProducto;
	protected JMenuItem jMenuItemDetalleCerrarCalidadProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarCalidadProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionCalidadProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCalidadProducto;
	protected JMenuItem jMenuItemMostrarOcultarCalidadProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCalidadProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCalidadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCalidadProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCalidadProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCalidadProducto;
	public JLabel jLabelIdCalidadProducto;
	public JTextFieldMe jTextFieldidCalidadProducto;
	public JButton jButtonidCalidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCalidadProducto;
	public JLabel jLabelcodigoCalidadProducto;
	public JTextField jTextFieldcodigoCalidadProducto;
	public JButton jButtoncodigoCalidadProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCalidadProducto;
	public JLabel jLabelnombreCalidadProducto;
	public JTextArea jTextAreanombreCalidadProducto;
	public JScrollPane jscrollPanenombreCalidadProducto;
	public JButton jButtonnombreCalidadProductoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCalidadProducto;
	
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
	
	public CalidadProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCalidadProducto=new JPanel();
				this.jPanelAccionesFormularioCalidadProducto=new JPanel();
				this.jmenuBarDetalleCalidadProducto=new JMenuBar();
				this.jTtoolBarDetalleCalidadProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CalidadProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CalidadProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CalidadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCalidadProducto() {
		return this.jButtonActualizarToolBarCalidadProducto;
	}
	
	public JButton getjButtonEliminarToolBarCalidadProducto() {
		return this.jButtonEliminarToolBarCalidadProducto;
	}
	
	public JButton getjButtonCancelarToolBarCalidadProducto() {
		return this.jButtonCancelarToolBarCalidadProducto;
	}		
	
	public JButton getjButtonProcesarInformacionCalidadProducto() {
		return this.jButtonProcesarInformacionCalidadProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCalidadProducto)	{
		this.jButtonProcesarInformacionCalidadProducto = jButtonProcesarInformacionCalidadProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCalidadProducto() {
		return this.jComboBoxTiposAccionesCalidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCalidadProducto(
			JComboBox jComboBoxTiposRelacionesCalidadProducto) {
		this.jComboBoxTiposRelacionesCalidadProducto = jComboBoxTiposRelacionesCalidadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCalidadProducto(
			JComboBox jComboBoxTiposAccionesCalidadProducto) {
		this.jComboBoxTiposAccionesCalidadProducto = jComboBoxTiposAccionesCalidadProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCalidadProducto() {
		return this.jComboBoxTiposAccionesFormularioCalidadProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCalidadProducto(
			JComboBox jComboBoxTiposAccionesFormularioCalidadProducto) {
		this.jComboBoxTiposAccionesFormularioCalidadProducto = jComboBoxTiposAccionesFormularioCalidadProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.calidadproductoSessionBean=new CalidadProductoSessionBean();
		
		this.calidadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.calidadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.calidadproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.bodegaSessionBean=new BodegaSessionBean();
		//this.parametroinventariodefectoSessionBean=new ParametroInventarioDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CalidadProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Calidad Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		CalidadProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCalidadProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCalidadProducto=new JButtonMe();
				this.jButtonModificarToolBarCalidadProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCalidadProducto,this.jTtoolBarDetalleCalidadProducto,
							"actualizar","actualizar","Actualizar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCalidadProducto,this.jTtoolBarDetalleCalidadProducto,
							"eliminar","eliminar","Eliminar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCalidadProducto,this.jTtoolBarDetalleCalidadProducto,
							"cancelar","cancelar","Cancelar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCalidadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCalidadProducto,this.jTtoolBarDetalleCalidadProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCalidadProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCalidadProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCalidadProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCalidadProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCalidadProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCalidadProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCalidadProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCalidadProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCalidadProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCalidadProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCalidadProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCalidadProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCalidadProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCalidadProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCalidadProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCalidadProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCalidadProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCalidadProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCalidadProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCalidadProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCalidadProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCalidadProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCalidadProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCalidadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCalidadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCalidadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCalidadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCalidadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCalidadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCalidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCalidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCalidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCalidadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCalidadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCalidadProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCalidadProducto.add(this.jMenuItemDetalleCerrarCalidadProducto);
		
		this.jmenuDetalleAccionesCalidadProducto.add(this.jMenuItemActualizarCalidadProducto);
		this.jmenuDetalleAccionesCalidadProducto.add(this.jMenuItemEliminarCalidadProducto);
		this.jmenuDetalleAccionesCalidadProducto.add(this.jMenuItemCancelarCalidadProducto);		
		
		//this.jmenuDetalleDatosCalidadProducto.add(this.jMenuItemDetalleAbrirOrderByCalidadProducto);				
		this.jmenuDetalleDatosCalidadProducto.add(this.jMenuItemDetalleMostarOcultarCalidadProducto);				
				
		//this.jmenuDetalleAccionesCalidadProducto.add(this.jMenuItemGuardarCambiosCalidadProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCalidadProducto.add(this.jmenuDetalleArchivoCalidadProducto);		
		this.jmenuBarDetalleCalidadProducto.add(this.jmenuDetalleAccionesCalidadProducto);		
		this.jmenuBarDetalleCalidadProducto.add(this.jmenuDetalleDatosCalidadProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCalidadProducto.add(this.jmenuDetalleCalidadProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCalidadProducto);				
	}
	
	
	public void inicializarElementosCamposCalidadProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCalidadProducto = new JLabelMe();
		jLabelIdCalidadProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCalidadProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCalidadProducto.setToolTipText(CalidadProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCalidadProducto= new GridBagLayout();

		this.jPanelidCalidadProducto.setLayout(this.gridaBagLayoutCalidadProducto);

		jTextFieldidCalidadProducto = new JTextFieldMe();
		jTextFieldidCalidadProducto.setText("Id");

		jTextFieldidCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCalidadProducto = new JLabelMe();
		this.jLabelcodigoCalidadProducto.setText(""+CalidadProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCalidadProducto.setToolTipText("Codigo");
		this.jLabelcodigoCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCalidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCalidadProducto.setToolTipText(CalidadProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCalidadProducto = new GridBagLayout();
		this.jPanelcodigoCalidadProducto.setLayout(this.gridaBagLayoutCalidadProducto);


		jTextFieldcodigoCalidadProducto= new JTextFieldMe();

		jTextFieldcodigoCalidadProducto.setEnabled(false);
		jTextFieldcodigoCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCalidadProductoBusqueda= new JButtonMe();
		this.jButtoncodigoCalidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCalidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCalidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCalidadProductoBusqueda.setText("U");
		this.jButtoncodigoCalidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCalidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCalidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCalidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCalidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCalidadProductoBusqueda"));

		if(this.calidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCalidadProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreCalidadProducto = new JLabelMe();
		this.jLabelnombreCalidadProducto.setText(""+CalidadProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCalidadProducto.setToolTipText("Nombre");
		this.jLabelnombreCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCalidadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCalidadProducto.setToolTipText(CalidadProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCalidadProducto = new GridBagLayout();
		this.jPanelnombreCalidadProducto.setLayout(this.gridaBagLayoutCalidadProducto);


		jTextAreanombreCalidadProducto= new JTextAreaMe();
		jTextAreanombreCalidadProducto.setEnabled(false);
		jTextAreanombreCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCalidadProducto.setLineWrap(true);
		jTextAreanombreCalidadProducto.setWrapStyleWord(true);
		jTextAreanombreCalidadProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCalidadProducto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCalidadProducto = new JScrollPane(jTextAreanombreCalidadProducto);
		jscrollPanenombreCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCalidadProductoBusqueda= new JButtonMe();
		this.jButtonnombreCalidadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCalidadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCalidadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCalidadProductoBusqueda.setText("U");
		this.jButtonnombreCalidadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCalidadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCalidadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCalidadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCalidadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCalidadProductoBusqueda"));

		if(this.calidadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCalidadProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCalidadProducto() {
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
		//this.jInternalFrameDetalleCalidadProducto = new CalidadProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Calidad Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCalidadProducto= new GridBagLayout();
		

		
		String sToolTipCalidadProducto="";
		sToolTipCalidadProducto=CalidadProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCalidadProducto+="(Inventario.CalidadProducto)";
		}
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCalidadProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCalidadProducto = new JButtonMe();
		this.jButtonModificarCalidadProducto = new JButtonMe();
        this.jButtonActualizarCalidadProducto = new JButtonMe();
        this.jButtonEliminarCalidadProducto = new JButtonMe();
        this.jButtonCancelarCalidadProducto = new JButtonMe();
        this.jButtonGuardarCambiosCalidadProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaCalidadProducto = new JButtonMe();
		this.jButtonCerrarCalidadProducto = new JButtonMe();
		
		this.jScrollPanelDatosCalidadProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionCalidadProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralCalidadProducto = new JScrollPane();
				
		
		
		this.jPanelCamposCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Calidad Producto";
		
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Calidad Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosCalidadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCalidadProducto.setName("jPanelCamposCalidadProducto"); 

		this.jPanelCamposOcultosCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCalidadProducto.setName("jPanelCamposOcultosCalidadProducto"); 

        this.jPanelAccionesCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCalidadProducto.setToolTipText("Acciones");
        this.jPanelAccionesCalidadProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCalidadProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCalidadProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCalidadProducto.setText("Nuevo");
		this.jButtonModificarCalidadProducto.setText("Editar");
        this.jButtonActualizarCalidadProducto.setText("Actualizar");
        this.jButtonEliminarCalidadProducto.setText("Eliminar");
        this.jButtonCancelarCalidadProducto.setText("Cancelar");
        this.jButtonGuardarCambiosCalidadProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaCalidadProducto.setText("Guardar");
		this.jButtonCerrarCalidadProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCalidadProducto,"nuevo_button","Nuevo",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCalidadProducto,"modificar_button","Editar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCalidadProducto,"actualizar_button","Actualizar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCalidadProducto,"eliminar_button","Eliminar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCalidadProducto,"cancelar_button","Cancelar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCalidadProducto,"guardarcambios_button","Guardar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCalidadProducto,"guardarcambiostabla_button","Guardar",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCalidadProducto,"cerrar_button","Salir",this.calidadproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCalidadProducto.setToolTipText("Nuevo"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCalidadProducto.setToolTipText("Editar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCalidadProducto.setToolTipText("Actualizar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCalidadProducto.setToolTipText("Eliminar)"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCalidadProducto.setToolTipText("Cancelar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCalidadProducto.setToolTipText("Guardar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCalidadProducto.setToolTipText("Guardar"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCalidadProducto.setToolTipText("Salir"+" "+CalidadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCalidadProducto";
		inputMap = this.jButtonNuevoCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCalidadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCalidadProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCalidadProducto";
		inputMap = this.jButtonActualizarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCalidadProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarCalidadProducto";
		inputMap = this.jButtonEliminarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCalidadProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarCalidadProducto";
		inputMap = this.jButtonCancelarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCalidadProducto"));
		
		//CERRAR		
		sMapKey = "CerrarCalidadProducto";
		inputMap = this.jButtonCerrarCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCalidadProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCalidadProducto";
		inputMap = this.jButtonGuardarCambiosTablaCalidadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCalidadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCalidadProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCalidadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCalidadProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCalidadProducto.setToolTipText("Nuevo CalidadProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCalidadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCalidadProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCalidadProducto.setToolTipText("Sin Cerrar Ventana CalidadProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCalidadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCalidadProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCalidadProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCalidadProducto.setText("Accion");
		this.jComboBoxTiposAccionesCalidadProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCalidadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCalidadProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCalidadProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCalidadProducto = new JLabelMe();
		
		this.jLabelAccionesCalidadProducto.setText("Acciones");		
		this.jLabelAccionesCalidadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalidadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCalidadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCalidadProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCalidadProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCalidadProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesCalidadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCalidadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCalidadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalidadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCalidadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCalidadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCalidadProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCalidadProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCalidadProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCalidadProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCalidadProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCalidadProducto = new GridBagLayout();
		
		this.jPanelCamposCalidadProducto.setLayout(gridaBagLayoutCamposCalidadProducto);
		this.jPanelCamposOcultosCalidadProducto.setLayout(gridaBagLayoutCamposOcultosCalidadProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalidadProducto.gridy = 0;
	this.gridBagConstraintsCalidadProducto.gridx = 0;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCalidadProducto.add(jLabelIdCalidadProducto, this.gridBagConstraintsCalidadProducto);



	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalidadProducto.gridy = 0;
	this.gridBagConstraintsCalidadProducto.gridx = 1;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCalidadProducto.add(jTextFieldidCalidadProducto, this.gridBagConstraintsCalidadProducto);


	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalidadProducto.gridy = 0;
	this.gridBagConstraintsCalidadProducto.gridx = 0;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCalidadProducto.add(jLabelcodigoCalidadProducto, this.gridBagConstraintsCalidadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = 0;
		this.gridBagConstraintsCalidadProducto.gridx = 2;
		this.gridBagConstraintsCalidadProducto.ipadx = 0;
		this.gridBagConstraintsCalidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCalidadProducto.add(jButtoncodigoCalidadProductoBusqueda, this.gridBagConstraintsCalidadProducto);
	}

	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalidadProducto.gridy = 0;
	this.gridBagConstraintsCalidadProducto.gridx = 1;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCalidadProducto.add(jTextFieldcodigoCalidadProducto, this.gridBagConstraintsCalidadProducto);


	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalidadProducto.gridy = 0;
	this.gridBagConstraintsCalidadProducto.gridx = 0;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCalidadProducto.add(jLabelnombreCalidadProducto, this.gridBagConstraintsCalidadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		//this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCalidadProducto.gridy = 0;
		this.gridBagConstraintsCalidadProducto.gridx = 2;
		this.gridBagConstraintsCalidadProducto.ipadx = 0;
		this.gridBagConstraintsCalidadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCalidadProducto.add(jButtonnombreCalidadProductoBusqueda, this.gridBagConstraintsCalidadProducto);
	}

	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCalidadProducto.gridy = 0;
	this.gridBagConstraintsCalidadProducto.gridx = 1;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCalidadProducto.add(jscrollPanenombreCalidadProducto, this.gridBagConstraintsCalidadProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalidadProducto.gridy = iYPanelCamposCalidadProducto;
	this.gridBagConstraintsCalidadProducto.gridx = iXPanelCamposCalidadProducto++;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalidadProducto.add(this.jPanelidCalidadProducto, this.gridBagConstraintsCalidadProducto);



	if(iXPanelCamposCalidadProducto % 1==0) {
		iXPanelCamposCalidadProducto=0;
		iYPanelCamposCalidadProducto++;
	}
	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalidadProducto.gridy = iYPanelCamposCalidadProducto;
	this.gridBagConstraintsCalidadProducto.gridx = iXPanelCamposCalidadProducto++;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalidadProducto.add(this.jPanelcodigoCalidadProducto, this.gridBagConstraintsCalidadProducto);



	if(iXPanelCamposCalidadProducto % 1==0) {
		iXPanelCamposCalidadProducto=0;
		iYPanelCamposCalidadProducto++;
	}
	this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCalidadProducto.gridy = iYPanelCamposCalidadProducto;
	this.gridBagConstraintsCalidadProducto.gridx = iXPanelCamposCalidadProducto++;
	this.gridBagConstraintsCalidadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCalidadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCalidadProducto.add(this.jPanelnombreCalidadProducto, this.gridBagConstraintsCalidadProducto);



	if(iXPanelCamposCalidadProducto % 1==0) {
		iXPanelCamposCalidadProducto=0;
		iYPanelCamposCalidadProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesCalidadProducto= new GridBagLayout();
		this.jPanelAccionesCalidadProducto.setLayout(gridaBagLayoutAccionesCalidadProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCalidadProducto= new GridBagLayout();
		this.jPanelAccionesFormularioCalidadProducto.setLayout(gridaBagLayoutAccionesFormularioCalidadProducto);
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCalidadProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCalidadProducto.add(this.jComboBoxTiposAccionesFormularioCalidadProducto, this.gridBagConstraintsCalidadProducto);

		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCalidadProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCalidadProducto.add(this.jCheckBoxPostAccionNuevoCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCalidadProducto.add(this.jCheckBoxPostAccionSinCerrarCalidadProducto, this.gridBagConstraintsCalidadProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.calidadproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.calidadproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCalidadProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCalidadProducto.add(this.jCheckBoxPostAccionSinMensajeCalidadProducto, this.gridBagConstraintsCalidadProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = 0;
		this.gridBagConstraintsCalidadProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesCalidadProducto.add(this.jButtonModificarCalidadProducto, this.gridBagConstraintsCalidadProducto);							

		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCalidadProducto.gridy = 0;
		this.gridBagConstraintsCalidadProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesCalidadProducto.add(this.jButtonEliminarCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
			
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = 0;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCalidadProducto.add(this.jButtonActualizarCalidadProducto, this.gridBagConstraintsCalidadProducto);


		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = 0;		
		this.gridBagConstraintsCalidadProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesCalidadProducto.add(this.jButtonGuardarCambiosCalidadProducto, this.gridBagConstraintsCalidadProducto);	
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = 0;		
		this.gridBagConstraintsCalidadProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesCalidadProducto.add(this.jButtonCancelarCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCalidadProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCalidadProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.calidadproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();						
			this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCalidadProducto.gridx = 0;		
			//this.gridBagConstraintsCalidadProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCalidadProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCalidadProducto.gridx =0;
		this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCalidadProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCalidadProducto, this.gridBagConstraintsCalidadProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CalidadProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCalidadProducto = new CalidadProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Calidad Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Calidad Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Calidad Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CalidadProductoModel calidadproductoModel=new CalidadProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//CalidadProductoModel.CalidadProductoFocusTraversalPolicy calidadproductoFocusTraversalPolicy = calidadproductoModel.new CalidadProductoFocusTraversalPolicy(this);
			
			//calidadproductoFocusTraversalPolicy.setcalidadproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(calidadproductoModel);
			
			
			this.jContentPaneDetalleCalidadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCalidadProducto = new GridBagLayout();	
			this.jContentPaneDetalleCalidadProducto.setLayout(gridaBagLayoutDetalleCalidadProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCalidadProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
				this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCalidadProducto.gridx = 0;
					
				
				this.jContentPaneDetalleCalidadProducto.add(jTtoolBarDetalleCalidadProducto, gridBagConstraintsCalidadProducto);								
				
}
			
			this.jScrollPanelDatosEdicionCalidadProducto=   new JScrollPane(jContentPaneDetalleCalidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCalidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCalidadProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCalidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCalidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCalidadProducto.gridx = 0;
	        
			this.jContentPaneDetalleCalidadProducto.add(jPanelCamposCalidadProducto, gridBagConstraintsCalidadProducto);
			
			
			
			
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
						&& calidadproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBodega(this.puedeCargarPorParteBodega,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(this.puedeCargarPorParteParametroInventarioDefecto,false,-1);
					
					if(this.calidadproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCalidadProducto= new GridBagConstraints();
						this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCalidadProducto.gridx = 0;
						this.jContentPaneDetalleCalidadProducto.add(this.jTabbedPaneRelacionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCalidadProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBodega(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroInventarioDefecto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCalidadProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
					this.gridBagConstraintsCalidadProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCalidadProducto.gridx = 0;
					
				
					this.jContentPaneDetalleCalidadProducto.add(jPanelCamposOcultosCalidadProducto, gridBagConstraintsCalidadProducto);
				
					this.jPanelCamposOcultosCalidadProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsCalidadProducto.gridx = 0;
	        this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCalidadProducto.add(this.jPanelAccionesFormularioCalidadProducto, this.gridBagConstraintsCalidadProducto);							
			
			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
	        this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsCalidadProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleCalidadProducto.add(this.jPanelAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCalidadProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCalidadProducto=   new JScrollPane(this.jPanelCamposCalidadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCalidadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalidadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCalidadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCalidadProducto.gridx = 0;
			this.gridBagConstraintsCalidadProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCalidadProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCalidadProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCalidadProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCalidadProducto, this.gridBagConstraintsCalidadProducto);			
			
			this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
			this.gridBagConstraintsCalidadProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCalidadProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCalidadProducto, this.gridBagConstraintsCalidadProducto);
			
			
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCalidadProducto, this.gridBagConstraintsCalidadProducto);
		
			
		this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
		this.gridBagConstraintsCalidadProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCalidadProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCalidadProducto, this.gridBagConstraintsCalidadProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCalidadProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionCalidadProducto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBodega(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.bodegaSessionBean=new BodegaSessionBean();
		this.bodegaSessionBean.setConGuardarRelaciones(false);
		this.bodegaSessionBean.setEsGuardarRelacionado(true);

		this.bodegaBeanSwingJInternalFrame=null;//new BodegaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.bodegaBeanSwingJInternalFramePopup=new BodegaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.bodegaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.bodegaSessionBean.getEsGuardarRelacionado()) {

				BodegaJInternalFrame.STIPO_TAMANIO_GENERAL=CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				BodegaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.bodegaSessionBean.setEsGuardarRelacionado(true);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.bodegaBeanSwingJInternalFrame.setbodegaSessionBean(this.bodegaSessionBean);

				//this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
				//this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCalidadProducto.gridx = 0;
				//this.jContentPaneDetalleCalidadProducto.add(this.bodegaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCalidadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCalidadProducto.add("Bodegas",this.bodegaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCalidadProducto.setComponentAt(iIndexTab,this.bodegaBeanSwingJInternalFrame.getContentPane());
				}

				//BodegaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.bodegaSessionBean.setEsGuardarRelacionado(false);
				this.bodegaBeanSwingJInternalFrame=null;//new BodegaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.bodegaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBodega) {
					this.jTabbedPaneRelacionesCalidadProducto.add("Bodegas",new JPanel());
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

				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroInventarioDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CalidadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametroinventariodefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametroinventariodefectoBeanSwingJInternalFrame.setparametroinventariodefectoSessionBean(this.parametroinventariodefectoSessionBean);

				//this.gridBagConstraintsCalidadProducto = new GridBagConstraints();
				//this.gridBagConstraintsCalidadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCalidadProducto.gridx = 0;
				//this.jContentPaneDetalleCalidadProducto.add(this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCalidadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCalidadProducto.add("Parametro Inventario Defectos",this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCalidadProducto.setComponentAt(iIndexTab,this.parametroinventariodefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroInventarioDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametroinventariodefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametroinventariodefectoBeanSwingJInternalFrame=null;//new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametroinventariodefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroInventarioDefecto) {
					this.jTabbedPaneRelacionesCalidadProducto.add("Parametro Inventario Defectos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBodegaBeanSwingJInternalFrame(List<CalidadProducto> calidadproductos,CalidadProducto calidadproducto,BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.calidadproductoLogic.getConnexion());

					bodegaBeanSwingJInternalFrame.setcalidadproductosForeignKey(calidadproductos);
					bodegaBeanSwingJInternalFrame.setcalidadproductoForeignKey(calidadproducto);
					bodegaBeanSwingJInternalFrame.bodegaSessionBean.setisBusquedaDesdeForeignKeySesionCalidadProducto(true);
					bodegaBeanSwingJInternalFrame.bodegaSessionBean.setlidCalidadProductoActual(calidadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					bodegaBeanSwingJInternalFrame.cargarCombosForeignKeyBodega(bodegaBeanSwingJInternalFrame.isCargarCombosDependencia);
					bodegaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCalidadProducto(true);
					bodegaBeanSwingJInternalFrame.setid_calidad_productoFK_IdCalidadProducto(calidadproducto.getId());

					if(!this.conCargarFormDetalle) {
						bodegaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					bodegaBeanSwingJInternalFrame.setSelectedItemCombosFrameCalidadProductoForeignKey(calidadproducto,1,false,true,true);
					bodegaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					bodegaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCalidadProducto");
					bodegaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCalidadProducto");
					bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega(true);
					bodegaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBodega("n",bodegaBeanSwingJInternalFrame.isGuardarCambiosEnLote, bodegaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					bodegaBeanSwingJInternalFrame.setAutoscrolls(true);
					bodegaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						bodegaBeanSwingJInternalFrame.actualizarEstadoPanelsBodega("relacionado");
					} else {
						bodegaBeanSwingJInternalFrame.actualizarEstadoPanelsBodega("no_relacionado");
					}

					bodegaBeanSwingJInternalFrame.getjButtonRecargarInformacionBodega().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroInventarioDefectoBeanSwingJInternalFrame(List<CalidadProducto> calidadproductos,CalidadProducto calidadproducto,ParametroInventarioDefectoBeanSwingJInternalFrame parametroinventariodefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametroinventariodefectoBeanSwingJInternalFrame=new ParametroInventarioDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametroinventariodefectoBeanSwingJInternalFrame.getParametroInventarioDefectoLogic().setConnexion(this.calidadproductoLogic.getConnexion());

					parametroinventariodefectoBeanSwingJInternalFrame.setcalidadproductosForeignKey(calidadproductos);
					parametroinventariodefectoBeanSwingJInternalFrame.setcalidadproductoForeignKey(calidadproducto);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setisBusquedaDesdeForeignKeySesionCalidadProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.parametroinventariodefectoSessionBean.setlidCalidadProductoActual(calidadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametroinventariodefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroInventarioDefecto(parametroinventariodefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametroinventariodefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCalidadProducto(true);
					parametroinventariodefectoBeanSwingJInternalFrame.setid_calidad_productoFK_IdCalidadProducto(calidadproducto.getId());

					if(!this.conCargarFormDetalle) {
						parametroinventariodefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametroinventariodefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameCalidadProductoForeignKey(calidadproducto,1,false,true,true);
					parametroinventariodefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametroinventariodefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCalidadProducto");
					parametroinventariodefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCalidadProducto");
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
