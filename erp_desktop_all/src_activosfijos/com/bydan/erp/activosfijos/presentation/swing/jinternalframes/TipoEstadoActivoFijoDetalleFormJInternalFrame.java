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

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.activosfijos.util.TipoEstadoActivoFijoConstantesFunciones;

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
public class TipoEstadoActivoFijoDetalleFormJInternalFrame extends TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEstadoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleTipoEstadoActivoFijo;
	
	protected JMenu jmenuDetalleTipoEstadoActivoFijo;
	protected JMenu jmenuDetalleArchivoTipoEstadoActivoFijo;
	protected JMenu jmenuDetalleAccionesTipoEstadoActivoFijo;
	protected JMenu jmenuDetalleDatosTipoEstadoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEstadoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoEstadoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEstadoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoEstadoActivoFijoSessionBean tipoestadoactivofijoSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoEstadoActivoFijoLogic tipoestadoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosTipoEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoEstadoActivoFijo;
	
	protected JPanel jPanelCamposTipoEstadoActivoFijo;    
	protected JPanel jPanelCamposOcultosTipoEstadoActivoFijo;    	
	protected JPanel jPanelAccionesTipoEstadoActivoFijo;
	protected JPanel jPanelAccionesFormularioTipoEstadoActivoFijo;
    
	
	
	protected Integer iXPanelCamposTipoEstadoActivoFijo=0;
	protected Integer iYPanelCamposTipoEstadoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosTipoEstadoActivoFijo=0;
	protected Integer iYPanelCamposOcultosTipoEstadoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEstadoActivoFijo;
	public JButton jButtonModificarTipoEstadoActivoFijo;
	public JButton jButtonActualizarTipoEstadoActivoFijo;
    public JButton jButtonEliminarTipoEstadoActivoFijo;
	public JButton jButtonCancelarTipoEstadoActivoFijo;
    public JButton jButtonGuardarCambiosTipoEstadoActivoFijo;
	public JButton jButtonGuardarCambiosTablaTipoEstadoActivoFijo;
	protected JButton jButtonCerrarTipoEstadoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionTipoEstadoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEstadoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEstadoActivoFijo;
	protected JButton jButtonModificarToolBarTipoEstadoActivoFijo;
	protected JButton jButtonActualizarToolBarTipoEstadoActivoFijo;
    protected JButton jButtonEliminarToolBarTipoEstadoActivoFijo;
	protected JButton jButtonCancelarToolBarTipoEstadoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarTipoEstadoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEstadoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEstadoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoEstadoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEstadoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemModificarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemActualizarTipoEstadoActivoFijo;
    protected JMenuItem jMenuItemEliminarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemCancelarTipoEstadoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEstadoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoEstadoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEstadoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEstadoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEstadoActivoFijo;
	public JLabel jLabelIdTipoEstadoActivoFijo;
	public JTextFieldMe jTextFieldidTipoEstadoActivoFijo;
	public JButton jButtonidTipoEstadoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEstadoActivoFijo;
	public JLabel jLabelnombreTipoEstadoActivoFijo;
	public JTextArea jTextAreanombreTipoEstadoActivoFijo;
	public JScrollPane jscrollPanenombreTipoEstadoActivoFijo;
	public JButton jButtonnombreTipoEstadoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoEstadoActivoFijo;
	public JLabel jLabelid_paisTipoEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoEstadoActivoFijo;
	public JButton jButtonid_paisTipoEstadoActivoFijo= new JButtonMe();
	public JButton jButtonid_paisTipoEstadoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoEstadoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEstadoActivoFijo;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoEstadoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEstadoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioTipoEstadoActivoFijo=new JPanel();
				this.jmenuBarDetalleTipoEstadoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleTipoEstadoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEstadoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEstadoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEstadoActivoFijo() {
		return this.jButtonActualizarToolBarTipoEstadoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarTipoEstadoActivoFijo() {
		return this.jButtonEliminarToolBarTipoEstadoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarTipoEstadoActivoFijo() {
		return this.jButtonCancelarToolBarTipoEstadoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEstadoActivoFijo() {
		return this.jButtonProcesarInformacionTipoEstadoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEstadoActivoFijo)	{
		this.jButtonProcesarInformacionTipoEstadoActivoFijo = jButtonProcesarInformacionTipoEstadoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEstadoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoEstadoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoEstadoActivoFijo = jComboBoxTiposRelacionesTipoEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoEstadoActivoFijo) {
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo = jComboBoxTiposAccionesTipoEstadoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEstadoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEstadoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo = jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoestadoactivofijoSessionBean=new TipoEstadoActivoFijoSessionBean();
		
		this.tipoestadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEstadoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Estado Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEstadoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEstadoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEstadoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarTipoEstadoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEstadoActivoFijo,this.jTtoolBarDetalleTipoEstadoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEstadoActivoFijo,this.jTtoolBarDetalleTipoEstadoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEstadoActivoFijo,this.jTtoolBarDetalleTipoEstadoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEstadoActivoFijo,this.jTtoolBarDetalleTipoEstadoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEstadoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEstadoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEstadoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEstadoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEstadoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEstadoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEstadoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEstadoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEstadoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEstadoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEstadoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEstadoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEstadoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEstadoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEstadoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEstadoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEstadoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEstadoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEstadoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEstadoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEstadoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEstadoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEstadoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEstadoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEstadoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEstadoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEstadoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEstadoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEstadoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEstadoActivoFijo.add(this.jMenuItemDetalleCerrarTipoEstadoActivoFijo);
		
		this.jmenuDetalleAccionesTipoEstadoActivoFijo.add(this.jMenuItemActualizarTipoEstadoActivoFijo);
		this.jmenuDetalleAccionesTipoEstadoActivoFijo.add(this.jMenuItemEliminarTipoEstadoActivoFijo);
		this.jmenuDetalleAccionesTipoEstadoActivoFijo.add(this.jMenuItemCancelarTipoEstadoActivoFijo);		
		
		//this.jmenuDetalleDatosTipoEstadoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByTipoEstadoActivoFijo);				
		this.jmenuDetalleDatosTipoEstadoActivoFijo.add(this.jMenuItemDetalleMostarOcultarTipoEstadoActivoFijo);				
				
		//this.jmenuDetalleAccionesTipoEstadoActivoFijo.add(this.jMenuItemGuardarCambiosTipoEstadoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEstadoActivoFijo.add(this.jmenuDetalleArchivoTipoEstadoActivoFijo);		
		this.jmenuBarDetalleTipoEstadoActivoFijo.add(this.jmenuDetalleAccionesTipoEstadoActivoFijo);		
		this.jmenuBarDetalleTipoEstadoActivoFijo.add(this.jmenuDetalleDatosTipoEstadoActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEstadoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposTipoEstadoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEstadoActivoFijo = new JLabelMe();
		jLabelIdTipoEstadoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEstadoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEstadoActivoFijo.setToolTipText(TipoEstadoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEstadoActivoFijo= new GridBagLayout();

		this.jPanelidTipoEstadoActivoFijo.setLayout(this.gridaBagLayoutTipoEstadoActivoFijo);

		jTextFieldidTipoEstadoActivoFijo = new JTextFieldMe();
		jTextFieldidTipoEstadoActivoFijo.setText("Id");

		jTextFieldidTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoEstadoActivoFijo = new JLabelMe();
		this.jLabelnombreTipoEstadoActivoFijo.setText(""+TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEstadoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEstadoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEstadoActivoFijo.setToolTipText(TipoEstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEstadoActivoFijo = new GridBagLayout();
		this.jPanelnombreTipoEstadoActivoFijo.setLayout(this.gridaBagLayoutTipoEstadoActivoFijo);


		jTextAreanombreTipoEstadoActivoFijo= new JTextAreaMe();
		jTextAreanombreTipoEstadoActivoFijo.setEnabled(false);
		jTextAreanombreTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEstadoActivoFijo.setLineWrap(true);
		jTextAreanombreTipoEstadoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreTipoEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEstadoActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEstadoActivoFijo = new JScrollPane(jTextAreanombreTipoEstadoActivoFijo);
		jscrollPanenombreTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEstadoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreTipoEstadoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEstadoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEstadoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEstadoActivoFijoBusqueda.setText("U");
		this.jButtonnombreTipoEstadoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEstadoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEstadoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEstadoActivoFijoBusqueda"));

		if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEstadoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEstadoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoEstadoActivoFijo = new JLabelMe();
		this.jLabelid_paisTipoEstadoActivoFijo.setText(""+TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoEstadoActivoFijo.setToolTipText("Pais");
		this.jLabelid_paisTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoEstadoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoEstadoActivoFijo.setToolTipText(TipoEstadoActivoFijoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoEstadoActivoFijo = new GridBagLayout();
		this.jPanelid_paisTipoEstadoActivoFijo.setLayout(this.gridaBagLayoutTipoEstadoActivoFijo);


		jComboBoxid_paisTipoEstadoActivoFijo= new JComboBoxMe();
		jComboBoxid_paisTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoEstadoActivoFijo= new JButtonMe();
		this.jButtonid_paisTipoEstadoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoEstadoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoEstadoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoEstadoActivoFijo.setText("Buscar");
		this.jButtonid_paisTipoEstadoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoEstadoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoEstadoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoEstadoActivoFijo"));

		this.jButtonid_paisTipoEstadoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setText("U");
		this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoEstadoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoEstadoActivoFijoBusqueda"));

		if(this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoEstadoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoEstadoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_paisTipoEstadoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoEstadoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoEstadoActivoFijoUpdate.setText("U");
		this.jButtonid_paisTipoEstadoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoEstadoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoEstadoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoEstadoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleTipoEstadoActivoFijo = new TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Estado Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEstadoActivoFijo= new GridBagLayout();
		

		
		String sToolTipTipoEstadoActivoFijo="";
		sToolTipTipoEstadoActivoFijo=TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEstadoActivoFijo+="(ActivosFijos.TipoEstadoActivoFijo)";
		}
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEstadoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonModificarTipoEstadoActivoFijo = new JButtonMe();
        this.jButtonActualizarTipoEstadoActivoFijo = new JButtonMe();
        this.jButtonEliminarTipoEstadoActivoFijo = new JButtonMe();
        this.jButtonCancelarTipoEstadoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoEstadoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoEstadoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEstadoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEstadoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Estado Activo Fijo";
		
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Estado Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEstadoActivoFijo.setName("jPanelCamposTipoEstadoActivoFijo"); 

		this.jPanelCamposOcultosTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEstadoActivoFijo.setName("jPanelCamposOcultosTipoEstadoActivoFijo"); 

        this.jPanelAccionesTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEstadoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoEstadoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEstadoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEstadoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEstadoActivoFijo.setText("Nuevo");
		this.jButtonModificarTipoEstadoActivoFijo.setText("Editar");
        this.jButtonActualizarTipoEstadoActivoFijo.setText("Actualizar");
        this.jButtonEliminarTipoEstadoActivoFijo.setText("Eliminar");
        this.jButtonCancelarTipoEstadoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEstadoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoEstadoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEstadoActivoFijo,"nuevo_button","Nuevo",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEstadoActivoFijo,"modificar_button","Editar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEstadoActivoFijo,"actualizar_button","Actualizar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEstadoActivoFijo,"eliminar_button","Eliminar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEstadoActivoFijo,"cancelar_button","Cancelar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEstadoActivoFijo,"guardarcambios_button","Guardar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo,"guardarcambiostabla_button","Guardar",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEstadoActivoFijo,"cerrar_button","Salir",this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEstadoActivoFijo.setToolTipText("Nuevo"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEstadoActivoFijo.setToolTipText("Editar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEstadoActivoFijo.setToolTipText("Actualizar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEstadoActivoFijo.setToolTipText("Eliminar)"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEstadoActivoFijo.setToolTipText("Cancelar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEstadoActivoFijo.setToolTipText("Guardar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.setToolTipText("Guardar"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEstadoActivoFijo.setToolTipText("Salir"+" "+TipoEstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEstadoActivoFijo";
		inputMap = this.jButtonNuevoTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEstadoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEstadoActivoFijo";
		inputMap = this.jButtonActualizarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEstadoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEstadoActivoFijo";
		inputMap = this.jButtonEliminarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEstadoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEstadoActivoFijo";
		inputMap = this.jButtonCancelarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEstadoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEstadoActivoFijo";
		inputMap = this.jButtonCerrarTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEstadoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEstadoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEstadoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo.setToolTipText("Nuevo TipoEstadoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo.setToolTipText("Sin Cerrar Ventana TipoEstadoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEstadoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoEstadoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEstadoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEstadoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEstadoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEstadoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEstadoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposTipoEstadoActivoFijo.setLayout(gridaBagLayoutCamposTipoEstadoActivoFijo);
		this.jPanelCamposOcultosTipoEstadoActivoFijo.setLayout(gridaBagLayoutCamposOcultosTipoEstadoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEstadoActivoFijo.add(jLabelIdTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);



	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEstadoActivoFijo.add(jTextFieldidTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);


	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoEstadoActivoFijo.add(jLabelid_paisTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoEstadoActivoFijo.add(jButtonid_paisTipoEstadoActivoFijoBusqueda, this.gridBagConstraintsTipoEstadoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 3;
		this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoEstadoActivoFijo.add(jButtonid_paisTipoEstadoActivoFijoUpdate, this.gridBagConstraintsTipoEstadoActivoFijo);
	}

	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoEstadoActivoFijo.add(jComboBoxid_paisTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);


	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEstadoActivoFijo.add(jLabelnombreTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEstadoActivoFijo.add(jButtonnombreTipoEstadoActivoFijoBusqueda, this.gridBagConstraintsTipoEstadoActivoFijo);
	}

	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEstadoActivoFijo.add(jscrollPanenombreTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iYPanelCamposTipoEstadoActivoFijo;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iXPanelCamposTipoEstadoActivoFijo++;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstadoActivoFijo.add(this.jPanelidTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);



	if(iXPanelCamposTipoEstadoActivoFijo % 1==0) {
		iXPanelCamposTipoEstadoActivoFijo=0;
		iYPanelCamposTipoEstadoActivoFijo++;
	}
	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iYPanelCamposTipoEstadoActivoFijo;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iXPanelCamposTipoEstadoActivoFijo++;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstadoActivoFijo.add(this.jPanelid_paisTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);



	if(iXPanelCamposTipoEstadoActivoFijo % 1==0) {
		iXPanelCamposTipoEstadoActivoFijo=0;
		iYPanelCamposTipoEstadoActivoFijo++;
	}
	this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iYPanelCamposTipoEstadoActivoFijo;
	this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iXPanelCamposTipoEstadoActivoFijo++;
	this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEstadoActivoFijo.add(this.jPanelnombreTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);



	if(iXPanelCamposTipoEstadoActivoFijo % 1==0) {
		iXPanelCamposTipoEstadoActivoFijo=0;
		iYPanelCamposTipoEstadoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEstadoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoEstadoActivoFijo.setLayout(gridaBagLayoutAccionesTipoEstadoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEstadoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEstadoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioTipoEstadoActivoFijo);
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEstadoActivoFijo.add(this.jComboBoxTiposAccionesFormularioTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);

		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEstadoActivoFijo.add(this.jCheckBoxPostAccionNuevoTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEstadoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoestadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEstadoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEstadoActivoFijo.add(this.jButtonModificarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);							

		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEstadoActivoFijo.add(this.jButtonEliminarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
			
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEstadoActivoFijo.add(this.jButtonActualizarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);


		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEstadoActivoFijo.add(this.jButtonGuardarCambiosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);	
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEstadoActivoFijo.add(this.jButtonCancelarTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEstadoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEstadoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoestadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEstadoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEstadoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEstadoActivoFijo = new TipoEstadoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Estado Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Estado Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Estado Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEstadoActivoFijoModel tipoestadoactivofijoModel=new TipoEstadoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEstadoActivoFijoModel.TipoEstadoActivoFijoFocusTraversalPolicy tipoestadoactivofijoFocusTraversalPolicy = tipoestadoactivofijoModel.new TipoEstadoActivoFijoFocusTraversalPolicy(this);
			
			//tipoestadoactivofijoFocusTraversalPolicy.settipoestadoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoestadoactivofijoModel);
			
			
			this.jContentPaneDetalleTipoEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEstadoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleTipoEstadoActivoFijo.setLayout(gridaBagLayoutDetalleTipoEstadoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEstadoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEstadoActivoFijo.add(jTtoolBarDetalleTipoEstadoActivoFijo, gridBagConstraintsTipoEstadoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo=   new JScrollPane(jContentPaneDetalleTipoEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleTipoEstadoActivoFijo.add(jPanelCamposTipoEstadoActivoFijo, gridBagConstraintsTipoEstadoActivoFijo);
			
			
			
			
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
						&& tipoestadoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoestadoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEstadoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
						this.jContentPaneDetalleTipoEstadoActivoFijo.add(this.jTabbedPaneRelacionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEstadoActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEstadoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsTipoEstadoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEstadoActivoFijo.add(jPanelCamposOcultosTipoEstadoActivoFijo, gridBagConstraintsTipoEstadoActivoFijo);
				
					this.jPanelCamposOcultosTipoEstadoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
	        this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEstadoActivoFijo.add(this.jPanelAccionesFormularioTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);							
			
			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEstadoActivoFijo.add(this.jPanelAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEstadoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo=   new JScrollPane(this.jPanelCamposTipoEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
			this.gridBagConstraintsTipoEstadoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEstadoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);			
			
			this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
			
			
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		
			
		this.gridBagConstraintsTipoEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoEstadoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEstadoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEstadoActivoFijo, this.gridBagConstraintsTipoEstadoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEstadoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEstadoActivoFijo;
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
