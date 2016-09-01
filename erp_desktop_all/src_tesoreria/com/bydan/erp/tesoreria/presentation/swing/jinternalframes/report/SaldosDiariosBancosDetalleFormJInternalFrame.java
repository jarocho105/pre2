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
import com.bydan.erp.tesoreria.util.report.SaldosDiariosBancosConstantesFunciones;

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
public class SaldosDiariosBancosDetalleFormJInternalFrame extends SaldosDiariosBancosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSaldosDiariosBancos;
	
	protected JMenuBar jmenuBarDetalleSaldosDiariosBancos;
	
	protected JMenu jmenuDetalleSaldosDiariosBancos;
	protected JMenu jmenuDetalleArchivoSaldosDiariosBancos;
	protected JMenu jmenuDetalleAccionesSaldosDiariosBancos;
	protected JMenu jmenuDetalleDatosSaldosDiariosBancos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldosDiariosBancos;	
	protected GridBagConstraints gridBagConstraintsSaldosDiariosBancos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SaldosDiariosBancosBeanSwingJInternalFrameAdditional jInternalFrameDetalleSaldosDiariosBancos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public SaldosDiariosBancosSessionBean saldosdiariosbancosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public SaldosDiariosBancosLogic saldosdiariosbancosLogic;
	
	public JScrollPane jScrollPanelDatosSaldosDiariosBancos;
	public JScrollPane jScrollPanelDatosEdicionSaldosDiariosBancos;
	public JScrollPane jScrollPanelDatosGeneralSaldosDiariosBancos;
	
	protected JPanel jPanelCamposSaldosDiariosBancos;    
	protected JPanel jPanelCamposOcultosSaldosDiariosBancos;    	
	protected JPanel jPanelAccionesSaldosDiariosBancos;
	protected JPanel jPanelAccionesFormularioSaldosDiariosBancos;
    
	
	
	protected Integer iXPanelCamposSaldosDiariosBancos=0;
	protected Integer iYPanelCamposSaldosDiariosBancos=0;
	
	protected Integer iXPanelCamposOcultosSaldosDiariosBancos=0;
	protected Integer iYPanelCamposOcultosSaldosDiariosBancos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSaldosDiariosBancos;
	public JButton jButtonModificarSaldosDiariosBancos;
	public JButton jButtonActualizarSaldosDiariosBancos;
    public JButton jButtonEliminarSaldosDiariosBancos;
	public JButton jButtonCancelarSaldosDiariosBancos;
    public JButton jButtonGuardarCambiosSaldosDiariosBancos;
	public JButton jButtonGuardarCambiosTablaSaldosDiariosBancos;
	protected JButton jButtonCerrarSaldosDiariosBancos;
	
	
	protected JButton jButtonProcesarInformacionSaldosDiariosBancos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSaldosDiariosBancos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSaldosDiariosBancos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSaldosDiariosBancos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldosDiariosBancos;
	protected JButton jButtonModificarToolBarSaldosDiariosBancos;
	protected JButton jButtonActualizarToolBarSaldosDiariosBancos;
    protected JButton jButtonEliminarToolBarSaldosDiariosBancos;
	protected JButton jButtonCancelarToolBarSaldosDiariosBancos;
    protected JButton jButtonGuardarCambiosToolBarSaldosDiariosBancos;
	protected JButton jButtonGuardarCambiosTablaToolBarSaldosDiariosBancos;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldosDiariosBancos;
	protected JButton jButtonCerrarToolBarSaldosDiariosBancos;
	
	protected JButton jButtonProcesarInformacionToolBarSaldosDiariosBancos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldosDiariosBancos;
	protected JMenuItem jMenuItemModificarSaldosDiariosBancos;
	protected JMenuItem jMenuItemActualizarSaldosDiariosBancos;
    protected JMenuItem jMenuItemEliminarSaldosDiariosBancos;
	protected JMenuItem jMenuItemCancelarSaldosDiariosBancos;
    protected JMenuItem jMenuItemGuardarCambiosSaldosDiariosBancos;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldosDiariosBancos;
	protected JMenuItem jMenuItemCerrarSaldosDiariosBancos;
	protected JMenuItem jMenuItemDetalleCerrarSaldosDiariosBancos;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldosDiariosBancos;
	
	protected JMenuItem jMenuItemProcesarInformacionSaldosDiariosBancos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldosDiariosBancos;
	protected JMenuItem jMenuItemMostrarOcultarSaldosDiariosBancos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldosDiariosBancos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldosDiariosBancos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSaldosDiariosBancos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSaldosDiariosBancos;
	public JLabel jLabelIdSaldosDiariosBancos;
	public JLabel jLabelidSaldosDiariosBancos;
	public JButton jButtonidSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeSaldosDiariosBancos;
	public JLabel jLabelfecha_desdeSaldosDiariosBancos;
	//public JFormattedTextField jDateChooserfecha_desdeSaldosDiariosBancos;

	public JDateChooser jDateChooserfecha_desdeSaldosDiariosBancos;
	public JButton jButtonfecha_desdeSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaSaldosDiariosBancos;
	public JLabel jLabelfecha_hastaSaldosDiariosBancos;
	//public JFormattedTextField jDateChooserfecha_hastaSaldosDiariosBancos;

	public JDateChooser jDateChooserfecha_hastaSaldosDiariosBancos;
	public JButton jButtonfecha_hastaSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuentaSaldosDiariosBancos;
	public JLabel jLabelcodigo_cuentaSaldosDiariosBancos;
	public JTextField jTextFieldcodigo_cuentaSaldosDiariosBancos;
	public JButton jButtoncodigo_cuentaSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoSaldosDiariosBancos;
	public JLabel jLabelnombre_bancoSaldosDiariosBancos;
	public JTextArea jTextAreanombre_bancoSaldosDiariosBancos;
	public JScrollPane jscrollPanenombre_bancoSaldosDiariosBancos;
	public JButton jButtonnombre_bancoSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaSaldosDiariosBancos;
	public JLabel jLabelnumero_cuentaSaldosDiariosBancos;
	public JTextField jTextFieldnumero_cuentaSaldosDiariosBancos;
	public JButton jButtonnumero_cuentaSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_monedaSaldosDiariosBancos;
	public JLabel jLabelnombre_monedaSaldosDiariosBancos;
	public JTextField jTextFieldnombre_monedaSaldosDiariosBancos;
	public JButton jButtonnombre_monedaSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_anteriorSaldosDiariosBancos;
	public JLabel jLabelsaldo_anteriorSaldosDiariosBancos;
	public JTextField jTextFieldsaldo_anteriorSaldosDiariosBancos;
	public JButton jButtonsaldo_anteriorSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPaneldepositoSaldosDiariosBancos;
	public JLabel jLabeldepositoSaldosDiariosBancos;
	public JTextField jTextFielddepositoSaldosDiariosBancos;
	public JButton jButtondepositoSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelncSaldosDiariosBancos;
	public JLabel jLabelncSaldosDiariosBancos;
	public JTextField jTextFieldncSaldosDiariosBancos;
	public JButton jButtonncSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelch_giradosSaldosDiariosBancos;
	public JLabel jLabelch_giradosSaldosDiariosBancos;
	public JTextField jTextFieldch_giradosSaldosDiariosBancos;
	public JButton jButtonch_giradosSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelndSaldosDiariosBancos;
	public JLabel jLabelndSaldosDiariosBancos;
	public JTextField jTextFieldndSaldosDiariosBancos;
	public JButton jButtonndSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelprocedenciaSaldosDiariosBancos;
	public JLabel jLabelprocedenciaSaldosDiariosBancos;
	public JTextArea jTextAreaprocedenciaSaldosDiariosBancos;
	public JScrollPane jscrollPaneprocedenciaSaldosDiariosBancos;
	public JButton jButtonprocedenciaSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPaneldestinoSaldosDiariosBancos;
	public JLabel jLabeldestinoSaldosDiariosBancos;
	public JTextArea jTextAreadestinoSaldosDiariosBancos;
	public JScrollPane jscrollPanedestinoSaldosDiariosBancos;
	public JButton jButtondestinoSaldosDiariosBancosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSaldosDiariosBancos;
	public JLabel jLabelid_empresaSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSaldosDiariosBancos;
	public JButton jButtonid_empresaSaldosDiariosBancos= new JButtonMe();
	public JButton jButtonid_empresaSaldosDiariosBancosUpdate= new JButtonMe();
	public JButton jButtonid_empresaSaldosDiariosBancosBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioSaldosDiariosBancos;
	public JLabel jLabelid_ejercicioSaldosDiariosBancos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioSaldosDiariosBancos;
	public JButton jButtonid_ejercicioSaldosDiariosBancos= new JButtonMe();
	public JButton jButtonid_ejercicioSaldosDiariosBancosUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioSaldosDiariosBancosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSaldosDiariosBancos;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SaldosDiariosBancosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSaldosDiariosBancos=new JPanel();
				this.jPanelAccionesFormularioSaldosDiariosBancos=new JPanel();
				this.jmenuBarDetalleSaldosDiariosBancos=new JMenuBar();
				this.jTtoolBarDetalleSaldosDiariosBancos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SaldosDiariosBancosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosDiariosBancosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldosDiariosBancos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSaldosDiariosBancos() {
		return this.jButtonActualizarToolBarSaldosDiariosBancos;
	}
	
	public JButton getjButtonEliminarToolBarSaldosDiariosBancos() {
		return this.jButtonEliminarToolBarSaldosDiariosBancos;
	}
	
	public JButton getjButtonCancelarToolBarSaldosDiariosBancos() {
		return this.jButtonCancelarToolBarSaldosDiariosBancos;
	}		
	
	public JButton getjButtonProcesarInformacionSaldosDiariosBancos() {
		return this.jButtonProcesarInformacionSaldosDiariosBancos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldosDiariosBancos)	{
		this.jButtonProcesarInformacionSaldosDiariosBancos = jButtonProcesarInformacionSaldosDiariosBancos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldosDiariosBancos() {
		return this.jComboBoxTiposAccionesSaldosDiariosBancos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldosDiariosBancos(
			JComboBox jComboBoxTiposRelacionesSaldosDiariosBancos) {
		this.jComboBoxTiposRelacionesSaldosDiariosBancos = jComboBoxTiposRelacionesSaldosDiariosBancos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldosDiariosBancos(
			JComboBox jComboBoxTiposAccionesSaldosDiariosBancos) {
		this.jComboBoxTiposAccionesSaldosDiariosBancos = jComboBoxTiposAccionesSaldosDiariosBancos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSaldosDiariosBancos() {
		return this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSaldosDiariosBancos(
			JComboBox jComboBoxTiposAccionesFormularioSaldosDiariosBancos) {
		this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos = jComboBoxTiposAccionesFormularioSaldosDiariosBancos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.saldosdiariosbancosSessionBean=new SaldosDiariosBancosSessionBean();
		
		this.saldosdiariosbancosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldosdiariosbancosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldosDiariosBancosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldosDiariosBancosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldosDiariosBancosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldos Diarios Bancos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
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
	
		SaldosDiariosBancosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSaldosDiariosBancos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSaldosDiariosBancos=new JButtonMe();
				this.jButtonModificarToolBarSaldosDiariosBancos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSaldosDiariosBancos,this.jTtoolBarDetalleSaldosDiariosBancos,
							"actualizar","actualizar","Actualizar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSaldosDiariosBancos,this.jTtoolBarDetalleSaldosDiariosBancos,
							"eliminar","eliminar","Eliminar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSaldosDiariosBancos,this.jTtoolBarDetalleSaldosDiariosBancos,
							"cancelar","cancelar","Cancelar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSaldosDiariosBancos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSaldosDiariosBancos,this.jTtoolBarDetalleSaldosDiariosBancos,
							"guardarcambios","guardarcambios","Guardar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSaldosDiariosBancos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSaldosDiariosBancos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSaldosDiariosBancos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSaldosDiariosBancos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSaldosDiariosBancos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldosDiariosBancos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldosDiariosBancos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldosDiariosBancos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSaldosDiariosBancos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSaldosDiariosBancos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSaldosDiariosBancos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSaldosDiariosBancos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSaldosDiariosBancos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSaldosDiariosBancos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSaldosDiariosBancos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSaldosDiariosBancos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSaldosDiariosBancos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSaldosDiariosBancos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSaldosDiariosBancos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSaldosDiariosBancos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSaldosDiariosBancos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldosDiariosBancos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldosDiariosBancos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldosDiariosBancos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldosDiariosBancos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldosDiariosBancos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSaldosDiariosBancos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSaldosDiariosBancos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSaldosDiariosBancos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldosDiariosBancos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldosDiariosBancos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldosDiariosBancos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSaldosDiariosBancos.add(this.jMenuItemDetalleCerrarSaldosDiariosBancos);
		
		this.jmenuDetalleAccionesSaldosDiariosBancos.add(this.jMenuItemActualizarSaldosDiariosBancos);
		this.jmenuDetalleAccionesSaldosDiariosBancos.add(this.jMenuItemEliminarSaldosDiariosBancos);
		this.jmenuDetalleAccionesSaldosDiariosBancos.add(this.jMenuItemCancelarSaldosDiariosBancos);		
		
		//this.jmenuDetalleDatosSaldosDiariosBancos.add(this.jMenuItemDetalleAbrirOrderBySaldosDiariosBancos);				
		this.jmenuDetalleDatosSaldosDiariosBancos.add(this.jMenuItemDetalleMostarOcultarSaldosDiariosBancos);				
				
		//this.jmenuDetalleAccionesSaldosDiariosBancos.add(this.jMenuItemGuardarCambiosSaldosDiariosBancos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSaldosDiariosBancos.add(this.jmenuDetalleArchivoSaldosDiariosBancos);		
		this.jmenuBarDetalleSaldosDiariosBancos.add(this.jmenuDetalleAccionesSaldosDiariosBancos);		
		this.jmenuBarDetalleSaldosDiariosBancos.add(this.jmenuDetalleDatosSaldosDiariosBancos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSaldosDiariosBancos);				
	}
	
	
	public void inicializarElementosCamposSaldosDiariosBancos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSaldosDiariosBancos = new JLabelMe();
		jLabelIdSaldosDiariosBancos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSaldosDiariosBancos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSaldosDiariosBancos= new GridBagLayout();

		this.jPanelidSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);

		jLabelidSaldosDiariosBancos = new JLabel();
		jLabelidSaldosDiariosBancos.setText("Id");

		jLabelidSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeSaldosDiariosBancos = new JLabelMe();
		this.jLabelfecha_desdeSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeSaldosDiariosBancos.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelfecha_desdeSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		//jFormattedTextFieldfecha_desdeSaldosDiariosBancos= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeSaldosDiariosBancos= new JDateChooser();
		jDateChooserfecha_desdeSaldosDiariosBancos.setEnabled(false);
		jDateChooserfecha_desdeSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeSaldosDiariosBancos.setDate(new Date());
		jDateChooserfecha_desdeSaldosDiariosBancos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeSaldosDiariosBancos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaSaldosDiariosBancos = new JLabelMe();
		this.jLabelfecha_hastaSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaSaldosDiariosBancos.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelfecha_hastaSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		//jFormattedTextFieldfecha_hastaSaldosDiariosBancos= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaSaldosDiariosBancos= new JDateChooser();
		jDateChooserfecha_hastaSaldosDiariosBancos.setEnabled(false);
		jDateChooserfecha_hastaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaSaldosDiariosBancos.setDate(new Date());
		jDateChooserfecha_hastaSaldosDiariosBancos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaSaldosDiariosBancos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuentaSaldosDiariosBancos = new JLabelMe();
		this.jLabelcodigo_cuentaSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA+" : *");
		this.jLabelcodigo_cuentaSaldosDiariosBancos.setToolTipText("Codigo Cuenta");
		this.jLabelcodigo_cuentaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_cuentaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuentaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuentaSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuentaSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_CODIGOCUENTA);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelcodigo_cuentaSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldcodigo_cuentaSaldosDiariosBancos= new JTextFieldMe();

		jTextFieldcodigo_cuentaSaldosDiariosBancos.setEnabled(false);
		jTextFieldcodigo_cuentaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuentaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuentaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setText("U");
		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuentaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuentaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuentaSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuentaSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bancoSaldosDiariosBancos = new JLabelMe();
		this.jLabelnombre_bancoSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoSaldosDiariosBancos.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelnombre_bancoSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextAreanombre_bancoSaldosDiariosBancos= new JTextAreaMe();
		jTextAreanombre_bancoSaldosDiariosBancos.setEnabled(false);
		jTextAreanombre_bancoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoSaldosDiariosBancos.setLineWrap(true);
		jTextAreanombre_bancoSaldosDiariosBancos.setWrapStyleWord(true);
		jTextAreanombre_bancoSaldosDiariosBancos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoSaldosDiariosBancos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoSaldosDiariosBancos = new JScrollPane(jTextAreanombre_bancoSaldosDiariosBancos);
		jscrollPanenombre_bancoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaSaldosDiariosBancos = new JLabelMe();
		this.jLabelnumero_cuentaSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaSaldosDiariosBancos.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelnumero_cuentaSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldnumero_cuentaSaldosDiariosBancos= new JTextFieldMe();

		jTextFieldnumero_cuentaSaldosDiariosBancos.setEnabled(false);
		jTextFieldnumero_cuentaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_monedaSaldosDiariosBancos = new JLabelMe();
		this.jLabelnombre_monedaSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA+" : *");
		this.jLabelnombre_monedaSaldosDiariosBancos.setToolTipText("Nombre Moneda");
		this.jLabelnombre_monedaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_monedaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_monedaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_monedaSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_monedaSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_NOMBREMONEDA);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelnombre_monedaSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldnombre_monedaSaldosDiariosBancos= new JTextFieldMe();

		jTextFieldnombre_monedaSaldosDiariosBancos.setEnabled(false);
		jTextFieldnombre_monedaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_monedaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_monedaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_monedaSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_monedaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_monedaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_monedaSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_monedaSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_anteriorSaldosDiariosBancos = new JLabelMe();
		this.jLabelsaldo_anteriorSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR+" : *");
		this.jLabelsaldo_anteriorSaldosDiariosBancos.setToolTipText("Saldo Anterior");
		this.jLabelsaldo_anteriorSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_anteriorSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_anteriorSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_anteriorSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_anteriorSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_anteriorSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_SALDOANTERIOR);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelsaldo_anteriorSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldsaldo_anteriorSaldosDiariosBancos= new JTextFieldMe();
		jTextFieldsaldo_anteriorSaldosDiariosBancos.setEnabled(false);
		jTextFieldsaldo_anteriorSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_anteriorSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_anteriorSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_anteriorSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_anteriorSaldosDiariosBancos.setText("0.0");

		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_anteriorSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_anteriorSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_anteriorSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_anteriorSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabeldepositoSaldosDiariosBancos = new JLabelMe();
		this.jLabeldepositoSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO+" : *");
		this.jLabeldepositoSaldosDiariosBancos.setToolTipText("Deposito");
		this.jLabeldepositoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldepositoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldepositoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldepositoSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldepositoSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldepositoSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_DEPOSITO);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPaneldepositoSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFielddepositoSaldosDiariosBancos= new JTextFieldMe();
		jTextFielddepositoSaldosDiariosBancos.setEnabled(false);
		jTextFielddepositoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepositoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddepositoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddepositoSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddepositoSaldosDiariosBancos.setText("0.0");

		this.jButtondepositoSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtondepositoSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepositoSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondepositoSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondepositoSaldosDiariosBancosBusqueda.setText("U");
		this.jButtondepositoSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondepositoSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondepositoSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddepositoSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddepositoSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"depositoSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondepositoSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelncSaldosDiariosBancos = new JLabelMe();
		this.jLabelncSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_NC+" : *");
		this.jLabelncSaldosDiariosBancos.setToolTipText("Nc");
		this.jLabelncSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelncSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelncSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelncSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelncSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelncSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_NC);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelncSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldncSaldosDiariosBancos= new JTextFieldMe();
		jTextFieldncSaldosDiariosBancos.setEnabled(false);
		jTextFieldncSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldncSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldncSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldncSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldncSaldosDiariosBancos.setText("0.0");

		this.jButtonncSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonncSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonncSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonncSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonncSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonncSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonncSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonncSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldncSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldncSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ncSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonncSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelch_giradosSaldosDiariosBancos = new JLabelMe();
		this.jLabelch_giradosSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS+" : *");
		this.jLabelch_giradosSaldosDiariosBancos.setToolTipText("Ch Girados");
		this.jLabelch_giradosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelch_giradosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelch_giradosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelch_giradosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelch_giradosSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelch_giradosSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_CHGIRADOS);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelch_giradosSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldch_giradosSaldosDiariosBancos= new JTextFieldMe();
		jTextFieldch_giradosSaldosDiariosBancos.setEnabled(false);
		jTextFieldch_giradosSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldch_giradosSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldch_giradosSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldch_giradosSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldch_giradosSaldosDiariosBancos.setText("0.0");

		this.jButtonch_giradosSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonch_giradosSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonch_giradosSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonch_giradosSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonch_giradosSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonch_giradosSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonch_giradosSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonch_giradosSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldch_giradosSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldch_giradosSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ch_giradosSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonch_giradosSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelndSaldosDiariosBancos = new JLabelMe();
		this.jLabelndSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_ND+" : *");
		this.jLabelndSaldosDiariosBancos.setToolTipText("Nd");
		this.jLabelndSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelndSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelndSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelndSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelndSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelndSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_ND);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelndSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextFieldndSaldosDiariosBancos= new JTextFieldMe();
		jTextFieldndSaldosDiariosBancos.setEnabled(false);
		jTextFieldndSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldndSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldndSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldndSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldndSaldosDiariosBancos.setText("0.0");

		this.jButtonndSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonndSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonndSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonndSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonndSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonndSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonndSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonndSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldndSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldndSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ndSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonndSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabelprocedenciaSaldosDiariosBancos = new JLabelMe();
		this.jLabelprocedenciaSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA+" : *");
		this.jLabelprocedenciaSaldosDiariosBancos.setToolTipText("Procedencia");
		this.jLabelprocedenciaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocedenciaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocedenciaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprocedenciaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprocedenciaSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprocedenciaSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_PROCEDENCIA);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelprocedenciaSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextAreaprocedenciaSaldosDiariosBancos= new JTextAreaMe();
		jTextAreaprocedenciaSaldosDiariosBancos.setEnabled(false);
		jTextAreaprocedenciaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaSaldosDiariosBancos.setLineWrap(true);
		jTextAreaprocedenciaSaldosDiariosBancos.setWrapStyleWord(true);
		jTextAreaprocedenciaSaldosDiariosBancos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprocedenciaSaldosDiariosBancos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaprocedenciaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprocedenciaSaldosDiariosBancos = new JScrollPane(jTextAreaprocedenciaSaldosDiariosBancos);
		jscrollPaneprocedenciaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocedenciaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocedenciaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprocedenciaSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprocedenciaSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprocedenciaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprocedenciaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"procedenciaSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprocedenciaSaldosDiariosBancosBusqueda.setVisible(false);		}


					
		this.jLabeldestinoSaldosDiariosBancos = new JLabelMe();
		this.jLabeldestinoSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO+" : *");
		this.jLabeldestinoSaldosDiariosBancos.setToolTipText("Destino");
		this.jLabeldestinoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldestinoSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldestinoSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldestinoSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_DESTINO);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPaneldestinoSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jTextAreadestinoSaldosDiariosBancos= new JTextAreaMe();
		jTextAreadestinoSaldosDiariosBancos.setEnabled(false);
		jTextAreadestinoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoSaldosDiariosBancos.setLineWrap(true);
		jTextAreadestinoSaldosDiariosBancos.setWrapStyleWord(true);
		jTextAreadestinoSaldosDiariosBancos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadestinoSaldosDiariosBancos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadestinoSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedestinoSaldosDiariosBancos = new JScrollPane(jTextAreadestinoSaldosDiariosBancos);
		jscrollPanedestinoSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondestinoSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtondestinoSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondestinoSaldosDiariosBancosBusqueda.setText("U");
		this.jButtondestinoSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondestinoSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondestinoSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadestinoSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadestinoSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"destinoSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondestinoSaldosDiariosBancosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSaldosDiariosBancos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSaldosDiariosBancos = new JLabelMe();
		this.jLabelid_empresaSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSaldosDiariosBancos.setToolTipText("Empresa");
		this.jLabelid_empresaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelid_empresaSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jComboBoxid_empresaSaldosDiariosBancos= new JComboBoxMe();
		jComboBoxid_empresaSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSaldosDiariosBancos.setEnabled(false);

		this.jButtonid_empresaSaldosDiariosBancos= new JButtonMe();
		this.jButtonid_empresaSaldosDiariosBancos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosDiariosBancos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosDiariosBancos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosDiariosBancos.setText("Buscar");
		this.jButtonid_empresaSaldosDiariosBancos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSaldosDiariosBancos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosDiariosBancos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosDiariosBancos"));

		this.jButtonid_empresaSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonid_empresaSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonid_empresaSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSaldosDiariosBancosBusqueda.setVisible(false);		}

		this.jButtonid_empresaSaldosDiariosBancosUpdate= new JButtonMe();
		this.jButtonid_empresaSaldosDiariosBancosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosDiariosBancosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosDiariosBancosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldosDiariosBancosUpdate.setText("U");
		this.jButtonid_empresaSaldosDiariosBancosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSaldosDiariosBancosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosDiariosBancosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosDiariosBancosUpdate"));



					
		this.jLabelid_ejercicioSaldosDiariosBancos = new JLabelMe();
		this.jLabelid_ejercicioSaldosDiariosBancos.setText(""+SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioSaldosDiariosBancos.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioSaldosDiariosBancos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioSaldosDiariosBancos.setToolTipText(SaldosDiariosBancosConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		this.jPanelid_ejercicioSaldosDiariosBancos.setLayout(this.gridaBagLayoutSaldosDiariosBancos);


		jComboBoxid_ejercicioSaldosDiariosBancos= new JComboBoxMe();
		jComboBoxid_ejercicioSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioSaldosDiariosBancos.setEnabled(false);

		this.jButtonid_ejercicioSaldosDiariosBancos= new JButtonMe();
		this.jButtonid_ejercicioSaldosDiariosBancos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSaldosDiariosBancos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSaldosDiariosBancos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSaldosDiariosBancos.setText("Buscar");
		this.jButtonid_ejercicioSaldosDiariosBancos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioSaldosDiariosBancos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSaldosDiariosBancos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSaldosDiariosBancos"));

		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda= new JButtonMe();
		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setText("U");
		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSaldosDiariosBancosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSaldosDiariosBancosBusqueda"));

		if(this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioSaldosDiariosBancosBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioSaldosDiariosBancosUpdate= new JButtonMe();
		this.jButtonid_ejercicioSaldosDiariosBancosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldosDiariosBancosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldosDiariosBancosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSaldosDiariosBancosUpdate.setText("U");
		this.jButtonid_ejercicioSaldosDiariosBancosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioSaldosDiariosBancosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSaldosDiariosBancosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioSaldosDiariosBancos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSaldosDiariosBancos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSaldosDiariosBancosUpdate"));



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
		//this.jInternalFrameDetalleSaldosDiariosBancos = new SaldosDiariosBancosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Saldos Diarios Bancos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldosDiariosBancos= new GridBagLayout();
		

		
		String sToolTipSaldosDiariosBancos="";
		sToolTipSaldosDiariosBancos=SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldosDiariosBancos+="(Tesoreria.SaldosDiariosBancos)";
		}
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldosDiariosBancos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSaldosDiariosBancos = new JButtonMe();
		this.jButtonModificarSaldosDiariosBancos = new JButtonMe();
        this.jButtonActualizarSaldosDiariosBancos = new JButtonMe();
        this.jButtonEliminarSaldosDiariosBancos = new JButtonMe();
        this.jButtonCancelarSaldosDiariosBancos = new JButtonMe();
        this.jButtonGuardarCambiosSaldosDiariosBancos = new JButtonMe();
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos = new JButtonMe();
		this.jButtonCerrarSaldosDiariosBancos = new JButtonMe();
		
		this.jScrollPanelDatosSaldosDiariosBancos = new JScrollPane();   
        this.jScrollPanelDatosEdicionSaldosDiariosBancos = new JScrollPane();
		this.jScrollPanelDatosGeneralSaldosDiariosBancos = new JScrollPane();
				
		
		
		this.jPanelCamposSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Saldos Diarios Bancos";
		
		if(!this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Diarios Bancoses" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldosDiariosBancos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSaldosDiariosBancos.setName("jPanelCamposSaldosDiariosBancos"); 

		this.jPanelCamposOcultosSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSaldosDiariosBancos.setName("jPanelCamposOcultosSaldosDiariosBancos"); 

        this.jPanelAccionesSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldosDiariosBancos.setToolTipText("Acciones");
        this.jPanelAccionesSaldosDiariosBancos.setName("Acciones"); 

		this.jPanelAccionesFormularioSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSaldosDiariosBancos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSaldosDiariosBancos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSaldosDiariosBancos.setText("Nuevo");
		this.jButtonModificarSaldosDiariosBancos.setText("Editar");
        this.jButtonActualizarSaldosDiariosBancos.setText("Actualizar");
        this.jButtonEliminarSaldosDiariosBancos.setText("Eliminar");
        this.jButtonCancelarSaldosDiariosBancos.setText("Cancelar");
        this.jButtonGuardarCambiosSaldosDiariosBancos.setText("Guardar");
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.setText("Guardar");
		this.jButtonCerrarSaldosDiariosBancos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldosDiariosBancos,"nuevo_button","Nuevo",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSaldosDiariosBancos,"modificar_button","Editar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSaldosDiariosBancos,"actualizar_button","Actualizar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSaldosDiariosBancos,"eliminar_button","Eliminar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSaldosDiariosBancos,"cancelar_button","Cancelar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSaldosDiariosBancos,"guardarcambios_button","Guardar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldosDiariosBancos,"guardarcambiostabla_button","Guardar",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldosDiariosBancos,"cerrar_button","Salir",this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSaldosDiariosBancos.setToolTipText("Nuevo"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSaldosDiariosBancos.setToolTipText("Editar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSaldosDiariosBancos.setToolTipText("Actualizar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSaldosDiariosBancos.setToolTipText("Eliminar)"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSaldosDiariosBancos.setToolTipText("Cancelar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSaldosDiariosBancos.setToolTipText("Guardar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.setToolTipText("Guardar"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldosDiariosBancos.setToolTipText("Salir"+" "+SaldosDiariosBancosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldosDiariosBancos";
		inputMap = this.jButtonNuevoSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldosDiariosBancos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldosDiariosBancos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSaldosDiariosBancos";
		inputMap = this.jButtonActualizarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSaldosDiariosBancos"));
		
		//ELIMINAR
		sMapKey = "EliminarSaldosDiariosBancos";
		inputMap = this.jButtonEliminarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSaldosDiariosBancos"));
		
		//CANCELAR	
		sMapKey = "CancelarSaldosDiariosBancos";
		inputMap = this.jButtonCancelarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSaldosDiariosBancos"));
		
		//CERRAR		
		sMapKey = "CerrarSaldosDiariosBancos";
		inputMap = this.jButtonCerrarSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldosDiariosBancos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldosDiariosBancos";
		inputMap = this.jButtonGuardarCambiosTablaSaldosDiariosBancos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldosDiariosBancos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldosDiariosBancos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSaldosDiariosBancos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSaldosDiariosBancos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSaldosDiariosBancos.setToolTipText("Nuevo SaldosDiariosBancos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSaldosDiariosBancos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSaldosDiariosBancos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSaldosDiariosBancos.setToolTipText("Sin Cerrar Ventana SaldosDiariosBancos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSaldosDiariosBancos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSaldosDiariosBancos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSaldosDiariosBancos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldosDiariosBancos.setText("Accion");
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSaldosDiariosBancos = new JLabelMe();
		
		this.jLabelAccionesSaldosDiariosBancos.setText("Acciones");		
		this.jLabelAccionesSaldosDiariosBancos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosDiariosBancos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosDiariosBancos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSaldosDiariosBancos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSaldosDiariosBancos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSaldosDiariosBancos=new JTabbedPane();
		this.jTabbedPaneRelacionesSaldosDiariosBancos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSaldosDiariosBancos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSaldosDiariosBancos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSaldosDiariosBancos = new GridBagLayout();
		
		this.jPanelCamposSaldosDiariosBancos.setLayout(gridaBagLayoutCamposSaldosDiariosBancos);
		this.jPanelCamposOcultosSaldosDiariosBancos.setLayout(gridaBagLayoutCamposOcultosSaldosDiariosBancos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSaldosDiariosBancos.add(jLabelIdSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSaldosDiariosBancos.add(jLabelidSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSaldosDiariosBancos.add(jLabelid_empresaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldosDiariosBancos.add(jButtonid_empresaSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 3;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldosDiariosBancos.add(jButtonid_empresaSaldosDiariosBancosUpdate, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSaldosDiariosBancos.add(jComboBoxid_empresaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioSaldosDiariosBancos.add(jLabelid_ejercicioSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSaldosDiariosBancos.add(jButtonid_ejercicioSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 3;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSaldosDiariosBancos.add(jButtonid_ejercicioSaldosDiariosBancosUpdate, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioSaldosDiariosBancos.add(jComboBoxid_ejercicioSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeSaldosDiariosBancos.add(jLabelfecha_desdeSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeSaldosDiariosBancos.add(jButtonfecha_desdeSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeSaldosDiariosBancos.add(jDateChooserfecha_desdeSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaSaldosDiariosBancos.add(jLabelfecha_hastaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaSaldosDiariosBancos.add(jButtonfecha_hastaSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaSaldosDiariosBancos.add(jDateChooserfecha_hastaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuentaSaldosDiariosBancos.add(jLabelcodigo_cuentaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuentaSaldosDiariosBancos.add(jButtoncodigo_cuentaSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuentaSaldosDiariosBancos.add(jTextFieldcodigo_cuentaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoSaldosDiariosBancos.add(jLabelnombre_bancoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoSaldosDiariosBancos.add(jButtonnombre_bancoSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoSaldosDiariosBancos.add(jscrollPanenombre_bancoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaSaldosDiariosBancos.add(jLabelnumero_cuentaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaSaldosDiariosBancos.add(jButtonnumero_cuentaSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaSaldosDiariosBancos.add(jTextFieldnumero_cuentaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_monedaSaldosDiariosBancos.add(jLabelnombre_monedaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_monedaSaldosDiariosBancos.add(jButtonnombre_monedaSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_monedaSaldosDiariosBancos.add(jTextFieldnombre_monedaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_anteriorSaldosDiariosBancos.add(jLabelsaldo_anteriorSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_anteriorSaldosDiariosBancos.add(jButtonsaldo_anteriorSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_anteriorSaldosDiariosBancos.add(jTextFieldsaldo_anteriorSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldepositoSaldosDiariosBancos.add(jLabeldepositoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldepositoSaldosDiariosBancos.add(jButtondepositoSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldepositoSaldosDiariosBancos.add(jTextFielddepositoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelncSaldosDiariosBancos.add(jLabelncSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelncSaldosDiariosBancos.add(jButtonncSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelncSaldosDiariosBancos.add(jTextFieldncSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelch_giradosSaldosDiariosBancos.add(jLabelch_giradosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelch_giradosSaldosDiariosBancos.add(jButtonch_giradosSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelch_giradosSaldosDiariosBancos.add(jTextFieldch_giradosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelndSaldosDiariosBancos.add(jLabelndSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelndSaldosDiariosBancos.add(jButtonndSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelndSaldosDiariosBancos.add(jTextFieldndSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprocedenciaSaldosDiariosBancos.add(jLabelprocedenciaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPanelprocedenciaSaldosDiariosBancos.add(jButtonprocedenciaSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprocedenciaSaldosDiariosBancos.add(jscrollPaneprocedenciaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldestinoSaldosDiariosBancos.add(jLabeldestinoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		//this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 2;
		this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
		this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldestinoSaldosDiariosBancos.add(jButtondestinoSaldosDiariosBancosBusqueda, this.gridBagConstraintsSaldosDiariosBancos);
	}

	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = 1;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldestinoSaldosDiariosBancos.add(jscrollPanedestinoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelidSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelfecha_desdeSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelfecha_hastaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelcodigo_cuentaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelnombre_bancoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelnumero_cuentaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelnombre_monedaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelsaldo_anteriorSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPaneldepositoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelncSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelch_giradosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelndSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPanelprocedenciaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosDiariosBancos.add(this.jPaneldestinoSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposSaldosDiariosBancos % 2==0) {
		iXPanelCamposSaldosDiariosBancos=0;
		iYPanelCamposSaldosDiariosBancos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposOcultosSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposOcultosSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldosDiariosBancos.add(this.jPanelid_empresaSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposOcultosSaldosDiariosBancos % 2==0) {
		iXPanelCamposOcultosSaldosDiariosBancos=0;
		iYPanelCamposOcultosSaldosDiariosBancos++;
	}
	this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosDiariosBancos.gridy = iYPanelCamposOcultosSaldosDiariosBancos;
	this.gridBagConstraintsSaldosDiariosBancos.gridx = iXPanelCamposOcultosSaldosDiariosBancos++;
	this.gridBagConstraintsSaldosDiariosBancos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosDiariosBancos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldosDiariosBancos.add(this.jPanelid_ejercicioSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);



	if(iXPanelCamposOcultosSaldosDiariosBancos % 2==0) {
		iXPanelCamposOcultosSaldosDiariosBancos=0;
		iYPanelCamposOcultosSaldosDiariosBancos++;
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
			
		GridBagLayout gridaBagLayoutAccionesSaldosDiariosBancos= new GridBagLayout();
		this.jPanelAccionesSaldosDiariosBancos.setLayout(gridaBagLayoutAccionesSaldosDiariosBancos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSaldosDiariosBancos= new GridBagLayout();
		this.jPanelAccionesFormularioSaldosDiariosBancos.setLayout(gridaBagLayoutAccionesFormularioSaldosDiariosBancos);
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldosDiariosBancos.add(this.jComboBoxTiposAccionesFormularioSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccion++;
			
		this.jPanelAccionesSaldosDiariosBancos.add(this.jButtonModificarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);							

		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;
		this.gridBagConstraintsSaldosDiariosBancos.gridx =iPosXAccion++;
			
		this.jPanelAccionesSaldosDiariosBancos.add(this.jButtonEliminarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldosDiariosBancos.add(this.jButtonActualizarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);


		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldosDiariosBancos.add(this.jButtonGuardarCambiosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);	
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = 0;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx =iPosXAccion++;
		
		this.jPanelAccionesSaldosDiariosBancos.add(this.jButtonCancelarSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldosDiariosBancos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldosDiariosBancos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldosdiariosbancosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();						
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;		
			//this.gridBagConstraintsSaldosDiariosBancos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldosDiariosBancos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldosDiariosBancos.gridx =0;
		this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldosDiariosBancos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SaldosDiariosBancosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSaldosDiariosBancos = new SaldosDiariosBancosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Saldos Diarios Bancos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Saldos Diarios Bancos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldos Diarios Bancos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SaldosDiariosBancosModel saldosdiariosbancosModel=new SaldosDiariosBancosModel(this);
			
			//SI USARA CLASE INTERNA
			//SaldosDiariosBancosModel.SaldosDiariosBancosFocusTraversalPolicy saldosdiariosbancosFocusTraversalPolicy = saldosdiariosbancosModel.new SaldosDiariosBancosFocusTraversalPolicy(this);
			
			//saldosdiariosbancosFocusTraversalPolicy.setsaldosdiariosbancosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(saldosdiariosbancosModel);
			
			
			this.jContentPaneDetalleSaldosDiariosBancos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSaldosDiariosBancos = new GridBagLayout();	
			this.jContentPaneDetalleSaldosDiariosBancos.setLayout(gridaBagLayoutDetalleSaldosDiariosBancos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldosDiariosBancos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
				this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
					
				
				this.jContentPaneDetalleSaldosDiariosBancos.add(jTtoolBarDetalleSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);								
				
}
			
			this.jScrollPanelDatosEdicionSaldosDiariosBancos=   new JScrollPane(jContentPaneDetalleSaldosDiariosBancos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSaldosDiariosBancos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	        
			this.jContentPaneDetalleSaldosDiariosBancos.add(jPanelCamposSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);
			
			
			
			
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
						//&& saldosdiariosbancosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.saldosdiariosbancosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSaldosDiariosBancos= new GridBagConstraints();
						this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
						this.jContentPaneDetalleSaldosDiariosBancos.add(this.jTabbedPaneRelacionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSaldosDiariosBancos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSaldosDiariosBancos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
					this.gridBagConstraintsSaldosDiariosBancos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
					
				
					this.jContentPaneDetalleSaldosDiariosBancos.add(jPanelCamposOcultosSaldosDiariosBancos, gridBagConstraintsSaldosDiariosBancos);
				
					this.jPanelCamposOcultosSaldosDiariosBancos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	        this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSaldosDiariosBancos.add(this.jPanelAccionesFormularioSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);							
			
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
	        this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
	        
			
			this.jContentPaneDetalleSaldosDiariosBancos.add(this.jPanelAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSaldosDiariosBancos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSaldosDiariosBancos=   new JScrollPane(this.jPanelCamposSaldosDiariosBancos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldosDiariosBancos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosDiariosBancos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosDiariosBancos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
			this.gridBagConstraintsSaldosDiariosBancos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSaldosDiariosBancos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSaldosDiariosBancos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);			
			
			this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
			this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
			
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		
			
		this.gridBagConstraintsSaldosDiariosBancos = new GridBagConstraints();
		this.gridBagConstraintsSaldosDiariosBancos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldosDiariosBancos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldosDiariosBancos, this.gridBagConstraintsSaldosDiariosBancos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSaldosDiariosBancos;//jContentPane;
		
		return jScrollPanelDatosEdicionSaldosDiariosBancos;
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
