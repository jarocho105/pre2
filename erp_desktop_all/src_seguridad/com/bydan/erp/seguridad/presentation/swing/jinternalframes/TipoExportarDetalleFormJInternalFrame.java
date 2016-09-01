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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.TipoExportarConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class TipoExportarDetalleFormJInternalFrame extends TipoExportarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoExportar;
	
	protected JMenuBar jmenuBarDetalleTipoExportar;
	
	protected JMenu jmenuDetalleTipoExportar;
	protected JMenu jmenuDetalleArchivoTipoExportar;
	protected JMenu jmenuDetalleAccionesTipoExportar;
	protected JMenu jmenuDetalleDatosTipoExportar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoExportar;	
	protected GridBagConstraints gridBagConstraintsTipoExportar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoExportarBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoExportar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoExportarSessionBean tipoexportarSessionBean;
	
	
	
		
	
	public TipoExportarLogic tipoexportarLogic;
	
	public JScrollPane jScrollPanelDatosTipoExportar;
	public JScrollPane jScrollPanelDatosEdicionTipoExportar;
	public JScrollPane jScrollPanelDatosGeneralTipoExportar;
	
	protected JPanel jPanelCamposTipoExportar;    
	protected JPanel jPanelCamposOcultosTipoExportar;    	
	protected JPanel jPanelAccionesTipoExportar;
	protected JPanel jPanelAccionesFormularioTipoExportar;
    
	
	
	protected Integer iXPanelCamposTipoExportar=0;
	protected Integer iYPanelCamposTipoExportar=0;
	
	protected Integer iXPanelCamposOcultosTipoExportar=0;
	protected Integer iYPanelCamposOcultosTipoExportar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoExportar;
	public JButton jButtonModificarTipoExportar;
	public JButton jButtonActualizarTipoExportar;
    public JButton jButtonEliminarTipoExportar;
	public JButton jButtonCancelarTipoExportar;
    public JButton jButtonGuardarCambiosTipoExportar;
	public JButton jButtonGuardarCambiosTablaTipoExportar;
	protected JButton jButtonCerrarTipoExportar;
	
	
	protected JButton jButtonProcesarInformacionTipoExportar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoExportar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoExportar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoExportar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoExportar;
	protected JButton jButtonModificarToolBarTipoExportar;
	protected JButton jButtonActualizarToolBarTipoExportar;
    protected JButton jButtonEliminarToolBarTipoExportar;
	protected JButton jButtonCancelarToolBarTipoExportar;
    protected JButton jButtonGuardarCambiosToolBarTipoExportar;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoExportar;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoExportar;
	protected JButton jButtonCerrarToolBarTipoExportar;
	
	protected JButton jButtonProcesarInformacionToolBarTipoExportar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoExportar;
	protected JMenuItem jMenuItemModificarTipoExportar;
	protected JMenuItem jMenuItemActualizarTipoExportar;
    protected JMenuItem jMenuItemEliminarTipoExportar;
	protected JMenuItem jMenuItemCancelarTipoExportar;
    protected JMenuItem jMenuItemGuardarCambiosTipoExportar;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoExportar;
	protected JMenuItem jMenuItemCerrarTipoExportar;
	protected JMenuItem jMenuItemDetalleCerrarTipoExportar;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoExportar;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoExportar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoExportar;
	protected JMenuItem jMenuItemMostrarOcultarTipoExportar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoExportar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoExportar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoExportar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoExportar;
	public JLabel jLabelIdTipoExportar;
	public JTextFieldMe jTextFieldidTipoExportar;
	public JButton jButtonidTipoExportarBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoExportar;
	public JLabel jLabelcodigoTipoExportar;
	public JTextField jTextFieldcodigoTipoExportar;
	public JButton jButtoncodigoTipoExportarBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoExportar;
	public JLabel jLabelnombreTipoExportar;
	public JTextArea jTextAreanombreTipoExportar;
	public JScrollPane jscrollPanenombreTipoExportar;
	public JButton jButtonnombreTipoExportarBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoExportar;
	
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
	
	public TipoExportarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoExportar=new JPanel();
				this.jPanelAccionesFormularioTipoExportar=new JPanel();
				this.jmenuBarDetalleTipoExportar=new JMenuBar();
				this.jTtoolBarDetalleTipoExportar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoExportarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoExportarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoExportar() {
		return this.jButtonActualizarToolBarTipoExportar;
	}
	
	public JButton getjButtonEliminarToolBarTipoExportar() {
		return this.jButtonEliminarToolBarTipoExportar;
	}
	
	public JButton getjButtonCancelarToolBarTipoExportar() {
		return this.jButtonCancelarToolBarTipoExportar;
	}		
	
	public JButton getjButtonProcesarInformacionTipoExportar() {
		return this.jButtonProcesarInformacionTipoExportar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoExportar)	{
		this.jButtonProcesarInformacionTipoExportar = jButtonProcesarInformacionTipoExportar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoExportar() {
		return this.jComboBoxTiposAccionesTipoExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoExportar(
			JComboBox jComboBoxTiposRelacionesTipoExportar) {
		this.jComboBoxTiposRelacionesTipoExportar = jComboBoxTiposRelacionesTipoExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoExportar(
			JComboBox jComboBoxTiposAccionesTipoExportar) {
		this.jComboBoxTiposAccionesTipoExportar = jComboBoxTiposAccionesTipoExportar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoExportar() {
		return this.jComboBoxTiposAccionesFormularioTipoExportar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoExportar(
			JComboBox jComboBoxTiposAccionesFormularioTipoExportar) {
		this.jComboBoxTiposAccionesFormularioTipoExportar = jComboBoxTiposAccionesFormularioTipoExportar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoexportarSessionBean=new TipoExportarSessionBean();
		
		this.tipoexportarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoexportarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoexportarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoExportarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoExportarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Exportar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoExportarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoExportar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoExportar=new JButtonMe();
				this.jButtonModificarToolBarTipoExportar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoExportar,this.jTtoolBarDetalleTipoExportar,
							"actualizar","actualizar","Actualizar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoExportar,this.jTtoolBarDetalleTipoExportar,
							"eliminar","eliminar","Eliminar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoExportar,this.jTtoolBarDetalleTipoExportar,
							"cancelar","cancelar","Cancelar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoExportar,this.jTtoolBarDetalleTipoExportar,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoExportar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoExportar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoExportar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoExportar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoExportar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoExportar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoExportar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoExportar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoExportar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoExportar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoExportar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoExportar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoExportar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoExportar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoExportar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoExportar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoExportar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoExportar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoExportar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoExportar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoExportar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoExportar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoExportar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoExportar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoExportar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoExportar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoExportar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoExportar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoExportar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoExportar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoExportar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoExportar.add(this.jMenuItemDetalleCerrarTipoExportar);
		
		this.jmenuDetalleAccionesTipoExportar.add(this.jMenuItemActualizarTipoExportar);
		this.jmenuDetalleAccionesTipoExportar.add(this.jMenuItemEliminarTipoExportar);
		this.jmenuDetalleAccionesTipoExportar.add(this.jMenuItemCancelarTipoExportar);		
		
		//this.jmenuDetalleDatosTipoExportar.add(this.jMenuItemDetalleAbrirOrderByTipoExportar);				
		this.jmenuDetalleDatosTipoExportar.add(this.jMenuItemDetalleMostarOcultarTipoExportar);				
				
		//this.jmenuDetalleAccionesTipoExportar.add(this.jMenuItemGuardarCambiosTipoExportar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoExportar.add(this.jmenuDetalleArchivoTipoExportar);		
		this.jmenuBarDetalleTipoExportar.add(this.jmenuDetalleAccionesTipoExportar);		
		this.jmenuBarDetalleTipoExportar.add(this.jmenuDetalleDatosTipoExportar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoExportar);				
	}
	
	
	public void inicializarElementosCamposTipoExportar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoExportar = new JLabelMe();
		jLabelIdTipoExportar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoExportar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoExportar.setToolTipText(TipoExportarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoExportar= new GridBagLayout();

		this.jPanelidTipoExportar.setLayout(this.gridaBagLayoutTipoExportar);

		jTextFieldidTipoExportar = new JTextFieldMe();
		jTextFieldidTipoExportar.setText("Id");

		jTextFieldidTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoExportar = new JLabelMe();
		this.jLabelcodigoTipoExportar.setText(""+TipoExportarConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoExportar.setToolTipText("Codigo");
		this.jLabelcodigoTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoExportar.setToolTipText(TipoExportarConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoExportar = new GridBagLayout();
		this.jPanelcodigoTipoExportar.setLayout(this.gridaBagLayoutTipoExportar);


		jTextFieldcodigoTipoExportar= new JTextFieldMe();

		jTextFieldcodigoTipoExportar.setEnabled(false);
		jTextFieldcodigoTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoExportarBusqueda= new JButtonMe();
		this.jButtoncodigoTipoExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoExportarBusqueda.setText("U");
		this.jButtoncodigoTipoExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoExportarBusqueda"));

		if(this.tipoexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoExportarBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoExportar = new JLabelMe();
		this.jLabelnombreTipoExportar.setText(""+TipoExportarConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoExportar.setToolTipText("Nombre");
		this.jLabelnombreTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoExportar.setToolTipText(TipoExportarConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoExportar = new GridBagLayout();
		this.jPanelnombreTipoExportar.setLayout(this.gridaBagLayoutTipoExportar);


		jTextAreanombreTipoExportar= new JTextAreaMe();
		jTextAreanombreTipoExportar.setEnabled(false);
		jTextAreanombreTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoExportar.setLineWrap(true);
		jTextAreanombreTipoExportar.setWrapStyleWord(true);
		jTextAreanombreTipoExportar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoExportar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoExportar = new JScrollPane(jTextAreanombreTipoExportar);
		jscrollPanenombreTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoExportarBusqueda= new JButtonMe();
		this.jButtonnombreTipoExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoExportarBusqueda.setText("U");
		this.jButtonnombreTipoExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoExportarBusqueda"));

		if(this.tipoexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoExportarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoExportar() {
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
		//this.jInternalFrameDetalleTipoExportar = new TipoExportarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Exportar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoExportar= new GridBagLayout();
		

		
		String sToolTipTipoExportar="";
		sToolTipTipoExportar=TipoExportarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoExportar+="(Seguridad.TipoExportar)";
		}
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoExportar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoExportar = new JButtonMe();
		this.jButtonModificarTipoExportar = new JButtonMe();
        this.jButtonActualizarTipoExportar = new JButtonMe();
        this.jButtonEliminarTipoExportar = new JButtonMe();
        this.jButtonCancelarTipoExportar = new JButtonMe();
        this.jButtonGuardarCambiosTipoExportar = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoExportar = new JButtonMe();
		this.jButtonCerrarTipoExportar = new JButtonMe();
		
		this.jScrollPanelDatosTipoExportar = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoExportar = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoExportar = new JScrollPane();
				
		
		
		this.jPanelCamposTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Exportar";
		
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Exportars" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoExportar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoExportar.setName("jPanelCamposTipoExportar"); 

		this.jPanelCamposOcultosTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoExportar.setName("jPanelCamposOcultosTipoExportar"); 

        this.jPanelAccionesTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoExportar.setToolTipText("Acciones");
        this.jPanelAccionesTipoExportar.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoExportar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoExportar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoExportar.setText("Nuevo");
		this.jButtonModificarTipoExportar.setText("Editar");
        this.jButtonActualizarTipoExportar.setText("Actualizar");
        this.jButtonEliminarTipoExportar.setText("Eliminar");
        this.jButtonCancelarTipoExportar.setText("Cancelar");
        this.jButtonGuardarCambiosTipoExportar.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoExportar.setText("Guardar");
		this.jButtonCerrarTipoExportar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoExportar,"nuevo_button","Nuevo",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoExportar,"modificar_button","Editar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoExportar,"actualizar_button","Actualizar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoExportar,"eliminar_button","Eliminar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoExportar,"cancelar_button","Cancelar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoExportar,"guardarcambios_button","Guardar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoExportar,"guardarcambiostabla_button","Guardar",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoExportar,"cerrar_button","Salir",this.tipoexportarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoExportar.setToolTipText("Nuevo"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoExportar.setToolTipText("Editar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoExportar.setToolTipText("Actualizar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoExportar.setToolTipText("Eliminar)"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoExportar.setToolTipText("Cancelar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoExportar.setToolTipText("Guardar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoExportar.setToolTipText("Guardar"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoExportar.setToolTipText("Salir"+" "+TipoExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoExportar";
		inputMap = this.jButtonNuevoTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoExportar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoExportar";
		inputMap = this.jButtonActualizarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoExportar"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoExportar";
		inputMap = this.jButtonEliminarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoExportar"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoExportar";
		inputMap = this.jButtonCancelarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoExportar"));
		
		//CERRAR		
		sMapKey = "CerrarTipoExportar";
		inputMap = this.jButtonCerrarTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoExportar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoExportar";
		inputMap = this.jButtonGuardarCambiosTablaTipoExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoExportar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoExportar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoExportar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoExportar.setToolTipText("Nuevo TipoExportar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoExportar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoExportar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoExportar.setToolTipText("Sin Cerrar Ventana TipoExportar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoExportar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoExportar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoExportar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoExportar.setText("Accion");
		this.jComboBoxTiposAccionesTipoExportar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoExportar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoExportar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoExportar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoExportar = new JLabelMe();
		
		this.jLabelAccionesTipoExportar.setText("Acciones");		
		this.jLabelAccionesTipoExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoExportar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoExportar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoExportar=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoExportar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoExportar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoExportar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoExportar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoExportar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoExportar = new GridBagLayout();
		
		this.jPanelCamposTipoExportar.setLayout(gridaBagLayoutCamposTipoExportar);
		this.jPanelCamposOcultosTipoExportar.setLayout(gridaBagLayoutCamposOcultosTipoExportar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoExportar.gridy = 0;
	this.gridBagConstraintsTipoExportar.gridx = 0;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoExportar.add(jLabelIdTipoExportar, this.gridBagConstraintsTipoExportar);



	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoExportar.gridy = 0;
	this.gridBagConstraintsTipoExportar.gridx = 1;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoExportar.add(jTextFieldidTipoExportar, this.gridBagConstraintsTipoExportar);


	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoExportar.gridy = 0;
	this.gridBagConstraintsTipoExportar.gridx = 0;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoExportar.add(jLabelcodigoTipoExportar, this.gridBagConstraintsTipoExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		//this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = 0;
		this.gridBagConstraintsTipoExportar.gridx = 2;
		this.gridBagConstraintsTipoExportar.ipadx = 0;
		this.gridBagConstraintsTipoExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoExportar.add(jButtoncodigoTipoExportarBusqueda, this.gridBagConstraintsTipoExportar);
	}

	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoExportar.gridy = 0;
	this.gridBagConstraintsTipoExportar.gridx = 1;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoExportar.add(jTextFieldcodigoTipoExportar, this.gridBagConstraintsTipoExportar);


	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoExportar.gridy = 0;
	this.gridBagConstraintsTipoExportar.gridx = 0;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoExportar.add(jLabelnombreTipoExportar, this.gridBagConstraintsTipoExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		//this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoExportar.gridy = 0;
		this.gridBagConstraintsTipoExportar.gridx = 2;
		this.gridBagConstraintsTipoExportar.ipadx = 0;
		this.gridBagConstraintsTipoExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoExportar.add(jButtonnombreTipoExportarBusqueda, this.gridBagConstraintsTipoExportar);
	}

	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoExportar.gridy = 0;
	this.gridBagConstraintsTipoExportar.gridx = 1;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoExportar.add(jscrollPanenombreTipoExportar, this.gridBagConstraintsTipoExportar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoExportar.gridy = iYPanelCamposTipoExportar;
	this.gridBagConstraintsTipoExportar.gridx = iXPanelCamposTipoExportar++;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoExportar.add(this.jPanelidTipoExportar, this.gridBagConstraintsTipoExportar);



	if(iXPanelCamposTipoExportar % 1==0) {
		iXPanelCamposTipoExportar=0;
		iYPanelCamposTipoExportar++;
	}
	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoExportar.gridy = iYPanelCamposTipoExportar;
	this.gridBagConstraintsTipoExportar.gridx = iXPanelCamposTipoExportar++;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoExportar.add(this.jPanelcodigoTipoExportar, this.gridBagConstraintsTipoExportar);



	if(iXPanelCamposTipoExportar % 1==0) {
		iXPanelCamposTipoExportar=0;
		iYPanelCamposTipoExportar++;
	}
	this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoExportar.gridy = iYPanelCamposTipoExportar;
	this.gridBagConstraintsTipoExportar.gridx = iXPanelCamposTipoExportar++;
	this.gridBagConstraintsTipoExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoExportar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoExportar.add(this.jPanelnombreTipoExportar, this.gridBagConstraintsTipoExportar);



	if(iXPanelCamposTipoExportar % 1==0) {
		iXPanelCamposTipoExportar=0;
		iYPanelCamposTipoExportar++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoExportar= new GridBagLayout();
		this.jPanelAccionesTipoExportar.setLayout(gridaBagLayoutAccionesTipoExportar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoExportar= new GridBagLayout();
		this.jPanelAccionesFormularioTipoExportar.setLayout(gridaBagLayoutAccionesFormularioTipoExportar);
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoExportar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoExportar.add(this.jComboBoxTiposAccionesFormularioTipoExportar, this.gridBagConstraintsTipoExportar);

		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoExportar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoExportar.add(this.jCheckBoxPostAccionNuevoTipoExportar, this.gridBagConstraintsTipoExportar);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoexportarSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoExportar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoExportar.add(this.jCheckBoxPostAccionSinCerrarTipoExportar, this.gridBagConstraintsTipoExportar);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoexportarSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoexportarSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoExportar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoExportar.add(this.jCheckBoxPostAccionSinMensajeTipoExportar, this.gridBagConstraintsTipoExportar);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = 0;
		this.gridBagConstraintsTipoExportar.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoExportar.add(this.jButtonModificarTipoExportar, this.gridBagConstraintsTipoExportar);							

		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoExportar.gridy = 0;
		this.gridBagConstraintsTipoExportar.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoExportar.add(this.jButtonEliminarTipoExportar, this.gridBagConstraintsTipoExportar);
		
			
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = 0;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoExportar.add(this.jButtonActualizarTipoExportar, this.gridBagConstraintsTipoExportar);


		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = 0;		
		this.gridBagConstraintsTipoExportar.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoExportar.add(this.jButtonGuardarCambiosTipoExportar, this.gridBagConstraintsTipoExportar);	
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = 0;		
		this.gridBagConstraintsTipoExportar.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoExportar.add(this.jButtonCancelarTipoExportar, this.gridBagConstraintsTipoExportar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoExportar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoExportar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoexportarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();						
			this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoExportar.gridx = 0;		
			//this.gridBagConstraintsTipoExportar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoExportar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoExportar.gridx =0;
		this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoExportar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoExportar, this.gridBagConstraintsTipoExportar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoExportarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoExportar = new TipoExportarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Exportar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Exportar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Exportar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoExportarModel tipoexportarModel=new TipoExportarModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoExportarModel.TipoExportarFocusTraversalPolicy tipoexportarFocusTraversalPolicy = tipoexportarModel.new TipoExportarFocusTraversalPolicy(this);
			
			//tipoexportarFocusTraversalPolicy.settipoexportarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoexportarModel);
			
			
			this.jContentPaneDetalleTipoExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoExportar = new GridBagLayout();	
			this.jContentPaneDetalleTipoExportar.setLayout(gridaBagLayoutDetalleTipoExportar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoExportar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoExportar = new GridBagConstraints();
				this.gridBagConstraintsTipoExportar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoExportar.gridx = 0;
					
				
				this.jContentPaneDetalleTipoExportar.add(jTtoolBarDetalleTipoExportar, gridBagConstraintsTipoExportar);								
				
}
			
			this.jScrollPanelDatosEdicionTipoExportar=   new JScrollPane(jContentPaneDetalleTipoExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoExportar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoExportar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoExportar.gridx = 0;
	        
			this.jContentPaneDetalleTipoExportar.add(jPanelCamposTipoExportar, gridBagConstraintsTipoExportar);
			
			
			
			
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
						&& tipoexportarSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoexportarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoExportar= new GridBagConstraints();
						this.gridBagConstraintsTipoExportar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoExportar.gridx = 0;
						this.jContentPaneDetalleTipoExportar.add(this.jTabbedPaneRelacionesTipoExportar, this.gridBagConstraintsTipoExportar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoExportar.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoExportar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoExportar = new GridBagConstraints();
					this.gridBagConstraintsTipoExportar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoExportar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoExportar.gridx = 0;
					
				
					this.jContentPaneDetalleTipoExportar.add(jPanelCamposOcultosTipoExportar, gridBagConstraintsTipoExportar);
				
					this.jPanelCamposOcultosTipoExportar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoExportar.gridx = 0;
	        this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoExportar.add(this.jPanelAccionesFormularioTipoExportar, this.gridBagConstraintsTipoExportar);							
			
			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
	        this.gridBagConstraintsTipoExportar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoExportar.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoExportar.add(this.jPanelAccionesTipoExportar, this.gridBagConstraintsTipoExportar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoExportar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoExportar=   new JScrollPane(this.jPanelCamposTipoExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoExportar.gridx = 0;
			this.gridBagConstraintsTipoExportar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoExportar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoExportar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoExportar, this.gridBagConstraintsTipoExportar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoExportar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoExportar, this.gridBagConstraintsTipoExportar);			
			
			this.gridBagConstraintsTipoExportar = new GridBagConstraints();
			this.gridBagConstraintsTipoExportar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoExportar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoExportar, this.gridBagConstraintsTipoExportar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoExportar, this.gridBagConstraintsTipoExportar);
			
			
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoExportar, this.gridBagConstraintsTipoExportar);
		
			
		this.gridBagConstraintsTipoExportar = new GridBagConstraints();
		this.gridBagConstraintsTipoExportar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoExportar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoExportar, this.gridBagConstraintsTipoExportar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoExportar;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoExportar;
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
