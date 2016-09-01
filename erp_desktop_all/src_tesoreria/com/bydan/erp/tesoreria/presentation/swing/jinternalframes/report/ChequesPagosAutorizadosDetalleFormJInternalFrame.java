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

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.util.report.ChequesPagosAutorizadosConstantesFunciones;

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
public class ChequesPagosAutorizadosDetalleFormJInternalFrame extends ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleChequesPagosAutorizados;
	
	protected JMenuBar jmenuBarDetalleChequesPagosAutorizados;
	
	protected JMenu jmenuDetalleChequesPagosAutorizados;
	protected JMenu jmenuDetalleArchivoChequesPagosAutorizados;
	protected JMenu jmenuDetalleAccionesChequesPagosAutorizados;
	protected JMenu jmenuDetalleDatosChequesPagosAutorizados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutChequesPagosAutorizados;	
	protected GridBagConstraints gridBagConstraintsChequesPagosAutorizados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional jInternalFrameDetalleChequesPagosAutorizados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ChequesPagosAutorizadosSessionBean chequespagosautorizadosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ChequesPagosAutorizadosLogic chequespagosautorizadosLogic;
	
	public JScrollPane jScrollPanelDatosChequesPagosAutorizados;
	public JScrollPane jScrollPanelDatosEdicionChequesPagosAutorizados;
	public JScrollPane jScrollPanelDatosGeneralChequesPagosAutorizados;
	
	protected JPanel jPanelCamposChequesPagosAutorizados;    
	protected JPanel jPanelCamposOcultosChequesPagosAutorizados;    	
	protected JPanel jPanelAccionesChequesPagosAutorizados;
	protected JPanel jPanelAccionesFormularioChequesPagosAutorizados;
    
	
	
	protected Integer iXPanelCamposChequesPagosAutorizados=0;
	protected Integer iYPanelCamposChequesPagosAutorizados=0;
	
	protected Integer iXPanelCamposOcultosChequesPagosAutorizados=0;
	protected Integer iYPanelCamposOcultosChequesPagosAutorizados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoChequesPagosAutorizados;
	public JButton jButtonModificarChequesPagosAutorizados;
	public JButton jButtonActualizarChequesPagosAutorizados;
    public JButton jButtonEliminarChequesPagosAutorizados;
	public JButton jButtonCancelarChequesPagosAutorizados;
    public JButton jButtonGuardarCambiosChequesPagosAutorizados;
	public JButton jButtonGuardarCambiosTablaChequesPagosAutorizados;
	protected JButton jButtonCerrarChequesPagosAutorizados;
	
	
	protected JButton jButtonProcesarInformacionChequesPagosAutorizados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoChequesPagosAutorizados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarChequesPagosAutorizados;
	protected JCheckBox jCheckBoxPostAccionSinMensajeChequesPagosAutorizados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarChequesPagosAutorizados;
	protected JButton jButtonModificarToolBarChequesPagosAutorizados;
	protected JButton jButtonActualizarToolBarChequesPagosAutorizados;
    protected JButton jButtonEliminarToolBarChequesPagosAutorizados;
	protected JButton jButtonCancelarToolBarChequesPagosAutorizados;
    protected JButton jButtonGuardarCambiosToolBarChequesPagosAutorizados;
	protected JButton jButtonGuardarCambiosTablaToolBarChequesPagosAutorizados;
	protected JButton jButtonMostrarOcultarTablaToolBarChequesPagosAutorizados;
	protected JButton jButtonCerrarToolBarChequesPagosAutorizados;
	
	protected JButton jButtonProcesarInformacionToolBarChequesPagosAutorizados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoChequesPagosAutorizados;
	protected JMenuItem jMenuItemModificarChequesPagosAutorizados;
	protected JMenuItem jMenuItemActualizarChequesPagosAutorizados;
    protected JMenuItem jMenuItemEliminarChequesPagosAutorizados;
	protected JMenuItem jMenuItemCancelarChequesPagosAutorizados;
    protected JMenuItem jMenuItemGuardarCambiosChequesPagosAutorizados;
	protected JMenuItem jMenuItemGuardarCambiosTablaChequesPagosAutorizados;
	protected JMenuItem jMenuItemCerrarChequesPagosAutorizados;
	protected JMenuItem jMenuItemDetalleCerrarChequesPagosAutorizados;
	protected JMenuItem jMenuItemDetalleMostarOcultarChequesPagosAutorizados;
	
	protected JMenuItem jMenuItemProcesarInformacionChequesPagosAutorizados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosChequesPagosAutorizados;
	protected JMenuItem jMenuItemMostrarOcultarChequesPagosAutorizados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesChequesPagosAutorizados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesChequesPagosAutorizados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioChequesPagosAutorizados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidChequesPagosAutorizados;
	public JLabel jLabelIdChequesPagosAutorizados;
	public JLabel jLabelidChequesPagosAutorizados;
	public JButton jButtonidChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeChequesPagosAutorizados;
	public JLabel jLabelfecha_desdeChequesPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_desdeChequesPagosAutorizados;

	public JDateChooser jDateChooserfecha_desdeChequesPagosAutorizados;
	public JButton jButtonfecha_desdeChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaChequesPagosAutorizados;
	public JLabel jLabelfecha_hastaChequesPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_hastaChequesPagosAutorizados;

	public JDateChooser jDateChooserfecha_hastaChequesPagosAutorizados;
	public JButton jButtonfecha_hastaChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteChequesPagosAutorizados;
	public JLabel jLabelnombre_clienteChequesPagosAutorizados;
	public JTextArea jTextAreanombre_clienteChequesPagosAutorizados;
	public JScrollPane jscrollPanenombre_clienteChequesPagosAutorizados;
	public JButton jButtonnombre_clienteChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaChequesPagosAutorizados;
	public JLabel jLabelnumero_facturaChequesPagosAutorizados;
	public JTextField jTextFieldnumero_facturaChequesPagosAutorizados;
	public JButton jButtonnumero_facturaChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localChequesPagosAutorizados;
	public JLabel jLabeldebito_mone_localChequesPagosAutorizados;
	public JTextField jTextFielddebito_mone_localChequesPagosAutorizados;
	public JButton jButtondebito_mone_localChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfechaChequesPagosAutorizados;
	public JLabel jLabelfechaChequesPagosAutorizados;
	//public JFormattedTextField jDateChooserfechaChequesPagosAutorizados;

	public JDateChooser jDateChooserfechaChequesPagosAutorizados;
	public JButton jButtonfechaChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoChequesPagosAutorizados;
	public JLabel jLabelnombre_bancoChequesPagosAutorizados;
	public JTextArea jTextAreanombre_bancoChequesPagosAutorizados;
	public JScrollPane jscrollPanenombre_bancoChequesPagosAutorizados;
	public JButton jButtonnombre_bancoChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelvalorChequesPagosAutorizados;
	public JLabel jLabelvalorChequesPagosAutorizados;
	public JTextField jTextFieldvalorChequesPagosAutorizados;
	public JButton jButtonvalorChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeChequesPagosAutorizados;
	public JLabel jLabelnumero_chequeChequesPagosAutorizados;
	public JTextField jTextFieldnumero_chequeChequesPagosAutorizados;
	public JButton jButtonnumero_chequeChequesPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaChequesPagosAutorizados;
	public JLabel jLabelnumero_cuentaChequesPagosAutorizados;
	public JTextField jTextFieldnumero_cuentaChequesPagosAutorizados;
	public JButton jButtonnumero_cuentaChequesPagosAutorizadosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaChequesPagosAutorizados;
	public JLabel jLabelid_empresaChequesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaChequesPagosAutorizados;
	public JButton jButtonid_empresaChequesPagosAutorizados= new JButtonMe();
	public JButton jButtonid_empresaChequesPagosAutorizadosUpdate= new JButtonMe();
	public JButton jButtonid_empresaChequesPagosAutorizadosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesChequesPagosAutorizados;
	
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
	public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ChequesPagosAutorizadosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposChequesPagosAutorizados=new JPanel();
				this.jPanelAccionesFormularioChequesPagosAutorizados=new JPanel();
				this.jmenuBarDetalleChequesPagosAutorizados=new JMenuBar();
				this.jTtoolBarDetalleChequesPagosAutorizados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ChequesPagosAutorizadosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ChequesPagosAutorizadosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ChequesPagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarChequesPagosAutorizados() {
		return this.jButtonActualizarToolBarChequesPagosAutorizados;
	}
	
	public JButton getjButtonEliminarToolBarChequesPagosAutorizados() {
		return this.jButtonEliminarToolBarChequesPagosAutorizados;
	}
	
	public JButton getjButtonCancelarToolBarChequesPagosAutorizados() {
		return this.jButtonCancelarToolBarChequesPagosAutorizados;
	}		
	
	public JButton getjButtonProcesarInformacionChequesPagosAutorizados() {
		return this.jButtonProcesarInformacionChequesPagosAutorizados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionChequesPagosAutorizados)	{
		this.jButtonProcesarInformacionChequesPagosAutorizados = jButtonProcesarInformacionChequesPagosAutorizados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesChequesPagosAutorizados() {
		return this.jComboBoxTiposAccionesChequesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesChequesPagosAutorizados(
			JComboBox jComboBoxTiposRelacionesChequesPagosAutorizados) {
		this.jComboBoxTiposRelacionesChequesPagosAutorizados = jComboBoxTiposRelacionesChequesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesChequesPagosAutorizados(
			JComboBox jComboBoxTiposAccionesChequesPagosAutorizados) {
		this.jComboBoxTiposAccionesChequesPagosAutorizados = jComboBoxTiposAccionesChequesPagosAutorizados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioChequesPagosAutorizados() {
		return this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioChequesPagosAutorizados(
			JComboBox jComboBoxTiposAccionesFormularioChequesPagosAutorizados) {
		this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados = jComboBoxTiposAccionesFormularioChequesPagosAutorizados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.chequespagosautorizadosSessionBean=new ChequesPagosAutorizadosSessionBean();
		
		this.chequespagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.chequespagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ChequesPagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ChequesPagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ChequesPagosAutorizadosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cheques Pagos Autorizados MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
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
	
		ChequesPagosAutorizadosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleChequesPagosAutorizados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarChequesPagosAutorizados=new JButtonMe();
				this.jButtonModificarToolBarChequesPagosAutorizados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarChequesPagosAutorizados,this.jTtoolBarDetalleChequesPagosAutorizados,
							"actualizar","actualizar","Actualizar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarChequesPagosAutorizados,this.jTtoolBarDetalleChequesPagosAutorizados,
							"eliminar","eliminar","Eliminar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarChequesPagosAutorizados,this.jTtoolBarDetalleChequesPagosAutorizados,
							"cancelar","cancelar","Cancelar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarChequesPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarChequesPagosAutorizados,this.jTtoolBarDetalleChequesPagosAutorizados,
							"guardarcambios","guardarcambios","Guardar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleChequesPagosAutorizados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleChequesPagosAutorizados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoChequesPagosAutorizados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesChequesPagosAutorizados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosChequesPagosAutorizados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoChequesPagosAutorizados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoChequesPagosAutorizados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoChequesPagosAutorizados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarChequesPagosAutorizados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarChequesPagosAutorizados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarChequesPagosAutorizados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarChequesPagosAutorizados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarChequesPagosAutorizados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarChequesPagosAutorizados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarChequesPagosAutorizados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarChequesPagosAutorizados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarChequesPagosAutorizados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarChequesPagosAutorizados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarChequesPagosAutorizados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarChequesPagosAutorizados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosChequesPagosAutorizados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosChequesPagosAutorizados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosChequesPagosAutorizados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarChequesPagosAutorizados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarChequesPagosAutorizados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarChequesPagosAutorizados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarChequesPagosAutorizados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarChequesPagosAutorizados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarChequesPagosAutorizados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarChequesPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarChequesPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarChequesPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoChequesPagosAutorizados.add(this.jMenuItemDetalleCerrarChequesPagosAutorizados);
		
		this.jmenuDetalleAccionesChequesPagosAutorizados.add(this.jMenuItemActualizarChequesPagosAutorizados);
		this.jmenuDetalleAccionesChequesPagosAutorizados.add(this.jMenuItemEliminarChequesPagosAutorizados);
		this.jmenuDetalleAccionesChequesPagosAutorizados.add(this.jMenuItemCancelarChequesPagosAutorizados);		
		
		//this.jmenuDetalleDatosChequesPagosAutorizados.add(this.jMenuItemDetalleAbrirOrderByChequesPagosAutorizados);				
		this.jmenuDetalleDatosChequesPagosAutorizados.add(this.jMenuItemDetalleMostarOcultarChequesPagosAutorizados);				
				
		//this.jmenuDetalleAccionesChequesPagosAutorizados.add(this.jMenuItemGuardarCambiosChequesPagosAutorizados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleChequesPagosAutorizados.add(this.jmenuDetalleArchivoChequesPagosAutorizados);		
		this.jmenuBarDetalleChequesPagosAutorizados.add(this.jmenuDetalleAccionesChequesPagosAutorizados);		
		this.jmenuBarDetalleChequesPagosAutorizados.add(this.jmenuDetalleDatosChequesPagosAutorizados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleChequesPagosAutorizados);				
	}
	
	
	public void inicializarElementosCamposChequesPagosAutorizados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdChequesPagosAutorizados = new JLabelMe();
		jLabelIdChequesPagosAutorizados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidChequesPagosAutorizados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutChequesPagosAutorizados= new GridBagLayout();

		this.jPanelidChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);

		jLabelidChequesPagosAutorizados = new JLabel();
		jLabelidChequesPagosAutorizados.setText("Id");

		jLabelidChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeChequesPagosAutorizados = new JLabelMe();
		this.jLabelfecha_desdeChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeChequesPagosAutorizados.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelfecha_desdeChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		//jFormattedTextFieldfecha_desdeChequesPagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeChequesPagosAutorizados= new JDateChooser();
		jDateChooserfecha_desdeChequesPagosAutorizados.setEnabled(false);
		jDateChooserfecha_desdeChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeChequesPagosAutorizados.setDate(new Date());
		jDateChooserfecha_desdeChequesPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeChequesPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaChequesPagosAutorizados = new JLabelMe();
		this.jLabelfecha_hastaChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaChequesPagosAutorizados.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelfecha_hastaChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		//jFormattedTextFieldfecha_hastaChequesPagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaChequesPagosAutorizados= new JDateChooser();
		jDateChooserfecha_hastaChequesPagosAutorizados.setEnabled(false);
		jDateChooserfecha_hastaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaChequesPagosAutorizados.setDate(new Date());
		jDateChooserfecha_hastaChequesPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaChequesPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteChequesPagosAutorizados = new JLabelMe();
		this.jLabelnombre_clienteChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteChequesPagosAutorizados.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelnombre_clienteChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextAreanombre_clienteChequesPagosAutorizados= new JTextAreaMe();
		jTextAreanombre_clienteChequesPagosAutorizados.setEnabled(false);
		jTextAreanombre_clienteChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteChequesPagosAutorizados.setLineWrap(true);
		jTextAreanombre_clienteChequesPagosAutorizados.setWrapStyleWord(true);
		jTextAreanombre_clienteChequesPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteChequesPagosAutorizados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteChequesPagosAutorizados = new JScrollPane(jTextAreanombre_clienteChequesPagosAutorizados);
		jscrollPanenombre_clienteChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clienteChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaChequesPagosAutorizados = new JLabelMe();
		this.jLabelnumero_facturaChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaChequesPagosAutorizados.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelnumero_facturaChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextFieldnumero_facturaChequesPagosAutorizados= new JTextFieldMe();

		jTextFieldnumero_facturaChequesPagosAutorizados.setEnabled(false);
		jTextFieldnumero_facturaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localChequesPagosAutorizados = new JLabelMe();
		this.jLabeldebito_mone_localChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localChequesPagosAutorizados.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPaneldebito_mone_localChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextFielddebito_mone_localChequesPagosAutorizados= new JTextFieldMe();
		jTextFielddebito_mone_localChequesPagosAutorizados.setEnabled(false);
		jTextFielddebito_mone_localChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localChequesPagosAutorizados.setText("0.0");

		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelfechaChequesPagosAutorizados = new JLabelMe();
		this.jLabelfechaChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaChequesPagosAutorizados.setToolTipText("Fecha");
		this.jLabelfechaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelfechaChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		//jFormattedTextFieldfechaChequesPagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfechaChequesPagosAutorizados= new JDateChooser();
		jDateChooserfechaChequesPagosAutorizados.setEnabled(false);
		jDateChooserfechaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaChequesPagosAutorizados.setDate(new Date());
		jDateChooserfechaChequesPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaChequesPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfechaChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonfechaChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bancoChequesPagosAutorizados = new JLabelMe();
		this.jLabelnombre_bancoChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoChequesPagosAutorizados.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelnombre_bancoChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextAreanombre_bancoChequesPagosAutorizados= new JTextAreaMe();
		jTextAreanombre_bancoChequesPagosAutorizados.setEnabled(false);
		jTextAreanombre_bancoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoChequesPagosAutorizados.setLineWrap(true);
		jTextAreanombre_bancoChequesPagosAutorizados.setWrapStyleWord(true);
		jTextAreanombre_bancoChequesPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoChequesPagosAutorizados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoChequesPagosAutorizados = new JScrollPane(jTextAreanombre_bancoChequesPagosAutorizados);
		jscrollPanenombre_bancoChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelvalorChequesPagosAutorizados = new JLabelMe();
		this.jLabelvalorChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorChequesPagosAutorizados.setToolTipText("Valor");
		this.jLabelvalorChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelvalorChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextFieldvalorChequesPagosAutorizados= new JTextFieldMe();
		jTextFieldvalorChequesPagosAutorizados.setEnabled(false);
		jTextFieldvalorChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorChequesPagosAutorizados.setText("0.0");

		this.jButtonvalorChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonvalorChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonvalorChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeChequesPagosAutorizados = new JLabelMe();
		this.jLabelnumero_chequeChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE+" : *");
		this.jLabelnumero_chequeChequesPagosAutorizados.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelnumero_chequeChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextFieldnumero_chequeChequesPagosAutorizados= new JTextFieldMe();

		jTextFieldnumero_chequeChequesPagosAutorizados.setEnabled(false);
		jTextFieldnumero_chequeChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeChequesPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaChequesPagosAutorizados = new JLabelMe();
		this.jLabelnumero_cuentaChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaChequesPagosAutorizados.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelnumero_cuentaChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jTextFieldnumero_cuentaChequesPagosAutorizados= new JTextFieldMe();

		jTextFieldnumero_cuentaChequesPagosAutorizados.setEnabled(false);
		jTextFieldnumero_cuentaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaChequesPagosAutorizadosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysChequesPagosAutorizados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaChequesPagosAutorizados = new JLabelMe();
		this.jLabelid_empresaChequesPagosAutorizados.setText(""+ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaChequesPagosAutorizados.setToolTipText("Empresa");
		this.jLabelid_empresaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaChequesPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaChequesPagosAutorizados.setToolTipText(ChequesPagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		this.jPanelid_empresaChequesPagosAutorizados.setLayout(this.gridaBagLayoutChequesPagosAutorizados);


		jComboBoxid_empresaChequesPagosAutorizados= new JComboBoxMe();
		jComboBoxid_empresaChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaChequesPagosAutorizados.setEnabled(false);

		this.jButtonid_empresaChequesPagosAutorizados= new JButtonMe();
		this.jButtonid_empresaChequesPagosAutorizados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaChequesPagosAutorizados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaChequesPagosAutorizados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaChequesPagosAutorizados.setText("Buscar");
		this.jButtonid_empresaChequesPagosAutorizados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaChequesPagosAutorizados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaChequesPagosAutorizados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaChequesPagosAutorizados"));

		this.jButtonid_empresaChequesPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setText("U");
		this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaChequesPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaChequesPagosAutorizadosBusqueda"));

		if(this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaChequesPagosAutorizadosBusqueda.setVisible(false);		}

		this.jButtonid_empresaChequesPagosAutorizadosUpdate= new JButtonMe();
		this.jButtonid_empresaChequesPagosAutorizadosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequesPagosAutorizadosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaChequesPagosAutorizadosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaChequesPagosAutorizadosUpdate.setText("U");
		this.jButtonid_empresaChequesPagosAutorizadosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaChequesPagosAutorizadosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaChequesPagosAutorizadosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaChequesPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaChequesPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaChequesPagosAutorizadosUpdate"));



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
		//this.jInternalFrameDetalleChequesPagosAutorizados = new ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cheques Pagos Autorizados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutChequesPagosAutorizados= new GridBagLayout();
		

		
		String sToolTipChequesPagosAutorizados="";
		sToolTipChequesPagosAutorizados=ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipChequesPagosAutorizados+="(Tesoreria.ChequesPagosAutorizados)";
		}
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			sToolTipChequesPagosAutorizados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoChequesPagosAutorizados = new JButtonMe();
		this.jButtonModificarChequesPagosAutorizados = new JButtonMe();
        this.jButtonActualizarChequesPagosAutorizados = new JButtonMe();
        this.jButtonEliminarChequesPagosAutorizados = new JButtonMe();
        this.jButtonCancelarChequesPagosAutorizados = new JButtonMe();
        this.jButtonGuardarCambiosChequesPagosAutorizados = new JButtonMe();
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados = new JButtonMe();
		this.jButtonCerrarChequesPagosAutorizados = new JButtonMe();
		
		this.jScrollPanelDatosChequesPagosAutorizados = new JScrollPane();   
        this.jScrollPanelDatosEdicionChequesPagosAutorizados = new JScrollPane();
		this.jScrollPanelDatosGeneralChequesPagosAutorizados = new JScrollPane();
				
		
		
		this.jPanelCamposChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cheques Pagos Autorizados";
		
		if(!this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cheques Pagos Autorizadoses" + this.sPath));
		} else {
			this.jScrollPanelDatosChequesPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposChequesPagosAutorizados.setName("jPanelCamposChequesPagosAutorizados"); 

		this.jPanelCamposOcultosChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosChequesPagosAutorizados.setName("jPanelCamposOcultosChequesPagosAutorizados"); 

        this.jPanelAccionesChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesChequesPagosAutorizados.setToolTipText("Acciones");
        this.jPanelAccionesChequesPagosAutorizados.setName("Acciones"); 

		this.jPanelAccionesFormularioChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioChequesPagosAutorizados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioChequesPagosAutorizados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoChequesPagosAutorizados.setText("Nuevo");
		this.jButtonModificarChequesPagosAutorizados.setText("Editar");
        this.jButtonActualizarChequesPagosAutorizados.setText("Actualizar");
        this.jButtonEliminarChequesPagosAutorizados.setText("Eliminar");
        this.jButtonCancelarChequesPagosAutorizados.setText("Cancelar");
        this.jButtonGuardarCambiosChequesPagosAutorizados.setText("Guardar");
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.setText("Guardar");
		this.jButtonCerrarChequesPagosAutorizados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoChequesPagosAutorizados,"nuevo_button","Nuevo",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarChequesPagosAutorizados,"modificar_button","Editar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarChequesPagosAutorizados,"actualizar_button","Actualizar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarChequesPagosAutorizados,"eliminar_button","Eliminar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarChequesPagosAutorizados,"cancelar_button","Cancelar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosChequesPagosAutorizados,"guardarcambios_button","Guardar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaChequesPagosAutorizados,"guardarcambiostabla_button","Guardar",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarChequesPagosAutorizados,"cerrar_button","Salir",this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoChequesPagosAutorizados.setToolTipText("Nuevo"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarChequesPagosAutorizados.setToolTipText("Editar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarChequesPagosAutorizados.setToolTipText("Actualizar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarChequesPagosAutorizados.setToolTipText("Eliminar)"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarChequesPagosAutorizados.setToolTipText("Cancelar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosChequesPagosAutorizados.setToolTipText("Guardar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.setToolTipText("Guardar"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarChequesPagosAutorizados.setToolTipText("Salir"+" "+ChequesPagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoChequesPagosAutorizados";
		inputMap = this.jButtonNuevoChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoChequesPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoChequesPagosAutorizados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarChequesPagosAutorizados";
		inputMap = this.jButtonActualizarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarChequesPagosAutorizados"));
		
		//ELIMINAR
		sMapKey = "EliminarChequesPagosAutorizados";
		inputMap = this.jButtonEliminarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarChequesPagosAutorizados"));
		
		//CANCELAR	
		sMapKey = "CancelarChequesPagosAutorizados";
		inputMap = this.jButtonCancelarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarChequesPagosAutorizados"));
		
		//CERRAR		
		sMapKey = "CerrarChequesPagosAutorizados";
		inputMap = this.jButtonCerrarChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarChequesPagosAutorizados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaChequesPagosAutorizados";
		inputMap = this.jButtonGuardarCambiosTablaChequesPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaChequesPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaChequesPagosAutorizados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoChequesPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoChequesPagosAutorizados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoChequesPagosAutorizados.setToolTipText("Nuevo ChequesPagosAutorizados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarChequesPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarChequesPagosAutorizados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarChequesPagosAutorizados.setToolTipText("Sin Cerrar Ventana ChequesPagosAutorizados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeChequesPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeChequesPagosAutorizados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeChequesPagosAutorizados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesChequesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesChequesPagosAutorizados = new JLabelMe();
		
		this.jLabelAccionesChequesPagosAutorizados.setText("Acciones");		
		this.jLabelAccionesChequesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesChequesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposChequesPagosAutorizados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysChequesPagosAutorizados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesChequesPagosAutorizados=new JTabbedPane();
		this.jTabbedPaneRelacionesChequesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesChequesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposChequesPagosAutorizados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosChequesPagosAutorizados = new GridBagLayout();
		
		this.jPanelCamposChequesPagosAutorizados.setLayout(gridaBagLayoutCamposChequesPagosAutorizados);
		this.jPanelCamposOcultosChequesPagosAutorizados.setLayout(gridaBagLayoutCamposOcultosChequesPagosAutorizados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidChequesPagosAutorizados.add(jLabelIdChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidChequesPagosAutorizados.add(jLabelidChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaChequesPagosAutorizados.add(jLabelid_empresaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaChequesPagosAutorizados.add(jButtonid_empresaChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 3;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaChequesPagosAutorizados.add(jButtonid_empresaChequesPagosAutorizadosUpdate, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaChequesPagosAutorizados.add(jComboBoxid_empresaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeChequesPagosAutorizados.add(jLabelfecha_desdeChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeChequesPagosAutorizados.add(jButtonfecha_desdeChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeChequesPagosAutorizados.add(jDateChooserfecha_desdeChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaChequesPagosAutorizados.add(jLabelfecha_hastaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaChequesPagosAutorizados.add(jButtonfecha_hastaChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaChequesPagosAutorizados.add(jDateChooserfecha_hastaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteChequesPagosAutorizados.add(jLabelnombre_clienteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteChequesPagosAutorizados.add(jButtonnombre_clienteChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteChequesPagosAutorizados.add(jscrollPanenombre_clienteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaChequesPagosAutorizados.add(jLabelnumero_facturaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaChequesPagosAutorizados.add(jButtonnumero_facturaChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaChequesPagosAutorizados.add(jTextFieldnumero_facturaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localChequesPagosAutorizados.add(jLabeldebito_mone_localChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localChequesPagosAutorizados.add(jButtondebito_mone_localChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localChequesPagosAutorizados.add(jTextFielddebito_mone_localChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaChequesPagosAutorizados.add(jLabelfechaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaChequesPagosAutorizados.add(jButtonfechaChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaChequesPagosAutorizados.add(jDateChooserfechaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoChequesPagosAutorizados.add(jLabelnombre_bancoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoChequesPagosAutorizados.add(jButtonnombre_bancoChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoChequesPagosAutorizados.add(jscrollPanenombre_bancoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorChequesPagosAutorizados.add(jLabelvalorChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorChequesPagosAutorizados.add(jButtonvalorChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorChequesPagosAutorizados.add(jTextFieldvalorChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeChequesPagosAutorizados.add(jLabelnumero_chequeChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeChequesPagosAutorizados.add(jButtonnumero_chequeChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeChequesPagosAutorizados.add(jTextFieldnumero_chequeChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaChequesPagosAutorizados.add(jLabelnumero_cuentaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 2;
		this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaChequesPagosAutorizados.add(jButtonnumero_cuentaChequesPagosAutorizadosBusqueda, this.gridBagConstraintsChequesPagosAutorizados);
	}

	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = 1;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaChequesPagosAutorizados.add(jTextFieldnumero_cuentaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelidChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelfecha_desdeChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelfecha_hastaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelnombre_clienteChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelnumero_facturaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPaneldebito_mone_localChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelfechaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelnombre_bancoChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelvalorChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelnumero_chequeChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposChequesPagosAutorizados.add(this.jPanelnumero_cuentaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposChequesPagosAutorizados % 1==0) {
		iXPanelCamposChequesPagosAutorizados=0;
		iYPanelCamposChequesPagosAutorizados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsChequesPagosAutorizados.gridy = iYPanelCamposOcultosChequesPagosAutorizados;
	this.gridBagConstraintsChequesPagosAutorizados.gridx = iXPanelCamposOcultosChequesPagosAutorizados++;
	this.gridBagConstraintsChequesPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsChequesPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosChequesPagosAutorizados.add(this.jPanelid_empresaChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);



	if(iXPanelCamposOcultosChequesPagosAutorizados % 1==0) {
		iXPanelCamposOcultosChequesPagosAutorizados=0;
		iYPanelCamposOcultosChequesPagosAutorizados++;
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
			
		GridBagLayout gridaBagLayoutAccionesChequesPagosAutorizados= new GridBagLayout();
		this.jPanelAccionesChequesPagosAutorizados.setLayout(gridaBagLayoutAccionesChequesPagosAutorizados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioChequesPagosAutorizados= new GridBagLayout();
		this.jPanelAccionesFormularioChequesPagosAutorizados.setLayout(gridaBagLayoutAccionesFormularioChequesPagosAutorizados);
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioChequesPagosAutorizados.add(this.jComboBoxTiposAccionesFormularioChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccion++;
			
		this.jPanelAccionesChequesPagosAutorizados.add(this.jButtonModificarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);							

		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;
		this.gridBagConstraintsChequesPagosAutorizados.gridx =iPosXAccion++;
			
		this.jPanelAccionesChequesPagosAutorizados.add(this.jButtonEliminarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccion++;
		
		this.jPanelAccionesChequesPagosAutorizados.add(this.jButtonActualizarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);


		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = iPosXAccion++;
		
		this.jPanelAccionesChequesPagosAutorizados.add(this.jButtonGuardarCambiosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);	
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = 0;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx =iPosXAccion++;
		
		this.jPanelAccionesChequesPagosAutorizados.add(this.jButtonCancelarChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutChequesPagosAutorizados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutChequesPagosAutorizados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.chequespagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();						
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;		
			//this.gridBagConstraintsChequesPagosAutorizados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsChequesPagosAutorizados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsChequesPagosAutorizados.gridx =0;
		this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsChequesPagosAutorizados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ChequesPagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleChequesPagosAutorizados = new ChequesPagosAutorizadosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cheques Pagos Autorizados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cheques Pagos Autorizados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cheques Pagos Autorizados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ChequesPagosAutorizadosModel chequespagosautorizadosModel=new ChequesPagosAutorizadosModel(this);
			
			//SI USARA CLASE INTERNA
			//ChequesPagosAutorizadosModel.ChequesPagosAutorizadosFocusTraversalPolicy chequespagosautorizadosFocusTraversalPolicy = chequespagosautorizadosModel.new ChequesPagosAutorizadosFocusTraversalPolicy(this);
			
			//chequespagosautorizadosFocusTraversalPolicy.setchequespagosautorizadosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(chequespagosautorizadosModel);
			
			
			this.jContentPaneDetalleChequesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleChequesPagosAutorizados = new GridBagLayout();	
			this.jContentPaneDetalleChequesPagosAutorizados.setLayout(gridaBagLayoutDetalleChequesPagosAutorizados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosChequesPagosAutorizados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
				this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
					
				
				this.jContentPaneDetalleChequesPagosAutorizados.add(jTtoolBarDetalleChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);								
				
}
			
			this.jScrollPanelDatosEdicionChequesPagosAutorizados=   new JScrollPane(jContentPaneDetalleChequesPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralChequesPagosAutorizados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	        
			this.jContentPaneDetalleChequesPagosAutorizados.add(jPanelCamposChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);
			
			
			
			
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
						//&& chequespagosautorizadosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.chequespagosautorizadosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsChequesPagosAutorizados= new GridBagConstraints();
						this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
						this.jContentPaneDetalleChequesPagosAutorizados.add(this.jTabbedPaneRelacionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesChequesPagosAutorizados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosChequesPagosAutorizados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
					this.gridBagConstraintsChequesPagosAutorizados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
					
				
					this.jContentPaneDetalleChequesPagosAutorizados.add(jPanelCamposOcultosChequesPagosAutorizados, gridBagConstraintsChequesPagosAutorizados);
				
					this.jPanelCamposOcultosChequesPagosAutorizados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	        this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleChequesPagosAutorizados.add(this.jPanelAccionesFormularioChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);							
			
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
	        this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
	        
			
			this.jContentPaneDetalleChequesPagosAutorizados.add(this.jPanelAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionChequesPagosAutorizados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionChequesPagosAutorizados=   new JScrollPane(this.jPanelCamposChequesPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionChequesPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequesPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionChequesPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
			this.gridBagConstraintsChequesPagosAutorizados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsChequesPagosAutorizados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsChequesPagosAutorizados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);			
			
			this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
			
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		
			
		this.gridBagConstraintsChequesPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsChequesPagosAutorizados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsChequesPagosAutorizados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesChequesPagosAutorizados, this.gridBagConstraintsChequesPagosAutorizados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralChequesPagosAutorizados;//jContentPane;
		
		return jScrollPanelDatosEdicionChequesPagosAutorizados;
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
