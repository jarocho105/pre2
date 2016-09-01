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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoFacturaConstantesFunciones;

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
public class TipoFacturaDetalleFormJInternalFrame extends TipoFacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFactura;
	
	protected JMenuBar jmenuBarDetalleTipoFactura;
	
	protected JMenu jmenuDetalleTipoFactura;
	protected JMenu jmenuDetalleArchivoTipoFactura;
	protected JMenu jmenuDetalleAccionesTipoFactura;
	protected JMenu jmenuDetalleDatosTipoFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFactura;	
	protected GridBagConstraints gridBagConstraintsTipoFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFactura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFacturaSessionBean tipofacturaSessionBean;
	
	

	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;
	public FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFactura=false;
	public FacturaSessionBean facturaSessionBean;
	
		
	
	public TipoFacturaLogic tipofacturaLogic;
	
	public JScrollPane jScrollPanelDatosTipoFactura;
	public JScrollPane jScrollPanelDatosEdicionTipoFactura;
	public JScrollPane jScrollPanelDatosGeneralTipoFactura;
	
	protected JPanel jPanelCamposTipoFactura;    
	protected JPanel jPanelCamposOcultosTipoFactura;    	
	protected JPanel jPanelAccionesTipoFactura;
	protected JPanel jPanelAccionesFormularioTipoFactura;
    
	
	
	protected Integer iXPanelCamposTipoFactura=0;
	protected Integer iYPanelCamposTipoFactura=0;
	
	protected Integer iXPanelCamposOcultosTipoFactura=0;
	protected Integer iYPanelCamposOcultosTipoFactura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFactura;
	public JButton jButtonModificarTipoFactura;
	public JButton jButtonActualizarTipoFactura;
    public JButton jButtonEliminarTipoFactura;
	public JButton jButtonCancelarTipoFactura;
    public JButton jButtonGuardarCambiosTipoFactura;
	public JButton jButtonGuardarCambiosTablaTipoFactura;
	protected JButton jButtonCerrarTipoFactura;
	
	
	protected JButton jButtonProcesarInformacionTipoFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFactura;
	protected JButton jButtonModificarToolBarTipoFactura;
	protected JButton jButtonActualizarToolBarTipoFactura;
    protected JButton jButtonEliminarToolBarTipoFactura;
	protected JButton jButtonCancelarToolBarTipoFactura;
    protected JButton jButtonGuardarCambiosToolBarTipoFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFactura;
	protected JButton jButtonCerrarToolBarTipoFactura;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFactura;
	protected JMenuItem jMenuItemModificarTipoFactura;
	protected JMenuItem jMenuItemActualizarTipoFactura;
    protected JMenuItem jMenuItemEliminarTipoFactura;
	protected JMenuItem jMenuItemCancelarTipoFactura;
    protected JMenuItem jMenuItemGuardarCambiosTipoFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFactura;
	protected JMenuItem jMenuItemCerrarTipoFactura;
	protected JMenuItem jMenuItemDetalleCerrarTipoFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFactura;
	protected JMenuItem jMenuItemMostrarOcultarTipoFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFactura;
	public JLabel jLabelIdTipoFactura;
	public JTextFieldMe jTextFieldidTipoFactura;
	public JButton jButtonidTipoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoFactura;
	public JLabel jLabelcodigoTipoFactura;
	public JTextField jTextFieldcodigoTipoFactura;
	public JButton jButtoncodigoTipoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFactura;
	public JLabel jLabelnombreTipoFactura;
	public JTextArea jTextAreanombreTipoFactura;
	public JScrollPane jscrollPanenombreTipoFactura;
	public JButton jButtonnombreTipoFacturaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFactura;
	
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
	
	public TipoFacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFactura=new JPanel();
				this.jPanelAccionesFormularioTipoFactura=new JPanel();
				this.jmenuBarDetalleTipoFactura=new JMenuBar();
				this.jTtoolBarDetalleTipoFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFactura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFactura() {
		return this.jButtonActualizarToolBarTipoFactura;
	}
	
	public JButton getjButtonEliminarToolBarTipoFactura() {
		return this.jButtonEliminarToolBarTipoFactura;
	}
	
	public JButton getjButtonCancelarToolBarTipoFactura() {
		return this.jButtonCancelarToolBarTipoFactura;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFactura() {
		return this.jButtonProcesarInformacionTipoFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFactura)	{
		this.jButtonProcesarInformacionTipoFactura = jButtonProcesarInformacionTipoFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFactura() {
		return this.jComboBoxTiposAccionesTipoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFactura(
			JComboBox jComboBoxTiposRelacionesTipoFactura) {
		this.jComboBoxTiposRelacionesTipoFactura = jComboBoxTiposRelacionesTipoFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFactura(
			JComboBox jComboBoxTiposAccionesTipoFactura) {
		this.jComboBoxTiposAccionesTipoFactura = jComboBoxTiposAccionesTipoFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFactura() {
		return this.jComboBoxTiposAccionesFormularioTipoFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFactura(
			JComboBox jComboBoxTiposAccionesFormularioTipoFactura) {
		this.jComboBoxTiposAccionesFormularioTipoFactura = jComboBoxTiposAccionesFormularioTipoFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipofacturaSessionBean=new TipoFacturaSessionBean();
		
		this.tipofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofacturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturaSessionBean=new FacturaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Factura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFactura=new JButtonMe();
				this.jButtonModificarToolBarTipoFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFactura,this.jTtoolBarDetalleTipoFactura,
							"actualizar","actualizar","Actualizar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFactura,this.jTtoolBarDetalleTipoFactura,
							"eliminar","eliminar","Eliminar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFactura,this.jTtoolBarDetalleTipoFactura,
							"cancelar","cancelar","Cancelar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFactura,this.jTtoolBarDetalleTipoFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFactura.add(this.jMenuItemDetalleCerrarTipoFactura);
		
		this.jmenuDetalleAccionesTipoFactura.add(this.jMenuItemActualizarTipoFactura);
		this.jmenuDetalleAccionesTipoFactura.add(this.jMenuItemEliminarTipoFactura);
		this.jmenuDetalleAccionesTipoFactura.add(this.jMenuItemCancelarTipoFactura);		
		
		//this.jmenuDetalleDatosTipoFactura.add(this.jMenuItemDetalleAbrirOrderByTipoFactura);				
		this.jmenuDetalleDatosTipoFactura.add(this.jMenuItemDetalleMostarOcultarTipoFactura);				
				
		//this.jmenuDetalleAccionesTipoFactura.add(this.jMenuItemGuardarCambiosTipoFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFactura.add(this.jmenuDetalleArchivoTipoFactura);		
		this.jmenuBarDetalleTipoFactura.add(this.jmenuDetalleAccionesTipoFactura);		
		this.jmenuBarDetalleTipoFactura.add(this.jmenuDetalleDatosTipoFactura);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoFactura.add(this.jmenuDetalleTipoFactura);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFactura);				
	}
	
	
	public void inicializarElementosCamposTipoFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFactura = new JLabelMe();
		jLabelIdTipoFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFactura.setToolTipText(TipoFacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFactura= new GridBagLayout();

		this.jPanelidTipoFactura.setLayout(this.gridaBagLayoutTipoFactura);

		jTextFieldidTipoFactura = new JTextFieldMe();
		jTextFieldidTipoFactura.setText("Id");

		jTextFieldidTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoFactura = new JLabelMe();
		this.jLabelcodigoTipoFactura.setText(""+TipoFacturaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoFactura.setToolTipText("Codigo");
		this.jLabelcodigoTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoFactura.setToolTipText(TipoFacturaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoFactura = new GridBagLayout();
		this.jPanelcodigoTipoFactura.setLayout(this.gridaBagLayoutTipoFactura);


		jTextFieldcodigoTipoFactura= new JTextFieldMe();

		jTextFieldcodigoTipoFactura.setEnabled(false);
		jTextFieldcodigoTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoFacturaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoFacturaBusqueda.setText("U");
		this.jButtoncodigoTipoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoFacturaBusqueda"));

		if(this.tipofacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoFactura = new JLabelMe();
		this.jLabelnombreTipoFactura.setText(""+TipoFacturaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFactura.setToolTipText("Nombre");
		this.jLabelnombreTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFactura.setToolTipText(TipoFacturaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFactura = new GridBagLayout();
		this.jPanelnombreTipoFactura.setLayout(this.gridaBagLayoutTipoFactura);


		jTextAreanombreTipoFactura= new JTextAreaMe();
		jTextAreanombreTipoFactura.setEnabled(false);
		jTextAreanombreTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFactura.setLineWrap(true);
		jTextAreanombreTipoFactura.setWrapStyleWord(true);
		jTextAreanombreTipoFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFactura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFactura = new JScrollPane(jTextAreanombreTipoFactura);
		jscrollPanenombreTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFacturaBusqueda= new JButtonMe();
		this.jButtonnombreTipoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFacturaBusqueda.setText("U");
		this.jButtonnombreTipoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFacturaBusqueda"));

		if(this.tipofacturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFactura() {
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
		//this.jInternalFrameDetalleTipoFactura = new TipoFacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFactura= new GridBagLayout();
		

		
		String sToolTipTipoFactura="";
		sToolTipTipoFactura=TipoFacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFactura+="(Contabilidad.TipoFactura)";
		}
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFactura = new JButtonMe();
		this.jButtonModificarTipoFactura = new JButtonMe();
        this.jButtonActualizarTipoFactura = new JButtonMe();
        this.jButtonEliminarTipoFactura = new JButtonMe();
        this.jButtonCancelarTipoFactura = new JButtonMe();
        this.jButtonGuardarCambiosTipoFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFactura = new JButtonMe();
		this.jButtonCerrarTipoFactura = new JButtonMe();
		
		this.jScrollPanelDatosTipoFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFactura = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Factura";
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFactura.setName("jPanelCamposTipoFactura"); 

		this.jPanelCamposOcultosTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFactura.setName("jPanelCamposOcultosTipoFactura"); 

        this.jPanelAccionesTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFactura.setToolTipText("Acciones");
        this.jPanelAccionesTipoFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFactura.setText("Nuevo");
		this.jButtonModificarTipoFactura.setText("Editar");
        this.jButtonActualizarTipoFactura.setText("Actualizar");
        this.jButtonEliminarTipoFactura.setText("Eliminar");
        this.jButtonCancelarTipoFactura.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFactura.setText("Guardar");
		this.jButtonCerrarTipoFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFactura,"nuevo_button","Nuevo",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFactura,"modificar_button","Editar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFactura,"actualizar_button","Actualizar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFactura,"eliminar_button","Eliminar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFactura,"cancelar_button","Cancelar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFactura,"guardarcambios_button","Guardar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFactura,"guardarcambiostabla_button","Guardar",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFactura,"cerrar_button","Salir",this.tipofacturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFactura.setToolTipText("Nuevo"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFactura.setToolTipText("Editar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFactura.setToolTipText("Actualizar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFactura.setToolTipText("Eliminar)"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFactura.setToolTipText("Cancelar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFactura.setToolTipText("Guardar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFactura.setToolTipText("Guardar"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFactura.setToolTipText("Salir"+" "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFactura";
		inputMap = this.jButtonNuevoTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFactura";
		inputMap = this.jButtonActualizarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFactura";
		inputMap = this.jButtonEliminarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFactura";
		inputMap = this.jButtonCancelarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFactura"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFactura";
		inputMap = this.jButtonCerrarTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFactura";
		inputMap = this.jButtonGuardarCambiosTablaTipoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFactura.setToolTipText("Nuevo TipoFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFactura.setToolTipText("Sin Cerrar Ventana TipoFactura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFactura.setText("Accion");
		this.jComboBoxTiposAccionesTipoFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFactura = new JLabelMe();
		
		this.jLabelAccionesTipoFactura.setText("Acciones");		
		this.jLabelAccionesTipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFactura = new GridBagLayout();
		
		this.jPanelCamposTipoFactura.setLayout(gridaBagLayoutCamposTipoFactura);
		this.jPanelCamposOcultosTipoFactura.setLayout(gridaBagLayoutCamposOcultosTipoFactura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFactura.gridy = 0;
	this.gridBagConstraintsTipoFactura.gridx = 0;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFactura.add(jLabelIdTipoFactura, this.gridBagConstraintsTipoFactura);



	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFactura.gridy = 0;
	this.gridBagConstraintsTipoFactura.gridx = 1;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFactura.add(jTextFieldidTipoFactura, this.gridBagConstraintsTipoFactura);


	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFactura.gridy = 0;
	this.gridBagConstraintsTipoFactura.gridx = 0;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoFactura.add(jLabelcodigoTipoFactura, this.gridBagConstraintsTipoFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = 0;
		this.gridBagConstraintsTipoFactura.gridx = 2;
		this.gridBagConstraintsTipoFactura.ipadx = 0;
		this.gridBagConstraintsTipoFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoFactura.add(jButtoncodigoTipoFacturaBusqueda, this.gridBagConstraintsTipoFactura);
	}

	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFactura.gridy = 0;
	this.gridBagConstraintsTipoFactura.gridx = 1;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoFactura.add(jTextFieldcodigoTipoFactura, this.gridBagConstraintsTipoFactura);


	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFactura.gridy = 0;
	this.gridBagConstraintsTipoFactura.gridx = 0;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFactura.add(jLabelnombreTipoFactura, this.gridBagConstraintsTipoFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		//this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFactura.gridy = 0;
		this.gridBagConstraintsTipoFactura.gridx = 2;
		this.gridBagConstraintsTipoFactura.ipadx = 0;
		this.gridBagConstraintsTipoFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFactura.add(jButtonnombreTipoFacturaBusqueda, this.gridBagConstraintsTipoFactura);
	}

	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFactura.gridy = 0;
	this.gridBagConstraintsTipoFactura.gridx = 1;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFactura.add(jscrollPanenombreTipoFactura, this.gridBagConstraintsTipoFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFactura.gridy = iYPanelCamposTipoFactura;
	this.gridBagConstraintsTipoFactura.gridx = iXPanelCamposTipoFactura++;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFactura.add(this.jPanelidTipoFactura, this.gridBagConstraintsTipoFactura);



	if(iXPanelCamposTipoFactura % 1==0) {
		iXPanelCamposTipoFactura=0;
		iYPanelCamposTipoFactura++;
	}
	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFactura.gridy = iYPanelCamposTipoFactura;
	this.gridBagConstraintsTipoFactura.gridx = iXPanelCamposTipoFactura++;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFactura.add(this.jPanelcodigoTipoFactura, this.gridBagConstraintsTipoFactura);



	if(iXPanelCamposTipoFactura % 1==0) {
		iXPanelCamposTipoFactura=0;
		iYPanelCamposTipoFactura++;
	}
	this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFactura.gridy = iYPanelCamposTipoFactura;
	this.gridBagConstraintsTipoFactura.gridx = iXPanelCamposTipoFactura++;
	this.gridBagConstraintsTipoFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFactura.add(this.jPanelnombreTipoFactura, this.gridBagConstraintsTipoFactura);



	if(iXPanelCamposTipoFactura % 1==0) {
		iXPanelCamposTipoFactura=0;
		iYPanelCamposTipoFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFactura= new GridBagLayout();
		this.jPanelAccionesTipoFactura.setLayout(gridaBagLayoutAccionesTipoFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFactura= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFactura.setLayout(gridaBagLayoutAccionesFormularioTipoFactura);
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFactura.add(this.jComboBoxTiposAccionesFormularioTipoFactura, this.gridBagConstraintsTipoFactura);

		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFactura.add(this.jCheckBoxPostAccionNuevoTipoFactura, this.gridBagConstraintsTipoFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFactura.add(this.jCheckBoxPostAccionSinCerrarTipoFactura, this.gridBagConstraintsTipoFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFactura.add(this.jCheckBoxPostAccionSinMensajeTipoFactura, this.gridBagConstraintsTipoFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = 0;
		this.gridBagConstraintsTipoFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFactura.add(this.jButtonModificarTipoFactura, this.gridBagConstraintsTipoFactura);							

		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFactura.gridy = 0;
		this.gridBagConstraintsTipoFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFactura.add(this.jButtonEliminarTipoFactura, this.gridBagConstraintsTipoFactura);
		
			
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = 0;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFactura.add(this.jButtonActualizarTipoFactura, this.gridBagConstraintsTipoFactura);


		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = 0;		
		this.gridBagConstraintsTipoFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFactura.add(this.jButtonGuardarCambiosTipoFactura, this.gridBagConstraintsTipoFactura);	
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = 0;		
		this.gridBagConstraintsTipoFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFactura.add(this.jButtonCancelarTipoFactura, this.gridBagConstraintsTipoFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();						
			this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFactura.gridx = 0;		
			//this.gridBagConstraintsTipoFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFactura.gridx =0;
		this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFactura, this.gridBagConstraintsTipoFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFactura = new TipoFacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFacturaModel tipofacturaModel=new TipoFacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFacturaModel.TipoFacturaFocusTraversalPolicy tipofacturaFocusTraversalPolicy = tipofacturaModel.new TipoFacturaFocusTraversalPolicy(this);
			
			//tipofacturaFocusTraversalPolicy.settipofacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipofacturaModel);
			
			
			this.jContentPaneDetalleTipoFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFactura = new GridBagLayout();	
			this.jContentPaneDetalleTipoFactura.setLayout(gridaBagLayoutDetalleTipoFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFactura = new GridBagConstraints();
				this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFactura.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFactura.add(jTtoolBarDetalleTipoFactura, gridBagConstraintsTipoFactura);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFactura=   new JScrollPane(jContentPaneDetalleTipoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFactura.gridx = 0;
	        
			this.jContentPaneDetalleTipoFactura.add(jPanelCamposTipoFactura, gridBagConstraintsTipoFactura);
			
			
			
			
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
						&& tipofacturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFactura(this.puedeCargarPorParteFactura,false,-1);
					
					if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFactura= new GridBagConstraints();
						this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFactura.gridx = 0;
						this.jContentPaneDetalleTipoFactura.add(this.jTabbedPaneRelacionesTipoFactura, this.gridBagConstraintsTipoFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFactura.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFactura(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFactura = new GridBagConstraints();
					this.gridBagConstraintsTipoFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFactura.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFactura.add(jPanelCamposOcultosTipoFactura, gridBagConstraintsTipoFactura);
				
					this.jPanelCamposOcultosTipoFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoFactura.gridx = 0;
	        this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFactura.add(this.jPanelAccionesFormularioTipoFactura, this.gridBagConstraintsTipoFactura);							
			
			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
	        this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFactura.add(this.jPanelAccionesTipoFactura, this.gridBagConstraintsTipoFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFactura=   new JScrollPane(this.jPanelCamposTipoFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFactura.gridx = 0;
			this.gridBagConstraintsTipoFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFactura, this.gridBagConstraintsTipoFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFactura, this.gridBagConstraintsTipoFactura);			
			
			this.gridBagConstraintsTipoFactura = new GridBagConstraints();
			this.gridBagConstraintsTipoFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFactura, this.gridBagConstraintsTipoFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFactura, this.gridBagConstraintsTipoFactura);
			
			
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFactura, this.gridBagConstraintsTipoFactura);
		
			
		this.gridBagConstraintsTipoFactura = new GridBagConstraints();
		this.gridBagConstraintsTipoFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFactura, this.gridBagConstraintsTipoFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFactura;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFactura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaSessionBean=new FacturaSessionBean();
		this.facturaSessionBean.setConGuardarRelaciones(true);
		this.facturaSessionBean.setEsGuardarRelacionado(true);

		this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaSessionBean.getEsGuardarRelacionado()) {

				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoFacturaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaSessionBean.setEsGuardarRelacionado(true);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaBeanSwingJInternalFrame.setfacturaSessionBean(this.facturaSessionBean);

				//this.gridBagConstraintsTipoFactura = new GridBagConstraints();
				//this.gridBagConstraintsTipoFactura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoFactura.gridx = 0;
				//this.jContentPaneDetalleTipoFactura.add(this.facturaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoFactura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoFactura.add("Facturas",this.facturaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoFactura.setComponentAt(iIndexTab,this.facturaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaSessionBean.setEsGuardarRelacionado(false);
				this.facturaBeanSwingJInternalFrame=null;//new FacturaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFactura) {
					this.jTabbedPaneRelacionesTipoFactura.add("Facturas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaBeanSwingJInternalFrame(List<TipoFactura> tipofacturas,TipoFactura tipofactura,FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.tipofacturaLogic.getConnexion());

					facturaBeanSwingJInternalFrame.settipofacturasForeignKey(tipofacturas);
					facturaBeanSwingJInternalFrame.settipofacturaForeignKey(tipofactura);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFactura(true);
					facturaBeanSwingJInternalFrame.facturaSessionBean.setlidTipoFacturaActual(tipofactura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaBeanSwingJInternalFrame.cargarCombosForeignKeyFactura(facturaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoFactura(true);
					facturaBeanSwingJInternalFrame.setid_tipo_facturaFK_IdTipoFactura(tipofactura.getId());

					if(!this.conCargarFormDetalle) {
						facturaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoFacturaForeignKey(tipofactura,1,false,true,true);
					facturaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoFactura");
					facturaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoFactura");
					facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(true);
					facturaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFactura("n",facturaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("relacionado");
					} else {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");
					}

					facturaBeanSwingJInternalFrame.getjButtonRecargarInformacionFactura().setVisible(false);

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
