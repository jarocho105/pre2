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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.report.*;
import com.bydan.erp.puntoventa.util.report.TarjetasCreditosConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.report.*;
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
public class TarjetasCreditosDetalleFormJInternalFrame extends TarjetasCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTarjetasCreditos;
	
	protected JMenuBar jmenuBarDetalleTarjetasCreditos;
	
	protected JMenu jmenuDetalleTarjetasCreditos;
	protected JMenu jmenuDetalleArchivoTarjetasCreditos;
	protected JMenu jmenuDetalleAccionesTarjetasCreditos;
	protected JMenu jmenuDetalleDatosTarjetasCreditos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetasCreditos;	
	protected GridBagConstraints gridBagConstraintsTarjetasCreditos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TarjetasCreditosBeanSwingJInternalFrameAdditional jInternalFrameDetalleTarjetasCreditos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";
	
	public TarjetasCreditosSessionBean tarjetascreditosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;	
	
	public TarjetasCreditosLogic tarjetascreditosLogic;
	
	public JScrollPane jScrollPanelDatosTarjetasCreditos;
	public JScrollPane jScrollPanelDatosEdicionTarjetasCreditos;
	public JScrollPane jScrollPanelDatosGeneralTarjetasCreditos;
	
	protected JPanel jPanelCamposTarjetasCreditos;    
	protected JPanel jPanelCamposOcultosTarjetasCreditos;    	
	protected JPanel jPanelAccionesTarjetasCreditos;
	protected JPanel jPanelAccionesFormularioTarjetasCreditos;
    
	
	
	protected Integer iXPanelCamposTarjetasCreditos=0;
	protected Integer iYPanelCamposTarjetasCreditos=0;
	
	protected Integer iXPanelCamposOcultosTarjetasCreditos=0;
	protected Integer iYPanelCamposOcultosTarjetasCreditos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTarjetasCreditos;
	public JButton jButtonModificarTarjetasCreditos;
	public JButton jButtonActualizarTarjetasCreditos;
    public JButton jButtonEliminarTarjetasCreditos;
	public JButton jButtonCancelarTarjetasCreditos;
    public JButton jButtonGuardarCambiosTarjetasCreditos;
	public JButton jButtonGuardarCambiosTablaTarjetasCreditos;
	protected JButton jButtonCerrarTarjetasCreditos;
	
	
	protected JButton jButtonProcesarInformacionTarjetasCreditos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTarjetasCreditos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTarjetasCreditos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTarjetasCreditos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetasCreditos;
	protected JButton jButtonModificarToolBarTarjetasCreditos;
	protected JButton jButtonActualizarToolBarTarjetasCreditos;
    protected JButton jButtonEliminarToolBarTarjetasCreditos;
	protected JButton jButtonCancelarToolBarTarjetasCreditos;
    protected JButton jButtonGuardarCambiosToolBarTarjetasCreditos;
	protected JButton jButtonGuardarCambiosTablaToolBarTarjetasCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetasCreditos;
	protected JButton jButtonCerrarToolBarTarjetasCreditos;
	
	protected JButton jButtonProcesarInformacionToolBarTarjetasCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetasCreditos;
	protected JMenuItem jMenuItemModificarTarjetasCreditos;
	protected JMenuItem jMenuItemActualizarTarjetasCreditos;
    protected JMenuItem jMenuItemEliminarTarjetasCreditos;
	protected JMenuItem jMenuItemCancelarTarjetasCreditos;
    protected JMenuItem jMenuItemGuardarCambiosTarjetasCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetasCreditos;
	protected JMenuItem jMenuItemCerrarTarjetasCreditos;
	protected JMenuItem jMenuItemDetalleCerrarTarjetasCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetasCreditos;
	
	protected JMenuItem jMenuItemProcesarInformacionTarjetasCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetasCreditos;
	protected JMenuItem jMenuItemMostrarOcultarTarjetasCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetasCreditos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetasCreditos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTarjetasCreditos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTarjetasCreditos;
	public JLabel jLabelIdTarjetasCreditos;
	public JLabel jLabelidTarjetasCreditos;
	public JButton jButtonidTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioTarjetasCreditos;
	public JLabel jLabelfecha_inicioTarjetasCreditos;
	//public JFormattedTextField jDateChooserfecha_inicioTarjetasCreditos;

	public JDateChooser jDateChooserfecha_inicioTarjetasCreditos;
	public JButton jButtonfecha_inicioTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finTarjetasCreditos;
	public JLabel jLabelfecha_finTarjetasCreditos;
	//public JFormattedTextField jDateChooserfecha_finTarjetasCreditos;

	public JDateChooser jDateChooserfecha_finTarjetasCreditos;
	public JButton jButtonfecha_finTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tarjetaTarjetasCreditos;
	public JLabel jLabelnombre_tarjetaTarjetasCreditos;
	public JTextArea jTextAreanombre_tarjetaTarjetasCreditos;
	public JScrollPane jscrollPanenombre_tarjetaTarjetasCreditos;
	public JButton jButtonnombre_tarjetaTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelloteTarjetasCreditos;
	public JLabel jLabelloteTarjetasCreditos;
	public JTextField jTextFieldloteTarjetasCreditos;
	public JButton jButtonloteTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfechaTarjetasCreditos;
	public JLabel jLabelfechaTarjetasCreditos;
	//public JFormattedTextField jDateChooserfechaTarjetasCreditos;

	public JDateChooser jDateChooserfechaTarjetasCreditos;
	public JButton jButtonfechaTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPaneltotalTarjetasCreditos;
	public JLabel jLabeltotalTarjetasCreditos;
	public JTextField jTextFieldtotalTarjetasCreditos;
	public JButton jButtontotalTarjetasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTarjetasCreditos;
	public JLabel jLabelid_empresaTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTarjetasCreditos;
	public JButton jButtonid_empresaTarjetasCreditos= new JButtonMe();
	public JButton jButtonid_empresaTarjetasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_empresaTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTarjetasCreditos;
	public JLabel jLabelid_sucursalTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTarjetasCreditos;
	public JButton jButtonid_sucursalTarjetasCreditos= new JButtonMe();
	public JButton jButtonid_sucursalTarjetasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTarjetasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelid_tarjeta_creditoTarjetasCreditos;
	public JLabel jLabelid_tarjeta_creditoTarjetasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoTarjetasCreditos;
	public JButton jButtonid_tarjeta_creditoTarjetasCreditos= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoTarjetasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoTarjetasCreditosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTarjetasCreditos;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TarjetasCreditosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTarjetasCreditos=new JPanel();
				this.jPanelAccionesFormularioTarjetasCreditos=new JPanel();
				this.jmenuBarDetalleTarjetasCreditos=new JMenuBar();
				this.jTtoolBarDetalleTarjetasCreditos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TarjetasCreditosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetasCreditosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTarjetasCreditos() {
		return this.jButtonActualizarToolBarTarjetasCreditos;
	}
	
	public JButton getjButtonEliminarToolBarTarjetasCreditos() {
		return this.jButtonEliminarToolBarTarjetasCreditos;
	}
	
	public JButton getjButtonCancelarToolBarTarjetasCreditos() {
		return this.jButtonCancelarToolBarTarjetasCreditos;
	}		
	
	public JButton getjButtonProcesarInformacionTarjetasCreditos() {
		return this.jButtonProcesarInformacionTarjetasCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetasCreditos)	{
		this.jButtonProcesarInformacionTarjetasCreditos = jButtonProcesarInformacionTarjetasCreditos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetasCreditos() {
		return this.jComboBoxTiposAccionesTarjetasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetasCreditos(
			JComboBox jComboBoxTiposRelacionesTarjetasCreditos) {
		this.jComboBoxTiposRelacionesTarjetasCreditos = jComboBoxTiposRelacionesTarjetasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetasCreditos(
			JComboBox jComboBoxTiposAccionesTarjetasCreditos) {
		this.jComboBoxTiposAccionesTarjetasCreditos = jComboBoxTiposAccionesTarjetasCreditos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTarjetasCreditos() {
		return this.jComboBoxTiposAccionesFormularioTarjetasCreditos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTarjetasCreditos(
			JComboBox jComboBoxTiposAccionesFormularioTarjetasCreditos) {
		this.jComboBoxTiposAccionesFormularioTarjetasCreditos = jComboBoxTiposAccionesFormularioTarjetasCreditos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tarjetascreditosSessionBean=new TarjetasCreditosSessionBean();
		
		this.tarjetascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetascreditosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetasCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
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
	
		TarjetasCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTarjetasCreditos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTarjetasCreditos=new JButtonMe();
				this.jButtonModificarToolBarTarjetasCreditos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTarjetasCreditos,this.jTtoolBarDetalleTarjetasCreditos,
							"actualizar","actualizar","Actualizar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTarjetasCreditos,this.jTtoolBarDetalleTarjetasCreditos,
							"eliminar","eliminar","Eliminar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTarjetasCreditos,this.jTtoolBarDetalleTarjetasCreditos,
							"cancelar","cancelar","Cancelar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTarjetasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTarjetasCreditos,this.jTtoolBarDetalleTarjetasCreditos,
							"guardarcambios","guardarcambios","Guardar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTarjetasCreditos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTarjetasCreditos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTarjetasCreditos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTarjetasCreditos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTarjetasCreditos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetasCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetasCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetasCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTarjetasCreditos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTarjetasCreditos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTarjetasCreditos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTarjetasCreditos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTarjetasCreditos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTarjetasCreditos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTarjetasCreditos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTarjetasCreditos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTarjetasCreditos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTarjetasCreditos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTarjetasCreditos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTarjetasCreditos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTarjetasCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetasCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetasCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTarjetasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTarjetasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTarjetasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTarjetasCreditos.add(this.jMenuItemDetalleCerrarTarjetasCreditos);
		
		this.jmenuDetalleAccionesTarjetasCreditos.add(this.jMenuItemActualizarTarjetasCreditos);
		this.jmenuDetalleAccionesTarjetasCreditos.add(this.jMenuItemEliminarTarjetasCreditos);
		this.jmenuDetalleAccionesTarjetasCreditos.add(this.jMenuItemCancelarTarjetasCreditos);		
		
		//this.jmenuDetalleDatosTarjetasCreditos.add(this.jMenuItemDetalleAbrirOrderByTarjetasCreditos);				
		this.jmenuDetalleDatosTarjetasCreditos.add(this.jMenuItemDetalleMostarOcultarTarjetasCreditos);				
				
		//this.jmenuDetalleAccionesTarjetasCreditos.add(this.jMenuItemGuardarCambiosTarjetasCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTarjetasCreditos.add(this.jmenuDetalleArchivoTarjetasCreditos);		
		this.jmenuBarDetalleTarjetasCreditos.add(this.jmenuDetalleAccionesTarjetasCreditos);		
		this.jmenuBarDetalleTarjetasCreditos.add(this.jmenuDetalleDatosTarjetasCreditos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTarjetasCreditos);				
	}
	
	
	public void inicializarElementosCamposTarjetasCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTarjetasCreditos = new JLabelMe();
		jLabelIdTarjetasCreditos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTarjetasCreditos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTarjetasCreditos= new GridBagLayout();

		this.jPanelidTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);

		jLabelidTarjetasCreditos = new JLabel();
		jLabelidTarjetasCreditos.setText("Id");

		jLabelidTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioTarjetasCreditos = new JLabelMe();
		this.jLabelfecha_inicioTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioTarjetasCreditos.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelfecha_inicioTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		//jFormattedTextFieldfecha_inicioTarjetasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioTarjetasCreditos= new JDateChooser();
		jDateChooserfecha_inicioTarjetasCreditos.setEnabled(false);
		jDateChooserfecha_inicioTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioTarjetasCreditos.setDate(new Date());
		jDateChooserfecha_inicioTarjetasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioTarjetasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_inicioTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioTarjetasCreditosBusqueda.setText("U");
		this.jButtonfecha_inicioTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioTarjetasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finTarjetasCreditos = new JLabelMe();
		this.jLabelfecha_finTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finTarjetasCreditos.setToolTipText("Fecha Fin");
		this.jLabelfecha_finTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelfecha_finTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		//jFormattedTextFieldfecha_finTarjetasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_finTarjetasCreditos= new JDateChooser();
		jDateChooserfecha_finTarjetasCreditos.setEnabled(false);
		jDateChooserfecha_finTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finTarjetasCreditos.setDate(new Date());
		jDateChooserfecha_finTarjetasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finTarjetasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_finTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finTarjetasCreditosBusqueda.setText("U");
		this.jButtonfecha_finTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finTarjetasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tarjetaTarjetasCreditos = new JLabelMe();
		this.jLabelnombre_tarjetaTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA+" : *");
		this.jLabelnombre_tarjetaTarjetasCreditos.setToolTipText("Nombre Tarjeta");
		this.jLabelnombre_tarjetaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_tarjetaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_tarjetaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tarjetaTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tarjetaTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tarjetaTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_NOMBRETARJETA);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelnombre_tarjetaTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		jTextAreanombre_tarjetaTarjetasCreditos= new JTextAreaMe();
		jTextAreanombre_tarjetaTarjetasCreditos.setEnabled(false);
		jTextAreanombre_tarjetaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tarjetaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tarjetaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tarjetaTarjetasCreditos.setLineWrap(true);
		jTextAreanombre_tarjetaTarjetasCreditos.setWrapStyleWord(true);
		jTextAreanombre_tarjetaTarjetasCreditos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tarjetaTarjetasCreditos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tarjetaTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tarjetaTarjetasCreditos = new JScrollPane(jTextAreanombre_tarjetaTarjetasCreditos);
		jscrollPanenombre_tarjetaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tarjetaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tarjetaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setText("U");
		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tarjetaTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tarjetaTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tarjetaTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tarjetaTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tarjetaTarjetasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelloteTarjetasCreditos = new JLabelMe();
		this.jLabelloteTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteTarjetasCreditos.setToolTipText("Lote");
		this.jLabelloteTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelloteTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		jTextFieldloteTarjetasCreditos= new JTextFieldMe();

		jTextFieldloteTarjetasCreditos.setEnabled(false);
		jTextFieldloteTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonloteTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteTarjetasCreditosBusqueda.setText("U");
		this.jButtonloteTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteTarjetasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfechaTarjetasCreditos = new JLabelMe();
		this.jLabelfechaTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaTarjetasCreditos.setToolTipText("Fecha");
		this.jLabelfechaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelfechaTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		//jFormattedTextFieldfechaTarjetasCreditos= new JFormattedTextFieldMe();

		jDateChooserfechaTarjetasCreditos= new JDateChooser();
		jDateChooserfechaTarjetasCreditos.setEnabled(false);
		jDateChooserfechaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaTarjetasCreditos.setDate(new Date());
		jDateChooserfechaTarjetasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaTarjetasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonfechaTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaTarjetasCreditosBusqueda.setText("U");
		this.jButtonfechaTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaTarjetasCreditosBusqueda.setVisible(false);		}


					
		this.jLabeltotalTarjetasCreditos = new JLabelMe();
		this.jLabeltotalTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalTarjetasCreditos.setToolTipText("Total");
		this.jLabeltotalTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPaneltotalTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		jTextFieldtotalTarjetasCreditos= new JTextFieldMe();
		jTextFieldtotalTarjetasCreditos.setEnabled(false);
		jTextFieldtotalTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalTarjetasCreditos.setText("0.0");

		this.jButtontotalTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtontotalTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalTarjetasCreditosBusqueda.setText("U");
		this.jButtontotalTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalTarjetasCreditosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTarjetasCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTarjetasCreditos = new JLabelMe();
		this.jLabelid_empresaTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTarjetasCreditos.setToolTipText("Empresa");
		this.jLabelid_empresaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelid_empresaTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		jComboBoxid_empresaTarjetasCreditos= new JComboBoxMe();
		jComboBoxid_empresaTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTarjetasCreditos.setEnabled(false);

		this.jButtonid_empresaTarjetasCreditos= new JButtonMe();
		this.jButtonid_empresaTarjetasCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetasCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetasCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetasCreditos.setText("Buscar");
		this.jButtonid_empresaTarjetasCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTarjetasCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetasCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetasCreditos"));

		this.jButtonid_empresaTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonid_empresaTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetasCreditosBusqueda.setText("U");
		this.jButtonid_empresaTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTarjetasCreditosBusqueda.setVisible(false);		}

		this.jButtonid_empresaTarjetasCreditosUpdate= new JButtonMe();
		this.jButtonid_empresaTarjetasCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetasCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetasCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetasCreditosUpdate.setText("U");
		this.jButtonid_empresaTarjetasCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTarjetasCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetasCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetasCreditosUpdate"));



					
		this.jLabelid_sucursalTarjetasCreditos = new JLabelMe();
		this.jLabelid_sucursalTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTarjetasCreditos.setToolTipText("Sucursal");
		this.jLabelid_sucursalTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelid_sucursalTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		jComboBoxid_sucursalTarjetasCreditos= new JComboBoxMe();
		jComboBoxid_sucursalTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTarjetasCreditos.setEnabled(false);

		this.jButtonid_sucursalTarjetasCreditos= new JButtonMe();
		this.jButtonid_sucursalTarjetasCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetasCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetasCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetasCreditos.setText("Buscar");
		this.jButtonid_sucursalTarjetasCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTarjetasCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetasCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetasCreditos"));

		this.jButtonid_sucursalTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonid_sucursalTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetasCreditosBusqueda.setText("U");
		this.jButtonid_sucursalTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTarjetasCreditosBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTarjetasCreditosUpdate= new JButtonMe();
		this.jButtonid_sucursalTarjetasCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetasCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetasCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetasCreditosUpdate.setText("U");
		this.jButtonid_sucursalTarjetasCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTarjetasCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetasCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetasCreditosUpdate"));



					
		this.jLabelid_tarjeta_creditoTarjetasCreditos = new JLabelMe();
		this.jLabelid_tarjeta_creditoTarjetasCreditos.setText(""+TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO+" : *");
		this.jLabelid_tarjeta_creditoTarjetasCreditos.setToolTipText("Tarjeta Credito");
		this.jLabelid_tarjeta_creditoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tarjeta_creditoTarjetasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tarjeta_creditoTarjetasCreditos.setToolTipText(TarjetasCreditosConstantesFunciones.LABEL_IDTARJETACREDITO);
		this.gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		this.jPanelid_tarjeta_creditoTarjetasCreditos.setLayout(this.gridaBagLayoutTarjetasCreditos);


		jComboBoxid_tarjeta_creditoTarjetasCreditos= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tarjeta_creditoTarjetasCreditos.setEnabled(false);

		this.jButtonid_tarjeta_creditoTarjetasCreditos= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetasCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetasCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetasCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetasCreditos.setText("Buscar");
		this.jButtonid_tarjeta_creditoTarjetasCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tarjeta_creditoTarjetasCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetasCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tarjeta_creditoTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetasCreditos"));

		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setText("U");
		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tarjeta_creditoTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetasCreditosBusqueda"));

		if(this.tarjetascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tarjeta_creditoTarjetasCreditosBusqueda.setVisible(false);		}

		this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.setText("U");
		this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetasCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tarjeta_creditoTarjetasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetasCreditosUpdate"));



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
		//this.jInternalFrameDetalleTarjetasCreditos = new TarjetasCreditosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tarjeta Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetasCreditos= new GridBagLayout();
		

		
		String sToolTipTarjetasCreditos="";
		sToolTipTarjetasCreditos=TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetasCreditos+="(PuntoVenta.TarjetasCreditos)";
		}
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetasCreditos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTarjetasCreditos = new JButtonMe();
		this.jButtonModificarTarjetasCreditos = new JButtonMe();
        this.jButtonActualizarTarjetasCreditos = new JButtonMe();
        this.jButtonEliminarTarjetasCreditos = new JButtonMe();
        this.jButtonCancelarTarjetasCreditos = new JButtonMe();
        this.jButtonGuardarCambiosTarjetasCreditos = new JButtonMe();
		this.jButtonGuardarCambiosTablaTarjetasCreditos = new JButtonMe();
		this.jButtonCerrarTarjetasCreditos = new JButtonMe();
		
		this.jScrollPanelDatosTarjetasCreditos = new JScrollPane();   
        this.jScrollPanelDatosEdicionTarjetasCreditos = new JScrollPane();
		this.jScrollPanelDatosGeneralTarjetasCreditos = new JScrollPane();
				
		
		
		this.jPanelCamposTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito";
		
		if(!this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTarjetasCreditos.setName("jPanelCamposTarjetasCreditos"); 

		this.jPanelCamposOcultosTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTarjetasCreditos.setName("jPanelCamposOcultosTarjetasCreditos"); 

        this.jPanelAccionesTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesTarjetasCreditos.setName("Acciones"); 

		this.jPanelAccionesFormularioTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTarjetasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTarjetasCreditos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTarjetasCreditos.setText("Nuevo");
		this.jButtonModificarTarjetasCreditos.setText("Editar");
        this.jButtonActualizarTarjetasCreditos.setText("Actualizar");
        this.jButtonEliminarTarjetasCreditos.setText("Eliminar");
        this.jButtonCancelarTarjetasCreditos.setText("Cancelar");
        this.jButtonGuardarCambiosTarjetasCreditos.setText("Guardar");
		this.jButtonGuardarCambiosTablaTarjetasCreditos.setText("Guardar");
		this.jButtonCerrarTarjetasCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetasCreditos,"nuevo_button","Nuevo",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTarjetasCreditos,"modificar_button","Editar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTarjetasCreditos,"actualizar_button","Actualizar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTarjetasCreditos,"eliminar_button","Eliminar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTarjetasCreditos,"cancelar_button","Cancelar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTarjetasCreditos,"guardarcambios_button","Guardar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetasCreditos,"guardarcambiostabla_button","Guardar",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetasCreditos,"cerrar_button","Salir",this.tarjetascreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTarjetasCreditos.setToolTipText("Nuevo"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTarjetasCreditos.setToolTipText("Editar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTarjetasCreditos.setToolTipText("Actualizar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTarjetasCreditos.setToolTipText("Eliminar)"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTarjetasCreditos.setToolTipText("Cancelar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTarjetasCreditos.setToolTipText("Guardar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTarjetasCreditos.setToolTipText("Guardar"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetasCreditos.setToolTipText("Salir"+" "+TarjetasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetasCreditos";
		inputMap = this.jButtonNuevoTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetasCreditos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTarjetasCreditos";
		inputMap = this.jButtonActualizarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTarjetasCreditos"));
		
		//ELIMINAR
		sMapKey = "EliminarTarjetasCreditos";
		inputMap = this.jButtonEliminarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTarjetasCreditos"));
		
		//CANCELAR	
		sMapKey = "CancelarTarjetasCreditos";
		inputMap = this.jButtonCancelarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTarjetasCreditos"));
		
		//CERRAR		
		sMapKey = "CerrarTarjetasCreditos";
		inputMap = this.jButtonCerrarTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetasCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetasCreditos";
		inputMap = this.jButtonGuardarCambiosTablaTarjetasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetasCreditos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTarjetasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTarjetasCreditos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTarjetasCreditos.setToolTipText("Nuevo TarjetasCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTarjetasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTarjetasCreditos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTarjetasCreditos.setToolTipText("Sin Cerrar Ventana TarjetasCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTarjetasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTarjetasCreditos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTarjetasCreditos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetasCreditos.setText("Accion");
		this.jComboBoxTiposAccionesTarjetasCreditos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTarjetasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTarjetasCreditos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTarjetasCreditos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTarjetasCreditos = new JLabelMe();
		
		this.jLabelAccionesTarjetasCreditos.setText("Acciones");		
		this.jLabelAccionesTarjetasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTarjetasCreditos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTarjetasCreditos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTarjetasCreditos=new JTabbedPane();
		this.jTabbedPaneRelacionesTarjetasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTarjetasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTarjetasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTarjetasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetasCreditos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTarjetasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTarjetasCreditos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTarjetasCreditos = new GridBagLayout();
		
		this.jPanelCamposTarjetasCreditos.setLayout(gridaBagLayoutCamposTarjetasCreditos);
		this.jPanelCamposOcultosTarjetasCreditos.setLayout(gridaBagLayoutCamposOcultosTarjetasCreditos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTarjetasCreditos.add(jLabelIdTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTarjetasCreditos.add(jLabelidTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTarjetasCreditos.add(jLabelid_empresaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetasCreditos.add(jButtonid_empresaTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 3;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetasCreditos.add(jButtonid_empresaTarjetasCreditosUpdate, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTarjetasCreditos.add(jComboBoxid_empresaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTarjetasCreditos.add(jLabelid_sucursalTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetasCreditos.add(jButtonid_sucursalTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 3;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetasCreditos.add(jButtonid_sucursalTarjetasCreditosUpdate, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTarjetasCreditos.add(jComboBoxid_sucursalTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tarjeta_creditoTarjetasCreditos.add(jLabelid_tarjeta_creditoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoTarjetasCreditos.add(jButtonid_tarjeta_creditoTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 3;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoTarjetasCreditos.add(jButtonid_tarjeta_creditoTarjetasCreditosUpdate, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tarjeta_creditoTarjetasCreditos.add(jComboBoxid_tarjeta_creditoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioTarjetasCreditos.add(jLabelfecha_inicioTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioTarjetasCreditos.add(jButtonfecha_inicioTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioTarjetasCreditos.add(jDateChooserfecha_inicioTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finTarjetasCreditos.add(jLabelfecha_finTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finTarjetasCreditos.add(jButtonfecha_finTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finTarjetasCreditos.add(jDateChooserfecha_finTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tarjetaTarjetasCreditos.add(jLabelnombre_tarjetaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tarjetaTarjetasCreditos.add(jButtonnombre_tarjetaTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tarjetaTarjetasCreditos.add(jscrollPanenombre_tarjetaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteTarjetasCreditos.add(jLabelloteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteTarjetasCreditos.add(jButtonloteTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteTarjetasCreditos.add(jTextFieldloteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaTarjetasCreditos.add(jLabelfechaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaTarjetasCreditos.add(jButtonfechaTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaTarjetasCreditos.add(jDateChooserfechaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalTarjetasCreditos.add(jLabeltotalTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = 2;
		this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
		this.gridBagConstraintsTarjetasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalTarjetasCreditos.add(jButtontotalTarjetasCreditosBusqueda, this.gridBagConstraintsTarjetasCreditos);
	}

	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetasCreditos.gridy = 0;
	this.gridBagConstraintsTarjetasCreditos.gridx = 1;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalTarjetasCreditos.add(jTextFieldtotalTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPanelidTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPanelfecha_inicioTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPanelfecha_finTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPanelnombre_tarjetaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPanelloteTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPanelfechaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetasCreditos.add(this.jPaneltotalTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposTarjetasCreditos % 1==0) {
		iXPanelCamposTarjetasCreditos=0;
		iYPanelCamposTarjetasCreditos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposOcultosTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposOcultosTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetasCreditos.add(this.jPanelid_empresaTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposOcultosTarjetasCreditos % 1==0) {
		iXPanelCamposOcultosTarjetasCreditos=0;
		iYPanelCamposOcultosTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposOcultosTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposOcultosTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetasCreditos.add(this.jPanelid_sucursalTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposOcultosTarjetasCreditos % 1==0) {
		iXPanelCamposOcultosTarjetasCreditos=0;
		iYPanelCamposOcultosTarjetasCreditos++;
	}
	this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetasCreditos.gridy = iYPanelCamposOcultosTarjetasCreditos;
	this.gridBagConstraintsTarjetasCreditos.gridx = iXPanelCamposOcultosTarjetasCreditos++;
	this.gridBagConstraintsTarjetasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetasCreditos.add(this.jPanelid_tarjeta_creditoTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);



	if(iXPanelCamposOcultosTarjetasCreditos % 1==0) {
		iXPanelCamposOcultosTarjetasCreditos=0;
		iYPanelCamposOcultosTarjetasCreditos++;
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
			
		GridBagLayout gridaBagLayoutAccionesTarjetasCreditos= new GridBagLayout();
		this.jPanelAccionesTarjetasCreditos.setLayout(gridaBagLayoutAccionesTarjetasCreditos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTarjetasCreditos= new GridBagLayout();
		this.jPanelAccionesFormularioTarjetasCreditos.setLayout(gridaBagLayoutAccionesFormularioTarjetasCreditos);
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetasCreditos.add(this.jComboBoxTiposAccionesFormularioTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccion++;
			
		this.jPanelAccionesTarjetasCreditos.add(this.jButtonModificarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);							

		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;
		this.gridBagConstraintsTarjetasCreditos.gridx =iPosXAccion++;
			
		this.jPanelAccionesTarjetasCreditos.add(this.jButtonEliminarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetasCreditos.add(this.jButtonActualizarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);


		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;		
		this.gridBagConstraintsTarjetasCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetasCreditos.add(this.jButtonGuardarCambiosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);	
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = 0;		
		this.gridBagConstraintsTarjetasCreditos.gridx =iPosXAccion++;
		
		this.jPanelAccionesTarjetasCreditos.add(this.jButtonCancelarTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetasCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetasCreditos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetascreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();						
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;		
			//this.gridBagConstraintsTarjetasCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetasCreditos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetasCreditos.gridx =0;
		this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetasCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TarjetasCreditosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTarjetasCreditos = new TarjetasCreditosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tarjeta Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tarjeta Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TarjetasCreditosModel tarjetascreditosModel=new TarjetasCreditosModel(this);
			
			//SI USARA CLASE INTERNA
			//TarjetasCreditosModel.TarjetasCreditosFocusTraversalPolicy tarjetascreditosFocusTraversalPolicy = tarjetascreditosModel.new TarjetasCreditosFocusTraversalPolicy(this);
			
			//tarjetascreditosFocusTraversalPolicy.settarjetascreditosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tarjetascreditosModel);
			
			
			this.jContentPaneDetalleTarjetasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTarjetasCreditos = new GridBagLayout();	
			this.jContentPaneDetalleTarjetasCreditos.setLayout(gridaBagLayoutDetalleTarjetasCreditos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetasCreditos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
				this.gridBagConstraintsTarjetasCreditos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTarjetasCreditos.gridx = 0;
					
				
				this.jContentPaneDetalleTarjetasCreditos.add(jTtoolBarDetalleTarjetasCreditos, gridBagConstraintsTarjetasCreditos);								
				
}
			
			this.jScrollPanelDatosEdicionTarjetasCreditos=   new JScrollPane(jContentPaneDetalleTarjetasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTarjetasCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTarjetasCreditos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	        
			this.jContentPaneDetalleTarjetasCreditos.add(jPanelCamposTarjetasCreditos, gridBagConstraintsTarjetasCreditos);
			
			
			
			
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
						//&& tarjetascreditosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tarjetascreditosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTarjetasCreditos= new GridBagConstraints();
						this.gridBagConstraintsTarjetasCreditos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTarjetasCreditos.gridx = 0;
						this.jContentPaneDetalleTarjetasCreditos.add(this.jTabbedPaneRelacionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTarjetasCreditos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTarjetasCreditos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
					this.gridBagConstraintsTarjetasCreditos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTarjetasCreditos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTarjetasCreditos.gridx = 0;
					
				
					this.jContentPaneDetalleTarjetasCreditos.add(jPanelCamposOcultosTarjetasCreditos, gridBagConstraintsTarjetasCreditos);
				
					this.jPanelCamposOcultosTarjetasCreditos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	        this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTarjetasCreditos.add(this.jPanelAccionesFormularioTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);							
			
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
	        this.gridBagConstraintsTarjetasCreditos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTarjetasCreditos.gridx = 0;
	        
			
			this.jContentPaneDetalleTarjetasCreditos.add(this.jPanelAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTarjetasCreditos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTarjetasCreditos=   new JScrollPane(this.jPanelCamposTarjetasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;
			this.gridBagConstraintsTarjetasCreditos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTarjetasCreditos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTarjetasCreditos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);			
			
			this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
			this.gridBagConstraintsTarjetasCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetasCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
			
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		
			
		this.gridBagConstraintsTarjetasCreditos = new GridBagConstraints();
		this.gridBagConstraintsTarjetasCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetasCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetasCreditos, this.gridBagConstraintsTarjetasCreditos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTarjetasCreditos;//jContentPane;
		
		return jScrollPanelDatosEdicionTarjetasCreditos;
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
