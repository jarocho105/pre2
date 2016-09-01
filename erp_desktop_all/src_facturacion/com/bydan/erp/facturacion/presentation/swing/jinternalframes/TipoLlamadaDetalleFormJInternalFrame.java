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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoLlamadaConstantesFunciones;

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
public class TipoLlamadaDetalleFormJInternalFrame extends TipoLlamadaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoLlamada;
	
	protected JMenuBar jmenuBarDetalleTipoLlamada;
	
	protected JMenu jmenuDetalleTipoLlamada;
	protected JMenu jmenuDetalleArchivoTipoLlamada;
	protected JMenu jmenuDetalleAccionesTipoLlamada;
	protected JMenu jmenuDetalleDatosTipoLlamada;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLlamada;	
	protected GridBagConstraints gridBagConstraintsTipoLlamada;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoLlamadaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoLlamada;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	
	
	
		
	
	public TipoLlamadaLogic tipollamadaLogic;
	
	public JScrollPane jScrollPanelDatosTipoLlamada;
	public JScrollPane jScrollPanelDatosEdicionTipoLlamada;
	public JScrollPane jScrollPanelDatosGeneralTipoLlamada;
	
	protected JPanel jPanelCamposTipoLlamada;    
	protected JPanel jPanelCamposOcultosTipoLlamada;    	
	protected JPanel jPanelAccionesTipoLlamada;
	protected JPanel jPanelAccionesFormularioTipoLlamada;
    
	
	
	protected Integer iXPanelCamposTipoLlamada=0;
	protected Integer iYPanelCamposTipoLlamada=0;
	
	protected Integer iXPanelCamposOcultosTipoLlamada=0;
	protected Integer iYPanelCamposOcultosTipoLlamada=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoLlamada;
	public JButton jButtonModificarTipoLlamada;
	public JButton jButtonActualizarTipoLlamada;
    public JButton jButtonEliminarTipoLlamada;
	public JButton jButtonCancelarTipoLlamada;
    public JButton jButtonGuardarCambiosTipoLlamada;
	public JButton jButtonGuardarCambiosTablaTipoLlamada;
	protected JButton jButtonCerrarTipoLlamada;
	
	
	protected JButton jButtonProcesarInformacionTipoLlamada;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoLlamada;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoLlamada;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoLlamada;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLlamada;
	protected JButton jButtonModificarToolBarTipoLlamada;
	protected JButton jButtonActualizarToolBarTipoLlamada;
    protected JButton jButtonEliminarToolBarTipoLlamada;
	protected JButton jButtonCancelarToolBarTipoLlamada;
    protected JButton jButtonGuardarCambiosToolBarTipoLlamada;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoLlamada;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLlamada;
	protected JButton jButtonCerrarToolBarTipoLlamada;
	
	protected JButton jButtonProcesarInformacionToolBarTipoLlamada;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLlamada;
	protected JMenuItem jMenuItemModificarTipoLlamada;
	protected JMenuItem jMenuItemActualizarTipoLlamada;
    protected JMenuItem jMenuItemEliminarTipoLlamada;
	protected JMenuItem jMenuItemCancelarTipoLlamada;
    protected JMenuItem jMenuItemGuardarCambiosTipoLlamada;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLlamada;
	protected JMenuItem jMenuItemCerrarTipoLlamada;
	protected JMenuItem jMenuItemDetalleCerrarTipoLlamada;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLlamada;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoLlamada;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLlamada;
	protected JMenuItem jMenuItemMostrarOcultarTipoLlamada;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLlamada;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLlamada;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLlamada;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoLlamada;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoLlamada;
	public JLabel jLabelIdTipoLlamada;
	public JTextFieldMe jTextFieldidTipoLlamada;
	public JButton jButtonidTipoLlamadaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoLlamada;
	public JLabel jLabelcodigoTipoLlamada;
	public JTextField jTextFieldcodigoTipoLlamada;
	public JButton jButtoncodigoTipoLlamadaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoLlamada;
	public JLabel jLabelnombreTipoLlamada;
	public JTextArea jTextAreanombreTipoLlamada;
	public JScrollPane jscrollPanenombreTipoLlamada;
	public JButton jButtonnombreTipoLlamadaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoLlamada;
	
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
	
	public TipoLlamadaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoLlamada=new JPanel();
				this.jPanelAccionesFormularioTipoLlamada=new JPanel();
				this.jmenuBarDetalleTipoLlamada=new JMenuBar();
				this.jTtoolBarDetalleTipoLlamada=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoLlamadaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLlamadaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLlamada No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoLlamada() {
		return this.jButtonActualizarToolBarTipoLlamada;
	}
	
	public JButton getjButtonEliminarToolBarTipoLlamada() {
		return this.jButtonEliminarToolBarTipoLlamada;
	}
	
	public JButton getjButtonCancelarToolBarTipoLlamada() {
		return this.jButtonCancelarToolBarTipoLlamada;
	}		
	
	public JButton getjButtonProcesarInformacionTipoLlamada() {
		return this.jButtonProcesarInformacionTipoLlamada;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLlamada)	{
		this.jButtonProcesarInformacionTipoLlamada = jButtonProcesarInformacionTipoLlamada;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLlamada() {
		return this.jComboBoxTiposAccionesTipoLlamada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLlamada(
			JComboBox jComboBoxTiposRelacionesTipoLlamada) {
		this.jComboBoxTiposRelacionesTipoLlamada = jComboBoxTiposRelacionesTipoLlamada;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLlamada(
			JComboBox jComboBoxTiposAccionesTipoLlamada) {
		this.jComboBoxTiposAccionesTipoLlamada = jComboBoxTiposAccionesTipoLlamada;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoLlamada() {
		return this.jComboBoxTiposAccionesFormularioTipoLlamada;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoLlamada(
			JComboBox jComboBoxTiposAccionesFormularioTipoLlamada) {
		this.jComboBoxTiposAccionesFormularioTipoLlamada = jComboBoxTiposAccionesFormularioTipoLlamada;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipollamadaSessionBean=new TipoLlamadaSessionBean();
		
		this.tipollamadaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipollamadaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipollamadaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLlamadaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLlamadaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLlamadaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Llamada MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoLlamadaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoLlamada= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoLlamada=new JButtonMe();
				this.jButtonModificarToolBarTipoLlamada=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoLlamada,this.jTtoolBarDetalleTipoLlamada,
							"actualizar","actualizar","Actualizar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoLlamada,this.jTtoolBarDetalleTipoLlamada,
							"eliminar","eliminar","Eliminar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoLlamada,this.jTtoolBarDetalleTipoLlamada,
							"cancelar","cancelar","Cancelar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoLlamada=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoLlamada,this.jTtoolBarDetalleTipoLlamada,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoLlamada=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoLlamada=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoLlamada=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoLlamada=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoLlamada=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLlamada= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLlamada.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLlamada,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoLlamada= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoLlamada.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoLlamada,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoLlamada= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoLlamada.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoLlamada,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoLlamada= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoLlamada.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoLlamada,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoLlamada= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoLlamada.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoLlamada,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoLlamada= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLlamada.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLlamada,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLlamada= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLlamada.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLlamada,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoLlamada= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoLlamada.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoLlamada,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLlamada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLlamada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLlamada,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLlamada= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLlamada.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLlamada,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoLlamada.add(this.jMenuItemDetalleCerrarTipoLlamada);
		
		this.jmenuDetalleAccionesTipoLlamada.add(this.jMenuItemActualizarTipoLlamada);
		this.jmenuDetalleAccionesTipoLlamada.add(this.jMenuItemEliminarTipoLlamada);
		this.jmenuDetalleAccionesTipoLlamada.add(this.jMenuItemCancelarTipoLlamada);		
		
		//this.jmenuDetalleDatosTipoLlamada.add(this.jMenuItemDetalleAbrirOrderByTipoLlamada);				
		this.jmenuDetalleDatosTipoLlamada.add(this.jMenuItemDetalleMostarOcultarTipoLlamada);				
				
		//this.jmenuDetalleAccionesTipoLlamada.add(this.jMenuItemGuardarCambiosTipoLlamada);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoLlamada.add(this.jmenuDetalleArchivoTipoLlamada);		
		this.jmenuBarDetalleTipoLlamada.add(this.jmenuDetalleAccionesTipoLlamada);		
		this.jmenuBarDetalleTipoLlamada.add(this.jmenuDetalleDatosTipoLlamada);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoLlamada);				
	}
	
	
	public void inicializarElementosCamposTipoLlamada() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoLlamada = new JLabelMe();
		jLabelIdTipoLlamada.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoLlamada = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoLlamada.setToolTipText(TipoLlamadaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoLlamada= new GridBagLayout();

		this.jPanelidTipoLlamada.setLayout(this.gridaBagLayoutTipoLlamada);

		jTextFieldidTipoLlamada = new JTextFieldMe();
		jTextFieldidTipoLlamada.setText("Id");

		jTextFieldidTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoLlamada = new JLabelMe();
		this.jLabelcodigoTipoLlamada.setText(""+TipoLlamadaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoLlamada.setToolTipText("Codigo");
		this.jLabelcodigoTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoLlamada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoLlamada.setToolTipText(TipoLlamadaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoLlamada = new GridBagLayout();
		this.jPanelcodigoTipoLlamada.setLayout(this.gridaBagLayoutTipoLlamada);


		jTextFieldcodigoTipoLlamada= new JTextFieldMe();

		jTextFieldcodigoTipoLlamada.setEnabled(false);
		jTextFieldcodigoTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoLlamadaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoLlamadaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoLlamadaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoLlamadaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoLlamadaBusqueda.setText("U");
		this.jButtoncodigoTipoLlamadaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoLlamadaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoLlamadaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoLlamada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoLlamada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoLlamadaBusqueda"));

		if(this.tipollamadaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoLlamadaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoLlamada = new JLabelMe();
		this.jLabelnombreTipoLlamada.setText(""+TipoLlamadaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoLlamada.setToolTipText("Nombre");
		this.jLabelnombreTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoLlamada=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoLlamada.setToolTipText(TipoLlamadaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoLlamada = new GridBagLayout();
		this.jPanelnombreTipoLlamada.setLayout(this.gridaBagLayoutTipoLlamada);


		jTextAreanombreTipoLlamada= new JTextAreaMe();
		jTextAreanombreTipoLlamada.setEnabled(false);
		jTextAreanombreTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLlamada.setLineWrap(true);
		jTextAreanombreTipoLlamada.setWrapStyleWord(true);
		jTextAreanombreTipoLlamada.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoLlamada.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoLlamada = new JScrollPane(jTextAreanombreTipoLlamada);
		jscrollPanenombreTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoLlamadaBusqueda= new JButtonMe();
		this.jButtonnombreTipoLlamadaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLlamadaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLlamadaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoLlamadaBusqueda.setText("U");
		this.jButtonnombreTipoLlamadaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoLlamadaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoLlamadaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoLlamada.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoLlamada.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoLlamadaBusqueda"));

		if(this.tipollamadaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoLlamadaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoLlamada() {
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
		//this.jInternalFrameDetalleTipoLlamada = new TipoLlamadaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Llamada DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLlamada= new GridBagLayout();
		

		
		String sToolTipTipoLlamada="";
		sToolTipTipoLlamada=TipoLlamadaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLlamada+="(Facturacion.TipoLlamada)";
		}
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLlamada+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoLlamada = new JButtonMe();
		this.jButtonModificarTipoLlamada = new JButtonMe();
        this.jButtonActualizarTipoLlamada = new JButtonMe();
        this.jButtonEliminarTipoLlamada = new JButtonMe();
        this.jButtonCancelarTipoLlamada = new JButtonMe();
        this.jButtonGuardarCambiosTipoLlamada = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoLlamada = new JButtonMe();
		this.jButtonCerrarTipoLlamada = new JButtonMe();
		
		this.jScrollPanelDatosTipoLlamada = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoLlamada = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoLlamada = new JScrollPane();
				
		
		
		this.jPanelCamposTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Llamada";
		
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Llamadas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLlamada.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoLlamada.setName("jPanelCamposTipoLlamada"); 

		this.jPanelCamposOcultosTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoLlamada.setName("jPanelCamposOcultosTipoLlamada"); 

        this.jPanelAccionesTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLlamada.setToolTipText("Acciones");
        this.jPanelAccionesTipoLlamada.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoLlamada.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoLlamada.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoLlamada.setText("Nuevo");
		this.jButtonModificarTipoLlamada.setText("Editar");
        this.jButtonActualizarTipoLlamada.setText("Actualizar");
        this.jButtonEliminarTipoLlamada.setText("Eliminar");
        this.jButtonCancelarTipoLlamada.setText("Cancelar");
        this.jButtonGuardarCambiosTipoLlamada.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoLlamada.setText("Guardar");
		this.jButtonCerrarTipoLlamada.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLlamada,"nuevo_button","Nuevo",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoLlamada,"modificar_button","Editar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoLlamada,"actualizar_button","Actualizar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoLlamada,"eliminar_button","Eliminar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoLlamada,"cancelar_button","Cancelar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoLlamada,"guardarcambios_button","Guardar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLlamada,"guardarcambiostabla_button","Guardar",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLlamada,"cerrar_button","Salir",this.tipollamadaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoLlamada.setToolTipText("Nuevo"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoLlamada.setToolTipText("Editar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoLlamada.setToolTipText("Actualizar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoLlamada.setToolTipText("Eliminar)"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoLlamada.setToolTipText("Cancelar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoLlamada.setToolTipText("Guardar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoLlamada.setToolTipText("Guardar"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLlamada.setToolTipText("Salir"+" "+TipoLlamadaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLlamada";
		inputMap = this.jButtonNuevoTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLlamada.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLlamada"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoLlamada";
		inputMap = this.jButtonActualizarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoLlamada"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoLlamada";
		inputMap = this.jButtonEliminarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoLlamada"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoLlamada";
		inputMap = this.jButtonCancelarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoLlamada"));
		
		//CERRAR		
		sMapKey = "CerrarTipoLlamada";
		inputMap = this.jButtonCerrarTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLlamada"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLlamada";
		inputMap = this.jButtonGuardarCambiosTablaTipoLlamada.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLlamada.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLlamada"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoLlamada = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoLlamada.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoLlamada.setToolTipText("Nuevo TipoLlamada");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoLlamada = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoLlamada.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoLlamada.setToolTipText("Sin Cerrar Ventana TipoLlamada");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoLlamada = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoLlamada.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoLlamada.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLlamada.setText("Accion");
		this.jComboBoxTiposAccionesTipoLlamada.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoLlamada = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoLlamada.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoLlamada.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoLlamada = new JLabelMe();
		
		this.jLabelAccionesTipoLlamada.setText("Acciones");		
		this.jLabelAccionesTipoLlamada.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLlamada.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLlamada.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoLlamada();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoLlamada();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoLlamada=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoLlamada.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoLlamada,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoLlamada.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLlamada.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLlamada.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLlamada, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoLlamada.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLlamada.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLlamada.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoLlamada, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoLlamada = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoLlamada = new GridBagLayout();
		
		this.jPanelCamposTipoLlamada.setLayout(gridaBagLayoutCamposTipoLlamada);
		this.jPanelCamposOcultosTipoLlamada.setLayout(gridaBagLayoutCamposOcultosTipoLlamada);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLlamada.gridy = 0;
	this.gridBagConstraintsTipoLlamada.gridx = 0;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoLlamada.add(jLabelIdTipoLlamada, this.gridBagConstraintsTipoLlamada);



	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLlamada.gridy = 0;
	this.gridBagConstraintsTipoLlamada.gridx = 1;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoLlamada.add(jTextFieldidTipoLlamada, this.gridBagConstraintsTipoLlamada);


	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLlamada.gridy = 0;
	this.gridBagConstraintsTipoLlamada.gridx = 0;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoLlamada.add(jLabelcodigoTipoLlamada, this.gridBagConstraintsTipoLlamada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		//this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = 0;
		this.gridBagConstraintsTipoLlamada.gridx = 2;
		this.gridBagConstraintsTipoLlamada.ipadx = 0;
		this.gridBagConstraintsTipoLlamada.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoLlamada.add(jButtoncodigoTipoLlamadaBusqueda, this.gridBagConstraintsTipoLlamada);
	}

	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLlamada.gridy = 0;
	this.gridBagConstraintsTipoLlamada.gridx = 1;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoLlamada.add(jTextFieldcodigoTipoLlamada, this.gridBagConstraintsTipoLlamada);


	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLlamada.gridy = 0;
	this.gridBagConstraintsTipoLlamada.gridx = 0;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoLlamada.add(jLabelnombreTipoLlamada, this.gridBagConstraintsTipoLlamada);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		//this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLlamada.gridy = 0;
		this.gridBagConstraintsTipoLlamada.gridx = 2;
		this.gridBagConstraintsTipoLlamada.ipadx = 0;
		this.gridBagConstraintsTipoLlamada.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoLlamada.add(jButtonnombreTipoLlamadaBusqueda, this.gridBagConstraintsTipoLlamada);
	}

	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLlamada.gridy = 0;
	this.gridBagConstraintsTipoLlamada.gridx = 1;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoLlamada.add(jscrollPanenombreTipoLlamada, this.gridBagConstraintsTipoLlamada);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLlamada.gridy = iYPanelCamposTipoLlamada;
	this.gridBagConstraintsTipoLlamada.gridx = iXPanelCamposTipoLlamada++;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLlamada.add(this.jPanelidTipoLlamada, this.gridBagConstraintsTipoLlamada);



	if(iXPanelCamposTipoLlamada % 1==0) {
		iXPanelCamposTipoLlamada=0;
		iYPanelCamposTipoLlamada++;
	}
	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLlamada.gridy = iYPanelCamposTipoLlamada;
	this.gridBagConstraintsTipoLlamada.gridx = iXPanelCamposTipoLlamada++;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLlamada.add(this.jPanelcodigoTipoLlamada, this.gridBagConstraintsTipoLlamada);



	if(iXPanelCamposTipoLlamada % 1==0) {
		iXPanelCamposTipoLlamada=0;
		iYPanelCamposTipoLlamada++;
	}
	this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLlamada.gridy = iYPanelCamposTipoLlamada;
	this.gridBagConstraintsTipoLlamada.gridx = iXPanelCamposTipoLlamada++;
	this.gridBagConstraintsTipoLlamada.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLlamada.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLlamada.add(this.jPanelnombreTipoLlamada, this.gridBagConstraintsTipoLlamada);



	if(iXPanelCamposTipoLlamada % 1==0) {
		iXPanelCamposTipoLlamada=0;
		iYPanelCamposTipoLlamada++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoLlamada= new GridBagLayout();
		this.jPanelAccionesTipoLlamada.setLayout(gridaBagLayoutAccionesTipoLlamada);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoLlamada= new GridBagLayout();
		this.jPanelAccionesFormularioTipoLlamada.setLayout(gridaBagLayoutAccionesFormularioTipoLlamada);
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLlamada.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLlamada.add(this.jComboBoxTiposAccionesFormularioTipoLlamada, this.gridBagConstraintsTipoLlamada);

		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLlamada.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLlamada.add(this.jCheckBoxPostAccionNuevoTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipollamadaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLlamada.add(this.jCheckBoxPostAccionSinCerrarTipoLlamada, this.gridBagConstraintsTipoLlamada);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipollamadaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipollamadaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLlamada.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLlamada.add(this.jCheckBoxPostAccionSinMensajeTipoLlamada, this.gridBagConstraintsTipoLlamada);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = 0;
		this.gridBagConstraintsTipoLlamada.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoLlamada.add(this.jButtonModificarTipoLlamada, this.gridBagConstraintsTipoLlamada);							

		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLlamada.gridy = 0;
		this.gridBagConstraintsTipoLlamada.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoLlamada.add(this.jButtonEliminarTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
			
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = 0;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLlamada.add(this.jButtonActualizarTipoLlamada, this.gridBagConstraintsTipoLlamada);


		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = 0;		
		this.gridBagConstraintsTipoLlamada.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLlamada.add(this.jButtonGuardarCambiosTipoLlamada, this.gridBagConstraintsTipoLlamada);	
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = 0;		
		this.gridBagConstraintsTipoLlamada.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoLlamada.add(this.jButtonCancelarTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLlamada = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLlamada);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipollamadaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();						
			this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLlamada.gridx = 0;		
			//this.gridBagConstraintsTipoLlamada.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLlamada.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLlamada.gridx =0;
		this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLlamada.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLlamada, this.gridBagConstraintsTipoLlamada);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoLlamadaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoLlamada = new TipoLlamadaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Llamada DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Llamada DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Llamada Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoLlamadaModel tipollamadaModel=new TipoLlamadaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoLlamadaModel.TipoLlamadaFocusTraversalPolicy tipollamadaFocusTraversalPolicy = tipollamadaModel.new TipoLlamadaFocusTraversalPolicy(this);
			
			//tipollamadaFocusTraversalPolicy.settipollamadaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipollamadaModel);
			
			
			this.jContentPaneDetalleTipoLlamada = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoLlamada = new GridBagLayout();	
			this.jContentPaneDetalleTipoLlamada.setLayout(gridaBagLayoutDetalleTipoLlamada);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLlamada = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
				this.gridBagConstraintsTipoLlamada.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoLlamada.gridx = 0;
					
				
				this.jContentPaneDetalleTipoLlamada.add(jTtoolBarDetalleTipoLlamada, gridBagConstraintsTipoLlamada);								
				
}
			
			this.jScrollPanelDatosEdicionTipoLlamada=   new JScrollPane(jContentPaneDetalleTipoLlamada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLlamada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLlamada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLlamada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoLlamada=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLlamada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLlamada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLlamada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoLlamada.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoLlamada.gridx = 0;
	        
			this.jContentPaneDetalleTipoLlamada.add(jPanelCamposTipoLlamada, gridBagConstraintsTipoLlamada);
			
			
			
			
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
						&& tipollamadaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipollamadaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoLlamada= new GridBagConstraints();
						this.gridBagConstraintsTipoLlamada.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoLlamada.gridx = 0;
						this.jContentPaneDetalleTipoLlamada.add(this.jTabbedPaneRelacionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoLlamada.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoLlamada.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
					this.gridBagConstraintsTipoLlamada.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoLlamada.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoLlamada.gridx = 0;
					
				
					this.jContentPaneDetalleTipoLlamada.add(jPanelCamposOcultosTipoLlamada, gridBagConstraintsTipoLlamada);
				
					this.jPanelCamposOcultosTipoLlamada.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoLlamada.gridx = 0;
	        this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoLlamada.add(this.jPanelAccionesFormularioTipoLlamada, this.gridBagConstraintsTipoLlamada);							
			
			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
	        this.gridBagConstraintsTipoLlamada.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoLlamada.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoLlamada.add(this.jPanelAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoLlamada);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoLlamada=   new JScrollPane(this.jPanelCamposTipoLlamada,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLlamada.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLlamada.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLlamada.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoLlamada.gridx = 0;
			this.gridBagConstraintsTipoLlamada.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoLlamada.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoLlamada.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLlamada.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoLlamada, this.gridBagConstraintsTipoLlamada);			
			
			this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
			this.gridBagConstraintsTipoLlamada.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLlamada.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLlamada, this.gridBagConstraintsTipoLlamada);
			
			
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLlamada, this.gridBagConstraintsTipoLlamada);
		
			
		this.gridBagConstraintsTipoLlamada = new GridBagConstraints();
		this.gridBagConstraintsTipoLlamada.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLlamada.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLlamada, this.gridBagConstraintsTipoLlamada);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoLlamada;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoLlamada;
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
