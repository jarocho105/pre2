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
import com.bydan.erp.inventario.util.DetalleSerieProductoConstantesFunciones;

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
public class DetalleSerieProductoDetalleFormJInternalFrame extends DetalleSerieProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleSerieProducto;
	
	protected JMenuBar jmenuBarDetalleDetalleSerieProducto;
	
	protected JMenu jmenuDetalleDetalleSerieProducto;
	protected JMenu jmenuDetalleArchivoDetalleSerieProducto;
	protected JMenu jmenuDetalleAccionesDetalleSerieProducto;
	protected JMenu jmenuDetalleDatosDetalleSerieProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleSerieProducto;	
	protected GridBagConstraints gridBagConstraintsDetalleSerieProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleSerieProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleSerieProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SerieProductoBeanSwingJInternalFrame serieproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_serieproducto="";
	
	public DetalleSerieProductoSessionBean detalleserieproductoSessionBean;
	
	
	
	
	public SerieProductoSessionBean serieproductoSessionBean;	
	
	public DetalleSerieProductoLogic detalleserieproductoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleSerieProducto;
	public JScrollPane jScrollPanelDatosEdicionDetalleSerieProducto;
	public JScrollPane jScrollPanelDatosGeneralDetalleSerieProducto;
	
	protected JPanel jPanelCamposDetalleSerieProducto;    
	protected JPanel jPanelCamposOcultosDetalleSerieProducto;    	
	protected JPanel jPanelAccionesDetalleSerieProducto;
	protected JPanel jPanelAccionesFormularioDetalleSerieProducto;
    
	
	
	protected Integer iXPanelCamposDetalleSerieProducto=0;
	protected Integer iYPanelCamposDetalleSerieProducto=0;
	
	protected Integer iXPanelCamposOcultosDetalleSerieProducto=0;
	protected Integer iYPanelCamposOcultosDetalleSerieProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleSerieProducto;
	public JButton jButtonModificarDetalleSerieProducto;
	public JButton jButtonActualizarDetalleSerieProducto;
    public JButton jButtonEliminarDetalleSerieProducto;
	public JButton jButtonCancelarDetalleSerieProducto;
    public JButton jButtonGuardarCambiosDetalleSerieProducto;
	public JButton jButtonGuardarCambiosTablaDetalleSerieProducto;
	protected JButton jButtonCerrarDetalleSerieProducto;
	
	
	protected JButton jButtonProcesarInformacionDetalleSerieProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleSerieProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleSerieProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleSerieProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleSerieProducto;
	protected JButton jButtonModificarToolBarDetalleSerieProducto;
	protected JButton jButtonActualizarToolBarDetalleSerieProducto;
    protected JButton jButtonEliminarToolBarDetalleSerieProducto;
	protected JButton jButtonCancelarToolBarDetalleSerieProducto;
    protected JButton jButtonGuardarCambiosToolBarDetalleSerieProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleSerieProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleSerieProducto;
	protected JButton jButtonCerrarToolBarDetalleSerieProducto;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleSerieProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleSerieProducto;
	protected JMenuItem jMenuItemModificarDetalleSerieProducto;
	protected JMenuItem jMenuItemActualizarDetalleSerieProducto;
    protected JMenuItem jMenuItemEliminarDetalleSerieProducto;
	protected JMenuItem jMenuItemCancelarDetalleSerieProducto;
    protected JMenuItem jMenuItemGuardarCambiosDetalleSerieProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleSerieProducto;
	protected JMenuItem jMenuItemCerrarDetalleSerieProducto;
	protected JMenuItem jMenuItemDetalleCerrarDetalleSerieProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleSerieProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleSerieProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleSerieProducto;
	protected JMenuItem jMenuItemMostrarOcultarDetalleSerieProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleSerieProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleSerieProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleSerieProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleSerieProducto;
	public JLabel jLabelIdDetalleSerieProducto;
	public JLabel jLabelidDetalleSerieProducto;
	public JButton jButtonidDetalleSerieProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleSerieProducto;
	public JLabel jLabelnombreDetalleSerieProducto;
	public JTextArea jTextAreanombreDetalleSerieProducto;
	public JScrollPane jscrollPanenombreDetalleSerieProducto;
	public JButton jButtonnombreDetalleSerieProductoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleSerieProducto;
	public JLabel jLabeldescripcionDetalleSerieProducto;
	public JTextArea jTextAreadescripcionDetalleSerieProducto;
	public JScrollPane jscrollPanedescripcionDetalleSerieProducto;
	public JButton jButtondescripcionDetalleSerieProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_serie_productoDetalleSerieProducto;
	public JLabel jLabelid_serie_productoDetalleSerieProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_serie_productoDetalleSerieProducto;
	public JButton jButtonid_serie_productoDetalleSerieProducto= new JButtonMe();
	public JButton jButtonid_serie_productoDetalleSerieProductoUpdate= new JButtonMe();
	public JButton jButtonid_serie_productoDetalleSerieProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleSerieProducto;
	
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
	
	public DetalleSerieProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleSerieProducto=new JPanel();
				this.jPanelAccionesFormularioDetalleSerieProducto=new JPanel();
				this.jmenuBarDetalleDetalleSerieProducto=new JMenuBar();
				this.jTtoolBarDetalleDetalleSerieProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleSerieProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleSerieProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleSerieProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleSerieProducto() {
		return this.jButtonActualizarToolBarDetalleSerieProducto;
	}
	
	public JButton getjButtonEliminarToolBarDetalleSerieProducto() {
		return this.jButtonEliminarToolBarDetalleSerieProducto;
	}
	
	public JButton getjButtonCancelarToolBarDetalleSerieProducto() {
		return this.jButtonCancelarToolBarDetalleSerieProducto;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleSerieProducto() {
		return this.jButtonProcesarInformacionDetalleSerieProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleSerieProducto)	{
		this.jButtonProcesarInformacionDetalleSerieProducto = jButtonProcesarInformacionDetalleSerieProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleSerieProducto() {
		return this.jComboBoxTiposAccionesDetalleSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleSerieProducto(
			JComboBox jComboBoxTiposRelacionesDetalleSerieProducto) {
		this.jComboBoxTiposRelacionesDetalleSerieProducto = jComboBoxTiposRelacionesDetalleSerieProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleSerieProducto(
			JComboBox jComboBoxTiposAccionesDetalleSerieProducto) {
		this.jComboBoxTiposAccionesDetalleSerieProducto = jComboBoxTiposAccionesDetalleSerieProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleSerieProducto() {
		return this.jComboBoxTiposAccionesFormularioDetalleSerieProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleSerieProducto(
			JComboBox jComboBoxTiposAccionesFormularioDetalleSerieProducto) {
		this.jComboBoxTiposAccionesFormularioDetalleSerieProducto = jComboBoxTiposAccionesFormularioDetalleSerieProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleserieproductoSessionBean=new DetalleSerieProductoSessionBean();
		
		this.detalleserieproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleserieproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleserieproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleSerieProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleSerieProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Serie Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleSerieProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleSerieProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleSerieProducto=new JButtonMe();
				this.jButtonModificarToolBarDetalleSerieProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleSerieProducto,this.jTtoolBarDetalleDetalleSerieProducto,
							"actualizar","actualizar","Actualizar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleSerieProducto,this.jTtoolBarDetalleDetalleSerieProducto,
							"eliminar","eliminar","Eliminar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleSerieProducto,this.jTtoolBarDetalleDetalleSerieProducto,
							"cancelar","cancelar","Cancelar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleSerieProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleSerieProducto,this.jTtoolBarDetalleDetalleSerieProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleSerieProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleSerieProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleSerieProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleSerieProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleSerieProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleSerieProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleSerieProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleSerieProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleSerieProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleSerieProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleSerieProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleSerieProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleSerieProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleSerieProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleSerieProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleSerieProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleSerieProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleSerieProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleSerieProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleSerieProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleSerieProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleSerieProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleSerieProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleSerieProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleSerieProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleSerieProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleSerieProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleSerieProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleSerieProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleSerieProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleSerieProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleSerieProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleSerieProducto.add(this.jMenuItemDetalleCerrarDetalleSerieProducto);
		
		this.jmenuDetalleAccionesDetalleSerieProducto.add(this.jMenuItemActualizarDetalleSerieProducto);
		this.jmenuDetalleAccionesDetalleSerieProducto.add(this.jMenuItemEliminarDetalleSerieProducto);
		this.jmenuDetalleAccionesDetalleSerieProducto.add(this.jMenuItemCancelarDetalleSerieProducto);		
		
		//this.jmenuDetalleDatosDetalleSerieProducto.add(this.jMenuItemDetalleAbrirOrderByDetalleSerieProducto);				
		this.jmenuDetalleDatosDetalleSerieProducto.add(this.jMenuItemDetalleMostarOcultarDetalleSerieProducto);				
				
		//this.jmenuDetalleAccionesDetalleSerieProducto.add(this.jMenuItemGuardarCambiosDetalleSerieProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleSerieProducto.add(this.jmenuDetalleArchivoDetalleSerieProducto);		
		this.jmenuBarDetalleDetalleSerieProducto.add(this.jmenuDetalleAccionesDetalleSerieProducto);		
		this.jmenuBarDetalleDetalleSerieProducto.add(this.jmenuDetalleDatosDetalleSerieProducto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleSerieProducto);				
	}
	
	
	public void inicializarElementosCamposDetalleSerieProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleSerieProducto = new JLabelMe();
		jLabelIdDetalleSerieProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleSerieProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleSerieProducto.setToolTipText(DetalleSerieProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleSerieProducto= new GridBagLayout();

		this.jPanelidDetalleSerieProducto.setLayout(this.gridaBagLayoutDetalleSerieProducto);

		jLabelidDetalleSerieProducto = new JLabel();
		jLabelidDetalleSerieProducto.setText("Id");

		jLabelidDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDetalleSerieProducto = new JLabelMe();
		this.jLabelnombreDetalleSerieProducto.setText(""+DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetalleSerieProducto.setToolTipText("Nombre");
		this.jLabelnombreDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleSerieProducto.setToolTipText(DetalleSerieProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleSerieProducto = new GridBagLayout();
		this.jPanelnombreDetalleSerieProducto.setLayout(this.gridaBagLayoutDetalleSerieProducto);


		jTextAreanombreDetalleSerieProducto= new JTextAreaMe();
		jTextAreanombreDetalleSerieProducto.setEnabled(false);
		jTextAreanombreDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleSerieProducto.setLineWrap(true);
		jTextAreanombreDetalleSerieProducto.setWrapStyleWord(true);
		jTextAreanombreDetalleSerieProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDetalleSerieProducto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDetalleSerieProducto = new JScrollPane(jTextAreanombreDetalleSerieProducto);
		jscrollPanenombreDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDetalleSerieProductoBusqueda= new JButtonMe();
		this.jButtonnombreDetalleSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleSerieProductoBusqueda.setText("U");
		this.jButtonnombreDetalleSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleSerieProductoBusqueda"));

		if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleSerieProductoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleSerieProducto = new JLabelMe();
		this.jLabeldescripcionDetalleSerieProducto.setText(""+DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleSerieProducto.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleSerieProducto.setToolTipText(DetalleSerieProductoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleSerieProducto = new GridBagLayout();
		this.jPaneldescripcionDetalleSerieProducto.setLayout(this.gridaBagLayoutDetalleSerieProducto);


		jTextAreadescripcionDetalleSerieProducto= new JTextAreaMe();
		jTextAreadescripcionDetalleSerieProducto.setEnabled(false);
		jTextAreadescripcionDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleSerieProducto.setLineWrap(true);
		jTextAreadescripcionDetalleSerieProducto.setWrapStyleWord(true);
		jTextAreadescripcionDetalleSerieProducto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleSerieProducto.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleSerieProducto = new JScrollPane(jTextAreadescripcionDetalleSerieProducto);
		jscrollPanedescripcionDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDetalleSerieProductoBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleSerieProductoBusqueda.setText("U");
		this.jButtondescripcionDetalleSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleSerieProductoBusqueda"));

		if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleSerieProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleSerieProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_serie_productoDetalleSerieProducto = new JLabelMe();
		this.jLabelid_serie_productoDetalleSerieProducto.setText(""+DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO+" : *");
		this.jLabelid_serie_productoDetalleSerieProducto.setToolTipText("Serie Producto");
		this.jLabelid_serie_productoDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_serie_productoDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_serie_productoDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_serie_productoDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_serie_productoDetalleSerieProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_serie_productoDetalleSerieProducto.setToolTipText(DetalleSerieProductoConstantesFunciones.LABEL_IDSERIEPRODUCTO);
		this.gridaBagLayoutDetalleSerieProducto = new GridBagLayout();
		this.jPanelid_serie_productoDetalleSerieProducto.setLayout(this.gridaBagLayoutDetalleSerieProducto);


		jComboBoxid_serie_productoDetalleSerieProducto= new JComboBoxMe();
		jComboBoxid_serie_productoDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_serie_productoDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_serie_productoDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_serie_productoDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_serie_productoDetalleSerieProducto= new JButtonMe();
		this.jButtonid_serie_productoDetalleSerieProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_serie_productoDetalleSerieProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_serie_productoDetalleSerieProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_serie_productoDetalleSerieProducto.setText("Buscar");
		this.jButtonid_serie_productoDetalleSerieProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_serie_productoDetalleSerieProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_serie_productoDetalleSerieProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_serie_productoDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_serie_productoDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_serie_productoDetalleSerieProducto"));

		this.jButtonid_serie_productoDetalleSerieProductoBusqueda= new JButtonMe();
		this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setText("U");
		this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_serie_productoDetalleSerieProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_serie_productoDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_serie_productoDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_serie_productoDetalleSerieProductoBusqueda"));

		if(this.detalleserieproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_serie_productoDetalleSerieProductoBusqueda.setVisible(false);		}

		this.jButtonid_serie_productoDetalleSerieProductoUpdate= new JButtonMe();
		this.jButtonid_serie_productoDetalleSerieProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_serie_productoDetalleSerieProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_serie_productoDetalleSerieProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_serie_productoDetalleSerieProductoUpdate.setText("U");
		this.jButtonid_serie_productoDetalleSerieProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_serie_productoDetalleSerieProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_serie_productoDetalleSerieProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_serie_productoDetalleSerieProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_serie_productoDetalleSerieProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_serie_productoDetalleSerieProductoUpdate"));



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
		//this.jInternalFrameDetalleDetalleSerieProducto = new DetalleSerieProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Serie Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleSerieProducto= new GridBagLayout();
		

		
		String sToolTipDetalleSerieProducto="";
		sToolTipDetalleSerieProducto=DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleSerieProducto+="(Inventario.DetalleSerieProducto)";
		}
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleSerieProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleSerieProducto = new JButtonMe();
		this.jButtonModificarDetalleSerieProducto = new JButtonMe();
        this.jButtonActualizarDetalleSerieProducto = new JButtonMe();
        this.jButtonEliminarDetalleSerieProducto = new JButtonMe();
        this.jButtonCancelarDetalleSerieProducto = new JButtonMe();
        this.jButtonGuardarCambiosDetalleSerieProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleSerieProducto = new JButtonMe();
		this.jButtonCerrarDetalleSerieProducto = new JButtonMe();
		
		this.jScrollPanelDatosDetalleSerieProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleSerieProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleSerieProducto = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Serie Producto";
		
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Serie Productos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleSerieProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleSerieProducto.setName("jPanelCamposDetalleSerieProducto"); 

		this.jPanelCamposOcultosDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleSerieProducto.setName("jPanelCamposOcultosDetalleSerieProducto"); 

        this.jPanelAccionesDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleSerieProducto.setToolTipText("Acciones");
        this.jPanelAccionesDetalleSerieProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleSerieProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleSerieProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleSerieProducto.setText("Nuevo");
		this.jButtonModificarDetalleSerieProducto.setText("Editar");
        this.jButtonActualizarDetalleSerieProducto.setText("Actualizar");
        this.jButtonEliminarDetalleSerieProducto.setText("Eliminar");
        this.jButtonCancelarDetalleSerieProducto.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleSerieProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.setText("Guardar");
		this.jButtonCerrarDetalleSerieProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleSerieProducto,"nuevo_button","Nuevo",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleSerieProducto,"modificar_button","Editar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleSerieProducto,"actualizar_button","Actualizar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleSerieProducto,"eliminar_button","Eliminar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleSerieProducto,"cancelar_button","Cancelar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleSerieProducto,"guardarcambios_button","Guardar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleSerieProducto,"guardarcambiostabla_button","Guardar",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleSerieProducto,"cerrar_button","Salir",this.detalleserieproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleSerieProducto.setToolTipText("Nuevo"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleSerieProducto.setToolTipText("Editar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleSerieProducto.setToolTipText("Actualizar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleSerieProducto.setToolTipText("Eliminar)"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleSerieProducto.setToolTipText("Cancelar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleSerieProducto.setToolTipText("Guardar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.setToolTipText("Guardar"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleSerieProducto.setToolTipText("Salir"+" "+DetalleSerieProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleSerieProducto";
		inputMap = this.jButtonNuevoDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleSerieProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleSerieProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleSerieProducto";
		inputMap = this.jButtonActualizarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleSerieProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleSerieProducto";
		inputMap = this.jButtonEliminarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleSerieProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleSerieProducto";
		inputMap = this.jButtonCancelarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleSerieProducto"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleSerieProducto";
		inputMap = this.jButtonCerrarDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleSerieProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleSerieProducto";
		inputMap = this.jButtonGuardarCambiosTablaDetalleSerieProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleSerieProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleSerieProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleSerieProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleSerieProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleSerieProducto.setToolTipText("Nuevo DetalleSerieProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleSerieProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleSerieProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleSerieProducto.setToolTipText("Sin Cerrar Ventana DetalleSerieProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleSerieProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleSerieProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleSerieProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleSerieProducto.setText("Accion");
		this.jComboBoxTiposAccionesDetalleSerieProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleSerieProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleSerieProducto = new JLabelMe();
		
		this.jLabelAccionesDetalleSerieProducto.setText("Acciones");		
		this.jLabelAccionesDetalleSerieProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleSerieProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleSerieProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleSerieProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleSerieProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleSerieProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleSerieProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleSerieProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleSerieProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleSerieProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleSerieProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleSerieProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleSerieProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleSerieProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleSerieProducto = new GridBagLayout();
		
		this.jPanelCamposDetalleSerieProducto.setLayout(gridaBagLayoutCamposDetalleSerieProducto);
		this.jPanelCamposOcultosDetalleSerieProducto.setLayout(gridaBagLayoutCamposOcultosDetalleSerieProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleSerieProducto.add(jLabelIdDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 1;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleSerieProducto.add(jLabelidDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);


	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_serie_productoDetalleSerieProducto.add(jLabelid_serie_productoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx = 2;
		this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
		this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_serie_productoDetalleSerieProducto.add(jButtonid_serie_productoDetalleSerieProductoBusqueda, this.gridBagConstraintsDetalleSerieProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx = 3;
		this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
		this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_serie_productoDetalleSerieProducto.add(jButtonid_serie_productoDetalleSerieProductoUpdate, this.gridBagConstraintsDetalleSerieProducto);
	}

	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 1;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_serie_productoDetalleSerieProducto.add(jComboBoxid_serie_productoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);


	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleSerieProducto.add(jLabelnombreDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx = 2;
		this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
		this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleSerieProducto.add(jButtonnombreDetalleSerieProductoBusqueda, this.gridBagConstraintsDetalleSerieProducto);
	}

	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 1;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleSerieProducto.add(jscrollPanenombreDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);


	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleSerieProducto.add(jLabeldescripcionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		//this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx = 2;
		this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
		this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleSerieProducto.add(jButtondescripcionDetalleSerieProductoBusqueda, this.gridBagConstraintsDetalleSerieProducto);
	}

	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
	this.gridBagConstraintsDetalleSerieProducto.gridx = 1;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleSerieProducto.add(jscrollPanedescripcionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleSerieProducto.gridy = iYPanelCamposDetalleSerieProducto;
	this.gridBagConstraintsDetalleSerieProducto.gridx = iXPanelCamposDetalleSerieProducto++;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleSerieProducto.add(this.jPanelidDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(iXPanelCamposDetalleSerieProducto % 1==0) {
		iXPanelCamposDetalleSerieProducto=0;
		iYPanelCamposDetalleSerieProducto++;
	}
	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleSerieProducto.gridy = iYPanelCamposDetalleSerieProducto;
	this.gridBagConstraintsDetalleSerieProducto.gridx = iXPanelCamposDetalleSerieProducto++;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleSerieProducto.add(this.jPanelid_serie_productoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(iXPanelCamposDetalleSerieProducto % 1==0) {
		iXPanelCamposDetalleSerieProducto=0;
		iYPanelCamposDetalleSerieProducto++;
	}
	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleSerieProducto.gridy = iYPanelCamposDetalleSerieProducto;
	this.gridBagConstraintsDetalleSerieProducto.gridx = iXPanelCamposDetalleSerieProducto++;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleSerieProducto.add(this.jPanelnombreDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(iXPanelCamposDetalleSerieProducto % 1==0) {
		iXPanelCamposDetalleSerieProducto=0;
		iYPanelCamposDetalleSerieProducto++;
	}
	this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleSerieProducto.gridy = iYPanelCamposDetalleSerieProducto;
	this.gridBagConstraintsDetalleSerieProducto.gridx = iXPanelCamposDetalleSerieProducto++;
	this.gridBagConstraintsDetalleSerieProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleSerieProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleSerieProducto.add(this.jPaneldescripcionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);



	if(iXPanelCamposDetalleSerieProducto % 1==0) {
		iXPanelCamposDetalleSerieProducto=0;
		iYPanelCamposDetalleSerieProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleSerieProducto= new GridBagLayout();
		this.jPanelAccionesDetalleSerieProducto.setLayout(gridaBagLayoutAccionesDetalleSerieProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleSerieProducto= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleSerieProducto.setLayout(gridaBagLayoutAccionesFormularioDetalleSerieProducto);
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleSerieProducto.add(this.jComboBoxTiposAccionesFormularioDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleSerieProducto.add(this.jCheckBoxPostAccionNuevoDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleSerieProducto.add(this.jCheckBoxPostAccionSinCerrarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleserieproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleserieproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleSerieProducto.add(this.jCheckBoxPostAccionSinMensajeDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleSerieProducto.add(this.jButtonModificarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);							

		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;
		this.gridBagConstraintsDetalleSerieProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleSerieProducto.add(this.jButtonEliminarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
			
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleSerieProducto.add(this.jButtonActualizarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);


		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleSerieProducto.add(this.jButtonGuardarCambiosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);	
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = 0;		
		this.gridBagConstraintsDetalleSerieProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleSerieProducto.add(this.jButtonCancelarDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleSerieProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleSerieProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleserieproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();						
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;		
			//this.gridBagConstraintsDetalleSerieProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleSerieProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleSerieProducto.gridx =0;
		this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleSerieProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleSerieProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleSerieProducto = new DetalleSerieProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Serie Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Serie Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Serie Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleSerieProductoModel detalleserieproductoModel=new DetalleSerieProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleSerieProductoModel.DetalleSerieProductoFocusTraversalPolicy detalleserieproductoFocusTraversalPolicy = detalleserieproductoModel.new DetalleSerieProductoFocusTraversalPolicy(this);
			
			//detalleserieproductoFocusTraversalPolicy.setdetalleserieproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleserieproductoModel);
			
			
			this.jContentPaneDetalleDetalleSerieProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleSerieProducto = new GridBagLayout();	
			this.jContentPaneDetalleDetalleSerieProducto.setLayout(gridaBagLayoutDetalleDetalleSerieProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleSerieProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
				this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleSerieProducto.add(jTtoolBarDetalleDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleSerieProducto=   new JScrollPane(jContentPaneDetalleDetalleSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleSerieProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	        
			this.jContentPaneDetalleDetalleSerieProducto.add(jPanelCamposDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);
			
			
			
			
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
						&& detalleserieproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleserieproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleSerieProducto= new GridBagConstraints();
						this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
						this.jContentPaneDetalleDetalleSerieProducto.add(this.jTabbedPaneRelacionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleSerieProducto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleSerieProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
					this.gridBagConstraintsDetalleSerieProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleSerieProducto.add(jPanelCamposOcultosDetalleSerieProducto, gridBagConstraintsDetalleSerieProducto);
				
					this.jPanelCamposOcultosDetalleSerieProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	        this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleSerieProducto.add(this.jPanelAccionesFormularioDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);							
			
			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
	        this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleSerieProducto.add(this.jPanelAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleSerieProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleSerieProducto=   new JScrollPane(this.jPanelCamposDetalleSerieProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleSerieProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleSerieProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleSerieProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
			this.gridBagConstraintsDetalleSerieProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleSerieProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleSerieProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);			
			
			this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
			this.gridBagConstraintsDetalleSerieProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
			
			
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		
			
		this.gridBagConstraintsDetalleSerieProducto = new GridBagConstraints();
		this.gridBagConstraintsDetalleSerieProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleSerieProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleSerieProducto, this.gridBagConstraintsDetalleSerieProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleSerieProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleSerieProducto;
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
