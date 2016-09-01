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
import com.bydan.erp.inventario.util.IngredienteConstantesFunciones;

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
public class IngredienteDetalleFormJInternalFrame extends IngredienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleIngrediente;
	
	protected JMenuBar jmenuBarDetalleIngrediente;
	
	protected JMenu jmenuDetalleIngrediente;
	protected JMenu jmenuDetalleArchivoIngrediente;
	protected JMenu jmenuDetalleAccionesIngrediente;
	protected JMenu jmenuDetalleDatosIngrediente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIngrediente;	
	protected GridBagConstraints gridBagConstraintsIngrediente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected IngredienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleIngrediente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected BodegaBeanSwingJInternalFrame bodegarelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegarelacion="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ProductoBeanSwingJInternalFrame productorelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_productorelacion="";
	
	public IngredienteSessionBean ingredienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public BodegaSessionBean bodegarelacionSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ProductoSessionBean productorelacionSessionBean;	
	
	public IngredienteLogic ingredienteLogic;
	
	public JScrollPane jScrollPanelDatosIngrediente;
	public JScrollPane jScrollPanelDatosEdicionIngrediente;
	public JScrollPane jScrollPanelDatosGeneralIngrediente;
	
	protected JPanel jPanelCamposIngrediente;    
	protected JPanel jPanelCamposOcultosIngrediente;    	
	protected JPanel jPanelAccionesIngrediente;
	protected JPanel jPanelAccionesFormularioIngrediente;
    
	
	
	protected Integer iXPanelCamposIngrediente=0;
	protected Integer iYPanelCamposIngrediente=0;
	
	protected Integer iXPanelCamposOcultosIngrediente=0;
	protected Integer iYPanelCamposOcultosIngrediente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoIngrediente;
	public JButton jButtonModificarIngrediente;
	public JButton jButtonActualizarIngrediente;
    public JButton jButtonEliminarIngrediente;
	public JButton jButtonCancelarIngrediente;
    public JButton jButtonGuardarCambiosIngrediente;
	public JButton jButtonGuardarCambiosTablaIngrediente;
	protected JButton jButtonCerrarIngrediente;
	
	
	protected JButton jButtonProcesarInformacionIngrediente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoIngrediente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarIngrediente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeIngrediente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIngrediente;
	protected JButton jButtonModificarToolBarIngrediente;
	protected JButton jButtonActualizarToolBarIngrediente;
    protected JButton jButtonEliminarToolBarIngrediente;
	protected JButton jButtonCancelarToolBarIngrediente;
    protected JButton jButtonGuardarCambiosToolBarIngrediente;
	protected JButton jButtonGuardarCambiosTablaToolBarIngrediente;
	protected JButton jButtonMostrarOcultarTablaToolBarIngrediente;
	protected JButton jButtonCerrarToolBarIngrediente;
	
	protected JButton jButtonProcesarInformacionToolBarIngrediente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIngrediente;
	protected JMenuItem jMenuItemModificarIngrediente;
	protected JMenuItem jMenuItemActualizarIngrediente;
    protected JMenuItem jMenuItemEliminarIngrediente;
	protected JMenuItem jMenuItemCancelarIngrediente;
    protected JMenuItem jMenuItemGuardarCambiosIngrediente;
	protected JMenuItem jMenuItemGuardarCambiosTablaIngrediente;
	protected JMenuItem jMenuItemCerrarIngrediente;
	protected JMenuItem jMenuItemDetalleCerrarIngrediente;
	protected JMenuItem jMenuItemDetalleMostarOcultarIngrediente;
	
	protected JMenuItem jMenuItemProcesarInformacionIngrediente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIngrediente;
	protected JMenuItem jMenuItemMostrarOcultarIngrediente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIngrediente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIngrediente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIngrediente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioIngrediente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidIngrediente;
	public JLabel jLabelIdIngrediente;
	public JLabel jLabelidIngrediente;
	public JButton jButtonidIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelcantidadIngrediente;
	public JLabel jLabelcantidadIngrediente;
	public JTextField jTextFieldcantidadIngrediente;
	public JButton jButtoncantidadIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelprecioIngrediente;
	public JLabel jLabelprecioIngrediente;
	public JTextField jTextFieldprecioIngrediente;
	public JButton jButtonprecioIngredienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaIngrediente;
	public JLabel jLabelid_empresaIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaIngrediente;
	public JButton jButtonid_empresaIngrediente= new JButtonMe();
	public JButton jButtonid_empresaIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalIngrediente;
	public JLabel jLabelid_sucursalIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalIngrediente;
	public JButton jButtonid_sucursalIngrediente= new JButtonMe();
	public JButton jButtonid_sucursalIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaIngrediente;
	public JLabel jLabelid_bodegaIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaIngrediente;
	public JButton jButtonid_bodegaIngrediente= new JButtonMe();
	public JButton jButtonid_bodegaIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_bodegaIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_relacionIngrediente;
	public JLabel jLabelid_bodega_relacionIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_relacionIngrediente;
	public JButton jButtonid_bodega_relacionIngrediente= new JButtonMe();
	public JButton jButtonid_bodega_relacionIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_bodega_relacionIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelid_productoIngrediente;
	public JLabel jLabelid_productoIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoIngrediente;
	public JButton jButtonid_productoIngrediente= new JButtonMe();
	public JButton jButtonid_productoIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_productoIngredienteBusqueda= new JButtonMe();

	public JPanel jPanelid_producto_relacionIngrediente;
	public JLabel jLabelid_producto_relacionIngrediente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_producto_relacionIngrediente;
	public JButton jButtonid_producto_relacionIngrediente= new JButtonMe();
	public JButton jButtonid_producto_relacionIngredienteUpdate= new JButtonMe();
	public JButton jButtonid_producto_relacionIngredienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesIngrediente;
	
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
	
	public IngredienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposIngrediente=new JPanel();
				this.jPanelAccionesFormularioIngrediente=new JPanel();
				this.jmenuBarDetalleIngrediente=new JMenuBar();
				this.jTtoolBarDetalleIngrediente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public IngredienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngredienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ingrediente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarIngrediente() {
		return this.jButtonActualizarToolBarIngrediente;
	}
	
	public JButton getjButtonEliminarToolBarIngrediente() {
		return this.jButtonEliminarToolBarIngrediente;
	}
	
	public JButton getjButtonCancelarToolBarIngrediente() {
		return this.jButtonCancelarToolBarIngrediente;
	}		
	
	public JButton getjButtonProcesarInformacionIngrediente() {
		return this.jButtonProcesarInformacionIngrediente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIngrediente)	{
		this.jButtonProcesarInformacionIngrediente = jButtonProcesarInformacionIngrediente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIngrediente() {
		return this.jComboBoxTiposAccionesIngrediente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIngrediente(
			JComboBox jComboBoxTiposRelacionesIngrediente) {
		this.jComboBoxTiposRelacionesIngrediente = jComboBoxTiposRelacionesIngrediente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIngrediente(
			JComboBox jComboBoxTiposAccionesIngrediente) {
		this.jComboBoxTiposAccionesIngrediente = jComboBoxTiposAccionesIngrediente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIngrediente() {
		return this.jComboBoxTiposAccionesFormularioIngrediente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIngrediente(
			JComboBox jComboBoxTiposAccionesFormularioIngrediente) {
		this.jComboBoxTiposAccionesFormularioIngrediente = jComboBoxTiposAccionesFormularioIngrediente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ingredienteSessionBean=new IngredienteSessionBean();
		
		this.ingredienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingredienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ingredienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IngredienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IngredienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ingrediente MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
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
	
		IngredienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleIngrediente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarIngrediente=new JButtonMe();
				this.jButtonModificarToolBarIngrediente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarIngrediente,this.jTtoolBarDetalleIngrediente,
							"actualizar","actualizar","Actualizar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarIngrediente,this.jTtoolBarDetalleIngrediente,
							"eliminar","eliminar","Eliminar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarIngrediente,this.jTtoolBarDetalleIngrediente,
							"cancelar","cancelar","Cancelar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarIngrediente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarIngrediente,this.jTtoolBarDetalleIngrediente,
							"guardarcambios","guardarcambios","Guardar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleIngrediente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleIngrediente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoIngrediente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesIngrediente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosIngrediente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIngrediente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIngrediente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIngrediente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarIngrediente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarIngrediente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarIngrediente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarIngrediente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarIngrediente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarIngrediente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarIngrediente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarIngrediente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarIngrediente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarIngrediente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarIngrediente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarIngrediente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosIngrediente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIngrediente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIngrediente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIngrediente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIngrediente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIngrediente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarIngrediente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarIngrediente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarIngrediente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIngrediente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIngrediente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIngrediente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIngrediente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIngrediente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIngrediente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoIngrediente.add(this.jMenuItemDetalleCerrarIngrediente);
		
		this.jmenuDetalleAccionesIngrediente.add(this.jMenuItemActualizarIngrediente);
		this.jmenuDetalleAccionesIngrediente.add(this.jMenuItemEliminarIngrediente);
		this.jmenuDetalleAccionesIngrediente.add(this.jMenuItemCancelarIngrediente);		
		
		//this.jmenuDetalleDatosIngrediente.add(this.jMenuItemDetalleAbrirOrderByIngrediente);				
		this.jmenuDetalleDatosIngrediente.add(this.jMenuItemDetalleMostarOcultarIngrediente);				
				
		//this.jmenuDetalleAccionesIngrediente.add(this.jMenuItemGuardarCambiosIngrediente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleIngrediente.add(this.jmenuDetalleArchivoIngrediente);		
		this.jmenuBarDetalleIngrediente.add(this.jmenuDetalleAccionesIngrediente);		
		this.jmenuBarDetalleIngrediente.add(this.jmenuDetalleDatosIngrediente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleIngrediente);				
	}
	
	
	public void inicializarElementosCamposIngrediente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdIngrediente = new JLabelMe();
		jLabelIdIngrediente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidIngrediente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutIngrediente= new GridBagLayout();

		this.jPanelidIngrediente.setLayout(this.gridaBagLayoutIngrediente);

		jLabelidIngrediente = new JLabel();
		jLabelidIngrediente.setText("Id");

		jLabelidIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadIngrediente = new JLabelMe();
		this.jLabelcantidadIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadIngrediente.setToolTipText("Cantidad");
		this.jLabelcantidadIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelcantidadIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jTextFieldcantidadIngrediente= new JTextFieldMe();
		jTextFieldcantidadIngrediente.setEnabled(false);
		jTextFieldcantidadIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadIngrediente.setText("0");

		this.jButtoncantidadIngredienteBusqueda= new JButtonMe();
		this.jButtoncantidadIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadIngredienteBusqueda.setText("U");
		this.jButtoncantidadIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadIngredienteBusqueda.setVisible(false);		}


					
		this.jLabelprecioIngrediente = new JLabelMe();
		this.jLabelprecioIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioIngrediente.setToolTipText("Precio");
		this.jLabelprecioIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelprecioIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jTextFieldprecioIngrediente= new JTextFieldMe();
		jTextFieldprecioIngrediente.setEnabled(false);
		jTextFieldprecioIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioIngrediente.setText("0.0");

		this.jButtonprecioIngredienteBusqueda= new JButtonMe();
		this.jButtonprecioIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioIngredienteBusqueda.setText("U");
		this.jButtonprecioIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioIngredienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysIngrediente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaIngrediente = new JLabelMe();
		this.jLabelid_empresaIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaIngrediente.setToolTipText("Empresa");
		this.jLabelid_empresaIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelid_empresaIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jComboBoxid_empresaIngrediente= new JComboBoxMe();
		jComboBoxid_empresaIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaIngrediente.setEnabled(false);

		this.jButtonid_empresaIngrediente= new JButtonMe();
		this.jButtonid_empresaIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaIngrediente.setText("Buscar");
		this.jButtonid_empresaIngrediente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaIngrediente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIngrediente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIngrediente"));

		this.jButtonid_empresaIngredienteBusqueda= new JButtonMe();
		this.jButtonid_empresaIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaIngredienteBusqueda.setText("U");
		this.jButtonid_empresaIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaIngredienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaIngredienteUpdate= new JButtonMe();
		this.jButtonid_empresaIngredienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngredienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaIngredienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaIngredienteUpdate.setText("U");
		this.jButtonid_empresaIngredienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaIngredienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaIngredienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaIngredienteUpdate"));



					
		this.jLabelid_sucursalIngrediente = new JLabelMe();
		this.jLabelid_sucursalIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalIngrediente.setToolTipText("Sucursal");
		this.jLabelid_sucursalIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelid_sucursalIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jComboBoxid_sucursalIngrediente= new JComboBoxMe();
		jComboBoxid_sucursalIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalIngrediente.setEnabled(false);

		this.jButtonid_sucursalIngrediente= new JButtonMe();
		this.jButtonid_sucursalIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalIngrediente.setText("Buscar");
		this.jButtonid_sucursalIngrediente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalIngrediente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalIngrediente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalIngrediente"));

		this.jButtonid_sucursalIngredienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalIngredienteBusqueda.setText("U");
		this.jButtonid_sucursalIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalIngredienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalIngredienteUpdate= new JButtonMe();
		this.jButtonid_sucursalIngredienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalIngredienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalIngredienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalIngredienteUpdate.setText("U");
		this.jButtonid_sucursalIngredienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalIngredienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalIngredienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalIngredienteUpdate"));



					
		this.jLabelid_bodegaIngrediente = new JLabelMe();
		this.jLabelid_bodegaIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaIngrediente.setToolTipText("Bodega");
		this.jLabelid_bodegaIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelid_bodegaIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jComboBoxid_bodegaIngrediente= new JComboBoxMe();
		jComboBoxid_bodegaIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaIngrediente= new JButtonMe();
		this.jButtonid_bodegaIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaIngrediente.setText("Buscar");
		this.jButtonid_bodegaIngrediente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaIngrediente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaIngrediente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaIngrediente"));

		this.jButtonid_bodegaIngredienteBusqueda= new JButtonMe();
		this.jButtonid_bodegaIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaIngredienteBusqueda.setText("U");
		this.jButtonid_bodegaIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaIngredienteBusqueda.setVisible(false);		}

		this.jButtonid_bodegaIngredienteUpdate= new JButtonMe();
		this.jButtonid_bodegaIngredienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaIngredienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaIngredienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaIngredienteUpdate.setText("U");
		this.jButtonid_bodegaIngredienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaIngredienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaIngredienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaIngredienteUpdate"));



					
		this.jLabelid_bodega_relacionIngrediente = new JLabelMe();
		this.jLabelid_bodega_relacionIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_IDBODEGARELACION+" : *");
		this.jLabelid_bodega_relacionIngrediente.setToolTipText("Bodega Relacion");
		this.jLabelid_bodega_relacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_bodega_relacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_bodega_relacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_relacionIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_relacionIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_relacionIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_IDBODEGARELACION);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelid_bodega_relacionIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jComboBoxid_bodega_relacionIngrediente= new JComboBoxMe();
		jComboBoxid_bodega_relacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_relacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_relacionIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_relacionIngrediente= new JButtonMe();
		this.jButtonid_bodega_relacionIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_relacionIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_relacionIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_relacionIngrediente.setText("Buscar");
		this.jButtonid_bodega_relacionIngrediente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_relacionIngrediente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_relacionIngrediente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_relacionIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_relacionIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_relacionIngrediente"));

		this.jButtonid_bodega_relacionIngredienteBusqueda= new JButtonMe();
		this.jButtonid_bodega_relacionIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_relacionIngredienteBusqueda.setText("U");
		this.jButtonid_bodega_relacionIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_relacionIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_relacionIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_relacionIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_relacionIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_relacionIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_relacionIngredienteBusqueda.setVisible(false);		}

		this.jButtonid_bodega_relacionIngredienteUpdate= new JButtonMe();
		this.jButtonid_bodega_relacionIngredienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionIngredienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_relacionIngredienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_relacionIngredienteUpdate.setText("U");
		this.jButtonid_bodega_relacionIngredienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_relacionIngredienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_relacionIngredienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_relacionIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_relacionIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_relacionIngredienteUpdate"));



					
		this.jLabelid_productoIngrediente = new JLabelMe();
		this.jLabelid_productoIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoIngrediente.setToolTipText("Producto");
		this.jLabelid_productoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelid_productoIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jComboBoxid_productoIngrediente= new JComboBoxMe();
		jComboBoxid_productoIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoIngrediente= new JButtonMe();
		this.jButtonid_productoIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoIngrediente.setText("Buscar");
		this.jButtonid_productoIngrediente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoIngrediente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoIngrediente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoIngrediente"));

		this.jButtonid_productoIngredienteBusqueda= new JButtonMe();
		this.jButtonid_productoIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoIngredienteBusqueda.setText("U");
		this.jButtonid_productoIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoIngredienteBusqueda.setVisible(false);		}

		this.jButtonid_productoIngredienteUpdate= new JButtonMe();
		this.jButtonid_productoIngredienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoIngredienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoIngredienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoIngredienteUpdate.setText("U");
		this.jButtonid_productoIngredienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoIngredienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoIngredienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoIngredienteUpdate"));



					
		this.jLabelid_producto_relacionIngrediente = new JLabelMe();
		this.jLabelid_producto_relacionIngrediente.setText(""+IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION+" : *");
		this.jLabelid_producto_relacionIngrediente.setToolTipText("Producto Relacion");
		this.jLabelid_producto_relacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_relacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_producto_relacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_producto_relacionIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_producto_relacionIngrediente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_producto_relacionIngrediente.setToolTipText(IngredienteConstantesFunciones.LABEL_IDPRODUCTORELACION);
		this.gridaBagLayoutIngrediente = new GridBagLayout();
		this.jPanelid_producto_relacionIngrediente.setLayout(this.gridaBagLayoutIngrediente);


		jComboBoxid_producto_relacionIngrediente= new JComboBoxMe();
		jComboBoxid_producto_relacionIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_producto_relacionIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_producto_relacionIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_producto_relacionIngrediente= new JButtonMe();
		this.jButtonid_producto_relacionIngrediente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_relacionIngrediente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_relacionIngrediente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_producto_relacionIngrediente.setText("Buscar");
		this.jButtonid_producto_relacionIngrediente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_producto_relacionIngrediente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_relacionIngrediente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_producto_relacionIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_relacionIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_relacionIngrediente"));

		this.jButtonid_producto_relacionIngredienteBusqueda= new JButtonMe();
		this.jButtonid_producto_relacionIngredienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionIngredienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionIngredienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_relacionIngredienteBusqueda.setText("U");
		this.jButtonid_producto_relacionIngredienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_producto_relacionIngredienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_relacionIngredienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_producto_relacionIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_relacionIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_relacionIngredienteBusqueda"));

		if(this.ingredienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_producto_relacionIngredienteBusqueda.setVisible(false);		}

		this.jButtonid_producto_relacionIngredienteUpdate= new JButtonMe();
		this.jButtonid_producto_relacionIngredienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionIngredienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_producto_relacionIngredienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_producto_relacionIngredienteUpdate.setText("U");
		this.jButtonid_producto_relacionIngredienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_producto_relacionIngredienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_producto_relacionIngredienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_producto_relacionIngrediente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_producto_relacionIngrediente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_producto_relacionIngredienteUpdate"));



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
		//this.jInternalFrameDetalleIngrediente = new IngredienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ingrediente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIngrediente= new GridBagLayout();
		

		
		String sToolTipIngrediente="";
		sToolTipIngrediente=IngredienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIngrediente+="(Inventario.Ingrediente)";
		}
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipIngrediente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoIngrediente = new JButtonMe();
		this.jButtonModificarIngrediente = new JButtonMe();
        this.jButtonActualizarIngrediente = new JButtonMe();
        this.jButtonEliminarIngrediente = new JButtonMe();
        this.jButtonCancelarIngrediente = new JButtonMe();
        this.jButtonGuardarCambiosIngrediente = new JButtonMe();
		this.jButtonGuardarCambiosTablaIngrediente = new JButtonMe();
		this.jButtonCerrarIngrediente = new JButtonMe();
		
		this.jScrollPanelDatosIngrediente = new JScrollPane();   
        this.jScrollPanelDatosEdicionIngrediente = new JScrollPane();
		this.jScrollPanelDatosGeneralIngrediente = new JScrollPane();
				
		
		
		this.jPanelCamposIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ingrediente";
		
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingredientes" + this.sPath));
		} else {
			this.jScrollPanelDatosIngrediente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposIngrediente.setName("jPanelCamposIngrediente"); 

		this.jPanelCamposOcultosIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosIngrediente.setName("jPanelCamposOcultosIngrediente"); 

        this.jPanelAccionesIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIngrediente.setToolTipText("Acciones");
        this.jPanelAccionesIngrediente.setName("Acciones"); 

		this.jPanelAccionesFormularioIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioIngrediente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIngrediente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoIngrediente.setText("Nuevo");
		this.jButtonModificarIngrediente.setText("Editar");
        this.jButtonActualizarIngrediente.setText("Actualizar");
        this.jButtonEliminarIngrediente.setText("Eliminar");
        this.jButtonCancelarIngrediente.setText("Cancelar");
        this.jButtonGuardarCambiosIngrediente.setText("Guardar");
		this.jButtonGuardarCambiosTablaIngrediente.setText("Guardar");
		this.jButtonCerrarIngrediente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIngrediente,"nuevo_button","Nuevo",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarIngrediente,"modificar_button","Editar",this.ingredienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarIngrediente,"actualizar_button","Actualizar",this.ingredienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarIngrediente,"eliminar_button","Eliminar",this.ingredienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarIngrediente,"cancelar_button","Cancelar",this.ingredienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosIngrediente,"guardarcambios_button","Guardar",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIngrediente,"guardarcambiostabla_button","Guardar",this.ingredienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIngrediente,"cerrar_button","Salir",this.ingredienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoIngrediente.setToolTipText("Nuevo"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarIngrediente.setToolTipText("Editar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarIngrediente.setToolTipText("Actualizar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarIngrediente.setToolTipText("Eliminar)"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarIngrediente.setToolTipText("Cancelar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosIngrediente.setToolTipText("Guardar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaIngrediente.setToolTipText("Guardar"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIngrediente.setToolTipText("Salir"+" "+IngredienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIngrediente";
		inputMap = this.jButtonNuevoIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIngrediente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIngrediente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarIngrediente";
		inputMap = this.jButtonActualizarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarIngrediente"));
		
		//ELIMINAR
		sMapKey = "EliminarIngrediente";
		inputMap = this.jButtonEliminarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarIngrediente"));
		
		//CANCELAR	
		sMapKey = "CancelarIngrediente";
		inputMap = this.jButtonCancelarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarIngrediente"));
		
		//CERRAR		
		sMapKey = "CerrarIngrediente";
		inputMap = this.jButtonCerrarIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIngrediente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIngrediente";
		inputMap = this.jButtonGuardarCambiosTablaIngrediente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIngrediente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIngrediente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoIngrediente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoIngrediente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoIngrediente.setToolTipText("Nuevo Ingrediente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarIngrediente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarIngrediente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarIngrediente.setToolTipText("Sin Cerrar Ventana Ingrediente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeIngrediente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeIngrediente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeIngrediente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIngrediente.setText("Accion");
		this.jComboBoxTiposAccionesIngrediente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioIngrediente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIngrediente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioIngrediente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesIngrediente = new JLabelMe();
		
		this.jLabelAccionesIngrediente.setText("Acciones");		
		this.jLabelAccionesIngrediente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngrediente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngrediente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposIngrediente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysIngrediente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesIngrediente=new JTabbedPane();
		this.jTabbedPaneRelacionesIngrediente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesIngrediente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesIngrediente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngrediente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngrediente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIngrediente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioIngrediente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIngrediente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIngrediente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIngrediente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposIngrediente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosIngrediente = new GridBagLayout();
		
		this.jPanelCamposIngrediente.setLayout(gridaBagLayoutCamposIngrediente);
		this.jPanelCamposOcultosIngrediente.setLayout(gridaBagLayoutCamposOcultosIngrediente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidIngrediente.add(jLabelIdIngrediente, this.gridBagConstraintsIngrediente);



	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidIngrediente.add(jLabelidIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaIngrediente.add(jLabelid_empresaIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 2;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaIngrediente.add(jButtonid_empresaIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 3;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaIngrediente.add(jButtonid_empresaIngredienteUpdate, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaIngrediente.add(jComboBoxid_empresaIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalIngrediente.add(jLabelid_sucursalIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 2;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalIngrediente.add(jButtonid_sucursalIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 3;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalIngrediente.add(jButtonid_sucursalIngredienteUpdate, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalIngrediente.add(jComboBoxid_sucursalIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaIngrediente.add(jLabelid_bodegaIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 2;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaIngrediente.add(jButtonid_bodegaIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 3;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaIngrediente.add(jButtonid_bodegaIngredienteUpdate, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaIngrediente.add(jComboBoxid_bodegaIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_relacionIngrediente.add(jLabelid_bodega_relacionIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 2;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_relacionIngrediente.add(jButtonid_bodega_relacionIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 3;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_relacionIngrediente.add(jButtonid_bodega_relacionIngredienteUpdate, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_relacionIngrediente.add(jComboBoxid_bodega_relacionIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoIngrediente.add(jLabelid_productoIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 2;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoIngrediente.add(jButtonid_productoIngrediente, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 3;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoIngrediente.add(jButtonid_productoIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 4;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoIngrediente.add(jButtonid_productoIngredienteUpdate, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoIngrediente.add(jComboBoxid_productoIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_producto_relacionIngrediente.add(jLabelid_producto_relacionIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 2;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_producto_relacionIngrediente.add(jButtonid_producto_relacionIngrediente, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 3;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_relacionIngrediente.add(jButtonid_producto_relacionIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 4;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_producto_relacionIngrediente.add(jButtonid_producto_relacionIngredienteUpdate, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_producto_relacionIngrediente.add(jComboBoxid_producto_relacionIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadIngrediente.add(jLabelcantidadIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 2;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadIngrediente.add(jButtoncantidadIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadIngrediente.add(jTextFieldcantidadIngrediente, this.gridBagConstraintsIngrediente);


	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 0;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioIngrediente.add(jLabelprecioIngrediente, this.gridBagConstraintsIngrediente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		//this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = 2;
		this.gridBagConstraintsIngrediente.ipadx = 0;
		this.gridBagConstraintsIngrediente.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioIngrediente.add(jButtonprecioIngredienteBusqueda, this.gridBagConstraintsIngrediente);
	}

	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngrediente.gridy = 0;
	this.gridBagConstraintsIngrediente.gridx = 1;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioIngrediente.add(jTextFieldprecioIngrediente, this.gridBagConstraintsIngrediente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelidIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelid_bodegaIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelid_bodega_relacionIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelid_productoIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelid_producto_relacionIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelcantidadIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngrediente.add(this.jPanelprecioIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposIngrediente % 1==0) {
		iXPanelCamposIngrediente=0;
		iYPanelCamposIngrediente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposOcultosIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposOcultosIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosIngrediente.add(this.jPanelid_empresaIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposOcultosIngrediente % 1==0) {
		iXPanelCamposOcultosIngrediente=0;
		iYPanelCamposOcultosIngrediente++;
	}
	this.gridBagConstraintsIngrediente = new GridBagConstraints();
	this.gridBagConstraintsIngrediente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngrediente.gridy = iYPanelCamposOcultosIngrediente;
	this.gridBagConstraintsIngrediente.gridx = iXPanelCamposOcultosIngrediente++;
	this.gridBagConstraintsIngrediente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngrediente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosIngrediente.add(this.jPanelid_sucursalIngrediente, this.gridBagConstraintsIngrediente);



	if(iXPanelCamposOcultosIngrediente % 1==0) {
		iXPanelCamposOcultosIngrediente=0;
		iYPanelCamposOcultosIngrediente++;
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
			
		GridBagLayout gridaBagLayoutAccionesIngrediente= new GridBagLayout();
		this.jPanelAccionesIngrediente.setLayout(gridaBagLayoutAccionesIngrediente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioIngrediente= new GridBagLayout();
		this.jPanelAccionesFormularioIngrediente.setLayout(gridaBagLayoutAccionesFormularioIngrediente);
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIngrediente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIngrediente.add(this.jComboBoxTiposAccionesFormularioIngrediente, this.gridBagConstraintsIngrediente);

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIngrediente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIngrediente.add(this.jCheckBoxPostAccionNuevoIngrediente, this.gridBagConstraintsIngrediente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsIngrediente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioIngrediente.add(this.jCheckBoxPostAccionSinCerrarIngrediente, this.gridBagConstraintsIngrediente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ingredienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ingredienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsIngrediente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioIngrediente.add(this.jCheckBoxPostAccionSinMensajeIngrediente, this.gridBagConstraintsIngrediente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx = iPosXAccion++;
			
		this.jPanelAccionesIngrediente.add(this.jButtonModificarIngrediente, this.gridBagConstraintsIngrediente);							

		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngrediente.gridy = 0;
		this.gridBagConstraintsIngrediente.gridx =iPosXAccion++;
			
		this.jPanelAccionesIngrediente.add(this.jButtonEliminarIngrediente, this.gridBagConstraintsIngrediente);
		
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = 0;		
		this.gridBagConstraintsIngrediente.gridx = iPosXAccion++;
		
		this.jPanelAccionesIngrediente.add(this.jButtonActualizarIngrediente, this.gridBagConstraintsIngrediente);


		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = 0;		
		this.gridBagConstraintsIngrediente.gridx = iPosXAccion++;
		
		this.jPanelAccionesIngrediente.add(this.jButtonGuardarCambiosIngrediente, this.gridBagConstraintsIngrediente);	
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = 0;		
		this.gridBagConstraintsIngrediente.gridx =iPosXAccion++;
		
		this.jPanelAccionesIngrediente.add(this.jButtonCancelarIngrediente, this.gridBagConstraintsIngrediente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIngrediente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIngrediente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ingredienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIngrediente = new GridBagConstraints();						
			this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngrediente.gridx = 0;		
			//this.gridBagConstraintsIngrediente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIngrediente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIngrediente.gridx =0;
		this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIngrediente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIngrediente, this.gridBagConstraintsIngrediente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(IngredienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleIngrediente = new IngredienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ingrediente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ingrediente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ingrediente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			IngredienteModel ingredienteModel=new IngredienteModel(this);
			
			//SI USARA CLASE INTERNA
			//IngredienteModel.IngredienteFocusTraversalPolicy ingredienteFocusTraversalPolicy = ingredienteModel.new IngredienteFocusTraversalPolicy(this);
			
			//ingredienteFocusTraversalPolicy.setingredienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ingredienteModel);
			
			
			this.jContentPaneDetalleIngrediente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleIngrediente = new GridBagLayout();	
			this.jContentPaneDetalleIngrediente.setLayout(gridaBagLayoutDetalleIngrediente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIngrediente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsIngrediente = new GridBagConstraints();
				this.gridBagConstraintsIngrediente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsIngrediente.gridx = 0;
					
				
				this.jContentPaneDetalleIngrediente.add(jTtoolBarDetalleIngrediente, gridBagConstraintsIngrediente);								
				
}
			
			this.jScrollPanelDatosEdicionIngrediente=   new JScrollPane(jContentPaneDetalleIngrediente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIngrediente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngrediente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngrediente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralIngrediente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIngrediente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngrediente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngrediente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsIngrediente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsIngrediente.gridx = 0;
	        
			this.jContentPaneDetalleIngrediente.add(jPanelCamposIngrediente, gridBagConstraintsIngrediente);
			
			
			
			
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
						&& ingredienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ingredienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsIngrediente= new GridBagConstraints();
						this.gridBagConstraintsIngrediente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsIngrediente.gridx = 0;
						this.jContentPaneDetalleIngrediente.add(this.jTabbedPaneRelacionesIngrediente, this.gridBagConstraintsIngrediente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesIngrediente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosIngrediente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsIngrediente = new GridBagConstraints();
					this.gridBagConstraintsIngrediente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsIngrediente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsIngrediente.gridx = 0;
					
				
					this.jContentPaneDetalleIngrediente.add(jPanelCamposOcultosIngrediente, gridBagConstraintsIngrediente);
				
					this.jPanelCamposOcultosIngrediente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsIngrediente.gridx = 0;
	        this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleIngrediente.add(this.jPanelAccionesFormularioIngrediente, this.gridBagConstraintsIngrediente);							
			
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
	        this.gridBagConstraintsIngrediente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsIngrediente.gridx = 0;
	        
			
			this.jContentPaneDetalleIngrediente.add(this.jPanelAccionesIngrediente, this.gridBagConstraintsIngrediente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionIngrediente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionIngrediente=   new JScrollPane(this.jPanelCamposIngrediente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIngrediente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngrediente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngrediente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsIngrediente.gridx = 0;
			this.gridBagConstraintsIngrediente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsIngrediente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsIngrediente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionIngrediente, this.gridBagConstraintsIngrediente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIngrediente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioIngrediente, this.gridBagConstraintsIngrediente);			
			
			this.gridBagConstraintsIngrediente = new GridBagConstraints();
			this.gridBagConstraintsIngrediente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIngrediente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesIngrediente, this.gridBagConstraintsIngrediente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIngrediente, this.gridBagConstraintsIngrediente);
			
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIngrediente, this.gridBagConstraintsIngrediente);
		
			
		this.gridBagConstraintsIngrediente = new GridBagConstraints();
		this.gridBagConstraintsIngrediente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIngrediente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIngrediente, this.gridBagConstraintsIngrediente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralIngrediente;//jContentPane;
		
		return jScrollPanelDatosEdicionIngrediente;
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
