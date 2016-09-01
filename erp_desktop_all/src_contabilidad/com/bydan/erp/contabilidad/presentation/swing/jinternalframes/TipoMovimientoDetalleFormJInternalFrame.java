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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoMovimientoConstantesFunciones;

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
public class TipoMovimientoDetalleFormJInternalFrame extends TipoMovimientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMovimiento;
	
	protected JMenuBar jmenuBarDetalleTipoMovimiento;
	
	protected JMenu jmenuDetalleTipoMovimiento;
	protected JMenu jmenuDetalleArchivoTipoMovimiento;
	protected JMenu jmenuDetalleAccionesTipoMovimiento;
	protected JMenu jmenuDetalleDatosTipoMovimiento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMovimiento;	
	protected GridBagConstraints gridBagConstraintsTipoMovimiento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMovimientoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMovimiento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	
	
	
		
	
	public TipoMovimientoLogic tipomovimientoLogic;
	
	public JScrollPane jScrollPanelDatosTipoMovimiento;
	public JScrollPane jScrollPanelDatosEdicionTipoMovimiento;
	public JScrollPane jScrollPanelDatosGeneralTipoMovimiento;
	
	protected JPanel jPanelCamposTipoMovimiento;    
	protected JPanel jPanelCamposOcultosTipoMovimiento;    	
	protected JPanel jPanelAccionesTipoMovimiento;
	protected JPanel jPanelAccionesFormularioTipoMovimiento;
    
	
	
	protected Integer iXPanelCamposTipoMovimiento=0;
	protected Integer iYPanelCamposTipoMovimiento=0;
	
	protected Integer iXPanelCamposOcultosTipoMovimiento=0;
	protected Integer iYPanelCamposOcultosTipoMovimiento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMovimiento;
	public JButton jButtonModificarTipoMovimiento;
	public JButton jButtonActualizarTipoMovimiento;
    public JButton jButtonEliminarTipoMovimiento;
	public JButton jButtonCancelarTipoMovimiento;
    public JButton jButtonGuardarCambiosTipoMovimiento;
	public JButton jButtonGuardarCambiosTablaTipoMovimiento;
	protected JButton jButtonCerrarTipoMovimiento;
	
	
	protected JButton jButtonProcesarInformacionTipoMovimiento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMovimiento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMovimiento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMovimiento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMovimiento;
	protected JButton jButtonModificarToolBarTipoMovimiento;
	protected JButton jButtonActualizarToolBarTipoMovimiento;
    protected JButton jButtonEliminarToolBarTipoMovimiento;
	protected JButton jButtonCancelarToolBarTipoMovimiento;
    protected JButton jButtonGuardarCambiosToolBarTipoMovimiento;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMovimiento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMovimiento;
	protected JButton jButtonCerrarToolBarTipoMovimiento;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMovimiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMovimiento;
	protected JMenuItem jMenuItemModificarTipoMovimiento;
	protected JMenuItem jMenuItemActualizarTipoMovimiento;
    protected JMenuItem jMenuItemEliminarTipoMovimiento;
	protected JMenuItem jMenuItemCancelarTipoMovimiento;
    protected JMenuItem jMenuItemGuardarCambiosTipoMovimiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMovimiento;
	protected JMenuItem jMenuItemCerrarTipoMovimiento;
	protected JMenuItem jMenuItemDetalleCerrarTipoMovimiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMovimiento;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMovimiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMovimiento;
	protected JMenuItem jMenuItemMostrarOcultarTipoMovimiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMovimiento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMovimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMovimiento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMovimiento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMovimiento;
	public JLabel jLabelIdTipoMovimiento;
	public JTextFieldMe jTextFieldidTipoMovimiento;
	public JButton jButtonidTipoMovimientoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoMovimiento;
	public JLabel jLabelcodigoTipoMovimiento;
	public JTextField jTextFieldcodigoTipoMovimiento;
	public JButton jButtoncodigoTipoMovimientoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMovimiento;
	public JLabel jLabelnombreTipoMovimiento;
	public JTextArea jTextAreanombreTipoMovimiento;
	public JScrollPane jscrollPanenombreTipoMovimiento;
	public JButton jButtonnombreTipoMovimientoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMovimiento;
	
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
	
	public TipoMovimientoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMovimiento=new JPanel();
				this.jPanelAccionesFormularioTipoMovimiento=new JPanel();
				this.jmenuBarDetalleTipoMovimiento=new JMenuBar();
				this.jTtoolBarDetalleTipoMovimiento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMovimientoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimientoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMovimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMovimiento() {
		return this.jButtonActualizarToolBarTipoMovimiento;
	}
	
	public JButton getjButtonEliminarToolBarTipoMovimiento() {
		return this.jButtonEliminarToolBarTipoMovimiento;
	}
	
	public JButton getjButtonCancelarToolBarTipoMovimiento() {
		return this.jButtonCancelarToolBarTipoMovimiento;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMovimiento() {
		return this.jButtonProcesarInformacionTipoMovimiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMovimiento)	{
		this.jButtonProcesarInformacionTipoMovimiento = jButtonProcesarInformacionTipoMovimiento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMovimiento() {
		return this.jComboBoxTiposAccionesTipoMovimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMovimiento(
			JComboBox jComboBoxTiposRelacionesTipoMovimiento) {
		this.jComboBoxTiposRelacionesTipoMovimiento = jComboBoxTiposRelacionesTipoMovimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMovimiento(
			JComboBox jComboBoxTiposAccionesTipoMovimiento) {
		this.jComboBoxTiposAccionesTipoMovimiento = jComboBoxTiposAccionesTipoMovimiento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMovimiento() {
		return this.jComboBoxTiposAccionesFormularioTipoMovimiento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMovimiento(
			JComboBox jComboBoxTiposAccionesFormularioTipoMovimiento) {
		this.jComboBoxTiposAccionesFormularioTipoMovimiento = jComboBoxTiposAccionesFormularioTipoMovimiento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomovimientoSessionBean=new TipoMovimientoSessionBean();
		
		this.tipomovimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovimientoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMovimientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMovimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMovimientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movimiento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMovimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMovimiento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMovimiento=new JButtonMe();
				this.jButtonModificarToolBarTipoMovimiento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMovimiento,this.jTtoolBarDetalleTipoMovimiento,
							"actualizar","actualizar","Actualizar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMovimiento,this.jTtoolBarDetalleTipoMovimiento,
							"eliminar","eliminar","Eliminar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMovimiento,this.jTtoolBarDetalleTipoMovimiento,
							"cancelar","cancelar","Cancelar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMovimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMovimiento,this.jTtoolBarDetalleTipoMovimiento,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMovimiento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMovimiento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMovimiento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMovimiento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMovimiento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMovimiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMovimiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMovimiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMovimiento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMovimiento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMovimiento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMovimiento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMovimiento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMovimiento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMovimiento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMovimiento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMovimiento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMovimiento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMovimiento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMovimiento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMovimiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMovimiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMovimiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMovimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMovimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMovimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMovimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMovimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMovimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMovimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMovimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMovimiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMovimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMovimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMovimiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMovimiento.add(this.jMenuItemDetalleCerrarTipoMovimiento);
		
		this.jmenuDetalleAccionesTipoMovimiento.add(this.jMenuItemActualizarTipoMovimiento);
		this.jmenuDetalleAccionesTipoMovimiento.add(this.jMenuItemEliminarTipoMovimiento);
		this.jmenuDetalleAccionesTipoMovimiento.add(this.jMenuItemCancelarTipoMovimiento);		
		
		//this.jmenuDetalleDatosTipoMovimiento.add(this.jMenuItemDetalleAbrirOrderByTipoMovimiento);				
		this.jmenuDetalleDatosTipoMovimiento.add(this.jMenuItemDetalleMostarOcultarTipoMovimiento);				
				
		//this.jmenuDetalleAccionesTipoMovimiento.add(this.jMenuItemGuardarCambiosTipoMovimiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMovimiento.add(this.jmenuDetalleArchivoTipoMovimiento);		
		this.jmenuBarDetalleTipoMovimiento.add(this.jmenuDetalleAccionesTipoMovimiento);		
		this.jmenuBarDetalleTipoMovimiento.add(this.jmenuDetalleDatosTipoMovimiento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMovimiento);				
	}
	
	
	public void inicializarElementosCamposTipoMovimiento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMovimiento = new JLabelMe();
		jLabelIdTipoMovimiento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMovimiento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMovimiento.setToolTipText(TipoMovimientoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMovimiento= new GridBagLayout();

		this.jPanelidTipoMovimiento.setLayout(this.gridaBagLayoutTipoMovimiento);

		jTextFieldidTipoMovimiento = new JTextFieldMe();
		jTextFieldidTipoMovimiento.setText("Id");

		jTextFieldidTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoMovimiento = new JLabelMe();
		this.jLabelcodigoTipoMovimiento.setText(""+TipoMovimientoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoMovimiento.setToolTipText("Codigo");
		this.jLabelcodigoTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoMovimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoMovimiento.setToolTipText(TipoMovimientoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoMovimiento = new GridBagLayout();
		this.jPanelcodigoTipoMovimiento.setLayout(this.gridaBagLayoutTipoMovimiento);


		jTextFieldcodigoTipoMovimiento= new JTextFieldMe();

		jTextFieldcodigoTipoMovimiento.setEnabled(false);
		jTextFieldcodigoTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoMovimientoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoMovimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMovimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMovimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoMovimientoBusqueda.setText("U");
		this.jButtoncodigoTipoMovimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoMovimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoMovimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoMovimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoMovimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoMovimientoBusqueda"));

		if(this.tipomovimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoMovimientoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoMovimiento = new JLabelMe();
		this.jLabelnombreTipoMovimiento.setText(""+TipoMovimientoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMovimiento.setToolTipText("Nombre");
		this.jLabelnombreTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMovimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMovimiento.setToolTipText(TipoMovimientoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMovimiento = new GridBagLayout();
		this.jPanelnombreTipoMovimiento.setLayout(this.gridaBagLayoutTipoMovimiento);


		jTextAreanombreTipoMovimiento= new JTextAreaMe();
		jTextAreanombreTipoMovimiento.setEnabled(false);
		jTextAreanombreTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimiento.setLineWrap(true);
		jTextAreanombreTipoMovimiento.setWrapStyleWord(true);
		jTextAreanombreTipoMovimiento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMovimiento.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMovimiento = new JScrollPane(jTextAreanombreTipoMovimiento);
		jscrollPanenombreTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMovimientoBusqueda= new JButtonMe();
		this.jButtonnombreTipoMovimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMovimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMovimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMovimientoBusqueda.setText("U");
		this.jButtonnombreTipoMovimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMovimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMovimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMovimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMovimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMovimientoBusqueda"));

		if(this.tipomovimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMovimientoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMovimiento() {
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
		//this.jInternalFrameDetalleTipoMovimiento = new TipoMovimientoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Movimiento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMovimiento= new GridBagLayout();
		

		
		String sToolTipTipoMovimiento="";
		sToolTipTipoMovimiento=TipoMovimientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMovimiento+="(Contabilidad.TipoMovimiento)";
		}
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMovimiento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMovimiento = new JButtonMe();
		this.jButtonModificarTipoMovimiento = new JButtonMe();
        this.jButtonActualizarTipoMovimiento = new JButtonMe();
        this.jButtonEliminarTipoMovimiento = new JButtonMe();
        this.jButtonCancelarTipoMovimiento = new JButtonMe();
        this.jButtonGuardarCambiosTipoMovimiento = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMovimiento = new JButtonMe();
		this.jButtonCerrarTipoMovimiento = new JButtonMe();
		
		this.jScrollPanelDatosTipoMovimiento = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMovimiento = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMovimiento = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movimiento";
		
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimientos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMovimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMovimiento.setName("jPanelCamposTipoMovimiento"); 

		this.jPanelCamposOcultosTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMovimiento.setName("jPanelCamposOcultosTipoMovimiento"); 

        this.jPanelAccionesTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMovimiento.setToolTipText("Acciones");
        this.jPanelAccionesTipoMovimiento.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMovimiento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMovimiento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMovimiento.setText("Nuevo");
		this.jButtonModificarTipoMovimiento.setText("Editar");
        this.jButtonActualizarTipoMovimiento.setText("Actualizar");
        this.jButtonEliminarTipoMovimiento.setText("Eliminar");
        this.jButtonCancelarTipoMovimiento.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMovimiento.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMovimiento.setText("Guardar");
		this.jButtonCerrarTipoMovimiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMovimiento,"nuevo_button","Nuevo",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMovimiento,"modificar_button","Editar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMovimiento,"actualizar_button","Actualizar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMovimiento,"eliminar_button","Eliminar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMovimiento,"cancelar_button","Cancelar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMovimiento,"guardarcambios_button","Guardar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMovimiento,"guardarcambiostabla_button","Guardar",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMovimiento,"cerrar_button","Salir",this.tipomovimientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMovimiento.setToolTipText("Nuevo"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMovimiento.setToolTipText("Editar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMovimiento.setToolTipText("Actualizar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMovimiento.setToolTipText("Eliminar)"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMovimiento.setToolTipText("Cancelar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMovimiento.setToolTipText("Guardar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMovimiento.setToolTipText("Guardar"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMovimiento.setToolTipText("Salir"+" "+TipoMovimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMovimiento";
		inputMap = this.jButtonNuevoTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMovimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMovimiento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMovimiento";
		inputMap = this.jButtonActualizarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMovimiento"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMovimiento";
		inputMap = this.jButtonEliminarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMovimiento"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMovimiento";
		inputMap = this.jButtonCancelarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMovimiento"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMovimiento";
		inputMap = this.jButtonCerrarTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMovimiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMovimiento";
		inputMap = this.jButtonGuardarCambiosTablaTipoMovimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMovimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMovimiento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMovimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMovimiento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMovimiento.setToolTipText("Nuevo TipoMovimiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMovimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMovimiento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMovimiento.setToolTipText("Sin Cerrar Ventana TipoMovimiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMovimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMovimiento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMovimiento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMovimiento.setText("Accion");
		this.jComboBoxTiposAccionesTipoMovimiento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMovimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMovimiento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMovimiento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMovimiento = new JLabelMe();
		
		this.jLabelAccionesTipoMovimiento.setText("Acciones");		
		this.jLabelAccionesTipoMovimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMovimiento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMovimiento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMovimiento=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMovimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMovimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMovimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMovimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMovimiento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMovimiento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMovimiento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMovimiento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMovimiento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMovimiento = new GridBagLayout();
		
		this.jPanelCamposTipoMovimiento.setLayout(gridaBagLayoutCamposTipoMovimiento);
		this.jPanelCamposOcultosTipoMovimiento.setLayout(gridaBagLayoutCamposOcultosTipoMovimiento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento.gridy = 0;
	this.gridBagConstraintsTipoMovimiento.gridx = 0;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMovimiento.add(jLabelIdTipoMovimiento, this.gridBagConstraintsTipoMovimiento);



	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento.gridy = 0;
	this.gridBagConstraintsTipoMovimiento.gridx = 1;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMovimiento.add(jTextFieldidTipoMovimiento, this.gridBagConstraintsTipoMovimiento);


	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento.gridy = 0;
	this.gridBagConstraintsTipoMovimiento.gridx = 0;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoMovimiento.add(jLabelcodigoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = 0;
		this.gridBagConstraintsTipoMovimiento.gridx = 2;
		this.gridBagConstraintsTipoMovimiento.ipadx = 0;
		this.gridBagConstraintsTipoMovimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoMovimiento.add(jButtoncodigoTipoMovimientoBusqueda, this.gridBagConstraintsTipoMovimiento);
	}

	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento.gridy = 0;
	this.gridBagConstraintsTipoMovimiento.gridx = 1;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoMovimiento.add(jTextFieldcodigoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);


	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento.gridy = 0;
	this.gridBagConstraintsTipoMovimiento.gridx = 0;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMovimiento.add(jLabelnombreTipoMovimiento, this.gridBagConstraintsTipoMovimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento.gridy = 0;
		this.gridBagConstraintsTipoMovimiento.gridx = 2;
		this.gridBagConstraintsTipoMovimiento.ipadx = 0;
		this.gridBagConstraintsTipoMovimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMovimiento.add(jButtonnombreTipoMovimientoBusqueda, this.gridBagConstraintsTipoMovimiento);
	}

	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento.gridy = 0;
	this.gridBagConstraintsTipoMovimiento.gridx = 1;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMovimiento.add(jscrollPanenombreTipoMovimiento, this.gridBagConstraintsTipoMovimiento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento.gridy = iYPanelCamposTipoMovimiento;
	this.gridBagConstraintsTipoMovimiento.gridx = iXPanelCamposTipoMovimiento++;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimiento.add(this.jPanelidTipoMovimiento, this.gridBagConstraintsTipoMovimiento);



	if(iXPanelCamposTipoMovimiento % 1==0) {
		iXPanelCamposTipoMovimiento=0;
		iYPanelCamposTipoMovimiento++;
	}
	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento.gridy = iYPanelCamposTipoMovimiento;
	this.gridBagConstraintsTipoMovimiento.gridx = iXPanelCamposTipoMovimiento++;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimiento.add(this.jPanelcodigoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);



	if(iXPanelCamposTipoMovimiento % 1==0) {
		iXPanelCamposTipoMovimiento=0;
		iYPanelCamposTipoMovimiento++;
	}
	this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento.gridy = iYPanelCamposTipoMovimiento;
	this.gridBagConstraintsTipoMovimiento.gridx = iXPanelCamposTipoMovimiento++;
	this.gridBagConstraintsTipoMovimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimiento.add(this.jPanelnombreTipoMovimiento, this.gridBagConstraintsTipoMovimiento);



	if(iXPanelCamposTipoMovimiento % 1==0) {
		iXPanelCamposTipoMovimiento=0;
		iYPanelCamposTipoMovimiento++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMovimiento= new GridBagLayout();
		this.jPanelAccionesTipoMovimiento.setLayout(gridaBagLayoutAccionesTipoMovimiento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMovimiento= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMovimiento.setLayout(gridaBagLayoutAccionesFormularioTipoMovimiento);
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMovimiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMovimiento.add(this.jComboBoxTiposAccionesFormularioTipoMovimiento, this.gridBagConstraintsTipoMovimiento);

		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMovimiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMovimiento.add(this.jCheckBoxPostAccionNuevoTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMovimiento.add(this.jCheckBoxPostAccionSinCerrarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomovimientoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomovimientoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMovimiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMovimiento.add(this.jCheckBoxPostAccionSinMensajeTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = 0;
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMovimiento.add(this.jButtonModificarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);							

		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento.gridy = 0;
		this.gridBagConstraintsTipoMovimiento.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMovimiento.add(this.jButtonEliminarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
			
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = 0;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMovimiento.add(this.jButtonActualizarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);


		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = 0;		
		this.gridBagConstraintsTipoMovimiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMovimiento.add(this.jButtonGuardarCambiosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);	
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = 0;		
		this.gridBagConstraintsTipoMovimiento.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMovimiento.add(this.jButtonCancelarTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMovimiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMovimiento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovimientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();						
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimiento.gridx = 0;		
			//this.gridBagConstraintsTipoMovimiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMovimiento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimiento.gridx =0;
		this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMovimiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMovimientoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMovimiento = new TipoMovimientoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Movimiento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Movimiento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movimiento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMovimientoModel tipomovimientoModel=new TipoMovimientoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMovimientoModel.TipoMovimientoFocusTraversalPolicy tipomovimientoFocusTraversalPolicy = tipomovimientoModel.new TipoMovimientoFocusTraversalPolicy(this);
			
			//tipomovimientoFocusTraversalPolicy.settipomovimientoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomovimientoModel);
			
			
			this.jContentPaneDetalleTipoMovimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMovimiento = new GridBagLayout();	
			this.jContentPaneDetalleTipoMovimiento.setLayout(gridaBagLayoutDetalleTipoMovimiento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMovimiento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimiento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMovimiento.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMovimiento.add(jTtoolBarDetalleTipoMovimiento, gridBagConstraintsTipoMovimiento);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMovimiento=   new JScrollPane(jContentPaneDetalleTipoMovimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMovimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMovimiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMovimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMovimiento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMovimiento.gridx = 0;
	        
			this.jContentPaneDetalleTipoMovimiento.add(jPanelCamposTipoMovimiento, gridBagConstraintsTipoMovimiento);
			
			
			
			
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
						&& tipomovimientoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipomovimientoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMovimiento= new GridBagConstraints();
						this.gridBagConstraintsTipoMovimiento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMovimiento.gridx = 0;
						this.jContentPaneDetalleTipoMovimiento.add(this.jTabbedPaneRelacionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMovimiento.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMovimiento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
					this.gridBagConstraintsTipoMovimiento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMovimiento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMovimiento.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMovimiento.add(jPanelCamposOcultosTipoMovimiento, gridBagConstraintsTipoMovimiento);
				
					this.jPanelCamposOcultosTipoMovimiento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoMovimiento.gridx = 0;
	        this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMovimiento.add(this.jPanelAccionesFormularioTipoMovimiento, this.gridBagConstraintsTipoMovimiento);							
			
			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
	        this.gridBagConstraintsTipoMovimiento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoMovimiento.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMovimiento.add(this.jPanelAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMovimiento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMovimiento=   new JScrollPane(this.jPanelCamposTipoMovimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMovimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimiento.gridx = 0;
			this.gridBagConstraintsTipoMovimiento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMovimiento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMovimiento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMovimiento, this.gridBagConstraintsTipoMovimiento);			
			
			this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
			
			
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		
			
		this.gridBagConstraintsTipoMovimiento = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMovimiento, this.gridBagConstraintsTipoMovimiento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMovimiento;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMovimiento;
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
