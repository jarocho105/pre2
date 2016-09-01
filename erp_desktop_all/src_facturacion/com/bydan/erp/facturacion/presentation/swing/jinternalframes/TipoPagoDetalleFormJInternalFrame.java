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

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoPagoConstantesFunciones;

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
public class TipoPagoDetalleFormJInternalFrame extends TipoPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPago;
	
	protected JMenuBar jmenuBarDetalleTipoPago;
	
	protected JMenu jmenuDetalleTipoPago;
	protected JMenu jmenuDetalleArchivoTipoPago;
	protected JMenu jmenuDetalleAccionesTipoPago;
	protected JMenu jmenuDetalleDatosTipoPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPago;	
	protected GridBagConstraints gridBagConstraintsTipoPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPagoSessionBean tipopagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoPagoLogic tipopagoLogic;
	
	public JScrollPane jScrollPanelDatosTipoPago;
	public JScrollPane jScrollPanelDatosEdicionTipoPago;
	public JScrollPane jScrollPanelDatosGeneralTipoPago;
	
	protected JPanel jPanelCamposTipoPago;    
	protected JPanel jPanelCamposOcultosTipoPago;    	
	protected JPanel jPanelAccionesTipoPago;
	protected JPanel jPanelAccionesFormularioTipoPago;
    
	
	
	protected Integer iXPanelCamposTipoPago=0;
	protected Integer iYPanelCamposTipoPago=0;
	
	protected Integer iXPanelCamposOcultosTipoPago=0;
	protected Integer iYPanelCamposOcultosTipoPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPago;
	public JButton jButtonModificarTipoPago;
	public JButton jButtonActualizarTipoPago;
    public JButton jButtonEliminarTipoPago;
	public JButton jButtonCancelarTipoPago;
    public JButton jButtonGuardarCambiosTipoPago;
	public JButton jButtonGuardarCambiosTablaTipoPago;
	protected JButton jButtonCerrarTipoPago;
	
	
	protected JButton jButtonProcesarInformacionTipoPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPago;
	protected JButton jButtonModificarToolBarTipoPago;
	protected JButton jButtonActualizarToolBarTipoPago;
    protected JButton jButtonEliminarToolBarTipoPago;
	protected JButton jButtonCancelarToolBarTipoPago;
    protected JButton jButtonGuardarCambiosToolBarTipoPago;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPago;
	protected JButton jButtonCerrarToolBarTipoPago;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPago;
	protected JMenuItem jMenuItemModificarTipoPago;
	protected JMenuItem jMenuItemActualizarTipoPago;
    protected JMenuItem jMenuItemEliminarTipoPago;
	protected JMenuItem jMenuItemCancelarTipoPago;
    protected JMenuItem jMenuItemGuardarCambiosTipoPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPago;
	protected JMenuItem jMenuItemCerrarTipoPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPago;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPago;
	public JLabel jLabelIdTipoPago;
	public JLabel jLabelidTipoPago;
	public JButton jButtonidTipoPagoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPago;
	public JLabel jLabelcodigoTipoPago;
	public JTextField jTextFieldcodigoTipoPago;
	public JButton jButtoncodigoTipoPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPago;
	public JLabel jLabelnombreTipoPago;
	public JTextArea jTextAreanombreTipoPago;
	public JScrollPane jscrollPanenombreTipoPago;
	public JButton jButtonnombreTipoPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoPago;
	public JLabel jLabelid_empresaTipoPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoPago;
	public JButton jButtonid_empresaTipoPago= new JButtonMe();
	public JButton jButtonid_empresaTipoPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPago;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPago=new JPanel();
				this.jPanelAccionesFormularioTipoPago=new JPanel();
				this.jmenuBarDetalleTipoPago=new JMenuBar();
				this.jTtoolBarDetalleTipoPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPago() {
		return this.jButtonActualizarToolBarTipoPago;
	}
	
	public JButton getjButtonEliminarToolBarTipoPago() {
		return this.jButtonEliminarToolBarTipoPago;
	}
	
	public JButton getjButtonCancelarToolBarTipoPago() {
		return this.jButtonCancelarToolBarTipoPago;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPago() {
		return this.jButtonProcesarInformacionTipoPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPago)	{
		this.jButtonProcesarInformacionTipoPago = jButtonProcesarInformacionTipoPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPago() {
		return this.jComboBoxTiposAccionesTipoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPago(
			JComboBox jComboBoxTiposRelacionesTipoPago) {
		this.jComboBoxTiposRelacionesTipoPago = jComboBoxTiposRelacionesTipoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPago(
			JComboBox jComboBoxTiposAccionesTipoPago) {
		this.jComboBoxTiposAccionesTipoPago = jComboBoxTiposAccionesTipoPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPago() {
		return this.jComboBoxTiposAccionesFormularioTipoPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPago(
			JComboBox jComboBoxTiposAccionesFormularioTipoPago) {
		this.jComboBoxTiposAccionesFormularioTipoPago = jComboBoxTiposAccionesFormularioTipoPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipopagoSessionBean=new TipoPagoSessionBean();
		
		this.tipopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPago=new JButtonMe();
				this.jButtonModificarToolBarTipoPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPago,this.jTtoolBarDetalleTipoPago,
							"actualizar","actualizar","Actualizar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPago,this.jTtoolBarDetalleTipoPago,
							"eliminar","eliminar","Eliminar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPago,this.jTtoolBarDetalleTipoPago,
							"cancelar","cancelar","Cancelar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPago,this.jTtoolBarDetalleTipoPago,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPago.add(this.jMenuItemDetalleCerrarTipoPago);
		
		this.jmenuDetalleAccionesTipoPago.add(this.jMenuItemActualizarTipoPago);
		this.jmenuDetalleAccionesTipoPago.add(this.jMenuItemEliminarTipoPago);
		this.jmenuDetalleAccionesTipoPago.add(this.jMenuItemCancelarTipoPago);		
		
		//this.jmenuDetalleDatosTipoPago.add(this.jMenuItemDetalleAbrirOrderByTipoPago);				
		this.jmenuDetalleDatosTipoPago.add(this.jMenuItemDetalleMostarOcultarTipoPago);				
				
		//this.jmenuDetalleAccionesTipoPago.add(this.jMenuItemGuardarCambiosTipoPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPago.add(this.jmenuDetalleArchivoTipoPago);		
		this.jmenuBarDetalleTipoPago.add(this.jmenuDetalleAccionesTipoPago);		
		this.jmenuBarDetalleTipoPago.add(this.jmenuDetalleDatosTipoPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPago);				
	}
	
	
	public void inicializarElementosCamposTipoPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPago = new JLabelMe();
		jLabelIdTipoPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPago.setToolTipText(TipoPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPago= new GridBagLayout();

		this.jPanelidTipoPago.setLayout(this.gridaBagLayoutTipoPago);

		jLabelidTipoPago = new JLabel();
		jLabelidTipoPago.setText("Id");

		jLabelidTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPago = new JLabelMe();
		this.jLabelcodigoTipoPago.setText(""+TipoPagoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPago.setToolTipText("Codigo");
		this.jLabelcodigoTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPago.setToolTipText(TipoPagoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPago = new GridBagLayout();
		this.jPanelcodigoTipoPago.setLayout(this.gridaBagLayoutTipoPago);


		jTextFieldcodigoTipoPago= new JTextFieldMe();

		jTextFieldcodigoTipoPago.setEnabled(false);
		jTextFieldcodigoTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPagoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPagoBusqueda.setText("U");
		this.jButtoncodigoTipoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPagoBusqueda"));

		if(this.tipopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPago = new JLabelMe();
		this.jLabelnombreTipoPago.setText(""+TipoPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPago.setToolTipText("Nombre");
		this.jLabelnombreTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPago.setToolTipText(TipoPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPago = new GridBagLayout();
		this.jPanelnombreTipoPago.setLayout(this.gridaBagLayoutTipoPago);


		jTextAreanombreTipoPago= new JTextAreaMe();
		jTextAreanombreTipoPago.setEnabled(false);
		jTextAreanombreTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPago.setLineWrap(true);
		jTextAreanombreTipoPago.setWrapStyleWord(true);
		jTextAreanombreTipoPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPago = new JScrollPane(jTextAreanombreTipoPago);
		jscrollPanenombreTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPagoBusqueda= new JButtonMe();
		this.jButtonnombreTipoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPagoBusqueda.setText("U");
		this.jButtonnombreTipoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPagoBusqueda"));

		if(this.tipopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoPago = new JLabelMe();
		this.jLabelid_empresaTipoPago.setText(""+TipoPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoPago.setToolTipText("Empresa");
		this.jLabelid_empresaTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoPago.setToolTipText(TipoPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoPago = new GridBagLayout();
		this.jPanelid_empresaTipoPago.setLayout(this.gridaBagLayoutTipoPago);


		jComboBoxid_empresaTipoPago= new JComboBoxMe();
		jComboBoxid_empresaTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoPago.setEnabled(false);

		this.jButtonid_empresaTipoPago= new JButtonMe();
		this.jButtonid_empresaTipoPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPago.setText("Buscar");
		this.jButtonid_empresaTipoPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPago"));

		this.jButtonid_empresaTipoPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPagoBusqueda.setText("U");
		this.jButtonid_empresaTipoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPagoBusqueda"));

		if(this.tipopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoPagoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPagoUpdate.setText("U");
		this.jButtonid_empresaTipoPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPagoUpdate"));



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
		//this.jInternalFrameDetalleTipoPago = new TipoPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPago= new GridBagLayout();
		

		
		String sToolTipTipoPago="";
		sToolTipTipoPago=TipoPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPago+="(Facturacion.TipoPago)";
		}
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPago = new JButtonMe();
		this.jButtonModificarTipoPago = new JButtonMe();
        this.jButtonActualizarTipoPago = new JButtonMe();
        this.jButtonEliminarTipoPago = new JButtonMe();
        this.jButtonCancelarTipoPago = new JButtonMe();
        this.jButtonGuardarCambiosTipoPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPago = new JButtonMe();
		this.jButtonCerrarTipoPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPago = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPago = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Pago";
		
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPago.setName("jPanelCamposTipoPago"); 

		this.jPanelCamposOcultosTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPago.setName("jPanelCamposOcultosTipoPago"); 

        this.jPanelAccionesTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoPago.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPago.setText("Nuevo");
		this.jButtonModificarTipoPago.setText("Editar");
        this.jButtonActualizarTipoPago.setText("Actualizar");
        this.jButtonEliminarTipoPago.setText("Eliminar");
        this.jButtonCancelarTipoPago.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPago.setText("Guardar");
		this.jButtonCerrarTipoPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPago,"nuevo_button","Nuevo",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPago,"modificar_button","Editar",this.tipopagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPago,"actualizar_button","Actualizar",this.tipopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPago,"eliminar_button","Eliminar",this.tipopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPago,"cancelar_button","Cancelar",this.tipopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPago,"guardarcambios_button","Guardar",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPago,"guardarcambiostabla_button","Guardar",this.tipopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPago,"cerrar_button","Salir",this.tipopagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPago.setToolTipText("Nuevo"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPago.setToolTipText("Editar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPago.setToolTipText("Actualizar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPago.setToolTipText("Eliminar)"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPago.setToolTipText("Cancelar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPago.setToolTipText("Guardar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPago.setToolTipText("Guardar"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPago.setToolTipText("Salir"+" "+TipoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPago";
		inputMap = this.jButtonNuevoTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPago";
		inputMap = this.jButtonActualizarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPago"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPago";
		inputMap = this.jButtonEliminarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPago"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPago";
		inputMap = this.jButtonCancelarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPago"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPago";
		inputMap = this.jButtonCerrarTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPago.setToolTipText("Nuevo TipoPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPago.setToolTipText("Sin Cerrar Ventana TipoPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPago = new JLabelMe();
		
		this.jLabelAccionesTipoPago.setText("Acciones");		
		this.jLabelAccionesTipoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPago=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPago = new GridBagLayout();
		
		this.jPanelCamposTipoPago.setLayout(gridaBagLayoutCamposTipoPago);
		this.jPanelCamposOcultosTipoPago.setLayout(gridaBagLayoutCamposOcultosTipoPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 0;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPago.add(jLabelIdTipoPago, this.gridBagConstraintsTipoPago);



	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 1;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPago.add(jLabelidTipoPago, this.gridBagConstraintsTipoPago);


	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 0;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoPago.add(jLabelid_empresaTipoPago, this.gridBagConstraintsTipoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx = 2;
		this.gridBagConstraintsTipoPago.ipadx = 0;
		this.gridBagConstraintsTipoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPago.add(jButtonid_empresaTipoPagoBusqueda, this.gridBagConstraintsTipoPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx = 3;
		this.gridBagConstraintsTipoPago.ipadx = 0;
		this.gridBagConstraintsTipoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPago.add(jButtonid_empresaTipoPagoUpdate, this.gridBagConstraintsTipoPago);
	}

	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 1;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoPago.add(jComboBoxid_empresaTipoPago, this.gridBagConstraintsTipoPago);


	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 0;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPago.add(jLabelcodigoTipoPago, this.gridBagConstraintsTipoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx = 2;
		this.gridBagConstraintsTipoPago.ipadx = 0;
		this.gridBagConstraintsTipoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPago.add(jButtoncodigoTipoPagoBusqueda, this.gridBagConstraintsTipoPago);
	}

	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 1;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPago.add(jTextFieldcodigoTipoPago, this.gridBagConstraintsTipoPago);


	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 0;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPago.add(jLabelnombreTipoPago, this.gridBagConstraintsTipoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx = 2;
		this.gridBagConstraintsTipoPago.ipadx = 0;
		this.gridBagConstraintsTipoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPago.add(jButtonnombreTipoPagoBusqueda, this.gridBagConstraintsTipoPago);
	}

	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago.gridy = 0;
	this.gridBagConstraintsTipoPago.gridx = 1;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPago.add(jscrollPanenombreTipoPago, this.gridBagConstraintsTipoPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago.gridy = iYPanelCamposTipoPago;
	this.gridBagConstraintsTipoPago.gridx = iXPanelCamposTipoPago++;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPago.add(this.jPanelidTipoPago, this.gridBagConstraintsTipoPago);



	if(iXPanelCamposTipoPago % 1==0) {
		iXPanelCamposTipoPago=0;
		iYPanelCamposTipoPago++;
	}
	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago.gridy = iYPanelCamposTipoPago;
	this.gridBagConstraintsTipoPago.gridx = iXPanelCamposTipoPago++;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPago.add(this.jPanelcodigoTipoPago, this.gridBagConstraintsTipoPago);



	if(iXPanelCamposTipoPago % 1==0) {
		iXPanelCamposTipoPago=0;
		iYPanelCamposTipoPago++;
	}
	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago.gridy = iYPanelCamposTipoPago;
	this.gridBagConstraintsTipoPago.gridx = iXPanelCamposTipoPago++;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPago.add(this.jPanelnombreTipoPago, this.gridBagConstraintsTipoPago);



	if(iXPanelCamposTipoPago % 1==0) {
		iXPanelCamposTipoPago=0;
		iYPanelCamposTipoPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago.gridy = iYPanelCamposOcultosTipoPago;
	this.gridBagConstraintsTipoPago.gridx = iXPanelCamposOcultosTipoPago++;
	this.gridBagConstraintsTipoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoPago.add(this.jPanelid_empresaTipoPago, this.gridBagConstraintsTipoPago);



	if(iXPanelCamposOcultosTipoPago % 1==0) {
		iXPanelCamposOcultosTipoPago=0;
		iYPanelCamposOcultosTipoPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPago= new GridBagLayout();
		this.jPanelAccionesTipoPago.setLayout(gridaBagLayoutAccionesTipoPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPago= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPago.setLayout(gridaBagLayoutAccionesFormularioTipoPago);
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPago.add(this.jComboBoxTiposAccionesFormularioTipoPago, this.gridBagConstraintsTipoPago);

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPago.add(this.jCheckBoxPostAccionNuevoTipoPago, this.gridBagConstraintsTipoPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPago.add(this.jCheckBoxPostAccionSinCerrarTipoPago, this.gridBagConstraintsTipoPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipopagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipopagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPago.add(this.jCheckBoxPostAccionSinMensajeTipoPago, this.gridBagConstraintsTipoPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPago.add(this.jButtonModificarTipoPago, this.gridBagConstraintsTipoPago);							

		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago.gridy = 0;
		this.gridBagConstraintsTipoPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPago.add(this.jButtonEliminarTipoPago, this.gridBagConstraintsTipoPago);
		
			
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = 0;		
		this.gridBagConstraintsTipoPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPago.add(this.jButtonActualizarTipoPago, this.gridBagConstraintsTipoPago);


		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = 0;		
		this.gridBagConstraintsTipoPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPago.add(this.jButtonGuardarCambiosTipoPago, this.gridBagConstraintsTipoPago);	
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = 0;		
		this.gridBagConstraintsTipoPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPago.add(this.jButtonCancelarTipoPago, this.gridBagConstraintsTipoPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPago.gridx = 0;		
			//this.gridBagConstraintsTipoPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPago.gridx =0;
		this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPago, this.gridBagConstraintsTipoPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPago = new TipoPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPagoModel tipopagoModel=new TipoPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPagoModel.TipoPagoFocusTraversalPolicy tipopagoFocusTraversalPolicy = tipopagoModel.new TipoPagoFocusTraversalPolicy(this);
			
			//tipopagoFocusTraversalPolicy.settipopagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipopagoModel);
			
			
			this.jContentPaneDetalleTipoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPago = new GridBagLayout();	
			this.jContentPaneDetalleTipoPago.setLayout(gridaBagLayoutDetalleTipoPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPago = new GridBagConstraints();
				this.gridBagConstraintsTipoPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPago.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPago.add(jTtoolBarDetalleTipoPago, gridBagConstraintsTipoPago);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPago=   new JScrollPane(jContentPaneDetalleTipoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPago.gridx = 0;
	        
			this.jContentPaneDetalleTipoPago.add(jPanelCamposTipoPago, gridBagConstraintsTipoPago);
			
			
			
			
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
						&& tipopagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipopagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPago= new GridBagConstraints();
						this.gridBagConstraintsTipoPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPago.gridx = 0;
						this.jContentPaneDetalleTipoPago.add(this.jTabbedPaneRelacionesTipoPago, this.gridBagConstraintsTipoPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPago = new GridBagConstraints();
					this.gridBagConstraintsTipoPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPago.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPago.add(jPanelCamposOcultosTipoPago, gridBagConstraintsTipoPago);
				
					this.jPanelCamposOcultosTipoPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoPago.gridx = 0;
	        this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPago.add(this.jPanelAccionesFormularioTipoPago, this.gridBagConstraintsTipoPago);							
			
			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
	        this.gridBagConstraintsTipoPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoPago.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPago.add(this.jPanelAccionesTipoPago, this.gridBagConstraintsTipoPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPago=   new JScrollPane(this.jPanelCamposTipoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPago.gridx = 0;
			this.gridBagConstraintsTipoPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPago, this.gridBagConstraintsTipoPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPago, this.gridBagConstraintsTipoPago);			
			
			this.gridBagConstraintsTipoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPago, this.gridBagConstraintsTipoPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPago, this.gridBagConstraintsTipoPago);
			
			
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPago, this.gridBagConstraintsTipoPago);
		
			
		this.gridBagConstraintsTipoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPago, this.gridBagConstraintsTipoPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPago;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPago;
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
