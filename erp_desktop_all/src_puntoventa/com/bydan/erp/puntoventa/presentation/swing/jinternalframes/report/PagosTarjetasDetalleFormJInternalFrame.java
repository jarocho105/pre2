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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.PagosTarjetasConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class PagosTarjetasDetalleFormJInternalFrame extends PagosTarjetasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePagosTarjetas;
	
	protected JMenuBar jmenuBarDetallePagosTarjetas;
	
	protected JMenu jmenuDetallePagosTarjetas;
	protected JMenu jmenuDetalleArchivoPagosTarjetas;
	protected JMenu jmenuDetalleAccionesPagosTarjetas;
	protected JMenu jmenuDetalleDatosPagosTarjetas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosTarjetas;	
	protected GridBagConstraints gridBagConstraintsPagosTarjetas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PagosTarjetasBeanSwingJInternalFrameAdditional jInternalFrameDetallePagosTarjetas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PagosTarjetasSessionBean pagostarjetasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PagosTarjetasLogic pagostarjetasLogic;
	
	public JScrollPane jScrollPanelDatosPagosTarjetas;
	public JScrollPane jScrollPanelDatosEdicionPagosTarjetas;
	public JScrollPane jScrollPanelDatosGeneralPagosTarjetas;
	
	protected JPanel jPanelCamposPagosTarjetas;    
	protected JPanel jPanelCamposOcultosPagosTarjetas;    	
	protected JPanel jPanelAccionesPagosTarjetas;
	protected JPanel jPanelAccionesFormularioPagosTarjetas;
    
	
	
	protected Integer iXPanelCamposPagosTarjetas=0;
	protected Integer iYPanelCamposPagosTarjetas=0;
	
	protected Integer iXPanelCamposOcultosPagosTarjetas=0;
	protected Integer iYPanelCamposOcultosPagosTarjetas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPagosTarjetas;
	public JButton jButtonModificarPagosTarjetas;
	public JButton jButtonActualizarPagosTarjetas;
    public JButton jButtonEliminarPagosTarjetas;
	public JButton jButtonCancelarPagosTarjetas;
    public JButton jButtonGuardarCambiosPagosTarjetas;
	public JButton jButtonGuardarCambiosTablaPagosTarjetas;
	protected JButton jButtonCerrarPagosTarjetas;
	
	
	protected JButton jButtonProcesarInformacionPagosTarjetas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPagosTarjetas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPagosTarjetas;
	protected JCheckBox jCheckBoxPostAccionSinMensajePagosTarjetas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosTarjetas;
	protected JButton jButtonModificarToolBarPagosTarjetas;
	protected JButton jButtonActualizarToolBarPagosTarjetas;
    protected JButton jButtonEliminarToolBarPagosTarjetas;
	protected JButton jButtonCancelarToolBarPagosTarjetas;
    protected JButton jButtonGuardarCambiosToolBarPagosTarjetas;
	protected JButton jButtonGuardarCambiosTablaToolBarPagosTarjetas;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosTarjetas;
	protected JButton jButtonCerrarToolBarPagosTarjetas;
	
	protected JButton jButtonProcesarInformacionToolBarPagosTarjetas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosTarjetas;
	protected JMenuItem jMenuItemModificarPagosTarjetas;
	protected JMenuItem jMenuItemActualizarPagosTarjetas;
    protected JMenuItem jMenuItemEliminarPagosTarjetas;
	protected JMenuItem jMenuItemCancelarPagosTarjetas;
    protected JMenuItem jMenuItemGuardarCambiosPagosTarjetas;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosTarjetas;
	protected JMenuItem jMenuItemCerrarPagosTarjetas;
	protected JMenuItem jMenuItemDetalleCerrarPagosTarjetas;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosTarjetas;
	
	protected JMenuItem jMenuItemProcesarInformacionPagosTarjetas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosTarjetas;
	protected JMenuItem jMenuItemMostrarOcultarPagosTarjetas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosTarjetas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosTarjetas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosTarjetas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPagosTarjetas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPagosTarjetas;
	public JLabel jLabelIdPagosTarjetas;
	public JLabel jLabelidPagosTarjetas;
	public JButton jButtonidPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaPagosTarjetas;
	public JLabel jLabelfecha_hastaPagosTarjetas;
	//public JFormattedTextField jDateChooserfecha_hastaPagosTarjetas;

	public JDateChooser jDateChooserfecha_hastaPagosTarjetas;
	public JButton jButtonfecha_hastaPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asiento_contablePagosTarjetas;
	public JLabel jLabelcodigo_asiento_contablePagosTarjetas;
	public JTextField jTextFieldcodigo_asiento_contablePagosTarjetas;
	public JButton jButtoncodigo_asiento_contablePagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tarjeta_creditoPagosTarjetas;
	public JLabel jLabelcodigo_tarjeta_creditoPagosTarjetas;
	public JTextField jTextFieldcodigo_tarjeta_creditoPagosTarjetas;
	public JButton jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_interes_tarjetaPagosTarjetas;
	public JLabel jLabelnombre_tipo_interes_tarjetaPagosTarjetas;
	public JTextArea jTextAreanombre_tipo_interes_tarjetaPagosTarjetas;
	public JScrollPane jscrollPanenombre_tipo_interes_tarjetaPagosTarjetas;
	public JButton jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_conexionPagosTarjetas;
	public JLabel jLabelnombre_conexionPagosTarjetas;
	public JTextArea jTextAreanombre_conexionPagosTarjetas;
	public JScrollPane jscrollPanenombre_conexionPagosTarjetas;
	public JButton jButtonnombre_conexionPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_mesPagosTarjetas;
	public JLabel jLabelnombre_mesPagosTarjetas;
	public JTextField jTextFieldnombre_mesPagosTarjetas;
	public JButton jButtonnombre_mesPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelnumeroPagosTarjetas;
	public JLabel jLabelnumeroPagosTarjetas;
	public JTextField jTextFieldnumeroPagosTarjetas;
	public JButton jButtonnumeroPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanellotePagosTarjetas;
	public JLabel jLabellotePagosTarjetas;
	public JTextField jTextFieldlotePagosTarjetas;
	public JButton jButtonlotePagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelvalorPagosTarjetas;
	public JLabel jLabelvalorPagosTarjetas;
	public JTextField jTextFieldvalorPagosTarjetas;
	public JButton jButtonvalorPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_retencionPagosTarjetas;
	public JLabel jLabelvalor_retencionPagosTarjetas;
	public JTextField jTextFieldvalor_retencionPagosTarjetas;
	public JButton jButtonvalor_retencionPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_comisionPagosTarjetas;
	public JLabel jLabelvalor_comisionPagosTarjetas;
	public JTextField jTextFieldvalor_comisionPagosTarjetas;
	public JButton jButtonvalor_comisionPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_calculadoPagosTarjetas;
	public JLabel jLabelvalor_calculadoPagosTarjetas;
	public JTextField jTextFieldvalor_calculadoPagosTarjetas;
	public JButton jButtonvalor_calculadoPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_canceladoPagosTarjetas;
	public JLabel jLabelvalor_canceladoPagosTarjetas;
	public JTextField jTextFieldvalor_canceladoPagosTarjetas;
	public JButton jButtonvalor_canceladoPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelvalor_difierePagosTarjetas;
	public JLabel jLabelvalor_difierePagosTarjetas;
	public JTextField jTextFieldvalor_difierePagosTarjetas;
	public JButton jButtonvalor_difierePagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionPagosTarjetas;
	public JLabel jLabelnumero_retencionPagosTarjetas;
	public JTextField jTextFieldnumero_retencionPagosTarjetas;
	public JButton jButtonnumero_retencionPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_liquidacionPagosTarjetas;
	public JLabel jLabelnumero_liquidacionPagosTarjetas;
	public JTextField jTextFieldnumero_liquidacionPagosTarjetas;
	public JButton jButtonnumero_liquidacionPagosTarjetasBusqueda= new JButtonMe();

	public JPanel jPanelfechaPagosTarjetas;
	public JLabel jLabelfechaPagosTarjetas;
	//public JFormattedTextField jDateChooserfechaPagosTarjetas;

	public JDateChooser jDateChooserfechaPagosTarjetas;
	public JButton jButtonfechaPagosTarjetasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPagosTarjetas;
	public JLabel jLabelid_empresaPagosTarjetas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPagosTarjetas;
	public JButton jButtonid_empresaPagosTarjetas= new JButtonMe();
	public JButton jButtonid_empresaPagosTarjetasUpdate= new JButtonMe();
	public JButton jButtonid_empresaPagosTarjetasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPagosTarjetas;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PagosTarjetasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPagosTarjetas=new JPanel();
				this.jPanelAccionesFormularioPagosTarjetas=new JPanel();
				this.jmenuBarDetallePagosTarjetas=new JMenuBar();
				this.jTtoolBarDetallePagosTarjetas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PagosTarjetasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosTarjetasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosTarjetas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPagosTarjetas() {
		return this.jButtonActualizarToolBarPagosTarjetas;
	}
	
	public JButton getjButtonEliminarToolBarPagosTarjetas() {
		return this.jButtonEliminarToolBarPagosTarjetas;
	}
	
	public JButton getjButtonCancelarToolBarPagosTarjetas() {
		return this.jButtonCancelarToolBarPagosTarjetas;
	}		
	
	public JButton getjButtonProcesarInformacionPagosTarjetas() {
		return this.jButtonProcesarInformacionPagosTarjetas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosTarjetas)	{
		this.jButtonProcesarInformacionPagosTarjetas = jButtonProcesarInformacionPagosTarjetas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosTarjetas() {
		return this.jComboBoxTiposAccionesPagosTarjetas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosTarjetas(
			JComboBox jComboBoxTiposRelacionesPagosTarjetas) {
		this.jComboBoxTiposRelacionesPagosTarjetas = jComboBoxTiposRelacionesPagosTarjetas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosTarjetas(
			JComboBox jComboBoxTiposAccionesPagosTarjetas) {
		this.jComboBoxTiposAccionesPagosTarjetas = jComboBoxTiposAccionesPagosTarjetas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPagosTarjetas() {
		return this.jComboBoxTiposAccionesFormularioPagosTarjetas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPagosTarjetas(
			JComboBox jComboBoxTiposAccionesFormularioPagosTarjetas) {
		this.jComboBoxTiposAccionesFormularioPagosTarjetas = jComboBoxTiposAccionesFormularioPagosTarjetas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pagostarjetasSessionBean=new PagosTarjetasSessionBean();
		
		this.pagostarjetasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagostarjetasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagostarjetasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosTarjetasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosTarjetasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosTarjetasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Tarjetas MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
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
	
		PagosTarjetasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagosTarjetas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPagosTarjetas=new JButtonMe();
				this.jButtonModificarToolBarPagosTarjetas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPagosTarjetas,this.jTtoolBarDetallePagosTarjetas,
							"actualizar","actualizar","Actualizar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPagosTarjetas,this.jTtoolBarDetallePagosTarjetas,
							"eliminar","eliminar","Eliminar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPagosTarjetas,this.jTtoolBarDetallePagosTarjetas,
							"cancelar","cancelar","Cancelar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPagosTarjetas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPagosTarjetas,this.jTtoolBarDetallePagosTarjetas,
							"guardarcambios","guardarcambios","Guardar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePagosTarjetas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePagosTarjetas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPagosTarjetas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPagosTarjetas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPagosTarjetas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosTarjetas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosTarjetas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosTarjetas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPagosTarjetas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPagosTarjetas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPagosTarjetas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPagosTarjetas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPagosTarjetas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPagosTarjetas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPagosTarjetas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPagosTarjetas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPagosTarjetas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPagosTarjetas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPagosTarjetas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPagosTarjetas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPagosTarjetas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosTarjetas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosTarjetas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosTarjetas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosTarjetas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosTarjetas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPagosTarjetas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPagosTarjetas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPagosTarjetas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosTarjetas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosTarjetas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosTarjetas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosTarjetas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosTarjetas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosTarjetas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPagosTarjetas.add(this.jMenuItemDetalleCerrarPagosTarjetas);
		
		this.jmenuDetalleAccionesPagosTarjetas.add(this.jMenuItemActualizarPagosTarjetas);
		this.jmenuDetalleAccionesPagosTarjetas.add(this.jMenuItemEliminarPagosTarjetas);
		this.jmenuDetalleAccionesPagosTarjetas.add(this.jMenuItemCancelarPagosTarjetas);		
		
		//this.jmenuDetalleDatosPagosTarjetas.add(this.jMenuItemDetalleAbrirOrderByPagosTarjetas);				
		this.jmenuDetalleDatosPagosTarjetas.add(this.jMenuItemDetalleMostarOcultarPagosTarjetas);				
				
		//this.jmenuDetalleAccionesPagosTarjetas.add(this.jMenuItemGuardarCambiosPagosTarjetas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePagosTarjetas.add(this.jmenuDetalleArchivoPagosTarjetas);		
		this.jmenuBarDetallePagosTarjetas.add(this.jmenuDetalleAccionesPagosTarjetas);		
		this.jmenuBarDetallePagosTarjetas.add(this.jmenuDetalleDatosPagosTarjetas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePagosTarjetas);				
	}
	
	
	public void inicializarElementosCamposPagosTarjetas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPagosTarjetas = new JLabelMe();
		jLabelIdPagosTarjetas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPagosTarjetas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPagosTarjetas= new GridBagLayout();

		this.jPanelidPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);

		jLabelidPagosTarjetas = new JLabel();
		jLabelidPagosTarjetas.setText("Id");

		jLabelidPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_hastaPagosTarjetas = new JLabelMe();
		this.jLabelfecha_hastaPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaPagosTarjetas.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelfecha_hastaPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		//jFormattedTextFieldfecha_hastaPagosTarjetas= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaPagosTarjetas= new JDateChooser();
		jDateChooserfecha_hastaPagosTarjetas.setEnabled(false);
		jDateChooserfecha_hastaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaPagosTarjetas.setDate(new Date());
		jDateChooserfecha_hastaPagosTarjetas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaPagosTarjetas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonfecha_hastaPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaPagosTarjetasBusqueda.setText("U");
		this.jButtonfecha_hastaPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asiento_contablePagosTarjetas = new JLabelMe();
		this.jLabelcodigo_asiento_contablePagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+" : *");
		this.jLabelcodigo_asiento_contablePagosTarjetas.setToolTipText("Codigo Asiento Contable");
		this.jLabelcodigo_asiento_contablePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contablePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contablePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asiento_contablePagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asiento_contablePagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asiento_contablePagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelcodigo_asiento_contablePagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldcodigo_asiento_contablePagosTarjetas= new JTextFieldMe();

		jTextFieldcodigo_asiento_contablePagosTarjetas.setEnabled(false);
		jTextFieldcodigo_asiento_contablePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contablePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contablePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asiento_contablePagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda= new JButtonMe();
		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setText("U");
		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asiento_contablePagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asiento_contablePagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asiento_contablePagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asiento_contablePagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tarjeta_creditoPagosTarjetas = new JLabelMe();
		this.jLabelcodigo_tarjeta_creditoPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO+" : *");
		this.jLabelcodigo_tarjeta_creditoPagosTarjetas.setToolTipText("Codigo Tarjeta Credito");
		this.jLabelcodigo_tarjeta_creditoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tarjeta_creditoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tarjeta_creditoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tarjeta_creditoPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tarjeta_creditoPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tarjeta_creditoPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_CODIGOTARJETACREDITO);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelcodigo_tarjeta_creditoPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldcodigo_tarjeta_creditoPagosTarjetas= new JTextFieldMe();

		jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setEnabled(false);
		jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tarjeta_creditoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tarjeta_creditoPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda= new JButtonMe();
		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setText("U");
		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tarjeta_creditoPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tarjeta_creditoPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tarjeta_creditoPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_interes_tarjetaPagosTarjetas = new JLabelMe();
		this.jLabelnombre_tipo_interes_tarjetaPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA+" : *");
		this.jLabelnombre_tipo_interes_tarjetaPagosTarjetas.setToolTipText("Nombre Tipo Interes Tarjeta");
		this.jLabelnombre_tipo_interes_tarjetaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_interes_tarjetaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_interes_tarjetaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_interes_tarjetaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_NOMBRETIPOINTERESTARJETA);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas= new JTextAreaMe();
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setEnabled(false);
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setLineWrap(true);
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setWrapStyleWord(true);
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_interes_tarjetaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_interes_tarjetaPagosTarjetas = new JScrollPane(jTextAreanombre_tipo_interes_tarjetaPagosTarjetas);
		jscrollPanenombre_tipo_interes_tarjetaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_interes_tarjetaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_interes_tarjetaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setText("U");
		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_interes_tarjetaPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_interes_tarjetaPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_conexionPagosTarjetas = new JLabelMe();
		this.jLabelnombre_conexionPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION+" : *");
		this.jLabelnombre_conexionPagosTarjetas.setToolTipText("Nombre Conexion");
		this.jLabelnombre_conexionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_conexionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_conexionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_conexionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_conexionPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_conexionPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_NOMBRECONEXION);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelnombre_conexionPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextAreanombre_conexionPagosTarjetas= new JTextAreaMe();
		jTextAreanombre_conexionPagosTarjetas.setEnabled(false);
		jTextAreanombre_conexionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conexionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conexionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conexionPagosTarjetas.setLineWrap(true);
		jTextAreanombre_conexionPagosTarjetas.setWrapStyleWord(true);
		jTextAreanombre_conexionPagosTarjetas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_conexionPagosTarjetas.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_conexionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_conexionPagosTarjetas = new JScrollPane(jTextAreanombre_conexionPagosTarjetas);
		jscrollPanenombre_conexionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_conexionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_conexionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_conexionPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonnombre_conexionPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_conexionPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_conexionPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_conexionPagosTarjetasBusqueda.setText("U");
		this.jButtonnombre_conexionPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_conexionPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_conexionPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_conexionPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_conexionPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_conexionPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_conexionPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_mesPagosTarjetas = new JLabelMe();
		this.jLabelnombre_mesPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_NOMBREMES+" : *");
		this.jLabelnombre_mesPagosTarjetas.setToolTipText("Nombre Mes");
		this.jLabelnombre_mesPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_mesPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_mesPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_mesPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_mesPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_mesPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_NOMBREMES);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelnombre_mesPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldnombre_mesPagosTarjetas= new JTextFieldMe();

		jTextFieldnombre_mesPagosTarjetas.setEnabled(false);
		jTextFieldnombre_mesPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_mesPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_mesPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_mesPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_mesPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonnombre_mesPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_mesPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_mesPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_mesPagosTarjetasBusqueda.setText("U");
		this.jButtonnombre_mesPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_mesPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_mesPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_mesPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_mesPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_mesPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_mesPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelnumeroPagosTarjetas = new JLabelMe();
		this.jLabelnumeroPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroPagosTarjetas.setToolTipText("Numero");
		this.jLabelnumeroPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelnumeroPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldnumeroPagosTarjetas= new JTextFieldMe();

		jTextFieldnumeroPagosTarjetas.setEnabled(false);
		jTextFieldnumeroPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonnumeroPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroPagosTarjetasBusqueda.setText("U");
		this.jButtonnumeroPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabellotePagosTarjetas = new JLabelMe();
		this.jLabellotePagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabellotePagosTarjetas.setToolTipText("Lote");
		this.jLabellotePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellotePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellotePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellotePagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellotePagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellotePagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanellotePagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldlotePagosTarjetas= new JTextFieldMe();

		jTextFieldlotePagosTarjetas.setEnabled(false);
		jTextFieldlotePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlotePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlotePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlotePagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlotePagosTarjetasBusqueda= new JButtonMe();
		this.jButtonlotePagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlotePagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlotePagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlotePagosTarjetasBusqueda.setText("U");
		this.jButtonlotePagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlotePagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlotePagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlotePagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlotePagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lotePagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlotePagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelvalorPagosTarjetas = new JLabelMe();
		this.jLabelvalorPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPagosTarjetas.setToolTipText("Valor");
		this.jLabelvalorPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelvalorPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldvalorPagosTarjetas= new JTextFieldMe();
		jTextFieldvalorPagosTarjetas.setEnabled(false);
		jTextFieldvalorPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPagosTarjetas.setText("0.0");

		this.jButtonvalorPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonvalorPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPagosTarjetasBusqueda.setText("U");
		this.jButtonvalorPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_retencionPagosTarjetas = new JLabelMe();
		this.jLabelvalor_retencionPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION+" : *");
		this.jLabelvalor_retencionPagosTarjetas.setToolTipText("Valor Retencion");
		this.jLabelvalor_retencionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_retencionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_retencionPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_retencionPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_VALORRETENCION);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelvalor_retencionPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldvalor_retencionPagosTarjetas= new JTextFieldMe();
		jTextFieldvalor_retencionPagosTarjetas.setEnabled(false);
		jTextFieldvalor_retencionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_retencionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_retencionPagosTarjetas.setText("0.0");

		this.jButtonvalor_retencionPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonvalor_retencionPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_retencionPagosTarjetasBusqueda.setText("U");
		this.jButtonvalor_retencionPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_retencionPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_retencionPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_retencionPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_retencionPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_retencionPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_retencionPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_comisionPagosTarjetas = new JLabelMe();
		this.jLabelvalor_comisionPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION+" : *");
		this.jLabelvalor_comisionPagosTarjetas.setToolTipText("Valor Comision");
		this.jLabelvalor_comisionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_comisionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_comisionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_comisionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_comisionPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_comisionPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_VALORCOMISION);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelvalor_comisionPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldvalor_comisionPagosTarjetas= new JTextFieldMe();
		jTextFieldvalor_comisionPagosTarjetas.setEnabled(false);
		jTextFieldvalor_comisionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comisionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comisionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_comisionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_comisionPagosTarjetas.setText("0.0");

		this.jButtonvalor_comisionPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonvalor_comisionPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comisionPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comisionPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_comisionPagosTarjetasBusqueda.setText("U");
		this.jButtonvalor_comisionPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_comisionPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_comisionPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_comisionPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_comisionPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_comisionPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_comisionPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_calculadoPagosTarjetas = new JLabelMe();
		this.jLabelvalor_calculadoPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO+" : *");
		this.jLabelvalor_calculadoPagosTarjetas.setToolTipText("Valor Calculado");
		this.jLabelvalor_calculadoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_calculadoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_calculadoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_calculadoPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_calculadoPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_calculadoPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_VALORCALCULADO);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelvalor_calculadoPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldvalor_calculadoPagosTarjetas= new JTextFieldMe();
		jTextFieldvalor_calculadoPagosTarjetas.setEnabled(false);
		jTextFieldvalor_calculadoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_calculadoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_calculadoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_calculadoPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_calculadoPagosTarjetas.setText("0.0");

		this.jButtonvalor_calculadoPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonvalor_calculadoPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_calculadoPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_calculadoPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_calculadoPagosTarjetasBusqueda.setText("U");
		this.jButtonvalor_calculadoPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_calculadoPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_calculadoPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_calculadoPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_calculadoPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_calculadoPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_calculadoPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_canceladoPagosTarjetas = new JLabelMe();
		this.jLabelvalor_canceladoPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO+" : *");
		this.jLabelvalor_canceladoPagosTarjetas.setToolTipText("Valor Cancelado");
		this.jLabelvalor_canceladoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_canceladoPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_canceladoPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_canceladoPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_VALORCANCELADO);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelvalor_canceladoPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldvalor_canceladoPagosTarjetas= new JTextFieldMe();
		jTextFieldvalor_canceladoPagosTarjetas.setEnabled(false);
		jTextFieldvalor_canceladoPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_canceladoPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_canceladoPagosTarjetas.setText("0.0");

		this.jButtonvalor_canceladoPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonvalor_canceladoPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_canceladoPagosTarjetasBusqueda.setText("U");
		this.jButtonvalor_canceladoPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_canceladoPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_canceladoPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_canceladoPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_canceladoPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_canceladoPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_canceladoPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelvalor_difierePagosTarjetas = new JLabelMe();
		this.jLabelvalor_difierePagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE+" : *");
		this.jLabelvalor_difierePagosTarjetas.setToolTipText("Valor Difiere");
		this.jLabelvalor_difierePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_difierePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_difierePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_difierePagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_difierePagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_difierePagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_VALORDIFIERE);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelvalor_difierePagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldvalor_difierePagosTarjetas= new JTextFieldMe();
		jTextFieldvalor_difierePagosTarjetas.setEnabled(false);
		jTextFieldvalor_difierePagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_difierePagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_difierePagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_difierePagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_difierePagosTarjetas.setText("0.0");

		this.jButtonvalor_difierePagosTarjetasBusqueda= new JButtonMe();
		this.jButtonvalor_difierePagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_difierePagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_difierePagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_difierePagosTarjetasBusqueda.setText("U");
		this.jButtonvalor_difierePagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_difierePagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_difierePagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_difierePagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_difierePagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_difierePagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_difierePagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionPagosTarjetas = new JLabelMe();
		this.jLabelnumero_retencionPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION+" : *");
		this.jLabelnumero_retencionPagosTarjetas.setToolTipText("Numero Retencion");
		this.jLabelnumero_retencionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelnumero_retencionPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldnumero_retencionPagosTarjetas= new JTextFieldMe();

		jTextFieldnumero_retencionPagosTarjetas.setEnabled(false);
		jTextFieldnumero_retencionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonnumero_retencionPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionPagosTarjetasBusqueda.setText("U");
		this.jButtonnumero_retencionPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_liquidacionPagosTarjetas = new JLabelMe();
		this.jLabelnumero_liquidacionPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION+" : *");
		this.jLabelnumero_liquidacionPagosTarjetas.setToolTipText("Numero Liquidacion");
		this.jLabelnumero_liquidacionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_liquidacionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_liquidacionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_liquidacionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_liquidacionPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_liquidacionPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_NUMEROLIQUIDACION);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelnumero_liquidacionPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jTextFieldnumero_liquidacionPagosTarjetas= new JTextFieldMe();

		jTextFieldnumero_liquidacionPagosTarjetas.setEnabled(false);
		jTextFieldnumero_liquidacionPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_liquidacionPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_liquidacionPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_liquidacionPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_liquidacionPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setText("U");
		this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_liquidacionPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_liquidacionPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_liquidacionPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_liquidacionPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_liquidacionPagosTarjetasBusqueda.setVisible(false);		}


					
		this.jLabelfechaPagosTarjetas = new JLabelMe();
		this.jLabelfechaPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPagosTarjetas.setToolTipText("Fecha");
		this.jLabelfechaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelfechaPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		//jFormattedTextFieldfechaPagosTarjetas= new JFormattedTextFieldMe();

		jDateChooserfechaPagosTarjetas= new JDateChooser();
		jDateChooserfechaPagosTarjetas.setEnabled(false);
		jDateChooserfechaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPagosTarjetas.setDate(new Date());
		jDateChooserfechaPagosTarjetas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPagosTarjetas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonfechaPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPagosTarjetasBusqueda.setText("U");
		this.jButtonfechaPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPagosTarjetasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPagosTarjetas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPagosTarjetas = new JLabelMe();
		this.jLabelid_empresaPagosTarjetas.setText(""+PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPagosTarjetas.setToolTipText("Empresa");
		this.jLabelid_empresaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPagosTarjetas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPagosTarjetas.setToolTipText(PagosTarjetasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPagosTarjetas = new GridBagLayout();
		this.jPanelid_empresaPagosTarjetas.setLayout(this.gridaBagLayoutPagosTarjetas);


		jComboBoxid_empresaPagosTarjetas= new JComboBoxMe();
		jComboBoxid_empresaPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPagosTarjetas.setEnabled(false);

		this.jButtonid_empresaPagosTarjetas= new JButtonMe();
		this.jButtonid_empresaPagosTarjetas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosTarjetas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosTarjetas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosTarjetas.setText("Buscar");
		this.jButtonid_empresaPagosTarjetas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPagosTarjetas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosTarjetas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosTarjetas"));

		this.jButtonid_empresaPagosTarjetasBusqueda= new JButtonMe();
		this.jButtonid_empresaPagosTarjetasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosTarjetasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosTarjetasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosTarjetasBusqueda.setText("U");
		this.jButtonid_empresaPagosTarjetasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPagosTarjetasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosTarjetasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosTarjetasBusqueda"));

		if(this.pagostarjetasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPagosTarjetasBusqueda.setVisible(false);		}

		this.jButtonid_empresaPagosTarjetasUpdate= new JButtonMe();
		this.jButtonid_empresaPagosTarjetasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosTarjetasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosTarjetasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosTarjetasUpdate.setText("U");
		this.jButtonid_empresaPagosTarjetasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPagosTarjetasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosTarjetasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPagosTarjetas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosTarjetas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosTarjetasUpdate"));



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
		//this.jInternalFrameDetallePagosTarjetas = new PagosTarjetasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pagos Tarjetas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosTarjetas= new GridBagLayout();
		

		
		String sToolTipPagosTarjetas="";
		sToolTipPagosTarjetas=PagosTarjetasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosTarjetas+="(PuntoVenta.PagosTarjetas)";
		}
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosTarjetas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPagosTarjetas = new JButtonMe();
		this.jButtonModificarPagosTarjetas = new JButtonMe();
        this.jButtonActualizarPagosTarjetas = new JButtonMe();
        this.jButtonEliminarPagosTarjetas = new JButtonMe();
        this.jButtonCancelarPagosTarjetas = new JButtonMe();
        this.jButtonGuardarCambiosPagosTarjetas = new JButtonMe();
		this.jButtonGuardarCambiosTablaPagosTarjetas = new JButtonMe();
		this.jButtonCerrarPagosTarjetas = new JButtonMe();
		
		this.jScrollPanelDatosPagosTarjetas = new JScrollPane();   
        this.jScrollPanelDatosEdicionPagosTarjetas = new JScrollPane();
		this.jScrollPanelDatosGeneralPagosTarjetas = new JScrollPane();
				
		
		
		this.jPanelCamposPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Tarjetas";
		
		if(!this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Tarjetases" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosTarjetas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPagosTarjetas.setName("jPanelCamposPagosTarjetas"); 

		this.jPanelCamposOcultosPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPagosTarjetas.setName("jPanelCamposOcultosPagosTarjetas"); 

        this.jPanelAccionesPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosTarjetas.setToolTipText("Acciones");
        this.jPanelAccionesPagosTarjetas.setName("Acciones"); 

		this.jPanelAccionesFormularioPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPagosTarjetas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPagosTarjetas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPagosTarjetas.setText("Nuevo");
		this.jButtonModificarPagosTarjetas.setText("Editar");
        this.jButtonActualizarPagosTarjetas.setText("Actualizar");
        this.jButtonEliminarPagosTarjetas.setText("Eliminar");
        this.jButtonCancelarPagosTarjetas.setText("Cancelar");
        this.jButtonGuardarCambiosPagosTarjetas.setText("Guardar");
		this.jButtonGuardarCambiosTablaPagosTarjetas.setText("Guardar");
		this.jButtonCerrarPagosTarjetas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosTarjetas,"nuevo_button","Nuevo",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPagosTarjetas,"modificar_button","Editar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPagosTarjetas,"actualizar_button","Actualizar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPagosTarjetas,"eliminar_button","Eliminar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPagosTarjetas,"cancelar_button","Cancelar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPagosTarjetas,"guardarcambios_button","Guardar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosTarjetas,"guardarcambiostabla_button","Guardar",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosTarjetas,"cerrar_button","Salir",this.pagostarjetasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPagosTarjetas.setToolTipText("Nuevo"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPagosTarjetas.setToolTipText("Editar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPagosTarjetas.setToolTipText("Actualizar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPagosTarjetas.setToolTipText("Eliminar)"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPagosTarjetas.setToolTipText("Cancelar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPagosTarjetas.setToolTipText("Guardar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPagosTarjetas.setToolTipText("Guardar"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosTarjetas.setToolTipText("Salir"+" "+PagosTarjetasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosTarjetas";
		inputMap = this.jButtonNuevoPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosTarjetas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosTarjetas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPagosTarjetas";
		inputMap = this.jButtonActualizarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPagosTarjetas"));
		
		//ELIMINAR
		sMapKey = "EliminarPagosTarjetas";
		inputMap = this.jButtonEliminarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPagosTarjetas"));
		
		//CANCELAR	
		sMapKey = "CancelarPagosTarjetas";
		inputMap = this.jButtonCancelarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPagosTarjetas"));
		
		//CERRAR		
		sMapKey = "CerrarPagosTarjetas";
		inputMap = this.jButtonCerrarPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosTarjetas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosTarjetas";
		inputMap = this.jButtonGuardarCambiosTablaPagosTarjetas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosTarjetas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosTarjetas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPagosTarjetas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPagosTarjetas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPagosTarjetas.setToolTipText("Nuevo PagosTarjetas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPagosTarjetas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPagosTarjetas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPagosTarjetas.setToolTipText("Sin Cerrar Ventana PagosTarjetas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePagosTarjetas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePagosTarjetas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePagosTarjetas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosTarjetas.setText("Accion");
		this.jComboBoxTiposAccionesPagosTarjetas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPagosTarjetas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPagosTarjetas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPagosTarjetas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPagosTarjetas = new JLabelMe();
		
		this.jLabelAccionesPagosTarjetas.setText("Acciones");		
		this.jLabelAccionesPagosTarjetas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosTarjetas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosTarjetas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPagosTarjetas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPagosTarjetas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPagosTarjetas=new JTabbedPane();
		this.jTabbedPaneRelacionesPagosTarjetas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPagosTarjetas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPagosTarjetas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosTarjetas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosTarjetas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosTarjetas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPagosTarjetas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosTarjetas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosTarjetas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPagosTarjetas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPagosTarjetas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPagosTarjetas = new GridBagLayout();
		
		this.jPanelCamposPagosTarjetas.setLayout(gridaBagLayoutCamposPagosTarjetas);
		this.jPanelCamposOcultosPagosTarjetas.setLayout(gridaBagLayoutCamposOcultosPagosTarjetas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPagosTarjetas.add(jLabelIdPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPagosTarjetas.add(jLabelidPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPagosTarjetas.add(jLabelid_empresaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosTarjetas.add(jButtonid_empresaPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 3;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosTarjetas.add(jButtonid_empresaPagosTarjetasUpdate, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPagosTarjetas.add(jComboBoxid_empresaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaPagosTarjetas.add(jLabelfecha_hastaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaPagosTarjetas.add(jButtonfecha_hastaPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaPagosTarjetas.add(jDateChooserfecha_hastaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asiento_contablePagosTarjetas.add(jLabelcodigo_asiento_contablePagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asiento_contablePagosTarjetas.add(jButtoncodigo_asiento_contablePagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asiento_contablePagosTarjetas.add(jTextFieldcodigo_asiento_contablePagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tarjeta_creditoPagosTarjetas.add(jLabelcodigo_tarjeta_creditoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tarjeta_creditoPagosTarjetas.add(jButtoncodigo_tarjeta_creditoPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tarjeta_creditoPagosTarjetas.add(jTextFieldcodigo_tarjeta_creditoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas.add(jLabelnombre_tipo_interes_tarjetaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas.add(jButtonnombre_tipo_interes_tarjetaPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas.add(jscrollPanenombre_tipo_interes_tarjetaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_conexionPagosTarjetas.add(jLabelnombre_conexionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_conexionPagosTarjetas.add(jButtonnombre_conexionPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_conexionPagosTarjetas.add(jscrollPanenombre_conexionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_mesPagosTarjetas.add(jLabelnombre_mesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_mesPagosTarjetas.add(jButtonnombre_mesPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_mesPagosTarjetas.add(jTextFieldnombre_mesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroPagosTarjetas.add(jLabelnumeroPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroPagosTarjetas.add(jButtonnumeroPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroPagosTarjetas.add(jTextFieldnumeroPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellotePagosTarjetas.add(jLabellotePagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanellotePagosTarjetas.add(jButtonlotePagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellotePagosTarjetas.add(jTextFieldlotePagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPagosTarjetas.add(jLabelvalorPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPagosTarjetas.add(jButtonvalorPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPagosTarjetas.add(jTextFieldvalorPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_retencionPagosTarjetas.add(jLabelvalor_retencionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_retencionPagosTarjetas.add(jButtonvalor_retencionPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_retencionPagosTarjetas.add(jTextFieldvalor_retencionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_comisionPagosTarjetas.add(jLabelvalor_comisionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_comisionPagosTarjetas.add(jButtonvalor_comisionPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_comisionPagosTarjetas.add(jTextFieldvalor_comisionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_calculadoPagosTarjetas.add(jLabelvalor_calculadoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_calculadoPagosTarjetas.add(jButtonvalor_calculadoPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_calculadoPagosTarjetas.add(jTextFieldvalor_calculadoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_canceladoPagosTarjetas.add(jLabelvalor_canceladoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_canceladoPagosTarjetas.add(jButtonvalor_canceladoPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_canceladoPagosTarjetas.add(jTextFieldvalor_canceladoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_difierePagosTarjetas.add(jLabelvalor_difierePagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_difierePagosTarjetas.add(jButtonvalor_difierePagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_difierePagosTarjetas.add(jTextFieldvalor_difierePagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionPagosTarjetas.add(jLabelnumero_retencionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionPagosTarjetas.add(jButtonnumero_retencionPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionPagosTarjetas.add(jTextFieldnumero_retencionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_liquidacionPagosTarjetas.add(jLabelnumero_liquidacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_liquidacionPagosTarjetas.add(jButtonnumero_liquidacionPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_liquidacionPagosTarjetas.add(jTextFieldnumero_liquidacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 0;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPagosTarjetas.add(jLabelfechaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		//this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = 2;
		this.gridBagConstraintsPagosTarjetas.ipadx = 0;
		this.gridBagConstraintsPagosTarjetas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPagosTarjetas.add(jButtonfechaPagosTarjetasBusqueda, this.gridBagConstraintsPagosTarjetas);
	}

	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosTarjetas.gridy = 0;
	this.gridBagConstraintsPagosTarjetas.gridx = 1;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPagosTarjetas.add(jDateChooserfechaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelidPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelfecha_hastaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelcodigo_asiento_contablePagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelcodigo_tarjeta_creditoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelnombre_tipo_interes_tarjetaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelnombre_conexionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelnombre_mesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelnumeroPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanellotePagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelvalorPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelvalor_retencionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelvalor_comisionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelvalor_calculadoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelvalor_canceladoPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelvalor_difierePagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelnumero_retencionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelnumero_liquidacionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosTarjetas.add(this.jPanelfechaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposPagosTarjetas % 2==0) {
		iXPanelCamposPagosTarjetas=0;
		iYPanelCamposPagosTarjetas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosTarjetas.gridy = iYPanelCamposOcultosPagosTarjetas;
	this.gridBagConstraintsPagosTarjetas.gridx = iXPanelCamposOcultosPagosTarjetas++;
	this.gridBagConstraintsPagosTarjetas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosTarjetas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagosTarjetas.add(this.jPanelid_empresaPagosTarjetas, this.gridBagConstraintsPagosTarjetas);



	if(iXPanelCamposOcultosPagosTarjetas % 2==0) {
		iXPanelCamposOcultosPagosTarjetas=0;
		iYPanelCamposOcultosPagosTarjetas++;
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
			
		GridBagLayout gridaBagLayoutAccionesPagosTarjetas= new GridBagLayout();
		this.jPanelAccionesPagosTarjetas.setLayout(gridaBagLayoutAccionesPagosTarjetas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPagosTarjetas= new GridBagLayout();
		this.jPanelAccionesFormularioPagosTarjetas.setLayout(gridaBagLayoutAccionesFormularioPagosTarjetas);
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPagosTarjetas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPagosTarjetas.add(this.jComboBoxTiposAccionesFormularioPagosTarjetas, this.gridBagConstraintsPagosTarjetas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccion++;
			
		this.jPanelAccionesPagosTarjetas.add(this.jButtonModificarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);							

		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosTarjetas.gridy = 0;
		this.gridBagConstraintsPagosTarjetas.gridx =iPosXAccion++;
			
		this.jPanelAccionesPagosTarjetas.add(this.jButtonEliminarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = 0;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosTarjetas.add(this.jButtonActualizarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);


		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = 0;		
		this.gridBagConstraintsPagosTarjetas.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosTarjetas.add(this.jButtonGuardarCambiosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);	
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = 0;		
		this.gridBagConstraintsPagosTarjetas.gridx =iPosXAccion++;
		
		this.jPanelAccionesPagosTarjetas.add(this.jButtonCancelarPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosTarjetas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosTarjetas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagostarjetasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();						
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosTarjetas.gridx = 0;		
			//this.gridBagConstraintsPagosTarjetas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosTarjetas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosTarjetas.gridx =0;
		this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosTarjetas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PagosTarjetasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePagosTarjetas = new PagosTarjetasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pagos Tarjetas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pagos Tarjetas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Tarjetas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PagosTarjetasModel pagostarjetasModel=new PagosTarjetasModel(this);
			
			//SI USARA CLASE INTERNA
			//PagosTarjetasModel.PagosTarjetasFocusTraversalPolicy pagostarjetasFocusTraversalPolicy = pagostarjetasModel.new PagosTarjetasFocusTraversalPolicy(this);
			
			//pagostarjetasFocusTraversalPolicy.setpagostarjetasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pagostarjetasModel);
			
			
			this.jContentPaneDetallePagosTarjetas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePagosTarjetas = new GridBagLayout();	
			this.jContentPaneDetallePagosTarjetas.setLayout(gridaBagLayoutDetallePagosTarjetas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosTarjetas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
				this.gridBagConstraintsPagosTarjetas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPagosTarjetas.gridx = 0;
					
				
				this.jContentPaneDetallePagosTarjetas.add(jTtoolBarDetallePagosTarjetas, gridBagConstraintsPagosTarjetas);								
				
}
			
			this.jScrollPanelDatosEdicionPagosTarjetas=   new JScrollPane(jContentPaneDetallePagosTarjetas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosTarjetas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosTarjetas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosTarjetas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPagosTarjetas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosTarjetas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosTarjetas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosTarjetas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPagosTarjetas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPagosTarjetas.gridx = 0;
	        
			this.jContentPaneDetallePagosTarjetas.add(jPanelCamposPagosTarjetas, gridBagConstraintsPagosTarjetas);
			
			
			
			
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
						//&& pagostarjetasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pagostarjetasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPagosTarjetas= new GridBagConstraints();
						this.gridBagConstraintsPagosTarjetas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPagosTarjetas.gridx = 0;
						this.jContentPaneDetallePagosTarjetas.add(this.jTabbedPaneRelacionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPagosTarjetas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPagosTarjetas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
					this.gridBagConstraintsPagosTarjetas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPagosTarjetas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPagosTarjetas.gridx = 0;
					
				
					this.jContentPaneDetallePagosTarjetas.add(jPanelCamposOcultosPagosTarjetas, gridBagConstraintsPagosTarjetas);
				
					this.jPanelCamposOcultosPagosTarjetas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPagosTarjetas.gridx = 0;
	        this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePagosTarjetas.add(this.jPanelAccionesFormularioPagosTarjetas, this.gridBagConstraintsPagosTarjetas);							
			
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
	        this.gridBagConstraintsPagosTarjetas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPagosTarjetas.gridx = 0;
	        
			
			this.jContentPaneDetallePagosTarjetas.add(this.jPanelAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPagosTarjetas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPagosTarjetas=   new JScrollPane(this.jPanelCamposPagosTarjetas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosTarjetas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosTarjetas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosTarjetas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPagosTarjetas.gridx = 0;
			this.gridBagConstraintsPagosTarjetas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPagosTarjetas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPagosTarjetas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosTarjetas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPagosTarjetas, this.gridBagConstraintsPagosTarjetas);			
			
			this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
			this.gridBagConstraintsPagosTarjetas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosTarjetas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
			
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		
			
		this.gridBagConstraintsPagosTarjetas = new GridBagConstraints();
		this.gridBagConstraintsPagosTarjetas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosTarjetas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosTarjetas, this.gridBagConstraintsPagosTarjetas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPagosTarjetas;//jContentPane;
		
		return jScrollPanelDatosEdicionPagosTarjetas;
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
