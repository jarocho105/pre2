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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.report.*;
import com.bydan.erp.cartera.util.report.SaldosCuentasPorPagarConstantesFunciones;

import com.bydan.erp.cartera.business.logic.report.*;
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
public class SaldosCuentasPorPagarDetalleFormJInternalFrame extends SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSaldosCuentasPorPagar;
	
	protected JMenuBar jmenuBarDetalleSaldosCuentasPorPagar;
	
	protected JMenu jmenuDetalleSaldosCuentasPorPagar;
	protected JMenu jmenuDetalleArchivoSaldosCuentasPorPagar;
	protected JMenu jmenuDetalleAccionesSaldosCuentasPorPagar;
	protected JMenu jmenuDetalleDatosSaldosCuentasPorPagar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldosCuentasPorPagar;	
	protected GridBagConstraints gridBagConstraintsSaldosCuentasPorPagar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional jInternalFrameDetalleSaldosCuentasPorPagar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public SaldosCuentasPorPagarSessionBean saldoscuentasporpagarSessionBean;
	
	
	
	
	public ZonaSessionBean zonaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public SaldosCuentasPorPagarLogic saldoscuentasporpagarLogic;
	
	public JScrollPane jScrollPanelDatosSaldosCuentasPorPagar;
	public JScrollPane jScrollPanelDatosEdicionSaldosCuentasPorPagar;
	public JScrollPane jScrollPanelDatosGeneralSaldosCuentasPorPagar;
	
	protected JPanel jPanelCamposSaldosCuentasPorPagar;    
	protected JPanel jPanelCamposOcultosSaldosCuentasPorPagar;    	
	protected JPanel jPanelAccionesSaldosCuentasPorPagar;
	protected JPanel jPanelAccionesFormularioSaldosCuentasPorPagar;
    
	
	
	protected Integer iXPanelCamposSaldosCuentasPorPagar=0;
	protected Integer iYPanelCamposSaldosCuentasPorPagar=0;
	
	protected Integer iXPanelCamposOcultosSaldosCuentasPorPagar=0;
	protected Integer iYPanelCamposOcultosSaldosCuentasPorPagar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSaldosCuentasPorPagar;
	public JButton jButtonModificarSaldosCuentasPorPagar;
	public JButton jButtonActualizarSaldosCuentasPorPagar;
    public JButton jButtonEliminarSaldosCuentasPorPagar;
	public JButton jButtonCancelarSaldosCuentasPorPagar;
    public JButton jButtonGuardarCambiosSaldosCuentasPorPagar;
	public JButton jButtonGuardarCambiosTablaSaldosCuentasPorPagar;
	protected JButton jButtonCerrarSaldosCuentasPorPagar;
	
	
	protected JButton jButtonProcesarInformacionSaldosCuentasPorPagar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSaldosCuentasPorPagar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldosCuentasPorPagar;
	protected JButton jButtonModificarToolBarSaldosCuentasPorPagar;
	protected JButton jButtonActualizarToolBarSaldosCuentasPorPagar;
    protected JButton jButtonEliminarToolBarSaldosCuentasPorPagar;
	protected JButton jButtonCancelarToolBarSaldosCuentasPorPagar;
    protected JButton jButtonGuardarCambiosToolBarSaldosCuentasPorPagar;
	protected JButton jButtonGuardarCambiosTablaToolBarSaldosCuentasPorPagar;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldosCuentasPorPagar;
	protected JButton jButtonCerrarToolBarSaldosCuentasPorPagar;
	
	protected JButton jButtonProcesarInformacionToolBarSaldosCuentasPorPagar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemModificarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemActualizarSaldosCuentasPorPagar;
    protected JMenuItem jMenuItemEliminarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemCancelarSaldosCuentasPorPagar;
    protected JMenuItem jMenuItemGuardarCambiosSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemCerrarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemDetalleCerrarSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar;
	
	protected JMenuItem jMenuItemProcesarInformacionSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldosCuentasPorPagar;
	protected JMenuItem jMenuItemMostrarOcultarSaldosCuentasPorPagar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldosCuentasPorPagar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldosCuentasPorPagar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSaldosCuentasPorPagar;
	public JLabel jLabelIdSaldosCuentasPorPagar;
	public JLabel jLabelidSaldosCuentasPorPagar;
	public JButton jButtonidSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaSaldosCuentasPorPagar;
	public JLabel jLabelfecha_emision_hastaSaldosCuentasPorPagar;
	//public JFormattedTextField jDateChooserfecha_emision_hastaSaldosCuentasPorPagar;

	public JDateChooser jDateChooserfecha_emision_hastaSaldosCuentasPorPagar;
	public JButton jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelcodigoSaldosCuentasPorPagar;
	public JLabel jLabelcodigoSaldosCuentasPorPagar;
	public JTextField jTextFieldcodigoSaldosCuentasPorPagar;
	public JButton jButtoncodigoSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoSaldosCuentasPorPagar;
	public JLabel jLabelnombre_completoSaldosCuentasPorPagar;
	public JTextArea jTextAreanombre_completoSaldosCuentasPorPagar;
	public JScrollPane jscrollPanenombre_completoSaldosCuentasPorPagar;
	public JButton jButtonnombre_completoSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localSaldosCuentasPorPagar;
	public JLabel jLabeldebito_mone_localSaldosCuentasPorPagar;
	public JTextField jTextFielddebito_mone_localSaldosCuentasPorPagar;
	public JButton jButtondebito_mone_localSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localSaldosCuentasPorPagar;
	public JLabel jLabelcredito_mone_localSaldosCuentasPorPagar;
	public JTextField jTextFieldcredito_mone_localSaldosCuentasPorPagar;
	public JButton jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_anteriorSaldosCuentasPorPagar;
	public JLabel jLabelsaldo_anteriorSaldosCuentasPorPagar;
	public JTextField jTextFieldsaldo_anteriorSaldosCuentasPorPagar;
	public JButton jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_debitoSaldosCuentasPorPagar;
	public JLabel jLabelsaldo_debitoSaldosCuentasPorPagar;
	public JTextField jTextFieldsaldo_debitoSaldosCuentasPorPagar;
	public JButton jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_creditoSaldosCuentasPorPagar;
	public JLabel jLabelsaldo_creditoSaldosCuentasPorPagar;
	public JTextField jTextFieldsaldo_creditoSaldosCuentasPorPagar;
	public JButton jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_zonaSaldosCuentasPorPagar;
	public JLabel jLabelid_zonaSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaSaldosCuentasPorPagar;
	public JButton jButtonid_zonaSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_zonaSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_zonaSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelid_grupo_clienteSaldosCuentasPorPagar;
	public JLabel jLabelid_grupo_clienteSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteSaldosCuentasPorPagar;
	public JButton jButtonid_grupo_clienteSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaSaldosCuentasPorPagar;
	public JLabel jLabelid_empresaSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSaldosCuentasPorPagar;
	public JButton jButtonid_empresaSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_empresaSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_empresaSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSaldosCuentasPorPagar;
	public JLabel jLabelid_sucursalSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSaldosCuentasPorPagar;
	public JButton jButtonid_sucursalSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_sucursalSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSaldosCuentasPorPagarBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteSaldosCuentasPorPagar;
	public JLabel jLabelid_clienteSaldosCuentasPorPagar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteSaldosCuentasPorPagar;
	public JButton jButtonid_clienteSaldosCuentasPorPagar= new JButtonMe();
	public JButton jButtonid_clienteSaldosCuentasPorPagarUpdate= new JButtonMe();
	public JButton jButtonid_clienteSaldosCuentasPorPagarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSaldosCuentasPorPagar;
	
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
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SaldosCuentasPorPagarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSaldosCuentasPorPagar=new JPanel();
				this.jPanelAccionesFormularioSaldosCuentasPorPagar=new JPanel();
				this.jmenuBarDetalleSaldosCuentasPorPagar=new JMenuBar();
				this.jTtoolBarDetalleSaldosCuentasPorPagar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SaldosCuentasPorPagarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldosCuentasPorPagarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldosCuentasPorPagar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSaldosCuentasPorPagar() {
		return this.jButtonActualizarToolBarSaldosCuentasPorPagar;
	}
	
	public JButton getjButtonEliminarToolBarSaldosCuentasPorPagar() {
		return this.jButtonEliminarToolBarSaldosCuentasPorPagar;
	}
	
	public JButton getjButtonCancelarToolBarSaldosCuentasPorPagar() {
		return this.jButtonCancelarToolBarSaldosCuentasPorPagar;
	}		
	
	public JButton getjButtonProcesarInformacionSaldosCuentasPorPagar() {
		return this.jButtonProcesarInformacionSaldosCuentasPorPagar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldosCuentasPorPagar)	{
		this.jButtonProcesarInformacionSaldosCuentasPorPagar = jButtonProcesarInformacionSaldosCuentasPorPagar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldosCuentasPorPagar() {
		return this.jComboBoxTiposAccionesSaldosCuentasPorPagar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposRelacionesSaldosCuentasPorPagar) {
		this.jComboBoxTiposRelacionesSaldosCuentasPorPagar = jComboBoxTiposRelacionesSaldosCuentasPorPagar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposAccionesSaldosCuentasPorPagar) {
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar = jComboBoxTiposAccionesSaldosCuentasPorPagar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSaldosCuentasPorPagar() {
		return this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSaldosCuentasPorPagar(
			JComboBox jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar) {
		this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar = jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.saldoscuentasporpagarSessionBean=new SaldosCuentasPorPagarSessionBean();
		
		this.saldoscuentasporpagarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldoscuentasporpagarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldosCuentasPorPagarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldosCuentasPorPagarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldosCuentasPorPagarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldos Cuentas Por Pagar MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
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
	
		SaldosCuentasPorPagarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSaldosCuentasPorPagar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSaldosCuentasPorPagar=new JButtonMe();
				this.jButtonModificarToolBarSaldosCuentasPorPagar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSaldosCuentasPorPagar,this.jTtoolBarDetalleSaldosCuentasPorPagar,
							"actualizar","actualizar","Actualizar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSaldosCuentasPorPagar,this.jTtoolBarDetalleSaldosCuentasPorPagar,
							"eliminar","eliminar","Eliminar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSaldosCuentasPorPagar,this.jTtoolBarDetalleSaldosCuentasPorPagar,
							"cancelar","cancelar","Cancelar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSaldosCuentasPorPagar,this.jTtoolBarDetalleSaldosCuentasPorPagar,
							"guardarcambios","guardarcambios","Guardar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSaldosCuentasPorPagar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSaldosCuentasPorPagar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSaldosCuentasPorPagar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSaldosCuentasPorPagar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSaldosCuentasPorPagar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldosCuentasPorPagar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldosCuentasPorPagar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldosCuentasPorPagar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSaldosCuentasPorPagar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSaldosCuentasPorPagar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSaldosCuentasPorPagar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSaldosCuentasPorPagar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSaldosCuentasPorPagar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSaldosCuentasPorPagar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSaldosCuentasPorPagar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSaldosCuentasPorPagar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSaldosCuentasPorPagar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSaldosCuentasPorPagar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSaldosCuentasPorPagar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSaldosCuentasPorPagar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSaldosCuentasPorPagar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldosCuentasPorPagar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldosCuentasPorPagar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldosCuentasPorPagar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldosCuentasPorPagar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldosCuentasPorPagar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSaldosCuentasPorPagar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSaldosCuentasPorPagar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSaldosCuentasPorPagar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldosCuentasPorPagar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldosCuentasPorPagar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldosCuentasPorPagar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSaldosCuentasPorPagar.add(this.jMenuItemDetalleCerrarSaldosCuentasPorPagar);
		
		this.jmenuDetalleAccionesSaldosCuentasPorPagar.add(this.jMenuItemActualizarSaldosCuentasPorPagar);
		this.jmenuDetalleAccionesSaldosCuentasPorPagar.add(this.jMenuItemEliminarSaldosCuentasPorPagar);
		this.jmenuDetalleAccionesSaldosCuentasPorPagar.add(this.jMenuItemCancelarSaldosCuentasPorPagar);		
		
		//this.jmenuDetalleDatosSaldosCuentasPorPagar.add(this.jMenuItemDetalleAbrirOrderBySaldosCuentasPorPagar);				
		this.jmenuDetalleDatosSaldosCuentasPorPagar.add(this.jMenuItemDetalleMostarOcultarSaldosCuentasPorPagar);				
				
		//this.jmenuDetalleAccionesSaldosCuentasPorPagar.add(this.jMenuItemGuardarCambiosSaldosCuentasPorPagar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSaldosCuentasPorPagar.add(this.jmenuDetalleArchivoSaldosCuentasPorPagar);		
		this.jmenuBarDetalleSaldosCuentasPorPagar.add(this.jmenuDetalleAccionesSaldosCuentasPorPagar);		
		this.jmenuBarDetalleSaldosCuentasPorPagar.add(this.jmenuDetalleDatosSaldosCuentasPorPagar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSaldosCuentasPorPagar);				
	}
	
	
	public void inicializarElementosCamposSaldosCuentasPorPagar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSaldosCuentasPorPagar = new JLabelMe();
		jLabelIdSaldosCuentasPorPagar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSaldosCuentasPorPagar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSaldosCuentasPorPagar= new GridBagLayout();

		this.jPanelidSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);

		jLabelidSaldosCuentasPorPagar = new JLabel();
		jLabelidSaldosCuentasPorPagar.setText("Id");

		jLabelidSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_hastaSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelfecha_emision_hastaSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaSaldosCuentasPorPagar.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelfecha_emision_hastaSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		//jFormattedTextFieldfecha_emision_hastaSaldosCuentasPorPagar= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar= new JDateChooser();
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setEnabled(false);
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setDate(new Date());
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaSaldosCuentasPorPagar.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabelcodigoSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelcodigoSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoSaldosCuentasPorPagar.setToolTipText("Codigo");
		this.jLabelcodigoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelcodigoSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextFieldcodigoSaldosCuentasPorPagar= new JTextFieldMe();

		jTextFieldcodigoSaldosCuentasPorPagar.setEnabled(false);
		jTextFieldcodigoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelnombre_completoSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoSaldosCuentasPorPagar.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelnombre_completoSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextAreanombre_completoSaldosCuentasPorPagar= new JTextAreaMe();
		jTextAreanombre_completoSaldosCuentasPorPagar.setEnabled(false);
		jTextAreanombre_completoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoSaldosCuentasPorPagar.setLineWrap(true);
		jTextAreanombre_completoSaldosCuentasPorPagar.setWrapStyleWord(true);
		jTextAreanombre_completoSaldosCuentasPorPagar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoSaldosCuentasPorPagar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoSaldosCuentasPorPagar = new JScrollPane(jTextAreanombre_completoSaldosCuentasPorPagar);
		jscrollPanenombre_completoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localSaldosCuentasPorPagar = new JLabelMe();
		this.jLabeldebito_mone_localSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localSaldosCuentasPorPagar.setToolTipText("Debito Mone Local");
		this.jLabeldebito_mone_localSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPaneldebito_mone_localSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextFielddebito_mone_localSaldosCuentasPorPagar= new JTextFieldMe();
		jTextFielddebito_mone_localSaldosCuentasPorPagar.setEnabled(false);
		jTextFielddebito_mone_localSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localSaldosCuentasPorPagar.setText("0.0");

		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelcredito_mone_localSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localSaldosCuentasPorPagar.setToolTipText("Credito Mone Local");
		this.jLabelcredito_mone_localSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_mone_localSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelcredito_mone_localSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextFieldcredito_mone_localSaldosCuentasPorPagar= new JTextFieldMe();
		jTextFieldcredito_mone_localSaldosCuentasPorPagar.setEnabled(false);
		jTextFieldcredito_mone_localSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localSaldosCuentasPorPagar.setText("0.0");

		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_anteriorSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelsaldo_anteriorSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR+" : *");
		this.jLabelsaldo_anteriorSaldosCuentasPorPagar.setToolTipText("Saldo Anterior");
		this.jLabelsaldo_anteriorSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_anteriorSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_anteriorSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_anteriorSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_anteriorSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_anteriorSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOANTERIOR);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelsaldo_anteriorSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextFieldsaldo_anteriorSaldosCuentasPorPagar= new JTextFieldMe();
		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setEnabled(false);
		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_anteriorSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.setText("0.0");

		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_anteriorSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_anteriorSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_debitoSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelsaldo_debitoSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO+" : *");
		this.jLabelsaldo_debitoSaldosCuentasPorPagar.setToolTipText("Saldo Debito");
		this.jLabelsaldo_debitoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_debitoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_debitoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_debitoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_debitoSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_debitoSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDODEBITO);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelsaldo_debitoSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextFieldsaldo_debitoSaldosCuentasPorPagar= new JTextFieldMe();
		jTextFieldsaldo_debitoSaldosCuentasPorPagar.setEnabled(false);
		jTextFieldsaldo_debitoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_debitoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_debitoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_debitoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_debitoSaldosCuentasPorPagar.setText("0.0");

		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_debitoSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_debitoSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_debitoSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_creditoSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelsaldo_creditoSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO+" : *");
		this.jLabelsaldo_creditoSaldosCuentasPorPagar.setToolTipText("Saldo Credito");
		this.jLabelsaldo_creditoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_creditoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_creditoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_creditoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_creditoSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_creditoSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_SALDOCREDITO);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelsaldo_creditoSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jTextFieldsaldo_creditoSaldosCuentasPorPagar= new JTextFieldMe();
		jTextFieldsaldo_creditoSaldosCuentasPorPagar.setEnabled(false);
		jTextFieldsaldo_creditoSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_creditoSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_creditoSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_creditoSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_creditoSaldosCuentasPorPagar.setText("0.0");

		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_creditoSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_creditoSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_creditoSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSaldosCuentasPorPagar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_zonaSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelid_zonaSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaSaldosCuentasPorPagar.setToolTipText("Zona");
		this.jLabelid_zonaSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelid_zonaSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jComboBoxid_zonaSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_zonaSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaSaldosCuentasPorPagar= new JButtonMe();
		this.jButtonid_zonaSaldosCuentasPorPagar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaSaldosCuentasPorPagar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaSaldosCuentasPorPagar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonid_zonaSaldosCuentasPorPagar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaSaldosCuentasPorPagar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaSaldosCuentasPorPagar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaSaldosCuentasPorPagar"));

		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaSaldosCuentasPorPagarBusqueda.setVisible(false);		}

		this.jButtonid_zonaSaldosCuentasPorPagarUpdate= new JButtonMe();
		this.jButtonid_zonaSaldosCuentasPorPagarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSaldosCuentasPorPagarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaSaldosCuentasPorPagarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaSaldosCuentasPorPagarUpdate.setText("U");
		this.jButtonid_zonaSaldosCuentasPorPagarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaSaldosCuentasPorPagarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaSaldosCuentasPorPagarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaSaldosCuentasPorPagarUpdate"));



					
		this.jLabelid_grupo_clienteSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelid_grupo_clienteSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE+" : *");
		this.jLabelid_grupo_clienteSaldosCuentasPorPagar.setToolTipText("Grupo Cliente");
		this.jLabelid_grupo_clienteSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_grupo_clienteSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_grupo_clienteSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_grupo_clienteSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelid_grupo_clienteSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jComboBoxid_grupo_clienteSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_grupo_clienteSaldosCuentasPorPagar= new JButtonMe();
		this.jButtonid_grupo_clienteSaldosCuentasPorPagar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonid_grupo_clienteSaldosCuentasPorPagar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_grupo_clienteSaldosCuentasPorPagar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteSaldosCuentasPorPagar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteSaldosCuentasPorPagar"));

		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda.setVisible(false);		}

		this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate= new JButtonMe();
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.setText("U");
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_grupo_clienteSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_grupo_clienteSaldosCuentasPorPagarUpdate"));



					
		this.jLabelid_empresaSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelid_empresaSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSaldosCuentasPorPagar.setToolTipText("Empresa");
		this.jLabelid_empresaSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelid_empresaSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jComboBoxid_empresaSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_empresaSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSaldosCuentasPorPagar.setEnabled(false);

		this.jButtonid_empresaSaldosCuentasPorPagar= new JButtonMe();
		this.jButtonid_empresaSaldosCuentasPorPagar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosCuentasPorPagar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosCuentasPorPagar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonid_empresaSaldosCuentasPorPagar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSaldosCuentasPorPagar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosCuentasPorPagar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosCuentasPorPagar"));

		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSaldosCuentasPorPagarBusqueda.setVisible(false);		}

		this.jButtonid_empresaSaldosCuentasPorPagarUpdate= new JButtonMe();
		this.jButtonid_empresaSaldosCuentasPorPagarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosCuentasPorPagarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldosCuentasPorPagarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldosCuentasPorPagarUpdate.setText("U");
		this.jButtonid_empresaSaldosCuentasPorPagarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSaldosCuentasPorPagarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldosCuentasPorPagarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldosCuentasPorPagarUpdate"));



					
		this.jLabelid_sucursalSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelid_sucursalSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSaldosCuentasPorPagar.setToolTipText("Sucursal");
		this.jLabelid_sucursalSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelid_sucursalSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jComboBoxid_sucursalSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_sucursalSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSaldosCuentasPorPagar.setEnabled(false);

		this.jButtonid_sucursalSaldosCuentasPorPagar= new JButtonMe();
		this.jButtonid_sucursalSaldosCuentasPorPagar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldosCuentasPorPagar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldosCuentasPorPagar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonid_sucursalSaldosCuentasPorPagar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSaldosCuentasPorPagar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldosCuentasPorPagar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldosCuentasPorPagar"));

		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSaldosCuentasPorPagarBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSaldosCuentasPorPagarUpdate= new JButtonMe();
		this.jButtonid_sucursalSaldosCuentasPorPagarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldosCuentasPorPagarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldosCuentasPorPagarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSaldosCuentasPorPagarUpdate.setText("U");
		this.jButtonid_sucursalSaldosCuentasPorPagarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSaldosCuentasPorPagarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldosCuentasPorPagarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldosCuentasPorPagarUpdate"));



					
		this.jLabelid_clienteSaldosCuentasPorPagar = new JLabelMe();
		this.jLabelid_clienteSaldosCuentasPorPagar.setText(""+SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteSaldosCuentasPorPagar.setToolTipText("Cliente");
		this.jLabelid_clienteSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteSaldosCuentasPorPagar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteSaldosCuentasPorPagar.setToolTipText(SaldosCuentasPorPagarConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		this.jPanelid_clienteSaldosCuentasPorPagar.setLayout(this.gridaBagLayoutSaldosCuentasPorPagar);


		jComboBoxid_clienteSaldosCuentasPorPagar= new JComboBoxMe();
		jComboBoxid_clienteSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteSaldosCuentasPorPagar= new JButtonMe();
		this.jButtonid_clienteSaldosCuentasPorPagar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSaldosCuentasPorPagar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSaldosCuentasPorPagar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSaldosCuentasPorPagar.setText("Buscar");
		this.jButtonid_clienteSaldosCuentasPorPagar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteSaldosCuentasPorPagar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSaldosCuentasPorPagar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSaldosCuentasPorPagar"));

		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda= new JButtonMe();
		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setText("U");
		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSaldosCuentasPorPagarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSaldosCuentasPorPagarBusqueda"));

		if(this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteSaldosCuentasPorPagarBusqueda.setVisible(false);		}

		this.jButtonid_clienteSaldosCuentasPorPagarUpdate= new JButtonMe();
		this.jButtonid_clienteSaldosCuentasPorPagarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosCuentasPorPagarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSaldosCuentasPorPagarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSaldosCuentasPorPagarUpdate.setText("U");
		this.jButtonid_clienteSaldosCuentasPorPagarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteSaldosCuentasPorPagarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSaldosCuentasPorPagarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteSaldosCuentasPorPagar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSaldosCuentasPorPagar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSaldosCuentasPorPagarUpdate"));



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
		//this.jInternalFrameDetalleSaldosCuentasPorPagar = new SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Saldos Cuentas Por Pagar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldosCuentasPorPagar= new GridBagLayout();
		

		
		String sToolTipSaldosCuentasPorPagar="";
		sToolTipSaldosCuentasPorPagar=SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldosCuentasPorPagar+="(Cartera.SaldosCuentasPorPagar)";
		}
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldosCuentasPorPagar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonModificarSaldosCuentasPorPagar = new JButtonMe();
        this.jButtonActualizarSaldosCuentasPorPagar = new JButtonMe();
        this.jButtonEliminarSaldosCuentasPorPagar = new JButtonMe();
        this.jButtonCancelarSaldosCuentasPorPagar = new JButtonMe();
        this.jButtonGuardarCambiosSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar = new JButtonMe();
		this.jButtonCerrarSaldosCuentasPorPagar = new JButtonMe();
		
		this.jScrollPanelDatosSaldosCuentasPorPagar = new JScrollPane();   
        this.jScrollPanelDatosEdicionSaldosCuentasPorPagar = new JScrollPane();
		this.jScrollPanelDatosGeneralSaldosCuentasPorPagar = new JScrollPane();
				
		
		
		this.jPanelCamposSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Saldos Cuentas Por Pagar";
		
		if(!this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldos Cuentas Por Pagares" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldosCuentasPorPagar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSaldosCuentasPorPagar.setName("jPanelCamposSaldosCuentasPorPagar"); 

		this.jPanelCamposOcultosSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSaldosCuentasPorPagar.setName("jPanelCamposOcultosSaldosCuentasPorPagar"); 

        this.jPanelAccionesSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldosCuentasPorPagar.setToolTipText("Acciones");
        this.jPanelAccionesSaldosCuentasPorPagar.setName("Acciones"); 

		this.jPanelAccionesFormularioSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSaldosCuentasPorPagar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSaldosCuentasPorPagar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSaldosCuentasPorPagar.setText("Nuevo");
		this.jButtonModificarSaldosCuentasPorPagar.setText("Editar");
        this.jButtonActualizarSaldosCuentasPorPagar.setText("Actualizar");
        this.jButtonEliminarSaldosCuentasPorPagar.setText("Eliminar");
        this.jButtonCancelarSaldosCuentasPorPagar.setText("Cancelar");
        this.jButtonGuardarCambiosSaldosCuentasPorPagar.setText("Guardar");
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.setText("Guardar");
		this.jButtonCerrarSaldosCuentasPorPagar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldosCuentasPorPagar,"nuevo_button","Nuevo",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSaldosCuentasPorPagar,"modificar_button","Editar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSaldosCuentasPorPagar,"actualizar_button","Actualizar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSaldosCuentasPorPagar,"eliminar_button","Eliminar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSaldosCuentasPorPagar,"cancelar_button","Cancelar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSaldosCuentasPorPagar,"guardarcambios_button","Guardar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar,"guardarcambiostabla_button","Guardar",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldosCuentasPorPagar,"cerrar_button","Salir",this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSaldosCuentasPorPagar.setToolTipText("Nuevo"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSaldosCuentasPorPagar.setToolTipText("Editar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSaldosCuentasPorPagar.setToolTipText("Actualizar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSaldosCuentasPorPagar.setToolTipText("Eliminar)"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSaldosCuentasPorPagar.setToolTipText("Cancelar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSaldosCuentasPorPagar.setToolTipText("Guardar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.setToolTipText("Guardar"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldosCuentasPorPagar.setToolTipText("Salir"+" "+SaldosCuentasPorPagarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldosCuentasPorPagar";
		inputMap = this.jButtonNuevoSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldosCuentasPorPagar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldosCuentasPorPagar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSaldosCuentasPorPagar";
		inputMap = this.jButtonActualizarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSaldosCuentasPorPagar"));
		
		//ELIMINAR
		sMapKey = "EliminarSaldosCuentasPorPagar";
		inputMap = this.jButtonEliminarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSaldosCuentasPorPagar"));
		
		//CANCELAR	
		sMapKey = "CancelarSaldosCuentasPorPagar";
		inputMap = this.jButtonCancelarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSaldosCuentasPorPagar"));
		
		//CERRAR		
		sMapKey = "CerrarSaldosCuentasPorPagar";
		inputMap = this.jButtonCerrarSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldosCuentasPorPagar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldosCuentasPorPagar";
		inputMap = this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldosCuentasPorPagar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldosCuentasPorPagar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSaldosCuentasPorPagar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSaldosCuentasPorPagar.setToolTipText("Nuevo SaldosCuentasPorPagar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar.setToolTipText("Sin Cerrar Ventana SaldosCuentasPorPagar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setText("Accion");
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSaldosCuentasPorPagar = new JLabelMe();
		
		this.jLabelAccionesSaldosCuentasPorPagar.setText("Acciones");		
		this.jLabelAccionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSaldosCuentasPorPagar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSaldosCuentasPorPagar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSaldosCuentasPorPagar=new JTabbedPane();
		this.jTabbedPaneRelacionesSaldosCuentasPorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSaldosCuentasPorPagar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSaldosCuentasPorPagar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSaldosCuentasPorPagar = new GridBagLayout();
		
		this.jPanelCamposSaldosCuentasPorPagar.setLayout(gridaBagLayoutCamposSaldosCuentasPorPagar);
		this.jPanelCamposOcultosSaldosCuentasPorPagar.setLayout(gridaBagLayoutCamposOcultosSaldosCuentasPorPagar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSaldosCuentasPorPagar.add(jLabelIdSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSaldosCuentasPorPagar.add(jLabelidSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaSaldosCuentasPorPagar.add(jLabelid_zonaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaSaldosCuentasPorPagar.add(jButtonid_zonaSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 3;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaSaldosCuentasPorPagar.add(jButtonid_zonaSaldosCuentasPorPagarUpdate, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaSaldosCuentasPorPagar.add(jComboBoxid_zonaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_grupo_clienteSaldosCuentasPorPagar.add(jLabelid_grupo_clienteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteSaldosCuentasPorPagar.add(jButtonid_grupo_clienteSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 3;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_grupo_clienteSaldosCuentasPorPagar.add(jButtonid_grupo_clienteSaldosCuentasPorPagarUpdate, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_grupo_clienteSaldosCuentasPorPagar.add(jComboBoxid_grupo_clienteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSaldosCuentasPorPagar.add(jLabelid_empresaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldosCuentasPorPagar.add(jButtonid_empresaSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 3;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldosCuentasPorPagar.add(jButtonid_empresaSaldosCuentasPorPagarUpdate, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSaldosCuentasPorPagar.add(jComboBoxid_empresaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSaldosCuentasPorPagar.add(jLabelid_sucursalSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSaldosCuentasPorPagar.add(jButtonid_sucursalSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 3;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSaldosCuentasPorPagar.add(jButtonid_sucursalSaldosCuentasPorPagarUpdate, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSaldosCuentasPorPagar.add(jComboBoxid_sucursalSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteSaldosCuentasPorPagar.add(jLabelid_clienteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSaldosCuentasPorPagar.add(jButtonid_clienteSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 3;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSaldosCuentasPorPagar.add(jButtonid_clienteSaldosCuentasPorPagarUpdate, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteSaldosCuentasPorPagar.add(jComboBoxid_clienteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaSaldosCuentasPorPagar.add(jLabelfecha_emision_hastaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaSaldosCuentasPorPagar.add(jButtonfecha_emision_hastaSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaSaldosCuentasPorPagar.add(jDateChooserfecha_emision_hastaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoSaldosCuentasPorPagar.add(jLabelcodigoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoSaldosCuentasPorPagar.add(jButtoncodigoSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoSaldosCuentasPorPagar.add(jTextFieldcodigoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoSaldosCuentasPorPagar.add(jLabelnombre_completoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoSaldosCuentasPorPagar.add(jButtonnombre_completoSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoSaldosCuentasPorPagar.add(jscrollPanenombre_completoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localSaldosCuentasPorPagar.add(jLabeldebito_mone_localSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localSaldosCuentasPorPagar.add(jButtondebito_mone_localSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localSaldosCuentasPorPagar.add(jTextFielddebito_mone_localSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localSaldosCuentasPorPagar.add(jLabelcredito_mone_localSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localSaldosCuentasPorPagar.add(jButtoncredito_mone_localSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localSaldosCuentasPorPagar.add(jTextFieldcredito_mone_localSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_anteriorSaldosCuentasPorPagar.add(jLabelsaldo_anteriorSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_anteriorSaldosCuentasPorPagar.add(jButtonsaldo_anteriorSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_anteriorSaldosCuentasPorPagar.add(jTextFieldsaldo_anteriorSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_debitoSaldosCuentasPorPagar.add(jLabelsaldo_debitoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_debitoSaldosCuentasPorPagar.add(jButtonsaldo_debitoSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_debitoSaldosCuentasPorPagar.add(jTextFieldsaldo_debitoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_creditoSaldosCuentasPorPagar.add(jLabelsaldo_creditoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		//this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 2;
		this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_creditoSaldosCuentasPorPagar.add(jButtonsaldo_creditoSaldosCuentasPorPagarBusqueda, this.gridBagConstraintsSaldosCuentasPorPagar);
	}

	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 1;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_creditoSaldosCuentasPorPagar.add(jTextFieldsaldo_creditoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelidSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelid_zonaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelid_grupo_clienteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelid_clienteSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelfecha_emision_hastaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelcodigoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelnombre_completoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPaneldebito_mone_localSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelcredito_mone_localSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelsaldo_debitoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldosCuentasPorPagar.add(this.jPanelsaldo_creditoSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposSaldosCuentasPorPagar=0;
		iYPanelCamposSaldosCuentasPorPagar++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposOcultosSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposOcultosSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldosCuentasPorPagar.add(this.jPanelid_empresaSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposOcultosSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposOcultosSaldosCuentasPorPagar=0;
		iYPanelCamposOcultosSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposOcultosSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposOcultosSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldosCuentasPorPagar.add(this.jPanelid_sucursalSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposOcultosSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposOcultosSaldosCuentasPorPagar=0;
		iYPanelCamposOcultosSaldosCuentasPorPagar++;
	}
	this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iYPanelCamposOcultosSaldosCuentasPorPagar;
	this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iXPanelCamposOcultosSaldosCuentasPorPagar++;
	this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldosCuentasPorPagar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldosCuentasPorPagar.add(this.jPanelsaldo_anteriorSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);



	if(iXPanelCamposOcultosSaldosCuentasPorPagar % 2==0) {
		iXPanelCamposOcultosSaldosCuentasPorPagar=0;
		iYPanelCamposOcultosSaldosCuentasPorPagar++;
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
			
		GridBagLayout gridaBagLayoutAccionesSaldosCuentasPorPagar= new GridBagLayout();
		this.jPanelAccionesSaldosCuentasPorPagar.setLayout(gridaBagLayoutAccionesSaldosCuentasPorPagar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSaldosCuentasPorPagar= new GridBagLayout();
		this.jPanelAccionesFormularioSaldosCuentasPorPagar.setLayout(gridaBagLayoutAccionesFormularioSaldosCuentasPorPagar);
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldosCuentasPorPagar.add(this.jComboBoxTiposAccionesFormularioSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccion++;
			
		this.jPanelAccionesSaldosCuentasPorPagar.add(this.jButtonModificarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);							

		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iPosXAccion++;
			
		this.jPanelAccionesSaldosCuentasPorPagar.add(this.jButtonEliminarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldosCuentasPorPagar.add(this.jButtonActualizarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);


		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldosCuentasPorPagar.add(this.jButtonGuardarCambiosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);	
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = 0;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =iPosXAccion++;
		
		this.jPanelAccionesSaldosCuentasPorPagar.add(this.jButtonCancelarSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldosCuentasPorPagar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldosCuentasPorPagar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldoscuentasporpagarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();						
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;		
			//this.gridBagConstraintsSaldosCuentasPorPagar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldosCuentasPorPagar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =0;
		this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldosCuentasPorPagar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SaldosCuentasPorPagarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSaldosCuentasPorPagar = new SaldosCuentasPorPagarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Saldos Cuentas Por Pagar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Saldos Cuentas Por Pagar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldos Cuentas Por Pagar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SaldosCuentasPorPagarModel saldoscuentasporpagarModel=new SaldosCuentasPorPagarModel(this);
			
			//SI USARA CLASE INTERNA
			//SaldosCuentasPorPagarModel.SaldosCuentasPorPagarFocusTraversalPolicy saldoscuentasporpagarFocusTraversalPolicy = saldoscuentasporpagarModel.new SaldosCuentasPorPagarFocusTraversalPolicy(this);
			
			//saldoscuentasporpagarFocusTraversalPolicy.setsaldoscuentasporpagarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(saldoscuentasporpagarModel);
			
			
			this.jContentPaneDetalleSaldosCuentasPorPagar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSaldosCuentasPorPagar = new GridBagLayout();	
			this.jContentPaneDetalleSaldosCuentasPorPagar.setLayout(gridaBagLayoutDetalleSaldosCuentasPorPagar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldosCuentasPorPagar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
				this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
					
				
				this.jContentPaneDetalleSaldosCuentasPorPagar.add(jTtoolBarDetalleSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);								
				
}
			
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar=   new JScrollPane(jContentPaneDetalleSaldosCuentasPorPagar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	        
			this.jContentPaneDetalleSaldosCuentasPorPagar.add(jPanelCamposSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);
			
			
			
			
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
						//&& saldoscuentasporpagarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.saldoscuentasporpagarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSaldosCuentasPorPagar= new GridBagConstraints();
						this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
						this.jContentPaneDetalleSaldosCuentasPorPagar.add(this.jTabbedPaneRelacionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSaldosCuentasPorPagar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSaldosCuentasPorPagar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
					this.gridBagConstraintsSaldosCuentasPorPagar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
					
				
					this.jContentPaneDetalleSaldosCuentasPorPagar.add(jPanelCamposOcultosSaldosCuentasPorPagar, gridBagConstraintsSaldosCuentasPorPagar);
				
					this.jPanelCamposOcultosSaldosCuentasPorPagar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	        this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSaldosCuentasPorPagar.add(this.jPanelAccionesFormularioSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);							
			
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
	        this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
	        
			
			this.jContentPaneDetalleSaldosCuentasPorPagar.add(this.jPanelAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSaldosCuentasPorPagar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar=   new JScrollPane(this.jPanelCamposSaldosCuentasPorPagar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldosCuentasPorPagar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
			this.gridBagConstraintsSaldosCuentasPorPagar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSaldosCuentasPorPagar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSaldosCuentasPorPagar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);			
			
			this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
			this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
			
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		
			
		this.gridBagConstraintsSaldosCuentasPorPagar = new GridBagConstraints();
		this.gridBagConstraintsSaldosCuentasPorPagar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldosCuentasPorPagar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldosCuentasPorPagar, this.gridBagConstraintsSaldosCuentasPorPagar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSaldosCuentasPorPagar;//jContentPane;
		
		return jScrollPanelDatosEdicionSaldosCuentasPorPagar;
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
