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

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.importaciones.util.CostoGastoImporConstantesFunciones;

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
public class CostoGastoImporDetalleFormJInternalFrame extends CostoGastoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCostoGastoImpor;
	
	protected JMenuBar jmenuBarDetalleCostoGastoImpor;
	
	protected JMenu jmenuDetalleCostoGastoImpor;
	protected JMenu jmenuDetalleArchivoCostoGastoImpor;
	protected JMenu jmenuDetalleAccionesCostoGastoImpor;
	protected JMenu jmenuDetalleDatosCostoGastoImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCostoGastoImpor;	
	protected GridBagConstraints gridBagConstraintsCostoGastoImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CostoGastoImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleCostoGastoImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoCostoGastoImporBeanSwingJInternalFrame tipocostogastoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocostogastoimpor="";
	
	public CostoGastoImporSessionBean costogastoimporSessionBean;
	
	

	public DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame=null;
	public DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleLiquidacionImpor=false;
	public DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoCostoGastoImporSessionBean tipocostogastoimporSessionBean;	
	
	public CostoGastoImporLogic costogastoimporLogic;
	
	public JScrollPane jScrollPanelDatosCostoGastoImpor;
	public JScrollPane jScrollPanelDatosEdicionCostoGastoImpor;
	public JScrollPane jScrollPanelDatosGeneralCostoGastoImpor;
	
	protected JPanel jPanelCamposCostoGastoImpor;    
	protected JPanel jPanelCamposOcultosCostoGastoImpor;    	
	protected JPanel jPanelAccionesCostoGastoImpor;
	protected JPanel jPanelAccionesFormularioCostoGastoImpor;
    
	
	
	protected Integer iXPanelCamposCostoGastoImpor=0;
	protected Integer iYPanelCamposCostoGastoImpor=0;
	
	protected Integer iXPanelCamposOcultosCostoGastoImpor=0;
	protected Integer iYPanelCamposOcultosCostoGastoImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCostoGastoImpor;
	public JButton jButtonModificarCostoGastoImpor;
	public JButton jButtonActualizarCostoGastoImpor;
    public JButton jButtonEliminarCostoGastoImpor;
	public JButton jButtonCancelarCostoGastoImpor;
    public JButton jButtonGuardarCambiosCostoGastoImpor;
	public JButton jButtonGuardarCambiosTablaCostoGastoImpor;
	protected JButton jButtonCerrarCostoGastoImpor;
	
	
	protected JButton jButtonProcesarInformacionCostoGastoImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCostoGastoImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCostoGastoImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCostoGastoImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCostoGastoImpor;
	protected JButton jButtonModificarToolBarCostoGastoImpor;
	protected JButton jButtonActualizarToolBarCostoGastoImpor;
    protected JButton jButtonEliminarToolBarCostoGastoImpor;
	protected JButton jButtonCancelarToolBarCostoGastoImpor;
    protected JButton jButtonGuardarCambiosToolBarCostoGastoImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarCostoGastoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarCostoGastoImpor;
	protected JButton jButtonCerrarToolBarCostoGastoImpor;
	
	protected JButton jButtonProcesarInformacionToolBarCostoGastoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCostoGastoImpor;
	protected JMenuItem jMenuItemModificarCostoGastoImpor;
	protected JMenuItem jMenuItemActualizarCostoGastoImpor;
    protected JMenuItem jMenuItemEliminarCostoGastoImpor;
	protected JMenuItem jMenuItemCancelarCostoGastoImpor;
    protected JMenuItem jMenuItemGuardarCambiosCostoGastoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaCostoGastoImpor;
	protected JMenuItem jMenuItemCerrarCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleCerrarCostoGastoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarCostoGastoImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionCostoGastoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCostoGastoImpor;
	protected JMenuItem jMenuItemMostrarOcultarCostoGastoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCostoGastoImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCostoGastoImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCostoGastoImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCostoGastoImpor;
	public JLabel jLabelIdCostoGastoImpor;
	public JLabel jLabelidCostoGastoImpor;
	public JButton jButtonidCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelnombreCostoGastoImpor;
	public JLabel jLabelnombreCostoGastoImpor;
	public JTextArea jTextAreanombreCostoGastoImpor;
	public JScrollPane jscrollPanenombreCostoGastoImpor;
	public JButton jButtonnombreCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPaneles_activoCostoGastoImpor;
	public JLabel jLabeles_activoCostoGastoImpor;
	public JCheckBox jCheckBoxes_activoCostoGastoImpor;
	public JButton jButtones_activoCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_agrupaCostoGastoImpor;
	public JLabel jLabelcon_agrupaCostoGastoImpor;
	public JCheckBox jCheckBoxcon_agrupaCostoGastoImpor;
	public JButton jButtoncon_agrupaCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_prorrateaCostoGastoImpor;
	public JLabel jLabelcon_prorrateaCostoGastoImpor;
	public JCheckBox jCheckBoxcon_prorrateaCostoGastoImpor;
	public JButton jButtoncon_prorrateaCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_facturaCostoGastoImpor;
	public JLabel jLabelcon_facturaCostoGastoImpor;
	public JCheckBox jCheckBoxcon_facturaCostoGastoImpor;
	public JButton jButtoncon_facturaCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_fleteCostoGastoImpor;
	public JLabel jLabelcon_fleteCostoGastoImpor;
	public JCheckBox jCheckBoxcon_fleteCostoGastoImpor;
	public JButton jButtoncon_fleteCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_arancelCostoGastoImpor;
	public JLabel jLabelcon_arancelCostoGastoImpor;
	public JCheckBox jCheckBoxcon_arancelCostoGastoImpor;
	public JButton jButtoncon_arancelCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_seguroCostoGastoImpor;
	public JLabel jLabelcon_seguroCostoGastoImpor;
	public JCheckBox jCheckBoxcon_seguroCostoGastoImpor;
	public JButton jButtoncon_seguroCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_total_generalCostoGastoImpor;
	public JLabel jLabelcon_total_generalCostoGastoImpor;
	public JCheckBox jCheckBoxcon_total_generalCostoGastoImpor;
	public JButton jButtoncon_total_generalCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelcon_digitadoCostoGastoImpor;
	public JLabel jLabelcon_digitadoCostoGastoImpor;
	public JCheckBox jCheckBoxcon_digitadoCostoGastoImpor;
	public JButton jButtoncon_digitadoCostoGastoImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCostoGastoImpor;
	public JLabel jLabelid_empresaCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCostoGastoImpor;
	public JButton jButtonid_empresaCostoGastoImpor= new JButtonMe();
	public JButton jButtonid_empresaCostoGastoImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCostoGastoImpor;
	public JLabel jLabelid_sucursalCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCostoGastoImpor;
	public JButton jButtonid_sucursalCostoGastoImpor= new JButtonMe();
	public JButton jButtonid_sucursalCostoGastoImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCostoGastoImporBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_costo_gasto_imporCostoGastoImpor;
	public JLabel jLabelid_tipo_costo_gasto_imporCostoGastoImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor;
	public JButton jButtonid_tipo_costo_gasto_imporCostoGastoImpor= new JButtonMe();
	public JButton jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCostoGastoImpor;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CostoGastoImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCostoGastoImpor=new JPanel();
				this.jPanelAccionesFormularioCostoGastoImpor=new JPanel();
				this.jmenuBarDetalleCostoGastoImpor=new JMenuBar();
				this.jTtoolBarDetalleCostoGastoImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CostoGastoImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CostoGastoImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CostoGastoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCostoGastoImpor() {
		return this.jButtonActualizarToolBarCostoGastoImpor;
	}
	
	public JButton getjButtonEliminarToolBarCostoGastoImpor() {
		return this.jButtonEliminarToolBarCostoGastoImpor;
	}
	
	public JButton getjButtonCancelarToolBarCostoGastoImpor() {
		return this.jButtonCancelarToolBarCostoGastoImpor;
	}		
	
	public JButton getjButtonProcesarInformacionCostoGastoImpor() {
		return this.jButtonProcesarInformacionCostoGastoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCostoGastoImpor)	{
		this.jButtonProcesarInformacionCostoGastoImpor = jButtonProcesarInformacionCostoGastoImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCostoGastoImpor() {
		return this.jComboBoxTiposAccionesCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCostoGastoImpor(
			JComboBox jComboBoxTiposRelacionesCostoGastoImpor) {
		this.jComboBoxTiposRelacionesCostoGastoImpor = jComboBoxTiposRelacionesCostoGastoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCostoGastoImpor(
			JComboBox jComboBoxTiposAccionesCostoGastoImpor) {
		this.jComboBoxTiposAccionesCostoGastoImpor = jComboBoxTiposAccionesCostoGastoImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCostoGastoImpor() {
		return this.jComboBoxTiposAccionesFormularioCostoGastoImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCostoGastoImpor(
			JComboBox jComboBoxTiposAccionesFormularioCostoGastoImpor) {
		this.jComboBoxTiposAccionesFormularioCostoGastoImpor = jComboBoxTiposAccionesFormularioCostoGastoImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.costogastoimporSessionBean=new CostoGastoImporSessionBean();
		
		this.costogastoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.costogastoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.costogastoimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CostoGastoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Costo Gasto Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
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
	
		CostoGastoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCostoGastoImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCostoGastoImpor=new JButtonMe();
				this.jButtonModificarToolBarCostoGastoImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCostoGastoImpor,this.jTtoolBarDetalleCostoGastoImpor,
							"actualizar","actualizar","Actualizar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCostoGastoImpor,this.jTtoolBarDetalleCostoGastoImpor,
							"eliminar","eliminar","Eliminar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCostoGastoImpor,this.jTtoolBarDetalleCostoGastoImpor,
							"cancelar","cancelar","Cancelar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCostoGastoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCostoGastoImpor,this.jTtoolBarDetalleCostoGastoImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCostoGastoImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCostoGastoImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCostoGastoImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCostoGastoImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCostoGastoImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCostoGastoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCostoGastoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCostoGastoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCostoGastoImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCostoGastoImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCostoGastoImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCostoGastoImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCostoGastoImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCostoGastoImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCostoGastoImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCostoGastoImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCostoGastoImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCostoGastoImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCostoGastoImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCostoGastoImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCostoGastoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCostoGastoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCostoGastoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCostoGastoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCostoGastoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCostoGastoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCostoGastoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCostoGastoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCostoGastoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCostoGastoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCostoGastoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCostoGastoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCostoGastoImpor.add(this.jMenuItemDetalleCerrarCostoGastoImpor);
		
		this.jmenuDetalleAccionesCostoGastoImpor.add(this.jMenuItemActualizarCostoGastoImpor);
		this.jmenuDetalleAccionesCostoGastoImpor.add(this.jMenuItemEliminarCostoGastoImpor);
		this.jmenuDetalleAccionesCostoGastoImpor.add(this.jMenuItemCancelarCostoGastoImpor);		
		
		//this.jmenuDetalleDatosCostoGastoImpor.add(this.jMenuItemDetalleAbrirOrderByCostoGastoImpor);				
		this.jmenuDetalleDatosCostoGastoImpor.add(this.jMenuItemDetalleMostarOcultarCostoGastoImpor);				
				
		//this.jmenuDetalleAccionesCostoGastoImpor.add(this.jMenuItemGuardarCambiosCostoGastoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCostoGastoImpor.add(this.jmenuDetalleArchivoCostoGastoImpor);		
		this.jmenuBarDetalleCostoGastoImpor.add(this.jmenuDetalleAccionesCostoGastoImpor);		
		this.jmenuBarDetalleCostoGastoImpor.add(this.jmenuDetalleDatosCostoGastoImpor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCostoGastoImpor.add(this.jmenuDetalleCostoGastoImpor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCostoGastoImpor);				
	}
	
	
	public void inicializarElementosCamposCostoGastoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCostoGastoImpor = new JLabelMe();
		jLabelIdCostoGastoImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCostoGastoImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCostoGastoImpor= new GridBagLayout();

		this.jPanelidCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);

		jLabelidCostoGastoImpor = new JLabel();
		jLabelidCostoGastoImpor.setText("Id");

		jLabelidCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCostoGastoImpor = new JLabelMe();
		this.jLabelnombreCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCostoGastoImpor.setToolTipText("Nombre");
		this.jLabelnombreCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelnombreCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jTextAreanombreCostoGastoImpor= new JTextAreaMe();
		jTextAreanombreCostoGastoImpor.setEnabled(false);
		jTextAreanombreCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCostoGastoImpor.setLineWrap(true);
		jTextAreanombreCostoGastoImpor.setWrapStyleWord(true);
		jTextAreanombreCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCostoGastoImpor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCostoGastoImpor = new JScrollPane(jTextAreanombreCostoGastoImpor);
		jscrollPanenombreCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCostoGastoImporBusqueda= new JButtonMe();
		this.jButtonnombreCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCostoGastoImporBusqueda.setText("U");
		this.jButtonnombreCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabeles_activoCostoGastoImpor = new JLabelMe();
		this.jLabeles_activoCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoCostoGastoImpor.setToolTipText("Es Activo");
		this.jLabeles_activoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPaneles_activoCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxes_activoCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxes_activoCostoGastoImpor.setEnabled(false);

		jCheckBoxes_activoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoCostoGastoImporBusqueda= new JButtonMe();
		this.jButtones_activoCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoCostoGastoImporBusqueda.setText("U");
		this.jButtones_activoCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_agrupaCostoGastoImpor = new JLabelMe();
		this.jLabelcon_agrupaCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA+" : *");
		this.jLabelcon_agrupaCostoGastoImpor.setToolTipText("Con Agrupa");
		this.jLabelcon_agrupaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_agrupaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_agrupaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_agrupaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_agrupaCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_agrupaCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONAGRUPA);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_agrupaCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_agrupaCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_agrupaCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_agrupaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_agrupaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_agrupaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_agrupaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_agrupaCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_agrupaCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_agrupaCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_agrupaCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_agrupaCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_agrupaCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_agrupaCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_agrupaCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_agrupaCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_agrupaCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_agrupaCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_agrupaCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_prorrateaCostoGastoImpor = new JLabelMe();
		this.jLabelcon_prorrateaCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA+" : *");
		this.jLabelcon_prorrateaCostoGastoImpor.setToolTipText("Con Prorratea");
		this.jLabelcon_prorrateaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_prorrateaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_prorrateaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_prorrateaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_prorrateaCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_prorrateaCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONPRORRATEA);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_prorrateaCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_prorrateaCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_prorrateaCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_prorrateaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_prorrateaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_prorrateaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_prorrateaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_prorrateaCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_prorrateaCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_prorrateaCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_prorrateaCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_prorrateaCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_prorrateaCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_prorrateaCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_prorrateaCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_prorrateaCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_prorrateaCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_prorrateaCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_prorrateaCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_facturaCostoGastoImpor = new JLabelMe();
		this.jLabelcon_facturaCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONFACTURA+" : *");
		this.jLabelcon_facturaCostoGastoImpor.setToolTipText("Con Factura");
		this.jLabelcon_facturaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_facturaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_facturaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_facturaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_facturaCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_facturaCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONFACTURA);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_facturaCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_facturaCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_facturaCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_facturaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_facturaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_facturaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_facturaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_facturaCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_facturaCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_facturaCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_facturaCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_facturaCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_facturaCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_facturaCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_facturaCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_facturaCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_facturaCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_facturaCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_facturaCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_fleteCostoGastoImpor = new JLabelMe();
		this.jLabelcon_fleteCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONFLETE+" : *");
		this.jLabelcon_fleteCostoGastoImpor.setToolTipText("Con Flete");
		this.jLabelcon_fleteCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_fleteCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_fleteCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_fleteCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_fleteCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_fleteCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONFLETE);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_fleteCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_fleteCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_fleteCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_fleteCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_fleteCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_fleteCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_fleteCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_fleteCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_fleteCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_fleteCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_fleteCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_fleteCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_fleteCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_fleteCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_fleteCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_fleteCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_fleteCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_fleteCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_fleteCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_arancelCostoGastoImpor = new JLabelMe();
		this.jLabelcon_arancelCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONARANCEL+" : *");
		this.jLabelcon_arancelCostoGastoImpor.setToolTipText("Con Arancel");
		this.jLabelcon_arancelCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_arancelCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_arancelCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_arancelCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_arancelCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_arancelCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONARANCEL);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_arancelCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_arancelCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_arancelCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_arancelCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_arancelCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_arancelCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_arancelCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_arancelCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_arancelCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_arancelCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_arancelCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_arancelCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_arancelCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_arancelCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_arancelCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_arancelCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_arancelCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_arancelCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_arancelCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_seguroCostoGastoImpor = new JLabelMe();
		this.jLabelcon_seguroCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONSEGURO+" : *");
		this.jLabelcon_seguroCostoGastoImpor.setToolTipText("Con Seguro");
		this.jLabelcon_seguroCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_seguroCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_seguroCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_seguroCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_seguroCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_seguroCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONSEGURO);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_seguroCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_seguroCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_seguroCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_seguroCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_seguroCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_seguroCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_seguroCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_seguroCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_seguroCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_seguroCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_seguroCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_seguroCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_seguroCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_seguroCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_seguroCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_seguroCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_seguroCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_seguroCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_seguroCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_total_generalCostoGastoImpor = new JLabelMe();
		this.jLabelcon_total_generalCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL+" : *");
		this.jLabelcon_total_generalCostoGastoImpor.setToolTipText("Con Total General");
		this.jLabelcon_total_generalCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_total_generalCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_total_generalCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_total_generalCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_total_generalCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_total_generalCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONTOTALGENERAL);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_total_generalCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_total_generalCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_total_generalCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_total_generalCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_total_generalCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_total_generalCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_total_generalCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_total_generalCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_total_generalCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_total_generalCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_total_generalCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_total_generalCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_total_generalCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_total_generalCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_total_generalCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_total_generalCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_total_generalCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_total_generalCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_total_generalCostoGastoImporBusqueda.setVisible(false);		}


					
		this.jLabelcon_digitadoCostoGastoImpor = new JLabelMe();
		this.jLabelcon_digitadoCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO+" : *");
		this.jLabelcon_digitadoCostoGastoImpor.setToolTipText("Con Digitado");
		this.jLabelcon_digitadoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_digitadoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_digitadoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_digitadoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_digitadoCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_digitadoCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_CONDIGITADO);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelcon_digitadoCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jCheckBoxcon_digitadoCostoGastoImpor= new JCheckBoxMe();
		jCheckBoxcon_digitadoCostoGastoImpor.setEnabled(false);

		jCheckBoxcon_digitadoCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_digitadoCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_digitadoCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_digitadoCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_digitadoCostoGastoImporBusqueda= new JButtonMe();
		this.jButtoncon_digitadoCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_digitadoCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_digitadoCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_digitadoCostoGastoImporBusqueda.setText("U");
		this.jButtoncon_digitadoCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_digitadoCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_digitadoCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_digitadoCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_digitadoCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_digitadoCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_digitadoCostoGastoImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCostoGastoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCostoGastoImpor = new JLabelMe();
		this.jLabelid_empresaCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCostoGastoImpor.setToolTipText("Empresa");
		this.jLabelid_empresaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelid_empresaCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jComboBoxid_empresaCostoGastoImpor= new JComboBoxMe();
		jComboBoxid_empresaCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCostoGastoImpor.setEnabled(false);

		this.jButtonid_empresaCostoGastoImpor= new JButtonMe();
		this.jButtonid_empresaCostoGastoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCostoGastoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCostoGastoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCostoGastoImpor.setText("Buscar");
		this.jButtonid_empresaCostoGastoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCostoGastoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCostoGastoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCostoGastoImpor"));

		this.jButtonid_empresaCostoGastoImporBusqueda= new JButtonMe();
		this.jButtonid_empresaCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCostoGastoImporBusqueda.setText("U");
		this.jButtonid_empresaCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCostoGastoImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaCostoGastoImporUpdate= new JButtonMe();
		this.jButtonid_empresaCostoGastoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoGastoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCostoGastoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCostoGastoImporUpdate.setText("U");
		this.jButtonid_empresaCostoGastoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCostoGastoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCostoGastoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCostoGastoImporUpdate"));



					
		this.jLabelid_sucursalCostoGastoImpor = new JLabelMe();
		this.jLabelid_sucursalCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCostoGastoImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelid_sucursalCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jComboBoxid_sucursalCostoGastoImpor= new JComboBoxMe();
		jComboBoxid_sucursalCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCostoGastoImpor.setEnabled(false);

		this.jButtonid_sucursalCostoGastoImpor= new JButtonMe();
		this.jButtonid_sucursalCostoGastoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCostoGastoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCostoGastoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCostoGastoImpor.setText("Buscar");
		this.jButtonid_sucursalCostoGastoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCostoGastoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCostoGastoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCostoGastoImpor"));

		this.jButtonid_sucursalCostoGastoImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCostoGastoImporBusqueda.setText("U");
		this.jButtonid_sucursalCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCostoGastoImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCostoGastoImporUpdate= new JButtonMe();
		this.jButtonid_sucursalCostoGastoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoGastoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCostoGastoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCostoGastoImporUpdate.setText("U");
		this.jButtonid_sucursalCostoGastoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCostoGastoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCostoGastoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCostoGastoImporUpdate"));



					
		this.jLabelid_tipo_costo_gasto_imporCostoGastoImpor = new JLabelMe();
		this.jLabelid_tipo_costo_gasto_imporCostoGastoImpor.setText(""+CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR+" : *");
		this.jLabelid_tipo_costo_gasto_imporCostoGastoImpor.setToolTipText("Tipo Costo Gasto Impor");
		this.jLabelid_tipo_costo_gasto_imporCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_costo_gasto_imporCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_costo_gasto_imporCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costo_gasto_imporCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.setToolTipText(CostoGastoImporConstantesFunciones.LABEL_IDTIPOCOSTOGASTOIMPOR);
		this.gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.setLayout(this.gridaBagLayoutCostoGastoImpor);


		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor= new JComboBoxMe();
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor= new JButtonMe();
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor.setText("Buscar");
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costo_gasto_imporCostoGastoImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costo_gasto_imporCostoGastoImpor"));

		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda= new JButtonMe();
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setText("U");
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costo_gasto_imporCostoGastoImporBusqueda"));

		if(this.costogastoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda.setVisible(false);		}

		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate= new JButtonMe();
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.setText("U");
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costo_gasto_imporCostoGastoImporUpdate"));



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
		//this.jInternalFrameDetalleCostoGastoImpor = new CostoGastoImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Costo Gasto Impor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCostoGastoImpor= new GridBagLayout();
		

		
		String sToolTipCostoGastoImpor="";
		sToolTipCostoGastoImpor=CostoGastoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCostoGastoImpor+="(Importaciones.CostoGastoImpor)";
		}
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipCostoGastoImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCostoGastoImpor = new JButtonMe();
		this.jButtonModificarCostoGastoImpor = new JButtonMe();
        this.jButtonActualizarCostoGastoImpor = new JButtonMe();
        this.jButtonEliminarCostoGastoImpor = new JButtonMe();
        this.jButtonCancelarCostoGastoImpor = new JButtonMe();
        this.jButtonGuardarCambiosCostoGastoImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaCostoGastoImpor = new JButtonMe();
		this.jButtonCerrarCostoGastoImpor = new JButtonMe();
		
		this.jScrollPanelDatosCostoGastoImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionCostoGastoImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralCostoGastoImpor = new JScrollPane();
				
		
		
		this.jPanelCamposCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Costo Gasto Impor";
		
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Costo Gasto Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosCostoGastoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCostoGastoImpor.setName("jPanelCamposCostoGastoImpor"); 

		this.jPanelCamposOcultosCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCostoGastoImpor.setName("jPanelCamposOcultosCostoGastoImpor"); 

        this.jPanelAccionesCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCostoGastoImpor.setToolTipText("Acciones");
        this.jPanelAccionesCostoGastoImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCostoGastoImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCostoGastoImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCostoGastoImpor.setText("Nuevo");
		this.jButtonModificarCostoGastoImpor.setText("Editar");
        this.jButtonActualizarCostoGastoImpor.setText("Actualizar");
        this.jButtonEliminarCostoGastoImpor.setText("Eliminar");
        this.jButtonCancelarCostoGastoImpor.setText("Cancelar");
        this.jButtonGuardarCambiosCostoGastoImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaCostoGastoImpor.setText("Guardar");
		this.jButtonCerrarCostoGastoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCostoGastoImpor,"nuevo_button","Nuevo",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCostoGastoImpor,"modificar_button","Editar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCostoGastoImpor,"actualizar_button","Actualizar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCostoGastoImpor,"eliminar_button","Eliminar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCostoGastoImpor,"cancelar_button","Cancelar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCostoGastoImpor,"guardarcambios_button","Guardar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCostoGastoImpor,"guardarcambiostabla_button","Guardar",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCostoGastoImpor,"cerrar_button","Salir",this.costogastoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCostoGastoImpor.setToolTipText("Nuevo"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCostoGastoImpor.setToolTipText("Editar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCostoGastoImpor.setToolTipText("Actualizar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCostoGastoImpor.setToolTipText("Eliminar)"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCostoGastoImpor.setToolTipText("Cancelar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCostoGastoImpor.setToolTipText("Guardar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCostoGastoImpor.setToolTipText("Guardar"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCostoGastoImpor.setToolTipText("Salir"+" "+CostoGastoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCostoGastoImpor";
		inputMap = this.jButtonNuevoCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCostoGastoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCostoGastoImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCostoGastoImpor";
		inputMap = this.jButtonActualizarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCostoGastoImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarCostoGastoImpor";
		inputMap = this.jButtonEliminarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCostoGastoImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarCostoGastoImpor";
		inputMap = this.jButtonCancelarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCostoGastoImpor"));
		
		//CERRAR		
		sMapKey = "CerrarCostoGastoImpor";
		inputMap = this.jButtonCerrarCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCostoGastoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCostoGastoImpor";
		inputMap = this.jButtonGuardarCambiosTablaCostoGastoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCostoGastoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCostoGastoImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCostoGastoImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCostoGastoImpor.setToolTipText("Nuevo CostoGastoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCostoGastoImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCostoGastoImpor.setToolTipText("Sin Cerrar Ventana CostoGastoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCostoGastoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCostoGastoImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCostoGastoImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCostoGastoImpor.setText("Accion");
		this.jComboBoxTiposAccionesCostoGastoImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCostoGastoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCostoGastoImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCostoGastoImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCostoGastoImpor = new JLabelMe();
		
		this.jLabelAccionesCostoGastoImpor.setText("Acciones");		
		this.jLabelAccionesCostoGastoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCostoGastoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCostoGastoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCostoGastoImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCostoGastoImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCostoGastoImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesCostoGastoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCostoGastoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCostoGastoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCostoGastoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCostoGastoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCostoGastoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCostoGastoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCostoGastoImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCostoGastoImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCostoGastoImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCostoGastoImpor = new GridBagLayout();
		
		this.jPanelCamposCostoGastoImpor.setLayout(gridaBagLayoutCamposCostoGastoImpor);
		this.jPanelCamposOcultosCostoGastoImpor.setLayout(gridaBagLayoutCamposOcultosCostoGastoImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCostoGastoImpor.add(jLabelIdCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCostoGastoImpor.add(jLabelidCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCostoGastoImpor.add(jLabelid_empresaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCostoGastoImpor.add(jButtonid_empresaCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 3;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCostoGastoImpor.add(jButtonid_empresaCostoGastoImporUpdate, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCostoGastoImpor.add(jComboBoxid_empresaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCostoGastoImpor.add(jLabelid_sucursalCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCostoGastoImpor.add(jButtonid_sucursalCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 3;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCostoGastoImpor.add(jButtonid_sucursalCostoGastoImporUpdate, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCostoGastoImpor.add(jComboBoxid_sucursalCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.add(jLabelid_tipo_costo_gasto_imporCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.add(jButtonid_tipo_costo_gasto_imporCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 3;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.add(jButtonid_tipo_costo_gasto_imporCostoGastoImporUpdate, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor.add(jComboBoxid_tipo_costo_gasto_imporCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCostoGastoImpor.add(jLabelnombreCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCostoGastoImpor.add(jButtonnombreCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCostoGastoImpor.add(jscrollPanenombreCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoCostoGastoImpor.add(jLabeles_activoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoCostoGastoImpor.add(jButtones_activoCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoCostoGastoImpor.add(jCheckBoxes_activoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_agrupaCostoGastoImpor.add(jLabelcon_agrupaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_agrupaCostoGastoImpor.add(jButtoncon_agrupaCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_agrupaCostoGastoImpor.add(jCheckBoxcon_agrupaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_prorrateaCostoGastoImpor.add(jLabelcon_prorrateaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_prorrateaCostoGastoImpor.add(jButtoncon_prorrateaCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_prorrateaCostoGastoImpor.add(jCheckBoxcon_prorrateaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_facturaCostoGastoImpor.add(jLabelcon_facturaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_facturaCostoGastoImpor.add(jButtoncon_facturaCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_facturaCostoGastoImpor.add(jCheckBoxcon_facturaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_fleteCostoGastoImpor.add(jLabelcon_fleteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_fleteCostoGastoImpor.add(jButtoncon_fleteCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_fleteCostoGastoImpor.add(jCheckBoxcon_fleteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_arancelCostoGastoImpor.add(jLabelcon_arancelCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_arancelCostoGastoImpor.add(jButtoncon_arancelCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_arancelCostoGastoImpor.add(jCheckBoxcon_arancelCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_seguroCostoGastoImpor.add(jLabelcon_seguroCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_seguroCostoGastoImpor.add(jButtoncon_seguroCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_seguroCostoGastoImpor.add(jCheckBoxcon_seguroCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_total_generalCostoGastoImpor.add(jLabelcon_total_generalCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_total_generalCostoGastoImpor.add(jButtoncon_total_generalCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_total_generalCostoGastoImpor.add(jCheckBoxcon_total_generalCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_digitadoCostoGastoImpor.add(jLabelcon_digitadoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		//this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = 2;
		this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
		this.gridBagConstraintsCostoGastoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_digitadoCostoGastoImpor.add(jButtoncon_digitadoCostoGastoImporBusqueda, this.gridBagConstraintsCostoGastoImpor);
	}

	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCostoGastoImpor.gridy = 0;
	this.gridBagConstraintsCostoGastoImpor.gridx = 1;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_digitadoCostoGastoImpor.add(jCheckBoxcon_digitadoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelidCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelid_tipo_costo_gasto_imporCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelnombreCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPaneles_activoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_agrupaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_prorrateaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_facturaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_fleteCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_arancelCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_seguroCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_total_generalCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCostoGastoImpor.add(this.jPanelcon_digitadoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposCostoGastoImpor % 1==0) {
		iXPanelCamposCostoGastoImpor=0;
		iYPanelCamposCostoGastoImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposOcultosCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposOcultosCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCostoGastoImpor.add(this.jPanelid_empresaCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposOcultosCostoGastoImpor % 1==0) {
		iXPanelCamposOcultosCostoGastoImpor=0;
		iYPanelCamposOcultosCostoGastoImpor++;
	}
	this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCostoGastoImpor.gridy = iYPanelCamposOcultosCostoGastoImpor;
	this.gridBagConstraintsCostoGastoImpor.gridx = iXPanelCamposOcultosCostoGastoImpor++;
	this.gridBagConstraintsCostoGastoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCostoGastoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCostoGastoImpor.add(this.jPanelid_sucursalCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);



	if(iXPanelCamposOcultosCostoGastoImpor % 1==0) {
		iXPanelCamposOcultosCostoGastoImpor=0;
		iYPanelCamposOcultosCostoGastoImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesCostoGastoImpor= new GridBagLayout();
		this.jPanelAccionesCostoGastoImpor.setLayout(gridaBagLayoutAccionesCostoGastoImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCostoGastoImpor= new GridBagLayout();
		this.jPanelAccionesFormularioCostoGastoImpor.setLayout(gridaBagLayoutAccionesFormularioCostoGastoImpor);
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCostoGastoImpor.add(this.jComboBoxTiposAccionesFormularioCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCostoGastoImpor.add(this.jCheckBoxPostAccionNuevoCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCostoGastoImpor.add(this.jCheckBoxPostAccionSinCerrarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.costogastoimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.costogastoimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCostoGastoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCostoGastoImpor.add(this.jCheckBoxPostAccionSinMensajeCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesCostoGastoImpor.add(this.jButtonModificarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);							

		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;
		this.gridBagConstraintsCostoGastoImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesCostoGastoImpor.add(this.jButtonEliminarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
			
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesCostoGastoImpor.add(this.jButtonActualizarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);


		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;		
		this.gridBagConstraintsCostoGastoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesCostoGastoImpor.add(this.jButtonGuardarCambiosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);	
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = 0;		
		this.gridBagConstraintsCostoGastoImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesCostoGastoImpor.add(this.jButtonCancelarCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCostoGastoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCostoGastoImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.costogastoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();						
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;		
			//this.gridBagConstraintsCostoGastoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCostoGastoImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCostoGastoImpor.gridx =0;
		this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCostoGastoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CostoGastoImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCostoGastoImpor = new CostoGastoImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Costo Gasto Impor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Costo Gasto Impor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Costo Gasto Impor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CostoGastoImporModel costogastoimporModel=new CostoGastoImporModel(this);
			
			//SI USARA CLASE INTERNA
			//CostoGastoImporModel.CostoGastoImporFocusTraversalPolicy costogastoimporFocusTraversalPolicy = costogastoimporModel.new CostoGastoImporFocusTraversalPolicy(this);
			
			//costogastoimporFocusTraversalPolicy.setcostogastoimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(costogastoimporModel);
			
			
			this.jContentPaneDetalleCostoGastoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCostoGastoImpor = new GridBagLayout();	
			this.jContentPaneDetalleCostoGastoImpor.setLayout(gridaBagLayoutDetalleCostoGastoImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCostoGastoImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
				this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCostoGastoImpor.gridx = 0;
					
				
				this.jContentPaneDetalleCostoGastoImpor.add(jTtoolBarDetalleCostoGastoImpor, gridBagConstraintsCostoGastoImpor);								
				
}
			
			this.jScrollPanelDatosEdicionCostoGastoImpor=   new JScrollPane(jContentPaneDetalleCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCostoGastoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	        
			this.jContentPaneDetalleCostoGastoImpor.add(jPanelCamposCostoGastoImpor, gridBagConstraintsCostoGastoImpor);
			
			
			
			
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
						&& costogastoimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(this.puedeCargarPorParteDetalleLiquidacionImpor,false,-1);
					
					if(this.costogastoimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCostoGastoImpor= new GridBagConstraints();
						this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCostoGastoImpor.gridx = 0;
						this.jContentPaneDetalleCostoGastoImpor.add(this.jTabbedPaneRelacionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCostoGastoImpor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleLiquidacionImpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCostoGastoImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
					this.gridBagConstraintsCostoGastoImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCostoGastoImpor.gridx = 0;
					
				
					this.jContentPaneDetalleCostoGastoImpor.add(jPanelCamposOcultosCostoGastoImpor, gridBagConstraintsCostoGastoImpor);
				
					this.jPanelCamposOcultosCostoGastoImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	        this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCostoGastoImpor.add(this.jPanelAccionesFormularioCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);							
			
			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
	        this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCostoGastoImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleCostoGastoImpor.add(this.jPanelAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCostoGastoImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCostoGastoImpor=   new JScrollPane(this.jPanelCamposCostoGastoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCostoGastoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCostoGastoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCostoGastoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;
			this.gridBagConstraintsCostoGastoImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCostoGastoImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCostoGastoImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);			
			
			this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
			this.gridBagConstraintsCostoGastoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCostoGastoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
			
			
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		
			
		this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
		this.gridBagConstraintsCostoGastoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCostoGastoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCostoGastoImpor, this.gridBagConstraintsCostoGastoImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCostoGastoImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionCostoGastoImpor;
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

				DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CostoGastoImporJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(true);

				this.detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleliquidacionimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleliquidacionimporBeanSwingJInternalFrame.setdetalleliquidacionimporSessionBean(this.detalleliquidacionimporSessionBean);

				//this.gridBagConstraintsCostoGastoImpor = new GridBagConstraints();
				//this.gridBagConstraintsCostoGastoImpor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCostoGastoImpor.gridx = 0;
				//this.jContentPaneDetalleCostoGastoImpor.add(this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCostoGastoImpor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCostoGastoImpor.add("Detalle Liquidacion Impores",this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCostoGastoImpor.setComponentAt(iIndexTab,this.detalleliquidacionimporBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(false);
				this.detalleliquidacionimporBeanSwingJInternalFrame=null;//new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleLiquidacionImpor) {
					this.jTabbedPaneRelacionesCostoGastoImpor.add("Detalle Liquidacion Impores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleLiquidacionImporBeanSwingJInternalFrame(List<CostoGastoImpor> costogastoimpors,CostoGastoImpor costogastoimpor,DetalleLiquidacionImporBeanSwingJInternalFrame detalleliquidacionimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleliquidacionimporBeanSwingJInternalFrame=new DetalleLiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleliquidacionimporBeanSwingJInternalFrame.getDetalleLiquidacionImporLogic().setConnexion(this.costogastoimporLogic.getConnexion());

					detalleliquidacionimporBeanSwingJInternalFrame.setcostogastoimporsForeignKey(costogastoimpors);
					detalleliquidacionimporBeanSwingJInternalFrame.setcostogastoimporForeignKey(costogastoimpor);
					detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionCostoGastoImpor(true);
					detalleliquidacionimporBeanSwingJInternalFrame.detalleliquidacionimporSessionBean.setlidCostoGastoImporActual(costogastoimpor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleliquidacionimporBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleLiquidacionImpor(detalleliquidacionimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleliquidacionimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaCostoGastoImpor(true);
					detalleliquidacionimporBeanSwingJInternalFrame.setid_costo_gasto_imporFK_IdCostoGastoImpor(costogastoimpor.getId());

					if(!this.conCargarFormDetalle) {
						detalleliquidacionimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleliquidacionimporBeanSwingJInternalFrame.setSelectedItemCombosFrameCostoGastoImporForeignKey(costogastoimpor,1,false,true,true);
					detalleliquidacionimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleliquidacionimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdCostoGastoImpor");
					detalleliquidacionimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCostoGastoImpor");
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
