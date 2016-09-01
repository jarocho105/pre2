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
import com.bydan.erp.activosfijos.util.TipoActivoFijoConstantesFunciones;

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
public class TipoActivoFijoDetalleFormJInternalFrame extends TipoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleTipoActivoFijo;
	
	protected JMenu jmenuDetalleTipoActivoFijo;
	protected JMenu jmenuDetalleArchivoTipoActivoFijo;
	protected JMenu jmenuDetalleAccionesTipoActivoFijo;
	protected JMenu jmenuDetalleDatosTipoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoActivoFijoSessionBean tipoactivofijoSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoActivoFijoLogic tipoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosTipoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoActivoFijo;
	
	protected JPanel jPanelCamposTipoActivoFijo;    
	protected JPanel jPanelCamposOcultosTipoActivoFijo;    	
	protected JPanel jPanelAccionesTipoActivoFijo;
	protected JPanel jPanelAccionesFormularioTipoActivoFijo;
    
	
	
	protected Integer iXPanelCamposTipoActivoFijo=0;
	protected Integer iYPanelCamposTipoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosTipoActivoFijo=0;
	protected Integer iYPanelCamposOcultosTipoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoActivoFijo;
	public JButton jButtonModificarTipoActivoFijo;
	public JButton jButtonActualizarTipoActivoFijo;
    public JButton jButtonEliminarTipoActivoFijo;
	public JButton jButtonCancelarTipoActivoFijo;
    public JButton jButtonGuardarCambiosTipoActivoFijo;
	public JButton jButtonGuardarCambiosTablaTipoActivoFijo;
	protected JButton jButtonCerrarTipoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionTipoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoActivoFijo;
	protected JButton jButtonModificarToolBarTipoActivoFijo;
	protected JButton jButtonActualizarToolBarTipoActivoFijo;
    protected JButton jButtonEliminarToolBarTipoActivoFijo;
	protected JButton jButtonCancelarToolBarTipoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarTipoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoActivoFijo;
	protected JMenuItem jMenuItemModificarTipoActivoFijo;
	protected JMenuItem jMenuItemActualizarTipoActivoFijo;
    protected JMenuItem jMenuItemEliminarTipoActivoFijo;
	protected JMenuItem jMenuItemCancelarTipoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosTipoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoActivoFijo;
	public JLabel jLabelIdTipoActivoFijo;
	public JTextFieldMe jTextFieldidTipoActivoFijo;
	public JButton jButtonidTipoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoActivoFijo;
	public JLabel jLabelnombreTipoActivoFijo;
	public JTextArea jTextAreanombreTipoActivoFijo;
	public JScrollPane jscrollPanenombreTipoActivoFijo;
	public JButton jButtonnombreTipoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoActivoFijo;
	public JLabel jLabelid_paisTipoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoActivoFijo;
	public JButton jButtonid_paisTipoActivoFijo= new JButtonMe();
	public JButton jButtonid_paisTipoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoActivoFijo;
	
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
	
	public TipoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioTipoActivoFijo=new JPanel();
				this.jmenuBarDetalleTipoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleTipoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoActivoFijo() {
		return this.jButtonActualizarToolBarTipoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarTipoActivoFijo() {
		return this.jButtonEliminarToolBarTipoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarTipoActivoFijo() {
		return this.jButtonCancelarToolBarTipoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoActivoFijo() {
		return this.jButtonProcesarInformacionTipoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoActivoFijo)	{
		this.jButtonProcesarInformacionTipoActivoFijo = jButtonProcesarInformacionTipoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoActivoFijo = jComboBoxTiposRelacionesTipoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoActivoFijo) {
		this.jComboBoxTiposAccionesTipoActivoFijo = jComboBoxTiposAccionesTipoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioTipoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioTipoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioTipoActivoFijo = jComboBoxTiposAccionesFormularioTipoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoactivofijoSessionBean=new TipoActivoFijoSessionBean();
		
		this.tipoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarTipoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoActivoFijo,this.jTtoolBarDetalleTipoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoActivoFijo,this.jTtoolBarDetalleTipoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoActivoFijo,this.jTtoolBarDetalleTipoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoActivoFijo,this.jTtoolBarDetalleTipoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoActivoFijo.add(this.jMenuItemDetalleCerrarTipoActivoFijo);
		
		this.jmenuDetalleAccionesTipoActivoFijo.add(this.jMenuItemActualizarTipoActivoFijo);
		this.jmenuDetalleAccionesTipoActivoFijo.add(this.jMenuItemEliminarTipoActivoFijo);
		this.jmenuDetalleAccionesTipoActivoFijo.add(this.jMenuItemCancelarTipoActivoFijo);		
		
		//this.jmenuDetalleDatosTipoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByTipoActivoFijo);				
		this.jmenuDetalleDatosTipoActivoFijo.add(this.jMenuItemDetalleMostarOcultarTipoActivoFijo);				
				
		//this.jmenuDetalleAccionesTipoActivoFijo.add(this.jMenuItemGuardarCambiosTipoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoActivoFijo.add(this.jmenuDetalleArchivoTipoActivoFijo);		
		this.jmenuBarDetalleTipoActivoFijo.add(this.jmenuDetalleAccionesTipoActivoFijo);		
		this.jmenuBarDetalleTipoActivoFijo.add(this.jmenuDetalleDatosTipoActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposTipoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoActivoFijo = new JLabelMe();
		jLabelIdTipoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoActivoFijo.setToolTipText(TipoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoActivoFijo= new GridBagLayout();

		this.jPanelidTipoActivoFijo.setLayout(this.gridaBagLayoutTipoActivoFijo);

		jTextFieldidTipoActivoFijo = new JTextFieldMe();
		jTextFieldidTipoActivoFijo.setText("Id");

		jTextFieldidTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoActivoFijo = new JLabelMe();
		this.jLabelnombreTipoActivoFijo.setText(""+TipoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoActivoFijo.setToolTipText(TipoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoActivoFijo = new GridBagLayout();
		this.jPanelnombreTipoActivoFijo.setLayout(this.gridaBagLayoutTipoActivoFijo);


		jTextAreanombreTipoActivoFijo= new JTextAreaMe();
		jTextAreanombreTipoActivoFijo.setEnabled(false);
		jTextAreanombreTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoActivoFijo.setLineWrap(true);
		jTextAreanombreTipoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreTipoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoActivoFijo = new JScrollPane(jTextAreanombreTipoActivoFijo);
		jscrollPanenombreTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreTipoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoActivoFijoBusqueda.setText("U");
		this.jButtonnombreTipoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoActivoFijoBusqueda"));

		if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoActivoFijo = new JLabelMe();
		this.jLabelid_paisTipoActivoFijo.setText(""+TipoActivoFijoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoActivoFijo.setToolTipText("Pais");
		this.jLabelid_paisTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoActivoFijo.setToolTipText(TipoActivoFijoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoActivoFijo = new GridBagLayout();
		this.jPanelid_paisTipoActivoFijo.setLayout(this.gridaBagLayoutTipoActivoFijo);


		jComboBoxid_paisTipoActivoFijo= new JComboBoxMe();
		jComboBoxid_paisTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoActivoFijo= new JButtonMe();
		this.jButtonid_paisTipoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoActivoFijo.setText("Buscar");
		this.jButtonid_paisTipoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoActivoFijo"));

		this.jButtonid_paisTipoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_paisTipoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoActivoFijoBusqueda.setText("U");
		this.jButtonid_paisTipoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoActivoFijoBusqueda"));

		if(this.tipoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_paisTipoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoActivoFijoUpdate.setText("U");
		this.jButtonid_paisTipoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleTipoActivoFijo = new TipoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoActivoFijo= new GridBagLayout();
		

		
		String sToolTipTipoActivoFijo="";
		sToolTipTipoActivoFijo=TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoActivoFijo+="(ActivosFijos.TipoActivoFijo)";
		}
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoActivoFijo = new JButtonMe();
		this.jButtonModificarTipoActivoFijo = new JButtonMe();
        this.jButtonActualizarTipoActivoFijo = new JButtonMe();
        this.jButtonEliminarTipoActivoFijo = new JButtonMe();
        this.jButtonCancelarTipoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosTipoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Activo Fijo";
		
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoActivoFijo.setName("jPanelCamposTipoActivoFijo"); 

		this.jPanelCamposOcultosTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoActivoFijo.setName("jPanelCamposOcultosTipoActivoFijo"); 

        this.jPanelAccionesTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoActivoFijo.setText("Nuevo");
		this.jButtonModificarTipoActivoFijo.setText("Editar");
        this.jButtonActualizarTipoActivoFijo.setText("Actualizar");
        this.jButtonEliminarTipoActivoFijo.setText("Eliminar");
        this.jButtonCancelarTipoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoActivoFijo,"nuevo_button","Nuevo",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoActivoFijo,"modificar_button","Editar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoActivoFijo,"actualizar_button","Actualizar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoActivoFijo,"eliminar_button","Eliminar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoActivoFijo,"cancelar_button","Cancelar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoActivoFijo,"guardarcambios_button","Guardar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoActivoFijo,"guardarcambiostabla_button","Guardar",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoActivoFijo,"cerrar_button","Salir",this.tipoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoActivoFijo.setToolTipText("Nuevo"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoActivoFijo.setToolTipText("Editar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoActivoFijo.setToolTipText("Actualizar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoActivoFijo.setToolTipText("Eliminar)"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoActivoFijo.setToolTipText("Cancelar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoActivoFijo.setToolTipText("Guardar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoActivoFijo.setToolTipText("Guardar"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoActivoFijo.setToolTipText("Salir"+" "+TipoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoActivoFijo";
		inputMap = this.jButtonNuevoTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoActivoFijo";
		inputMap = this.jButtonActualizarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoActivoFijo";
		inputMap = this.jButtonEliminarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoActivoFijo";
		inputMap = this.jButtonCancelarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoActivoFijo";
		inputMap = this.jButtonCerrarTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoActivoFijo.setToolTipText("Nuevo TipoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoActivoFijo.setToolTipText("Sin Cerrar Ventana TipoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposTipoActivoFijo.setLayout(gridaBagLayoutCamposTipoActivoFijo);
		this.jPanelCamposOcultosTipoActivoFijo.setLayout(gridaBagLayoutCamposOcultosTipoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoActivoFijo.add(jLabelIdTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);



	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoActivoFijo.add(jTextFieldidTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);


	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoActivoFijo.add(jLabelid_paisTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoActivoFijo.add(jButtonid_paisTipoActivoFijoBusqueda, this.gridBagConstraintsTipoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoActivoFijo.gridx = 3;
		this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoActivoFijo.add(jButtonid_paisTipoActivoFijoUpdate, this.gridBagConstraintsTipoActivoFijo);
	}

	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoActivoFijo.add(jComboBoxid_paisTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);


	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoActivoFijo.add(jLabelnombreTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoActivoFijo.add(jButtonnombreTipoActivoFijoBusqueda, this.gridBagConstraintsTipoActivoFijo);
	}

	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoActivoFijo.add(jscrollPanenombreTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijo.gridy = iYPanelCamposTipoActivoFijo;
	this.gridBagConstraintsTipoActivoFijo.gridx = iXPanelCamposTipoActivoFijo++;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoActivoFijo.add(this.jPanelidTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);



	if(iXPanelCamposTipoActivoFijo % 1==0) {
		iXPanelCamposTipoActivoFijo=0;
		iYPanelCamposTipoActivoFijo++;
	}
	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijo.gridy = iYPanelCamposTipoActivoFijo;
	this.gridBagConstraintsTipoActivoFijo.gridx = iXPanelCamposTipoActivoFijo++;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoActivoFijo.add(this.jPanelid_paisTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);



	if(iXPanelCamposTipoActivoFijo % 1==0) {
		iXPanelCamposTipoActivoFijo=0;
		iYPanelCamposTipoActivoFijo++;
	}
	this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoActivoFijo.gridy = iYPanelCamposTipoActivoFijo;
	this.gridBagConstraintsTipoActivoFijo.gridx = iXPanelCamposTipoActivoFijo++;
	this.gridBagConstraintsTipoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoActivoFijo.add(this.jPanelnombreTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);



	if(iXPanelCamposTipoActivoFijo % 1==0) {
		iXPanelCamposTipoActivoFijo=0;
		iYPanelCamposTipoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoActivoFijo.setLayout(gridaBagLayoutAccionesTipoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioTipoActivoFijo);
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoActivoFijo.add(this.jComboBoxTiposAccionesFormularioTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);

		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoActivoFijo.add(this.jCheckBoxPostAccionNuevoTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoActivoFijo.add(this.jButtonModificarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);							

		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoActivoFijo.add(this.jButtonEliminarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
			
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoActivoFijo.add(this.jButtonActualizarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);


		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoActivoFijo.add(this.jButtonGuardarCambiosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);	
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoActivoFijo.add(this.jButtonCancelarTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoActivoFijo = new TipoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoActivoFijoModel tipoactivofijoModel=new TipoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoActivoFijoModel.TipoActivoFijoFocusTraversalPolicy tipoactivofijoFocusTraversalPolicy = tipoactivofijoModel.new TipoActivoFijoFocusTraversalPolicy(this);
			
			//tipoactivofijoFocusTraversalPolicy.settipoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoactivofijoModel);
			
			
			this.jContentPaneDetalleTipoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleTipoActivoFijo.setLayout(gridaBagLayoutDetalleTipoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoActivoFijo.add(jTtoolBarDetalleTipoActivoFijo, gridBagConstraintsTipoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoActivoFijo=   new JScrollPane(jContentPaneDetalleTipoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleTipoActivoFijo.add(jPanelCamposTipoActivoFijo, gridBagConstraintsTipoActivoFijo);
			
			
			
			
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
						&& tipoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsTipoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoActivoFijo.gridx = 0;
						this.jContentPaneDetalleTipoActivoFijo.add(this.jTabbedPaneRelacionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsTipoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoActivoFijo.add(jPanelCamposOcultosTipoActivoFijo, gridBagConstraintsTipoActivoFijo);
				
					this.jPanelCamposOcultosTipoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoActivoFijo.gridx = 0;
	        this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoActivoFijo.add(this.jPanelAccionesFormularioTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);							
			
			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsTipoActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoActivoFijo.add(this.jPanelAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoActivoFijo=   new JScrollPane(this.jPanelCamposTipoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;
			this.gridBagConstraintsTipoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);			
			
			this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
			
			
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		
			
		this.gridBagConstraintsTipoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoActivoFijo, this.gridBagConstraintsTipoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoActivoFijo;
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
