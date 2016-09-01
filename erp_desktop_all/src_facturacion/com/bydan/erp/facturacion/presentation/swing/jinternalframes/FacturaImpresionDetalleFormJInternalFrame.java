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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.FacturaImpresionConstantesFunciones;

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
public class FacturaImpresionDetalleFormJInternalFrame extends FacturaImpresionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturaImpresion;
	
	protected JMenuBar jmenuBarDetalleFacturaImpresion;
	
	protected JMenu jmenuDetalleFacturaImpresion;
	protected JMenu jmenuDetalleArchivoFacturaImpresion;
	protected JMenu jmenuDetalleAccionesFacturaImpresion;
	protected JMenu jmenuDetalleDatosFacturaImpresion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaImpresion;	
	protected GridBagConstraints gridBagConstraintsFacturaImpresion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaImpresionBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturaImpresion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected EstadoFactuImpreBeanSwingJInternalFrame estadofactuimpreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadofactuimpre="";
	
	public FacturaImpresionSessionBean facturaimpresionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public EstadoFactuImpreSessionBean estadofactuimpreSessionBean;	
	
	public FacturaImpresionLogic facturaimpresionLogic;
	
	public JScrollPane jScrollPanelDatosFacturaImpresion;
	public JScrollPane jScrollPanelDatosEdicionFacturaImpresion;
	public JScrollPane jScrollPanelDatosGeneralFacturaImpresion;
	
	protected JPanel jPanelCamposFacturaImpresion;    
	protected JPanel jPanelCamposOcultosFacturaImpresion;    	
	protected JPanel jPanelAccionesFacturaImpresion;
	protected JPanel jPanelAccionesFormularioFacturaImpresion;
    
	
	
	protected Integer iXPanelCamposFacturaImpresion=0;
	protected Integer iYPanelCamposFacturaImpresion=0;
	
	protected Integer iXPanelCamposOcultosFacturaImpresion=0;
	protected Integer iYPanelCamposOcultosFacturaImpresion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturaImpresion;
	public JButton jButtonModificarFacturaImpresion;
	public JButton jButtonActualizarFacturaImpresion;
    public JButton jButtonEliminarFacturaImpresion;
	public JButton jButtonCancelarFacturaImpresion;
    public JButton jButtonGuardarCambiosFacturaImpresion;
	public JButton jButtonGuardarCambiosTablaFacturaImpresion;
	protected JButton jButtonCerrarFacturaImpresion;
	
	
	protected JButton jButtonProcesarInformacionFacturaImpresion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturaImpresion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturaImpresion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturaImpresion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaImpresion;
	protected JButton jButtonModificarToolBarFacturaImpresion;
	protected JButton jButtonActualizarToolBarFacturaImpresion;
    protected JButton jButtonEliminarToolBarFacturaImpresion;
	protected JButton jButtonCancelarToolBarFacturaImpresion;
    protected JButton jButtonGuardarCambiosToolBarFacturaImpresion;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturaImpresion;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaImpresion;
	protected JButton jButtonCerrarToolBarFacturaImpresion;
	
	protected JButton jButtonProcesarInformacionToolBarFacturaImpresion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaImpresion;
	protected JMenuItem jMenuItemModificarFacturaImpresion;
	protected JMenuItem jMenuItemActualizarFacturaImpresion;
    protected JMenuItem jMenuItemEliminarFacturaImpresion;
	protected JMenuItem jMenuItemCancelarFacturaImpresion;
    protected JMenuItem jMenuItemGuardarCambiosFacturaImpresion;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaImpresion;
	protected JMenuItem jMenuItemCerrarFacturaImpresion;
	protected JMenuItem jMenuItemDetalleCerrarFacturaImpresion;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaImpresion;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturaImpresion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaImpresion;
	protected JMenuItem jMenuItemMostrarOcultarFacturaImpresion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaImpresion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaImpresion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaImpresion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturaImpresion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturaImpresion;
	public JLabel jLabelIdFacturaImpresion;
	public JLabel jLabelidFacturaImpresion;
	public JButton jButtonidFacturaImpresionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturaImpresion;
	public JLabel jLabelid_empresaFacturaImpresion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturaImpresion;
	public JButton jButtonid_empresaFacturaImpresion= new JButtonMe();
	public JButton jButtonid_empresaFacturaImpresionUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaImpresionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturaImpresion;
	public JLabel jLabelid_sucursalFacturaImpresion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturaImpresion;
	public JButton jButtonid_sucursalFacturaImpresion= new JButtonMe();
	public JButton jButtonid_sucursalFacturaImpresionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturaImpresionBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaFacturaImpresion;
	public JLabel jLabelid_facturaFacturaImpresion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFacturaImpresion;
	public JButton jButtonid_facturaFacturaImpresion= new JButtonMe();
	public JButton jButtonid_facturaFacturaImpresionUpdate= new JButtonMe();
	public JButton jButtonid_facturaFacturaImpresionBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_factu_impreFacturaImpresion;
	public JLabel jLabelid_estado_factu_impreFacturaImpresion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_factu_impreFacturaImpresion;
	public JButton jButtonid_estado_factu_impreFacturaImpresion= new JButtonMe();
	public JButton jButtonid_estado_factu_impreFacturaImpresionUpdate= new JButtonMe();
	public JButton jButtonid_estado_factu_impreFacturaImpresionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturaImpresion;
	
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
	
	public FacturaImpresionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturaImpresion=new JPanel();
				this.jPanelAccionesFormularioFacturaImpresion=new JPanel();
				this.jmenuBarDetalleFacturaImpresion=new JMenuBar();
				this.jTtoolBarDetalleFacturaImpresion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaImpresionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaImpresionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaImpresion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturaImpresion() {
		return this.jButtonActualizarToolBarFacturaImpresion;
	}
	
	public JButton getjButtonEliminarToolBarFacturaImpresion() {
		return this.jButtonEliminarToolBarFacturaImpresion;
	}
	
	public JButton getjButtonCancelarToolBarFacturaImpresion() {
		return this.jButtonCancelarToolBarFacturaImpresion;
	}		
	
	public JButton getjButtonProcesarInformacionFacturaImpresion() {
		return this.jButtonProcesarInformacionFacturaImpresion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaImpresion)	{
		this.jButtonProcesarInformacionFacturaImpresion = jButtonProcesarInformacionFacturaImpresion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaImpresion() {
		return this.jComboBoxTiposAccionesFacturaImpresion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaImpresion(
			JComboBox jComboBoxTiposRelacionesFacturaImpresion) {
		this.jComboBoxTiposRelacionesFacturaImpresion = jComboBoxTiposRelacionesFacturaImpresion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaImpresion(
			JComboBox jComboBoxTiposAccionesFacturaImpresion) {
		this.jComboBoxTiposAccionesFacturaImpresion = jComboBoxTiposAccionesFacturaImpresion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturaImpresion() {
		return this.jComboBoxTiposAccionesFormularioFacturaImpresion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturaImpresion(
			JComboBox jComboBoxTiposAccionesFormularioFacturaImpresion) {
		this.jComboBoxTiposAccionesFormularioFacturaImpresion = jComboBoxTiposAccionesFormularioFacturaImpresion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		
		this.facturaimpresionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaimpresionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaimpresionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaImpresionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Impresion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaImpresion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturaImpresion=new JButtonMe();
				this.jButtonModificarToolBarFacturaImpresion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturaImpresion,this.jTtoolBarDetalleFacturaImpresion,
							"actualizar","actualizar","Actualizar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturaImpresion,this.jTtoolBarDetalleFacturaImpresion,
							"eliminar","eliminar","Eliminar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturaImpresion,this.jTtoolBarDetalleFacturaImpresion,
							"cancelar","cancelar","Cancelar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturaImpresion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturaImpresion,this.jTtoolBarDetalleFacturaImpresion,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturaImpresion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturaImpresion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturaImpresion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturaImpresion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturaImpresion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaImpresion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaImpresion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaImpresion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturaImpresion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturaImpresion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturaImpresion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturaImpresion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturaImpresion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturaImpresion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturaImpresion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturaImpresion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturaImpresion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturaImpresion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturaImpresion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturaImpresion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturaImpresion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaImpresion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaImpresion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaImpresion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaImpresion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaImpresion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturaImpresion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturaImpresion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturaImpresion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaImpresion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaImpresion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaImpresion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaImpresion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaImpresion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaImpresion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturaImpresion.add(this.jMenuItemDetalleCerrarFacturaImpresion);
		
		this.jmenuDetalleAccionesFacturaImpresion.add(this.jMenuItemActualizarFacturaImpresion);
		this.jmenuDetalleAccionesFacturaImpresion.add(this.jMenuItemEliminarFacturaImpresion);
		this.jmenuDetalleAccionesFacturaImpresion.add(this.jMenuItemCancelarFacturaImpresion);		
		
		//this.jmenuDetalleDatosFacturaImpresion.add(this.jMenuItemDetalleAbrirOrderByFacturaImpresion);				
		this.jmenuDetalleDatosFacturaImpresion.add(this.jMenuItemDetalleMostarOcultarFacturaImpresion);				
				
		//this.jmenuDetalleAccionesFacturaImpresion.add(this.jMenuItemGuardarCambiosFacturaImpresion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturaImpresion.add(this.jmenuDetalleArchivoFacturaImpresion);		
		this.jmenuBarDetalleFacturaImpresion.add(this.jmenuDetalleAccionesFacturaImpresion);		
		this.jmenuBarDetalleFacturaImpresion.add(this.jmenuDetalleDatosFacturaImpresion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturaImpresion);				
	}
	
	
	public void inicializarElementosCamposFacturaImpresion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturaImpresion = new JLabelMe();
		jLabelIdFacturaImpresion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturaImpresion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturaImpresion.setToolTipText(FacturaImpresionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturaImpresion= new GridBagLayout();

		this.jPanelidFacturaImpresion.setLayout(this.gridaBagLayoutFacturaImpresion);

		jLabelidFacturaImpresion = new JLabel();
		jLabelidFacturaImpresion.setText("Id");

		jLabelidFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysFacturaImpresion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturaImpresion = new JLabelMe();
		this.jLabelid_empresaFacturaImpresion.setText(""+FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturaImpresion.setToolTipText("Empresa");
		this.jLabelid_empresaFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturaImpresion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturaImpresion.setToolTipText(FacturaImpresionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturaImpresion = new GridBagLayout();
		this.jPanelid_empresaFacturaImpresion.setLayout(this.gridaBagLayoutFacturaImpresion);


		jComboBoxid_empresaFacturaImpresion= new JComboBoxMe();
		jComboBoxid_empresaFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturaImpresion.setEnabled(false);

		this.jButtonid_empresaFacturaImpresion= new JButtonMe();
		this.jButtonid_empresaFacturaImpresion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaImpresion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaImpresion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaImpresion.setText("Buscar");
		this.jButtonid_empresaFacturaImpresion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturaImpresion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaImpresion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaImpresion"));

		this.jButtonid_empresaFacturaImpresionBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaImpresionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaImpresionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaImpresionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaImpresionBusqueda.setText("U");
		this.jButtonid_empresaFacturaImpresionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaImpresionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaImpresionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaImpresionBusqueda"));

		if(this.facturaimpresionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaImpresionBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaImpresionUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaImpresionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaImpresionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaImpresionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaImpresionUpdate.setText("U");
		this.jButtonid_empresaFacturaImpresionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaImpresionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaImpresionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaImpresionUpdate"));



					
		this.jLabelid_sucursalFacturaImpresion = new JLabelMe();
		this.jLabelid_sucursalFacturaImpresion.setText(""+FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturaImpresion.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturaImpresion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturaImpresion.setToolTipText(FacturaImpresionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturaImpresion = new GridBagLayout();
		this.jPanelid_sucursalFacturaImpresion.setLayout(this.gridaBagLayoutFacturaImpresion);


		jComboBoxid_sucursalFacturaImpresion= new JComboBoxMe();
		jComboBoxid_sucursalFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturaImpresion.setEnabled(false);

		this.jButtonid_sucursalFacturaImpresion= new JButtonMe();
		this.jButtonid_sucursalFacturaImpresion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaImpresion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaImpresion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaImpresion.setText("Buscar");
		this.jButtonid_sucursalFacturaImpresion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturaImpresion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaImpresion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaImpresion"));

		this.jButtonid_sucursalFacturaImpresionBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturaImpresionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaImpresionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaImpresionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaImpresionBusqueda.setText("U");
		this.jButtonid_sucursalFacturaImpresionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturaImpresionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaImpresionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaImpresionBusqueda"));

		if(this.facturaimpresionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturaImpresionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturaImpresionUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturaImpresionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaImpresionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaImpresionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaImpresionUpdate.setText("U");
		this.jButtonid_sucursalFacturaImpresionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturaImpresionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaImpresionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaImpresionUpdate"));



					
		this.jLabelid_facturaFacturaImpresion = new JLabelMe();
		this.jLabelid_facturaFacturaImpresion.setText(""+FacturaImpresionConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaFacturaImpresion.setToolTipText("Factura");
		this.jLabelid_facturaFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaFacturaImpresion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaFacturaImpresion.setToolTipText(FacturaImpresionConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutFacturaImpresion = new GridBagLayout();
		this.jPanelid_facturaFacturaImpresion.setLayout(this.gridaBagLayoutFacturaImpresion);


		jComboBoxid_facturaFacturaImpresion= new JComboBoxMe();
		jComboBoxid_facturaFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaFacturaImpresion= new JButtonMe();
		this.jButtonid_facturaFacturaImpresion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaImpresion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaImpresion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaImpresion.setText("Buscar");
		this.jButtonid_facturaFacturaImpresion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaFacturaImpresion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaImpresion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaImpresion"));

		this.jButtonid_facturaFacturaImpresionBusqueda= new JButtonMe();
		this.jButtonid_facturaFacturaImpresionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaImpresionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaImpresionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaFacturaImpresionBusqueda.setText("U");
		this.jButtonid_facturaFacturaImpresionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaFacturaImpresionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaImpresionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaImpresionBusqueda"));

		if(this.facturaimpresionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaFacturaImpresionBusqueda.setVisible(false);		}

		this.jButtonid_facturaFacturaImpresionUpdate= new JButtonMe();
		this.jButtonid_facturaFacturaImpresionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaImpresionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaImpresionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaFacturaImpresionUpdate.setText("U");
		this.jButtonid_facturaFacturaImpresionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaFacturaImpresionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaImpresionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaImpresionUpdate"));



					
		this.jLabelid_estado_factu_impreFacturaImpresion = new JLabelMe();
		this.jLabelid_estado_factu_impreFacturaImpresion.setText(""+FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE+" : *");
		this.jLabelid_estado_factu_impreFacturaImpresion.setToolTipText("Estado Factu Impre");
		this.jLabelid_estado_factu_impreFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_factu_impreFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_factu_impreFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_factu_impreFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_factu_impreFacturaImpresion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_factu_impreFacturaImpresion.setToolTipText(FacturaImpresionConstantesFunciones.LABEL_IDESTADOFACTUIMPRE);
		this.gridaBagLayoutFacturaImpresion = new GridBagLayout();
		this.jPanelid_estado_factu_impreFacturaImpresion.setLayout(this.gridaBagLayoutFacturaImpresion);


		jComboBoxid_estado_factu_impreFacturaImpresion= new JComboBoxMe();
		jComboBoxid_estado_factu_impreFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factu_impreFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factu_impreFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_factu_impreFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_factu_impreFacturaImpresion= new JButtonMe();
		this.jButtonid_estado_factu_impreFacturaImpresion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_factu_impreFacturaImpresion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_factu_impreFacturaImpresion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_factu_impreFacturaImpresion.setText("Buscar");
		this.jButtonid_estado_factu_impreFacturaImpresion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_factu_impreFacturaImpresion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_factu_impreFacturaImpresion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_factu_impreFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_factu_impreFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_factu_impreFacturaImpresion"));

		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda= new JButtonMe();
		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setText("U");
		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_factu_impreFacturaImpresionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_factu_impreFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_factu_impreFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_factu_impreFacturaImpresionBusqueda"));

		if(this.facturaimpresionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_factu_impreFacturaImpresionBusqueda.setVisible(false);		}

		this.jButtonid_estado_factu_impreFacturaImpresionUpdate= new JButtonMe();
		this.jButtonid_estado_factu_impreFacturaImpresionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factu_impreFacturaImpresionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factu_impreFacturaImpresionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_factu_impreFacturaImpresionUpdate.setText("U");
		this.jButtonid_estado_factu_impreFacturaImpresionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_factu_impreFacturaImpresionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_factu_impreFacturaImpresionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_factu_impreFacturaImpresion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_factu_impreFacturaImpresion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_factu_impreFacturaImpresionUpdate"));



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
		//this.jInternalFrameDetalleFacturaImpresion = new FacturaImpresionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura Impresion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaImpresion= new GridBagLayout();
		

		
		String sToolTipFacturaImpresion="";
		sToolTipFacturaImpresion=FacturaImpresionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaImpresion+="(Facturacion.FacturaImpresion)";
		}
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaImpresion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturaImpresion = new JButtonMe();
		this.jButtonModificarFacturaImpresion = new JButtonMe();
        this.jButtonActualizarFacturaImpresion = new JButtonMe();
        this.jButtonEliminarFacturaImpresion = new JButtonMe();
        this.jButtonCancelarFacturaImpresion = new JButtonMe();
        this.jButtonGuardarCambiosFacturaImpresion = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturaImpresion = new JButtonMe();
		this.jButtonCerrarFacturaImpresion = new JButtonMe();
		
		this.jScrollPanelDatosFacturaImpresion = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturaImpresion = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturaImpresion = new JScrollPane();
				
		
		
		this.jPanelCamposFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Impresion";
		
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Impresiones" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaImpresion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturaImpresion.setName("jPanelCamposFacturaImpresion"); 

		this.jPanelCamposOcultosFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturaImpresion.setName("jPanelCamposOcultosFacturaImpresion"); 

        this.jPanelAccionesFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaImpresion.setToolTipText("Acciones");
        this.jPanelAccionesFacturaImpresion.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturaImpresion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturaImpresion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturaImpresion.setText("Nuevo");
		this.jButtonModificarFacturaImpresion.setText("Editar");
        this.jButtonActualizarFacturaImpresion.setText("Actualizar");
        this.jButtonEliminarFacturaImpresion.setText("Eliminar");
        this.jButtonCancelarFacturaImpresion.setText("Cancelar");
        this.jButtonGuardarCambiosFacturaImpresion.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturaImpresion.setText("Guardar");
		this.jButtonCerrarFacturaImpresion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaImpresion,"nuevo_button","Nuevo",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturaImpresion,"modificar_button","Editar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturaImpresion,"actualizar_button","Actualizar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturaImpresion,"eliminar_button","Eliminar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturaImpresion,"cancelar_button","Cancelar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturaImpresion,"guardarcambios_button","Guardar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaImpresion,"guardarcambiostabla_button","Guardar",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaImpresion,"cerrar_button","Salir",this.facturaimpresionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturaImpresion.setToolTipText("Nuevo"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturaImpresion.setToolTipText("Editar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturaImpresion.setToolTipText("Actualizar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturaImpresion.setToolTipText("Eliminar)"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturaImpresion.setToolTipText("Cancelar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturaImpresion.setToolTipText("Guardar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturaImpresion.setToolTipText("Guardar"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaImpresion.setToolTipText("Salir"+" "+FacturaImpresionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaImpresion";
		inputMap = this.jButtonNuevoFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaImpresion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaImpresion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturaImpresion";
		inputMap = this.jButtonActualizarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturaImpresion"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturaImpresion";
		inputMap = this.jButtonEliminarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturaImpresion"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturaImpresion";
		inputMap = this.jButtonCancelarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturaImpresion"));
		
		//CERRAR		
		sMapKey = "CerrarFacturaImpresion";
		inputMap = this.jButtonCerrarFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaImpresion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaImpresion";
		inputMap = this.jButtonGuardarCambiosTablaFacturaImpresion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaImpresion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaImpresion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturaImpresion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturaImpresion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturaImpresion.setToolTipText("Nuevo FacturaImpresion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturaImpresion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturaImpresion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturaImpresion.setToolTipText("Sin Cerrar Ventana FacturaImpresion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturaImpresion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturaImpresion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturaImpresion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaImpresion.setText("Accion");
		this.jComboBoxTiposAccionesFacturaImpresion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturaImpresion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturaImpresion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturaImpresion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturaImpresion = new JLabelMe();
		
		this.jLabelAccionesFacturaImpresion.setText("Acciones");		
		this.jLabelAccionesFacturaImpresion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaImpresion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaImpresion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturaImpresion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturaImpresion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturaImpresion=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturaImpresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturaImpresion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturaImpresion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaImpresion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaImpresion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaImpresion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturaImpresion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaImpresion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaImpresion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturaImpresion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturaImpresion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturaImpresion = new GridBagLayout();
		
		this.jPanelCamposFacturaImpresion.setLayout(gridaBagLayoutCamposFacturaImpresion);
		this.jPanelCamposOcultosFacturaImpresion.setLayout(gridaBagLayoutCamposOcultosFacturaImpresion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 0;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturaImpresion.add(jLabelIdFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 1;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturaImpresion.add(jLabelidFacturaImpresion, this.gridBagConstraintsFacturaImpresion);


	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 0;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFacturaImpresion.add(jLabelid_empresaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 2;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaImpresion.add(jButtonid_empresaFacturaImpresionBusqueda, this.gridBagConstraintsFacturaImpresion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 3;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaImpresion.add(jButtonid_empresaFacturaImpresionUpdate, this.gridBagConstraintsFacturaImpresion);
	}

	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 1;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFacturaImpresion.add(jComboBoxid_empresaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);


	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 0;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFacturaImpresion.add(jLabelid_sucursalFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 2;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaImpresion.add(jButtonid_sucursalFacturaImpresionBusqueda, this.gridBagConstraintsFacturaImpresion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 3;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaImpresion.add(jButtonid_sucursalFacturaImpresionUpdate, this.gridBagConstraintsFacturaImpresion);
	}

	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 1;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFacturaImpresion.add(jComboBoxid_sucursalFacturaImpresion, this.gridBagConstraintsFacturaImpresion);


	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 0;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaFacturaImpresion.add(jLabelid_facturaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 2;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaFacturaImpresion.add(jButtonid_facturaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 3;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaFacturaImpresion.add(jButtonid_facturaFacturaImpresionBusqueda, this.gridBagConstraintsFacturaImpresion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 4;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaFacturaImpresion.add(jButtonid_facturaFacturaImpresionUpdate, this.gridBagConstraintsFacturaImpresion);
	}

	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 1;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaFacturaImpresion.add(jComboBoxid_facturaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);


	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 0;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_factu_impreFacturaImpresion.add(jLabelid_estado_factu_impreFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 2;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_factu_impreFacturaImpresion.add(jButtonid_estado_factu_impreFacturaImpresionBusqueda, this.gridBagConstraintsFacturaImpresion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		//this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = 3;
		this.gridBagConstraintsFacturaImpresion.ipadx = 0;
		this.gridBagConstraintsFacturaImpresion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_factu_impreFacturaImpresion.add(jButtonid_estado_factu_impreFacturaImpresionUpdate, this.gridBagConstraintsFacturaImpresion);
	}

	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaImpresion.gridy = 0;
	this.gridBagConstraintsFacturaImpresion.gridx = 1;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_factu_impreFacturaImpresion.add(jComboBoxid_estado_factu_impreFacturaImpresion, this.gridBagConstraintsFacturaImpresion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaImpresion.gridy = iYPanelCamposFacturaImpresion;
	this.gridBagConstraintsFacturaImpresion.gridx = iXPanelCamposFacturaImpresion++;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaImpresion.add(this.jPanelidFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(iXPanelCamposFacturaImpresion % 1==0) {
		iXPanelCamposFacturaImpresion=0;
		iYPanelCamposFacturaImpresion++;
	}
	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaImpresion.gridy = iYPanelCamposFacturaImpresion;
	this.gridBagConstraintsFacturaImpresion.gridx = iXPanelCamposFacturaImpresion++;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaImpresion.add(this.jPanelid_facturaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(iXPanelCamposFacturaImpresion % 1==0) {
		iXPanelCamposFacturaImpresion=0;
		iYPanelCamposFacturaImpresion++;
	}
	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaImpresion.gridy = iYPanelCamposFacturaImpresion;
	this.gridBagConstraintsFacturaImpresion.gridx = iXPanelCamposFacturaImpresion++;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturaImpresion.add(this.jPanelid_estado_factu_impreFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(iXPanelCamposFacturaImpresion % 1==0) {
		iXPanelCamposFacturaImpresion=0;
		iYPanelCamposFacturaImpresion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaImpresion.gridy = iYPanelCamposOcultosFacturaImpresion;
	this.gridBagConstraintsFacturaImpresion.gridx = iXPanelCamposOcultosFacturaImpresion++;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturaImpresion.add(this.jPanelid_empresaFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(iXPanelCamposOcultosFacturaImpresion % 1==0) {
		iXPanelCamposOcultosFacturaImpresion=0;
		iYPanelCamposOcultosFacturaImpresion++;
	}
	this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaImpresion.gridy = iYPanelCamposOcultosFacturaImpresion;
	this.gridBagConstraintsFacturaImpresion.gridx = iXPanelCamposOcultosFacturaImpresion++;
	this.gridBagConstraintsFacturaImpresion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaImpresion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFacturaImpresion.add(this.jPanelid_sucursalFacturaImpresion, this.gridBagConstraintsFacturaImpresion);



	if(iXPanelCamposOcultosFacturaImpresion % 1==0) {
		iXPanelCamposOcultosFacturaImpresion=0;
		iYPanelCamposOcultosFacturaImpresion++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturaImpresion= new GridBagLayout();
		this.jPanelAccionesFacturaImpresion.setLayout(gridaBagLayoutAccionesFacturaImpresion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturaImpresion= new GridBagLayout();
		this.jPanelAccionesFormularioFacturaImpresion.setLayout(gridaBagLayoutAccionesFormularioFacturaImpresion);
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaImpresion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaImpresion.add(this.jComboBoxTiposAccionesFormularioFacturaImpresion, this.gridBagConstraintsFacturaImpresion);

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaImpresion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaImpresion.add(this.jCheckBoxPostAccionNuevoFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaImpresion.add(this.jCheckBoxPostAccionSinCerrarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.facturaimpresionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.facturaimpresionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaImpresion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaImpresion.add(this.jCheckBoxPostAccionSinMensajeFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturaImpresion.add(this.jButtonModificarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);							

		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaImpresion.gridy = 0;
		this.gridBagConstraintsFacturaImpresion.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturaImpresion.add(this.jButtonEliminarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
			
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = 0;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaImpresion.add(this.jButtonActualizarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);


		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = 0;		
		this.gridBagConstraintsFacturaImpresion.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaImpresion.add(this.jButtonGuardarCambiosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);	
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = 0;		
		this.gridBagConstraintsFacturaImpresion.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturaImpresion.add(this.jButtonCancelarFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaImpresion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaImpresion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();						
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaImpresion.gridx = 0;		
			//this.gridBagConstraintsFacturaImpresion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaImpresion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaImpresion.gridx =0;
		this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaImpresion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaImpresionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturaImpresion = new FacturaImpresionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura Impresion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factura Impresion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Impresion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturaImpresionModel facturaimpresionModel=new FacturaImpresionModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaImpresionModel.FacturaImpresionFocusTraversalPolicy facturaimpresionFocusTraversalPolicy = facturaimpresionModel.new FacturaImpresionFocusTraversalPolicy(this);
			
			//facturaimpresionFocusTraversalPolicy.setfacturaimpresionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturaimpresionModel);
			
			
			this.jContentPaneDetalleFacturaImpresion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturaImpresion = new GridBagLayout();	
			this.jContentPaneDetalleFacturaImpresion.setLayout(gridaBagLayoutDetalleFacturaImpresion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaImpresion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
				this.gridBagConstraintsFacturaImpresion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturaImpresion.gridx = 0;
					
				
				this.jContentPaneDetalleFacturaImpresion.add(jTtoolBarDetalleFacturaImpresion, gridBagConstraintsFacturaImpresion);								
				
}
			
			this.jScrollPanelDatosEdicionFacturaImpresion=   new JScrollPane(jContentPaneDetalleFacturaImpresion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaImpresion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaImpresion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaImpresion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturaImpresion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaImpresion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaImpresion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaImpresion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturaImpresion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturaImpresion.gridx = 0;
	        
			this.jContentPaneDetalleFacturaImpresion.add(jPanelCamposFacturaImpresion, gridBagConstraintsFacturaImpresion);
			
			
			
			
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
						&& facturaimpresionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturaimpresionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturaImpresion= new GridBagConstraints();
						this.gridBagConstraintsFacturaImpresion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturaImpresion.gridx = 0;
						this.jContentPaneDetalleFacturaImpresion.add(this.jTabbedPaneRelacionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturaImpresion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturaImpresion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
					this.gridBagConstraintsFacturaImpresion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturaImpresion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturaImpresion.gridx = 0;
					
				
					this.jContentPaneDetalleFacturaImpresion.add(jPanelCamposOcultosFacturaImpresion, gridBagConstraintsFacturaImpresion);
				
					this.jPanelCamposOcultosFacturaImpresion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturaImpresion.gridx = 0;
	        this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturaImpresion.add(this.jPanelAccionesFormularioFacturaImpresion, this.gridBagConstraintsFacturaImpresion);							
			
			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
	        this.gridBagConstraintsFacturaImpresion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturaImpresion.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturaImpresion.add(this.jPanelAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturaImpresion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturaImpresion=   new JScrollPane(this.jPanelCamposFacturaImpresion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaImpresion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaImpresion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaImpresion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturaImpresion.gridx = 0;
			this.gridBagConstraintsFacturaImpresion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturaImpresion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturaImpresion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaImpresion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturaImpresion, this.gridBagConstraintsFacturaImpresion);			
			
			this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
			this.gridBagConstraintsFacturaImpresion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaImpresion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
			
			
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		
			
		this.gridBagConstraintsFacturaImpresion = new GridBagConstraints();
		this.gridBagConstraintsFacturaImpresion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaImpresion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaImpresion, this.gridBagConstraintsFacturaImpresion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturaImpresion;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturaImpresion;
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
