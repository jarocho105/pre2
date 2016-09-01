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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.GuiasRemisionesConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class GuiasRemisionesDetalleFormJInternalFrame extends GuiasRemisionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGuiasRemisiones;
	
	protected JMenuBar jmenuBarDetalleGuiasRemisiones;
	
	protected JMenu jmenuDetalleGuiasRemisiones;
	protected JMenu jmenuDetalleArchivoGuiasRemisiones;
	protected JMenu jmenuDetalleAccionesGuiasRemisiones;
	protected JMenu jmenuDetalleDatosGuiasRemisiones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGuiasRemisiones;	
	protected GridBagConstraints gridBagConstraintsGuiasRemisiones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GuiasRemisionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleGuiasRemisiones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public GuiasRemisionesSessionBean guiasremisionesSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public GuiasRemisionesLogic guiasremisionesLogic;
	
	public JScrollPane jScrollPanelDatosGuiasRemisiones;
	public JScrollPane jScrollPanelDatosEdicionGuiasRemisiones;
	public JScrollPane jScrollPanelDatosGeneralGuiasRemisiones;
	
	protected JPanel jPanelCamposGuiasRemisiones;    
	protected JPanel jPanelCamposOcultosGuiasRemisiones;    	
	protected JPanel jPanelAccionesGuiasRemisiones;
	protected JPanel jPanelAccionesFormularioGuiasRemisiones;
    
	
	
	protected Integer iXPanelCamposGuiasRemisiones=0;
	protected Integer iYPanelCamposGuiasRemisiones=0;
	
	protected Integer iXPanelCamposOcultosGuiasRemisiones=0;
	protected Integer iYPanelCamposOcultosGuiasRemisiones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGuiasRemisiones;
	public JButton jButtonModificarGuiasRemisiones;
	public JButton jButtonActualizarGuiasRemisiones;
    public JButton jButtonEliminarGuiasRemisiones;
	public JButton jButtonCancelarGuiasRemisiones;
    public JButton jButtonGuardarCambiosGuiasRemisiones;
	public JButton jButtonGuardarCambiosTablaGuiasRemisiones;
	protected JButton jButtonCerrarGuiasRemisiones;
	
	
	protected JButton jButtonProcesarInformacionGuiasRemisiones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGuiasRemisiones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGuiasRemisiones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGuiasRemisiones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGuiasRemisiones;
	protected JButton jButtonModificarToolBarGuiasRemisiones;
	protected JButton jButtonActualizarToolBarGuiasRemisiones;
    protected JButton jButtonEliminarToolBarGuiasRemisiones;
	protected JButton jButtonCancelarToolBarGuiasRemisiones;
    protected JButton jButtonGuardarCambiosToolBarGuiasRemisiones;
	protected JButton jButtonGuardarCambiosTablaToolBarGuiasRemisiones;
	protected JButton jButtonMostrarOcultarTablaToolBarGuiasRemisiones;
	protected JButton jButtonCerrarToolBarGuiasRemisiones;
	
	protected JButton jButtonProcesarInformacionToolBarGuiasRemisiones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGuiasRemisiones;
	protected JMenuItem jMenuItemModificarGuiasRemisiones;
	protected JMenuItem jMenuItemActualizarGuiasRemisiones;
    protected JMenuItem jMenuItemEliminarGuiasRemisiones;
	protected JMenuItem jMenuItemCancelarGuiasRemisiones;
    protected JMenuItem jMenuItemGuardarCambiosGuiasRemisiones;
	protected JMenuItem jMenuItemGuardarCambiosTablaGuiasRemisiones;
	protected JMenuItem jMenuItemCerrarGuiasRemisiones;
	protected JMenuItem jMenuItemDetalleCerrarGuiasRemisiones;
	protected JMenuItem jMenuItemDetalleMostarOcultarGuiasRemisiones;
	
	protected JMenuItem jMenuItemProcesarInformacionGuiasRemisiones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGuiasRemisiones;
	protected JMenuItem jMenuItemMostrarOcultarGuiasRemisiones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGuiasRemisiones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGuiasRemisiones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGuiasRemisiones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGuiasRemisiones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGuiasRemisiones;
	public JLabel jLabelIdGuiasRemisiones;
	public JLabel jLabelidGuiasRemisiones;
	public JButton jButtonidGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeGuiasRemisiones;
	public JLabel jLabelfecha_emision_desdeGuiasRemisiones;
	//public JFormattedTextField jDateChooserfecha_emision_desdeGuiasRemisiones;

	public JDateChooser jDateChooserfecha_emision_desdeGuiasRemisiones;
	public JButton jButtonfecha_emision_desdeGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaGuiasRemisiones;
	public JLabel jLabelfecha_emision_hastaGuiasRemisiones;
	//public JFormattedTextField jDateChooserfecha_emision_hastaGuiasRemisiones;

	public JDateChooser jDateChooserfecha_emision_hastaGuiasRemisiones;
	public JButton jButtonfecha_emision_hastaGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteGuiasRemisiones;
	public JLabel jLabelnombre_completo_clienteGuiasRemisiones;
	public JTextArea jTextAreanombre_completo_clienteGuiasRemisiones;
	public JScrollPane jscrollPanenombre_completo_clienteGuiasRemisiones;
	public JButton jButtonnombre_completo_clienteGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaGuiasRemisiones;
	public JLabel jLabelnumero_pre_impreso_facturaGuiasRemisiones;
	public JTextField jTextFieldnumero_pre_impreso_facturaGuiasRemisiones;
	public JButton jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialGuiasRemisiones;
	public JLabel jLabelsecuencialGuiasRemisiones;
	public JTextField jTextFieldsecuencialGuiasRemisiones;
	public JButton jButtonsecuencialGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionGuiasRemisiones;
	public JLabel jLabelfecha_emisionGuiasRemisiones;
	//public JFormattedTextField jDateChooserfecha_emisionGuiasRemisiones;

	public JDateChooser jDateChooserfecha_emisionGuiasRemisiones;
	public JButton jButtonfecha_emisionGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoGuiasRemisiones;
	public JLabel jLabelfecha_vencimientoGuiasRemisiones;
	//public JFormattedTextField jDateChooserfecha_vencimientoGuiasRemisiones;

	public JDateChooser jDateChooserfecha_vencimientoGuiasRemisiones;
	public JButton jButtonfecha_vencimientoGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_transporteGuiasRemisiones;
	public JLabel jLabelnombre_tipo_transporteGuiasRemisiones;
	public JTextArea jTextAreanombre_tipo_transporteGuiasRemisiones;
	public JScrollPane jscrollPanenombre_tipo_transporteGuiasRemisiones;
	public JButton jButtonnombre_tipo_transporteGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelivaGuiasRemisiones;
	public JLabel jLabelivaGuiasRemisiones;
	public JTextField jTextFieldivaGuiasRemisiones;
	public JButton jButtonivaGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoGuiasRemisiones;
	public JLabel jLabeldescuentoGuiasRemisiones;
	public JTextField jTextFielddescuentoGuiasRemisiones;
	public JButton jButtondescuentoGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPanelotroGuiasRemisiones;
	public JLabel jLabelotroGuiasRemisiones;
	public JTextField jTextFieldotroGuiasRemisiones;
	public JButton jButtonotroGuiasRemisionesBusqueda= new JButtonMe();

	public JPanel jPaneltotalGuiasRemisiones;
	public JLabel jLabeltotalGuiasRemisiones;
	public JTextField jTextFieldtotalGuiasRemisiones;
	public JButton jButtontotalGuiasRemisionesBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGuiasRemisiones;
	public JLabel jLabelid_empresaGuiasRemisiones;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGuiasRemisiones;
	public JButton jButtonid_empresaGuiasRemisiones= new JButtonMe();
	public JButton jButtonid_empresaGuiasRemisionesUpdate= new JButtonMe();
	public JButton jButtonid_empresaGuiasRemisionesBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGuiasRemisiones;
	
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
	public int iHeightFormulario=572;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GuiasRemisionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGuiasRemisiones=new JPanel();
				this.jPanelAccionesFormularioGuiasRemisiones=new JPanel();
				this.jmenuBarDetalleGuiasRemisiones=new JMenuBar();
				this.jTtoolBarDetalleGuiasRemisiones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GuiasRemisionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiasRemisionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GuiasRemisiones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGuiasRemisiones() {
		return this.jButtonActualizarToolBarGuiasRemisiones;
	}
	
	public JButton getjButtonEliminarToolBarGuiasRemisiones() {
		return this.jButtonEliminarToolBarGuiasRemisiones;
	}
	
	public JButton getjButtonCancelarToolBarGuiasRemisiones() {
		return this.jButtonCancelarToolBarGuiasRemisiones;
	}		
	
	public JButton getjButtonProcesarInformacionGuiasRemisiones() {
		return this.jButtonProcesarInformacionGuiasRemisiones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGuiasRemisiones)	{
		this.jButtonProcesarInformacionGuiasRemisiones = jButtonProcesarInformacionGuiasRemisiones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGuiasRemisiones() {
		return this.jComboBoxTiposAccionesGuiasRemisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGuiasRemisiones(
			JComboBox jComboBoxTiposRelacionesGuiasRemisiones) {
		this.jComboBoxTiposRelacionesGuiasRemisiones = jComboBoxTiposRelacionesGuiasRemisiones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGuiasRemisiones(
			JComboBox jComboBoxTiposAccionesGuiasRemisiones) {
		this.jComboBoxTiposAccionesGuiasRemisiones = jComboBoxTiposAccionesGuiasRemisiones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGuiasRemisiones() {
		return this.jComboBoxTiposAccionesFormularioGuiasRemisiones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGuiasRemisiones(
			JComboBox jComboBoxTiposAccionesFormularioGuiasRemisiones) {
		this.jComboBoxTiposAccionesFormularioGuiasRemisiones = jComboBoxTiposAccionesFormularioGuiasRemisiones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.guiasremisionesSessionBean=new GuiasRemisionesSessionBean();
		
		this.guiasremisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guiasremisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.guiasremisionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GuiasRemisionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GuiasRemisionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GuiasRemisionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Guias Remisiones MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
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
	
		GuiasRemisionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGuiasRemisiones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGuiasRemisiones=new JButtonMe();
				this.jButtonModificarToolBarGuiasRemisiones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGuiasRemisiones,this.jTtoolBarDetalleGuiasRemisiones,
							"actualizar","actualizar","Actualizar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGuiasRemisiones,this.jTtoolBarDetalleGuiasRemisiones,
							"eliminar","eliminar","Eliminar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGuiasRemisiones,this.jTtoolBarDetalleGuiasRemisiones,
							"cancelar","cancelar","Cancelar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGuiasRemisiones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGuiasRemisiones,this.jTtoolBarDetalleGuiasRemisiones,
							"guardarcambios","guardarcambios","Guardar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGuiasRemisiones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGuiasRemisiones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGuiasRemisiones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGuiasRemisiones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGuiasRemisiones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGuiasRemisiones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGuiasRemisiones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuiasRemisiones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGuiasRemisiones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGuiasRemisiones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGuiasRemisiones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGuiasRemisiones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGuiasRemisiones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGuiasRemisiones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGuiasRemisiones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGuiasRemisiones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGuiasRemisiones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGuiasRemisiones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGuiasRemisiones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGuiasRemisiones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGuiasRemisiones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGuiasRemisiones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGuiasRemisiones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGuiasRemisiones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGuiasRemisiones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGuiasRemisiones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGuiasRemisiones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGuiasRemisiones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGuiasRemisiones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGuiasRemisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGuiasRemisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGuiasRemisiones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGuiasRemisiones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGuiasRemisiones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGuiasRemisiones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGuiasRemisiones.add(this.jMenuItemDetalleCerrarGuiasRemisiones);
		
		this.jmenuDetalleAccionesGuiasRemisiones.add(this.jMenuItemActualizarGuiasRemisiones);
		this.jmenuDetalleAccionesGuiasRemisiones.add(this.jMenuItemEliminarGuiasRemisiones);
		this.jmenuDetalleAccionesGuiasRemisiones.add(this.jMenuItemCancelarGuiasRemisiones);		
		
		//this.jmenuDetalleDatosGuiasRemisiones.add(this.jMenuItemDetalleAbrirOrderByGuiasRemisiones);				
		this.jmenuDetalleDatosGuiasRemisiones.add(this.jMenuItemDetalleMostarOcultarGuiasRemisiones);				
				
		//this.jmenuDetalleAccionesGuiasRemisiones.add(this.jMenuItemGuardarCambiosGuiasRemisiones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGuiasRemisiones.add(this.jmenuDetalleArchivoGuiasRemisiones);		
		this.jmenuBarDetalleGuiasRemisiones.add(this.jmenuDetalleAccionesGuiasRemisiones);		
		this.jmenuBarDetalleGuiasRemisiones.add(this.jmenuDetalleDatosGuiasRemisiones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGuiasRemisiones);				
	}
	
	
	public void inicializarElementosCamposGuiasRemisiones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGuiasRemisiones = new JLabelMe();
		jLabelIdGuiasRemisiones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGuiasRemisiones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGuiasRemisiones= new GridBagLayout();

		this.jPanelidGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);

		jLabelidGuiasRemisiones = new JLabel();
		jLabelidGuiasRemisiones.setText("Id");

		jLabelidGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeGuiasRemisiones = new JLabelMe();
		this.jLabelfecha_emision_desdeGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeGuiasRemisiones.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelfecha_emision_desdeGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		//jFormattedTextFieldfecha_emision_desdeGuiasRemisiones= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeGuiasRemisiones= new JDateChooser();
		jDateChooserfecha_emision_desdeGuiasRemisiones.setEnabled(false);
		jDateChooserfecha_emision_desdeGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeGuiasRemisiones.setDate(new Date());
		jDateChooserfecha_emision_desdeGuiasRemisiones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeGuiasRemisiones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setText("U");
		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaGuiasRemisiones = new JLabelMe();
		this.jLabelfecha_emision_hastaGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaGuiasRemisiones.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelfecha_emision_hastaGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		//jFormattedTextFieldfecha_emision_hastaGuiasRemisiones= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaGuiasRemisiones= new JDateChooser();
		jDateChooserfecha_emision_hastaGuiasRemisiones.setEnabled(false);
		jDateChooserfecha_emision_hastaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaGuiasRemisiones.setDate(new Date());
		jDateChooserfecha_emision_hastaGuiasRemisiones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaGuiasRemisiones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setText("U");
		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteGuiasRemisiones = new JLabelMe();
		this.jLabelnombre_completo_clienteGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteGuiasRemisiones.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelnombre_completo_clienteGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextAreanombre_completo_clienteGuiasRemisiones= new JTextAreaMe();
		jTextAreanombre_completo_clienteGuiasRemisiones.setEnabled(false);
		jTextAreanombre_completo_clienteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteGuiasRemisiones.setLineWrap(true);
		jTextAreanombre_completo_clienteGuiasRemisiones.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteGuiasRemisiones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteGuiasRemisiones.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteGuiasRemisiones = new JScrollPane(jTextAreanombre_completo_clienteGuiasRemisiones);
		jscrollPanenombre_completo_clienteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setText("U");
		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaGuiasRemisiones = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaGuiasRemisiones.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialGuiasRemisiones = new JLabelMe();
		this.jLabelsecuencialGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialGuiasRemisiones.setToolTipText("Secuencial");
		this.jLabelsecuencialGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelsecuencialGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextFieldsecuencialGuiasRemisiones= new JTextFieldMe();

		jTextFieldsecuencialGuiasRemisiones.setEnabled(false);
		jTextFieldsecuencialGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonsecuencialGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialGuiasRemisionesBusqueda.setText("U");
		this.jButtonsecuencialGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionGuiasRemisiones = new JLabelMe();
		this.jLabelfecha_emisionGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionGuiasRemisiones.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelfecha_emisionGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		//jFormattedTextFieldfecha_emisionGuiasRemisiones= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionGuiasRemisiones= new JDateChooser();
		jDateChooserfecha_emisionGuiasRemisiones.setEnabled(false);
		jDateChooserfecha_emisionGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionGuiasRemisiones.setDate(new Date());
		jDateChooserfecha_emisionGuiasRemisiones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionGuiasRemisiones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonfecha_emisionGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionGuiasRemisionesBusqueda.setText("U");
		this.jButtonfecha_emisionGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoGuiasRemisiones = new JLabelMe();
		this.jLabelfecha_vencimientoGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoGuiasRemisiones.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelfecha_vencimientoGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		//jFormattedTextFieldfecha_vencimientoGuiasRemisiones= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoGuiasRemisiones= new JDateChooser();
		jDateChooserfecha_vencimientoGuiasRemisiones.setEnabled(false);
		jDateChooserfecha_vencimientoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoGuiasRemisiones.setDate(new Date());
		jDateChooserfecha_vencimientoGuiasRemisiones.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoGuiasRemisiones.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setText("U");
		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_transporteGuiasRemisiones = new JLabelMe();
		this.jLabelnombre_tipo_transporteGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE+" : *");
		this.jLabelnombre_tipo_transporteGuiasRemisiones.setToolTipText("Nombre Tipo Transporte");
		this.jLabelnombre_tipo_transporteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_transporteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_transporteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_transporteGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_transporteGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_transporteGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_NOMBRETIPOTRANSPORTE);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelnombre_tipo_transporteGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextAreanombre_tipo_transporteGuiasRemisiones= new JTextAreaMe();
		jTextAreanombre_tipo_transporteGuiasRemisiones.setEnabled(false);
		jTextAreanombre_tipo_transporteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_transporteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_transporteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_transporteGuiasRemisiones.setLineWrap(true);
		jTextAreanombre_tipo_transporteGuiasRemisiones.setWrapStyleWord(true);
		jTextAreanombre_tipo_transporteGuiasRemisiones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_transporteGuiasRemisiones.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_transporteGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_transporteGuiasRemisiones = new JScrollPane(jTextAreanombre_tipo_transporteGuiasRemisiones);
		jscrollPanenombre_tipo_transporteGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_transporteGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_transporteGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setText("U");
		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_transporteGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_transporteGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_transporteGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_transporteGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelivaGuiasRemisiones = new JLabelMe();
		this.jLabelivaGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaGuiasRemisiones.setToolTipText("Iva");
		this.jLabelivaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelivaGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextFieldivaGuiasRemisiones= new JTextFieldMe();
		jTextFieldivaGuiasRemisiones.setEnabled(false);
		jTextFieldivaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaGuiasRemisiones.setText("0.0");

		this.jButtonivaGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonivaGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaGuiasRemisionesBusqueda.setText("U");
		this.jButtonivaGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoGuiasRemisiones = new JLabelMe();
		this.jLabeldescuentoGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoGuiasRemisiones.setToolTipText("Descuento");
		this.jLabeldescuentoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPaneldescuentoGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextFielddescuentoGuiasRemisiones= new JTextFieldMe();
		jTextFielddescuentoGuiasRemisiones.setEnabled(false);
		jTextFielddescuentoGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoGuiasRemisiones.setText("0.0");

		this.jButtondescuentoGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtondescuentoGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoGuiasRemisionesBusqueda.setText("U");
		this.jButtondescuentoGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabelotroGuiasRemisiones = new JLabelMe();
		this.jLabelotroGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroGuiasRemisiones.setToolTipText("Otro");
		this.jLabelotroGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelotroGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextFieldotroGuiasRemisiones= new JTextFieldMe();
		jTextFieldotroGuiasRemisiones.setEnabled(false);
		jTextFieldotroGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroGuiasRemisiones.setText("0.0");

		this.jButtonotroGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonotroGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroGuiasRemisionesBusqueda.setText("U");
		this.jButtonotroGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroGuiasRemisionesBusqueda.setVisible(false);		}


					
		this.jLabeltotalGuiasRemisiones = new JLabelMe();
		this.jLabeltotalGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalGuiasRemisiones.setToolTipText("Total");
		this.jLabeltotalGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPaneltotalGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jTextFieldtotalGuiasRemisiones= new JTextFieldMe();
		jTextFieldtotalGuiasRemisiones.setEnabled(false);
		jTextFieldtotalGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalGuiasRemisiones.setText("0.0");

		this.jButtontotalGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtontotalGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalGuiasRemisionesBusqueda.setText("U");
		this.jButtontotalGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalGuiasRemisionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGuiasRemisiones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGuiasRemisiones = new JLabelMe();
		this.jLabelid_empresaGuiasRemisiones.setText(""+GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGuiasRemisiones.setToolTipText("Empresa");
		this.jLabelid_empresaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGuiasRemisiones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGuiasRemisiones.setToolTipText(GuiasRemisionesConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		this.jPanelid_empresaGuiasRemisiones.setLayout(this.gridaBagLayoutGuiasRemisiones);


		jComboBoxid_empresaGuiasRemisiones= new JComboBoxMe();
		jComboBoxid_empresaGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGuiasRemisiones.setEnabled(false);

		this.jButtonid_empresaGuiasRemisiones= new JButtonMe();
		this.jButtonid_empresaGuiasRemisiones.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuiasRemisiones.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuiasRemisiones.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuiasRemisiones.setText("Buscar");
		this.jButtonid_empresaGuiasRemisiones.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGuiasRemisiones.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuiasRemisiones,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuiasRemisiones"));

		this.jButtonid_empresaGuiasRemisionesBusqueda= new JButtonMe();
		this.jButtonid_empresaGuiasRemisionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiasRemisionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiasRemisionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGuiasRemisionesBusqueda.setText("U");
		this.jButtonid_empresaGuiasRemisionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGuiasRemisionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuiasRemisionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuiasRemisionesBusqueda"));

		if(this.guiasremisionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGuiasRemisionesBusqueda.setVisible(false);		}

		this.jButtonid_empresaGuiasRemisionesUpdate= new JButtonMe();
		this.jButtonid_empresaGuiasRemisionesUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiasRemisionesUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiasRemisionesUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGuiasRemisionesUpdate.setText("U");
		this.jButtonid_empresaGuiasRemisionesUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGuiasRemisionesUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuiasRemisionesUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGuiasRemisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuiasRemisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuiasRemisionesUpdate"));



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
		//this.jInternalFrameDetalleGuiasRemisiones = new GuiasRemisionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Guias Remisiones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGuiasRemisiones= new GridBagLayout();
		

		
		String sToolTipGuiasRemisiones="";
		sToolTipGuiasRemisiones=GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGuiasRemisiones+="(Facturacion.GuiasRemisiones)";
		}
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipGuiasRemisiones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGuiasRemisiones = new JButtonMe();
		this.jButtonModificarGuiasRemisiones = new JButtonMe();
        this.jButtonActualizarGuiasRemisiones = new JButtonMe();
        this.jButtonEliminarGuiasRemisiones = new JButtonMe();
        this.jButtonCancelarGuiasRemisiones = new JButtonMe();
        this.jButtonGuardarCambiosGuiasRemisiones = new JButtonMe();
		this.jButtonGuardarCambiosTablaGuiasRemisiones = new JButtonMe();
		this.jButtonCerrarGuiasRemisiones = new JButtonMe();
		
		this.jScrollPanelDatosGuiasRemisiones = new JScrollPane();   
        this.jScrollPanelDatosEdicionGuiasRemisiones = new JScrollPane();
		this.jScrollPanelDatosGeneralGuiasRemisiones = new JScrollPane();
				
		
		
		this.jPanelCamposGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Guias Remisiones";
		
		if(!this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guias Remisioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosGuiasRemisiones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGuiasRemisiones.setName("jPanelCamposGuiasRemisiones"); 

		this.jPanelCamposOcultosGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGuiasRemisiones.setName("jPanelCamposOcultosGuiasRemisiones"); 

        this.jPanelAccionesGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGuiasRemisiones.setToolTipText("Acciones");
        this.jPanelAccionesGuiasRemisiones.setName("Acciones"); 

		this.jPanelAccionesFormularioGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGuiasRemisiones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGuiasRemisiones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGuiasRemisiones.setText("Nuevo");
		this.jButtonModificarGuiasRemisiones.setText("Editar");
        this.jButtonActualizarGuiasRemisiones.setText("Actualizar");
        this.jButtonEliminarGuiasRemisiones.setText("Eliminar");
        this.jButtonCancelarGuiasRemisiones.setText("Cancelar");
        this.jButtonGuardarCambiosGuiasRemisiones.setText("Guardar");
		this.jButtonGuardarCambiosTablaGuiasRemisiones.setText("Guardar");
		this.jButtonCerrarGuiasRemisiones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuiasRemisiones,"nuevo_button","Nuevo",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGuiasRemisiones,"modificar_button","Editar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGuiasRemisiones,"actualizar_button","Actualizar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGuiasRemisiones,"eliminar_button","Eliminar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGuiasRemisiones,"cancelar_button","Cancelar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGuiasRemisiones,"guardarcambios_button","Guardar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGuiasRemisiones,"guardarcambiostabla_button","Guardar",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGuiasRemisiones,"cerrar_button","Salir",this.guiasremisionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGuiasRemisiones.setToolTipText("Nuevo"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGuiasRemisiones.setToolTipText("Editar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGuiasRemisiones.setToolTipText("Actualizar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGuiasRemisiones.setToolTipText("Eliminar)"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGuiasRemisiones.setToolTipText("Cancelar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGuiasRemisiones.setToolTipText("Guardar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGuiasRemisiones.setToolTipText("Guardar"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGuiasRemisiones.setToolTipText("Salir"+" "+GuiasRemisionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGuiasRemisiones";
		inputMap = this.jButtonNuevoGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGuiasRemisiones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGuiasRemisiones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGuiasRemisiones";
		inputMap = this.jButtonActualizarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGuiasRemisiones"));
		
		//ELIMINAR
		sMapKey = "EliminarGuiasRemisiones";
		inputMap = this.jButtonEliminarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGuiasRemisiones"));
		
		//CANCELAR	
		sMapKey = "CancelarGuiasRemisiones";
		inputMap = this.jButtonCancelarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGuiasRemisiones"));
		
		//CERRAR		
		sMapKey = "CerrarGuiasRemisiones";
		inputMap = this.jButtonCerrarGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGuiasRemisiones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGuiasRemisiones";
		inputMap = this.jButtonGuardarCambiosTablaGuiasRemisiones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGuiasRemisiones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGuiasRemisiones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGuiasRemisiones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGuiasRemisiones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGuiasRemisiones.setToolTipText("Nuevo GuiasRemisiones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGuiasRemisiones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGuiasRemisiones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGuiasRemisiones.setToolTipText("Sin Cerrar Ventana GuiasRemisiones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGuiasRemisiones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGuiasRemisiones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGuiasRemisiones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGuiasRemisiones.setText("Accion");
		this.jComboBoxTiposAccionesGuiasRemisiones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGuiasRemisiones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGuiasRemisiones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGuiasRemisiones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGuiasRemisiones = new JLabelMe();
		
		this.jLabelAccionesGuiasRemisiones.setText("Acciones");		
		this.jLabelAccionesGuiasRemisiones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiasRemisiones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiasRemisiones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGuiasRemisiones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGuiasRemisiones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGuiasRemisiones=new JTabbedPane();
		this.jTabbedPaneRelacionesGuiasRemisiones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGuiasRemisiones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGuiasRemisiones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiasRemisiones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiasRemisiones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGuiasRemisiones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGuiasRemisiones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGuiasRemisiones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGuiasRemisiones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGuiasRemisiones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGuiasRemisiones = new GridBagLayout();
		
		this.jPanelCamposGuiasRemisiones.setLayout(gridaBagLayoutCamposGuiasRemisiones);
		this.jPanelCamposOcultosGuiasRemisiones.setLayout(gridaBagLayoutCamposOcultosGuiasRemisiones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGuiasRemisiones.add(jLabelIdGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGuiasRemisiones.add(jLabelidGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGuiasRemisiones.add(jLabelid_empresaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGuiasRemisiones.add(jButtonid_empresaGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 3;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGuiasRemisiones.add(jButtonid_empresaGuiasRemisionesUpdate, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGuiasRemisiones.add(jComboBoxid_empresaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeGuiasRemisiones.add(jLabelfecha_emision_desdeGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeGuiasRemisiones.add(jButtonfecha_emision_desdeGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeGuiasRemisiones.add(jDateChooserfecha_emision_desdeGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaGuiasRemisiones.add(jLabelfecha_emision_hastaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaGuiasRemisiones.add(jButtonfecha_emision_hastaGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaGuiasRemisiones.add(jDateChooserfecha_emision_hastaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteGuiasRemisiones.add(jLabelnombre_completo_clienteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteGuiasRemisiones.add(jButtonnombre_completo_clienteGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteGuiasRemisiones.add(jscrollPanenombre_completo_clienteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaGuiasRemisiones.add(jLabelnumero_pre_impreso_facturaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaGuiasRemisiones.add(jButtonnumero_pre_impreso_facturaGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaGuiasRemisiones.add(jTextFieldnumero_pre_impreso_facturaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialGuiasRemisiones.add(jLabelsecuencialGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialGuiasRemisiones.add(jButtonsecuencialGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialGuiasRemisiones.add(jTextFieldsecuencialGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionGuiasRemisiones.add(jLabelfecha_emisionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionGuiasRemisiones.add(jButtonfecha_emisionGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionGuiasRemisiones.add(jDateChooserfecha_emisionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoGuiasRemisiones.add(jLabelfecha_vencimientoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoGuiasRemisiones.add(jButtonfecha_vencimientoGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoGuiasRemisiones.add(jDateChooserfecha_vencimientoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_transporteGuiasRemisiones.add(jLabelnombre_tipo_transporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_transporteGuiasRemisiones.add(jButtonnombre_tipo_transporteGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_transporteGuiasRemisiones.add(jscrollPanenombre_tipo_transporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaGuiasRemisiones.add(jLabelivaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaGuiasRemisiones.add(jButtonivaGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaGuiasRemisiones.add(jTextFieldivaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoGuiasRemisiones.add(jLabeldescuentoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoGuiasRemisiones.add(jButtondescuentoGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoGuiasRemisiones.add(jTextFielddescuentoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroGuiasRemisiones.add(jLabelotroGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroGuiasRemisiones.add(jButtonotroGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroGuiasRemisiones.add(jTextFieldotroGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalGuiasRemisiones.add(jLabeltotalGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		//this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = 2;
		this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
		this.gridBagConstraintsGuiasRemisiones.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalGuiasRemisiones.add(jButtontotalGuiasRemisionesBusqueda, this.gridBagConstraintsGuiasRemisiones);
	}

	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiasRemisiones.gridy = 0;
	this.gridBagConstraintsGuiasRemisiones.gridx = 1;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalGuiasRemisiones.add(jTextFieldtotalGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelidGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelfecha_emision_desdeGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelfecha_emision_hastaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelnombre_completo_clienteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelnumero_pre_impreso_facturaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelsecuencialGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelfecha_emisionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelfecha_vencimientoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelnombre_tipo_transporteGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelivaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPaneldescuentoGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPanelotroGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiasRemisiones.add(this.jPaneltotalGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposGuiasRemisiones % 2==0) {
		iXPanelCamposGuiasRemisiones=0;
		iYPanelCamposGuiasRemisiones++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiasRemisiones.gridy = iYPanelCamposOcultosGuiasRemisiones;
	this.gridBagConstraintsGuiasRemisiones.gridx = iXPanelCamposOcultosGuiasRemisiones++;
	this.gridBagConstraintsGuiasRemisiones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiasRemisiones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiasRemisiones.add(this.jPanelid_empresaGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);



	if(iXPanelCamposOcultosGuiasRemisiones % 2==0) {
		iXPanelCamposOcultosGuiasRemisiones=0;
		iYPanelCamposOcultosGuiasRemisiones++;
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
			
		GridBagLayout gridaBagLayoutAccionesGuiasRemisiones= new GridBagLayout();
		this.jPanelAccionesGuiasRemisiones.setLayout(gridaBagLayoutAccionesGuiasRemisiones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGuiasRemisiones= new GridBagLayout();
		this.jPanelAccionesFormularioGuiasRemisiones.setLayout(gridaBagLayoutAccionesFormularioGuiasRemisiones);
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGuiasRemisiones.add(this.jComboBoxTiposAccionesFormularioGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccion++;
			
		this.jPanelAccionesGuiasRemisiones.add(this.jButtonModificarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);							

		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;
		this.gridBagConstraintsGuiasRemisiones.gridx =iPosXAccion++;
			
		this.jPanelAccionesGuiasRemisiones.add(this.jButtonEliminarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccion++;
		
		this.jPanelAccionesGuiasRemisiones.add(this.jButtonActualizarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);


		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;		
		this.gridBagConstraintsGuiasRemisiones.gridx = iPosXAccion++;
		
		this.jPanelAccionesGuiasRemisiones.add(this.jButtonGuardarCambiosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);	
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = 0;		
		this.gridBagConstraintsGuiasRemisiones.gridx =iPosXAccion++;
		
		this.jPanelAccionesGuiasRemisiones.add(this.jButtonCancelarGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGuiasRemisiones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGuiasRemisiones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.guiasremisionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();						
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;		
			//this.gridBagConstraintsGuiasRemisiones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGuiasRemisiones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGuiasRemisiones.gridx =0;
		this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGuiasRemisiones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GuiasRemisionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGuiasRemisiones = new GuiasRemisionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Guias Remisiones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Guias Remisiones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Guias Remisiones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GuiasRemisionesModel guiasremisionesModel=new GuiasRemisionesModel(this);
			
			//SI USARA CLASE INTERNA
			//GuiasRemisionesModel.GuiasRemisionesFocusTraversalPolicy guiasremisionesFocusTraversalPolicy = guiasremisionesModel.new GuiasRemisionesFocusTraversalPolicy(this);
			
			//guiasremisionesFocusTraversalPolicy.setguiasremisionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(guiasremisionesModel);
			
			
			this.jContentPaneDetalleGuiasRemisiones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGuiasRemisiones = new GridBagLayout();	
			this.jContentPaneDetalleGuiasRemisiones.setLayout(gridaBagLayoutDetalleGuiasRemisiones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGuiasRemisiones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
				this.gridBagConstraintsGuiasRemisiones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGuiasRemisiones.gridx = 0;
					
				
				this.jContentPaneDetalleGuiasRemisiones.add(jTtoolBarDetalleGuiasRemisiones, gridBagConstraintsGuiasRemisiones);								
				
}
			
			this.jScrollPanelDatosEdicionGuiasRemisiones=   new JScrollPane(jContentPaneDetalleGuiasRemisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGuiasRemisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiasRemisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiasRemisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGuiasRemisiones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGuiasRemisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiasRemisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiasRemisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGuiasRemisiones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	        
			this.jContentPaneDetalleGuiasRemisiones.add(jPanelCamposGuiasRemisiones, gridBagConstraintsGuiasRemisiones);
			
			
			
			
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
						//&& guiasremisionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.guiasremisionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGuiasRemisiones= new GridBagConstraints();
						this.gridBagConstraintsGuiasRemisiones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGuiasRemisiones.gridx = 0;
						this.jContentPaneDetalleGuiasRemisiones.add(this.jTabbedPaneRelacionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGuiasRemisiones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGuiasRemisiones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
					this.gridBagConstraintsGuiasRemisiones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGuiasRemisiones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGuiasRemisiones.gridx = 0;
					
				
					this.jContentPaneDetalleGuiasRemisiones.add(jPanelCamposOcultosGuiasRemisiones, gridBagConstraintsGuiasRemisiones);
				
					this.jPanelCamposOcultosGuiasRemisiones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	        this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGuiasRemisiones.add(this.jPanelAccionesFormularioGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);							
			
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
	        this.gridBagConstraintsGuiasRemisiones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGuiasRemisiones.gridx = 0;
	        
			
			this.jContentPaneDetalleGuiasRemisiones.add(this.jPanelAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGuiasRemisiones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGuiasRemisiones=   new JScrollPane(this.jPanelCamposGuiasRemisiones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGuiasRemisiones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiasRemisiones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiasRemisiones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;
			this.gridBagConstraintsGuiasRemisiones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGuiasRemisiones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGuiasRemisiones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);			
			
			this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
			this.gridBagConstraintsGuiasRemisiones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGuiasRemisiones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
			
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		
			
		this.gridBagConstraintsGuiasRemisiones = new GridBagConstraints();
		this.gridBagConstraintsGuiasRemisiones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGuiasRemisiones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGuiasRemisiones, this.gridBagConstraintsGuiasRemisiones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGuiasRemisiones;//jContentPane;
		
		return jScrollPanelDatosEdicionGuiasRemisiones;
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
