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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.report.*;
import com.bydan.erp.contabilidad.util.report.MayooresGeneralesConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.report.*;
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
public class MayooresGeneralesDetalleFormJInternalFrame extends MayooresGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMayooresGenerales;
	
	protected JMenuBar jmenuBarDetalleMayooresGenerales;
	
	protected JMenu jmenuDetalleMayooresGenerales;
	protected JMenu jmenuDetalleArchivoMayooresGenerales;
	protected JMenu jmenuDetalleAccionesMayooresGenerales;
	protected JMenu jmenuDetalleDatosMayooresGenerales;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMayooresGenerales;	
	protected GridBagConstraints gridBagConstraintsMayooresGenerales;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MayooresGeneralesBeanSwingJInternalFrameAdditional jInternalFrameDetalleMayooresGenerales;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public MayooresGeneralesSessionBean mayooresgeneralesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public MayooresGeneralesLogic mayooresgeneralesLogic;
	
	public JScrollPane jScrollPanelDatosMayooresGenerales;
	public JScrollPane jScrollPanelDatosEdicionMayooresGenerales;
	public JScrollPane jScrollPanelDatosGeneralMayooresGenerales;
	
	protected JPanel jPanelCamposMayooresGenerales;    
	protected JPanel jPanelCamposOcultosMayooresGenerales;    	
	protected JPanel jPanelAccionesMayooresGenerales;
	protected JPanel jPanelAccionesFormularioMayooresGenerales;
    
	
	
	protected Integer iXPanelCamposMayooresGenerales=0;
	protected Integer iYPanelCamposMayooresGenerales=0;
	
	protected Integer iXPanelCamposOcultosMayooresGenerales=0;
	protected Integer iYPanelCamposOcultosMayooresGenerales=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMayooresGenerales;
	public JButton jButtonModificarMayooresGenerales;
	public JButton jButtonActualizarMayooresGenerales;
    public JButton jButtonEliminarMayooresGenerales;
	public JButton jButtonCancelarMayooresGenerales;
    public JButton jButtonGuardarCambiosMayooresGenerales;
	public JButton jButtonGuardarCambiosTablaMayooresGenerales;
	protected JButton jButtonCerrarMayooresGenerales;
	
	
	protected JButton jButtonProcesarInformacionMayooresGenerales;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMayooresGenerales;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMayooresGenerales;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMayooresGenerales;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMayooresGenerales;
	protected JButton jButtonModificarToolBarMayooresGenerales;
	protected JButton jButtonActualizarToolBarMayooresGenerales;
    protected JButton jButtonEliminarToolBarMayooresGenerales;
	protected JButton jButtonCancelarToolBarMayooresGenerales;
    protected JButton jButtonGuardarCambiosToolBarMayooresGenerales;
	protected JButton jButtonGuardarCambiosTablaToolBarMayooresGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarMayooresGenerales;
	protected JButton jButtonCerrarToolBarMayooresGenerales;
	
	protected JButton jButtonProcesarInformacionToolBarMayooresGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMayooresGenerales;
	protected JMenuItem jMenuItemModificarMayooresGenerales;
	protected JMenuItem jMenuItemActualizarMayooresGenerales;
    protected JMenuItem jMenuItemEliminarMayooresGenerales;
	protected JMenuItem jMenuItemCancelarMayooresGenerales;
    protected JMenuItem jMenuItemGuardarCambiosMayooresGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaMayooresGenerales;
	protected JMenuItem jMenuItemCerrarMayooresGenerales;
	protected JMenuItem jMenuItemDetalleCerrarMayooresGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarMayooresGenerales;
	
	protected JMenuItem jMenuItemProcesarInformacionMayooresGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMayooresGenerales;
	protected JMenuItem jMenuItemMostrarOcultarMayooresGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMayooresGenerales;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMayooresGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMayooresGenerales;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMayooresGenerales;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMayooresGenerales;
	public JLabel jLabelIdMayooresGenerales;
	public JLabel jLabelidMayooresGenerales;
	public JButton jButtonidMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeMayooresGenerales;
	public JLabel jLabelfecha_emision_desdeMayooresGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeMayooresGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeMayooresGenerales;
	public JButton jButtonfecha_emision_desdeMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaMayooresGenerales;
	public JLabel jLabelfecha_emision_hastaMayooresGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaMayooresGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaMayooresGenerales;
	public JButton jButtonfecha_emision_hastaMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalMayooresGenerales;
	public JLabel jLabelnombre_sucursalMayooresGenerales;
	public JTextArea jTextAreanombre_sucursalMayooresGenerales;
	public JScrollPane jscrollPanenombre_sucursalMayooresGenerales;
	public JButton jButtonnombre_sucursalMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoMayooresGenerales;
	public JLabel jLabelcodigoMayooresGenerales;
	public JTextField jTextFieldcodigoMayooresGenerales;
	public JButton jButtoncodigoMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioMayooresGenerales;
	public JLabel jLabelbeneficiarioMayooresGenerales;
	public JTextArea jTextAreabeneficiarioMayooresGenerales;
	public JScrollPane jscrollPanebeneficiarioMayooresGenerales;
	public JButton jButtonbeneficiarioMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldetalleMayooresGenerales;
	public JLabel jLabeldetalleMayooresGenerales;
	public JTextArea jTextAreadetalleMayooresGenerales;
	public JScrollPane jscrollPanedetalleMayooresGenerales;
	public JButton jButtondetalleMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionMayooresGenerales;
	public JLabel jLabelfecha_emisionMayooresGenerales;
	//public JFormattedTextField jDateChooserfecha_emisionMayooresGenerales;

	public JDateChooser jDateChooserfecha_emisionMayooresGenerales;
	public JButton jButtonfecha_emisionMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_movimientoMayooresGenerales;
	public JLabel jLabelcodigo_tipo_movimientoMayooresGenerales;
	public JTextField jTextFieldcodigo_tipo_movimientoMayooresGenerales;
	public JButton jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorMayooresGenerales;
	public JLabel jLabelnumero_mayorMayooresGenerales;
	public JTextArea jTextAreanumero_mayorMayooresGenerales;
	public JScrollPane jscrollPanenumero_mayorMayooresGenerales;
	public JButton jButtonnumero_mayorMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableMayooresGenerales;
	public JLabel jLabelnombre_cuenta_contableMayooresGenerales;
	public JTextArea jTextAreanombre_cuenta_contableMayooresGenerales;
	public JScrollPane jscrollPanenombre_cuenta_contableMayooresGenerales;
	public JButton jButtonnombre_cuenta_contableMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localMayooresGenerales;
	public JLabel jLabeldebito_localMayooresGenerales;
	public JTextField jTextFielddebito_localMayooresGenerales;
	public JButton jButtondebito_localMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localMayooresGenerales;
	public JLabel jLabelcredito_localMayooresGenerales;
	public JTextField jTextFieldcredito_localMayooresGenerales;
	public JButton jButtoncredito_localMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldetalle_detalle_asiento_contableMayooresGenerales;
	public JLabel jLabeldetalle_detalle_asiento_contableMayooresGenerales;
	public JTextArea jTextAreadetalle_detalle_asiento_contableMayooresGenerales;
	public JScrollPane jscrollPanedetalle_detalle_asiento_contableMayooresGenerales;
	public JButton jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_contableMayooresGenerales;
	public JLabel jLabelcodigo_cuenta_contableMayooresGenerales;
	public JTextField jTextFieldcodigo_cuenta_contableMayooresGenerales;
	public JButton jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelsaldoMayooresGenerales;
	public JLabel jLabelsaldoMayooresGenerales;
	public JTextField jTextFieldsaldoMayooresGenerales;
	public JButton jButtonsaldoMayooresGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMayooresGenerales;
	public JLabel jLabelid_empresaMayooresGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMayooresGenerales;
	public JButton jButtonid_empresaMayooresGenerales= new JButtonMe();
	public JButton jButtonid_empresaMayooresGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_empresaMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioMayooresGenerales;
	public JLabel jLabelid_ejercicioMayooresGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioMayooresGenerales;
	public JButton jButtonid_ejercicioMayooresGenerales= new JButtonMe();
	public JButton jButtonid_ejercicioMayooresGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioMayooresGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableMayooresGenerales;
	public JLabel jLabelid_cuenta_contableMayooresGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableMayooresGenerales;
	public JButton jButtonid_cuenta_contableMayooresGenerales= new JButtonMe();
	public JButton jButtonid_cuenta_contableMayooresGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableMayooresGeneralesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMayooresGenerales;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MayooresGeneralesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMayooresGenerales=new JPanel();
				this.jPanelAccionesFormularioMayooresGenerales=new JPanel();
				this.jmenuBarDetalleMayooresGenerales=new JMenuBar();
				this.jTtoolBarDetalleMayooresGenerales=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MayooresGeneralesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MayooresGeneralesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MayooresGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMayooresGenerales() {
		return this.jButtonActualizarToolBarMayooresGenerales;
	}
	
	public JButton getjButtonEliminarToolBarMayooresGenerales() {
		return this.jButtonEliminarToolBarMayooresGenerales;
	}
	
	public JButton getjButtonCancelarToolBarMayooresGenerales() {
		return this.jButtonCancelarToolBarMayooresGenerales;
	}		
	
	public JButton getjButtonProcesarInformacionMayooresGenerales() {
		return this.jButtonProcesarInformacionMayooresGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMayooresGenerales)	{
		this.jButtonProcesarInformacionMayooresGenerales = jButtonProcesarInformacionMayooresGenerales;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMayooresGenerales() {
		return this.jComboBoxTiposAccionesMayooresGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMayooresGenerales(
			JComboBox jComboBoxTiposRelacionesMayooresGenerales) {
		this.jComboBoxTiposRelacionesMayooresGenerales = jComboBoxTiposRelacionesMayooresGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMayooresGenerales(
			JComboBox jComboBoxTiposAccionesMayooresGenerales) {
		this.jComboBoxTiposAccionesMayooresGenerales = jComboBoxTiposAccionesMayooresGenerales;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMayooresGenerales() {
		return this.jComboBoxTiposAccionesFormularioMayooresGenerales;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMayooresGenerales(
			JComboBox jComboBoxTiposAccionesFormularioMayooresGenerales) {
		this.jComboBoxTiposAccionesFormularioMayooresGenerales = jComboBoxTiposAccionesFormularioMayooresGenerales;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mayooresgeneralesSessionBean=new MayooresGeneralesSessionBean();
		
		this.mayooresgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mayooresgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mayooresgeneralesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MayooresGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MayooresGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MayooresGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mayores Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
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
	
		MayooresGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMayooresGenerales= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMayooresGenerales=new JButtonMe();
				this.jButtonModificarToolBarMayooresGenerales=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMayooresGenerales,this.jTtoolBarDetalleMayooresGenerales,
							"actualizar","actualizar","Actualizar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMayooresGenerales,this.jTtoolBarDetalleMayooresGenerales,
							"eliminar","eliminar","Eliminar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMayooresGenerales,this.jTtoolBarDetalleMayooresGenerales,
							"cancelar","cancelar","Cancelar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMayooresGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMayooresGenerales,this.jTtoolBarDetalleMayooresGenerales,
							"guardarcambios","guardarcambios","Guardar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMayooresGenerales=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMayooresGenerales=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMayooresGenerales=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMayooresGenerales=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMayooresGenerales=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMayooresGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMayooresGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMayooresGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMayooresGenerales= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMayooresGenerales.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMayooresGenerales,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMayooresGenerales= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMayooresGenerales.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMayooresGenerales,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMayooresGenerales= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMayooresGenerales.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMayooresGenerales,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMayooresGenerales= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMayooresGenerales.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMayooresGenerales,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMayooresGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMayooresGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMayooresGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMayooresGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMayooresGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMayooresGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMayooresGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMayooresGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMayooresGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMayooresGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMayooresGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMayooresGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMayooresGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMayooresGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMayooresGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMayooresGenerales.add(this.jMenuItemDetalleCerrarMayooresGenerales);
		
		this.jmenuDetalleAccionesMayooresGenerales.add(this.jMenuItemActualizarMayooresGenerales);
		this.jmenuDetalleAccionesMayooresGenerales.add(this.jMenuItemEliminarMayooresGenerales);
		this.jmenuDetalleAccionesMayooresGenerales.add(this.jMenuItemCancelarMayooresGenerales);		
		
		//this.jmenuDetalleDatosMayooresGenerales.add(this.jMenuItemDetalleAbrirOrderByMayooresGenerales);				
		this.jmenuDetalleDatosMayooresGenerales.add(this.jMenuItemDetalleMostarOcultarMayooresGenerales);				
				
		//this.jmenuDetalleAccionesMayooresGenerales.add(this.jMenuItemGuardarCambiosMayooresGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMayooresGenerales.add(this.jmenuDetalleArchivoMayooresGenerales);		
		this.jmenuBarDetalleMayooresGenerales.add(this.jmenuDetalleAccionesMayooresGenerales);		
		this.jmenuBarDetalleMayooresGenerales.add(this.jmenuDetalleDatosMayooresGenerales);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMayooresGenerales);				
	}
	
	
	public void inicializarElementosCamposMayooresGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMayooresGenerales = new JLabelMe();
		jLabelIdMayooresGenerales.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMayooresGenerales = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMayooresGenerales= new GridBagLayout();

		this.jPanelidMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);

		jLabelidMayooresGenerales = new JLabel();
		jLabelidMayooresGenerales.setText("Id");

		jLabelidMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeMayooresGenerales = new JLabelMe();
		this.jLabelfecha_emision_desdeMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeMayooresGenerales.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelfecha_emision_desdeMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		//jFormattedTextFieldfecha_emision_desdeMayooresGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeMayooresGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeMayooresGenerales.setEnabled(false);
		jDateChooserfecha_emision_desdeMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeMayooresGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeMayooresGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeMayooresGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaMayooresGenerales = new JLabelMe();
		this.jLabelfecha_emision_hastaMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaMayooresGenerales.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelfecha_emision_hastaMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		//jFormattedTextFieldfecha_emision_hastaMayooresGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaMayooresGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaMayooresGenerales.setEnabled(false);
		jDateChooserfecha_emision_hastaMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaMayooresGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaMayooresGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaMayooresGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalMayooresGenerales = new JLabelMe();
		this.jLabelnombre_sucursalMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalMayooresGenerales.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelnombre_sucursalMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextAreanombre_sucursalMayooresGenerales= new JTextAreaMe();
		jTextAreanombre_sucursalMayooresGenerales.setEnabled(false);
		jTextAreanombre_sucursalMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalMayooresGenerales.setLineWrap(true);
		jTextAreanombre_sucursalMayooresGenerales.setWrapStyleWord(true);
		jTextAreanombre_sucursalMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalMayooresGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalMayooresGenerales = new JScrollPane(jTextAreanombre_sucursalMayooresGenerales);
		jscrollPanenombre_sucursalMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setText("U");
		this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoMayooresGenerales = new JLabelMe();
		this.jLabelcodigoMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoMayooresGenerales.setToolTipText("Codigo");
		this.jLabelcodigoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelcodigoMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextFieldcodigoMayooresGenerales= new JTextFieldMe();

		jTextFieldcodigoMayooresGenerales.setEnabled(false);
		jTextFieldcodigoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigoMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoMayooresGeneralesBusqueda.setText("U");
		this.jButtoncodigoMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioMayooresGenerales = new JLabelMe();
		this.jLabelbeneficiarioMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioMayooresGenerales.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelbeneficiarioMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextAreabeneficiarioMayooresGenerales= new JTextAreaMe();
		jTextAreabeneficiarioMayooresGenerales.setEnabled(false);
		jTextAreabeneficiarioMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioMayooresGenerales.setLineWrap(true);
		jTextAreabeneficiarioMayooresGenerales.setWrapStyleWord(true);
		jTextAreabeneficiarioMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioMayooresGenerales.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioMayooresGenerales = new JScrollPane(jTextAreabeneficiarioMayooresGenerales);
		jscrollPanebeneficiarioMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonbeneficiarioMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioMayooresGeneralesBusqueda.setText("U");
		this.jButtonbeneficiarioMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldetalleMayooresGenerales = new JLabelMe();
		this.jLabeldetalleMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleMayooresGenerales.setToolTipText("Detalle");
		this.jLabeldetalleMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPaneldetalleMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextAreadetalleMayooresGenerales= new JTextAreaMe();
		jTextAreadetalleMayooresGenerales.setEnabled(false);
		jTextAreadetalleMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleMayooresGenerales.setLineWrap(true);
		jTextAreadetalleMayooresGenerales.setWrapStyleWord(true);
		jTextAreadetalleMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleMayooresGenerales.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleMayooresGenerales = new JScrollPane(jTextAreadetalleMayooresGenerales);
		jscrollPanedetalleMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtondetalleMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleMayooresGeneralesBusqueda.setText("U");
		this.jButtondetalleMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionMayooresGenerales = new JLabelMe();
		this.jLabelfecha_emisionMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionMayooresGenerales.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelfecha_emisionMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		//jFormattedTextFieldfecha_emisionMayooresGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionMayooresGenerales= new JDateChooser();
		jDateChooserfecha_emisionMayooresGenerales.setEnabled(false);
		jDateChooserfecha_emisionMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionMayooresGenerales.setDate(new Date());
		jDateChooserfecha_emisionMayooresGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionMayooresGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionMayooresGeneralesBusqueda.setText("U");
		this.jButtonfecha_emisionMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_movimientoMayooresGenerales = new JLabelMe();
		this.jLabelcodigo_tipo_movimientoMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+" : *");
		this.jLabelcodigo_tipo_movimientoMayooresGenerales.setToolTipText("Codigo Tipo Movimiento");
		this.jLabelcodigo_tipo_movimientoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimientoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimientoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_movimientoMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_movimientoMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_movimientoMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelcodigo_tipo_movimientoMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextFieldcodigo_tipo_movimientoMayooresGenerales= new JTextFieldMe();

		jTextFieldcodigo_tipo_movimientoMayooresGenerales.setEnabled(false);
		jTextFieldcodigo_tipo_movimientoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimientoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimientoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_movimientoMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setText("U");
		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_movimientoMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_movimientoMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_movimientoMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorMayooresGenerales = new JLabelMe();
		this.jLabelnumero_mayorMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorMayooresGenerales.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelnumero_mayorMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextAreanumero_mayorMayooresGenerales= new JTextAreaMe();
		jTextAreanumero_mayorMayooresGenerales.setEnabled(false);
		jTextAreanumero_mayorMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorMayooresGenerales.setLineWrap(true);
		jTextAreanumero_mayorMayooresGenerales.setWrapStyleWord(true);
		jTextAreanumero_mayorMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorMayooresGenerales.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorMayooresGenerales = new JScrollPane(jTextAreanumero_mayorMayooresGenerales);
		jscrollPanenumero_mayorMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonnumero_mayorMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorMayooresGeneralesBusqueda.setText("U");
		this.jButtonnumero_mayorMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableMayooresGenerales = new JLabelMe();
		this.jLabelnombre_cuenta_contableMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableMayooresGenerales.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelnombre_cuenta_contableMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextAreanombre_cuenta_contableMayooresGenerales= new JTextAreaMe();
		jTextAreanombre_cuenta_contableMayooresGenerales.setEnabled(false);
		jTextAreanombre_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableMayooresGenerales.setLineWrap(true);
		jTextAreanombre_cuenta_contableMayooresGenerales.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableMayooresGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableMayooresGenerales = new JScrollPane(jTextAreanombre_cuenta_contableMayooresGenerales);
		jscrollPanenombre_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localMayooresGenerales = new JLabelMe();
		this.jLabeldebito_localMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localMayooresGenerales.setToolTipText("Debito Local");
		this.jLabeldebito_localMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPaneldebito_localMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextFielddebito_localMayooresGenerales= new JTextFieldMe();
		jTextFielddebito_localMayooresGenerales.setEnabled(false);
		jTextFielddebito_localMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localMayooresGenerales.setText("0.0");

		this.jButtondebito_localMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtondebito_localMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localMayooresGeneralesBusqueda.setText("U");
		this.jButtondebito_localMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localMayooresGenerales = new JLabelMe();
		this.jLabelcredito_localMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localMayooresGenerales.setToolTipText("Credito Local");
		this.jLabelcredito_localMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelcredito_localMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextFieldcredito_localMayooresGenerales= new JTextFieldMe();
		jTextFieldcredito_localMayooresGenerales.setEnabled(false);
		jTextFieldcredito_localMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localMayooresGenerales.setText("0.0");

		this.jButtoncredito_localMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtoncredito_localMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localMayooresGeneralesBusqueda.setText("U");
		this.jButtoncredito_localMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldetalle_detalle_asiento_contableMayooresGenerales = new JLabelMe();
		this.jLabeldetalle_detalle_asiento_contableMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE+" : *");
		this.jLabeldetalle_detalle_asiento_contableMayooresGenerales.setToolTipText("Detalle Detalle Asiento Contable");
		this.jLabeldetalle_detalle_asiento_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldetalle_detalle_asiento_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldetalle_detalle_asiento_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalle_detalle_asiento_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalle_detalle_asiento_contableMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalle_detalle_asiento_contableMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_DETALLEDETALLEASIENTOCONTABLE);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPaneldetalle_detalle_asiento_contableMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextAreadetalle_detalle_asiento_contableMayooresGenerales= new JTextAreaMe();
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setEnabled(false);
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setLineWrap(true);
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setWrapStyleWord(true);
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalle_detalle_asiento_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalle_detalle_asiento_contableMayooresGenerales = new JScrollPane(jTextAreadetalle_detalle_asiento_contableMayooresGenerales);
		jscrollPanedetalle_detalle_asiento_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalle_detalle_asiento_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalle_detalle_asiento_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setText("U");
		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalle_detalle_asiento_contableMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalle_detalle_asiento_contableMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_contableMayooresGenerales = new JLabelMe();
		this.jLabelcodigo_cuenta_contableMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+" : *");
		this.jLabelcodigo_cuenta_contableMayooresGenerales.setToolTipText("Codigo Cuenta Contable");
		this.jLabelcodigo_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_contableMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_contableMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelcodigo_cuenta_contableMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextFieldcodigo_cuenta_contableMayooresGenerales= new JTextFieldMe();

		jTextFieldcodigo_cuenta_contableMayooresGenerales.setEnabled(false);
		jTextFieldcodigo_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setText("U");
		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_contableMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_contableMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_contableMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelsaldoMayooresGenerales = new JLabelMe();
		this.jLabelsaldoMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoMayooresGenerales.setToolTipText("Saldo");
		this.jLabelsaldoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelsaldoMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jTextFieldsaldoMayooresGenerales= new JTextFieldMe();
		jTextFieldsaldoMayooresGenerales.setEnabled(false);
		jTextFieldsaldoMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoMayooresGenerales.setText("0.0");

		this.jButtonsaldoMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonsaldoMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoMayooresGeneralesBusqueda.setText("U");
		this.jButtonsaldoMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoMayooresGeneralesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMayooresGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMayooresGenerales = new JLabelMe();
		this.jLabelid_empresaMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMayooresGenerales.setToolTipText("Empresa");
		this.jLabelid_empresaMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelid_empresaMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jComboBoxid_empresaMayooresGenerales= new JComboBoxMe();
		jComboBoxid_empresaMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMayooresGenerales.setEnabled(false);

		this.jButtonid_empresaMayooresGenerales= new JButtonMe();
		this.jButtonid_empresaMayooresGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMayooresGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMayooresGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMayooresGenerales.setText("Buscar");
		this.jButtonid_empresaMayooresGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMayooresGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMayooresGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMayooresGenerales"));

		this.jButtonid_empresaMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonid_empresaMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMayooresGeneralesBusqueda.setText("U");
		this.jButtonid_empresaMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMayooresGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_empresaMayooresGeneralesUpdate= new JButtonMe();
		this.jButtonid_empresaMayooresGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMayooresGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMayooresGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMayooresGeneralesUpdate.setText("U");
		this.jButtonid_empresaMayooresGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMayooresGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMayooresGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMayooresGeneralesUpdate"));



					
		this.jLabelid_ejercicioMayooresGenerales = new JLabelMe();
		this.jLabelid_ejercicioMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioMayooresGenerales.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelid_ejercicioMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jComboBoxid_ejercicioMayooresGenerales= new JComboBoxMe();
		jComboBoxid_ejercicioMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioMayooresGenerales.setEnabled(false);

		this.jButtonid_ejercicioMayooresGenerales= new JButtonMe();
		this.jButtonid_ejercicioMayooresGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioMayooresGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioMayooresGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioMayooresGenerales.setText("Buscar");
		this.jButtonid_ejercicioMayooresGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioMayooresGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioMayooresGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioMayooresGenerales"));

		this.jButtonid_ejercicioMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonid_ejercicioMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioMayooresGeneralesBusqueda.setText("U");
		this.jButtonid_ejercicioMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioMayooresGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioMayooresGeneralesUpdate= new JButtonMe();
		this.jButtonid_ejercicioMayooresGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMayooresGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMayooresGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioMayooresGeneralesUpdate.setText("U");
		this.jButtonid_ejercicioMayooresGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioMayooresGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioMayooresGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioMayooresGeneralesUpdate"));



					
		this.jLabelid_cuenta_contableMayooresGenerales = new JLabelMe();
		this.jLabelid_cuenta_contableMayooresGenerales.setText(""+MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableMayooresGenerales.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableMayooresGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableMayooresGenerales.setToolTipText(MayooresGeneralesConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutMayooresGenerales = new GridBagLayout();
		this.jPanelid_cuenta_contableMayooresGenerales.setLayout(this.gridaBagLayoutMayooresGenerales);


		jComboBoxid_cuenta_contableMayooresGenerales= new JComboBoxMe();
		jComboBoxid_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableMayooresGenerales= new JButtonMe();
		this.jButtonid_cuenta_contableMayooresGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableMayooresGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableMayooresGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableMayooresGenerales.setText("Buscar");
		this.jButtonid_cuenta_contableMayooresGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableMayooresGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableMayooresGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableMayooresGenerales"));

		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setText("U");
		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableMayooresGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableMayooresGeneralesBusqueda"));

		if(this.mayooresgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableMayooresGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableMayooresGeneralesUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableMayooresGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableMayooresGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableMayooresGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableMayooresGeneralesUpdate.setText("U");
		this.jButtonid_cuenta_contableMayooresGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableMayooresGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableMayooresGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableMayooresGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableMayooresGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableMayooresGeneralesUpdate"));



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
		//this.jInternalFrameDetalleMayooresGenerales = new MayooresGeneralesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mayores Generales DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMayooresGenerales= new GridBagLayout();
		

		
		String sToolTipMayooresGenerales="";
		sToolTipMayooresGenerales=MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMayooresGenerales+="(Contabilidad.MayooresGenerales)";
		}
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipMayooresGenerales+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMayooresGenerales = new JButtonMe();
		this.jButtonModificarMayooresGenerales = new JButtonMe();
        this.jButtonActualizarMayooresGenerales = new JButtonMe();
        this.jButtonEliminarMayooresGenerales = new JButtonMe();
        this.jButtonCancelarMayooresGenerales = new JButtonMe();
        this.jButtonGuardarCambiosMayooresGenerales = new JButtonMe();
		this.jButtonGuardarCambiosTablaMayooresGenerales = new JButtonMe();
		this.jButtonCerrarMayooresGenerales = new JButtonMe();
		
		this.jScrollPanelDatosMayooresGenerales = new JScrollPane();   
        this.jScrollPanelDatosEdicionMayooresGenerales = new JScrollPane();
		this.jScrollPanelDatosGeneralMayooresGenerales = new JScrollPane();
				
		
		
		this.jPanelCamposMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mayores Generales";
		
		if(!this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mayores Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosMayooresGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMayooresGenerales.setName("jPanelCamposMayooresGenerales"); 

		this.jPanelCamposOcultosMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMayooresGenerales.setName("jPanelCamposOcultosMayooresGenerales"); 

        this.jPanelAccionesMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMayooresGenerales.setToolTipText("Acciones");
        this.jPanelAccionesMayooresGenerales.setName("Acciones"); 

		this.jPanelAccionesFormularioMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMayooresGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMayooresGenerales.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMayooresGenerales.setText("Nuevo");
		this.jButtonModificarMayooresGenerales.setText("Editar");
        this.jButtonActualizarMayooresGenerales.setText("Actualizar");
        this.jButtonEliminarMayooresGenerales.setText("Eliminar");
        this.jButtonCancelarMayooresGenerales.setText("Cancelar");
        this.jButtonGuardarCambiosMayooresGenerales.setText("Guardar");
		this.jButtonGuardarCambiosTablaMayooresGenerales.setText("Guardar");
		this.jButtonCerrarMayooresGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMayooresGenerales,"nuevo_button","Nuevo",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMayooresGenerales,"modificar_button","Editar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMayooresGenerales,"actualizar_button","Actualizar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMayooresGenerales,"eliminar_button","Eliminar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMayooresGenerales,"cancelar_button","Cancelar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMayooresGenerales,"guardarcambios_button","Guardar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMayooresGenerales,"guardarcambiostabla_button","Guardar",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMayooresGenerales,"cerrar_button","Salir",this.mayooresgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMayooresGenerales.setToolTipText("Nuevo"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMayooresGenerales.setToolTipText("Editar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMayooresGenerales.setToolTipText("Actualizar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMayooresGenerales.setToolTipText("Eliminar)"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMayooresGenerales.setToolTipText("Cancelar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMayooresGenerales.setToolTipText("Guardar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMayooresGenerales.setToolTipText("Guardar"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMayooresGenerales.setToolTipText("Salir"+" "+MayooresGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMayooresGenerales";
		inputMap = this.jButtonNuevoMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMayooresGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMayooresGenerales"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMayooresGenerales";
		inputMap = this.jButtonActualizarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMayooresGenerales"));
		
		//ELIMINAR
		sMapKey = "EliminarMayooresGenerales";
		inputMap = this.jButtonEliminarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMayooresGenerales"));
		
		//CANCELAR	
		sMapKey = "CancelarMayooresGenerales";
		inputMap = this.jButtonCancelarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMayooresGenerales"));
		
		//CERRAR		
		sMapKey = "CerrarMayooresGenerales";
		inputMap = this.jButtonCerrarMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMayooresGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMayooresGenerales";
		inputMap = this.jButtonGuardarCambiosTablaMayooresGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMayooresGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMayooresGenerales"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMayooresGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMayooresGenerales.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMayooresGenerales.setToolTipText("Nuevo MayooresGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMayooresGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMayooresGenerales.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMayooresGenerales.setToolTipText("Sin Cerrar Ventana MayooresGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMayooresGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMayooresGenerales.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMayooresGenerales.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMayooresGenerales.setText("Accion");
		this.jComboBoxTiposAccionesMayooresGenerales.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMayooresGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMayooresGenerales.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMayooresGenerales.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMayooresGenerales = new JLabelMe();
		
		this.jLabelAccionesMayooresGenerales.setText("Acciones");		
		this.jLabelAccionesMayooresGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMayooresGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMayooresGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMayooresGenerales();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMayooresGenerales();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMayooresGenerales=new JTabbedPane();
		this.jTabbedPaneRelacionesMayooresGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMayooresGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMayooresGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMayooresGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMayooresGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMayooresGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMayooresGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMayooresGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMayooresGenerales.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMayooresGenerales, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMayooresGenerales = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMayooresGenerales = new GridBagLayout();
		
		this.jPanelCamposMayooresGenerales.setLayout(gridaBagLayoutCamposMayooresGenerales);
		this.jPanelCamposOcultosMayooresGenerales.setLayout(gridaBagLayoutCamposOcultosMayooresGenerales);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMayooresGenerales.add(jLabelIdMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMayooresGenerales.add(jLabelidMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMayooresGenerales.add(jLabelid_empresaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMayooresGenerales.add(jButtonid_empresaMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 3;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMayooresGenerales.add(jButtonid_empresaMayooresGeneralesUpdate, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMayooresGenerales.add(jComboBoxid_empresaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioMayooresGenerales.add(jLabelid_ejercicioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioMayooresGenerales.add(jButtonid_ejercicioMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 3;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioMayooresGenerales.add(jButtonid_ejercicioMayooresGeneralesUpdate, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioMayooresGenerales.add(jComboBoxid_ejercicioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableMayooresGenerales.add(jLabelid_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableMayooresGenerales.add(jButtonid_cuenta_contableMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 3;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableMayooresGenerales.add(jButtonid_cuenta_contableMayooresGeneralesUpdate, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableMayooresGenerales.add(jComboBoxid_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeMayooresGenerales.add(jLabelfecha_emision_desdeMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeMayooresGenerales.add(jButtonfecha_emision_desdeMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeMayooresGenerales.add(jDateChooserfecha_emision_desdeMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaMayooresGenerales.add(jLabelfecha_emision_hastaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaMayooresGenerales.add(jButtonfecha_emision_hastaMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaMayooresGenerales.add(jDateChooserfecha_emision_hastaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalMayooresGenerales.add(jLabelnombre_sucursalMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalMayooresGenerales.add(jButtonnombre_sucursalMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalMayooresGenerales.add(jscrollPanenombre_sucursalMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoMayooresGenerales.add(jLabelcodigoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoMayooresGenerales.add(jButtoncodigoMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoMayooresGenerales.add(jTextFieldcodigoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioMayooresGenerales.add(jLabelbeneficiarioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioMayooresGenerales.add(jButtonbeneficiarioMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioMayooresGenerales.add(jscrollPanebeneficiarioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleMayooresGenerales.add(jLabeldetalleMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleMayooresGenerales.add(jButtondetalleMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleMayooresGenerales.add(jscrollPanedetalleMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionMayooresGenerales.add(jLabelfecha_emisionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionMayooresGenerales.add(jButtonfecha_emisionMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionMayooresGenerales.add(jDateChooserfecha_emisionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_movimientoMayooresGenerales.add(jLabelcodigo_tipo_movimientoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_movimientoMayooresGenerales.add(jButtoncodigo_tipo_movimientoMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_movimientoMayooresGenerales.add(jTextFieldcodigo_tipo_movimientoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorMayooresGenerales.add(jLabelnumero_mayorMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorMayooresGenerales.add(jButtonnumero_mayorMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorMayooresGenerales.add(jscrollPanenumero_mayorMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableMayooresGenerales.add(jLabelnombre_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableMayooresGenerales.add(jButtonnombre_cuenta_contableMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableMayooresGenerales.add(jscrollPanenombre_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localMayooresGenerales.add(jLabeldebito_localMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localMayooresGenerales.add(jButtondebito_localMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localMayooresGenerales.add(jTextFielddebito_localMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localMayooresGenerales.add(jLabelcredito_localMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localMayooresGenerales.add(jButtoncredito_localMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localMayooresGenerales.add(jTextFieldcredito_localMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalle_detalle_asiento_contableMayooresGenerales.add(jLabeldetalle_detalle_asiento_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalle_detalle_asiento_contableMayooresGenerales.add(jButtondetalle_detalle_asiento_contableMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalle_detalle_asiento_contableMayooresGenerales.add(jscrollPanedetalle_detalle_asiento_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_contableMayooresGenerales.add(jLabelcodigo_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_contableMayooresGenerales.add(jButtoncodigo_cuenta_contableMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_contableMayooresGenerales.add(jTextFieldcodigo_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 0;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoMayooresGenerales.add(jLabelsaldoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		//this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = 2;
		this.gridBagConstraintsMayooresGenerales.ipadx = 0;
		this.gridBagConstraintsMayooresGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoMayooresGenerales.add(jButtonsaldoMayooresGeneralesBusqueda, this.gridBagConstraintsMayooresGenerales);
	}

	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMayooresGenerales.gridy = 0;
	this.gridBagConstraintsMayooresGenerales.gridx = 1;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoMayooresGenerales.add(jTextFieldsaldoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelidMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelid_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelfecha_emision_desdeMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelfecha_emision_hastaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelnombre_sucursalMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelcodigoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelbeneficiarioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPaneldetalleMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelfecha_emisionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelcodigo_tipo_movimientoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelnumero_mayorMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelnombre_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPaneldebito_localMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelcredito_localMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPaneldetalle_detalle_asiento_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelcodigo_cuenta_contableMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMayooresGenerales.add(this.jPanelsaldoMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposMayooresGenerales % 2==0) {
		iXPanelCamposMayooresGenerales=0;
		iYPanelCamposMayooresGenerales++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposOcultosMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposOcultosMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMayooresGenerales.add(this.jPanelid_empresaMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposOcultosMayooresGenerales % 2==0) {
		iXPanelCamposOcultosMayooresGenerales=0;
		iYPanelCamposOcultosMayooresGenerales++;
	}
	this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMayooresGenerales.gridy = iYPanelCamposOcultosMayooresGenerales;
	this.gridBagConstraintsMayooresGenerales.gridx = iXPanelCamposOcultosMayooresGenerales++;
	this.gridBagConstraintsMayooresGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMayooresGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMayooresGenerales.add(this.jPanelid_ejercicioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);



	if(iXPanelCamposOcultosMayooresGenerales % 2==0) {
		iXPanelCamposOcultosMayooresGenerales=0;
		iYPanelCamposOcultosMayooresGenerales++;
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
			
		GridBagLayout gridaBagLayoutAccionesMayooresGenerales= new GridBagLayout();
		this.jPanelAccionesMayooresGenerales.setLayout(gridaBagLayoutAccionesMayooresGenerales);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMayooresGenerales= new GridBagLayout();
		this.jPanelAccionesFormularioMayooresGenerales.setLayout(gridaBagLayoutAccionesFormularioMayooresGenerales);
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMayooresGenerales.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMayooresGenerales.add(this.jComboBoxTiposAccionesFormularioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccion++;
			
		this.jPanelAccionesMayooresGenerales.add(this.jButtonModificarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);							

		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMayooresGenerales.gridy = 0;
		this.gridBagConstraintsMayooresGenerales.gridx =iPosXAccion++;
			
		this.jPanelAccionesMayooresGenerales.add(this.jButtonEliminarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = 0;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesMayooresGenerales.add(this.jButtonActualizarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);


		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = 0;		
		this.gridBagConstraintsMayooresGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesMayooresGenerales.add(this.jButtonGuardarCambiosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);	
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = 0;		
		this.gridBagConstraintsMayooresGenerales.gridx =iPosXAccion++;
		
		this.jPanelAccionesMayooresGenerales.add(this.jButtonCancelarMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMayooresGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMayooresGenerales);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mayooresgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();						
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMayooresGenerales.gridx = 0;		
			//this.gridBagConstraintsMayooresGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMayooresGenerales.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMayooresGenerales.gridx =0;
		this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMayooresGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MayooresGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMayooresGenerales = new MayooresGeneralesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mayores Generales DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mayores Generales DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mayores Generales Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MayooresGeneralesModel mayooresgeneralesModel=new MayooresGeneralesModel(this);
			
			//SI USARA CLASE INTERNA
			//MayooresGeneralesModel.MayooresGeneralesFocusTraversalPolicy mayooresgeneralesFocusTraversalPolicy = mayooresgeneralesModel.new MayooresGeneralesFocusTraversalPolicy(this);
			
			//mayooresgeneralesFocusTraversalPolicy.setmayooresgeneralesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mayooresgeneralesModel);
			
			
			this.jContentPaneDetalleMayooresGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMayooresGenerales = new GridBagLayout();	
			this.jContentPaneDetalleMayooresGenerales.setLayout(gridaBagLayoutDetalleMayooresGenerales);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMayooresGenerales = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
				this.gridBagConstraintsMayooresGenerales.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMayooresGenerales.gridx = 0;
					
				
				this.jContentPaneDetalleMayooresGenerales.add(jTtoolBarDetalleMayooresGenerales, gridBagConstraintsMayooresGenerales);								
				
}
			
			this.jScrollPanelDatosEdicionMayooresGenerales=   new JScrollPane(jContentPaneDetalleMayooresGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMayooresGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMayooresGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMayooresGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMayooresGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMayooresGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMayooresGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMayooresGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMayooresGenerales.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMayooresGenerales.gridx = 0;
	        
			this.jContentPaneDetalleMayooresGenerales.add(jPanelCamposMayooresGenerales, gridBagConstraintsMayooresGenerales);
			
			
			
			
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
						//&& mayooresgeneralesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.mayooresgeneralesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMayooresGenerales= new GridBagConstraints();
						this.gridBagConstraintsMayooresGenerales.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMayooresGenerales.gridx = 0;
						this.jContentPaneDetalleMayooresGenerales.add(this.jTabbedPaneRelacionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMayooresGenerales.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMayooresGenerales.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
					this.gridBagConstraintsMayooresGenerales.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMayooresGenerales.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMayooresGenerales.gridx = 0;
					
				
					this.jContentPaneDetalleMayooresGenerales.add(jPanelCamposOcultosMayooresGenerales, gridBagConstraintsMayooresGenerales);
				
					this.jPanelCamposOcultosMayooresGenerales.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMayooresGenerales.gridx = 0;
	        this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMayooresGenerales.add(this.jPanelAccionesFormularioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);							
			
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
	        this.gridBagConstraintsMayooresGenerales.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMayooresGenerales.gridx = 0;
	        
			
			this.jContentPaneDetalleMayooresGenerales.add(this.jPanelAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMayooresGenerales);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMayooresGenerales=   new JScrollPane(this.jPanelCamposMayooresGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMayooresGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMayooresGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMayooresGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMayooresGenerales.gridx = 0;
			this.gridBagConstraintsMayooresGenerales.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMayooresGenerales.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMayooresGenerales.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMayooresGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMayooresGenerales, this.gridBagConstraintsMayooresGenerales);			
			
			this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
			this.gridBagConstraintsMayooresGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMayooresGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
			
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		
			
		this.gridBagConstraintsMayooresGenerales = new GridBagConstraints();
		this.gridBagConstraintsMayooresGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMayooresGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMayooresGenerales, this.gridBagConstraintsMayooresGenerales);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMayooresGenerales;//jContentPane;
		
		return jScrollPanelDatosEdicionMayooresGenerales;
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
