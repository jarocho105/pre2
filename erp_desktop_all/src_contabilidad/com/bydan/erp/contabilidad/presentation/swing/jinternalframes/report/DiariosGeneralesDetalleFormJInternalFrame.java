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
import com.bydan.erp.contabilidad.util.report.DiariosGeneralesConstantesFunciones;

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
public class DiariosGeneralesDetalleFormJInternalFrame extends DiariosGeneralesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDiariosGenerales;
	
	protected JMenuBar jmenuBarDetalleDiariosGenerales;
	
	protected JMenu jmenuDetalleDiariosGenerales;
	protected JMenu jmenuDetalleArchivoDiariosGenerales;
	protected JMenu jmenuDetalleAccionesDiariosGenerales;
	protected JMenu jmenuDetalleDatosDiariosGenerales;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDiariosGenerales;	
	protected GridBagConstraints gridBagConstraintsDiariosGenerales;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DiariosGeneralesBeanSwingJInternalFrameAdditional jInternalFrameDetalleDiariosGenerales;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public DiariosGeneralesSessionBean diariosgeneralesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public DiariosGeneralesLogic diariosgeneralesLogic;
	
	public JScrollPane jScrollPanelDatosDiariosGenerales;
	public JScrollPane jScrollPanelDatosEdicionDiariosGenerales;
	public JScrollPane jScrollPanelDatosGeneralDiariosGenerales;
	
	protected JPanel jPanelCamposDiariosGenerales;    
	protected JPanel jPanelCamposOcultosDiariosGenerales;    	
	protected JPanel jPanelAccionesDiariosGenerales;
	protected JPanel jPanelAccionesFormularioDiariosGenerales;
    
	
	
	protected Integer iXPanelCamposDiariosGenerales=0;
	protected Integer iYPanelCamposDiariosGenerales=0;
	
	protected Integer iXPanelCamposOcultosDiariosGenerales=0;
	protected Integer iYPanelCamposOcultosDiariosGenerales=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDiariosGenerales;
	public JButton jButtonModificarDiariosGenerales;
	public JButton jButtonActualizarDiariosGenerales;
    public JButton jButtonEliminarDiariosGenerales;
	public JButton jButtonCancelarDiariosGenerales;
    public JButton jButtonGuardarCambiosDiariosGenerales;
	public JButton jButtonGuardarCambiosTablaDiariosGenerales;
	protected JButton jButtonCerrarDiariosGenerales;
	
	
	protected JButton jButtonProcesarInformacionDiariosGenerales;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDiariosGenerales;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDiariosGenerales;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDiariosGenerales;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDiariosGenerales;
	protected JButton jButtonModificarToolBarDiariosGenerales;
	protected JButton jButtonActualizarToolBarDiariosGenerales;
    protected JButton jButtonEliminarToolBarDiariosGenerales;
	protected JButton jButtonCancelarToolBarDiariosGenerales;
    protected JButton jButtonGuardarCambiosToolBarDiariosGenerales;
	protected JButton jButtonGuardarCambiosTablaToolBarDiariosGenerales;
	protected JButton jButtonMostrarOcultarTablaToolBarDiariosGenerales;
	protected JButton jButtonCerrarToolBarDiariosGenerales;
	
	protected JButton jButtonProcesarInformacionToolBarDiariosGenerales;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDiariosGenerales;
	protected JMenuItem jMenuItemModificarDiariosGenerales;
	protected JMenuItem jMenuItemActualizarDiariosGenerales;
    protected JMenuItem jMenuItemEliminarDiariosGenerales;
	protected JMenuItem jMenuItemCancelarDiariosGenerales;
    protected JMenuItem jMenuItemGuardarCambiosDiariosGenerales;
	protected JMenuItem jMenuItemGuardarCambiosTablaDiariosGenerales;
	protected JMenuItem jMenuItemCerrarDiariosGenerales;
	protected JMenuItem jMenuItemDetalleCerrarDiariosGenerales;
	protected JMenuItem jMenuItemDetalleMostarOcultarDiariosGenerales;
	
	protected JMenuItem jMenuItemProcesarInformacionDiariosGenerales;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDiariosGenerales;
	protected JMenuItem jMenuItemMostrarOcultarDiariosGenerales;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDiariosGenerales;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDiariosGenerales;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDiariosGenerales;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDiariosGenerales;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDiariosGenerales;
	public JLabel jLabelIdDiariosGenerales;
	public JLabel jLabelidDiariosGenerales;
	public JButton jButtonidDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeDiariosGenerales;
	public JLabel jLabelfecha_emision_desdeDiariosGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_desdeDiariosGenerales;

	public JDateChooser jDateChooserfecha_emision_desdeDiariosGenerales;
	public JButton jButtonfecha_emision_desdeDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaDiariosGenerales;
	public JLabel jLabelfecha_emision_hastaDiariosGenerales;
	//public JFormattedTextField jDateChooserfecha_emision_hastaDiariosGenerales;

	public JDateChooser jDateChooserfecha_emision_hastaDiariosGenerales;
	public JButton jButtonfecha_emision_hastaDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoDiariosGenerales;
	public JLabel jLabelcodigoDiariosGenerales;
	public JTextField jTextFieldcodigoDiariosGenerales;
	public JButton jButtoncodigoDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDiariosGenerales;
	public JLabel jLabelfecha_emisionDiariosGenerales;
	//public JFormattedTextField jDateChooserfecha_emisionDiariosGenerales;

	public JDateChooser jDateChooserfecha_emisionDiariosGenerales;
	public JButton jButtonfecha_emisionDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_movimientoDiariosGenerales;
	public JLabel jLabelcodigo_tipo_movimientoDiariosGenerales;
	public JTextField jTextFieldcodigo_tipo_movimientoDiariosGenerales;
	public JButton jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorDiariosGenerales;
	public JLabel jLabelnumero_mayorDiariosGenerales;
	public JTextArea jTextAreanumero_mayorDiariosGenerales;
	public JScrollPane jscrollPanenumero_mayorDiariosGenerales;
	public JButton jButtonnumero_mayorDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contableDiariosGenerales;
	public JLabel jLabelnombre_cuenta_contableDiariosGenerales;
	public JTextArea jTextAreanombre_cuenta_contableDiariosGenerales;
	public JScrollPane jscrollPanenombre_cuenta_contableDiariosGenerales;
	public JButton jButtonnombre_cuenta_contableDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localDiariosGenerales;
	public JLabel jLabeldebito_localDiariosGenerales;
	public JTextField jTextFielddebito_localDiariosGenerales;
	public JButton jButtondebito_localDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localDiariosGenerales;
	public JLabel jLabelcredito_localDiariosGenerales;
	public JTextField jTextFieldcredito_localDiariosGenerales;
	public JButton jButtoncredito_localDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPaneldetalleDiariosGenerales;
	public JLabel jLabeldetalleDiariosGenerales;
	public JTextArea jTextAreadetalleDiariosGenerales;
	public JScrollPane jscrollPanedetalleDiariosGenerales;
	public JButton jButtondetalleDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_contableDiariosGenerales;
	public JLabel jLabelcodigo_cuenta_contableDiariosGenerales;
	public JTextField jTextFieldcodigo_cuenta_contableDiariosGenerales;
	public JButton jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDiariosGenerales;
	public JLabel jLabelid_empresaDiariosGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDiariosGenerales;
	public JButton jButtonid_empresaDiariosGenerales= new JButtonMe();
	public JButton jButtonid_empresaDiariosGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_empresaDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDiariosGenerales;
	public JLabel jLabelid_sucursalDiariosGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDiariosGenerales;
	public JButton jButtonid_sucursalDiariosGenerales= new JButtonMe();
	public JButton jButtonid_sucursalDiariosGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDiariosGenerales;
	public JLabel jLabelid_ejercicioDiariosGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDiariosGenerales;
	public JButton jButtonid_ejercicioDiariosGenerales= new JButtonMe();
	public JButton jButtonid_ejercicioDiariosGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDiariosGeneralesBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoDiariosGenerales;
	public JLabel jLabelid_tipo_movimientoDiariosGenerales;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoDiariosGenerales;
	public JButton jButtonid_tipo_movimientoDiariosGenerales= new JButtonMe();
	public JButton jButtonid_tipo_movimientoDiariosGeneralesUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoDiariosGeneralesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDiariosGenerales;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DiariosGeneralesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDiariosGenerales=new JPanel();
				this.jPanelAccionesFormularioDiariosGenerales=new JPanel();
				this.jmenuBarDetalleDiariosGenerales=new JMenuBar();
				this.jTtoolBarDetalleDiariosGenerales=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DiariosGeneralesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DiariosGeneralesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DiariosGenerales No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDiariosGenerales() {
		return this.jButtonActualizarToolBarDiariosGenerales;
	}
	
	public JButton getjButtonEliminarToolBarDiariosGenerales() {
		return this.jButtonEliminarToolBarDiariosGenerales;
	}
	
	public JButton getjButtonCancelarToolBarDiariosGenerales() {
		return this.jButtonCancelarToolBarDiariosGenerales;
	}		
	
	public JButton getjButtonProcesarInformacionDiariosGenerales() {
		return this.jButtonProcesarInformacionDiariosGenerales;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDiariosGenerales)	{
		this.jButtonProcesarInformacionDiariosGenerales = jButtonProcesarInformacionDiariosGenerales;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDiariosGenerales() {
		return this.jComboBoxTiposAccionesDiariosGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDiariosGenerales(
			JComboBox jComboBoxTiposRelacionesDiariosGenerales) {
		this.jComboBoxTiposRelacionesDiariosGenerales = jComboBoxTiposRelacionesDiariosGenerales;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDiariosGenerales(
			JComboBox jComboBoxTiposAccionesDiariosGenerales) {
		this.jComboBoxTiposAccionesDiariosGenerales = jComboBoxTiposAccionesDiariosGenerales;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDiariosGenerales() {
		return this.jComboBoxTiposAccionesFormularioDiariosGenerales;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDiariosGenerales(
			JComboBox jComboBoxTiposAccionesFormularioDiariosGenerales) {
		this.jComboBoxTiposAccionesFormularioDiariosGenerales = jComboBoxTiposAccionesFormularioDiariosGenerales;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.diariosgeneralesSessionBean=new DiariosGeneralesSessionBean();
		
		this.diariosgeneralesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diariosgeneralesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.diariosgeneralesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DiariosGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DiariosGeneralesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DiariosGeneralesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Diarios Generales MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
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
	
		DiariosGeneralesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDiariosGenerales= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDiariosGenerales=new JButtonMe();
				this.jButtonModificarToolBarDiariosGenerales=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDiariosGenerales,this.jTtoolBarDetalleDiariosGenerales,
							"actualizar","actualizar","Actualizar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDiariosGenerales,this.jTtoolBarDetalleDiariosGenerales,
							"eliminar","eliminar","Eliminar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDiariosGenerales,this.jTtoolBarDetalleDiariosGenerales,
							"cancelar","cancelar","Cancelar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDiariosGenerales=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDiariosGenerales,this.jTtoolBarDetalleDiariosGenerales,
							"guardarcambios","guardarcambios","Guardar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDiariosGenerales=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDiariosGenerales=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDiariosGenerales=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDiariosGenerales=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDiariosGenerales=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDiariosGenerales= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDiariosGenerales.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDiariosGenerales,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDiariosGenerales= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDiariosGenerales.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDiariosGenerales,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDiariosGenerales= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDiariosGenerales.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDiariosGenerales,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDiariosGenerales= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDiariosGenerales.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDiariosGenerales,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDiariosGenerales= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDiariosGenerales.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDiariosGenerales,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDiariosGenerales= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDiariosGenerales.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDiariosGenerales,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDiariosGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDiariosGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDiariosGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDiariosGenerales= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDiariosGenerales.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDiariosGenerales,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDiariosGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDiariosGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDiariosGenerales,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDiariosGenerales= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDiariosGenerales.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDiariosGenerales,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDiariosGenerales.add(this.jMenuItemDetalleCerrarDiariosGenerales);
		
		this.jmenuDetalleAccionesDiariosGenerales.add(this.jMenuItemActualizarDiariosGenerales);
		this.jmenuDetalleAccionesDiariosGenerales.add(this.jMenuItemEliminarDiariosGenerales);
		this.jmenuDetalleAccionesDiariosGenerales.add(this.jMenuItemCancelarDiariosGenerales);		
		
		//this.jmenuDetalleDatosDiariosGenerales.add(this.jMenuItemDetalleAbrirOrderByDiariosGenerales);				
		this.jmenuDetalleDatosDiariosGenerales.add(this.jMenuItemDetalleMostarOcultarDiariosGenerales);				
				
		//this.jmenuDetalleAccionesDiariosGenerales.add(this.jMenuItemGuardarCambiosDiariosGenerales);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDiariosGenerales.add(this.jmenuDetalleArchivoDiariosGenerales);		
		this.jmenuBarDetalleDiariosGenerales.add(this.jmenuDetalleAccionesDiariosGenerales);		
		this.jmenuBarDetalleDiariosGenerales.add(this.jmenuDetalleDatosDiariosGenerales);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDiariosGenerales);				
	}
	
	
	public void inicializarElementosCamposDiariosGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDiariosGenerales = new JLabelMe();
		jLabelIdDiariosGenerales.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDiariosGenerales = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDiariosGenerales= new GridBagLayout();

		this.jPanelidDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);

		jLabelidDiariosGenerales = new JLabel();
		jLabelidDiariosGenerales.setText("Id");

		jLabelidDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeDiariosGenerales = new JLabelMe();
		this.jLabelfecha_emision_desdeDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeDiariosGenerales.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelfecha_emision_desdeDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		//jFormattedTextFieldfecha_emision_desdeDiariosGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeDiariosGenerales= new JDateChooser();
		jDateChooserfecha_emision_desdeDiariosGenerales.setEnabled(false);
		jDateChooserfecha_emision_desdeDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeDiariosGenerales.setDate(new Date());
		jDateChooserfecha_emision_desdeDiariosGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeDiariosGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaDiariosGenerales = new JLabelMe();
		this.jLabelfecha_emision_hastaDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaDiariosGenerales.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelfecha_emision_hastaDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		//jFormattedTextFieldfecha_emision_hastaDiariosGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaDiariosGenerales= new JDateChooser();
		jDateChooserfecha_emision_hastaDiariosGenerales.setEnabled(false);
		jDateChooserfecha_emision_hastaDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaDiariosGenerales.setDate(new Date());
		jDateChooserfecha_emision_hastaDiariosGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaDiariosGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigoDiariosGenerales = new JLabelMe();
		this.jLabelcodigoDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoDiariosGenerales.setToolTipText("Codigo");
		this.jLabelcodigoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelcodigoDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextFieldcodigoDiariosGenerales= new JTextFieldMe();

		jTextFieldcodigoDiariosGenerales.setEnabled(false);
		jTextFieldcodigoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigoDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoDiariosGeneralesBusqueda.setText("U");
		this.jButtoncodigoDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionDiariosGenerales = new JLabelMe();
		this.jLabelfecha_emisionDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDiariosGenerales.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelfecha_emisionDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		//jFormattedTextFieldfecha_emisionDiariosGenerales= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDiariosGenerales= new JDateChooser();
		jDateChooserfecha_emisionDiariosGenerales.setEnabled(false);
		jDateChooserfecha_emisionDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDiariosGenerales.setDate(new Date());
		jDateChooserfecha_emisionDiariosGenerales.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDiariosGenerales.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDiariosGeneralesBusqueda.setText("U");
		this.jButtonfecha_emisionDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_movimientoDiariosGenerales = new JLabelMe();
		this.jLabelcodigo_tipo_movimientoDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+" : *");
		this.jLabelcodigo_tipo_movimientoDiariosGenerales.setToolTipText("Codigo Tipo Movimiento");
		this.jLabelcodigo_tipo_movimientoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimientoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimientoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_movimientoDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_movimientoDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_movimientoDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelcodigo_tipo_movimientoDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextFieldcodigo_tipo_movimientoDiariosGenerales= new JTextFieldMe();

		jTextFieldcodigo_tipo_movimientoDiariosGenerales.setEnabled(false);
		jTextFieldcodigo_tipo_movimientoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimientoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimientoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_movimientoDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setText("U");
		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_movimientoDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_movimientoDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_movimientoDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorDiariosGenerales = new JLabelMe();
		this.jLabelnumero_mayorDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorDiariosGenerales.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelnumero_mayorDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextAreanumero_mayorDiariosGenerales= new JTextAreaMe();
		jTextAreanumero_mayorDiariosGenerales.setEnabled(false);
		jTextAreanumero_mayorDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorDiariosGenerales.setLineWrap(true);
		jTextAreanumero_mayorDiariosGenerales.setWrapStyleWord(true);
		jTextAreanumero_mayorDiariosGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorDiariosGenerales.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorDiariosGenerales = new JScrollPane(jTextAreanumero_mayorDiariosGenerales);
		jscrollPanenumero_mayorDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonnumero_mayorDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorDiariosGeneralesBusqueda.setText("U");
		this.jButtonnumero_mayorDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contableDiariosGenerales = new JLabelMe();
		this.jLabelnombre_cuenta_contableDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+" : *");
		this.jLabelnombre_cuenta_contableDiariosGenerales.setToolTipText("Nombre Cuenta Contable");
		this.jLabelnombre_cuenta_contableDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contableDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contableDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contableDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contableDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelnombre_cuenta_contableDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextAreanombre_cuenta_contableDiariosGenerales= new JTextAreaMe();
		jTextAreanombre_cuenta_contableDiariosGenerales.setEnabled(false);
		jTextAreanombre_cuenta_contableDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contableDiariosGenerales.setLineWrap(true);
		jTextAreanombre_cuenta_contableDiariosGenerales.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contableDiariosGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contableDiariosGenerales.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contableDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contableDiariosGenerales = new JScrollPane(jTextAreanombre_cuenta_contableDiariosGenerales);
		jscrollPanenombre_cuenta_contableDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contableDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setText("U");
		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contableDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contableDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contableDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contableDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localDiariosGenerales = new JLabelMe();
		this.jLabeldebito_localDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localDiariosGenerales.setToolTipText("Debito Local");
		this.jLabeldebito_localDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPaneldebito_localDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextFielddebito_localDiariosGenerales= new JTextFieldMe();
		jTextFielddebito_localDiariosGenerales.setEnabled(false);
		jTextFielddebito_localDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localDiariosGenerales.setText("0.0");

		this.jButtondebito_localDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtondebito_localDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localDiariosGeneralesBusqueda.setText("U");
		this.jButtondebito_localDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localDiariosGenerales = new JLabelMe();
		this.jLabelcredito_localDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localDiariosGenerales.setToolTipText("Credito Local");
		this.jLabelcredito_localDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelcredito_localDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextFieldcredito_localDiariosGenerales= new JTextFieldMe();
		jTextFieldcredito_localDiariosGenerales.setEnabled(false);
		jTextFieldcredito_localDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localDiariosGenerales.setText("0.0");

		this.jButtoncredito_localDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtoncredito_localDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localDiariosGeneralesBusqueda.setText("U");
		this.jButtoncredito_localDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabeldetalleDiariosGenerales = new JLabelMe();
		this.jLabeldetalleDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleDiariosGenerales.setToolTipText("Detalle");
		this.jLabeldetalleDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPaneldetalleDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextAreadetalleDiariosGenerales= new JTextAreaMe();
		jTextAreadetalleDiariosGenerales.setEnabled(false);
		jTextAreadetalleDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDiariosGenerales.setLineWrap(true);
		jTextAreadetalleDiariosGenerales.setWrapStyleWord(true);
		jTextAreadetalleDiariosGenerales.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleDiariosGenerales.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleDiariosGenerales = new JScrollPane(jTextAreadetalleDiariosGenerales);
		jscrollPanedetalleDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtondetalleDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleDiariosGeneralesBusqueda.setText("U");
		this.jButtondetalleDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleDiariosGeneralesBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_contableDiariosGenerales = new JLabelMe();
		this.jLabelcodigo_cuenta_contableDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+" : *");
		this.jLabelcodigo_cuenta_contableDiariosGenerales.setToolTipText("Codigo Cuenta Contable");
		this.jLabelcodigo_cuenta_contableDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_contableDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_contableDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_contableDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_contableDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_contableDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelcodigo_cuenta_contableDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jTextFieldcodigo_cuenta_contableDiariosGenerales= new JTextFieldMe();

		jTextFieldcodigo_cuenta_contableDiariosGenerales.setEnabled(false);
		jTextFieldcodigo_cuenta_contableDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_contableDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_contableDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_contableDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setText("U");
		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_contableDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_contableDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_contableDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDiariosGenerales() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDiariosGenerales = new JLabelMe();
		this.jLabelid_empresaDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDiariosGenerales.setToolTipText("Empresa");
		this.jLabelid_empresaDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelid_empresaDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jComboBoxid_empresaDiariosGenerales= new JComboBoxMe();
		jComboBoxid_empresaDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDiariosGenerales.setEnabled(false);

		this.jButtonid_empresaDiariosGenerales= new JButtonMe();
		this.jButtonid_empresaDiariosGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiariosGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiariosGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDiariosGenerales.setText("Buscar");
		this.jButtonid_empresaDiariosGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDiariosGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiariosGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiariosGenerales"));

		this.jButtonid_empresaDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonid_empresaDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiariosGeneralesBusqueda.setText("U");
		this.jButtonid_empresaDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDiariosGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_empresaDiariosGeneralesUpdate= new JButtonMe();
		this.jButtonid_empresaDiariosGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiariosGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDiariosGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDiariosGeneralesUpdate.setText("U");
		this.jButtonid_empresaDiariosGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDiariosGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDiariosGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDiariosGeneralesUpdate"));



					
		this.jLabelid_sucursalDiariosGenerales = new JLabelMe();
		this.jLabelid_sucursalDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDiariosGenerales.setToolTipText("Sucursal");
		this.jLabelid_sucursalDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelid_sucursalDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jComboBoxid_sucursalDiariosGenerales= new JComboBoxMe();
		jComboBoxid_sucursalDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDiariosGenerales.setEnabled(false);

		this.jButtonid_sucursalDiariosGenerales= new JButtonMe();
		this.jButtonid_sucursalDiariosGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiariosGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiariosGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDiariosGenerales.setText("Buscar");
		this.jButtonid_sucursalDiariosGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDiariosGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiariosGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiariosGenerales"));

		this.jButtonid_sucursalDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonid_sucursalDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDiariosGeneralesBusqueda.setText("U");
		this.jButtonid_sucursalDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDiariosGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDiariosGeneralesUpdate= new JButtonMe();
		this.jButtonid_sucursalDiariosGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiariosGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDiariosGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDiariosGeneralesUpdate.setText("U");
		this.jButtonid_sucursalDiariosGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDiariosGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDiariosGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDiariosGeneralesUpdate"));



					
		this.jLabelid_ejercicioDiariosGenerales = new JLabelMe();
		this.jLabelid_ejercicioDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDiariosGenerales.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelid_ejercicioDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jComboBoxid_ejercicioDiariosGenerales= new JComboBoxMe();
		jComboBoxid_ejercicioDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDiariosGenerales.setEnabled(false);

		this.jButtonid_ejercicioDiariosGenerales= new JButtonMe();
		this.jButtonid_ejercicioDiariosGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDiariosGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDiariosGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDiariosGenerales.setText("Buscar");
		this.jButtonid_ejercicioDiariosGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDiariosGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDiariosGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDiariosGenerales"));

		this.jButtonid_ejercicioDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDiariosGeneralesBusqueda.setText("U");
		this.jButtonid_ejercicioDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDiariosGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDiariosGeneralesUpdate= new JButtonMe();
		this.jButtonid_ejercicioDiariosGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiariosGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDiariosGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDiariosGeneralesUpdate.setText("U");
		this.jButtonid_ejercicioDiariosGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDiariosGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDiariosGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDiariosGeneralesUpdate"));



					
		this.jLabelid_tipo_movimientoDiariosGenerales = new JLabelMe();
		this.jLabelid_tipo_movimientoDiariosGenerales.setText(""+DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoDiariosGenerales.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoDiariosGenerales=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoDiariosGenerales.setToolTipText(DiariosGeneralesConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutDiariosGenerales = new GridBagLayout();
		this.jPanelid_tipo_movimientoDiariosGenerales.setLayout(this.gridaBagLayoutDiariosGenerales);


		jComboBoxid_tipo_movimientoDiariosGenerales= new JComboBoxMe();
		jComboBoxid_tipo_movimientoDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoDiariosGenerales= new JButtonMe();
		this.jButtonid_tipo_movimientoDiariosGenerales.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoDiariosGenerales.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoDiariosGenerales.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoDiariosGenerales.setText("Buscar");
		this.jButtonid_tipo_movimientoDiariosGenerales.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoDiariosGenerales.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoDiariosGenerales,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoDiariosGenerales"));

		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setText("U");
		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoDiariosGeneralesBusqueda"));

		if(this.diariosgeneralesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoDiariosGeneralesBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoDiariosGeneralesUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoDiariosGeneralesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiariosGeneralesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoDiariosGeneralesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoDiariosGeneralesUpdate.setText("U");
		this.jButtonid_tipo_movimientoDiariosGeneralesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoDiariosGeneralesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoDiariosGeneralesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoDiariosGenerales.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoDiariosGenerales.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoDiariosGeneralesUpdate"));



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
		//this.jInternalFrameDetalleDiariosGenerales = new DiariosGeneralesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Diarios Generales DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDiariosGenerales= new GridBagLayout();
		

		
		String sToolTipDiariosGenerales="";
		sToolTipDiariosGenerales=DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDiariosGenerales+="(Contabilidad.DiariosGenerales)";
		}
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			sToolTipDiariosGenerales+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDiariosGenerales = new JButtonMe();
		this.jButtonModificarDiariosGenerales = new JButtonMe();
        this.jButtonActualizarDiariosGenerales = new JButtonMe();
        this.jButtonEliminarDiariosGenerales = new JButtonMe();
        this.jButtonCancelarDiariosGenerales = new JButtonMe();
        this.jButtonGuardarCambiosDiariosGenerales = new JButtonMe();
		this.jButtonGuardarCambiosTablaDiariosGenerales = new JButtonMe();
		this.jButtonCerrarDiariosGenerales = new JButtonMe();
		
		this.jScrollPanelDatosDiariosGenerales = new JScrollPane();   
        this.jScrollPanelDatosEdicionDiariosGenerales = new JScrollPane();
		this.jScrollPanelDatosGeneralDiariosGenerales = new JScrollPane();
				
		
		
		this.jPanelCamposDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Diarios Generales";
		
		if(!this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Diarios Generaleses" + this.sPath));
		} else {
			this.jScrollPanelDatosDiariosGenerales.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDiariosGenerales.setName("jPanelCamposDiariosGenerales"); 

		this.jPanelCamposOcultosDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDiariosGenerales.setName("jPanelCamposOcultosDiariosGenerales"); 

        this.jPanelAccionesDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDiariosGenerales.setToolTipText("Acciones");
        this.jPanelAccionesDiariosGenerales.setName("Acciones"); 

		this.jPanelAccionesFormularioDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDiariosGenerales.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDiariosGenerales.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDiariosGenerales.setText("Nuevo");
		this.jButtonModificarDiariosGenerales.setText("Editar");
        this.jButtonActualizarDiariosGenerales.setText("Actualizar");
        this.jButtonEliminarDiariosGenerales.setText("Eliminar");
        this.jButtonCancelarDiariosGenerales.setText("Cancelar");
        this.jButtonGuardarCambiosDiariosGenerales.setText("Guardar");
		this.jButtonGuardarCambiosTablaDiariosGenerales.setText("Guardar");
		this.jButtonCerrarDiariosGenerales.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDiariosGenerales,"nuevo_button","Nuevo",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDiariosGenerales,"modificar_button","Editar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDiariosGenerales,"actualizar_button","Actualizar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDiariosGenerales,"eliminar_button","Eliminar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDiariosGenerales,"cancelar_button","Cancelar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDiariosGenerales,"guardarcambios_button","Guardar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDiariosGenerales,"guardarcambiostabla_button","Guardar",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDiariosGenerales,"cerrar_button","Salir",this.diariosgeneralesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDiariosGenerales.setToolTipText("Nuevo"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDiariosGenerales.setToolTipText("Editar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDiariosGenerales.setToolTipText("Actualizar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDiariosGenerales.setToolTipText("Eliminar)"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDiariosGenerales.setToolTipText("Cancelar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDiariosGenerales.setToolTipText("Guardar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDiariosGenerales.setToolTipText("Guardar"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDiariosGenerales.setToolTipText("Salir"+" "+DiariosGeneralesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDiariosGenerales";
		inputMap = this.jButtonNuevoDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDiariosGenerales.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDiariosGenerales"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDiariosGenerales";
		inputMap = this.jButtonActualizarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDiariosGenerales"));
		
		//ELIMINAR
		sMapKey = "EliminarDiariosGenerales";
		inputMap = this.jButtonEliminarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDiariosGenerales"));
		
		//CANCELAR	
		sMapKey = "CancelarDiariosGenerales";
		inputMap = this.jButtonCancelarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDiariosGenerales"));
		
		//CERRAR		
		sMapKey = "CerrarDiariosGenerales";
		inputMap = this.jButtonCerrarDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDiariosGenerales"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDiariosGenerales";
		inputMap = this.jButtonGuardarCambiosTablaDiariosGenerales.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDiariosGenerales.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDiariosGenerales"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDiariosGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDiariosGenerales.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDiariosGenerales.setToolTipText("Nuevo DiariosGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDiariosGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDiariosGenerales.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDiariosGenerales.setToolTipText("Sin Cerrar Ventana DiariosGenerales");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDiariosGenerales = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDiariosGenerales.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDiariosGenerales.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDiariosGenerales.setText("Accion");
		this.jComboBoxTiposAccionesDiariosGenerales.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDiariosGenerales = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDiariosGenerales.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDiariosGenerales.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDiariosGenerales = new JLabelMe();
		
		this.jLabelAccionesDiariosGenerales.setText("Acciones");		
		this.jLabelAccionesDiariosGenerales.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiariosGenerales.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDiariosGenerales.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDiariosGenerales();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDiariosGenerales();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDiariosGenerales=new JTabbedPane();
		this.jTabbedPaneRelacionesDiariosGenerales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDiariosGenerales,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDiariosGenerales.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiariosGenerales.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDiariosGenerales.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDiariosGenerales, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDiariosGenerales.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiariosGenerales.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDiariosGenerales.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDiariosGenerales, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDiariosGenerales = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDiariosGenerales = new GridBagLayout();
		
		this.jPanelCamposDiariosGenerales.setLayout(gridaBagLayoutCamposDiariosGenerales);
		this.jPanelCamposOcultosDiariosGenerales.setLayout(gridaBagLayoutCamposOcultosDiariosGenerales);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDiariosGenerales.add(jLabelIdDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDiariosGenerales.add(jLabelidDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDiariosGenerales.add(jLabelid_empresaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiariosGenerales.add(jButtonid_empresaDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 3;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDiariosGenerales.add(jButtonid_empresaDiariosGeneralesUpdate, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDiariosGenerales.add(jComboBoxid_empresaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDiariosGenerales.add(jLabelid_sucursalDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDiariosGenerales.add(jButtonid_sucursalDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 3;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDiariosGenerales.add(jButtonid_sucursalDiariosGeneralesUpdate, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDiariosGenerales.add(jComboBoxid_sucursalDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDiariosGenerales.add(jLabelid_ejercicioDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDiariosGenerales.add(jButtonid_ejercicioDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 3;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDiariosGenerales.add(jButtonid_ejercicioDiariosGeneralesUpdate, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDiariosGenerales.add(jComboBoxid_ejercicioDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoDiariosGenerales.add(jLabelid_tipo_movimientoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoDiariosGenerales.add(jButtonid_tipo_movimientoDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 3;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoDiariosGenerales.add(jButtonid_tipo_movimientoDiariosGeneralesUpdate, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoDiariosGenerales.add(jComboBoxid_tipo_movimientoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeDiariosGenerales.add(jLabelfecha_emision_desdeDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeDiariosGenerales.add(jButtonfecha_emision_desdeDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeDiariosGenerales.add(jDateChooserfecha_emision_desdeDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaDiariosGenerales.add(jLabelfecha_emision_hastaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaDiariosGenerales.add(jButtonfecha_emision_hastaDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaDiariosGenerales.add(jDateChooserfecha_emision_hastaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoDiariosGenerales.add(jLabelcodigoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoDiariosGenerales.add(jButtoncodigoDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoDiariosGenerales.add(jTextFieldcodigoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionDiariosGenerales.add(jLabelfecha_emisionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDiariosGenerales.add(jButtonfecha_emisionDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionDiariosGenerales.add(jDateChooserfecha_emisionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_movimientoDiariosGenerales.add(jLabelcodigo_tipo_movimientoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_movimientoDiariosGenerales.add(jButtoncodigo_tipo_movimientoDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_movimientoDiariosGenerales.add(jTextFieldcodigo_tipo_movimientoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorDiariosGenerales.add(jLabelnumero_mayorDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorDiariosGenerales.add(jButtonnumero_mayorDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorDiariosGenerales.add(jscrollPanenumero_mayorDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contableDiariosGenerales.add(jLabelnombre_cuenta_contableDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contableDiariosGenerales.add(jButtonnombre_cuenta_contableDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contableDiariosGenerales.add(jscrollPanenombre_cuenta_contableDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_localDiariosGenerales.add(jLabeldebito_localDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localDiariosGenerales.add(jButtondebito_localDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_localDiariosGenerales.add(jTextFielddebito_localDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_localDiariosGenerales.add(jLabelcredito_localDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localDiariosGenerales.add(jButtoncredito_localDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_localDiariosGenerales.add(jTextFieldcredito_localDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleDiariosGenerales.add(jLabeldetalleDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleDiariosGenerales.add(jButtondetalleDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleDiariosGenerales.add(jscrollPanedetalleDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 0;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_contableDiariosGenerales.add(jLabelcodigo_cuenta_contableDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		//this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = 2;
		this.gridBagConstraintsDiariosGenerales.ipadx = 0;
		this.gridBagConstraintsDiariosGenerales.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_contableDiariosGenerales.add(jButtoncodigo_cuenta_contableDiariosGeneralesBusqueda, this.gridBagConstraintsDiariosGenerales);
	}

	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDiariosGenerales.gridy = 0;
	this.gridBagConstraintsDiariosGenerales.gridx = 1;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_contableDiariosGenerales.add(jTextFieldcodigo_cuenta_contableDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelidDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelid_tipo_movimientoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelfecha_emision_desdeDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelfecha_emision_hastaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelcodigoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelfecha_emisionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelcodigo_tipo_movimientoDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelnumero_mayorDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelnombre_cuenta_contableDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPaneldebito_localDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelcredito_localDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPaneldetalleDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDiariosGenerales.add(this.jPanelcodigo_cuenta_contableDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposDiariosGenerales % 2==0) {
		iXPanelCamposDiariosGenerales=0;
		iYPanelCamposDiariosGenerales++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposOcultosDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposOcultosDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiariosGenerales.add(this.jPanelid_empresaDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposOcultosDiariosGenerales % 2==0) {
		iXPanelCamposOcultosDiariosGenerales=0;
		iYPanelCamposOcultosDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposOcultosDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposOcultosDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiariosGenerales.add(this.jPanelid_sucursalDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposOcultosDiariosGenerales % 2==0) {
		iXPanelCamposOcultosDiariosGenerales=0;
		iYPanelCamposOcultosDiariosGenerales++;
	}
	this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDiariosGenerales.gridy = iYPanelCamposOcultosDiariosGenerales;
	this.gridBagConstraintsDiariosGenerales.gridx = iXPanelCamposOcultosDiariosGenerales++;
	this.gridBagConstraintsDiariosGenerales.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDiariosGenerales.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDiariosGenerales.add(this.jPanelid_ejercicioDiariosGenerales, this.gridBagConstraintsDiariosGenerales);



	if(iXPanelCamposOcultosDiariosGenerales % 2==0) {
		iXPanelCamposOcultosDiariosGenerales=0;
		iYPanelCamposOcultosDiariosGenerales++;
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
			
		GridBagLayout gridaBagLayoutAccionesDiariosGenerales= new GridBagLayout();
		this.jPanelAccionesDiariosGenerales.setLayout(gridaBagLayoutAccionesDiariosGenerales);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDiariosGenerales= new GridBagLayout();
		this.jPanelAccionesFormularioDiariosGenerales.setLayout(gridaBagLayoutAccionesFormularioDiariosGenerales);
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDiariosGenerales.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDiariosGenerales.add(this.jComboBoxTiposAccionesFormularioDiariosGenerales, this.gridBagConstraintsDiariosGenerales);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccion++;
			
		this.jPanelAccionesDiariosGenerales.add(this.jButtonModificarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);							

		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDiariosGenerales.gridy = 0;
		this.gridBagConstraintsDiariosGenerales.gridx =iPosXAccion++;
			
		this.jPanelAccionesDiariosGenerales.add(this.jButtonEliminarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = 0;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiariosGenerales.add(this.jButtonActualizarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);


		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = 0;		
		this.gridBagConstraintsDiariosGenerales.gridx = iPosXAccion++;
		
		this.jPanelAccionesDiariosGenerales.add(this.jButtonGuardarCambiosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);	
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = 0;		
		this.gridBagConstraintsDiariosGenerales.gridx =iPosXAccion++;
		
		this.jPanelAccionesDiariosGenerales.add(this.jButtonCancelarDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDiariosGenerales = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDiariosGenerales);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.diariosgeneralesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();						
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDiariosGenerales.gridx = 0;		
			//this.gridBagConstraintsDiariosGenerales.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDiariosGenerales.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDiariosGenerales.gridx =0;
		this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDiariosGenerales.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DiariosGeneralesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDiariosGenerales = new DiariosGeneralesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Diarios Generales DATOS");
			
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
			
	        //this.setTitle("[FOR] - Diarios Generales DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Diarios Generales Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DiariosGeneralesModel diariosgeneralesModel=new DiariosGeneralesModel(this);
			
			//SI USARA CLASE INTERNA
			//DiariosGeneralesModel.DiariosGeneralesFocusTraversalPolicy diariosgeneralesFocusTraversalPolicy = diariosgeneralesModel.new DiariosGeneralesFocusTraversalPolicy(this);
			
			//diariosgeneralesFocusTraversalPolicy.setdiariosgeneralesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(diariosgeneralesModel);
			
			
			this.jContentPaneDetalleDiariosGenerales = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDiariosGenerales = new GridBagLayout();	
			this.jContentPaneDetalleDiariosGenerales.setLayout(gridaBagLayoutDetalleDiariosGenerales);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDiariosGenerales = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
				this.gridBagConstraintsDiariosGenerales.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDiariosGenerales.gridx = 0;
					
				
				this.jContentPaneDetalleDiariosGenerales.add(jTtoolBarDetalleDiariosGenerales, gridBagConstraintsDiariosGenerales);								
				
}
			
			this.jScrollPanelDatosEdicionDiariosGenerales=   new JScrollPane(jContentPaneDetalleDiariosGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiariosGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiariosGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiariosGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDiariosGenerales=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDiariosGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiariosGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDiariosGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDiariosGenerales.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDiariosGenerales.gridx = 0;
	        
			this.jContentPaneDetalleDiariosGenerales.add(jPanelCamposDiariosGenerales, gridBagConstraintsDiariosGenerales);
			
			
			
			
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
						//&& diariosgeneralesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.diariosgeneralesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDiariosGenerales= new GridBagConstraints();
						this.gridBagConstraintsDiariosGenerales.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDiariosGenerales.gridx = 0;
						this.jContentPaneDetalleDiariosGenerales.add(this.jTabbedPaneRelacionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDiariosGenerales.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDiariosGenerales.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
					this.gridBagConstraintsDiariosGenerales.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDiariosGenerales.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDiariosGenerales.gridx = 0;
					
				
					this.jContentPaneDetalleDiariosGenerales.add(jPanelCamposOcultosDiariosGenerales, gridBagConstraintsDiariosGenerales);
				
					this.jPanelCamposOcultosDiariosGenerales.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDiariosGenerales.gridx = 0;
	        this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDiariosGenerales.add(this.jPanelAccionesFormularioDiariosGenerales, this.gridBagConstraintsDiariosGenerales);							
			
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
	        this.gridBagConstraintsDiariosGenerales.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDiariosGenerales.gridx = 0;
	        
			
			this.jContentPaneDetalleDiariosGenerales.add(this.jPanelAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDiariosGenerales);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDiariosGenerales=   new JScrollPane(this.jPanelCamposDiariosGenerales,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDiariosGenerales.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiariosGenerales.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDiariosGenerales.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDiariosGenerales.gridx = 0;
			this.gridBagConstraintsDiariosGenerales.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDiariosGenerales.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDiariosGenerales.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiariosGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDiariosGenerales, this.gridBagConstraintsDiariosGenerales);			
			
			this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
			this.gridBagConstraintsDiariosGenerales.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDiariosGenerales.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
			
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		
			
		this.gridBagConstraintsDiariosGenerales = new GridBagConstraints();
		this.gridBagConstraintsDiariosGenerales.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDiariosGenerales.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDiariosGenerales, this.gridBagConstraintsDiariosGenerales);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDiariosGenerales;//jContentPane;
		
		return jScrollPanelDatosEdicionDiariosGenerales;
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
