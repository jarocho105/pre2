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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.SriRetencionesConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class SriRetencionesDetalleFormJInternalFrame extends SriRetencionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSriRetenciones;
	
	protected JMenuBar jmenuBarDetalleSriRetenciones;
	
	protected JMenu jmenuDetalleSriRetenciones;
	protected JMenu jmenuDetalleArchivoSriRetenciones;
	protected JMenu jmenuDetalleAccionesSriRetenciones;
	protected JMenu jmenuDetalleDatosSriRetenciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriRetenciones;	
	protected GridBagConstraints gridBagConstraintsSriRetenciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SriRetencionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleSriRetenciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";
	
	public SriRetencionesSessionBean sriretencionesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;	
	
	public SriRetencionesLogic sriretencionesLogic;
	
	public JScrollPane jScrollPanelDatosSriRetenciones;
	public JScrollPane jScrollPanelDatosEdicionSriRetenciones;
	public JScrollPane jScrollPanelDatosGeneralSriRetenciones;
	
	protected JPanel jPanelCamposSriRetenciones;    
	protected JPanel jPanelCamposOcultosSriRetenciones;    	
	protected JPanel jPanelAccionesSriRetenciones;
	protected JPanel jPanelAccionesFormularioSriRetenciones;
    
	
	
	protected Integer iXPanelCamposSriRetenciones=0;
	protected Integer iYPanelCamposSriRetenciones=0;
	
	protected Integer iXPanelCamposOcultosSriRetenciones=0;
	protected Integer iYPanelCamposOcultosSriRetenciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSriRetenciones;
	public JButton jButtonModificarSriRetenciones;
	public JButton jButtonActualizarSriRetenciones;
    public JButton jButtonEliminarSriRetenciones;
	public JButton jButtonCancelarSriRetenciones;
    public JButton jButtonGuardarCambiosSriRetenciones;
	public JButton jButtonGuardarCambiosTablaSriRetenciones;
	protected JButton jButtonCerrarSriRetenciones;
	
	
	protected JButton jButtonProcesarInformacionSriRetenciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSriRetenciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSriRetenciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSriRetenciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriRetenciones;
	protected JButton jButtonModificarToolBarSriRetenciones;
	protected JButton jButtonActualizarToolBarSriRetenciones;
    protected JButton jButtonEliminarToolBarSriRetenciones;
	protected JButton jButtonCancelarToolBarSriRetenciones;
    protected JButton jButtonGuardarCambiosToolBarSriRetenciones;
	protected JButton jButtonGuardarCambiosTablaToolBarSriRetenciones;
	protected JButton jButtonMostrarOcultarTablaToolBarSriRetenciones;
	protected JButton jButtonCerrarToolBarSriRetenciones;
	
	protected JButton jButtonProcesarInformacionToolBarSriRetenciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriRetenciones;
	protected JMenuItem jMenuItemModificarSriRetenciones;
	protected JMenuItem jMenuItemActualizarSriRetenciones;
    protected JMenuItem jMenuItemEliminarSriRetenciones;
	protected JMenuItem jMenuItemCancelarSriRetenciones;
    protected JMenuItem jMenuItemGuardarCambiosSriRetenciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriRetenciones;
	protected JMenuItem jMenuItemCerrarSriRetenciones;
	protected JMenuItem jMenuItemDetalleCerrarSriRetenciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriRetenciones;
	
	protected JMenuItem jMenuItemProcesarInformacionSriRetenciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriRetenciones;
	protected JMenuItem jMenuItemMostrarOcultarSriRetenciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriRetenciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriRetenciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriRetenciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSriRetenciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSriRetenciones;
	public JLabel jLabelIdSriRetenciones;
	public JLabel jLabelidSriRetenciones;
	public JButton jButtonidSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelrucSriRetenciones;
	public JLabel jLabelrucSriRetenciones;
	public JTextField jTextFieldrucSriRetenciones;
	public JButton jButtonrucSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_moduloSriRetenciones;
	public JLabel jLabelnombre_moduloSriRetenciones;
	public JTextArea jTextAreanombre_moduloSriRetenciones;
	public JScrollPane jscrollPanenombre_moduloSriRetenciones;
	public JButton jButtonnombre_moduloSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_comprobanteSriRetenciones;
	public JLabel jLabelnombre_tipo_comprobanteSriRetenciones;
	public JTextArea jTextAreanombre_tipo_comprobanteSriRetenciones;
	public JScrollPane jscrollPanenombre_tipo_comprobanteSriRetenciones;
	public JButton jButtonnombre_tipo_comprobanteSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoSriRetenciones;
	public JLabel jLabelnumero_documentoSriRetenciones;
	public JTextField jTextFieldnumero_documentoSriRetenciones;
	public JButton jButtonnumero_documentoSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSriRetenciones;
	public JLabel jLabelfecha_emisionSriRetenciones;
	//public JFormattedTextField jDateChooserfecha_emisionSriRetenciones;

	public JDateChooser jDateChooserfecha_emisionSriRetenciones;
	public JButton jButtonfecha_emisionSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_registro_contableSriRetenciones;
	public JLabel jLabelfecha_registro_contableSriRetenciones;
	//public JFormattedTextField jDateChooserfecha_registro_contableSriRetenciones;

	public JDateChooser jDateChooserfecha_registro_contableSriRetenciones;
	public JButton jButtonfecha_registro_contableSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieSriRetenciones;
	public JLabel jLabelnumero_serieSriRetenciones;
	public JTextField jTextFieldnumero_serieSriRetenciones;
	public JButton jButtonnumero_serieSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaSriRetenciones;
	public JLabel jLabeltotal_ivaSriRetenciones;
	public JTextField jTextFieldtotal_ivaSriRetenciones;
	public JButton jButtontotal_ivaSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaSriRetenciones;
	public JLabel jLabelmonto_ivaSriRetenciones;
	public JTextField jTextFieldmonto_ivaSriRetenciones;
	public JButton jButtonmonto_ivaSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documento_contableSriRetenciones;
	public JLabel jLabelnumero_documento_contableSriRetenciones;
	public JTextField jTextFieldnumero_documento_contableSriRetenciones;
	public JButton jButtonnumero_documento_contableSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cuenta_contable_retencionSriRetenciones;
	public JLabel jLabelnombre_cuenta_contable_retencionSriRetenciones;
	public JTextArea jTextAreanombre_cuenta_contable_retencionSriRetenciones;
	public JScrollPane jscrollPanenombre_cuenta_contable_retencionSriRetenciones;
	public JButton jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeSriRetenciones;
	public JLabel jLabelporcentajeSriRetenciones;
	public JTextField jTextFieldporcentajeSriRetenciones;
	public JButton jButtonporcentajeSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelvalorSriRetenciones;
	public JLabel jLabelvalorSriRetenciones;
	public JTextField jTextFieldvalorSriRetenciones;
	public JButton jButtonvalorSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_benefSriRetenciones;
	public JLabel jLabelnombre_benefSriRetenciones;
	public JTextArea jTextAreanombre_benefSriRetenciones;
	public JScrollPane jscrollPanenombre_benefSriRetenciones;
	public JButton jButtonnombre_benefSriRetencionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSriRetenciones;
	public JLabel jLabelid_empresaSriRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSriRetenciones;
	public JButton jButtonid_empresaSriRetenciones= new JButtonMe();
	public JButton jButtonid_empresaSriRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioSriRetenciones;
	public JLabel jLabelid_ejercicioSriRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioSriRetenciones;
	public JButton jButtonid_ejercicioSriRetenciones= new JButtonMe();
	public JButton jButtonid_ejercicioSriRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioSriRetencionesBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraSriRetenciones;
	public JLabel jLabelid_periodo_declaraSriRetenciones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraSriRetenciones;
	public JButton jButtonid_periodo_declaraSriRetenciones= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriRetencionesUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriRetencionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSriRetenciones;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SriRetencionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSriRetenciones=new JPanel();
				this.jPanelAccionesFormularioSriRetenciones=new JPanel();
				this.jmenuBarDetalleSriRetenciones=new JMenuBar();
				this.jTtoolBarDetalleSriRetenciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SriRetencionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriRetencionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriRetenciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSriRetenciones() {
		return this.jButtonActualizarToolBarSriRetenciones;
	}
	
	public JButton getjButtonEliminarToolBarSriRetenciones() {
		return this.jButtonEliminarToolBarSriRetenciones;
	}
	
	public JButton getjButtonCancelarToolBarSriRetenciones() {
		return this.jButtonCancelarToolBarSriRetenciones;
	}		
	
	public JButton getjButtonProcesarInformacionSriRetenciones() {
		return this.jButtonProcesarInformacionSriRetenciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriRetenciones)	{
		this.jButtonProcesarInformacionSriRetenciones = jButtonProcesarInformacionSriRetenciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriRetenciones() {
		return this.jComboBoxTiposAccionesSriRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriRetenciones(
			JComboBox jComboBoxTiposRelacionesSriRetenciones) {
		this.jComboBoxTiposRelacionesSriRetenciones = jComboBoxTiposRelacionesSriRetenciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriRetenciones(
			JComboBox jComboBoxTiposAccionesSriRetenciones) {
		this.jComboBoxTiposAccionesSriRetenciones = jComboBoxTiposAccionesSriRetenciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSriRetenciones() {
		return this.jComboBoxTiposAccionesFormularioSriRetenciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSriRetenciones(
			JComboBox jComboBoxTiposAccionesFormularioSriRetenciones) {
		this.jComboBoxTiposAccionesFormularioSriRetenciones = jComboBoxTiposAccionesFormularioSriRetenciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sriretencionesSessionBean=new SriRetencionesSessionBean();
		
		this.sriretencionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sriretencionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sriretencionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriRetencionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriRetencionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Retenciones MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
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
	
		SriRetencionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSriRetenciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSriRetenciones=new JButtonMe();
				this.jButtonModificarToolBarSriRetenciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSriRetenciones,this.jTtoolBarDetalleSriRetenciones,
							"actualizar","actualizar","Actualizar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSriRetenciones,this.jTtoolBarDetalleSriRetenciones,
							"eliminar","eliminar","Eliminar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSriRetenciones,this.jTtoolBarDetalleSriRetenciones,
							"cancelar","cancelar","Cancelar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSriRetenciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSriRetenciones,this.jTtoolBarDetalleSriRetenciones,
							"guardarcambios","guardarcambios","Guardar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSriRetenciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSriRetenciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSriRetenciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSriRetenciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSriRetenciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriRetenciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriRetenciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriRetenciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSriRetenciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSriRetenciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSriRetenciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSriRetenciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSriRetenciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSriRetenciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSriRetenciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSriRetenciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSriRetenciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSriRetenciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSriRetenciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSriRetenciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSriRetenciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriRetenciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriRetenciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriRetenciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriRetenciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriRetenciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSriRetenciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSriRetenciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSriRetenciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriRetenciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriRetenciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriRetenciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSriRetenciones.add(this.jMenuItemDetalleCerrarSriRetenciones);
		
		this.jmenuDetalleAccionesSriRetenciones.add(this.jMenuItemActualizarSriRetenciones);
		this.jmenuDetalleAccionesSriRetenciones.add(this.jMenuItemEliminarSriRetenciones);
		this.jmenuDetalleAccionesSriRetenciones.add(this.jMenuItemCancelarSriRetenciones);		
		
		//this.jmenuDetalleDatosSriRetenciones.add(this.jMenuItemDetalleAbrirOrderBySriRetenciones);				
		this.jmenuDetalleDatosSriRetenciones.add(this.jMenuItemDetalleMostarOcultarSriRetenciones);				
				
		//this.jmenuDetalleAccionesSriRetenciones.add(this.jMenuItemGuardarCambiosSriRetenciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSriRetenciones.add(this.jmenuDetalleArchivoSriRetenciones);		
		this.jmenuBarDetalleSriRetenciones.add(this.jmenuDetalleAccionesSriRetenciones);		
		this.jmenuBarDetalleSriRetenciones.add(this.jmenuDetalleDatosSriRetenciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSriRetenciones);				
	}
	
	
	public void inicializarElementosCamposSriRetenciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSriRetenciones = new JLabelMe();
		jLabelIdSriRetenciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSriRetenciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSriRetenciones= new GridBagLayout();

		this.jPanelidSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);

		jLabelidSriRetenciones = new JLabel();
		jLabelidSriRetenciones.setText("Id");

		jLabelidSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucSriRetenciones = new JLabelMe();
		this.jLabelrucSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSriRetenciones.setToolTipText("Ruc");
		this.jLabelrucSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelrucSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldrucSriRetenciones= new JTextFieldMe();

		jTextFieldrucSriRetenciones.setEnabled(false);
		jTextFieldrucSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSriRetencionesBusqueda= new JButtonMe();
		this.jButtonrucSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSriRetencionesBusqueda.setText("U");
		this.jButtonrucSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_moduloSriRetenciones = new JLabelMe();
		this.jLabelnombre_moduloSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO+" : *");
		this.jLabelnombre_moduloSriRetenciones.setToolTipText("Nombre Modulo");
		this.jLabelnombre_moduloSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_moduloSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_moduloSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_moduloSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_moduloSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_moduloSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NOMBREMODULO);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnombre_moduloSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextAreanombre_moduloSriRetenciones= new JTextAreaMe();
		jTextAreanombre_moduloSriRetenciones.setEnabled(false);
		jTextAreanombre_moduloSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_moduloSriRetenciones.setLineWrap(true);
		jTextAreanombre_moduloSriRetenciones.setWrapStyleWord(true);
		jTextAreanombre_moduloSriRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_moduloSriRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_moduloSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_moduloSriRetenciones = new JScrollPane(jTextAreanombre_moduloSriRetenciones);
		jscrollPanenombre_moduloSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_moduloSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_moduloSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_moduloSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_moduloSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_moduloSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_moduloSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_moduloSriRetencionesBusqueda.setText("U");
		this.jButtonnombre_moduloSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_moduloSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_moduloSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_moduloSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_moduloSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_moduloSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_moduloSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_comprobanteSriRetenciones = new JLabelMe();
		this.jLabelnombre_tipo_comprobanteSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+" : *");
		this.jLabelnombre_tipo_comprobanteSriRetenciones.setToolTipText("Nombre Tipo Comprobante");
		this.jLabelnombre_tipo_comprobanteSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_comprobanteSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_comprobanteSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_comprobanteSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnombre_tipo_comprobanteSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextAreanombre_tipo_comprobanteSriRetenciones= new JTextAreaMe();
		jTextAreanombre_tipo_comprobanteSriRetenciones.setEnabled(false);
		jTextAreanombre_tipo_comprobanteSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriRetenciones.setLineWrap(true);
		jTextAreanombre_tipo_comprobanteSriRetenciones.setWrapStyleWord(true);
		jTextAreanombre_tipo_comprobanteSriRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_comprobanteSriRetenciones.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_comprobanteSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_comprobanteSriRetenciones = new JScrollPane(jTextAreanombre_tipo_comprobanteSriRetenciones);
		jscrollPanenombre_tipo_comprobanteSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_comprobanteSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_comprobanteSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setText("U");
		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_comprobanteSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_comprobanteSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_comprobanteSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_comprobanteSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoSriRetenciones = new JLabelMe();
		this.jLabelnumero_documentoSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoSriRetenciones.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnumero_documentoSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldnumero_documentoSriRetenciones= new JTextFieldMe();

		jTextFieldnumero_documentoSriRetenciones.setEnabled(false);
		jTextFieldnumero_documentoSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnumero_documentoSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoSriRetencionesBusqueda.setText("U");
		this.jButtonnumero_documentoSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSriRetenciones = new JLabelMe();
		this.jLabelfecha_emisionSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSriRetenciones.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelfecha_emisionSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		//jFormattedTextFieldfecha_emisionSriRetenciones= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSriRetenciones= new JDateChooser();
		jDateChooserfecha_emisionSriRetenciones.setEnabled(false);
		jDateChooserfecha_emisionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSriRetenciones.setDate(new Date());
		jDateChooserfecha_emisionSriRetenciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSriRetenciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSriRetencionesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSriRetencionesBusqueda.setText("U");
		this.jButtonfecha_emisionSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_registro_contableSriRetenciones = new JLabelMe();
		this.jLabelfecha_registro_contableSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+" : *");
		this.jLabelfecha_registro_contableSriRetenciones.setToolTipText("Fecha Registro Contable");
		this.jLabelfecha_registro_contableSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_registro_contableSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_registro_contableSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_registro_contableSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelfecha_registro_contableSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		//jFormattedTextFieldfecha_registro_contableSriRetenciones= new JFormattedTextFieldMe();

		jDateChooserfecha_registro_contableSriRetenciones= new JDateChooser();
		jDateChooserfecha_registro_contableSriRetenciones.setEnabled(false);
		jDateChooserfecha_registro_contableSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_registro_contableSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_registro_contableSriRetenciones.setDate(new Date());
		jDateChooserfecha_registro_contableSriRetenciones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_registro_contableSriRetenciones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_registro_contableSriRetencionesBusqueda= new JButtonMe();
		this.jButtonfecha_registro_contableSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_registro_contableSriRetencionesBusqueda.setText("U");
		this.jButtonfecha_registro_contableSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_registro_contableSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_registro_contableSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_registro_contableSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_registro_contableSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_registro_contableSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_registro_contableSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieSriRetenciones = new JLabelMe();
		this.jLabelnumero_serieSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieSriRetenciones.setToolTipText("Numero Serie");
		this.jLabelnumero_serieSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnumero_serieSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldnumero_serieSriRetenciones= new JTextFieldMe();

		jTextFieldnumero_serieSriRetenciones.setEnabled(false);
		jTextFieldnumero_serieSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnumero_serieSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieSriRetencionesBusqueda.setText("U");
		this.jButtonnumero_serieSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaSriRetenciones = new JLabelMe();
		this.jLabeltotal_ivaSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaSriRetenciones.setToolTipText("Total Iva");
		this.jLabeltotal_ivaSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPaneltotal_ivaSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldtotal_ivaSriRetenciones= new JTextFieldMe();
		jTextFieldtotal_ivaSriRetenciones.setEnabled(false);
		jTextFieldtotal_ivaSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaSriRetenciones.setText("0.0");

		this.jButtontotal_ivaSriRetencionesBusqueda= new JButtonMe();
		this.jButtontotal_ivaSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaSriRetencionesBusqueda.setText("U");
		this.jButtontotal_ivaSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaSriRetenciones = new JLabelMe();
		this.jLabelmonto_ivaSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaSriRetenciones.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelmonto_ivaSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldmonto_ivaSriRetenciones= new JTextFieldMe();
		jTextFieldmonto_ivaSriRetenciones.setEnabled(false);
		jTextFieldmonto_ivaSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaSriRetenciones.setText("0.0");

		this.jButtonmonto_ivaSriRetencionesBusqueda= new JButtonMe();
		this.jButtonmonto_ivaSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaSriRetencionesBusqueda.setText("U");
		this.jButtonmonto_ivaSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documento_contableSriRetenciones = new JLabelMe();
		this.jLabelnumero_documento_contableSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE+" : *");
		this.jLabelnumero_documento_contableSriRetenciones.setToolTipText("Numero Documento Contable");
		this.jLabelnumero_documento_contableSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_documento_contableSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_documento_contableSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documento_contableSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documento_contableSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documento_contableSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnumero_documento_contableSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldnumero_documento_contableSriRetenciones= new JTextFieldMe();

		jTextFieldnumero_documento_contableSriRetenciones.setEnabled(false);
		jTextFieldnumero_documento_contableSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documento_contableSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documento_contableSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documento_contableSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documento_contableSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnumero_documento_contableSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documento_contableSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documento_contableSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documento_contableSriRetencionesBusqueda.setText("U");
		this.jButtonnumero_documento_contableSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documento_contableSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documento_contableSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documento_contableSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documento_contableSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documento_contableSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documento_contableSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cuenta_contable_retencionSriRetenciones = new JLabelMe();
		this.jLabelnombre_cuenta_contable_retencionSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION+" : *");
		this.jLabelnombre_cuenta_contable_retencionSriRetenciones.setToolTipText("Nombre Cuenta Contable Retencion");
		this.jLabelnombre_cuenta_contable_retencionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_retencionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_cuenta_contable_retencionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cuenta_contable_retencionSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cuenta_contable_retencionSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cuenta_contable_retencionSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NOMBRECUENTACONTABLERETENCION);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnombre_cuenta_contable_retencionSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextAreanombre_cuenta_contable_retencionSriRetenciones= new JTextAreaMe();
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setEnabled(false);
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setLineWrap(true);
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setWrapStyleWord(true);
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_cuenta_contable_retencionSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_cuenta_contable_retencionSriRetenciones = new JScrollPane(jTextAreanombre_cuenta_contable_retencionSriRetenciones);
		jscrollPanenombre_cuenta_contable_retencionSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_retencionSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_cuenta_contable_retencionSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setText("U");
		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_cuenta_contable_retencionSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cuenta_contable_retencionSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeSriRetenciones = new JLabelMe();
		this.jLabelporcentajeSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeSriRetenciones.setToolTipText("Porcentaje");
		this.jLabelporcentajeSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelporcentajeSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldporcentajeSriRetenciones= new JTextFieldMe();
		jTextFieldporcentajeSriRetenciones.setEnabled(false);
		jTextFieldporcentajeSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeSriRetenciones.setText("0.0");

		this.jButtonporcentajeSriRetencionesBusqueda= new JButtonMe();
		this.jButtonporcentajeSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeSriRetencionesBusqueda.setText("U");
		this.jButtonporcentajeSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelvalorSriRetenciones = new JLabelMe();
		this.jLabelvalorSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorSriRetenciones.setToolTipText("Valor");
		this.jLabelvalorSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelvalorSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextFieldvalorSriRetenciones= new JTextFieldMe();
		jTextFieldvalorSriRetenciones.setEnabled(false);
		jTextFieldvalorSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorSriRetenciones.setText("0.0");

		this.jButtonvalorSriRetencionesBusqueda= new JButtonMe();
		this.jButtonvalorSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorSriRetencionesBusqueda.setText("U");
		this.jButtonvalorSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorSriRetencionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_benefSriRetenciones = new JLabelMe();
		this.jLabelnombre_benefSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF+" : *");
		this.jLabelnombre_benefSriRetenciones.setToolTipText("Nombre Benef");
		this.jLabelnombre_benefSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_benefSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_benefSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_benefSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_benefSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_NOMBREBENEF);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelnombre_benefSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jTextAreanombre_benefSriRetenciones= new JTextAreaMe();
		jTextAreanombre_benefSriRetenciones.setEnabled(false);
		jTextAreanombre_benefSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_benefSriRetenciones.setLineWrap(true);
		jTextAreanombre_benefSriRetenciones.setWrapStyleWord(true);
		jTextAreanombre_benefSriRetenciones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_benefSriRetenciones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_benefSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_benefSriRetenciones = new JScrollPane(jTextAreanombre_benefSriRetenciones);
		jscrollPanenombre_benefSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_benefSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_benefSriRetencionesBusqueda= new JButtonMe();
		this.jButtonnombre_benefSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_benefSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_benefSriRetencionesBusqueda.setText("U");
		this.jButtonnombre_benefSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_benefSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_benefSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_benefSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_benefSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_benefSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_benefSriRetencionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSriRetenciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSriRetenciones = new JLabelMe();
		this.jLabelid_empresaSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSriRetenciones.setToolTipText("Empresa");
		this.jLabelid_empresaSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelid_empresaSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jComboBoxid_empresaSriRetenciones= new JComboBoxMe();
		jComboBoxid_empresaSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSriRetenciones.setEnabled(false);

		this.jButtonid_empresaSriRetenciones= new JButtonMe();
		this.jButtonid_empresaSriRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriRetenciones.setText("Buscar");
		this.jButtonid_empresaSriRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSriRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriRetenciones"));

		this.jButtonid_empresaSriRetencionesBusqueda= new JButtonMe();
		this.jButtonid_empresaSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriRetencionesBusqueda.setText("U");
		this.jButtonid_empresaSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSriRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaSriRetencionesUpdate= new JButtonMe();
		this.jButtonid_empresaSriRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriRetencionesUpdate.setText("U");
		this.jButtonid_empresaSriRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSriRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriRetencionesUpdate"));



					
		this.jLabelid_ejercicioSriRetenciones = new JLabelMe();
		this.jLabelid_ejercicioSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioSriRetenciones.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelid_ejercicioSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jComboBoxid_ejercicioSriRetenciones= new JComboBoxMe();
		jComboBoxid_ejercicioSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioSriRetenciones.setEnabled(false);

		this.jButtonid_ejercicioSriRetenciones= new JButtonMe();
		this.jButtonid_ejercicioSriRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSriRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSriRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSriRetenciones.setText("Buscar");
		this.jButtonid_ejercicioSriRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioSriRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSriRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSriRetenciones"));

		this.jButtonid_ejercicioSriRetencionesBusqueda= new JButtonMe();
		this.jButtonid_ejercicioSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSriRetencionesBusqueda.setText("U");
		this.jButtonid_ejercicioSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioSriRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioSriRetencionesUpdate= new JButtonMe();
		this.jButtonid_ejercicioSriRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSriRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSriRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSriRetencionesUpdate.setText("U");
		this.jButtonid_ejercicioSriRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioSriRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSriRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSriRetencionesUpdate"));



					
		this.jLabelid_periodo_declaraSriRetenciones = new JLabelMe();
		this.jLabelid_periodo_declaraSriRetenciones.setText(""+SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraSriRetenciones.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraSriRetenciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraSriRetenciones.setToolTipText(SriRetencionesConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutSriRetenciones = new GridBagLayout();
		this.jPanelid_periodo_declaraSriRetenciones.setLayout(this.gridaBagLayoutSriRetenciones);


		jComboBoxid_periodo_declaraSriRetenciones= new JComboBoxMe();
		jComboBoxid_periodo_declaraSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraSriRetenciones= new JButtonMe();
		this.jButtonid_periodo_declaraSriRetenciones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriRetenciones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriRetenciones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriRetenciones.setText("Buscar");
		this.jButtonid_periodo_declaraSriRetenciones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraSriRetenciones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriRetenciones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriRetenciones"));

		this.jButtonid_periodo_declaraSriRetencionesBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraSriRetencionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriRetencionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriRetencionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriRetencionesBusqueda.setText("U");
		this.jButtonid_periodo_declaraSriRetencionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraSriRetencionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriRetencionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriRetencionesBusqueda"));

		if(this.sriretencionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraSriRetencionesBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraSriRetencionesUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraSriRetencionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriRetencionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriRetencionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriRetencionesUpdate.setText("U");
		this.jButtonid_periodo_declaraSriRetencionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraSriRetencionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriRetencionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraSriRetenciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriRetenciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriRetencionesUpdate"));



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
		//this.jInternalFrameDetalleSriRetenciones = new SriRetencionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sri Retenciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriRetenciones= new GridBagLayout();
		

		
		String sToolTipSriRetenciones="";
		sToolTipSriRetenciones=SriRetencionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriRetenciones+="(Sris.SriRetenciones)";
		}
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriRetenciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSriRetenciones = new JButtonMe();
		this.jButtonModificarSriRetenciones = new JButtonMe();
        this.jButtonActualizarSriRetenciones = new JButtonMe();
        this.jButtonEliminarSriRetenciones = new JButtonMe();
        this.jButtonCancelarSriRetenciones = new JButtonMe();
        this.jButtonGuardarCambiosSriRetenciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaSriRetenciones = new JButtonMe();
		this.jButtonCerrarSriRetenciones = new JButtonMe();
		
		this.jScrollPanelDatosSriRetenciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionSriRetenciones = new JScrollPane();
		this.jScrollPanelDatosGeneralSriRetenciones = new JScrollPane();
				
		
		
		this.jPanelCamposSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Retenciones";
		
		if(!this.sriretencionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Retencioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosSriRetenciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSriRetenciones.setName("jPanelCamposSriRetenciones"); 

		this.jPanelCamposOcultosSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSriRetenciones.setName("jPanelCamposOcultosSriRetenciones"); 

        this.jPanelAccionesSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriRetenciones.setToolTipText("Acciones");
        this.jPanelAccionesSriRetenciones.setName("Acciones"); 

		this.jPanelAccionesFormularioSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSriRetenciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSriRetenciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSriRetenciones.setText("Nuevo");
		this.jButtonModificarSriRetenciones.setText("Editar");
        this.jButtonActualizarSriRetenciones.setText("Actualizar");
        this.jButtonEliminarSriRetenciones.setText("Eliminar");
        this.jButtonCancelarSriRetenciones.setText("Cancelar");
        this.jButtonGuardarCambiosSriRetenciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaSriRetenciones.setText("Guardar");
		this.jButtonCerrarSriRetenciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriRetenciones,"nuevo_button","Nuevo",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSriRetenciones,"modificar_button","Editar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSriRetenciones,"actualizar_button","Actualizar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSriRetenciones,"eliminar_button","Eliminar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSriRetenciones,"cancelar_button","Cancelar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSriRetenciones,"guardarcambios_button","Guardar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriRetenciones,"guardarcambiostabla_button","Guardar",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriRetenciones,"cerrar_button","Salir",this.sriretencionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSriRetenciones.setToolTipText("Nuevo"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSriRetenciones.setToolTipText("Editar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSriRetenciones.setToolTipText("Actualizar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSriRetenciones.setToolTipText("Eliminar)"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSriRetenciones.setToolTipText("Cancelar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSriRetenciones.setToolTipText("Guardar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSriRetenciones.setToolTipText("Guardar"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriRetenciones.setToolTipText("Salir"+" "+SriRetencionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriRetenciones";
		inputMap = this.jButtonNuevoSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriRetenciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriRetenciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSriRetenciones";
		inputMap = this.jButtonActualizarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSriRetenciones"));
		
		//ELIMINAR
		sMapKey = "EliminarSriRetenciones";
		inputMap = this.jButtonEliminarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSriRetenciones"));
		
		//CANCELAR	
		sMapKey = "CancelarSriRetenciones";
		inputMap = this.jButtonCancelarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSriRetenciones"));
		
		//CERRAR		
		sMapKey = "CerrarSriRetenciones";
		inputMap = this.jButtonCerrarSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriRetenciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriRetenciones";
		inputMap = this.jButtonGuardarCambiosTablaSriRetenciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriRetenciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriRetenciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSriRetenciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSriRetenciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSriRetenciones.setToolTipText("Nuevo SriRetenciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSriRetenciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSriRetenciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSriRetenciones.setToolTipText("Sin Cerrar Ventana SriRetenciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSriRetenciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSriRetenciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSriRetenciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriRetenciones.setText("Accion");
		this.jComboBoxTiposAccionesSriRetenciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSriRetenciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSriRetenciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSriRetenciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSriRetenciones = new JLabelMe();
		
		this.jLabelAccionesSriRetenciones.setText("Acciones");		
		this.jLabelAccionesSriRetenciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriRetenciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriRetenciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSriRetenciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSriRetenciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSriRetenciones=new JTabbedPane();
		this.jTabbedPaneRelacionesSriRetenciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSriRetenciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSriRetenciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriRetenciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriRetenciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriRetenciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSriRetenciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriRetenciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriRetenciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSriRetenciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSriRetenciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSriRetenciones = new GridBagLayout();
		
		this.jPanelCamposSriRetenciones.setLayout(gridaBagLayoutCamposSriRetenciones);
		this.jPanelCamposOcultosSriRetenciones.setLayout(gridaBagLayoutCamposOcultosSriRetenciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSriRetenciones.add(jLabelIdSriRetenciones, this.gridBagConstraintsSriRetenciones);



	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSriRetenciones.add(jLabelidSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSriRetenciones.add(jLabelid_empresaSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriRetenciones.add(jButtonid_empresaSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 3;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriRetenciones.add(jButtonid_empresaSriRetencionesUpdate, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSriRetenciones.add(jComboBoxid_empresaSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioSriRetenciones.add(jLabelid_ejercicioSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSriRetenciones.add(jButtonid_ejercicioSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 3;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSriRetenciones.add(jButtonid_ejercicioSriRetencionesUpdate, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioSriRetenciones.add(jComboBoxid_ejercicioSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraSriRetenciones.add(jLabelid_periodo_declaraSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriRetenciones.add(jButtonid_periodo_declaraSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 3;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriRetenciones.add(jButtonid_periodo_declaraSriRetencionesUpdate, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraSriRetenciones.add(jComboBoxid_periodo_declaraSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSriRetenciones.add(jLabelrucSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSriRetenciones.add(jButtonrucSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSriRetenciones.add(jTextFieldrucSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_moduloSriRetenciones.add(jLabelnombre_moduloSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_moduloSriRetenciones.add(jButtonnombre_moduloSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_moduloSriRetenciones.add(jscrollPanenombre_moduloSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_comprobanteSriRetenciones.add(jLabelnombre_tipo_comprobanteSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_comprobanteSriRetenciones.add(jButtonnombre_tipo_comprobanteSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_comprobanteSriRetenciones.add(jscrollPanenombre_tipo_comprobanteSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoSriRetenciones.add(jLabelnumero_documentoSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoSriRetenciones.add(jButtonnumero_documentoSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoSriRetenciones.add(jTextFieldnumero_documentoSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionSriRetenciones.add(jLabelfecha_emisionSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSriRetenciones.add(jButtonfecha_emisionSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionSriRetenciones.add(jDateChooserfecha_emisionSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_registro_contableSriRetenciones.add(jLabelfecha_registro_contableSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_registro_contableSriRetenciones.add(jButtonfecha_registro_contableSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_registro_contableSriRetenciones.add(jDateChooserfecha_registro_contableSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieSriRetenciones.add(jLabelnumero_serieSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieSriRetenciones.add(jButtonnumero_serieSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieSriRetenciones.add(jTextFieldnumero_serieSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaSriRetenciones.add(jLabeltotal_ivaSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaSriRetenciones.add(jButtontotal_ivaSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaSriRetenciones.add(jTextFieldtotal_ivaSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ivaSriRetenciones.add(jLabelmonto_ivaSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaSriRetenciones.add(jButtonmonto_ivaSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ivaSriRetenciones.add(jTextFieldmonto_ivaSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documento_contableSriRetenciones.add(jLabelnumero_documento_contableSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documento_contableSriRetenciones.add(jButtonnumero_documento_contableSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documento_contableSriRetenciones.add(jTextFieldnumero_documento_contableSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cuenta_contable_retencionSriRetenciones.add(jLabelnombre_cuenta_contable_retencionSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cuenta_contable_retencionSriRetenciones.add(jButtonnombre_cuenta_contable_retencionSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cuenta_contable_retencionSriRetenciones.add(jscrollPanenombre_cuenta_contable_retencionSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeSriRetenciones.add(jLabelporcentajeSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeSriRetenciones.add(jButtonporcentajeSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeSriRetenciones.add(jTextFieldporcentajeSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorSriRetenciones.add(jLabelvalorSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorSriRetenciones.add(jButtonvalorSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorSriRetenciones.add(jTextFieldvalorSriRetenciones, this.gridBagConstraintsSriRetenciones);


	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 0;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_benefSriRetenciones.add(jLabelnombre_benefSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		//this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = 2;
		this.gridBagConstraintsSriRetenciones.ipadx = 0;
		this.gridBagConstraintsSriRetenciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_benefSriRetenciones.add(jButtonnombre_benefSriRetencionesBusqueda, this.gridBagConstraintsSriRetenciones);
	}

	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriRetenciones.gridy = 0;
	this.gridBagConstraintsSriRetenciones.gridx = 1;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_benefSriRetenciones.add(jscrollPanenombre_benefSriRetenciones, this.gridBagConstraintsSriRetenciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelidSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelid_periodo_declaraSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelrucSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnombre_moduloSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnombre_tipo_comprobanteSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnumero_documentoSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelfecha_emisionSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelfecha_registro_contableSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnumero_serieSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPaneltotal_ivaSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelmonto_ivaSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnumero_documento_contableSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnombre_cuenta_contable_retencionSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelporcentajeSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelvalorSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriRetenciones.add(this.jPanelnombre_benefSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposSriRetenciones % 2==0) {
		iXPanelCamposSriRetenciones=0;
		iYPanelCamposSriRetenciones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposOcultosSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposOcultosSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSriRetenciones.add(this.jPanelid_empresaSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposOcultosSriRetenciones % 2==0) {
		iXPanelCamposOcultosSriRetenciones=0;
		iYPanelCamposOcultosSriRetenciones++;
	}
	this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriRetenciones.gridy = iYPanelCamposOcultosSriRetenciones;
	this.gridBagConstraintsSriRetenciones.gridx = iXPanelCamposOcultosSriRetenciones++;
	this.gridBagConstraintsSriRetenciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriRetenciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSriRetenciones.add(this.jPanelid_ejercicioSriRetenciones, this.gridBagConstraintsSriRetenciones);



	if(iXPanelCamposOcultosSriRetenciones % 2==0) {
		iXPanelCamposOcultosSriRetenciones=0;
		iYPanelCamposOcultosSriRetenciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesSriRetenciones= new GridBagLayout();
		this.jPanelAccionesSriRetenciones.setLayout(gridaBagLayoutAccionesSriRetenciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSriRetenciones= new GridBagLayout();
		this.jPanelAccionesFormularioSriRetenciones.setLayout(gridaBagLayoutAccionesFormularioSriRetenciones);
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSriRetenciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSriRetenciones.add(this.jComboBoxTiposAccionesFormularioSriRetenciones, this.gridBagConstraintsSriRetenciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesSriRetenciones.add(this.jButtonModificarSriRetenciones, this.gridBagConstraintsSriRetenciones);							

		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriRetenciones.gridy = 0;
		this.gridBagConstraintsSriRetenciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesSriRetenciones.add(this.jButtonEliminarSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = 0;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriRetenciones.add(this.jButtonActualizarSriRetenciones, this.gridBagConstraintsSriRetenciones);


		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = 0;		
		this.gridBagConstraintsSriRetenciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriRetenciones.add(this.jButtonGuardarCambiosSriRetenciones, this.gridBagConstraintsSriRetenciones);	
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = 0;		
		this.gridBagConstraintsSriRetenciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesSriRetenciones.add(this.jButtonCancelarSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriRetenciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriRetenciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sriretencionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();						
			this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriRetenciones.gridx = 0;		
			//this.gridBagConstraintsSriRetenciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriRetenciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriRetenciones.gridx =0;
		this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriRetenciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriRetenciones, this.gridBagConstraintsSriRetenciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SriRetencionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSriRetenciones = new SriRetencionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sri Retenciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sri Retenciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Retenciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SriRetencionesModel sriretencionesModel=new SriRetencionesModel(this);
			
			//SI USARA CLASE INTERNA
			//SriRetencionesModel.SriRetencionesFocusTraversalPolicy sriretencionesFocusTraversalPolicy = sriretencionesModel.new SriRetencionesFocusTraversalPolicy(this);
			
			//sriretencionesFocusTraversalPolicy.setsriretencionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sriretencionesModel);
			
			
			this.jContentPaneDetalleSriRetenciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSriRetenciones = new GridBagLayout();	
			this.jContentPaneDetalleSriRetenciones.setLayout(gridaBagLayoutDetalleSriRetenciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriRetenciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
				this.gridBagConstraintsSriRetenciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSriRetenciones.gridx = 0;
					
				
				this.jContentPaneDetalleSriRetenciones.add(jTtoolBarDetalleSriRetenciones, gridBagConstraintsSriRetenciones);								
				
}
			
			this.jScrollPanelDatosEdicionSriRetenciones=   new JScrollPane(jContentPaneDetalleSriRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSriRetenciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSriRetenciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSriRetenciones.gridx = 0;
	        
			this.jContentPaneDetalleSriRetenciones.add(jPanelCamposSriRetenciones, gridBagConstraintsSriRetenciones);
			
			
			
			
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
						//&& sriretencionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.sriretencionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSriRetenciones= new GridBagConstraints();
						this.gridBagConstraintsSriRetenciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSriRetenciones.gridx = 0;
						this.jContentPaneDetalleSriRetenciones.add(this.jTabbedPaneRelacionesSriRetenciones, this.gridBagConstraintsSriRetenciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSriRetenciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSriRetenciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
					this.gridBagConstraintsSriRetenciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSriRetenciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSriRetenciones.gridx = 0;
					
				
					this.jContentPaneDetalleSriRetenciones.add(jPanelCamposOcultosSriRetenciones, gridBagConstraintsSriRetenciones);
				
					this.jPanelCamposOcultosSriRetenciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSriRetenciones.gridx = 0;
	        this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSriRetenciones.add(this.jPanelAccionesFormularioSriRetenciones, this.gridBagConstraintsSriRetenciones);							
			
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
	        this.gridBagConstraintsSriRetenciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSriRetenciones.gridx = 0;
	        
			
			this.jContentPaneDetalleSriRetenciones.add(this.jPanelAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSriRetenciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSriRetenciones=   new JScrollPane(this.jPanelCamposSriRetenciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriRetenciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriRetenciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriRetenciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSriRetenciones.gridx = 0;
			this.gridBagConstraintsSriRetenciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSriRetenciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSriRetenciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSriRetenciones, this.gridBagConstraintsSriRetenciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriRetenciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSriRetenciones, this.gridBagConstraintsSriRetenciones);			
			
			this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
			this.gridBagConstraintsSriRetenciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriRetenciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriRetenciones, this.gridBagConstraintsSriRetenciones);
			
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriRetenciones, this.gridBagConstraintsSriRetenciones);
		
			
		this.gridBagConstraintsSriRetenciones = new GridBagConstraints();
		this.gridBagConstraintsSriRetenciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriRetenciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriRetenciones, this.gridBagConstraintsSriRetenciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSriRetenciones;//jContentPane;
		
		return jScrollPanelDatosEdicionSriRetenciones;
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
