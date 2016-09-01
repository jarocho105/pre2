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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoEstructuraConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoEstructuraDetalleFormJInternalFrame extends TipoEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEstructura;
	
	protected JMenuBar jmenuBarDetalleTipoEstructura;
	
	protected JMenu jmenuDetalleTipoEstructura;
	protected JMenu jmenuDetalleArchivoTipoEstructura;
	protected JMenu jmenuDetalleAccionesTipoEstructura;
	protected JMenu jmenuDetalleDatosTipoEstructura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEstructura;	
	protected GridBagConstraints gridBagConstraintsTipoEstructura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEstructuraBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEstructura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoEstructuraSessionBean tipoestructuraSessionBean;
	
	
	
		
	
	public TipoEstructuraLogic tipoestructuraLogic;
	
	public JScrollPane jScrollPanelDatosTipoEstructura;
	public JScrollPane jScrollPanelDatosEdicionTipoEstructura;
	public JScrollPane jScrollPanelDatosGeneralTipoEstructura;
	
	protected JPanel jPanelCamposTipoEstructura;    
	protected JPanel jPanelCamposOcultosTipoEstructura;    	
	protected JPanel jPanelAccionesTipoEstructura;
	protected JPanel jPanelAccionesFormularioTipoEstructura;
    
	
	
	protected Integer iXPanelCamposTipoEstructura=0;
	protected Integer iYPanelCamposTipoEstructura=0;
	
	protected Integer iXPanelCamposOcultosTipoEstructura=0;
	protected Integer iYPanelCamposOcultosTipoEstructura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEstructura;
	public JButton jButtonModificarTipoEstructura;
	public JButton jButtonActualizarTipoEstructura;
    public JButton jButtonEliminarTipoEstructura;
	public JButton jButtonCancelarTipoEstructura;
    public JButton jButtonGuardarCambiosTipoEstructura;
	public JButton jButtonGuardarCambiosTablaTipoEstructura;
	protected JButton jButtonCerrarTipoEstructura;
	
	
	protected JButton jButtonProcesarInformacionTipoEstructura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEstructura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEstructura;
	protected JButton jButtonModificarToolBarTipoEstructura;
	protected JButton jButtonActualizarToolBarTipoEstructura;
    protected JButton jButtonEliminarToolBarTipoEstructura;
	protected JButton jButtonCancelarToolBarTipoEstructura;
    protected JButton jButtonGuardarCambiosToolBarTipoEstructura;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEstructura;
	protected JButton jButtonCerrarToolBarTipoEstructura;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEstructura;
	protected JMenuItem jMenuItemModificarTipoEstructura;
	protected JMenuItem jMenuItemActualizarTipoEstructura;
    protected JMenuItem jMenuItemEliminarTipoEstructura;
	protected JMenuItem jMenuItemCancelarTipoEstructura;
    protected JMenuItem jMenuItemGuardarCambiosTipoEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEstructura;
	protected JMenuItem jMenuItemCerrarTipoEstructura;
	protected JMenuItem jMenuItemDetalleCerrarTipoEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEstructura;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEstructura;
	protected JMenuItem jMenuItemMostrarOcultarTipoEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEstructura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEstructura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEstructura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEstructura;
	public JLabel jLabelIdTipoEstructura;
	public JTextFieldMe jTextFieldidTipoEstructura;
	public JButton jButtonidTipoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoEstructura;
	public JLabel jLabelcodigoTipoEstructura;
	public JTextField jTextFieldcodigoTipoEstructura;
	public JButton jButtoncodigoTipoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEstructura;
	public JLabel jLabelnombreTipoEstructura;
	public JTextArea jTextAreanombreTipoEstructura;
	public JScrollPane jscrollPanenombreTipoEstructura;
	public JButton jButtonnombreTipoEstructuraBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEstructura;
	
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
	
	public TipoEstructuraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEstructura=new JPanel();
				this.jPanelAccionesFormularioTipoEstructura=new JPanel();
				this.jmenuBarDetalleTipoEstructura=new JMenuBar();
				this.jTtoolBarDetalleTipoEstructura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEstructuraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstructuraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEstructura() {
		return this.jButtonActualizarToolBarTipoEstructura;
	}
	
	public JButton getjButtonEliminarToolBarTipoEstructura() {
		return this.jButtonEliminarToolBarTipoEstructura;
	}
	
	public JButton getjButtonCancelarToolBarTipoEstructura() {
		return this.jButtonCancelarToolBarTipoEstructura;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEstructura() {
		return this.jButtonProcesarInformacionTipoEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEstructura)	{
		this.jButtonProcesarInformacionTipoEstructura = jButtonProcesarInformacionTipoEstructura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEstructura() {
		return this.jComboBoxTiposAccionesTipoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEstructura(
			JComboBox jComboBoxTiposRelacionesTipoEstructura) {
		this.jComboBoxTiposRelacionesTipoEstructura = jComboBoxTiposRelacionesTipoEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEstructura(
			JComboBox jComboBoxTiposAccionesTipoEstructura) {
		this.jComboBoxTiposAccionesTipoEstructura = jComboBoxTiposAccionesTipoEstructura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEstructura() {
		return this.jComboBoxTiposAccionesFormularioTipoEstructura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEstructura(
			JComboBox jComboBoxTiposAccionesFormularioTipoEstructura) {
		this.jComboBoxTiposAccionesFormularioTipoEstructura = jComboBoxTiposAccionesFormularioTipoEstructura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoestructuraSessionBean=new TipoEstructuraSessionBean();
		
		this.tipoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoestructuraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEstructura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEstructura=new JButtonMe();
				this.jButtonModificarToolBarTipoEstructura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEstructura,this.jTtoolBarDetalleTipoEstructura,
							"actualizar","actualizar","Actualizar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEstructura,this.jTtoolBarDetalleTipoEstructura,
							"eliminar","eliminar","Eliminar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEstructura,this.jTtoolBarDetalleTipoEstructura,
							"cancelar","cancelar","Cancelar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEstructura,this.jTtoolBarDetalleTipoEstructura,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEstructura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEstructura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEstructura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEstructura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEstructura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEstructura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEstructura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEstructura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEstructura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEstructura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEstructura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEstructura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEstructura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEstructura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEstructura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEstructura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEstructura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEstructura.add(this.jMenuItemDetalleCerrarTipoEstructura);
		
		this.jmenuDetalleAccionesTipoEstructura.add(this.jMenuItemActualizarTipoEstructura);
		this.jmenuDetalleAccionesTipoEstructura.add(this.jMenuItemEliminarTipoEstructura);
		this.jmenuDetalleAccionesTipoEstructura.add(this.jMenuItemCancelarTipoEstructura);		
		
		//this.jmenuDetalleDatosTipoEstructura.add(this.jMenuItemDetalleAbrirOrderByTipoEstructura);				
		this.jmenuDetalleDatosTipoEstructura.add(this.jMenuItemDetalleMostarOcultarTipoEstructura);				
				
		//this.jmenuDetalleAccionesTipoEstructura.add(this.jMenuItemGuardarCambiosTipoEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEstructura.add(this.jmenuDetalleArchivoTipoEstructura);		
		this.jmenuBarDetalleTipoEstructura.add(this.jmenuDetalleAccionesTipoEstructura);		
		this.jmenuBarDetalleTipoEstructura.add(this.jmenuDetalleDatosTipoEstructura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEstructura);				
	}
	
	
	public void inicializarElementosCamposTipoEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEstructura = new JLabelMe();
		jLabelIdTipoEstructura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEstructura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEstructura.setToolTipText(TipoEstructuraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEstructura= new GridBagLayout();

		this.jPanelidTipoEstructura.setLayout(this.gridaBagLayoutTipoEstructura);

		jTextFieldidTipoEstructura = new JTextFieldMe();
		jTextFieldidTipoEstructura.setText("Id");

		jTextFieldidTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoEstructura = new JLabelMe();
		this.jLabelcodigoTipoEstructura.setText(""+TipoEstructuraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoEstructura.setToolTipText("Codigo");
		this.jLabelcodigoTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoEstructura.setToolTipText(TipoEstructuraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoEstructura = new GridBagLayout();
		this.jPanelcodigoTipoEstructura.setLayout(this.gridaBagLayoutTipoEstructura);


		jTextFieldcodigoTipoEstructura= new JTextFieldMe();

		jTextFieldcodigoTipoEstructura.setEnabled(false);
		jTextFieldcodigoTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoEstructuraBusqueda= new JButtonMe();
		this.jButtoncodigoTipoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoEstructuraBusqueda.setText("U");
		this.jButtoncodigoTipoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoEstructuraBusqueda"));

		if(this.tipoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoEstructura = new JLabelMe();
		this.jLabelnombreTipoEstructura.setText(""+TipoEstructuraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEstructura.setToolTipText("Nombre");
		this.jLabelnombreTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEstructura.setToolTipText(TipoEstructuraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEstructura = new GridBagLayout();
		this.jPanelnombreTipoEstructura.setLayout(this.gridaBagLayoutTipoEstructura);


		jTextAreanombreTipoEstructura= new JTextAreaMe();
		jTextAreanombreTipoEstructura.setEnabled(false);
		jTextAreanombreTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstructura.setLineWrap(true);
		jTextAreanombreTipoEstructura.setWrapStyleWord(true);
		jTextAreanombreTipoEstructura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEstructura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEstructura = new JScrollPane(jTextAreanombreTipoEstructura);
		jscrollPanenombreTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEstructuraBusqueda= new JButtonMe();
		this.jButtonnombreTipoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEstructuraBusqueda.setText("U");
		this.jButtonnombreTipoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEstructuraBusqueda"));

		if(this.tipoestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEstructuraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEstructura() {
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
		//this.jInternalFrameDetalleTipoEstructura = new TipoEstructuraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Estructura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEstructura= new GridBagLayout();
		

		
		String sToolTipTipoEstructura="";
		sToolTipTipoEstructura=TipoEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEstructura+="(Nomina.TipoEstructura)";
		}
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEstructura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEstructura = new JButtonMe();
		this.jButtonModificarTipoEstructura = new JButtonMe();
        this.jButtonActualizarTipoEstructura = new JButtonMe();
        this.jButtonEliminarTipoEstructura = new JButtonMe();
        this.jButtonCancelarTipoEstructura = new JButtonMe();
        this.jButtonGuardarCambiosTipoEstructura = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEstructura = new JButtonMe();
		this.jButtonCerrarTipoEstructura = new JButtonMe();
		
		this.jScrollPanelDatosTipoEstructura = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEstructura = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEstructura = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Estructura";
		
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEstructura.setName("jPanelCamposTipoEstructura"); 

		this.jPanelCamposOcultosTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEstructura.setName("jPanelCamposOcultosTipoEstructura"); 

        this.jPanelAccionesTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesTipoEstructura.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEstructura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEstructura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEstructura.setText("Nuevo");
		this.jButtonModificarTipoEstructura.setText("Editar");
        this.jButtonActualizarTipoEstructura.setText("Actualizar");
        this.jButtonEliminarTipoEstructura.setText("Eliminar");
        this.jButtonCancelarTipoEstructura.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEstructura.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEstructura.setText("Guardar");
		this.jButtonCerrarTipoEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEstructura,"nuevo_button","Nuevo",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEstructura,"modificar_button","Editar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEstructura,"actualizar_button","Actualizar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEstructura,"eliminar_button","Eliminar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEstructura,"cancelar_button","Cancelar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEstructura,"guardarcambios_button","Guardar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEstructura,"guardarcambiostabla_button","Guardar",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEstructura,"cerrar_button","Salir",this.tipoestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEstructura.setToolTipText("Nuevo"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEstructura.setToolTipText("Editar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEstructura.setToolTipText("Actualizar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEstructura.setToolTipText("Eliminar)"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEstructura.setToolTipText("Cancelar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEstructura.setToolTipText("Guardar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEstructura.setToolTipText("Guardar"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEstructura.setToolTipText("Salir"+" "+TipoEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEstructura";
		inputMap = this.jButtonNuevoTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEstructura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEstructura";
		inputMap = this.jButtonActualizarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEstructura"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEstructura";
		inputMap = this.jButtonEliminarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEstructura"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEstructura";
		inputMap = this.jButtonCancelarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEstructura"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEstructura";
		inputMap = this.jButtonCerrarTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEstructura";
		inputMap = this.jButtonGuardarCambiosTablaTipoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEstructura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEstructura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEstructura.setToolTipText("Nuevo TipoEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEstructura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEstructura.setToolTipText("Sin Cerrar Ventana TipoEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEstructura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEstructura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEstructura.setText("Accion");
		this.jComboBoxTiposAccionesTipoEstructura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEstructura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEstructura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEstructura = new JLabelMe();
		
		this.jLabelAccionesTipoEstructura.setText("Acciones");		
		this.jLabelAccionesTipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEstructura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEstructura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEstructura=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEstructura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEstructura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEstructura = new GridBagLayout();
		
		this.jPanelCamposTipoEstructura.setLayout(gridaBagLayoutCamposTipoEstructura);
		this.jPanelCamposOcultosTipoEstructura.setLayout(gridaBagLayoutCamposOcultosTipoEstructura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstructura.gridy = 0;
	this.gridBagConstraintsTipoEstructura.gridx = 0;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEstructura.add(jLabelIdTipoEstructura, this.gridBagConstraintsTipoEstructura);



	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstructura.gridy = 0;
	this.gridBagConstraintsTipoEstructura.gridx = 1;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEstructura.add(jTextFieldidTipoEstructura, this.gridBagConstraintsTipoEstructura);


	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstructura.gridy = 0;
	this.gridBagConstraintsTipoEstructura.gridx = 0;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoEstructura.add(jLabelcodigoTipoEstructura, this.gridBagConstraintsTipoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = 0;
		this.gridBagConstraintsTipoEstructura.gridx = 2;
		this.gridBagConstraintsTipoEstructura.ipadx = 0;
		this.gridBagConstraintsTipoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoEstructura.add(jButtoncodigoTipoEstructuraBusqueda, this.gridBagConstraintsTipoEstructura);
	}

	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstructura.gridy = 0;
	this.gridBagConstraintsTipoEstructura.gridx = 1;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoEstructura.add(jTextFieldcodigoTipoEstructura, this.gridBagConstraintsTipoEstructura);


	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstructura.gridy = 0;
	this.gridBagConstraintsTipoEstructura.gridx = 0;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEstructura.add(jLabelnombreTipoEstructura, this.gridBagConstraintsTipoEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstructura.gridy = 0;
		this.gridBagConstraintsTipoEstructura.gridx = 2;
		this.gridBagConstraintsTipoEstructura.ipadx = 0;
		this.gridBagConstraintsTipoEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEstructura.add(jButtonnombreTipoEstructuraBusqueda, this.gridBagConstraintsTipoEstructura);
	}

	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstructura.gridy = 0;
	this.gridBagConstraintsTipoEstructura.gridx = 1;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEstructura.add(jscrollPanenombreTipoEstructura, this.gridBagConstraintsTipoEstructura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstructura.gridy = iYPanelCamposTipoEstructura;
	this.gridBagConstraintsTipoEstructura.gridx = iXPanelCamposTipoEstructura++;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstructura.add(this.jPanelidTipoEstructura, this.gridBagConstraintsTipoEstructura);



	if(iXPanelCamposTipoEstructura % 1==0) {
		iXPanelCamposTipoEstructura=0;
		iYPanelCamposTipoEstructura++;
	}
	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstructura.gridy = iYPanelCamposTipoEstructura;
	this.gridBagConstraintsTipoEstructura.gridx = iXPanelCamposTipoEstructura++;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstructura.add(this.jPanelcodigoTipoEstructura, this.gridBagConstraintsTipoEstructura);



	if(iXPanelCamposTipoEstructura % 1==0) {
		iXPanelCamposTipoEstructura=0;
		iYPanelCamposTipoEstructura++;
	}
	this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstructura.gridy = iYPanelCamposTipoEstructura;
	this.gridBagConstraintsTipoEstructura.gridx = iXPanelCamposTipoEstructura++;
	this.gridBagConstraintsTipoEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstructura.add(this.jPanelnombreTipoEstructura, this.gridBagConstraintsTipoEstructura);



	if(iXPanelCamposTipoEstructura % 1==0) {
		iXPanelCamposTipoEstructura=0;
		iYPanelCamposTipoEstructura++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEstructura= new GridBagLayout();
		this.jPanelAccionesTipoEstructura.setLayout(gridaBagLayoutAccionesTipoEstructura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEstructura= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEstructura.setLayout(gridaBagLayoutAccionesFormularioTipoEstructura);
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEstructura.add(this.jComboBoxTiposAccionesFormularioTipoEstructura, this.gridBagConstraintsTipoEstructura);

		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEstructura.add(this.jCheckBoxPostAccionNuevoTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEstructura.add(this.jCheckBoxPostAccionSinCerrarTipoEstructura, this.gridBagConstraintsTipoEstructura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoestructuraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEstructura.add(this.jCheckBoxPostAccionSinMensajeTipoEstructura, this.gridBagConstraintsTipoEstructura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = 0;
		this.gridBagConstraintsTipoEstructura.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEstructura.add(this.jButtonModificarTipoEstructura, this.gridBagConstraintsTipoEstructura);							

		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstructura.gridy = 0;
		this.gridBagConstraintsTipoEstructura.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEstructura.add(this.jButtonEliminarTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
			
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = 0;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEstructura.add(this.jButtonActualizarTipoEstructura, this.gridBagConstraintsTipoEstructura);


		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = 0;		
		this.gridBagConstraintsTipoEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEstructura.add(this.jButtonGuardarCambiosTipoEstructura, this.gridBagConstraintsTipoEstructura);	
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = 0;		
		this.gridBagConstraintsTipoEstructura.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEstructura.add(this.jButtonCancelarTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEstructura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();						
			this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstructura.gridx = 0;		
			//this.gridBagConstraintsTipoEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEstructura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEstructura.gridx =0;
		this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEstructura, this.gridBagConstraintsTipoEstructura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEstructura = new TipoEstructuraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Estructura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Estructura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Estructura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEstructuraModel tipoestructuraModel=new TipoEstructuraModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEstructuraModel.TipoEstructuraFocusTraversalPolicy tipoestructuraFocusTraversalPolicy = tipoestructuraModel.new TipoEstructuraFocusTraversalPolicy(this);
			
			//tipoestructuraFocusTraversalPolicy.settipoestructuraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoestructuraModel);
			
			
			this.jContentPaneDetalleTipoEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEstructura = new GridBagLayout();	
			this.jContentPaneDetalleTipoEstructura.setLayout(gridaBagLayoutDetalleTipoEstructura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEstructura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
				this.gridBagConstraintsTipoEstructura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEstructura.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEstructura.add(jTtoolBarDetalleTipoEstructura, gridBagConstraintsTipoEstructura);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEstructura=   new JScrollPane(jContentPaneDetalleTipoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEstructura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEstructura.gridx = 0;
	        
			this.jContentPaneDetalleTipoEstructura.add(jPanelCamposTipoEstructura, gridBagConstraintsTipoEstructura);
			
			
			
			
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
						&& tipoestructuraSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoestructuraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEstructura= new GridBagConstraints();
						this.gridBagConstraintsTipoEstructura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEstructura.gridx = 0;
						this.jContentPaneDetalleTipoEstructura.add(this.jTabbedPaneRelacionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEstructura.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEstructura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
					this.gridBagConstraintsTipoEstructura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEstructura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEstructura.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEstructura.add(jPanelCamposOcultosTipoEstructura, gridBagConstraintsTipoEstructura);
				
					this.jPanelCamposOcultosTipoEstructura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoEstructura.gridx = 0;
	        this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEstructura.add(this.jPanelAccionesFormularioTipoEstructura, this.gridBagConstraintsTipoEstructura);							
			
			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
	        this.gridBagConstraintsTipoEstructura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoEstructura.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEstructura.add(this.jPanelAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEstructura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEstructura=   new JScrollPane(this.jPanelCamposTipoEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstructura.gridx = 0;
			this.gridBagConstraintsTipoEstructura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEstructura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEstructura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEstructura, this.gridBagConstraintsTipoEstructura);			
			
			this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
			this.gridBagConstraintsTipoEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEstructura, this.gridBagConstraintsTipoEstructura);
			
			
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEstructura, this.gridBagConstraintsTipoEstructura);
		
			
		this.gridBagConstraintsTipoEstructura = new GridBagConstraints();
		this.gridBagConstraintsTipoEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEstructura, this.gridBagConstraintsTipoEstructura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEstructura;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEstructura;
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
