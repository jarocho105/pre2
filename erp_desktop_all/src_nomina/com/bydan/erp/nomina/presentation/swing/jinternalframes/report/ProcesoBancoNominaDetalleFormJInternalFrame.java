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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.report.*;
import com.bydan.erp.nomina.util.report.ProcesoBancoNominaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.report.*;
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
public class ProcesoBancoNominaDetalleFormJInternalFrame extends ProcesoBancoNominaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesoBancoNomina;
	
	protected JMenuBar jmenuBarDetalleProcesoBancoNomina;
	
	protected JMenu jmenuDetalleProcesoBancoNomina;
	protected JMenu jmenuDetalleArchivoProcesoBancoNomina;
	protected JMenu jmenuDetalleAccionesProcesoBancoNomina;
	protected JMenu jmenuDetalleDatosProcesoBancoNomina;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesoBancoNomina;	
	protected GridBagConstraints gridBagConstraintsProcesoBancoNomina;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesoBancoNominaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesoBancoNomina;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoBeanSwingJInternalFrame cuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabanco="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected TipoBancoDiscoBeanSwingJInternalFrame tipobancodiscoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobancodisco="";
	
	public ProcesoBancoNominaSessionBean procesobanconominaSessionBean;
	
	
	
	
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoSessionBean cuentabancoSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	public TipoBancoDiscoSessionBean tipobancodiscoSessionBean;	
	
	public ProcesoBancoNominaLogic procesobanconominaLogic;
	
	public JScrollPane jScrollPanelDatosProcesoBancoNomina;
	public JScrollPane jScrollPanelDatosEdicionProcesoBancoNomina;
	public JScrollPane jScrollPanelDatosGeneralProcesoBancoNomina;
	
	protected JPanel jPanelCamposProcesoBancoNomina;    
	protected JPanel jPanelCamposOcultosProcesoBancoNomina;    	
	protected JPanel jPanelAccionesProcesoBancoNomina;
	protected JPanel jPanelAccionesFormularioProcesoBancoNomina;
    
	
	
	protected Integer iXPanelCamposProcesoBancoNomina=0;
	protected Integer iYPanelCamposProcesoBancoNomina=0;
	
	protected Integer iXPanelCamposOcultosProcesoBancoNomina=0;
	protected Integer iYPanelCamposOcultosProcesoBancoNomina=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesoBancoNomina;
	public JButton jButtonModificarProcesoBancoNomina;
	public JButton jButtonActualizarProcesoBancoNomina;
    public JButton jButtonEliminarProcesoBancoNomina;
	public JButton jButtonCancelarProcesoBancoNomina;
    public JButton jButtonGuardarCambiosProcesoBancoNomina;
	public JButton jButtonGuardarCambiosTablaProcesoBancoNomina;
	protected JButton jButtonCerrarProcesoBancoNomina;
	
	
	protected JButton jButtonProcesarInformacionProcesoBancoNomina;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesoBancoNomina;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesoBancoNomina;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesoBancoNomina;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesoBancoNomina;
	protected JButton jButtonModificarToolBarProcesoBancoNomina;
	protected JButton jButtonActualizarToolBarProcesoBancoNomina;
    protected JButton jButtonEliminarToolBarProcesoBancoNomina;
	protected JButton jButtonCancelarToolBarProcesoBancoNomina;
    protected JButton jButtonGuardarCambiosToolBarProcesoBancoNomina;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesoBancoNomina;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesoBancoNomina;
	protected JButton jButtonCerrarToolBarProcesoBancoNomina;
	
	protected JButton jButtonProcesarInformacionToolBarProcesoBancoNomina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesoBancoNomina;
	protected JMenuItem jMenuItemModificarProcesoBancoNomina;
	protected JMenuItem jMenuItemActualizarProcesoBancoNomina;
    protected JMenuItem jMenuItemEliminarProcesoBancoNomina;
	protected JMenuItem jMenuItemCancelarProcesoBancoNomina;
    protected JMenuItem jMenuItemGuardarCambiosProcesoBancoNomina;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesoBancoNomina;
	protected JMenuItem jMenuItemCerrarProcesoBancoNomina;
	protected JMenuItem jMenuItemDetalleCerrarProcesoBancoNomina;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesoBancoNomina;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesoBancoNomina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesoBancoNomina;
	protected JMenuItem jMenuItemMostrarOcultarProcesoBancoNomina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesoBancoNomina;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesoBancoNomina;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesoBancoNomina;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesoBancoNomina;
	public JLabel jLabelIdProcesoBancoNomina;
	public JTextFieldMe jTextFieldidProcesoBancoNomina;
	public JButton jButtonidProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelcon_otrosProcesoBancoNomina;
	public JLabel jLabelcon_otrosProcesoBancoNomina;
	public JCheckBox jCheckBoxcon_otrosProcesoBancoNomina;
	public JButton jButtoncon_otrosProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelcon_internetProcesoBancoNomina;
	public JLabel jLabelcon_internetProcesoBancoNomina;
	public JCheckBox jCheckBoxcon_internetProcesoBancoNomina;
	public JButton jButtoncon_internetProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelfechaProcesoBancoNomina;
	public JLabel jLabelfechaProcesoBancoNomina;
	//public JFormattedTextField jDateChooserfechaProcesoBancoNomina;

	public JDateChooser jDateChooserfechaProcesoBancoNomina;
	public JButton jButtonfechaProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialesProcesoBancoNomina;
	public JLabel jLabelnumero_secuencialesProcesoBancoNomina;
	public JTextField jTextFieldnumero_secuencialesProcesoBancoNomina;
	public JButton jButtonnumero_secuencialesProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelgenera_textoProcesoBancoNomina;
	public JLabel jLabelgenera_textoProcesoBancoNomina;
	public JCheckBox jCheckBoxgenera_textoProcesoBancoNomina;
	public JButton jButtongenera_textoProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelgenera_excelProcesoBancoNomina;
	public JLabel jLabelgenera_excelProcesoBancoNomina;
	public JCheckBox jCheckBoxgenera_excelProcesoBancoNomina;
	public JButton jButtongenera_excelProcesoBancoNominaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_bancoProcesoBancoNomina;
	public JLabel jLabelid_bancoProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoProcesoBancoNomina;
	public JButton jButtonid_bancoProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_bancoProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_bancoProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_bancoProcesoBancoNomina;
	public JLabel jLabelid_cuenta_bancoProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_bancoProcesoBancoNomina;
	public JButton jButtonid_cuenta_bancoProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_cuenta_bancoProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_bancoProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_contratoProcesoBancoNomina;
	public JLabel jLabelid_tipo_contratoProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoProcesoBancoNomina;
	public JButton jButtonid_tipo_contratoProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_tipo_contratoProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoProcesoBancoNominaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_banco_discoProcesoBancoNomina;
	public JLabel jLabelid_tipo_banco_discoProcesoBancoNomina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_banco_discoProcesoBancoNomina;
	public JButton jButtonid_tipo_banco_discoProcesoBancoNomina= new JButtonMe();
	public JButton jButtonid_tipo_banco_discoProcesoBancoNominaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesoBancoNomina;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesoBancoNominaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesoBancoNomina=new JPanel();
				this.jPanelAccionesFormularioProcesoBancoNomina=new JPanel();
				this.jmenuBarDetalleProcesoBancoNomina=new JMenuBar();
				this.jTtoolBarDetalleProcesoBancoNomina=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesoBancoNominaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesoBancoNominaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesoBancoNomina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesoBancoNomina() {
		return this.jButtonActualizarToolBarProcesoBancoNomina;
	}
	
	public JButton getjButtonEliminarToolBarProcesoBancoNomina() {
		return this.jButtonEliminarToolBarProcesoBancoNomina;
	}
	
	public JButton getjButtonCancelarToolBarProcesoBancoNomina() {
		return this.jButtonCancelarToolBarProcesoBancoNomina;
	}		
	
	public JButton getjButtonProcesarInformacionProcesoBancoNomina() {
		return this.jButtonProcesarInformacionProcesoBancoNomina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesoBancoNomina)	{
		this.jButtonProcesarInformacionProcesoBancoNomina = jButtonProcesarInformacionProcesoBancoNomina;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesoBancoNomina() {
		return this.jComboBoxTiposAccionesProcesoBancoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesoBancoNomina(
			JComboBox jComboBoxTiposRelacionesProcesoBancoNomina) {
		this.jComboBoxTiposRelacionesProcesoBancoNomina = jComboBoxTiposRelacionesProcesoBancoNomina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesoBancoNomina(
			JComboBox jComboBoxTiposAccionesProcesoBancoNomina) {
		this.jComboBoxTiposAccionesProcesoBancoNomina = jComboBoxTiposAccionesProcesoBancoNomina;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesoBancoNomina() {
		return this.jComboBoxTiposAccionesFormularioProcesoBancoNomina;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesoBancoNomina(
			JComboBox jComboBoxTiposAccionesFormularioProcesoBancoNomina) {
		this.jComboBoxTiposAccionesFormularioProcesoBancoNomina = jComboBoxTiposAccionesFormularioProcesoBancoNomina;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesobanconominaSessionBean=new ProcesoBancoNominaSessionBean();
		
		this.procesobanconominaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesobanconominaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesobanconominaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesoBancoNominaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesoBancoNominaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesoBancoNominaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proceso Banco Nomina MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesoBancoNominaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesoBancoNomina= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesoBancoNomina=new JButtonMe();
				this.jButtonModificarToolBarProcesoBancoNomina=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesoBancoNomina,this.jTtoolBarDetalleProcesoBancoNomina,
							"actualizar","actualizar","Actualizar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesoBancoNomina,this.jTtoolBarDetalleProcesoBancoNomina,
							"eliminar","eliminar","Eliminar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesoBancoNomina,this.jTtoolBarDetalleProcesoBancoNomina,
							"cancelar","cancelar","Cancelar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesoBancoNomina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesoBancoNomina,this.jTtoolBarDetalleProcesoBancoNomina,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesoBancoNomina=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesoBancoNomina=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesoBancoNomina=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesoBancoNomina=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesoBancoNomina=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesoBancoNomina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesoBancoNomina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesoBancoNomina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesoBancoNomina= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesoBancoNomina.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesoBancoNomina,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesoBancoNomina= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesoBancoNomina.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesoBancoNomina,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesoBancoNomina= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesoBancoNomina.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesoBancoNomina,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesoBancoNomina= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesoBancoNomina.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesoBancoNomina,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesoBancoNomina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesoBancoNomina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesoBancoNomina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesoBancoNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesoBancoNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesoBancoNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesoBancoNomina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesoBancoNomina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesoBancoNomina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesoBancoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesoBancoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesoBancoNomina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesoBancoNomina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesoBancoNomina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesoBancoNomina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesoBancoNomina.add(this.jMenuItemDetalleCerrarProcesoBancoNomina);
		
		this.jmenuDetalleAccionesProcesoBancoNomina.add(this.jMenuItemActualizarProcesoBancoNomina);
		this.jmenuDetalleAccionesProcesoBancoNomina.add(this.jMenuItemEliminarProcesoBancoNomina);
		this.jmenuDetalleAccionesProcesoBancoNomina.add(this.jMenuItemCancelarProcesoBancoNomina);		
		
		//this.jmenuDetalleDatosProcesoBancoNomina.add(this.jMenuItemDetalleAbrirOrderByProcesoBancoNomina);				
		this.jmenuDetalleDatosProcesoBancoNomina.add(this.jMenuItemDetalleMostarOcultarProcesoBancoNomina);				
				
		//this.jmenuDetalleAccionesProcesoBancoNomina.add(this.jMenuItemGuardarCambiosProcesoBancoNomina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesoBancoNomina.add(this.jmenuDetalleArchivoProcesoBancoNomina);		
		this.jmenuBarDetalleProcesoBancoNomina.add(this.jmenuDetalleAccionesProcesoBancoNomina);		
		this.jmenuBarDetalleProcesoBancoNomina.add(this.jmenuDetalleDatosProcesoBancoNomina);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesoBancoNomina);				
	}
	
	
	public void inicializarElementosCamposProcesoBancoNomina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesoBancoNomina = new JLabelMe();
		jLabelIdProcesoBancoNomina.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesoBancoNomina = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesoBancoNomina= new GridBagLayout();

		this.jPanelidProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);

		jTextFieldidProcesoBancoNomina = new JTextFieldMe();
		jTextFieldidProcesoBancoNomina.setText("Id");

		jTextFieldidProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_otrosProcesoBancoNomina = new JLabelMe();
		this.jLabelcon_otrosProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS+" : *");
		this.jLabelcon_otrosProcesoBancoNomina.setToolTipText("Con Otros");
		this.jLabelcon_otrosProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_otrosProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_otrosProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_otrosProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_otrosProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_otrosProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_CONOTROS);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelcon_otrosProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jCheckBoxcon_otrosProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxcon_otrosProcesoBancoNomina.setEnabled(false);

		jCheckBoxcon_otrosProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otrosProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otrosProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_otrosProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_otrosProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtoncon_otrosProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_otrosProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_otrosProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_otrosProcesoBancoNominaBusqueda.setText("U");
		this.jButtoncon_otrosProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_otrosProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_otrosProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_otrosProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_otrosProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_otrosProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_otrosProcesoBancoNominaBusqueda.setVisible(false);		}


					
		this.jLabelcon_internetProcesoBancoNomina = new JLabelMe();
		this.jLabelcon_internetProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET+" : *");
		this.jLabelcon_internetProcesoBancoNomina.setToolTipText("Con Internet");
		this.jLabelcon_internetProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_internetProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_internetProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_internetProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_internetProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_internetProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_CONINTERNET);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelcon_internetProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jCheckBoxcon_internetProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxcon_internetProcesoBancoNomina.setEnabled(false);

		jCheckBoxcon_internetProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_internetProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_internetProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_internetProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_internetProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtoncon_internetProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_internetProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_internetProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_internetProcesoBancoNominaBusqueda.setText("U");
		this.jButtoncon_internetProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_internetProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_internetProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_internetProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_internetProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_internetProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_internetProcesoBancoNominaBusqueda.setVisible(false);		}


					
		this.jLabelfechaProcesoBancoNomina = new JLabelMe();
		this.jLabelfechaProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProcesoBancoNomina.setToolTipText("Fecha");
		this.jLabelfechaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelfechaProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		//jFormattedTextFieldfechaProcesoBancoNomina= new JFormattedTextFieldMe();

		jDateChooserfechaProcesoBancoNomina= new JDateChooser();
		jDateChooserfechaProcesoBancoNomina.setEnabled(false);
		jDateChooserfechaProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProcesoBancoNomina.setDate(new Date());
		jDateChooserfechaProcesoBancoNomina.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProcesoBancoNomina.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtonfechaProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProcesoBancoNominaBusqueda.setText("U");
		this.jButtonfechaProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProcesoBancoNominaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialesProcesoBancoNomina = new JLabelMe();
		this.jLabelnumero_secuencialesProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES+" : *");
		this.jLabelnumero_secuencialesProcesoBancoNomina.setToolTipText("Numero Secuenciales");
		this.jLabelnumero_secuencialesProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialesProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialesProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialesProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialesProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialesProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_NUMEROSECUENCIALES);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelnumero_secuencialesProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jTextFieldnumero_secuencialesProcesoBancoNomina= new JTextFieldMe();
		jTextFieldnumero_secuencialesProcesoBancoNomina.setEnabled(false);
		jTextFieldnumero_secuencialesProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialesProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialesProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialesProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_secuencialesProcesoBancoNomina.setText("0");

		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setText("U");
		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialesProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialesProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialesProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialesProcesoBancoNominaBusqueda.setVisible(false);		}


					
		this.jLabelgenera_textoProcesoBancoNomina = new JLabelMe();
		this.jLabelgenera_textoProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO+" : *");
		this.jLabelgenera_textoProcesoBancoNomina.setToolTipText("Genera Texto");
		this.jLabelgenera_textoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgenera_textoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgenera_textoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgenera_textoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgenera_textoProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgenera_textoProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_GENERATEXTO);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelgenera_textoProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jCheckBoxgenera_textoProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxgenera_textoProcesoBancoNomina.setEnabled(false);

		jCheckBoxgenera_textoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_textoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_textoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxgenera_textoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtongenera_textoProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtongenera_textoProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongenera_textoProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongenera_textoProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongenera_textoProcesoBancoNominaBusqueda.setText("U");
		this.jButtongenera_textoProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongenera_textoProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongenera_textoProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxgenera_textoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxgenera_textoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"genera_textoProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongenera_textoProcesoBancoNominaBusqueda.setVisible(false);		}


					
		this.jLabelgenera_excelProcesoBancoNomina = new JLabelMe();
		this.jLabelgenera_excelProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL+" : *");
		this.jLabelgenera_excelProcesoBancoNomina.setToolTipText("Genera Excel");
		this.jLabelgenera_excelProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgenera_excelProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgenera_excelProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgenera_excelProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgenera_excelProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgenera_excelProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_GENERAEXCEL);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelgenera_excelProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jCheckBoxgenera_excelProcesoBancoNomina= new JCheckBoxMe();
		jCheckBoxgenera_excelProcesoBancoNomina.setEnabled(false);

		jCheckBoxgenera_excelProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_excelProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxgenera_excelProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxgenera_excelProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtongenera_excelProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtongenera_excelProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongenera_excelProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongenera_excelProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongenera_excelProcesoBancoNominaBusqueda.setText("U");
		this.jButtongenera_excelProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongenera_excelProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongenera_excelProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxgenera_excelProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxgenera_excelProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"genera_excelProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongenera_excelProcesoBancoNominaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProcesoBancoNomina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_bancoProcesoBancoNomina = new JLabelMe();
		this.jLabelid_bancoProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoProcesoBancoNomina.setToolTipText("Banco");
		this.jLabelid_bancoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelid_bancoProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jComboBoxid_bancoProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_bancoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoProcesoBancoNomina= new JButtonMe();
		this.jButtonid_bancoProcesoBancoNomina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoProcesoBancoNomina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoProcesoBancoNomina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoProcesoBancoNomina.setText("Procesar");
		this.jButtonid_bancoProcesoBancoNomina.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoProcesoBancoNomina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoProcesoBancoNomina,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoProcesoBancoNomina"));

		this.jButtonid_bancoProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtonid_bancoProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoProcesoBancoNominaBusqueda.setText("U");
		this.jButtonid_bancoProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoProcesoBancoNominaBusqueda.setVisible(false);		}

		this.jButtonid_bancoProcesoBancoNominaUpdate= new JButtonMe();
		this.jButtonid_bancoProcesoBancoNominaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoProcesoBancoNominaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoProcesoBancoNominaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoProcesoBancoNominaUpdate.setText("U");
		this.jButtonid_bancoProcesoBancoNominaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoProcesoBancoNominaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoProcesoBancoNominaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoProcesoBancoNominaUpdate"));



					
		this.jLabelid_cuenta_bancoProcesoBancoNomina = new JLabelMe();
		this.jLabelid_cuenta_bancoProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO+" : *");
		this.jLabelid_cuenta_bancoProcesoBancoNomina.setToolTipText("Cuenta Banco");
		this.jLabelid_cuenta_bancoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_bancoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_bancoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_bancoProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_bancoProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_IDCUENTABANCO);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelid_cuenta_bancoProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jComboBoxid_cuenta_bancoProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_cuenta_bancoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_bancoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_bancoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_bancoProcesoBancoNomina= new JButtonMe();
		this.jButtonid_cuenta_bancoProcesoBancoNomina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoProcesoBancoNomina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoProcesoBancoNomina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_bancoProcesoBancoNomina.setText("Procesar");
		this.jButtonid_cuenta_bancoProcesoBancoNomina.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_bancoProcesoBancoNomina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoProcesoBancoNomina,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_bancoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoProcesoBancoNomina"));

		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setText("U");
		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_bancoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_bancoProcesoBancoNominaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate= new JButtonMe();
		this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.setText("U");
		this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_bancoProcesoBancoNominaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_bancoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_bancoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_bancoProcesoBancoNominaUpdate"));



					
		this.jLabelid_tipo_contratoProcesoBancoNomina = new JLabelMe();
		this.jLabelid_tipo_contratoProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO+" : *");
		this.jLabelid_tipo_contratoProcesoBancoNomina.setToolTipText("Tipo Contrato");
		this.jLabelid_tipo_contratoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_contratoProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_contratoProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOCONTRATO);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelid_tipo_contratoProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jComboBoxid_tipo_contratoProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_tipo_contratoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_contratoProcesoBancoNomina= new JButtonMe();
		this.jButtonid_tipo_contratoProcesoBancoNomina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoProcesoBancoNomina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoProcesoBancoNomina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoProcesoBancoNomina.setText("Procesar");
		this.jButtonid_tipo_contratoProcesoBancoNomina.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_contratoProcesoBancoNomina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoProcesoBancoNomina,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_contratoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoProcesoBancoNomina"));

		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setText("U");
		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_contratoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_contratoProcesoBancoNominaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_contratoProcesoBancoNominaUpdate= new JButtonMe();
		this.jButtonid_tipo_contratoProcesoBancoNominaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoProcesoBancoNominaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoProcesoBancoNominaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoProcesoBancoNominaUpdate.setText("U");
		this.jButtonid_tipo_contratoProcesoBancoNominaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_contratoProcesoBancoNominaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoProcesoBancoNominaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_contratoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoProcesoBancoNominaUpdate"));



					
		this.jLabelid_tipo_banco_discoProcesoBancoNomina = new JLabelMe();
		this.jLabelid_tipo_banco_discoProcesoBancoNomina.setText(""+ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO+" : *");
		this.jLabelid_tipo_banco_discoProcesoBancoNomina.setToolTipText("Tipo Banco Disco");
		this.jLabelid_tipo_banco_discoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_banco_discoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_banco_discoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_banco_discoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_banco_discoProcesoBancoNomina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_banco_discoProcesoBancoNomina.setToolTipText(ProcesoBancoNominaConstantesFunciones.LABEL_IDTIPOBANCODISCO);
		this.gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		this.jPanelid_tipo_banco_discoProcesoBancoNomina.setLayout(this.gridaBagLayoutProcesoBancoNomina);


		jComboBoxid_tipo_banco_discoProcesoBancoNomina= new JComboBoxMe();
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_banco_discoProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_banco_discoProcesoBancoNomina= new JButtonMe();
		this.jButtonid_tipo_banco_discoProcesoBancoNomina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_banco_discoProcesoBancoNomina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_banco_discoProcesoBancoNomina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_banco_discoProcesoBancoNomina.setText("Procesar");
		this.jButtonid_tipo_banco_discoProcesoBancoNomina.setToolTipText("Procesar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_banco_discoProcesoBancoNomina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_banco_discoProcesoBancoNomina,"buscar_form","Procesar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_banco_discoProcesoBancoNomina"));

		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda= new JButtonMe();
		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setText("U");
		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_banco_discoProcesoBancoNominaBusqueda"));

		if(this.procesobanconominaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate= new JButtonMe();
		this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.setText("U");
		this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_banco_discoProcesoBancoNominaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_banco_discoProcesoBancoNomina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_banco_discoProcesoBancoNominaUpdate"));



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
		//this.jInternalFrameDetalleProcesoBancoNomina = new ProcesoBancoNominaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proceso Banco Nomina DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesoBancoNomina= new GridBagLayout();
		

		
		String sToolTipProcesoBancoNomina="";
		sToolTipProcesoBancoNomina=ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesoBancoNomina+="(Nomina.ProcesoBancoNomina)";
		}
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesoBancoNomina+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesoBancoNomina = new JButtonMe();
		this.jButtonModificarProcesoBancoNomina = new JButtonMe();
        this.jButtonActualizarProcesoBancoNomina = new JButtonMe();
        this.jButtonEliminarProcesoBancoNomina = new JButtonMe();
        this.jButtonCancelarProcesoBancoNomina = new JButtonMe();
        this.jButtonGuardarCambiosProcesoBancoNomina = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesoBancoNomina = new JButtonMe();
		this.jButtonCerrarProcesoBancoNomina = new JButtonMe();
		
		this.jScrollPanelDatosProcesoBancoNomina = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesoBancoNomina = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesoBancoNomina = new JScrollPane();
				
		
		
		this.jPanelCamposProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Proceso Banco Nomina";
		
		if(!this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proceso Banco Nominas" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesoBancoNomina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesoBancoNomina.setName("jPanelCamposProcesoBancoNomina"); 

		this.jPanelCamposOcultosProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesoBancoNomina.setName("jPanelCamposOcultosProcesoBancoNomina"); 

        this.jPanelAccionesProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesoBancoNomina.setToolTipText("Acciones");
        this.jPanelAccionesProcesoBancoNomina.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesoBancoNomina.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesoBancoNomina.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesoBancoNomina.setText("Nuevo");
		this.jButtonModificarProcesoBancoNomina.setText("Editar");
        this.jButtonActualizarProcesoBancoNomina.setText("Actualizar");
        this.jButtonEliminarProcesoBancoNomina.setText("Eliminar");
        this.jButtonCancelarProcesoBancoNomina.setText("Cancelar");
        this.jButtonGuardarCambiosProcesoBancoNomina.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.setText("Guardar");
		this.jButtonCerrarProcesoBancoNomina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesoBancoNomina,"nuevo_button","Nuevo",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesoBancoNomina,"modificar_button","Editar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesoBancoNomina,"actualizar_button","Actualizar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesoBancoNomina,"eliminar_button","Eliminar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesoBancoNomina,"cancelar_button","Cancelar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesoBancoNomina,"guardarcambios_button","Guardar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesoBancoNomina,"guardarcambiostabla_button","Guardar",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesoBancoNomina,"cerrar_button","Salir",this.procesobanconominaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesoBancoNomina.setToolTipText("Nuevo"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesoBancoNomina.setToolTipText("Editar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesoBancoNomina.setToolTipText("Actualizar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesoBancoNomina.setToolTipText("Eliminar)"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesoBancoNomina.setToolTipText("Cancelar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesoBancoNomina.setToolTipText("Guardar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.setToolTipText("Guardar"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesoBancoNomina.setToolTipText("Salir"+" "+ProcesoBancoNominaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesoBancoNomina";
		inputMap = this.jButtonNuevoProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesoBancoNomina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesoBancoNomina"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesoBancoNomina";
		inputMap = this.jButtonActualizarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesoBancoNomina"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesoBancoNomina";
		inputMap = this.jButtonEliminarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesoBancoNomina"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesoBancoNomina";
		inputMap = this.jButtonCancelarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesoBancoNomina"));
		
		//CERRAR		
		sMapKey = "CerrarProcesoBancoNomina";
		inputMap = this.jButtonCerrarProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesoBancoNomina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesoBancoNomina";
		inputMap = this.jButtonGuardarCambiosTablaProcesoBancoNomina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesoBancoNomina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesoBancoNomina"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesoBancoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesoBancoNomina.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesoBancoNomina.setToolTipText("Nuevo ProcesoBancoNomina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesoBancoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesoBancoNomina.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesoBancoNomina.setToolTipText("Sin Cerrar Ventana ProcesoBancoNomina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesoBancoNomina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesoBancoNomina.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesoBancoNomina.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesoBancoNomina.setText("Accion");
		this.jComboBoxTiposAccionesProcesoBancoNomina.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesoBancoNomina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesoBancoNomina = new JLabelMe();
		
		this.jLabelAccionesProcesoBancoNomina.setText("Acciones");		
		this.jLabelAccionesProcesoBancoNomina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoBancoNomina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesoBancoNomina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesoBancoNomina();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesoBancoNomina();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesoBancoNomina=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesoBancoNomina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesoBancoNomina,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesoBancoNomina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoBancoNomina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesoBancoNomina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesoBancoNomina, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesoBancoNomina = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesoBancoNomina = new GridBagLayout();
		
		this.jPanelCamposProcesoBancoNomina.setLayout(gridaBagLayoutCamposProcesoBancoNomina);
		this.jPanelCamposOcultosProcesoBancoNomina.setLayout(gridaBagLayoutCamposOcultosProcesoBancoNomina);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesoBancoNomina.add(jLabelIdProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesoBancoNomina.add(jTextFieldidProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoProcesoBancoNomina.add(jLabelid_bancoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoProcesoBancoNomina.add(jButtonid_bancoProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 3;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoProcesoBancoNomina.add(jButtonid_bancoProcesoBancoNominaUpdate, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoProcesoBancoNomina.add(jComboBoxid_bancoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_bancoProcesoBancoNomina.add(jLabelid_cuenta_bancoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoProcesoBancoNomina.add(jButtonid_cuenta_bancoProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 3;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_bancoProcesoBancoNomina.add(jButtonid_cuenta_bancoProcesoBancoNominaUpdate, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_bancoProcesoBancoNomina.add(jComboBoxid_cuenta_bancoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_contratoProcesoBancoNomina.add(jLabelid_tipo_contratoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoProcesoBancoNomina.add(jButtonid_tipo_contratoProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 3;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoProcesoBancoNomina.add(jButtonid_tipo_contratoProcesoBancoNominaUpdate, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_contratoProcesoBancoNomina.add(jComboBoxid_tipo_contratoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_banco_discoProcesoBancoNomina.add(jLabelid_tipo_banco_discoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_banco_discoProcesoBancoNomina.add(jButtonid_tipo_banco_discoProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 3;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_banco_discoProcesoBancoNomina.add(jButtonid_tipo_banco_discoProcesoBancoNominaUpdate, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_banco_discoProcesoBancoNomina.add(jComboBoxid_tipo_banco_discoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_otrosProcesoBancoNomina.add(jLabelcon_otrosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_otrosProcesoBancoNomina.add(jButtoncon_otrosProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_otrosProcesoBancoNomina.add(jCheckBoxcon_otrosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_internetProcesoBancoNomina.add(jLabelcon_internetProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_internetProcesoBancoNomina.add(jButtoncon_internetProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_internetProcesoBancoNomina.add(jCheckBoxcon_internetProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaProcesoBancoNomina.add(jLabelfechaProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProcesoBancoNomina.add(jButtonfechaProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaProcesoBancoNomina.add(jDateChooserfechaProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialesProcesoBancoNomina.add(jLabelnumero_secuencialesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialesProcesoBancoNomina.add(jButtonnumero_secuencialesProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialesProcesoBancoNomina.add(jTextFieldnumero_secuencialesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgenera_textoProcesoBancoNomina.add(jLabelgenera_textoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelgenera_textoProcesoBancoNomina.add(jButtongenera_textoProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgenera_textoProcesoBancoNomina.add(jCheckBoxgenera_textoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgenera_excelProcesoBancoNomina.add(jLabelgenera_excelProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		//this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = 2;
		this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
		this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(0, 0, 0, 0);
		this.jPanelgenera_excelProcesoBancoNomina.add(jButtongenera_excelProcesoBancoNominaBusqueda, this.gridBagConstraintsProcesoBancoNomina);
	}

	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
	this.gridBagConstraintsProcesoBancoNomina.gridx = 1;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgenera_excelProcesoBancoNomina.add(jCheckBoxgenera_excelProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelidProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelid_bancoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelid_cuenta_bancoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelid_tipo_contratoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelid_tipo_banco_discoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelcon_otrosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelcon_internetProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelfechaProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelnumero_secuencialesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelgenera_textoProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
	this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesoBancoNomina.gridy = iYPanelCamposProcesoBancoNomina;
	this.gridBagConstraintsProcesoBancoNomina.gridx = iXPanelCamposProcesoBancoNomina++;
	this.gridBagConstraintsProcesoBancoNomina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesoBancoNomina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesoBancoNomina.add(this.jPanelgenera_excelProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);



	if(iXPanelCamposProcesoBancoNomina % 1==0) {
		iXPanelCamposProcesoBancoNomina=0;
		iYPanelCamposProcesoBancoNomina++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesProcesoBancoNomina= new GridBagLayout();
		this.jPanelAccionesProcesoBancoNomina.setLayout(gridaBagLayoutAccionesProcesoBancoNomina);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesoBancoNomina= new GridBagLayout();
		this.jPanelAccionesFormularioProcesoBancoNomina.setLayout(gridaBagLayoutAccionesFormularioProcesoBancoNomina);
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesoBancoNomina.add(this.jComboBoxTiposAccionesFormularioProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesoBancoNomina.add(this.jButtonModificarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);							

		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;
		this.gridBagConstraintsProcesoBancoNomina.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesoBancoNomina.add(this.jButtonEliminarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
			
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoBancoNomina.add(this.jButtonActualizarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);


		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesoBancoNomina.add(this.jButtonGuardarCambiosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);	
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = 0;		
		this.gridBagConstraintsProcesoBancoNomina.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesoBancoNomina.add(this.jButtonCancelarProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesoBancoNomina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesoBancoNomina);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesobanconominaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();						
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;		
			//this.gridBagConstraintsProcesoBancoNomina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesoBancoNomina.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesoBancoNomina.gridx =0;
		this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesoBancoNomina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesoBancoNominaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesoBancoNomina = new ProcesoBancoNominaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proceso Banco Nomina DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proceso Banco Nomina DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Banco Nomina Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesoBancoNominaModel procesobanconominaModel=new ProcesoBancoNominaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesoBancoNominaModel.ProcesoBancoNominaFocusTraversalPolicy procesobanconominaFocusTraversalPolicy = procesobanconominaModel.new ProcesoBancoNominaFocusTraversalPolicy(this);
			
			//procesobanconominaFocusTraversalPolicy.setprocesobanconominaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesobanconominaModel);
			
			
			this.jContentPaneDetalleProcesoBancoNomina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesoBancoNomina = new GridBagLayout();	
			this.jContentPaneDetalleProcesoBancoNomina.setLayout(gridaBagLayoutDetalleProcesoBancoNomina);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesoBancoNomina = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
				this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
					
				
				this.jContentPaneDetalleProcesoBancoNomina.add(jTtoolBarDetalleProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);								
				
}
			
			this.jScrollPanelDatosEdicionProcesoBancoNomina=   new JScrollPane(jContentPaneDetalleProcesoBancoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoBancoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoBancoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoBancoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesoBancoNomina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesoBancoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoBancoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesoBancoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	        
			this.jContentPaneDetalleProcesoBancoNomina.add(jPanelCamposProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);
			
			
			
			
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
						//&& procesobanconominaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesobanconominaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesoBancoNomina= new GridBagConstraints();
						this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
						this.jContentPaneDetalleProcesoBancoNomina.add(this.jTabbedPaneRelacionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesoBancoNomina.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesoBancoNomina.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
					this.gridBagConstraintsProcesoBancoNomina.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
					
				
					this.jContentPaneDetalleProcesoBancoNomina.add(jPanelCamposOcultosProcesoBancoNomina, gridBagConstraintsProcesoBancoNomina);
				
					this.jPanelCamposOcultosProcesoBancoNomina.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	        this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesoBancoNomina.add(this.jPanelAccionesFormularioProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);							
			
			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
	        this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesoBancoNomina.add(this.jPanelAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesoBancoNomina);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesoBancoNomina=   new JScrollPane(this.jPanelCamposProcesoBancoNomina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesoBancoNomina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoBancoNomina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesoBancoNomina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
			this.gridBagConstraintsProcesoBancoNomina.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesoBancoNomina.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesoBancoNomina.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);			
			
			this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
			this.gridBagConstraintsProcesoBancoNomina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
			
			
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		
			
		this.gridBagConstraintsProcesoBancoNomina = new GridBagConstraints();
		this.gridBagConstraintsProcesoBancoNomina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesoBancoNomina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesoBancoNomina, this.gridBagConstraintsProcesoBancoNomina);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesoBancoNomina.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesoBancoNomina.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesoBancoNomina.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesoBancoNomina.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesoBancoNomina.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesoBancoNomina.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesoBancoNomina;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesoBancoNomina;
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
