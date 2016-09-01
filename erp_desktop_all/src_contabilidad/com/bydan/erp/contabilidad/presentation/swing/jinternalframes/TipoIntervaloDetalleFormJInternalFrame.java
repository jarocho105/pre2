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


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoIntervaloConstantesFunciones;

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
public class TipoIntervaloDetalleFormJInternalFrame extends TipoIntervaloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoIntervalo;
	
	protected JMenuBar jmenuBarDetalleTipoIntervalo;
	
	protected JMenu jmenuDetalleTipoIntervalo;
	protected JMenu jmenuDetalleArchivoTipoIntervalo;
	protected JMenu jmenuDetalleAccionesTipoIntervalo;
	protected JMenu jmenuDetalleDatosTipoIntervalo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIntervalo;	
	protected GridBagConstraints gridBagConstraintsTipoIntervalo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoIntervaloBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoIntervalo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	
	

	public ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame=null;
	public ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroContabilidadDefecto=false;
	public ParametroContabilidadDefectoSessionBean parametrocontabilidaddefectoSessionBean;

	public TablaAmortiDetalleBeanSwingJInternalFrame tablaamortidetalleBeanSwingJInternalFrame=null;
	public TablaAmortiDetalleBeanSwingJInternalFrame tablaamortidetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTablaAmortiDetalle=false;
	public TablaAmortiDetalleSessionBean tablaamortidetalleSessionBean;
	
		
	
	public TipoIntervaloLogic tipointervaloLogic;
	
	public JScrollPane jScrollPanelDatosTipoIntervalo;
	public JScrollPane jScrollPanelDatosEdicionTipoIntervalo;
	public JScrollPane jScrollPanelDatosGeneralTipoIntervalo;
	
	protected JPanel jPanelCamposTipoIntervalo;    
	protected JPanel jPanelCamposOcultosTipoIntervalo;    	
	protected JPanel jPanelAccionesTipoIntervalo;
	protected JPanel jPanelAccionesFormularioTipoIntervalo;
    
	
	
	protected Integer iXPanelCamposTipoIntervalo=0;
	protected Integer iYPanelCamposTipoIntervalo=0;
	
	protected Integer iXPanelCamposOcultosTipoIntervalo=0;
	protected Integer iYPanelCamposOcultosTipoIntervalo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoIntervalo;
	public JButton jButtonModificarTipoIntervalo;
	public JButton jButtonActualizarTipoIntervalo;
    public JButton jButtonEliminarTipoIntervalo;
	public JButton jButtonCancelarTipoIntervalo;
    public JButton jButtonGuardarCambiosTipoIntervalo;
	public JButton jButtonGuardarCambiosTablaTipoIntervalo;
	protected JButton jButtonCerrarTipoIntervalo;
	
	
	protected JButton jButtonProcesarInformacionTipoIntervalo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoIntervalo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoIntervalo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoIntervalo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIntervalo;
	protected JButton jButtonModificarToolBarTipoIntervalo;
	protected JButton jButtonActualizarToolBarTipoIntervalo;
    protected JButton jButtonEliminarToolBarTipoIntervalo;
	protected JButton jButtonCancelarToolBarTipoIntervalo;
    protected JButton jButtonGuardarCambiosToolBarTipoIntervalo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoIntervalo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIntervalo;
	protected JButton jButtonCerrarToolBarTipoIntervalo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoIntervalo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIntervalo;
	protected JMenuItem jMenuItemModificarTipoIntervalo;
	protected JMenuItem jMenuItemActualizarTipoIntervalo;
    protected JMenuItem jMenuItemEliminarTipoIntervalo;
	protected JMenuItem jMenuItemCancelarTipoIntervalo;
    protected JMenuItem jMenuItemGuardarCambiosTipoIntervalo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIntervalo;
	protected JMenuItem jMenuItemCerrarTipoIntervalo;
	protected JMenuItem jMenuItemDetalleCerrarTipoIntervalo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIntervalo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoIntervalo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIntervalo;
	protected JMenuItem jMenuItemMostrarOcultarTipoIntervalo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIntervalo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIntervalo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIntervalo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoIntervalo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoIntervalo;
	public JLabel jLabelIdTipoIntervalo;
	public JTextFieldMe jTextFieldidTipoIntervalo;
	public JButton jButtonidTipoIntervaloBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoIntervalo;
	public JLabel jLabelnombreTipoIntervalo;
	public JTextArea jTextAreanombreTipoIntervalo;
	public JScrollPane jscrollPanenombreTipoIntervalo;
	public JButton jButtonnombreTipoIntervaloBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoIntervalo;
	
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
	
	public TipoIntervaloDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoIntervalo=new JPanel();
				this.jPanelAccionesFormularioTipoIntervalo=new JPanel();
				this.jmenuBarDetalleTipoIntervalo=new JMenuBar();
				this.jTtoolBarDetalleTipoIntervalo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoIntervaloDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIntervaloDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIntervalo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoIntervalo() {
		return this.jButtonActualizarToolBarTipoIntervalo;
	}
	
	public JButton getjButtonEliminarToolBarTipoIntervalo() {
		return this.jButtonEliminarToolBarTipoIntervalo;
	}
	
	public JButton getjButtonCancelarToolBarTipoIntervalo() {
		return this.jButtonCancelarToolBarTipoIntervalo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoIntervalo() {
		return this.jButtonProcesarInformacionTipoIntervalo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIntervalo)	{
		this.jButtonProcesarInformacionTipoIntervalo = jButtonProcesarInformacionTipoIntervalo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIntervalo() {
		return this.jComboBoxTiposAccionesTipoIntervalo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIntervalo(
			JComboBox jComboBoxTiposRelacionesTipoIntervalo) {
		this.jComboBoxTiposRelacionesTipoIntervalo = jComboBoxTiposRelacionesTipoIntervalo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIntervalo(
			JComboBox jComboBoxTiposAccionesTipoIntervalo) {
		this.jComboBoxTiposAccionesTipoIntervalo = jComboBoxTiposAccionesTipoIntervalo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoIntervalo() {
		return this.jComboBoxTiposAccionesFormularioTipoIntervalo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoIntervalo(
			JComboBox jComboBoxTiposAccionesFormularioTipoIntervalo) {
		this.jComboBoxTiposAccionesFormularioTipoIntervalo = jComboBoxTiposAccionesFormularioTipoIntervalo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipointervaloSessionBean=new TipoIntervaloSessionBean();
		
		this.tipointervaloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipointervaloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipointervaloSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		//this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIntervaloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Intervalo  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoIntervaloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoIntervalo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoIntervalo=new JButtonMe();
				this.jButtonModificarToolBarTipoIntervalo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoIntervalo,this.jTtoolBarDetalleTipoIntervalo,
							"actualizar","actualizar","Actualizar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoIntervalo,this.jTtoolBarDetalleTipoIntervalo,
							"eliminar","eliminar","Eliminar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoIntervalo,this.jTtoolBarDetalleTipoIntervalo,
							"cancelar","cancelar","Cancelar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoIntervalo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoIntervalo,this.jTtoolBarDetalleTipoIntervalo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoIntervalo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoIntervalo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoIntervalo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoIntervalo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoIntervalo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIntervalo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIntervalo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIntervalo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoIntervalo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoIntervalo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoIntervalo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoIntervalo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoIntervalo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoIntervalo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoIntervalo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoIntervalo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoIntervalo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoIntervalo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoIntervalo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoIntervalo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoIntervalo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIntervalo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIntervalo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIntervalo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIntervalo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIntervalo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoIntervalo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoIntervalo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoIntervalo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIntervalo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIntervalo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIntervalo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIntervalo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIntervalo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIntervalo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoIntervalo.add(this.jMenuItemDetalleCerrarTipoIntervalo);
		
		this.jmenuDetalleAccionesTipoIntervalo.add(this.jMenuItemActualizarTipoIntervalo);
		this.jmenuDetalleAccionesTipoIntervalo.add(this.jMenuItemEliminarTipoIntervalo);
		this.jmenuDetalleAccionesTipoIntervalo.add(this.jMenuItemCancelarTipoIntervalo);		
		
		//this.jmenuDetalleDatosTipoIntervalo.add(this.jMenuItemDetalleAbrirOrderByTipoIntervalo);				
		this.jmenuDetalleDatosTipoIntervalo.add(this.jMenuItemDetalleMostarOcultarTipoIntervalo);				
				
		//this.jmenuDetalleAccionesTipoIntervalo.add(this.jMenuItemGuardarCambiosTipoIntervalo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoIntervalo.add(this.jmenuDetalleArchivoTipoIntervalo);		
		this.jmenuBarDetalleTipoIntervalo.add(this.jmenuDetalleAccionesTipoIntervalo);		
		this.jmenuBarDetalleTipoIntervalo.add(this.jmenuDetalleDatosTipoIntervalo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoIntervalo.add(this.jmenuDetalleTipoIntervalo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoIntervalo);				
	}
	
	
	public void inicializarElementosCamposTipoIntervalo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoIntervalo = new JLabelMe();
		jLabelIdTipoIntervalo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoIntervalo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoIntervalo.setToolTipText(TipoIntervaloConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoIntervalo= new GridBagLayout();

		this.jPanelidTipoIntervalo.setLayout(this.gridaBagLayoutTipoIntervalo);

		jTextFieldidTipoIntervalo = new JTextFieldMe();
		jTextFieldidTipoIntervalo.setText("Id");

		jTextFieldidTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoIntervalo = new JLabelMe();
		this.jLabelnombreTipoIntervalo.setText(""+TipoIntervaloConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoIntervalo.setToolTipText("Nombre");
		this.jLabelnombreTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoIntervalo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoIntervalo.setToolTipText(TipoIntervaloConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoIntervalo = new GridBagLayout();
		this.jPanelnombreTipoIntervalo.setLayout(this.gridaBagLayoutTipoIntervalo);


		jTextAreanombreTipoIntervalo= new JTextAreaMe();
		jTextAreanombreTipoIntervalo.setEnabled(false);
		jTextAreanombreTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIntervalo.setLineWrap(true);
		jTextAreanombreTipoIntervalo.setWrapStyleWord(true);
		jTextAreanombreTipoIntervalo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoIntervalo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoIntervalo = new JScrollPane(jTextAreanombreTipoIntervalo);
		jscrollPanenombreTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoIntervaloBusqueda= new JButtonMe();
		this.jButtonnombreTipoIntervaloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIntervaloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIntervaloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoIntervaloBusqueda.setText("U");
		this.jButtonnombreTipoIntervaloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoIntervaloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoIntervaloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoIntervalo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoIntervalo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoIntervaloBusqueda"));

		if(this.tipointervaloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoIntervaloBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoIntervalo() {
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
		//this.jInternalFrameDetalleTipoIntervalo = new TipoIntervaloBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Intervalo  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIntervalo= new GridBagLayout();
		

		
		String sToolTipTipoIntervalo="";
		sToolTipTipoIntervalo=TipoIntervaloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIntervalo+="(Contabilidad.TipoIntervalo)";
		}
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIntervalo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoIntervalo = new JButtonMe();
		this.jButtonModificarTipoIntervalo = new JButtonMe();
        this.jButtonActualizarTipoIntervalo = new JButtonMe();
        this.jButtonEliminarTipoIntervalo = new JButtonMe();
        this.jButtonCancelarTipoIntervalo = new JButtonMe();
        this.jButtonGuardarCambiosTipoIntervalo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoIntervalo = new JButtonMe();
		this.jButtonCerrarTipoIntervalo = new JButtonMe();
		
		this.jScrollPanelDatosTipoIntervalo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoIntervalo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoIntervalo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Intervalo ";
		
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Intervalo s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIntervalo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoIntervalo.setName("jPanelCamposTipoIntervalo"); 

		this.jPanelCamposOcultosTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoIntervalo.setName("jPanelCamposOcultosTipoIntervalo"); 

        this.jPanelAccionesTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIntervalo.setToolTipText("Acciones");
        this.jPanelAccionesTipoIntervalo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoIntervalo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoIntervalo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoIntervalo.setText("Nuevo");
		this.jButtonModificarTipoIntervalo.setText("Editar");
        this.jButtonActualizarTipoIntervalo.setText("Actualizar");
        this.jButtonEliminarTipoIntervalo.setText("Eliminar");
        this.jButtonCancelarTipoIntervalo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoIntervalo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoIntervalo.setText("Guardar");
		this.jButtonCerrarTipoIntervalo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIntervalo,"nuevo_button","Nuevo",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoIntervalo,"modificar_button","Editar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoIntervalo,"actualizar_button","Actualizar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoIntervalo,"eliminar_button","Eliminar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoIntervalo,"cancelar_button","Cancelar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoIntervalo,"guardarcambios_button","Guardar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIntervalo,"guardarcambiostabla_button","Guardar",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIntervalo,"cerrar_button","Salir",this.tipointervaloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoIntervalo.setToolTipText("Nuevo"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoIntervalo.setToolTipText("Editar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoIntervalo.setToolTipText("Actualizar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoIntervalo.setToolTipText("Eliminar)"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoIntervalo.setToolTipText("Cancelar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoIntervalo.setToolTipText("Guardar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoIntervalo.setToolTipText("Guardar"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIntervalo.setToolTipText("Salir"+" "+TipoIntervaloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoIntervalo";
		inputMap = this.jButtonNuevoTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIntervalo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIntervalo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoIntervalo";
		inputMap = this.jButtonActualizarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoIntervalo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoIntervalo";
		inputMap = this.jButtonEliminarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoIntervalo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoIntervalo";
		inputMap = this.jButtonCancelarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoIntervalo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoIntervalo";
		inputMap = this.jButtonCerrarTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIntervalo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIntervalo";
		inputMap = this.jButtonGuardarCambiosTablaTipoIntervalo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIntervalo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIntervalo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoIntervalo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoIntervalo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoIntervalo.setToolTipText("Nuevo TipoIntervalo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoIntervalo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoIntervalo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoIntervalo.setToolTipText("Sin Cerrar Ventana TipoIntervalo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoIntervalo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoIntervalo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoIntervalo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIntervalo.setText("Accion");
		this.jComboBoxTiposAccionesTipoIntervalo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoIntervalo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoIntervalo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoIntervalo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoIntervalo = new JLabelMe();
		
		this.jLabelAccionesTipoIntervalo.setText("Acciones");		
		this.jLabelAccionesTipoIntervalo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIntervalo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIntervalo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoIntervalo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoIntervalo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoIntervalo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoIntervalo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoIntervalo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoIntervalo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIntervalo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIntervalo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIntervalo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoIntervalo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIntervalo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIntervalo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoIntervalo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoIntervalo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoIntervalo = new GridBagLayout();
		
		this.jPanelCamposTipoIntervalo.setLayout(gridaBagLayoutCamposTipoIntervalo);
		this.jPanelCamposOcultosTipoIntervalo.setLayout(gridaBagLayoutCamposOcultosTipoIntervalo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIntervalo.gridy = 0;
	this.gridBagConstraintsTipoIntervalo.gridx = 0;
	this.gridBagConstraintsTipoIntervalo.ipadx = 0;
	this.gridBagConstraintsTipoIntervalo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoIntervalo.add(jLabelIdTipoIntervalo, this.gridBagConstraintsTipoIntervalo);



	this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIntervalo.gridy = 0;
	this.gridBagConstraintsTipoIntervalo.gridx = 1;
	this.gridBagConstraintsTipoIntervalo.ipadx = 0;
	this.gridBagConstraintsTipoIntervalo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoIntervalo.add(jTextFieldidTipoIntervalo, this.gridBagConstraintsTipoIntervalo);


	this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIntervalo.gridy = 0;
	this.gridBagConstraintsTipoIntervalo.gridx = 0;
	this.gridBagConstraintsTipoIntervalo.ipadx = 0;
	this.gridBagConstraintsTipoIntervalo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoIntervalo.add(jLabelnombreTipoIntervalo, this.gridBagConstraintsTipoIntervalo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		//this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIntervalo.gridy = 0;
		this.gridBagConstraintsTipoIntervalo.gridx = 2;
		this.gridBagConstraintsTipoIntervalo.ipadx = 0;
		this.gridBagConstraintsTipoIntervalo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoIntervalo.add(jButtonnombreTipoIntervaloBusqueda, this.gridBagConstraintsTipoIntervalo);
	}

	this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIntervalo.gridy = 0;
	this.gridBagConstraintsTipoIntervalo.gridx = 1;
	this.gridBagConstraintsTipoIntervalo.ipadx = 0;
	this.gridBagConstraintsTipoIntervalo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoIntervalo.add(jscrollPanenombreTipoIntervalo, this.gridBagConstraintsTipoIntervalo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIntervalo.gridy = iYPanelCamposTipoIntervalo;
	this.gridBagConstraintsTipoIntervalo.gridx = iXPanelCamposTipoIntervalo++;
	this.gridBagConstraintsTipoIntervalo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIntervalo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIntervalo.add(this.jPanelidTipoIntervalo, this.gridBagConstraintsTipoIntervalo);



	if(iXPanelCamposTipoIntervalo % 1==0) {
		iXPanelCamposTipoIntervalo=0;
		iYPanelCamposTipoIntervalo++;
	}
	this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIntervalo.gridy = iYPanelCamposTipoIntervalo;
	this.gridBagConstraintsTipoIntervalo.gridx = iXPanelCamposTipoIntervalo++;
	this.gridBagConstraintsTipoIntervalo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIntervalo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIntervalo.add(this.jPanelnombreTipoIntervalo, this.gridBagConstraintsTipoIntervalo);



	if(iXPanelCamposTipoIntervalo % 1==0) {
		iXPanelCamposTipoIntervalo=0;
		iYPanelCamposTipoIntervalo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoIntervalo= new GridBagLayout();
		this.jPanelAccionesTipoIntervalo.setLayout(gridaBagLayoutAccionesTipoIntervalo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoIntervalo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoIntervalo.setLayout(gridaBagLayoutAccionesFormularioTipoIntervalo);
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIntervalo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIntervalo.add(this.jComboBoxTiposAccionesFormularioTipoIntervalo, this.gridBagConstraintsTipoIntervalo);

		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIntervalo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIntervalo.add(this.jCheckBoxPostAccionNuevoTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIntervalo.add(this.jCheckBoxPostAccionSinCerrarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipointervaloSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipointervaloSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIntervalo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIntervalo.add(this.jCheckBoxPostAccionSinMensajeTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = 0;
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoIntervalo.add(this.jButtonModificarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);							

		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIntervalo.gridy = 0;
		this.gridBagConstraintsTipoIntervalo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoIntervalo.add(this.jButtonEliminarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
			
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = 0;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIntervalo.add(this.jButtonActualizarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);


		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = 0;		
		this.gridBagConstraintsTipoIntervalo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIntervalo.add(this.jButtonGuardarCambiosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);	
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = 0;		
		this.gridBagConstraintsTipoIntervalo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoIntervalo.add(this.jButtonCancelarTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIntervalo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIntervalo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipointervaloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();						
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIntervalo.gridx = 0;		
			//this.gridBagConstraintsTipoIntervalo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIntervalo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIntervalo.gridx =0;
		this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIntervalo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoIntervaloJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoIntervalo = new TipoIntervaloBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Intervalo  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Intervalo  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Intervalo  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoIntervaloModel tipointervaloModel=new TipoIntervaloModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoIntervaloModel.TipoIntervaloFocusTraversalPolicy tipointervaloFocusTraversalPolicy = tipointervaloModel.new TipoIntervaloFocusTraversalPolicy(this);
			
			//tipointervaloFocusTraversalPolicy.settipointervaloJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipointervaloModel);
			
			
			this.jContentPaneDetalleTipoIntervalo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoIntervalo = new GridBagLayout();	
			this.jContentPaneDetalleTipoIntervalo.setLayout(gridaBagLayoutDetalleTipoIntervalo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIntervalo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
				this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoIntervalo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoIntervalo.add(jTtoolBarDetalleTipoIntervalo, gridBagConstraintsTipoIntervalo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoIntervalo=   new JScrollPane(jContentPaneDetalleTipoIntervalo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIntervalo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIntervalo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIntervalo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoIntervalo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIntervalo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIntervalo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIntervalo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoIntervalo.gridx = 0;
	        
			this.jContentPaneDetalleTipoIntervalo.add(jPanelCamposTipoIntervalo, gridBagConstraintsTipoIntervalo);
			
			
			
			
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
						&& tipointervaloSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(this.puedeCargarPorParteParametroContabilidadDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTablaAmortiDetalle(this.puedeCargarPorParteTablaAmortiDetalle,false,-1);
					
					if(this.tipointervaloSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoIntervalo= new GridBagConstraints();
						this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoIntervalo.gridx = 0;
						this.jContentPaneDetalleTipoIntervalo.add(this.jTabbedPaneRelacionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoIntervalo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTablaAmortiDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoIntervalo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
					this.gridBagConstraintsTipoIntervalo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoIntervalo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoIntervalo.add(jPanelCamposOcultosTipoIntervalo, gridBagConstraintsTipoIntervalo);
				
					this.jPanelCamposOcultosTipoIntervalo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoIntervalo.gridx = 0;
	        this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoIntervalo.add(this.jPanelAccionesFormularioTipoIntervalo, this.gridBagConstraintsTipoIntervalo);							
			
			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
	        this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoIntervalo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoIntervalo.add(this.jPanelAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoIntervalo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoIntervalo=   new JScrollPane(this.jPanelCamposTipoIntervalo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIntervalo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIntervalo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIntervalo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoIntervalo.gridx = 0;
			this.gridBagConstraintsTipoIntervalo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoIntervalo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoIntervalo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIntervalo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoIntervalo, this.gridBagConstraintsTipoIntervalo);			
			
			this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
			this.gridBagConstraintsTipoIntervalo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIntervalo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
			
			
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		
			
		this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
		this.gridBagConstraintsTipoIntervalo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIntervalo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIntervalo, this.gridBagConstraintsTipoIntervalo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoIntervalo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoIntervalo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameParametroContabilidadDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocontabilidaddefectoSessionBean=new ParametroContabilidadDefectoSessionBean();
		this.parametrocontabilidaddefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;//new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocontabilidaddefectoBeanSwingJInternalFramePopup=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocontabilidaddefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroContabilidadDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocontabilidaddefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocontabilidaddefectoBeanSwingJInternalFrame.setparametrocontabilidaddefectoSessionBean(this.parametrocontabilidaddefectoSessionBean);

				//this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
				//this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIntervalo.gridx = 0;
				//this.jContentPaneDetalleTipoIntervalo.add(this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIntervalo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIntervalo.add("Parametro Contabilidad Defectos",this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIntervalo.setComponentAt(iIndexTab,this.parametrocontabilidaddefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroContabilidadDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocontabilidaddefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocontabilidaddefectoBeanSwingJInternalFrame=null;//new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocontabilidaddefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroContabilidadDefecto) {
					this.jTabbedPaneRelacionesTipoIntervalo.add("Parametro Contabilidad Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTablaAmortiDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tablaamortidetalleSessionBean=new TablaAmortiDetalleSessionBean();
		this.tablaamortidetalleSessionBean.setConGuardarRelaciones(false);
		this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(true);

		this.tablaamortidetalleBeanSwingJInternalFrame=null;//new TablaAmortiDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tablaamortidetalleBeanSwingJInternalFramePopup=new TablaAmortiDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tablaamortidetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {

				TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL;
				TablaAmortiDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIntervaloJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(true);

				this.tablaamortidetalleBeanSwingJInternalFrame=new TablaAmortiDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tablaamortidetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tablaamortidetalleBeanSwingJInternalFrame.settablaamortidetalleSessionBean(this.tablaamortidetalleSessionBean);

				//this.gridBagConstraintsTipoIntervalo = new GridBagConstraints();
				//this.gridBagConstraintsTipoIntervalo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIntervalo.gridx = 0;
				//this.jContentPaneDetalleTipoIntervalo.add(this.tablaamortidetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIntervalo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIntervalo.add("Tabla Amortizacion Detalles",this.tablaamortidetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIntervalo.setComponentAt(iIndexTab,this.tablaamortidetalleBeanSwingJInternalFrame.getContentPane());
				}

				//TablaAmortiDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tablaamortidetalleSessionBean.setEsGuardarRelacionado(false);
				this.tablaamortidetalleBeanSwingJInternalFrame=null;//new TablaAmortiDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tablaamortidetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTablaAmortiDetalle) {
					this.jTabbedPaneRelacionesTipoIntervalo.add("Tabla Amortizacion Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarParametroContabilidadDefectoBeanSwingJInternalFrame(List<TipoIntervalo> tipointervalos,TipoIntervalo tipointervalo,ParametroContabilidadDefectoBeanSwingJInternalFrame parametrocontabilidaddefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocontabilidaddefectoBeanSwingJInternalFrame=new ParametroContabilidadDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocontabilidaddefectoBeanSwingJInternalFrame.getParametroContabilidadDefectoLogic().setConnexion(this.tipointervaloLogic.getConnexion());

					parametrocontabilidaddefectoBeanSwingJInternalFrame.settipointervalosForeignKey(tipointervalos);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.settipointervaloForeignKey(tipointervalo);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoIntervalo(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.parametrocontabilidaddefectoSessionBean.setlidTipoIntervaloActual(tipointervalo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocontabilidaddefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroContabilidadDefecto(parametrocontabilidaddefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIntervalo(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setid_tipo_intervaloFK_IdTipoIntervalo(tipointervalo.getId());

					if(!this.conCargarFormDetalle) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocontabilidaddefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIntervaloForeignKey(tipointervalo,1,false,true,true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocontabilidaddefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIntervalo");
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIntervalo");
					parametrocontabilidaddefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroContabilidadDefecto(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroContabilidadDefecto("n",parametrocontabilidaddefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocontabilidaddefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocontabilidaddefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("relacionado");
					} else {
						parametrocontabilidaddefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroContabilidadDefecto("no_relacionado");
					}

					parametrocontabilidaddefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroContabilidadDefecto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTablaAmortiDetalleBeanSwingJInternalFrame(List<TipoIntervalo> tipointervalos,TipoIntervalo tipointervalo,TablaAmortiDetalleBeanSwingJInternalFrame tablaamortidetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tablaamortidetalleBeanSwingJInternalFrame=new TablaAmortiDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tablaamortidetalleBeanSwingJInternalFrame.getTablaAmortiDetalleLogic().setConnexion(this.tipointervaloLogic.getConnexion());

					tablaamortidetalleBeanSwingJInternalFrame.settipointervalosForeignKey(tipointervalos);
					tablaamortidetalleBeanSwingJInternalFrame.settipointervaloForeignKey(tipointervalo);
					tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.setisBusquedaDesdeForeignKeySesionTipoIntervalo(true);
					tablaamortidetalleBeanSwingJInternalFrame.tablaamortidetalleSessionBean.setlidTipoIntervaloActual(tipointervalo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tablaamortidetalleBeanSwingJInternalFrame.cargarCombosForeignKeyTablaAmortiDetalle(tablaamortidetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					tablaamortidetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIntervalo(true);
					tablaamortidetalleBeanSwingJInternalFrame.setid_tipo_intervaloFK_IdTipoIntervalo(tipointervalo.getId());

					if(!this.conCargarFormDetalle) {
						tablaamortidetalleBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tablaamortidetalleBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIntervaloForeignKey(tipointervalo,1,false,true,true);
					tablaamortidetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tablaamortidetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIntervalo");
					tablaamortidetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIntervalo");
					tablaamortidetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaTablaAmortiDetalle(true);
					tablaamortidetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTablaAmortiDetalle("n",tablaamortidetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, tablaamortidetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tablaamortidetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					tablaamortidetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tablaamortidetalleBeanSwingJInternalFrame.actualizarEstadoPanelsTablaAmortiDetalle("relacionado");
					} else {
						tablaamortidetalleBeanSwingJInternalFrame.actualizarEstadoPanelsTablaAmortiDetalle("no_relacionado");
					}

					tablaamortidetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionTablaAmortiDetalle().setVisible(false);

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
