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
import com.bydan.erp.activosfijos.util.report.ConsolidadosDetalleConstantesFunciones;

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
public class ConsolidadosDetalleDetalleFormJInternalFrame extends ConsolidadosDetalleBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsolidadosDetalle;
	
	protected JMenuBar jmenuBarDetalleConsolidadosDetalle;
	
	protected JMenu jmenuDetalleConsolidadosDetalle;
	protected JMenu jmenuDetalleArchivoConsolidadosDetalle;
	protected JMenu jmenuDetalleAccionesConsolidadosDetalle;
	protected JMenu jmenuDetalleDatosConsolidadosDetalle;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsolidadosDetalle;	
	protected GridBagConstraints gridBagConstraintsConsolidadosDetalle;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsolidadosDetalleBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsolidadosDetalle;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ConsolidadosDetalleSessionBean consolidadosdetalleSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ConsolidadosDetalleLogic consolidadosdetalleLogic;
	
	public JScrollPane jScrollPanelDatosConsolidadosDetalle;
	public JScrollPane jScrollPanelDatosEdicionConsolidadosDetalle;
	public JScrollPane jScrollPanelDatosGeneralConsolidadosDetalle;
	
	protected JPanel jPanelCamposConsolidadosDetalle;    
	protected JPanel jPanelCamposOcultosConsolidadosDetalle;    	
	protected JPanel jPanelAccionesConsolidadosDetalle;
	protected JPanel jPanelAccionesFormularioConsolidadosDetalle;
    
	
	
	protected Integer iXPanelCamposConsolidadosDetalle=0;
	protected Integer iYPanelCamposConsolidadosDetalle=0;
	
	protected Integer iXPanelCamposOcultosConsolidadosDetalle=0;
	protected Integer iYPanelCamposOcultosConsolidadosDetalle=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsolidadosDetalle;
	public JButton jButtonModificarConsolidadosDetalle;
	public JButton jButtonActualizarConsolidadosDetalle;
    public JButton jButtonEliminarConsolidadosDetalle;
	public JButton jButtonCancelarConsolidadosDetalle;
    public JButton jButtonGuardarCambiosConsolidadosDetalle;
	public JButton jButtonGuardarCambiosTablaConsolidadosDetalle;
	protected JButton jButtonCerrarConsolidadosDetalle;
	
	
	protected JButton jButtonProcesarInformacionConsolidadosDetalle;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsolidadosDetalle;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsolidadosDetalle;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsolidadosDetalle;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsolidadosDetalle;
	protected JButton jButtonModificarToolBarConsolidadosDetalle;
	protected JButton jButtonActualizarToolBarConsolidadosDetalle;
    protected JButton jButtonEliminarToolBarConsolidadosDetalle;
	protected JButton jButtonCancelarToolBarConsolidadosDetalle;
    protected JButton jButtonGuardarCambiosToolBarConsolidadosDetalle;
	protected JButton jButtonGuardarCambiosTablaToolBarConsolidadosDetalle;
	protected JButton jButtonMostrarOcultarTablaToolBarConsolidadosDetalle;
	protected JButton jButtonCerrarToolBarConsolidadosDetalle;
	
	protected JButton jButtonProcesarInformacionToolBarConsolidadosDetalle;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsolidadosDetalle;
	protected JMenuItem jMenuItemModificarConsolidadosDetalle;
	protected JMenuItem jMenuItemActualizarConsolidadosDetalle;
    protected JMenuItem jMenuItemEliminarConsolidadosDetalle;
	protected JMenuItem jMenuItemCancelarConsolidadosDetalle;
    protected JMenuItem jMenuItemGuardarCambiosConsolidadosDetalle;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsolidadosDetalle;
	protected JMenuItem jMenuItemCerrarConsolidadosDetalle;
	protected JMenuItem jMenuItemDetalleCerrarConsolidadosDetalle;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsolidadosDetalle;
	
	protected JMenuItem jMenuItemProcesarInformacionConsolidadosDetalle;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsolidadosDetalle;
	protected JMenuItem jMenuItemMostrarOcultarConsolidadosDetalle;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsolidadosDetalle;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsolidadosDetalle;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsolidadosDetalle;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsolidadosDetalle;
	public JLabel jLabelIdConsolidadosDetalle;
	public JLabel jLabelidConsolidadosDetalle;
	public JButton jButtonidConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empresaConsolidadosDetalle;
	public JLabel jLabelnombre_empresaConsolidadosDetalle;
	public JTextArea jTextAreanombre_empresaConsolidadosDetalle;
	public JScrollPane jscrollPanenombre_empresaConsolidadosDetalle;
	public JButton jButtonnombre_empresaConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sucursalConsolidadosDetalle;
	public JLabel jLabelnombre_sucursalConsolidadosDetalle;
	public JTextArea jTextAreanombre_sucursalConsolidadosDetalle;
	public JScrollPane jscrollPanenombre_sucursalConsolidadosDetalle;
	public JButton jButtonnombre_sucursalConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoConsolidadosDetalle;
	public JLabel jLabelcodigo_sub_grupoConsolidadosDetalle;
	public JTextField jTextFieldcodigo_sub_grupoConsolidadosDetalle;
	public JButton jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoConsolidadosDetalle;
	public JLabel jLabelnombre_sub_grupoConsolidadosDetalle;
	public JTextArea jTextAreanombre_sub_grupoConsolidadosDetalle;
	public JScrollPane jscrollPanenombre_sub_grupoConsolidadosDetalle;
	public JButton jButtonnombre_sub_grupoConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoConsolidadosDetalle;
	public JLabel jLabelcodigo_detalle_grupoConsolidadosDetalle;
	public JTextField jTextFieldcodigo_detalle_grupoConsolidadosDetalle;
	public JButton jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoConsolidadosDetalle;
	public JLabel jLabelnombre_detalle_grupoConsolidadosDetalle;
	public JTextArea jTextAreanombre_detalle_grupoConsolidadosDetalle;
	public JScrollPane jscrollPanenombre_detalle_grupoConsolidadosDetalle;
	public JButton jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelclaveConsolidadosDetalle;
	public JLabel jLabelclaveConsolidadosDetalle;
	public JTextField jTextFieldclaveConsolidadosDetalle;
	public JButton jButtonclaveConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelnombreConsolidadosDetalle;
	public JLabel jLabelnombreConsolidadosDetalle;
	public JTextArea jTextAreanombreConsolidadosDetalle;
	public JScrollPane jscrollPanenombreConsolidadosDetalle;
	public JButton jButtonnombreConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraConsolidadosDetalle;
	public JLabel jLabelfecha_compraConsolidadosDetalle;
	//public JFormattedTextField jDateChooserfecha_compraConsolidadosDetalle;

	public JDateChooser jDateChooserfecha_compraConsolidadosDetalle;
	public JButton jButtonfecha_compraConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilConsolidadosDetalle;
	public JLabel jLabelvida_utilConsolidadosDetalle;
	public JTextField jTextFieldvida_utilConsolidadosDetalle;
	public JButton jButtonvida_utilConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraConsolidadosDetalle;
	public JLabel jLabelcosto_de_compraConsolidadosDetalle;
	public JTextField jTextFieldcosto_de_compraConsolidadosDetalle;
	public JButton jButtoncosto_de_compraConsolidadosDetalleBusqueda= new JButtonMe();

	public JPanel jPanelcantidadConsolidadosDetalle;
	public JLabel jLabelcantidadConsolidadosDetalle;
	public JTextField jTextFieldcantidadConsolidadosDetalle;
	public JButton jButtoncantidadConsolidadosDetalleBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsolidadosDetalle;
	public JLabel jLabelid_empresaConsolidadosDetalle;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsolidadosDetalle;
	public JButton jButtonid_empresaConsolidadosDetalle= new JButtonMe();
	public JButton jButtonid_empresaConsolidadosDetalleUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsolidadosDetalleBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsolidadosDetalle;
	
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
	
	public ConsolidadosDetalleDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsolidadosDetalle=new JPanel();
				this.jPanelAccionesFormularioConsolidadosDetalle=new JPanel();
				this.jmenuBarDetalleConsolidadosDetalle=new JMenuBar();
				this.jTtoolBarDetalleConsolidadosDetalle=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsolidadosDetalleDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsolidadosDetalleDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConsolidadosDetalle No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConsolidadosDetalle() {
		return this.jButtonActualizarToolBarConsolidadosDetalle;
	}
	
	public JButton getjButtonEliminarToolBarConsolidadosDetalle() {
		return this.jButtonEliminarToolBarConsolidadosDetalle;
	}
	
	public JButton getjButtonCancelarToolBarConsolidadosDetalle() {
		return this.jButtonCancelarToolBarConsolidadosDetalle;
	}		
	
	public JButton getjButtonProcesarInformacionConsolidadosDetalle() {
		return this.jButtonProcesarInformacionConsolidadosDetalle;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsolidadosDetalle)	{
		this.jButtonProcesarInformacionConsolidadosDetalle = jButtonProcesarInformacionConsolidadosDetalle;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsolidadosDetalle() {
		return this.jComboBoxTiposAccionesConsolidadosDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsolidadosDetalle(
			JComboBox jComboBoxTiposRelacionesConsolidadosDetalle) {
		this.jComboBoxTiposRelacionesConsolidadosDetalle = jComboBoxTiposRelacionesConsolidadosDetalle;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsolidadosDetalle(
			JComboBox jComboBoxTiposAccionesConsolidadosDetalle) {
		this.jComboBoxTiposAccionesConsolidadosDetalle = jComboBoxTiposAccionesConsolidadosDetalle;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsolidadosDetalle() {
		return this.jComboBoxTiposAccionesFormularioConsolidadosDetalle;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsolidadosDetalle(
			JComboBox jComboBoxTiposAccionesFormularioConsolidadosDetalle) {
		this.jComboBoxTiposAccionesFormularioConsolidadosDetalle = jComboBoxTiposAccionesFormularioConsolidadosDetalle;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consolidadosdetalleSessionBean=new ConsolidadosDetalleSessionBean();
		
		this.consolidadosdetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consolidadosdetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consolidadosdetalleSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsolidadosDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsolidadosDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsolidadosDetalleJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consolidados Detalle MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsolidadosDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsolidadosDetalle= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsolidadosDetalle=new JButtonMe();
				this.jButtonModificarToolBarConsolidadosDetalle=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsolidadosDetalle,this.jTtoolBarDetalleConsolidadosDetalle,
							"actualizar","actualizar","Actualizar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsolidadosDetalle,this.jTtoolBarDetalleConsolidadosDetalle,
							"eliminar","eliminar","Eliminar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsolidadosDetalle,this.jTtoolBarDetalleConsolidadosDetalle,
							"cancelar","cancelar","Cancelar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsolidadosDetalle=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsolidadosDetalle,this.jTtoolBarDetalleConsolidadosDetalle,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsolidadosDetalle=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsolidadosDetalle=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsolidadosDetalle=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsolidadosDetalle=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsolidadosDetalle=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsolidadosDetalle= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsolidadosDetalle.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsolidadosDetalle,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsolidadosDetalle= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsolidadosDetalle.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsolidadosDetalle,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsolidadosDetalle= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsolidadosDetalle.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsolidadosDetalle,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsolidadosDetalle= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsolidadosDetalle.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsolidadosDetalle,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsolidadosDetalle= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsolidadosDetalle.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsolidadosDetalle,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsolidadosDetalle= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsolidadosDetalle.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsolidadosDetalle,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsolidadosDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsolidadosDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsolidadosDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsolidadosDetalle= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsolidadosDetalle.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsolidadosDetalle,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsolidadosDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsolidadosDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsolidadosDetalle,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsolidadosDetalle= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsolidadosDetalle.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsolidadosDetalle,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsolidadosDetalle.add(this.jMenuItemDetalleCerrarConsolidadosDetalle);
		
		this.jmenuDetalleAccionesConsolidadosDetalle.add(this.jMenuItemActualizarConsolidadosDetalle);
		this.jmenuDetalleAccionesConsolidadosDetalle.add(this.jMenuItemEliminarConsolidadosDetalle);
		this.jmenuDetalleAccionesConsolidadosDetalle.add(this.jMenuItemCancelarConsolidadosDetalle);		
		
		//this.jmenuDetalleDatosConsolidadosDetalle.add(this.jMenuItemDetalleAbrirOrderByConsolidadosDetalle);				
		this.jmenuDetalleDatosConsolidadosDetalle.add(this.jMenuItemDetalleMostarOcultarConsolidadosDetalle);				
				
		//this.jmenuDetalleAccionesConsolidadosDetalle.add(this.jMenuItemGuardarCambiosConsolidadosDetalle);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsolidadosDetalle.add(this.jmenuDetalleArchivoConsolidadosDetalle);		
		this.jmenuBarDetalleConsolidadosDetalle.add(this.jmenuDetalleAccionesConsolidadosDetalle);		
		this.jmenuBarDetalleConsolidadosDetalle.add(this.jmenuDetalleDatosConsolidadosDetalle);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsolidadosDetalle);				
	}
	
	
	public void inicializarElementosCamposConsolidadosDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsolidadosDetalle = new JLabelMe();
		jLabelIdConsolidadosDetalle.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsolidadosDetalle = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsolidadosDetalle= new GridBagLayout();

		this.jPanelidConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);

		jLabelidConsolidadosDetalle = new JLabel();
		jLabelidConsolidadosDetalle.setText("Id");

		jLabelidConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_empresaConsolidadosDetalle = new JLabelMe();
		this.jLabelnombre_empresaConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombre_empresaConsolidadosDetalle.setToolTipText("Nombre Empresa");
		this.jLabelnombre_empresaConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empresaConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empresaConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empresaConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelnombre_empresaConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextAreanombre_empresaConsolidadosDetalle= new JTextAreaMe();
		jTextAreanombre_empresaConsolidadosDetalle.setEnabled(false);
		jTextAreanombre_empresaConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaConsolidadosDetalle.setLineWrap(true);
		jTextAreanombre_empresaConsolidadosDetalle.setWrapStyleWord(true);
		jTextAreanombre_empresaConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empresaConsolidadosDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empresaConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empresaConsolidadosDetalle = new JScrollPane(jTextAreanombre_empresaConsolidadosDetalle);
		jscrollPanenombre_empresaConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_empresaConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setText("U");
		this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empresaConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empresaConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empresaConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empresaConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empresaConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sucursalConsolidadosDetalle = new JLabelMe();
		this.jLabelnombre_sucursalConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL+" : *");
		this.jLabelnombre_sucursalConsolidadosDetalle.setToolTipText("Nombre Sucursal");
		this.jLabelnombre_sucursalConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sucursalConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sucursalConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sucursalConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sucursalConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUCURSAL);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelnombre_sucursalConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextAreanombre_sucursalConsolidadosDetalle= new JTextAreaMe();
		jTextAreanombre_sucursalConsolidadosDetalle.setEnabled(false);
		jTextAreanombre_sucursalConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sucursalConsolidadosDetalle.setLineWrap(true);
		jTextAreanombre_sucursalConsolidadosDetalle.setWrapStyleWord(true);
		jTextAreanombre_sucursalConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sucursalConsolidadosDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sucursalConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sucursalConsolidadosDetalle = new JScrollPane(jTextAreanombre_sucursalConsolidadosDetalle);
		jscrollPanenombre_sucursalConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sucursalConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setText("U");
		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sucursalConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sucursalConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sucursalConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sucursalConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sucursalConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_sub_grupoConsolidadosDetalle = new JLabelMe();
		this.jLabelcodigo_sub_grupoConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoConsolidadosDetalle.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelcodigo_sub_grupoConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextFieldcodigo_sub_grupoConsolidadosDetalle= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoConsolidadosDetalle.setEnabled(false);
		jTextFieldcodigo_sub_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoConsolidadosDetalle = new JLabelMe();
		this.jLabelnombre_sub_grupoConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoConsolidadosDetalle.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelnombre_sub_grupoConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextAreanombre_sub_grupoConsolidadosDetalle= new JTextAreaMe();
		jTextAreanombre_sub_grupoConsolidadosDetalle.setEnabled(false);
		jTextAreanombre_sub_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoConsolidadosDetalle.setLineWrap(true);
		jTextAreanombre_sub_grupoConsolidadosDetalle.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoConsolidadosDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoConsolidadosDetalle = new JScrollPane(jTextAreanombre_sub_grupoConsolidadosDetalle);
		jscrollPanenombre_sub_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setText("U");
		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoConsolidadosDetalle = new JLabelMe();
		this.jLabelcodigo_detalle_grupoConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoConsolidadosDetalle.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextFieldcodigo_detalle_grupoConsolidadosDetalle= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setEnabled(false);
		jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoConsolidadosDetalle = new JLabelMe();
		this.jLabelnombre_detalle_grupoConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoConsolidadosDetalle.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelnombre_detalle_grupoConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextAreanombre_detalle_grupoConsolidadosDetalle= new JTextAreaMe();
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setEnabled(false);
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setLineWrap(true);
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoConsolidadosDetalle.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoConsolidadosDetalle = new JScrollPane(jTextAreanombre_detalle_grupoConsolidadosDetalle);
		jscrollPanenombre_detalle_grupoConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelclaveConsolidadosDetalle = new JLabelMe();
		this.jLabelclaveConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveConsolidadosDetalle.setToolTipText("Clave");
		this.jLabelclaveConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelclaveConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextFieldclaveConsolidadosDetalle= new JTextFieldMe();

		jTextFieldclaveConsolidadosDetalle.setEnabled(false);
		jTextFieldclaveConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonclaveConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveConsolidadosDetalleBusqueda.setText("U");
		this.jButtonclaveConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelnombreConsolidadosDetalle = new JLabelMe();
		this.jLabelnombreConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConsolidadosDetalle.setToolTipText("Nombre");
		this.jLabelnombreConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelnombreConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextAreanombreConsolidadosDetalle= new JTextAreaMe();
		jTextAreanombreConsolidadosDetalle.setEnabled(false);
		jTextAreanombreConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsolidadosDetalle.setLineWrap(true);
		jTextAreanombreConsolidadosDetalle.setWrapStyleWord(true);
		jTextAreanombreConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConsolidadosDetalle.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConsolidadosDetalle = new JScrollPane(jTextAreanombreConsolidadosDetalle);
		jscrollPanenombreConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonnombreConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConsolidadosDetalleBusqueda.setText("U");
		this.jButtonnombreConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraConsolidadosDetalle = new JLabelMe();
		this.jLabelfecha_compraConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraConsolidadosDetalle.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelfecha_compraConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		//jFormattedTextFieldfecha_compraConsolidadosDetalle= new JFormattedTextFieldMe();

		jDateChooserfecha_compraConsolidadosDetalle= new JDateChooser();
		jDateChooserfecha_compraConsolidadosDetalle.setEnabled(false);
		jDateChooserfecha_compraConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraConsolidadosDetalle.setDate(new Date());
		jDateChooserfecha_compraConsolidadosDetalle.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraConsolidadosDetalle.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonfecha_compraConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraConsolidadosDetalleBusqueda.setText("U");
		this.jButtonfecha_compraConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilConsolidadosDetalle = new JLabelMe();
		this.jLabelvida_utilConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilConsolidadosDetalle.setToolTipText("Va Util");
		this.jLabelvida_utilConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelvida_utilConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextFieldvida_utilConsolidadosDetalle= new JTextFieldMe();
		jTextFieldvida_utilConsolidadosDetalle.setEnabled(false);
		jTextFieldvida_utilConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilConsolidadosDetalle.setText("0.0");

		this.jButtonvida_utilConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonvida_utilConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilConsolidadosDetalleBusqueda.setText("U");
		this.jButtonvida_utilConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraConsolidadosDetalle = new JLabelMe();
		this.jLabelcosto_de_compraConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraConsolidadosDetalle.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelcosto_de_compraConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextFieldcosto_de_compraConsolidadosDetalle= new JTextFieldMe();
		jTextFieldcosto_de_compraConsolidadosDetalle.setEnabled(false);
		jTextFieldcosto_de_compraConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraConsolidadosDetalle.setText("0.0");

		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setText("U");
		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraConsolidadosDetalleBusqueda.setVisible(false);		}


					
		this.jLabelcantidadConsolidadosDetalle = new JLabelMe();
		this.jLabelcantidadConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadConsolidadosDetalle.setToolTipText("Cantad");
		this.jLabelcantidadConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelcantidadConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jTextFieldcantidadConsolidadosDetalle= new JTextFieldMe();
		jTextFieldcantidadConsolidadosDetalle.setEnabled(false);
		jTextFieldcantidadConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadConsolidadosDetalle.setText("0");

		this.jButtoncantidadConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtoncantidadConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadConsolidadosDetalleBusqueda.setText("U");
		this.jButtoncantidadConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadConsolidadosDetalleBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsolidadosDetalle() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsolidadosDetalle = new JLabelMe();
		this.jLabelid_empresaConsolidadosDetalle.setText(""+ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsolidadosDetalle.setToolTipText("Empresa");
		this.jLabelid_empresaConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsolidadosDetalle=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsolidadosDetalle.setToolTipText(ConsolidadosDetalleConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		this.jPanelid_empresaConsolidadosDetalle.setLayout(this.gridaBagLayoutConsolidadosDetalle);


		jComboBoxid_empresaConsolidadosDetalle= new JComboBoxMe();
		jComboBoxid_empresaConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsolidadosDetalle.setEnabled(false);

		this.jButtonid_empresaConsolidadosDetalle= new JButtonMe();
		this.jButtonid_empresaConsolidadosDetalle.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsolidadosDetalle.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsolidadosDetalle.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsolidadosDetalle.setText("Buscar");
		this.jButtonid_empresaConsolidadosDetalle.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsolidadosDetalle.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsolidadosDetalle,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsolidadosDetalle"));

		this.jButtonid_empresaConsolidadosDetalleBusqueda= new JButtonMe();
		this.jButtonid_empresaConsolidadosDetalleBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosDetalleBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosDetalleBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsolidadosDetalleBusqueda.setText("U");
		this.jButtonid_empresaConsolidadosDetalleBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsolidadosDetalleBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsolidadosDetalleBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsolidadosDetalleBusqueda"));

		if(this.consolidadosdetalleSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsolidadosDetalleBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsolidadosDetalleUpdate= new JButtonMe();
		this.jButtonid_empresaConsolidadosDetalleUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosDetalleUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsolidadosDetalleUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsolidadosDetalleUpdate.setText("U");
		this.jButtonid_empresaConsolidadosDetalleUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsolidadosDetalleUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsolidadosDetalleUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsolidadosDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsolidadosDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsolidadosDetalleUpdate"));



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
		//this.jInternalFrameDetalleConsolidadosDetalle = new ConsolidadosDetalleBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consolidados Detalle DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsolidadosDetalle= new GridBagLayout();
		

		
		String sToolTipConsolidadosDetalle="";
		sToolTipConsolidadosDetalle=ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsolidadosDetalle+="(ActivosFijos.ConsolidadosDetalle)";
		}
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsolidadosDetalle+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsolidadosDetalle = new JButtonMe();
		this.jButtonModificarConsolidadosDetalle = new JButtonMe();
        this.jButtonActualizarConsolidadosDetalle = new JButtonMe();
        this.jButtonEliminarConsolidadosDetalle = new JButtonMe();
        this.jButtonCancelarConsolidadosDetalle = new JButtonMe();
        this.jButtonGuardarCambiosConsolidadosDetalle = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsolidadosDetalle = new JButtonMe();
		this.jButtonCerrarConsolidadosDetalle = new JButtonMe();
		
		this.jScrollPanelDatosConsolidadosDetalle = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsolidadosDetalle = new JScrollPane();
		this.jScrollPanelDatosGeneralConsolidadosDetalle = new JScrollPane();
				
		
		
		this.jPanelCamposConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Consolidados Detalle";
		
		if(!this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consolidados Detalles" + this.sPath));
		} else {
			this.jScrollPanelDatosConsolidadosDetalle.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConsolidadosDetalle.setName("jPanelCamposConsolidadosDetalle"); 

		this.jPanelCamposOcultosConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsolidadosDetalle.setName("jPanelCamposOcultosConsolidadosDetalle"); 

        this.jPanelAccionesConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsolidadosDetalle.setToolTipText("Acciones");
        this.jPanelAccionesConsolidadosDetalle.setName("Acciones"); 

		this.jPanelAccionesFormularioConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsolidadosDetalle.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsolidadosDetalle.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsolidadosDetalle.setText("Nuevo");
		this.jButtonModificarConsolidadosDetalle.setText("Editar");
        this.jButtonActualizarConsolidadosDetalle.setText("Actualizar");
        this.jButtonEliminarConsolidadosDetalle.setText("Eliminar");
        this.jButtonCancelarConsolidadosDetalle.setText("Cancelar");
        this.jButtonGuardarCambiosConsolidadosDetalle.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.setText("Guardar");
		this.jButtonCerrarConsolidadosDetalle.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsolidadosDetalle,"nuevo_button","Nuevo",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsolidadosDetalle,"modificar_button","Editar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsolidadosDetalle,"actualizar_button","Actualizar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsolidadosDetalle,"eliminar_button","Eliminar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsolidadosDetalle,"cancelar_button","Cancelar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsolidadosDetalle,"guardarcambios_button","Guardar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsolidadosDetalle,"guardarcambiostabla_button","Guardar",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsolidadosDetalle,"cerrar_button","Salir",this.consolidadosdetalleSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsolidadosDetalle.setToolTipText("Nuevo"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsolidadosDetalle.setToolTipText("Editar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsolidadosDetalle.setToolTipText("Actualizar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsolidadosDetalle.setToolTipText("Eliminar)"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsolidadosDetalle.setToolTipText("Cancelar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsolidadosDetalle.setToolTipText("Guardar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.setToolTipText("Guardar"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsolidadosDetalle.setToolTipText("Salir"+" "+ConsolidadosDetalleConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsolidadosDetalle";
		inputMap = this.jButtonNuevoConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsolidadosDetalle.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsolidadosDetalle"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsolidadosDetalle";
		inputMap = this.jButtonActualizarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsolidadosDetalle"));
		
		//ELIMINAR
		sMapKey = "EliminarConsolidadosDetalle";
		inputMap = this.jButtonEliminarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsolidadosDetalle"));
		
		//CANCELAR	
		sMapKey = "CancelarConsolidadosDetalle";
		inputMap = this.jButtonCancelarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsolidadosDetalle"));
		
		//CERRAR		
		sMapKey = "CerrarConsolidadosDetalle";
		inputMap = this.jButtonCerrarConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsolidadosDetalle"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsolidadosDetalle";
		inputMap = this.jButtonGuardarCambiosTablaConsolidadosDetalle.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsolidadosDetalle.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsolidadosDetalle"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsolidadosDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsolidadosDetalle.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsolidadosDetalle.setToolTipText("Nuevo ConsolidadosDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsolidadosDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsolidadosDetalle.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsolidadosDetalle.setToolTipText("Sin Cerrar Ventana ConsolidadosDetalle");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsolidadosDetalle = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsolidadosDetalle.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsolidadosDetalle.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsolidadosDetalle.setText("Accion");
		this.jComboBoxTiposAccionesConsolidadosDetalle.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsolidadosDetalle = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsolidadosDetalle = new JLabelMe();
		
		this.jLabelAccionesConsolidadosDetalle.setText("Acciones");		
		this.jLabelAccionesConsolidadosDetalle.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosDetalle.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsolidadosDetalle.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsolidadosDetalle();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsolidadosDetalle();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsolidadosDetalle=new JTabbedPane();
		this.jTabbedPaneRelacionesConsolidadosDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsolidadosDetalle,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsolidadosDetalle.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsolidadosDetalle.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsolidadosDetalle, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsolidadosDetalle = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsolidadosDetalle = new GridBagLayout();
		
		this.jPanelCamposConsolidadosDetalle.setLayout(gridaBagLayoutCamposConsolidadosDetalle);
		this.jPanelCamposOcultosConsolidadosDetalle.setLayout(gridaBagLayoutCamposOcultosConsolidadosDetalle);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsolidadosDetalle.add(jLabelIdConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsolidadosDetalle.add(jLabelidConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsolidadosDetalle.add(jLabelid_empresaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsolidadosDetalle.add(jButtonid_empresaConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 3;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsolidadosDetalle.add(jButtonid_empresaConsolidadosDetalleUpdate, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsolidadosDetalle.add(jComboBoxid_empresaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empresaConsolidadosDetalle.add(jLabelnombre_empresaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empresaConsolidadosDetalle.add(jButtonnombre_empresaConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empresaConsolidadosDetalle.add(jscrollPanenombre_empresaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sucursalConsolidadosDetalle.add(jLabelnombre_sucursalConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sucursalConsolidadosDetalle.add(jButtonnombre_sucursalConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sucursalConsolidadosDetalle.add(jscrollPanenombre_sucursalConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoConsolidadosDetalle.add(jLabelcodigo_sub_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoConsolidadosDetalle.add(jButtoncodigo_sub_grupoConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoConsolidadosDetalle.add(jTextFieldcodigo_sub_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoConsolidadosDetalle.add(jLabelnombre_sub_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoConsolidadosDetalle.add(jButtonnombre_sub_grupoConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoConsolidadosDetalle.add(jscrollPanenombre_sub_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoConsolidadosDetalle.add(jLabelcodigo_detalle_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoConsolidadosDetalle.add(jButtoncodigo_detalle_grupoConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoConsolidadosDetalle.add(jTextFieldcodigo_detalle_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoConsolidadosDetalle.add(jLabelnombre_detalle_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoConsolidadosDetalle.add(jButtonnombre_detalle_grupoConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoConsolidadosDetalle.add(jscrollPanenombre_detalle_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveConsolidadosDetalle.add(jLabelclaveConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveConsolidadosDetalle.add(jButtonclaveConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveConsolidadosDetalle.add(jTextFieldclaveConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConsolidadosDetalle.add(jLabelnombreConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConsolidadosDetalle.add(jButtonnombreConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConsolidadosDetalle.add(jscrollPanenombreConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraConsolidadosDetalle.add(jLabelfecha_compraConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraConsolidadosDetalle.add(jButtonfecha_compraConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraConsolidadosDetalle.add(jDateChooserfecha_compraConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilConsolidadosDetalle.add(jLabelvida_utilConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilConsolidadosDetalle.add(jButtonvida_utilConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilConsolidadosDetalle.add(jTextFieldvida_utilConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraConsolidadosDetalle.add(jLabelcosto_de_compraConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraConsolidadosDetalle.add(jButtoncosto_de_compraConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraConsolidadosDetalle.add(jTextFieldcosto_de_compraConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadConsolidadosDetalle.add(jLabelcantidadConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		//this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = 2;
		this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
		this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadConsolidadosDetalle.add(jButtoncantidadConsolidadosDetalleBusqueda, this.gridBagConstraintsConsolidadosDetalle);
	}

	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
	this.gridBagConstraintsConsolidadosDetalle.gridx = 1;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadConsolidadosDetalle.add(jTextFieldcantidadConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelidConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelnombre_empresaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelnombre_sucursalConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelcodigo_sub_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelnombre_sub_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelcodigo_detalle_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelnombre_detalle_grupoConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelclaveConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelnombreConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelfecha_compraConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelvida_utilConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelcosto_de_compraConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsolidadosDetalle.add(this.jPanelcantidadConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposConsolidadosDetalle % 2==0) {
		iXPanelCamposConsolidadosDetalle=0;
		iYPanelCamposConsolidadosDetalle++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsolidadosDetalle.gridy = iYPanelCamposOcultosConsolidadosDetalle;
	this.gridBagConstraintsConsolidadosDetalle.gridx = iXPanelCamposOcultosConsolidadosDetalle++;
	this.gridBagConstraintsConsolidadosDetalle.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsolidadosDetalle.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsolidadosDetalle.add(this.jPanelid_empresaConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);



	if(iXPanelCamposOcultosConsolidadosDetalle % 2==0) {
		iXPanelCamposOcultosConsolidadosDetalle=0;
		iYPanelCamposOcultosConsolidadosDetalle++;
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
			
		GridBagLayout gridaBagLayoutAccionesConsolidadosDetalle= new GridBagLayout();
		this.jPanelAccionesConsolidadosDetalle.setLayout(gridaBagLayoutAccionesConsolidadosDetalle);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsolidadosDetalle= new GridBagLayout();
		this.jPanelAccionesFormularioConsolidadosDetalle.setLayout(gridaBagLayoutAccionesFormularioConsolidadosDetalle);
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsolidadosDetalle.add(this.jComboBoxTiposAccionesFormularioConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsolidadosDetalle.add(this.jButtonModificarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);							

		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;
		this.gridBagConstraintsConsolidadosDetalle.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsolidadosDetalle.add(this.jButtonEliminarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsolidadosDetalle.add(this.jButtonActualizarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);


		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsolidadosDetalle.add(this.jButtonGuardarCambiosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);	
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = 0;		
		this.gridBagConstraintsConsolidadosDetalle.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsolidadosDetalle.add(this.jButtonCancelarConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsolidadosDetalle = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsolidadosDetalle);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consolidadosdetalleSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();						
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;		
			//this.gridBagConstraintsConsolidadosDetalle.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsolidadosDetalle.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsolidadosDetalle.gridx =0;
		this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsolidadosDetalle.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsolidadosDetalleJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsolidadosDetalle = new ConsolidadosDetalleBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consolidados Detalle DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consolidados Detalle DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consolidados Detalle Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsolidadosDetalleModel consolidadosdetalleModel=new ConsolidadosDetalleModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsolidadosDetalleModel.ConsolidadosDetalleFocusTraversalPolicy consolidadosdetalleFocusTraversalPolicy = consolidadosdetalleModel.new ConsolidadosDetalleFocusTraversalPolicy(this);
			
			//consolidadosdetalleFocusTraversalPolicy.setconsolidadosdetalleJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consolidadosdetalleModel);
			
			
			this.jContentPaneDetalleConsolidadosDetalle = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsolidadosDetalle = new GridBagLayout();	
			this.jContentPaneDetalleConsolidadosDetalle.setLayout(gridaBagLayoutDetalleConsolidadosDetalle);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsolidadosDetalle = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
				this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
					
				
				this.jContentPaneDetalleConsolidadosDetalle.add(jTtoolBarDetalleConsolidadosDetalle, gridBagConstraintsConsolidadosDetalle);								
				
}
			
			this.jScrollPanelDatosEdicionConsolidadosDetalle=   new JScrollPane(jContentPaneDetalleConsolidadosDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsolidadosDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsolidadosDetalle=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsolidadosDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsolidadosDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	        
			this.jContentPaneDetalleConsolidadosDetalle.add(jPanelCamposConsolidadosDetalle, gridBagConstraintsConsolidadosDetalle);
			
			
			
			
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
						//&& consolidadosdetalleSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.consolidadosdetalleSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsolidadosDetalle= new GridBagConstraints();
						this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
						this.jContentPaneDetalleConsolidadosDetalle.add(this.jTabbedPaneRelacionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsolidadosDetalle.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsolidadosDetalle.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
					this.gridBagConstraintsConsolidadosDetalle.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
					
				
					this.jContentPaneDetalleConsolidadosDetalle.add(jPanelCamposOcultosConsolidadosDetalle, gridBagConstraintsConsolidadosDetalle);
				
					this.jPanelCamposOcultosConsolidadosDetalle.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	        this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsolidadosDetalle.add(this.jPanelAccionesFormularioConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);							
			
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
	        this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
	        
			
			this.jContentPaneDetalleConsolidadosDetalle.add(this.jPanelAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsolidadosDetalle);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsolidadosDetalle=   new JScrollPane(this.jPanelCamposConsolidadosDetalle,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsolidadosDetalle.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosDetalle.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsolidadosDetalle.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
			this.gridBagConstraintsConsolidadosDetalle.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsolidadosDetalle.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsolidadosDetalle.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);			
			
			this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
			this.gridBagConstraintsConsolidadosDetalle.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
			
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		
			
		this.gridBagConstraintsConsolidadosDetalle = new GridBagConstraints();
		this.gridBagConstraintsConsolidadosDetalle.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsolidadosDetalle.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsolidadosDetalle, this.gridBagConstraintsConsolidadosDetalle);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsolidadosDetalle;//jContentPane;
		
		return jScrollPanelDatosEdicionConsolidadosDetalle;
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
