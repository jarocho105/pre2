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

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.importaciones.util.DetalleLiquidacionImporConstantesFunciones;

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
public class DetalleLiquidacionImporDetalleFormJInternalFrame extends DetalleLiquidacionImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleLiquidacionImpor;
	
	protected JMenuBar jmenuBarDetalleDetalleLiquidacionImpor;
	
	protected JMenu jmenuDetalleDetalleLiquidacionImpor;
	protected JMenu jmenuDetalleArchivoDetalleLiquidacionImpor;
	protected JMenu jmenuDetalleAccionesDetalleLiquidacionImpor;
	protected JMenu jmenuDetalleDatosDetalleLiquidacionImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleLiquidacionImpor;	
	protected GridBagConstraints gridBagConstraintsDetalleLiquidacionImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleLiquidacionImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleLiquidacionImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_liquidacionimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected CostoGastoImporBeanSwingJInternalFrame costogastoimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_costogastoimpor="";
	
	public DetalleLiquidacionImporSessionBean detalleliquidacionimporSessionBean;
	
	
	
	
	public LiquidacionImporSessionBean liquidacionimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public CostoGastoImporSessionBean costogastoimporSessionBean;	
	
	public DetalleLiquidacionImporLogic detalleliquidacionimporLogic;
	
	public JScrollPane jScrollPanelDatosDetalleLiquidacionImpor;
	public JScrollPane jScrollPanelDatosEdicionDetalleLiquidacionImpor;
	public JScrollPane jScrollPanelDatosGeneralDetalleLiquidacionImpor;
	
	protected JPanel jPanelCamposDetalleLiquidacionImpor;    
	protected JPanel jPanelCamposOcultosDetalleLiquidacionImpor;    	
	protected JPanel jPanelAccionesDetalleLiquidacionImpor;
	protected JPanel jPanelAccionesFormularioDetalleLiquidacionImpor;
    
	
	
	protected Integer iXPanelCamposDetalleLiquidacionImpor=0;
	protected Integer iYPanelCamposDetalleLiquidacionImpor=0;
	
	protected Integer iXPanelCamposOcultosDetalleLiquidacionImpor=0;
	protected Integer iYPanelCamposOcultosDetalleLiquidacionImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleLiquidacionImpor;
	public JButton jButtonModificarDetalleLiquidacionImpor;
	public JButton jButtonActualizarDetalleLiquidacionImpor;
    public JButton jButtonEliminarDetalleLiquidacionImpor;
	public JButton jButtonCancelarDetalleLiquidacionImpor;
    public JButton jButtonGuardarCambiosDetalleLiquidacionImpor;
	public JButton jButtonGuardarCambiosTablaDetalleLiquidacionImpor;
	protected JButton jButtonCerrarDetalleLiquidacionImpor;
	
	
	protected JButton jButtonProcesarInformacionDetalleLiquidacionImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleLiquidacionImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleLiquidacionImpor;
	protected JButton jButtonModificarToolBarDetalleLiquidacionImpor;
	protected JButton jButtonActualizarToolBarDetalleLiquidacionImpor;
    protected JButton jButtonEliminarToolBarDetalleLiquidacionImpor;
	protected JButton jButtonCancelarToolBarDetalleLiquidacionImpor;
    protected JButton jButtonGuardarCambiosToolBarDetalleLiquidacionImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleLiquidacionImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleLiquidacionImpor;
	protected JButton jButtonCerrarToolBarDetalleLiquidacionImpor;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleLiquidacionImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemModificarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemActualizarDetalleLiquidacionImpor;
    protected JMenuItem jMenuItemEliminarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemCancelarDetalleLiquidacionImpor;
    protected JMenuItem jMenuItemGuardarCambiosDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemCerrarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleLiquidacionImpor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleLiquidacionImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleLiquidacionImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleLiquidacionImpor;
	public JLabel jLabelIdDetalleLiquidacionImpor;
	public JLabel jLabelidDetalleLiquidacionImpor;
	public JButton jButtonidDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleLiquidacionImpor;
	public JLabel jLabelvalorDetalleLiquidacionImpor;
	public JTextField jTextFieldvalorDetalleLiquidacionImpor;
	public JButton jButtonvalorDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleLiquidacionImpor;
	public JLabel jLabelfechaDetalleLiquidacionImpor;
	//public JFormattedTextField jDateChooserfechaDetalleLiquidacionImpor;

	public JDateChooser jDateChooserfechaDetalleLiquidacionImpor;
	public JButton jButtonfechaDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelreferenciaDetalleLiquidacionImpor;
	public JLabel jLabelreferenciaDetalleLiquidacionImpor;
	public JTextField jTextFieldreferenciaDetalleLiquidacionImpor;
	public JButton jButtonreferenciaDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoDetalleLiquidacionImpor;
	public JLabel jLabelimpuestoDetalleLiquidacionImpor;
	public JTextField jTextFieldimpuestoDetalleLiquidacionImpor;
	public JButton jButtonimpuestoDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelimpuesto2DetalleLiquidacionImpor;
	public JLabel jLabelimpuesto2DetalleLiquidacionImpor;
	public JTextField jTextFieldimpuesto2DetalleLiquidacionImpor;
	public JButton jButtonimpuesto2DetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelimpuesto3DetalleLiquidacionImpor;
	public JLabel jLabelimpuesto3DetalleLiquidacionImpor;
	public JTextField jTextFieldimpuesto3DetalleLiquidacionImpor;
	public JButton jButtonimpuesto3DetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelimpuesto4DetalleLiquidacionImpor;
	public JLabel jLabelimpuesto4DetalleLiquidacionImpor;
	public JTextField jTextFieldimpuesto4DetalleLiquidacionImpor;
	public JButton jButtonimpuesto4DetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelimpuesto5DetalleLiquidacionImpor;
	public JLabel jLabelimpuesto5DetalleLiquidacionImpor;
	public JTextField jTextFieldimpuesto5DetalleLiquidacionImpor;
	public JButton jButtonimpuesto5DetalleLiquidacionImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_liquidacion_imporDetalleLiquidacionImpor;
	public JLabel jLabelid_liquidacion_imporDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_liquidacion_imporDetalleLiquidacionImpor;
	public JButton jButtonid_liquidacion_imporDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleLiquidacionImpor;
	public JLabel jLabelid_empresaDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleLiquidacionImpor;
	public JButton jButtonid_empresaDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_empresaDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleLiquidacionImpor;
	public JLabel jLabelid_sucursalDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleLiquidacionImpor;
	public JButton jButtonid_sucursalDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_sucursalDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioDetalleLiquidacionImpor;
	public JLabel jLabelid_usuarioDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioDetalleLiquidacionImpor;
	public JButton jButtonid_usuarioDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_usuarioDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_usuarioDetalleLiquidacionImporBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleLiquidacionImpor;
	public JLabel jLabelid_centro_costoDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleLiquidacionImpor;
	public JButton jButtonid_centro_costoDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleLiquidacionImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleLiquidacionImporArbol= new JButtonMe();

	public JPanel jPanelid_costo_gasto_imporDetalleLiquidacionImpor;
	public JLabel jLabelid_costo_gasto_imporDetalleLiquidacionImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor;
	public JButton jButtonid_costo_gasto_imporDetalleLiquidacionImpor= new JButtonMe();
	public JButton jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate= new JButtonMe();
	public JButton jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleLiquidacionImpor;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleLiquidacionImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleLiquidacionImpor=new JPanel();
				this.jPanelAccionesFormularioDetalleLiquidacionImpor=new JPanel();
				this.jmenuBarDetalleDetalleLiquidacionImpor=new JMenuBar();
				this.jTtoolBarDetalleDetalleLiquidacionImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleLiquidacionImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleLiquidacionImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleLiquidacionImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleLiquidacionImpor() {
		return this.jButtonActualizarToolBarDetalleLiquidacionImpor;
	}
	
	public JButton getjButtonEliminarToolBarDetalleLiquidacionImpor() {
		return this.jButtonEliminarToolBarDetalleLiquidacionImpor;
	}
	
	public JButton getjButtonCancelarToolBarDetalleLiquidacionImpor() {
		return this.jButtonCancelarToolBarDetalleLiquidacionImpor;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleLiquidacionImpor() {
		return this.jButtonProcesarInformacionDetalleLiquidacionImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleLiquidacionImpor)	{
		this.jButtonProcesarInformacionDetalleLiquidacionImpor = jButtonProcesarInformacionDetalleLiquidacionImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleLiquidacionImpor() {
		return this.jComboBoxTiposAccionesDetalleLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposRelacionesDetalleLiquidacionImpor) {
		this.jComboBoxTiposRelacionesDetalleLiquidacionImpor = jComboBoxTiposRelacionesDetalleLiquidacionImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposAccionesDetalleLiquidacionImpor) {
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor = jComboBoxTiposAccionesDetalleLiquidacionImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleLiquidacionImpor() {
		return this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleLiquidacionImpor(
			JComboBox jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor) {
		this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor = jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleliquidacionimporSessionBean=new DetalleLiquidacionImporSessionBean();
		
		this.detalleliquidacionimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleliquidacionimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleLiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleLiquidacionImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Liquidacion Impor MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleLiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleLiquidacionImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleLiquidacionImpor=new JButtonMe();
				this.jButtonModificarToolBarDetalleLiquidacionImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleDetalleLiquidacionImpor,
							"actualizar","actualizar","Actualizar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleDetalleLiquidacionImpor,
							"eliminar","eliminar","Eliminar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleDetalleLiquidacionImpor,
							"cancelar","cancelar","Cancelar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleLiquidacionImpor,this.jTtoolBarDetalleDetalleLiquidacionImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleLiquidacionImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleLiquidacionImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleLiquidacionImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleLiquidacionImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleLiquidacionImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleLiquidacionImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleLiquidacionImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleLiquidacionImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleLiquidacionImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleLiquidacionImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleLiquidacionImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleLiquidacionImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleLiquidacionImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleLiquidacionImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleLiquidacionImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleLiquidacionImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleLiquidacionImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleLiquidacionImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleLiquidacionImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleLiquidacionImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleLiquidacionImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleLiquidacionImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleLiquidacionImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleLiquidacionImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleLiquidacionImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleLiquidacionImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleLiquidacionImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleLiquidacionImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleLiquidacionImpor.add(this.jMenuItemDetalleCerrarDetalleLiquidacionImpor);
		
		this.jmenuDetalleAccionesDetalleLiquidacionImpor.add(this.jMenuItemActualizarDetalleLiquidacionImpor);
		this.jmenuDetalleAccionesDetalleLiquidacionImpor.add(this.jMenuItemEliminarDetalleLiquidacionImpor);
		this.jmenuDetalleAccionesDetalleLiquidacionImpor.add(this.jMenuItemCancelarDetalleLiquidacionImpor);		
		
		//this.jmenuDetalleDatosDetalleLiquidacionImpor.add(this.jMenuItemDetalleAbrirOrderByDetalleLiquidacionImpor);				
		this.jmenuDetalleDatosDetalleLiquidacionImpor.add(this.jMenuItemDetalleMostarOcultarDetalleLiquidacionImpor);				
				
		//this.jmenuDetalleAccionesDetalleLiquidacionImpor.add(this.jMenuItemGuardarCambiosDetalleLiquidacionImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleLiquidacionImpor.add(this.jmenuDetalleArchivoDetalleLiquidacionImpor);		
		this.jmenuBarDetalleDetalleLiquidacionImpor.add(this.jmenuDetalleAccionesDetalleLiquidacionImpor);		
		this.jmenuBarDetalleDetalleLiquidacionImpor.add(this.jmenuDetalleDatosDetalleLiquidacionImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleLiquidacionImpor);				
	}
	
	
	public void inicializarElementosCamposDetalleLiquidacionImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleLiquidacionImpor = new JLabelMe();
		jLabelIdDetalleLiquidacionImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleLiquidacionImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleLiquidacionImpor= new GridBagLayout();

		this.jPanelidDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);

		jLabelidDetalleLiquidacionImpor = new JLabel();
		jLabelidDetalleLiquidacionImpor.setText("Id");

		jLabelidDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelvalorDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleLiquidacionImpor.setToolTipText("Valor");
		this.jLabelvalorDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelvalorDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldvalorDetalleLiquidacionImpor= new JTextFieldMe();
		jTextFieldvalorDetalleLiquidacionImpor.setEnabled(false);
		jTextFieldvalorDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleLiquidacionImpor.setText("0.0");

		this.jButtonvalorDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonvalorDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonvalorDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelfechaDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleLiquidacionImpor.setToolTipText("Fecha");
		this.jLabelfechaDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelfechaDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		//jFormattedTextFieldfechaDetalleLiquidacionImpor= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleLiquidacionImpor= new JDateChooser();
		jDateChooserfechaDetalleLiquidacionImpor.setEnabled(false);
		jDateChooserfechaDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleLiquidacionImpor.setDate(new Date());
		jDateChooserfechaDetalleLiquidacionImpor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleLiquidacionImpor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonfechaDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonfechaDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelreferenciaDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelreferenciaDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA+" : *");
		this.jLabelreferenciaDetalleLiquidacionImpor.setToolTipText("Referencia");
		this.jLabelreferenciaDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreferenciaDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreferenciaDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreferenciaDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_REFERENCIA);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelreferenciaDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldreferenciaDetalleLiquidacionImpor= new JTextFieldMe();

		jTextFieldreferenciaDetalleLiquidacionImpor.setEnabled(false);
		jTextFieldreferenciaDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldreferenciaDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldreferenciaDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldreferenciaDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonreferenciaDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreferenciaDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldreferenciaDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldreferenciaDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"referenciaDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreferenciaDetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelimpuestoDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoDetalleLiquidacionImpor.setToolTipText("Impuesto");
		this.jLabelimpuestoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelimpuestoDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldimpuestoDetalleLiquidacionImpor= new JTextFieldMe();
		jTextFieldimpuestoDetalleLiquidacionImpor.setEnabled(false);
		jTextFieldimpuestoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoDetalleLiquidacionImpor.setText("0.0");

		this.jButtonimpuestoDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoDetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelimpuesto2DetalleLiquidacionImpor = new JLabelMe();
		this.jLabelimpuesto2DetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2+" : *");
		this.jLabelimpuesto2DetalleLiquidacionImpor.setToolTipText("Impuesto2");
		this.jLabelimpuesto2DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto2DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto2DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto2DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto2DetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto2DetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO2);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelimpuesto2DetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldimpuesto2DetalleLiquidacionImpor= new JTextFieldMe();
		jTextFieldimpuesto2DetalleLiquidacionImpor.setEnabled(false);
		jTextFieldimpuesto2DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto2DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto2DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto2DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto2DetalleLiquidacionImpor.setText("0.0");

		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto2DetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto2DetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto2DetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto2DetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto2DetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelimpuesto3DetalleLiquidacionImpor = new JLabelMe();
		this.jLabelimpuesto3DetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3+" : *");
		this.jLabelimpuesto3DetalleLiquidacionImpor.setToolTipText("Impuesto3");
		this.jLabelimpuesto3DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto3DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto3DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto3DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto3DetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto3DetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO3);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelimpuesto3DetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldimpuesto3DetalleLiquidacionImpor= new JTextFieldMe();
		jTextFieldimpuesto3DetalleLiquidacionImpor.setEnabled(false);
		jTextFieldimpuesto3DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto3DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto3DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto3DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto3DetalleLiquidacionImpor.setText("0.0");

		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto3DetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto3DetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto3DetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto3DetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto3DetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelimpuesto4DetalleLiquidacionImpor = new JLabelMe();
		this.jLabelimpuesto4DetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4+" : *");
		this.jLabelimpuesto4DetalleLiquidacionImpor.setToolTipText("Impuesto4");
		this.jLabelimpuesto4DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto4DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto4DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto4DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto4DetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto4DetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO4);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelimpuesto4DetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldimpuesto4DetalleLiquidacionImpor= new JTextFieldMe();
		jTextFieldimpuesto4DetalleLiquidacionImpor.setEnabled(false);
		jTextFieldimpuesto4DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto4DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto4DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto4DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto4DetalleLiquidacionImpor.setText("0.0");

		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto4DetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto4DetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto4DetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto4DetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto4DetalleLiquidacionImporBusqueda.setVisible(false);		}


					
		this.jLabelimpuesto5DetalleLiquidacionImpor = new JLabelMe();
		this.jLabelimpuesto5DetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5+" : *");
		this.jLabelimpuesto5DetalleLiquidacionImpor.setToolTipText("Impuesto5");
		this.jLabelimpuesto5DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto5DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuesto5DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuesto5DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuesto5DetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuesto5DetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IMPUESTO5);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelimpuesto5DetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jTextFieldimpuesto5DetalleLiquidacionImpor= new JTextFieldMe();
		jTextFieldimpuesto5DetalleLiquidacionImpor.setEnabled(false);
		jTextFieldimpuesto5DetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto5DetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuesto5DetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuesto5DetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuesto5DetalleLiquidacionImpor.setText("0.0");

		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuesto5DetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuesto5DetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuesto5DetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuesto5DetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuesto5DetalleLiquidacionImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleLiquidacionImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_liquidacion_imporDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelid_liquidacion_imporDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR+" : *");
		this.jLabelid_liquidacion_imporDetalleLiquidacionImpor.setToolTipText("Liquacion Impor");
		this.jLabelid_liquidacion_imporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_liquidacion_imporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_liquidacion_imporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_liquidacion_imporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_liquidacion_imporDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_liquidacion_imporDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IDLIQUIDACIONIMPOR);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelid_liquidacion_imporDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_liquidacion_imporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_liquidacion_imporDetalleLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_liquidacion_imporDetalleLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_liquidacion_imporDetalleLiquidacionImpor"));

		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_liquidacion_imporDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.setText("U");
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_liquidacion_imporDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_liquidacion_imporDetalleLiquidacionImporUpdate"));



					
		this.jLabelid_empresaDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelid_empresaDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleLiquidacionImpor.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelid_empresaDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jComboBoxid_empresaDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_empresaDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleLiquidacionImpor.setEnabled(false);

		this.jButtonid_empresaDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonid_empresaDetalleLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonid_empresaDetalleLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleLiquidacionImpor"));

		this.jButtonid_empresaDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleLiquidacionImporUpdate.setText("U");
		this.jButtonid_empresaDetalleLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleLiquidacionImporUpdate"));



					
		this.jLabelid_sucursalDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelid_sucursalDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleLiquidacionImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelid_sucursalDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jComboBoxid_sucursalDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_sucursalDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleLiquidacionImpor.setEnabled(false);

		this.jButtonid_sucursalDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonid_sucursalDetalleLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonid_sucursalDetalleLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleLiquidacionImpor"));

		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleLiquidacionImporUpdate.setText("U");
		this.jButtonid_sucursalDetalleLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleLiquidacionImporUpdate"));



					
		this.jLabelid_usuarioDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelid_usuarioDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioDetalleLiquidacionImpor.setToolTipText("Usuario");
		this.jLabelid_usuarioDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelid_usuarioDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jComboBoxid_usuarioDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_usuarioDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioDetalleLiquidacionImpor.setEnabled(false);

		this.jButtonid_usuarioDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonid_usuarioDetalleLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDetalleLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDetalleLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonid_usuarioDetalleLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioDetalleLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDetalleLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDetalleLiquidacionImpor"));

		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioDetalleLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_usuarioDetalleLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_usuarioDetalleLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDetalleLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDetalleLiquidacionImporUpdate.setText("U");
		this.jButtonid_usuarioDetalleLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioDetalleLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDetalleLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDetalleLiquidacionImporUpdate"));



					
		this.jLabelid_centro_costoDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelid_centro_costoDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoDetalleLiquidacionImpor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelid_centro_costoDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jComboBoxid_centro_costoDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonid_centro_costoDetalleLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonid_centro_costoDetalleLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleLiquidacionImpor"));

		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleLiquidacionImporUpdate.setText("U");
		this.jButtonid_centro_costoDetalleLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleLiquidacionImporUpdate"));


		jButtonid_centro_costoDetalleLiquidacionImporArbol= new JButtonMe();
		jButtonid_centro_costoDetalleLiquidacionImporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleLiquidacionImporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleLiquidacionImporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleLiquidacionImporArbol.setText("Arbol");
		jButtonid_centro_costoDetalleLiquidacionImporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleLiquidacionImporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleLiquidacionImporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleLiquidacionImporArbol"));



					
		this.jLabelid_costo_gasto_imporDetalleLiquidacionImpor = new JLabelMe();
		this.jLabelid_costo_gasto_imporDetalleLiquidacionImpor.setText(""+DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR+" : *");
		this.jLabelid_costo_gasto_imporDetalleLiquidacionImpor.setToolTipText("Costo Gasto Impor");
		this.jLabelid_costo_gasto_imporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_costo_gasto_imporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_costo_gasto_imporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_costo_gasto_imporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.setToolTipText(DetalleLiquidacionImporConstantesFunciones.LABEL_IDCOSTOGASTOIMPOR);
		this.gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.setLayout(this.gridaBagLayoutDetalleLiquidacionImpor);


		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor= new JComboBoxMe();
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor= new JButtonMe();
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor.setText("Buscar");
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_costo_gasto_imporDetalleLiquidacionImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_costo_gasto_imporDetalleLiquidacionImpor"));

		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda= new JButtonMe();
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setText("U");
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_costo_gasto_imporDetalleLiquidacionImporBusqueda"));

		if(this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda.setVisible(false);		}

		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate= new JButtonMe();
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.setText("U");
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_costo_gasto_imporDetalleLiquidacionImporUpdate"));



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
		//this.jInternalFrameDetalleDetalleLiquidacionImpor = new DetalleLiquidacionImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Liquidacion Impor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleLiquidacionImpor= new GridBagLayout();
		

		
		String sToolTipDetalleLiquidacionImpor="";
		sToolTipDetalleLiquidacionImpor=DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleLiquidacionImpor+="(Importaciones.DetalleLiquidacionImpor)";
		}
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleLiquidacionImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonModificarDetalleLiquidacionImpor = new JButtonMe();
        this.jButtonActualizarDetalleLiquidacionImpor = new JButtonMe();
        this.jButtonEliminarDetalleLiquidacionImpor = new JButtonMe();
        this.jButtonCancelarDetalleLiquidacionImpor = new JButtonMe();
        this.jButtonGuardarCambiosDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor = new JButtonMe();
		this.jButtonCerrarDetalleLiquidacionImpor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleLiquidacionImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleLiquidacionImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleLiquidacionImpor = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Liquidacion Impor";
		
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Liquidacion Impores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleLiquidacionImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleLiquidacionImpor.setName("jPanelCamposDetalleLiquidacionImpor"); 

		this.jPanelCamposOcultosDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleLiquidacionImpor.setName("jPanelCamposOcultosDetalleLiquidacionImpor"); 

        this.jPanelAccionesDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleLiquidacionImpor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleLiquidacionImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleLiquidacionImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleLiquidacionImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleLiquidacionImpor.setText("Nuevo");
		this.jButtonModificarDetalleLiquidacionImpor.setText("Editar");
        this.jButtonActualizarDetalleLiquidacionImpor.setText("Actualizar");
        this.jButtonEliminarDetalleLiquidacionImpor.setText("Eliminar");
        this.jButtonCancelarDetalleLiquidacionImpor.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleLiquidacionImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.setText("Guardar");
		this.jButtonCerrarDetalleLiquidacionImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleLiquidacionImpor,"nuevo_button","Nuevo",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleLiquidacionImpor,"modificar_button","Editar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleLiquidacionImpor,"actualizar_button","Actualizar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleLiquidacionImpor,"eliminar_button","Eliminar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleLiquidacionImpor,"cancelar_button","Cancelar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleLiquidacionImpor,"guardarcambios_button","Guardar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor,"guardarcambiostabla_button","Guardar",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleLiquidacionImpor,"cerrar_button","Salir",this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleLiquidacionImpor.setToolTipText("Nuevo"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleLiquidacionImpor.setToolTipText("Editar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleLiquidacionImpor.setToolTipText("Actualizar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleLiquidacionImpor.setToolTipText("Eliminar)"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleLiquidacionImpor.setToolTipText("Cancelar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleLiquidacionImpor.setToolTipText("Guardar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.setToolTipText("Guardar"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleLiquidacionImpor.setToolTipText("Salir"+" "+DetalleLiquidacionImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleLiquidacionImpor";
		inputMap = this.jButtonNuevoDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleLiquidacionImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleLiquidacionImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleLiquidacionImpor";
		inputMap = this.jButtonActualizarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleLiquidacionImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleLiquidacionImpor";
		inputMap = this.jButtonEliminarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleLiquidacionImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleLiquidacionImpor";
		inputMap = this.jButtonCancelarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleLiquidacionImpor"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleLiquidacionImpor";
		inputMap = this.jButtonCerrarDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleLiquidacionImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleLiquidacionImpor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleLiquidacionImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleLiquidacionImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor.setToolTipText("Nuevo DetalleLiquidacionImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor.setToolTipText("Sin Cerrar Ventana DetalleLiquidacionImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleLiquidacionImpor = new JLabelMe();
		
		this.jLabelAccionesDetalleLiquidacionImpor.setText("Acciones");		
		this.jLabelAccionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleLiquidacionImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleLiquidacionImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleLiquidacionImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleLiquidacionImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleLiquidacionImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleLiquidacionImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleLiquidacionImpor = new GridBagLayout();
		
		this.jPanelCamposDetalleLiquidacionImpor.setLayout(gridaBagLayoutCamposDetalleLiquidacionImpor);
		this.jPanelCamposOcultosDetalleLiquidacionImpor.setLayout(gridaBagLayoutCamposOcultosDetalleLiquidacionImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleLiquidacionImpor.add(jLabelIdDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleLiquidacionImpor.add(jLabelidDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_liquidacion_imporDetalleLiquidacionImpor.add(jLabelid_liquidacion_imporDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_liquidacion_imporDetalleLiquidacionImpor.add(jButtonid_liquidacion_imporDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_liquidacion_imporDetalleLiquidacionImpor.add(jButtonid_liquidacion_imporDetalleLiquidacionImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_liquidacion_imporDetalleLiquidacionImpor.add(jComboBoxid_liquidacion_imporDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleLiquidacionImpor.add(jLabelid_empresaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleLiquidacionImpor.add(jButtonid_empresaDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleLiquidacionImpor.add(jButtonid_empresaDetalleLiquidacionImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleLiquidacionImpor.add(jComboBoxid_empresaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleLiquidacionImpor.add(jLabelid_sucursalDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleLiquidacionImpor.add(jButtonid_sucursalDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleLiquidacionImpor.add(jButtonid_sucursalDetalleLiquidacionImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleLiquidacionImpor.add(jComboBoxid_sucursalDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioDetalleLiquidacionImpor.add(jLabelid_usuarioDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDetalleLiquidacionImpor.add(jButtonid_usuarioDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDetalleLiquidacionImpor.add(jButtonid_usuarioDetalleLiquidacionImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioDetalleLiquidacionImpor.add(jComboBoxid_usuarioDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleLiquidacionImpor.add(jLabelid_centro_costoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleLiquidacionImpor.add(jButtonid_centro_costoDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleLiquidacionImpor.add(jButtonid_centro_costoDetalleLiquidacionImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleLiquidacionImpor.add(jComboBoxid_centro_costoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.add(jLabelid_costo_gasto_imporDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.add(jButtonid_costo_gasto_imporDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 3;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.add(jButtonid_costo_gasto_imporDetalleLiquidacionImporUpdate, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor.add(jComboBoxid_costo_gasto_imporDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleLiquidacionImpor.add(jLabelvalorDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleLiquidacionImpor.add(jButtonvalorDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleLiquidacionImpor.add(jTextFieldvalorDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetalleLiquidacionImpor.add(jLabelfechaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleLiquidacionImpor.add(jButtonfechaDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetalleLiquidacionImpor.add(jDateChooserfechaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreferenciaDetalleLiquidacionImpor.add(jLabelreferenciaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelreferenciaDetalleLiquidacionImpor.add(jButtonreferenciaDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreferenciaDetalleLiquidacionImpor.add(jTextFieldreferenciaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuestoDetalleLiquidacionImpor.add(jLabelimpuestoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoDetalleLiquidacionImpor.add(jButtonimpuestoDetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuestoDetalleLiquidacionImpor.add(jTextFieldimpuestoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto2DetalleLiquidacionImpor.add(jLabelimpuesto2DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto2DetalleLiquidacionImpor.add(jButtonimpuesto2DetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto2DetalleLiquidacionImpor.add(jTextFieldimpuesto2DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto3DetalleLiquidacionImpor.add(jLabelimpuesto3DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto3DetalleLiquidacionImpor.add(jButtonimpuesto3DetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto3DetalleLiquidacionImpor.add(jTextFieldimpuesto3DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto4DetalleLiquidacionImpor.add(jLabelimpuesto4DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto4DetalleLiquidacionImpor.add(jButtonimpuesto4DetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto4DetalleLiquidacionImpor.add(jTextFieldimpuesto4DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuesto5DetalleLiquidacionImpor.add(jLabelimpuesto5DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 2;
		this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuesto5DetalleLiquidacionImpor.add(jButtonimpuesto5DetalleLiquidacionImporBusqueda, this.gridBagConstraintsDetalleLiquidacionImpor);
	}

	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 1;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuesto5DetalleLiquidacionImpor.add(jTextFieldimpuesto5DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelidDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelid_liquidacion_imporDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelid_centro_costoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelid_costo_gasto_imporDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelvalorDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelfechaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelreferenciaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelimpuestoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelimpuesto2DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelimpuesto3DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelimpuesto4DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleLiquidacionImpor.add(this.jPanelimpuesto5DetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposDetalleLiquidacionImpor=0;
		iYPanelCamposDetalleLiquidacionImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposOcultosDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposOcultosDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleLiquidacionImpor.add(this.jPanelid_empresaDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposOcultosDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposOcultosDetalleLiquidacionImpor=0;
		iYPanelCamposOcultosDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposOcultosDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposOcultosDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleLiquidacionImpor.add(this.jPanelid_sucursalDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposOcultosDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposOcultosDetalleLiquidacionImpor=0;
		iYPanelCamposOcultosDetalleLiquidacionImpor++;
	}
	this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iYPanelCamposOcultosDetalleLiquidacionImpor;
	this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iXPanelCamposOcultosDetalleLiquidacionImpor++;
	this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleLiquidacionImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleLiquidacionImpor.add(this.jPanelid_usuarioDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);



	if(iXPanelCamposOcultosDetalleLiquidacionImpor % 1==0) {
		iXPanelCamposOcultosDetalleLiquidacionImpor=0;
		iYPanelCamposOcultosDetalleLiquidacionImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleLiquidacionImpor= new GridBagLayout();
		this.jPanelAccionesDetalleLiquidacionImpor.setLayout(gridaBagLayoutAccionesDetalleLiquidacionImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleLiquidacionImpor= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleLiquidacionImpor.setLayout(gridaBagLayoutAccionesFormularioDetalleLiquidacionImpor);
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleLiquidacionImpor.add(this.jComboBoxTiposAccionesFormularioDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleLiquidacionImpor.add(this.jCheckBoxPostAccionNuevoDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleLiquidacionImpor.add(this.jCheckBoxPostAccionSinCerrarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleliquidacionimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleLiquidacionImpor.add(this.jCheckBoxPostAccionSinMensajeDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleLiquidacionImpor.add(this.jButtonModificarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);							

		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleLiquidacionImpor.add(this.jButtonEliminarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleLiquidacionImpor.add(this.jButtonActualizarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);


		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleLiquidacionImpor.add(this.jButtonGuardarCambiosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);	
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = 0;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleLiquidacionImpor.add(this.jButtonCancelarDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleLiquidacionImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleLiquidacionImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleliquidacionimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;		
			//this.gridBagConstraintsDetalleLiquidacionImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleLiquidacionImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =0;
		this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleLiquidacionImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleLiquidacionImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleLiquidacionImpor = new DetalleLiquidacionImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Liquidacion Impor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Liquidacion Impor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Liquidacion Impor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleLiquidacionImporModel detalleliquidacionimporModel=new DetalleLiquidacionImporModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleLiquidacionImporModel.DetalleLiquidacionImporFocusTraversalPolicy detalleliquidacionimporFocusTraversalPolicy = detalleliquidacionimporModel.new DetalleLiquidacionImporFocusTraversalPolicy(this);
			
			//detalleliquidacionimporFocusTraversalPolicy.setdetalleliquidacionimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleliquidacionimporModel);
			
			
			this.jContentPaneDetalleDetalleLiquidacionImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleLiquidacionImpor = new GridBagLayout();	
			this.jContentPaneDetalleDetalleLiquidacionImpor.setLayout(gridaBagLayoutDetalleDetalleLiquidacionImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleLiquidacionImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
				this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleLiquidacionImpor.add(jTtoolBarDetalleDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor=   new JScrollPane(jContentPaneDetalleDetalleLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	        
			this.jContentPaneDetalleDetalleLiquidacionImpor.add(jPanelCamposDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);
			
			
			
			
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
						&& detalleliquidacionimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleliquidacionimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleLiquidacionImpor= new GridBagConstraints();
						this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
						this.jContentPaneDetalleDetalleLiquidacionImpor.add(this.jTabbedPaneRelacionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleLiquidacionImpor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleLiquidacionImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
					this.gridBagConstraintsDetalleLiquidacionImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleLiquidacionImpor.add(jPanelCamposOcultosDetalleLiquidacionImpor, gridBagConstraintsDetalleLiquidacionImpor);
				
					this.jPanelCamposOcultosDetalleLiquidacionImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	        this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleLiquidacionImpor.add(this.jPanelAccionesFormularioDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);							
			
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
	        this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleLiquidacionImpor.add(this.jPanelAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleLiquidacionImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor=   new JScrollPane(this.jPanelCamposDetalleLiquidacionImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleLiquidacionImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
			this.gridBagConstraintsDetalleLiquidacionImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleLiquidacionImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleLiquidacionImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);			
			
			this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
			this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
			
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		
			
		this.gridBagConstraintsDetalleLiquidacionImpor = new GridBagConstraints();
		this.gridBagConstraintsDetalleLiquidacionImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleLiquidacionImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleLiquidacionImpor, this.gridBagConstraintsDetalleLiquidacionImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleLiquidacionImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleLiquidacionImpor;
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
