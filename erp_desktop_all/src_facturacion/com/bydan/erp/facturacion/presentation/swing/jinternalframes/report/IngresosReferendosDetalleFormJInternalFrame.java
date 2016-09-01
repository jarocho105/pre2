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



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;



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
import com.bydan.erp.facturacion.util.report.IngresosReferendosConstantesFunciones;

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
public class IngresosReferendosDetalleFormJInternalFrame extends IngresosReferendosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleIngresosReferendos;
	
	protected JMenuBar jmenuBarDetalleIngresosReferendos;
	
	protected JMenu jmenuDetalleIngresosReferendos;
	protected JMenu jmenuDetalleArchivoIngresosReferendos;
	protected JMenu jmenuDetalleAccionesIngresosReferendos;
	protected JMenu jmenuDetalleDatosIngresosReferendos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutIngresosReferendos;	
	protected GridBagConstraints gridBagConstraintsIngresosReferendos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected IngresosReferendosBeanSwingJInternalFrameAdditional jInternalFrameDetalleIngresosReferendos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public IngresosReferendosSessionBean ingresosreferendosSessionBean;
	
	
	
		
	
	public IngresosReferendosLogic ingresosreferendosLogic;
	
	public JScrollPane jScrollPanelDatosIngresosReferendos;
	public JScrollPane jScrollPanelDatosEdicionIngresosReferendos;
	public JScrollPane jScrollPanelDatosGeneralIngresosReferendos;
	
	protected JPanel jPanelCamposIngresosReferendos;    
	protected JPanel jPanelCamposOcultosIngresosReferendos;    	
	protected JPanel jPanelAccionesIngresosReferendos;
	protected JPanel jPanelAccionesFormularioIngresosReferendos;
    
	
	
	protected Integer iXPanelCamposIngresosReferendos=0;
	protected Integer iYPanelCamposIngresosReferendos=0;
	
	protected Integer iXPanelCamposOcultosIngresosReferendos=0;
	protected Integer iYPanelCamposOcultosIngresosReferendos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoIngresosReferendos;
	public JButton jButtonModificarIngresosReferendos;
	public JButton jButtonActualizarIngresosReferendos;
    public JButton jButtonEliminarIngresosReferendos;
	public JButton jButtonCancelarIngresosReferendos;
    public JButton jButtonGuardarCambiosIngresosReferendos;
	public JButton jButtonGuardarCambiosTablaIngresosReferendos;
	protected JButton jButtonCerrarIngresosReferendos;
	
	
	protected JButton jButtonProcesarInformacionIngresosReferendos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoIngresosReferendos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarIngresosReferendos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeIngresosReferendos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarIngresosReferendos;
	protected JButton jButtonModificarToolBarIngresosReferendos;
	protected JButton jButtonActualizarToolBarIngresosReferendos;
    protected JButton jButtonEliminarToolBarIngresosReferendos;
	protected JButton jButtonCancelarToolBarIngresosReferendos;
    protected JButton jButtonGuardarCambiosToolBarIngresosReferendos;
	protected JButton jButtonGuardarCambiosTablaToolBarIngresosReferendos;
	protected JButton jButtonMostrarOcultarTablaToolBarIngresosReferendos;
	protected JButton jButtonCerrarToolBarIngresosReferendos;
	
	protected JButton jButtonProcesarInformacionToolBarIngresosReferendos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoIngresosReferendos;
	protected JMenuItem jMenuItemModificarIngresosReferendos;
	protected JMenuItem jMenuItemActualizarIngresosReferendos;
    protected JMenuItem jMenuItemEliminarIngresosReferendos;
	protected JMenuItem jMenuItemCancelarIngresosReferendos;
    protected JMenuItem jMenuItemGuardarCambiosIngresosReferendos;
	protected JMenuItem jMenuItemGuardarCambiosTablaIngresosReferendos;
	protected JMenuItem jMenuItemCerrarIngresosReferendos;
	protected JMenuItem jMenuItemDetalleCerrarIngresosReferendos;
	protected JMenuItem jMenuItemDetalleMostarOcultarIngresosReferendos;
	
	protected JMenuItem jMenuItemProcesarInformacionIngresosReferendos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosIngresosReferendos;
	protected JMenuItem jMenuItemMostrarOcultarIngresosReferendos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesIngresosReferendos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesIngresosReferendos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesIngresosReferendos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioIngresosReferendos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidIngresosReferendos;
	public JLabel jLabelIdIngresosReferendos;
	public JLabel jLabelidIngresosReferendos;
	public JButton jButtonidIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeIngresosReferendos;
	public JLabel jLabelfecha_emision_desdeIngresosReferendos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeIngresosReferendos;

	public JDateChooser jDateChooserfecha_emision_desdeIngresosReferendos;
	public JButton jButtonfecha_emision_desdeIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaIngresosReferendos;
	public JLabel jLabelfecha_emision_hastaIngresosReferendos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaIngresosReferendos;

	public JDateChooser jDateChooserfecha_emision_hastaIngresosReferendos;
	public JButton jButtonfecha_emision_hastaIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteIngresosReferendos;
	public JLabel jLabelnombre_completo_clienteIngresosReferendos;
	public JTextArea jTextAreanombre_completo_clienteIngresosReferendos;
	public JScrollPane jscrollPanenombre_completo_clienteIngresosReferendos;
	public JButton jButtonnombre_completo_clienteIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnumeroIngresosReferendos;
	public JLabel jLabelnumeroIngresosReferendos;
	public JTextField jTextFieldnumeroIngresosReferendos;
	public JButton jButtonnumeroIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionIngresosReferendos;
	public JLabel jLabelnumero_autorizacionIngresosReferendos;
	public JTextField jTextFieldnumero_autorizacionIngresosReferendos;
	public JButton jButtonnumero_autorizacionIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_fueIngresosReferendos;
	public JLabel jLabelnumero_fueIngresosReferendos;
	public JTextField jTextFieldnumero_fueIngresosReferendos;
	public JButton jButtonnumero_fueIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoIngresosReferendos;
	public JLabel jLabelnumero_pre_impresoIngresosReferendos;
	public JTextField jTextFieldnumero_pre_impresoIngresosReferendos;
	public JButton jButtonnumero_pre_impresoIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_dauIngresosReferendos;
	public JLabel jLabelnumero_dauIngresosReferendos;
	public JTextField jTextFieldnumero_dauIngresosReferendos;
	public JButton jButtonnumero_dauIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_referendoIngresosReferendos;
	public JLabel jLabelnumero_referendoIngresosReferendos;
	public JTextField jTextFieldnumero_referendoIngresosReferendos;
	public JButton jButtonnumero_referendoIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_referendoIngresosReferendos;
	public JLabel jLabelfecha_referendoIngresosReferendos;
	//public JFormattedTextField jDateChooserfecha_referendoIngresosReferendos;

	public JDateChooser jDateChooserfecha_referendoIngresosReferendos;
	public JButton jButtonfecha_referendoIngresosReferendosBusqueda= new JButtonMe();

	public JPanel jPanelaforo_referendoIngresosReferendos;
	public JLabel jLabelaforo_referendoIngresosReferendos;
	public JTextField jTextFieldaforo_referendoIngresosReferendos;
	public JButton jButtonaforo_referendoIngresosReferendosBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesIngresosReferendos;
	
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
	public int iHeightFormulario=1342;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public IngresosReferendosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposIngresosReferendos=new JPanel();
				this.jPanelAccionesFormularioIngresosReferendos=new JPanel();
				this.jmenuBarDetalleIngresosReferendos=new JMenuBar();
				this.jTtoolBarDetalleIngresosReferendos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public IngresosReferendosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public IngresosReferendosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("IngresosReferendos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarIngresosReferendos() {
		return this.jButtonActualizarToolBarIngresosReferendos;
	}
	
	public JButton getjButtonEliminarToolBarIngresosReferendos() {
		return this.jButtonEliminarToolBarIngresosReferendos;
	}
	
	public JButton getjButtonCancelarToolBarIngresosReferendos() {
		return this.jButtonCancelarToolBarIngresosReferendos;
	}		
	
	public JButton getjButtonProcesarInformacionIngresosReferendos() {
		return this.jButtonProcesarInformacionIngresosReferendos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionIngresosReferendos)	{
		this.jButtonProcesarInformacionIngresosReferendos = jButtonProcesarInformacionIngresosReferendos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesIngresosReferendos() {
		return this.jComboBoxTiposAccionesIngresosReferendos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesIngresosReferendos(
			JComboBox jComboBoxTiposRelacionesIngresosReferendos) {
		this.jComboBoxTiposRelacionesIngresosReferendos = jComboBoxTiposRelacionesIngresosReferendos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesIngresosReferendos(
			JComboBox jComboBoxTiposAccionesIngresosReferendos) {
		this.jComboBoxTiposAccionesIngresosReferendos = jComboBoxTiposAccionesIngresosReferendos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioIngresosReferendos() {
		return this.jComboBoxTiposAccionesFormularioIngresosReferendos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioIngresosReferendos(
			JComboBox jComboBoxTiposAccionesFormularioIngresosReferendos) {
		this.jComboBoxTiposAccionesFormularioIngresosReferendos = jComboBoxTiposAccionesFormularioIngresosReferendos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ingresosreferendosSessionBean=new IngresosReferendosSessionBean();
		
		this.ingresosreferendosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingresosreferendosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ingresosreferendosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		IngresosReferendosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		IngresosReferendosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		IngresosReferendosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ingresos Referendos MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
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
	
		IngresosReferendosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleIngresosReferendos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarIngresosReferendos=new JButtonMe();
				this.jButtonModificarToolBarIngresosReferendos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarIngresosReferendos,this.jTtoolBarDetalleIngresosReferendos,
							"actualizar","actualizar","Actualizar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarIngresosReferendos,this.jTtoolBarDetalleIngresosReferendos,
							"eliminar","eliminar","Eliminar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarIngresosReferendos,this.jTtoolBarDetalleIngresosReferendos,
							"cancelar","cancelar","Cancelar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarIngresosReferendos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarIngresosReferendos,this.jTtoolBarDetalleIngresosReferendos,
							"guardarcambios","guardarcambios","Guardar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleIngresosReferendos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleIngresosReferendos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoIngresosReferendos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesIngresosReferendos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosIngresosReferendos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoIngresosReferendos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoIngresosReferendos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoIngresosReferendos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarIngresosReferendos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarIngresosReferendos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarIngresosReferendos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarIngresosReferendos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarIngresosReferendos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarIngresosReferendos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarIngresosReferendos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarIngresosReferendos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarIngresosReferendos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarIngresosReferendos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarIngresosReferendos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarIngresosReferendos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosIngresosReferendos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosIngresosReferendos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosIngresosReferendos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarIngresosReferendos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarIngresosReferendos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarIngresosReferendos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarIngresosReferendos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarIngresosReferendos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarIngresosReferendos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarIngresosReferendos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarIngresosReferendos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarIngresosReferendos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarIngresosReferendos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarIngresosReferendos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarIngresosReferendos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoIngresosReferendos.add(this.jMenuItemDetalleCerrarIngresosReferendos);
		
		this.jmenuDetalleAccionesIngresosReferendos.add(this.jMenuItemActualizarIngresosReferendos);
		this.jmenuDetalleAccionesIngresosReferendos.add(this.jMenuItemEliminarIngresosReferendos);
		this.jmenuDetalleAccionesIngresosReferendos.add(this.jMenuItemCancelarIngresosReferendos);		
		
		//this.jmenuDetalleDatosIngresosReferendos.add(this.jMenuItemDetalleAbrirOrderByIngresosReferendos);				
		this.jmenuDetalleDatosIngresosReferendos.add(this.jMenuItemDetalleMostarOcultarIngresosReferendos);				
				
		//this.jmenuDetalleAccionesIngresosReferendos.add(this.jMenuItemGuardarCambiosIngresosReferendos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleIngresosReferendos.add(this.jmenuDetalleArchivoIngresosReferendos);		
		this.jmenuBarDetalleIngresosReferendos.add(this.jmenuDetalleAccionesIngresosReferendos);		
		this.jmenuBarDetalleIngresosReferendos.add(this.jmenuDetalleDatosIngresosReferendos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleIngresosReferendos);				
	}
	
	
	public void inicializarElementosCamposIngresosReferendos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdIngresosReferendos = new JLabelMe();
		jLabelIdIngresosReferendos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidIngresosReferendos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutIngresosReferendos= new GridBagLayout();

		this.jPanelidIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);

		jLabelidIngresosReferendos = new JLabel();
		jLabelidIngresosReferendos.setText("Id");

		jLabelidIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeIngresosReferendos = new JLabelMe();
		this.jLabelfecha_emision_desdeIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeIngresosReferendos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelfecha_emision_desdeIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		//jFormattedTextFieldfecha_emision_desdeIngresosReferendos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeIngresosReferendos= new JDateChooser();
		jDateChooserfecha_emision_desdeIngresosReferendos.setEnabled(false);
		jDateChooserfecha_emision_desdeIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeIngresosReferendos.setDate(new Date());
		jDateChooserfecha_emision_desdeIngresosReferendos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeIngresosReferendos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaIngresosReferendos = new JLabelMe();
		this.jLabelfecha_emision_hastaIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaIngresosReferendos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelfecha_emision_hastaIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		//jFormattedTextFieldfecha_emision_hastaIngresosReferendos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaIngresosReferendos= new JDateChooser();
		jDateChooserfecha_emision_hastaIngresosReferendos.setEnabled(false);
		jDateChooserfecha_emision_hastaIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaIngresosReferendos.setDate(new Date());
		jDateChooserfecha_emision_hastaIngresosReferendos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaIngresosReferendos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteIngresosReferendos = new JLabelMe();
		this.jLabelnombre_completo_clienteIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteIngresosReferendos.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnombre_completo_clienteIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextAreanombre_completo_clienteIngresosReferendos= new JTextAreaMe();
		jTextAreanombre_completo_clienteIngresosReferendos.setEnabled(false);
		jTextAreanombre_completo_clienteIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteIngresosReferendos.setLineWrap(true);
		jTextAreanombre_completo_clienteIngresosReferendos.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteIngresosReferendos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteIngresosReferendos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteIngresosReferendos = new JScrollPane(jTextAreanombre_completo_clienteIngresosReferendos);
		jscrollPanenombre_completo_clienteIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnumeroIngresosReferendos = new JLabelMe();
		this.jLabelnumeroIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroIngresosReferendos.setToolTipText("Numero");
		this.jLabelnumeroIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnumeroIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldnumeroIngresosReferendos= new JTextFieldMe();

		jTextFieldnumeroIngresosReferendos.setEnabled(false);
		jTextFieldnumeroIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnumeroIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroIngresosReferendosBusqueda.setText("U");
		this.jButtonnumeroIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionIngresosReferendos = new JLabelMe();
		this.jLabelnumero_autorizacionIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionIngresosReferendos.setToolTipText("Numero Autorizacion");
		this.jLabelnumero_autorizacionIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnumero_autorizacionIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldnumero_autorizacionIngresosReferendos= new JTextFieldMe();

		jTextFieldnumero_autorizacionIngresosReferendos.setEnabled(false);
		jTextFieldnumero_autorizacionIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setText("U");
		this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_fueIngresosReferendos = new JLabelMe();
		this.jLabelnumero_fueIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE+" : *");
		this.jLabelnumero_fueIngresosReferendos.setToolTipText("Numero Fue");
		this.jLabelnumero_fueIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fueIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_fueIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_fueIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_fueIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_fueIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NUMEROFUE);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnumero_fueIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldnumero_fueIngresosReferendos= new JTextFieldMe();

		jTextFieldnumero_fueIngresosReferendos.setEnabled(false);
		jTextFieldnumero_fueIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fueIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_fueIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_fueIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_fueIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnumero_fueIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fueIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_fueIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_fueIngresosReferendosBusqueda.setText("U");
		this.jButtonnumero_fueIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_fueIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_fueIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_fueIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_fueIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_fueIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_fueIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoIngresosReferendos = new JLabelMe();
		this.jLabelnumero_pre_impresoIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoIngresosReferendos.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnumero_pre_impresoIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldnumero_pre_impresoIngresosReferendos= new JTextFieldMe();

		jTextFieldnumero_pre_impresoIngresosReferendos.setEnabled(false);
		jTextFieldnumero_pre_impresoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setText("U");
		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_dauIngresosReferendos = new JLabelMe();
		this.jLabelnumero_dauIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NUMERODAU+" : *");
		this.jLabelnumero_dauIngresosReferendos.setToolTipText("Numero Dau");
		this.jLabelnumero_dauIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_dauIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_dauIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_dauIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_dauIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_dauIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NUMERODAU);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnumero_dauIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldnumero_dauIngresosReferendos= new JTextFieldMe();

		jTextFieldnumero_dauIngresosReferendos.setEnabled(false);
		jTextFieldnumero_dauIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dauIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dauIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_dauIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_dauIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnumero_dauIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dauIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dauIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_dauIngresosReferendosBusqueda.setText("U");
		this.jButtonnumero_dauIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_dauIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_dauIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_dauIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_dauIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_dauIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_dauIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_referendoIngresosReferendos = new JLabelMe();
		this.jLabelnumero_referendoIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO+" : *");
		this.jLabelnumero_referendoIngresosReferendos.setToolTipText("Numero Referendo");
		this.jLabelnumero_referendoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_referendoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_referendoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_referendoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_referendoIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_referendoIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_NUMEROREFERENDO);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelnumero_referendoIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldnumero_referendoIngresosReferendos= new JTextFieldMe();

		jTextFieldnumero_referendoIngresosReferendos.setEnabled(false);
		jTextFieldnumero_referendoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_referendoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_referendoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_referendoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_referendoIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonnumero_referendoIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_referendoIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_referendoIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_referendoIngresosReferendosBusqueda.setText("U");
		this.jButtonnumero_referendoIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_referendoIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_referendoIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_referendoIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_referendoIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_referendoIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_referendoIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_referendoIngresosReferendos = new JLabelMe();
		this.jLabelfecha_referendoIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO+" : *");
		this.jLabelfecha_referendoIngresosReferendos.setToolTipText("Fecha Referendo");
		this.jLabelfecha_referendoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_referendoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_referendoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_referendoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_referendoIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_referendoIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_FECHAREFERENDO);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelfecha_referendoIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		//jFormattedTextFieldfecha_referendoIngresosReferendos= new JFormattedTextFieldMe();

		jDateChooserfecha_referendoIngresosReferendos= new JDateChooser();
		jDateChooserfecha_referendoIngresosReferendos.setEnabled(false);
		jDateChooserfecha_referendoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_referendoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_referendoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_referendoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_referendoIngresosReferendos.setDate(new Date());
		jDateChooserfecha_referendoIngresosReferendos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_referendoIngresosReferendos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_referendoIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonfecha_referendoIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_referendoIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_referendoIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_referendoIngresosReferendosBusqueda.setText("U");
		this.jButtonfecha_referendoIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_referendoIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_referendoIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_referendoIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_referendoIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_referendoIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_referendoIngresosReferendosBusqueda.setVisible(false);		}


					
		this.jLabelaforo_referendoIngresosReferendos = new JLabelMe();
		this.jLabelaforo_referendoIngresosReferendos.setText(""+IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO+" : *");
		this.jLabelaforo_referendoIngresosReferendos.setToolTipText("Aforo Referendo");
		this.jLabelaforo_referendoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelaforo_referendoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelaforo_referendoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelaforo_referendoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaforo_referendoIngresosReferendos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaforo_referendoIngresosReferendos.setToolTipText(IngresosReferendosConstantesFunciones.LABEL_AFOROREFERENDO);
		this.gridaBagLayoutIngresosReferendos = new GridBagLayout();
		this.jPanelaforo_referendoIngresosReferendos.setLayout(this.gridaBagLayoutIngresosReferendos);


		jTextFieldaforo_referendoIngresosReferendos= new JTextFieldMe();

		jTextFieldaforo_referendoIngresosReferendos.setEnabled(false);
		jTextFieldaforo_referendoIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaforo_referendoIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaforo_referendoIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaforo_referendoIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonaforo_referendoIngresosReferendosBusqueda= new JButtonMe();
		this.jButtonaforo_referendoIngresosReferendosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaforo_referendoIngresosReferendosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaforo_referendoIngresosReferendosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaforo_referendoIngresosReferendosBusqueda.setText("U");
		this.jButtonaforo_referendoIngresosReferendosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaforo_referendoIngresosReferendosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaforo_referendoIngresosReferendosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaforo_referendoIngresosReferendos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaforo_referendoIngresosReferendos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aforo_referendoIngresosReferendosBusqueda"));

		if(this.ingresosreferendosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaforo_referendoIngresosReferendosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysIngresosReferendos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleIngresosReferendos = new IngresosReferendosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ingresos Referendos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutIngresosReferendos= new GridBagLayout();
		

		
		String sToolTipIngresosReferendos="";
		sToolTipIngresosReferendos=IngresosReferendosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipIngresosReferendos+="(Facturacion.IngresosReferendos)";
		}
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			sToolTipIngresosReferendos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoIngresosReferendos = new JButtonMe();
		this.jButtonModificarIngresosReferendos = new JButtonMe();
        this.jButtonActualizarIngresosReferendos = new JButtonMe();
        this.jButtonEliminarIngresosReferendos = new JButtonMe();
        this.jButtonCancelarIngresosReferendos = new JButtonMe();
        this.jButtonGuardarCambiosIngresosReferendos = new JButtonMe();
		this.jButtonGuardarCambiosTablaIngresosReferendos = new JButtonMe();
		this.jButtonCerrarIngresosReferendos = new JButtonMe();
		
		this.jScrollPanelDatosIngresosReferendos = new JScrollPane();   
        this.jScrollPanelDatosEdicionIngresosReferendos = new JScrollPane();
		this.jScrollPanelDatosGeneralIngresosReferendos = new JScrollPane();
				
		
		
		this.jPanelCamposIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ingresos Referendos";
		
		if(!this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ingresos Referendoses" + this.sPath));
		} else {
			this.jScrollPanelDatosIngresosReferendos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposIngresosReferendos.setName("jPanelCamposIngresosReferendos"); 

		this.jPanelCamposOcultosIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosIngresosReferendos.setName("jPanelCamposOcultosIngresosReferendos"); 

        this.jPanelAccionesIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesIngresosReferendos.setToolTipText("Acciones");
        this.jPanelAccionesIngresosReferendos.setName("Acciones"); 

		this.jPanelAccionesFormularioIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioIngresosReferendos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioIngresosReferendos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoIngresosReferendos.setText("Nuevo");
		this.jButtonModificarIngresosReferendos.setText("Editar");
        this.jButtonActualizarIngresosReferendos.setText("Actualizar");
        this.jButtonEliminarIngresosReferendos.setText("Eliminar");
        this.jButtonCancelarIngresosReferendos.setText("Cancelar");
        this.jButtonGuardarCambiosIngresosReferendos.setText("Guardar");
		this.jButtonGuardarCambiosTablaIngresosReferendos.setText("Guardar");
		this.jButtonCerrarIngresosReferendos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoIngresosReferendos,"nuevo_button","Nuevo",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarIngresosReferendos,"modificar_button","Editar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarIngresosReferendos,"actualizar_button","Actualizar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarIngresosReferendos,"eliminar_button","Eliminar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarIngresosReferendos,"cancelar_button","Cancelar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosIngresosReferendos,"guardarcambios_button","Guardar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaIngresosReferendos,"guardarcambiostabla_button","Guardar",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarIngresosReferendos,"cerrar_button","Salir",this.ingresosreferendosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoIngresosReferendos.setToolTipText("Nuevo"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarIngresosReferendos.setToolTipText("Editar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarIngresosReferendos.setToolTipText("Actualizar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarIngresosReferendos.setToolTipText("Eliminar)"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarIngresosReferendos.setToolTipText("Cancelar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosIngresosReferendos.setToolTipText("Guardar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaIngresosReferendos.setToolTipText("Guardar"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarIngresosReferendos.setToolTipText("Salir"+" "+IngresosReferendosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoIngresosReferendos";
		inputMap = this.jButtonNuevoIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoIngresosReferendos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoIngresosReferendos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarIngresosReferendos";
		inputMap = this.jButtonActualizarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarIngresosReferendos"));
		
		//ELIMINAR
		sMapKey = "EliminarIngresosReferendos";
		inputMap = this.jButtonEliminarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarIngresosReferendos"));
		
		//CANCELAR	
		sMapKey = "CancelarIngresosReferendos";
		inputMap = this.jButtonCancelarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarIngresosReferendos"));
		
		//CERRAR		
		sMapKey = "CerrarIngresosReferendos";
		inputMap = this.jButtonCerrarIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarIngresosReferendos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaIngresosReferendos";
		inputMap = this.jButtonGuardarCambiosTablaIngresosReferendos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaIngresosReferendos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaIngresosReferendos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoIngresosReferendos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoIngresosReferendos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoIngresosReferendos.setToolTipText("Nuevo IngresosReferendos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarIngresosReferendos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarIngresosReferendos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarIngresosReferendos.setToolTipText("Sin Cerrar Ventana IngresosReferendos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeIngresosReferendos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeIngresosReferendos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeIngresosReferendos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesIngresosReferendos.setText("Accion");
		this.jComboBoxTiposAccionesIngresosReferendos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioIngresosReferendos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioIngresosReferendos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioIngresosReferendos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesIngresosReferendos = new JLabelMe();
		
		this.jLabelAccionesIngresosReferendos.setText("Acciones");		
		this.jLabelAccionesIngresosReferendos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosReferendos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesIngresosReferendos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposIngresosReferendos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysIngresosReferendos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesIngresosReferendos=new JTabbedPane();
		this.jTabbedPaneRelacionesIngresosReferendos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesIngresosReferendos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesIngresosReferendos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosReferendos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesIngresosReferendos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesIngresosReferendos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioIngresosReferendos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIngresosReferendos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioIngresosReferendos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioIngresosReferendos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposIngresosReferendos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosIngresosReferendos = new GridBagLayout();
		
		this.jPanelCamposIngresosReferendos.setLayout(gridaBagLayoutCamposIngresosReferendos);
		this.jPanelCamposOcultosIngresosReferendos.setLayout(gridaBagLayoutCamposOcultosIngresosReferendos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidIngresosReferendos.add(jLabelIdIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidIngresosReferendos.add(jLabelidIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeIngresosReferendos.add(jLabelfecha_emision_desdeIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeIngresosReferendos.add(jButtonfecha_emision_desdeIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeIngresosReferendos.add(jDateChooserfecha_emision_desdeIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaIngresosReferendos.add(jLabelfecha_emision_hastaIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaIngresosReferendos.add(jButtonfecha_emision_hastaIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaIngresosReferendos.add(jDateChooserfecha_emision_hastaIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteIngresosReferendos.add(jLabelnombre_completo_clienteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteIngresosReferendos.add(jButtonnombre_completo_clienteIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteIngresosReferendos.add(jscrollPanenombre_completo_clienteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroIngresosReferendos.add(jLabelnumeroIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroIngresosReferendos.add(jButtonnumeroIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroIngresosReferendos.add(jTextFieldnumeroIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionIngresosReferendos.add(jLabelnumero_autorizacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionIngresosReferendos.add(jButtonnumero_autorizacionIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionIngresosReferendos.add(jTextFieldnumero_autorizacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_fueIngresosReferendos.add(jLabelnumero_fueIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_fueIngresosReferendos.add(jButtonnumero_fueIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_fueIngresosReferendos.add(jTextFieldnumero_fueIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoIngresosReferendos.add(jLabelnumero_pre_impresoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoIngresosReferendos.add(jButtonnumero_pre_impresoIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoIngresosReferendos.add(jTextFieldnumero_pre_impresoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_dauIngresosReferendos.add(jLabelnumero_dauIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_dauIngresosReferendos.add(jButtonnumero_dauIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_dauIngresosReferendos.add(jTextFieldnumero_dauIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_referendoIngresosReferendos.add(jLabelnumero_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_referendoIngresosReferendos.add(jButtonnumero_referendoIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_referendoIngresosReferendos.add(jTextFieldnumero_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_referendoIngresosReferendos.add(jLabelfecha_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_referendoIngresosReferendos.add(jButtonfecha_referendoIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_referendoIngresosReferendos.add(jDateChooserfecha_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 0;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaforo_referendoIngresosReferendos.add(jLabelaforo_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		//this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = 2;
		this.gridBagConstraintsIngresosReferendos.ipadx = 0;
		this.gridBagConstraintsIngresosReferendos.insets = new Insets(0, 0, 0, 0);
		this.jPanelaforo_referendoIngresosReferendos.add(jButtonaforo_referendoIngresosReferendosBusqueda, this.gridBagConstraintsIngresosReferendos);
	}

	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsIngresosReferendos.gridy = 0;
	this.gridBagConstraintsIngresosReferendos.gridx = 1;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaforo_referendoIngresosReferendos.add(jTextFieldaforo_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelidIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelfecha_emision_desdeIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelfecha_emision_hastaIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnombre_completo_clienteIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnumeroIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnumero_autorizacionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnumero_fueIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnumero_pre_impresoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnumero_dauIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelnumero_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelfecha_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
	this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsIngresosReferendos.gridy = iYPanelCamposIngresosReferendos;
	this.gridBagConstraintsIngresosReferendos.gridx = iXPanelCamposIngresosReferendos++;
	this.gridBagConstraintsIngresosReferendos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsIngresosReferendos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIngresosReferendos.add(this.jPanelaforo_referendoIngresosReferendos, this.gridBagConstraintsIngresosReferendos);



	if(iXPanelCamposIngresosReferendos % 1==0) {
		iXPanelCamposIngresosReferendos=0;
		iYPanelCamposIngresosReferendos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesIngresosReferendos= new GridBagLayout();
		this.jPanelAccionesIngresosReferendos.setLayout(gridaBagLayoutAccionesIngresosReferendos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioIngresosReferendos= new GridBagLayout();
		this.jPanelAccionesFormularioIngresosReferendos.setLayout(gridaBagLayoutAccionesFormularioIngresosReferendos);
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsIngresosReferendos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioIngresosReferendos.add(this.jComboBoxTiposAccionesFormularioIngresosReferendos, this.gridBagConstraintsIngresosReferendos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccion++;
			
		this.jPanelAccionesIngresosReferendos.add(this.jButtonModificarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);							

		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsIngresosReferendos.gridy = 0;
		this.gridBagConstraintsIngresosReferendos.gridx =iPosXAccion++;
			
		this.jPanelAccionesIngresosReferendos.add(this.jButtonEliminarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
			
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = 0;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccion++;
		
		this.jPanelAccionesIngresosReferendos.add(this.jButtonActualizarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);


		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = 0;		
		this.gridBagConstraintsIngresosReferendos.gridx = iPosXAccion++;
		
		this.jPanelAccionesIngresosReferendos.add(this.jButtonGuardarCambiosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);	
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = 0;		
		this.gridBagConstraintsIngresosReferendos.gridx =iPosXAccion++;
		
		this.jPanelAccionesIngresosReferendos.add(this.jButtonCancelarIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutIngresosReferendos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutIngresosReferendos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ingresosreferendosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();						
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsIngresosReferendos.gridx = 0;		
			//this.gridBagConstraintsIngresosReferendos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsIngresosReferendos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsIngresosReferendos.gridx =0;
		this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsIngresosReferendos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(IngresosReferendosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleIngresosReferendos = new IngresosReferendosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ingresos Referendos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ingresos Referendos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ingresos Referendos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			IngresosReferendosModel ingresosreferendosModel=new IngresosReferendosModel(this);
			
			//SI USARA CLASE INTERNA
			//IngresosReferendosModel.IngresosReferendosFocusTraversalPolicy ingresosreferendosFocusTraversalPolicy = ingresosreferendosModel.new IngresosReferendosFocusTraversalPolicy(this);
			
			//ingresosreferendosFocusTraversalPolicy.setingresosreferendosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ingresosreferendosModel);
			
			
			this.jContentPaneDetalleIngresosReferendos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleIngresosReferendos = new GridBagLayout();	
			this.jContentPaneDetalleIngresosReferendos.setLayout(gridaBagLayoutDetalleIngresosReferendos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosIngresosReferendos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
				this.gridBagConstraintsIngresosReferendos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsIngresosReferendos.gridx = 0;
					
				
				this.jContentPaneDetalleIngresosReferendos.add(jTtoolBarDetalleIngresosReferendos, gridBagConstraintsIngresosReferendos);								
				
}
			
			this.jScrollPanelDatosEdicionIngresosReferendos=   new JScrollPane(jContentPaneDetalleIngresosReferendos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIngresosReferendos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosReferendos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosReferendos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralIngresosReferendos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralIngresosReferendos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosReferendos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralIngresosReferendos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsIngresosReferendos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsIngresosReferendos.gridx = 0;
	        
			this.jContentPaneDetalleIngresosReferendos.add(jPanelCamposIngresosReferendos, gridBagConstraintsIngresosReferendos);
			
			
			
			
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
						//&& ingresosreferendosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ingresosreferendosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsIngresosReferendos= new GridBagConstraints();
						this.gridBagConstraintsIngresosReferendos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsIngresosReferendos.gridx = 0;
						this.jContentPaneDetalleIngresosReferendos.add(this.jTabbedPaneRelacionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesIngresosReferendos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosIngresosReferendos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
					this.gridBagConstraintsIngresosReferendos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsIngresosReferendos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsIngresosReferendos.gridx = 0;
					
				
					this.jContentPaneDetalleIngresosReferendos.add(jPanelCamposOcultosIngresosReferendos, gridBagConstraintsIngresosReferendos);
				
					this.jPanelCamposOcultosIngresosReferendos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsIngresosReferendos.gridx = 0;
	        this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleIngresosReferendos.add(this.jPanelAccionesFormularioIngresosReferendos, this.gridBagConstraintsIngresosReferendos);							
			
			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
	        this.gridBagConstraintsIngresosReferendos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsIngresosReferendos.gridx = 0;
	        
			
			this.jContentPaneDetalleIngresosReferendos.add(this.jPanelAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionIngresosReferendos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionIngresosReferendos=   new JScrollPane(this.jPanelCamposIngresosReferendos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionIngresosReferendos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosReferendos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionIngresosReferendos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsIngresosReferendos.gridx = 0;
			this.gridBagConstraintsIngresosReferendos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsIngresosReferendos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsIngresosReferendos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIngresosReferendos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioIngresosReferendos, this.gridBagConstraintsIngresosReferendos);			
			
			this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
			this.gridBagConstraintsIngresosReferendos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsIngresosReferendos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
			
			
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		
			
		this.gridBagConstraintsIngresosReferendos = new GridBagConstraints();
		this.gridBagConstraintsIngresosReferendos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsIngresosReferendos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesIngresosReferendos, this.gridBagConstraintsIngresosReferendos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralIngresosReferendos;//jContentPane;
		
		return jScrollPanelDatosEdicionIngresosReferendos;
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
