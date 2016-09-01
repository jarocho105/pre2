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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoCambioConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoCambioDetalleFormJInternalFrame extends TipoCambioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCambio;
	
	protected JMenuBar jmenuBarDetalleTipoCambio;
	
	protected JMenu jmenuDetalleTipoCambio;
	protected JMenu jmenuDetalleArchivoTipoCambio;
	protected JMenu jmenuDetalleAccionesTipoCambio;
	protected JMenu jmenuDetalleDatosTipoCambio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCambio;	
	protected GridBagConstraints gridBagConstraintsTipoCambio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCambioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCambio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";
	
	public TipoCambioSessionBean tipocambioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MonedaSessionBean monedaSessionBean;	
	
	public TipoCambioLogic tipocambioLogic;
	
	public JScrollPane jScrollPanelDatosTipoCambio;
	public JScrollPane jScrollPanelDatosEdicionTipoCambio;
	public JScrollPane jScrollPanelDatosGeneralTipoCambio;
	
	protected JPanel jPanelCamposTipoCambio;    
	protected JPanel jPanelCamposOcultosTipoCambio;    	
	protected JPanel jPanelAccionesTipoCambio;
	protected JPanel jPanelAccionesFormularioTipoCambio;
    
	
	
	protected Integer iXPanelCamposTipoCambio=0;
	protected Integer iYPanelCamposTipoCambio=0;
	
	protected Integer iXPanelCamposOcultosTipoCambio=0;
	protected Integer iYPanelCamposOcultosTipoCambio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCambio;
	public JButton jButtonModificarTipoCambio;
	public JButton jButtonActualizarTipoCambio;
    public JButton jButtonEliminarTipoCambio;
	public JButton jButtonCancelarTipoCambio;
    public JButton jButtonGuardarCambiosTipoCambio;
	public JButton jButtonGuardarCambiosTablaTipoCambio;
	protected JButton jButtonCerrarTipoCambio;
	
	
	protected JButton jButtonProcesarInformacionTipoCambio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCambio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCambio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCambio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCambio;
	protected JButton jButtonModificarToolBarTipoCambio;
	protected JButton jButtonActualizarToolBarTipoCambio;
    protected JButton jButtonEliminarToolBarTipoCambio;
	protected JButton jButtonCancelarToolBarTipoCambio;
    protected JButton jButtonGuardarCambiosToolBarTipoCambio;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCambio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCambio;
	protected JButton jButtonCerrarToolBarTipoCambio;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCambio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCambio;
	protected JMenuItem jMenuItemModificarTipoCambio;
	protected JMenuItem jMenuItemActualizarTipoCambio;
    protected JMenuItem jMenuItemEliminarTipoCambio;
	protected JMenuItem jMenuItemCancelarTipoCambio;
    protected JMenuItem jMenuItemGuardarCambiosTipoCambio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCambio;
	protected JMenuItem jMenuItemCerrarTipoCambio;
	protected JMenuItem jMenuItemDetalleCerrarTipoCambio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCambio;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCambio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCambio;
	protected JMenuItem jMenuItemMostrarOcultarTipoCambio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCambio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCambio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCambio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCambio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCambio;
	public JLabel jLabelIdTipoCambio;
	public JLabel jLabelidTipoCambio;
	public JButton jButtonidTipoCambioBusqueda= new JButtonMe();

	public JPanel jPanelvalor_compraTipoCambio;
	public JLabel jLabelvalor_compraTipoCambio;
	public JTextField jTextFieldvalor_compraTipoCambio;
	public JButton jButtonvalor_compraTipoCambioBusqueda= new JButtonMe();

	public JPanel jPanelvalor_ventaTipoCambio;
	public JLabel jLabelvalor_ventaTipoCambio;
	public JTextField jTextFieldvalor_ventaTipoCambio;
	public JButton jButtonvalor_ventaTipoCambioBusqueda= new JButtonMe();

	public JPanel jPanelfechaTipoCambio;
	public JLabel jLabelfechaTipoCambio;
	//public JFormattedTextField jDateChooserfechaTipoCambio;

	public JDateChooser jDateChooserfechaTipoCambio;
	public JButton jButtonfechaTipoCambioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCambio;
	public JLabel jLabelid_empresaTipoCambio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCambio;
	public JButton jButtonid_empresaTipoCambio= new JButtonMe();
	public JButton jButtonid_empresaTipoCambioUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCambioBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaTipoCambio;
	public JLabel jLabelid_monedaTipoCambio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaTipoCambio;
	public JButton jButtonid_monedaTipoCambio= new JButtonMe();
	public JButton jButtonid_monedaTipoCambioUpdate= new JButtonMe();
	public JButton jButtonid_monedaTipoCambioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCambio;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoCambioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCambio=new JPanel();
				this.jPanelAccionesFormularioTipoCambio=new JPanel();
				this.jmenuBarDetalleTipoCambio=new JMenuBar();
				this.jTtoolBarDetalleTipoCambio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCambioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCambioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCambio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCambio() {
		return this.jButtonActualizarToolBarTipoCambio;
	}
	
	public JButton getjButtonEliminarToolBarTipoCambio() {
		return this.jButtonEliminarToolBarTipoCambio;
	}
	
	public JButton getjButtonCancelarToolBarTipoCambio() {
		return this.jButtonCancelarToolBarTipoCambio;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCambio() {
		return this.jButtonProcesarInformacionTipoCambio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCambio)	{
		this.jButtonProcesarInformacionTipoCambio = jButtonProcesarInformacionTipoCambio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCambio() {
		return this.jComboBoxTiposAccionesTipoCambio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCambio(
			JComboBox jComboBoxTiposRelacionesTipoCambio) {
		this.jComboBoxTiposRelacionesTipoCambio = jComboBoxTiposRelacionesTipoCambio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCambio(
			JComboBox jComboBoxTiposAccionesTipoCambio) {
		this.jComboBoxTiposAccionesTipoCambio = jComboBoxTiposAccionesTipoCambio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCambio() {
		return this.jComboBoxTiposAccionesFormularioTipoCambio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCambio(
			JComboBox jComboBoxTiposAccionesFormularioTipoCambio) {
		this.jComboBoxTiposAccionesFormularioTipoCambio = jComboBoxTiposAccionesFormularioTipoCambio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocambioSessionBean=new TipoCambioSessionBean();
		
		this.tipocambioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocambioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocambioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCambioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCambioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCambioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cambio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCambioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCambio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCambio=new JButtonMe();
				this.jButtonModificarToolBarTipoCambio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCambio,this.jTtoolBarDetalleTipoCambio,
							"actualizar","actualizar","Actualizar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCambio,this.jTtoolBarDetalleTipoCambio,
							"eliminar","eliminar","Eliminar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCambio,this.jTtoolBarDetalleTipoCambio,
							"cancelar","cancelar","Cancelar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCambio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCambio,this.jTtoolBarDetalleTipoCambio,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCambio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCambio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCambio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCambio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCambio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCambio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCambio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCambio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCambio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCambio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCambio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCambio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCambio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCambio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCambio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCambio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCambio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCambio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCambio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCambio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCambio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCambio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCambio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCambio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCambio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCambio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCambio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCambio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCambio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCambio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCambio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCambio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCambio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCambio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCambio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCambio.add(this.jMenuItemDetalleCerrarTipoCambio);
		
		this.jmenuDetalleAccionesTipoCambio.add(this.jMenuItemActualizarTipoCambio);
		this.jmenuDetalleAccionesTipoCambio.add(this.jMenuItemEliminarTipoCambio);
		this.jmenuDetalleAccionesTipoCambio.add(this.jMenuItemCancelarTipoCambio);		
		
		//this.jmenuDetalleDatosTipoCambio.add(this.jMenuItemDetalleAbrirOrderByTipoCambio);				
		this.jmenuDetalleDatosTipoCambio.add(this.jMenuItemDetalleMostarOcultarTipoCambio);				
				
		//this.jmenuDetalleAccionesTipoCambio.add(this.jMenuItemGuardarCambiosTipoCambio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCambio.add(this.jmenuDetalleArchivoTipoCambio);		
		this.jmenuBarDetalleTipoCambio.add(this.jmenuDetalleAccionesTipoCambio);		
		this.jmenuBarDetalleTipoCambio.add(this.jmenuDetalleDatosTipoCambio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCambio);				
	}
	
	
	public void inicializarElementosCamposTipoCambio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCambio = new JLabelMe();
		jLabelIdTipoCambio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCambio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCambio.setToolTipText(TipoCambioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCambio= new GridBagLayout();

		this.jPanelidTipoCambio.setLayout(this.gridaBagLayoutTipoCambio);

		jLabelidTipoCambio = new JLabel();
		jLabelidTipoCambio.setText("Id");

		jLabelidTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_compraTipoCambio = new JLabelMe();
		this.jLabelvalor_compraTipoCambio.setText(""+TipoCambioConstantesFunciones.LABEL_VALORCOMPRA+" : *");
		this.jLabelvalor_compraTipoCambio.setToolTipText("Valor Compra");
		this.jLabelvalor_compraTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_compraTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_compraTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_compraTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_compraTipoCambio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_compraTipoCambio.setToolTipText(TipoCambioConstantesFunciones.LABEL_VALORCOMPRA);
		this.gridaBagLayoutTipoCambio = new GridBagLayout();
		this.jPanelvalor_compraTipoCambio.setLayout(this.gridaBagLayoutTipoCambio);


		jTextFieldvalor_compraTipoCambio= new JTextFieldMe();
		jTextFieldvalor_compraTipoCambio.setEnabled(false);
		jTextFieldvalor_compraTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_compraTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_compraTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_compraTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_compraTipoCambio.setText("0.0");

		this.jButtonvalor_compraTipoCambioBusqueda= new JButtonMe();
		this.jButtonvalor_compraTipoCambioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_compraTipoCambioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_compraTipoCambioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_compraTipoCambioBusqueda.setText("U");
		this.jButtonvalor_compraTipoCambioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_compraTipoCambioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_compraTipoCambioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_compraTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_compraTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_compraTipoCambioBusqueda"));

		if(this.tipocambioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_compraTipoCambioBusqueda.setVisible(false);		}


					
		this.jLabelvalor_ventaTipoCambio = new JLabelMe();
		this.jLabelvalor_ventaTipoCambio.setText(""+TipoCambioConstantesFunciones.LABEL_VALORVENTA+" : *");
		this.jLabelvalor_ventaTipoCambio.setToolTipText("Valor Venta");
		this.jLabelvalor_ventaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ventaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ventaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_ventaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_ventaTipoCambio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_ventaTipoCambio.setToolTipText(TipoCambioConstantesFunciones.LABEL_VALORVENTA);
		this.gridaBagLayoutTipoCambio = new GridBagLayout();
		this.jPanelvalor_ventaTipoCambio.setLayout(this.gridaBagLayoutTipoCambio);


		jTextFieldvalor_ventaTipoCambio= new JTextFieldMe();
		jTextFieldvalor_ventaTipoCambio.setEnabled(false);
		jTextFieldvalor_ventaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ventaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ventaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_ventaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_ventaTipoCambio.setText("0.0");

		this.jButtonvalor_ventaTipoCambioBusqueda= new JButtonMe();
		this.jButtonvalor_ventaTipoCambioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ventaTipoCambioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ventaTipoCambioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_ventaTipoCambioBusqueda.setText("U");
		this.jButtonvalor_ventaTipoCambioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_ventaTipoCambioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_ventaTipoCambioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_ventaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_ventaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_ventaTipoCambioBusqueda"));

		if(this.tipocambioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_ventaTipoCambioBusqueda.setVisible(false);		}


					
		this.jLabelfechaTipoCambio = new JLabelMe();
		this.jLabelfechaTipoCambio.setText(""+TipoCambioConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaTipoCambio.setToolTipText("Fecha");
		this.jLabelfechaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaTipoCambio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaTipoCambio.setToolTipText(TipoCambioConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutTipoCambio = new GridBagLayout();
		this.jPanelfechaTipoCambio.setLayout(this.gridaBagLayoutTipoCambio);


		//jFormattedTextFieldfechaTipoCambio= new JFormattedTextFieldMe();

		jDateChooserfechaTipoCambio= new JDateChooser();
		jDateChooserfechaTipoCambio.setEnabled(false);
		jDateChooserfechaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaTipoCambio.setDate(new Date());
		jDateChooserfechaTipoCambio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaTipoCambio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaTipoCambioBusqueda= new JButtonMe();
		this.jButtonfechaTipoCambioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTipoCambioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTipoCambioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaTipoCambioBusqueda.setText("U");
		this.jButtonfechaTipoCambioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaTipoCambioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaTipoCambioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaTipoCambioBusqueda"));

		if(this.tipocambioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaTipoCambioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCambio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCambio = new JLabelMe();
		this.jLabelid_empresaTipoCambio.setText(""+TipoCambioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCambio.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCambio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCambio.setToolTipText(TipoCambioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCambio = new GridBagLayout();
		this.jPanelid_empresaTipoCambio.setLayout(this.gridaBagLayoutTipoCambio);


		jComboBoxid_empresaTipoCambio= new JComboBoxMe();
		jComboBoxid_empresaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCambio.setEnabled(false);

		this.jButtonid_empresaTipoCambio= new JButtonMe();
		this.jButtonid_empresaTipoCambio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCambio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCambio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCambio.setText("Buscar");
		this.jButtonid_empresaTipoCambio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCambio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCambio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCambio"));

		this.jButtonid_empresaTipoCambioBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCambioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCambioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCambioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCambioBusqueda.setText("U");
		this.jButtonid_empresaTipoCambioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCambioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCambioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCambioBusqueda"));

		if(this.tipocambioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCambioBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCambioUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCambioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCambioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCambioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCambioUpdate.setText("U");
		this.jButtonid_empresaTipoCambioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCambioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCambioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCambioUpdate"));



					
		this.jLabelid_monedaTipoCambio = new JLabelMe();
		this.jLabelid_monedaTipoCambio.setText(""+TipoCambioConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaTipoCambio.setToolTipText("Moneda");
		this.jLabelid_monedaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaTipoCambio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaTipoCambio.setToolTipText(TipoCambioConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutTipoCambio = new GridBagLayout();
		this.jPanelid_monedaTipoCambio.setLayout(this.gridaBagLayoutTipoCambio);


		jComboBoxid_monedaTipoCambio= new JComboBoxMe();
		jComboBoxid_monedaTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaTipoCambio= new JButtonMe();
		this.jButtonid_monedaTipoCambio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTipoCambio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTipoCambio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTipoCambio.setText("Buscar");
		this.jButtonid_monedaTipoCambio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaTipoCambio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTipoCambio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTipoCambio"));

		this.jButtonid_monedaTipoCambioBusqueda= new JButtonMe();
		this.jButtonid_monedaTipoCambioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTipoCambioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTipoCambioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaTipoCambioBusqueda.setText("U");
		this.jButtonid_monedaTipoCambioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaTipoCambioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTipoCambioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTipoCambioBusqueda"));

		if(this.tipocambioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaTipoCambioBusqueda.setVisible(false);		}

		this.jButtonid_monedaTipoCambioUpdate= new JButtonMe();
		this.jButtonid_monedaTipoCambioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTipoCambioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTipoCambioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaTipoCambioUpdate.setText("U");
		this.jButtonid_monedaTipoCambioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaTipoCambioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTipoCambioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaTipoCambio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTipoCambio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTipoCambioUpdate"));



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
		//this.jInternalFrameDetalleTipoCambio = new TipoCambioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cambio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCambio= new GridBagLayout();
		

		
		String sToolTipTipoCambio="";
		sToolTipTipoCambio=TipoCambioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCambio+="(Contabilidad.TipoCambio)";
		}
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCambio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCambio = new JButtonMe();
		this.jButtonModificarTipoCambio = new JButtonMe();
        this.jButtonActualizarTipoCambio = new JButtonMe();
        this.jButtonEliminarTipoCambio = new JButtonMe();
        this.jButtonCancelarTipoCambio = new JButtonMe();
        this.jButtonGuardarCambiosTipoCambio = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCambio = new JButtonMe();
		this.jButtonCerrarTipoCambio = new JButtonMe();
		
		this.jScrollPanelDatosTipoCambio = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCambio = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCambio = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cambio";
		
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cambios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCambio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCambio.setName("jPanelCamposTipoCambio"); 

		this.jPanelCamposOcultosTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCambio.setName("jPanelCamposOcultosTipoCambio"); 

        this.jPanelAccionesTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCambio.setToolTipText("Acciones");
        this.jPanelAccionesTipoCambio.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCambio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCambio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCambio.setText("Nuevo");
		this.jButtonModificarTipoCambio.setText("Editar");
        this.jButtonActualizarTipoCambio.setText("Actualizar");
        this.jButtonEliminarTipoCambio.setText("Eliminar");
        this.jButtonCancelarTipoCambio.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCambio.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCambio.setText("Guardar");
		this.jButtonCerrarTipoCambio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCambio,"nuevo_button","Nuevo",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCambio,"modificar_button","Editar",this.tipocambioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCambio,"actualizar_button","Actualizar",this.tipocambioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCambio,"eliminar_button","Eliminar",this.tipocambioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCambio,"cancelar_button","Cancelar",this.tipocambioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCambio,"guardarcambios_button","Guardar",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCambio,"guardarcambiostabla_button","Guardar",this.tipocambioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCambio,"cerrar_button","Salir",this.tipocambioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCambio.setToolTipText("Nuevo"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCambio.setToolTipText("Editar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCambio.setToolTipText("Actualizar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCambio.setToolTipText("Eliminar)"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCambio.setToolTipText("Cancelar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCambio.setToolTipText("Guardar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCambio.setToolTipText("Guardar"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCambio.setToolTipText("Salir"+" "+TipoCambioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCambio";
		inputMap = this.jButtonNuevoTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCambio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCambio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCambio";
		inputMap = this.jButtonActualizarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCambio"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCambio";
		inputMap = this.jButtonEliminarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCambio"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCambio";
		inputMap = this.jButtonCancelarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCambio"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCambio";
		inputMap = this.jButtonCerrarTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCambio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCambio";
		inputMap = this.jButtonGuardarCambiosTablaTipoCambio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCambio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCambio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCambio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCambio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCambio.setToolTipText("Nuevo TipoCambio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCambio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCambio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCambio.setToolTipText("Sin Cerrar Ventana TipoCambio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCambio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCambio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCambio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCambio.setText("Accion");
		this.jComboBoxTiposAccionesTipoCambio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCambio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCambio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCambio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCambio = new JLabelMe();
		
		this.jLabelAccionesTipoCambio.setText("Acciones");		
		this.jLabelAccionesTipoCambio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCambio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCambio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCambio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCambio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCambio=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCambio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCambio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCambio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCambio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCambio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCambio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCambio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCambio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCambio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCambio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCambio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCambio = new GridBagLayout();
		
		this.jPanelCamposTipoCambio.setLayout(gridaBagLayoutCamposTipoCambio);
		this.jPanelCamposOcultosTipoCambio.setLayout(gridaBagLayoutCamposOcultosTipoCambio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 0;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCambio.add(jLabelIdTipoCambio, this.gridBagConstraintsTipoCambio);



	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 1;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCambio.add(jLabelidTipoCambio, this.gridBagConstraintsTipoCambio);


	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 0;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCambio.add(jLabelid_empresaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 2;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCambio.add(jButtonid_empresaTipoCambioBusqueda, this.gridBagConstraintsTipoCambio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 3;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCambio.add(jButtonid_empresaTipoCambioUpdate, this.gridBagConstraintsTipoCambio);
	}

	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 1;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCambio.add(jComboBoxid_empresaTipoCambio, this.gridBagConstraintsTipoCambio);


	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 0;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaTipoCambio.add(jLabelid_monedaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 2;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaTipoCambio.add(jButtonid_monedaTipoCambioBusqueda, this.gridBagConstraintsTipoCambio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 3;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaTipoCambio.add(jButtonid_monedaTipoCambioUpdate, this.gridBagConstraintsTipoCambio);
	}

	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 1;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaTipoCambio.add(jComboBoxid_monedaTipoCambio, this.gridBagConstraintsTipoCambio);


	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 0;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_compraTipoCambio.add(jLabelvalor_compraTipoCambio, this.gridBagConstraintsTipoCambio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 2;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_compraTipoCambio.add(jButtonvalor_compraTipoCambioBusqueda, this.gridBagConstraintsTipoCambio);
	}

	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 1;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_compraTipoCambio.add(jTextFieldvalor_compraTipoCambio, this.gridBagConstraintsTipoCambio);


	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 0;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_ventaTipoCambio.add(jLabelvalor_ventaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 2;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_ventaTipoCambio.add(jButtonvalor_ventaTipoCambioBusqueda, this.gridBagConstraintsTipoCambio);
	}

	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 1;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_ventaTipoCambio.add(jTextFieldvalor_ventaTipoCambio, this.gridBagConstraintsTipoCambio);


	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 0;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaTipoCambio.add(jLabelfechaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		//this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = 2;
		this.gridBagConstraintsTipoCambio.ipadx = 0;
		this.gridBagConstraintsTipoCambio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaTipoCambio.add(jButtonfechaTipoCambioBusqueda, this.gridBagConstraintsTipoCambio);
	}

	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCambio.gridy = 0;
	this.gridBagConstraintsTipoCambio.gridx = 1;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaTipoCambio.add(jDateChooserfechaTipoCambio, this.gridBagConstraintsTipoCambio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCambio.gridy = iYPanelCamposTipoCambio;
	this.gridBagConstraintsTipoCambio.gridx = iXPanelCamposTipoCambio++;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCambio.add(this.jPanelidTipoCambio, this.gridBagConstraintsTipoCambio);



	if(iXPanelCamposTipoCambio % 1==0) {
		iXPanelCamposTipoCambio=0;
		iYPanelCamposTipoCambio++;
	}
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCambio.gridy = iYPanelCamposTipoCambio;
	this.gridBagConstraintsTipoCambio.gridx = iXPanelCamposTipoCambio++;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCambio.add(this.jPanelid_monedaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(iXPanelCamposTipoCambio % 1==0) {
		iXPanelCamposTipoCambio=0;
		iYPanelCamposTipoCambio++;
	}
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCambio.gridy = iYPanelCamposTipoCambio;
	this.gridBagConstraintsTipoCambio.gridx = iXPanelCamposTipoCambio++;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCambio.add(this.jPanelvalor_compraTipoCambio, this.gridBagConstraintsTipoCambio);



	if(iXPanelCamposTipoCambio % 1==0) {
		iXPanelCamposTipoCambio=0;
		iYPanelCamposTipoCambio++;
	}
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCambio.gridy = iYPanelCamposTipoCambio;
	this.gridBagConstraintsTipoCambio.gridx = iXPanelCamposTipoCambio++;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCambio.add(this.jPanelvalor_ventaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(iXPanelCamposTipoCambio % 1==0) {
		iXPanelCamposTipoCambio=0;
		iYPanelCamposTipoCambio++;
	}
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCambio.gridy = iYPanelCamposTipoCambio;
	this.gridBagConstraintsTipoCambio.gridx = iXPanelCamposTipoCambio++;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCambio.add(this.jPanelfechaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(iXPanelCamposTipoCambio % 1==0) {
		iXPanelCamposTipoCambio=0;
		iYPanelCamposTipoCambio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCambio.gridy = iYPanelCamposOcultosTipoCambio;
	this.gridBagConstraintsTipoCambio.gridx = iXPanelCamposOcultosTipoCambio++;
	this.gridBagConstraintsTipoCambio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCambio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCambio.add(this.jPanelid_empresaTipoCambio, this.gridBagConstraintsTipoCambio);



	if(iXPanelCamposOcultosTipoCambio % 1==0) {
		iXPanelCamposOcultosTipoCambio=0;
		iYPanelCamposOcultosTipoCambio++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCambio= new GridBagLayout();
		this.jPanelAccionesTipoCambio.setLayout(gridaBagLayoutAccionesTipoCambio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCambio= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCambio.setLayout(gridaBagLayoutAccionesFormularioTipoCambio);
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCambio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCambio.add(this.jComboBoxTiposAccionesFormularioTipoCambio, this.gridBagConstraintsTipoCambio);

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCambio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCambio.add(this.jCheckBoxPostAccionNuevoTipoCambio, this.gridBagConstraintsTipoCambio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocambioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCambio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCambio.add(this.jCheckBoxPostAccionSinCerrarTipoCambio, this.gridBagConstraintsTipoCambio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocambioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocambioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCambio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCambio.add(this.jCheckBoxPostAccionSinMensajeTipoCambio, this.gridBagConstraintsTipoCambio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCambio.add(this.jButtonModificarTipoCambio, this.gridBagConstraintsTipoCambio);							

		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCambio.gridy = 0;
		this.gridBagConstraintsTipoCambio.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCambio.add(this.jButtonEliminarTipoCambio, this.gridBagConstraintsTipoCambio);
		
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = 0;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCambio.add(this.jButtonActualizarTipoCambio, this.gridBagConstraintsTipoCambio);


		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = 0;		
		this.gridBagConstraintsTipoCambio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCambio.add(this.jButtonGuardarCambiosTipoCambio, this.gridBagConstraintsTipoCambio);	
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = 0;		
		this.gridBagConstraintsTipoCambio.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCambio.add(this.jButtonCancelarTipoCambio, this.gridBagConstraintsTipoCambio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCambio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCambio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocambioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();						
			this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCambio.gridx = 0;		
			//this.gridBagConstraintsTipoCambio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCambio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCambio.gridx =0;
		this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCambio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCambio, this.gridBagConstraintsTipoCambio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCambioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCambio = new TipoCambioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cambio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cambio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cambio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCambioModel tipocambioModel=new TipoCambioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCambioModel.TipoCambioFocusTraversalPolicy tipocambioFocusTraversalPolicy = tipocambioModel.new TipoCambioFocusTraversalPolicy(this);
			
			//tipocambioFocusTraversalPolicy.settipocambioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocambioModel);
			
			
			this.jContentPaneDetalleTipoCambio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCambio = new GridBagLayout();	
			this.jContentPaneDetalleTipoCambio.setLayout(gridaBagLayoutDetalleTipoCambio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCambio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCambio = new GridBagConstraints();
				this.gridBagConstraintsTipoCambio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCambio.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCambio.add(jTtoolBarDetalleTipoCambio, gridBagConstraintsTipoCambio);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCambio=   new JScrollPane(jContentPaneDetalleTipoCambio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCambio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCambio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCambio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCambio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCambio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCambio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCambio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCambio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCambio.gridx = 0;
	        
			this.jContentPaneDetalleTipoCambio.add(jPanelCamposTipoCambio, gridBagConstraintsTipoCambio);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipocambioSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipocambioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCambio= new GridBagConstraints();
						this.gridBagConstraintsTipoCambio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCambio.gridx = 0;
						this.jContentPaneDetalleTipoCambio.add(this.jTabbedPaneRelacionesTipoCambio, this.gridBagConstraintsTipoCambio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCambio.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCambio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCambio = new GridBagConstraints();
					this.gridBagConstraintsTipoCambio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCambio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCambio.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCambio.add(jPanelCamposOcultosTipoCambio, gridBagConstraintsTipoCambio);
				
					this.jPanelCamposOcultosTipoCambio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCambio.gridx = 0;
	        this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCambio.add(this.jPanelAccionesFormularioTipoCambio, this.gridBagConstraintsTipoCambio);							
			
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
	        this.gridBagConstraintsTipoCambio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCambio.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCambio.add(this.jPanelAccionesTipoCambio, this.gridBagConstraintsTipoCambio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCambio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCambio=   new JScrollPane(this.jPanelCamposTipoCambio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCambio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCambio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCambio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCambio.gridx = 0;
			this.gridBagConstraintsTipoCambio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCambio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCambio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCambio, this.gridBagConstraintsTipoCambio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCambio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCambio, this.gridBagConstraintsTipoCambio);			
			
			this.gridBagConstraintsTipoCambio = new GridBagConstraints();
			this.gridBagConstraintsTipoCambio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCambio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCambio, this.gridBagConstraintsTipoCambio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCambio, this.gridBagConstraintsTipoCambio);
			
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCambio, this.gridBagConstraintsTipoCambio);
		
			
		this.gridBagConstraintsTipoCambio = new GridBagConstraints();
		this.gridBagConstraintsTipoCambio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCambio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCambio, this.gridBagConstraintsTipoCambio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCambio;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCambio;
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
