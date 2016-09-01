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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoTransaccionModuloConstantesFunciones;

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
public class TipoTransaccionModuloDetalleFormJInternalFrame extends TipoTransaccionModuloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTransaccionModulo;
	
	protected JMenuBar jmenuBarDetalleTipoTransaccionModulo;
	
	protected JMenu jmenuDetalleTipoTransaccionModulo;
	protected JMenu jmenuDetalleArchivoTipoTransaccionModulo;
	protected JMenu jmenuDetalleAccionesTipoTransaccionModulo;
	protected JMenu jmenuDetalleDatosTipoTransaccionModulo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTransaccionModulo;	
	protected GridBagConstraints gridBagConstraintsTipoTransaccionModulo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTransaccionModuloBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTransaccionModulo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	
	
	
	
	public ModuloSessionBean moduloSessionBean;	
	
	public TipoTransaccionModuloLogic tipotransaccionmoduloLogic;
	
	public JScrollPane jScrollPanelDatosTipoTransaccionModulo;
	public JScrollPane jScrollPanelDatosEdicionTipoTransaccionModulo;
	public JScrollPane jScrollPanelDatosGeneralTipoTransaccionModulo;
	
	protected JPanel jPanelCamposTipoTransaccionModulo;    
	protected JPanel jPanelCamposOcultosTipoTransaccionModulo;    	
	protected JPanel jPanelAccionesTipoTransaccionModulo;
	protected JPanel jPanelAccionesFormularioTipoTransaccionModulo;
    
	
	
	protected Integer iXPanelCamposTipoTransaccionModulo=0;
	protected Integer iYPanelCamposTipoTransaccionModulo=0;
	
	protected Integer iXPanelCamposOcultosTipoTransaccionModulo=0;
	protected Integer iYPanelCamposOcultosTipoTransaccionModulo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTransaccionModulo;
	public JButton jButtonModificarTipoTransaccionModulo;
	public JButton jButtonActualizarTipoTransaccionModulo;
    public JButton jButtonEliminarTipoTransaccionModulo;
	public JButton jButtonCancelarTipoTransaccionModulo;
    public JButton jButtonGuardarCambiosTipoTransaccionModulo;
	public JButton jButtonGuardarCambiosTablaTipoTransaccionModulo;
	protected JButton jButtonCerrarTipoTransaccionModulo;
	
	
	protected JButton jButtonProcesarInformacionTipoTransaccionModulo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTransaccionModulo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTransaccionModulo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTransaccionModulo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTransaccionModulo;
	protected JButton jButtonModificarToolBarTipoTransaccionModulo;
	protected JButton jButtonActualizarToolBarTipoTransaccionModulo;
    protected JButton jButtonEliminarToolBarTipoTransaccionModulo;
	protected JButton jButtonCancelarToolBarTipoTransaccionModulo;
    protected JButton jButtonGuardarCambiosToolBarTipoTransaccionModulo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTransaccionModulo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTransaccionModulo;
	protected JButton jButtonCerrarToolBarTipoTransaccionModulo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTransaccionModulo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTransaccionModulo;
	protected JMenuItem jMenuItemModificarTipoTransaccionModulo;
	protected JMenuItem jMenuItemActualizarTipoTransaccionModulo;
    protected JMenuItem jMenuItemEliminarTipoTransaccionModulo;
	protected JMenuItem jMenuItemCancelarTipoTransaccionModulo;
    protected JMenuItem jMenuItemGuardarCambiosTipoTransaccionModulo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTransaccionModulo;
	protected JMenuItem jMenuItemCerrarTipoTransaccionModulo;
	protected JMenuItem jMenuItemDetalleCerrarTipoTransaccionModulo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTransaccionModulo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTransaccionModulo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTransaccionModulo;
	protected JMenuItem jMenuItemMostrarOcultarTipoTransaccionModulo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTransaccionModulo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTransaccionModulo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTransaccionModulo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTransaccionModulo;
	public JLabel jLabelIdTipoTransaccionModulo;
	public JTextFieldMe jTextFieldidTipoTransaccionModulo;
	public JButton jButtonidTipoTransaccionModuloBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTransaccionModulo;
	public JLabel jLabelnombreTipoTransaccionModulo;
	public JTextArea jTextAreanombreTipoTransaccionModulo;
	public JScrollPane jscrollPanenombreTipoTransaccionModulo;
	public JButton jButtonnombreTipoTransaccionModuloBusqueda= new JButtonMe();

	public JPanel jPanelsiglasTipoTransaccionModulo;
	public JLabel jLabelsiglasTipoTransaccionModulo;
	public JTextField jTextFieldsiglasTipoTransaccionModulo;
	public JButton jButtonsiglasTipoTransaccionModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloTipoTransaccionModulo;
	public JLabel jLabelid_moduloTipoTransaccionModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTipoTransaccionModulo;
	public JButton jButtonid_moduloTipoTransaccionModulo= new JButtonMe();
	public JButton jButtonid_moduloTipoTransaccionModuloUpdate= new JButtonMe();
	public JButton jButtonid_moduloTipoTransaccionModuloBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTransaccionModulo;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoTransaccionModuloDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTransaccionModulo=new JPanel();
				this.jPanelAccionesFormularioTipoTransaccionModulo=new JPanel();
				this.jmenuBarDetalleTipoTransaccionModulo=new JMenuBar();
				this.jTtoolBarDetalleTipoTransaccionModulo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTransaccionModuloDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaccionModuloDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTransaccionModulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTransaccionModulo() {
		return this.jButtonActualizarToolBarTipoTransaccionModulo;
	}
	
	public JButton getjButtonEliminarToolBarTipoTransaccionModulo() {
		return this.jButtonEliminarToolBarTipoTransaccionModulo;
	}
	
	public JButton getjButtonCancelarToolBarTipoTransaccionModulo() {
		return this.jButtonCancelarToolBarTipoTransaccionModulo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTransaccionModulo() {
		return this.jButtonProcesarInformacionTipoTransaccionModulo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTransaccionModulo)	{
		this.jButtonProcesarInformacionTipoTransaccionModulo = jButtonProcesarInformacionTipoTransaccionModulo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTransaccionModulo() {
		return this.jComboBoxTiposAccionesTipoTransaccionModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTransaccionModulo(
			JComboBox jComboBoxTiposRelacionesTipoTransaccionModulo) {
		this.jComboBoxTiposRelacionesTipoTransaccionModulo = jComboBoxTiposRelacionesTipoTransaccionModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTransaccionModulo(
			JComboBox jComboBoxTiposAccionesTipoTransaccionModulo) {
		this.jComboBoxTiposAccionesTipoTransaccionModulo = jComboBoxTiposAccionesTipoTransaccionModulo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTransaccionModulo() {
		return this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTransaccionModulo(
			JComboBox jComboBoxTiposAccionesFormularioTipoTransaccionModulo) {
		this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo = jComboBoxTiposAccionesFormularioTipoTransaccionModulo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipotransaccionmoduloSessionBean=new TipoTransaccionModuloSessionBean();
		
		this.tipotransaccionmoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotransaccionmoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTransaccionModuloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTransaccionModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTransaccionModuloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Transaccion Modulo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTransaccionModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTransaccionModulo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTransaccionModulo=new JButtonMe();
				this.jButtonModificarToolBarTipoTransaccionModulo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTransaccionModulo,this.jTtoolBarDetalleTipoTransaccionModulo,
							"actualizar","actualizar","Actualizar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTransaccionModulo,this.jTtoolBarDetalleTipoTransaccionModulo,
							"eliminar","eliminar","Eliminar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTransaccionModulo,this.jTtoolBarDetalleTipoTransaccionModulo,
							"cancelar","cancelar","Cancelar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTransaccionModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTransaccionModulo,this.jTtoolBarDetalleTipoTransaccionModulo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTransaccionModulo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTransaccionModulo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTransaccionModulo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTransaccionModulo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTransaccionModulo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTransaccionModulo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTransaccionModulo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTransaccionModulo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTransaccionModulo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTransaccionModulo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTransaccionModulo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTransaccionModulo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTransaccionModulo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTransaccionModulo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTransaccionModulo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTransaccionModulo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTransaccionModulo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTransaccionModulo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTransaccionModulo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTransaccionModulo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTransaccionModulo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTransaccionModulo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTransaccionModulo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTransaccionModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTransaccionModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTransaccionModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTransaccionModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTransaccionModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTransaccionModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTransaccionModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTransaccionModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTransaccionModulo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTransaccionModulo.add(this.jMenuItemDetalleCerrarTipoTransaccionModulo);
		
		this.jmenuDetalleAccionesTipoTransaccionModulo.add(this.jMenuItemActualizarTipoTransaccionModulo);
		this.jmenuDetalleAccionesTipoTransaccionModulo.add(this.jMenuItemEliminarTipoTransaccionModulo);
		this.jmenuDetalleAccionesTipoTransaccionModulo.add(this.jMenuItemCancelarTipoTransaccionModulo);		
		
		//this.jmenuDetalleDatosTipoTransaccionModulo.add(this.jMenuItemDetalleAbrirOrderByTipoTransaccionModulo);				
		this.jmenuDetalleDatosTipoTransaccionModulo.add(this.jMenuItemDetalleMostarOcultarTipoTransaccionModulo);				
				
		//this.jmenuDetalleAccionesTipoTransaccionModulo.add(this.jMenuItemGuardarCambiosTipoTransaccionModulo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTransaccionModulo.add(this.jmenuDetalleArchivoTipoTransaccionModulo);		
		this.jmenuBarDetalleTipoTransaccionModulo.add(this.jmenuDetalleAccionesTipoTransaccionModulo);		
		this.jmenuBarDetalleTipoTransaccionModulo.add(this.jmenuDetalleDatosTipoTransaccionModulo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTransaccionModulo);				
	}
	
	
	public void inicializarElementosCamposTipoTransaccionModulo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTransaccionModulo = new JLabelMe();
		jLabelIdTipoTransaccionModulo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTransaccionModulo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTransaccionModulo.setToolTipText(TipoTransaccionModuloConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTransaccionModulo= new GridBagLayout();

		this.jPanelidTipoTransaccionModulo.setLayout(this.gridaBagLayoutTipoTransaccionModulo);

		jTextFieldidTipoTransaccionModulo = new JTextFieldMe();
		jTextFieldidTipoTransaccionModulo.setText("Id");

		jTextFieldidTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoTransaccionModulo = new JLabelMe();
		this.jLabelnombreTipoTransaccionModulo.setText(""+TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTransaccionModulo.setToolTipText("Nombre");
		this.jLabelnombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTransaccionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTransaccionModulo.setToolTipText(TipoTransaccionModuloConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTransaccionModulo = new GridBagLayout();
		this.jPanelnombreTipoTransaccionModulo.setLayout(this.gridaBagLayoutTipoTransaccionModulo);


		jTextAreanombreTipoTransaccionModulo= new JTextAreaMe();
		jTextAreanombreTipoTransaccionModulo.setEnabled(false);
		jTextAreanombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTransaccionModulo.setLineWrap(true);
		jTextAreanombreTipoTransaccionModulo.setWrapStyleWord(true);
		jTextAreanombreTipoTransaccionModulo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTransaccionModulo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTransaccionModulo = new JScrollPane(jTextAreanombreTipoTransaccionModulo);
		jscrollPanenombreTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoTransaccionModuloBusqueda= new JButtonMe();
		this.jButtonnombreTipoTransaccionModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTransaccionModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTransaccionModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTransaccionModuloBusqueda.setText("U");
		this.jButtonnombreTipoTransaccionModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTransaccionModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTransaccionModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTransaccionModuloBusqueda"));

		if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTransaccionModuloBusqueda.setVisible(false);		}


					
		this.jLabelsiglasTipoTransaccionModulo = new JLabelMe();
		this.jLabelsiglasTipoTransaccionModulo.setText(""+TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS+" : *");
		this.jLabelsiglasTipoTransaccionModulo.setToolTipText("Siglas");
		this.jLabelsiglasTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglasTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglasTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglasTipoTransaccionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglasTipoTransaccionModulo.setToolTipText(TipoTransaccionModuloConstantesFunciones.LABEL_SIGLAS);
		this.gridaBagLayoutTipoTransaccionModulo = new GridBagLayout();
		this.jPanelsiglasTipoTransaccionModulo.setLayout(this.gridaBagLayoutTipoTransaccionModulo);


		jTextFieldsiglasTipoTransaccionModulo= new JTextFieldMe();

		jTextFieldsiglasTipoTransaccionModulo.setEnabled(false);
		jTextFieldsiglasTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglasTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglasTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglasTipoTransaccionModuloBusqueda= new JButtonMe();
		this.jButtonsiglasTipoTransaccionModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoTransaccionModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglasTipoTransaccionModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglasTipoTransaccionModuloBusqueda.setText("U");
		this.jButtonsiglasTipoTransaccionModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglasTipoTransaccionModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglasTipoTransaccionModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglasTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglasTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglasTipoTransaccionModuloBusqueda"));

		if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglasTipoTransaccionModuloBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTransaccionModulo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_moduloTipoTransaccionModulo = new JLabelMe();
		this.jLabelid_moduloTipoTransaccionModulo.setText(""+TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTipoTransaccionModulo.setToolTipText("Modulo");
		this.jLabelid_moduloTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTipoTransaccionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTipoTransaccionModulo.setToolTipText(TipoTransaccionModuloConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTipoTransaccionModulo = new GridBagLayout();
		this.jPanelid_moduloTipoTransaccionModulo.setLayout(this.gridaBagLayoutTipoTransaccionModulo);


		jComboBoxid_moduloTipoTransaccionModulo= new JComboBoxMe();
		jComboBoxid_moduloTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloTipoTransaccionModulo= new JButtonMe();
		this.jButtonid_moduloTipoTransaccionModulo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoTransaccionModulo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoTransaccionModulo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoTransaccionModulo.setText("Buscar");
		this.jButtonid_moduloTipoTransaccionModulo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTipoTransaccionModulo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoTransaccionModulo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoTransaccionModulo"));

		this.jButtonid_moduloTipoTransaccionModuloBusqueda= new JButtonMe();
		this.jButtonid_moduloTipoTransaccionModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoTransaccionModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoTransaccionModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoTransaccionModuloBusqueda.setText("U");
		this.jButtonid_moduloTipoTransaccionModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTipoTransaccionModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoTransaccionModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoTransaccionModuloBusqueda"));

		if(this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTipoTransaccionModuloBusqueda.setVisible(false);		}

		this.jButtonid_moduloTipoTransaccionModuloUpdate= new JButtonMe();
		this.jButtonid_moduloTipoTransaccionModuloUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoTransaccionModuloUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoTransaccionModuloUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoTransaccionModuloUpdate.setText("U");
		this.jButtonid_moduloTipoTransaccionModuloUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTipoTransaccionModuloUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoTransaccionModuloUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTipoTransaccionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoTransaccionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoTransaccionModuloUpdate"));



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
		//this.jInternalFrameDetalleTipoTransaccionModulo = new TipoTransaccionModuloBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Transaccion Modulo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTransaccionModulo= new GridBagLayout();
		

		
		String sToolTipTipoTransaccionModulo="";
		sToolTipTipoTransaccionModulo=TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTransaccionModulo+="(Contabilidad.TipoTransaccionModulo)";
		}
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTransaccionModulo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTransaccionModulo = new JButtonMe();
		this.jButtonModificarTipoTransaccionModulo = new JButtonMe();
        this.jButtonActualizarTipoTransaccionModulo = new JButtonMe();
        this.jButtonEliminarTipoTransaccionModulo = new JButtonMe();
        this.jButtonCancelarTipoTransaccionModulo = new JButtonMe();
        this.jButtonGuardarCambiosTipoTransaccionModulo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo = new JButtonMe();
		this.jButtonCerrarTipoTransaccionModulo = new JButtonMe();
		
		this.jScrollPanelDatosTipoTransaccionModulo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTransaccionModulo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTransaccionModulo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Transaccion Modulo";
		
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transaccion Modulos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTransaccionModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTransaccionModulo.setName("jPanelCamposTipoTransaccionModulo"); 

		this.jPanelCamposOcultosTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTransaccionModulo.setName("jPanelCamposOcultosTipoTransaccionModulo"); 

        this.jPanelAccionesTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTransaccionModulo.setToolTipText("Acciones");
        this.jPanelAccionesTipoTransaccionModulo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTransaccionModulo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTransaccionModulo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTransaccionModulo.setText("Nuevo");
		this.jButtonModificarTipoTransaccionModulo.setText("Editar");
        this.jButtonActualizarTipoTransaccionModulo.setText("Actualizar");
        this.jButtonEliminarTipoTransaccionModulo.setText("Eliminar");
        this.jButtonCancelarTipoTransaccionModulo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTransaccionModulo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.setText("Guardar");
		this.jButtonCerrarTipoTransaccionModulo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTransaccionModulo,"nuevo_button","Nuevo",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTransaccionModulo,"modificar_button","Editar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTransaccionModulo,"actualizar_button","Actualizar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTransaccionModulo,"eliminar_button","Eliminar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTransaccionModulo,"cancelar_button","Cancelar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTransaccionModulo,"guardarcambios_button","Guardar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTransaccionModulo,"guardarcambiostabla_button","Guardar",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTransaccionModulo,"cerrar_button","Salir",this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTransaccionModulo.setToolTipText("Nuevo"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTransaccionModulo.setToolTipText("Editar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTransaccionModulo.setToolTipText("Actualizar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTransaccionModulo.setToolTipText("Eliminar)"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTransaccionModulo.setToolTipText("Cancelar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTransaccionModulo.setToolTipText("Guardar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.setToolTipText("Guardar"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTransaccionModulo.setToolTipText("Salir"+" "+TipoTransaccionModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTransaccionModulo";
		inputMap = this.jButtonNuevoTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTransaccionModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTransaccionModulo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTransaccionModulo";
		inputMap = this.jButtonActualizarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTransaccionModulo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTransaccionModulo";
		inputMap = this.jButtonEliminarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTransaccionModulo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTransaccionModulo";
		inputMap = this.jButtonCancelarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTransaccionModulo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTransaccionModulo";
		inputMap = this.jButtonCerrarTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTransaccionModulo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTransaccionModulo";
		inputMap = this.jButtonGuardarCambiosTablaTipoTransaccionModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTransaccionModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTransaccionModulo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTransaccionModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTransaccionModulo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTransaccionModulo.setToolTipText("Nuevo TipoTransaccionModulo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo.setToolTipText("Sin Cerrar Ventana TipoTransaccionModulo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTransaccionModulo.setText("Accion");
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTransaccionModulo = new JLabelMe();
		
		this.jLabelAccionesTipoTransaccionModulo.setText("Acciones");		
		this.jLabelAccionesTipoTransaccionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransaccionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransaccionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTransaccionModulo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTransaccionModulo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTransaccionModulo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTransaccionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTransaccionModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransaccionModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTransaccionModulo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTransaccionModulo = new GridBagLayout();
		
		this.jPanelCamposTipoTransaccionModulo.setLayout(gridaBagLayoutCamposTipoTransaccionModulo);
		this.jPanelCamposOcultosTipoTransaccionModulo.setLayout(gridaBagLayoutCamposOcultosTipoTransaccionModulo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTransaccionModulo.add(jLabelIdTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 1;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTransaccionModulo.add(jTextFieldidTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);


	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTipoTransaccionModulo.add(jLabelid_moduloTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 2;
		this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
		this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoTransaccionModulo.add(jButtonid_moduloTipoTransaccionModuloBusqueda, this.gridBagConstraintsTipoTransaccionModulo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 3;
		this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
		this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoTransaccionModulo.add(jButtonid_moduloTipoTransaccionModuloUpdate, this.gridBagConstraintsTipoTransaccionModulo);
	}

	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 1;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTipoTransaccionModulo.add(jComboBoxid_moduloTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);


	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTransaccionModulo.add(jLabelnombreTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 2;
		this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
		this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTransaccionModulo.add(jButtonnombreTipoTransaccionModuloBusqueda, this.gridBagConstraintsTipoTransaccionModulo);
	}

	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 1;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTransaccionModulo.add(jscrollPanenombreTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);


	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglasTipoTransaccionModulo.add(jLabelsiglasTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 2;
		this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
		this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglasTipoTransaccionModulo.add(jButtonsiglasTipoTransaccionModuloBusqueda, this.gridBagConstraintsTipoTransaccionModulo);
	}

	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = 1;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglasTipoTransaccionModulo.add(jTextFieldsiglasTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = iYPanelCamposTipoTransaccionModulo;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = iXPanelCamposTipoTransaccionModulo++;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTransaccionModulo.add(this.jPanelidTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(iXPanelCamposTipoTransaccionModulo % 1==0) {
		iXPanelCamposTipoTransaccionModulo=0;
		iYPanelCamposTipoTransaccionModulo++;
	}
	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = iYPanelCamposTipoTransaccionModulo;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = iXPanelCamposTipoTransaccionModulo++;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTransaccionModulo.add(this.jPanelid_moduloTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(iXPanelCamposTipoTransaccionModulo % 1==0) {
		iXPanelCamposTipoTransaccionModulo=0;
		iYPanelCamposTipoTransaccionModulo++;
	}
	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = iYPanelCamposTipoTransaccionModulo;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = iXPanelCamposTipoTransaccionModulo++;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTransaccionModulo.add(this.jPanelnombreTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(iXPanelCamposTipoTransaccionModulo % 1==0) {
		iXPanelCamposTipoTransaccionModulo=0;
		iYPanelCamposTipoTransaccionModulo++;
	}
	this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTransaccionModulo.gridy = iYPanelCamposTipoTransaccionModulo;
	this.gridBagConstraintsTipoTransaccionModulo.gridx = iXPanelCamposTipoTransaccionModulo++;
	this.gridBagConstraintsTipoTransaccionModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTransaccionModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTransaccionModulo.add(this.jPanelsiglasTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);



	if(iXPanelCamposTipoTransaccionModulo % 1==0) {
		iXPanelCamposTipoTransaccionModulo=0;
		iYPanelCamposTipoTransaccionModulo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTransaccionModulo= new GridBagLayout();
		this.jPanelAccionesTipoTransaccionModulo.setLayout(gridaBagLayoutAccionesTipoTransaccionModulo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTransaccionModulo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTransaccionModulo.setLayout(gridaBagLayoutAccionesFormularioTipoTransaccionModulo);
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTransaccionModulo.add(this.jComboBoxTiposAccionesFormularioTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTransaccionModulo.add(this.jCheckBoxPostAccionNuevoTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTransaccionModulo.add(this.jCheckBoxPostAccionSinCerrarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipotransaccionmoduloSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTransaccionModulo.add(this.jCheckBoxPostAccionSinMensajeTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTransaccionModulo.add(this.jButtonModificarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);							

		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;
		this.gridBagConstraintsTipoTransaccionModulo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTransaccionModulo.add(this.jButtonEliminarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
			
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTransaccionModulo.add(this.jButtonActualizarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);


		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTransaccionModulo.add(this.jButtonGuardarCambiosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);	
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = 0;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTransaccionModulo.add(this.jButtonCancelarTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTransaccionModulo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTransaccionModulo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotransaccionmoduloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();						
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;		
			//this.gridBagConstraintsTipoTransaccionModulo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTransaccionModulo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTransaccionModulo.gridx =0;
		this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTransaccionModulo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTransaccionModuloJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTransaccionModulo = new TipoTransaccionModuloBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Transaccion Modulo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Transaccion Modulo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Transaccion Modulo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTransaccionModuloModel tipotransaccionmoduloModel=new TipoTransaccionModuloModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTransaccionModuloModel.TipoTransaccionModuloFocusTraversalPolicy tipotransaccionmoduloFocusTraversalPolicy = tipotransaccionmoduloModel.new TipoTransaccionModuloFocusTraversalPolicy(this);
			
			//tipotransaccionmoduloFocusTraversalPolicy.settipotransaccionmoduloJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipotransaccionmoduloModel);
			
			
			this.jContentPaneDetalleTipoTransaccionModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTransaccionModulo = new GridBagLayout();	
			this.jContentPaneDetalleTipoTransaccionModulo.setLayout(gridaBagLayoutDetalleTipoTransaccionModulo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTransaccionModulo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
				this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTransaccionModulo.add(jTtoolBarDetalleTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTransaccionModulo=   new JScrollPane(jContentPaneDetalleTipoTransaccionModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTransaccionModulo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	        
			this.jContentPaneDetalleTipoTransaccionModulo.add(jPanelCamposTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);
			
			
			
			
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
						&& tipotransaccionmoduloSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipotransaccionmoduloSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTransaccionModulo= new GridBagConstraints();
						this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
						this.jContentPaneDetalleTipoTransaccionModulo.add(this.jTabbedPaneRelacionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTransaccionModulo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTransaccionModulo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
					this.gridBagConstraintsTipoTransaccionModulo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTransaccionModulo.add(jPanelCamposOcultosTipoTransaccionModulo, gridBagConstraintsTipoTransaccionModulo);
				
					this.jPanelCamposOcultosTipoTransaccionModulo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	        this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTransaccionModulo.add(this.jPanelAccionesFormularioTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);							
			
			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
	        this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTransaccionModulo.add(this.jPanelAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTransaccionModulo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTransaccionModulo=   new JScrollPane(this.jPanelCamposTipoTransaccionModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTransaccionModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransaccionModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransaccionModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
			this.gridBagConstraintsTipoTransaccionModulo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTransaccionModulo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTransaccionModulo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);			
			
			this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
			this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
			
			
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		
			
		this.gridBagConstraintsTipoTransaccionModulo = new GridBagConstraints();
		this.gridBagConstraintsTipoTransaccionModulo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransaccionModulo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTransaccionModulo, this.gridBagConstraintsTipoTransaccionModulo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTransaccionModulo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTransaccionModulo;
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
