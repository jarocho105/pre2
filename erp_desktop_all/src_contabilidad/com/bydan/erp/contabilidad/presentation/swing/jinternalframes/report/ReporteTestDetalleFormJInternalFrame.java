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
import com.bydan.erp.contabilidad.util.report.ReporteTestConstantesFunciones;

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
public class ReporteTestDetalleFormJInternalFrame extends ReporteTestBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReporteTest;
	
	protected JMenuBar jmenuBarDetalleReporteTest;
	
	protected JMenu jmenuDetalleReporteTest;
	protected JMenu jmenuDetalleArchivoReporteTest;
	protected JMenu jmenuDetalleAccionesReporteTest;
	protected JMenu jmenuDetalleDatosReporteTest;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReporteTest;	
	protected GridBagConstraints gridBagConstraintsReporteTest;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReporteTestBeanSwingJInternalFrameAdditional jInternalFrameDetalleReporteTest;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public ReporteTestSessionBean reportetestSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public ReporteTestLogic reportetestLogic;
	
	public JScrollPane jScrollPanelDatosReporteTest;
	public JScrollPane jScrollPanelDatosEdicionReporteTest;
	public JScrollPane jScrollPanelDatosGeneralReporteTest;
	
	protected JPanel jPanelCamposReporteTest;    
	protected JPanel jPanelCamposOcultosReporteTest;    	
	protected JPanel jPanelAccionesReporteTest;
	protected JPanel jPanelAccionesFormularioReporteTest;
    
	
	
	protected Integer iXPanelCamposReporteTest=0;
	protected Integer iYPanelCamposReporteTest=0;
	
	protected Integer iXPanelCamposOcultosReporteTest=0;
	protected Integer iYPanelCamposOcultosReporteTest=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReporteTest;
	public JButton jButtonModificarReporteTest;
	public JButton jButtonActualizarReporteTest;
    public JButton jButtonEliminarReporteTest;
	public JButton jButtonCancelarReporteTest;
    public JButton jButtonGuardarCambiosReporteTest;
	public JButton jButtonGuardarCambiosTablaReporteTest;
	protected JButton jButtonCerrarReporteTest;
	
	
	protected JButton jButtonProcesarInformacionReporteTest;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReporteTest;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReporteTest;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReporteTest;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReporteTest;
	protected JButton jButtonModificarToolBarReporteTest;
	protected JButton jButtonActualizarToolBarReporteTest;
    protected JButton jButtonEliminarToolBarReporteTest;
	protected JButton jButtonCancelarToolBarReporteTest;
    protected JButton jButtonGuardarCambiosToolBarReporteTest;
	protected JButton jButtonGuardarCambiosTablaToolBarReporteTest;
	protected JButton jButtonMostrarOcultarTablaToolBarReporteTest;
	protected JButton jButtonCerrarToolBarReporteTest;
	
	protected JButton jButtonProcesarInformacionToolBarReporteTest;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReporteTest;
	protected JMenuItem jMenuItemModificarReporteTest;
	protected JMenuItem jMenuItemActualizarReporteTest;
    protected JMenuItem jMenuItemEliminarReporteTest;
	protected JMenuItem jMenuItemCancelarReporteTest;
    protected JMenuItem jMenuItemGuardarCambiosReporteTest;
	protected JMenuItem jMenuItemGuardarCambiosTablaReporteTest;
	protected JMenuItem jMenuItemCerrarReporteTest;
	protected JMenuItem jMenuItemDetalleCerrarReporteTest;
	protected JMenuItem jMenuItemDetalleMostarOcultarReporteTest;
	
	protected JMenuItem jMenuItemProcesarInformacionReporteTest;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReporteTest;
	protected JMenuItem jMenuItemMostrarOcultarReporteTest;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReporteTest;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReporteTest;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReporteTest;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReporteTest;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReporteTest;
	public JLabel jLabelIdReporteTest;
	public JLabel jLabelidReporteTest;
	public JButton jButtonidReporteTestBusqueda= new JButtonMe();

	public JPanel jPanelnombreReporteTest;
	public JLabel jLabelnombreReporteTest;
	public JTextField jTextFieldnombreReporteTest;
	public JButton jButtonnombreReporteTestBusqueda= new JButtonMe();

	public JPanel jPanelubicacionReporteTest;
	public JLabel jLabelubicacionReporteTest;
	public JTextArea jTextAreaubicacionReporteTest;
	public JScrollPane jscrollPaneubicacionReporteTest;
	public JButton jButtonubicacionReporteTestBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaReporteTest;
	public JLabel jLabelid_empresaReporteTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaReporteTest;
	public JButton jButtonid_empresaReporteTest= new JButtonMe();
	public JButton jButtonid_empresaReporteTestUpdate= new JButtonMe();
	public JButton jButtonid_empresaReporteTestBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloReporteTest;
	public JLabel jLabelid_moduloReporteTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloReporteTest;
	public JButton jButtonid_moduloReporteTest= new JButtonMe();
	public JButton jButtonid_moduloReporteTestUpdate= new JButtonMe();
	public JButton jButtonid_moduloReporteTestBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoReporteTest;
	public JLabel jLabelid_tipo_movimientoReporteTest;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoReporteTest;
	public JButton jButtonid_tipo_movimientoReporteTest= new JButtonMe();
	public JButton jButtonid_tipo_movimientoReporteTestUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoReporteTestBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReporteTest;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReporteTestDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReporteTest=new JPanel();
				this.jPanelAccionesFormularioReporteTest=new JPanel();
				this.jmenuBarDetalleReporteTest=new JMenuBar();
				this.jTtoolBarDetalleReporteTest=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReporteTestDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReporteTestDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ReporteTest No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarReporteTest() {
		return this.jButtonActualizarToolBarReporteTest;
	}
	
	public JButton getjButtonEliminarToolBarReporteTest() {
		return this.jButtonEliminarToolBarReporteTest;
	}
	
	public JButton getjButtonCancelarToolBarReporteTest() {
		return this.jButtonCancelarToolBarReporteTest;
	}		
	
	public JButton getjButtonProcesarInformacionReporteTest() {
		return this.jButtonProcesarInformacionReporteTest;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReporteTest)	{
		this.jButtonProcesarInformacionReporteTest = jButtonProcesarInformacionReporteTest;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReporteTest() {
		return this.jComboBoxTiposAccionesReporteTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReporteTest(
			JComboBox jComboBoxTiposRelacionesReporteTest) {
		this.jComboBoxTiposRelacionesReporteTest = jComboBoxTiposRelacionesReporteTest;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReporteTest(
			JComboBox jComboBoxTiposAccionesReporteTest) {
		this.jComboBoxTiposAccionesReporteTest = jComboBoxTiposAccionesReporteTest;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReporteTest() {
		return this.jComboBoxTiposAccionesFormularioReporteTest;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReporteTest(
			JComboBox jComboBoxTiposAccionesFormularioReporteTest) {
		this.jComboBoxTiposAccionesFormularioReporteTest = jComboBoxTiposAccionesFormularioReporteTest;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.reportetestSessionBean=new ReporteTestSessionBean();
		
		this.reportetestSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.reportetestSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.reportetestSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReporteTestJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReporteTestJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReporteTestJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Reporte Test MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
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
	
		ReporteTestJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReporteTest= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReporteTest=new JButtonMe();
				this.jButtonModificarToolBarReporteTest=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReporteTest,this.jTtoolBarDetalleReporteTest,
							"actualizar","actualizar","Actualizar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReporteTest,this.jTtoolBarDetalleReporteTest,
							"eliminar","eliminar","Eliminar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReporteTest,this.jTtoolBarDetalleReporteTest,
							"cancelar","cancelar","Cancelar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReporteTest=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReporteTest,this.jTtoolBarDetalleReporteTest,
							"guardarcambios","guardarcambios","Guardar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReporteTest=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReporteTest=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReporteTest=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReporteTest=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReporteTest=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReporteTest= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReporteTest.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReporteTest,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReporteTest= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReporteTest.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReporteTest,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReporteTest= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReporteTest.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReporteTest,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReporteTest= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReporteTest.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReporteTest,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReporteTest= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReporteTest.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReporteTest,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReporteTest= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReporteTest.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReporteTest,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReporteTest= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReporteTest.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReporteTest,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReporteTest= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReporteTest.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReporteTest,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReporteTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReporteTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReporteTest,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReporteTest= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReporteTest.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReporteTest,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReporteTest.add(this.jMenuItemDetalleCerrarReporteTest);
		
		this.jmenuDetalleAccionesReporteTest.add(this.jMenuItemActualizarReporteTest);
		this.jmenuDetalleAccionesReporteTest.add(this.jMenuItemEliminarReporteTest);
		this.jmenuDetalleAccionesReporteTest.add(this.jMenuItemCancelarReporteTest);		
		
		//this.jmenuDetalleDatosReporteTest.add(this.jMenuItemDetalleAbrirOrderByReporteTest);				
		this.jmenuDetalleDatosReporteTest.add(this.jMenuItemDetalleMostarOcultarReporteTest);				
				
		//this.jmenuDetalleAccionesReporteTest.add(this.jMenuItemGuardarCambiosReporteTest);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReporteTest.add(this.jmenuDetalleArchivoReporteTest);		
		this.jmenuBarDetalleReporteTest.add(this.jmenuDetalleAccionesReporteTest);		
		this.jmenuBarDetalleReporteTest.add(this.jmenuDetalleDatosReporteTest);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReporteTest);				
	}
	
	
	public void inicializarElementosCamposReporteTest() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReporteTest = new JLabelMe();
		jLabelIdReporteTest.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReporteTest = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReporteTest.setToolTipText(ReporteTestConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReporteTest= new GridBagLayout();

		this.jPanelidReporteTest.setLayout(this.gridaBagLayoutReporteTest);

		jLabelidReporteTest = new JLabel();
		jLabelidReporteTest.setText("Id");

		jLabelidReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreReporteTest = new JLabelMe();
		this.jLabelnombreReporteTest.setText(""+ReporteTestConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreReporteTest.setToolTipText("Nombre");
		this.jLabelnombreReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreReporteTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreReporteTest.setToolTipText(ReporteTestConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutReporteTest = new GridBagLayout();
		this.jPanelnombreReporteTest.setLayout(this.gridaBagLayoutReporteTest);


		jTextFieldnombreReporteTest= new JTextFieldMe();

		jTextFieldnombreReporteTest.setEnabled(false);
		jTextFieldnombreReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreReporteTestBusqueda= new JButtonMe();
		this.jButtonnombreReporteTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReporteTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReporteTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreReporteTestBusqueda.setText("U");
		this.jButtonnombreReporteTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreReporteTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreReporteTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreReporteTestBusqueda"));

		if(this.reportetestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreReporteTestBusqueda.setVisible(false);		}


					
		this.jLabelubicacionReporteTest = new JLabelMe();
		this.jLabelubicacionReporteTest.setText(""+ReporteTestConstantesFunciones.LABEL_UBICACION+" : *");
		this.jLabelubicacionReporteTest.setToolTipText("Ubicacion");
		this.jLabelubicacionReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelubicacionReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelubicacionReporteTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelubicacionReporteTest.setToolTipText(ReporteTestConstantesFunciones.LABEL_UBICACION);
		this.gridaBagLayoutReporteTest = new GridBagLayout();
		this.jPanelubicacionReporteTest.setLayout(this.gridaBagLayoutReporteTest);


		jTextAreaubicacionReporteTest= new JTextAreaMe();
		jTextAreaubicacionReporteTest.setEnabled(false);
		jTextAreaubicacionReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionReporteTest.setLineWrap(true);
		jTextAreaubicacionReporteTest.setWrapStyleWord(true);
		jTextAreaubicacionReporteTest.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaubicacionReporteTest.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaubicacionReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneubicacionReporteTest = new JScrollPane(jTextAreaubicacionReporteTest);
		jscrollPaneubicacionReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonubicacionReporteTestBusqueda= new JButtonMe();
		this.jButtonubicacionReporteTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionReporteTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionReporteTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonubicacionReporteTestBusqueda.setText("U");
		this.jButtonubicacionReporteTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonubicacionReporteTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonubicacionReporteTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaubicacionReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaubicacionReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ubicacionReporteTestBusqueda"));

		if(this.reportetestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonubicacionReporteTestBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReporteTest() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaReporteTest = new JLabelMe();
		this.jLabelid_empresaReporteTest.setText(""+ReporteTestConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaReporteTest.setToolTipText("Empresa");
		this.jLabelid_empresaReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaReporteTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaReporteTest.setToolTipText(ReporteTestConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutReporteTest = new GridBagLayout();
		this.jPanelid_empresaReporteTest.setLayout(this.gridaBagLayoutReporteTest);


		jComboBoxid_empresaReporteTest= new JComboBoxMe();
		jComboBoxid_empresaReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaReporteTest.setEnabled(false);

		this.jButtonid_empresaReporteTest= new JButtonMe();
		this.jButtonid_empresaReporteTest.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReporteTest.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReporteTest.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReporteTest.setText("Buscar");
		this.jButtonid_empresaReporteTest.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaReporteTest.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReporteTest,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReporteTest"));

		this.jButtonid_empresaReporteTestBusqueda= new JButtonMe();
		this.jButtonid_empresaReporteTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReporteTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReporteTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReporteTestBusqueda.setText("U");
		this.jButtonid_empresaReporteTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaReporteTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReporteTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReporteTestBusqueda"));

		if(this.reportetestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaReporteTestBusqueda.setVisible(false);		}

		this.jButtonid_empresaReporteTestUpdate= new JButtonMe();
		this.jButtonid_empresaReporteTestUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReporteTestUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReporteTestUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReporteTestUpdate.setText("U");
		this.jButtonid_empresaReporteTestUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaReporteTestUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReporteTestUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReporteTestUpdate"));



					
		this.jLabelid_moduloReporteTest = new JLabelMe();
		this.jLabelid_moduloReporteTest.setText(""+ReporteTestConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloReporteTest.setToolTipText("Modulo");
		this.jLabelid_moduloReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloReporteTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloReporteTest.setToolTipText(ReporteTestConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutReporteTest = new GridBagLayout();
		this.jPanelid_moduloReporteTest.setLayout(this.gridaBagLayoutReporteTest);


		jComboBoxid_moduloReporteTest= new JComboBoxMe();
		jComboBoxid_moduloReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloReporteTest.setEnabled(false);

		this.jButtonid_moduloReporteTest= new JButtonMe();
		this.jButtonid_moduloReporteTest.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloReporteTest.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloReporteTest.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloReporteTest.setText("Buscar");
		this.jButtonid_moduloReporteTest.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloReporteTest.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloReporteTest,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloReporteTest"));

		this.jButtonid_moduloReporteTestBusqueda= new JButtonMe();
		this.jButtonid_moduloReporteTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloReporteTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloReporteTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloReporteTestBusqueda.setText("U");
		this.jButtonid_moduloReporteTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloReporteTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloReporteTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloReporteTestBusqueda"));

		if(this.reportetestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloReporteTestBusqueda.setVisible(false);		}

		this.jButtonid_moduloReporteTestUpdate= new JButtonMe();
		this.jButtonid_moduloReporteTestUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloReporteTestUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloReporteTestUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloReporteTestUpdate.setText("U");
		this.jButtonid_moduloReporteTestUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloReporteTestUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloReporteTestUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloReporteTestUpdate"));



					
		this.jLabelid_tipo_movimientoReporteTest = new JLabelMe();
		this.jLabelid_tipo_movimientoReporteTest.setText(""+ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoReporteTest.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoReporteTest=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoReporteTest.setToolTipText(ReporteTestConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutReporteTest = new GridBagLayout();
		this.jPanelid_tipo_movimientoReporteTest.setLayout(this.gridaBagLayoutReporteTest);


		jComboBoxid_tipo_movimientoReporteTest= new JComboBoxMe();
		jComboBoxid_tipo_movimientoReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoReporteTest= new JButtonMe();
		this.jButtonid_tipo_movimientoReporteTest.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoReporteTest.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoReporteTest.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoReporteTest.setText("Buscar");
		this.jButtonid_tipo_movimientoReporteTest.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoReporteTest.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoReporteTest,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoReporteTest"));

		this.jButtonid_tipo_movimientoReporteTestBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoReporteTestBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoReporteTestBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoReporteTestBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoReporteTestBusqueda.setText("U");
		this.jButtonid_tipo_movimientoReporteTestBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoReporteTestBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoReporteTestBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoReporteTestBusqueda"));

		if(this.reportetestSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoReporteTestBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoReporteTestUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoReporteTestUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoReporteTestUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoReporteTestUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoReporteTestUpdate.setText("U");
		this.jButtonid_tipo_movimientoReporteTestUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoReporteTestUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoReporteTestUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoReporteTest.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoReporteTest.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoReporteTestUpdate"));



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
		//this.jInternalFrameDetalleReporteTest = new ReporteTestBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Reporte Test DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReporteTest= new GridBagLayout();
		

		
		String sToolTipReporteTest="";
		sToolTipReporteTest=ReporteTestConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReporteTest+="(Contabilidad.ReporteTest)";
		}
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			sToolTipReporteTest+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReporteTest = new JButtonMe();
		this.jButtonModificarReporteTest = new JButtonMe();
        this.jButtonActualizarReporteTest = new JButtonMe();
        this.jButtonEliminarReporteTest = new JButtonMe();
        this.jButtonCancelarReporteTest = new JButtonMe();
        this.jButtonGuardarCambiosReporteTest = new JButtonMe();
		this.jButtonGuardarCambiosTablaReporteTest = new JButtonMe();
		this.jButtonCerrarReporteTest = new JButtonMe();
		
		this.jScrollPanelDatosReporteTest = new JScrollPane();   
        this.jScrollPanelDatosEdicionReporteTest = new JScrollPane();
		this.jScrollPanelDatosGeneralReporteTest = new JScrollPane();
				
		
		
		this.jPanelCamposReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Reporte Test";
		
		if(!this.reportetestSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reporte Testes" + this.sPath));
		} else {
			this.jScrollPanelDatosReporteTest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReporteTest.setName("jPanelCamposReporteTest"); 

		this.jPanelCamposOcultosReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReporteTest.setName("jPanelCamposOcultosReporteTest"); 

        this.jPanelAccionesReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReporteTest.setToolTipText("Acciones");
        this.jPanelAccionesReporteTest.setName("Acciones"); 

		this.jPanelAccionesFormularioReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReporteTest.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReporteTest.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReporteTest.setText("Nuevo");
		this.jButtonModificarReporteTest.setText("Editar");
        this.jButtonActualizarReporteTest.setText("Actualizar");
        this.jButtonEliminarReporteTest.setText("Eliminar");
        this.jButtonCancelarReporteTest.setText("Cancelar");
        this.jButtonGuardarCambiosReporteTest.setText("Guardar");
		this.jButtonGuardarCambiosTablaReporteTest.setText("Guardar");
		this.jButtonCerrarReporteTest.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReporteTest,"nuevo_button","Nuevo",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReporteTest,"modificar_button","Editar",this.reportetestSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReporteTest,"actualizar_button","Actualizar",this.reportetestSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReporteTest,"eliminar_button","Eliminar",this.reportetestSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReporteTest,"cancelar_button","Cancelar",this.reportetestSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReporteTest,"guardarcambios_button","Guardar",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReporteTest,"guardarcambiostabla_button","Guardar",this.reportetestSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteTest,"cerrar_button","Salir",this.reportetestSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReporteTest.setToolTipText("Nuevo"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReporteTest.setToolTipText("Editar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReporteTest.setToolTipText("Actualizar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReporteTest.setToolTipText("Eliminar)"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReporteTest.setToolTipText("Cancelar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReporteTest.setToolTipText("Guardar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReporteTest.setToolTipText("Guardar"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReporteTest.setToolTipText("Salir"+" "+ReporteTestConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReporteTest";
		inputMap = this.jButtonNuevoReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReporteTest.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReporteTest"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReporteTest";
		inputMap = this.jButtonActualizarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReporteTest"));
		
		//ELIMINAR
		sMapKey = "EliminarReporteTest";
		inputMap = this.jButtonEliminarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReporteTest"));
		
		//CANCELAR	
		sMapKey = "CancelarReporteTest";
		inputMap = this.jButtonCancelarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReporteTest"));
		
		//CERRAR		
		sMapKey = "CerrarReporteTest";
		inputMap = this.jButtonCerrarReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReporteTest"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReporteTest";
		inputMap = this.jButtonGuardarCambiosTablaReporteTest.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReporteTest.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReporteTest"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReporteTest = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReporteTest.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReporteTest.setToolTipText("Nuevo ReporteTest");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReporteTest = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReporteTest.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReporteTest.setToolTipText("Sin Cerrar Ventana ReporteTest");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReporteTest = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReporteTest.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReporteTest.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReporteTest.setText("Accion");
		this.jComboBoxTiposAccionesReporteTest.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReporteTest = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReporteTest.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReporteTest.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReporteTest = new JLabelMe();
		
		this.jLabelAccionesReporteTest.setText("Acciones");		
		this.jLabelAccionesReporteTest.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReporteTest.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReporteTest.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReporteTest();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReporteTest();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReporteTest=new JTabbedPane();
		this.jTabbedPaneRelacionesReporteTest.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReporteTest,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReporteTest.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReporteTest.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReporteTest.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReporteTest, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReporteTest.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReporteTest.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReporteTest.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReporteTest, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReporteTest = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReporteTest = new GridBagLayout();
		
		this.jPanelCamposReporteTest.setLayout(gridaBagLayoutCamposReporteTest);
		this.jPanelCamposOcultosReporteTest.setLayout(gridaBagLayoutCamposOcultosReporteTest);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 0;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReporteTest.add(jLabelIdReporteTest, this.gridBagConstraintsReporteTest);



	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 1;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReporteTest.add(jLabelidReporteTest, this.gridBagConstraintsReporteTest);


	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 0;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaReporteTest.add(jLabelid_empresaReporteTest, this.gridBagConstraintsReporteTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 2;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReporteTest.add(jButtonid_empresaReporteTestBusqueda, this.gridBagConstraintsReporteTest);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 3;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReporteTest.add(jButtonid_empresaReporteTestUpdate, this.gridBagConstraintsReporteTest);
	}

	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 1;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaReporteTest.add(jComboBoxid_empresaReporteTest, this.gridBagConstraintsReporteTest);


	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 0;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloReporteTest.add(jLabelid_moduloReporteTest, this.gridBagConstraintsReporteTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 2;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloReporteTest.add(jButtonid_moduloReporteTestBusqueda, this.gridBagConstraintsReporteTest);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 3;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloReporteTest.add(jButtonid_moduloReporteTestUpdate, this.gridBagConstraintsReporteTest);
	}

	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 1;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloReporteTest.add(jComboBoxid_moduloReporteTest, this.gridBagConstraintsReporteTest);


	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 0;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoReporteTest.add(jLabelid_tipo_movimientoReporteTest, this.gridBagConstraintsReporteTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 2;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoReporteTest.add(jButtonid_tipo_movimientoReporteTestBusqueda, this.gridBagConstraintsReporteTest);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 3;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoReporteTest.add(jButtonid_tipo_movimientoReporteTestUpdate, this.gridBagConstraintsReporteTest);
	}

	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 1;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoReporteTest.add(jComboBoxid_tipo_movimientoReporteTest, this.gridBagConstraintsReporteTest);


	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 0;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreReporteTest.add(jLabelnombreReporteTest, this.gridBagConstraintsReporteTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 2;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreReporteTest.add(jButtonnombreReporteTestBusqueda, this.gridBagConstraintsReporteTest);
	}

	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 1;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreReporteTest.add(jTextFieldnombreReporteTest, this.gridBagConstraintsReporteTest);


	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 0;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelubicacionReporteTest.add(jLabelubicacionReporteTest, this.gridBagConstraintsReporteTest);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		//this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = 2;
		this.gridBagConstraintsReporteTest.ipadx = 0;
		this.gridBagConstraintsReporteTest.insets = new Insets(0, 0, 0, 0);
		this.jPanelubicacionReporteTest.add(jButtonubicacionReporteTestBusqueda, this.gridBagConstraintsReporteTest);
	}

	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReporteTest.gridy = 0;
	this.gridBagConstraintsReporteTest.gridx = 1;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelubicacionReporteTest.add(jscrollPaneubicacionReporteTest, this.gridBagConstraintsReporteTest);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReporteTest.gridy = iYPanelCamposReporteTest;
	this.gridBagConstraintsReporteTest.gridx = iXPanelCamposReporteTest++;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReporteTest.add(this.jPanelidReporteTest, this.gridBagConstraintsReporteTest);



	if(iXPanelCamposReporteTest % 1==0) {
		iXPanelCamposReporteTest=0;
		iYPanelCamposReporteTest++;
	}
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReporteTest.gridy = iYPanelCamposReporteTest;
	this.gridBagConstraintsReporteTest.gridx = iXPanelCamposReporteTest++;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReporteTest.add(this.jPanelid_tipo_movimientoReporteTest, this.gridBagConstraintsReporteTest);



	if(iXPanelCamposReporteTest % 1==0) {
		iXPanelCamposReporteTest=0;
		iYPanelCamposReporteTest++;
	}
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReporteTest.gridy = iYPanelCamposReporteTest;
	this.gridBagConstraintsReporteTest.gridx = iXPanelCamposReporteTest++;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReporteTest.add(this.jPanelnombreReporteTest, this.gridBagConstraintsReporteTest);



	if(iXPanelCamposReporteTest % 1==0) {
		iXPanelCamposReporteTest=0;
		iYPanelCamposReporteTest++;
	}
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReporteTest.gridy = iYPanelCamposReporteTest;
	this.gridBagConstraintsReporteTest.gridx = iXPanelCamposReporteTest++;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReporteTest.add(this.jPanelubicacionReporteTest, this.gridBagConstraintsReporteTest);



	if(iXPanelCamposReporteTest % 1==0) {
		iXPanelCamposReporteTest=0;
		iYPanelCamposReporteTest++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReporteTest.gridy = iYPanelCamposOcultosReporteTest;
	this.gridBagConstraintsReporteTest.gridx = iXPanelCamposOcultosReporteTest++;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosReporteTest.add(this.jPanelid_empresaReporteTest, this.gridBagConstraintsReporteTest);



	if(iXPanelCamposOcultosReporteTest % 1==0) {
		iXPanelCamposOcultosReporteTest=0;
		iYPanelCamposOcultosReporteTest++;
	}
	this.gridBagConstraintsReporteTest = new GridBagConstraints();
	this.gridBagConstraintsReporteTest.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReporteTest.gridy = iYPanelCamposOcultosReporteTest;
	this.gridBagConstraintsReporteTest.gridx = iXPanelCamposOcultosReporteTest++;
	this.gridBagConstraintsReporteTest.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReporteTest.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosReporteTest.add(this.jPanelid_moduloReporteTest, this.gridBagConstraintsReporteTest);



	if(iXPanelCamposOcultosReporteTest % 1==0) {
		iXPanelCamposOcultosReporteTest=0;
		iYPanelCamposOcultosReporteTest++;
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
			
		GridBagLayout gridaBagLayoutAccionesReporteTest= new GridBagLayout();
		this.jPanelAccionesReporteTest.setLayout(gridaBagLayoutAccionesReporteTest);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReporteTest= new GridBagLayout();
		this.jPanelAccionesFormularioReporteTest.setLayout(gridaBagLayoutAccionesFormularioReporteTest);
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReporteTest.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReporteTest.add(this.jComboBoxTiposAccionesFormularioReporteTest, this.gridBagConstraintsReporteTest);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx = iPosXAccion++;
			
		this.jPanelAccionesReporteTest.add(this.jButtonModificarReporteTest, this.gridBagConstraintsReporteTest);							

		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReporteTest.gridy = 0;
		this.gridBagConstraintsReporteTest.gridx =iPosXAccion++;
			
		this.jPanelAccionesReporteTest.add(this.jButtonEliminarReporteTest, this.gridBagConstraintsReporteTest);
		
			
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = 0;		
		this.gridBagConstraintsReporteTest.gridx = iPosXAccion++;
		
		this.jPanelAccionesReporteTest.add(this.jButtonActualizarReporteTest, this.gridBagConstraintsReporteTest);


		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = 0;		
		this.gridBagConstraintsReporteTest.gridx = iPosXAccion++;
		
		this.jPanelAccionesReporteTest.add(this.jButtonGuardarCambiosReporteTest, this.gridBagConstraintsReporteTest);	
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = 0;		
		this.gridBagConstraintsReporteTest.gridx =iPosXAccion++;
		
		this.jPanelAccionesReporteTest.add(this.jButtonCancelarReporteTest, this.gridBagConstraintsReporteTest);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReporteTest = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReporteTest);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.reportetestSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReporteTest = new GridBagConstraints();						
			this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReporteTest.gridx = 0;		
			//this.gridBagConstraintsReporteTest.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReporteTest.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReporteTest.gridx =0;
		this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReporteTest.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReporteTest, this.gridBagConstraintsReporteTest);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReporteTestJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReporteTest = new ReporteTestBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Reporte Test DATOS");
			
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
			
	        //this.setTitle("[FOR] - Reporte Test DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Reporte Test Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReporteTestModel reportetestModel=new ReporteTestModel(this);
			
			//SI USARA CLASE INTERNA
			//ReporteTestModel.ReporteTestFocusTraversalPolicy reportetestFocusTraversalPolicy = reportetestModel.new ReporteTestFocusTraversalPolicy(this);
			
			//reportetestFocusTraversalPolicy.setreportetestJInternalFrame(this);
			
			this.setFocusTraversalPolicy(reportetestModel);
			
			
			this.jContentPaneDetalleReporteTest = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReporteTest = new GridBagLayout();	
			this.jContentPaneDetalleReporteTest.setLayout(gridaBagLayoutDetalleReporteTest);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReporteTest = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReporteTest = new GridBagConstraints();
				this.gridBagConstraintsReporteTest.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReporteTest.gridx = 0;
					
				
				this.jContentPaneDetalleReporteTest.add(jTtoolBarDetalleReporteTest, gridBagConstraintsReporteTest);								
				
}
			
			this.jScrollPanelDatosEdicionReporteTest=   new JScrollPane(jContentPaneDetalleReporteTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReporteTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReporteTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReporteTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReporteTest=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReporteTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReporteTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReporteTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReporteTest.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReporteTest.gridx = 0;
	        
			this.jContentPaneDetalleReporteTest.add(jPanelCamposReporteTest, gridBagConstraintsReporteTest);
			
			
			
			
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
						//&& reportetestSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.reportetestSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReporteTest= new GridBagConstraints();
						this.gridBagConstraintsReporteTest.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReporteTest.gridx = 0;
						this.jContentPaneDetalleReporteTest.add(this.jTabbedPaneRelacionesReporteTest, this.gridBagConstraintsReporteTest);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReporteTest.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReporteTest.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReporteTest = new GridBagConstraints();
					this.gridBagConstraintsReporteTest.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReporteTest.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReporteTest.gridx = 0;
					
				
					this.jContentPaneDetalleReporteTest.add(jPanelCamposOcultosReporteTest, gridBagConstraintsReporteTest);
				
					this.jPanelCamposOcultosReporteTest.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsReporteTest.gridx = 0;
	        this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReporteTest.add(this.jPanelAccionesFormularioReporteTest, this.gridBagConstraintsReporteTest);							
			
			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
	        this.gridBagConstraintsReporteTest.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsReporteTest.gridx = 0;
	        
			
			this.jContentPaneDetalleReporteTest.add(this.jPanelAccionesReporteTest, this.gridBagConstraintsReporteTest);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReporteTest);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReporteTest=   new JScrollPane(this.jPanelCamposReporteTest,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReporteTest.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReporteTest.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReporteTest.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReporteTest.gridx = 0;
			this.gridBagConstraintsReporteTest.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReporteTest.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReporteTest.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReporteTest, this.gridBagConstraintsReporteTest);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReporteTest.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReporteTest, this.gridBagConstraintsReporteTest);			
			
			this.gridBagConstraintsReporteTest = new GridBagConstraints();
			this.gridBagConstraintsReporteTest.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReporteTest.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReporteTest, this.gridBagConstraintsReporteTest);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReporteTest, this.gridBagConstraintsReporteTest);
			
			
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReporteTest, this.gridBagConstraintsReporteTest);
		
			
		this.gridBagConstraintsReporteTest = new GridBagConstraints();
		this.gridBagConstraintsReporteTest.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReporteTest.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReporteTest, this.gridBagConstraintsReporteTest);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReporteTest;//jContentPane;
		
		return jScrollPanelDatosEdicionReporteTest;
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
