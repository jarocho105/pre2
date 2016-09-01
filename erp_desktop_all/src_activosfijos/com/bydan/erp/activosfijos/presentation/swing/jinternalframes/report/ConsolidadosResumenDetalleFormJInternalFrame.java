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
import com.bydan.erp.activosfijos.util.report.ConsolidadosResumenConstantesFunciones;

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
public class ConsolidadosResumenDetalleFormJInternalFrame extends ConsolidadosResumenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsolidadosResumen;
	
	protected JMenuBar jmenuBarDetalleConsolidadosResumen;
	
	protected JMenu jmenuDetalleConsolidadosResumen;
	protected JMenu jmenuDetalleArchivoConsolidadosResumen;
	protected JMenu jmenuDetalleAccionesConsolidadosResumen;
	protected JMenu jmenuDetalleDatosConsolidadosResumen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsolidadosResumen;	
	protected GridBagConstraints gridBagConstraintsConsolidadosResumen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsolidadosResumenBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsolidadosResumen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ConsolidadosResumenSessionBean consolidadosresumenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ConsolidadosResumenLogic consolidadosresumenLogic;
	
	public JScrollPane jScrollPanelDatosConsolidadosResumen;
	public JScrollPane jScrollPanelDatosEdicionConsolidadosResumen;
	public JScrollPane jScrollPanelDatosGeneralConsolidadosResumen;
	
	protected JPanel jPanelCamposConsolidadosResumen;    
	protected JPanel jPanelCamposOcultosConsolidadosResumen;    	
	protected JPanel jPanelAccionesConsolidadosResumen;
	protected JPanel jPanelAccionesFormularioConsolidadosResumen;
    
	
	
	protected Integer iXPanelCamposConsolidadosResumen=0;
	protected Integer iYPanelCamposConsolidadosResumen=0;
	
	protected Integer iXPanelCamposOcultosConsolidadosResumen=0;
	protected Integer iYPanelCamposOcultosConsolidadosResumen=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsolidadosResumen;
	public JButton jButtonModificarConsolidadosResumen;
	public JButton jButtonActualizarConsolidadosResumen;
    public JButton jButtonEliminarConsolidadosResumen;
	public JButton jButtonCancelarConsolidadosResumen;
    public JButton jButtonGuardarCambiosConsolidadosResumen;
	public JButton jButtonGuardarCambiosTablaConsolidadosResumen;
	protected JButton jButtonCerrarConsolidadosResumen;
	
	
	protected JButton jButtonProcesarInformacionConsolidadosResumen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsolidadosResumen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsolidadosResumen;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsolidadosResumen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsolidadosResumen;
	protected JButton jButtonModificarToolBarConsolidadosResumen;
	protected JButton jButtonActualizarToolBarConsolidadosResumen;
    protected JButton jButtonEliminarToolBarConsolidadosResumen;
	protected JButton jButtonCancelarToolBarConsolidadosResumen;
    protected JButton jButtonGuardarCambiosToolBarConsolidadosResumen;
	protected JButton jButtonGuardarCambiosTablaToolBarConsolidadosResumen;
	protected JButton jButtonMostrarOcultarTablaToolBarConsolidadosResumen;
	protected JButton jButtonCerrarToolBarConsolidadosResumen;
	
	protected JButton jButtonProcesarInformacionToolBarConsolidadosResumen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsolidadosResumen;
	protected JMenuItem jMenuItemModificarConsolidadosResumen;
	protected JMenuItem jMenuItemActualizarConsolidadosResumen;
    protected JMenuItem jMenuItemEliminarConsolidadosResumen;
	protected JMenuItem jMenuItemCancelarConsolidadosResumen;
    protected JMenuItem jMenuItemGuardarCambiosConsolidadosResumen;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsolidadosResumen;
	protected JMenuItem jMenuItemCerrarConsolidadosResumen;
	protected JMenuItem jMenuItemDetalleCerrarConsolidadosResumen;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsolidadosResumen;
	
	protected JMenuItem jMenuItemProcesarInformacionConsolidadosResumen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsolidadosResumen;
	protected JMenuItem jMenuItemMostrarOcultarConsolidadosResumen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsolidadosResumen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsolidadosResumen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsolidadosResumen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsolidadosResumen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsolidadosResumen;
	public JLabel jLabelIdConsolidadosResumen;
	public JLabel jLabelidConsolidadosResumen;
	public JButton jButtonidConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empresaConsolidadosResumen;
	public JLabel jLabelnombre_empresaConsolidadosResumen;
	public JTextArea jTextAreanombre_empresaConsolidadosResumen;
	public JScrollPane jscrollPanenombre_empresaConsolidadosResumen;
	public JButton jButtonnombre_empresaConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalConsolidadosResumen;
	public JLabel jLabelnombre_sucursalConsolidadosResumen;
	public JTextArea jTextAreanombre_sucursalConsolidadosResumen;
	public JScrollPane jscrollPanenombre_sucursalConsolidadosResumen;
	public JButton jButtonnombre_sucursalConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoConsolidadosResumen;
	public JLabel jLabelcodigo_sub_grupoConsolidadosResumen;
	public JTextField jTextFieldcodigo_sub_grupoConsolidadosResumen;
	public JButton jButtoncodigo_sub_grupoConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoConsolidadosResumen;
	public JLabel jLabelnombre_sub_grupoConsolidadosResumen;
	public JTextArea jTextAreanombre_sub_grupoConsolidadosResumen;
	public JScrollPane jscrollPanenombre_sub_grupoConsolidadosResumen;
	public JButton jButtonnombre_sub_grupoConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoConsolidadosResumen;
	public JLabel jLabelcodigo_detalle_grupoConsolidadosResumen;
	public JTextField jTextFieldcodigo_detalle_grupoConsolidadosResumen;
	public JButton jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoConsolidadosResumen;
	public JLabel jLabelnombre_detalle_grupoConsolidadosResumen;
	public JTextArea jTextAreanombre_detalle_grupoConsolidadosResumen;
	public JScrollPane jscrollPanenombre_detalle_grupoConsolidadosResumen;
	public JButton jButtonnombre_detalle_grupoConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelclaveConsolidadosResumen;
	public JLabel jLabelclaveConsolidadosResumen;
	public JTextField jTextFieldclaveConsolidadosResumen;
	public JButton jButtonclaveConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelnombreConsolidadosResumen;
	public JLabel jLabelnombreConsolidadosResumen;
	public JTextArea jTextAreanombreConsolidadosResumen;
	public JScrollPane jscrollPanenombreConsolidadosResumen;
	public JButton jButtonnombreConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraConsolidadosResumen;
	public JLabel jLabelfecha_compraConsolidadosResumen;
	//public JFormattedTextField jDateChooserfecha_compraConsolidadosResumen;

	public JDateChooser jDateChooserfecha_compraConsolidadosResumen;
	public JButton jButtonfecha_compraConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilConsolidadosResumen;
	public JLabel jLabelvida_utilConsolidadosResumen;
	public JTextField jTextFieldvida_utilConsolidadosResumen;
	public JButton jButtonvida_utilConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraConsolidadosResumen;
	public JLabel jLabelcosto_de_compraConsolidadosResumen;
	public JTextField jTextFieldcosto_de_compraConsolidadosResumen;
	public JButton jButtoncosto_de_compraConsolidadosResumenBusqueda= new JButtonMe();

	public JPanel jPanelcantidadConsolidadosResumen;
	public JLabel jLabelcantidadConsolidadosResumen;
	public JTextField jTextFieldcantidadConsolidadosResumen;
	public JButton jButtoncantidadConsolidadosResumenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsolidadosResumen;
	public JLabel jLabelid_empresaConsolidadosResumen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsolidadosResumen;
	public JButton jButtonid_empresaConsolidadosResumen= new JButtonMe();
	public JButton jButtonid_empresaConsolidadosResumenUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsolidadosResumenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsolidadosResumen;
	
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
	public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConsolidadosResumenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsolidadosResumen=new JPanel();
				this.jPanelAccionesFormularioConsolidadosResumen=new JPanel();
				this.jmenuBarDetalleConsolidadosResumen=new JMenuBar();
				this.jTtoolBarDetalleConsolidadosResumen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsolidadosResumenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosResumenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsolidadosResumen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConsolidadosResumen() {
		return this.jButtonActualizarToolBarConsolidadosResumen;
	}
	
	public JButton getjButtonEliminarToolBarConsolidadosResumen() {
		return this.jButtonEliminarToolBarConsolidadosResumen;
	}
	
	public JButton getjButtonCancelarToolBarConsolidadosResumen() {
		return this.jButtonCancelarToolBarConsolidadosResumen;
	}		
	
	public JButton getjButtonProcesarInformacionConsolidadosResumen() {
		return this.jButtonProcesarInformacionConsolidadosResumen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsolidadosResumen)	{
		this.jButtonProcesarInformacionConsolidadosResumen = jButtonProcesarInformacionConsolidadosResumen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsolidadosResumen() {
		return this.jComboBoxTiposAccionesConsolidadosResumen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsolidadosResumen(
			JComboBox jComboBoxTiposRelacionesConsolidadosResumen) {
		this.jComboBoxTiposRelacionesConsolidadosResumen = jComboBoxTiposRelacionesConsolidadosResumen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsolidadosResumen(
			JComboBox jComboBoxTiposAccionesConsolidadosResumen) {
		this.jComboBoxTiposAccionesConsolidadosResumen = jComboBoxTiposAccionesConsolidadosResumen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsolidadosResumen() {
		return this.jComboBoxTiposAccionesFormularioConsolidadosResumen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsolidadosResumen(
			JComboBox jComboBoxTiposAccionesFormularioConsolidadosResumen) {
		this.jComboBoxTiposAccionesFormularioConsolidadosResumen = jComboBoxTiposAccionesFormularioConsolidadosResumen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consolidadosresumenSessionBean=new ConsolidadosResumenSessionBean();
		
		this.consolidadosresumenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consolidadosresumenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consolidadosresumenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsolidadosResumenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsolidadosResumenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsolidadosResumenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consolidados Resumen MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsolidadosResumenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsolidadosResumen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsolidadosResumen=new JButtonMe();
				this.jButtonModificarToolBarConsolidadosResumen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsolidadosResumen,this.jTtoolBarDetalleConsolidadosResumen,
							"actualizar","actualizar","Actualizar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsolidadosResumen,this.jTtoolBarDetalleConsolidadosResumen,
							"eliminar","eliminar","Eliminar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsolidadosResumen,this.jTtoolBarDetalleConsolidadosResumen,
							"cancelar","cancelar","Cancelar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsolidadosResumen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsolidadosResumen,this.jTtoolBarDetalleConsolidadosResumen,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsolidadosResumen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsolidadosResumen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsolidadosResumen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsolidadosResumen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsolidadosResumen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsolidadosResumen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsolidadosResumen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsolidadosResumen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsolidadosResumen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsolidadosResumen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsolidadosResumen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsolidadosResumen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsolidadosResumen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsolidadosResumen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsolidadosResumen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsolidadosResumen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsolidadosResumen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsolidadosResumen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsolidadosResumen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsolidadosResumen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsolidadosResumen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsolidadosResumen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsolidadosResumen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsolidadosResumen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsolidadosResumen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsolidadosResumen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsolidadosResumen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsolidadosResumen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsolidadosResumen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsolidadosResumen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsolidadosResumen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsolidadosResumen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsolidadosResumen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsolidadosResumen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsolidadosResumen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsolidadosResumen.add(this.jMenuItemDetalleCerrarConsolidadosResumen);
		
		this.jmenuDetalleAccionesConsolidadosResumen.add(this.jMenuItemActualizarConsolidadosResumen);
		this.jmenuDetalleAccionesConsolidadosResumen.add(this.jMenuItemEliminarConsolidadosResumen);
		this.jmenuDetalleAccionesConsolidadosResumen.add(this.jMenuItemCancelarConsolidadosResumen);		
		
		//this.jmenuDetalleDatosConsolidadosResumen.add(this.jMenuItemDetalleAbrirOrderByConsolidadosResumen);				
		this.jmenuDetalleDatosConsolidadosResumen.add(this.jMenuItemDetalleMostarOcultarConsolidadosResumen);				
				
		//this.jmenuDetalleAccionesConsolidadosResumen.add(this.jMenuItemGuardarCambiosConsolidadosResumen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsolidadosResumen.add(this.jmenuDetalleArchivoConsolidadosResumen);		
		this.jmenuBarDetalleConsolidadosResumen.add(this.jmenuDetalleAccionesConsolidadosResumen);		
		this.jmenuBarDetalleConsolidadosResumen.add(this.jmenuDetalleDatosConsolidadosResumen);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsolidadosResumen);				
	}
	
	
	public void inicializarElementosCamposConsolidadosResumen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsolidadosResumen = new JLabelMe();
		jLabelIdConsolidadosResumen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsolidadosResumen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsolidadosResumen= new GridBagLayout();

		this.jPanelidConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);

		jLabelidConsolidadosResumen = new JLabel();
		jLabelidConsolidadosResumen.setText("Id");

		jLabelidConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_empresaConsolidadosResumen = new JLabelMe();
		this.jLabelnombre_empresaConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombre_empresaConsolidadosResumen.setToolTipText("Nombre Empresa");
		this.jLabelnombre_empresaConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empresaConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empresaConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empresaConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelnombre_empresaConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextAreanombre_empresaConsolidadosResumen= new JTextAreaMe();
		jTextAreanombre_empresaConsolidadosResumen.setEnabled(false);
		jTextAreanombre_empresaConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaConsolidadosResumen.setLineWrap(true);
		jTextAreanombre_empresaConsolidadosResumen.setWrapStyleWord(true);
		jTextAreanombre_empresaConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empresaConsolidadosResumen.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empresaConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empresaConsolidadosResumen = new JScrollPane(jTextAreanombre_empresaConsolidadosResumen);
		jscrollPanenombre_empresaConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_empresaConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonnombre_empresaConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empresaConsolidadosResumenBusqueda.setText("U");
		this.jButtonnombre_empresaConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empresaConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empresaConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empresaConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empresaConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empresaConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empresaConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalConsolidadosResumen = new JLabelMe();
		this.jLabelnombre_sucursalConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalConsolidadosResumen.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelnombre_sucursalConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextAreanombre_sucursalConsolidadosResumen= new JTextAreaMe();
		jTextAreanombre_sucursalConsolidadosResumen.setEnabled(false);
		jTextAreanombre_sucursalConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalConsolidadosResumen.setLineWrap(true);
		jTextAreanombre_sucursalConsolidadosResumen.setWrapStyleWord(true);
		jTextAreanombre_sucursalConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalConsolidadosResumen.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalConsolidadosResumen = new JScrollPane(jTextAreanombre_sucursalConsolidadosResumen);
		jscrollPanenombre_sucursalConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setText("U");
		this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sub_grupoConsolidadosResumen = new JLabelMe();
		this.jLabelcodigo_sub_grupoConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoConsolidadosResumen.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelcodigo_sub_grupoConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextFieldcodigo_sub_grupoConsolidadosResumen= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoConsolidadosResumen.setEnabled(false);
		jTextFieldcodigo_sub_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoConsolidadosResumen = new JLabelMe();
		this.jLabelnombre_sub_grupoConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoConsolidadosResumen.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelnombre_sub_grupoConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextAreanombre_sub_grupoConsolidadosResumen= new JTextAreaMe();
		jTextAreanombre_sub_grupoConsolidadosResumen.setEnabled(false);
		jTextAreanombre_sub_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoConsolidadosResumen.setLineWrap(true);
		jTextAreanombre_sub_grupoConsolidadosResumen.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoConsolidadosResumen.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoConsolidadosResumen = new JScrollPane(jTextAreanombre_sub_grupoConsolidadosResumen);
		jscrollPanenombre_sub_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setText("U");
		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoConsolidadosResumen = new JLabelMe();
		this.jLabelcodigo_detalle_grupoConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoConsolidadosResumen.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextFieldcodigo_detalle_grupoConsolidadosResumen= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoConsolidadosResumen.setEnabled(false);
		jTextFieldcodigo_detalle_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoConsolidadosResumen = new JLabelMe();
		this.jLabelnombre_detalle_grupoConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoConsolidadosResumen.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelnombre_detalle_grupoConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextAreanombre_detalle_grupoConsolidadosResumen= new JTextAreaMe();
		jTextAreanombre_detalle_grupoConsolidadosResumen.setEnabled(false);
		jTextAreanombre_detalle_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoConsolidadosResumen.setLineWrap(true);
		jTextAreanombre_detalle_grupoConsolidadosResumen.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoConsolidadosResumen.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoConsolidadosResumen = new JScrollPane(jTextAreanombre_detalle_grupoConsolidadosResumen);
		jscrollPanenombre_detalle_grupoConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelclaveConsolidadosResumen = new JLabelMe();
		this.jLabelclaveConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveConsolidadosResumen.setToolTipText("Clave");
		this.jLabelclaveConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelclaveConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextFieldclaveConsolidadosResumen= new JTextFieldMe();

		jTextFieldclaveConsolidadosResumen.setEnabled(false);
		jTextFieldclaveConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonclaveConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveConsolidadosResumenBusqueda.setText("U");
		this.jButtonclaveConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelnombreConsolidadosResumen = new JLabelMe();
		this.jLabelnombreConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConsolidadosResumen.setToolTipText("Nombre");
		this.jLabelnombreConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelnombreConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextAreanombreConsolidadosResumen= new JTextAreaMe();
		jTextAreanombreConsolidadosResumen.setEnabled(false);
		jTextAreanombreConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsolidadosResumen.setLineWrap(true);
		jTextAreanombreConsolidadosResumen.setWrapStyleWord(true);
		jTextAreanombreConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConsolidadosResumen.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConsolidadosResumen = new JScrollPane(jTextAreanombreConsolidadosResumen);
		jscrollPanenombreConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonnombreConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConsolidadosResumenBusqueda.setText("U");
		this.jButtonnombreConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraConsolidadosResumen = new JLabelMe();
		this.jLabelfecha_compraConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraConsolidadosResumen.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelfecha_compraConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		//jFormattedTextFieldfecha_compraConsolidadosResumen= new JFormattedTextFieldMe();

		jDateChooserfecha_compraConsolidadosResumen= new JDateChooser();
		jDateChooserfecha_compraConsolidadosResumen.setEnabled(false);
		jDateChooserfecha_compraConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraConsolidadosResumen.setDate(new Date());
		jDateChooserfecha_compraConsolidadosResumen.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraConsolidadosResumen.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonfecha_compraConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraConsolidadosResumenBusqueda.setText("U");
		this.jButtonfecha_compraConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilConsolidadosResumen = new JLabelMe();
		this.jLabelvida_utilConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilConsolidadosResumen.setToolTipText("Va Util");
		this.jLabelvida_utilConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelvida_utilConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextFieldvida_utilConsolidadosResumen= new JTextFieldMe();
		jTextFieldvida_utilConsolidadosResumen.setEnabled(false);
		jTextFieldvida_utilConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilConsolidadosResumen.setText("0.0");

		this.jButtonvida_utilConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonvida_utilConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilConsolidadosResumenBusqueda.setText("U");
		this.jButtonvida_utilConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraConsolidadosResumen = new JLabelMe();
		this.jLabelcosto_de_compraConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraConsolidadosResumen.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelcosto_de_compraConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextFieldcosto_de_compraConsolidadosResumen= new JTextFieldMe();
		jTextFieldcosto_de_compraConsolidadosResumen.setEnabled(false);
		jTextFieldcosto_de_compraConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraConsolidadosResumen.setText("0.0");

		this.jButtoncosto_de_compraConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setText("U");
		this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraConsolidadosResumenBusqueda.setVisible(false);		}


					
		this.jLabelcantidadConsolidadosResumen = new JLabelMe();
		this.jLabelcantidadConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadConsolidadosResumen.setToolTipText("Cantad");
		this.jLabelcantidadConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelcantidadConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jTextFieldcantidadConsolidadosResumen= new JTextFieldMe();
		jTextFieldcantidadConsolidadosResumen.setEnabled(false);
		jTextFieldcantidadConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadConsolidadosResumen.setText("0");

		this.jButtoncantidadConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtoncantidadConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadConsolidadosResumenBusqueda.setText("U");
		this.jButtoncantidadConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadConsolidadosResumenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsolidadosResumen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsolidadosResumen = new JLabelMe();
		this.jLabelid_empresaConsolidadosResumen.setText(""+ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsolidadosResumen.setToolTipText("Empresa");
		this.jLabelid_empresaConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsolidadosResumen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsolidadosResumen.setToolTipText(ConsolidadosResumenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		this.jPanelid_empresaConsolidadosResumen.setLayout(this.gridaBagLayoutConsolidadosResumen);


		jComboBoxid_empresaConsolidadosResumen= new JComboBoxMe();
		jComboBoxid_empresaConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsolidadosResumen.setEnabled(false);

		this.jButtonid_empresaConsolidadosResumen= new JButtonMe();
		this.jButtonid_empresaConsolidadosResumen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsolidadosResumen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsolidadosResumen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsolidadosResumen.setText("Buscar");
		this.jButtonid_empresaConsolidadosResumen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsolidadosResumen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsolidadosResumen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsolidadosResumen"));

		this.jButtonid_empresaConsolidadosResumenBusqueda= new JButtonMe();
		this.jButtonid_empresaConsolidadosResumenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosResumenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosResumenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsolidadosResumenBusqueda.setText("U");
		this.jButtonid_empresaConsolidadosResumenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsolidadosResumenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsolidadosResumenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsolidadosResumenBusqueda"));

		if(this.consolidadosresumenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsolidadosResumenBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsolidadosResumenUpdate= new JButtonMe();
		this.jButtonid_empresaConsolidadosResumenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosResumenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosResumenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsolidadosResumenUpdate.setText("U");
		this.jButtonid_empresaConsolidadosResumenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsolidadosResumenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsolidadosResumenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsolidadosResumen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsolidadosResumen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsolidadosResumenUpdate"));



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
		//this.jInternalFrameDetalleConsolidadosResumen = new ConsolidadosResumenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consolidados Resumen DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsolidadosResumen= new GridBagLayout();
		

		
		String sToolTipConsolidadosResumen="";
		sToolTipConsolidadosResumen=ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsolidadosResumen+="(ActivosFijos.ConsolidadosResumen)";
		}
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsolidadosResumen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsolidadosResumen = new JButtonMe();
		this.jButtonModificarConsolidadosResumen = new JButtonMe();
        this.jButtonActualizarConsolidadosResumen = new JButtonMe();
        this.jButtonEliminarConsolidadosResumen = new JButtonMe();
        this.jButtonCancelarConsolidadosResumen = new JButtonMe();
        this.jButtonGuardarCambiosConsolidadosResumen = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsolidadosResumen = new JButtonMe();
		this.jButtonCerrarConsolidadosResumen = new JButtonMe();
		
		this.jScrollPanelDatosConsolidadosResumen = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsolidadosResumen = new JScrollPane();
		this.jScrollPanelDatosGeneralConsolidadosResumen = new JScrollPane();
				
		
		
		this.jPanelCamposConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Consolidados Resumen";
		
		if(!this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Resumenes" + this.sPath));
		} else {
			this.jScrollPanelDatosConsolidadosResumen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConsolidadosResumen.setName("jPanelCamposConsolidadosResumen"); 

		this.jPanelCamposOcultosConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsolidadosResumen.setName("jPanelCamposOcultosConsolidadosResumen"); 

        this.jPanelAccionesConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsolidadosResumen.setToolTipText("Acciones");
        this.jPanelAccionesConsolidadosResumen.setName("Acciones"); 

		this.jPanelAccionesFormularioConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsolidadosResumen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsolidadosResumen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsolidadosResumen.setText("Nuevo");
		this.jButtonModificarConsolidadosResumen.setText("Editar");
        this.jButtonActualizarConsolidadosResumen.setText("Actualizar");
        this.jButtonEliminarConsolidadosResumen.setText("Eliminar");
        this.jButtonCancelarConsolidadosResumen.setText("Cancelar");
        this.jButtonGuardarCambiosConsolidadosResumen.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsolidadosResumen.setText("Guardar");
		this.jButtonCerrarConsolidadosResumen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsolidadosResumen,"nuevo_button","Nuevo",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsolidadosResumen,"modificar_button","Editar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsolidadosResumen,"actualizar_button","Actualizar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsolidadosResumen,"eliminar_button","Eliminar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsolidadosResumen,"cancelar_button","Cancelar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsolidadosResumen,"guardarcambios_button","Guardar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsolidadosResumen,"guardarcambiostabla_button","Guardar",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsolidadosResumen,"cerrar_button","Salir",this.consolidadosresumenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsolidadosResumen.setToolTipText("Nuevo"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsolidadosResumen.setToolTipText("Editar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsolidadosResumen.setToolTipText("Actualizar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsolidadosResumen.setToolTipText("Eliminar)"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsolidadosResumen.setToolTipText("Cancelar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsolidadosResumen.setToolTipText("Guardar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsolidadosResumen.setToolTipText("Guardar"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsolidadosResumen.setToolTipText("Salir"+" "+ConsolidadosResumenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsolidadosResumen";
		inputMap = this.jButtonNuevoConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsolidadosResumen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsolidadosResumen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsolidadosResumen";
		inputMap = this.jButtonActualizarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsolidadosResumen"));
		
		//ELIMINAR
		sMapKey = "EliminarConsolidadosResumen";
		inputMap = this.jButtonEliminarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsolidadosResumen"));
		
		//CANCELAR	
		sMapKey = "CancelarConsolidadosResumen";
		inputMap = this.jButtonCancelarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsolidadosResumen"));
		
		//CERRAR		
		sMapKey = "CerrarConsolidadosResumen";
		inputMap = this.jButtonCerrarConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsolidadosResumen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsolidadosResumen";
		inputMap = this.jButtonGuardarCambiosTablaConsolidadosResumen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsolidadosResumen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsolidadosResumen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsolidadosResumen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsolidadosResumen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsolidadosResumen.setToolTipText("Nuevo ConsolidadosResumen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsolidadosResumen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsolidadosResumen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsolidadosResumen.setToolTipText("Sin Cerrar Ventana ConsolidadosResumen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsolidadosResumen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsolidadosResumen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsolidadosResumen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsolidadosResumen.setText("Accion");
		this.jComboBoxTiposAccionesConsolidadosResumen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsolidadosResumen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsolidadosResumen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsolidadosResumen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsolidadosResumen = new JLabelMe();
		
		this.jLabelAccionesConsolidadosResumen.setText("Acciones");		
		this.jLabelAccionesConsolidadosResumen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosResumen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosResumen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsolidadosResumen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsolidadosResumen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsolidadosResumen=new JTabbedPane();
		this.jTabbedPaneRelacionesConsolidadosResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsolidadosResumen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsolidadosResumen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosResumen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosResumen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsolidadosResumen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsolidadosResumen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsolidadosResumen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsolidadosResumen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsolidadosResumen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsolidadosResumen = new GridBagLayout();
		
		this.jPanelCamposConsolidadosResumen.setLayout(gridaBagLayoutCamposConsolidadosResumen);
		this.jPanelCamposOcultosConsolidadosResumen.setLayout(gridaBagLayoutCamposOcultosConsolidadosResumen);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsolidadosResumen.add(jLabelIdConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsolidadosResumen.add(jLabelidConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsolidadosResumen.add(jLabelid_empresaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsolidadosResumen.add(jButtonid_empresaConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 3;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsolidadosResumen.add(jButtonid_empresaConsolidadosResumenUpdate, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsolidadosResumen.add(jComboBoxid_empresaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empresaConsolidadosResumen.add(jLabelnombre_empresaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empresaConsolidadosResumen.add(jButtonnombre_empresaConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empresaConsolidadosResumen.add(jscrollPanenombre_empresaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalConsolidadosResumen.add(jLabelnombre_sucursalConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalConsolidadosResumen.add(jButtonnombre_sucursalConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalConsolidadosResumen.add(jscrollPanenombre_sucursalConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoConsolidadosResumen.add(jLabelcodigo_sub_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoConsolidadosResumen.add(jButtoncodigo_sub_grupoConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoConsolidadosResumen.add(jTextFieldcodigo_sub_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoConsolidadosResumen.add(jLabelnombre_sub_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoConsolidadosResumen.add(jButtonnombre_sub_grupoConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoConsolidadosResumen.add(jscrollPanenombre_sub_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoConsolidadosResumen.add(jLabelcodigo_detalle_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoConsolidadosResumen.add(jButtoncodigo_detalle_grupoConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoConsolidadosResumen.add(jTextFieldcodigo_detalle_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoConsolidadosResumen.add(jLabelnombre_detalle_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoConsolidadosResumen.add(jButtonnombre_detalle_grupoConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoConsolidadosResumen.add(jscrollPanenombre_detalle_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveConsolidadosResumen.add(jLabelclaveConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveConsolidadosResumen.add(jButtonclaveConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveConsolidadosResumen.add(jTextFieldclaveConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConsolidadosResumen.add(jLabelnombreConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConsolidadosResumen.add(jButtonnombreConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConsolidadosResumen.add(jscrollPanenombreConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraConsolidadosResumen.add(jLabelfecha_compraConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraConsolidadosResumen.add(jButtonfecha_compraConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraConsolidadosResumen.add(jDateChooserfecha_compraConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilConsolidadosResumen.add(jLabelvida_utilConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilConsolidadosResumen.add(jButtonvida_utilConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilConsolidadosResumen.add(jTextFieldvida_utilConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraConsolidadosResumen.add(jLabelcosto_de_compraConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraConsolidadosResumen.add(jButtoncosto_de_compraConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraConsolidadosResumen.add(jTextFieldcosto_de_compraConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadConsolidadosResumen.add(jLabelcantidadConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = 2;
		this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
		this.gridBagConstraintsConsolidadosResumen.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadConsolidadosResumen.add(jButtoncantidadConsolidadosResumenBusqueda, this.gridBagConstraintsConsolidadosResumen);
	}

	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosResumen.gridy = 0;
	this.gridBagConstraintsConsolidadosResumen.gridx = 1;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadConsolidadosResumen.add(jTextFieldcantidadConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelidConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelnombre_empresaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelnombre_sucursalConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelcodigo_sub_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelnombre_sub_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelcodigo_detalle_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelnombre_detalle_grupoConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelclaveConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelnombreConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelfecha_compraConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelvida_utilConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelcosto_de_compraConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosResumen.add(this.jPanelcantidadConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposConsolidadosResumen % 2==0) {
		iXPanelCamposConsolidadosResumen=0;
		iYPanelCamposConsolidadosResumen++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosResumen.gridy = iYPanelCamposOcultosConsolidadosResumen;
	this.gridBagConstraintsConsolidadosResumen.gridx = iXPanelCamposOcultosConsolidadosResumen++;
	this.gridBagConstraintsConsolidadosResumen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosResumen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsolidadosResumen.add(this.jPanelid_empresaConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);



	if(iXPanelCamposOcultosConsolidadosResumen % 2==0) {
		iXPanelCamposOcultosConsolidadosResumen=0;
		iYPanelCamposOcultosConsolidadosResumen++;
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
			
		GridBagLayout gridaBagLayoutAccionesConsolidadosResumen= new GridBagLayout();
		this.jPanelAccionesConsolidadosResumen.setLayout(gridaBagLayoutAccionesConsolidadosResumen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsolidadosResumen= new GridBagLayout();
		this.jPanelAccionesFormularioConsolidadosResumen.setLayout(gridaBagLayoutAccionesFormularioConsolidadosResumen);
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsolidadosResumen.add(this.jComboBoxTiposAccionesFormularioConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsolidadosResumen.add(this.jButtonModificarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);							

		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;
		this.gridBagConstraintsConsolidadosResumen.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsolidadosResumen.add(this.jButtonEliminarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsolidadosResumen.add(this.jButtonActualizarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);


		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;		
		this.gridBagConstraintsConsolidadosResumen.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsolidadosResumen.add(this.jButtonGuardarCambiosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);	
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = 0;		
		this.gridBagConstraintsConsolidadosResumen.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsolidadosResumen.add(this.jButtonCancelarConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsolidadosResumen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsolidadosResumen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consolidadosresumenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();						
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;		
			//this.gridBagConstraintsConsolidadosResumen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsolidadosResumen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsolidadosResumen.gridx =0;
		this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsolidadosResumen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsolidadosResumenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsolidadosResumen = new ConsolidadosResumenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consolidados Resumen DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consolidados Resumen DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consolidados Resumen Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsolidadosResumenModel consolidadosresumenModel=new ConsolidadosResumenModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsolidadosResumenModel.ConsolidadosResumenFocusTraversalPolicy consolidadosresumenFocusTraversalPolicy = consolidadosresumenModel.new ConsolidadosResumenFocusTraversalPolicy(this);
			
			//consolidadosresumenFocusTraversalPolicy.setconsolidadosresumenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consolidadosresumenModel);
			
			
			this.jContentPaneDetalleConsolidadosResumen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsolidadosResumen = new GridBagLayout();	
			this.jContentPaneDetalleConsolidadosResumen.setLayout(gridaBagLayoutDetalleConsolidadosResumen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsolidadosResumen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
				this.gridBagConstraintsConsolidadosResumen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsolidadosResumen.gridx = 0;
					
				
				this.jContentPaneDetalleConsolidadosResumen.add(jTtoolBarDetalleConsolidadosResumen, gridBagConstraintsConsolidadosResumen);								
				
}
			
			this.jScrollPanelDatosEdicionConsolidadosResumen=   new JScrollPane(jContentPaneDetalleConsolidadosResumen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsolidadosResumen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosResumen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosResumen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsolidadosResumen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsolidadosResumen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosResumen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosResumen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConsolidadosResumen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	        
			this.jContentPaneDetalleConsolidadosResumen.add(jPanelCamposConsolidadosResumen, gridBagConstraintsConsolidadosResumen);
			
			
			
			
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
						//&& consolidadosresumenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.consolidadosresumenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsolidadosResumen= new GridBagConstraints();
						this.gridBagConstraintsConsolidadosResumen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsolidadosResumen.gridx = 0;
						this.jContentPaneDetalleConsolidadosResumen.add(this.jTabbedPaneRelacionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsolidadosResumen.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsolidadosResumen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
					this.gridBagConstraintsConsolidadosResumen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsolidadosResumen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsolidadosResumen.gridx = 0;
					
				
					this.jContentPaneDetalleConsolidadosResumen.add(jPanelCamposOcultosConsolidadosResumen, gridBagConstraintsConsolidadosResumen);
				
					this.jPanelCamposOcultosConsolidadosResumen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	        this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsolidadosResumen.add(this.jPanelAccionesFormularioConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);							
			
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
	        this.gridBagConstraintsConsolidadosResumen.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConsolidadosResumen.gridx = 0;
	        
			
			this.jContentPaneDetalleConsolidadosResumen.add(this.jPanelAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsolidadosResumen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsolidadosResumen=   new JScrollPane(this.jPanelCamposConsolidadosResumen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsolidadosResumen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosResumen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosResumen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;
			this.gridBagConstraintsConsolidadosResumen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsolidadosResumen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsolidadosResumen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);			
			
			this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosResumen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsolidadosResumen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
			
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		
			
		this.gridBagConstraintsConsolidadosResumen = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosResumen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosResumen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsolidadosResumen, this.gridBagConstraintsConsolidadosResumen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsolidadosResumen;//jContentPane;
		
		return jScrollPanelDatosEdicionConsolidadosResumen;
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
