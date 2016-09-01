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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.RutaTransporteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class RutaTransporteDetalleFormJInternalFrame extends RutaTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRutaTransporte;
	
	protected JMenuBar jmenuBarDetalleRutaTransporte;
	
	protected JMenu jmenuDetalleRutaTransporte;
	protected JMenu jmenuDetalleArchivoRutaTransporte;
	protected JMenu jmenuDetalleAccionesRutaTransporte;
	protected JMenu jmenuDetalleDatosRutaTransporte;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRutaTransporte;	
	protected GridBagConstraints gridBagConstraintsRutaTransporte;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RutaTransporteBeanSwingJInternalFrameAdditional jInternalFrameDetalleRutaTransporte;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public RutaTransporteSessionBean rutatransporteSessionBean;
	
	

	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;
	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProforma=false;
	public ProformaSessionBean proformaSessionBean;

	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;
	public PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedido=false;
	public PedidoSessionBean pedidoSessionBean;

	public ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=null;
	public ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteServicioTransporte=false;
	public ServicioTransporteSessionBean serviciotransporteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public RutaTransporteLogic rutatransporteLogic;
	
	public JScrollPane jScrollPanelDatosRutaTransporte;
	public JScrollPane jScrollPanelDatosEdicionRutaTransporte;
	public JScrollPane jScrollPanelDatosGeneralRutaTransporte;
	
	protected JPanel jPanelCamposRutaTransporte;    
	protected JPanel jPanelCamposOcultosRutaTransporte;    	
	protected JPanel jPanelAccionesRutaTransporte;
	protected JPanel jPanelAccionesFormularioRutaTransporte;
    
	
	
	protected Integer iXPanelCamposRutaTransporte=0;
	protected Integer iYPanelCamposRutaTransporte=0;
	
	protected Integer iXPanelCamposOcultosRutaTransporte=0;
	protected Integer iYPanelCamposOcultosRutaTransporte=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRutaTransporte;
	public JButton jButtonModificarRutaTransporte;
	public JButton jButtonActualizarRutaTransporte;
    public JButton jButtonEliminarRutaTransporte;
	public JButton jButtonCancelarRutaTransporte;
    public JButton jButtonGuardarCambiosRutaTransporte;
	public JButton jButtonGuardarCambiosTablaRutaTransporte;
	protected JButton jButtonCerrarRutaTransporte;
	
	
	protected JButton jButtonProcesarInformacionRutaTransporte;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRutaTransporte;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRutaTransporte;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRutaTransporte;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRutaTransporte;
	protected JButton jButtonModificarToolBarRutaTransporte;
	protected JButton jButtonActualizarToolBarRutaTransporte;
    protected JButton jButtonEliminarToolBarRutaTransporte;
	protected JButton jButtonCancelarToolBarRutaTransporte;
    protected JButton jButtonGuardarCambiosToolBarRutaTransporte;
	protected JButton jButtonGuardarCambiosTablaToolBarRutaTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarRutaTransporte;
	protected JButton jButtonCerrarToolBarRutaTransporte;
	
	protected JButton jButtonProcesarInformacionToolBarRutaTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRutaTransporte;
	protected JMenuItem jMenuItemModificarRutaTransporte;
	protected JMenuItem jMenuItemActualizarRutaTransporte;
    protected JMenuItem jMenuItemEliminarRutaTransporte;
	protected JMenuItem jMenuItemCancelarRutaTransporte;
    protected JMenuItem jMenuItemGuardarCambiosRutaTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaRutaTransporte;
	protected JMenuItem jMenuItemCerrarRutaTransporte;
	protected JMenuItem jMenuItemDetalleCerrarRutaTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarRutaTransporte;
	
	protected JMenuItem jMenuItemProcesarInformacionRutaTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRutaTransporte;
	protected JMenuItem jMenuItemMostrarOcultarRutaTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRutaTransporte;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRutaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRutaTransporte;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRutaTransporte;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRutaTransporte;
	public JLabel jLabelIdRutaTransporte;
	public JLabel jLabelidRutaTransporte;
	public JButton jButtonidRutaTransporteBusqueda= new JButtonMe();

	public JPanel jPanelnombreRutaTransporte;
	public JLabel jLabelnombreRutaTransporte;
	public JTextArea jTextAreanombreRutaTransporte;
	public JScrollPane jscrollPanenombreRutaTransporte;
	public JButton jButtonnombreRutaTransporteBusqueda= new JButtonMe();

	public JPanel jPanelorigenRutaTransporte;
	public JLabel jLabelorigenRutaTransporte;
	public JTextArea jTextAreaorigenRutaTransporte;
	public JScrollPane jscrollPaneorigenRutaTransporte;
	public JButton jButtonorigenRutaTransporteBusqueda= new JButtonMe();

	public JPanel jPaneldestinoRutaTransporte;
	public JLabel jLabeldestinoRutaTransporte;
	public JTextArea jTextAreadestinoRutaTransporte;
	public JScrollPane jscrollPanedestinoRutaTransporte;
	public JButton jButtondestinoRutaTransporteBusqueda= new JButtonMe();

	public JPanel jPanelprecioRutaTransporte;
	public JLabel jLabelprecioRutaTransporte;
	public JTextField jTextFieldprecioRutaTransporte;
	public JButton jButtonprecioRutaTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRutaTransporte;
	public JLabel jLabelid_empresaRutaTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRutaTransporte;
	public JButton jButtonid_empresaRutaTransporte= new JButtonMe();
	public JButton jButtonid_empresaRutaTransporteUpdate= new JButtonMe();
	public JButton jButtonid_empresaRutaTransporteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRutaTransporte;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RutaTransporteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRutaTransporte=new JPanel();
				this.jPanelAccionesFormularioRutaTransporte=new JPanel();
				this.jmenuBarDetalleRutaTransporte=new JMenuBar();
				this.jTtoolBarDetalleRutaTransporte=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RutaTransporteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RutaTransporteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RutaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRutaTransporte() {
		return this.jButtonActualizarToolBarRutaTransporte;
	}
	
	public JButton getjButtonEliminarToolBarRutaTransporte() {
		return this.jButtonEliminarToolBarRutaTransporte;
	}
	
	public JButton getjButtonCancelarToolBarRutaTransporte() {
		return this.jButtonCancelarToolBarRutaTransporte;
	}		
	
	public JButton getjButtonProcesarInformacionRutaTransporte() {
		return this.jButtonProcesarInformacionRutaTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRutaTransporte)	{
		this.jButtonProcesarInformacionRutaTransporte = jButtonProcesarInformacionRutaTransporte;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRutaTransporte() {
		return this.jComboBoxTiposAccionesRutaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRutaTransporte(
			JComboBox jComboBoxTiposRelacionesRutaTransporte) {
		this.jComboBoxTiposRelacionesRutaTransporte = jComboBoxTiposRelacionesRutaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRutaTransporte(
			JComboBox jComboBoxTiposAccionesRutaTransporte) {
		this.jComboBoxTiposAccionesRutaTransporte = jComboBoxTiposAccionesRutaTransporte;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRutaTransporte() {
		return this.jComboBoxTiposAccionesFormularioRutaTransporte;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRutaTransporte(
			JComboBox jComboBoxTiposAccionesFormularioRutaTransporte) {
		this.jComboBoxTiposAccionesFormularioRutaTransporte = jComboBoxTiposAccionesFormularioRutaTransporte;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rutatransporteSessionBean=new RutaTransporteSessionBean();
		
		this.rutatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rutatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rutatransporteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.proformaSessionBean=new ProformaSessionBean();
		//this.pedidoSessionBean=new PedidoSessionBean();
		//this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RutaTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ruta Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
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
	
		RutaTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRutaTransporte= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRutaTransporte=new JButtonMe();
				this.jButtonModificarToolBarRutaTransporte=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRutaTransporte,this.jTtoolBarDetalleRutaTransporte,
							"actualizar","actualizar","Actualizar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRutaTransporte,this.jTtoolBarDetalleRutaTransporte,
							"eliminar","eliminar","Eliminar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRutaTransporte,this.jTtoolBarDetalleRutaTransporte,
							"cancelar","cancelar","Cancelar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRutaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRutaTransporte,this.jTtoolBarDetalleRutaTransporte,
							"guardarcambios","guardarcambios","Guardar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRutaTransporte=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRutaTransporte=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRutaTransporte=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRutaTransporte=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRutaTransporte=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRutaTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRutaTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRutaTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRutaTransporte= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRutaTransporte.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRutaTransporte,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRutaTransporte= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRutaTransporte.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRutaTransporte,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRutaTransporte= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRutaTransporte.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRutaTransporte,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRutaTransporte= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRutaTransporte.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRutaTransporte,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRutaTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRutaTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRutaTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRutaTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRutaTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRutaTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRutaTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRutaTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRutaTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRutaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRutaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRutaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRutaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRutaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRutaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRutaTransporte.add(this.jMenuItemDetalleCerrarRutaTransporte);
		
		this.jmenuDetalleAccionesRutaTransporte.add(this.jMenuItemActualizarRutaTransporte);
		this.jmenuDetalleAccionesRutaTransporte.add(this.jMenuItemEliminarRutaTransporte);
		this.jmenuDetalleAccionesRutaTransporte.add(this.jMenuItemCancelarRutaTransporte);		
		
		//this.jmenuDetalleDatosRutaTransporte.add(this.jMenuItemDetalleAbrirOrderByRutaTransporte);				
		this.jmenuDetalleDatosRutaTransporte.add(this.jMenuItemDetalleMostarOcultarRutaTransporte);				
				
		//this.jmenuDetalleAccionesRutaTransporte.add(this.jMenuItemGuardarCambiosRutaTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRutaTransporte.add(this.jmenuDetalleArchivoRutaTransporte);		
		this.jmenuBarDetalleRutaTransporte.add(this.jmenuDetalleAccionesRutaTransporte);		
		this.jmenuBarDetalleRutaTransporte.add(this.jmenuDetalleDatosRutaTransporte);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRutaTransporte.add(this.jmenuDetalleRutaTransporte);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRutaTransporte);				
	}
	
	
	public void inicializarElementosCamposRutaTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRutaTransporte = new JLabelMe();
		jLabelIdRutaTransporte.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRutaTransporte = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRutaTransporte.setToolTipText(RutaTransporteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRutaTransporte= new GridBagLayout();

		this.jPanelidRutaTransporte.setLayout(this.gridaBagLayoutRutaTransporte);

		jLabelidRutaTransporte = new JLabel();
		jLabelidRutaTransporte.setText("Id");

		jLabelidRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreRutaTransporte = new JLabelMe();
		this.jLabelnombreRutaTransporte.setText(""+RutaTransporteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreRutaTransporte.setToolTipText("Nombre");
		this.jLabelnombreRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreRutaTransporte.setToolTipText(RutaTransporteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutRutaTransporte = new GridBagLayout();
		this.jPanelnombreRutaTransporte.setLayout(this.gridaBagLayoutRutaTransporte);


		jTextAreanombreRutaTransporte= new JTextAreaMe();
		jTextAreanombreRutaTransporte.setEnabled(false);
		jTextAreanombreRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRutaTransporte.setLineWrap(true);
		jTextAreanombreRutaTransporte.setWrapStyleWord(true);
		jTextAreanombreRutaTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreRutaTransporte.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreRutaTransporte = new JScrollPane(jTextAreanombreRutaTransporte);
		jscrollPanenombreRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreRutaTransporteBusqueda= new JButtonMe();
		this.jButtonnombreRutaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRutaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRutaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreRutaTransporteBusqueda.setText("U");
		this.jButtonnombreRutaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreRutaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreRutaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreRutaTransporteBusqueda"));

		if(this.rutatransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreRutaTransporteBusqueda.setVisible(false);		}


					
		this.jLabelorigenRutaTransporte = new JLabelMe();
		this.jLabelorigenRutaTransporte.setText(""+RutaTransporteConstantesFunciones.LABEL_ORIGEN+" : *");
		this.jLabelorigenRutaTransporte.setToolTipText("Origen");
		this.jLabelorigenRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorigenRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorigenRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorigenRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorigenRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorigenRutaTransporte.setToolTipText(RutaTransporteConstantesFunciones.LABEL_ORIGEN);
		this.gridaBagLayoutRutaTransporte = new GridBagLayout();
		this.jPanelorigenRutaTransporte.setLayout(this.gridaBagLayoutRutaTransporte);


		jTextAreaorigenRutaTransporte= new JTextAreaMe();
		jTextAreaorigenRutaTransporte.setEnabled(false);
		jTextAreaorigenRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaorigenRutaTransporte.setLineWrap(true);
		jTextAreaorigenRutaTransporte.setWrapStyleWord(true);
		jTextAreaorigenRutaTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaorigenRutaTransporte.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaorigenRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneorigenRutaTransporte = new JScrollPane(jTextAreaorigenRutaTransporte);
		jscrollPaneorigenRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneorigenRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneorigenRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonorigenRutaTransporteBusqueda= new JButtonMe();
		this.jButtonorigenRutaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenRutaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorigenRutaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorigenRutaTransporteBusqueda.setText("U");
		this.jButtonorigenRutaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorigenRutaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorigenRutaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaorigenRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaorigenRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"origenRutaTransporteBusqueda"));

		if(this.rutatransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorigenRutaTransporteBusqueda.setVisible(false);		}


					
		this.jLabeldestinoRutaTransporte = new JLabelMe();
		this.jLabeldestinoRutaTransporte.setText(""+RutaTransporteConstantesFunciones.LABEL_DESTINO+" : *");
		this.jLabeldestinoRutaTransporte.setToolTipText("Destino");
		this.jLabeldestinoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldestinoRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldestinoRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldestinoRutaTransporte.setToolTipText(RutaTransporteConstantesFunciones.LABEL_DESTINO);
		this.gridaBagLayoutRutaTransporte = new GridBagLayout();
		this.jPaneldestinoRutaTransporte.setLayout(this.gridaBagLayoutRutaTransporte);


		jTextAreadestinoRutaTransporte= new JTextAreaMe();
		jTextAreadestinoRutaTransporte.setEnabled(false);
		jTextAreadestinoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoRutaTransporte.setLineWrap(true);
		jTextAreadestinoRutaTransporte.setWrapStyleWord(true);
		jTextAreadestinoRutaTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadestinoRutaTransporte.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadestinoRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedestinoRutaTransporte = new JScrollPane(jTextAreadestinoRutaTransporte);
		jscrollPanedestinoRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondestinoRutaTransporteBusqueda= new JButtonMe();
		this.jButtondestinoRutaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoRutaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoRutaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondestinoRutaTransporteBusqueda.setText("U");
		this.jButtondestinoRutaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondestinoRutaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondestinoRutaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadestinoRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadestinoRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"destinoRutaTransporteBusqueda"));

		if(this.rutatransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondestinoRutaTransporteBusqueda.setVisible(false);		}


					
		this.jLabelprecioRutaTransporte = new JLabelMe();
		this.jLabelprecioRutaTransporte.setText(""+RutaTransporteConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioRutaTransporte.setToolTipText("Precio");
		this.jLabelprecioRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioRutaTransporte.setToolTipText(RutaTransporteConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutRutaTransporte = new GridBagLayout();
		this.jPanelprecioRutaTransporte.setLayout(this.gridaBagLayoutRutaTransporte);


		jTextFieldprecioRutaTransporte= new JTextFieldMe();
		jTextFieldprecioRutaTransporte.setEnabled(false);
		jTextFieldprecioRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioRutaTransporte.setText("0.0");

		this.jButtonprecioRutaTransporteBusqueda= new JButtonMe();
		this.jButtonprecioRutaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioRutaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioRutaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioRutaTransporteBusqueda.setText("U");
		this.jButtonprecioRutaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioRutaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioRutaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioRutaTransporteBusqueda"));

		if(this.rutatransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioRutaTransporteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRutaTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRutaTransporte = new JLabelMe();
		this.jLabelid_empresaRutaTransporte.setText(""+RutaTransporteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRutaTransporte.setToolTipText("Empresa");
		this.jLabelid_empresaRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRutaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRutaTransporte.setToolTipText(RutaTransporteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRutaTransporte = new GridBagLayout();
		this.jPanelid_empresaRutaTransporte.setLayout(this.gridaBagLayoutRutaTransporte);


		jComboBoxid_empresaRutaTransporte= new JComboBoxMe();
		jComboBoxid_empresaRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRutaTransporte.setEnabled(false);

		this.jButtonid_empresaRutaTransporte= new JButtonMe();
		this.jButtonid_empresaRutaTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRutaTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRutaTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRutaTransporte.setText("Buscar");
		this.jButtonid_empresaRutaTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRutaTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRutaTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRutaTransporte"));

		this.jButtonid_empresaRutaTransporteBusqueda= new JButtonMe();
		this.jButtonid_empresaRutaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRutaTransporteBusqueda.setText("U");
		this.jButtonid_empresaRutaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRutaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRutaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRutaTransporteBusqueda"));

		if(this.rutatransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRutaTransporteBusqueda.setVisible(false);		}

		this.jButtonid_empresaRutaTransporteUpdate= new JButtonMe();
		this.jButtonid_empresaRutaTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRutaTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRutaTransporteUpdate.setText("U");
		this.jButtonid_empresaRutaTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRutaTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRutaTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRutaTransporteUpdate"));



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
		//this.jInternalFrameDetalleRutaTransporte = new RutaTransporteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ruta Transporte DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRutaTransporte= new GridBagLayout();
		

		
		String sToolTipRutaTransporte="";
		sToolTipRutaTransporte=RutaTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRutaTransporte+="(Cartera.RutaTransporte)";
		}
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipRutaTransporte+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRutaTransporte = new JButtonMe();
		this.jButtonModificarRutaTransporte = new JButtonMe();
        this.jButtonActualizarRutaTransporte = new JButtonMe();
        this.jButtonEliminarRutaTransporte = new JButtonMe();
        this.jButtonCancelarRutaTransporte = new JButtonMe();
        this.jButtonGuardarCambiosRutaTransporte = new JButtonMe();
		this.jButtonGuardarCambiosTablaRutaTransporte = new JButtonMe();
		this.jButtonCerrarRutaTransporte = new JButtonMe();
		
		this.jScrollPanelDatosRutaTransporte = new JScrollPane();   
        this.jScrollPanelDatosEdicionRutaTransporte = new JScrollPane();
		this.jScrollPanelDatosGeneralRutaTransporte = new JScrollPane();
				
		
		
		this.jPanelCamposRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ruta Transporte";
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ruta Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosRutaTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRutaTransporte.setName("jPanelCamposRutaTransporte"); 

		this.jPanelCamposOcultosRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRutaTransporte.setName("jPanelCamposOcultosRutaTransporte"); 

        this.jPanelAccionesRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRutaTransporte.setToolTipText("Acciones");
        this.jPanelAccionesRutaTransporte.setName("Acciones"); 

		this.jPanelAccionesFormularioRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRutaTransporte.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRutaTransporte.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRutaTransporte.setText("Nuevo");
		this.jButtonModificarRutaTransporte.setText("Editar");
        this.jButtonActualizarRutaTransporte.setText("Actualizar");
        this.jButtonEliminarRutaTransporte.setText("Eliminar");
        this.jButtonCancelarRutaTransporte.setText("Cancelar");
        this.jButtonGuardarCambiosRutaTransporte.setText("Guardar");
		this.jButtonGuardarCambiosTablaRutaTransporte.setText("Guardar");
		this.jButtonCerrarRutaTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRutaTransporte,"nuevo_button","Nuevo",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRutaTransporte,"modificar_button","Editar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRutaTransporte,"actualizar_button","Actualizar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRutaTransporte,"eliminar_button","Eliminar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRutaTransporte,"cancelar_button","Cancelar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRutaTransporte,"guardarcambios_button","Guardar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRutaTransporte,"guardarcambiostabla_button","Guardar",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRutaTransporte,"cerrar_button","Salir",this.rutatransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRutaTransporte.setToolTipText("Nuevo"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRutaTransporte.setToolTipText("Editar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRutaTransporte.setToolTipText("Actualizar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRutaTransporte.setToolTipText("Eliminar)"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRutaTransporte.setToolTipText("Cancelar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRutaTransporte.setToolTipText("Guardar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRutaTransporte.setToolTipText("Guardar"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRutaTransporte.setToolTipText("Salir"+" "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRutaTransporte";
		inputMap = this.jButtonNuevoRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRutaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRutaTransporte"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRutaTransporte";
		inputMap = this.jButtonActualizarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRutaTransporte"));
		
		//ELIMINAR
		sMapKey = "EliminarRutaTransporte";
		inputMap = this.jButtonEliminarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRutaTransporte"));
		
		//CANCELAR	
		sMapKey = "CancelarRutaTransporte";
		inputMap = this.jButtonCancelarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRutaTransporte"));
		
		//CERRAR		
		sMapKey = "CerrarRutaTransporte";
		inputMap = this.jButtonCerrarRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRutaTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRutaTransporte";
		inputMap = this.jButtonGuardarCambiosTablaRutaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRutaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRutaTransporte"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRutaTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRutaTransporte.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRutaTransporte.setToolTipText("Nuevo RutaTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRutaTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRutaTransporte.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRutaTransporte.setToolTipText("Sin Cerrar Ventana RutaTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRutaTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRutaTransporte.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRutaTransporte.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRutaTransporte.setText("Accion");
		this.jComboBoxTiposAccionesRutaTransporte.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRutaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRutaTransporte.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRutaTransporte.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRutaTransporte = new JLabelMe();
		
		this.jLabelAccionesRutaTransporte.setText("Acciones");		
		this.jLabelAccionesRutaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRutaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRutaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRutaTransporte();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRutaTransporte();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRutaTransporte=new JTabbedPane();
		this.jTabbedPaneRelacionesRutaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRutaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRutaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRutaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRutaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRutaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRutaTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRutaTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRutaTransporte.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRutaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRutaTransporte = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRutaTransporte = new GridBagLayout();
		
		this.jPanelCamposRutaTransporte.setLayout(gridaBagLayoutCamposRutaTransporte);
		this.jPanelCamposOcultosRutaTransporte.setLayout(gridaBagLayoutCamposOcultosRutaTransporte);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 0;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRutaTransporte.add(jLabelIdRutaTransporte, this.gridBagConstraintsRutaTransporte);



	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 1;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRutaTransporte.add(jLabelidRutaTransporte, this.gridBagConstraintsRutaTransporte);


	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 0;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRutaTransporte.add(jLabelid_empresaRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 2;
		this.gridBagConstraintsRutaTransporte.ipadx = 0;
		this.gridBagConstraintsRutaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRutaTransporte.add(jButtonid_empresaRutaTransporteBusqueda, this.gridBagConstraintsRutaTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 3;
		this.gridBagConstraintsRutaTransporte.ipadx = 0;
		this.gridBagConstraintsRutaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRutaTransporte.add(jButtonid_empresaRutaTransporteUpdate, this.gridBagConstraintsRutaTransporte);
	}

	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 1;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRutaTransporte.add(jComboBoxid_empresaRutaTransporte, this.gridBagConstraintsRutaTransporte);


	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 0;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreRutaTransporte.add(jLabelnombreRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 2;
		this.gridBagConstraintsRutaTransporte.ipadx = 0;
		this.gridBagConstraintsRutaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreRutaTransporte.add(jButtonnombreRutaTransporteBusqueda, this.gridBagConstraintsRutaTransporte);
	}

	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 1;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreRutaTransporte.add(jscrollPanenombreRutaTransporte, this.gridBagConstraintsRutaTransporte);


	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 0;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorigenRutaTransporte.add(jLabelorigenRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 2;
		this.gridBagConstraintsRutaTransporte.ipadx = 0;
		this.gridBagConstraintsRutaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelorigenRutaTransporte.add(jButtonorigenRutaTransporteBusqueda, this.gridBagConstraintsRutaTransporte);
	}

	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 1;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorigenRutaTransporte.add(jscrollPaneorigenRutaTransporte, this.gridBagConstraintsRutaTransporte);


	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 0;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldestinoRutaTransporte.add(jLabeldestinoRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 2;
		this.gridBagConstraintsRutaTransporte.ipadx = 0;
		this.gridBagConstraintsRutaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPaneldestinoRutaTransporte.add(jButtondestinoRutaTransporteBusqueda, this.gridBagConstraintsRutaTransporte);
	}

	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 1;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldestinoRutaTransporte.add(jscrollPanedestinoRutaTransporte, this.gridBagConstraintsRutaTransporte);


	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 0;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioRutaTransporte.add(jLabelprecioRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = 2;
		this.gridBagConstraintsRutaTransporte.ipadx = 0;
		this.gridBagConstraintsRutaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioRutaTransporte.add(jButtonprecioRutaTransporteBusqueda, this.gridBagConstraintsRutaTransporte);
	}

	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRutaTransporte.gridy = 0;
	this.gridBagConstraintsRutaTransporte.gridx = 1;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioRutaTransporte.add(jTextFieldprecioRutaTransporte, this.gridBagConstraintsRutaTransporte);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRutaTransporte.gridy = iYPanelCamposRutaTransporte;
	this.gridBagConstraintsRutaTransporte.gridx = iXPanelCamposRutaTransporte++;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRutaTransporte.add(this.jPanelidRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(iXPanelCamposRutaTransporte % 1==0) {
		iXPanelCamposRutaTransporte=0;
		iYPanelCamposRutaTransporte++;
	}
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRutaTransporte.gridy = iYPanelCamposRutaTransporte;
	this.gridBagConstraintsRutaTransporte.gridx = iXPanelCamposRutaTransporte++;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRutaTransporte.add(this.jPanelnombreRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(iXPanelCamposRutaTransporte % 1==0) {
		iXPanelCamposRutaTransporte=0;
		iYPanelCamposRutaTransporte++;
	}
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRutaTransporte.gridy = iYPanelCamposRutaTransporte;
	this.gridBagConstraintsRutaTransporte.gridx = iXPanelCamposRutaTransporte++;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRutaTransporte.add(this.jPanelorigenRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(iXPanelCamposRutaTransporte % 1==0) {
		iXPanelCamposRutaTransporte=0;
		iYPanelCamposRutaTransporte++;
	}
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRutaTransporte.gridy = iYPanelCamposRutaTransporte;
	this.gridBagConstraintsRutaTransporte.gridx = iXPanelCamposRutaTransporte++;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRutaTransporte.add(this.jPaneldestinoRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(iXPanelCamposRutaTransporte % 1==0) {
		iXPanelCamposRutaTransporte=0;
		iYPanelCamposRutaTransporte++;
	}
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRutaTransporte.gridy = iYPanelCamposRutaTransporte;
	this.gridBagConstraintsRutaTransporte.gridx = iXPanelCamposRutaTransporte++;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRutaTransporte.add(this.jPanelprecioRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(iXPanelCamposRutaTransporte % 1==0) {
		iXPanelCamposRutaTransporte=0;
		iYPanelCamposRutaTransporte++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRutaTransporte.gridy = iYPanelCamposOcultosRutaTransporte;
	this.gridBagConstraintsRutaTransporte.gridx = iXPanelCamposOcultosRutaTransporte++;
	this.gridBagConstraintsRutaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRutaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRutaTransporte.add(this.jPanelid_empresaRutaTransporte, this.gridBagConstraintsRutaTransporte);



	if(iXPanelCamposOcultosRutaTransporte % 1==0) {
		iXPanelCamposOcultosRutaTransporte=0;
		iYPanelCamposOcultosRutaTransporte++;
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
			
		GridBagLayout gridaBagLayoutAccionesRutaTransporte= new GridBagLayout();
		this.jPanelAccionesRutaTransporte.setLayout(gridaBagLayoutAccionesRutaTransporte);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRutaTransporte= new GridBagLayout();
		this.jPanelAccionesFormularioRutaTransporte.setLayout(gridaBagLayoutAccionesFormularioRutaTransporte);
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRutaTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRutaTransporte.add(this.jComboBoxTiposAccionesFormularioRutaTransporte, this.gridBagConstraintsRutaTransporte);

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRutaTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRutaTransporte.add(this.jCheckBoxPostAccionNuevoRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRutaTransporte.add(this.jCheckBoxPostAccionSinCerrarRutaTransporte, this.gridBagConstraintsRutaTransporte);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRutaTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRutaTransporte.add(this.jCheckBoxPostAccionSinMensajeRutaTransporte, this.gridBagConstraintsRutaTransporte);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx = iPosXAccion++;
			
		this.jPanelAccionesRutaTransporte.add(this.jButtonModificarRutaTransporte, this.gridBagConstraintsRutaTransporte);							

		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRutaTransporte.gridy = 0;
		this.gridBagConstraintsRutaTransporte.gridx =iPosXAccion++;
			
		this.jPanelAccionesRutaTransporte.add(this.jButtonEliminarRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = 0;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesRutaTransporte.add(this.jButtonActualizarRutaTransporte, this.gridBagConstraintsRutaTransporte);


		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = 0;		
		this.gridBagConstraintsRutaTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesRutaTransporte.add(this.jButtonGuardarCambiosRutaTransporte, this.gridBagConstraintsRutaTransporte);	
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = 0;		
		this.gridBagConstraintsRutaTransporte.gridx =iPosXAccion++;
		
		this.jPanelAccionesRutaTransporte.add(this.jButtonCancelarRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRutaTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRutaTransporte);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();						
			this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRutaTransporte.gridx = 0;		
			//this.gridBagConstraintsRutaTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRutaTransporte.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRutaTransporte.gridx =0;
		this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRutaTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRutaTransporte, this.gridBagConstraintsRutaTransporte);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRutaTransporte = new RutaTransporteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ruta Transporte DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ruta Transporte DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ruta Transporte Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RutaTransporteModel rutatransporteModel=new RutaTransporteModel(this);
			
			//SI USARA CLASE INTERNA
			//RutaTransporteModel.RutaTransporteFocusTraversalPolicy rutatransporteFocusTraversalPolicy = rutatransporteModel.new RutaTransporteFocusTraversalPolicy(this);
			
			//rutatransporteFocusTraversalPolicy.setrutatransporteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rutatransporteModel);
			
			
			this.jContentPaneDetalleRutaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRutaTransporte = new GridBagLayout();	
			this.jContentPaneDetalleRutaTransporte.setLayout(gridaBagLayoutDetalleRutaTransporte);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRutaTransporte = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRutaTransporte.gridx = 0;
					
				
				this.jContentPaneDetalleRutaTransporte.add(jTtoolBarDetalleRutaTransporte, gridBagConstraintsRutaTransporte);								
				
}
			
			this.jScrollPanelDatosEdicionRutaTransporte=   new JScrollPane(jContentPaneDetalleRutaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRutaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRutaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRutaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRutaTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRutaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRutaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRutaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRutaTransporte.gridx = 0;
	        
			this.jContentPaneDetalleRutaTransporte.add(jPanelCamposRutaTransporte, gridBagConstraintsRutaTransporte);
			
			
			
			
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
						&& rutatransporteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePedido(this.puedeCargarPorPartePedido,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(this.puedeCargarPorParteProforma,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioTransporte(this.puedeCargarPorParteServicioTransporte,false,-1);
					
					if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRutaTransporte= new GridBagConstraints();
						this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRutaTransporte.gridx = 0;
						this.jContentPaneDetalleRutaTransporte.add(this.jTabbedPaneRelacionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRutaTransporte.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePedido(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameServicioTransporte(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRutaTransporte.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
					this.gridBagConstraintsRutaTransporte.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRutaTransporte.gridx = 0;
					
				
					this.jContentPaneDetalleRutaTransporte.add(jPanelCamposOcultosRutaTransporte, gridBagConstraintsRutaTransporte);
				
					this.jPanelCamposOcultosRutaTransporte.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsRutaTransporte.gridx = 0;
	        this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRutaTransporte.add(this.jPanelAccionesFormularioRutaTransporte, this.gridBagConstraintsRutaTransporte);							
			
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
	        this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsRutaTransporte.gridx = 0;
	        
			
			this.jContentPaneDetalleRutaTransporte.add(this.jPanelAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRutaTransporte);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRutaTransporte=   new JScrollPane(this.jPanelCamposRutaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRutaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRutaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRutaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRutaTransporte.gridx = 0;
			this.gridBagConstraintsRutaTransporte.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRutaTransporte.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRutaTransporte.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRutaTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRutaTransporte, this.gridBagConstraintsRutaTransporte);			
			
			this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
			this.gridBagConstraintsRutaTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRutaTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRutaTransporte, this.gridBagConstraintsRutaTransporte);
			
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRutaTransporte, this.gridBagConstraintsRutaTransporte);
		
			
		this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
		this.gridBagConstraintsRutaTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRutaTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRutaTransporte, this.gridBagConstraintsRutaTransporte);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRutaTransporte;//jContentPane;
		
		return jScrollPanelDatosEdicionRutaTransporte;
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

				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoSessionBean.setEsGuardarRelacionado(true);

				this.pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoBeanSwingJInternalFrame.setpedidoSessionBean(this.pedidoSessionBean);

				//this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				//this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRutaTransporte.gridx = 0;
				//this.jContentPaneDetalleRutaTransporte.add(this.pedidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRutaTransporte);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRutaTransporte.add("Pedidos",this.pedidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRutaTransporte.setComponentAt(iIndexTab,this.pedidoBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoSessionBean.setEsGuardarRelacionado(false);
				this.pedidoBeanSwingJInternalFrame=null;//new PedidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedido) {
					this.jTabbedPaneRelacionesRutaTransporte.add("Pedidos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proformaSessionBean=new ProformaSessionBean();
		this.proformaSessionBean.setConGuardarRelaciones(true);
		this.proformaSessionBean.setEsGuardarRelacionado(true);

		this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proformaSessionBean.getEsGuardarRelacionado()) {

				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proformaSessionBean.setEsGuardarRelacionado(true);

				this.proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.proformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proformaBeanSwingJInternalFrame.setproformaSessionBean(this.proformaSessionBean);

				//this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				//this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRutaTransporte.gridx = 0;
				//this.jContentPaneDetalleRutaTransporte.add(this.proformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRutaTransporte);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRutaTransporte.add("Proformas",this.proformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRutaTransporte.setComponentAt(iIndexTab,this.proformaBeanSwingJInternalFrame.getContentPane());
				}

				//ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proformaSessionBean.setEsGuardarRelacionado(false);
				this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProforma) {
					this.jTabbedPaneRelacionesRutaTransporte.add("Proformas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameServicioTransporte(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
		this.serviciotransporteSessionBean.setConGuardarRelaciones(false);
		this.serviciotransporteSessionBean.setEsGuardarRelacionado(true);

		this.serviciotransporteBeanSwingJInternalFrame=null;//new ServicioTransporteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.serviciotransporteBeanSwingJInternalFramePopup=new ServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.serviciotransporteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {

				ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;
				ServicioTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RutaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.serviciotransporteSessionBean.setEsGuardarRelacionado(true);

				this.serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.serviciotransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.serviciotransporteBeanSwingJInternalFrame.setserviciotransporteSessionBean(this.serviciotransporteSessionBean);

				//this.gridBagConstraintsRutaTransporte = new GridBagConstraints();
				//this.gridBagConstraintsRutaTransporte.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRutaTransporte.gridx = 0;
				//this.jContentPaneDetalleRutaTransporte.add(this.serviciotransporteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRutaTransporte);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRutaTransporte.add("Servicio Transportes",this.serviciotransporteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRutaTransporte.setComponentAt(iIndexTab,this.serviciotransporteBeanSwingJInternalFrame.getContentPane());
				}

				//ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
				this.serviciotransporteBeanSwingJInternalFrame=null;//new ServicioTransporteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.serviciotransporteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteServicioTransporte) {
					this.jTabbedPaneRelacionesRutaTransporte.add("Servicio Transportes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProformaBeanSwingJInternalFrame(List<RutaTransporte> rutatransportes,RutaTransporte rutatransporte,ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proformaBeanSwingJInternalFrame.getProformaLogic().setConnexion(this.rutatransporteLogic.getConnexion());

					proformaBeanSwingJInternalFrame.setrutatransportesForeignKey(rutatransportes);
					proformaBeanSwingJInternalFrame.setrutatransporteForeignKey(rutatransporte);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setisBusquedaDesdeForeignKeySesionRutaTransporte(true);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setlidRutaTransporteActual(rutatransporte.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proformaBeanSwingJInternalFrame.cargarCombosForeignKeyProforma(proformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					proformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaRutaTransporte(true);
					proformaBeanSwingJInternalFrame.setid_ruta_transporteFK_IdRutaTransporte(rutatransporte.getId());

					if(!this.conCargarFormDetalle) {
						proformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proformaBeanSwingJInternalFrame.setSelectedItemCombosFrameRutaTransporteForeignKey(rutatransporte,1,false,true,true);
					proformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdRutaTransporte");
					proformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRutaTransporte");
					proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(true);
					proformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProforma("n",proformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, proformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proformaBeanSwingJInternalFrame.setAutoscrolls(true);
					proformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("relacionado");
					} else {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");
					}

					proformaBeanSwingJInternalFrame.getjButtonRecargarInformacionProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoBeanSwingJInternalFrame(List<RutaTransporte> rutatransportes,RutaTransporte rutatransporte,PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoBeanSwingJInternalFrame=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoBeanSwingJInternalFrame.getPedidoLogic().setConnexion(this.rutatransporteLogic.getConnexion());

					pedidoBeanSwingJInternalFrame.setrutatransportesForeignKey(rutatransportes);
					pedidoBeanSwingJInternalFrame.setrutatransporteForeignKey(rutatransporte);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionRutaTransporte(true);
					pedidoBeanSwingJInternalFrame.pedidoSessionBean.setlidRutaTransporteActual(rutatransporte.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoBeanSwingJInternalFrame.cargarCombosForeignKeyPedido(pedidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRutaTransporte(true);
					pedidoBeanSwingJInternalFrame.setid_ruta_transporteFK_IdRutaTransporte(rutatransporte.getId());

					if(!this.conCargarFormDetalle) {
						pedidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoBeanSwingJInternalFrame.setSelectedItemCombosFrameRutaTransporteForeignKey(rutatransporte,1,false,true,true);
					pedidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRutaTransporte");
					pedidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRutaTransporte");
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

		public void cargarServicioTransporteBeanSwingJInternalFrame(List<RutaTransporte> rutatransportes,RutaTransporte rutatransporte,ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//serviciotransporteBeanSwingJInternalFrame=new ServicioTransporteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					serviciotransporteBeanSwingJInternalFrame.getServicioTransporteLogic().setConnexion(this.rutatransporteLogic.getConnexion());

					serviciotransporteBeanSwingJInternalFrame.setrutatransportesForeignKey(rutatransportes);
					serviciotransporteBeanSwingJInternalFrame.setrutatransporteForeignKey(rutatransporte);
					serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionRutaTransporte(true);
					serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setlidRutaTransporteActual(rutatransporte.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					serviciotransporteBeanSwingJInternalFrame.cargarCombosForeignKeyServicioTransporte(serviciotransporteBeanSwingJInternalFrame.isCargarCombosDependencia);
					serviciotransporteBeanSwingJInternalFrame.setVisibilidadBusquedasParaRutaTransporte(true);
					serviciotransporteBeanSwingJInternalFrame.setid_ruta_transporteFK_IdRutaTransporte(rutatransporte.getId());

					if(!this.conCargarFormDetalle) {
						serviciotransporteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					serviciotransporteBeanSwingJInternalFrame.setSelectedItemCombosFrameRutaTransporteForeignKey(rutatransporte,1,false,true,true);
					serviciotransporteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					serviciotransporteBeanSwingJInternalFrame.procesarBusqueda("FK_IdRutaTransporte");
					serviciotransporteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRutaTransporte");
					serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(true);
					serviciotransporteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesServicioTransporte("n",serviciotransporteBeanSwingJInternalFrame.isGuardarCambiosEnLote, serviciotransporteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					serviciotransporteBeanSwingJInternalFrame.setAutoscrolls(true);
					serviciotransporteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("relacionado");
					} else {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("no_relacionado");
					}

					serviciotransporteBeanSwingJInternalFrame.getjButtonRecargarInformacionServicioTransporte().setVisible(false);

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
