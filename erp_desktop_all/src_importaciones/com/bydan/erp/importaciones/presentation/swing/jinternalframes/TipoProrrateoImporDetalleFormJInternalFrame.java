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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.TipoProrrateoImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class TipoProrrateoImporDetalleFormJInternalFrame extends TipoProrrateoImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProrrateoImpor;
	
	protected JMenuBar jmenuBarDetalleTipoProrrateoImpor;
	
	protected JMenu jmenuDetalleTipoProrrateoImpor;
	protected JMenu jmenuDetalleArchivoTipoProrrateoImpor;
	protected JMenu jmenuDetalleAccionesTipoProrrateoImpor;
	protected JMenu jmenuDetalleDatosTipoProrrateoImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProrrateoImpor;	
	protected GridBagConstraints gridBagConstraintsTipoProrrateoImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProrrateoImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProrrateoImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProrrateoImporSessionBean tipoprorrateoimporSessionBean;
	
	
	
		
	
	public TipoProrrateoImporLogic tipoprorrateoimporLogic;
	
	public JScrollPane jScrollPanelDatosTipoProrrateoImpor;
	public JScrollPane jScrollPanelDatosEdicionTipoProrrateoImpor;
	public JScrollPane jScrollPanelDatosGeneralTipoProrrateoImpor;
	
	protected JPanel jPanelCamposTipoProrrateoImpor;    
	protected JPanel jPanelCamposOcultosTipoProrrateoImpor;    	
	protected JPanel jPanelAccionesTipoProrrateoImpor;
	protected JPanel jPanelAccionesFormularioTipoProrrateoImpor;
    
	
	
	protected Integer iXPanelCamposTipoProrrateoImpor=0;
	protected Integer iYPanelCamposTipoProrrateoImpor=0;
	
	protected Integer iXPanelCamposOcultosTipoProrrateoImpor=0;
	protected Integer iYPanelCamposOcultosTipoProrrateoImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProrrateoImpor;
	public JButton jButtonModificarTipoProrrateoImpor;
	public JButton jButtonActualizarTipoProrrateoImpor;
    public JButton jButtonEliminarTipoProrrateoImpor;
	public JButton jButtonCancelarTipoProrrateoImpor;
    public JButton jButtonGuardarCambiosTipoProrrateoImpor;
	public JButton jButtonGuardarCambiosTablaTipoProrrateoImpor;
	protected JButton jButtonCerrarTipoProrrateoImpor;
	
	
	protected JButton jButtonProcesarInformacionTipoProrrateoImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProrrateoImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProrrateoImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProrrateoImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProrrateoImpor;
	protected JButton jButtonModificarToolBarTipoProrrateoImpor;
	protected JButton jButtonActualizarToolBarTipoProrrateoImpor;
    protected JButton jButtonEliminarToolBarTipoProrrateoImpor;
	protected JButton jButtonCancelarToolBarTipoProrrateoImpor;
    protected JButton jButtonGuardarCambiosToolBarTipoProrrateoImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProrrateoImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProrrateoImpor;
	protected JButton jButtonCerrarToolBarTipoProrrateoImpor;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProrrateoImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProrrateoImpor;
	protected JMenuItem jMenuItemModificarTipoProrrateoImpor;
	protected JMenuItem jMenuItemActualizarTipoProrrateoImpor;
    protected JMenuItem jMenuItemEliminarTipoProrrateoImpor;
	protected JMenuItem jMenuItemCancelarTipoProrrateoImpor;
    protected JMenuItem jMenuItemGuardarCambiosTipoProrrateoImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProrrateoImpor;
	protected JMenuItem jMenuItemCerrarTipoProrrateoImpor;
	protected JMenuItem jMenuItemDetalleCerrarTipoProrrateoImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProrrateoImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProrrateoImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProrrateoImpor;
	protected JMenuItem jMenuItemMostrarOcultarTipoProrrateoImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProrrateoImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProrrateoImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProrrateoImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProrrateoImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProrrateoImpor;
	public JLabel jLabelIdTipoProrrateoImpor;
	public JTextFieldMe jTextFieldidTipoProrrateoImpor;
	public JButton jButtonidTipoProrrateoImporBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoProrrateoImpor;
	public JLabel jLabelcodigoTipoProrrateoImpor;
	public JTextField jTextFieldcodigoTipoProrrateoImpor;
	public JButton jButtoncodigoTipoProrrateoImporBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProrrateoImpor;
	public JLabel jLabelnombreTipoProrrateoImpor;
	public JTextArea jTextAreanombreTipoProrrateoImpor;
	public JScrollPane jscrollPanenombreTipoProrrateoImpor;
	public JButton jButtonnombreTipoProrrateoImporBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProrrateoImpor;
	
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
	
	public TipoProrrateoImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProrrateoImpor=new JPanel();
				this.jPanelAccionesFormularioTipoProrrateoImpor=new JPanel();
				this.jmenuBarDetalleTipoProrrateoImpor=new JMenuBar();
				this.jTtoolBarDetalleTipoProrrateoImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProrrateoImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProrrateoImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProrrateoImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProrrateoImpor() {
		return this.jButtonActualizarToolBarTipoProrrateoImpor;
	}
	
	public JButton getjButtonEliminarToolBarTipoProrrateoImpor() {
		return this.jButtonEliminarToolBarTipoProrrateoImpor;
	}
	
	public JButton getjButtonCancelarToolBarTipoProrrateoImpor() {
		return this.jButtonCancelarToolBarTipoProrrateoImpor;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProrrateoImpor() {
		return this.jButtonProcesarInformacionTipoProrrateoImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProrrateoImpor)	{
		this.jButtonProcesarInformacionTipoProrrateoImpor = jButtonProcesarInformacionTipoProrrateoImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProrrateoImpor() {
		return this.jComboBoxTiposAccionesTipoProrrateoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProrrateoImpor(
			JComboBox jComboBoxTiposRelacionesTipoProrrateoImpor) {
		this.jComboBoxTiposRelacionesTipoProrrateoImpor = jComboBoxTiposRelacionesTipoProrrateoImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProrrateoImpor(
			JComboBox jComboBoxTiposAccionesTipoProrrateoImpor) {
		this.jComboBoxTiposAccionesTipoProrrateoImpor = jComboBoxTiposAccionesTipoProrrateoImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProrrateoImpor() {
		return this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProrrateoImpor(
			JComboBox jComboBoxTiposAccionesFormularioTipoProrrateoImpor) {
		this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor = jComboBoxTiposAccionesFormularioTipoProrrateoImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprorrateoimporSessionBean=new TipoProrrateoImporSessionBean();
		
		this.tipoprorrateoimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprorrateoimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProrrateoImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProrrateoImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProrrateoImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prorrateo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProrrateoImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProrrateoImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProrrateoImpor=new JButtonMe();
				this.jButtonModificarToolBarTipoProrrateoImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProrrateoImpor,this.jTtoolBarDetalleTipoProrrateoImpor,
							"actualizar","actualizar","Actualizar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProrrateoImpor,this.jTtoolBarDetalleTipoProrrateoImpor,
							"eliminar","eliminar","Eliminar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProrrateoImpor,this.jTtoolBarDetalleTipoProrrateoImpor,
							"cancelar","cancelar","Cancelar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProrrateoImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProrrateoImpor,this.jTtoolBarDetalleTipoProrrateoImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProrrateoImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProrrateoImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProrrateoImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProrrateoImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProrrateoImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProrrateoImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProrrateoImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProrrateoImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProrrateoImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProrrateoImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProrrateoImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProrrateoImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProrrateoImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProrrateoImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProrrateoImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProrrateoImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProrrateoImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProrrateoImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProrrateoImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProrrateoImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProrrateoImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProrrateoImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProrrateoImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProrrateoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProrrateoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProrrateoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProrrateoImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProrrateoImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProrrateoImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProrrateoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProrrateoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProrrateoImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProrrateoImpor.add(this.jMenuItemDetalleCerrarTipoProrrateoImpor);
		
		this.jmenuDetalleAccionesTipoProrrateoImpor.add(this.jMenuItemActualizarTipoProrrateoImpor);
		this.jmenuDetalleAccionesTipoProrrateoImpor.add(this.jMenuItemEliminarTipoProrrateoImpor);
		this.jmenuDetalleAccionesTipoProrrateoImpor.add(this.jMenuItemCancelarTipoProrrateoImpor);		
		
		//this.jmenuDetalleDatosTipoProrrateoImpor.add(this.jMenuItemDetalleAbrirOrderByTipoProrrateoImpor);				
		this.jmenuDetalleDatosTipoProrrateoImpor.add(this.jMenuItemDetalleMostarOcultarTipoProrrateoImpor);				
				
		//this.jmenuDetalleAccionesTipoProrrateoImpor.add(this.jMenuItemGuardarCambiosTipoProrrateoImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProrrateoImpor.add(this.jmenuDetalleArchivoTipoProrrateoImpor);		
		this.jmenuBarDetalleTipoProrrateoImpor.add(this.jmenuDetalleAccionesTipoProrrateoImpor);		
		this.jmenuBarDetalleTipoProrrateoImpor.add(this.jmenuDetalleDatosTipoProrrateoImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProrrateoImpor);				
	}
	
	
	public void inicializarElementosCamposTipoProrrateoImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProrrateoImpor = new JLabelMe();
		jLabelIdTipoProrrateoImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProrrateoImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProrrateoImpor.setToolTipText(TipoProrrateoImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProrrateoImpor= new GridBagLayout();

		this.jPanelidTipoProrrateoImpor.setLayout(this.gridaBagLayoutTipoProrrateoImpor);

		jTextFieldidTipoProrrateoImpor = new JTextFieldMe();
		jTextFieldidTipoProrrateoImpor.setText("Id");

		jTextFieldidTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoProrrateoImpor = new JLabelMe();
		this.jLabelcodigoTipoProrrateoImpor.setText(""+TipoProrrateoImporConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoProrrateoImpor.setToolTipText("Codigo");
		this.jLabelcodigoTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoProrrateoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoProrrateoImpor.setToolTipText(TipoProrrateoImporConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoProrrateoImpor = new GridBagLayout();
		this.jPanelcodigoTipoProrrateoImpor.setLayout(this.gridaBagLayoutTipoProrrateoImpor);


		jTextFieldcodigoTipoProrrateoImpor= new JTextFieldMe();

		jTextFieldcodigoTipoProrrateoImpor.setEnabled(false);
		jTextFieldcodigoTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoProrrateoImporBusqueda= new JButtonMe();
		this.jButtoncodigoTipoProrrateoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProrrateoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProrrateoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoProrrateoImporBusqueda.setText("U");
		this.jButtoncodigoTipoProrrateoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoProrrateoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoProrrateoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoProrrateoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoProrrateoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoProrrateoImporBusqueda"));

		if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoProrrateoImporBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoProrrateoImpor = new JLabelMe();
		this.jLabelnombreTipoProrrateoImpor.setText(""+TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProrrateoImpor.setToolTipText("Nombre");
		this.jLabelnombreTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProrrateoImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProrrateoImpor.setToolTipText(TipoProrrateoImporConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProrrateoImpor = new GridBagLayout();
		this.jPanelnombreTipoProrrateoImpor.setLayout(this.gridaBagLayoutTipoProrrateoImpor);


		jTextAreanombreTipoProrrateoImpor= new JTextAreaMe();
		jTextAreanombreTipoProrrateoImpor.setEnabled(false);
		jTextAreanombreTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProrrateoImpor.setLineWrap(true);
		jTextAreanombreTipoProrrateoImpor.setWrapStyleWord(true);
		jTextAreanombreTipoProrrateoImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProrrateoImpor.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProrrateoImpor = new JScrollPane(jTextAreanombreTipoProrrateoImpor);
		jscrollPanenombreTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProrrateoImporBusqueda= new JButtonMe();
		this.jButtonnombreTipoProrrateoImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProrrateoImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProrrateoImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProrrateoImporBusqueda.setText("U");
		this.jButtonnombreTipoProrrateoImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProrrateoImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProrrateoImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProrrateoImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProrrateoImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProrrateoImporBusqueda"));

		if(this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProrrateoImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProrrateoImpor() {
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
		//this.jInternalFrameDetalleTipoProrrateoImpor = new TipoProrrateoImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Prorrateo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProrrateoImpor= new GridBagLayout();
		

		
		String sToolTipTipoProrrateoImpor="";
		sToolTipTipoProrrateoImpor=TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProrrateoImpor+="(Importaciones.TipoProrrateoImpor)";
		}
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProrrateoImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProrrateoImpor = new JButtonMe();
		this.jButtonModificarTipoProrrateoImpor = new JButtonMe();
        this.jButtonActualizarTipoProrrateoImpor = new JButtonMe();
        this.jButtonEliminarTipoProrrateoImpor = new JButtonMe();
        this.jButtonCancelarTipoProrrateoImpor = new JButtonMe();
        this.jButtonGuardarCambiosTipoProrrateoImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor = new JButtonMe();
		this.jButtonCerrarTipoProrrateoImpor = new JButtonMe();
		
		this.jScrollPanelDatosTipoProrrateoImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProrrateoImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProrrateoImpor = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prorrateo";
		
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prorrateos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProrrateoImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProrrateoImpor.setName("jPanelCamposTipoProrrateoImpor"); 

		this.jPanelCamposOcultosTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProrrateoImpor.setName("jPanelCamposOcultosTipoProrrateoImpor"); 

        this.jPanelAccionesTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProrrateoImpor.setToolTipText("Acciones");
        this.jPanelAccionesTipoProrrateoImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProrrateoImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProrrateoImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProrrateoImpor.setText("Nuevo");
		this.jButtonModificarTipoProrrateoImpor.setText("Editar");
        this.jButtonActualizarTipoProrrateoImpor.setText("Actualizar");
        this.jButtonEliminarTipoProrrateoImpor.setText("Eliminar");
        this.jButtonCancelarTipoProrrateoImpor.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProrrateoImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.setText("Guardar");
		this.jButtonCerrarTipoProrrateoImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProrrateoImpor,"nuevo_button","Nuevo",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProrrateoImpor,"modificar_button","Editar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProrrateoImpor,"actualizar_button","Actualizar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProrrateoImpor,"eliminar_button","Eliminar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProrrateoImpor,"cancelar_button","Cancelar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProrrateoImpor,"guardarcambios_button","Guardar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProrrateoImpor,"guardarcambiostabla_button","Guardar",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProrrateoImpor,"cerrar_button","Salir",this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProrrateoImpor.setToolTipText("Nuevo"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProrrateoImpor.setToolTipText("Editar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProrrateoImpor.setToolTipText("Actualizar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProrrateoImpor.setToolTipText("Eliminar)"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProrrateoImpor.setToolTipText("Cancelar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProrrateoImpor.setToolTipText("Guardar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.setToolTipText("Guardar"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProrrateoImpor.setToolTipText("Salir"+" "+TipoProrrateoImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProrrateoImpor";
		inputMap = this.jButtonNuevoTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProrrateoImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProrrateoImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProrrateoImpor";
		inputMap = this.jButtonActualizarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProrrateoImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProrrateoImpor";
		inputMap = this.jButtonEliminarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProrrateoImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProrrateoImpor";
		inputMap = this.jButtonCancelarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProrrateoImpor"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProrrateoImpor";
		inputMap = this.jButtonCerrarTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProrrateoImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProrrateoImpor";
		inputMap = this.jButtonGuardarCambiosTablaTipoProrrateoImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProrrateoImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProrrateoImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProrrateoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProrrateoImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProrrateoImpor.setToolTipText("Nuevo TipoProrrateoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor.setToolTipText("Sin Cerrar Ventana TipoProrrateoImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProrrateoImpor.setText("Accion");
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProrrateoImpor = new JLabelMe();
		
		this.jLabelAccionesTipoProrrateoImpor.setText("Acciones");		
		this.jLabelAccionesTipoProrrateoImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProrrateoImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProrrateoImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProrrateoImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProrrateoImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProrrateoImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProrrateoImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProrrateoImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProrrateoImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProrrateoImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProrrateoImpor = new GridBagLayout();
		
		this.jPanelCamposTipoProrrateoImpor.setLayout(gridaBagLayoutCamposTipoProrrateoImpor);
		this.jPanelCamposOcultosTipoProrrateoImpor.setLayout(gridaBagLayoutCamposOcultosTipoProrrateoImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProrrateoImpor.add(jLabelIdTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);



	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = 1;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProrrateoImpor.add(jTextFieldidTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);


	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoProrrateoImpor.add(jLabelcodigoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 2;
		this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
		this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoProrrateoImpor.add(jButtoncodigoTipoProrrateoImporBusqueda, this.gridBagConstraintsTipoProrrateoImpor);
	}

	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = 1;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoProrrateoImpor.add(jTextFieldcodigoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);


	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProrrateoImpor.add(jLabelnombreTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		//this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 2;
		this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
		this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProrrateoImpor.add(jButtonnombreTipoProrrateoImporBusqueda, this.gridBagConstraintsTipoProrrateoImpor);
	}

	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = 1;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProrrateoImpor.add(jscrollPanenombreTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = iYPanelCamposTipoProrrateoImpor;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = iXPanelCamposTipoProrrateoImpor++;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProrrateoImpor.add(this.jPanelidTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);



	if(iXPanelCamposTipoProrrateoImpor % 1==0) {
		iXPanelCamposTipoProrrateoImpor=0;
		iYPanelCamposTipoProrrateoImpor++;
	}
	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = iYPanelCamposTipoProrrateoImpor;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = iXPanelCamposTipoProrrateoImpor++;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProrrateoImpor.add(this.jPanelcodigoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);



	if(iXPanelCamposTipoProrrateoImpor % 1==0) {
		iXPanelCamposTipoProrrateoImpor=0;
		iYPanelCamposTipoProrrateoImpor++;
	}
	this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProrrateoImpor.gridy = iYPanelCamposTipoProrrateoImpor;
	this.gridBagConstraintsTipoProrrateoImpor.gridx = iXPanelCamposTipoProrrateoImpor++;
	this.gridBagConstraintsTipoProrrateoImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProrrateoImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProrrateoImpor.add(this.jPanelnombreTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);



	if(iXPanelCamposTipoProrrateoImpor % 1==0) {
		iXPanelCamposTipoProrrateoImpor=0;
		iYPanelCamposTipoProrrateoImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProrrateoImpor= new GridBagLayout();
		this.jPanelAccionesTipoProrrateoImpor.setLayout(gridaBagLayoutAccionesTipoProrrateoImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProrrateoImpor= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProrrateoImpor.setLayout(gridaBagLayoutAccionesFormularioTipoProrrateoImpor);
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProrrateoImpor.add(this.jComboBoxTiposAccionesFormularioTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);

		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProrrateoImpor.add(this.jCheckBoxPostAccionNuevoTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProrrateoImpor.add(this.jCheckBoxPostAccionSinCerrarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprorrateoimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProrrateoImpor.add(this.jCheckBoxPostAccionSinMensajeTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProrrateoImpor.add(this.jButtonModificarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);							

		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;
		this.gridBagConstraintsTipoProrrateoImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProrrateoImpor.add(this.jButtonEliminarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
			
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProrrateoImpor.add(this.jButtonActualizarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);


		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProrrateoImpor.add(this.jButtonGuardarCambiosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);	
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = 0;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProrrateoImpor.add(this.jButtonCancelarTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProrrateoImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProrrateoImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprorrateoimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();						
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;		
			//this.gridBagConstraintsTipoProrrateoImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProrrateoImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProrrateoImpor.gridx =0;
		this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProrrateoImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProrrateoImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProrrateoImpor = new TipoProrrateoImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Prorrateo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Prorrateo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prorrateo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProrrateoImporModel tipoprorrateoimporModel=new TipoProrrateoImporModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProrrateoImporModel.TipoProrrateoImporFocusTraversalPolicy tipoprorrateoimporFocusTraversalPolicy = tipoprorrateoimporModel.new TipoProrrateoImporFocusTraversalPolicy(this);
			
			//tipoprorrateoimporFocusTraversalPolicy.settipoprorrateoimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprorrateoimporModel);
			
			
			this.jContentPaneDetalleTipoProrrateoImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProrrateoImpor = new GridBagLayout();	
			this.jContentPaneDetalleTipoProrrateoImpor.setLayout(gridaBagLayoutDetalleTipoProrrateoImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProrrateoImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
				this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProrrateoImpor.add(jTtoolBarDetalleTipoProrrateoImpor, gridBagConstraintsTipoProrrateoImpor);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProrrateoImpor=   new JScrollPane(jContentPaneDetalleTipoProrrateoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProrrateoImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
	        
			this.jContentPaneDetalleTipoProrrateoImpor.add(jPanelCamposTipoProrrateoImpor, gridBagConstraintsTipoProrrateoImpor);
			
			
			
			
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
						&& tipoprorrateoimporSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoprorrateoimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProrrateoImpor= new GridBagConstraints();
						this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
						this.jContentPaneDetalleTipoProrrateoImpor.add(this.jTabbedPaneRelacionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProrrateoImpor.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProrrateoImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
					this.gridBagConstraintsTipoProrrateoImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProrrateoImpor.add(jPanelCamposOcultosTipoProrrateoImpor, gridBagConstraintsTipoProrrateoImpor);
				
					this.jPanelCamposOcultosTipoProrrateoImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
	        this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProrrateoImpor.add(this.jPanelAccionesFormularioTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);							
			
			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
	        this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProrrateoImpor.add(this.jPanelAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProrrateoImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProrrateoImpor=   new JScrollPane(this.jPanelCamposTipoProrrateoImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProrrateoImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProrrateoImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProrrateoImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
			this.gridBagConstraintsTipoProrrateoImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProrrateoImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProrrateoImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);			
			
			this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
			this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
			
			
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		
			
		this.gridBagConstraintsTipoProrrateoImpor = new GridBagConstraints();
		this.gridBagConstraintsTipoProrrateoImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProrrateoImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProrrateoImpor, this.gridBagConstraintsTipoProrrateoImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProrrateoImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProrrateoImpor;
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
