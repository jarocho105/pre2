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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TarjetaCreditoDescuentoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TarjetaCreditoDescuentoDetalleFormJInternalFrame extends TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTarjetaCreditoDescuento;
	
	protected JMenuBar jmenuBarDetalleTarjetaCreditoDescuento;
	
	protected JMenu jmenuDetalleTarjetaCreditoDescuento;
	protected JMenu jmenuDetalleArchivoTarjetaCreditoDescuento;
	protected JMenu jmenuDetalleAccionesTarjetaCreditoDescuento;
	protected JMenu jmenuDetalleDatosTarjetaCreditoDescuento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetaCreditoDescuento;	
	protected GridBagConstraints gridBagConstraintsTarjetaCreditoDescuento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTarjetaCreditoDescuento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";
	
	public TarjetaCreditoDescuentoSessionBean tarjetacreditodescuentoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;	
	
	public TarjetaCreditoDescuentoLogic tarjetacreditodescuentoLogic;
	
	public JScrollPane jScrollPanelDatosTarjetaCreditoDescuento;
	public JScrollPane jScrollPanelDatosEdicionTarjetaCreditoDescuento;
	public JScrollPane jScrollPanelDatosGeneralTarjetaCreditoDescuento;
	
	protected JPanel jPanelCamposTarjetaCreditoDescuento;    
	protected JPanel jPanelCamposOcultosTarjetaCreditoDescuento;    	
	protected JPanel jPanelAccionesTarjetaCreditoDescuento;
	protected JPanel jPanelAccionesFormularioTarjetaCreditoDescuento;
    
	
	
	protected Integer iXPanelCamposTarjetaCreditoDescuento=0;
	protected Integer iYPanelCamposTarjetaCreditoDescuento=0;
	
	protected Integer iXPanelCamposOcultosTarjetaCreditoDescuento=0;
	protected Integer iYPanelCamposOcultosTarjetaCreditoDescuento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTarjetaCreditoDescuento;
	public JButton jButtonModificarTarjetaCreditoDescuento;
	public JButton jButtonActualizarTarjetaCreditoDescuento;
    public JButton jButtonEliminarTarjetaCreditoDescuento;
	public JButton jButtonCancelarTarjetaCreditoDescuento;
    public JButton jButtonGuardarCambiosTarjetaCreditoDescuento;
	public JButton jButtonGuardarCambiosTablaTarjetaCreditoDescuento;
	protected JButton jButtonCerrarTarjetaCreditoDescuento;
	
	
	protected JButton jButtonProcesarInformacionTarjetaCreditoDescuento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTarjetaCreditoDescuento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetaCreditoDescuento;
	protected JButton jButtonModificarToolBarTarjetaCreditoDescuento;
	protected JButton jButtonActualizarToolBarTarjetaCreditoDescuento;
    protected JButton jButtonEliminarToolBarTarjetaCreditoDescuento;
	protected JButton jButtonCancelarToolBarTarjetaCreditoDescuento;
    protected JButton jButtonGuardarCambiosToolBarTarjetaCreditoDescuento;
	protected JButton jButtonGuardarCambiosTablaToolBarTarjetaCreditoDescuento;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetaCreditoDescuento;
	protected JButton jButtonCerrarToolBarTarjetaCreditoDescuento;
	
	protected JButton jButtonProcesarInformacionToolBarTarjetaCreditoDescuento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemModificarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemActualizarTarjetaCreditoDescuento;
    protected JMenuItem jMenuItemEliminarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemCancelarTarjetaCreditoDescuento;
    protected JMenuItem jMenuItemGuardarCambiosTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemCerrarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemDetalleCerrarTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento;
	
	protected JMenuItem jMenuItemProcesarInformacionTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetaCreditoDescuento;
	protected JMenuItem jMenuItemMostrarOcultarTarjetaCreditoDescuento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetaCreditoDescuento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetaCreditoDescuento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTarjetaCreditoDescuento;
	public JLabel jLabelIdTarjetaCreditoDescuento;
	public JLabel jLabelidTarjetaCreditoDescuento;
	public JButton jButtonidTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeTarjetaCreditoDescuento;
	public JLabel jLabelporcentajeTarjetaCreditoDescuento;
	public JTextField jTextFieldporcentajeTarjetaCreditoDescuento;
	public JButton jButtonporcentajeTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mesesTarjetaCreditoDescuento;
	public JLabel jLabelnumero_mesesTarjetaCreditoDescuento;
	public JTextField jTextFieldnumero_mesesTarjetaCreditoDescuento;
	public JButton jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	public JPanel jPaneles_corrienteTarjetaCreditoDescuento;
	public JLabel jLabeles_corrienteTarjetaCreditoDescuento;
	public JCheckBox jCheckBoxes_corrienteTarjetaCreditoDescuento;
	public JButton jButtones_corrienteTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	public JPanel jPanelcon_interesTarjetaCreditoDescuento;
	public JLabel jLabelcon_interesTarjetaCreditoDescuento;
	public JCheckBox jCheckBoxcon_interesTarjetaCreditoDescuento;
	public JButton jButtoncon_interesTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTarjetaCreditoDescuento;
	public JLabel jLabelid_empresaTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTarjetaCreditoDescuento;
	public JButton jButtonid_empresaTarjetaCreditoDescuento= new JButtonMe();
	public JButton jButtonid_empresaTarjetaCreditoDescuentoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTarjetaCreditoDescuento;
	public JLabel jLabelid_sucursalTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTarjetaCreditoDescuento;
	public JButton jButtonid_sucursalTarjetaCreditoDescuento= new JButtonMe();
	public JButton jButtonid_sucursalTarjetaCreditoDescuentoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	public JPanel jPanelid_tarjeta_creditoTarjetaCreditoDescuento;
	public JLabel jLabelid_tarjeta_creditoTarjetaCreditoDescuento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento;
	public JButton jButtonid_tarjeta_creditoTarjetaCreditoDescuento= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTarjetaCreditoDescuento;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTarjetaCreditoDescuento=new JPanel();
				this.jPanelAccionesFormularioTarjetaCreditoDescuento=new JPanel();
				this.jmenuBarDetalleTarjetaCreditoDescuento=new JMenuBar();
				this.jTtoolBarDetalleTarjetaCreditoDescuento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDescuentoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetaCreditoDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTarjetaCreditoDescuento() {
		return this.jButtonActualizarToolBarTarjetaCreditoDescuento;
	}
	
	public JButton getjButtonEliminarToolBarTarjetaCreditoDescuento() {
		return this.jButtonEliminarToolBarTarjetaCreditoDescuento;
	}
	
	public JButton getjButtonCancelarToolBarTarjetaCreditoDescuento() {
		return this.jButtonCancelarToolBarTarjetaCreditoDescuento;
	}		
	
	public JButton getjButtonProcesarInformacionTarjetaCreditoDescuento() {
		return this.jButtonProcesarInformacionTarjetaCreditoDescuento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetaCreditoDescuento)	{
		this.jButtonProcesarInformacionTarjetaCreditoDescuento = jButtonProcesarInformacionTarjetaCreditoDescuento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetaCreditoDescuento() {
		return this.jComboBoxTiposAccionesTarjetaCreditoDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposRelacionesTarjetaCreditoDescuento) {
		this.jComboBoxTiposRelacionesTarjetaCreditoDescuento = jComboBoxTiposRelacionesTarjetaCreditoDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposAccionesTarjetaCreditoDescuento) {
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento = jComboBoxTiposAccionesTarjetaCreditoDescuento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTarjetaCreditoDescuento() {
		return this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTarjetaCreditoDescuento(
			JComboBox jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento) {
		this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento = jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		
		this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetaCreditoDescuentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito Descuento MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
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
	
		TarjetaCreditoDescuentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTarjetaCreditoDescuento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTarjetaCreditoDescuento=new JButtonMe();
				this.jButtonModificarToolBarTarjetaCreditoDescuento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTarjetaCreditoDescuento,this.jTtoolBarDetalleTarjetaCreditoDescuento,
							"actualizar","actualizar","Actualizar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTarjetaCreditoDescuento,this.jTtoolBarDetalleTarjetaCreditoDescuento,
							"eliminar","eliminar","Eliminar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTarjetaCreditoDescuento,this.jTtoolBarDetalleTarjetaCreditoDescuento,
							"cancelar","cancelar","Cancelar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTarjetaCreditoDescuento,this.jTtoolBarDetalleTarjetaCreditoDescuento,
							"guardarcambios","guardarcambios","Guardar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTarjetaCreditoDescuento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTarjetaCreditoDescuento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTarjetaCreditoDescuento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTarjetaCreditoDescuento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTarjetaCreditoDescuento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetaCreditoDescuento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetaCreditoDescuento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetaCreditoDescuento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTarjetaCreditoDescuento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTarjetaCreditoDescuento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTarjetaCreditoDescuento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTarjetaCreditoDescuento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTarjetaCreditoDescuento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTarjetaCreditoDescuento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTarjetaCreditoDescuento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTarjetaCreditoDescuento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTarjetaCreditoDescuento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTarjetaCreditoDescuento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTarjetaCreditoDescuento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTarjetaCreditoDescuento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTarjetaCreditoDescuento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetaCreditoDescuento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetaCreditoDescuento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetaCreditoDescuento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetaCreditoDescuento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetaCreditoDescuento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTarjetaCreditoDescuento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTarjetaCreditoDescuento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTarjetaCreditoDescuento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetaCreditoDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetaCreditoDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetaCreditoDescuento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTarjetaCreditoDescuento.add(this.jMenuItemDetalleCerrarTarjetaCreditoDescuento);
		
		this.jmenuDetalleAccionesTarjetaCreditoDescuento.add(this.jMenuItemActualizarTarjetaCreditoDescuento);
		this.jmenuDetalleAccionesTarjetaCreditoDescuento.add(this.jMenuItemEliminarTarjetaCreditoDescuento);
		this.jmenuDetalleAccionesTarjetaCreditoDescuento.add(this.jMenuItemCancelarTarjetaCreditoDescuento);		
		
		//this.jmenuDetalleDatosTarjetaCreditoDescuento.add(this.jMenuItemDetalleAbrirOrderByTarjetaCreditoDescuento);				
		this.jmenuDetalleDatosTarjetaCreditoDescuento.add(this.jMenuItemDetalleMostarOcultarTarjetaCreditoDescuento);				
				
		//this.jmenuDetalleAccionesTarjetaCreditoDescuento.add(this.jMenuItemGuardarCambiosTarjetaCreditoDescuento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTarjetaCreditoDescuento.add(this.jmenuDetalleArchivoTarjetaCreditoDescuento);		
		this.jmenuBarDetalleTarjetaCreditoDescuento.add(this.jmenuDetalleAccionesTarjetaCreditoDescuento);		
		this.jmenuBarDetalleTarjetaCreditoDescuento.add(this.jmenuDetalleDatosTarjetaCreditoDescuento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTarjetaCreditoDescuento);				
	}
	
	
	public void inicializarElementosCamposTarjetaCreditoDescuento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTarjetaCreditoDescuento = new JLabelMe();
		jLabelIdTarjetaCreditoDescuento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTarjetaCreditoDescuento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTarjetaCreditoDescuento= new GridBagLayout();

		this.jPanelidTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);

		jLabelidTarjetaCreditoDescuento = new JLabel();
		jLabelidTarjetaCreditoDescuento.setText("Id");

		jLabelidTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeTarjetaCreditoDescuento = new JLabelMe();
		this.jLabelporcentajeTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeTarjetaCreditoDescuento.setToolTipText("Porcentaje");
		this.jLabelporcentajeTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPanelporcentajeTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jTextFieldporcentajeTarjetaCreditoDescuento= new JTextFieldMe();
		jTextFieldporcentajeTarjetaCreditoDescuento.setEnabled(false);
		jTextFieldporcentajeTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeTarjetaCreditoDescuento.setText("0.0");

		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeTarjetaCreditoDescuentoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mesesTarjetaCreditoDescuento = new JLabelMe();
		this.jLabelnumero_mesesTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES+" : *");
		this.jLabelnumero_mesesTarjetaCreditoDescuento.setToolTipText("Numero Meses");
		this.jLabelnumero_mesesTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mesesTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mesesTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mesesTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mesesTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_NUMEROMESES);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPanelnumero_mesesTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jTextFieldnumero_mesesTarjetaCreditoDescuento= new JTextFieldMe();
		jTextFieldnumero_mesesTarjetaCreditoDescuento.setEnabled(false);
		jTextFieldnumero_mesesTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mesesTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_mesesTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_mesesTarjetaCreditoDescuento.setText("0");

		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_mesesTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_mesesTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mesesTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda.setVisible(false);		}


					
		this.jLabeles_corrienteTarjetaCreditoDescuento = new JLabelMe();
		this.jLabeles_corrienteTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE+" : *");
		this.jLabeles_corrienteTarjetaCreditoDescuento.setToolTipText("Es Corriente");
		this.jLabeles_corrienteTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_corrienteTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_corrienteTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_corrienteTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_corrienteTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_corrienteTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_ESCORRIENTE);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPaneles_corrienteTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jCheckBoxes_corrienteTarjetaCreditoDescuento= new JCheckBoxMe();
		jCheckBoxes_corrienteTarjetaCreditoDescuento.setEnabled(false);

		jCheckBoxes_corrienteTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_corrienteTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_corrienteTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_corrienteTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_corrienteTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_corrienteTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_corrienteTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_corrienteTarjetaCreditoDescuentoBusqueda.setVisible(false);		}


					
		this.jLabelcon_interesTarjetaCreditoDescuento = new JLabelMe();
		this.jLabelcon_interesTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES+" : *");
		this.jLabelcon_interesTarjetaCreditoDescuento.setToolTipText("Con Interes");
		this.jLabelcon_interesTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_interesTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_interesTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_interesTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_interesTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_interesTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_CONINTERES);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPanelcon_interesTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jCheckBoxcon_interesTarjetaCreditoDescuento= new JCheckBoxMe();
		jCheckBoxcon_interesTarjetaCreditoDescuento.setEnabled(false);

		jCheckBoxcon_interesTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_interesTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_interesTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_interesTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_interesTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_interesTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_interesTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_interesTarjetaCreditoDescuentoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTarjetaCreditoDescuento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTarjetaCreditoDescuento = new JLabelMe();
		this.jLabelid_empresaTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTarjetaCreditoDescuento.setToolTipText("Empresa");
		this.jLabelid_empresaTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPanelid_empresaTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jComboBoxid_empresaTarjetaCreditoDescuento= new JComboBoxMe();
		jComboBoxid_empresaTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTarjetaCreditoDescuento.setEnabled(false);

		this.jButtonid_empresaTarjetaCreditoDescuento= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoDescuento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCreditoDescuento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCreditoDescuento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCreditoDescuento.setText("Buscar");
		this.jButtonid_empresaTarjetaCreditoDescuento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTarjetaCreditoDescuento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoDescuento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoDescuento"));

		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTarjetaCreditoDescuentoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTarjetaCreditoDescuentoUpdate= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoDescuentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoDescuentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoDescuentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetaCreditoDescuentoUpdate.setText("U");
		this.jButtonid_empresaTarjetaCreditoDescuentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTarjetaCreditoDescuentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoDescuentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoDescuentoUpdate"));



					
		this.jLabelid_sucursalTarjetaCreditoDescuento = new JLabelMe();
		this.jLabelid_sucursalTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTarjetaCreditoDescuento.setToolTipText("Sucursal");
		this.jLabelid_sucursalTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPanelid_sucursalTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jComboBoxid_sucursalTarjetaCreditoDescuento= new JComboBoxMe();
		jComboBoxid_sucursalTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTarjetaCreditoDescuento.setEnabled(false);

		this.jButtonid_sucursalTarjetaCreditoDescuento= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoDescuento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCreditoDescuento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCreditoDescuento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCreditoDescuento.setText("Buscar");
		this.jButtonid_sucursalTarjetaCreditoDescuento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTarjetaCreditoDescuento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoDescuento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoDescuento"));

		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTarjetaCreditoDescuentoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.setText("U");
		this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoDescuentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoDescuentoUpdate"));



					
		this.jLabelid_tarjeta_creditoTarjetaCreditoDescuento = new JLabelMe();
		this.jLabelid_tarjeta_creditoTarjetaCreditoDescuento.setText(""+TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO+" : *");
		this.jLabelid_tarjeta_creditoTarjetaCreditoDescuento.setToolTipText("Tarjeta Credito");
		this.jLabelid_tarjeta_creditoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.setToolTipText(TarjetaCreditoDescuentoConstantesFunciones.LABEL_IDTARJETACREDITO);
		this.gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.setLayout(this.gridaBagLayoutTarjetaCreditoDescuento);


		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento.setText("Buscar");
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetaCreditoDescuento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetaCreditoDescuento"));

		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setText("U");
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetaCreditoDescuentoBusqueda"));

		if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda.setVisible(false);		}

		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate= new JButtonMe();
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.setText("U");
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoTarjetaCreditoDescuentoUpdate"));



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
		//this.jInternalFrameDetalleTarjetaCreditoDescuento = new TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tarjeta Credito Descuento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetaCreditoDescuento= new GridBagLayout();
		

		
		String sToolTipTarjetaCreditoDescuento="";
		sToolTipTarjetaCreditoDescuento=TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetaCreditoDescuento+="(PuntoVenta.TarjetaCreditoDescuento)";
		}
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetaCreditoDescuento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonModificarTarjetaCreditoDescuento = new JButtonMe();
        this.jButtonActualizarTarjetaCreditoDescuento = new JButtonMe();
        this.jButtonEliminarTarjetaCreditoDescuento = new JButtonMe();
        this.jButtonCancelarTarjetaCreditoDescuento = new JButtonMe();
        this.jButtonGuardarCambiosTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento = new JButtonMe();
		this.jButtonCerrarTarjetaCreditoDescuento = new JButtonMe();
		
		this.jScrollPanelDatosTarjetaCreditoDescuento = new JScrollPane();   
        this.jScrollPanelDatosEdicionTarjetaCreditoDescuento = new JScrollPane();
		this.jScrollPanelDatosGeneralTarjetaCreditoDescuento = new JScrollPane();
				
		
		
		this.jPanelCamposTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito Descuento";
		
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Credito Descuentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetaCreditoDescuento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTarjetaCreditoDescuento.setName("jPanelCamposTarjetaCreditoDescuento"); 

		this.jPanelCamposOcultosTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTarjetaCreditoDescuento.setName("jPanelCamposOcultosTarjetaCreditoDescuento"); 

        this.jPanelAccionesTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetaCreditoDescuento.setToolTipText("Acciones");
        this.jPanelAccionesTarjetaCreditoDescuento.setName("Acciones"); 

		this.jPanelAccionesFormularioTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTarjetaCreditoDescuento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTarjetaCreditoDescuento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTarjetaCreditoDescuento.setText("Nuevo");
		this.jButtonModificarTarjetaCreditoDescuento.setText("Editar");
        this.jButtonActualizarTarjetaCreditoDescuento.setText("Actualizar");
        this.jButtonEliminarTarjetaCreditoDescuento.setText("Eliminar");
        this.jButtonCancelarTarjetaCreditoDescuento.setText("Cancelar");
        this.jButtonGuardarCambiosTarjetaCreditoDescuento.setText("Guardar");
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.setText("Guardar");
		this.jButtonCerrarTarjetaCreditoDescuento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetaCreditoDescuento,"nuevo_button","Nuevo",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTarjetaCreditoDescuento,"modificar_button","Editar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTarjetaCreditoDescuento,"actualizar_button","Actualizar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTarjetaCreditoDescuento,"eliminar_button","Eliminar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTarjetaCreditoDescuento,"cancelar_button","Cancelar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTarjetaCreditoDescuento,"guardarcambios_button","Guardar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento,"guardarcambiostabla_button","Guardar",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetaCreditoDescuento,"cerrar_button","Salir",this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTarjetaCreditoDescuento.setToolTipText("Nuevo"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTarjetaCreditoDescuento.setToolTipText("Editar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTarjetaCreditoDescuento.setToolTipText("Actualizar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTarjetaCreditoDescuento.setToolTipText("Eliminar)"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTarjetaCreditoDescuento.setToolTipText("Cancelar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTarjetaCreditoDescuento.setToolTipText("Guardar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.setToolTipText("Guardar"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetaCreditoDescuento.setToolTipText("Salir"+" "+TarjetaCreditoDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetaCreditoDescuento";
		inputMap = this.jButtonNuevoTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetaCreditoDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetaCreditoDescuento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTarjetaCreditoDescuento";
		inputMap = this.jButtonActualizarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTarjetaCreditoDescuento"));
		
		//ELIMINAR
		sMapKey = "EliminarTarjetaCreditoDescuento";
		inputMap = this.jButtonEliminarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTarjetaCreditoDescuento"));
		
		//CANCELAR	
		sMapKey = "CancelarTarjetaCreditoDescuento";
		inputMap = this.jButtonCancelarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTarjetaCreditoDescuento"));
		
		//CERRAR		
		sMapKey = "CerrarTarjetaCreditoDescuento";
		inputMap = this.jButtonCerrarTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetaCreditoDescuento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetaCreditoDescuento";
		inputMap = this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetaCreditoDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetaCreditoDescuento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento.setToolTipText("Nuevo TarjetaCreditoDescuento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento.setToolTipText("Sin Cerrar Ventana TarjetaCreditoDescuento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setText("Accion");
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTarjetaCreditoDescuento = new JLabelMe();
		
		this.jLabelAccionesTarjetaCreditoDescuento.setText("Acciones");		
		this.jLabelAccionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTarjetaCreditoDescuento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTarjetaCreditoDescuento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTarjetaCreditoDescuento=new JTabbedPane();
		this.jTabbedPaneRelacionesTarjetaCreditoDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTarjetaCreditoDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTarjetaCreditoDescuento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTarjetaCreditoDescuento = new GridBagLayout();
		
		this.jPanelCamposTarjetaCreditoDescuento.setLayout(gridaBagLayoutCamposTarjetaCreditoDescuento);
		this.jPanelCamposOcultosTarjetaCreditoDescuento.setLayout(gridaBagLayoutCamposOcultosTarjetaCreditoDescuento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTarjetaCreditoDescuento.add(jLabelIdTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTarjetaCreditoDescuento.add(jLabelidTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTarjetaCreditoDescuento.add(jLabelid_empresaTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetaCreditoDescuento.add(jButtonid_empresaTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetaCreditoDescuento.add(jButtonid_empresaTarjetaCreditoDescuentoUpdate, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTarjetaCreditoDescuento.add(jComboBoxid_empresaTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTarjetaCreditoDescuento.add(jLabelid_sucursalTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetaCreditoDescuento.add(jButtonid_sucursalTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetaCreditoDescuento.add(jButtonid_sucursalTarjetaCreditoDescuentoUpdate, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTarjetaCreditoDescuento.add(jComboBoxid_sucursalTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.add(jLabelid_tarjeta_creditoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.add(jButtonid_tarjeta_creditoTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 3;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.add(jButtonid_tarjeta_creditoTarjetaCreditoDescuentoUpdate, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento.add(jComboBoxid_tarjeta_creditoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeTarjetaCreditoDescuento.add(jLabelporcentajeTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeTarjetaCreditoDescuento.add(jButtonporcentajeTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeTarjetaCreditoDescuento.add(jTextFieldporcentajeTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_mesesTarjetaCreditoDescuento.add(jLabelnumero_mesesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mesesTarjetaCreditoDescuento.add(jButtonnumero_mesesTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_mesesTarjetaCreditoDescuento.add(jTextFieldnumero_mesesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_corrienteTarjetaCreditoDescuento.add(jLabeles_corrienteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_corrienteTarjetaCreditoDescuento.add(jButtones_corrienteTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_corrienteTarjetaCreditoDescuento.add(jCheckBoxes_corrienteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_interesTarjetaCreditoDescuento.add(jLabelcon_interesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 2;
		this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_interesTarjetaCreditoDescuento.add(jButtoncon_interesTarjetaCreditoDescuentoBusqueda, this.gridBagConstraintsTarjetaCreditoDescuento);
	}

	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 1;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_interesTarjetaCreditoDescuento.add(jCheckBoxcon_interesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoDescuento.add(this.jPanelidTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposTarjetaCreditoDescuento=0;
		iYPanelCamposTarjetaCreditoDescuento++;
	}
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoDescuento.add(this.jPanelid_tarjeta_creditoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposTarjetaCreditoDescuento=0;
		iYPanelCamposTarjetaCreditoDescuento++;
	}
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoDescuento.add(this.jPanelporcentajeTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposTarjetaCreditoDescuento=0;
		iYPanelCamposTarjetaCreditoDescuento++;
	}
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoDescuento.add(this.jPanelnumero_mesesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposTarjetaCreditoDescuento=0;
		iYPanelCamposTarjetaCreditoDescuento++;
	}
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoDescuento.add(this.jPaneles_corrienteTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposTarjetaCreditoDescuento=0;
		iYPanelCamposTarjetaCreditoDescuento++;
	}
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTarjetaCreditoDescuento.add(this.jPanelcon_interesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposTarjetaCreditoDescuento=0;
		iYPanelCamposTarjetaCreditoDescuento++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposOcultosTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposOcultosTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetaCreditoDescuento.add(this.jPanelid_empresaTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposOcultosTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposOcultosTarjetaCreditoDescuento=0;
		iYPanelCamposOcultosTarjetaCreditoDescuento++;
	}
	this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iYPanelCamposOcultosTarjetaCreditoDescuento;
	this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iXPanelCamposOcultosTarjetaCreditoDescuento++;
	this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCreditoDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetaCreditoDescuento.add(this.jPanelid_sucursalTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);



	if(iXPanelCamposOcultosTarjetaCreditoDescuento % 1==0) {
		iXPanelCamposOcultosTarjetaCreditoDescuento=0;
		iYPanelCamposOcultosTarjetaCreditoDescuento++;
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
			
		GridBagLayout gridaBagLayoutAccionesTarjetaCreditoDescuento= new GridBagLayout();
		this.jPanelAccionesTarjetaCreditoDescuento.setLayout(gridaBagLayoutAccionesTarjetaCreditoDescuento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTarjetaCreditoDescuento= new GridBagLayout();
		this.jPanelAccionesFormularioTarjetaCreditoDescuento.setLayout(gridaBagLayoutAccionesFormularioTarjetaCreditoDescuento);
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetaCreditoDescuento.add(this.jComboBoxTiposAccionesFormularioTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetaCreditoDescuento.add(this.jCheckBoxPostAccionNuevoTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTarjetaCreditoDescuento.add(this.jCheckBoxPostAccionSinCerrarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tarjetacreditodescuentoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTarjetaCreditoDescuento.add(this.jCheckBoxPostAccionSinMensajeTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccion++;
			
		this.jPanelAccionesTarjetaCreditoDescuento.add(this.jButtonModificarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);							

		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iPosXAccion++;
			
		this.jPanelAccionesTarjetaCreditoDescuento.add(this.jButtonEliminarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetaCreditoDescuento.add(this.jButtonActualizarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);


		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetaCreditoDescuento.add(this.jButtonGuardarCambiosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);	
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = 0;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =iPosXAccion++;
		
		this.jPanelAccionesTarjetaCreditoDescuento.add(this.jButtonCancelarTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetaCreditoDescuento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetaCreditoDescuento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();						
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;		
			//this.gridBagConstraintsTarjetaCreditoDescuento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetaCreditoDescuento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =0;
		this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetaCreditoDescuento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TarjetaCreditoDescuentoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTarjetaCreditoDescuento = new TarjetaCreditoDescuentoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tarjeta Credito Descuento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tarjeta Credito Descuento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Descuento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TarjetaCreditoDescuentoModel tarjetacreditodescuentoModel=new TarjetaCreditoDescuentoModel(this);
			
			//SI USARA CLASE INTERNA
			//TarjetaCreditoDescuentoModel.TarjetaCreditoDescuentoFocusTraversalPolicy tarjetacreditodescuentoFocusTraversalPolicy = tarjetacreditodescuentoModel.new TarjetaCreditoDescuentoFocusTraversalPolicy(this);
			
			//tarjetacreditodescuentoFocusTraversalPolicy.settarjetacreditodescuentoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tarjetacreditodescuentoModel);
			
			
			this.jContentPaneDetalleTarjetaCreditoDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTarjetaCreditoDescuento = new GridBagLayout();	
			this.jContentPaneDetalleTarjetaCreditoDescuento.setLayout(gridaBagLayoutDetalleTarjetaCreditoDescuento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetaCreditoDescuento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
					
				
				this.jContentPaneDetalleTarjetaCreditoDescuento.add(jTtoolBarDetalleTarjetaCreditoDescuento, gridBagConstraintsTarjetaCreditoDescuento);								
				
}
			
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento=   new JScrollPane(jContentPaneDetalleTarjetaCreditoDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	        
			this.jContentPaneDetalleTarjetaCreditoDescuento.add(jPanelCamposTarjetaCreditoDescuento, gridBagConstraintsTarjetaCreditoDescuento);
			
			
			
			
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
						&& tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tarjetacreditodescuentoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTarjetaCreditoDescuento= new GridBagConstraints();
						this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
						this.jContentPaneDetalleTarjetaCreditoDescuento.add(this.jTabbedPaneRelacionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTarjetaCreditoDescuento.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTarjetaCreditoDescuento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
					this.gridBagConstraintsTarjetaCreditoDescuento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
					
				
					this.jContentPaneDetalleTarjetaCreditoDescuento.add(jPanelCamposOcultosTarjetaCreditoDescuento, gridBagConstraintsTarjetaCreditoDescuento);
				
					this.jPanelCamposOcultosTarjetaCreditoDescuento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	        this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTarjetaCreditoDescuento.add(this.jPanelAccionesFormularioTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);							
			
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
	        this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
	        
			
			this.jContentPaneDetalleTarjetaCreditoDescuento.add(this.jPanelAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTarjetaCreditoDescuento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento=   new JScrollPane(this.jPanelCamposTarjetaCreditoDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCreditoDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
			this.gridBagConstraintsTarjetaCreditoDescuento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTarjetaCreditoDescuento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTarjetaCreditoDescuento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);			
			
			this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
			
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		
			
		this.gridBagConstraintsTarjetaCreditoDescuento = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCreditoDescuento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCreditoDescuento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetaCreditoDescuento, this.gridBagConstraintsTarjetaCreditoDescuento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTarjetaCreditoDescuento;//jContentPane;
		
		return jScrollPanelDatosEdicionTarjetaCreditoDescuento;
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
