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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoAutoPagoConstantesFunciones;

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
public class TipoAutoPagoDetalleFormJInternalFrame extends TipoAutoPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoAutoPago;
	
	protected JMenuBar jmenuBarDetalleTipoAutoPago;
	
	protected JMenu jmenuDetalleTipoAutoPago;
	protected JMenu jmenuDetalleArchivoTipoAutoPago;
	protected JMenu jmenuDetalleAccionesTipoAutoPago;
	protected JMenu jmenuDetalleDatosTipoAutoPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAutoPago;	
	protected GridBagConstraints gridBagConstraintsTipoAutoPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoAutoPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoAutoPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAutoPagoSessionBean tipoautopagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoAutoPagoLogic tipoautopagoLogic;
	
	public JScrollPane jScrollPanelDatosTipoAutoPago;
	public JScrollPane jScrollPanelDatosEdicionTipoAutoPago;
	public JScrollPane jScrollPanelDatosGeneralTipoAutoPago;
	
	protected JPanel jPanelCamposTipoAutoPago;    
	protected JPanel jPanelCamposOcultosTipoAutoPago;    	
	protected JPanel jPanelAccionesTipoAutoPago;
	protected JPanel jPanelAccionesFormularioTipoAutoPago;
    
	
	
	protected Integer iXPanelCamposTipoAutoPago=0;
	protected Integer iYPanelCamposTipoAutoPago=0;
	
	protected Integer iXPanelCamposOcultosTipoAutoPago=0;
	protected Integer iYPanelCamposOcultosTipoAutoPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoAutoPago;
	public JButton jButtonModificarTipoAutoPago;
	public JButton jButtonActualizarTipoAutoPago;
    public JButton jButtonEliminarTipoAutoPago;
	public JButton jButtonCancelarTipoAutoPago;
    public JButton jButtonGuardarCambiosTipoAutoPago;
	public JButton jButtonGuardarCambiosTablaTipoAutoPago;
	protected JButton jButtonCerrarTipoAutoPago;
	
	
	protected JButton jButtonProcesarInformacionTipoAutoPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoAutoPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoAutoPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoAutoPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAutoPago;
	protected JButton jButtonModificarToolBarTipoAutoPago;
	protected JButton jButtonActualizarToolBarTipoAutoPago;
    protected JButton jButtonEliminarToolBarTipoAutoPago;
	protected JButton jButtonCancelarToolBarTipoAutoPago;
    protected JButton jButtonGuardarCambiosToolBarTipoAutoPago;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoAutoPago;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAutoPago;
	protected JButton jButtonCerrarToolBarTipoAutoPago;
	
	protected JButton jButtonProcesarInformacionToolBarTipoAutoPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAutoPago;
	protected JMenuItem jMenuItemModificarTipoAutoPago;
	protected JMenuItem jMenuItemActualizarTipoAutoPago;
    protected JMenuItem jMenuItemEliminarTipoAutoPago;
	protected JMenuItem jMenuItemCancelarTipoAutoPago;
    protected JMenuItem jMenuItemGuardarCambiosTipoAutoPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAutoPago;
	protected JMenuItem jMenuItemCerrarTipoAutoPago;
	protected JMenuItem jMenuItemDetalleCerrarTipoAutoPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAutoPago;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoAutoPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAutoPago;
	protected JMenuItem jMenuItemMostrarOcultarTipoAutoPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAutoPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAutoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAutoPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoAutoPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoAutoPago;
	public JLabel jLabelIdTipoAutoPago;
	public JLabel jLabelidTipoAutoPago;
	public JButton jButtonidTipoAutoPagoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoAutoPago;
	public JLabel jLabelcodigoTipoAutoPago;
	public JTextField jTextFieldcodigoTipoAutoPago;
	public JButton jButtoncodigoTipoAutoPagoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoAutoPago;
	public JLabel jLabelnombreTipoAutoPago;
	public JTextArea jTextAreanombreTipoAutoPago;
	public JScrollPane jscrollPanenombreTipoAutoPago;
	public JButton jButtonnombreTipoAutoPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoAutoPago;
	public JLabel jLabelid_empresaTipoAutoPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoAutoPago;
	public JButton jButtonid_empresaTipoAutoPago= new JButtonMe();
	public JButton jButtonid_empresaTipoAutoPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoAutoPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoAutoPago;
	
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
	
	public TipoAutoPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoAutoPago=new JPanel();
				this.jPanelAccionesFormularioTipoAutoPago=new JPanel();
				this.jmenuBarDetalleTipoAutoPago=new JMenuBar();
				this.jTtoolBarDetalleTipoAutoPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoAutoPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAutoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoAutoPago() {
		return this.jButtonActualizarToolBarTipoAutoPago;
	}
	
	public JButton getjButtonEliminarToolBarTipoAutoPago() {
		return this.jButtonEliminarToolBarTipoAutoPago;
	}
	
	public JButton getjButtonCancelarToolBarTipoAutoPago() {
		return this.jButtonCancelarToolBarTipoAutoPago;
	}		
	
	public JButton getjButtonProcesarInformacionTipoAutoPago() {
		return this.jButtonProcesarInformacionTipoAutoPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAutoPago)	{
		this.jButtonProcesarInformacionTipoAutoPago = jButtonProcesarInformacionTipoAutoPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAutoPago() {
		return this.jComboBoxTiposAccionesTipoAutoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAutoPago(
			JComboBox jComboBoxTiposRelacionesTipoAutoPago) {
		this.jComboBoxTiposRelacionesTipoAutoPago = jComboBoxTiposRelacionesTipoAutoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAutoPago(
			JComboBox jComboBoxTiposAccionesTipoAutoPago) {
		this.jComboBoxTiposAccionesTipoAutoPago = jComboBoxTiposAccionesTipoAutoPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoAutoPago() {
		return this.jComboBoxTiposAccionesFormularioTipoAutoPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoAutoPago(
			JComboBox jComboBoxTiposAccionesFormularioTipoAutoPago) {
		this.jComboBoxTiposAccionesFormularioTipoAutoPago = jComboBoxTiposAccionesFormularioTipoAutoPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
		
		this.tipoautopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoautopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoautopagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAutoPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAutoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAutoPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Auto Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoAutoPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoAutoPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoAutoPago=new JButtonMe();
				this.jButtonModificarToolBarTipoAutoPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoAutoPago,this.jTtoolBarDetalleTipoAutoPago,
							"actualizar","actualizar","Actualizar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoAutoPago,this.jTtoolBarDetalleTipoAutoPago,
							"eliminar","eliminar","Eliminar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoAutoPago,this.jTtoolBarDetalleTipoAutoPago,
							"cancelar","cancelar","Cancelar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoAutoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoAutoPago,this.jTtoolBarDetalleTipoAutoPago,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoAutoPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoAutoPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoAutoPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoAutoPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoAutoPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAutoPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAutoPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAutoPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoAutoPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoAutoPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoAutoPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoAutoPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoAutoPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoAutoPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoAutoPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoAutoPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoAutoPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoAutoPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoAutoPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoAutoPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoAutoPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAutoPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAutoPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAutoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAutoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAutoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoAutoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoAutoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoAutoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAutoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAutoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAutoPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAutoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAutoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAutoPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoAutoPago.add(this.jMenuItemDetalleCerrarTipoAutoPago);
		
		this.jmenuDetalleAccionesTipoAutoPago.add(this.jMenuItemActualizarTipoAutoPago);
		this.jmenuDetalleAccionesTipoAutoPago.add(this.jMenuItemEliminarTipoAutoPago);
		this.jmenuDetalleAccionesTipoAutoPago.add(this.jMenuItemCancelarTipoAutoPago);		
		
		//this.jmenuDetalleDatosTipoAutoPago.add(this.jMenuItemDetalleAbrirOrderByTipoAutoPago);				
		this.jmenuDetalleDatosTipoAutoPago.add(this.jMenuItemDetalleMostarOcultarTipoAutoPago);				
				
		//this.jmenuDetalleAccionesTipoAutoPago.add(this.jMenuItemGuardarCambiosTipoAutoPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoAutoPago.add(this.jmenuDetalleArchivoTipoAutoPago);		
		this.jmenuBarDetalleTipoAutoPago.add(this.jmenuDetalleAccionesTipoAutoPago);		
		this.jmenuBarDetalleTipoAutoPago.add(this.jmenuDetalleDatosTipoAutoPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoAutoPago);				
	}
	
	
	public void inicializarElementosCamposTipoAutoPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoAutoPago = new JLabelMe();
		jLabelIdTipoAutoPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoAutoPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoAutoPago.setToolTipText(TipoAutoPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoAutoPago= new GridBagLayout();

		this.jPanelidTipoAutoPago.setLayout(this.gridaBagLayoutTipoAutoPago);

		jLabelidTipoAutoPago = new JLabel();
		jLabelidTipoAutoPago.setText("Id");

		jLabelidTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoAutoPago = new JLabelMe();
		this.jLabelcodigoTipoAutoPago.setText(""+TipoAutoPagoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoAutoPago.setToolTipText("Codigo");
		this.jLabelcodigoTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoAutoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoAutoPago.setToolTipText(TipoAutoPagoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoAutoPago = new GridBagLayout();
		this.jPanelcodigoTipoAutoPago.setLayout(this.gridaBagLayoutTipoAutoPago);


		jTextFieldcodigoTipoAutoPago= new JTextFieldMe();

		jTextFieldcodigoTipoAutoPago.setEnabled(false);
		jTextFieldcodigoTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoAutoPagoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoAutoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAutoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAutoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoAutoPagoBusqueda.setText("U");
		this.jButtoncodigoTipoAutoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoAutoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoAutoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoAutoPagoBusqueda"));

		if(this.tipoautopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoAutoPagoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoAutoPago = new JLabelMe();
		this.jLabelnombreTipoAutoPago.setText(""+TipoAutoPagoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoAutoPago.setToolTipText("Nombre");
		this.jLabelnombreTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoAutoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoAutoPago.setToolTipText(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoAutoPago = new GridBagLayout();
		this.jPanelnombreTipoAutoPago.setLayout(this.gridaBagLayoutTipoAutoPago);


		jTextAreanombreTipoAutoPago= new JTextAreaMe();
		jTextAreanombreTipoAutoPago.setEnabled(false);
		jTextAreanombreTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoAutoPago.setLineWrap(true);
		jTextAreanombreTipoAutoPago.setWrapStyleWord(true);
		jTextAreanombreTipoAutoPago.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoAutoPago.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoAutoPago = new JScrollPane(jTextAreanombreTipoAutoPago);
		jscrollPanenombreTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoAutoPagoBusqueda= new JButtonMe();
		this.jButtonnombreTipoAutoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAutoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAutoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoAutoPagoBusqueda.setText("U");
		this.jButtonnombreTipoAutoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoAutoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoAutoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoAutoPagoBusqueda"));

		if(this.tipoautopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoAutoPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoAutoPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoAutoPago = new JLabelMe();
		this.jLabelid_empresaTipoAutoPago.setText(""+TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoAutoPago.setToolTipText("Empresa");
		this.jLabelid_empresaTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoAutoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoAutoPago.setToolTipText(TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoAutoPago = new GridBagLayout();
		this.jPanelid_empresaTipoAutoPago.setLayout(this.gridaBagLayoutTipoAutoPago);


		jComboBoxid_empresaTipoAutoPago= new JComboBoxMe();
		jComboBoxid_empresaTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoAutoPago.setEnabled(false);

		this.jButtonid_empresaTipoAutoPago= new JButtonMe();
		this.jButtonid_empresaTipoAutoPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAutoPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAutoPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAutoPago.setText("Buscar");
		this.jButtonid_empresaTipoAutoPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoAutoPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAutoPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAutoPago"));

		this.jButtonid_empresaTipoAutoPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoAutoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAutoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAutoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAutoPagoBusqueda.setText("U");
		this.jButtonid_empresaTipoAutoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoAutoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAutoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAutoPagoBusqueda"));

		if(this.tipoautopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoAutoPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoAutoPagoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoAutoPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAutoPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAutoPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAutoPagoUpdate.setText("U");
		this.jButtonid_empresaTipoAutoPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoAutoPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAutoPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAutoPagoUpdate"));



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
		//this.jInternalFrameDetalleTipoAutoPago = new TipoAutoPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Auto Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAutoPago= new GridBagLayout();
		

		
		String sToolTipTipoAutoPago="";
		sToolTipTipoAutoPago=TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAutoPago+="(Contabilidad.TipoAutoPago)";
		}
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAutoPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoAutoPago = new JButtonMe();
		this.jButtonModificarTipoAutoPago = new JButtonMe();
        this.jButtonActualizarTipoAutoPago = new JButtonMe();
        this.jButtonEliminarTipoAutoPago = new JButtonMe();
        this.jButtonCancelarTipoAutoPago = new JButtonMe();
        this.jButtonGuardarCambiosTipoAutoPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoAutoPago = new JButtonMe();
		this.jButtonCerrarTipoAutoPago = new JButtonMe();
		
		this.jScrollPanelDatosTipoAutoPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoAutoPago = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoAutoPago = new JScrollPane();
				
		
		
		this.jPanelCamposTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Auto Pago";
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Auto Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAutoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoAutoPago.setName("jPanelCamposTipoAutoPago"); 

		this.jPanelCamposOcultosTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoAutoPago.setName("jPanelCamposOcultosTipoAutoPago"); 

        this.jPanelAccionesTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAutoPago.setToolTipText("Acciones");
        this.jPanelAccionesTipoAutoPago.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoAutoPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoAutoPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoAutoPago.setText("Nuevo");
		this.jButtonModificarTipoAutoPago.setText("Editar");
        this.jButtonActualizarTipoAutoPago.setText("Actualizar");
        this.jButtonEliminarTipoAutoPago.setText("Eliminar");
        this.jButtonCancelarTipoAutoPago.setText("Cancelar");
        this.jButtonGuardarCambiosTipoAutoPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoAutoPago.setText("Guardar");
		this.jButtonCerrarTipoAutoPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAutoPago,"nuevo_button","Nuevo",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoAutoPago,"modificar_button","Editar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoAutoPago,"actualizar_button","Actualizar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoAutoPago,"eliminar_button","Eliminar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoAutoPago,"cancelar_button","Cancelar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoAutoPago,"guardarcambios_button","Guardar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAutoPago,"guardarcambiostabla_button","Guardar",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAutoPago,"cerrar_button","Salir",this.tipoautopagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoAutoPago.setToolTipText("Nuevo"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoAutoPago.setToolTipText("Editar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoAutoPago.setToolTipText("Actualizar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoAutoPago.setToolTipText("Eliminar)"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoAutoPago.setToolTipText("Cancelar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoAutoPago.setToolTipText("Guardar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoAutoPago.setToolTipText("Guardar"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAutoPago.setToolTipText("Salir"+" "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAutoPago";
		inputMap = this.jButtonNuevoTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAutoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAutoPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoAutoPago";
		inputMap = this.jButtonActualizarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoAutoPago"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoAutoPago";
		inputMap = this.jButtonEliminarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoAutoPago"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoAutoPago";
		inputMap = this.jButtonCancelarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoAutoPago"));
		
		//CERRAR		
		sMapKey = "CerrarTipoAutoPago";
		inputMap = this.jButtonCerrarTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAutoPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAutoPago";
		inputMap = this.jButtonGuardarCambiosTablaTipoAutoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAutoPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoAutoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoAutoPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoAutoPago.setToolTipText("Nuevo TipoAutoPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoAutoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoAutoPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoAutoPago.setToolTipText("Sin Cerrar Ventana TipoAutoPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoAutoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoAutoPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoAutoPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAutoPago.setText("Accion");
		this.jComboBoxTiposAccionesTipoAutoPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoAutoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoAutoPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoAutoPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoAutoPago = new JLabelMe();
		
		this.jLabelAccionesTipoAutoPago.setText("Acciones");		
		this.jLabelAccionesTipoAutoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoAutoPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoAutoPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoAutoPago=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoAutoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoAutoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoAutoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAutoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoAutoPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAutoPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAutoPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoAutoPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoAutoPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoAutoPago = new GridBagLayout();
		
		this.jPanelCamposTipoAutoPago.setLayout(gridaBagLayoutCamposTipoAutoPago);
		this.jPanelCamposOcultosTipoAutoPago.setLayout(gridaBagLayoutCamposOcultosTipoAutoPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 0;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoAutoPago.add(jLabelIdTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 1;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoAutoPago.add(jLabelidTipoAutoPago, this.gridBagConstraintsTipoAutoPago);


	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 0;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoAutoPago.add(jLabelid_empresaTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx = 2;
		this.gridBagConstraintsTipoAutoPago.ipadx = 0;
		this.gridBagConstraintsTipoAutoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAutoPago.add(jButtonid_empresaTipoAutoPagoBusqueda, this.gridBagConstraintsTipoAutoPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx = 3;
		this.gridBagConstraintsTipoAutoPago.ipadx = 0;
		this.gridBagConstraintsTipoAutoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAutoPago.add(jButtonid_empresaTipoAutoPagoUpdate, this.gridBagConstraintsTipoAutoPago);
	}

	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 1;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoAutoPago.add(jComboBoxid_empresaTipoAutoPago, this.gridBagConstraintsTipoAutoPago);


	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 0;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoAutoPago.add(jLabelcodigoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx = 2;
		this.gridBagConstraintsTipoAutoPago.ipadx = 0;
		this.gridBagConstraintsTipoAutoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoAutoPago.add(jButtoncodigoTipoAutoPagoBusqueda, this.gridBagConstraintsTipoAutoPago);
	}

	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 1;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoAutoPago.add(jTextFieldcodigoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);


	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 0;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoAutoPago.add(jLabelnombreTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx = 2;
		this.gridBagConstraintsTipoAutoPago.ipadx = 0;
		this.gridBagConstraintsTipoAutoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoAutoPago.add(jButtonnombreTipoAutoPagoBusqueda, this.gridBagConstraintsTipoAutoPago);
	}

	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoPago.gridy = 0;
	this.gridBagConstraintsTipoAutoPago.gridx = 1;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoAutoPago.add(jscrollPanenombreTipoAutoPago, this.gridBagConstraintsTipoAutoPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoPago.gridy = iYPanelCamposTipoAutoPago;
	this.gridBagConstraintsTipoAutoPago.gridx = iXPanelCamposTipoAutoPago++;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAutoPago.add(this.jPanelidTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(iXPanelCamposTipoAutoPago % 1==0) {
		iXPanelCamposTipoAutoPago=0;
		iYPanelCamposTipoAutoPago++;
	}
	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoPago.gridy = iYPanelCamposTipoAutoPago;
	this.gridBagConstraintsTipoAutoPago.gridx = iXPanelCamposTipoAutoPago++;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAutoPago.add(this.jPanelcodigoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(iXPanelCamposTipoAutoPago % 1==0) {
		iXPanelCamposTipoAutoPago=0;
		iYPanelCamposTipoAutoPago++;
	}
	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoPago.gridy = iYPanelCamposTipoAutoPago;
	this.gridBagConstraintsTipoAutoPago.gridx = iXPanelCamposTipoAutoPago++;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAutoPago.add(this.jPanelnombreTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(iXPanelCamposTipoAutoPago % 1==0) {
		iXPanelCamposTipoAutoPago=0;
		iYPanelCamposTipoAutoPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoPago.gridy = iYPanelCamposOcultosTipoAutoPago;
	this.gridBagConstraintsTipoAutoPago.gridx = iXPanelCamposOcultosTipoAutoPago++;
	this.gridBagConstraintsTipoAutoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoAutoPago.add(this.jPanelid_empresaTipoAutoPago, this.gridBagConstraintsTipoAutoPago);



	if(iXPanelCamposOcultosTipoAutoPago % 1==0) {
		iXPanelCamposOcultosTipoAutoPago=0;
		iYPanelCamposOcultosTipoAutoPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoAutoPago= new GridBagLayout();
		this.jPanelAccionesTipoAutoPago.setLayout(gridaBagLayoutAccionesTipoAutoPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoAutoPago= new GridBagLayout();
		this.jPanelAccionesFormularioTipoAutoPago.setLayout(gridaBagLayoutAccionesFormularioTipoAutoPago);
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAutoPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAutoPago.add(this.jComboBoxTiposAccionesFormularioTipoAutoPago, this.gridBagConstraintsTipoAutoPago);

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAutoPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAutoPago.add(this.jCheckBoxPostAccionNuevoTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAutoPago.add(this.jCheckBoxPostAccionSinCerrarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAutoPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAutoPago.add(this.jCheckBoxPostAccionSinMensajeTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoAutoPago.add(this.jButtonModificarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);							

		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoPago.gridy = 0;
		this.gridBagConstraintsTipoAutoPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoAutoPago.add(this.jButtonEliminarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
			
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = 0;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAutoPago.add(this.jButtonActualizarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);


		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = 0;		
		this.gridBagConstraintsTipoAutoPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAutoPago.add(this.jButtonGuardarCambiosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);	
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = 0;		
		this.gridBagConstraintsTipoAutoPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoAutoPago.add(this.jButtonCancelarTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAutoPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAutoPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();						
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAutoPago.gridx = 0;		
			//this.gridBagConstraintsTipoAutoPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAutoPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAutoPago.gridx =0;
		this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAutoPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoAutoPago = new TipoAutoPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Auto Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Auto Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Auto Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoAutoPagoModel tipoautopagoModel=new TipoAutoPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoAutoPagoModel.TipoAutoPagoFocusTraversalPolicy tipoautopagoFocusTraversalPolicy = tipoautopagoModel.new TipoAutoPagoFocusTraversalPolicy(this);
			
			//tipoautopagoFocusTraversalPolicy.settipoautopagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoautopagoModel);
			
			
			this.jContentPaneDetalleTipoAutoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoAutoPago = new GridBagLayout();	
			this.jContentPaneDetalleTipoAutoPago.setLayout(gridaBagLayoutDetalleTipoAutoPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAutoPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoAutoPago.gridx = 0;
					
				
				this.jContentPaneDetalleTipoAutoPago.add(jTtoolBarDetalleTipoAutoPago, gridBagConstraintsTipoAutoPago);								
				
}
			
			this.jScrollPanelDatosEdicionTipoAutoPago=   new JScrollPane(jContentPaneDetalleTipoAutoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAutoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoAutoPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAutoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoAutoPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoAutoPago.gridx = 0;
	        
			this.jContentPaneDetalleTipoAutoPago.add(jPanelCamposTipoAutoPago, gridBagConstraintsTipoAutoPago);
			
			
			
			
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
						&& tipoautopagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoAutoPago= new GridBagConstraints();
						this.gridBagConstraintsTipoAutoPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoAutoPago.gridx = 0;
						this.jContentPaneDetalleTipoAutoPago.add(this.jTabbedPaneRelacionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoAutoPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoAutoPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
					this.gridBagConstraintsTipoAutoPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoAutoPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoAutoPago.gridx = 0;
					
				
					this.jContentPaneDetalleTipoAutoPago.add(jPanelCamposOcultosTipoAutoPago, gridBagConstraintsTipoAutoPago);
				
					this.jPanelCamposOcultosTipoAutoPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoAutoPago.gridx = 0;
	        this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoAutoPago.add(this.jPanelAccionesFormularioTipoAutoPago, this.gridBagConstraintsTipoAutoPago);							
			
			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
	        this.gridBagConstraintsTipoAutoPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoAutoPago.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoAutoPago.add(this.jPanelAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoAutoPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoAutoPago=   new JScrollPane(this.jPanelCamposTipoAutoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAutoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoAutoPago.gridx = 0;
			this.gridBagConstraintsTipoAutoPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoAutoPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoAutoPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAutoPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoAutoPago, this.gridBagConstraintsTipoAutoPago);			
			
			this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAutoPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
			
			
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		
			
		this.gridBagConstraintsTipoAutoPago = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAutoPago, this.gridBagConstraintsTipoAutoPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoAutoPago;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoAutoPago;
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
