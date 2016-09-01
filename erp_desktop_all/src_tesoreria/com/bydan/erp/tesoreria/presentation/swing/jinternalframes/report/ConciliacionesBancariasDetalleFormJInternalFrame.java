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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.ConciliacionesBancariasConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
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
public class ConciliacionesBancariasDetalleFormJInternalFrame extends ConciliacionesBancariasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConciliacionesBancarias;
	
	protected JMenuBar jmenuBarDetalleConciliacionesBancarias;
	
	protected JMenu jmenuDetalleConciliacionesBancarias;
	protected JMenu jmenuDetalleArchivoConciliacionesBancarias;
	protected JMenu jmenuDetalleAccionesConciliacionesBancarias;
	protected JMenu jmenuDetalleDatosConciliacionesBancarias;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConciliacionesBancarias;	
	protected GridBagConstraints gridBagConstraintsConciliacionesBancarias;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConciliacionesBancariasBeanSwingJInternalFrameAdditional jInternalFrameDetalleConciliacionesBancarias;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public ConciliacionesBancariasSessionBean conciliacionesbancariasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public ConciliacionesBancariasLogic conciliacionesbancariasLogic;
	
	public JScrollPane jScrollPanelDatosConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosEdicionConciliacionesBancarias;
	public JScrollPane jScrollPanelDatosGeneralConciliacionesBancarias;
	
	protected JPanel jPanelCamposConciliacionesBancarias;    
	protected JPanel jPanelCamposOcultosConciliacionesBancarias;    	
	protected JPanel jPanelAccionesConciliacionesBancarias;
	protected JPanel jPanelAccionesFormularioConciliacionesBancarias;
    
	
	
	protected Integer iXPanelCamposConciliacionesBancarias=0;
	protected Integer iYPanelCamposConciliacionesBancarias=0;
	
	protected Integer iXPanelCamposOcultosConciliacionesBancarias=0;
	protected Integer iYPanelCamposOcultosConciliacionesBancarias=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConciliacionesBancarias;
	public JButton jButtonModificarConciliacionesBancarias;
	public JButton jButtonActualizarConciliacionesBancarias;
    public JButton jButtonEliminarConciliacionesBancarias;
	public JButton jButtonCancelarConciliacionesBancarias;
    public JButton jButtonGuardarCambiosConciliacionesBancarias;
	public JButton jButtonGuardarCambiosTablaConciliacionesBancarias;
	protected JButton jButtonCerrarConciliacionesBancarias;
	
	
	protected JButton jButtonProcesarInformacionConciliacionesBancarias;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConciliacionesBancarias;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConciliacionesBancarias;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConciliacionesBancarias;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConciliacionesBancarias;
	protected JButton jButtonModificarToolBarConciliacionesBancarias;
	protected JButton jButtonActualizarToolBarConciliacionesBancarias;
    protected JButton jButtonEliminarToolBarConciliacionesBancarias;
	protected JButton jButtonCancelarToolBarConciliacionesBancarias;
    protected JButton jButtonGuardarCambiosToolBarConciliacionesBancarias;
	protected JButton jButtonGuardarCambiosTablaToolBarConciliacionesBancarias;
	protected JButton jButtonMostrarOcultarTablaToolBarConciliacionesBancarias;
	protected JButton jButtonCerrarToolBarConciliacionesBancarias;
	
	protected JButton jButtonProcesarInformacionToolBarConciliacionesBancarias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConciliacionesBancarias;
	protected JMenuItem jMenuItemModificarConciliacionesBancarias;
	protected JMenuItem jMenuItemActualizarConciliacionesBancarias;
    protected JMenuItem jMenuItemEliminarConciliacionesBancarias;
	protected JMenuItem jMenuItemCancelarConciliacionesBancarias;
    protected JMenuItem jMenuItemGuardarCambiosConciliacionesBancarias;
	protected JMenuItem jMenuItemGuardarCambiosTablaConciliacionesBancarias;
	protected JMenuItem jMenuItemCerrarConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleCerrarConciliacionesBancarias;
	protected JMenuItem jMenuItemDetalleMostarOcultarConciliacionesBancarias;
	
	protected JMenuItem jMenuItemProcesarInformacionConciliacionesBancarias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConciliacionesBancarias;
	protected JMenuItem jMenuItemMostrarOcultarConciliacionesBancarias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConciliacionesBancarias;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConciliacionesBancarias;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConciliacionesBancarias;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConciliacionesBancarias;
	public JLabel jLabelIdConciliacionesBancarias;
	public JLabel jLabelidConciliacionesBancarias;
	public JButton jButtonidConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeConciliacionesBancarias;
	public JLabel jLabelfecha_desdeConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_desdeConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_desdeConciliacionesBancarias;
	public JButton jButtonfecha_desdeConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaConciliacionesBancarias;
	public JLabel jLabelfecha_hastaConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfecha_hastaConciliacionesBancarias;

	public JDateChooser jDateChooserfecha_hastaConciliacionesBancarias;
	public JButton jButtonfecha_hastaConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorConciliacionesBancarias;
	public JLabel jLabelnumero_mayorConciliacionesBancarias;
	public JTextArea jTextAreanumero_mayorConciliacionesBancarias;
	public JScrollPane jscrollPanenumero_mayorConciliacionesBancarias;
	public JButton jButtonnumero_mayorConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuentaConciliacionesBancarias;
	public JLabel jLabelcodigo_cuentaConciliacionesBancarias;
	public JTextField jTextFieldcodigo_cuentaConciliacionesBancarias;
	public JButton jButtoncodigo_cuentaConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuentaConciliacionesBancarias;
	public JLabel jLabelnombre_cuentaConciliacionesBancarias;
	public JTextArea jTextAreanombre_cuentaConciliacionesBancarias;
	public JScrollPane jscrollPanenombre_cuentaConciliacionesBancarias;
	public JButton jButtonnombre_cuentaConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localConciliacionesBancarias;
	public JLabel jLabeldebito_localConciliacionesBancarias;
	public JTextField jTextFielddebito_localConciliacionesBancarias;
	public JButton jButtondebito_localConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localConciliacionesBancarias;
	public JLabel jLabelcredito_localConciliacionesBancarias;
	public JTextField jTextFieldcredito_localConciliacionesBancarias;
	public JButton jButtoncredito_localConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_depositoConciliacionesBancarias;
	public JLabel jLabelnumero_depositoConciliacionesBancarias;
	public JTextField jTextFieldnumero_depositoConciliacionesBancarias;
	public JButton jButtonnumero_depositoConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldebito_extranConciliacionesBancarias;
	public JLabel jLabeldebito_extranConciliacionesBancarias;
	public JTextField jTextFielddebito_extranConciliacionesBancarias;
	public JButton jButtondebito_extranConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcredito_extranConciliacionesBancarias;
	public JLabel jLabelcredito_extranConciliacionesBancarias;
	public JTextField jTextFieldcredito_extranConciliacionesBancarias;
	public JButton jButtoncredito_extranConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfechaConciliacionesBancarias;
	public JLabel jLabelfechaConciliacionesBancarias;
	//public JFormattedTextField jDateChooserfechaConciliacionesBancarias;

	public JDateChooser jDateChooserfechaConciliacionesBancarias;
	public JButton jButtonfechaConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldetalleConciliacionesBancarias;
	public JLabel jLabeldetalleConciliacionesBancarias;
	public JTextArea jTextAreadetalleConciliacionesBancarias;
	public JScrollPane jscrollPanedetalleConciliacionesBancarias;
	public JButton jButtondetalleConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioConciliacionesBancarias;
	public JLabel jLabelbeneficiarioConciliacionesBancarias;
	public JTextArea jTextAreabeneficiarioConciliacionesBancarias;
	public JScrollPane jscrollPanebeneficiarioConciliacionesBancarias;
	public JButton jButtonbeneficiarioConciliacionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConciliacionesBancarias;
	public JLabel jLabelid_empresaConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConciliacionesBancarias;
	public JButton jButtonid_empresaConciliacionesBancarias= new JButtonMe();
	public JButton jButtonid_empresaConciliacionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_empresaConciliacionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableConciliacionesBancarias;
	public JLabel jLabelid_cuenta_contableConciliacionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableConciliacionesBancarias;
	public JButton jButtonid_cuenta_contableConciliacionesBancarias= new JButtonMe();
	public JButton jButtonid_cuenta_contableConciliacionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableConciliacionesBancariasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConciliacionesBancarias;
	
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
	public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConciliacionesBancariasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConciliacionesBancarias=new JPanel();
				this.jPanelAccionesFormularioConciliacionesBancarias=new JPanel();
				this.jmenuBarDetalleConciliacionesBancarias=new JMenuBar();
				this.jTtoolBarDetalleConciliacionesBancarias=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConciliacionesBancariasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConciliacionesBancariasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConciliacionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConciliacionesBancarias() {
		return this.jButtonActualizarToolBarConciliacionesBancarias;
	}
	
	public JButton getjButtonEliminarToolBarConciliacionesBancarias() {
		return this.jButtonEliminarToolBarConciliacionesBancarias;
	}
	
	public JButton getjButtonCancelarToolBarConciliacionesBancarias() {
		return this.jButtonCancelarToolBarConciliacionesBancarias;
	}		
	
	public JButton getjButtonProcesarInformacionConciliacionesBancarias() {
		return this.jButtonProcesarInformacionConciliacionesBancarias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConciliacionesBancarias)	{
		this.jButtonProcesarInformacionConciliacionesBancarias = jButtonProcesarInformacionConciliacionesBancarias;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConciliacionesBancarias() {
		return this.jComboBoxTiposAccionesConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConciliacionesBancarias(
			JComboBox jComboBoxTiposRelacionesConciliacionesBancarias) {
		this.jComboBoxTiposRelacionesConciliacionesBancarias = jComboBoxTiposRelacionesConciliacionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConciliacionesBancarias(
			JComboBox jComboBoxTiposAccionesConciliacionesBancarias) {
		this.jComboBoxTiposAccionesConciliacionesBancarias = jComboBoxTiposAccionesConciliacionesBancarias;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConciliacionesBancarias() {
		return this.jComboBoxTiposAccionesFormularioConciliacionesBancarias;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConciliacionesBancarias(
			JComboBox jComboBoxTiposAccionesFormularioConciliacionesBancarias) {
		this.jComboBoxTiposAccionesFormularioConciliacionesBancarias = jComboBoxTiposAccionesFormularioConciliacionesBancarias;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.conciliacionesbancariasSessionBean=new ConciliacionesBancariasSessionBean();
		
		this.conciliacionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conciliacionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConciliacionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConciliacionesBancariasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conciliaciones Bancarias MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
	
		ConciliacionesBancariasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConciliacionesBancarias= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConciliacionesBancarias=new JButtonMe();
				this.jButtonModificarToolBarConciliacionesBancarias=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConciliacionesBancarias,this.jTtoolBarDetalleConciliacionesBancarias,
							"actualizar","actualizar","Actualizar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConciliacionesBancarias,this.jTtoolBarDetalleConciliacionesBancarias,
							"eliminar","eliminar","Eliminar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConciliacionesBancarias,this.jTtoolBarDetalleConciliacionesBancarias,
							"cancelar","cancelar","Cancelar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConciliacionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConciliacionesBancarias,this.jTtoolBarDetalleConciliacionesBancarias,
							"guardarcambios","guardarcambios","Guardar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConciliacionesBancarias=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConciliacionesBancarias=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConciliacionesBancarias=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConciliacionesBancarias=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConciliacionesBancarias=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConciliacionesBancarias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConciliacionesBancarias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConciliacionesBancarias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConciliacionesBancarias= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConciliacionesBancarias.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConciliacionesBancarias,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConciliacionesBancarias= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConciliacionesBancarias.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConciliacionesBancarias,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConciliacionesBancarias= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConciliacionesBancarias.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConciliacionesBancarias,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConciliacionesBancarias= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConciliacionesBancarias.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConciliacionesBancarias,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConciliacionesBancarias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConciliacionesBancarias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConciliacionesBancarias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConciliacionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConciliacionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConciliacionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConciliacionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConciliacionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConciliacionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConciliacionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConciliacionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConciliacionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConciliacionesBancarias.add(this.jMenuItemDetalleCerrarConciliacionesBancarias);
		
		this.jmenuDetalleAccionesConciliacionesBancarias.add(this.jMenuItemActualizarConciliacionesBancarias);
		this.jmenuDetalleAccionesConciliacionesBancarias.add(this.jMenuItemEliminarConciliacionesBancarias);
		this.jmenuDetalleAccionesConciliacionesBancarias.add(this.jMenuItemCancelarConciliacionesBancarias);		
		
		//this.jmenuDetalleDatosConciliacionesBancarias.add(this.jMenuItemDetalleAbrirOrderByConciliacionesBancarias);				
		this.jmenuDetalleDatosConciliacionesBancarias.add(this.jMenuItemDetalleMostarOcultarConciliacionesBancarias);				
				
		//this.jmenuDetalleAccionesConciliacionesBancarias.add(this.jMenuItemGuardarCambiosConciliacionesBancarias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConciliacionesBancarias.add(this.jmenuDetalleArchivoConciliacionesBancarias);		
		this.jmenuBarDetalleConciliacionesBancarias.add(this.jmenuDetalleAccionesConciliacionesBancarias);		
		this.jmenuBarDetalleConciliacionesBancarias.add(this.jmenuDetalleDatosConciliacionesBancarias);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConciliacionesBancarias);				
	}
	
	
	public void inicializarElementosCamposConciliacionesBancarias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConciliacionesBancarias = new JLabelMe();
		jLabelIdConciliacionesBancarias.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConciliacionesBancarias = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConciliacionesBancarias= new GridBagLayout();

		this.jPanelidConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);

		jLabelidConciliacionesBancarias = new JLabel();
		jLabelidConciliacionesBancarias.setText("Id");

		jLabelidConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeConciliacionesBancarias = new JLabelMe();
		this.jLabelfecha_desdeConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeConciliacionesBancarias.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelfecha_desdeConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		//jFormattedTextFieldfecha_desdeConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_desdeConciliacionesBancarias.setEnabled(false);
		jDateChooserfecha_desdeConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_desdeConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaConciliacionesBancarias = new JLabelMe();
		this.jLabelfecha_hastaConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaConciliacionesBancarias.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelfecha_hastaConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		//jFormattedTextFieldfecha_hastaConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaConciliacionesBancarias= new JDateChooser();
		jDateChooserfecha_hastaConciliacionesBancarias.setEnabled(false);
		jDateChooserfecha_hastaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaConciliacionesBancarias.setDate(new Date());
		jDateChooserfecha_hastaConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorConciliacionesBancarias = new JLabelMe();
		this.jLabelnumero_mayorConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorConciliacionesBancarias.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelnumero_mayorConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextAreanumero_mayorConciliacionesBancarias= new JTextAreaMe();
		jTextAreanumero_mayorConciliacionesBancarias.setEnabled(false);
		jTextAreanumero_mayorConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorConciliacionesBancarias.setLineWrap(true);
		jTextAreanumero_mayorConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreanumero_mayorConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorConciliacionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorConciliacionesBancarias = new JScrollPane(jTextAreanumero_mayorConciliacionesBancarias);
		jscrollPanenumero_mayorConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuentaConciliacionesBancarias = new JLabelMe();
		this.jLabelcodigo_cuentaConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA+" : *");
		this.jLabelcodigo_cuentaConciliacionesBancarias.setToolTipText("Codigo Cuenta");
		this.jLabelcodigo_cuentaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuentaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuentaConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuentaConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelcodigo_cuentaConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextFieldcodigo_cuentaConciliacionesBancarias= new JTextFieldMe();

		jTextFieldcodigo_cuentaConciliacionesBancarias.setEnabled(false);
		jTextFieldcodigo_cuentaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuentaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setText("U");
		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuentaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuentaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuentaConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuentaConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuentaConciliacionesBancarias = new JLabelMe();
		this.jLabelnombre_cuentaConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA+" : *");
		this.jLabelnombre_cuentaConciliacionesBancarias.setToolTipText("Nombre Cuenta");
		this.jLabelnombre_cuentaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cuentaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cuentaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuentaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuentaConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuentaConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelnombre_cuentaConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextAreanombre_cuentaConciliacionesBancarias= new JTextAreaMe();
		jTextAreanombre_cuentaConciliacionesBancarias.setEnabled(false);
		jTextAreanombre_cuentaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuentaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuentaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuentaConciliacionesBancarias.setLineWrap(true);
		jTextAreanombre_cuentaConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreanombre_cuentaConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuentaConciliacionesBancarias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuentaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuentaConciliacionesBancarias = new JScrollPane(jTextAreanombre_cuentaConciliacionesBancarias);
		jscrollPanenombre_cuentaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuentaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuentaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuentaConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuentaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuentaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuentaConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuentaConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localConciliacionesBancarias = new JLabelMe();
		this.jLabeldebito_localConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localConciliacionesBancarias.setToolTipText("Debito Local");
		this.jLabeldebito_localConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPaneldebito_localConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextFielddebito_localConciliacionesBancarias= new JTextFieldMe();
		jTextFielddebito_localConciliacionesBancarias.setEnabled(false);
		jTextFielddebito_localConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localConciliacionesBancarias.setText("0.0");

		this.jButtondebito_localConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtondebito_localConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localConciliacionesBancariasBusqueda.setText("U");
		this.jButtondebito_localConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localConciliacionesBancarias = new JLabelMe();
		this.jLabelcredito_localConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localConciliacionesBancarias.setToolTipText("Credito Local");
		this.jLabelcredito_localConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelcredito_localConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextFieldcredito_localConciliacionesBancarias= new JTextFieldMe();
		jTextFieldcredito_localConciliacionesBancarias.setEnabled(false);
		jTextFieldcredito_localConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localConciliacionesBancarias.setText("0.0");

		this.jButtoncredito_localConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtoncredito_localConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localConciliacionesBancariasBusqueda.setText("U");
		this.jButtoncredito_localConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_depositoConciliacionesBancarias = new JLabelMe();
		this.jLabelnumero_depositoConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO+" : *");
		this.jLabelnumero_depositoConciliacionesBancarias.setToolTipText("Numero Deposito");
		this.jLabelnumero_depositoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_depositoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_depositoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_depositoConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_depositoConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_depositoConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_NUMERODEPOSITO);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelnumero_depositoConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextFieldnumero_depositoConciliacionesBancarias= new JTextFieldMe();

		jTextFieldnumero_depositoConciliacionesBancarias.setEnabled(false);
		jTextFieldnumero_depositoConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_depositoConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_depositoConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_depositoConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_depositoConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setText("U");
		this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_depositoConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_depositoConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_depositoConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_depositoConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_depositoConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldebito_extranConciliacionesBancarias = new JLabelMe();
		this.jLabeldebito_extranConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN+" : *");
		this.jLabeldebito_extranConciliacionesBancarias.setToolTipText("Debito Extran");
		this.jLabeldebito_extranConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_extranConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_extranConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_extranConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_extranConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_extranConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_DEBITOEXTRAN);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPaneldebito_extranConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextFielddebito_extranConciliacionesBancarias= new JTextFieldMe();
		jTextFielddebito_extranConciliacionesBancarias.setEnabled(false);
		jTextFielddebito_extranConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_extranConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_extranConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_extranConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_extranConciliacionesBancarias.setText("0.0");

		this.jButtondebito_extranConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtondebito_extranConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_extranConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_extranConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_extranConciliacionesBancariasBusqueda.setText("U");
		this.jButtondebito_extranConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_extranConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_extranConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_extranConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_extranConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_extranConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_extranConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcredito_extranConciliacionesBancarias = new JLabelMe();
		this.jLabelcredito_extranConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN+" : *");
		this.jLabelcredito_extranConciliacionesBancarias.setToolTipText("Credito Extran");
		this.jLabelcredito_extranConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_extranConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_extranConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_extranConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_extranConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_extranConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_CREDITOEXTRAN);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelcredito_extranConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextFieldcredito_extranConciliacionesBancarias= new JTextFieldMe();
		jTextFieldcredito_extranConciliacionesBancarias.setEnabled(false);
		jTextFieldcredito_extranConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_extranConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_extranConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_extranConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_extranConciliacionesBancarias.setText("0.0");

		this.jButtoncredito_extranConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtoncredito_extranConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_extranConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_extranConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_extranConciliacionesBancariasBusqueda.setText("U");
		this.jButtoncredito_extranConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_extranConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_extranConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_extranConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_extranConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_extranConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_extranConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfechaConciliacionesBancarias = new JLabelMe();
		this.jLabelfechaConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaConciliacionesBancarias.setToolTipText("Fecha");
		this.jLabelfechaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelfechaConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		//jFormattedTextFieldfechaConciliacionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfechaConciliacionesBancarias= new JDateChooser();
		jDateChooserfechaConciliacionesBancarias.setEnabled(false);
		jDateChooserfechaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaConciliacionesBancarias.setDate(new Date());
		jDateChooserfechaConciliacionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaConciliacionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonfechaConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaConciliacionesBancariasBusqueda.setText("U");
		this.jButtonfechaConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldetalleConciliacionesBancarias = new JLabelMe();
		this.jLabeldetalleConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleConciliacionesBancarias.setToolTipText("Detalle");
		this.jLabeldetalleConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPaneldetalleConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextAreadetalleConciliacionesBancarias= new JTextAreaMe();
		jTextAreadetalleConciliacionesBancarias.setEnabled(false);
		jTextAreadetalleConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleConciliacionesBancarias.setLineWrap(true);
		jTextAreadetalleConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreadetalleConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleConciliacionesBancarias.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleConciliacionesBancarias = new JScrollPane(jTextAreadetalleConciliacionesBancarias);
		jscrollPanedetalleConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtondetalleConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleConciliacionesBancariasBusqueda.setText("U");
		this.jButtondetalleConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleConciliacionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioConciliacionesBancarias = new JLabelMe();
		this.jLabelbeneficiarioConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioConciliacionesBancarias.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelbeneficiarioConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jTextAreabeneficiarioConciliacionesBancarias= new JTextAreaMe();
		jTextAreabeneficiarioConciliacionesBancarias.setEnabled(false);
		jTextAreabeneficiarioConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioConciliacionesBancarias.setLineWrap(true);
		jTextAreabeneficiarioConciliacionesBancarias.setWrapStyleWord(true);
		jTextAreabeneficiarioConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioConciliacionesBancarias.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioConciliacionesBancarias = new JScrollPane(jTextAreabeneficiarioConciliacionesBancarias);
		jscrollPanebeneficiarioConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setText("U");
		this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioConciliacionesBancariasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConciliacionesBancarias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConciliacionesBancarias = new JLabelMe();
		this.jLabelid_empresaConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConciliacionesBancarias.setToolTipText("Empresa");
		this.jLabelid_empresaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelid_empresaConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jComboBoxid_empresaConciliacionesBancarias= new JComboBoxMe();
		jComboBoxid_empresaConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConciliacionesBancarias.setEnabled(false);

		this.jButtonid_empresaConciliacionesBancarias= new JButtonMe();
		this.jButtonid_empresaConciliacionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConciliacionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConciliacionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConciliacionesBancarias.setText("Buscar");
		this.jButtonid_empresaConciliacionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConciliacionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConciliacionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConciliacionesBancarias"));

		this.jButtonid_empresaConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_empresaConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConciliacionesBancariasBusqueda.setText("U");
		this.jButtonid_empresaConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConciliacionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_empresaConciliacionesBancariasUpdate= new JButtonMe();
		this.jButtonid_empresaConciliacionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConciliacionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConciliacionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConciliacionesBancariasUpdate.setText("U");
		this.jButtonid_empresaConciliacionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConciliacionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConciliacionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConciliacionesBancariasUpdate"));



					
		this.jLabelid_cuenta_contableConciliacionesBancarias = new JLabelMe();
		this.jLabelid_cuenta_contableConciliacionesBancarias.setText(""+ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableConciliacionesBancarias.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableConciliacionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableConciliacionesBancarias.setToolTipText(ConciliacionesBancariasConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		this.jPanelid_cuenta_contableConciliacionesBancarias.setLayout(this.gridaBagLayoutConciliacionesBancarias);


		jComboBoxid_cuenta_contableConciliacionesBancarias= new JComboBoxMe();
		jComboBoxid_cuenta_contableConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableConciliacionesBancarias= new JButtonMe();
		this.jButtonid_cuenta_contableConciliacionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableConciliacionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableConciliacionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableConciliacionesBancarias.setText("Buscar");
		this.jButtonid_cuenta_contableConciliacionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableConciliacionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableConciliacionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableConciliacionesBancarias"));

		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setText("U");
		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableConciliacionesBancariasBusqueda"));

		if(this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableConciliacionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableConciliacionesBancariasUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableConciliacionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableConciliacionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableConciliacionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableConciliacionesBancariasUpdate.setText("U");
		this.jButtonid_cuenta_contableConciliacionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableConciliacionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableConciliacionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableConciliacionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableConciliacionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableConciliacionesBancariasUpdate"));



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
		//this.jInternalFrameDetalleConciliacionesBancarias = new ConciliacionesBancariasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Conciliaciones Bancarias DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConciliacionesBancarias= new GridBagLayout();
		

		
		String sToolTipConciliacionesBancarias="";
		sToolTipConciliacionesBancarias=ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConciliacionesBancarias+="(Tesoreria.ConciliacionesBancarias)";
		}
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			sToolTipConciliacionesBancarias+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConciliacionesBancarias = new JButtonMe();
		this.jButtonModificarConciliacionesBancarias = new JButtonMe();
        this.jButtonActualizarConciliacionesBancarias = new JButtonMe();
        this.jButtonEliminarConciliacionesBancarias = new JButtonMe();
        this.jButtonCancelarConciliacionesBancarias = new JButtonMe();
        this.jButtonGuardarCambiosConciliacionesBancarias = new JButtonMe();
		this.jButtonGuardarCambiosTablaConciliacionesBancarias = new JButtonMe();
		this.jButtonCerrarConciliacionesBancarias = new JButtonMe();
		
		this.jScrollPanelDatosConciliacionesBancarias = new JScrollPane();   
        this.jScrollPanelDatosEdicionConciliacionesBancarias = new JScrollPane();
		this.jScrollPanelDatosGeneralConciliacionesBancarias = new JScrollPane();
				
		
		
		this.jPanelCamposConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Conciliaciones Bancarias";
		
		if(!this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conciliaciones Bancariases" + this.sPath));
		} else {
			this.jScrollPanelDatosConciliacionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConciliacionesBancarias.setName("jPanelCamposConciliacionesBancarias"); 

		this.jPanelCamposOcultosConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConciliacionesBancarias.setName("jPanelCamposOcultosConciliacionesBancarias"); 

        this.jPanelAccionesConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConciliacionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesConciliacionesBancarias.setName("Acciones"); 

		this.jPanelAccionesFormularioConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConciliacionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConciliacionesBancarias.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConciliacionesBancarias.setText("Nuevo");
		this.jButtonModificarConciliacionesBancarias.setText("Editar");
        this.jButtonActualizarConciliacionesBancarias.setText("Actualizar");
        this.jButtonEliminarConciliacionesBancarias.setText("Eliminar");
        this.jButtonCancelarConciliacionesBancarias.setText("Cancelar");
        this.jButtonGuardarCambiosConciliacionesBancarias.setText("Guardar");
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.setText("Guardar");
		this.jButtonCerrarConciliacionesBancarias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConciliacionesBancarias,"nuevo_button","Nuevo",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConciliacionesBancarias,"modificar_button","Editar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConciliacionesBancarias,"actualizar_button","Actualizar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConciliacionesBancarias,"eliminar_button","Eliminar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConciliacionesBancarias,"cancelar_button","Cancelar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConciliacionesBancarias,"guardarcambios_button","Guardar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConciliacionesBancarias,"guardarcambiostabla_button","Guardar",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConciliacionesBancarias,"cerrar_button","Salir",this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConciliacionesBancarias.setToolTipText("Nuevo"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConciliacionesBancarias.setToolTipText("Editar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConciliacionesBancarias.setToolTipText("Actualizar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConciliacionesBancarias.setToolTipText("Eliminar)"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConciliacionesBancarias.setToolTipText("Cancelar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConciliacionesBancarias.setToolTipText("Guardar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.setToolTipText("Guardar"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConciliacionesBancarias.setToolTipText("Salir"+" "+ConciliacionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConciliacionesBancarias";
		inputMap = this.jButtonNuevoConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConciliacionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConciliacionesBancarias"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConciliacionesBancarias";
		inputMap = this.jButtonActualizarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConciliacionesBancarias"));
		
		//ELIMINAR
		sMapKey = "EliminarConciliacionesBancarias";
		inputMap = this.jButtonEliminarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConciliacionesBancarias"));
		
		//CANCELAR	
		sMapKey = "CancelarConciliacionesBancarias";
		inputMap = this.jButtonCancelarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConciliacionesBancarias"));
		
		//CERRAR		
		sMapKey = "CerrarConciliacionesBancarias";
		inputMap = this.jButtonCerrarConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConciliacionesBancarias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConciliacionesBancarias";
		inputMap = this.jButtonGuardarCambiosTablaConciliacionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConciliacionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConciliacionesBancarias"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConciliacionesBancarias.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConciliacionesBancarias.setToolTipText("Nuevo ConciliacionesBancarias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConciliacionesBancarias.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConciliacionesBancarias.setToolTipText("Sin Cerrar Ventana ConciliacionesBancarias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConciliacionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConciliacionesBancarias.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConciliacionesBancarias.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConciliacionesBancarias.setText("Accion");
		this.jComboBoxTiposAccionesConciliacionesBancarias.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConciliacionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConciliacionesBancarias = new JLabelMe();
		
		this.jLabelAccionesConciliacionesBancarias.setText("Acciones");		
		this.jLabelAccionesConciliacionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConciliacionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConciliacionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConciliacionesBancarias();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConciliacionesBancarias();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConciliacionesBancarias=new JTabbedPane();
		this.jTabbedPaneRelacionesConciliacionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConciliacionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConciliacionesBancarias.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConciliacionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConciliacionesBancarias = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConciliacionesBancarias = new GridBagLayout();
		
		this.jPanelCamposConciliacionesBancarias.setLayout(gridaBagLayoutCamposConciliacionesBancarias);
		this.jPanelCamposOcultosConciliacionesBancarias.setLayout(gridaBagLayoutCamposOcultosConciliacionesBancarias);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConciliacionesBancarias.add(jLabelIdConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConciliacionesBancarias.add(jLabelidConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConciliacionesBancarias.add(jLabelid_empresaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConciliacionesBancarias.add(jButtonid_empresaConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 3;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConciliacionesBancarias.add(jButtonid_empresaConciliacionesBancariasUpdate, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConciliacionesBancarias.add(jComboBoxid_empresaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableConciliacionesBancarias.add(jLabelid_cuenta_contableConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableConciliacionesBancarias.add(jButtonid_cuenta_contableConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 3;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableConciliacionesBancarias.add(jButtonid_cuenta_contableConciliacionesBancariasUpdate, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableConciliacionesBancarias.add(jComboBoxid_cuenta_contableConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeConciliacionesBancarias.add(jLabelfecha_desdeConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeConciliacionesBancarias.add(jButtonfecha_desdeConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeConciliacionesBancarias.add(jDateChooserfecha_desdeConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaConciliacionesBancarias.add(jLabelfecha_hastaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaConciliacionesBancarias.add(jButtonfecha_hastaConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaConciliacionesBancarias.add(jDateChooserfecha_hastaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorConciliacionesBancarias.add(jLabelnumero_mayorConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorConciliacionesBancarias.add(jButtonnumero_mayorConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorConciliacionesBancarias.add(jscrollPanenumero_mayorConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuentaConciliacionesBancarias.add(jLabelcodigo_cuentaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuentaConciliacionesBancarias.add(jButtoncodigo_cuentaConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuentaConciliacionesBancarias.add(jTextFieldcodigo_cuentaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuentaConciliacionesBancarias.add(jLabelnombre_cuentaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuentaConciliacionesBancarias.add(jButtonnombre_cuentaConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuentaConciliacionesBancarias.add(jscrollPanenombre_cuentaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localConciliacionesBancarias.add(jLabeldebito_localConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localConciliacionesBancarias.add(jButtondebito_localConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localConciliacionesBancarias.add(jTextFielddebito_localConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localConciliacionesBancarias.add(jLabelcredito_localConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localConciliacionesBancarias.add(jButtoncredito_localConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localConciliacionesBancarias.add(jTextFieldcredito_localConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_depositoConciliacionesBancarias.add(jLabelnumero_depositoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_depositoConciliacionesBancarias.add(jButtonnumero_depositoConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_depositoConciliacionesBancarias.add(jTextFieldnumero_depositoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_extranConciliacionesBancarias.add(jLabeldebito_extranConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_extranConciliacionesBancarias.add(jButtondebito_extranConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_extranConciliacionesBancarias.add(jTextFielddebito_extranConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_extranConciliacionesBancarias.add(jLabelcredito_extranConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_extranConciliacionesBancarias.add(jButtoncredito_extranConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_extranConciliacionesBancarias.add(jTextFieldcredito_extranConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaConciliacionesBancarias.add(jLabelfechaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaConciliacionesBancarias.add(jButtonfechaConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaConciliacionesBancarias.add(jDateChooserfechaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleConciliacionesBancarias.add(jLabeldetalleConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleConciliacionesBancarias.add(jButtondetalleConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleConciliacionesBancarias.add(jscrollPanedetalleConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioConciliacionesBancarias.add(jLabelbeneficiarioConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = 2;
		this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
		this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioConciliacionesBancarias.add(jButtonbeneficiarioConciliacionesBancariasBusqueda, this.gridBagConstraintsConciliacionesBancarias);
	}

	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
	this.gridBagConstraintsConciliacionesBancarias.gridx = 1;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioConciliacionesBancarias.add(jscrollPanebeneficiarioConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelidConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelid_cuenta_contableConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelfecha_desdeConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelfecha_hastaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelnumero_mayorConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelcodigo_cuentaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelnombre_cuentaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPaneldebito_localConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelcredito_localConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelnumero_depositoConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPaneldebito_extranConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelcredito_extranConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelfechaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPaneldetalleConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConciliacionesBancarias.add(this.jPanelbeneficiarioConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposConciliacionesBancarias % 2==0) {
		iXPanelCamposConciliacionesBancarias=0;
		iYPanelCamposConciliacionesBancarias++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConciliacionesBancarias.gridy = iYPanelCamposOcultosConciliacionesBancarias;
	this.gridBagConstraintsConciliacionesBancarias.gridx = iXPanelCamposOcultosConciliacionesBancarias++;
	this.gridBagConstraintsConciliacionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConciliacionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConciliacionesBancarias.add(this.jPanelid_empresaConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);



	if(iXPanelCamposOcultosConciliacionesBancarias % 2==0) {
		iXPanelCamposOcultosConciliacionesBancarias=0;
		iYPanelCamposOcultosConciliacionesBancarias++;
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
			
		GridBagLayout gridaBagLayoutAccionesConciliacionesBancarias= new GridBagLayout();
		this.jPanelAccionesConciliacionesBancarias.setLayout(gridaBagLayoutAccionesConciliacionesBancarias);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConciliacionesBancarias= new GridBagLayout();
		this.jPanelAccionesFormularioConciliacionesBancarias.setLayout(gridaBagLayoutAccionesFormularioConciliacionesBancarias);
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConciliacionesBancarias.add(this.jComboBoxTiposAccionesFormularioConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccion++;
			
		this.jPanelAccionesConciliacionesBancarias.add(this.jButtonModificarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);							

		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;
		this.gridBagConstraintsConciliacionesBancarias.gridx =iPosXAccion++;
			
		this.jPanelAccionesConciliacionesBancarias.add(this.jButtonEliminarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccion++;
		
		this.jPanelAccionesConciliacionesBancarias.add(this.jButtonActualizarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);


		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = iPosXAccion++;
		
		this.jPanelAccionesConciliacionesBancarias.add(this.jButtonGuardarCambiosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);	
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = 0;		
		this.gridBagConstraintsConciliacionesBancarias.gridx =iPosXAccion++;
		
		this.jPanelAccionesConciliacionesBancarias.add(this.jButtonCancelarConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConciliacionesBancarias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConciliacionesBancarias);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conciliacionesbancariasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();						
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;		
			//this.gridBagConstraintsConciliacionesBancarias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConciliacionesBancarias.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConciliacionesBancarias.gridx =0;
		this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConciliacionesBancarias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConciliacionesBancariasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConciliacionesBancarias = new ConciliacionesBancariasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Conciliaciones Bancarias DATOS");
			
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
			
	        //this.setTitle("[FOR] - Conciliaciones Bancarias DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conciliaciones Bancarias Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConciliacionesBancariasModel conciliacionesbancariasModel=new ConciliacionesBancariasModel(this);
			
			//SI USARA CLASE INTERNA
			//ConciliacionesBancariasModel.ConciliacionesBancariasFocusTraversalPolicy conciliacionesbancariasFocusTraversalPolicy = conciliacionesbancariasModel.new ConciliacionesBancariasFocusTraversalPolicy(this);
			
			//conciliacionesbancariasFocusTraversalPolicy.setconciliacionesbancariasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(conciliacionesbancariasModel);
			
			
			this.jContentPaneDetalleConciliacionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConciliacionesBancarias = new GridBagLayout();	
			this.jContentPaneDetalleConciliacionesBancarias.setLayout(gridaBagLayoutDetalleConciliacionesBancarias);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConciliacionesBancarias = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
					
				
				this.jContentPaneDetalleConciliacionesBancarias.add(jTtoolBarDetalleConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);								
				
}
			
			this.jScrollPanelDatosEdicionConciliacionesBancarias=   new JScrollPane(jContentPaneDetalleConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConciliacionesBancarias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	        
			this.jContentPaneDetalleConciliacionesBancarias.add(jPanelCamposConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);
			
			
			
			
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
						//&& conciliacionesbancariasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.conciliacionesbancariasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConciliacionesBancarias= new GridBagConstraints();
						this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
						this.jContentPaneDetalleConciliacionesBancarias.add(this.jTabbedPaneRelacionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConciliacionesBancarias.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConciliacionesBancarias.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
					this.gridBagConstraintsConciliacionesBancarias.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
					
				
					this.jContentPaneDetalleConciliacionesBancarias.add(jPanelCamposOcultosConciliacionesBancarias, gridBagConstraintsConciliacionesBancarias);
				
					this.jPanelCamposOcultosConciliacionesBancarias.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	        this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConciliacionesBancarias.add(this.jPanelAccionesFormularioConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);							
			
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
	        this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
	        
			
			this.jContentPaneDetalleConciliacionesBancarias.add(this.jPanelAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConciliacionesBancarias);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConciliacionesBancarias=   new JScrollPane(this.jPanelCamposConciliacionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConciliacionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConciliacionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConciliacionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
			this.gridBagConstraintsConciliacionesBancarias.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConciliacionesBancarias.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConciliacionesBancarias.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);			
			
			this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsConciliacionesBancarias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
			
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		
			
		this.gridBagConstraintsConciliacionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsConciliacionesBancarias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConciliacionesBancarias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConciliacionesBancarias, this.gridBagConstraintsConciliacionesBancarias);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConciliacionesBancarias;//jContentPane;
		
		return jScrollPanelDatosEdicionConciliacionesBancarias;
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
