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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;



import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;



//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.ProcesarCrearIndicesConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class ProcesarCrearIndicesDetalleFormJInternalFrame extends ProcesarCrearIndicesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProcesarCrearIndices;
	
	protected JMenuBar jmenuBarDetalleProcesarCrearIndices;
	
	protected JMenu jmenuDetalleProcesarCrearIndices;
	protected JMenu jmenuDetalleArchivoProcesarCrearIndices;
	protected JMenu jmenuDetalleAccionesProcesarCrearIndices;
	protected JMenu jmenuDetalleDatosProcesarCrearIndices;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProcesarCrearIndices;	
	protected GridBagConstraints gridBagConstraintsProcesarCrearIndices;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProcesarCrearIndicesBeanSwingJInternalFrameAdditional jInternalFrameDetalleProcesarCrearIndices;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProcesarCrearIndicesSessionBean procesarcrearindicesSessionBean;
	
	
	
		
	
	public ProcesarCrearIndicesLogic procesarcrearindicesLogic;
	
	public JScrollPane jScrollPanelDatosProcesarCrearIndices;
	public JScrollPane jScrollPanelDatosEdicionProcesarCrearIndices;
	public JScrollPane jScrollPanelDatosGeneralProcesarCrearIndices;
	
	protected JPanel jPanelCamposProcesarCrearIndices;    
	protected JPanel jPanelCamposOcultosProcesarCrearIndices;    	
	protected JPanel jPanelAccionesProcesarCrearIndices;
	protected JPanel jPanelAccionesFormularioProcesarCrearIndices;
    
	
	
	protected Integer iXPanelCamposProcesarCrearIndices=0;
	protected Integer iYPanelCamposProcesarCrearIndices=0;
	
	protected Integer iXPanelCamposOcultosProcesarCrearIndices=0;
	protected Integer iYPanelCamposOcultosProcesarCrearIndices=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProcesarCrearIndices;
	public JButton jButtonModificarProcesarCrearIndices;
	public JButton jButtonActualizarProcesarCrearIndices;
    public JButton jButtonEliminarProcesarCrearIndices;
	public JButton jButtonCancelarProcesarCrearIndices;
    public JButton jButtonGuardarCambiosProcesarCrearIndices;
	public JButton jButtonGuardarCambiosTablaProcesarCrearIndices;
	protected JButton jButtonCerrarProcesarCrearIndices;
	
	
	protected JButton jButtonProcesarInformacionProcesarCrearIndices;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProcesarCrearIndices;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProcesarCrearIndices;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProcesarCrearIndices;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProcesarCrearIndices;
	protected JButton jButtonModificarToolBarProcesarCrearIndices;
	protected JButton jButtonActualizarToolBarProcesarCrearIndices;
    protected JButton jButtonEliminarToolBarProcesarCrearIndices;
	protected JButton jButtonCancelarToolBarProcesarCrearIndices;
    protected JButton jButtonGuardarCambiosToolBarProcesarCrearIndices;
	protected JButton jButtonGuardarCambiosTablaToolBarProcesarCrearIndices;
	protected JButton jButtonMostrarOcultarTablaToolBarProcesarCrearIndices;
	protected JButton jButtonCerrarToolBarProcesarCrearIndices;
	
	protected JButton jButtonProcesarInformacionToolBarProcesarCrearIndices;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProcesarCrearIndices;
	protected JMenuItem jMenuItemModificarProcesarCrearIndices;
	protected JMenuItem jMenuItemActualizarProcesarCrearIndices;
    protected JMenuItem jMenuItemEliminarProcesarCrearIndices;
	protected JMenuItem jMenuItemCancelarProcesarCrearIndices;
    protected JMenuItem jMenuItemGuardarCambiosProcesarCrearIndices;
	protected JMenuItem jMenuItemGuardarCambiosTablaProcesarCrearIndices;
	protected JMenuItem jMenuItemCerrarProcesarCrearIndices;
	protected JMenuItem jMenuItemDetalleCerrarProcesarCrearIndices;
	protected JMenuItem jMenuItemDetalleMostarOcultarProcesarCrearIndices;
	
	protected JMenuItem jMenuItemProcesarInformacionProcesarCrearIndices;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProcesarCrearIndices;
	protected JMenuItem jMenuItemMostrarOcultarProcesarCrearIndices;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProcesarCrearIndices;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProcesarCrearIndices;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProcesarCrearIndices;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProcesarCrearIndices;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProcesarCrearIndices;
	public JLabel jLabelIdProcesarCrearIndices;
	public JLabel jLabelidProcesarCrearIndices;
	public JButton jButtonidProcesarCrearIndicesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProcesarCrearIndices;
	
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
	public int iHeightFormulario=154;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProcesarCrearIndicesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProcesarCrearIndices=new JPanel();
				this.jPanelAccionesFormularioProcesarCrearIndices=new JPanel();
				this.jmenuBarDetalleProcesarCrearIndices=new JMenuBar();
				this.jTtoolBarDetalleProcesarCrearIndices=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProcesarCrearIndicesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProcesarCrearIndicesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProcesarCrearIndices No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProcesarCrearIndices() {
		return this.jButtonActualizarToolBarProcesarCrearIndices;
	}
	
	public JButton getjButtonEliminarToolBarProcesarCrearIndices() {
		return this.jButtonEliminarToolBarProcesarCrearIndices;
	}
	
	public JButton getjButtonCancelarToolBarProcesarCrearIndices() {
		return this.jButtonCancelarToolBarProcesarCrearIndices;
	}		
	
	public JButton getjButtonProcesarInformacionProcesarCrearIndices() {
		return this.jButtonProcesarInformacionProcesarCrearIndices;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProcesarCrearIndices)	{
		this.jButtonProcesarInformacionProcesarCrearIndices = jButtonProcesarInformacionProcesarCrearIndices;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProcesarCrearIndices() {
		return this.jComboBoxTiposAccionesProcesarCrearIndices;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProcesarCrearIndices(
			JComboBox jComboBoxTiposRelacionesProcesarCrearIndices) {
		this.jComboBoxTiposRelacionesProcesarCrearIndices = jComboBoxTiposRelacionesProcesarCrearIndices;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProcesarCrearIndices(
			JComboBox jComboBoxTiposAccionesProcesarCrearIndices) {
		this.jComboBoxTiposAccionesProcesarCrearIndices = jComboBoxTiposAccionesProcesarCrearIndices;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProcesarCrearIndices() {
		return this.jComboBoxTiposAccionesFormularioProcesarCrearIndices;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProcesarCrearIndices(
			JComboBox jComboBoxTiposAccionesFormularioProcesarCrearIndices) {
		this.jComboBoxTiposAccionesFormularioProcesarCrearIndices = jComboBoxTiposAccionesFormularioProcesarCrearIndices;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.procesarcrearindicesSessionBean=new ProcesarCrearIndicesSessionBean();
		
		this.procesarcrearindicesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesarcrearindicesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.procesarcrearindicesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProcesarCrearIndicesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProcesarCrearIndicesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProcesarCrearIndicesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Procesar Crear Indices MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
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
	
		ProcesarCrearIndicesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProcesarCrearIndices= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProcesarCrearIndices=new JButtonMe();
				this.jButtonModificarToolBarProcesarCrearIndices=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProcesarCrearIndices,this.jTtoolBarDetalleProcesarCrearIndices,
							"actualizar","actualizar","Actualizar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProcesarCrearIndices,this.jTtoolBarDetalleProcesarCrearIndices,
							"eliminar","eliminar","Eliminar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProcesarCrearIndices,this.jTtoolBarDetalleProcesarCrearIndices,
							"cancelar","cancelar","Cancelar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProcesarCrearIndices=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProcesarCrearIndices,this.jTtoolBarDetalleProcesarCrearIndices,
							"guardarcambios","guardarcambios","Guardar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProcesarCrearIndices=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProcesarCrearIndices=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProcesarCrearIndices=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProcesarCrearIndices=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProcesarCrearIndices=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProcesarCrearIndices= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProcesarCrearIndices.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProcesarCrearIndices,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProcesarCrearIndices= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProcesarCrearIndices.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProcesarCrearIndices,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProcesarCrearIndices= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProcesarCrearIndices.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProcesarCrearIndices,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProcesarCrearIndices= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProcesarCrearIndices.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProcesarCrearIndices,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProcesarCrearIndices= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProcesarCrearIndices.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProcesarCrearIndices,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProcesarCrearIndices= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProcesarCrearIndices.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProcesarCrearIndices,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProcesarCrearIndices= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProcesarCrearIndices.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProcesarCrearIndices,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProcesarCrearIndices= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProcesarCrearIndices.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProcesarCrearIndices,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProcesarCrearIndices= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProcesarCrearIndices.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProcesarCrearIndices,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProcesarCrearIndices= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProcesarCrearIndices.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProcesarCrearIndices,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProcesarCrearIndices.add(this.jMenuItemDetalleCerrarProcesarCrearIndices);
		
		this.jmenuDetalleAccionesProcesarCrearIndices.add(this.jMenuItemActualizarProcesarCrearIndices);
		this.jmenuDetalleAccionesProcesarCrearIndices.add(this.jMenuItemEliminarProcesarCrearIndices);
		this.jmenuDetalleAccionesProcesarCrearIndices.add(this.jMenuItemCancelarProcesarCrearIndices);		
		
		//this.jmenuDetalleDatosProcesarCrearIndices.add(this.jMenuItemDetalleAbrirOrderByProcesarCrearIndices);				
		this.jmenuDetalleDatosProcesarCrearIndices.add(this.jMenuItemDetalleMostarOcultarProcesarCrearIndices);				
				
		//this.jmenuDetalleAccionesProcesarCrearIndices.add(this.jMenuItemGuardarCambiosProcesarCrearIndices);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProcesarCrearIndices.add(this.jmenuDetalleArchivoProcesarCrearIndices);		
		this.jmenuBarDetalleProcesarCrearIndices.add(this.jmenuDetalleAccionesProcesarCrearIndices);		
		this.jmenuBarDetalleProcesarCrearIndices.add(this.jmenuDetalleDatosProcesarCrearIndices);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProcesarCrearIndices);				
	}
	
	
	public void inicializarElementosCamposProcesarCrearIndices() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProcesarCrearIndices = new JLabelMe();
		jLabelIdProcesarCrearIndices.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProcesarCrearIndices = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProcesarCrearIndices.setToolTipText(ProcesarCrearIndicesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProcesarCrearIndices= new GridBagLayout();

		this.jPanelidProcesarCrearIndices.setLayout(this.gridaBagLayoutProcesarCrearIndices);

		jLabelidProcesarCrearIndices = new JLabel();
		jLabelidProcesarCrearIndices.setText("Id");

		jLabelidProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysProcesarCrearIndices() {
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
		//this.jInternalFrameDetalleProcesarCrearIndices = new ProcesarCrearIndicesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Procesar Crear Indices DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProcesarCrearIndices= new GridBagLayout();
		

		
		String sToolTipProcesarCrearIndices="";
		sToolTipProcesarCrearIndices=ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProcesarCrearIndices+="(ActivosFijos.ProcesarCrearIndices)";
		}
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			sToolTipProcesarCrearIndices+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProcesarCrearIndices = new JButtonMe();
		this.jButtonModificarProcesarCrearIndices = new JButtonMe();
        this.jButtonActualizarProcesarCrearIndices = new JButtonMe();
        this.jButtonEliminarProcesarCrearIndices = new JButtonMe();
        this.jButtonCancelarProcesarCrearIndices = new JButtonMe();
        this.jButtonGuardarCambiosProcesarCrearIndices = new JButtonMe();
		this.jButtonGuardarCambiosTablaProcesarCrearIndices = new JButtonMe();
		this.jButtonCerrarProcesarCrearIndices = new JButtonMe();
		
		this.jScrollPanelDatosProcesarCrearIndices = new JScrollPane();   
        this.jScrollPanelDatosEdicionProcesarCrearIndices = new JScrollPane();
		this.jScrollPanelDatosGeneralProcesarCrearIndices = new JScrollPane();
				
		
		
		this.jPanelCamposProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Procesar Crear Indices";
		
		if(!this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Procesar Crear Indiceses" + this.sPath));
		} else {
			this.jScrollPanelDatosProcesarCrearIndices.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProcesarCrearIndices.setName("jPanelCamposProcesarCrearIndices"); 

		this.jPanelCamposOcultosProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProcesarCrearIndices.setName("jPanelCamposOcultosProcesarCrearIndices"); 

        this.jPanelAccionesProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProcesarCrearIndices.setToolTipText("Acciones");
        this.jPanelAccionesProcesarCrearIndices.setName("Acciones"); 

		this.jPanelAccionesFormularioProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProcesarCrearIndices.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProcesarCrearIndices.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProcesarCrearIndices.setText("Nuevo");
		this.jButtonModificarProcesarCrearIndices.setText("Editar");
        this.jButtonActualizarProcesarCrearIndices.setText("Actualizar");
        this.jButtonEliminarProcesarCrearIndices.setText("Eliminar");
        this.jButtonCancelarProcesarCrearIndices.setText("Cancelar");
        this.jButtonGuardarCambiosProcesarCrearIndices.setText("Guardar");
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.setText("Guardar");
		this.jButtonCerrarProcesarCrearIndices.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProcesarCrearIndices,"nuevo_button","Nuevo",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProcesarCrearIndices,"modificar_button","Editar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProcesarCrearIndices,"actualizar_button","Actualizar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProcesarCrearIndices,"eliminar_button","Eliminar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProcesarCrearIndices,"cancelar_button","Cancelar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProcesarCrearIndices,"guardarcambios_button","Guardar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProcesarCrearIndices,"guardarcambiostabla_button","Guardar",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProcesarCrearIndices,"cerrar_button","Salir",this.procesarcrearindicesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProcesarCrearIndices.setToolTipText("Nuevo"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProcesarCrearIndices.setToolTipText("Editar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProcesarCrearIndices.setToolTipText("Actualizar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProcesarCrearIndices.setToolTipText("Eliminar)"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProcesarCrearIndices.setToolTipText("Cancelar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProcesarCrearIndices.setToolTipText("Guardar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.setToolTipText("Guardar"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProcesarCrearIndices.setToolTipText("Salir"+" "+ProcesarCrearIndicesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProcesarCrearIndices";
		inputMap = this.jButtonNuevoProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProcesarCrearIndices.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProcesarCrearIndices"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProcesarCrearIndices";
		inputMap = this.jButtonActualizarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProcesarCrearIndices"));
		
		//ELIMINAR
		sMapKey = "EliminarProcesarCrearIndices";
		inputMap = this.jButtonEliminarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProcesarCrearIndices"));
		
		//CANCELAR	
		sMapKey = "CancelarProcesarCrearIndices";
		inputMap = this.jButtonCancelarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProcesarCrearIndices"));
		
		//CERRAR		
		sMapKey = "CerrarProcesarCrearIndices";
		inputMap = this.jButtonCerrarProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProcesarCrearIndices"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProcesarCrearIndices";
		inputMap = this.jButtonGuardarCambiosTablaProcesarCrearIndices.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProcesarCrearIndices.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProcesarCrearIndices"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProcesarCrearIndices = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProcesarCrearIndices.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProcesarCrearIndices.setToolTipText("Nuevo ProcesarCrearIndices");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProcesarCrearIndices = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProcesarCrearIndices.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProcesarCrearIndices.setToolTipText("Sin Cerrar Ventana ProcesarCrearIndices");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProcesarCrearIndices = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProcesarCrearIndices.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProcesarCrearIndices.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProcesarCrearIndices.setText("Accion");
		this.jComboBoxTiposAccionesProcesarCrearIndices.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProcesarCrearIndices = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProcesarCrearIndices = new JLabelMe();
		
		this.jLabelAccionesProcesarCrearIndices.setText("Acciones");		
		this.jLabelAccionesProcesarCrearIndices.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCrearIndices.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProcesarCrearIndices.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProcesarCrearIndices();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProcesarCrearIndices();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProcesarCrearIndices=new JTabbedPane();
		this.jTabbedPaneRelacionesProcesarCrearIndices.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProcesarCrearIndices,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProcesarCrearIndices.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCrearIndices.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProcesarCrearIndices.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProcesarCrearIndices, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProcesarCrearIndices = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProcesarCrearIndices = new GridBagLayout();
		
		this.jPanelCamposProcesarCrearIndices.setLayout(gridaBagLayoutCamposProcesarCrearIndices);
		this.jPanelCamposOcultosProcesarCrearIndices.setLayout(gridaBagLayoutCamposOcultosProcesarCrearIndices);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
	this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
	this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
	this.gridBagConstraintsProcesarCrearIndices.ipadx = 0;
	this.gridBagConstraintsProcesarCrearIndices.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProcesarCrearIndices.add(jLabelIdProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);



	this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
	this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
	this.gridBagConstraintsProcesarCrearIndices.gridx = 1;
	this.gridBagConstraintsProcesarCrearIndices.ipadx = 0;
	this.gridBagConstraintsProcesarCrearIndices.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProcesarCrearIndices.add(jLabelidProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
	this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProcesarCrearIndices.gridy = iYPanelCamposProcesarCrearIndices;
	this.gridBagConstraintsProcesarCrearIndices.gridx = iXPanelCamposProcesarCrearIndices++;
	this.gridBagConstraintsProcesarCrearIndices.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProcesarCrearIndices.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProcesarCrearIndices.add(this.jPanelidProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);



	if(iXPanelCamposProcesarCrearIndices % 1==0) {
		iXPanelCamposProcesarCrearIndices=0;
		iYPanelCamposProcesarCrearIndices++;
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
			
		GridBagLayout gridaBagLayoutAccionesProcesarCrearIndices= new GridBagLayout();
		this.jPanelAccionesProcesarCrearIndices.setLayout(gridaBagLayoutAccionesProcesarCrearIndices);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProcesarCrearIndices= new GridBagLayout();
		this.jPanelAccionesFormularioProcesarCrearIndices.setLayout(gridaBagLayoutAccionesFormularioProcesarCrearIndices);
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProcesarCrearIndices.add(this.jComboBoxTiposAccionesFormularioProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccion++;
			
		this.jPanelAccionesProcesarCrearIndices.add(this.jButtonModificarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);							

		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProcesarCrearIndices.gridy = 0;
		this.gridBagConstraintsProcesarCrearIndices.gridx =iPosXAccion++;
			
		this.jPanelAccionesProcesarCrearIndices.add(this.jButtonEliminarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
			
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = 0;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesarCrearIndices.add(this.jButtonActualizarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);


		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = 0;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = iPosXAccion++;
		
		this.jPanelAccionesProcesarCrearIndices.add(this.jButtonGuardarCambiosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);	
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = 0;		
		this.gridBagConstraintsProcesarCrearIndices.gridx =iPosXAccion++;
		
		this.jPanelAccionesProcesarCrearIndices.add(this.jButtonCancelarProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProcesarCrearIndices = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProcesarCrearIndices);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.procesarcrearindicesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();						
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;		
			//this.gridBagConstraintsProcesarCrearIndices.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProcesarCrearIndices.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProcesarCrearIndices.gridx =0;
		this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProcesarCrearIndices.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProcesarCrearIndicesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProcesarCrearIndices = new ProcesarCrearIndicesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Procesar Crear Indices DATOS");
			
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
			
	        //this.setTitle("[FOR] - Procesar Crear Indices DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Procesar Crear Indices Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProcesarCrearIndicesModel procesarcrearindicesModel=new ProcesarCrearIndicesModel(this);
			
			//SI USARA CLASE INTERNA
			//ProcesarCrearIndicesModel.ProcesarCrearIndicesFocusTraversalPolicy procesarcrearindicesFocusTraversalPolicy = procesarcrearindicesModel.new ProcesarCrearIndicesFocusTraversalPolicy(this);
			
			//procesarcrearindicesFocusTraversalPolicy.setprocesarcrearindicesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(procesarcrearindicesModel);
			
			
			this.jContentPaneDetalleProcesarCrearIndices = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProcesarCrearIndices = new GridBagLayout();	
			this.jContentPaneDetalleProcesarCrearIndices.setLayout(gridaBagLayoutDetalleProcesarCrearIndices);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProcesarCrearIndices = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
				this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
					
				
				this.jContentPaneDetalleProcesarCrearIndices.add(jTtoolBarDetalleProcesarCrearIndices, gridBagConstraintsProcesarCrearIndices);								
				
}
			
			this.jScrollPanelDatosEdicionProcesarCrearIndices=   new JScrollPane(jContentPaneDetalleProcesarCrearIndices,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesarCrearIndices.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCrearIndices.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCrearIndices.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProcesarCrearIndices=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProcesarCrearIndices.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCrearIndices.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProcesarCrearIndices.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
	        
			this.jContentPaneDetalleProcesarCrearIndices.add(jPanelCamposProcesarCrearIndices, gridBagConstraintsProcesarCrearIndices);
			
			
			
			
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
						//&& procesarcrearindicesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.procesarcrearindicesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProcesarCrearIndices= new GridBagConstraints();
						this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
						this.jContentPaneDetalleProcesarCrearIndices.add(this.jTabbedPaneRelacionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProcesarCrearIndices.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProcesarCrearIndices.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
					this.gridBagConstraintsProcesarCrearIndices.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
					
				
					this.jContentPaneDetalleProcesarCrearIndices.add(jPanelCamposOcultosProcesarCrearIndices, gridBagConstraintsProcesarCrearIndices);
				
					this.jPanelCamposOcultosProcesarCrearIndices.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
	        this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProcesarCrearIndices.add(this.jPanelAccionesFormularioProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);							
			
			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
	        this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
	        
			
			this.jContentPaneDetalleProcesarCrearIndices.add(this.jPanelAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProcesarCrearIndices);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProcesarCrearIndices=   new JScrollPane(this.jPanelCamposProcesarCrearIndices,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProcesarCrearIndices.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCrearIndices.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProcesarCrearIndices.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
			this.gridBagConstraintsProcesarCrearIndices.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProcesarCrearIndices.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProcesarCrearIndices.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);			
			
			this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
			this.gridBagConstraintsProcesarCrearIndices.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
			
			
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		
			
		this.gridBagConstraintsProcesarCrearIndices = new GridBagConstraints();
		this.gridBagConstraintsProcesarCrearIndices.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProcesarCrearIndices.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProcesarCrearIndices, this.gridBagConstraintsProcesarCrearIndices);
		*/
		
			
     	//pack();
		
		
		this.jScrollPanelDatosProcesarCrearIndices.setVisible(false);
		

		    	
		this.jComboBoxTiposAccionesProcesarCrearIndices.setVisible(false);
		//this.jComboBoxTiposAccionesFormularioProcesarCrearIndices.setVisible(false);
		//this.jComboBoxTiposSeleccionarProcesarCrearIndices.setVisible(false);		
		
		
		
		
		//this.jTtoolBarProcesarCrearIndices.setVisible(false);
			
		this.jMenuItemMostrarOcultarProcesarCrearIndices.setVisible(false);
		
		
		
		
		//return this.jScrollPanelDatosGeneralProcesarCrearIndices;//jContentPane;
		
		return jScrollPanelDatosEdicionProcesarCrearIndices;
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
