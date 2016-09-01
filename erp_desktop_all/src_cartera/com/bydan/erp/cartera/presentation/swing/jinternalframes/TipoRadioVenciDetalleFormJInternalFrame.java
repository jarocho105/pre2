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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoRadioVenciConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoRadioVenciDetalleFormJInternalFrame extends TipoRadioVenciBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRadioVenci;
	
	protected JMenuBar jmenuBarDetalleTipoRadioVenci;
	
	protected JMenu jmenuDetalleTipoRadioVenci;
	protected JMenu jmenuDetalleArchivoTipoRadioVenci;
	protected JMenu jmenuDetalleAccionesTipoRadioVenci;
	protected JMenu jmenuDetalleDatosTipoRadioVenci;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRadioVenci;	
	protected GridBagConstraints gridBagConstraintsTipoRadioVenci;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRadioVenciBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRadioVenci;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRadioVenciSessionBean tiporadiovenciSessionBean;
	
	

	public RadioVenciProveBeanSwingJInternalFrame radiovenciproveBeanSwingJInternalFrame=null;
	public RadioVenciProveBeanSwingJInternalFrame radiovenciproveBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRadioVenciProve=false;
	public RadioVenciProveSessionBean radiovenciproveSessionBean;

	public RadioVenciClienteProveBeanSwingJInternalFrame radiovenciclienteproveBeanSwingJInternalFrame=null;
	public RadioVenciClienteProveBeanSwingJInternalFrame radiovenciclienteproveBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRadioVenciClienteProve=false;
	public RadioVenciClienteProveSessionBean radiovenciclienteproveSessionBean;
	
		
	
	public TipoRadioVenciLogic tiporadiovenciLogic;
	
	public JScrollPane jScrollPanelDatosTipoRadioVenci;
	public JScrollPane jScrollPanelDatosEdicionTipoRadioVenci;
	public JScrollPane jScrollPanelDatosGeneralTipoRadioVenci;
	
	protected JPanel jPanelCamposTipoRadioVenci;    
	protected JPanel jPanelCamposOcultosTipoRadioVenci;    	
	protected JPanel jPanelAccionesTipoRadioVenci;
	protected JPanel jPanelAccionesFormularioTipoRadioVenci;
    
	
	
	protected Integer iXPanelCamposTipoRadioVenci=0;
	protected Integer iYPanelCamposTipoRadioVenci=0;
	
	protected Integer iXPanelCamposOcultosTipoRadioVenci=0;
	protected Integer iYPanelCamposOcultosTipoRadioVenci=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRadioVenci;
	public JButton jButtonModificarTipoRadioVenci;
	public JButton jButtonActualizarTipoRadioVenci;
    public JButton jButtonEliminarTipoRadioVenci;
	public JButton jButtonCancelarTipoRadioVenci;
    public JButton jButtonGuardarCambiosTipoRadioVenci;
	public JButton jButtonGuardarCambiosTablaTipoRadioVenci;
	protected JButton jButtonCerrarTipoRadioVenci;
	
	
	protected JButton jButtonProcesarInformacionTipoRadioVenci;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRadioVenci;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRadioVenci;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRadioVenci;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRadioVenci;
	protected JButton jButtonModificarToolBarTipoRadioVenci;
	protected JButton jButtonActualizarToolBarTipoRadioVenci;
    protected JButton jButtonEliminarToolBarTipoRadioVenci;
	protected JButton jButtonCancelarToolBarTipoRadioVenci;
    protected JButton jButtonGuardarCambiosToolBarTipoRadioVenci;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRadioVenci;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRadioVenci;
	protected JButton jButtonCerrarToolBarTipoRadioVenci;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRadioVenci;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRadioVenci;
	protected JMenuItem jMenuItemModificarTipoRadioVenci;
	protected JMenuItem jMenuItemActualizarTipoRadioVenci;
    protected JMenuItem jMenuItemEliminarTipoRadioVenci;
	protected JMenuItem jMenuItemCancelarTipoRadioVenci;
    protected JMenuItem jMenuItemGuardarCambiosTipoRadioVenci;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRadioVenci;
	protected JMenuItem jMenuItemCerrarTipoRadioVenci;
	protected JMenuItem jMenuItemDetalleCerrarTipoRadioVenci;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRadioVenci;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRadioVenci;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRadioVenci;
	protected JMenuItem jMenuItemMostrarOcultarTipoRadioVenci;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRadioVenci;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRadioVenci;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRadioVenci;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRadioVenci;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRadioVenci;
	public JLabel jLabelIdTipoRadioVenci;
	public JTextFieldMe jTextFieldidTipoRadioVenci;
	public JButton jButtonidTipoRadioVenciBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRadioVenci;
	public JLabel jLabelnombreTipoRadioVenci;
	public JTextArea jTextAreanombreTipoRadioVenci;
	public JScrollPane jscrollPanenombreTipoRadioVenci;
	public JButton jButtonnombreTipoRadioVenciBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRadioVenci;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRadioVenciDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRadioVenci=new JPanel();
				this.jPanelAccionesFormularioTipoRadioVenci=new JPanel();
				this.jmenuBarDetalleTipoRadioVenci=new JMenuBar();
				this.jTtoolBarDetalleTipoRadioVenci=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRadioVenciDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRadioVenciDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRadioVenci No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRadioVenci() {
		return this.jButtonActualizarToolBarTipoRadioVenci;
	}
	
	public JButton getjButtonEliminarToolBarTipoRadioVenci() {
		return this.jButtonEliminarToolBarTipoRadioVenci;
	}
	
	public JButton getjButtonCancelarToolBarTipoRadioVenci() {
		return this.jButtonCancelarToolBarTipoRadioVenci;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRadioVenci() {
		return this.jButtonProcesarInformacionTipoRadioVenci;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRadioVenci)	{
		this.jButtonProcesarInformacionTipoRadioVenci = jButtonProcesarInformacionTipoRadioVenci;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRadioVenci() {
		return this.jComboBoxTiposAccionesTipoRadioVenci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRadioVenci(
			JComboBox jComboBoxTiposRelacionesTipoRadioVenci) {
		this.jComboBoxTiposRelacionesTipoRadioVenci = jComboBoxTiposRelacionesTipoRadioVenci;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRadioVenci(
			JComboBox jComboBoxTiposAccionesTipoRadioVenci) {
		this.jComboBoxTiposAccionesTipoRadioVenci = jComboBoxTiposAccionesTipoRadioVenci;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRadioVenci() {
		return this.jComboBoxTiposAccionesFormularioTipoRadioVenci;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRadioVenci(
			JComboBox jComboBoxTiposAccionesFormularioTipoRadioVenci) {
		this.jComboBoxTiposAccionesFormularioTipoRadioVenci = jComboBoxTiposAccionesFormularioTipoRadioVenci;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporadiovenciSessionBean=new TipoRadioVenciSessionBean();
		
		this.tiporadiovenciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporadiovenciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporadiovenciSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		//this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRadioVenciJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Radio Venci MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRadioVenciJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRadioVenci= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRadioVenci=new JButtonMe();
				this.jButtonModificarToolBarTipoRadioVenci=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRadioVenci,this.jTtoolBarDetalleTipoRadioVenci,
							"actualizar","actualizar","Actualizar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRadioVenci,this.jTtoolBarDetalleTipoRadioVenci,
							"eliminar","eliminar","Eliminar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRadioVenci,this.jTtoolBarDetalleTipoRadioVenci,
							"cancelar","cancelar","Cancelar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRadioVenci=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRadioVenci,this.jTtoolBarDetalleTipoRadioVenci,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRadioVenci=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRadioVenci=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRadioVenci=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRadioVenci=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRadioVenci=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRadioVenci= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRadioVenci.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRadioVenci,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRadioVenci= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRadioVenci.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRadioVenci,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRadioVenci= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRadioVenci.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRadioVenci,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRadioVenci= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRadioVenci.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRadioVenci,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRadioVenci= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRadioVenci.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRadioVenci,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRadioVenci= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRadioVenci.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRadioVenci,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRadioVenci= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRadioVenci.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRadioVenci,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRadioVenci= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRadioVenci.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRadioVenci,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRadioVenci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRadioVenci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRadioVenci,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRadioVenci= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRadioVenci.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRadioVenci,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRadioVenci.add(this.jMenuItemDetalleCerrarTipoRadioVenci);
		
		this.jmenuDetalleAccionesTipoRadioVenci.add(this.jMenuItemActualizarTipoRadioVenci);
		this.jmenuDetalleAccionesTipoRadioVenci.add(this.jMenuItemEliminarTipoRadioVenci);
		this.jmenuDetalleAccionesTipoRadioVenci.add(this.jMenuItemCancelarTipoRadioVenci);		
		
		//this.jmenuDetalleDatosTipoRadioVenci.add(this.jMenuItemDetalleAbrirOrderByTipoRadioVenci);				
		this.jmenuDetalleDatosTipoRadioVenci.add(this.jMenuItemDetalleMostarOcultarTipoRadioVenci);				
				
		//this.jmenuDetalleAccionesTipoRadioVenci.add(this.jMenuItemGuardarCambiosTipoRadioVenci);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRadioVenci.add(this.jmenuDetalleArchivoTipoRadioVenci);		
		this.jmenuBarDetalleTipoRadioVenci.add(this.jmenuDetalleAccionesTipoRadioVenci);		
		this.jmenuBarDetalleTipoRadioVenci.add(this.jmenuDetalleDatosTipoRadioVenci);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRadioVenci.add(this.jmenuDetalleTipoRadioVenci);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRadioVenci);				
	}
	
	
	public void inicializarElementosCamposTipoRadioVenci() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRadioVenci = new JLabelMe();
		jLabelIdTipoRadioVenci.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRadioVenci = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRadioVenci.setToolTipText(TipoRadioVenciConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRadioVenci= new GridBagLayout();

		this.jPanelidTipoRadioVenci.setLayout(this.gridaBagLayoutTipoRadioVenci);

		jTextFieldidTipoRadioVenci = new JTextFieldMe();
		jTextFieldidTipoRadioVenci.setText("Id");

		jTextFieldidTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoRadioVenci = new JLabelMe();
		this.jLabelnombreTipoRadioVenci.setText(""+TipoRadioVenciConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRadioVenci.setToolTipText("Nombre");
		this.jLabelnombreTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRadioVenci=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRadioVenci.setToolTipText(TipoRadioVenciConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRadioVenci = new GridBagLayout();
		this.jPanelnombreTipoRadioVenci.setLayout(this.gridaBagLayoutTipoRadioVenci);


		jTextAreanombreTipoRadioVenci= new JTextAreaMe();
		jTextAreanombreTipoRadioVenci.setEnabled(false);
		jTextAreanombreTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRadioVenci.setLineWrap(true);
		jTextAreanombreTipoRadioVenci.setWrapStyleWord(true);
		jTextAreanombreTipoRadioVenci.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRadioVenci.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRadioVenci = new JScrollPane(jTextAreanombreTipoRadioVenci);
		jscrollPanenombreTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRadioVenciBusqueda= new JButtonMe();
		this.jButtonnombreTipoRadioVenciBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRadioVenciBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRadioVenciBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRadioVenciBusqueda.setText("U");
		this.jButtonnombreTipoRadioVenciBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRadioVenciBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRadioVenciBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRadioVenci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRadioVenci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRadioVenciBusqueda"));

		if(this.tiporadiovenciSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRadioVenciBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRadioVenci() {
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
		//this.jInternalFrameDetalleTipoRadioVenci = new TipoRadioVenciBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Radio Venci DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRadioVenci= new GridBagLayout();
		

		
		String sToolTipTipoRadioVenci="";
		sToolTipTipoRadioVenci=TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRadioVenci+="(Cartera.TipoRadioVenci)";
		}
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRadioVenci+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRadioVenci = new JButtonMe();
		this.jButtonModificarTipoRadioVenci = new JButtonMe();
        this.jButtonActualizarTipoRadioVenci = new JButtonMe();
        this.jButtonEliminarTipoRadioVenci = new JButtonMe();
        this.jButtonCancelarTipoRadioVenci = new JButtonMe();
        this.jButtonGuardarCambiosTipoRadioVenci = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRadioVenci = new JButtonMe();
		this.jButtonCerrarTipoRadioVenci = new JButtonMe();
		
		this.jScrollPanelDatosTipoRadioVenci = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRadioVenci = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRadioVenci = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Radio Venci";
		
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Radio Vencis" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRadioVenci.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRadioVenci.setName("jPanelCamposTipoRadioVenci"); 

		this.jPanelCamposOcultosTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRadioVenci.setName("jPanelCamposOcultosTipoRadioVenci"); 

        this.jPanelAccionesTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRadioVenci.setToolTipText("Acciones");
        this.jPanelAccionesTipoRadioVenci.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRadioVenci.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRadioVenci.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRadioVenci.setText("Nuevo");
		this.jButtonModificarTipoRadioVenci.setText("Editar");
        this.jButtonActualizarTipoRadioVenci.setText("Actualizar");
        this.jButtonEliminarTipoRadioVenci.setText("Eliminar");
        this.jButtonCancelarTipoRadioVenci.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRadioVenci.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRadioVenci.setText("Guardar");
		this.jButtonCerrarTipoRadioVenci.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRadioVenci,"nuevo_button","Nuevo",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRadioVenci,"modificar_button","Editar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRadioVenci,"actualizar_button","Actualizar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRadioVenci,"eliminar_button","Eliminar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRadioVenci,"cancelar_button","Cancelar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRadioVenci,"guardarcambios_button","Guardar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRadioVenci,"guardarcambiostabla_button","Guardar",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRadioVenci,"cerrar_button","Salir",this.tiporadiovenciSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRadioVenci.setToolTipText("Nuevo"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRadioVenci.setToolTipText("Editar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRadioVenci.setToolTipText("Actualizar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRadioVenci.setToolTipText("Eliminar)"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRadioVenci.setToolTipText("Cancelar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRadioVenci.setToolTipText("Guardar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRadioVenci.setToolTipText("Guardar"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRadioVenci.setToolTipText("Salir"+" "+TipoRadioVenciConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRadioVenci";
		inputMap = this.jButtonNuevoTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRadioVenci.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRadioVenci"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRadioVenci";
		inputMap = this.jButtonActualizarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRadioVenci"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRadioVenci";
		inputMap = this.jButtonEliminarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRadioVenci"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRadioVenci";
		inputMap = this.jButtonCancelarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRadioVenci"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRadioVenci";
		inputMap = this.jButtonCerrarTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRadioVenci"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRadioVenci";
		inputMap = this.jButtonGuardarCambiosTablaTipoRadioVenci.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRadioVenci.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRadioVenci"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRadioVenci = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRadioVenci.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRadioVenci.setToolTipText("Nuevo TipoRadioVenci");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRadioVenci = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRadioVenci.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRadioVenci.setToolTipText("Sin Cerrar Ventana TipoRadioVenci");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRadioVenci = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRadioVenci.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRadioVenci.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRadioVenci.setText("Accion");
		this.jComboBoxTiposAccionesTipoRadioVenci.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRadioVenci = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRadioVenci.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRadioVenci.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRadioVenci = new JLabelMe();
		
		this.jLabelAccionesTipoRadioVenci.setText("Acciones");		
		this.jLabelAccionesTipoRadioVenci.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRadioVenci.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRadioVenci.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRadioVenci();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRadioVenci();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRadioVenci=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRadioVenci.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRadioVenci,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRadioVenci.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRadioVenci.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRadioVenci.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRadioVenci.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRadioVenci.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRadioVenci.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRadioVenci, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRadioVenci = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRadioVenci = new GridBagLayout();
		
		this.jPanelCamposTipoRadioVenci.setLayout(gridaBagLayoutCamposTipoRadioVenci);
		this.jPanelCamposOcultosTipoRadioVenci.setLayout(gridaBagLayoutCamposOcultosTipoRadioVenci);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRadioVenci.gridy = 0;
	this.gridBagConstraintsTipoRadioVenci.gridx = 0;
	this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
	this.gridBagConstraintsTipoRadioVenci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRadioVenci.add(jLabelIdTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);



	this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRadioVenci.gridy = 0;
	this.gridBagConstraintsTipoRadioVenci.gridx = 1;
	this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
	this.gridBagConstraintsTipoRadioVenci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRadioVenci.add(jTextFieldidTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);


	this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRadioVenci.gridy = 0;
	this.gridBagConstraintsTipoRadioVenci.gridx = 0;
	this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
	this.gridBagConstraintsTipoRadioVenci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRadioVenci.add(jLabelnombreTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		//this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;
		this.gridBagConstraintsTipoRadioVenci.gridx = 2;
		this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
		this.gridBagConstraintsTipoRadioVenci.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRadioVenci.add(jButtonnombreTipoRadioVenciBusqueda, this.gridBagConstraintsTipoRadioVenci);
	}

	this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRadioVenci.gridy = 0;
	this.gridBagConstraintsTipoRadioVenci.gridx = 1;
	this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
	this.gridBagConstraintsTipoRadioVenci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRadioVenci.add(jscrollPanenombreTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRadioVenci.gridy = iYPanelCamposTipoRadioVenci;
	this.gridBagConstraintsTipoRadioVenci.gridx = iXPanelCamposTipoRadioVenci++;
	this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRadioVenci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRadioVenci.add(this.jPanelidTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);



	if(iXPanelCamposTipoRadioVenci % 1==0) {
		iXPanelCamposTipoRadioVenci=0;
		iYPanelCamposTipoRadioVenci++;
	}
	this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRadioVenci.gridy = iYPanelCamposTipoRadioVenci;
	this.gridBagConstraintsTipoRadioVenci.gridx = iXPanelCamposTipoRadioVenci++;
	this.gridBagConstraintsTipoRadioVenci.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRadioVenci.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRadioVenci.add(this.jPanelnombreTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);



	if(iXPanelCamposTipoRadioVenci % 1==0) {
		iXPanelCamposTipoRadioVenci=0;
		iYPanelCamposTipoRadioVenci++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRadioVenci= new GridBagLayout();
		this.jPanelAccionesTipoRadioVenci.setLayout(gridaBagLayoutAccionesTipoRadioVenci);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRadioVenci= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRadioVenci.setLayout(gridaBagLayoutAccionesFormularioTipoRadioVenci);
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRadioVenci.add(this.jComboBoxTiposAccionesFormularioTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);

		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRadioVenci.add(this.jCheckBoxPostAccionNuevoTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRadioVenci.add(this.jCheckBoxPostAccionSinCerrarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporadiovenciSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporadiovenciSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRadioVenci.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRadioVenci.add(this.jCheckBoxPostAccionSinMensajeTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRadioVenci.add(this.jButtonModificarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);							

		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;
		this.gridBagConstraintsTipoRadioVenci.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRadioVenci.add(this.jButtonEliminarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
			
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRadioVenci.add(this.jButtonActualizarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);


		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;		
		this.gridBagConstraintsTipoRadioVenci.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRadioVenci.add(this.jButtonGuardarCambiosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);	
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = 0;		
		this.gridBagConstraintsTipoRadioVenci.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRadioVenci.add(this.jButtonCancelarTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRadioVenci = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRadioVenci);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporadiovenciSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();						
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRadioVenci.gridx = 0;		
			//this.gridBagConstraintsTipoRadioVenci.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRadioVenci.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRadioVenci.gridx =0;
		this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRadioVenci.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRadioVenciJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRadioVenci = new TipoRadioVenciBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Radio Venci DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Radio Venci DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Radio Venci Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRadioVenciModel tiporadiovenciModel=new TipoRadioVenciModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRadioVenciModel.TipoRadioVenciFocusTraversalPolicy tiporadiovenciFocusTraversalPolicy = tiporadiovenciModel.new TipoRadioVenciFocusTraversalPolicy(this);
			
			//tiporadiovenciFocusTraversalPolicy.settiporadiovenciJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporadiovenciModel);
			
			
			this.jContentPaneDetalleTipoRadioVenci = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRadioVenci = new GridBagLayout();	
			this.jContentPaneDetalleTipoRadioVenci.setLayout(gridaBagLayoutDetalleTipoRadioVenci);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRadioVenci = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
				this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRadioVenci.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRadioVenci.add(jTtoolBarDetalleTipoRadioVenci, gridBagConstraintsTipoRadioVenci);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRadioVenci=   new JScrollPane(jContentPaneDetalleTipoRadioVenci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRadioVenci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRadioVenci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRadioVenci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRadioVenci=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRadioVenci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRadioVenci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRadioVenci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRadioVenci.gridx = 0;
	        
			this.jContentPaneDetalleTipoRadioVenci.add(jPanelCamposTipoRadioVenci, gridBagConstraintsTipoRadioVenci);
			
			
			
			
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
						&& tiporadiovenciSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRadioVenciClienteProve(this.puedeCargarPorParteRadioVenciClienteProve,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRadioVenciProve(this.puedeCargarPorParteRadioVenciProve,false,-1);
					
					if(this.tiporadiovenciSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRadioVenci= new GridBagConstraints();
						this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRadioVenci.gridx = 0;
						this.jContentPaneDetalleTipoRadioVenci.add(this.jTabbedPaneRelacionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRadioVenci.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRadioVenciClienteProve(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRadioVenciProve(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRadioVenci.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
					this.gridBagConstraintsTipoRadioVenci.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRadioVenci.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRadioVenci.add(jPanelCamposOcultosTipoRadioVenci, gridBagConstraintsTipoRadioVenci);
				
					this.jPanelCamposOcultosTipoRadioVenci.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoRadioVenci.gridx = 0;
	        this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRadioVenci.add(this.jPanelAccionesFormularioTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);							
			
			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
	        this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoRadioVenci.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRadioVenci.add(this.jPanelAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRadioVenci);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRadioVenci=   new JScrollPane(this.jPanelCamposTipoRadioVenci,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRadioVenci.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRadioVenci.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRadioVenci.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRadioVenci.gridx = 0;
			this.gridBagConstraintsTipoRadioVenci.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRadioVenci.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRadioVenci.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRadioVenci.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);			
			
			this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
			this.gridBagConstraintsTipoRadioVenci.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRadioVenci.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
			
			
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		
			
		this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
		this.gridBagConstraintsTipoRadioVenci.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRadioVenci.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRadioVenci, this.gridBagConstraintsTipoRadioVenci);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRadioVenci;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRadioVenci;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRadioVenciClienteProve(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(false);
		this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(true);

		this.radiovenciclienteproveBeanSwingJInternalFrame=null;//new RadioVenciClienteProveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.radiovenciclienteproveBeanSwingJInternalFramePopup=new RadioVenciClienteProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.radiovenciclienteproveBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {

				RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL;
				RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(true);

				this.radiovenciclienteproveBeanSwingJInternalFrame=new RadioVenciClienteProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.radiovenciclienteproveBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.radiovenciclienteproveBeanSwingJInternalFrame.setradiovenciclienteproveSessionBean(this.radiovenciclienteproveSessionBean);

				//this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
				//this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRadioVenci.gridx = 0;
				//this.jContentPaneDetalleTipoRadioVenci.add(this.radiovenciclienteproveBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRadioVenci);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRadioVenci.add("Dias Por Vencers",this.radiovenciclienteproveBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRadioVenci.setComponentAt(iIndexTab,this.radiovenciclienteproveBeanSwingJInternalFrame.getContentPane());
				}

				//RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(false);
				this.radiovenciclienteproveBeanSwingJInternalFrame=null;//new RadioVenciClienteProveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRadioVenciClienteProve) {
					this.jTabbedPaneRelacionesTipoRadioVenci.add("Dias Por Vencers",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRadioVenciProve(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		this.radiovenciproveSessionBean.setConGuardarRelaciones(false);
		this.radiovenciproveSessionBean.setEsGuardarRelacionado(true);

		this.radiovenciproveBeanSwingJInternalFrame=null;//new RadioVenciProveBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.radiovenciproveBeanSwingJInternalFramePopup=new RadioVenciProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.radiovenciproveBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {

				RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL;
				RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRadioVenciJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.radiovenciproveSessionBean.setEsGuardarRelacionado(true);

				this.radiovenciproveBeanSwingJInternalFrame=new RadioVenciProveBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.radiovenciproveBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.radiovenciproveBeanSwingJInternalFrame.setradiovenciproveSessionBean(this.radiovenciproveSessionBean);

				//this.gridBagConstraintsTipoRadioVenci = new GridBagConstraints();
				//this.gridBagConstraintsTipoRadioVenci.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRadioVenci.gridx = 0;
				//this.jContentPaneDetalleTipoRadioVenci.add(this.radiovenciproveBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRadioVenci);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRadioVenci.add("Dias Vencidoss",this.radiovenciproveBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRadioVenci.setComponentAt(iIndexTab,this.radiovenciproveBeanSwingJInternalFrame.getContentPane());
				}

				//RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.radiovenciproveSessionBean.setEsGuardarRelacionado(false);
				this.radiovenciproveBeanSwingJInternalFrame=null;//new RadioVenciProveBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRadioVenciProve) {
					this.jTabbedPaneRelacionesTipoRadioVenci.add("Dias Vencidoss",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRadioVenciProveBeanSwingJInternalFrame(List<TipoRadioVenci> tiporadiovencis,TipoRadioVenci tiporadiovenci,RadioVenciProveBeanSwingJInternalFrame radiovenciproveBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//radiovenciproveBeanSwingJInternalFrame=new RadioVenciProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					radiovenciproveBeanSwingJInternalFrame.getRadioVenciProveLogic().setConnexion(this.tiporadiovenciLogic.getConnexion());

					radiovenciproveBeanSwingJInternalFrame.settiporadiovencisForeignKey(tiporadiovencis);
					radiovenciproveBeanSwingJInternalFrame.settiporadiovenciForeignKey(tiporadiovenci);
					radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.setisBusquedaDesdeForeignKeySesionTipoRadioVenci(true);
					radiovenciproveBeanSwingJInternalFrame.radiovenciproveSessionBean.setlidTipoRadioVenciActual(tiporadiovenci.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					radiovenciproveBeanSwingJInternalFrame.cargarCombosForeignKeyRadioVenciProve(radiovenciproveBeanSwingJInternalFrame.isCargarCombosDependencia);
					radiovenciproveBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRadioVenci(true);
					radiovenciproveBeanSwingJInternalFrame.setid_tipo_radio_venciFK_IdTipoRadioVenci(tiporadiovenci.getId());

					if(!this.conCargarFormDetalle) {
						radiovenciproveBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					radiovenciproveBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRadioVenciForeignKey(tiporadiovenci,1,false,true,true);
					radiovenciproveBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					radiovenciproveBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRadioVenci");
					radiovenciproveBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRadioVenci");
					radiovenciproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaRadioVenciProve(true);
					radiovenciproveBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRadioVenciProve("n",radiovenciproveBeanSwingJInternalFrame.isGuardarCambiosEnLote, radiovenciproveBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					radiovenciproveBeanSwingJInternalFrame.setAutoscrolls(true);
					radiovenciproveBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						radiovenciproveBeanSwingJInternalFrame.actualizarEstadoPanelsRadioVenciProve("relacionado");
					} else {
						radiovenciproveBeanSwingJInternalFrame.actualizarEstadoPanelsRadioVenciProve("no_relacionado");
					}

					radiovenciproveBeanSwingJInternalFrame.getjButtonRecargarInformacionRadioVenciProve().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRadioVenciClienteProveBeanSwingJInternalFrame(List<TipoRadioVenci> tiporadiovencis,TipoRadioVenci tiporadiovenci,RadioVenciClienteProveBeanSwingJInternalFrame radiovenciclienteproveBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//radiovenciclienteproveBeanSwingJInternalFrame=new RadioVenciClienteProveBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					radiovenciclienteproveBeanSwingJInternalFrame.getRadioVenciClienteProveLogic().setConnexion(this.tiporadiovenciLogic.getConnexion());

					radiovenciclienteproveBeanSwingJInternalFrame.settiporadiovencisForeignKey(tiporadiovencis);
					radiovenciclienteproveBeanSwingJInternalFrame.settiporadiovenciForeignKey(tiporadiovenci);
					radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.setisBusquedaDesdeForeignKeySesionTipoRadioVenci(true);
					radiovenciclienteproveBeanSwingJInternalFrame.radiovenciclienteproveSessionBean.setlidTipoRadioVenciActual(tiporadiovenci.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					radiovenciclienteproveBeanSwingJInternalFrame.cargarCombosForeignKeyRadioVenciClienteProve(radiovenciclienteproveBeanSwingJInternalFrame.isCargarCombosDependencia);
					radiovenciclienteproveBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRadioVenci(true);
					radiovenciclienteproveBeanSwingJInternalFrame.setid_tipo_radio_venciFK_IdTipoRadioVenci(tiporadiovenci.getId());

					if(!this.conCargarFormDetalle) {
						radiovenciclienteproveBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					radiovenciclienteproveBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRadioVenciForeignKey(tiporadiovenci,1,false,true,true);
					radiovenciclienteproveBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					radiovenciclienteproveBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRadioVenci");
					radiovenciclienteproveBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRadioVenci");
					radiovenciclienteproveBeanSwingJInternalFrame.inicializarActualizarBindingTablaRadioVenciClienteProve(true);
					radiovenciclienteproveBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n",radiovenciclienteproveBeanSwingJInternalFrame.isGuardarCambiosEnLote, radiovenciclienteproveBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					radiovenciclienteproveBeanSwingJInternalFrame.setAutoscrolls(true);
					radiovenciclienteproveBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						radiovenciclienteproveBeanSwingJInternalFrame.actualizarEstadoPanelsRadioVenciClienteProve("relacionado");
					} else {
						radiovenciclienteproveBeanSwingJInternalFrame.actualizarEstadoPanelsRadioVenciClienteProve("no_relacionado");
					}

					radiovenciclienteproveBeanSwingJInternalFrame.getjButtonRecargarInformacionRadioVenciClienteProve().setVisible(false);

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
