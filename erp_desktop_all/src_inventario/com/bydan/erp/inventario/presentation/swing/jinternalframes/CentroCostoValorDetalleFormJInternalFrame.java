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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.CentroCostoValorConstantesFunciones;

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
public class CentroCostoValorDetalleFormJInternalFrame extends CentroCostoValorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCentroCostoValor;
	
	protected JMenuBar jmenuBarDetalleCentroCostoValor;
	
	protected JMenu jmenuDetalleCentroCostoValor;
	protected JMenu jmenuDetalleArchivoCentroCostoValor;
	protected JMenu jmenuDetalleAccionesCentroCostoValor;
	protected JMenu jmenuDetalleDatosCentroCostoValor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCentroCostoValor;	
	protected GridBagConstraints gridBagConstraintsCentroCostoValor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CentroCostoValorBeanSwingJInternalFrameAdditional jInternalFrameDetalleCentroCostoValor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public CentroCostoValorSessionBean centrocostovalorSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public CentroCostoValorLogic centrocostovalorLogic;
	
	public JScrollPane jScrollPanelDatosCentroCostoValor;
	public JScrollPane jScrollPanelDatosEdicionCentroCostoValor;
	public JScrollPane jScrollPanelDatosGeneralCentroCostoValor;
	
	protected JPanel jPanelCamposCentroCostoValor;    
	protected JPanel jPanelCamposOcultosCentroCostoValor;    	
	protected JPanel jPanelAccionesCentroCostoValor;
	protected JPanel jPanelAccionesFormularioCentroCostoValor;
    
	
	
	protected Integer iXPanelCamposCentroCostoValor=0;
	protected Integer iYPanelCamposCentroCostoValor=0;
	
	protected Integer iXPanelCamposOcultosCentroCostoValor=0;
	protected Integer iYPanelCamposOcultosCentroCostoValor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCentroCostoValor;
	public JButton jButtonModificarCentroCostoValor;
	public JButton jButtonActualizarCentroCostoValor;
    public JButton jButtonEliminarCentroCostoValor;
	public JButton jButtonCancelarCentroCostoValor;
    public JButton jButtonGuardarCambiosCentroCostoValor;
	public JButton jButtonGuardarCambiosTablaCentroCostoValor;
	protected JButton jButtonCerrarCentroCostoValor;
	
	
	protected JButton jButtonProcesarInformacionCentroCostoValor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCentroCostoValor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCentroCostoValor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCentroCostoValor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCentroCostoValor;
	protected JButton jButtonModificarToolBarCentroCostoValor;
	protected JButton jButtonActualizarToolBarCentroCostoValor;
    protected JButton jButtonEliminarToolBarCentroCostoValor;
	protected JButton jButtonCancelarToolBarCentroCostoValor;
    protected JButton jButtonGuardarCambiosToolBarCentroCostoValor;
	protected JButton jButtonGuardarCambiosTablaToolBarCentroCostoValor;
	protected JButton jButtonMostrarOcultarTablaToolBarCentroCostoValor;
	protected JButton jButtonCerrarToolBarCentroCostoValor;
	
	protected JButton jButtonProcesarInformacionToolBarCentroCostoValor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCentroCostoValor;
	protected JMenuItem jMenuItemModificarCentroCostoValor;
	protected JMenuItem jMenuItemActualizarCentroCostoValor;
    protected JMenuItem jMenuItemEliminarCentroCostoValor;
	protected JMenuItem jMenuItemCancelarCentroCostoValor;
    protected JMenuItem jMenuItemGuardarCambiosCentroCostoValor;
	protected JMenuItem jMenuItemGuardarCambiosTablaCentroCostoValor;
	protected JMenuItem jMenuItemCerrarCentroCostoValor;
	protected JMenuItem jMenuItemDetalleCerrarCentroCostoValor;
	protected JMenuItem jMenuItemDetalleMostarOcultarCentroCostoValor;
	
	protected JMenuItem jMenuItemProcesarInformacionCentroCostoValor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCentroCostoValor;
	protected JMenuItem jMenuItemMostrarOcultarCentroCostoValor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCentroCostoValor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCentroCostoValor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCentroCostoValor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCentroCostoValor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCentroCostoValor;
	public JLabel jLabelIdCentroCostoValor;
	public JLabel jLabelidCentroCostoValor;
	public JButton jButtonidCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelnombreCentroCostoValor;
	public JLabel jLabelnombreCentroCostoValor;
	public JTextField jTextFieldnombreCentroCostoValor;
	public JButton jButtonnombreCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPaneleneroCentroCostoValor;
	public JLabel jLabeleneroCentroCostoValor;
	public JTextField jTextFieldeneroCentroCostoValor;
	public JButton jButtoneneroCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelfebreroCentroCostoValor;
	public JLabel jLabelfebreroCentroCostoValor;
	public JTextField jTextFieldfebreroCentroCostoValor;
	public JButton jButtonfebreroCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelmarzoCentroCostoValor;
	public JLabel jLabelmarzoCentroCostoValor;
	public JTextField jTextFieldmarzoCentroCostoValor;
	public JButton jButtonmarzoCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelabrilCentroCostoValor;
	public JLabel jLabelabrilCentroCostoValor;
	public JTextField jTextFieldabrilCentroCostoValor;
	public JButton jButtonabrilCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelmayoCentroCostoValor;
	public JLabel jLabelmayoCentroCostoValor;
	public JTextField jTextFieldmayoCentroCostoValor;
	public JButton jButtonmayoCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPaneljunioCentroCostoValor;
	public JLabel jLabeljunioCentroCostoValor;
	public JTextField jTextFieldjunioCentroCostoValor;
	public JButton jButtonjunioCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPaneljulioCentroCostoValor;
	public JLabel jLabeljulioCentroCostoValor;
	public JTextField jTextFieldjulioCentroCostoValor;
	public JButton jButtonjulioCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelagostoCentroCostoValor;
	public JLabel jLabelagostoCentroCostoValor;
	public JTextField jTextFieldagostoCentroCostoValor;
	public JButton jButtonagostoCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelseptiembreCentroCostoValor;
	public JLabel jLabelseptiembreCentroCostoValor;
	public JTextField jTextFieldseptiembreCentroCostoValor;
	public JButton jButtonseptiembreCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPaneloctubreCentroCostoValor;
	public JLabel jLabeloctubreCentroCostoValor;
	public JTextField jTextFieldoctubreCentroCostoValor;
	public JButton jButtonoctubreCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelnoviembreCentroCostoValor;
	public JLabel jLabelnoviembreCentroCostoValor;
	public JTextField jTextFieldnoviembreCentroCostoValor;
	public JButton jButtonnoviembreCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPaneldiciembreCentroCostoValor;
	public JLabel jLabeldiciembreCentroCostoValor;
	public JTextField jTextFielddiciembreCentroCostoValor;
	public JButton jButtondiciembreCentroCostoValorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCentroCostoValor;
	public JLabel jLabelid_empresaCentroCostoValor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCentroCostoValor;
	public JButton jButtonid_empresaCentroCostoValor= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoValorUpdate= new JButtonMe();
	public JButton jButtonid_empresaCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCentroCostoValor;
	public JLabel jLabelid_sucursalCentroCostoValor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCentroCostoValor;
	public JButton jButtonid_sucursalCentroCostoValor= new JButtonMe();
	public JButton jButtonid_sucursalCentroCostoValorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCentroCostoValor;
	public JLabel jLabelid_ejercicioCentroCostoValor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCentroCostoValor;
	public JButton jButtonid_ejercicioCentroCostoValor= new JButtonMe();
	public JButton jButtonid_ejercicioCentroCostoValorUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCentroCostoValorBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoCentroCostoValor;
	public JLabel jLabelid_centro_costoCentroCostoValor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoCentroCostoValor;
	public JButton jButtonid_centro_costoCentroCostoValor= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoValorUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoValorBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoCentroCostoValorArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCentroCostoValor;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CentroCostoValorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCentroCostoValor=new JPanel();
				this.jPanelAccionesFormularioCentroCostoValor=new JPanel();
				this.jmenuBarDetalleCentroCostoValor=new JMenuBar();
				this.jTtoolBarDetalleCentroCostoValor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CentroCostoValorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CentroCostoValorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CentroCostoValor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCentroCostoValor() {
		return this.jButtonActualizarToolBarCentroCostoValor;
	}
	
	public JButton getjButtonEliminarToolBarCentroCostoValor() {
		return this.jButtonEliminarToolBarCentroCostoValor;
	}
	
	public JButton getjButtonCancelarToolBarCentroCostoValor() {
		return this.jButtonCancelarToolBarCentroCostoValor;
	}		
	
	public JButton getjButtonProcesarInformacionCentroCostoValor() {
		return this.jButtonProcesarInformacionCentroCostoValor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCentroCostoValor)	{
		this.jButtonProcesarInformacionCentroCostoValor = jButtonProcesarInformacionCentroCostoValor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCentroCostoValor() {
		return this.jComboBoxTiposAccionesCentroCostoValor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCentroCostoValor(
			JComboBox jComboBoxTiposRelacionesCentroCostoValor) {
		this.jComboBoxTiposRelacionesCentroCostoValor = jComboBoxTiposRelacionesCentroCostoValor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCentroCostoValor(
			JComboBox jComboBoxTiposAccionesCentroCostoValor) {
		this.jComboBoxTiposAccionesCentroCostoValor = jComboBoxTiposAccionesCentroCostoValor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCentroCostoValor() {
		return this.jComboBoxTiposAccionesFormularioCentroCostoValor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCentroCostoValor(
			JComboBox jComboBoxTiposAccionesFormularioCentroCostoValor) {
		this.jComboBoxTiposAccionesFormularioCentroCostoValor = jComboBoxTiposAccionesFormularioCentroCostoValor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.centrocostovalorSessionBean=new CentroCostoValorSessionBean();
		
		this.centrocostovalorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostovalorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.centrocostovalorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CentroCostoValorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CentroCostoValorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CentroCostoValorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Centro Costo Valor MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
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
	
		CentroCostoValorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCentroCostoValor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCentroCostoValor=new JButtonMe();
				this.jButtonModificarToolBarCentroCostoValor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCentroCostoValor,this.jTtoolBarDetalleCentroCostoValor,
							"actualizar","actualizar","Actualizar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCentroCostoValor,this.jTtoolBarDetalleCentroCostoValor,
							"eliminar","eliminar","Eliminar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCentroCostoValor,this.jTtoolBarDetalleCentroCostoValor,
							"cancelar","cancelar","Cancelar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCentroCostoValor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCentroCostoValor,this.jTtoolBarDetalleCentroCostoValor,
							"guardarcambios","guardarcambios","Guardar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCentroCostoValor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCentroCostoValor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCentroCostoValor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCentroCostoValor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCentroCostoValor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCentroCostoValor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCentroCostoValor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCentroCostoValor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCentroCostoValor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCentroCostoValor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCentroCostoValor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCentroCostoValor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCentroCostoValor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCentroCostoValor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCentroCostoValor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCentroCostoValor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCentroCostoValor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCentroCostoValor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCentroCostoValor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCentroCostoValor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCentroCostoValor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCentroCostoValor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCentroCostoValor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCentroCostoValor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCentroCostoValor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCentroCostoValor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCentroCostoValor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCentroCostoValor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCentroCostoValor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCentroCostoValor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCentroCostoValor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCentroCostoValor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCentroCostoValor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCentroCostoValor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCentroCostoValor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCentroCostoValor.add(this.jMenuItemDetalleCerrarCentroCostoValor);
		
		this.jmenuDetalleAccionesCentroCostoValor.add(this.jMenuItemActualizarCentroCostoValor);
		this.jmenuDetalleAccionesCentroCostoValor.add(this.jMenuItemEliminarCentroCostoValor);
		this.jmenuDetalleAccionesCentroCostoValor.add(this.jMenuItemCancelarCentroCostoValor);		
		
		//this.jmenuDetalleDatosCentroCostoValor.add(this.jMenuItemDetalleAbrirOrderByCentroCostoValor);				
		this.jmenuDetalleDatosCentroCostoValor.add(this.jMenuItemDetalleMostarOcultarCentroCostoValor);				
				
		//this.jmenuDetalleAccionesCentroCostoValor.add(this.jMenuItemGuardarCambiosCentroCostoValor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCentroCostoValor.add(this.jmenuDetalleArchivoCentroCostoValor);		
		this.jmenuBarDetalleCentroCostoValor.add(this.jmenuDetalleAccionesCentroCostoValor);		
		this.jmenuBarDetalleCentroCostoValor.add(this.jmenuDetalleDatosCentroCostoValor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCentroCostoValor);				
	}
	
	
	public void inicializarElementosCamposCentroCostoValor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCentroCostoValor = new JLabelMe();
		jLabelIdCentroCostoValor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCentroCostoValor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCentroCostoValor= new GridBagLayout();

		this.jPanelidCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);

		jLabelidCentroCostoValor = new JLabel();
		jLabelidCentroCostoValor.setText("Id");

		jLabelidCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCentroCostoValor = new JLabelMe();
		this.jLabelnombreCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCentroCostoValor.setToolTipText("Nombre");
		this.jLabelnombreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelnombreCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldnombreCentroCostoValor= new JTextFieldMe();

		jTextFieldnombreCentroCostoValor.setEnabled(false);
		jTextFieldnombreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonnombreCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCentroCostoValorBusqueda.setText("U");
		this.jButtonnombreCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabeleneroCentroCostoValor = new JLabelMe();
		this.jLabeleneroCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_ENERO+" : *");
		this.jLabeleneroCentroCostoValor.setToolTipText("Enero");
		this.jLabeleneroCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeleneroCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeleneroCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeleneroCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneleneroCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneleneroCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_ENERO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPaneleneroCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldeneroCentroCostoValor= new JTextFieldMe();
		jTextFieldeneroCentroCostoValor.setEnabled(false);
		jTextFieldeneroCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldeneroCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldeneroCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldeneroCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldeneroCentroCostoValor.setText("0.0");

		this.jButtoneneroCentroCostoValorBusqueda= new JButtonMe();
		this.jButtoneneroCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoneneroCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoneneroCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoneneroCentroCostoValorBusqueda.setText("U");
		this.jButtoneneroCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoneneroCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoneneroCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldeneroCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldeneroCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"eneroCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoneneroCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelfebreroCentroCostoValor = new JLabelMe();
		this.jLabelfebreroCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_FEBRERO+" : *");
		this.jLabelfebreroCentroCostoValor.setToolTipText("Febrero");
		this.jLabelfebreroCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfebreroCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfebreroCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfebreroCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfebreroCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfebreroCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_FEBRERO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelfebreroCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldfebreroCentroCostoValor= new JTextFieldMe();
		jTextFieldfebreroCentroCostoValor.setEnabled(false);
		jTextFieldfebreroCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfebreroCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfebreroCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfebreroCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfebreroCentroCostoValor.setText("0.0");

		this.jButtonfebreroCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonfebreroCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfebreroCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfebreroCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfebreroCentroCostoValorBusqueda.setText("U");
		this.jButtonfebreroCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfebreroCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfebreroCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfebreroCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfebreroCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"febreroCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfebreroCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelmarzoCentroCostoValor = new JLabelMe();
		this.jLabelmarzoCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_MARZO+" : *");
		this.jLabelmarzoCentroCostoValor.setToolTipText("Marzo");
		this.jLabelmarzoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarzoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarzoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarzoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarzoCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarzoCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_MARZO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelmarzoCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldmarzoCentroCostoValor= new JTextFieldMe();
		jTextFieldmarzoCentroCostoValor.setEnabled(false);
		jTextFieldmarzoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmarzoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmarzoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmarzoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmarzoCentroCostoValor.setText("0.0");

		this.jButtonmarzoCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonmarzoCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarzoCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarzoCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarzoCentroCostoValorBusqueda.setText("U");
		this.jButtonmarzoCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarzoCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarzoCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmarzoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmarzoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marzoCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarzoCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelabrilCentroCostoValor = new JLabelMe();
		this.jLabelabrilCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_ABRIL+" : *");
		this.jLabelabrilCentroCostoValor.setToolTipText("Abril");
		this.jLabelabrilCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelabrilCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelabrilCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelabrilCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelabrilCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelabrilCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_ABRIL);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelabrilCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldabrilCentroCostoValor= new JTextFieldMe();
		jTextFieldabrilCentroCostoValor.setEnabled(false);
		jTextFieldabrilCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabrilCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldabrilCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldabrilCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldabrilCentroCostoValor.setText("0.0");

		this.jButtonabrilCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonabrilCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabrilCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonabrilCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonabrilCentroCostoValorBusqueda.setText("U");
		this.jButtonabrilCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonabrilCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonabrilCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldabrilCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldabrilCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"abrilCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonabrilCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelmayoCentroCostoValor = new JLabelMe();
		this.jLabelmayoCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_MAYO+" : *");
		this.jLabelmayoCentroCostoValor.setToolTipText("Mayo");
		this.jLabelmayoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmayoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmayoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmayoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmayoCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmayoCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_MAYO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelmayoCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldmayoCentroCostoValor= new JTextFieldMe();
		jTextFieldmayoCentroCostoValor.setEnabled(false);
		jTextFieldmayoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmayoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmayoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmayoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmayoCentroCostoValor.setText("0.0");

		this.jButtonmayoCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonmayoCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmayoCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmayoCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmayoCentroCostoValorBusqueda.setText("U");
		this.jButtonmayoCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmayoCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmayoCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmayoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmayoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mayoCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmayoCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabeljunioCentroCostoValor = new JLabelMe();
		this.jLabeljunioCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_JUNIO+" : *");
		this.jLabeljunioCentroCostoValor.setToolTipText("Junio");
		this.jLabeljunioCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeljunioCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeljunioCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeljunioCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneljunioCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneljunioCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_JUNIO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPaneljunioCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldjunioCentroCostoValor= new JTextFieldMe();
		jTextFieldjunioCentroCostoValor.setEnabled(false);
		jTextFieldjunioCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldjunioCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldjunioCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldjunioCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldjunioCentroCostoValor.setText("0.0");

		this.jButtonjunioCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonjunioCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonjunioCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonjunioCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonjunioCentroCostoValorBusqueda.setText("U");
		this.jButtonjunioCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonjunioCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonjunioCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldjunioCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldjunioCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"junioCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonjunioCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabeljulioCentroCostoValor = new JLabelMe();
		this.jLabeljulioCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_JULIO+" : *");
		this.jLabeljulioCentroCostoValor.setToolTipText("Julio");
		this.jLabeljulioCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeljulioCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeljulioCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeljulioCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneljulioCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneljulioCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_JULIO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPaneljulioCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldjulioCentroCostoValor= new JTextFieldMe();
		jTextFieldjulioCentroCostoValor.setEnabled(false);
		jTextFieldjulioCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldjulioCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldjulioCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldjulioCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldjulioCentroCostoValor.setText("0.0");

		this.jButtonjulioCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonjulioCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonjulioCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonjulioCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonjulioCentroCostoValorBusqueda.setText("U");
		this.jButtonjulioCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonjulioCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonjulioCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldjulioCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldjulioCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"julioCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonjulioCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelagostoCentroCostoValor = new JLabelMe();
		this.jLabelagostoCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_AGOSTO+" : *");
		this.jLabelagostoCentroCostoValor.setToolTipText("Agosto");
		this.jLabelagostoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelagostoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelagostoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelagostoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelagostoCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelagostoCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_AGOSTO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelagostoCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldagostoCentroCostoValor= new JTextFieldMe();
		jTextFieldagostoCentroCostoValor.setEnabled(false);
		jTextFieldagostoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldagostoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldagostoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldagostoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldagostoCentroCostoValor.setText("0.0");

		this.jButtonagostoCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonagostoCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonagostoCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonagostoCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonagostoCentroCostoValorBusqueda.setText("U");
		this.jButtonagostoCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonagostoCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonagostoCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldagostoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldagostoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"agostoCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonagostoCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelseptiembreCentroCostoValor = new JLabelMe();
		this.jLabelseptiembreCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE+" : *");
		this.jLabelseptiembreCentroCostoValor.setToolTipText("Septiembre");
		this.jLabelseptiembreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseptiembreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelseptiembreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelseptiembreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelseptiembreCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelseptiembreCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_SEPTIEMBRE);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelseptiembreCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldseptiembreCentroCostoValor= new JTextFieldMe();
		jTextFieldseptiembreCentroCostoValor.setEnabled(false);
		jTextFieldseptiembreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseptiembreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldseptiembreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldseptiembreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldseptiembreCentroCostoValor.setText("0.0");

		this.jButtonseptiembreCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonseptiembreCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseptiembreCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonseptiembreCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonseptiembreCentroCostoValorBusqueda.setText("U");
		this.jButtonseptiembreCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonseptiembreCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonseptiembreCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldseptiembreCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldseptiembreCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"septiembreCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonseptiembreCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabeloctubreCentroCostoValor = new JLabelMe();
		this.jLabeloctubreCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_OCTUBRE+" : *");
		this.jLabeloctubreCentroCostoValor.setToolTipText("Octubre");
		this.jLabeloctubreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeloctubreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeloctubreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeloctubreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneloctubreCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneloctubreCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_OCTUBRE);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPaneloctubreCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldoctubreCentroCostoValor= new JTextFieldMe();
		jTextFieldoctubreCentroCostoValor.setEnabled(false);
		jTextFieldoctubreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldoctubreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldoctubreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldoctubreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldoctubreCentroCostoValor.setText("0.0");

		this.jButtonoctubreCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonoctubreCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonoctubreCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonoctubreCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonoctubreCentroCostoValorBusqueda.setText("U");
		this.jButtonoctubreCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonoctubreCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonoctubreCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldoctubreCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldoctubreCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"octubreCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonoctubreCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabelnoviembreCentroCostoValor = new JLabelMe();
		this.jLabelnoviembreCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE+" : *");
		this.jLabelnoviembreCentroCostoValor.setToolTipText("Noviembre");
		this.jLabelnoviembreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnoviembreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnoviembreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnoviembreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnoviembreCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnoviembreCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_NOVIEMBRE);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelnoviembreCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFieldnoviembreCentroCostoValor= new JTextFieldMe();
		jTextFieldnoviembreCentroCostoValor.setEnabled(false);
		jTextFieldnoviembreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnoviembreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnoviembreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnoviembreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnoviembreCentroCostoValor.setText("0.0");

		this.jButtonnoviembreCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonnoviembreCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnoviembreCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnoviembreCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnoviembreCentroCostoValorBusqueda.setText("U");
		this.jButtonnoviembreCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnoviembreCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnoviembreCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnoviembreCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnoviembreCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"noviembreCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnoviembreCentroCostoValorBusqueda.setVisible(false);		}


					
		this.jLabeldiciembreCentroCostoValor = new JLabelMe();
		this.jLabeldiciembreCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE+" : *");
		this.jLabeldiciembreCentroCostoValor.setToolTipText("Diciembre");
		this.jLabeldiciembreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiciembreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiciembreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiciembreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiciembreCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiciembreCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_DICIEMBRE);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPaneldiciembreCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jTextFielddiciembreCentroCostoValor= new JTextFieldMe();
		jTextFielddiciembreCentroCostoValor.setEnabled(false);
		jTextFielddiciembreCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiciembreCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiciembreCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiciembreCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiciembreCentroCostoValor.setText("0.0");

		this.jButtondiciembreCentroCostoValorBusqueda= new JButtonMe();
		this.jButtondiciembreCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiciembreCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiciembreCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiciembreCentroCostoValorBusqueda.setText("U");
		this.jButtondiciembreCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiciembreCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiciembreCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiciembreCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiciembreCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diciembreCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiciembreCentroCostoValorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCentroCostoValor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCentroCostoValor = new JLabelMe();
		this.jLabelid_empresaCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCentroCostoValor.setToolTipText("Empresa");
		this.jLabelid_empresaCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelid_empresaCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jComboBoxid_empresaCentroCostoValor= new JComboBoxMe();
		jComboBoxid_empresaCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCentroCostoValor.setEnabled(false);

		this.jButtonid_empresaCentroCostoValor= new JButtonMe();
		this.jButtonid_empresaCentroCostoValor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoValor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoValor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCentroCostoValor.setText("Buscar");
		this.jButtonid_empresaCentroCostoValor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCentroCostoValor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoValor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoValor"));

		this.jButtonid_empresaCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonid_empresaCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoValorBusqueda.setText("U");
		this.jButtonid_empresaCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCentroCostoValorBusqueda.setVisible(false);		}

		this.jButtonid_empresaCentroCostoValorUpdate= new JButtonMe();
		this.jButtonid_empresaCentroCostoValorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoValorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCentroCostoValorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCentroCostoValorUpdate.setText("U");
		this.jButtonid_empresaCentroCostoValorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCentroCostoValorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCentroCostoValorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCentroCostoValorUpdate"));



					
		this.jLabelid_sucursalCentroCostoValor = new JLabelMe();
		this.jLabelid_sucursalCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCentroCostoValor.setToolTipText("Sucursal");
		this.jLabelid_sucursalCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelid_sucursalCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jComboBoxid_sucursalCentroCostoValor= new JComboBoxMe();
		jComboBoxid_sucursalCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCentroCostoValor.setEnabled(false);

		this.jButtonid_sucursalCentroCostoValor= new JButtonMe();
		this.jButtonid_sucursalCentroCostoValor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoValor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoValor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCentroCostoValor.setText("Buscar");
		this.jButtonid_sucursalCentroCostoValor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCentroCostoValor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoValor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoValor"));

		this.jButtonid_sucursalCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonid_sucursalCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCentroCostoValorBusqueda.setText("U");
		this.jButtonid_sucursalCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCentroCostoValorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCentroCostoValorUpdate= new JButtonMe();
		this.jButtonid_sucursalCentroCostoValorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoValorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCentroCostoValorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCentroCostoValorUpdate.setText("U");
		this.jButtonid_sucursalCentroCostoValorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCentroCostoValorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCentroCostoValorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCentroCostoValorUpdate"));



					
		this.jLabelid_ejercicioCentroCostoValor = new JLabelMe();
		this.jLabelid_ejercicioCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCentroCostoValor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelid_ejercicioCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jComboBoxid_ejercicioCentroCostoValor= new JComboBoxMe();
		jComboBoxid_ejercicioCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCentroCostoValor.setEnabled(false);

		this.jButtonid_ejercicioCentroCostoValor= new JButtonMe();
		this.jButtonid_ejercicioCentroCostoValor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCentroCostoValor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCentroCostoValor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCentroCostoValor.setText("Buscar");
		this.jButtonid_ejercicioCentroCostoValor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCentroCostoValor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCentroCostoValor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCentroCostoValor"));

		this.jButtonid_ejercicioCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCentroCostoValorBusqueda.setText("U");
		this.jButtonid_ejercicioCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCentroCostoValorBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCentroCostoValorUpdate= new JButtonMe();
		this.jButtonid_ejercicioCentroCostoValorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCentroCostoValorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCentroCostoValorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCentroCostoValorUpdate.setText("U");
		this.jButtonid_ejercicioCentroCostoValorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCentroCostoValorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCentroCostoValorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCentroCostoValorUpdate"));



					
		this.jLabelid_centro_costoCentroCostoValor = new JLabelMe();
		this.jLabelid_centro_costoCentroCostoValor.setText(""+CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoCentroCostoValor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoCentroCostoValor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoCentroCostoValor.setToolTipText(CentroCostoValorConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutCentroCostoValor = new GridBagLayout();
		this.jPanelid_centro_costoCentroCostoValor.setLayout(this.gridaBagLayoutCentroCostoValor);


		jComboBoxid_centro_costoCentroCostoValor= new JComboBoxMe();
		jComboBoxid_centro_costoCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoCentroCostoValor= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoValor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoValor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoValor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCentroCostoValor.setText("Buscar");
		this.jButtonid_centro_costoCentroCostoValor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoCentroCostoValor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoValor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoValor"));

		this.jButtonid_centro_costoCentroCostoValorBusqueda= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoValorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoValorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoValorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoValorBusqueda.setText("U");
		this.jButtonid_centro_costoCentroCostoValorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoCentroCostoValorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoValorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoValorBusqueda"));

		if(this.centrocostovalorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoCentroCostoValorBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoCentroCostoValorUpdate= new JButtonMe();
		this.jButtonid_centro_costoCentroCostoValorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoValorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCentroCostoValorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCentroCostoValorUpdate.setText("U");
		this.jButtonid_centro_costoCentroCostoValorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoCentroCostoValorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoValorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoValorUpdate"));


		jButtonid_centro_costoCentroCostoValorArbol= new JButtonMe();
		jButtonid_centro_costoCentroCostoValorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoValorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoValorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCentroCostoValorArbol.setText("Arbol");
		jButtonid_centro_costoCentroCostoValorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoCentroCostoValorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCentroCostoValorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoCentroCostoValor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCentroCostoValor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCentroCostoValorArbol"));



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
		//this.jInternalFrameDetalleCentroCostoValor = new CentroCostoValorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Centro Costo Valor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCentroCostoValor= new GridBagLayout();
		

		
		String sToolTipCentroCostoValor="";
		sToolTipCentroCostoValor=CentroCostoValorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCentroCostoValor+="(Inventario.CentroCostoValor)";
		}
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			sToolTipCentroCostoValor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCentroCostoValor = new JButtonMe();
		this.jButtonModificarCentroCostoValor = new JButtonMe();
        this.jButtonActualizarCentroCostoValor = new JButtonMe();
        this.jButtonEliminarCentroCostoValor = new JButtonMe();
        this.jButtonCancelarCentroCostoValor = new JButtonMe();
        this.jButtonGuardarCambiosCentroCostoValor = new JButtonMe();
		this.jButtonGuardarCambiosTablaCentroCostoValor = new JButtonMe();
		this.jButtonCerrarCentroCostoValor = new JButtonMe();
		
		this.jScrollPanelDatosCentroCostoValor = new JScrollPane();   
        this.jScrollPanelDatosEdicionCentroCostoValor = new JScrollPane();
		this.jScrollPanelDatosGeneralCentroCostoValor = new JScrollPane();
				
		
		
		this.jPanelCamposCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Centro Costo Valor";
		
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Centro Costo Valores" + this.sPath));
		} else {
			this.jScrollPanelDatosCentroCostoValor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCentroCostoValor.setName("jPanelCamposCentroCostoValor"); 

		this.jPanelCamposOcultosCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCentroCostoValor.setName("jPanelCamposOcultosCentroCostoValor"); 

        this.jPanelAccionesCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCentroCostoValor.setToolTipText("Acciones");
        this.jPanelAccionesCentroCostoValor.setName("Acciones"); 

		this.jPanelAccionesFormularioCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCentroCostoValor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCentroCostoValor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCentroCostoValor.setText("Nuevo");
		this.jButtonModificarCentroCostoValor.setText("Editar");
        this.jButtonActualizarCentroCostoValor.setText("Actualizar");
        this.jButtonEliminarCentroCostoValor.setText("Eliminar");
        this.jButtonCancelarCentroCostoValor.setText("Cancelar");
        this.jButtonGuardarCambiosCentroCostoValor.setText("Guardar");
		this.jButtonGuardarCambiosTablaCentroCostoValor.setText("Guardar");
		this.jButtonCerrarCentroCostoValor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCentroCostoValor,"nuevo_button","Nuevo",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCentroCostoValor,"modificar_button","Editar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCentroCostoValor,"actualizar_button","Actualizar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCentroCostoValor,"eliminar_button","Eliminar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCentroCostoValor,"cancelar_button","Cancelar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCentroCostoValor,"guardarcambios_button","Guardar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCentroCostoValor,"guardarcambiostabla_button","Guardar",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCentroCostoValor,"cerrar_button","Salir",this.centrocostovalorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCentroCostoValor.setToolTipText("Nuevo"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCentroCostoValor.setToolTipText("Editar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCentroCostoValor.setToolTipText("Actualizar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCentroCostoValor.setToolTipText("Eliminar)"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCentroCostoValor.setToolTipText("Cancelar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCentroCostoValor.setToolTipText("Guardar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCentroCostoValor.setToolTipText("Guardar"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCentroCostoValor.setToolTipText("Salir"+" "+CentroCostoValorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCentroCostoValor";
		inputMap = this.jButtonNuevoCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCentroCostoValor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCentroCostoValor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCentroCostoValor";
		inputMap = this.jButtonActualizarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCentroCostoValor"));
		
		//ELIMINAR
		sMapKey = "EliminarCentroCostoValor";
		inputMap = this.jButtonEliminarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCentroCostoValor"));
		
		//CANCELAR	
		sMapKey = "CancelarCentroCostoValor";
		inputMap = this.jButtonCancelarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCentroCostoValor"));
		
		//CERRAR		
		sMapKey = "CerrarCentroCostoValor";
		inputMap = this.jButtonCerrarCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCentroCostoValor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCentroCostoValor";
		inputMap = this.jButtonGuardarCambiosTablaCentroCostoValor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCentroCostoValor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCentroCostoValor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCentroCostoValor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCentroCostoValor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCentroCostoValor.setToolTipText("Nuevo CentroCostoValor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCentroCostoValor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCentroCostoValor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCentroCostoValor.setToolTipText("Sin Cerrar Ventana CentroCostoValor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCentroCostoValor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCentroCostoValor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCentroCostoValor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCentroCostoValor.setText("Accion");
		this.jComboBoxTiposAccionesCentroCostoValor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCentroCostoValor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCentroCostoValor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCentroCostoValor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCentroCostoValor = new JLabelMe();
		
		this.jLabelAccionesCentroCostoValor.setText("Acciones");		
		this.jLabelAccionesCentroCostoValor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoValor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCentroCostoValor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCentroCostoValor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCentroCostoValor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCentroCostoValor=new JTabbedPane();
		this.jTabbedPaneRelacionesCentroCostoValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCentroCostoValor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCentroCostoValor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoValor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCentroCostoValor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCentroCostoValor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCentroCostoValor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCostoValor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCentroCostoValor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCentroCostoValor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCentroCostoValor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCentroCostoValor = new GridBagLayout();
		
		this.jPanelCamposCentroCostoValor.setLayout(gridaBagLayoutCamposCentroCostoValor);
		this.jPanelCamposOcultosCentroCostoValor.setLayout(gridaBagLayoutCamposOcultosCentroCostoValor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCentroCostoValor.add(jLabelIdCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCentroCostoValor.add(jLabelidCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCentroCostoValor.add(jLabelid_empresaCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCostoValor.add(jButtonid_empresaCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 3;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCentroCostoValor.add(jButtonid_empresaCentroCostoValorUpdate, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCentroCostoValor.add(jComboBoxid_empresaCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCentroCostoValor.add(jLabelid_sucursalCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCentroCostoValor.add(jButtonid_sucursalCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 3;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCentroCostoValor.add(jButtonid_sucursalCentroCostoValorUpdate, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCentroCostoValor.add(jComboBoxid_sucursalCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioCentroCostoValor.add(jLabelid_ejercicioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCentroCostoValor.add(jButtonid_ejercicioCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 3;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCentroCostoValor.add(jButtonid_ejercicioCentroCostoValorUpdate, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioCentroCostoValor.add(jComboBoxid_ejercicioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoCentroCostoValor.add(jLabelid_centro_costoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 2;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCentroCostoValor.add(jButtonid_centro_costoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 3;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCentroCostoValor.add(jButtonid_centro_costoCentroCostoValorArbol, this.gridBagConstraintsCentroCostoValor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 4;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCostoValor.add(jButtonid_centro_costoCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 5;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCentroCostoValor.add(jButtonid_centro_costoCentroCostoValorUpdate, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoCentroCostoValor.add(jComboBoxid_centro_costoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCentroCostoValor.add(jLabelnombreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCentroCostoValor.add(jButtonnombreCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCentroCostoValor.add(jTextFieldnombreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneleneroCentroCostoValor.add(jLabeleneroCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPaneleneroCentroCostoValor.add(jButtoneneroCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneleneroCentroCostoValor.add(jTextFieldeneroCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfebreroCentroCostoValor.add(jLabelfebreroCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfebreroCentroCostoValor.add(jButtonfebreroCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfebreroCentroCostoValor.add(jTextFieldfebreroCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarzoCentroCostoValor.add(jLabelmarzoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarzoCentroCostoValor.add(jButtonmarzoCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarzoCentroCostoValor.add(jTextFieldmarzoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelabrilCentroCostoValor.add(jLabelabrilCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelabrilCentroCostoValor.add(jButtonabrilCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelabrilCentroCostoValor.add(jTextFieldabrilCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmayoCentroCostoValor.add(jLabelmayoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelmayoCentroCostoValor.add(jButtonmayoCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmayoCentroCostoValor.add(jTextFieldmayoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneljunioCentroCostoValor.add(jLabeljunioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPaneljunioCentroCostoValor.add(jButtonjunioCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneljunioCentroCostoValor.add(jTextFieldjunioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneljulioCentroCostoValor.add(jLabeljulioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPaneljulioCentroCostoValor.add(jButtonjulioCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneljulioCentroCostoValor.add(jTextFieldjulioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelagostoCentroCostoValor.add(jLabelagostoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelagostoCentroCostoValor.add(jButtonagostoCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelagostoCentroCostoValor.add(jTextFieldagostoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelseptiembreCentroCostoValor.add(jLabelseptiembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelseptiembreCentroCostoValor.add(jButtonseptiembreCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelseptiembreCentroCostoValor.add(jTextFieldseptiembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneloctubreCentroCostoValor.add(jLabeloctubreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPaneloctubreCentroCostoValor.add(jButtonoctubreCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneloctubreCentroCostoValor.add(jTextFieldoctubreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnoviembreCentroCostoValor.add(jLabelnoviembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnoviembreCentroCostoValor.add(jButtonnoviembreCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnoviembreCentroCostoValor.add(jTextFieldnoviembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 0;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldiciembreCentroCostoValor.add(jLabeldiciembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		//this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = 2;
		this.gridBagConstraintsCentroCostoValor.ipadx = 0;
		this.gridBagConstraintsCentroCostoValor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiciembreCentroCostoValor.add(jButtondiciembreCentroCostoValorBusqueda, this.gridBagConstraintsCentroCostoValor);
	}

	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCentroCostoValor.gridy = 0;
	this.gridBagConstraintsCentroCostoValor.gridx = 1;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldiciembreCentroCostoValor.add(jTextFielddiciembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelidCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelid_centro_costoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelnombreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPaneleneroCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelfebreroCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelmarzoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelabrilCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelmayoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPaneljunioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPaneljulioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelagostoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelseptiembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPaneloctubreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPanelnoviembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCentroCostoValor.add(this.jPaneldiciembreCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposCentroCostoValor % 1==0) {
		iXPanelCamposCentroCostoValor=0;
		iYPanelCamposCentroCostoValor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposOcultosCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposOcultosCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoValor.add(this.jPanelid_empresaCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposOcultosCentroCostoValor % 1==0) {
		iXPanelCamposOcultosCentroCostoValor=0;
		iYPanelCamposOcultosCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposOcultosCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposOcultosCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoValor.add(this.jPanelid_sucursalCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposOcultosCentroCostoValor % 1==0) {
		iXPanelCamposOcultosCentroCostoValor=0;
		iYPanelCamposOcultosCentroCostoValor++;
	}
	this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCentroCostoValor.gridy = iYPanelCamposOcultosCentroCostoValor;
	this.gridBagConstraintsCentroCostoValor.gridx = iXPanelCamposOcultosCentroCostoValor++;
	this.gridBagConstraintsCentroCostoValor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCentroCostoValor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCentroCostoValor.add(this.jPanelid_ejercicioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);



	if(iXPanelCamposOcultosCentroCostoValor % 1==0) {
		iXPanelCamposOcultosCentroCostoValor=0;
		iYPanelCamposOcultosCentroCostoValor++;
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
			
		GridBagLayout gridaBagLayoutAccionesCentroCostoValor= new GridBagLayout();
		this.jPanelAccionesCentroCostoValor.setLayout(gridaBagLayoutAccionesCentroCostoValor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCentroCostoValor= new GridBagLayout();
		this.jPanelAccionesFormularioCentroCostoValor.setLayout(gridaBagLayoutAccionesFormularioCentroCostoValor);
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCostoValor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCostoValor.add(this.jComboBoxTiposAccionesFormularioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCentroCostoValor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCentroCostoValor.add(this.jCheckBoxPostAccionNuevoCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCostoValor.add(this.jCheckBoxPostAccionSinCerrarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.centrocostovalorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.centrocostovalorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCentroCostoValor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCentroCostoValor.add(this.jCheckBoxPostAccionSinMensajeCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccion++;
			
		this.jPanelAccionesCentroCostoValor.add(this.jButtonModificarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);							

		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCentroCostoValor.gridy = 0;
		this.gridBagConstraintsCentroCostoValor.gridx =iPosXAccion++;
			
		this.jPanelAccionesCentroCostoValor.add(this.jButtonEliminarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = 0;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCostoValor.add(this.jButtonActualizarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);


		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = 0;		
		this.gridBagConstraintsCentroCostoValor.gridx = iPosXAccion++;
		
		this.jPanelAccionesCentroCostoValor.add(this.jButtonGuardarCambiosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);	
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = 0;		
		this.gridBagConstraintsCentroCostoValor.gridx =iPosXAccion++;
		
		this.jPanelAccionesCentroCostoValor.add(this.jButtonCancelarCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCentroCostoValor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCentroCostoValor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.centrocostovalorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();						
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCentroCostoValor.gridx = 0;		
			//this.gridBagConstraintsCentroCostoValor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCentroCostoValor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCentroCostoValor.gridx =0;
		this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCentroCostoValor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CentroCostoValorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCentroCostoValor = new CentroCostoValorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Centro Costo Valor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Centro Costo Valor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Valor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CentroCostoValorModel centrocostovalorModel=new CentroCostoValorModel(this);
			
			//SI USARA CLASE INTERNA
			//CentroCostoValorModel.CentroCostoValorFocusTraversalPolicy centrocostovalorFocusTraversalPolicy = centrocostovalorModel.new CentroCostoValorFocusTraversalPolicy(this);
			
			//centrocostovalorFocusTraversalPolicy.setcentrocostovalorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(centrocostovalorModel);
			
			
			this.jContentPaneDetalleCentroCostoValor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCentroCostoValor = new GridBagLayout();	
			this.jContentPaneDetalleCentroCostoValor.setLayout(gridaBagLayoutDetalleCentroCostoValor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCentroCostoValor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
				this.gridBagConstraintsCentroCostoValor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCentroCostoValor.gridx = 0;
					
				
				this.jContentPaneDetalleCentroCostoValor.add(jTtoolBarDetalleCentroCostoValor, gridBagConstraintsCentroCostoValor);								
				
}
			
			this.jScrollPanelDatosEdicionCentroCostoValor=   new JScrollPane(jContentPaneDetalleCentroCostoValor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCostoValor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoValor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoValor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCentroCostoValor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCentroCostoValor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoValor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCentroCostoValor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCentroCostoValor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCentroCostoValor.gridx = 0;
	        
			this.jContentPaneDetalleCentroCostoValor.add(jPanelCamposCentroCostoValor, gridBagConstraintsCentroCostoValor);
			
			
			
			
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
						&& centrocostovalorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.centrocostovalorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCentroCostoValor= new GridBagConstraints();
						this.gridBagConstraintsCentroCostoValor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCentroCostoValor.gridx = 0;
						this.jContentPaneDetalleCentroCostoValor.add(this.jTabbedPaneRelacionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCentroCostoValor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCentroCostoValor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
					this.gridBagConstraintsCentroCostoValor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCentroCostoValor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCentroCostoValor.gridx = 0;
					
				
					this.jContentPaneDetalleCentroCostoValor.add(jPanelCamposOcultosCentroCostoValor, gridBagConstraintsCentroCostoValor);
				
					this.jPanelCamposOcultosCentroCostoValor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCentroCostoValor.gridx = 0;
	        this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCentroCostoValor.add(this.jPanelAccionesFormularioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);							
			
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
	        this.gridBagConstraintsCentroCostoValor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCentroCostoValor.gridx = 0;
	        
			
			this.jContentPaneDetalleCentroCostoValor.add(this.jPanelAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCentroCostoValor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCentroCostoValor=   new JScrollPane(this.jPanelCamposCentroCostoValor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCentroCostoValor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoValor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCentroCostoValor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoValor.gridx = 0;
			this.gridBagConstraintsCentroCostoValor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCentroCostoValor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCentroCostoValor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoValor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCentroCostoValor, this.gridBagConstraintsCentroCostoValor);			
			
			this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
			this.gridBagConstraintsCentroCostoValor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCentroCostoValor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
			
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		
			
		this.gridBagConstraintsCentroCostoValor = new GridBagConstraints();
		this.gridBagConstraintsCentroCostoValor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCentroCostoValor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCentroCostoValor, this.gridBagConstraintsCentroCostoValor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCentroCostoValor;//jContentPane;
		
		return jScrollPanelDatosEdicionCentroCostoValor;
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
