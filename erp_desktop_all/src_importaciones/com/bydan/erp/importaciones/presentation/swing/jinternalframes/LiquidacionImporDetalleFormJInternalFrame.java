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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.LiquidacionImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class LiquidacionImporDetalleFormJInternalFrame extends LiquidacionImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleLiquidacionImpor;
	
	protected JMenuBar jmenuBarDetalleLiquidacionImpor;
	
	protected JMenu jmenuDetalleLiquidacionImpor;
	protected JMenu jmenuDetalleArchivoLiquidacionImpor;
	protected JMenu jmenuDetalleAccionesLiquidacionImpor;
	protected JMenu jmenuDetalleDatosLiquidacionImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutLiquidacionImpor;	
	protected GridBagConstraints gridBagConstraintsLiquidacionImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected LiquidacionImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleLiquidacionImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected PuertoBeanSwingJInternalFrame puertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_puerto="";
	
	public LiquidacionImporSessionBean liquidacionimporSessionBean;
	
	

	public DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=null;
	public DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleLiquidacionImpor=false;
	public DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public PaisSessionBean paisSessionBean;
	public PuertoSessionBean puertoSessionBean;	
	
	public LiquidacionImporLogic liquidacionimporLogic;
	
	public JScrollPane jScrollPanelDatosLiquidacionImpor;
	public JScrollPane jScrollPanelDatosEdicionLiquidacionImpor;
	public JScrollPane jScrollPanelDatosGeneralLiquidacionImpor;
	
	protected JPanel jPanelCamposLiquidacionImpor;    
	protected JPanel jPanelCamposOcultosLiquidacionImpor;    	
	protected JPanel jPanelAccionesLiquidacionImpor;
	protected JPanel jPanelAccionesFormularioLiquidacionImpor;
    
	
	
	protected Integer iXPanelCamposLiquidacionImpor=0;
	protected Integer iYPanelCamposLiquidacionImpor=0;
	
	protected Integer iXPanelCamposOcultosLiquidacionImpor=0;
	protected Integer iYPanelCamposOcultosLiquidacionImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoLiquidacionImpor;
	public JButton jButtonModificarLiquidacionImpor;
	public JButton jButtonActualizarLiquidacionImpor;
    public JButton jButtonEliminarLiquidacionImpor;
	public JButton jButtonCancelarLiquidacionImpor;
    public JButton jButtonGuardarCambiosLiquidacionImpor;
	public JButton jButtonGuardarCambiosTablaLiquidacionImpor;
	protected JButton jButtonCerrarLiquidacionImpor;
	
	
	protected JButton jButtonProcesarInformacionLiquidacionImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoLiquidacionImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarLiquidacionImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeLiquidacionImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarLiquidacionImpor;
	protected JButton jButtonModificarToolBarLiquidacionImpor;
	protected JButton jButtonActualizarToolBarLiquidacionImpor;
    protected JButton jButtonEliminarToolBarLiquidacionImpor;
	protected JButton jButtonCancelarToolBarLiquidacionImpor;
    protected JButton jButtonGuardarCambiosToolBarLiquidacionImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarLiquidacionImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarLiquidacionImpor;
	protected JButton jButtonCerrarToolBarLiquidacionImpor;
	
	protected JButton jButtonProcesarInformacionToolBarLiquidacionImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoLiquidacionImpor;
	protected JMenuItem jMenuItemModificarLiquidacionImpor;
	protected JMenuItem jMenuItemActualizarLiquidacionImpor;
    protected JMenuItem jMenuItemEliminarLiquidacionImpor;
	protected JMenuItem jMenuItemCancelarLiquidacionImpor;
    protected JMenuItem jMenuItemGuardarCambiosLiquidacionImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaLiquidacionImpor;
	protected JMenuItem jMenuItemCerrarLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleCerrarLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarLiquidacionImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionLiquidacionImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosLiquidacionImpor;
	protected JMenuItem jMenuItemMostrarOcultarLiquidacionImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesLiquidacionImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesLiquidacionImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioLiquidacionImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidLiquidacionImpor;
	public JLabel jLabelIdLiquidacionImpor;
	public JLabel jLabelidLiquidacionImpor;
	public JButton jButtonidLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelnombreLiquidacionImpor;
	public JLabel jLabelnombreLiquidacionImpor;
	public JTextArea jTextAreanombreLiquidacionImpor;
	public JScrollPane jscrollPanenombreLiquidacionImpor;
	public JButton jButtonnombreLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionLiquidacionImpor;
	public JLabel jLabeldescripcionLiquidacionImpor;
	public JTextArea jTextAreadescripcionLiquidacionImpor;
	public JScrollPane jscrollPanedescripcionLiquidacionImpor;
	public JButton jButtondescripcionLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelfechaLiquidacionImpor;
	public JLabel jLabelfechaLiquidacionImpor;
	//public JFormattedTextField jDateChooserfechaLiquidacionImpor;

	public JDateChooser jDateChooserfechaLiquidacionImpor;
	public JButton jButtonfechaLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelfecha_liquidacionLiquidacionImpor;
	public JLabel jLabelfecha_liquidacionLiquidacionImpor;
	//public JFormattedTextField jDateChooserfecha_liquidacionLiquidacionImpor;

	public JDateChooser jDateChooserfecha_liquidacionLiquidacionImpor;
	public JButton jButtonfecha_liquidacionLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelfleteLiquidacionImpor;
	public JLabel jLabelfleteLiquidacionImpor;
	public JTextField jTextFieldfleteLiquidacionImpor;
	public JButton jButtonfleteLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPaneltipoLiquidacionImpor;
	public JLabel jLabeltipoLiquidacionImpor;
	public JTextField jTextFieldtipoLiquidacionImpor;
	public JButton jButtontipoLiquidacionImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaLiquidacionImpor;
	public JLabel jLabelid_empresaLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaLiquidacionImpor;
	public JButton jButtonid_empresaLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_empresaLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalLiquidacionImpor;
	public JLabel jLabelid_sucursalLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalLiquidacionImpor;
	public JButton jButtonid_sucursalLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_sucursalLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoLiquidacionImpor;
	public JLabel jLabelid_centro_costoLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoLiquidacionImpor;
	public JButton jButtonid_centro_costoLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_centro_costoLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoLiquidacionImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoLiquidacionImporArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contableLiquidacionImpor;
	public JLabel jLabelid_cuenta_contableLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableLiquidacionImpor;
	public JButton jButtonid_cuenta_contableLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_cuenta_contableLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableLiquidacionImporBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableLiquidacionImporArbol= new JButtonMe();

	public JPanel jPanelid_paisLiquidacionImpor;
	public JLabel jLabelid_paisLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisLiquidacionImpor;
	public JButton jButtonid_paisLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_paisLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_paisLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_puertoLiquidacionImpor;
	public JLabel jLabelid_puertoLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_puertoLiquidacionImpor;
	public JButton jButtonid_puertoLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_puertoLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_puertoLiquidacionImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesLiquidacionImpor;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=484;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public LiquidacionImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposLiquidacionImpor=new JPanel();
				this.jPanelAccionesFormularioLiquidacionImpor=new JPanel();
				this.jmenuBarDetalleLiquidacionImpor=new JMenuBar();
				this.jTtoolBarDetalleLiquidacionImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public LiquidacionImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public LiquidacionImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("LiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarLiquidacionImpor() {
		return this.jButtonActualizarToolBarLiquidacionImpor;
	}
	
	public JButton getjButtonEliminarToolBarLiquidacionImpor() {
		return this.jButtonEliminarToolBarLiquidacionImpor;
	}
	
	public JButton getjButtonCancelarToolBarLiquidacionImpor() {
		return this.jButtonCancelarToolBarLiquidacionImpor;
	}		
	
	public JButton getjButtonProcesarInformacionLiquidacionImpor() {
		return this.jButtonProcesarInformacionLiquidacionImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionLiquidacionImpor)	{
		this.jButtonProcesarInformacionLiquidacionImpor = jButtonProcesarInformacionLiquidacionImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesLiquidacionImpor() {
		return this.jComboBoxTiposAccionesLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesLiquidacionImpor(
			JComboBox jComboBoxTiposRelacionesLiquidacionImpor) {
		this.jComboBoxTiposRelacionesLiquidacionImpor = jComboBoxTiposRelacionesLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesLiquidacionImpor(
			JComboBox jComboBoxTiposAccionesLiquidacionImpor) {
		this.jComboBoxTiposAccionesLiquidacionImpor = jComboBoxTiposAccionesLiquidacionImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioLiquidacionImpor() {
		return this.jComboBoxTiposAccionesFormularioLiquidacionImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioLiquidacionImpor(
			JComboBox jComboBoxTiposAccionesFormularioLiquidacionImpor) {
		this.jComboBoxTiposAccionesFormularioLiquidacionImpor = jComboBoxTiposAccionesFormularioLiquidacionImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		
		this.liquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.liquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.liquidacionimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		LiquidacionImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Liquidacion Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
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
	
		LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleLiquidacionImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarLiquidacionImpor=new JButtonMe();
				this.jButtonModificarToolBarLiquidacionImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"actualizar","actualizar","Actualizar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"eliminar","eliminar","Eliminar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"cancelar","cancelar","Cancelar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarLiquidacionImpor,this.jTtoolBarDetalleLiquidacionImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleLiquidacionImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleLiquidacionImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoLiquidacionImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesLiquidacionImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosLiquidacionImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoLiquidacionImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoLiquidacionImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoLiquidacionImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarLiquidacionImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarLiquidacionImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarLiquidacionImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarLiquidacionImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarLiquidacionImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarLiquidacionImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarLiquidacionImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarLiquidacionImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarLiquidacionImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarLiquidacionImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarLiquidacionImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarLiquidacionImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosLiquidacionImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosLiquidacionImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosLiquidacionImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarLiquidacionImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarLiquidacionImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarLiquidacionImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarLiquidacionImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarLiquidacionImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarLiquidacionImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoLiquidacionImpor.add(this.jMenuItemDetalleCerrarLiquidacionImpor);
		
		this.jmenuDetalleAccionesLiquidacionImpor.add(this.jMenuItemActualizarLiquidacionImpor);
		this.jmenuDetalleAccionesLiquidacionImpor.add(this.jMenuItemEliminarLiquidacionImpor);
		this.jmenuDetalleAccionesLiquidacionImpor.add(this.jMenuItemCancelarLiquidacionImpor);		
		
		//this.jmenuDetalleDatosLiquidacionImpor.add(this.jMenuItemDetalleAbrirOrderByLiquidacionImpor);				
		this.jmenuDetalleDatosLiquidacionImpor.add(this.jMenuItemDetalleMostarOcultarLiquidacionImpor);				
				
		//this.jmenuDetalleAccionesLiquidacionImpor.add(this.jMenuItemGuardarCambiosLiquidacionImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuDetalleArchivoLiquidacionImpor);		
		this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuDetalleAccionesLiquidacionImpor);		
		this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuDetalleDatosLiquidacionImpor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleLiquidacionImpor.add(this.jmenuDetalleLiquidacionImpor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleLiquidacionImpor);				
	}
	
	
	public void inicializarElementosCamposLiquidacionImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdLiquidacionImpor = new JLabelMe();
		jLabelIdLiquidacionImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidLiquidacionImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutLiquidacionImpor= new GridBagLayout();

		this.jPanelidLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);

		jLabelidLiquidacionImpor = new JLabel();
		jLabelidLiquidacionImpor.setText("Id");

		jLabelidLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreLiquidacionImpor = new JLabelMe();
		this.jLabelnombreLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreLiquidacionImpor.setToolTipText("Nombre");
		this.jLabelnombreLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelnombreLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jTextAreanombreLiquidacionImpor= new JTextAreaMe();
		jTextAreanombreLiquidacionImpor.setEnabled(false);
		jTextAreanombreLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreLiquidacionImpor.setLineWrap(true);
		jTextAreanombreLiquidacionImpor.setWrapStyleWord(true);
		jTextAreanombreLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreLiquidacionImpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreLiquidacionImpor = new JScrollPane(jTextAreanombreLiquidacionImpor);
		jscrollPanenombreLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonnombreLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreLiquidacionImporBusqueda.setText("U");
		this.jButtonnombreLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionLiquidacionImpor = new JLabelMe();
		this.jLabeldescripcionLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionLiquidacionImpor.setToolTipText("Descripcion");
		this.jLabeldescripcionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPaneldescripcionLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jTextAreadescripcionLiquidacionImpor= new JTextAreaMe();
		jTextAreadescripcionLiquidacionImpor.setEnabled(false);
		jTextAreadescripcionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionLiquidacionImpor.setLineWrap(true);
		jTextAreadescripcionLiquidacionImpor.setWrapStyleWord(true);
		jTextAreadescripcionLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionLiquidacionImpor.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionLiquidacionImpor = new JScrollPane(jTextAreadescripcionLiquidacionImpor);
		jscrollPanedescripcionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionLiquidacionImporBusqueda= new JButtonMe();
		this.jButtondescripcionLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionLiquidacionImporBusqueda.setText("U");
		this.jButtondescripcionLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelfechaLiquidacionImpor = new JLabelMe();
		this.jLabelfechaLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaLiquidacionImpor.setToolTipText("Fecha");
		this.jLabelfechaLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelfechaLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		//jFormattedTextFieldfechaLiquidacionImpor= new JFormattedTextFieldMe();

		jDateChooserfechaLiquidacionImpor= new JDateChooser();
		jDateChooserfechaLiquidacionImpor.setEnabled(false);
		jDateChooserfechaLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaLiquidacionImpor.setDate(new Date());
		jDateChooserfechaLiquidacionImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaLiquidacionImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonfechaLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaLiquidacionImporBusqueda.setText("U");
		this.jButtonfechaLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelfecha_liquidacionLiquidacionImpor = new JLabelMe();
		this.jLabelfecha_liquidacionLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION+" : *");
		this.jLabelfecha_liquidacionLiquidacionImpor.setToolTipText("Fecha Liquacion");
		this.jLabelfecha_liquidacionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_liquidacionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_liquidacionLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_liquidacionLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_liquidacionLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_FECHALIQUIDACION);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelfecha_liquidacionLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		//jFormattedTextFieldfecha_liquidacionLiquidacionImpor= new JFormattedTextFieldMe();

		jDateChooserfecha_liquidacionLiquidacionImpor= new JDateChooser();
		jDateChooserfecha_liquidacionLiquidacionImpor.setEnabled(false);
		jDateChooserfecha_liquidacionLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_liquidacionLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_liquidacionLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_liquidacionLiquidacionImpor.setDate(new Date());
		jDateChooserfecha_liquidacionLiquidacionImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_liquidacionLiquidacionImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_liquidacionLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setText("U");
		this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_liquidacionLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_liquidacionLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_liquidacionLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_liquidacionLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_liquidacionLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelfleteLiquidacionImpor = new JLabelMe();
		this.jLabelfleteLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteLiquidacionImpor.setToolTipText("Flete");
		this.jLabelfleteLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelfleteLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jTextFieldfleteLiquidacionImpor= new JTextFieldMe();
		jTextFieldfleteLiquidacionImpor.setEnabled(false);
		jTextFieldfleteLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteLiquidacionImpor.setText("0.0");

		this.jButtonfleteLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonfleteLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteLiquidacionImporBusqueda.setText("U");
		this.jButtonfleteLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabeltipoLiquidacionImpor = new JLabelMe();
		this.jLabeltipoLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoLiquidacionImpor.setToolTipText("Tipo");
		this.jLabeltipoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPaneltipoLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jTextFieldtipoLiquidacionImpor= new JTextFieldMe();

		jTextFieldtipoLiquidacionImpor.setEnabled(false);
		jTextFieldtipoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoLiquidacionImporBusqueda= new JButtonMe();
		this.jButtontipoLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoLiquidacionImporBusqueda.setText("U");
		this.jButtontipoLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoLiquidacionImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysLiquidacionImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaLiquidacionImpor = new JLabelMe();
		this.jLabelid_empresaLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaLiquidacionImpor.setToolTipText("Empresa");
		this.jLabelid_empresaLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelid_empresaLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jComboBoxid_empresaLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_empresaLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaLiquidacionImpor.setEnabled(false);

		this.jButtonid_empresaLiquidacionImpor= new JButtonMe();
		this.jButtonid_empresaLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaLiquidacionImpor.setText("Buscar");
		this.jButtonid_empresaLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLiquidacionImpor"));

		this.jButtonid_empresaLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_empresaLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLiquidacionImporBusqueda.setText("U");
		this.jButtonid_empresaLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_empresaLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaLiquidacionImporUpdate.setText("U");
		this.jButtonid_empresaLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaLiquidacionImporUpdate"));



					
		this.jLabelid_sucursalLiquidacionImpor = new JLabelMe();
		this.jLabelid_sucursalLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalLiquidacionImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelid_sucursalLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jComboBoxid_sucursalLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_sucursalLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalLiquidacionImpor.setEnabled(false);

		this.jButtonid_sucursalLiquidacionImpor= new JButtonMe();
		this.jButtonid_sucursalLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalLiquidacionImpor.setText("Buscar");
		this.jButtonid_sucursalLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLiquidacionImpor"));

		this.jButtonid_sucursalLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalLiquidacionImporBusqueda.setText("U");
		this.jButtonid_sucursalLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_sucursalLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalLiquidacionImporUpdate.setText("U");
		this.jButtonid_sucursalLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalLiquidacionImporUpdate"));



					
		this.jLabelid_centro_costoLiquidacionImpor = new JLabelMe();
		this.jLabelid_centro_costoLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoLiquidacionImpor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelid_centro_costoLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jComboBoxid_centro_costoLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_centro_costoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoLiquidacionImpor= new JButtonMe();
		this.jButtonid_centro_costoLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoLiquidacionImpor.setText("Buscar");
		this.jButtonid_centro_costoLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoLiquidacionImpor"));

		this.jButtonid_centro_costoLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_centro_costoLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoLiquidacionImporBusqueda.setText("U");
		this.jButtonid_centro_costoLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_centro_costoLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoLiquidacionImporUpdate.setText("U");
		this.jButtonid_centro_costoLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoLiquidacionImporUpdate"));


		jButtonid_centro_costoLiquidacionImporArbol= new JButtonMe();
		jButtonid_centro_costoLiquidacionImporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoLiquidacionImporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoLiquidacionImporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoLiquidacionImporArbol.setText("Arbol");
		jButtonid_centro_costoLiquidacionImporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoLiquidacionImporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoLiquidacionImporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoLiquidacionImporArbol"));



					
		this.jLabelid_cuenta_contableLiquidacionImpor = new JLabelMe();
		this.jLabelid_cuenta_contableLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableLiquidacionImpor.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelid_cuenta_contableLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jComboBoxid_cuenta_contableLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_cuenta_contableLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableLiquidacionImpor= new JButtonMe();
		this.jButtonid_cuenta_contableLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableLiquidacionImpor.setText("Buscar");
		this.jButtonid_cuenta_contableLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableLiquidacionImpor"));

		this.jButtonid_cuenta_contableLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setText("U");
		this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableLiquidacionImporUpdate.setText("U");
		this.jButtonid_cuenta_contableLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableLiquidacionImporUpdate"));


		jButtonid_cuenta_contableLiquidacionImporArbol= new JButtonMe();
		jButtonid_cuenta_contableLiquidacionImporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableLiquidacionImporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableLiquidacionImporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableLiquidacionImporArbol.setText("Arbol");
		jButtonid_cuenta_contableLiquidacionImporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableLiquidacionImporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableLiquidacionImporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableLiquidacionImporArbol"));



					
		this.jLabelid_paisLiquidacionImpor = new JLabelMe();
		this.jLabelid_paisLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisLiquidacionImpor.setToolTipText("Pais");
		this.jLabelid_paisLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelid_paisLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jComboBoxid_paisLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_paisLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisLiquidacionImpor= new JButtonMe();
		this.jButtonid_paisLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisLiquidacionImpor.setText("Buscar");
		this.jButtonid_paisLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisLiquidacionImpor"));

		this.jButtonid_paisLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_paisLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisLiquidacionImporBusqueda.setText("U");
		this.jButtonid_paisLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_paisLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_paisLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisLiquidacionImporUpdate.setText("U");
		this.jButtonid_paisLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisLiquidacionImporUpdate"));



					
		this.jLabelid_puertoLiquidacionImpor = new JLabelMe();
		this.jLabelid_puertoLiquidacionImpor.setText(""+LiquidacionImporConstantesFunciones.LABEL_IDPUERTO+" : *");
		this.jLabelid_puertoLiquidacionImpor.setToolTipText("Puerto");
		this.jLabelid_puertoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puertoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_puertoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_puertoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_puertoLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_puertoLiquidacionImpor.setToolTipText(LiquidacionImporConstantesFunciones.LABEL_IDPUERTO);
		this.gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		this.jPanelid_puertoLiquidacionImpor.setLayout(this.gridaBagLayoutLiquidacionImpor);


		jComboBoxid_puertoLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_puertoLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_puertoLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_puertoLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_puertoLiquidacionImpor= new JButtonMe();
		this.jButtonid_puertoLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_puertoLiquidacionImpor.setText("Buscar");
		this.jButtonid_puertoLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_puertoLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_puertoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoLiquidacionImpor"));

		this.jButtonid_puertoLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_puertoLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puertoLiquidacionImporBusqueda.setText("U");
		this.jButtonid_puertoLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_puertoLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_puertoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoLiquidacionImporBusqueda"));

		if(this.liquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_puertoLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_puertoLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_puertoLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_puertoLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_puertoLiquidacionImporUpdate.setText("U");
		this.jButtonid_puertoLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_puertoLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_puertoLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_puertoLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_puertoLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_puertoLiquidacionImporUpdate"));



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
		//this.jInternalFrameDetalleLiquidacionImpor = new LiquidacionImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Liquidacion Impor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutLiquidacionImpor= new GridBagLayout();
		

		
		String sToolTipLiquidacionImpor="";
		sToolTipLiquidacionImpor=LiquidacionImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipLiquidacionImpor+="(Importaciones.LiquidacionImpor)";
		}
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipLiquidacionImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoLiquidacionImpor = new JButtonMe();
		this.jButtonModificarLiquidacionImpor = new JButtonMe();
        this.jButtonActualizarLiquidacionImpor = new JButtonMe();
        this.jButtonEliminarLiquidacionImpor = new JButtonMe();
        this.jButtonCancelarLiquidacionImpor = new JButtonMe();
        this.jButtonGuardarCambiosLiquidacionImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarLiquidacionImpor = new JButtonMe();
		
		this.jScrollPanelDatosLiquidacionImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionLiquidacionImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralLiquidacionImpor = new JScrollPane();
				
		
		
		this.jPanelCamposLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Liquidacion Impor";
		
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Liquidacion Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposLiquidacionImpor.setName("jPanelCamposLiquidacionImpor"); 

		this.jPanelCamposOcultosLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosLiquidacionImpor.setName("jPanelCamposOcultosLiquidacionImpor"); 

        this.jPanelAccionesLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesLiquidacionImpor.setToolTipText("Acciones");
        this.jPanelAccionesLiquidacionImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioLiquidacionImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioLiquidacionImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoLiquidacionImpor.setText("Nuevo");
		this.jButtonModificarLiquidacionImpor.setText("Editar");
        this.jButtonActualizarLiquidacionImpor.setText("Actualizar");
        this.jButtonEliminarLiquidacionImpor.setText("Eliminar");
        this.jButtonCancelarLiquidacionImpor.setText("Cancelar");
        this.jButtonGuardarCambiosLiquidacionImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaLiquidacionImpor.setText("Guardar");
		this.jButtonCerrarLiquidacionImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoLiquidacionImpor,"nuevo_button","Nuevo",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarLiquidacionImpor,"modificar_button","Editar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarLiquidacionImpor,"actualizar_button","Actualizar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarLiquidacionImpor,"eliminar_button","Eliminar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarLiquidacionImpor,"cancelar_button","Cancelar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosLiquidacionImpor,"guardarcambios_button","Guardar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaLiquidacionImpor,"guardarcambiostabla_button","Guardar",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarLiquidacionImpor,"cerrar_button","Salir",this.liquidacionimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoLiquidacionImpor.setToolTipText("Nuevo"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarLiquidacionImpor.setToolTipText("Editar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarLiquidacionImpor.setToolTipText("Actualizar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarLiquidacionImpor.setToolTipText("Eliminar)"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarLiquidacionImpor.setToolTipText("Cancelar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosLiquidacionImpor.setToolTipText("Guardar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaLiquidacionImpor.setToolTipText("Guardar"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarLiquidacionImpor.setToolTipText("Salir"+" "+LiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoLiquidacionImpor";
		inputMap = this.jButtonNuevoLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoLiquidacionImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarLiquidacionImpor";
		inputMap = this.jButtonActualizarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarLiquidacionImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarLiquidacionImpor";
		inputMap = this.jButtonEliminarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarLiquidacionImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarLiquidacionImpor";
		inputMap = this.jButtonCancelarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarLiquidacionImpor"));
		
		//CERRAR		
		sMapKey = "CerrarLiquidacionImpor";
		inputMap = this.jButtonCerrarLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarLiquidacionImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaLiquidacionImpor";
		inputMap = this.jButtonGuardarCambiosTablaLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaLiquidacionImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoLiquidacionImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoLiquidacionImpor.setToolTipText("Nuevo LiquidacionImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarLiquidacionImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarLiquidacionImpor.setToolTipText("Sin Cerrar Ventana LiquidacionImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeLiquidacionImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeLiquidacionImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposAccionesLiquidacionImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioLiquidacionImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioLiquidacionImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesLiquidacionImpor = new JLabelMe();
		
		this.jLabelAccionesLiquidacionImpor.setText("Acciones");		
		this.jLabelAccionesLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposLiquidacionImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysLiquidacionImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesLiquidacionImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioLiquidacionImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposLiquidacionImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosLiquidacionImpor = new GridBagLayout();
		
		this.jPanelCamposLiquidacionImpor.setLayout(gridaBagLayoutCamposLiquidacionImpor);
		this.jPanelCamposOcultosLiquidacionImpor.setLayout(gridaBagLayoutCamposOcultosLiquidacionImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidLiquidacionImpor.add(jLabelIdLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidLiquidacionImpor.add(jLabelidLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaLiquidacionImpor.add(jLabelid_empresaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLiquidacionImpor.add(jButtonid_empresaLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaLiquidacionImpor.add(jButtonid_empresaLiquidacionImporUpdate, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaLiquidacionImpor.add(jComboBoxid_empresaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalLiquidacionImpor.add(jLabelid_sucursalLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalLiquidacionImpor.add(jButtonid_sucursalLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalLiquidacionImpor.add(jButtonid_sucursalLiquidacionImporUpdate, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalLiquidacionImpor.add(jComboBoxid_sucursalLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoLiquidacionImpor.add(jLabelid_centro_costoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoLiquidacionImpor.add(jButtonid_centro_costoLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoLiquidacionImpor.add(jButtonid_centro_costoLiquidacionImporUpdate, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoLiquidacionImpor.add(jComboBoxid_centro_costoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableLiquidacionImpor.add(jLabelid_cuenta_contableLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableLiquidacionImpor.add(jButtonid_cuenta_contableLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableLiquidacionImpor.add(jButtonid_cuenta_contableLiquidacionImporUpdate, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableLiquidacionImpor.add(jComboBoxid_cuenta_contableLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisLiquidacionImpor.add(jLabelid_paisLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisLiquidacionImpor.add(jButtonid_paisLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisLiquidacionImpor.add(jButtonid_paisLiquidacionImporUpdate, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisLiquidacionImpor.add(jComboBoxid_paisLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_puertoLiquidacionImpor.add(jLabelid_puertoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puertoLiquidacionImpor.add(jButtonid_puertoLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_puertoLiquidacionImpor.add(jButtonid_puertoLiquidacionImporUpdate, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_puertoLiquidacionImpor.add(jComboBoxid_puertoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreLiquidacionImpor.add(jLabelnombreLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreLiquidacionImpor.add(jButtonnombreLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreLiquidacionImpor.add(jscrollPanenombreLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionLiquidacionImpor.add(jLabeldescripcionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionLiquidacionImpor.add(jButtondescripcionLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionLiquidacionImpor.add(jscrollPanedescripcionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaLiquidacionImpor.add(jLabelfechaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaLiquidacionImpor.add(jButtonfechaLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaLiquidacionImpor.add(jDateChooserfechaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_liquidacionLiquidacionImpor.add(jLabelfecha_liquidacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_liquidacionLiquidacionImpor.add(jButtonfecha_liquidacionLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_liquidacionLiquidacionImpor.add(jDateChooserfecha_liquidacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteLiquidacionImpor.add(jLabelfleteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteLiquidacionImpor.add(jButtonfleteLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteLiquidacionImpor.add(jTextFieldfleteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoLiquidacionImpor.add(jLabeltipoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoLiquidacionImpor.add(jButtontipoLiquidacionImporBusqueda, this.gridBagConstraintsLiquidacionImpor);
	}

	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoLiquidacionImpor.add(jTextFieldtipoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelidLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelid_centro_costoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelid_cuenta_contableLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelid_paisLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelid_puertoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelnombreLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPaneldescripcionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelfechaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelfecha_liquidacionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPanelfleteLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposLiquidacionImpor.add(this.jPaneltipoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposLiquidacionImpor % 2==0) {
		iXPanelCamposLiquidacionImpor=0;
		iYPanelCamposLiquidacionImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposOcultosLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposOcultosLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLiquidacionImpor.add(this.jPanelid_empresaLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposOcultosLiquidacionImpor % 2==0) {
		iXPanelCamposOcultosLiquidacionImpor=0;
		iYPanelCamposOcultosLiquidacionImpor++;
	}
	this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsLiquidacionImpor.gridy = iYPanelCamposOcultosLiquidacionImpor;
	this.gridBagConstraintsLiquidacionImpor.gridx = iXPanelCamposOcultosLiquidacionImpor++;
	this.gridBagConstraintsLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosLiquidacionImpor.add(this.jPanelid_sucursalLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);



	if(iXPanelCamposOcultosLiquidacionImpor % 2==0) {
		iXPanelCamposOcultosLiquidacionImpor=0;
		iYPanelCamposOcultosLiquidacionImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesLiquidacionImpor= new GridBagLayout();
		this.jPanelAccionesLiquidacionImpor.setLayout(gridaBagLayoutAccionesLiquidacionImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioLiquidacionImpor= new GridBagLayout();
		this.jPanelAccionesFormularioLiquidacionImpor.setLayout(gridaBagLayoutAccionesFormularioLiquidacionImpor);
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLiquidacionImpor.add(this.jComboBoxTiposAccionesFormularioLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioLiquidacionImpor.add(this.jCheckBoxPostAccionNuevoLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLiquidacionImpor.add(this.jCheckBoxPostAccionSinCerrarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.liquidacionimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.liquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioLiquidacionImpor.add(this.jCheckBoxPostAccionSinMensajeLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesLiquidacionImpor.add(this.jButtonModificarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);							

		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsLiquidacionImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesLiquidacionImpor.add(this.jButtonEliminarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesLiquidacionImpor.add(this.jButtonActualizarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);


		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;		
		this.gridBagConstraintsLiquidacionImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesLiquidacionImpor.add(this.jButtonGuardarCambiosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);	
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = 0;		
		this.gridBagConstraintsLiquidacionImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesLiquidacionImpor.add(this.jButtonCancelarLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutLiquidacionImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutLiquidacionImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();						
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;		
			//this.gridBagConstraintsLiquidacionImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsLiquidacionImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsLiquidacionImpor.gridx =0;
		this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsLiquidacionImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(LiquidacionImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleLiquidacionImpor = new LiquidacionImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Liquidacion Impor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Liquidacion Impor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Liquidacion Impor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			LiquidacionImporModel liquidacionimporModel=new LiquidacionImporModel(this);
			
			//SI USARA CLASE INTERNA
			//LiquidacionImporModel.LiquidacionImporFocusTraversalPolicy liquidacionimporFocusTraversalPolicy = liquidacionimporModel.new LiquidacionImporFocusTraversalPolicy(this);
			
			//liquidacionimporFocusTraversalPolicy.setliquidacionimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(liquidacionimporModel);
			
			
			this.jContentPaneDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();	
			this.jContentPaneDetalleLiquidacionImpor.setLayout(gridaBagLayoutDetalleLiquidacionImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosLiquidacionImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsLiquidacionImpor.gridx = 0;
					
				
				this.jContentPaneDetalleLiquidacionImpor.add(jTtoolBarDetalleLiquidacionImpor, gridBagConstraintsLiquidacionImpor);								
				
}
			
			this.jScrollPanelDatosEdicionLiquidacionImpor=   new JScrollPane(jContentPaneDetalleLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralLiquidacionImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	        
			this.jContentPaneDetalleLiquidacionImpor.add(jPanelCamposLiquidacionImpor, gridBagConstraintsLiquidacionImpor);
			
			
			
			
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
						&& liquidacionimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(this.puedeCargarPorParteDetalleLiquidacionImpor,false,-1);
					
					if(this.liquidacionimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsLiquidacionImpor= new GridBagConstraints();
						this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsLiquidacionImpor.gridx = 0;
						this.jContentPaneDetalleLiquidacionImpor.add(this.jTabbedPaneRelacionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesLiquidacionImpor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosLiquidacionImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
					this.gridBagConstraintsLiquidacionImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsLiquidacionImpor.gridx = 0;
					
				
					this.jContentPaneDetalleLiquidacionImpor.add(jPanelCamposOcultosLiquidacionImpor, gridBagConstraintsLiquidacionImpor);
				
					this.jPanelCamposOcultosLiquidacionImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	        this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleLiquidacionImpor.add(this.jPanelAccionesFormularioLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);							
			
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
	        this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsLiquidacionImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleLiquidacionImpor.add(this.jPanelAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionLiquidacionImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionLiquidacionImpor=   new JScrollPane(this.jPanelCamposLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;
			this.gridBagConstraintsLiquidacionImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsLiquidacionImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsLiquidacionImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);			
			
			this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsLiquidacionImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsLiquidacionImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
			
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		
			
		this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsLiquidacionImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsLiquidacionImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesLiquidacionImpor, this.gridBagConstraintsLiquidacionImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralLiquidacionImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionLiquidacionImpor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(false);
		this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);

		this.detalleliquidacionimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleliquidacionimporBeanSwingJInternalFramePopup=new DetalleLiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleliquidacionimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {

				DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);

				this.detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleliquidacionimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleliquidacionimporBeanSwingJInternalFrame.setdetalleliquidacionimporSessionBean(this.detalleliquidacionimporSessionBean);

				//this.gridBagConstraintsLiquidacionImpor = new GridBagConstraints();
				//this.gridBagConstraintsLiquidacionImpor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsLiquidacionImpor.gridx = 0;
				//this.jContentPaneDetalleLiquidacionImpor.add(this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsLiquidacionImpor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesLiquidacionImpor.add("Detalle Liquidacion Impores",this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesLiquidacionImpor.setComponentAt(iIndexTab,this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
				this.detalleliquidacionimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleLiquidacionImpor) {
					this.jTabbedPaneRelacionesLiquidacionImpor.add("Detalle Liquidacion Impores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleLiquidacionImporBeanSwingJInternalFrame(List<LiquidacionImpor> liquidacionimpors,LiquidacionImpor liquidacionimpor,DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleliquidacionimporBeanSwingJInternalFrame.getDetalleLiquidacionImporLogic().setConnexion(this.liquidacionimporLogic.getConnexion());

					detalleliquidacionimporBeanSwingJInternalFrame.setliquidacionimporsForeignKey(liquidacionimpors);
					detalleliquidacionimporBeanSwingJInternalFrame.setliquidacionimporForeignKey(liquidacionimpor);
					detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionLiquidacionImpor(true);
					detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setlidLiquidacionImporActual(liquidacionimpor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleliquidacionimporBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleLiquidacionImpor(detalleliquidacionimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleliquidacionimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaLiquidacionImpor(true);
					detalleliquidacionimporBeanSwingJInternalFrame.setid_liquidacion_imporFK_IdLiquidacionImpor(liquidacionimpor.getId());

					if(!this.conCargarFormDetalle) {
						detalleliquidacionimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleliquidacionimporBeanSwingJInternalFrame.setSelectedItemCombosFrameLiquidacionImporForeignKey(liquidacionimpor,1,false,true,true);
					detalleliquidacionimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleliquidacionimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdLiquidacionImpor");
					detalleliquidacionimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdLiquidacionImpor");
					detalleliquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleLiquidacionImpor(true);
					detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleLiquidacionImpor("n",detalleliquidacionimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleliquidacionimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleliquidacionimporBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleliquidacionimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpor("relacionado");
					} else {
						detalleliquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleLiquidacionImpor("no_relacionado");
					}

					detalleliquidacionimporBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleLiquidacionImpor().setVisible(false);

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
