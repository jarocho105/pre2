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
import com.bydan.erp.activosfijos.util.TipoRamoActivoFijoConstantesFunciones;

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
public class TipoRamoActivoFijoDetalleFormJInternalFrame extends TipoRamoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRamoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleTipoRamoActivoFijo;
	
	protected JMenu jmenuDetalleTipoRamoActivoFijo;
	protected JMenu jmenuDetalleArchivoTipoRamoActivoFijo;
	protected JMenu jmenuDetalleAccionesTipoRamoActivoFijo;
	protected JMenu jmenuDetalleDatosTipoRamoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRamoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoRamoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRamoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRamoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRamoActivoFijoSessionBean tiporamoactivofijoSessionBean;
	
	

	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleActivoFijo=false;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoRamoActivoFijoLogic tiporamoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosTipoRamoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoRamoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoRamoActivoFijo;
	
	protected JPanel jPanelCamposTipoRamoActivoFijo;    
	protected JPanel jPanelCamposOcultosTipoRamoActivoFijo;    	
	protected JPanel jPanelAccionesTipoRamoActivoFijo;
	protected JPanel jPanelAccionesFormularioTipoRamoActivoFijo;
    
	
	
	protected Integer iXPanelCamposTipoRamoActivoFijo=0;
	protected Integer iYPanelCamposTipoRamoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosTipoRamoActivoFijo=0;
	protected Integer iYPanelCamposOcultosTipoRamoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRamoActivoFijo;
	public JButton jButtonModificarTipoRamoActivoFijo;
	public JButton jButtonActualizarTipoRamoActivoFijo;
    public JButton jButtonEliminarTipoRamoActivoFijo;
	public JButton jButtonCancelarTipoRamoActivoFijo;
    public JButton jButtonGuardarCambiosTipoRamoActivoFijo;
	public JButton jButtonGuardarCambiosTablaTipoRamoActivoFijo;
	protected JButton jButtonCerrarTipoRamoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionTipoRamoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRamoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRamoActivoFijo;
	protected JButton jButtonModificarToolBarTipoRamoActivoFijo;
	protected JButton jButtonActualizarToolBarTipoRamoActivoFijo;
    protected JButton jButtonEliminarToolBarTipoRamoActivoFijo;
	protected JButton jButtonCancelarToolBarTipoRamoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarTipoRamoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRamoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRamoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoRamoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRamoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRamoActivoFijo;
	protected JMenuItem jMenuItemModificarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemActualizarTipoRamoActivoFijo;
    protected JMenuItem jMenuItemEliminarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemCancelarTipoRamoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosTipoRamoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRamoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoRamoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRamoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRamoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRamoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoRamoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRamoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRamoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRamoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRamoActivoFijo;
	public JLabel jLabelIdTipoRamoActivoFijo;
	public JLabel jLabelidTipoRamoActivoFijo;
	public JButton jButtonidTipoRamoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRamoActivoFijo;
	public JLabel jLabelnombreTipoRamoActivoFijo;
	public JTextArea jTextAreanombreTipoRamoActivoFijo;
	public JScrollPane jscrollPanenombreTipoRamoActivoFijo;
	public JButton jButtonnombreTipoRamoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRamoActivoFijo;
	public JLabel jLabelid_empresaTipoRamoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRamoActivoFijo;
	public JButton jButtonid_empresaTipoRamoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaTipoRamoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoRamoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRamoActivoFijo;
	
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
	
	public TipoRamoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRamoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioTipoRamoActivoFijo=new JPanel();
				this.jmenuBarDetalleTipoRamoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleTipoRamoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRamoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRamoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRamoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRamoActivoFijo() {
		return this.jButtonActualizarToolBarTipoRamoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarTipoRamoActivoFijo() {
		return this.jButtonEliminarToolBarTipoRamoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarTipoRamoActivoFijo() {
		return this.jButtonCancelarToolBarTipoRamoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRamoActivoFijo() {
		return this.jButtonProcesarInformacionTipoRamoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRamoActivoFijo)	{
		this.jButtonProcesarInformacionTipoRamoActivoFijo = jButtonProcesarInformacionTipoRamoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRamoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoRamoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoRamoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoRamoActivoFijo = jComboBoxTiposRelacionesTipoRamoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRamoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoRamoActivoFijo) {
		this.jComboBoxTiposAccionesTipoRamoActivoFijo = jComboBoxTiposAccionesTipoRamoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRamoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRamoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioTipoRamoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo = jComboBoxTiposAccionesFormularioTipoRamoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporamoactivofijoSessionBean=new TipoRamoActivoFijoSessionBean();
		
		this.tiporamoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporamoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRamoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Ramo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRamoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRamoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRamoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarTipoRamoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRamoActivoFijo,this.jTtoolBarDetalleTipoRamoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRamoActivoFijo,this.jTtoolBarDetalleTipoRamoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRamoActivoFijo,this.jTtoolBarDetalleTipoRamoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRamoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRamoActivoFijo,this.jTtoolBarDetalleTipoRamoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRamoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRamoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRamoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRamoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRamoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRamoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRamoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRamoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRamoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRamoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRamoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRamoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRamoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRamoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRamoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRamoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRamoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRamoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRamoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRamoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRamoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRamoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRamoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRamoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRamoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRamoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRamoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRamoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRamoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRamoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRamoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRamoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRamoActivoFijo.add(this.jMenuItemDetalleCerrarTipoRamoActivoFijo);
		
		this.jmenuDetalleAccionesTipoRamoActivoFijo.add(this.jMenuItemActualizarTipoRamoActivoFijo);
		this.jmenuDetalleAccionesTipoRamoActivoFijo.add(this.jMenuItemEliminarTipoRamoActivoFijo);
		this.jmenuDetalleAccionesTipoRamoActivoFijo.add(this.jMenuItemCancelarTipoRamoActivoFijo);		
		
		//this.jmenuDetalleDatosTipoRamoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByTipoRamoActivoFijo);				
		this.jmenuDetalleDatosTipoRamoActivoFijo.add(this.jMenuItemDetalleMostarOcultarTipoRamoActivoFijo);				
				
		//this.jmenuDetalleAccionesTipoRamoActivoFijo.add(this.jMenuItemGuardarCambiosTipoRamoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRamoActivoFijo.add(this.jmenuDetalleArchivoTipoRamoActivoFijo);		
		this.jmenuBarDetalleTipoRamoActivoFijo.add(this.jmenuDetalleAccionesTipoRamoActivoFijo);		
		this.jmenuBarDetalleTipoRamoActivoFijo.add(this.jmenuDetalleDatosTipoRamoActivoFijo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRamoActivoFijo.add(this.jmenuDetalleTipoRamoActivoFijo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRamoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposTipoRamoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRamoActivoFijo = new JLabelMe();
		jLabelIdTipoRamoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRamoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRamoActivoFijo.setToolTipText(TipoRamoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRamoActivoFijo= new GridBagLayout();

		this.jPanelidTipoRamoActivoFijo.setLayout(this.gridaBagLayoutTipoRamoActivoFijo);

		jLabelidTipoRamoActivoFijo = new JLabel();
		jLabelidTipoRamoActivoFijo.setText("Id");

		jLabelidTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoRamoActivoFijo = new JLabelMe();
		this.jLabelnombreTipoRamoActivoFijo.setText(""+TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRamoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRamoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRamoActivoFijo.setToolTipText(TipoRamoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRamoActivoFijo = new GridBagLayout();
		this.jPanelnombreTipoRamoActivoFijo.setLayout(this.gridaBagLayoutTipoRamoActivoFijo);


		jTextAreanombreTipoRamoActivoFijo= new JTextAreaMe();
		jTextAreanombreTipoRamoActivoFijo.setEnabled(false);
		jTextAreanombreTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRamoActivoFijo.setLineWrap(true);
		jTextAreanombreTipoRamoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreTipoRamoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRamoActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRamoActivoFijo = new JScrollPane(jTextAreanombreTipoRamoActivoFijo);
		jscrollPanenombreTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRamoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreTipoRamoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRamoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRamoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRamoActivoFijoBusqueda.setText("U");
		this.jButtonnombreTipoRamoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRamoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRamoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRamoActivoFijoBusqueda"));

		if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRamoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRamoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRamoActivoFijo = new JLabelMe();
		this.jLabelid_empresaTipoRamoActivoFijo.setText(""+TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRamoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRamoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRamoActivoFijo.setToolTipText(TipoRamoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRamoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaTipoRamoActivoFijo.setLayout(this.gridaBagLayoutTipoRamoActivoFijo);


		jComboBoxid_empresaTipoRamoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRamoActivoFijo.setEnabled(false);

		this.jButtonid_empresaTipoRamoActivoFijo= new JButtonMe();
		this.jButtonid_empresaTipoRamoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRamoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRamoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRamoActivoFijo.setText("Buscar");
		this.jButtonid_empresaTipoRamoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRamoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRamoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRamoActivoFijo"));

		this.jButtonid_empresaTipoRamoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRamoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRamoActivoFijoBusqueda"));

		if(this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoRamoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoRamoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoRamoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRamoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRamoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRamoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaTipoRamoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoRamoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRamoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRamoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRamoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRamoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleTipoRamoActivoFijo = new TipoRamoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Ramo Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRamoActivoFijo= new GridBagLayout();
		

		
		String sToolTipTipoRamoActivoFijo="";
		sToolTipTipoRamoActivoFijo=TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRamoActivoFijo+="(ActivosFijos.TipoRamoActivoFijo)";
		}
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRamoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRamoActivoFijo = new JButtonMe();
		this.jButtonModificarTipoRamoActivoFijo = new JButtonMe();
        this.jButtonActualizarTipoRamoActivoFijo = new JButtonMe();
        this.jButtonEliminarTipoRamoActivoFijo = new JButtonMe();
        this.jButtonCancelarTipoRamoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosTipoRamoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoRamoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoRamoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRamoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRamoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Ramo Activo Fijo";
		
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ramo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRamoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRamoActivoFijo.setName("jPanelCamposTipoRamoActivoFijo"); 

		this.jPanelCamposOcultosTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRamoActivoFijo.setName("jPanelCamposOcultosTipoRamoActivoFijo"); 

        this.jPanelAccionesTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRamoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoRamoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRamoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRamoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRamoActivoFijo.setText("Nuevo");
		this.jButtonModificarTipoRamoActivoFijo.setText("Editar");
        this.jButtonActualizarTipoRamoActivoFijo.setText("Actualizar");
        this.jButtonEliminarTipoRamoActivoFijo.setText("Eliminar");
        this.jButtonCancelarTipoRamoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRamoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoRamoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRamoActivoFijo,"nuevo_button","Nuevo",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRamoActivoFijo,"modificar_button","Editar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRamoActivoFijo,"actualizar_button","Actualizar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRamoActivoFijo,"eliminar_button","Eliminar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRamoActivoFijo,"cancelar_button","Cancelar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRamoActivoFijo,"guardarcambios_button","Guardar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRamoActivoFijo,"guardarcambiostabla_button","Guardar",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRamoActivoFijo,"cerrar_button","Salir",this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRamoActivoFijo.setToolTipText("Nuevo"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRamoActivoFijo.setToolTipText("Editar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRamoActivoFijo.setToolTipText("Actualizar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRamoActivoFijo.setToolTipText("Eliminar)"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRamoActivoFijo.setToolTipText("Cancelar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRamoActivoFijo.setToolTipText("Guardar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.setToolTipText("Guardar"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRamoActivoFijo.setToolTipText("Salir"+" "+TipoRamoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRamoActivoFijo";
		inputMap = this.jButtonNuevoTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRamoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRamoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRamoActivoFijo";
		inputMap = this.jButtonActualizarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRamoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRamoActivoFijo";
		inputMap = this.jButtonEliminarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRamoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRamoActivoFijo";
		inputMap = this.jButtonCancelarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRamoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRamoActivoFijo";
		inputMap = this.jButtonCerrarTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRamoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRamoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRamoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRamoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRamoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRamoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRamoActivoFijo.setToolTipText("Nuevo TipoRamoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo.setToolTipText("Sin Cerrar Ventana TipoRamoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRamoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRamoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoRamoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoRamoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRamoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRamoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRamoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRamoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRamoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRamoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRamoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRamoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRamoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRamoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposTipoRamoActivoFijo.setLayout(gridaBagLayoutCamposTipoRamoActivoFijo);
		this.jPanelCamposOcultosTipoRamoActivoFijo.setLayout(gridaBagLayoutCamposOcultosTipoRamoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRamoActivoFijo.add(jLabelIdTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);



	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRamoActivoFijo.add(jLabelidTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);


	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRamoActivoFijo.add(jLabelid_empresaTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRamoActivoFijo.add(jButtonid_empresaTipoRamoActivoFijoBusqueda, this.gridBagConstraintsTipoRamoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 3;
		this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRamoActivoFijo.add(jButtonid_empresaTipoRamoActivoFijoUpdate, this.gridBagConstraintsTipoRamoActivoFijo);
	}

	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRamoActivoFijo.add(jComboBoxid_empresaTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);


	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRamoActivoFijo.add(jLabelnombreTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRamoActivoFijo.add(jButtonnombreTipoRamoActivoFijoBusqueda, this.gridBagConstraintsTipoRamoActivoFijo);
	}

	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRamoActivoFijo.add(jscrollPanenombreTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = iYPanelCamposTipoRamoActivoFijo;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = iXPanelCamposTipoRamoActivoFijo++;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRamoActivoFijo.add(this.jPanelidTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);



	if(iXPanelCamposTipoRamoActivoFijo % 1==0) {
		iXPanelCamposTipoRamoActivoFijo=0;
		iYPanelCamposTipoRamoActivoFijo++;
	}
	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = iYPanelCamposTipoRamoActivoFijo;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = iXPanelCamposTipoRamoActivoFijo++;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRamoActivoFijo.add(this.jPanelnombreTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);



	if(iXPanelCamposTipoRamoActivoFijo % 1==0) {
		iXPanelCamposTipoRamoActivoFijo=0;
		iYPanelCamposTipoRamoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRamoActivoFijo.gridy = iYPanelCamposOcultosTipoRamoActivoFijo;
	this.gridBagConstraintsTipoRamoActivoFijo.gridx = iXPanelCamposOcultosTipoRamoActivoFijo++;
	this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRamoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRamoActivoFijo.add(this.jPanelid_empresaTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);



	if(iXPanelCamposOcultosTipoRamoActivoFijo % 1==0) {
		iXPanelCamposOcultosTipoRamoActivoFijo=0;
		iYPanelCamposOcultosTipoRamoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRamoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoRamoActivoFijo.setLayout(gridaBagLayoutAccionesTipoRamoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRamoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRamoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioTipoRamoActivoFijo);
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRamoActivoFijo.add(this.jComboBoxTiposAccionesFormularioTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);

		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRamoActivoFijo.add(this.jCheckBoxPostAccionNuevoTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRamoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporamoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRamoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRamoActivoFijo.add(this.jButtonModificarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);							

		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRamoActivoFijo.add(this.jButtonEliminarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
			
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRamoActivoFijo.add(this.jButtonActualizarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);


		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRamoActivoFijo.add(this.jButtonGuardarCambiosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);	
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRamoActivoFijo.add(this.jButtonCancelarTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRamoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRamoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporamoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoRamoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRamoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRamoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRamoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRamoActivoFijo = new TipoRamoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Ramo Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Ramo Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Ramo Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRamoActivoFijoModel tiporamoactivofijoModel=new TipoRamoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRamoActivoFijoModel.TipoRamoActivoFijoFocusTraversalPolicy tiporamoactivofijoFocusTraversalPolicy = tiporamoactivofijoModel.new TipoRamoActivoFijoFocusTraversalPolicy(this);
			
			//tiporamoactivofijoFocusTraversalPolicy.settiporamoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporamoactivofijoModel);
			
			
			this.jContentPaneDetalleTipoRamoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRamoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleTipoRamoActivoFijo.setLayout(gridaBagLayoutDetalleTipoRamoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRamoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRamoActivoFijo.add(jTtoolBarDetalleTipoRamoActivoFijo, gridBagConstraintsTipoRamoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo=   new JScrollPane(jContentPaneDetalleTipoRamoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleTipoRamoActivoFijo.add(jPanelCamposTipoRamoActivoFijo, gridBagConstraintsTipoRamoActivoFijo);
			
			
			
			
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
						&& tiporamoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(this.puedeCargarPorParteDetalleActivoFijo,false,-1);
					
					if(this.tiporamoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRamoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
						this.jContentPaneDetalleTipoRamoActivoFijo.add(this.jTabbedPaneRelacionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRamoActivoFijo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRamoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsTipoRamoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRamoActivoFijo.add(jPanelCamposOcultosTipoRamoActivoFijo, gridBagConstraintsTipoRamoActivoFijo);
				
					this.jPanelCamposOcultosTipoRamoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
	        this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRamoActivoFijo.add(this.jPanelAccionesFormularioTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);							
			
			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRamoActivoFijo.add(this.jPanelAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRamoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo=   new JScrollPane(this.jPanelCamposTipoRamoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRamoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
			this.gridBagConstraintsTipoRamoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRamoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRamoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);			
			
			this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
			
			
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		
			
		this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoRamoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRamoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRamoActivoFijo, this.gridBagConstraintsTipoRamoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRamoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRamoActivoFijo;
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

				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRamoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleactivofijoBeanSwingJInternalFrame.setdetalleactivofijoSessionBean(this.detalleactivofijoSessionBean);

				//this.gridBagConstraintsTipoRamoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsTipoRamoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRamoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleTipoRamoActivoFijo.add(this.detalleactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRamoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRamoActivoFijo.add("Detalle Activo Fijos",this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRamoActivoFijo.setComponentAt(iIndexTab,this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleActivoFijo) {
					this.jTabbedPaneRelacionesTipoRamoActivoFijo.add("Detalle Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleActivoFijoBeanSwingJInternalFrame(List<TipoRamoActivoFijo> tiporamoactivofijos,TipoRamoActivoFijo tiporamoactivofijo,DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.tiporamoactivofijoLogic.getConnexion());

					detalleactivofijoBeanSwingJInternalFrame.settiporamoactivofijosForeignKey(tiporamoactivofijos);
					detalleactivofijoBeanSwingJInternalFrame.settiporamoactivofijoForeignKey(tiporamoactivofijo);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionTipoRamoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setlidTipoRamoActivoFijoActual(tiporamoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRamoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.setid_tipo_ramo_activo_fijoFK_IdTipoRamoActivoFijo(tiporamoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						detalleactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRamoActivoFijoForeignKey(tiporamoactivofijo,1,false,true,true);
					detalleactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRamoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRamoActivoFijo");
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
