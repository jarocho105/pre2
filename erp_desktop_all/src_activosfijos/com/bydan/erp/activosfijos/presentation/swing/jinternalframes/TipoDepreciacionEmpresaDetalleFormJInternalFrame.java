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
import com.bydan.erp.activosfijos.util.TipoDepreciacionEmpresaConstantesFunciones;

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
public class TipoDepreciacionEmpresaDetalleFormJInternalFrame extends TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDepreciacionEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoDepreciacionEmpresa;
	
	protected JMenu jmenuDetalleTipoDepreciacionEmpresa;
	protected JMenu jmenuDetalleArchivoTipoDepreciacionEmpresa;
	protected JMenu jmenuDetalleAccionesTipoDepreciacionEmpresa;
	protected JMenu jmenuDetalleDatosTipoDepreciacionEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDepreciacionEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoDepreciacionEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDepreciacionEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean;
	
	

	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleActivoFijo=false;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;

	public DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame=null;
	public DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDepreciacionActivoFijo=false;
	public DepreciacionActivoFijoSessionBean depreciacionactivofijoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoDepreciacionEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoDepreciacionEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoDepreciacionEmpresa;
	
	protected JPanel jPanelCamposTipoDepreciacionEmpresa;    
	protected JPanel jPanelCamposOcultosTipoDepreciacionEmpresa;    	
	protected JPanel jPanelAccionesTipoDepreciacionEmpresa;
	protected JPanel jPanelAccionesFormularioTipoDepreciacionEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoDepreciacionEmpresa=0;
	protected Integer iYPanelCamposTipoDepreciacionEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoDepreciacionEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoDepreciacionEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDepreciacionEmpresa;
	public JButton jButtonModificarTipoDepreciacionEmpresa;
	public JButton jButtonActualizarTipoDepreciacionEmpresa;
    public JButton jButtonEliminarTipoDepreciacionEmpresa;
	public JButton jButtonCancelarTipoDepreciacionEmpresa;
    public JButton jButtonGuardarCambiosTipoDepreciacionEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoDepreciacionEmpresa;
	protected JButton jButtonCerrarTipoDepreciacionEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoDepreciacionEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonModificarToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonActualizarToolBarTipoDepreciacionEmpresa;
    protected JButton jButtonEliminarToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonCancelarToolBarTipoDepreciacionEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDepreciacionEmpresa;
	protected JButton jButtonCerrarToolBarTipoDepreciacionEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDepreciacionEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemModificarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemActualizarTipoDepreciacionEmpresa;
    protected JMenuItem jMenuItemEliminarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemCancelarTipoDepreciacionEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemCerrarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoDepreciacionEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDepreciacionEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDepreciacionEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDepreciacionEmpresa;
	public JLabel jLabelIdTipoDepreciacionEmpresa;
	public JLabel jLabelidTipoDepreciacionEmpresa;
	public JButton jButtonidTipoDepreciacionEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDepreciacionEmpresa;
	public JLabel jLabelcodigoTipoDepreciacionEmpresa;
	public JTextField jTextFieldcodigoTipoDepreciacionEmpresa;
	public JButton jButtoncodigoTipoDepreciacionEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDepreciacionEmpresa;
	public JLabel jLabelnombreTipoDepreciacionEmpresa;
	public JTextArea jTextAreanombreTipoDepreciacionEmpresa;
	public JScrollPane jscrollPanenombreTipoDepreciacionEmpresa;
	public JButton jButtonnombreTipoDepreciacionEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneles_linea_rectaTipoDepreciacionEmpresa;
	public JLabel jLabeles_linea_rectaTipoDepreciacionEmpresa;
	public JCheckBox jCheckBoxes_linea_rectaTipoDepreciacionEmpresa;
	public JButton jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneles_mensualTipoDepreciacionEmpresa;
	public JLabel jLabeles_mensualTipoDepreciacionEmpresa;
	public JCheckBox jCheckBoxes_mensualTipoDepreciacionEmpresa;
	public JButton jButtones_mensualTipoDepreciacionEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDepreciacionEmpresa;
	public JLabel jLabelid_empresaTipoDepreciacionEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDepreciacionEmpresa;
	public JButton jButtonid_empresaTipoDepreciacionEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoDepreciacionEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDepreciacionEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDepreciacionEmpresa;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDepreciacionEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoDepreciacionEmpresa=new JPanel();
				this.jmenuBarDetalleTipoDepreciacionEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoDepreciacionEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDepreciacionEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDepreciacionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDepreciacionEmpresa() {
		return this.jButtonActualizarToolBarTipoDepreciacionEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoDepreciacionEmpresa() {
		return this.jButtonEliminarToolBarTipoDepreciacionEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoDepreciacionEmpresa() {
		return this.jButtonCancelarToolBarTipoDepreciacionEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDepreciacionEmpresa() {
		return this.jButtonProcesarInformacionTipoDepreciacionEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDepreciacionEmpresa)	{
		this.jButtonProcesarInformacionTipoDepreciacionEmpresa = jButtonProcesarInformacionTipoDepreciacionEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposAccionesTipoDepreciacionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa = jComboBoxTiposRelacionesTipoDepreciacionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposAccionesTipoDepreciacionEmpresa) {
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa = jComboBoxTiposAccionesTipoDepreciacionEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa = jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
		
		this.tipodepreciacionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodepreciacionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		//this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDepreciacionEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Depreciacion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDepreciacionEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDepreciacionEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDepreciacionEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoDepreciacionEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDepreciacionEmpresa,this.jTtoolBarDetalleTipoDepreciacionEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDepreciacionEmpresa,this.jTtoolBarDetalleTipoDepreciacionEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDepreciacionEmpresa,this.jTtoolBarDetalleTipoDepreciacionEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa,this.jTtoolBarDetalleTipoDepreciacionEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDepreciacionEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDepreciacionEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDepreciacionEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDepreciacionEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDepreciacionEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDepreciacionEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDepreciacionEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDepreciacionEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDepreciacionEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDepreciacionEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDepreciacionEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDepreciacionEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDepreciacionEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDepreciacionEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDepreciacionEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDepreciacionEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDepreciacionEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDepreciacionEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDepreciacionEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDepreciacionEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDepreciacionEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDepreciacionEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDepreciacionEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDepreciacionEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDepreciacionEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDepreciacionEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDepreciacionEmpresa.add(this.jMenuItemDetalleCerrarTipoDepreciacionEmpresa);
		
		this.jmenuDetalleAccionesTipoDepreciacionEmpresa.add(this.jMenuItemActualizarTipoDepreciacionEmpresa);
		this.jmenuDetalleAccionesTipoDepreciacionEmpresa.add(this.jMenuItemEliminarTipoDepreciacionEmpresa);
		this.jmenuDetalleAccionesTipoDepreciacionEmpresa.add(this.jMenuItemCancelarTipoDepreciacionEmpresa);		
		
		//this.jmenuDetalleDatosTipoDepreciacionEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa);				
		this.jmenuDetalleDatosTipoDepreciacionEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa);				
				
		//this.jmenuDetalleAccionesTipoDepreciacionEmpresa.add(this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDepreciacionEmpresa.add(this.jmenuDetalleArchivoTipoDepreciacionEmpresa);		
		this.jmenuBarDetalleTipoDepreciacionEmpresa.add(this.jmenuDetalleAccionesTipoDepreciacionEmpresa);		
		this.jmenuBarDetalleTipoDepreciacionEmpresa.add(this.jmenuDetalleDatosTipoDepreciacionEmpresa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDepreciacionEmpresa.add(this.jmenuDetalleTipoDepreciacionEmpresa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDepreciacionEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoDepreciacionEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDepreciacionEmpresa = new JLabelMe();
		jLabelIdTipoDepreciacionEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDepreciacionEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDepreciacionEmpresa.setToolTipText(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDepreciacionEmpresa= new GridBagLayout();

		this.jPanelidTipoDepreciacionEmpresa.setLayout(this.gridaBagLayoutTipoDepreciacionEmpresa);

		jLabelidTipoDepreciacionEmpresa = new JLabel();
		jLabelidTipoDepreciacionEmpresa.setText("Id");

		jLabelidTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDepreciacionEmpresa = new JLabelMe();
		this.jLabelcodigoTipoDepreciacionEmpresa.setText(""+TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDepreciacionEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDepreciacionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDepreciacionEmpresa.setToolTipText(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		this.jPanelcodigoTipoDepreciacionEmpresa.setLayout(this.gridaBagLayoutTipoDepreciacionEmpresa);


		jTextFieldcodigoTipoDepreciacionEmpresa= new JTextFieldMe();

		jTextFieldcodigoTipoDepreciacionEmpresa.setEnabled(false);
		jTextFieldcodigoTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setText("U");
		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDepreciacionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDepreciacionEmpresaBusqueda"));

		if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDepreciacionEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDepreciacionEmpresa = new JLabelMe();
		this.jLabelnombreTipoDepreciacionEmpresa.setText(""+TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDepreciacionEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDepreciacionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDepreciacionEmpresa.setToolTipText(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		this.jPanelnombreTipoDepreciacionEmpresa.setLayout(this.gridaBagLayoutTipoDepreciacionEmpresa);


		jTextAreanombreTipoDepreciacionEmpresa= new JTextAreaMe();
		jTextAreanombreTipoDepreciacionEmpresa.setEnabled(false);
		jTextAreanombreTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDepreciacionEmpresa.setLineWrap(true);
		jTextAreanombreTipoDepreciacionEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoDepreciacionEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDepreciacionEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDepreciacionEmpresa = new JScrollPane(jTextAreanombreTipoDepreciacionEmpresa);
		jscrollPanenombreTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoDepreciacionEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDepreciacionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDepreciacionEmpresaBusqueda"));

		if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDepreciacionEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeles_linea_rectaTipoDepreciacionEmpresa = new JLabelMe();
		this.jLabeles_linea_rectaTipoDepreciacionEmpresa.setText(""+TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA+" : *");
		this.jLabeles_linea_rectaTipoDepreciacionEmpresa.setToolTipText("Es Linea Recta");
		this.jLabeles_linea_rectaTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_linea_rectaTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_linea_rectaTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_linea_rectaTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_linea_rectaTipoDepreciacionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_linea_rectaTipoDepreciacionEmpresa.setToolTipText(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA);
		this.gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		this.jPaneles_linea_rectaTipoDepreciacionEmpresa.setLayout(this.gridaBagLayoutTipoDepreciacionEmpresa);


		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa= new JCheckBoxMe();
		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setEnabled(false);

		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_linea_rectaTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda= new JButtonMe();
		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setText("U");
		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_linea_rectaTipoDepreciacionEmpresaBusqueda"));

		if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeles_mensualTipoDepreciacionEmpresa = new JLabelMe();
		this.jLabeles_mensualTipoDepreciacionEmpresa.setText(""+TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL+" : *");
		this.jLabeles_mensualTipoDepreciacionEmpresa.setToolTipText("Es Mensual");
		this.jLabeles_mensualTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mensualTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_mensualTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_mensualTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_mensualTipoDepreciacionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_mensualTipoDepreciacionEmpresa.setToolTipText(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL);
		this.gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		this.jPaneles_mensualTipoDepreciacionEmpresa.setLayout(this.gridaBagLayoutTipoDepreciacionEmpresa);


		jCheckBoxes_mensualTipoDepreciacionEmpresa= new JCheckBoxMe();
		jCheckBoxes_mensualTipoDepreciacionEmpresa.setEnabled(false);

		jCheckBoxes_mensualTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mensualTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_mensualTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_mensualTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda= new JButtonMe();
		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setText("U");
		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_mensualTipoDepreciacionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_mensualTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_mensualTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_mensualTipoDepreciacionEmpresaBusqueda"));

		if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_mensualTipoDepreciacionEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDepreciacionEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDepreciacionEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoDepreciacionEmpresa.setText(""+TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDepreciacionEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDepreciacionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDepreciacionEmpresa.setToolTipText(TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoDepreciacionEmpresa.setLayout(this.gridaBagLayoutTipoDepreciacionEmpresa);


		jComboBoxid_empresaTipoDepreciacionEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDepreciacionEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoDepreciacionEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoDepreciacionEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDepreciacionEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDepreciacionEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDepreciacionEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoDepreciacionEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDepreciacionEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDepreciacionEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDepreciacionEmpresa"));

		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDepreciacionEmpresaBusqueda"));

		if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDepreciacionEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDepreciacionEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDepreciacionEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDepreciacionEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDepreciacionEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoDepreciacionEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDepreciacionEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDepreciacionEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDepreciacionEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoDepreciacionEmpresa = new TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Depreciacion Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDepreciacionEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoDepreciacionEmpresa="";
		sToolTipTipoDepreciacionEmpresa=TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDepreciacionEmpresa+="(ActivosFijos.TipoDepreciacionEmpresa)";
		}
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDepreciacionEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonModificarTipoDepreciacionEmpresa = new JButtonMe();
        this.jButtonActualizarTipoDepreciacionEmpresa = new JButtonMe();
        this.jButtonEliminarTipoDepreciacionEmpresa = new JButtonMe();
        this.jButtonCancelarTipoDepreciacionEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa = new JButtonMe();
		this.jButtonCerrarTipoDepreciacionEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoDepreciacionEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Depreciacion Empresa";
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Depreciacion Empresaes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDepreciacionEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDepreciacionEmpresa.setName("jPanelCamposTipoDepreciacionEmpresa"); 

		this.jPanelCamposOcultosTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDepreciacionEmpresa.setName("jPanelCamposOcultosTipoDepreciacionEmpresa"); 

        this.jPanelAccionesTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDepreciacionEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoDepreciacionEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDepreciacionEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDepreciacionEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDepreciacionEmpresa.setText("Nuevo");
		this.jButtonModificarTipoDepreciacionEmpresa.setText("Editar");
        this.jButtonActualizarTipoDepreciacionEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoDepreciacionEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoDepreciacionEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDepreciacionEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.setText("Guardar");
		this.jButtonCerrarTipoDepreciacionEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDepreciacionEmpresa,"nuevo_button","Nuevo",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDepreciacionEmpresa,"modificar_button","Editar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDepreciacionEmpresa,"actualizar_button","Actualizar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDepreciacionEmpresa,"eliminar_button","Eliminar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDepreciacionEmpresa,"cancelar_button","Cancelar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDepreciacionEmpresa,"guardarcambios_button","Guardar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa,"guardarcambiostabla_button","Guardar",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDepreciacionEmpresa,"cerrar_button","Salir",this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDepreciacionEmpresa.setToolTipText("Nuevo"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDepreciacionEmpresa.setToolTipText("Editar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDepreciacionEmpresa.setToolTipText("Actualizar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDepreciacionEmpresa.setToolTipText("Eliminar)"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDepreciacionEmpresa.setToolTipText("Cancelar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDepreciacionEmpresa.setToolTipText("Guardar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.setToolTipText("Guardar"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDepreciacionEmpresa.setToolTipText("Salir"+" "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDepreciacionEmpresa";
		inputMap = this.jButtonNuevoTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDepreciacionEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDepreciacionEmpresa";
		inputMap = this.jButtonActualizarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDepreciacionEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDepreciacionEmpresa";
		inputMap = this.jButtonEliminarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDepreciacionEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDepreciacionEmpresa";
		inputMap = this.jButtonCancelarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDepreciacionEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDepreciacionEmpresa";
		inputMap = this.jButtonCerrarTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDepreciacionEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDepreciacionEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDepreciacionEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa.setToolTipText("Nuevo TipoDepreciacionEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa.setToolTipText("Sin Cerrar Ventana TipoDepreciacionEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDepreciacionEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoDepreciacionEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDepreciacionEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDepreciacionEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDepreciacionEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDepreciacionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDepreciacionEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDepreciacionEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoDepreciacionEmpresa.setLayout(gridaBagLayoutCamposTipoDepreciacionEmpresa);
		this.jPanelCamposOcultosTipoDepreciacionEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoDepreciacionEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDepreciacionEmpresa.add(jLabelIdTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDepreciacionEmpresa.add(jLabelidTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDepreciacionEmpresa.add(jLabelid_empresaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDepreciacionEmpresa.add(jButtonid_empresaTipoDepreciacionEmpresaBusqueda, this.gridBagConstraintsTipoDepreciacionEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 3;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDepreciacionEmpresa.add(jButtonid_empresaTipoDepreciacionEmpresaUpdate, this.gridBagConstraintsTipoDepreciacionEmpresa);
	}

	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDepreciacionEmpresa.add(jComboBoxid_empresaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDepreciacionEmpresa.add(jLabelcodigoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDepreciacionEmpresa.add(jButtoncodigoTipoDepreciacionEmpresaBusqueda, this.gridBagConstraintsTipoDepreciacionEmpresa);
	}

	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDepreciacionEmpresa.add(jTextFieldcodigoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDepreciacionEmpresa.add(jLabelnombreTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDepreciacionEmpresa.add(jButtonnombreTipoDepreciacionEmpresaBusqueda, this.gridBagConstraintsTipoDepreciacionEmpresa);
	}

	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDepreciacionEmpresa.add(jscrollPanenombreTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_linea_rectaTipoDepreciacionEmpresa.add(jLabeles_linea_rectaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_linea_rectaTipoDepreciacionEmpresa.add(jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda, this.gridBagConstraintsTipoDepreciacionEmpresa);
	}

	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_linea_rectaTipoDepreciacionEmpresa.add(jCheckBoxes_linea_rectaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_mensualTipoDepreciacionEmpresa.add(jLabeles_mensualTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_mensualTipoDepreciacionEmpresa.add(jButtones_mensualTipoDepreciacionEmpresaBusqueda, this.gridBagConstraintsTipoDepreciacionEmpresa);
	}

	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_mensualTipoDepreciacionEmpresa.add(jCheckBoxes_mensualTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iYPanelCamposTipoDepreciacionEmpresa;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iXPanelCamposTipoDepreciacionEmpresa++;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDepreciacionEmpresa.add(this.jPanelidTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(iXPanelCamposTipoDepreciacionEmpresa % 1==0) {
		iXPanelCamposTipoDepreciacionEmpresa=0;
		iYPanelCamposTipoDepreciacionEmpresa++;
	}
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iYPanelCamposTipoDepreciacionEmpresa;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iXPanelCamposTipoDepreciacionEmpresa++;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDepreciacionEmpresa.add(this.jPanelcodigoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(iXPanelCamposTipoDepreciacionEmpresa % 1==0) {
		iXPanelCamposTipoDepreciacionEmpresa=0;
		iYPanelCamposTipoDepreciacionEmpresa++;
	}
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iYPanelCamposTipoDepreciacionEmpresa;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iXPanelCamposTipoDepreciacionEmpresa++;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDepreciacionEmpresa.add(this.jPanelnombreTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(iXPanelCamposTipoDepreciacionEmpresa % 1==0) {
		iXPanelCamposTipoDepreciacionEmpresa=0;
		iYPanelCamposTipoDepreciacionEmpresa++;
	}
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iYPanelCamposTipoDepreciacionEmpresa;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iXPanelCamposTipoDepreciacionEmpresa++;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDepreciacionEmpresa.add(this.jPaneles_linea_rectaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(iXPanelCamposTipoDepreciacionEmpresa % 1==0) {
		iXPanelCamposTipoDepreciacionEmpresa=0;
		iYPanelCamposTipoDepreciacionEmpresa++;
	}
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iYPanelCamposTipoDepreciacionEmpresa;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iXPanelCamposTipoDepreciacionEmpresa++;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDepreciacionEmpresa.add(this.jPaneles_mensualTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(iXPanelCamposTipoDepreciacionEmpresa % 1==0) {
		iXPanelCamposTipoDepreciacionEmpresa=0;
		iYPanelCamposTipoDepreciacionEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iYPanelCamposOcultosTipoDepreciacionEmpresa;
	this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iXPanelCamposOcultosTipoDepreciacionEmpresa++;
	this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDepreciacionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDepreciacionEmpresa.add(this.jPanelid_empresaTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);



	if(iXPanelCamposOcultosTipoDepreciacionEmpresa % 1==0) {
		iXPanelCamposOcultosTipoDepreciacionEmpresa=0;
		iYPanelCamposOcultosTipoDepreciacionEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDepreciacionEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoDepreciacionEmpresa.setLayout(gridaBagLayoutAccionesTipoDepreciacionEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDepreciacionEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDepreciacionEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoDepreciacionEmpresa);
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDepreciacionEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDepreciacionEmpresa.add(this.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDepreciacionEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDepreciacionEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDepreciacionEmpresa.add(this.jButtonModificarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);							

		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDepreciacionEmpresa.add(this.jButtonEliminarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
			
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDepreciacionEmpresa.add(this.jButtonActualizarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);


		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDepreciacionEmpresa.add(this.jButtonGuardarCambiosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);	
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDepreciacionEmpresa.add(this.jButtonCancelarTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDepreciacionEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDepreciacionEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoDepreciacionEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDepreciacionEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =0;
		this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDepreciacionEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDepreciacionEmpresa = new TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Depreciacion Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Depreciacion Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Depreciacion Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDepreciacionEmpresaModel tipodepreciacionempresaModel=new TipoDepreciacionEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDepreciacionEmpresaModel.TipoDepreciacionEmpresaFocusTraversalPolicy tipodepreciacionempresaFocusTraversalPolicy = tipodepreciacionempresaModel.new TipoDepreciacionEmpresaFocusTraversalPolicy(this);
			
			//tipodepreciacionempresaFocusTraversalPolicy.settipodepreciacionempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodepreciacionempresaModel);
			
			
			this.jContentPaneDetalleTipoDepreciacionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDepreciacionEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoDepreciacionEmpresa.setLayout(gridaBagLayoutDetalleTipoDepreciacionEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDepreciacionEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDepreciacionEmpresa.add(jTtoolBarDetalleTipoDepreciacionEmpresa, gridBagConstraintsTipoDepreciacionEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa=   new JScrollPane(jContentPaneDetalleTipoDepreciacionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoDepreciacionEmpresa.add(jPanelCamposTipoDepreciacionEmpresa, gridBagConstraintsTipoDepreciacionEmpresa);
			
			
			
			
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
						&& tipodepreciacionempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(this.puedeCargarPorParteDepreciacionActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(this.puedeCargarPorParteDetalleActivoFijo,false,-1);
					
					if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDepreciacionEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoDepreciacionEmpresa.add(this.jTabbedPaneRelacionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDepreciacionEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoDepreciacionEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDepreciacionEmpresa.add(jPanelCamposOcultosTipoDepreciacionEmpresa, gridBagConstraintsTipoDepreciacionEmpresa);
				
					this.jPanelCamposOcultosTipoDepreciacionEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDepreciacionEmpresa.add(this.jPanelAccionesFormularioTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);							
			
			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDepreciacionEmpresa.add(this.jPanelAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDepreciacionEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa=   new JScrollPane(this.jPanelCamposTipoDepreciacionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
			this.gridBagConstraintsTipoDepreciacionEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDepreciacionEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDepreciacionEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);			
			
			this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
			
			
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		
			
		this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDepreciacionEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDepreciacionEmpresa, this.gridBagConstraintsTipoDepreciacionEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDepreciacionEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDepreciacionEmpresa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
		this.depreciacionactivofijoSessionBean.setConGuardarRelaciones(false);
		this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.depreciacionactivofijoBeanSwingJInternalFrame=null;//new DepreciacionActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.depreciacionactivofijoBeanSwingJInternalFramePopup=new DepreciacionActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.depreciacionactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {

				DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DepreciacionActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.depreciacionactivofijoBeanSwingJInternalFrame=new DepreciacionActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.depreciacionactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.depreciacionactivofijoBeanSwingJInternalFrame.setdepreciacionactivofijoSessionBean(this.depreciacionactivofijoSessionBean);

				//this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoDepreciacionEmpresa.add(this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDepreciacionEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.add("Depreciacion Activo Fijos",this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setComponentAt(iIndexTab,this.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.depreciacionactivofijoBeanSwingJInternalFrame=null;//new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.depreciacionactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDepreciacionActivoFijo) {
					this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.add("Depreciacion Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {

				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDepreciacionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleactivofijoBeanSwingJInternalFrame.setdetalleactivofijoSessionBean(this.detalleactivofijoSessionBean);

				//this.gridBagConstraintsTipoDepreciacionEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoDepreciacionEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDepreciacionEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoDepreciacionEmpresa.add(this.detalleactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDepreciacionEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.add("Detalle Activo Fijos",this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setComponentAt(iIndexTab,this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleActivoFijo) {
					this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.add("Detalle Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleActivoFijoBeanSwingJInternalFrame(List<TipoDepreciacionEmpresa> tipodepreciacionempresas,TipoDepreciacionEmpresa tipodepreciacionempresa,DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.tipodepreciacionempresaLogic.getConnexion());

					detalleactivofijoBeanSwingJInternalFrame.settipodepreciacionempresasForeignKey(tipodepreciacionempresas);
					detalleactivofijoBeanSwingJInternalFrame.settipodepreciacionempresaForeignKey(tipodepreciacionempresa);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa(true);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setlidTipoDepreciacionEmpresaActual(tipodepreciacionempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDepreciacionEmpresa(true);
					detalleactivofijoBeanSwingJInternalFrame.setid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa(tipodepreciacionempresa.getId());

					if(!this.conCargarFormDetalle) {
						detalleactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoDepreciacionEmpresaForeignKey(tipodepreciacionempresa,1,false,true,true);
					detalleactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDepreciacionEmpresa");
					detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDepreciacionEmpresa");
					detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleActivoFijo("n",detalleactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("relacionado");
					} else {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");
					}

					detalleactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDepreciacionActivoFijoBeanSwingJInternalFrame(List<TipoDepreciacionEmpresa> tipodepreciacionempresas,TipoDepreciacionEmpresa tipodepreciacionempresa,DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//depreciacionactivofijoBeanSwingJInternalFrame=new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					depreciacionactivofijoBeanSwingJInternalFrame.getDepreciacionActivoFijoLogic().setConnexion(this.tipodepreciacionempresaLogic.getConnexion());

					depreciacionactivofijoBeanSwingJInternalFrame.settipodepreciacionempresasForeignKey(tipodepreciacionempresas);
					depreciacionactivofijoBeanSwingJInternalFrame.settipodepreciacionempresaForeignKey(tipodepreciacionempresa);
					depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa(true);
					depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setlidTipoDepreciacionEmpresaActual(tipodepreciacionempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					depreciacionactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDepreciacionActivoFijo(depreciacionactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					depreciacionactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDepreciacionEmpresa(true);
					depreciacionactivofijoBeanSwingJInternalFrame.setid_tipo_depreciacion_empresaFK_IdTipoDepreciacionEmpresa(tipodepreciacionempresa.getId());

					if(!this.conCargarFormDetalle) {
						depreciacionactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					depreciacionactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoDepreciacionEmpresaForeignKey(tipodepreciacionempresa,1,false,true,true);
					depreciacionactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					depreciacionactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDepreciacionEmpresa");
					depreciacionactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDepreciacionEmpresa");
					depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(true);
					depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDepreciacionActivoFijo("n",depreciacionactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, depreciacionactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					depreciacionactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					depreciacionactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("relacionado");
					} else {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("no_relacionado");
					}

					depreciacionactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDepreciacionActivoFijo().setVisible(false);

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
