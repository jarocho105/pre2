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
import com.bydan.erp.tesoreria.util.report.PosicionesBancariasConstantesFunciones;

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
public class PosicionesBancariasDetalleFormJInternalFrame extends PosicionesBancariasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePosicionesBancarias;
	
	protected JMenuBar jmenuBarDetallePosicionesBancarias;
	
	protected JMenu jmenuDetallePosicionesBancarias;
	protected JMenu jmenuDetalleArchivoPosicionesBancarias;
	protected JMenu jmenuDetalleAccionesPosicionesBancarias;
	protected JMenu jmenuDetalleDatosPosicionesBancarias;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPosicionesBancarias;	
	protected GridBagConstraints gridBagConstraintsPosicionesBancarias;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PosicionesBancariasBeanSwingJInternalFrameAdditional jInternalFrameDetallePosicionesBancarias;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public PosicionesBancariasSessionBean posicionesbancariasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public PosicionesBancariasLogic posicionesbancariasLogic;
	
	public JScrollPane jScrollPanelDatosPosicionesBancarias;
	public JScrollPane jScrollPanelDatosEdicionPosicionesBancarias;
	public JScrollPane jScrollPanelDatosGeneralPosicionesBancarias;
	
	protected JPanel jPanelCamposPosicionesBancarias;    
	protected JPanel jPanelCamposOcultosPosicionesBancarias;    	
	protected JPanel jPanelAccionesPosicionesBancarias;
	protected JPanel jPanelAccionesFormularioPosicionesBancarias;
    
	
	
	protected Integer iXPanelCamposPosicionesBancarias=0;
	protected Integer iYPanelCamposPosicionesBancarias=0;
	
	protected Integer iXPanelCamposOcultosPosicionesBancarias=0;
	protected Integer iYPanelCamposOcultosPosicionesBancarias=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPosicionesBancarias;
	public JButton jButtonModificarPosicionesBancarias;
	public JButton jButtonActualizarPosicionesBancarias;
    public JButton jButtonEliminarPosicionesBancarias;
	public JButton jButtonCancelarPosicionesBancarias;
    public JButton jButtonGuardarCambiosPosicionesBancarias;
	public JButton jButtonGuardarCambiosTablaPosicionesBancarias;
	protected JButton jButtonCerrarPosicionesBancarias;
	
	
	protected JButton jButtonProcesarInformacionPosicionesBancarias;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPosicionesBancarias;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPosicionesBancarias;
	protected JCheckBox jCheckBoxPostAccionSinMensajePosicionesBancarias;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPosicionesBancarias;
	protected JButton jButtonModificarToolBarPosicionesBancarias;
	protected JButton jButtonActualizarToolBarPosicionesBancarias;
    protected JButton jButtonEliminarToolBarPosicionesBancarias;
	protected JButton jButtonCancelarToolBarPosicionesBancarias;
    protected JButton jButtonGuardarCambiosToolBarPosicionesBancarias;
	protected JButton jButtonGuardarCambiosTablaToolBarPosicionesBancarias;
	protected JButton jButtonMostrarOcultarTablaToolBarPosicionesBancarias;
	protected JButton jButtonCerrarToolBarPosicionesBancarias;
	
	protected JButton jButtonProcesarInformacionToolBarPosicionesBancarias;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPosicionesBancarias;
	protected JMenuItem jMenuItemModificarPosicionesBancarias;
	protected JMenuItem jMenuItemActualizarPosicionesBancarias;
    protected JMenuItem jMenuItemEliminarPosicionesBancarias;
	protected JMenuItem jMenuItemCancelarPosicionesBancarias;
    protected JMenuItem jMenuItemGuardarCambiosPosicionesBancarias;
	protected JMenuItem jMenuItemGuardarCambiosTablaPosicionesBancarias;
	protected JMenuItem jMenuItemCerrarPosicionesBancarias;
	protected JMenuItem jMenuItemDetalleCerrarPosicionesBancarias;
	protected JMenuItem jMenuItemDetalleMostarOcultarPosicionesBancarias;
	
	protected JMenuItem jMenuItemProcesarInformacionPosicionesBancarias;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPosicionesBancarias;
	protected JMenuItem jMenuItemMostrarOcultarPosicionesBancarias;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPosicionesBancarias;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPosicionesBancarias;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPosicionesBancarias;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPosicionesBancarias;
	public JLabel jLabelIdPosicionesBancarias;
	public JLabel jLabelidPosicionesBancarias;
	public JButton jButtonidPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdePosicionesBancarias;
	public JLabel jLabelfecha_desdePosicionesBancarias;
	//public JFormattedTextField jDateChooserfecha_desdePosicionesBancarias;

	public JDateChooser jDateChooserfecha_desdePosicionesBancarias;
	public JButton jButtonfecha_desdePosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaPosicionesBancarias;
	public JLabel jLabelfecha_hastaPosicionesBancarias;
	//public JFormattedTextField jDateChooserfecha_hastaPosicionesBancarias;

	public JDateChooser jDateChooserfecha_hastaPosicionesBancarias;
	public JButton jButtonfecha_hastaPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelorden_desdePosicionesBancarias;
	public JLabel jLabelorden_desdePosicionesBancarias;
	public JTextField jTextFieldorden_desdePosicionesBancarias;
	public JButton jButtonorden_desdePosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelorden_hastaPosicionesBancarias;
	public JLabel jLabelorden_hastaPosicionesBancarias;
	public JTextField jTextFieldorden_hastaPosicionesBancarias;
	public JButton jButtonorden_hastaPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneltipo_documentoPosicionesBancarias;
	public JLabel jLabeltipo_documentoPosicionesBancarias;
	public JTextArea jTextAreatipo_documentoPosicionesBancarias;
	public JScrollPane jscrollPanetipo_documentoPosicionesBancarias;
	public JButton jButtontipo_documentoPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldetallePosicionesBancarias;
	public JLabel jLabeldetallePosicionesBancarias;
	public JTextArea jTextAreadetallePosicionesBancarias;
	public JScrollPane jscrollPanedetallePosicionesBancarias;
	public JButton jButtondetallePosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuentaPosicionesBancarias;
	public JLabel jLabelcodigo_cuentaPosicionesBancarias;
	public JTextField jTextFieldcodigo_cuentaPosicionesBancarias;
	public JButton jButtoncodigo_cuentaPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuentaPosicionesBancarias;
	public JLabel jLabelnombre_cuentaPosicionesBancarias;
	public JTextArea jTextAreanombre_cuentaPosicionesBancarias;
	public JScrollPane jscrollPanenombre_cuentaPosicionesBancarias;
	public JButton jButtonnombre_cuentaPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorPosicionesBancarias;
	public JLabel jLabelnumero_mayorPosicionesBancarias;
	public JTextArea jTextAreanumero_mayorPosicionesBancarias;
	public JScrollPane jscrollPanenumero_mayorPosicionesBancarias;
	public JButton jButtonnumero_mayorPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localPosicionesBancarias;
	public JLabel jLabeldebito_localPosicionesBancarias;
	public JTextField jTextFielddebito_localPosicionesBancarias;
	public JButton jButtondebito_localPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localPosicionesBancarias;
	public JLabel jLabelcredito_localPosicionesBancarias;
	public JTextField jTextFieldcredito_localPosicionesBancarias;
	public JButton jButtoncredito_localPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoPosicionesBancarias;
	public JLabel jLabeltipo_movimientoPosicionesBancarias;
	public JTextArea jTextAreatipo_movimientoPosicionesBancarias;
	public JScrollPane jscrollPanetipo_movimientoPosicionesBancarias;
	public JButton jButtontipo_movimientoPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPosicionesBancarias;
	public JLabel jLabelfecha_emisionPosicionesBancarias;
	//public JFormattedTextField jDateChooserfecha_emisionPosicionesBancarias;

	public JDateChooser jDateChooserfecha_emisionPosicionesBancarias;
	public JButton jButtonfecha_emisionPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelfechaPosicionesBancarias;
	public JLabel jLabelfechaPosicionesBancarias;
	//public JFormattedTextField jDateChooserfechaPosicionesBancarias;

	public JDateChooser jDateChooserfechaPosicionesBancarias;
	public JButton jButtonfechaPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelbeneficiarioPosicionesBancarias;
	public JLabel jLabelbeneficiarioPosicionesBancarias;
	public JTextArea jTextAreabeneficiarioPosicionesBancarias;
	public JScrollPane jscrollPanebeneficiarioPosicionesBancarias;
	public JButton jButtonbeneficiarioPosicionesBancariasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPosicionesBancarias;
	public JLabel jLabelid_empresaPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPosicionesBancarias;
	public JButton jButtonid_empresaPosicionesBancarias= new JButtonMe();
	public JButton jButtonid_empresaPosicionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_empresaPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioPosicionesBancarias;
	public JLabel jLabelid_ejercicioPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioPosicionesBancarias;
	public JButton jButtonid_ejercicioPosicionesBancarias= new JButtonMe();
	public JButton jButtonid_ejercicioPosicionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioPosicionesBancariasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoPosicionesBancarias;
	public JLabel jLabelid_tipo_movimientoPosicionesBancarias;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoPosicionesBancarias;
	public JButton jButtonid_tipo_movimientoPosicionesBancarias= new JButtonMe();
	public JButton jButtonid_tipo_movimientoPosicionesBancariasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoPosicionesBancariasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPosicionesBancarias;
	
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
	public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PosicionesBancariasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPosicionesBancarias=new JPanel();
				this.jPanelAccionesFormularioPosicionesBancarias=new JPanel();
				this.jmenuBarDetallePosicionesBancarias=new JMenuBar();
				this.jTtoolBarDetallePosicionesBancarias=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PosicionesBancariasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PosicionesBancariasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PosicionesBancarias No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPosicionesBancarias() {
		return this.jButtonActualizarToolBarPosicionesBancarias;
	}
	
	public JButton getjButtonEliminarToolBarPosicionesBancarias() {
		return this.jButtonEliminarToolBarPosicionesBancarias;
	}
	
	public JButton getjButtonCancelarToolBarPosicionesBancarias() {
		return this.jButtonCancelarToolBarPosicionesBancarias;
	}		
	
	public JButton getjButtonProcesarInformacionPosicionesBancarias() {
		return this.jButtonProcesarInformacionPosicionesBancarias;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPosicionesBancarias)	{
		this.jButtonProcesarInformacionPosicionesBancarias = jButtonProcesarInformacionPosicionesBancarias;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPosicionesBancarias() {
		return this.jComboBoxTiposAccionesPosicionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPosicionesBancarias(
			JComboBox jComboBoxTiposRelacionesPosicionesBancarias) {
		this.jComboBoxTiposRelacionesPosicionesBancarias = jComboBoxTiposRelacionesPosicionesBancarias;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPosicionesBancarias(
			JComboBox jComboBoxTiposAccionesPosicionesBancarias) {
		this.jComboBoxTiposAccionesPosicionesBancarias = jComboBoxTiposAccionesPosicionesBancarias;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPosicionesBancarias() {
		return this.jComboBoxTiposAccionesFormularioPosicionesBancarias;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPosicionesBancarias(
			JComboBox jComboBoxTiposAccionesFormularioPosicionesBancarias) {
		this.jComboBoxTiposAccionesFormularioPosicionesBancarias = jComboBoxTiposAccionesFormularioPosicionesBancarias;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.posicionesbancariasSessionBean=new PosicionesBancariasSessionBean();
		
		this.posicionesbancariasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.posicionesbancariasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.posicionesbancariasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PosicionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PosicionesBancariasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PosicionesBancariasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Posiciones Bancarias MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
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
	
		PosicionesBancariasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePosicionesBancarias= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPosicionesBancarias=new JButtonMe();
				this.jButtonModificarToolBarPosicionesBancarias=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPosicionesBancarias,this.jTtoolBarDetallePosicionesBancarias,
							"actualizar","actualizar","Actualizar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPosicionesBancarias,this.jTtoolBarDetallePosicionesBancarias,
							"eliminar","eliminar","Eliminar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPosicionesBancarias,this.jTtoolBarDetallePosicionesBancarias,
							"cancelar","cancelar","Cancelar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPosicionesBancarias=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPosicionesBancarias,this.jTtoolBarDetallePosicionesBancarias,
							"guardarcambios","guardarcambios","Guardar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePosicionesBancarias=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePosicionesBancarias=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPosicionesBancarias=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPosicionesBancarias=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPosicionesBancarias=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPosicionesBancarias= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPosicionesBancarias.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPosicionesBancarias,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPosicionesBancarias= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPosicionesBancarias.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPosicionesBancarias,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPosicionesBancarias= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPosicionesBancarias.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPosicionesBancarias,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPosicionesBancarias= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPosicionesBancarias.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPosicionesBancarias,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPosicionesBancarias= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPosicionesBancarias.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPosicionesBancarias,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPosicionesBancarias= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPosicionesBancarias.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPosicionesBancarias,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPosicionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPosicionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPosicionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPosicionesBancarias= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPosicionesBancarias.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPosicionesBancarias,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPosicionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPosicionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPosicionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPosicionesBancarias= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPosicionesBancarias.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPosicionesBancarias,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPosicionesBancarias.add(this.jMenuItemDetalleCerrarPosicionesBancarias);
		
		this.jmenuDetalleAccionesPosicionesBancarias.add(this.jMenuItemActualizarPosicionesBancarias);
		this.jmenuDetalleAccionesPosicionesBancarias.add(this.jMenuItemEliminarPosicionesBancarias);
		this.jmenuDetalleAccionesPosicionesBancarias.add(this.jMenuItemCancelarPosicionesBancarias);		
		
		//this.jmenuDetalleDatosPosicionesBancarias.add(this.jMenuItemDetalleAbrirOrderByPosicionesBancarias);				
		this.jmenuDetalleDatosPosicionesBancarias.add(this.jMenuItemDetalleMostarOcultarPosicionesBancarias);				
				
		//this.jmenuDetalleAccionesPosicionesBancarias.add(this.jMenuItemGuardarCambiosPosicionesBancarias);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePosicionesBancarias.add(this.jmenuDetalleArchivoPosicionesBancarias);		
		this.jmenuBarDetallePosicionesBancarias.add(this.jmenuDetalleAccionesPosicionesBancarias);		
		this.jmenuBarDetallePosicionesBancarias.add(this.jmenuDetalleDatosPosicionesBancarias);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePosicionesBancarias);				
	}
	
	
	public void inicializarElementosCamposPosicionesBancarias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPosicionesBancarias = new JLabelMe();
		jLabelIdPosicionesBancarias.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPosicionesBancarias = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPosicionesBancarias= new GridBagLayout();

		this.jPanelidPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);

		jLabelidPosicionesBancarias = new JLabel();
		jLabelidPosicionesBancarias.setText("Id");

		jLabelidPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdePosicionesBancarias = new JLabelMe();
		this.jLabelfecha_desdePosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdePosicionesBancarias.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdePosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdePosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdePosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelfecha_desdePosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		//jFormattedTextFieldfecha_desdePosicionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_desdePosicionesBancarias= new JDateChooser();
		jDateChooserfecha_desdePosicionesBancarias.setEnabled(false);
		jDateChooserfecha_desdePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdePosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdePosicionesBancarias.setDate(new Date());
		jDateChooserfecha_desdePosicionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdePosicionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdePosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_desdePosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdePosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdePosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdePosicionesBancariasBusqueda.setText("U");
		this.jButtonfecha_desdePosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdePosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdePosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdePosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdePosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdePosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdePosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaPosicionesBancarias = new JLabelMe();
		this.jLabelfecha_hastaPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaPosicionesBancarias.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelfecha_hastaPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		//jFormattedTextFieldfecha_hastaPosicionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaPosicionesBancarias= new JDateChooser();
		jDateChooserfecha_hastaPosicionesBancarias.setEnabled(false);
		jDateChooserfecha_hastaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaPosicionesBancarias.setDate(new Date());
		jDateChooserfecha_hastaPosicionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaPosicionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_hastaPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaPosicionesBancariasBusqueda.setText("U");
		this.jButtonfecha_hastaPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelorden_desdePosicionesBancarias = new JLabelMe();
		this.jLabelorden_desdePosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE+" : *");
		this.jLabelorden_desdePosicionesBancarias.setToolTipText("Orden Desde");
		this.jLabelorden_desdePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_desdePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_desdePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorden_desdePosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorden_desdePosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorden_desdePosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_ORDENDESDE);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelorden_desdePosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextFieldorden_desdePosicionesBancarias= new JTextFieldMe();
		jTextFieldorden_desdePosicionesBancarias.setEnabled(false);
		jTextFieldorden_desdePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_desdePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_desdePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldorden_desdePosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldorden_desdePosicionesBancarias.setText("0");

		this.jButtonorden_desdePosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonorden_desdePosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_desdePosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_desdePosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorden_desdePosicionesBancariasBusqueda.setText("U");
		this.jButtonorden_desdePosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorden_desdePosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorden_desdePosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldorden_desdePosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldorden_desdePosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"orden_desdePosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorden_desdePosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelorden_hastaPosicionesBancarias = new JLabelMe();
		this.jLabelorden_hastaPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA+" : *");
		this.jLabelorden_hastaPosicionesBancarias.setToolTipText("Orden Hasta");
		this.jLabelorden_hastaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_hastaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_hastaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorden_hastaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorden_hastaPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorden_hastaPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_ORDENHASTA);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelorden_hastaPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextFieldorden_hastaPosicionesBancarias= new JTextFieldMe();
		jTextFieldorden_hastaPosicionesBancarias.setEnabled(false);
		jTextFieldorden_hastaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_hastaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_hastaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldorden_hastaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldorden_hastaPosicionesBancarias.setText("0");

		this.jButtonorden_hastaPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonorden_hastaPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_hastaPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_hastaPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorden_hastaPosicionesBancariasBusqueda.setText("U");
		this.jButtonorden_hastaPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorden_hastaPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorden_hastaPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldorden_hastaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldorden_hastaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"orden_hastaPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorden_hastaPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeltipo_documentoPosicionesBancarias = new JLabelMe();
		this.jLabeltipo_documentoPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO+" : *");
		this.jLabeltipo_documentoPosicionesBancarias.setToolTipText("Tipo Documento");
		this.jLabeltipo_documentoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_documentoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_documentoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_documentoPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_documentoPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_documentoPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_TIPODOCUMENTO);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPaneltipo_documentoPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextAreatipo_documentoPosicionesBancarias= new JTextAreaMe();
		jTextAreatipo_documentoPosicionesBancarias.setEnabled(false);
		jTextAreatipo_documentoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_documentoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_documentoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_documentoPosicionesBancarias.setLineWrap(true);
		jTextAreatipo_documentoPosicionesBancarias.setWrapStyleWord(true);
		jTextAreatipo_documentoPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_documentoPosicionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_documentoPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_documentoPosicionesBancarias = new JScrollPane(jTextAreatipo_documentoPosicionesBancarias);
		jscrollPanetipo_documentoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_documentoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_documentoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_documentoPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtontipo_documentoPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_documentoPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_documentoPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_documentoPosicionesBancariasBusqueda.setText("U");
		this.jButtontipo_documentoPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_documentoPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_documentoPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_documentoPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_documentoPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_documentoPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_documentoPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldetallePosicionesBancarias = new JLabelMe();
		this.jLabeldetallePosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetallePosicionesBancarias.setToolTipText("Detalle");
		this.jLabeldetallePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetallePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetallePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetallePosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetallePosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetallePosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPaneldetallePosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextAreadetallePosicionesBancarias= new JTextAreaMe();
		jTextAreadetallePosicionesBancarias.setEnabled(false);
		jTextAreadetallePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetallePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetallePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetallePosicionesBancarias.setLineWrap(true);
		jTextAreadetallePosicionesBancarias.setWrapStyleWord(true);
		jTextAreadetallePosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetallePosicionesBancarias.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetallePosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetallePosicionesBancarias = new JScrollPane(jTextAreadetallePosicionesBancarias);
		jscrollPanedetallePosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetallePosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetallePosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetallePosicionesBancariasBusqueda= new JButtonMe();
		this.jButtondetallePosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetallePosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetallePosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetallePosicionesBancariasBusqueda.setText("U");
		this.jButtondetallePosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetallePosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetallePosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetallePosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetallePosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detallePosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetallePosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuentaPosicionesBancarias = new JLabelMe();
		this.jLabelcodigo_cuentaPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA+" : *");
		this.jLabelcodigo_cuentaPosicionesBancarias.setToolTipText("Codigo Cuenta");
		this.jLabelcodigo_cuentaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuentaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuentaPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuentaPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_CODIGOCUENTA);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelcodigo_cuentaPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextFieldcodigo_cuentaPosicionesBancarias= new JTextFieldMe();

		jTextFieldcodigo_cuentaPosicionesBancarias.setEnabled(false);
		jTextFieldcodigo_cuentaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuentaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setText("U");
		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuentaPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuentaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuentaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuentaPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuentaPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuentaPosicionesBancarias = new JLabelMe();
		this.jLabelnombre_cuentaPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA+" : *");
		this.jLabelnombre_cuentaPosicionesBancarias.setToolTipText("Nombre Cuenta");
		this.jLabelnombre_cuentaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cuentaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cuentaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuentaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuentaPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuentaPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_NOMBRECUENTA);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelnombre_cuentaPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextAreanombre_cuentaPosicionesBancarias= new JTextAreaMe();
		jTextAreanombre_cuentaPosicionesBancarias.setEnabled(false);
		jTextAreanombre_cuentaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuentaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuentaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuentaPosicionesBancarias.setLineWrap(true);
		jTextAreanombre_cuentaPosicionesBancarias.setWrapStyleWord(true);
		jTextAreanombre_cuentaPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuentaPosicionesBancarias.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuentaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuentaPosicionesBancarias = new JScrollPane(jTextAreanombre_cuentaPosicionesBancarias);
		jscrollPanenombre_cuentaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuentaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuentaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuentaPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setText("U");
		this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuentaPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuentaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuentaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuentaPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuentaPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorPosicionesBancarias = new JLabelMe();
		this.jLabelnumero_mayorPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorPosicionesBancarias.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelnumero_mayorPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextAreanumero_mayorPosicionesBancarias= new JTextAreaMe();
		jTextAreanumero_mayorPosicionesBancarias.setEnabled(false);
		jTextAreanumero_mayorPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorPosicionesBancarias.setLineWrap(true);
		jTextAreanumero_mayorPosicionesBancarias.setWrapStyleWord(true);
		jTextAreanumero_mayorPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorPosicionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorPosicionesBancarias = new JScrollPane(jTextAreanumero_mayorPosicionesBancarias);
		jscrollPanenumero_mayorPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonnumero_mayorPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorPosicionesBancariasBusqueda.setText("U");
		this.jButtonnumero_mayorPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localPosicionesBancarias = new JLabelMe();
		this.jLabeldebito_localPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localPosicionesBancarias.setToolTipText("Debito Local");
		this.jLabeldebito_localPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPaneldebito_localPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextFielddebito_localPosicionesBancarias= new JTextFieldMe();
		jTextFielddebito_localPosicionesBancarias.setEnabled(false);
		jTextFielddebito_localPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localPosicionesBancarias.setText("0.0");

		this.jButtondebito_localPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtondebito_localPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localPosicionesBancariasBusqueda.setText("U");
		this.jButtondebito_localPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localPosicionesBancarias = new JLabelMe();
		this.jLabelcredito_localPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localPosicionesBancarias.setToolTipText("Credito Local");
		this.jLabelcredito_localPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelcredito_localPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextFieldcredito_localPosicionesBancarias= new JTextFieldMe();
		jTextFieldcredito_localPosicionesBancarias.setEnabled(false);
		jTextFieldcredito_localPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localPosicionesBancarias.setText("0.0");

		this.jButtoncredito_localPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtoncredito_localPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localPosicionesBancariasBusqueda.setText("U");
		this.jButtoncredito_localPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoPosicionesBancarias = new JLabelMe();
		this.jLabeltipo_movimientoPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoPosicionesBancarias.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPaneltipo_movimientoPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextAreatipo_movimientoPosicionesBancarias= new JTextAreaMe();
		jTextAreatipo_movimientoPosicionesBancarias.setEnabled(false);
		jTextAreatipo_movimientoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoPosicionesBancarias.setLineWrap(true);
		jTextAreatipo_movimientoPosicionesBancarias.setWrapStyleWord(true);
		jTextAreatipo_movimientoPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoPosicionesBancarias.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoPosicionesBancarias = new JScrollPane(jTextAreatipo_movimientoPosicionesBancarias);
		jscrollPanetipo_movimientoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtontipo_movimientoPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoPosicionesBancariasBusqueda.setText("U");
		this.jButtontipo_movimientoPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPosicionesBancarias = new JLabelMe();
		this.jLabelfecha_emisionPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPosicionesBancarias.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelfecha_emisionPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		//jFormattedTextFieldfecha_emisionPosicionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPosicionesBancarias= new JDateChooser();
		jDateChooserfecha_emisionPosicionesBancarias.setEnabled(false);
		jDateChooserfecha_emisionPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPosicionesBancarias.setDate(new Date());
		jDateChooserfecha_emisionPosicionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPosicionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPosicionesBancariasBusqueda.setText("U");
		this.jButtonfecha_emisionPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelfechaPosicionesBancarias = new JLabelMe();
		this.jLabelfechaPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPosicionesBancarias.setToolTipText("Fecha");
		this.jLabelfechaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelfechaPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		//jFormattedTextFieldfechaPosicionesBancarias= new JFormattedTextFieldMe();

		jDateChooserfechaPosicionesBancarias= new JDateChooser();
		jDateChooserfechaPosicionesBancarias.setEnabled(false);
		jDateChooserfechaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPosicionesBancarias.setDate(new Date());
		jDateChooserfechaPosicionesBancarias.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPosicionesBancarias.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonfechaPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPosicionesBancariasBusqueda.setText("U");
		this.jButtonfechaPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPosicionesBancariasBusqueda.setVisible(false);		}


					
		this.jLabelbeneficiarioPosicionesBancarias = new JLabelMe();
		this.jLabelbeneficiarioPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO+" : *");
		this.jLabelbeneficiarioPosicionesBancarias.setToolTipText("Beneficiario");
		this.jLabelbeneficiarioPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbeneficiarioPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbeneficiarioPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbeneficiarioPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbeneficiarioPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_BENEFICIARIO);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelbeneficiarioPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jTextAreabeneficiarioPosicionesBancarias= new JTextAreaMe();
		jTextAreabeneficiarioPosicionesBancarias.setEnabled(false);
		jTextAreabeneficiarioPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreabeneficiarioPosicionesBancarias.setLineWrap(true);
		jTextAreabeneficiarioPosicionesBancarias.setWrapStyleWord(true);
		jTextAreabeneficiarioPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreabeneficiarioPosicionesBancarias.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreabeneficiarioPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanebeneficiarioPosicionesBancarias = new JScrollPane(jTextAreabeneficiarioPosicionesBancarias);
		jscrollPanebeneficiarioPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanebeneficiarioPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonbeneficiarioPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonbeneficiarioPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbeneficiarioPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbeneficiarioPosicionesBancariasBusqueda.setText("U");
		this.jButtonbeneficiarioPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbeneficiarioPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbeneficiarioPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreabeneficiarioPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreabeneficiarioPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"beneficiarioPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbeneficiarioPosicionesBancariasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPosicionesBancarias() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPosicionesBancarias = new JLabelMe();
		this.jLabelid_empresaPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPosicionesBancarias.setToolTipText("Empresa");
		this.jLabelid_empresaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelid_empresaPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jComboBoxid_empresaPosicionesBancarias= new JComboBoxMe();
		jComboBoxid_empresaPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPosicionesBancarias.setEnabled(false);

		this.jButtonid_empresaPosicionesBancarias= new JButtonMe();
		this.jButtonid_empresaPosicionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPosicionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPosicionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPosicionesBancarias.setText("Buscar");
		this.jButtonid_empresaPosicionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPosicionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPosicionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPosicionesBancarias"));

		this.jButtonid_empresaPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_empresaPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPosicionesBancariasBusqueda.setText("U");
		this.jButtonid_empresaPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPosicionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_empresaPosicionesBancariasUpdate= new JButtonMe();
		this.jButtonid_empresaPosicionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPosicionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPosicionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPosicionesBancariasUpdate.setText("U");
		this.jButtonid_empresaPosicionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPosicionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPosicionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPosicionesBancariasUpdate"));



					
		this.jLabelid_ejercicioPosicionesBancarias = new JLabelMe();
		this.jLabelid_ejercicioPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioPosicionesBancarias.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelid_ejercicioPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jComboBoxid_ejercicioPosicionesBancarias= new JComboBoxMe();
		jComboBoxid_ejercicioPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioPosicionesBancarias.setEnabled(false);

		this.jButtonid_ejercicioPosicionesBancarias= new JButtonMe();
		this.jButtonid_ejercicioPosicionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPosicionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPosicionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioPosicionesBancarias.setText("Buscar");
		this.jButtonid_ejercicioPosicionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioPosicionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPosicionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPosicionesBancarias"));

		this.jButtonid_ejercicioPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPosicionesBancariasBusqueda.setText("U");
		this.jButtonid_ejercicioPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioPosicionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioPosicionesBancariasUpdate= new JButtonMe();
		this.jButtonid_ejercicioPosicionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPosicionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioPosicionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioPosicionesBancariasUpdate.setText("U");
		this.jButtonid_ejercicioPosicionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioPosicionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioPosicionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioPosicionesBancariasUpdate"));



					
		this.jLabelid_tipo_movimientoPosicionesBancarias = new JLabelMe();
		this.jLabelid_tipo_movimientoPosicionesBancarias.setText(""+PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoPosicionesBancarias.setToolTipText("Tipo Movimiento Base");
		this.jLabelid_tipo_movimientoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimientoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoPosicionesBancarias=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoPosicionesBancarias.setToolTipText(PosicionesBancariasConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		this.jPanelid_tipo_movimientoPosicionesBancarias.setLayout(this.gridaBagLayoutPosicionesBancarias);


		jComboBoxid_tipo_movimientoPosicionesBancarias= new JComboBoxMe();
		jComboBoxid_tipo_movimientoPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoPosicionesBancarias= new JButtonMe();
		this.jButtonid_tipo_movimientoPosicionesBancarias.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoPosicionesBancarias.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoPosicionesBancarias.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoPosicionesBancarias.setText("Buscar");
		this.jButtonid_tipo_movimientoPosicionesBancarias.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoPosicionesBancarias.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoPosicionesBancarias,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoPosicionesBancarias"));

		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setText("U");
		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoPosicionesBancariasBusqueda"));

		if(this.posicionesbancariasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoPosicionesBancariasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoPosicionesBancariasUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoPosicionesBancariasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPosicionesBancariasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoPosicionesBancariasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoPosicionesBancariasUpdate.setText("U");
		this.jButtonid_tipo_movimientoPosicionesBancariasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoPosicionesBancariasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoPosicionesBancariasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoPosicionesBancarias.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoPosicionesBancarias.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoPosicionesBancariasUpdate"));



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
		//this.jInternalFrameDetallePosicionesBancarias = new PosicionesBancariasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Posiciones Bancarias DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPosicionesBancarias= new GridBagLayout();
		

		
		String sToolTipPosicionesBancarias="";
		sToolTipPosicionesBancarias=PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPosicionesBancarias+="(Tesoreria.PosicionesBancarias)";
		}
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPosicionesBancarias+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPosicionesBancarias = new JButtonMe();
		this.jButtonModificarPosicionesBancarias = new JButtonMe();
        this.jButtonActualizarPosicionesBancarias = new JButtonMe();
        this.jButtonEliminarPosicionesBancarias = new JButtonMe();
        this.jButtonCancelarPosicionesBancarias = new JButtonMe();
        this.jButtonGuardarCambiosPosicionesBancarias = new JButtonMe();
		this.jButtonGuardarCambiosTablaPosicionesBancarias = new JButtonMe();
		this.jButtonCerrarPosicionesBancarias = new JButtonMe();
		
		this.jScrollPanelDatosPosicionesBancarias = new JScrollPane();   
        this.jScrollPanelDatosEdicionPosicionesBancarias = new JScrollPane();
		this.jScrollPanelDatosGeneralPosicionesBancarias = new JScrollPane();
				
		
		
		this.jPanelCamposPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Posiciones Bancarias";
		
		if(!this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Posiciones Bancariases" + this.sPath));
		} else {
			this.jScrollPanelDatosPosicionesBancarias.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPosicionesBancarias.setName("jPanelCamposPosicionesBancarias"); 

		this.jPanelCamposOcultosPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPosicionesBancarias.setName("jPanelCamposOcultosPosicionesBancarias"); 

        this.jPanelAccionesPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPosicionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesPosicionesBancarias.setName("Acciones"); 

		this.jPanelAccionesFormularioPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPosicionesBancarias.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPosicionesBancarias.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPosicionesBancarias.setText("Nuevo");
		this.jButtonModificarPosicionesBancarias.setText("Editar");
        this.jButtonActualizarPosicionesBancarias.setText("Actualizar");
        this.jButtonEliminarPosicionesBancarias.setText("Eliminar");
        this.jButtonCancelarPosicionesBancarias.setText("Cancelar");
        this.jButtonGuardarCambiosPosicionesBancarias.setText("Guardar");
		this.jButtonGuardarCambiosTablaPosicionesBancarias.setText("Guardar");
		this.jButtonCerrarPosicionesBancarias.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPosicionesBancarias,"nuevo_button","Nuevo",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPosicionesBancarias,"modificar_button","Editar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPosicionesBancarias,"actualizar_button","Actualizar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPosicionesBancarias,"eliminar_button","Eliminar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPosicionesBancarias,"cancelar_button","Cancelar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPosicionesBancarias,"guardarcambios_button","Guardar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPosicionesBancarias,"guardarcambiostabla_button","Guardar",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPosicionesBancarias,"cerrar_button","Salir",this.posicionesbancariasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPosicionesBancarias.setToolTipText("Nuevo"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPosicionesBancarias.setToolTipText("Editar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPosicionesBancarias.setToolTipText("Actualizar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPosicionesBancarias.setToolTipText("Eliminar)"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPosicionesBancarias.setToolTipText("Cancelar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPosicionesBancarias.setToolTipText("Guardar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPosicionesBancarias.setToolTipText("Guardar"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPosicionesBancarias.setToolTipText("Salir"+" "+PosicionesBancariasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPosicionesBancarias";
		inputMap = this.jButtonNuevoPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPosicionesBancarias.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPosicionesBancarias"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPosicionesBancarias";
		inputMap = this.jButtonActualizarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPosicionesBancarias"));
		
		//ELIMINAR
		sMapKey = "EliminarPosicionesBancarias";
		inputMap = this.jButtonEliminarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPosicionesBancarias"));
		
		//CANCELAR	
		sMapKey = "CancelarPosicionesBancarias";
		inputMap = this.jButtonCancelarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPosicionesBancarias"));
		
		//CERRAR		
		sMapKey = "CerrarPosicionesBancarias";
		inputMap = this.jButtonCerrarPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPosicionesBancarias"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPosicionesBancarias";
		inputMap = this.jButtonGuardarCambiosTablaPosicionesBancarias.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPosicionesBancarias.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPosicionesBancarias"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPosicionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPosicionesBancarias.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPosicionesBancarias.setToolTipText("Nuevo PosicionesBancarias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPosicionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPosicionesBancarias.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPosicionesBancarias.setToolTipText("Sin Cerrar Ventana PosicionesBancarias");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePosicionesBancarias = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePosicionesBancarias.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePosicionesBancarias.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPosicionesBancarias.setText("Accion");
		this.jComboBoxTiposAccionesPosicionesBancarias.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPosicionesBancarias = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPosicionesBancarias.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPosicionesBancarias.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPosicionesBancarias = new JLabelMe();
		
		this.jLabelAccionesPosicionesBancarias.setText("Acciones");		
		this.jLabelAccionesPosicionesBancarias.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPosicionesBancarias.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPosicionesBancarias.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPosicionesBancarias();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPosicionesBancarias();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPosicionesBancarias=new JTabbedPane();
		this.jTabbedPaneRelacionesPosicionesBancarias.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPosicionesBancarias,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPosicionesBancarias.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPosicionesBancarias.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPosicionesBancarias.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPosicionesBancarias.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPosicionesBancarias.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPosicionesBancarias.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPosicionesBancarias, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPosicionesBancarias = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPosicionesBancarias = new GridBagLayout();
		
		this.jPanelCamposPosicionesBancarias.setLayout(gridaBagLayoutCamposPosicionesBancarias);
		this.jPanelCamposOcultosPosicionesBancarias.setLayout(gridaBagLayoutCamposOcultosPosicionesBancarias);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPosicionesBancarias.add(jLabelIdPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPosicionesBancarias.add(jLabelidPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPosicionesBancarias.add(jLabelid_empresaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPosicionesBancarias.add(jButtonid_empresaPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 3;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPosicionesBancarias.add(jButtonid_empresaPosicionesBancariasUpdate, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPosicionesBancarias.add(jComboBoxid_empresaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioPosicionesBancarias.add(jLabelid_ejercicioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPosicionesBancarias.add(jButtonid_ejercicioPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 3;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioPosicionesBancarias.add(jButtonid_ejercicioPosicionesBancariasUpdate, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioPosicionesBancarias.add(jComboBoxid_ejercicioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoPosicionesBancarias.add(jLabelid_tipo_movimientoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoPosicionesBancarias.add(jButtonid_tipo_movimientoPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 3;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoPosicionesBancarias.add(jButtonid_tipo_movimientoPosicionesBancariasUpdate, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoPosicionesBancarias.add(jComboBoxid_tipo_movimientoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdePosicionesBancarias.add(jLabelfecha_desdePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdePosicionesBancarias.add(jButtonfecha_desdePosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdePosicionesBancarias.add(jDateChooserfecha_desdePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaPosicionesBancarias.add(jLabelfecha_hastaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaPosicionesBancarias.add(jButtonfecha_hastaPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaPosicionesBancarias.add(jDateChooserfecha_hastaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorden_desdePosicionesBancarias.add(jLabelorden_desdePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelorden_desdePosicionesBancarias.add(jButtonorden_desdePosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorden_desdePosicionesBancarias.add(jTextFieldorden_desdePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorden_hastaPosicionesBancarias.add(jLabelorden_hastaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelorden_hastaPosicionesBancarias.add(jButtonorden_hastaPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorden_hastaPosicionesBancarias.add(jTextFieldorden_hastaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_documentoPosicionesBancarias.add(jLabeltipo_documentoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_documentoPosicionesBancarias.add(jButtontipo_documentoPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_documentoPosicionesBancarias.add(jscrollPanetipo_documentoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetallePosicionesBancarias.add(jLabeldetallePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetallePosicionesBancarias.add(jButtondetallePosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetallePosicionesBancarias.add(jscrollPanedetallePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuentaPosicionesBancarias.add(jLabelcodigo_cuentaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuentaPosicionesBancarias.add(jButtoncodigo_cuentaPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuentaPosicionesBancarias.add(jTextFieldcodigo_cuentaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuentaPosicionesBancarias.add(jLabelnombre_cuentaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuentaPosicionesBancarias.add(jButtonnombre_cuentaPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuentaPosicionesBancarias.add(jscrollPanenombre_cuentaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorPosicionesBancarias.add(jLabelnumero_mayorPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorPosicionesBancarias.add(jButtonnumero_mayorPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorPosicionesBancarias.add(jscrollPanenumero_mayorPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localPosicionesBancarias.add(jLabeldebito_localPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localPosicionesBancarias.add(jButtondebito_localPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localPosicionesBancarias.add(jTextFielddebito_localPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localPosicionesBancarias.add(jLabelcredito_localPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localPosicionesBancarias.add(jButtoncredito_localPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localPosicionesBancarias.add(jTextFieldcredito_localPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoPosicionesBancarias.add(jLabeltipo_movimientoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoPosicionesBancarias.add(jButtontipo_movimientoPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoPosicionesBancarias.add(jscrollPanetipo_movimientoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPosicionesBancarias.add(jLabelfecha_emisionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPosicionesBancarias.add(jButtonfecha_emisionPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPosicionesBancarias.add(jDateChooserfecha_emisionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPosicionesBancarias.add(jLabelfechaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPosicionesBancarias.add(jButtonfechaPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPosicionesBancarias.add(jDateChooserfechaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbeneficiarioPosicionesBancarias.add(jLabelbeneficiarioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		//this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = 2;
		this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
		this.gridBagConstraintsPosicionesBancarias.insets = new Insets(0, 0, 0, 0);
		this.jPanelbeneficiarioPosicionesBancarias.add(jButtonbeneficiarioPosicionesBancariasBusqueda, this.gridBagConstraintsPosicionesBancarias);
	}

	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPosicionesBancarias.gridy = 0;
	this.gridBagConstraintsPosicionesBancarias.gridx = 1;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbeneficiarioPosicionesBancarias.add(jscrollPanebeneficiarioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelidPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelid_tipo_movimientoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelfecha_desdePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelfecha_hastaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelorden_desdePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelorden_hastaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPaneltipo_documentoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPaneldetallePosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelcodigo_cuentaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelnombre_cuentaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelnumero_mayorPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPaneldebito_localPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelcredito_localPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPaneltipo_movimientoPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelfecha_emisionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelfechaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPosicionesBancarias.add(this.jPanelbeneficiarioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposPosicionesBancarias % 2==0) {
		iXPanelCamposPosicionesBancarias=0;
		iYPanelCamposPosicionesBancarias++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposOcultosPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposOcultosPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPosicionesBancarias.add(this.jPanelid_empresaPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposOcultosPosicionesBancarias % 2==0) {
		iXPanelCamposOcultosPosicionesBancarias=0;
		iYPanelCamposOcultosPosicionesBancarias++;
	}
	this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPosicionesBancarias.gridy = iYPanelCamposOcultosPosicionesBancarias;
	this.gridBagConstraintsPosicionesBancarias.gridx = iXPanelCamposOcultosPosicionesBancarias++;
	this.gridBagConstraintsPosicionesBancarias.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPosicionesBancarias.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPosicionesBancarias.add(this.jPanelid_ejercicioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);



	if(iXPanelCamposOcultosPosicionesBancarias % 2==0) {
		iXPanelCamposOcultosPosicionesBancarias=0;
		iYPanelCamposOcultosPosicionesBancarias++;
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
			
		GridBagLayout gridaBagLayoutAccionesPosicionesBancarias= new GridBagLayout();
		this.jPanelAccionesPosicionesBancarias.setLayout(gridaBagLayoutAccionesPosicionesBancarias);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPosicionesBancarias= new GridBagLayout();
		this.jPanelAccionesFormularioPosicionesBancarias.setLayout(gridaBagLayoutAccionesFormularioPosicionesBancarias);
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPosicionesBancarias.add(this.jComboBoxTiposAccionesFormularioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccion++;
			
		this.jPanelAccionesPosicionesBancarias.add(this.jButtonModificarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);							

		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;
		this.gridBagConstraintsPosicionesBancarias.gridx =iPosXAccion++;
			
		this.jPanelAccionesPosicionesBancarias.add(this.jButtonEliminarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccion++;
		
		this.jPanelAccionesPosicionesBancarias.add(this.jButtonActualizarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);


		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;		
		this.gridBagConstraintsPosicionesBancarias.gridx = iPosXAccion++;
		
		this.jPanelAccionesPosicionesBancarias.add(this.jButtonGuardarCambiosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);	
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = 0;		
		this.gridBagConstraintsPosicionesBancarias.gridx =iPosXAccion++;
		
		this.jPanelAccionesPosicionesBancarias.add(this.jButtonCancelarPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPosicionesBancarias = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPosicionesBancarias);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.posicionesbancariasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();						
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;		
			//this.gridBagConstraintsPosicionesBancarias.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPosicionesBancarias.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPosicionesBancarias.gridx =0;
		this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPosicionesBancarias.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PosicionesBancariasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePosicionesBancarias = new PosicionesBancariasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Posiciones Bancarias DATOS");
			
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
			
	        //this.setTitle("[FOR] - Posiciones Bancarias DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Posiciones Bancarias Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PosicionesBancariasModel posicionesbancariasModel=new PosicionesBancariasModel(this);
			
			//SI USARA CLASE INTERNA
			//PosicionesBancariasModel.PosicionesBancariasFocusTraversalPolicy posicionesbancariasFocusTraversalPolicy = posicionesbancariasModel.new PosicionesBancariasFocusTraversalPolicy(this);
			
			//posicionesbancariasFocusTraversalPolicy.setposicionesbancariasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(posicionesbancariasModel);
			
			
			this.jContentPaneDetallePosicionesBancarias = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePosicionesBancarias = new GridBagLayout();	
			this.jContentPaneDetallePosicionesBancarias.setLayout(gridaBagLayoutDetallePosicionesBancarias);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPosicionesBancarias = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
				this.gridBagConstraintsPosicionesBancarias.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPosicionesBancarias.gridx = 0;
					
				
				this.jContentPaneDetallePosicionesBancarias.add(jTtoolBarDetallePosicionesBancarias, gridBagConstraintsPosicionesBancarias);								
				
}
			
			this.jScrollPanelDatosEdicionPosicionesBancarias=   new JScrollPane(jContentPaneDetallePosicionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPosicionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPosicionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPosicionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPosicionesBancarias=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPosicionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPosicionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPosicionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPosicionesBancarias.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	        
			this.jContentPaneDetallePosicionesBancarias.add(jPanelCamposPosicionesBancarias, gridBagConstraintsPosicionesBancarias);
			
			
			
			
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
						//&& posicionesbancariasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.posicionesbancariasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPosicionesBancarias= new GridBagConstraints();
						this.gridBagConstraintsPosicionesBancarias.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPosicionesBancarias.gridx = 0;
						this.jContentPaneDetallePosicionesBancarias.add(this.jTabbedPaneRelacionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPosicionesBancarias.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPosicionesBancarias.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
					this.gridBagConstraintsPosicionesBancarias.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPosicionesBancarias.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPosicionesBancarias.gridx = 0;
					
				
					this.jContentPaneDetallePosicionesBancarias.add(jPanelCamposOcultosPosicionesBancarias, gridBagConstraintsPosicionesBancarias);
				
					this.jPanelCamposOcultosPosicionesBancarias.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	        this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePosicionesBancarias.add(this.jPanelAccionesFormularioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);							
			
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
	        this.gridBagConstraintsPosicionesBancarias.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPosicionesBancarias.gridx = 0;
	        
			
			this.jContentPaneDetallePosicionesBancarias.add(this.jPanelAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPosicionesBancarias);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPosicionesBancarias=   new JScrollPane(this.jPanelCamposPosicionesBancarias,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPosicionesBancarias.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPosicionesBancarias.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPosicionesBancarias.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;
			this.gridBagConstraintsPosicionesBancarias.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPosicionesBancarias.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPosicionesBancarias.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);			
			
			this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
			this.gridBagConstraintsPosicionesBancarias.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPosicionesBancarias.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
			
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		
			
		this.gridBagConstraintsPosicionesBancarias = new GridBagConstraints();
		this.gridBagConstraintsPosicionesBancarias.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPosicionesBancarias.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPosicionesBancarias, this.gridBagConstraintsPosicionesBancarias);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPosicionesBancarias;//jContentPane;
		
		return jScrollPanelDatosEdicionPosicionesBancarias;
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
