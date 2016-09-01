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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.report.CobrarConciliacionesCarterasContabilidadConstantesFunciones;

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
public class CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame extends CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad;
	
	protected JMenuBar jmenuBarDetalleCobrarConciliacionesCarterasContabilidad;
	
	protected JMenu jmenuDetalleCobrarConciliacionesCarterasContabilidad;
	protected JMenu jmenuDetalleArchivoCobrarConciliacionesCarterasContabilidad;
	protected JMenu jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad;
	protected JMenu jmenuDetalleDatosCobrarConciliacionesCarterasContabilidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrarConciliacionesCarterasContabilidad;	
	protected GridBagConstraints gridBagConstraintsCobrarConciliacionesCarterasContabilidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrarConciliacionesCarterasContabilidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CobrarConciliacionesCarterasContabilidadSessionBean cobrarconciliacionescarterascontabilidadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public CobrarConciliacionesCarterasContabilidadLogic cobrarconciliacionescarterascontabilidadLogic;
	
	public JScrollPane jScrollPanelDatosCobrarConciliacionesCarterasContabilidad;
	public JScrollPane jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad;
	public JScrollPane jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad;
	
	protected JPanel jPanelCamposCobrarConciliacionesCarterasContabilidad;    
	protected JPanel jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad;    	
	protected JPanel jPanelAccionesCobrarConciliacionesCarterasContabilidad;
	protected JPanel jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad;
    
	
	
	protected Integer iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
	protected Integer iYPanelCamposCobrarConciliacionesCarterasContabilidad=0;
	
	protected Integer iXPanelCamposOcultosCobrarConciliacionesCarterasContabilidad=0;
	protected Integer iYPanelCamposOcultosCobrarConciliacionesCarterasContabilidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonModificarCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonActualizarCobrarConciliacionesCarterasContabilidad;
    public JButton jButtonEliminarCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonCancelarCobrarConciliacionesCarterasContabilidad;
    public JButton jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCerrarCobrarConciliacionesCarterasContabilidad;
	
	
	protected JButton jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad;
    protected JButton jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad;
    protected JButton jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrarConciliacionesCarterasContabilidad;
	protected JButton jButtonCerrarToolBarCobrarConciliacionesCarterasContabilidad;
	
	protected JButton jButtonProcesarInformacionToolBarCobrarConciliacionesCarterasContabilidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemModificarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemActualizarCobrarConciliacionesCarterasContabilidad;
    protected JMenuItem jMenuItemEliminarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemCancelarCobrarConciliacionesCarterasContabilidad;
    protected JMenuItem jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemCerrarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrarConciliacionesCarterasContabilidad;
	protected JMenuItem jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrarConciliacionesCarterasContabilidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelIdCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelidCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonidCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad;
	//public JFormattedTextField jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad;

	public JDateChooser jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad;
	//public JFormattedTextField jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad;

	public JDateChooser jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelcodigoCobrarConciliacionesCarterasContabilidad;
	public JTextField jTextFieldcodigoCobrarConciliacionesCarterasContabilidad;
	public JButton jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad;
	public JTextField jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad;
	public JButton jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad;
	public JTextArea jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad;
	public JScrollPane jscrollPanenumero_mayorCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad;
	public JTextField jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad;
	public JButton jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad;
	public JTextField jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad;
	public JButton jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad;
	public JTextField jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad;
	public JButton jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad;
	public JTextField jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad;
	public JButton jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelid_empresaCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonid_empresaCobrarConciliacionesCarterasContabilidad= new JButtonMe();
	public JButton jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad;
	public JLabel jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad;
	public JButton jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad= new JButtonMe();
	public JButton jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrarConciliacionesCarterasContabilidad=new JPanel();
				this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad=new JPanel();
				this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad=new JMenuBar();
				this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobrarConciliacionesCarterasContabilidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CobrarConciliacionesCarterasContabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad() {
		return this.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad;
	}
	
	public JButton getjButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad() {
		return this.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad;
	}
	
	public JButton getjButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad() {
		return this.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad;
	}		
	
	public JButton getjButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad() {
		return this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad)	{
		this.jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad = jButtonProcesarInformacionCobrarConciliacionesCarterasContabilidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposRelacionesCobrarConciliacionesCarterasContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad = jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad() {
		return this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad(
			JComboBox jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad) {
		this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad = jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobrarconciliacionescarterascontabilidadSessionBean=new CobrarConciliacionesCarterasContabilidadSessionBean();
		
		this.cobrarconciliacionescarterascontabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarconciliacionescarterascontabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobrarConciliacionesCarterasContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobrarConciliacionesCarterasContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobrarConciliacionesCarterasContabilidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrar Conciliaciones Carteras Contabilidad MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
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
	
		CobrarConciliacionesCarterasContabilidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrarConciliacionesCarterasContabilidad=new JButtonMe();
				this.jButtonModificarToolBarCobrarConciliacionesCarterasContabilidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad,
							"actualizar","actualizar","Actualizar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad,
							"eliminar","eliminar","Eliminar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad,
							"cancelar","cancelar","Cancelar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrarConciliacionesCarterasContabilidad,this.jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad,
							"guardarcambios","guardarcambios","Guardar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrarConciliacionesCarterasContabilidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrarConciliacionesCarterasContabilidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrarConciliacionesCarterasContabilidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrarConciliacionesCarterasContabilidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrarConciliacionesCarterasContabilidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemDetalleCerrarCobrarConciliacionesCarterasContabilidad);
		
		this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemActualizarCobrarConciliacionesCarterasContabilidad);
		this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemEliminarCobrarConciliacionesCarterasContabilidad);
		this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemCancelarCobrarConciliacionesCarterasContabilidad);		
		
		//this.jmenuDetalleDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemDetalleAbrirOrderByCobrarConciliacionesCarterasContabilidad);				
		this.jmenuDetalleDatosCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemDetalleMostarOcultarCobrarConciliacionesCarterasContabilidad);				
				
		//this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad.add(this.jMenuItemGuardarCambiosCobrarConciliacionesCarterasContabilidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad.add(this.jmenuDetalleArchivoCobrarConciliacionesCarterasContabilidad);		
		this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad.add(this.jmenuDetalleAccionesCobrarConciliacionesCarterasContabilidad);		
		this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad.add(this.jmenuDetalleDatosCobrarConciliacionesCarterasContabilidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrarConciliacionesCarterasContabilidad);				
	}
	
	
	public void inicializarElementosCamposCobrarConciliacionesCarterasContabilidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		jLabelIdCobrarConciliacionesCarterasContabilidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrarConciliacionesCarterasContabilidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad= new GridBagLayout();

		this.jPanelidCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);

		jLabelidCobrarConciliacionesCarterasContabilidad = new JLabel();
		jLabelidCobrarConciliacionesCarterasContabilidad.setText("Id");

		jLabelidCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE+" : *");
		this.jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad.setToolTipText("Fecha Desde");
		this.jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHADESDE);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		//jFormattedTextFieldfecha_desdeCobrarConciliacionesCarterasContabilidad= new JFormattedTextFieldMe();

		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad= new JDateChooser();
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setDate(new Date());
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_desdeCobrarConciliacionesCarterasContabilidad.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA+" : *");
		this.jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad.setToolTipText("Fecha Hasta");
		this.jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_FECHAHASTA);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		//jFormattedTextFieldfecha_hastaCobrarConciliacionesCarterasContabilidad= new JFormattedTextFieldMe();

		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad= new JDateChooser();
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setDate(new Date());
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_hastaCobrarConciliacionesCarterasContabilidad.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabelcodigoCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelcodigoCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCobrarConciliacionesCarterasContabilidad.setToolTipText("Codigo");
		this.jLabelcodigoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelcodigoCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad= new JTextFieldMe();

		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+" : *");
		this.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setToolTipText("Codigo Tipo Movimiento");
		this.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad= new JTextFieldMe();

		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR+" : *");
		this.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad= new JTextAreaMe();
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setLineWrap(true);
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setWrapStyleWord(true);
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_mayorCobrarConciliacionesCarterasContabilidad = new JScrollPane(jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad);
		jscrollPanenumero_mayorCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_mayorCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_mayorCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO+" : *");
		this.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad.setToolTipText("Debito Asiento");
		this.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOASIENTO);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad= new JTextFieldMe();
		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.setText("0.0");

		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO+" : *");
		this.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad.setToolTipText("Credito Asiento");
		this.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOASIENTO);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad= new JTextFieldMe();
		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.setText("0.0");

		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_asientoCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS+" : *");
		this.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad.setToolTipText("Debito Cuentas");
		this.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_DEBITOCUENTAS);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad= new JTextFieldMe();
		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.setText("0.0");

		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


					
		this.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS+" : *");
		this.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setToolTipText("Credito Cuentas");
		this.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_CREDITOCUENTAS);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad= new JTextFieldMe();
		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setEnabled(false);
		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.setText("0.0");

		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrarConciliacionesCarterasContabilidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelid_empresaCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCobrarConciliacionesCarterasContabilidad.setToolTipText("Empresa");
		this.jLabelid_empresaCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad= new JComboBoxMe();
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.setEnabled(false);

		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad= new JButtonMe();
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad.setText("Buscar");
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarConciliacionesCarterasContabilidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarConciliacionesCarterasContabilidad"));

		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate= new JButtonMe();
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.setText("U");
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCobrarConciliacionesCarterasContabilidadUpdate"));



					
		this.jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		this.jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setText(""+CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setToolTipText(CobrarConciliacionesCarterasContabilidadConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setLayout(this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad);


		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad= new JComboBoxMe();
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad= new JButtonMe();
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setText("Buscar");
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidad"));

		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setText("U");
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda"));

		if(this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.setText("U");
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate"));



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
		//this.jInternalFrameDetalleCobrarConciliacionesCarterasContabilidad = new CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrar Conciliaciones Carteras Contabilidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrarConciliacionesCarterasContabilidad= new GridBagLayout();
		

		
		String sToolTipCobrarConciliacionesCarterasContabilidad="";
		sToolTipCobrarConciliacionesCarterasContabilidad=CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrarConciliacionesCarterasContabilidad+="(Cartera.CobrarConciliacionesCarterasContabilidad)";
		}
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrarConciliacionesCarterasContabilidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonModificarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
        this.jButtonActualizarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
        this.jButtonEliminarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
        this.jButtonCancelarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
        this.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad = new JButtonMe();
		
		this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad = new JScrollPane();
				
		
		
		this.jPanelCamposCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrar Conciliaciones Carteras Contabilidad";
		
		if(!this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobrar Conciliaciones Carteras Contabilidades" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrarConciliacionesCarterasContabilidad.setName("jPanelCamposCobrarConciliacionesCarterasContabilidad"); 

		this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad.setName("jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad"); 

        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setToolTipText("Acciones");
        this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.setText("Nuevo");
		this.jButtonModificarCobrarConciliacionesCarterasContabilidad.setText("Editar");
        this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.setText("Actualizar");
        this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.setText("Eliminar");
        this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.setText("Cancelar");
        this.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setText("Guardar");
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrarConciliacionesCarterasContabilidad,"nuevo_button","Nuevo",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrarConciliacionesCarterasContabilidad,"modificar_button","Editar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrarConciliacionesCarterasContabilidad,"actualizar_button","Actualizar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrarConciliacionesCarterasContabilidad,"eliminar_button","Eliminar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrarConciliacionesCarterasContabilidad,"cancelar_button","Cancelar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad,"guardarcambios_button","Guardar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad,"guardarcambiostabla_button","Guardar",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrarConciliacionesCarterasContabilidad,"cerrar_button","Salir",this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.setToolTipText("Nuevo"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrarConciliacionesCarterasContabilidad.setToolTipText("Editar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.setToolTipText("Actualizar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.setToolTipText("Eliminar)"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.setToolTipText("Cancelar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad.setToolTipText("Guardar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.setToolTipText("Guardar"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.setToolTipText("Salir"+" "+CobrarConciliacionesCarterasContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrarConciliacionesCarterasContabilidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrarConciliacionesCarterasContabilidad"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrarConciliacionesCarterasContabilidad"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrarConciliacionesCarterasContabilidad"));
		
		//CERRAR		
		sMapKey = "CerrarCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrarConciliacionesCarterasContabilidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad";
		inputMap = this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrarConciliacionesCarterasContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrarConciliacionesCarterasContabilidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad.setToolTipText("Nuevo CobrarConciliacionesCarterasContabilidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad.setToolTipText("Sin Cerrar Ventana CobrarConciliacionesCarterasContabilidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setText("Accion");
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad = new JLabelMe();
		
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setText("Acciones");		
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrarConciliacionesCarterasContabilidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrarConciliacionesCarterasContabilidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		
		this.jPanelCamposCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutCamposCobrarConciliacionesCarterasContabilidad);
		this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutCamposOcultosCobrarConciliacionesCarterasContabilidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrarConciliacionesCarterasContabilidad.add(jLabelIdCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrarConciliacionesCarterasContabilidad.add(jLabelidCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.add(jLabelid_empresaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.add(jButtonid_empresaCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 3;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.add(jButtonid_empresaCobrarConciliacionesCarterasContabilidadUpdate, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad.add(jComboBoxid_empresaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.add(jLabelid_cuenta_contableCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.add(jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 3;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.add(jButtonid_cuenta_contableCobrarConciliacionesCarterasContabilidadUpdate, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad.add(jComboBoxid_cuenta_contableCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad.add(jLabelfecha_desdeCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad.add(jButtonfecha_desdeCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad.add(jDateChooserfecha_desdeCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad.add(jLabelfecha_hastaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad.add(jButtonfecha_hastaCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad.add(jDateChooserfecha_hastaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCobrarConciliacionesCarterasContabilidad.add(jLabelcodigoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCobrarConciliacionesCarterasContabilidad.add(jButtoncodigoCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCobrarConciliacionesCarterasContabilidad.add(jTextFieldcodigoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.add(jLabelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.add(jButtoncodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad.add(jTextFieldcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad.add(jLabelnumero_mayorCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad.add(jButtonnumero_mayorCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad.add(jscrollPanenumero_mayorCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad.add(jLabeldebito_asientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad.add(jButtondebito_asientoCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad.add(jTextFielddebito_asientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad.add(jLabelcredito_asientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad.add(jButtoncredito_asientoCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad.add(jTextFieldcredito_asientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad.add(jLabeldebito_cuentasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad.add(jButtondebito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad.add(jTextFielddebito_cuentasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad.add(jLabelcredito_cuentasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 2;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad.add(jButtoncredito_cuentasCobrarConciliacionesCarterasContabilidadBusqueda, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
	}

	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 1;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad.add(jTextFieldcredito_cuentasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelidCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelid_cuenta_contableCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelfecha_desdeCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelfecha_hastaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelcodigoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelcodigo_tipo_movimientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelnumero_mayorCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPaneldebito_asientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelcredito_asientoCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPaneldebito_cuentasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrarConciliacionesCarterasContabilidad.add(this.jPanelcredito_cuentasCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposCobrarConciliacionesCarterasContabilidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iYPanelCamposOcultosCobrarConciliacionesCarterasContabilidad;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iXPanelCamposOcultosCobrarConciliacionesCarterasContabilidad++;
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad.add(this.jPanelid_empresaCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);



	if(iXPanelCamposOcultosCobrarConciliacionesCarterasContabilidad % 1==0) {
		iXPanelCamposOcultosCobrarConciliacionesCarterasContabilidad=0;
		iYPanelCamposOcultosCobrarConciliacionesCarterasContabilidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrarConciliacionesCarterasContabilidad= new GridBagLayout();
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutAccionesCobrarConciliacionesCarterasContabilidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrarConciliacionesCarterasContabilidad= new GridBagLayout();
		this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutAccionesFormularioCobrarConciliacionesCarterasContabilidad);
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad.add(this.jComboBoxTiposAccionesFormularioCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.add(this.jButtonModificarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);							

		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.add(this.jButtonEliminarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.add(this.jButtonActualizarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);


		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.add(this.jButtonGuardarCambiosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);	
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = 0;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrarConciliacionesCarterasContabilidad.add(this.jButtonCancelarCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrarConciliacionesCarterasContabilidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobrarconciliacionescarterascontabilidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();						
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;		
			//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =0;
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobrarConciliacionesCarterasContabilidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrarConciliacionesCarterasContabilidad = new CobrarConciliacionesCarterasContabilidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrar Conciliaciones Carteras Contabilidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrar Conciliaciones Carteras Contabilidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Conciliaciones Carteras Contabilidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobrarConciliacionesCarterasContabilidadModel cobrarconciliacionescarterascontabilidadModel=new CobrarConciliacionesCarterasContabilidadModel(this);
			
			//SI USARA CLASE INTERNA
			//CobrarConciliacionesCarterasContabilidadModel.CobrarConciliacionesCarterasContabilidadFocusTraversalPolicy cobrarconciliacionescarterascontabilidadFocusTraversalPolicy = cobrarconciliacionescarterascontabilidadModel.new CobrarConciliacionesCarterasContabilidadFocusTraversalPolicy(this);
			
			//cobrarconciliacionescarterascontabilidadFocusTraversalPolicy.setcobrarconciliacionescarterascontabilidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobrarconciliacionescarterascontabilidadModel);
			
			
			this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrarConciliacionesCarterasContabilidad = new GridBagLayout();	
			this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.setLayout(gridaBagLayoutDetalleCobrarConciliacionesCarterasContabilidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrarConciliacionesCarterasContabilidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
					
				
				this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.add(jTtoolBarDetalleCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);								
				
}
			
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad=   new JScrollPane(jContentPaneDetalleCobrarConciliacionesCarterasContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	        
			this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.add(jPanelCamposCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			
			
			
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
						//&& cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobrarconciliacionescarterascontabilidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad= new GridBagConstraints();
						this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
						this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.add(this.jTabbedPaneRelacionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrarConciliacionesCarterasContabilidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
					this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
					
				
					this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.add(jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad, gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
				
					this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	        this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.add(this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);							
			
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
	        this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrarConciliacionesCarterasContabilidad.add(this.jPanelAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad=   new JScrollPane(this.jPanelCamposCobrarConciliacionesCarterasContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);			
			
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
			
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		
			
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad = new GridBagConstraints();
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrarConciliacionesCarterasContabilidad, this.gridBagConstraintsCobrarConciliacionesCarterasContabilidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrarConciliacionesCarterasContabilidad;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrarConciliacionesCarterasContabilidad;
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
