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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.TipoActivoFijoEmpresaConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class TipoActivoFijoEmpresaDetalleFormJInternalFrame extends TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoActivoFijoEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoActivoFijoEmpresa;
	
	protected JMenu jmenuDetalleTipoActivoFijoEmpresa;
	protected JMenu jmenuDetalleArchivoTipoActivoFijoEmpresa;
	protected JMenu jmenuDetalleAccionesTipoActivoFijoEmpresa;
	protected JMenu jmenuDetalleDatosTipoActivoFijoEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoActivoFijoEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoActivoFijoEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoActivoFijoEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoActivoFijoEmpresaSessionBean tipoactivofijoempresaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoActivoFijoEmpresaLogic tipoactivofijoempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoActivoFijoEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoActivoFijoEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoActivoFijoEmpresa;
	
	protected JPanel jPanelCamposTipoActivoFijoEmpresa;    
	protected JPanel jPanelCamposOcultosTipoActivoFijoEmpresa;    	
	protected JPanel jPanelAccionesTipoActivoFijoEmpresa;
	protected JPanel jPanelAccionesFormularioTipoActivoFijoEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoActivoFijoEmpresa=0;
	protected Integer iYPanelCamposTipoActivoFijoEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoActivoFijoEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoActivoFijoEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoActivoFijoEmpresa;
	public JButton jButtonModificarTipoActivoFijoEmpresa;
	public JButton jButtonActualizarTipoActivoFijoEmpresa;
    public JButton jButtonEliminarTipoActivoFijoEmpresa;
	public JButton jButtonCancelarTipoActivoFijoEmpresa;
    public JButton jButtonGuardarCambiosTipoActivoFijoEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoActivoFijoEmpresa;
	protected JButton jButtonCerrarTipoActivoFijoEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoActivoFijoEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonModificarToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonActualizarToolBarTipoActivoFijoEmpresa;
    protected JButton jButtonEliminarToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonCancelarToolBarTipoActivoFijoEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoActivoFijoEmpresa;
	protected JButton jButtonCerrarToolBarTipoActivoFijoEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoActivoFijoEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemModificarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemActualizarTipoActivoFijoEmpresa;
    protected JMenuItem jMenuItemEliminarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemCancelarTipoActivoFijoEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemCerrarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoActivoFijoEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoActivoFijoEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoActivoFijoEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoActivoFijoEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoActivoFijoEmpresa;
	public JLabel jLabelIdTipoActivoFijoEmpresa;
	public JLabel jLabelidTipoActivoFijoEmpresa;
	public JButton jButtonidTipoActivoFijoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoActivoFijoEmpresa;
	public JLabel jLabelcodigoTipoActivoFijoEmpresa;
	public JTextField jTextFieldcodigoTipoActivoFijoEmpresa;
	public JButton jButtoncodigoTipoActivoFijoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoActivoFijoEmpresa;
	public JLabel jLabelnombreTipoActivoFijoEmpresa;
	public JTextArea jTextAreanombreTipoActivoFijoEmpresa;
	public JScrollPane jscrollPanenombreTipoActivoFijoEmpresa;
	public JButton jButtonnombreTipoActivoFijoEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoActivoFijoEmpresa;
	public JLabel jLabelid_empresaTipoActivoFijoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoActivoFijoEmpresa;
	public JButton jButtonid_empresaTipoActivoFijoEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoActivoFijoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoActivoFijoEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoActivoFijoEmpresa;
	
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
	
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoActivoFijoEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoActivoFijoEmpresa=new JPanel();
				this.jmenuBarDetalleTipoActivoFijoEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoActivoFijoEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoActivoFijoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoActivoFijoEmpresa() {
		return this.jButtonActualizarToolBarTipoActivoFijoEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoActivoFijoEmpresa() {
		return this.jButtonEliminarToolBarTipoActivoFijoEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoActivoFijoEmpresa() {
		return this.jButtonCancelarToolBarTipoActivoFijoEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoActivoFijoEmpresa() {
		return this.jButtonProcesarInformacionTipoActivoFijoEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoActivoFijoEmpresa)	{
		this.jButtonProcesarInformacionTipoActivoFijoEmpresa = jButtonProcesarInformacionTipoActivoFijoEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposAccionesTipoActivoFijoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposRelacionesTipoActivoFijoEmpresa = jComboBoxTiposRelacionesTipoActivoFijoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposAccionesTipoActivoFijoEmpresa) {
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa = jComboBoxTiposAccionesTipoActivoFijoEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa = jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoactivofijoempresaSessionBean=new TipoActivoFijoEmpresaSessionBean();
		
		this.tipoactivofijoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoactivofijoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoActivoFijoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoActivoFijoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoActivoFijoEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Activo Fijo Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoActivoFijoEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoActivoFijoEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoActivoFijoEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoActivoFijoEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoActivoFijoEmpresa,this.jTtoolBarDetalleTipoActivoFijoEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoActivoFijoEmpresa,this.jTtoolBarDetalleTipoActivoFijoEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoActivoFijoEmpresa,this.jTtoolBarDetalleTipoActivoFijoEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoActivoFijoEmpresa,this.jTtoolBarDetalleTipoActivoFijoEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoActivoFijoEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoActivoFijoEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoActivoFijoEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoActivoFijoEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoActivoFijoEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoActivoFijoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoActivoFijoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoActivoFijoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoActivoFijoEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoActivoFijoEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoActivoFijoEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoActivoFijoEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoActivoFijoEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoActivoFijoEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoActivoFijoEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoActivoFijoEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoActivoFijoEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoActivoFijoEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoActivoFijoEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoActivoFijoEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoActivoFijoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoActivoFijoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoActivoFijoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoActivoFijoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoActivoFijoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoActivoFijoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoActivoFijoEmpresa.add(this.jMenuItemDetalleCerrarTipoActivoFijoEmpresa);
		
		this.jmenuDetalleAccionesTipoActivoFijoEmpresa.add(this.jMenuItemActualizarTipoActivoFijoEmpresa);
		this.jmenuDetalleAccionesTipoActivoFijoEmpresa.add(this.jMenuItemEliminarTipoActivoFijoEmpresa);
		this.jmenuDetalleAccionesTipoActivoFijoEmpresa.add(this.jMenuItemCancelarTipoActivoFijoEmpresa);		
		
		//this.jmenuDetalleDatosTipoActivoFijoEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoActivoFijoEmpresa);				
		this.jmenuDetalleDatosTipoActivoFijoEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoActivoFijoEmpresa);				
				
		//this.jmenuDetalleAccionesTipoActivoFijoEmpresa.add(this.jMenuItemGuardarCambiosTipoActivoFijoEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoActivoFijoEmpresa.add(this.jmenuDetalleArchivoTipoActivoFijoEmpresa);		
		this.jmenuBarDetalleTipoActivoFijoEmpresa.add(this.jmenuDetalleAccionesTipoActivoFijoEmpresa);		
		this.jmenuBarDetalleTipoActivoFijoEmpresa.add(this.jmenuDetalleDatosTipoActivoFijoEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoActivoFijoEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoActivoFijoEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoActivoFijoEmpresa = new JLabelMe();
		jLabelIdTipoActivoFijoEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoActivoFijoEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoActivoFijoEmpresa.setToolTipText(TipoActivoFijoEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoActivoFijoEmpresa= new GridBagLayout();

		this.jPanelidTipoActivoFijoEmpresa.setLayout(this.gridaBagLayoutTipoActivoFijoEmpresa);

		jLabelidTipoActivoFijoEmpresa = new JLabel();
		jLabelidTipoActivoFijoEmpresa.setText("Id");

		jLabelidTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoActivoFijoEmpresa = new JLabelMe();
		this.jLabelcodigoTipoActivoFijoEmpresa.setText(""+TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoActivoFijoEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoActivoFijoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoActivoFijoEmpresa.setToolTipText(TipoActivoFijoEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoActivoFijoEmpresa = new GridBagLayout();
		this.jPanelcodigoTipoActivoFijoEmpresa.setLayout(this.gridaBagLayoutTipoActivoFijoEmpresa);


		jTextFieldcodigoTipoActivoFijoEmpresa= new JTextFieldMe();

		jTextFieldcodigoTipoActivoFijoEmpresa.setEnabled(false);
		jTextFieldcodigoTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setText("U");
		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoActivoFijoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoActivoFijoEmpresaBusqueda"));

		if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoActivoFijoEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoActivoFijoEmpresa = new JLabelMe();
		this.jLabelnombreTipoActivoFijoEmpresa.setText(""+TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoActivoFijoEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoActivoFijoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoActivoFijoEmpresa.setToolTipText(TipoActivoFijoEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoActivoFijoEmpresa = new GridBagLayout();
		this.jPanelnombreTipoActivoFijoEmpresa.setLayout(this.gridaBagLayoutTipoActivoFijoEmpresa);


		jTextAreanombreTipoActivoFijoEmpresa= new JTextAreaMe();
		jTextAreanombreTipoActivoFijoEmpresa.setEnabled(false);
		jTextAreanombreTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoActivoFijoEmpresa.setLineWrap(true);
		jTextAreanombreTipoActivoFijoEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoActivoFijoEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoActivoFijoEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoActivoFijoEmpresa = new JScrollPane(jTextAreanombreTipoActivoFijoEmpresa);
		jscrollPanenombreTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoActivoFijoEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoActivoFijoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoActivoFijoEmpresaBusqueda"));

		if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoActivoFijoEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoActivoFijoEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoActivoFijoEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoActivoFijoEmpresa.setText(""+TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoActivoFijoEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoActivoFijoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoActivoFijoEmpresa.setToolTipText(TipoActivoFijoEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoActivoFijoEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoActivoFijoEmpresa.setLayout(this.gridaBagLayoutTipoActivoFijoEmpresa);


		jComboBoxid_empresaTipoActivoFijoEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoActivoFijoEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoActivoFijoEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoActivoFijoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoActivoFijoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoActivoFijoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoActivoFijoEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoActivoFijoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoActivoFijoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoActivoFijoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoActivoFijoEmpresa"));

		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoActivoFijoEmpresaBusqueda"));

		if(this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoActivoFijoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoActivoFijoEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoActivoFijoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoActivoFijoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoActivoFijoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoActivoFijoEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoActivoFijoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoActivoFijoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoActivoFijoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoActivoFijoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoActivoFijoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoActivoFijoEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoActivoFijoEmpresa = new TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Activo Fijo Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoActivoFijoEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoActivoFijoEmpresa="";
		sToolTipTipoActivoFijoEmpresa=TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoActivoFijoEmpresa+="(ActivosFijos.TipoActivoFijoEmpresa)";
		}
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoActivoFijoEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonModificarTipoActivoFijoEmpresa = new JButtonMe();
        this.jButtonActualizarTipoActivoFijoEmpresa = new JButtonMe();
        this.jButtonEliminarTipoActivoFijoEmpresa = new JButtonMe();
        this.jButtonCancelarTipoActivoFijoEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa = new JButtonMe();
		this.jButtonCerrarTipoActivoFijoEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoActivoFijoEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Activo Fijo Empresa";
		
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijo Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoActivoFijoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoActivoFijoEmpresa.setName("jPanelCamposTipoActivoFijoEmpresa"); 

		this.jPanelCamposOcultosTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoActivoFijoEmpresa.setName("jPanelCamposOcultosTipoActivoFijoEmpresa"); 

        this.jPanelAccionesTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoActivoFijoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoActivoFijoEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoActivoFijoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoActivoFijoEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoActivoFijoEmpresa.setText("Nuevo");
		this.jButtonModificarTipoActivoFijoEmpresa.setText("Editar");
        this.jButtonActualizarTipoActivoFijoEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoActivoFijoEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoActivoFijoEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoActivoFijoEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.setText("Guardar");
		this.jButtonCerrarTipoActivoFijoEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoActivoFijoEmpresa,"nuevo_button","Nuevo",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoActivoFijoEmpresa,"modificar_button","Editar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoActivoFijoEmpresa,"actualizar_button","Actualizar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoActivoFijoEmpresa,"eliminar_button","Eliminar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoActivoFijoEmpresa,"cancelar_button","Cancelar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoActivoFijoEmpresa,"guardarcambios_button","Guardar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa,"guardarcambiostabla_button","Guardar",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoActivoFijoEmpresa,"cerrar_button","Salir",this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoActivoFijoEmpresa.setToolTipText("Nuevo"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoActivoFijoEmpresa.setToolTipText("Editar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoActivoFijoEmpresa.setToolTipText("Actualizar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoActivoFijoEmpresa.setToolTipText("Eliminar)"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoActivoFijoEmpresa.setToolTipText("Cancelar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoActivoFijoEmpresa.setToolTipText("Guardar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.setToolTipText("Guardar"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoActivoFijoEmpresa.setToolTipText("Salir"+" "+TipoActivoFijoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoActivoFijoEmpresa";
		inputMap = this.jButtonNuevoTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoActivoFijoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoActivoFijoEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoActivoFijoEmpresa";
		inputMap = this.jButtonActualizarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoActivoFijoEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoActivoFijoEmpresa";
		inputMap = this.jButtonEliminarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoActivoFijoEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoActivoFijoEmpresa";
		inputMap = this.jButtonCancelarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoActivoFijoEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoActivoFijoEmpresa";
		inputMap = this.jButtonCerrarTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoActivoFijoEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoActivoFijoEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoActivoFijoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoActivoFijoEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa.setToolTipText("Nuevo TipoActivoFijoEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa.setToolTipText("Sin Cerrar Ventana TipoActivoFijoEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoActivoFijoEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoActivoFijoEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoActivoFijoEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoActivoFijoEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoActivoFijoEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoActivoFijoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoActivoFijoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoActivoFijoEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoActivoFijoEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoActivoFijoEmpresa.setLayout(gridaBagLayoutCamposTipoActivoFijoEmpresa);
		this.jPanelCamposOcultosTipoActivoFijoEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoActivoFijoEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoActivoFijoEmpresa.add(jLabelIdTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoActivoFijoEmpresa.add(jLabelidTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);


	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoActivoFijoEmpresa.add(jLabelid_empresaTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoActivoFijoEmpresa.add(jButtonid_empresaTipoActivoFijoEmpresaBusqueda, this.gridBagConstraintsTipoActivoFijoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 3;
		this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoActivoFijoEmpresa.add(jButtonid_empresaTipoActivoFijoEmpresaUpdate, this.gridBagConstraintsTipoActivoFijoEmpresa);
	}

	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoActivoFijoEmpresa.add(jComboBoxid_empresaTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);


	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoActivoFijoEmpresa.add(jLabelcodigoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoActivoFijoEmpresa.add(jButtoncodigoTipoActivoFijoEmpresaBusqueda, this.gridBagConstraintsTipoActivoFijoEmpresa);
	}

	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoActivoFijoEmpresa.add(jTextFieldcodigoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);


	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoActivoFijoEmpresa.add(jLabelnombreTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoActivoFijoEmpresa.add(jButtonnombreTipoActivoFijoEmpresaBusqueda, this.gridBagConstraintsTipoActivoFijoEmpresa);
	}

	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoActivoFijoEmpresa.add(jscrollPanenombreTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iYPanelCamposTipoActivoFijoEmpresa;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iXPanelCamposTipoActivoFijoEmpresa++;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoActivoFijoEmpresa.add(this.jPanelidTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(iXPanelCamposTipoActivoFijoEmpresa % 1==0) {
		iXPanelCamposTipoActivoFijoEmpresa=0;
		iYPanelCamposTipoActivoFijoEmpresa++;
	}
	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iYPanelCamposTipoActivoFijoEmpresa;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iXPanelCamposTipoActivoFijoEmpresa++;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoActivoFijoEmpresa.add(this.jPanelcodigoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(iXPanelCamposTipoActivoFijoEmpresa % 1==0) {
		iXPanelCamposTipoActivoFijoEmpresa=0;
		iYPanelCamposTipoActivoFijoEmpresa++;
	}
	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iYPanelCamposTipoActivoFijoEmpresa;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iXPanelCamposTipoActivoFijoEmpresa++;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoActivoFijoEmpresa.add(this.jPanelnombreTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(iXPanelCamposTipoActivoFijoEmpresa % 1==0) {
		iXPanelCamposTipoActivoFijoEmpresa=0;
		iYPanelCamposTipoActivoFijoEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iYPanelCamposOcultosTipoActivoFijoEmpresa;
	this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iXPanelCamposOcultosTipoActivoFijoEmpresa++;
	this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoActivoFijoEmpresa.add(this.jPanelid_empresaTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);



	if(iXPanelCamposOcultosTipoActivoFijoEmpresa % 1==0) {
		iXPanelCamposOcultosTipoActivoFijoEmpresa=0;
		iYPanelCamposOcultosTipoActivoFijoEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoActivoFijoEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoActivoFijoEmpresa.setLayout(gridaBagLayoutAccionesTipoActivoFijoEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoActivoFijoEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoActivoFijoEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoActivoFijoEmpresa);
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoActivoFijoEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoActivoFijoEmpresa.add(this.jCheckBoxPostAccionNuevoTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoActivoFijoEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoactivofijoempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoActivoFijoEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoActivoFijoEmpresa.add(this.jButtonModificarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);							

		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoActivoFijoEmpresa.add(this.jButtonEliminarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
			
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoActivoFijoEmpresa.add(this.jButtonActualizarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);


		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoActivoFijoEmpresa.add(this.jButtonGuardarCambiosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);	
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoActivoFijoEmpresa.add(this.jButtonCancelarTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoActivoFijoEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoActivoFijoEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoactivofijoempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoActivoFijoEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoActivoFijoEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =0;
		this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoActivoFijoEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoActivoFijoEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoActivoFijoEmpresa = new TipoActivoFijoEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Activo Fijo Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Activo Fijo Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Activo Fijo Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoActivoFijoEmpresaModel tipoactivofijoempresaModel=new TipoActivoFijoEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoActivoFijoEmpresaModel.TipoActivoFijoEmpresaFocusTraversalPolicy tipoactivofijoempresaFocusTraversalPolicy = tipoactivofijoempresaModel.new TipoActivoFijoEmpresaFocusTraversalPolicy(this);
			
			//tipoactivofijoempresaFocusTraversalPolicy.settipoactivofijoempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoactivofijoempresaModel);
			
			
			this.jContentPaneDetalleTipoActivoFijoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoActivoFijoEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoActivoFijoEmpresa.setLayout(gridaBagLayoutDetalleTipoActivoFijoEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoActivoFijoEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoActivoFijoEmpresa.add(jTtoolBarDetalleTipoActivoFijoEmpresa, gridBagConstraintsTipoActivoFijoEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa=   new JScrollPane(jContentPaneDetalleTipoActivoFijoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoActivoFijoEmpresa.add(jPanelCamposTipoActivoFijoEmpresa, gridBagConstraintsTipoActivoFijoEmpresa);
			
			
			
			
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
						&& tipoactivofijoempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoactivofijoempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoActivoFijoEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoActivoFijoEmpresa.add(this.jTabbedPaneRelacionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoActivoFijoEmpresa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoActivoFijoEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoActivoFijoEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoActivoFijoEmpresa.add(jPanelCamposOcultosTipoActivoFijoEmpresa, gridBagConstraintsTipoActivoFijoEmpresa);
				
					this.jPanelCamposOcultosTipoActivoFijoEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoActivoFijoEmpresa.add(this.jPanelAccionesFormularioTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);							
			
			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoActivoFijoEmpresa.add(this.jPanelAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoActivoFijoEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa=   new JScrollPane(this.jPanelCamposTipoActivoFijoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
			this.gridBagConstraintsTipoActivoFijoEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoActivoFijoEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoActivoFijoEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);			
			
			this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
			
			
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		
			
		this.gridBagConstraintsTipoActivoFijoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijoEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoActivoFijoEmpresa, this.gridBagConstraintsTipoActivoFijoEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoActivoFijoEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoActivoFijoEmpresa;
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
