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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.MantenimientoeActivoFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class MantenimientoeActivoFijosDetalleFormJInternalFrame extends MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMantenimientoeActivoFijos;
	
	protected JMenuBar jmenuBarDetalleMantenimientoeActivoFijos;
	
	protected JMenu jmenuDetalleMantenimientoeActivoFijos;
	protected JMenu jmenuDetalleArchivoMantenimientoeActivoFijos;
	protected JMenu jmenuDetalleAccionesMantenimientoeActivoFijos;
	protected JMenu jmenuDetalleDatosMantenimientoeActivoFijos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMantenimientoeActivoFijos;	
	protected GridBagConstraints gridBagConstraintsMantenimientoeActivoFijos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional jInternalFrameDetalleMantenimientoeActivoFijos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public MantenimientoeActivoFijosSessionBean mantenimientoeactivofijosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public MantenimientoeActivoFijosLogic mantenimientoeactivofijosLogic;
	
	public JScrollPane jScrollPanelDatosMantenimientoeActivoFijos;
	public JScrollPane jScrollPanelDatosEdicionMantenimientoeActivoFijos;
	public JScrollPane jScrollPanelDatosGeneralMantenimientoeActivoFijos;
	
	protected JPanel jPanelCamposMantenimientoeActivoFijos;    
	protected JPanel jPanelCamposOcultosMantenimientoeActivoFijos;    	
	protected JPanel jPanelAccionesMantenimientoeActivoFijos;
	protected JPanel jPanelAccionesFormularioMantenimientoeActivoFijos;
    
	
	
	protected Integer iXPanelCamposMantenimientoeActivoFijos=0;
	protected Integer iYPanelCamposMantenimientoeActivoFijos=0;
	
	protected Integer iXPanelCamposOcultosMantenimientoeActivoFijos=0;
	protected Integer iYPanelCamposOcultosMantenimientoeActivoFijos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMantenimientoeActivoFijos;
	public JButton jButtonModificarMantenimientoeActivoFijos;
	public JButton jButtonActualizarMantenimientoeActivoFijos;
    public JButton jButtonEliminarMantenimientoeActivoFijos;
	public JButton jButtonCancelarMantenimientoeActivoFijos;
    public JButton jButtonGuardarCambiosMantenimientoeActivoFijos;
	public JButton jButtonGuardarCambiosTablaMantenimientoeActivoFijos;
	protected JButton jButtonCerrarMantenimientoeActivoFijos;
	
	
	protected JButton jButtonProcesarInformacionMantenimientoeActivoFijos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMantenimientoeActivoFijos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMantenimientoeActivoFijos;
	protected JButton jButtonModificarToolBarMantenimientoeActivoFijos;
	protected JButton jButtonActualizarToolBarMantenimientoeActivoFijos;
    protected JButton jButtonEliminarToolBarMantenimientoeActivoFijos;
	protected JButton jButtonCancelarToolBarMantenimientoeActivoFijos;
    protected JButton jButtonGuardarCambiosToolBarMantenimientoeActivoFijos;
	protected JButton jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarMantenimientoeActivoFijos;
	protected JButton jButtonCerrarToolBarMantenimientoeActivoFijos;
	
	protected JButton jButtonProcesarInformacionToolBarMantenimientoeActivoFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemModificarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemActualizarMantenimientoeActivoFijos;
    protected JMenuItem jMenuItemEliminarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemCancelarMantenimientoeActivoFijos;
    protected JMenuItem jMenuItemGuardarCambiosMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemCerrarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemDetalleCerrarMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos;
	
	protected JMenuItem jMenuItemProcesarInformacionMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos;
	protected JMenuItem jMenuItemMostrarOcultarMantenimientoeActivoFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMantenimientoeActivoFijos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMantenimientoeActivoFijos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMantenimientoeActivoFijos;
	public JLabel jLabelIdMantenimientoeActivoFijos;
	public JLabel jLabelidMantenimientoeActivoFijos;
	public JButton jButtonidMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoMantenimientoeActivoFijos;
	public JLabel jLabelnumero_documentoMantenimientoeActivoFijos;
	public JTextField jTextFieldnumero_documentoMantenimientoeActivoFijos;
	public JButton jButtonnumero_documentoMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelcausaMantenimientoeActivoFijos;
	public JLabel jLabelcausaMantenimientoeActivoFijos;
	public JTextArea jTextAreacausaMantenimientoeActivoFijos;
	public JScrollPane jscrollPanecausaMantenimientoeActivoFijos;
	public JButton jButtoncausaMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelreferenciaMantenimientoeActivoFijos;
	public JLabel jLabelreferenciaMantenimientoeActivoFijos;
	public JTextArea jTextAreareferenciaMantenimientoeActivoFijos;
	public JScrollPane jscrollPanereferenciaMantenimientoeActivoFijos;
	public JButton jButtonreferenciaMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPaneltallerMantenimientoeActivoFijos;
	public JLabel jLabeltallerMantenimientoeActivoFijos;
	public JTextArea jTextAreatallerMantenimientoeActivoFijos;
	public JScrollPane jscrollPanetallerMantenimientoeActivoFijos;
	public JButton jButtontallerMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioMantenimientoeActivoFijos;
	public JLabel jLabelfecha_inicioMantenimientoeActivoFijos;
	//public JFormattedTextField jDateChooserfecha_inicioMantenimientoeActivoFijos;

	public JDateChooser jDateChooserfecha_inicioMantenimientoeActivoFijos;
	public JButton jButtonfecha_inicioMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaMantenimientoeActivoFijos;
	public JLabel jLabelfecha_entregaMantenimientoeActivoFijos;
	//public JFormattedTextField jDateChooserfecha_entregaMantenimientoeActivoFijos;

	public JDateChooser jDateChooserfecha_entregaMantenimientoeActivoFijos;
	public JButton jButtonfecha_entregaMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelcostoMantenimientoeActivoFijos;
	public JLabel jLabelcostoMantenimientoeActivoFijos;
	public JTextField jTextFieldcostoMantenimientoeActivoFijos;
	public JButton jButtoncostoMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelresponsableMantenimientoeActivoFijos;
	public JLabel jLabelresponsableMantenimientoeActivoFijos;
	public JTextArea jTextArearesponsableMantenimientoeActivoFijos;
	public JScrollPane jscrollPaneresponsableMantenimientoeActivoFijos;
	public JButton jButtonresponsableMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelobservacionMantenimientoeActivoFijos;
	public JLabel jLabelobservacionMantenimientoeActivoFijos;
	public JTextArea jTextAreaobservacionMantenimientoeActivoFijos;
	public JScrollPane jscrollPaneobservacionMantenimientoeActivoFijos;
	public JButton jButtonobservacionMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoMantenimientoeActivoFijos;
	public JLabel jLabeltipo_movimientoMantenimientoeActivoFijos;
	public JTextArea jTextAreatipo_movimientoMantenimientoeActivoFijos;
	public JScrollPane jscrollPanetipo_movimientoMantenimientoeActivoFijos;
	public JButton jButtontipo_movimientoMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelclaveMantenimientoeActivoFijos;
	public JLabel jLabelclaveMantenimientoeActivoFijos;
	public JTextField jTextFieldclaveMantenimientoeActivoFijos;
	public JButton jButtonclaveMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombreMantenimientoeActivoFijos;
	public JLabel jLabelnombreMantenimientoeActivoFijos;
	public JTextArea jTextAreanombreMantenimientoeActivoFijos;
	public JScrollPane jscrollPanenombreMantenimientoeActivoFijos;
	public JButton jButtonnombreMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoMantenimientoeActivoFijos;
	public JLabel jLabelcodigo_detalle_grupoMantenimientoeActivoFijos;
	public JTextField jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos;
	public JButton jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoMantenimientoeActivoFijos;
	public JLabel jLabelnombre_detalle_grupoMantenimientoeActivoFijos;
	public JTextArea jTextAreanombre_detalle_grupoMantenimientoeActivoFijos;
	public JScrollPane jscrollPanenombre_detalle_grupoMantenimientoeActivoFijos;
	public JButton jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMantenimientoeActivoFijos;
	public JLabel jLabelid_empresaMantenimientoeActivoFijos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMantenimientoeActivoFijos;
	public JButton jButtonid_empresaMantenimientoeActivoFijos= new JButtonMe();
	public JButton jButtonid_empresaMantenimientoeActivoFijosUpdate= new JButtonMe();
	public JButton jButtonid_empresaMantenimientoeActivoFijosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMantenimientoeActivoFijos;
	
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
	public int iHeightFormulario=924;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MantenimientoeActivoFijosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMantenimientoeActivoFijos=new JPanel();
				this.jPanelAccionesFormularioMantenimientoeActivoFijos=new JPanel();
				this.jmenuBarDetalleMantenimientoeActivoFijos=new JMenuBar();
				this.jTtoolBarDetalleMantenimientoeActivoFijos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MantenimientoeActivoFijosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MantenimientoeActivoFijosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MantenimientoeActivoFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMantenimientoeActivoFijos() {
		return this.jButtonActualizarToolBarMantenimientoeActivoFijos;
	}
	
	public JButton getjButtonEliminarToolBarMantenimientoeActivoFijos() {
		return this.jButtonEliminarToolBarMantenimientoeActivoFijos;
	}
	
	public JButton getjButtonCancelarToolBarMantenimientoeActivoFijos() {
		return this.jButtonCancelarToolBarMantenimientoeActivoFijos;
	}		
	
	public JButton getjButtonProcesarInformacionMantenimientoeActivoFijos() {
		return this.jButtonProcesarInformacionMantenimientoeActivoFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMantenimientoeActivoFijos)	{
		this.jButtonProcesarInformacionMantenimientoeActivoFijos = jButtonProcesarInformacionMantenimientoeActivoFijos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMantenimientoeActivoFijos() {
		return this.jComboBoxTiposAccionesMantenimientoeActivoFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposRelacionesMantenimientoeActivoFijos) {
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos = jComboBoxTiposRelacionesMantenimientoeActivoFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposAccionesMantenimientoeActivoFijos) {
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos = jComboBoxTiposAccionesMantenimientoeActivoFijos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMantenimientoeActivoFijos() {
		return this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMantenimientoeActivoFijos(
			JComboBox jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos) {
		this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos = jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean();
		
		this.mantenimientoeactivofijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mantenimientoeactivofijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MantenimientoeActivoFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MantenimientoeActivoFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MantenimientoeActivoFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mantenimientoe Activo Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1650) {
			iWidth=1650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
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
	
		MantenimientoeActivoFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMantenimientoeActivoFijos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMantenimientoeActivoFijos=new JButtonMe();
				this.jButtonModificarToolBarMantenimientoeActivoFijos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMantenimientoeActivoFijos,this.jTtoolBarDetalleMantenimientoeActivoFijos,
							"actualizar","actualizar","Actualizar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMantenimientoeActivoFijos,this.jTtoolBarDetalleMantenimientoeActivoFijos,
							"eliminar","eliminar","Eliminar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMantenimientoeActivoFijos,this.jTtoolBarDetalleMantenimientoeActivoFijos,
							"cancelar","cancelar","Cancelar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos,this.jTtoolBarDetalleMantenimientoeActivoFijos,
							"guardarcambios","guardarcambios","Guardar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMantenimientoeActivoFijos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMantenimientoeActivoFijos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMantenimientoeActivoFijos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMantenimientoeActivoFijos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMantenimientoeActivoFijos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMantenimientoeActivoFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMantenimientoeActivoFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMantenimientoeActivoFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMantenimientoeActivoFijos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMantenimientoeActivoFijos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMantenimientoeActivoFijos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMantenimientoeActivoFijos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMantenimientoeActivoFijos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMantenimientoeActivoFijos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMantenimientoeActivoFijos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMantenimientoeActivoFijos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMantenimientoeActivoFijos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMantenimientoeActivoFijos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMantenimientoeActivoFijos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMantenimientoeActivoFijos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMantenimientoeActivoFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMantenimientoeActivoFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMantenimientoeActivoFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMantenimientoeActivoFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMantenimientoeActivoFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMantenimientoeActivoFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMantenimientoeActivoFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMantenimientoeActivoFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMantenimientoeActivoFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMantenimientoeActivoFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMantenimientoeActivoFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMantenimientoeActivoFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMantenimientoeActivoFijos.add(this.jMenuItemDetalleCerrarMantenimientoeActivoFijos);
		
		this.jmenuDetalleAccionesMantenimientoeActivoFijos.add(this.jMenuItemActualizarMantenimientoeActivoFijos);
		this.jmenuDetalleAccionesMantenimientoeActivoFijos.add(this.jMenuItemEliminarMantenimientoeActivoFijos);
		this.jmenuDetalleAccionesMantenimientoeActivoFijos.add(this.jMenuItemCancelarMantenimientoeActivoFijos);		
		
		//this.jmenuDetalleDatosMantenimientoeActivoFijos.add(this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos);				
		this.jmenuDetalleDatosMantenimientoeActivoFijos.add(this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos);				
				
		//this.jmenuDetalleAccionesMantenimientoeActivoFijos.add(this.jMenuItemGuardarCambiosMantenimientoeActivoFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMantenimientoeActivoFijos.add(this.jmenuDetalleArchivoMantenimientoeActivoFijos);		
		this.jmenuBarDetalleMantenimientoeActivoFijos.add(this.jmenuDetalleAccionesMantenimientoeActivoFijos);		
		this.jmenuBarDetalleMantenimientoeActivoFijos.add(this.jmenuDetalleDatosMantenimientoeActivoFijos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMantenimientoeActivoFijos);				
	}
	
	
	public void inicializarElementosCamposMantenimientoeActivoFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMantenimientoeActivoFijos = new JLabelMe();
		jLabelIdMantenimientoeActivoFijos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMantenimientoeActivoFijos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMantenimientoeActivoFijos= new GridBagLayout();

		this.jPanelidMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);

		jLabelidMantenimientoeActivoFijos = new JLabel();
		jLabelidMantenimientoeActivoFijos.setText("Id");

		jLabelidMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_documentoMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelnumero_documentoMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoMantenimientoeActivoFijos.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelnumero_documentoMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextFieldnumero_documentoMantenimientoeActivoFijos= new JTextFieldMe();

		jTextFieldnumero_documentoMantenimientoeActivoFijos.setEnabled(false);
		jTextFieldnumero_documentoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelcausaMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelcausaMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA+" : *");
		this.jLabelcausaMantenimientoeActivoFijos.setToolTipText("Causa");
		this.jLabelcausaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcausaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcausaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcausaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcausaMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcausaMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelcausaMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreacausaMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreacausaMantenimientoeActivoFijos.setEnabled(false);
		jTextAreacausaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacausaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacausaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacausaMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreacausaMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreacausaMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacausaMantenimientoeActivoFijos.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreacausaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecausaMantenimientoeActivoFijos = new JScrollPane(jTextAreacausaMantenimientoeActivoFijos);
		jscrollPanecausaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecausaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanecausaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtoncausaMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtoncausaMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncausaMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncausaMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncausaMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtoncausaMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncausaMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncausaMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacausaMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacausaMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"causaMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncausaMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelreferenciaMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelreferenciaMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA+" : *");
		this.jLabelreferenciaMantenimientoeActivoFijos.setToolTipText("Referencia");
		this.jLabelreferenciaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelreferenciaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelreferenciaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelreferenciaMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelreferenciaMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelreferenciaMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreareferenciaMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreareferenciaMantenimientoeActivoFijos.setEnabled(false);
		jTextAreareferenciaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreareferenciaMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreareferenciaMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreareferenciaMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreareferenciaMantenimientoeActivoFijos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreareferenciaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanereferenciaMantenimientoeActivoFijos = new JScrollPane(jTextAreareferenciaMantenimientoeActivoFijos);
		jscrollPanereferenciaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanereferenciaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanereferenciaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonreferenciaMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreareferenciaMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreareferenciaMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"referenciaMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonreferenciaMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabeltallerMantenimientoeActivoFijos = new JLabelMe();
		this.jLabeltallerMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER+" : *");
		this.jLabeltallerMantenimientoeActivoFijos.setToolTipText("Taller");
		this.jLabeltallerMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallerMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallerMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltallerMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltallerMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltallerMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPaneltallerMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreatallerMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreatallerMantenimientoeActivoFijos.setEnabled(false);
		jTextAreatallerMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallerMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallerMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatallerMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreatallerMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreatallerMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatallerMantenimientoeActivoFijos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreatallerMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetallerMantenimientoeActivoFijos = new JScrollPane(jTextAreatallerMantenimientoeActivoFijos);
		jscrollPanetallerMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetallerMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanetallerMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtontallerMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtontallerMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallerMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallerMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontallerMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtontallerMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontallerMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontallerMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatallerMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatallerMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tallerMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontallerMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelfecha_inicioMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioMantenimientoeActivoFijos.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelfecha_inicioMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		//jFormattedTextFieldfecha_inicioMantenimientoeActivoFijos= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioMantenimientoeActivoFijos= new JDateChooser();
		jDateChooserfecha_inicioMantenimientoeActivoFijos.setEnabled(false);
		jDateChooserfecha_inicioMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioMantenimientoeActivoFijos.setDate(new Date());
		jDateChooserfecha_inicioMantenimientoeActivoFijos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioMantenimientoeActivoFijos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelfecha_entregaMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaMantenimientoeActivoFijos.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelfecha_entregaMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		//jFormattedTextFieldfecha_entregaMantenimientoeActivoFijos= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaMantenimientoeActivoFijos= new JDateChooser();
		jDateChooserfecha_entregaMantenimientoeActivoFijos.setEnabled(false);
		jDateChooserfecha_entregaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaMantenimientoeActivoFijos.setDate(new Date());
		jDateChooserfecha_entregaMantenimientoeActivoFijos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaMantenimientoeActivoFijos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelcostoMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelcostoMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoMantenimientoeActivoFijos.setToolTipText("Costo");
		this.jLabelcostoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelcostoMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextFieldcostoMantenimientoeActivoFijos= new JTextFieldMe();
		jTextFieldcostoMantenimientoeActivoFijos.setEnabled(false);
		jTextFieldcostoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoMantenimientoeActivoFijos.setText("0.0");

		this.jButtoncostoMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtoncostoMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtoncostoMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelresponsableMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelresponsableMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE+" : *");
		this.jLabelresponsableMantenimientoeActivoFijos.setToolTipText("Responsable");
		this.jLabelresponsableMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelresponsableMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextArearesponsableMantenimientoeActivoFijos= new JTextAreaMe();
		jTextArearesponsableMantenimientoeActivoFijos.setEnabled(false);
		jTextArearesponsableMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableMantenimientoeActivoFijos.setLineWrap(true);
		jTextArearesponsableMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextArearesponsableMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableMantenimientoeActivoFijos.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableMantenimientoeActivoFijos = new JScrollPane(jTextArearesponsableMantenimientoeActivoFijos);
		jscrollPaneresponsableMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresponsableMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneresponsableMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonresponsableMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelobservacionMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelobservacionMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionMantenimientoeActivoFijos.setToolTipText("Observacion");
		this.jLabelobservacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelobservacionMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreaobservacionMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreaobservacionMantenimientoeActivoFijos.setEnabled(false);
		jTextAreaobservacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreaobservacionMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreaobservacionMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionMantenimientoeActivoFijos.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionMantenimientoeActivoFijos = new JScrollPane(jTextAreaobservacionMantenimientoeActivoFijos);
		jscrollPaneobservacionMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoMantenimientoeActivoFijos = new JLabelMe();
		this.jLabeltipo_movimientoMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoMantenimientoeActivoFijos.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPaneltipo_movimientoMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreatipo_movimientoMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setEnabled(false);
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoMantenimientoeActivoFijos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoMantenimientoeActivoFijos = new JScrollPane(jTextAreatipo_movimientoMantenimientoeActivoFijos);
		jscrollPanetipo_movimientoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelclaveMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelclaveMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveMantenimientoeActivoFijos.setToolTipText("Clave");
		this.jLabelclaveMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelclaveMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextFieldclaveMantenimientoeActivoFijos= new JTextFieldMe();

		jTextFieldclaveMantenimientoeActivoFijos.setEnabled(false);
		jTextFieldclaveMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonclaveMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonclaveMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombreMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelnombreMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMantenimientoeActivoFijos.setToolTipText("Nombre");
		this.jLabelnombreMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelnombreMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreanombreMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreanombreMantenimientoeActivoFijos.setEnabled(false);
		jTextAreanombreMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreanombreMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreanombreMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreMantenimientoeActivoFijos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreMantenimientoeActivoFijos = new JScrollPane(jTextAreanombreMantenimientoeActivoFijos);
		jscrollPanenombreMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonnombreMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonnombreMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setEnabled(false);
		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelnombre_detalle_grupoMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoMantenimientoeActivoFijos.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos= new JTextAreaMe();
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setEnabled(false);
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setLineWrap(true);
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoMantenimientoeActivoFijos = new JScrollPane(jTextAreanombre_detalle_grupoMantenimientoeActivoFijos);
		jscrollPanenombre_detalle_grupoMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMantenimientoeActivoFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMantenimientoeActivoFijos = new JLabelMe();
		this.jLabelid_empresaMantenimientoeActivoFijos.setText(""+MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMantenimientoeActivoFijos.setToolTipText("Empresa");
		this.jLabelid_empresaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMantenimientoeActivoFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMantenimientoeActivoFijos.setToolTipText(MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		this.jPanelid_empresaMantenimientoeActivoFijos.setLayout(this.gridaBagLayoutMantenimientoeActivoFijos);


		jComboBoxid_empresaMantenimientoeActivoFijos= new JComboBoxMe();
		jComboBoxid_empresaMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMantenimientoeActivoFijos.setEnabled(false);

		this.jButtonid_empresaMantenimientoeActivoFijos= new JButtonMe();
		this.jButtonid_empresaMantenimientoeActivoFijos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMantenimientoeActivoFijos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMantenimientoeActivoFijos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMantenimientoeActivoFijos.setText("Buscar");
		this.jButtonid_empresaMantenimientoeActivoFijos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMantenimientoeActivoFijos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMantenimientoeActivoFijos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMantenimientoeActivoFijos"));

		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda= new JButtonMe();
		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setText("U");
		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMantenimientoeActivoFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMantenimientoeActivoFijosBusqueda"));

		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMantenimientoeActivoFijosBusqueda.setVisible(false);		}

		this.jButtonid_empresaMantenimientoeActivoFijosUpdate= new JButtonMe();
		this.jButtonid_empresaMantenimientoeActivoFijosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoeActivoFijosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMantenimientoeActivoFijosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMantenimientoeActivoFijosUpdate.setText("U");
		this.jButtonid_empresaMantenimientoeActivoFijosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMantenimientoeActivoFijosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMantenimientoeActivoFijosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMantenimientoeActivoFijosUpdate"));



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
		//this.jInternalFrameDetalleMantenimientoeActivoFijos = new MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mantenimientoe Activo Fijos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMantenimientoeActivoFijos= new GridBagLayout();
		

		
		String sToolTipMantenimientoeActivoFijos="";
		sToolTipMantenimientoeActivoFijos=MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMantenimientoeActivoFijos+="(ActivosFijos.MantenimientoeActivoFijos)";
		}
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipMantenimientoeActivoFijos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonModificarMantenimientoeActivoFijos = new JButtonMe();
        this.jButtonActualizarMantenimientoeActivoFijos = new JButtonMe();
        this.jButtonEliminarMantenimientoeActivoFijos = new JButtonMe();
        this.jButtonCancelarMantenimientoeActivoFijos = new JButtonMe();
        this.jButtonGuardarCambiosMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos = new JButtonMe();
		this.jButtonCerrarMantenimientoeActivoFijos = new JButtonMe();
		
		this.jScrollPanelDatosMantenimientoeActivoFijos = new JScrollPane();   
        this.jScrollPanelDatosEdicionMantenimientoeActivoFijos = new JScrollPane();
		this.jScrollPanelDatosGeneralMantenimientoeActivoFijos = new JScrollPane();
				
		
		
		this.jPanelCamposMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mantenimientoe Activo Fijos";
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mantenimientoe Activo Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosMantenimientoeActivoFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMantenimientoeActivoFijos.setName("jPanelCamposMantenimientoeActivoFijos"); 

		this.jPanelCamposOcultosMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMantenimientoeActivoFijos.setName("jPanelCamposOcultosMantenimientoeActivoFijos"); 

        this.jPanelAccionesMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMantenimientoeActivoFijos.setToolTipText("Acciones");
        this.jPanelAccionesMantenimientoeActivoFijos.setName("Acciones"); 

		this.jPanelAccionesFormularioMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMantenimientoeActivoFijos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMantenimientoeActivoFijos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMantenimientoeActivoFijos.setText("Nuevo");
		this.jButtonModificarMantenimientoeActivoFijos.setText("Editar");
        this.jButtonActualizarMantenimientoeActivoFijos.setText("Actualizar");
        this.jButtonEliminarMantenimientoeActivoFijos.setText("Eliminar");
        this.jButtonCancelarMantenimientoeActivoFijos.setText("Cancelar");
        this.jButtonGuardarCambiosMantenimientoeActivoFijos.setText("Guardar");
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.setText("Guardar");
		this.jButtonCerrarMantenimientoeActivoFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMantenimientoeActivoFijos,"nuevo_button","Nuevo",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMantenimientoeActivoFijos,"modificar_button","Editar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMantenimientoeActivoFijos,"actualizar_button","Actualizar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMantenimientoeActivoFijos,"eliminar_button","Eliminar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMantenimientoeActivoFijos,"cancelar_button","Cancelar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMantenimientoeActivoFijos,"guardarcambios_button","Guardar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos,"guardarcambiostabla_button","Guardar",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMantenimientoeActivoFijos,"cerrar_button","Salir",this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMantenimientoeActivoFijos.setToolTipText("Nuevo"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMantenimientoeActivoFijos.setToolTipText("Editar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMantenimientoeActivoFijos.setToolTipText("Actualizar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMantenimientoeActivoFijos.setToolTipText("Eliminar)"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMantenimientoeActivoFijos.setToolTipText("Cancelar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMantenimientoeActivoFijos.setToolTipText("Guardar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.setToolTipText("Guardar"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMantenimientoeActivoFijos.setToolTipText("Salir"+" "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMantenimientoeActivoFijos";
		inputMap = this.jButtonNuevoMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMantenimientoeActivoFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMantenimientoeActivoFijos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMantenimientoeActivoFijos";
		inputMap = this.jButtonActualizarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMantenimientoeActivoFijos"));
		
		//ELIMINAR
		sMapKey = "EliminarMantenimientoeActivoFijos";
		inputMap = this.jButtonEliminarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMantenimientoeActivoFijos"));
		
		//CANCELAR	
		sMapKey = "CancelarMantenimientoeActivoFijos";
		inputMap = this.jButtonCancelarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMantenimientoeActivoFijos"));
		
		//CERRAR		
		sMapKey = "CerrarMantenimientoeActivoFijos";
		inputMap = this.jButtonCerrarMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMantenimientoeActivoFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMantenimientoeActivoFijos";
		inputMap = this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMantenimientoeActivoFijos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMantenimientoeActivoFijos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMantenimientoeActivoFijos.setToolTipText("Nuevo MantenimientoeActivoFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos.setToolTipText("Sin Cerrar Ventana MantenimientoeActivoFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setText("Accion");
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMantenimientoeActivoFijos = new JLabelMe();
		
		this.jLabelAccionesMantenimientoeActivoFijos.setText("Acciones");		
		this.jLabelAccionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMantenimientoeActivoFijos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMantenimientoeActivoFijos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMantenimientoeActivoFijos=new JTabbedPane();
		this.jTabbedPaneRelacionesMantenimientoeActivoFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMantenimientoeActivoFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMantenimientoeActivoFijos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMantenimientoeActivoFijos = new GridBagLayout();
		
		this.jPanelCamposMantenimientoeActivoFijos.setLayout(gridaBagLayoutCamposMantenimientoeActivoFijos);
		this.jPanelCamposOcultosMantenimientoeActivoFijos.setLayout(gridaBagLayoutCamposOcultosMantenimientoeActivoFijos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMantenimientoeActivoFijos.add(jLabelIdMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMantenimientoeActivoFijos.add(jLabelidMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMantenimientoeActivoFijos.add(jLabelid_empresaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMantenimientoeActivoFijos.add(jButtonid_empresaMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 3;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMantenimientoeActivoFijos.add(jButtonid_empresaMantenimientoeActivoFijosUpdate, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMantenimientoeActivoFijos.add(jComboBoxid_empresaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoMantenimientoeActivoFijos.add(jLabelnumero_documentoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoMantenimientoeActivoFijos.add(jButtonnumero_documentoMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoMantenimientoeActivoFijos.add(jTextFieldnumero_documentoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcausaMantenimientoeActivoFijos.add(jLabelcausaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcausaMantenimientoeActivoFijos.add(jButtoncausaMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcausaMantenimientoeActivoFijos.add(jscrollPanecausaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelreferenciaMantenimientoeActivoFijos.add(jLabelreferenciaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelreferenciaMantenimientoeActivoFijos.add(jButtonreferenciaMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelreferenciaMantenimientoeActivoFijos.add(jscrollPanereferenciaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltallerMantenimientoeActivoFijos.add(jLabeltallerMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltallerMantenimientoeActivoFijos.add(jButtontallerMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltallerMantenimientoeActivoFijos.add(jscrollPanetallerMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioMantenimientoeActivoFijos.add(jLabelfecha_inicioMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioMantenimientoeActivoFijos.add(jButtonfecha_inicioMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioMantenimientoeActivoFijos.add(jDateChooserfecha_inicioMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaMantenimientoeActivoFijos.add(jLabelfecha_entregaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaMantenimientoeActivoFijos.add(jButtonfecha_entregaMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaMantenimientoeActivoFijos.add(jDateChooserfecha_entregaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoMantenimientoeActivoFijos.add(jLabelcostoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoMantenimientoeActivoFijos.add(jButtoncostoMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoMantenimientoeActivoFijos.add(jTextFieldcostoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableMantenimientoeActivoFijos.add(jLabelresponsableMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableMantenimientoeActivoFijos.add(jButtonresponsableMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableMantenimientoeActivoFijos.add(jscrollPaneresponsableMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionMantenimientoeActivoFijos.add(jLabelobservacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionMantenimientoeActivoFijos.add(jButtonobservacionMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionMantenimientoeActivoFijos.add(jscrollPaneobservacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoMantenimientoeActivoFijos.add(jLabeltipo_movimientoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoMantenimientoeActivoFijos.add(jButtontipo_movimientoMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoMantenimientoeActivoFijos.add(jscrollPanetipo_movimientoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveMantenimientoeActivoFijos.add(jLabelclaveMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveMantenimientoeActivoFijos.add(jButtonclaveMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveMantenimientoeActivoFijos.add(jTextFieldclaveMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMantenimientoeActivoFijos.add(jLabelnombreMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMantenimientoeActivoFijos.add(jButtonnombreMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMantenimientoeActivoFijos.add(jscrollPanenombreMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos.add(jLabelcodigo_detalle_grupoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos.add(jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos.add(jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos.add(jLabelnombre_detalle_grupoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		//this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 2;
		this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos.add(jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda, this.gridBagConstraintsMantenimientoeActivoFijos);
	}

	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 1;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos.add(jscrollPanenombre_detalle_grupoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelidMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelnumero_documentoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelcausaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelreferenciaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPaneltallerMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelfecha_inicioMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelfecha_entregaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelcostoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelresponsableMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelobservacionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPaneltipo_movimientoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelclaveMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelnombreMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMantenimientoeActivoFijos.add(this.jPanelnombre_detalle_grupoMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposMantenimientoeActivoFijos=0;
		iYPanelCamposMantenimientoeActivoFijos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iYPanelCamposOcultosMantenimientoeActivoFijos;
	this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iXPanelCamposOcultosMantenimientoeActivoFijos++;
	this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMantenimientoeActivoFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMantenimientoeActivoFijos.add(this.jPanelid_empresaMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);



	if(iXPanelCamposOcultosMantenimientoeActivoFijos % 2==0) {
		iXPanelCamposOcultosMantenimientoeActivoFijos=0;
		iYPanelCamposOcultosMantenimientoeActivoFijos++;
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
			
		GridBagLayout gridaBagLayoutAccionesMantenimientoeActivoFijos= new GridBagLayout();
		this.jPanelAccionesMantenimientoeActivoFijos.setLayout(gridaBagLayoutAccionesMantenimientoeActivoFijos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMantenimientoeActivoFijos= new GridBagLayout();
		this.jPanelAccionesFormularioMantenimientoeActivoFijos.setLayout(gridaBagLayoutAccionesFormularioMantenimientoeActivoFijos);
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMantenimientoeActivoFijos.add(this.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccion++;
			
		this.jPanelAccionesMantenimientoeActivoFijos.add(this.jButtonModificarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);							

		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iPosXAccion++;
			
		this.jPanelAccionesMantenimientoeActivoFijos.add(this.jButtonEliminarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesMantenimientoeActivoFijos.add(this.jButtonActualizarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);


		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesMantenimientoeActivoFijos.add(this.jButtonGuardarCambiosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);	
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = 0;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =iPosXAccion++;
		
		this.jPanelAccionesMantenimientoeActivoFijos.add(this.jButtonCancelarMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMantenimientoeActivoFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMantenimientoeActivoFijos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();						
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;		
			//this.gridBagConstraintsMantenimientoeActivoFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMantenimientoeActivoFijos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =0;
		this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMantenimientoeActivoFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMantenimientoeActivoFijos = new MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mantenimientoe Activo Fijos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mantenimientoe Activo Fijos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mantenimientoe Activo Fijos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MantenimientoeActivoFijosModel mantenimientoeactivofijosModel=new MantenimientoeActivoFijosModel(this);
			
			//SI USARA CLASE INTERNA
			//MantenimientoeActivoFijosModel.MantenimientoeActivoFijosFocusTraversalPolicy mantenimientoeactivofijosFocusTraversalPolicy = mantenimientoeactivofijosModel.new MantenimientoeActivoFijosFocusTraversalPolicy(this);
			
			//mantenimientoeactivofijosFocusTraversalPolicy.setmantenimientoeactivofijosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mantenimientoeactivofijosModel);
			
			
			this.jContentPaneDetalleMantenimientoeActivoFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMantenimientoeActivoFijos = new GridBagLayout();	
			this.jContentPaneDetalleMantenimientoeActivoFijos.setLayout(gridaBagLayoutDetalleMantenimientoeActivoFijos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMantenimientoeActivoFijos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
				this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
					
				
				this.jContentPaneDetalleMantenimientoeActivoFijos.add(jTtoolBarDetalleMantenimientoeActivoFijos, gridBagConstraintsMantenimientoeActivoFijos);								
				
}
			
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos=   new JScrollPane(jContentPaneDetalleMantenimientoeActivoFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	        
			this.jContentPaneDetalleMantenimientoeActivoFijos.add(jPanelCamposMantenimientoeActivoFijos, gridBagConstraintsMantenimientoeActivoFijos);
			
			
			
			
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
						//&& mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMantenimientoeActivoFijos= new GridBagConstraints();
						this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
						this.jContentPaneDetalleMantenimientoeActivoFijos.add(this.jTabbedPaneRelacionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMantenimientoeActivoFijos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMantenimientoeActivoFijos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
					this.gridBagConstraintsMantenimientoeActivoFijos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
					
				
					this.jContentPaneDetalleMantenimientoeActivoFijos.add(jPanelCamposOcultosMantenimientoeActivoFijos, gridBagConstraintsMantenimientoeActivoFijos);
				
					this.jPanelCamposOcultosMantenimientoeActivoFijos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	        this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMantenimientoeActivoFijos.add(this.jPanelAccionesFormularioMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);							
			
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
	        this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
	        
			
			this.jContentPaneDetalleMantenimientoeActivoFijos.add(this.jPanelAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMantenimientoeActivoFijos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos=   new JScrollPane(this.jPanelCamposMantenimientoeActivoFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
			this.gridBagConstraintsMantenimientoeActivoFijos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMantenimientoeActivoFijos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMantenimientoeActivoFijos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);			
			
			this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
			this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
			
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		
			
		this.gridBagConstraintsMantenimientoeActivoFijos = new GridBagConstraints();
		this.gridBagConstraintsMantenimientoeActivoFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMantenimientoeActivoFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMantenimientoeActivoFijos, this.gridBagConstraintsMantenimientoeActivoFijos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMantenimientoeActivoFijos;//jContentPane;
		
		return jScrollPanelDatosEdicionMantenimientoeActivoFijos;
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
