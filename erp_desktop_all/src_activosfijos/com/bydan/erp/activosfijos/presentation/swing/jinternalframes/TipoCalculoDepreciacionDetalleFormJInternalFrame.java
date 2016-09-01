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
import com.bydan.erp.activosfijos.util.TipoCalculoDepreciacionConstantesFunciones;

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
public class TipoCalculoDepreciacionDetalleFormJInternalFrame extends TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCalculoDepreciacion;
	
	protected JMenuBar jmenuBarDetalleTipoCalculoDepreciacion;
	
	protected JMenu jmenuDetalleTipoCalculoDepreciacion;
	protected JMenu jmenuDetalleArchivoTipoCalculoDepreciacion;
	protected JMenu jmenuDetalleAccionesTipoCalculoDepreciacion;
	protected JMenu jmenuDetalleDatosTipoCalculoDepreciacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCalculoDepreciacion;	
	protected GridBagConstraints gridBagConstraintsTipoCalculoDepreciacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCalculoDepreciacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoCalculoDepreciacionSessionBean tipocalculodepreciacionSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoCalculoDepreciacionLogic tipocalculodepreciacionLogic;
	
	public JScrollPane jScrollPanelDatosTipoCalculoDepreciacion;
	public JScrollPane jScrollPanelDatosEdicionTipoCalculoDepreciacion;
	public JScrollPane jScrollPanelDatosGeneralTipoCalculoDepreciacion;
	
	protected JPanel jPanelCamposTipoCalculoDepreciacion;    
	protected JPanel jPanelCamposOcultosTipoCalculoDepreciacion;    	
	protected JPanel jPanelAccionesTipoCalculoDepreciacion;
	protected JPanel jPanelAccionesFormularioTipoCalculoDepreciacion;
    
	
	
	protected Integer iXPanelCamposTipoCalculoDepreciacion=0;
	protected Integer iYPanelCamposTipoCalculoDepreciacion=0;
	
	protected Integer iXPanelCamposOcultosTipoCalculoDepreciacion=0;
	protected Integer iYPanelCamposOcultosTipoCalculoDepreciacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCalculoDepreciacion;
	public JButton jButtonModificarTipoCalculoDepreciacion;
	public JButton jButtonActualizarTipoCalculoDepreciacion;
    public JButton jButtonEliminarTipoCalculoDepreciacion;
	public JButton jButtonCancelarTipoCalculoDepreciacion;
    public JButton jButtonGuardarCambiosTipoCalculoDepreciacion;
	public JButton jButtonGuardarCambiosTablaTipoCalculoDepreciacion;
	protected JButton jButtonCerrarTipoCalculoDepreciacion;
	
	
	protected JButton jButtonProcesarInformacionTipoCalculoDepreciacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCalculoDepreciacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCalculoDepreciacion;
	protected JButton jButtonModificarToolBarTipoCalculoDepreciacion;
	protected JButton jButtonActualizarToolBarTipoCalculoDepreciacion;
    protected JButton jButtonEliminarToolBarTipoCalculoDepreciacion;
	protected JButton jButtonCancelarToolBarTipoCalculoDepreciacion;
    protected JButton jButtonGuardarCambiosToolBarTipoCalculoDepreciacion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCalculoDepreciacion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCalculoDepreciacion;
	protected JButton jButtonCerrarToolBarTipoCalculoDepreciacion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCalculoDepreciacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemModificarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemActualizarTipoCalculoDepreciacion;
    protected JMenuItem jMenuItemEliminarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemCancelarTipoCalculoDepreciacion;
    protected JMenuItem jMenuItemGuardarCambiosTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemCerrarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemDetalleCerrarTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCalculoDepreciacion;
	protected JMenuItem jMenuItemMostrarOcultarTipoCalculoDepreciacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCalculoDepreciacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCalculoDepreciacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCalculoDepreciacion;
	public JLabel jLabelIdTipoCalculoDepreciacion;
	public JTextFieldMe jTextFieldidTipoCalculoDepreciacion;
	public JButton jButtonidTipoCalculoDepreciacionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCalculoDepreciacion;
	public JLabel jLabelnombreTipoCalculoDepreciacion;
	public JTextArea jTextAreanombreTipoCalculoDepreciacion;
	public JScrollPane jscrollPanenombreTipoCalculoDepreciacion;
	public JButton jButtonnombreTipoCalculoDepreciacionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoCalculoDepreciacion;
	public JLabel jLabelid_paisTipoCalculoDepreciacion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoCalculoDepreciacion;
	public JButton jButtonid_paisTipoCalculoDepreciacion= new JButtonMe();
	public JButton jButtonid_paisTipoCalculoDepreciacionUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoCalculoDepreciacionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCalculoDepreciacion;
	
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
	
	public TipoCalculoDepreciacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCalculoDepreciacion=new JPanel();
				this.jPanelAccionesFormularioTipoCalculoDepreciacion=new JPanel();
				this.jmenuBarDetalleTipoCalculoDepreciacion=new JMenuBar();
				this.jTtoolBarDetalleTipoCalculoDepreciacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCalculoDepreciacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDepreciacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCalculoDepreciacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCalculoDepreciacion() {
		return this.jButtonActualizarToolBarTipoCalculoDepreciacion;
	}
	
	public JButton getjButtonEliminarToolBarTipoCalculoDepreciacion() {
		return this.jButtonEliminarToolBarTipoCalculoDepreciacion;
	}
	
	public JButton getjButtonCancelarToolBarTipoCalculoDepreciacion() {
		return this.jButtonCancelarToolBarTipoCalculoDepreciacion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCalculoDepreciacion() {
		return this.jButtonProcesarInformacionTipoCalculoDepreciacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCalculoDepreciacion)	{
		this.jButtonProcesarInformacionTipoCalculoDepreciacion = jButtonProcesarInformacionTipoCalculoDepreciacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCalculoDepreciacion() {
		return this.jComboBoxTiposAccionesTipoCalculoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposRelacionesTipoCalculoDepreciacion) {
		this.jComboBoxTiposRelacionesTipoCalculoDepreciacion = jComboBoxTiposRelacionesTipoCalculoDepreciacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposAccionesTipoCalculoDepreciacion) {
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion = jComboBoxTiposAccionesTipoCalculoDepreciacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCalculoDepreciacion() {
		return this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCalculoDepreciacion(
			JComboBox jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion) {
		this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion = jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocalculodepreciacionSessionBean=new TipoCalculoDepreciacionSessionBean();
		
		this.tipocalculodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalculodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCalculoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCalculoDepreciacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCalculoDepreciacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Calculo Depreciacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCalculoDepreciacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCalculoDepreciacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCalculoDepreciacion=new JButtonMe();
				this.jButtonModificarToolBarTipoCalculoDepreciacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCalculoDepreciacion,this.jTtoolBarDetalleTipoCalculoDepreciacion,
							"actualizar","actualizar","Actualizar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCalculoDepreciacion,this.jTtoolBarDetalleTipoCalculoDepreciacion,
							"eliminar","eliminar","Eliminar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCalculoDepreciacion,this.jTtoolBarDetalleTipoCalculoDepreciacion,
							"cancelar","cancelar","Cancelar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCalculoDepreciacion,this.jTtoolBarDetalleTipoCalculoDepreciacion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCalculoDepreciacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCalculoDepreciacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCalculoDepreciacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCalculoDepreciacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCalculoDepreciacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCalculoDepreciacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCalculoDepreciacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCalculoDepreciacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCalculoDepreciacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCalculoDepreciacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCalculoDepreciacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCalculoDepreciacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCalculoDepreciacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCalculoDepreciacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCalculoDepreciacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCalculoDepreciacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCalculoDepreciacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCalculoDepreciacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCalculoDepreciacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCalculoDepreciacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCalculoDepreciacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCalculoDepreciacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCalculoDepreciacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCalculoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCalculoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCalculoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCalculoDepreciacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCalculoDepreciacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCalculoDepreciacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCalculoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCalculoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCalculoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCalculoDepreciacion.add(this.jMenuItemDetalleCerrarTipoCalculoDepreciacion);
		
		this.jmenuDetalleAccionesTipoCalculoDepreciacion.add(this.jMenuItemActualizarTipoCalculoDepreciacion);
		this.jmenuDetalleAccionesTipoCalculoDepreciacion.add(this.jMenuItemEliminarTipoCalculoDepreciacion);
		this.jmenuDetalleAccionesTipoCalculoDepreciacion.add(this.jMenuItemCancelarTipoCalculoDepreciacion);		
		
		//this.jmenuDetalleDatosTipoCalculoDepreciacion.add(this.jMenuItemDetalleAbrirOrderByTipoCalculoDepreciacion);				
		this.jmenuDetalleDatosTipoCalculoDepreciacion.add(this.jMenuItemDetalleMostarOcultarTipoCalculoDepreciacion);				
				
		//this.jmenuDetalleAccionesTipoCalculoDepreciacion.add(this.jMenuItemGuardarCambiosTipoCalculoDepreciacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCalculoDepreciacion.add(this.jmenuDetalleArchivoTipoCalculoDepreciacion);		
		this.jmenuBarDetalleTipoCalculoDepreciacion.add(this.jmenuDetalleAccionesTipoCalculoDepreciacion);		
		this.jmenuBarDetalleTipoCalculoDepreciacion.add(this.jmenuDetalleDatosTipoCalculoDepreciacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCalculoDepreciacion);				
	}
	
	
	public void inicializarElementosCamposTipoCalculoDepreciacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCalculoDepreciacion = new JLabelMe();
		jLabelIdTipoCalculoDepreciacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCalculoDepreciacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCalculoDepreciacion.setToolTipText(TipoCalculoDepreciacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCalculoDepreciacion= new GridBagLayout();

		this.jPanelidTipoCalculoDepreciacion.setLayout(this.gridaBagLayoutTipoCalculoDepreciacion);

		jTextFieldidTipoCalculoDepreciacion = new JTextFieldMe();
		jTextFieldidTipoCalculoDepreciacion.setText("Id");

		jTextFieldidTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoCalculoDepreciacion = new JLabelMe();
		this.jLabelnombreTipoCalculoDepreciacion.setText(""+TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCalculoDepreciacion.setToolTipText("Nombre");
		this.jLabelnombreTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCalculoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCalculoDepreciacion.setToolTipText(TipoCalculoDepreciacionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCalculoDepreciacion = new GridBagLayout();
		this.jPanelnombreTipoCalculoDepreciacion.setLayout(this.gridaBagLayoutTipoCalculoDepreciacion);


		jTextAreanombreTipoCalculoDepreciacion= new JTextAreaMe();
		jTextAreanombreTipoCalculoDepreciacion.setEnabled(false);
		jTextAreanombreTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalculoDepreciacion.setLineWrap(true);
		jTextAreanombreTipoCalculoDepreciacion.setWrapStyleWord(true);
		jTextAreanombreTipoCalculoDepreciacion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCalculoDepreciacion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCalculoDepreciacion = new JScrollPane(jTextAreanombreTipoCalculoDepreciacion);
		jscrollPanenombreTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCalculoDepreciacionBusqueda= new JButtonMe();
		this.jButtonnombreTipoCalculoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCalculoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCalculoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCalculoDepreciacionBusqueda.setText("U");
		this.jButtonnombreTipoCalculoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCalculoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCalculoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCalculoDepreciacionBusqueda"));

		if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCalculoDepreciacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCalculoDepreciacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoCalculoDepreciacion = new JLabelMe();
		this.jLabelid_paisTipoCalculoDepreciacion.setText(""+TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoCalculoDepreciacion.setToolTipText("Pais");
		this.jLabelid_paisTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoCalculoDepreciacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoCalculoDepreciacion.setToolTipText(TipoCalculoDepreciacionConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoCalculoDepreciacion = new GridBagLayout();
		this.jPanelid_paisTipoCalculoDepreciacion.setLayout(this.gridaBagLayoutTipoCalculoDepreciacion);


		jComboBoxid_paisTipoCalculoDepreciacion= new JComboBoxMe();
		jComboBoxid_paisTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoCalculoDepreciacion= new JButtonMe();
		this.jButtonid_paisTipoCalculoDepreciacion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoCalculoDepreciacion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoCalculoDepreciacion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoCalculoDepreciacion.setText("Buscar");
		this.jButtonid_paisTipoCalculoDepreciacion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoCalculoDepreciacion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoCalculoDepreciacion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoCalculoDepreciacion"));

		this.jButtonid_paisTipoCalculoDepreciacionBusqueda= new JButtonMe();
		this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setText("U");
		this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoCalculoDepreciacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoCalculoDepreciacionBusqueda"));

		if(this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoCalculoDepreciacionBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoCalculoDepreciacionUpdate= new JButtonMe();
		this.jButtonid_paisTipoCalculoDepreciacionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCalculoDepreciacionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoCalculoDepreciacionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoCalculoDepreciacionUpdate.setText("U");
		this.jButtonid_paisTipoCalculoDepreciacionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoCalculoDepreciacionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoCalculoDepreciacionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoCalculoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoCalculoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoCalculoDepreciacionUpdate"));



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
		//this.jInternalFrameDetalleTipoCalculoDepreciacion = new TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Calculo Depreciacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCalculoDepreciacion= new GridBagLayout();
		

		
		String sToolTipTipoCalculoDepreciacion="";
		sToolTipTipoCalculoDepreciacion=TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCalculoDepreciacion+="(ActivosFijos.TipoCalculoDepreciacion)";
		}
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCalculoDepreciacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonModificarTipoCalculoDepreciacion = new JButtonMe();
        this.jButtonActualizarTipoCalculoDepreciacion = new JButtonMe();
        this.jButtonEliminarTipoCalculoDepreciacion = new JButtonMe();
        this.jButtonCancelarTipoCalculoDepreciacion = new JButtonMe();
        this.jButtonGuardarCambiosTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion = new JButtonMe();
		this.jButtonCerrarTipoCalculoDepreciacion = new JButtonMe();
		
		this.jScrollPanelDatosTipoCalculoDepreciacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCalculoDepreciacion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCalculoDepreciacion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Calculo Depreciacion";
		
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculo Depreciacions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCalculoDepreciacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCalculoDepreciacion.setName("jPanelCamposTipoCalculoDepreciacion"); 

		this.jPanelCamposOcultosTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCalculoDepreciacion.setName("jPanelCamposOcultosTipoCalculoDepreciacion"); 

        this.jPanelAccionesTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCalculoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesTipoCalculoDepreciacion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCalculoDepreciacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCalculoDepreciacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCalculoDepreciacion.setText("Nuevo");
		this.jButtonModificarTipoCalculoDepreciacion.setText("Editar");
        this.jButtonActualizarTipoCalculoDepreciacion.setText("Actualizar");
        this.jButtonEliminarTipoCalculoDepreciacion.setText("Eliminar");
        this.jButtonCancelarTipoCalculoDepreciacion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCalculoDepreciacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.setText("Guardar");
		this.jButtonCerrarTipoCalculoDepreciacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCalculoDepreciacion,"nuevo_button","Nuevo",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCalculoDepreciacion,"modificar_button","Editar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCalculoDepreciacion,"actualizar_button","Actualizar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCalculoDepreciacion,"eliminar_button","Eliminar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCalculoDepreciacion,"cancelar_button","Cancelar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCalculoDepreciacion,"guardarcambios_button","Guardar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion,"guardarcambiostabla_button","Guardar",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCalculoDepreciacion,"cerrar_button","Salir",this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCalculoDepreciacion.setToolTipText("Nuevo"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCalculoDepreciacion.setToolTipText("Editar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCalculoDepreciacion.setToolTipText("Actualizar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCalculoDepreciacion.setToolTipText("Eliminar)"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCalculoDepreciacion.setToolTipText("Cancelar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCalculoDepreciacion.setToolTipText("Guardar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.setToolTipText("Guardar"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCalculoDepreciacion.setToolTipText("Salir"+" "+TipoCalculoDepreciacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCalculoDepreciacion";
		inputMap = this.jButtonNuevoTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCalculoDepreciacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCalculoDepreciacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCalculoDepreciacion";
		inputMap = this.jButtonActualizarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCalculoDepreciacion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCalculoDepreciacion";
		inputMap = this.jButtonEliminarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCalculoDepreciacion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCalculoDepreciacion";
		inputMap = this.jButtonCancelarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCalculoDepreciacion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCalculoDepreciacion";
		inputMap = this.jButtonCerrarTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCalculoDepreciacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCalculoDepreciacion";
		inputMap = this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCalculoDepreciacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCalculoDepreciacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion.setToolTipText("Nuevo TipoCalculoDepreciacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion.setToolTipText("Sin Cerrar Ventana TipoCalculoDepreciacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setText("Accion");
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCalculoDepreciacion = new JLabelMe();
		
		this.jLabelAccionesTipoCalculoDepreciacion.setText("Acciones");		
		this.jLabelAccionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCalculoDepreciacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCalculoDepreciacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCalculoDepreciacion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCalculoDepreciacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCalculoDepreciacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCalculoDepreciacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCalculoDepreciacion = new GridBagLayout();
		
		this.jPanelCamposTipoCalculoDepreciacion.setLayout(gridaBagLayoutCamposTipoCalculoDepreciacion);
		this.jPanelCamposOcultosTipoCalculoDepreciacion.setLayout(gridaBagLayoutCamposOcultosTipoCalculoDepreciacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCalculoDepreciacion.add(jLabelIdTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);



	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 1;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCalculoDepreciacion.add(jTextFieldidTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);


	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoCalculoDepreciacion.add(jLabelid_paisTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 2;
		this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoCalculoDepreciacion.add(jButtonid_paisTipoCalculoDepreciacionBusqueda, this.gridBagConstraintsTipoCalculoDepreciacion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 3;
		this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoCalculoDepreciacion.add(jButtonid_paisTipoCalculoDepreciacionUpdate, this.gridBagConstraintsTipoCalculoDepreciacion);
	}

	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 1;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoCalculoDepreciacion.add(jComboBoxid_paisTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);


	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCalculoDepreciacion.add(jLabelnombreTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 2;
		this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCalculoDepreciacion.add(jButtonnombreTipoCalculoDepreciacionBusqueda, this.gridBagConstraintsTipoCalculoDepreciacion);
	}

	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 1;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCalculoDepreciacion.add(jscrollPanenombreTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iYPanelCamposTipoCalculoDepreciacion;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iXPanelCamposTipoCalculoDepreciacion++;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalculoDepreciacion.add(this.jPanelidTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);



	if(iXPanelCamposTipoCalculoDepreciacion % 1==0) {
		iXPanelCamposTipoCalculoDepreciacion=0;
		iYPanelCamposTipoCalculoDepreciacion++;
	}
	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iYPanelCamposTipoCalculoDepreciacion;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iXPanelCamposTipoCalculoDepreciacion++;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalculoDepreciacion.add(this.jPanelid_paisTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);



	if(iXPanelCamposTipoCalculoDepreciacion % 1==0) {
		iXPanelCamposTipoCalculoDepreciacion=0;
		iYPanelCamposTipoCalculoDepreciacion++;
	}
	this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iYPanelCamposTipoCalculoDepreciacion;
	this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iXPanelCamposTipoCalculoDepreciacion++;
	this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalculoDepreciacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalculoDepreciacion.add(this.jPanelnombreTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);



	if(iXPanelCamposTipoCalculoDepreciacion % 1==0) {
		iXPanelCamposTipoCalculoDepreciacion=0;
		iYPanelCamposTipoCalculoDepreciacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCalculoDepreciacion= new GridBagLayout();
		this.jPanelAccionesTipoCalculoDepreciacion.setLayout(gridaBagLayoutAccionesTipoCalculoDepreciacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCalculoDepreciacion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCalculoDepreciacion.setLayout(gridaBagLayoutAccionesFormularioTipoCalculoDepreciacion);
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCalculoDepreciacion.add(this.jComboBoxTiposAccionesFormularioTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);

		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCalculoDepreciacion.add(this.jCheckBoxPostAccionNuevoTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCalculoDepreciacion.add(this.jCheckBoxPostAccionSinCerrarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocalculodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCalculoDepreciacion.add(this.jCheckBoxPostAccionSinMensajeTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCalculoDepreciacion.add(this.jButtonModificarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);							

		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCalculoDepreciacion.add(this.jButtonEliminarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
			
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCalculoDepreciacion.add(this.jButtonActualizarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);


		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCalculoDepreciacion.add(this.jButtonGuardarCambiosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);	
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = 0;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCalculoDepreciacion.add(this.jButtonCancelarTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCalculoDepreciacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCalculoDepreciacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocalculodepreciacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();						
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;		
			//this.gridBagConstraintsTipoCalculoDepreciacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCalculoDepreciacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =0;
		this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCalculoDepreciacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCalculoDepreciacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCalculoDepreciacion = new TipoCalculoDepreciacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Calculo Depreciacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Calculo Depreciacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Calculo Depreciacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCalculoDepreciacionModel tipocalculodepreciacionModel=new TipoCalculoDepreciacionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCalculoDepreciacionModel.TipoCalculoDepreciacionFocusTraversalPolicy tipocalculodepreciacionFocusTraversalPolicy = tipocalculodepreciacionModel.new TipoCalculoDepreciacionFocusTraversalPolicy(this);
			
			//tipocalculodepreciacionFocusTraversalPolicy.settipocalculodepreciacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocalculodepreciacionModel);
			
			
			this.jContentPaneDetalleTipoCalculoDepreciacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCalculoDepreciacion = new GridBagLayout();	
			this.jContentPaneDetalleTipoCalculoDepreciacion.setLayout(gridaBagLayoutDetalleTipoCalculoDepreciacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCalculoDepreciacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
				this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCalculoDepreciacion.add(jTtoolBarDetalleTipoCalculoDepreciacion, gridBagConstraintsTipoCalculoDepreciacion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion=   new JScrollPane(jContentPaneDetalleTipoCalculoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
	        
			this.jContentPaneDetalleTipoCalculoDepreciacion.add(jPanelCamposTipoCalculoDepreciacion, gridBagConstraintsTipoCalculoDepreciacion);
			
			
			
			
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
						&& tipocalculodepreciacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocalculodepreciacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCalculoDepreciacion= new GridBagConstraints();
						this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
						this.jContentPaneDetalleTipoCalculoDepreciacion.add(this.jTabbedPaneRelacionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCalculoDepreciacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCalculoDepreciacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
					this.gridBagConstraintsTipoCalculoDepreciacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCalculoDepreciacion.add(jPanelCamposOcultosTipoCalculoDepreciacion, gridBagConstraintsTipoCalculoDepreciacion);
				
					this.jPanelCamposOcultosTipoCalculoDepreciacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
	        this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCalculoDepreciacion.add(this.jPanelAccionesFormularioTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);							
			
			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
	        this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCalculoDepreciacion.add(this.jPanelAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCalculoDepreciacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion=   new JScrollPane(this.jPanelCamposTipoCalculoDepreciacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculoDepreciacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
			this.gridBagConstraintsTipoCalculoDepreciacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCalculoDepreciacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCalculoDepreciacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);			
			
			this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
			
			
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		
			
		this.gridBagConstraintsTipoCalculoDepreciacion = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculoDepreciacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculoDepreciacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCalculoDepreciacion, this.gridBagConstraintsTipoCalculoDepreciacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCalculoDepreciacion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCalculoDepreciacion;
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
