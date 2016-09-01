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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ConsultorConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ConsultorDetalleFormJInternalFrame extends ConsultorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsultor;
	
	protected JMenuBar jmenuBarDetalleConsultor;
	
	protected JMenu jmenuDetalleConsultor;
	protected JMenu jmenuDetalleArchivoConsultor;
	protected JMenu jmenuDetalleAccionesConsultor;
	protected JMenu jmenuDetalleDatosConsultor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsultor;	
	protected GridBagConstraints gridBagConstraintsConsultor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsultorBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsultor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ConsultorSessionBean consultorSessionBean;
	
	

	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame=null;
	public GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGuiaRemision=false;
	public GuiaRemisionSessionBean guiaremisionSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;

	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;
	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedido=false;
	public PedidoSessionBean pedidoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ConsultorLogic consultorLogic;
	
	public JScrollPane jScrollPanelDatosConsultor;
	public JScrollPane jScrollPanelDatosEdicionConsultor;
	public JScrollPane jScrollPanelDatosGeneralConsultor;
	
	protected JPanel jPanelCamposConsultor;    
	protected JPanel jPanelCamposOcultosConsultor;    	
	protected JPanel jPanelAccionesConsultor;
	protected JPanel jPanelAccionesFormularioConsultor;
    
	
	
	protected Integer iXPanelCamposConsultor=0;
	protected Integer iYPanelCamposConsultor=0;
	
	protected Integer iXPanelCamposOcultosConsultor=0;
	protected Integer iYPanelCamposOcultosConsultor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsultor;
	public JButton jButtonModificarConsultor;
	public JButton jButtonActualizarConsultor;
    public JButton jButtonEliminarConsultor;
	public JButton jButtonCancelarConsultor;
    public JButton jButtonGuardarCambiosConsultor;
	public JButton jButtonGuardarCambiosTablaConsultor;
	protected JButton jButtonCerrarConsultor;
	
	
	protected JButton jButtonProcesarInformacionConsultor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsultor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsultor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsultor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsultor;
	protected JButton jButtonModificarToolBarConsultor;
	protected JButton jButtonActualizarToolBarConsultor;
    protected JButton jButtonEliminarToolBarConsultor;
	protected JButton jButtonCancelarToolBarConsultor;
    protected JButton jButtonGuardarCambiosToolBarConsultor;
	protected JButton jButtonGuardarCambiosTablaToolBarConsultor;
	protected JButton jButtonMostrarOcultarTablaToolBarConsultor;
	protected JButton jButtonCerrarToolBarConsultor;
	
	protected JButton jButtonProcesarInformacionToolBarConsultor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsultor;
	protected JMenuItem jMenuItemModificarConsultor;
	protected JMenuItem jMenuItemActualizarConsultor;
    protected JMenuItem jMenuItemEliminarConsultor;
	protected JMenuItem jMenuItemCancelarConsultor;
    protected JMenuItem jMenuItemGuardarCambiosConsultor;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsultor;
	protected JMenuItem jMenuItemCerrarConsultor;
	protected JMenuItem jMenuItemDetalleCerrarConsultor;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsultor;
	
	protected JMenuItem jMenuItemProcesarInformacionConsultor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsultor;
	protected JMenuItem jMenuItemMostrarOcultarConsultor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsultor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsultor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsultor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsultor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsultor;
	public JLabel jLabelIdConsultor;
	public JLabel jLabelidConsultor;
	public JButton jButtonidConsultorBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionConsultor;
	public JLabel jLabelidentificacionConsultor;
	public JTextField jTextFieldidentificacionConsultor;
	public JButton jButtonidentificacionConsultorBusqueda= new JButtonMe();

	public JPanel jPanelapellidoConsultor;
	public JLabel jLabelapellidoConsultor;
	public JTextArea jTextAreaapellidoConsultor;
	public JScrollPane jscrollPaneapellidoConsultor;
	public JButton jButtonapellidoConsultorBusqueda= new JButtonMe();

	public JPanel jPanelnombreConsultor;
	public JLabel jLabelnombreConsultor;
	public JTextArea jTextAreanombreConsultor;
	public JScrollPane jscrollPanenombreConsultor;
	public JButton jButtonnombreConsultorBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoConsultor;
	public JLabel jLabelnombre_completoConsultor;
	public JTextArea jTextAreanombre_completoConsultor;
	public JScrollPane jscrollPanenombre_completoConsultor;
	public JButton jButtonnombre_completoConsultorBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoConsultor;
	public JLabel jLabeltelefonoConsultor;
	public JTextArea jTextAreatelefonoConsultor;
	public JScrollPane jscrollPanetelefonoConsultor;
	public JButton jButtontelefonoConsultorBusqueda= new JButtonMe();

	public JPanel jPanele_mailConsultor;
	public JLabel jLabele_mailConsultor;
	public JTextArea jTextAreae_mailConsultor;
	public JScrollPane jscrollPanee_mailConsultor;
	public JButton jButtone_mailConsultorBusqueda= new JButtonMe();

	public JPanel jPaneldireccionConsultor;
	public JLabel jLabeldireccionConsultor;
	public JTextArea jTextAreadireccionConsultor;
	public JScrollPane jscrollPanedireccionConsultor;
	public JButton jButtondireccionConsultorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionConsultor;
	public JLabel jLabeldescripcionConsultor;
	public JTextArea jTextAreadescripcionConsultor;
	public JScrollPane jscrollPanedescripcionConsultor;
	public JButton jButtondescripcionConsultorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsultor;
	public JLabel jLabelid_empresaConsultor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsultor;
	public JButton jButtonid_empresaConsultor= new JButtonMe();
	public JButton jButtonid_empresaConsultorUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsultorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsultor;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
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
	
	public ConsultorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsultor=new JPanel();
				this.jPanelAccionesFormularioConsultor=new JPanel();
				this.jmenuBarDetalleConsultor=new JMenuBar();
				this.jTtoolBarDetalleConsultor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsultorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsultorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Consultor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConsultor() {
		return this.jButtonActualizarToolBarConsultor;
	}
	
	public JButton getjButtonEliminarToolBarConsultor() {
		return this.jButtonEliminarToolBarConsultor;
	}
	
	public JButton getjButtonCancelarToolBarConsultor() {
		return this.jButtonCancelarToolBarConsultor;
	}		
	
	public JButton getjButtonProcesarInformacionConsultor() {
		return this.jButtonProcesarInformacionConsultor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsultor)	{
		this.jButtonProcesarInformacionConsultor = jButtonProcesarInformacionConsultor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsultor() {
		return this.jComboBoxTiposAccionesConsultor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsultor(
			JComboBox jComboBoxTiposRelacionesConsultor) {
		this.jComboBoxTiposRelacionesConsultor = jComboBoxTiposRelacionesConsultor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsultor(
			JComboBox jComboBoxTiposAccionesConsultor) {
		this.jComboBoxTiposAccionesConsultor = jComboBoxTiposAccionesConsultor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsultor() {
		return this.jComboBoxTiposAccionesFormularioConsultor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsultor(
			JComboBox jComboBoxTiposAccionesFormularioConsultor) {
		this.jComboBoxTiposAccionesFormularioConsultor = jComboBoxTiposAccionesFormularioConsultor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consultorSessionBean=new ConsultorSessionBean();
		
		this.consultorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consultorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consultorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		//this.pedidoSessionBean=new PedidoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsultorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consultor MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsultorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsultor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsultor=new JButtonMe();
				this.jButtonModificarToolBarConsultor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsultor,this.jTtoolBarDetalleConsultor,
							"actualizar","actualizar","Actualizar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsultor,this.jTtoolBarDetalleConsultor,
							"eliminar","eliminar","Eliminar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsultor,this.jTtoolBarDetalleConsultor,
							"cancelar","cancelar","Cancelar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsultor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsultor,this.jTtoolBarDetalleConsultor,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsultor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsultor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsultor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsultor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsultor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsultor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsultor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsultor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsultor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsultor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsultor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsultor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsultor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsultor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsultor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsultor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsultor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsultor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsultor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsultor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsultor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsultor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsultor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsultor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsultor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsultor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsultor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsultor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsultor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsultor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsultor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsultor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsultor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsultor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsultor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsultor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsultor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsultor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsultor.add(this.jMenuItemDetalleCerrarConsultor);
		
		this.jmenuDetalleAccionesConsultor.add(this.jMenuItemActualizarConsultor);
		this.jmenuDetalleAccionesConsultor.add(this.jMenuItemEliminarConsultor);
		this.jmenuDetalleAccionesConsultor.add(this.jMenuItemCancelarConsultor);		
		
		//this.jmenuDetalleDatosConsultor.add(this.jMenuItemDetalleAbrirOrderByConsultor);				
		this.jmenuDetalleDatosConsultor.add(this.jMenuItemDetalleMostarOcultarConsultor);				
				
		//this.jmenuDetalleAccionesConsultor.add(this.jMenuItemGuardarCambiosConsultor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsultor.add(this.jmenuDetalleArchivoConsultor);		
		this.jmenuBarDetalleConsultor.add(this.jmenuDetalleAccionesConsultor);		
		this.jmenuBarDetalleConsultor.add(this.jmenuDetalleDatosConsultor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleConsultor.add(this.jmenuDetalleConsultor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsultor);				
	}
	
	
	public void inicializarElementosCamposConsultor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsultor = new JLabelMe();
		jLabelIdConsultor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsultor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsultor= new GridBagLayout();

		this.jPanelidConsultor.setLayout(this.gridaBagLayoutConsultor);

		jLabelidConsultor = new JLabel();
		jLabelidConsultor.setText("Id");

		jLabelidConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionConsultor = new JLabelMe();
		this.jLabelidentificacionConsultor.setText(""+ConsultorConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionConsultor.setToolTipText("Identificacion");
		this.jLabelidentificacionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPanelidentificacionConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextFieldidentificacionConsultor= new JTextFieldMe();

		jTextFieldidentificacionConsultor.setEnabled(false);
		jTextFieldidentificacionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionConsultorBusqueda= new JButtonMe();
		this.jButtonidentificacionConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionConsultorBusqueda.setText("U");
		this.jButtonidentificacionConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionConsultorBusqueda.setVisible(false);		}


					
		this.jLabelapellidoConsultor = new JLabelMe();
		this.jLabelapellidoConsultor.setText(""+ConsultorConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoConsultor.setToolTipText("Apellido");
		this.jLabelapellidoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPanelapellidoConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreaapellidoConsultor= new JTextAreaMe();
		jTextAreaapellidoConsultor.setEnabled(false);
		jTextAreaapellidoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoConsultor.setLineWrap(true);
		jTextAreaapellidoConsultor.setWrapStyleWord(true);
		jTextAreaapellidoConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoConsultor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoConsultor = new JScrollPane(jTextAreaapellidoConsultor);
		jscrollPaneapellidoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoConsultorBusqueda= new JButtonMe();
		this.jButtonapellidoConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoConsultorBusqueda.setText("U");
		this.jButtonapellidoConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoConsultorBusqueda.setVisible(false);		}


					
		this.jLabelnombreConsultor = new JLabelMe();
		this.jLabelnombreConsultor.setText(""+ConsultorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConsultor.setToolTipText("Nombre");
		this.jLabelnombreConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPanelnombreConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreanombreConsultor= new JTextAreaMe();
		jTextAreanombreConsultor.setEnabled(false);
		jTextAreanombreConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsultor.setLineWrap(true);
		jTextAreanombreConsultor.setWrapStyleWord(true);
		jTextAreanombreConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConsultor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConsultor = new JScrollPane(jTextAreanombreConsultor);
		jscrollPanenombreConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConsultorBusqueda= new JButtonMe();
		this.jButtonnombreConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConsultorBusqueda.setText("U");
		this.jButtonnombreConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConsultorBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completoConsultor = new JLabelMe();
		this.jLabelnombre_completoConsultor.setText(""+ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO+" :");
		this.jLabelnombre_completoConsultor.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPanelnombre_completoConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreanombre_completoConsultor= new JTextAreaMe();
		jTextAreanombre_completoConsultor.setEnabled(false);
		jTextAreanombre_completoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completoConsultor.setLineWrap(true);
		jTextAreanombre_completoConsultor.setWrapStyleWord(true);
		jTextAreanombre_completoConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completoConsultor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completoConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completoConsultor = new JScrollPane(jTextAreanombre_completoConsultor);
		jscrollPanenombre_completoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completoConsultorBusqueda= new JButtonMe();
		this.jButtonnombre_completoConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoConsultorBusqueda.setText("U");
		this.jButtonnombre_completoConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completoConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completoConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoConsultorBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoConsultor = new JLabelMe();
		this.jLabeltelefonoConsultor.setText(""+ConsultorConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoConsultor.setToolTipText("Telefono");
		this.jLabeltelefonoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPaneltelefonoConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreatelefonoConsultor= new JTextAreaMe();
		jTextAreatelefonoConsultor.setEnabled(false);
		jTextAreatelefonoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefonoConsultor.setLineWrap(true);
		jTextAreatelefonoConsultor.setWrapStyleWord(true);
		jTextAreatelefonoConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefonoConsultor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefonoConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefonoConsultor = new JScrollPane(jTextAreatelefonoConsultor);
		jscrollPanetelefonoConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetelefonoConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontelefonoConsultorBusqueda= new JButtonMe();
		this.jButtontelefonoConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoConsultorBusqueda.setText("U");
		this.jButtontelefonoConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefonoConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefonoConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoConsultorBusqueda.setVisible(false);		}


					
		this.jLabele_mailConsultor = new JLabelMe();
		this.jLabele_mailConsultor.setText(""+ConsultorConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabele_mailConsultor.setToolTipText("E Mail");
		this.jLabele_mailConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mailConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mailConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mailConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPanele_mailConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreae_mailConsultor= new JTextAreaMe();
		jTextAreae_mailConsultor.setEnabled(false);
		jTextAreae_mailConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailConsultor.setLineWrap(true);
		jTextAreae_mailConsultor.setWrapStyleWord(true);
		jTextAreae_mailConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreae_mailConsultor.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreae_mailConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanee_mailConsultor = new JScrollPane(jTextAreae_mailConsultor);
		jscrollPanee_mailConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtone_mailConsultorBusqueda= new JButtonMe();
		this.jButtone_mailConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mailConsultorBusqueda.setText("U");
		this.jButtone_mailConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mailConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mailConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreae_mailConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreae_mailConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mailConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mailConsultorBusqueda.setVisible(false);		}


					
		this.jLabeldireccionConsultor = new JLabelMe();
		this.jLabeldireccionConsultor.setText(""+ConsultorConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionConsultor.setToolTipText("Direccion");
		this.jLabeldireccionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPaneldireccionConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreadireccionConsultor= new JTextAreaMe();
		jTextAreadireccionConsultor.setEnabled(false);
		jTextAreadireccionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionConsultor.setLineWrap(true);
		jTextAreadireccionConsultor.setWrapStyleWord(true);
		jTextAreadireccionConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionConsultor.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionConsultor = new JScrollPane(jTextAreadireccionConsultor);
		jscrollPanedireccionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedireccionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondireccionConsultorBusqueda= new JButtonMe();
		this.jButtondireccionConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionConsultorBusqueda.setText("U");
		this.jButtondireccionConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionConsultorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionConsultor = new JLabelMe();
		this.jLabeldescripcionConsultor.setText(""+ConsultorConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionConsultor.setToolTipText("Descripcion");
		this.jLabeldescripcionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPaneldescripcionConsultor.setLayout(this.gridaBagLayoutConsultor);


		jTextAreadescripcionConsultor= new JTextAreaMe();
		jTextAreadescripcionConsultor.setEnabled(false);
		jTextAreadescripcionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionConsultor.setLineWrap(true);
		jTextAreadescripcionConsultor.setWrapStyleWord(true);
		jTextAreadescripcionConsultor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionConsultor.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionConsultor = new JScrollPane(jTextAreadescripcionConsultor);
		jscrollPanedescripcionConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionConsultorBusqueda= new JButtonMe();
		this.jButtondescripcionConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionConsultorBusqueda.setText("U");
		this.jButtondescripcionConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionConsultorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsultor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsultor = new JLabelMe();
		this.jLabelid_empresaConsultor.setText(""+ConsultorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsultor.setToolTipText("Empresa");
		this.jLabelid_empresaConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsultor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsultor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsultor.setToolTipText(ConsultorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsultor = new GridBagLayout();
		this.jPanelid_empresaConsultor.setLayout(this.gridaBagLayoutConsultor);


		jComboBoxid_empresaConsultor= new JComboBoxMe();
		jComboBoxid_empresaConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsultor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsultor.setEnabled(false);

		this.jButtonid_empresaConsultor= new JButtonMe();
		this.jButtonid_empresaConsultor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsultor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsultor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsultor.setText("Buscar");
		this.jButtonid_empresaConsultor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsultor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsultor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsultor"));

		this.jButtonid_empresaConsultorBusqueda= new JButtonMe();
		this.jButtonid_empresaConsultorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsultorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsultorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsultorBusqueda.setText("U");
		this.jButtonid_empresaConsultorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsultorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsultorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsultorBusqueda"));

		if(this.consultorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsultorBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsultorUpdate= new JButtonMe();
		this.jButtonid_empresaConsultorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsultorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsultorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsultorUpdate.setText("U");
		this.jButtonid_empresaConsultorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsultorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsultorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsultor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsultor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsultorUpdate"));



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
		//this.jInternalFrameDetalleConsultor = new ConsultorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consultor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsultor= new GridBagLayout();
		

		
		String sToolTipConsultor="";
		sToolTipConsultor=ConsultorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsultor+="(Facturacion.Consultor)";
		}
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsultor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsultor = new JButtonMe();
		this.jButtonModificarConsultor = new JButtonMe();
        this.jButtonActualizarConsultor = new JButtonMe();
        this.jButtonEliminarConsultor = new JButtonMe();
        this.jButtonCancelarConsultor = new JButtonMe();
        this.jButtonGuardarCambiosConsultor = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsultor = new JButtonMe();
		this.jButtonCerrarConsultor = new JButtonMe();
		
		this.jScrollPanelDatosConsultor = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsultor = new JScrollPane();
		this.jScrollPanelDatosGeneralConsultor = new JScrollPane();
				
		
		
		this.jPanelCamposConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Consultor";
		
		if(!this.consultorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consultores" + this.sPath));
		} else {
			this.jScrollPanelDatosConsultor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConsultor.setName("jPanelCamposConsultor"); 

		this.jPanelCamposOcultosConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsultor.setName("jPanelCamposOcultosConsultor"); 

        this.jPanelAccionesConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsultor.setToolTipText("Acciones");
        this.jPanelAccionesConsultor.setName("Acciones"); 

		this.jPanelAccionesFormularioConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsultor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsultor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsultor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsultor.setText("Nuevo");
		this.jButtonModificarConsultor.setText("Editar");
        this.jButtonActualizarConsultor.setText("Actualizar");
        this.jButtonEliminarConsultor.setText("Eliminar");
        this.jButtonCancelarConsultor.setText("Cancelar");
        this.jButtonGuardarCambiosConsultor.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsultor.setText("Guardar");
		this.jButtonCerrarConsultor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsultor,"nuevo_button","Nuevo",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsultor,"modificar_button","Editar",this.consultorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsultor,"actualizar_button","Actualizar",this.consultorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsultor,"eliminar_button","Eliminar",this.consultorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsultor,"cancelar_button","Cancelar",this.consultorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsultor,"guardarcambios_button","Guardar",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsultor,"guardarcambiostabla_button","Guardar",this.consultorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsultor,"cerrar_button","Salir",this.consultorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsultor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsultor.setToolTipText("Nuevo"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsultor.setToolTipText("Editar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsultor.setToolTipText("Actualizar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsultor.setToolTipText("Eliminar)"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsultor.setToolTipText("Cancelar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsultor.setToolTipText("Guardar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsultor.setToolTipText("Guardar"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsultor.setToolTipText("Salir"+" "+ConsultorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsultor";
		inputMap = this.jButtonNuevoConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsultor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsultor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsultor";
		inputMap = this.jButtonActualizarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsultor"));
		
		//ELIMINAR
		sMapKey = "EliminarConsultor";
		inputMap = this.jButtonEliminarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsultor"));
		
		//CANCELAR	
		sMapKey = "CancelarConsultor";
		inputMap = this.jButtonCancelarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsultor"));
		
		//CERRAR		
		sMapKey = "CerrarConsultor";
		inputMap = this.jButtonCerrarConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsultor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsultor";
		inputMap = this.jButtonGuardarCambiosTablaConsultor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsultor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsultor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsultor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsultor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsultor.setToolTipText("Nuevo Consultor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsultor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsultor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsultor.setToolTipText("Sin Cerrar Ventana Consultor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsultor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsultor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsultor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsultor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsultor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsultor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsultor.setText("Accion");
		this.jComboBoxTiposAccionesConsultor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsultor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsultor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsultor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsultor = new JLabelMe();
		
		this.jLabelAccionesConsultor.setText("Acciones");		
		this.jLabelAccionesConsultor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsultor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsultor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsultor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsultor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsultor=new JTabbedPane();
		this.jTabbedPaneRelacionesConsultor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsultor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsultor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsultor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsultor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsultor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsultor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsultor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsultor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsultor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsultor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsultor = new GridBagLayout();
		
		this.jPanelCamposConsultor.setLayout(gridaBagLayoutCamposConsultor);
		this.jPanelCamposOcultosConsultor.setLayout(gridaBagLayoutCamposOcultosConsultor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsultor.add(jLabelIdConsultor, this.gridBagConstraintsConsultor);



	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsultor.add(jLabelidConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsultor.add(jLabelid_empresaConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsultor.add(jButtonid_empresaConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 3;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsultor.add(jButtonid_empresaConsultorUpdate, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsultor.add(jComboBoxid_empresaConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionConsultor.add(jLabelidentificacionConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionConsultor.add(jButtonidentificacionConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionConsultor.add(jTextFieldidentificacionConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoConsultor.add(jLabelapellidoConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoConsultor.add(jButtonapellidoConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoConsultor.add(jscrollPaneapellidoConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConsultor.add(jLabelnombreConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConsultor.add(jButtonnombreConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConsultor.add(jscrollPanenombreConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoConsultor.add(jLabelnombre_completoConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoConsultor.add(jButtonnombre_completoConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoConsultor.add(jscrollPanenombre_completoConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoConsultor.add(jLabeltelefonoConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoConsultor.add(jButtontelefonoConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoConsultor.add(jscrollPanetelefonoConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mailConsultor.add(jLabele_mailConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mailConsultor.add(jButtone_mailConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mailConsultor.add(jscrollPanee_mailConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionConsultor.add(jLabeldireccionConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionConsultor.add(jButtondireccionConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionConsultor.add(jscrollPanedireccionConsultor, this.gridBagConstraintsConsultor);


	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 0;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionConsultor.add(jLabeldescripcionConsultor, this.gridBagConstraintsConsultor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		//this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = 2;
		this.gridBagConstraintsConsultor.ipadx = 0;
		this.gridBagConstraintsConsultor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionConsultor.add(jButtondescripcionConsultorBusqueda, this.gridBagConstraintsConsultor);
	}

	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsultor.gridy = 0;
	this.gridBagConstraintsConsultor.gridx = 1;
	this.gridBagConstraintsConsultor.ipadx = 0;
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionConsultor.add(jscrollPanedescripcionConsultor, this.gridBagConstraintsConsultor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPanelidConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPanelidentificacionConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPanelapellidoConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPanelnombreConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPanelnombre_completoConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPaneltelefonoConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPanele_mailConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPaneldireccionConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsultor.add(this.jPaneldescripcionConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposConsultor % 2==0) {
		iXPanelCamposConsultor=0;
		iYPanelCamposConsultor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsultor = new GridBagConstraints();
	this.gridBagConstraintsConsultor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsultor.gridy = iYPanelCamposOcultosConsultor;
	this.gridBagConstraintsConsultor.gridx = iXPanelCamposOcultosConsultor++;
	this.gridBagConstraintsConsultor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsultor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsultor.add(this.jPanelid_empresaConsultor, this.gridBagConstraintsConsultor);



	if(iXPanelCamposOcultosConsultor % 2==0) {
		iXPanelCamposOcultosConsultor=0;
		iYPanelCamposOcultosConsultor++;
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
			
		GridBagLayout gridaBagLayoutAccionesConsultor= new GridBagLayout();
		this.jPanelAccionesConsultor.setLayout(gridaBagLayoutAccionesConsultor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsultor= new GridBagLayout();
		this.jPanelAccionesFormularioConsultor.setLayout(gridaBagLayoutAccionesFormularioConsultor);
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsultor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsultor.add(this.jComboBoxTiposAccionesFormularioConsultor, this.gridBagConstraintsConsultor);

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsultor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsultor.add(this.jCheckBoxPostAccionNuevoConsultor, this.gridBagConstraintsConsultor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.consultorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConsultor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConsultor.add(this.jCheckBoxPostAccionSinCerrarConsultor, this.gridBagConstraintsConsultor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.consultorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.consultorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConsultor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConsultor.add(this.jCheckBoxPostAccionSinMensajeConsultor, this.gridBagConstraintsConsultor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsultor.add(this.jButtonModificarConsultor, this.gridBagConstraintsConsultor);							

		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsultor.gridy = 0;
		this.gridBagConstraintsConsultor.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsultor.add(this.jButtonEliminarConsultor, this.gridBagConstraintsConsultor);
		
			
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = 0;		
		this.gridBagConstraintsConsultor.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsultor.add(this.jButtonActualizarConsultor, this.gridBagConstraintsConsultor);


		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = 0;		
		this.gridBagConstraintsConsultor.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsultor.add(this.jButtonGuardarCambiosConsultor, this.gridBagConstraintsConsultor);	
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = 0;		
		this.gridBagConstraintsConsultor.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsultor.add(this.jButtonCancelarConsultor, this.gridBagConstraintsConsultor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsultor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsultor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consultorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsultor = new GridBagConstraints();						
			this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsultor.gridx = 0;		
			//this.gridBagConstraintsConsultor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsultor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsultor.gridx =0;
		this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsultor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsultor, this.gridBagConstraintsConsultor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsultorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsultor = new ConsultorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consultor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consultor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consultor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsultorModel consultorModel=new ConsultorModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsultorModel.ConsultorFocusTraversalPolicy consultorFocusTraversalPolicy = consultorModel.new ConsultorFocusTraversalPolicy(this);
			
			//consultorFocusTraversalPolicy.setconsultorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consultorModel);
			
			
			this.jContentPaneDetalleConsultor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsultor = new GridBagLayout();	
			this.jContentPaneDetalleConsultor.setLayout(gridaBagLayoutDetalleConsultor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsultor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsultor = new GridBagConstraints();
				this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsultor.gridx = 0;
					
				
				this.jContentPaneDetalleConsultor.add(jTtoolBarDetalleConsultor, gridBagConstraintsConsultor);								
				
}
			
			this.jScrollPanelDatosEdicionConsultor=   new JScrollPane(jContentPaneDetalleConsultor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsultor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsultor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsultor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsultor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsultor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsultor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsultor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsultor.gridx = 0;
	        
			this.jContentPaneDetalleConsultor.add(jPanelCamposConsultor, gridBagConstraintsConsultor);
			
			
			
			
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
						&& consultorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(this.puedeCargarPorParteGuiaRemision,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedido(this.puedeCargarPorPartePedido,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					
					if(this.consultorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsultor= new GridBagConstraints();
						this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsultor.gridx = 0;
						this.jContentPaneDetalleConsultor.add(this.jTabbedPaneRelacionesConsultor, this.gridBagConstraintsConsultor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsultor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameGuiaRemision(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedido(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsultor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsultor = new GridBagConstraints();
					this.gridBagConstraintsConsultor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsultor.gridx = 0;
					
				
					this.jContentPaneDetalleConsultor.add(jPanelCamposOcultosConsultor, gridBagConstraintsConsultor);
				
					this.jPanelCamposOcultosConsultor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsConsultor.gridx = 0;
	        this.gridBagConstraintsConsultor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsultor.add(this.jPanelAccionesFormularioConsultor, this.gridBagConstraintsConsultor);							
			
			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
	        this.gridBagConstraintsConsultor.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsConsultor.gridx = 0;
	        
			
			this.jContentPaneDetalleConsultor.add(this.jPanelAccionesConsultor, this.gridBagConstraintsConsultor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsultor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsultor=   new JScrollPane(this.jPanelCamposConsultor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsultor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsultor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsultor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsultor.gridx = 0;
			this.gridBagConstraintsConsultor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsultor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsultor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsultor, this.gridBagConstraintsConsultor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsultor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsultor, this.gridBagConstraintsConsultor);			
			
			this.gridBagConstraintsConsultor = new GridBagConstraints();
			this.gridBagConstraintsConsultor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsultor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsultor, this.gridBagConstraintsConsultor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsultor, this.gridBagConstraintsConsultor);
			
			
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsultor, this.gridBagConstraintsConsultor);
		
			
		this.gridBagConstraintsConsultor = new GridBagConstraints();
		this.gridBagConstraintsConsultor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsultor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsultor, this.gridBagConstraintsConsultor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsultor;//jContentPane;
		
		return jScrollPanelDatosEdicionConsultor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameGuiaRemision(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		this.guiaremisionSessionBean.setConGuardarRelaciones(true);
		this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

		this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.guiaremisionBeanSwingJInternalFramePopup=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.guiaremisionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {

				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;
				GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.guiaremisionSessionBean.setEsGuardarRelacionado(true);

				this.guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.guiaremisionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.guiaremisionBeanSwingJInternalFrame.setguiaremisionSessionBean(this.guiaremisionSessionBean);

				//this.gridBagConstraintsConsultor = new GridBagConstraints();
				//this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsultor.gridx = 0;
				//this.jContentPaneDetalleConsultor.add(this.guiaremisionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsultor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsultor.add("Guia Remisiones",this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsultor.setComponentAt(iIndexTab,this.guiaremisionBeanSwingJInternalFrame.getContentPane());
				}

				//GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.guiaremisionSessionBean.setEsGuardarRelacionado(false);
				this.guiaremisionBeanSwingJInternalFrame=null;//new GuiaRemisionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGuiaRemision) {
					this.jTabbedPaneRelacionesConsultor.add("Guia Remisiones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedido(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoSessionBean=new PedidoSessionBean();
		this.pedidoSessionBean.setConGuardarRelaciones(true);
		this.pedidoSessionBean.setEsGuardarRelacionado(true);

		this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoBeanSwingJInternalFramePopup=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {

				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoSessionBean.setEsGuardarRelacionado(true);

				this.pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoBeanSwingJInternalFrame.setpedidoSessionBean(this.pedidoSessionBean);

				//this.gridBagConstraintsConsultor = new GridBagConstraints();
				//this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsultor.gridx = 0;
				//this.jContentPaneDetalleConsultor.add(this.pedidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsultor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsultor.add("Pedidos",this.pedidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsultor.setComponentAt(iIndexTab,this.pedidoBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoSessionBean.setEsGuardarRelacionado(false);
				this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedido) {
					this.jTabbedPaneRelacionesConsultor.add("Pedidos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		this.pedidoexporSessionBean.setConGuardarRelaciones(true);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsultorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsConsultor = new GridBagConstraints();
				//this.gridBagConstraintsConsultor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsultor.gridx = 0;
				//this.jContentPaneDetalleConsultor.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsultor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsultor.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsultor.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesConsultor.add("Pedido Exportacions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarGuiaRemisionBeanSwingJInternalFrame(List<Consultor> consultors,Consultor consultor,GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//guiaremisionBeanSwingJInternalFrame=new GuiaRemisionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					guiaremisionBeanSwingJInternalFrame.getGuiaRemisionLogic().setConnexion(this.consultorLogic.getConnexion());

					guiaremisionBeanSwingJInternalFrame.setconsultorsForeignKey(consultors);
					guiaremisionBeanSwingJInternalFrame.setconsultorForeignKey(consultor);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setisBusquedaDesdeForeignKeySesionConsultor(true);
					guiaremisionBeanSwingJInternalFrame.guiaremisionSessionBean.setlidConsultorActual(consultor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					guiaremisionBeanSwingJInternalFrame.cargarCombosForeignKeyGuiaRemision(guiaremisionBeanSwingJInternalFrame.isCargarCombosDependencia);
					guiaremisionBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsultor(true);
					guiaremisionBeanSwingJInternalFrame.setid_consultorFK_IdConsultor(consultor.getId());

					if(!this.conCargarFormDetalle) {
						guiaremisionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					guiaremisionBeanSwingJInternalFrame.setSelectedItemCombosFrameConsultorForeignKey(consultor,1,false,true,true);
					guiaremisionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					guiaremisionBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsultor");
					guiaremisionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsultor");
					guiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaGuiaRemision(true);
					guiaremisionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGuiaRemision("n",guiaremisionBeanSwingJInternalFrame.isGuardarCambiosEnLote, guiaremisionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					guiaremisionBeanSwingJInternalFrame.setAutoscrolls(true);
					guiaremisionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("relacionado");
					} else {
						guiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsGuiaRemision("no_relacionado");
					}

					guiaremisionBeanSwingJInternalFrame.getjButtonRecargarInformacionGuiaRemision().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoExporBeanSwingJInternalFrame(List<Consultor> consultors,Consultor consultor,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.consultorLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.setconsultorsForeignKey(consultors);
					pedidoexporBeanSwingJInternalFrame.setconsultorForeignKey(consultor);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionConsultor(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidConsultorActual(consultor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsultor(true);
					pedidoexporBeanSwingJInternalFrame.setid_consultorFK_IdConsultor(consultor.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameConsultorForeignKey(consultor,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsultor");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsultor");
					pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoExpor("n",pedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("relacionado");
					} else {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");
					}

					pedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoExpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoBeanSwingJInternalFrame(List<Consultor> consultors,Consultor consultor,PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoBeanSwingJInternalFrame.getPedidoLogic().setConnexion(this.consultorLogic.getConnexion());

					pedidoBeanSwingJInternalFrame.setconsultorsForeignKey(consultors);
					pedidoBeanSwingJInternalFrame.setconsultorForeignKey(consultor);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionConsultor(true);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setlidConsultorActual(consultor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoBeanSwingJInternalFrame.cargarCombosForeignKeyPedido(pedidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsultor(true);
					pedidoBeanSwingJInternalFrame.setid_consultorFK_IdConsultor(consultor.getId());

					if(!this.conCargarFormDetalle) {
						pedidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoBeanSwingJInternalFrame.setSelectedItemCombosFrameConsultorForeignKey(consultor,1,false,true,true);
					pedidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsultor");
					pedidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsultor");
					pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(true);
					pedidoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedido("n",pedidoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("relacionado");
					} else {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("no_relacionado");
					}

					pedidoBeanSwingJInternalFrame.getjButtonRecargarInformacionPedido().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
