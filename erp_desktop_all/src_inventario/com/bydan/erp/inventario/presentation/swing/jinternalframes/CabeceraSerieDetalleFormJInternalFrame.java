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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.CabeceraSerieConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class CabeceraSerieDetalleFormJInternalFrame extends CabeceraSerieBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCabeceraSerie;
	
	protected JMenuBar jmenuBarDetalleCabeceraSerie;
	
	protected JMenu jmenuDetalleCabeceraSerie;
	protected JMenu jmenuDetalleArchivoCabeceraSerie;
	protected JMenu jmenuDetalleAccionesCabeceraSerie;
	protected JMenu jmenuDetalleDatosCabeceraSerie;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCabeceraSerie;	
	protected GridBagConstraints gridBagConstraintsCabeceraSerie;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CabeceraSerieBeanSwingJInternalFrameAdditional jInternalFrameDetalleCabeceraSerie;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public CabeceraSerieSessionBean cabeceraserieSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public CabeceraSerieLogic cabeceraserieLogic;
	
	public JScrollPane jScrollPanelDatosCabeceraSerie;
	public JScrollPane jScrollPanelDatosEdicionCabeceraSerie;
	public JScrollPane jScrollPanelDatosGeneralCabeceraSerie;
	
	protected JPanel jPanelCamposCabeceraSerie;    
	protected JPanel jPanelCamposOcultosCabeceraSerie;    	
	protected JPanel jPanelAccionesCabeceraSerie;
	protected JPanel jPanelAccionesFormularioCabeceraSerie;
    
	
	
	protected Integer iXPanelCamposCabeceraSerie=0;
	protected Integer iYPanelCamposCabeceraSerie=0;
	
	protected Integer iXPanelCamposOcultosCabeceraSerie=0;
	protected Integer iYPanelCamposOcultosCabeceraSerie=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCabeceraSerie;
	public JButton jButtonModificarCabeceraSerie;
	public JButton jButtonActualizarCabeceraSerie;
    public JButton jButtonEliminarCabeceraSerie;
	public JButton jButtonCancelarCabeceraSerie;
    public JButton jButtonGuardarCambiosCabeceraSerie;
	public JButton jButtonGuardarCambiosTablaCabeceraSerie;
	protected JButton jButtonCerrarCabeceraSerie;
	
	
	protected JButton jButtonProcesarInformacionCabeceraSerie;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCabeceraSerie;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCabeceraSerie;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCabeceraSerie;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCabeceraSerie;
	protected JButton jButtonModificarToolBarCabeceraSerie;
	protected JButton jButtonActualizarToolBarCabeceraSerie;
    protected JButton jButtonEliminarToolBarCabeceraSerie;
	protected JButton jButtonCancelarToolBarCabeceraSerie;
    protected JButton jButtonGuardarCambiosToolBarCabeceraSerie;
	protected JButton jButtonGuardarCambiosTablaToolBarCabeceraSerie;
	protected JButton jButtonMostrarOcultarTablaToolBarCabeceraSerie;
	protected JButton jButtonCerrarToolBarCabeceraSerie;
	
	protected JButton jButtonProcesarInformacionToolBarCabeceraSerie;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCabeceraSerie;
	protected JMenuItem jMenuItemModificarCabeceraSerie;
	protected JMenuItem jMenuItemActualizarCabeceraSerie;
    protected JMenuItem jMenuItemEliminarCabeceraSerie;
	protected JMenuItem jMenuItemCancelarCabeceraSerie;
    protected JMenuItem jMenuItemGuardarCambiosCabeceraSerie;
	protected JMenuItem jMenuItemGuardarCambiosTablaCabeceraSerie;
	protected JMenuItem jMenuItemCerrarCabeceraSerie;
	protected JMenuItem jMenuItemDetalleCerrarCabeceraSerie;
	protected JMenuItem jMenuItemDetalleMostarOcultarCabeceraSerie;
	
	protected JMenuItem jMenuItemProcesarInformacionCabeceraSerie;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCabeceraSerie;
	protected JMenuItem jMenuItemMostrarOcultarCabeceraSerie;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCabeceraSerie;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCabeceraSerie;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCabeceraSerie;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCabeceraSerie;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCabeceraSerie;
	public JLabel jLabelIdCabeceraSerie;
	public JLabel jLabelidCabeceraSerie;
	public JButton jButtonidCabeceraSerieBusqueda= new JButtonMe();

	public JPanel jPanelnombreCabeceraSerie;
	public JLabel jLabelnombreCabeceraSerie;
	public JTextField jTextFieldnombreCabeceraSerie;
	public JButton jButtonnombreCabeceraSerieBusqueda= new JButtonMe();

	public JPanel jPanelformulaCabeceraSerie;
	public JLabel jLabelformulaCabeceraSerie;
	public JTextArea jTextAreaformulaCabeceraSerie;
	public JScrollPane jscrollPaneformulaCabeceraSerie;
	public JButton jButtonformulaCabeceraSerieBusqueda= new JButtonMe();

	public JPanel jPanelcon_formulaCabeceraSerie;
	public JLabel jLabelcon_formulaCabeceraSerie;
	public JCheckBox jCheckBoxcon_formulaCabeceraSerie;
	public JButton jButtoncon_formulaCabeceraSerieBusqueda= new JButtonMe();

	public JPanel jPanelcon_totalizarCabeceraSerie;
	public JLabel jLabelcon_totalizarCabeceraSerie;
	public JCheckBox jCheckBoxcon_totalizarCabeceraSerie;
	public JButton jButtoncon_totalizarCabeceraSerieBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCabeceraSerie;
	public JLabel jLabelid_empresaCabeceraSerie;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCabeceraSerie;
	public JButton jButtonid_empresaCabeceraSerie= new JButtonMe();
	public JButton jButtonid_empresaCabeceraSerieUpdate= new JButtonMe();
	public JButton jButtonid_empresaCabeceraSerieBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCabeceraSerie;
	
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
	
	public CabeceraSerieDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCabeceraSerie=new JPanel();
				this.jPanelAccionesFormularioCabeceraSerie=new JPanel();
				this.jmenuBarDetalleCabeceraSerie=new JMenuBar();
				this.jTtoolBarDetalleCabeceraSerie=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CabeceraSerieDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CabeceraSerieDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CabeceraSerie No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCabeceraSerie() {
		return this.jButtonActualizarToolBarCabeceraSerie;
	}
	
	public JButton getjButtonEliminarToolBarCabeceraSerie() {
		return this.jButtonEliminarToolBarCabeceraSerie;
	}
	
	public JButton getjButtonCancelarToolBarCabeceraSerie() {
		return this.jButtonCancelarToolBarCabeceraSerie;
	}		
	
	public JButton getjButtonProcesarInformacionCabeceraSerie() {
		return this.jButtonProcesarInformacionCabeceraSerie;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCabeceraSerie)	{
		this.jButtonProcesarInformacionCabeceraSerie = jButtonProcesarInformacionCabeceraSerie;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCabeceraSerie() {
		return this.jComboBoxTiposAccionesCabeceraSerie;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCabeceraSerie(
			JComboBox jComboBoxTiposRelacionesCabeceraSerie) {
		this.jComboBoxTiposRelacionesCabeceraSerie = jComboBoxTiposRelacionesCabeceraSerie;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCabeceraSerie(
			JComboBox jComboBoxTiposAccionesCabeceraSerie) {
		this.jComboBoxTiposAccionesCabeceraSerie = jComboBoxTiposAccionesCabeceraSerie;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCabeceraSerie() {
		return this.jComboBoxTiposAccionesFormularioCabeceraSerie;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCabeceraSerie(
			JComboBox jComboBoxTiposAccionesFormularioCabeceraSerie) {
		this.jComboBoxTiposAccionesFormularioCabeceraSerie = jComboBoxTiposAccionesFormularioCabeceraSerie;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cabeceraserieSessionBean=new CabeceraSerieSessionBean();
		
		this.cabeceraserieSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cabeceraserieSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cabeceraserieSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CabeceraSerieJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CabeceraSerieJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CabeceraSerieJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cabecera Serie MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
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
	
		CabeceraSerieJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCabeceraSerie= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCabeceraSerie=new JButtonMe();
				this.jButtonModificarToolBarCabeceraSerie=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCabeceraSerie,this.jTtoolBarDetalleCabeceraSerie,
							"actualizar","actualizar","Actualizar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCabeceraSerie,this.jTtoolBarDetalleCabeceraSerie,
							"eliminar","eliminar","Eliminar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCabeceraSerie,this.jTtoolBarDetalleCabeceraSerie,
							"cancelar","cancelar","Cancelar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCabeceraSerie=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCabeceraSerie,this.jTtoolBarDetalleCabeceraSerie,
							"guardarcambios","guardarcambios","Guardar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCabeceraSerie=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCabeceraSerie=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCabeceraSerie=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCabeceraSerie=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCabeceraSerie=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCabeceraSerie= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCabeceraSerie.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCabeceraSerie,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCabeceraSerie= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCabeceraSerie.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCabeceraSerie,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCabeceraSerie= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCabeceraSerie.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCabeceraSerie,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCabeceraSerie= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCabeceraSerie.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCabeceraSerie,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCabeceraSerie= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCabeceraSerie.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCabeceraSerie,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCabeceraSerie= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCabeceraSerie.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCabeceraSerie,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCabeceraSerie= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCabeceraSerie.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCabeceraSerie,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCabeceraSerie= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCabeceraSerie.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCabeceraSerie,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCabeceraSerie= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCabeceraSerie.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCabeceraSerie,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCabeceraSerie= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCabeceraSerie.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCabeceraSerie,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCabeceraSerie.add(this.jMenuItemDetalleCerrarCabeceraSerie);
		
		this.jmenuDetalleAccionesCabeceraSerie.add(this.jMenuItemActualizarCabeceraSerie);
		this.jmenuDetalleAccionesCabeceraSerie.add(this.jMenuItemEliminarCabeceraSerie);
		this.jmenuDetalleAccionesCabeceraSerie.add(this.jMenuItemCancelarCabeceraSerie);		
		
		//this.jmenuDetalleDatosCabeceraSerie.add(this.jMenuItemDetalleAbrirOrderByCabeceraSerie);				
		this.jmenuDetalleDatosCabeceraSerie.add(this.jMenuItemDetalleMostarOcultarCabeceraSerie);				
				
		//this.jmenuDetalleAccionesCabeceraSerie.add(this.jMenuItemGuardarCambiosCabeceraSerie);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCabeceraSerie.add(this.jmenuDetalleArchivoCabeceraSerie);		
		this.jmenuBarDetalleCabeceraSerie.add(this.jmenuDetalleAccionesCabeceraSerie);		
		this.jmenuBarDetalleCabeceraSerie.add(this.jmenuDetalleDatosCabeceraSerie);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCabeceraSerie);				
	}
	
	
	public void inicializarElementosCamposCabeceraSerie() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCabeceraSerie = new JLabelMe();
		jLabelIdCabeceraSerie.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCabeceraSerie = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCabeceraSerie.setToolTipText(CabeceraSerieConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCabeceraSerie= new GridBagLayout();

		this.jPanelidCabeceraSerie.setLayout(this.gridaBagLayoutCabeceraSerie);

		jLabelidCabeceraSerie = new JLabel();
		jLabelidCabeceraSerie.setText("Id");

		jLabelidCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCabeceraSerie = new JLabelMe();
		this.jLabelnombreCabeceraSerie.setText(""+CabeceraSerieConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCabeceraSerie.setToolTipText("Nombre");
		this.jLabelnombreCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCabeceraSerie=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCabeceraSerie.setToolTipText(CabeceraSerieConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCabeceraSerie = new GridBagLayout();
		this.jPanelnombreCabeceraSerie.setLayout(this.gridaBagLayoutCabeceraSerie);


		jTextFieldnombreCabeceraSerie= new JTextFieldMe();

		jTextFieldnombreCabeceraSerie.setEnabled(false);
		jTextFieldnombreCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreCabeceraSerieBusqueda= new JButtonMe();
		this.jButtonnombreCabeceraSerieBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCabeceraSerieBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCabeceraSerieBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCabeceraSerieBusqueda.setText("U");
		this.jButtonnombreCabeceraSerieBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCabeceraSerieBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCabeceraSerieBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCabeceraSerieBusqueda"));

		if(this.cabeceraserieSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCabeceraSerieBusqueda.setVisible(false);		}


					
		this.jLabelformulaCabeceraSerie = new JLabelMe();
		this.jLabelformulaCabeceraSerie.setText(""+CabeceraSerieConstantesFunciones.LABEL_FORMULA+" :");
		this.jLabelformulaCabeceraSerie.setToolTipText("Formula");
		this.jLabelformulaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformulaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformulaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelformulaCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelformulaCabeceraSerie=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelformulaCabeceraSerie.setToolTipText(CabeceraSerieConstantesFunciones.LABEL_FORMULA);
		this.gridaBagLayoutCabeceraSerie = new GridBagLayout();
		this.jPanelformulaCabeceraSerie.setLayout(this.gridaBagLayoutCabeceraSerie);


		jTextAreaformulaCabeceraSerie= new JTextAreaMe();
		jTextAreaformulaCabeceraSerie.setEnabled(false);
		jTextAreaformulaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaCabeceraSerie.setLineWrap(true);
		jTextAreaformulaCabeceraSerie.setWrapStyleWord(true);
		jTextAreaformulaCabeceraSerie.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaformulaCabeceraSerie.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaformulaCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneformulaCabeceraSerie = new JScrollPane(jTextAreaformulaCabeceraSerie);
		jscrollPaneformulaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneformulaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneformulaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonformulaCabeceraSerieBusqueda= new JButtonMe();
		this.jButtonformulaCabeceraSerieBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformulaCabeceraSerieBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformulaCabeceraSerieBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonformulaCabeceraSerieBusqueda.setText("U");
		this.jButtonformulaCabeceraSerieBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonformulaCabeceraSerieBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonformulaCabeceraSerieBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaformulaCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaformulaCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"formulaCabeceraSerieBusqueda"));

		if(this.cabeceraserieSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonformulaCabeceraSerieBusqueda.setVisible(false);		}


					
		this.jLabelcon_formulaCabeceraSerie = new JLabelMe();
		this.jLabelcon_formulaCabeceraSerie.setText(""+CabeceraSerieConstantesFunciones.LABEL_CONFORMULA+" : *");
		this.jLabelcon_formulaCabeceraSerie.setToolTipText("Con Formula");
		this.jLabelcon_formulaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_formulaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_formulaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_formulaCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_formulaCabeceraSerie=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_formulaCabeceraSerie.setToolTipText(CabeceraSerieConstantesFunciones.LABEL_CONFORMULA);
		this.gridaBagLayoutCabeceraSerie = new GridBagLayout();
		this.jPanelcon_formulaCabeceraSerie.setLayout(this.gridaBagLayoutCabeceraSerie);


		jCheckBoxcon_formulaCabeceraSerie= new JCheckBoxMe();
		jCheckBoxcon_formulaCabeceraSerie.setEnabled(false);

		jCheckBoxcon_formulaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_formulaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_formulaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_formulaCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_formulaCabeceraSerieBusqueda= new JButtonMe();
		this.jButtoncon_formulaCabeceraSerieBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_formulaCabeceraSerieBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_formulaCabeceraSerieBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_formulaCabeceraSerieBusqueda.setText("U");
		this.jButtoncon_formulaCabeceraSerieBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_formulaCabeceraSerieBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_formulaCabeceraSerieBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_formulaCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_formulaCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_formulaCabeceraSerieBusqueda"));

		if(this.cabeceraserieSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_formulaCabeceraSerieBusqueda.setVisible(false);		}


					
		this.jLabelcon_totalizarCabeceraSerie = new JLabelMe();
		this.jLabelcon_totalizarCabeceraSerie.setText(""+CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR+" : *");
		this.jLabelcon_totalizarCabeceraSerie.setToolTipText("Con Totalizar");
		this.jLabelcon_totalizarCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_totalizarCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_totalizarCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_totalizarCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_totalizarCabeceraSerie=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_totalizarCabeceraSerie.setToolTipText(CabeceraSerieConstantesFunciones.LABEL_CONTOTALIZAR);
		this.gridaBagLayoutCabeceraSerie = new GridBagLayout();
		this.jPanelcon_totalizarCabeceraSerie.setLayout(this.gridaBagLayoutCabeceraSerie);


		jCheckBoxcon_totalizarCabeceraSerie= new JCheckBoxMe();
		jCheckBoxcon_totalizarCabeceraSerie.setEnabled(false);

		jCheckBoxcon_totalizarCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_totalizarCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_totalizarCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_totalizarCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_totalizarCabeceraSerieBusqueda= new JButtonMe();
		this.jButtoncon_totalizarCabeceraSerieBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_totalizarCabeceraSerieBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_totalizarCabeceraSerieBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_totalizarCabeceraSerieBusqueda.setText("U");
		this.jButtoncon_totalizarCabeceraSerieBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_totalizarCabeceraSerieBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_totalizarCabeceraSerieBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_totalizarCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_totalizarCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_totalizarCabeceraSerieBusqueda"));

		if(this.cabeceraserieSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_totalizarCabeceraSerieBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCabeceraSerie() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCabeceraSerie = new JLabelMe();
		this.jLabelid_empresaCabeceraSerie.setText(""+CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCabeceraSerie.setToolTipText("Empresa");
		this.jLabelid_empresaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCabeceraSerie=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCabeceraSerie.setToolTipText(CabeceraSerieConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCabeceraSerie = new GridBagLayout();
		this.jPanelid_empresaCabeceraSerie.setLayout(this.gridaBagLayoutCabeceraSerie);


		jComboBoxid_empresaCabeceraSerie= new JComboBoxMe();
		jComboBoxid_empresaCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCabeceraSerie.setEnabled(false);

		this.jButtonid_empresaCabeceraSerie= new JButtonMe();
		this.jButtonid_empresaCabeceraSerie.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCabeceraSerie.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCabeceraSerie.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCabeceraSerie.setText("Buscar");
		this.jButtonid_empresaCabeceraSerie.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCabeceraSerie.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCabeceraSerie,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCabeceraSerie"));

		this.jButtonid_empresaCabeceraSerieBusqueda= new JButtonMe();
		this.jButtonid_empresaCabeceraSerieBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCabeceraSerieBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCabeceraSerieBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCabeceraSerieBusqueda.setText("U");
		this.jButtonid_empresaCabeceraSerieBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCabeceraSerieBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCabeceraSerieBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCabeceraSerieBusqueda"));

		if(this.cabeceraserieSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCabeceraSerieBusqueda.setVisible(false);		}

		this.jButtonid_empresaCabeceraSerieUpdate= new JButtonMe();
		this.jButtonid_empresaCabeceraSerieUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCabeceraSerieUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCabeceraSerieUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCabeceraSerieUpdate.setText("U");
		this.jButtonid_empresaCabeceraSerieUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCabeceraSerieUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCabeceraSerieUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCabeceraSerie.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCabeceraSerie.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCabeceraSerieUpdate"));



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
		//this.jInternalFrameDetalleCabeceraSerie = new CabeceraSerieBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cabecera Serie DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCabeceraSerie= new GridBagLayout();
		

		
		String sToolTipCabeceraSerie="";
		sToolTipCabeceraSerie=CabeceraSerieConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCabeceraSerie+="(Inventario.CabeceraSerie)";
		}
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			sToolTipCabeceraSerie+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCabeceraSerie = new JButtonMe();
		this.jButtonModificarCabeceraSerie = new JButtonMe();
        this.jButtonActualizarCabeceraSerie = new JButtonMe();
        this.jButtonEliminarCabeceraSerie = new JButtonMe();
        this.jButtonCancelarCabeceraSerie = new JButtonMe();
        this.jButtonGuardarCambiosCabeceraSerie = new JButtonMe();
		this.jButtonGuardarCambiosTablaCabeceraSerie = new JButtonMe();
		this.jButtonCerrarCabeceraSerie = new JButtonMe();
		
		this.jScrollPanelDatosCabeceraSerie = new JScrollPane();   
        this.jScrollPanelDatosEdicionCabeceraSerie = new JScrollPane();
		this.jScrollPanelDatosGeneralCabeceraSerie = new JScrollPane();
				
		
		
		this.jPanelCamposCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cabecera Serie";
		
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cabecera Seriees" + this.sPath));
		} else {
			this.jScrollPanelDatosCabeceraSerie.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCabeceraSerie.setName("jPanelCamposCabeceraSerie"); 

		this.jPanelCamposOcultosCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCabeceraSerie.setName("jPanelCamposOcultosCabeceraSerie"); 

        this.jPanelAccionesCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCabeceraSerie.setToolTipText("Acciones");
        this.jPanelAccionesCabeceraSerie.setName("Acciones"); 

		this.jPanelAccionesFormularioCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCabeceraSerie.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCabeceraSerie.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCabeceraSerie.setText("Nuevo");
		this.jButtonModificarCabeceraSerie.setText("Editar");
        this.jButtonActualizarCabeceraSerie.setText("Actualizar");
        this.jButtonEliminarCabeceraSerie.setText("Eliminar");
        this.jButtonCancelarCabeceraSerie.setText("Cancelar");
        this.jButtonGuardarCambiosCabeceraSerie.setText("Guardar");
		this.jButtonGuardarCambiosTablaCabeceraSerie.setText("Guardar");
		this.jButtonCerrarCabeceraSerie.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCabeceraSerie,"nuevo_button","Nuevo",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCabeceraSerie,"modificar_button","Editar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCabeceraSerie,"actualizar_button","Actualizar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCabeceraSerie,"eliminar_button","Eliminar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCabeceraSerie,"cancelar_button","Cancelar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCabeceraSerie,"guardarcambios_button","Guardar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCabeceraSerie,"guardarcambiostabla_button","Guardar",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCabeceraSerie,"cerrar_button","Salir",this.cabeceraserieSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCabeceraSerie.setToolTipText("Nuevo"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCabeceraSerie.setToolTipText("Editar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCabeceraSerie.setToolTipText("Actualizar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCabeceraSerie.setToolTipText("Eliminar)"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCabeceraSerie.setToolTipText("Cancelar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCabeceraSerie.setToolTipText("Guardar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCabeceraSerie.setToolTipText("Guardar"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCabeceraSerie.setToolTipText("Salir"+" "+CabeceraSerieConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCabeceraSerie";
		inputMap = this.jButtonNuevoCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCabeceraSerie.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCabeceraSerie"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCabeceraSerie";
		inputMap = this.jButtonActualizarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCabeceraSerie"));
		
		//ELIMINAR
		sMapKey = "EliminarCabeceraSerie";
		inputMap = this.jButtonEliminarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCabeceraSerie"));
		
		//CANCELAR	
		sMapKey = "CancelarCabeceraSerie";
		inputMap = this.jButtonCancelarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCabeceraSerie"));
		
		//CERRAR		
		sMapKey = "CerrarCabeceraSerie";
		inputMap = this.jButtonCerrarCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCabeceraSerie"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCabeceraSerie";
		inputMap = this.jButtonGuardarCambiosTablaCabeceraSerie.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCabeceraSerie.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCabeceraSerie"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCabeceraSerie = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCabeceraSerie.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCabeceraSerie.setToolTipText("Nuevo CabeceraSerie");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCabeceraSerie = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCabeceraSerie.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCabeceraSerie.setToolTipText("Sin Cerrar Ventana CabeceraSerie");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCabeceraSerie = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCabeceraSerie.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCabeceraSerie.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCabeceraSerie.setText("Accion");
		this.jComboBoxTiposAccionesCabeceraSerie.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCabeceraSerie = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCabeceraSerie.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCabeceraSerie.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCabeceraSerie = new JLabelMe();
		
		this.jLabelAccionesCabeceraSerie.setText("Acciones");		
		this.jLabelAccionesCabeceraSerie.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCabeceraSerie.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCabeceraSerie.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCabeceraSerie();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCabeceraSerie();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCabeceraSerie=new JTabbedPane();
		this.jTabbedPaneRelacionesCabeceraSerie.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCabeceraSerie,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCabeceraSerie.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCabeceraSerie.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCabeceraSerie.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCabeceraSerie, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCabeceraSerie.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCabeceraSerie.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCabeceraSerie.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCabeceraSerie, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCabeceraSerie = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCabeceraSerie = new GridBagLayout();
		
		this.jPanelCamposCabeceraSerie.setLayout(gridaBagLayoutCamposCabeceraSerie);
		this.jPanelCamposOcultosCabeceraSerie.setLayout(gridaBagLayoutCamposOcultosCabeceraSerie);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 0;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCabeceraSerie.add(jLabelIdCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 1;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCabeceraSerie.add(jLabelidCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 0;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCabeceraSerie.add(jLabelid_empresaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 2;
		this.gridBagConstraintsCabeceraSerie.ipadx = 0;
		this.gridBagConstraintsCabeceraSerie.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCabeceraSerie.add(jButtonid_empresaCabeceraSerieBusqueda, this.gridBagConstraintsCabeceraSerie);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 3;
		this.gridBagConstraintsCabeceraSerie.ipadx = 0;
		this.gridBagConstraintsCabeceraSerie.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCabeceraSerie.add(jButtonid_empresaCabeceraSerieUpdate, this.gridBagConstraintsCabeceraSerie);
	}

	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 1;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCabeceraSerie.add(jComboBoxid_empresaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 0;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCabeceraSerie.add(jLabelnombreCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 2;
		this.gridBagConstraintsCabeceraSerie.ipadx = 0;
		this.gridBagConstraintsCabeceraSerie.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCabeceraSerie.add(jButtonnombreCabeceraSerieBusqueda, this.gridBagConstraintsCabeceraSerie);
	}

	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 1;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCabeceraSerie.add(jTextFieldnombreCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 0;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelformulaCabeceraSerie.add(jLabelformulaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 2;
		this.gridBagConstraintsCabeceraSerie.ipadx = 0;
		this.gridBagConstraintsCabeceraSerie.insets = new Insets(0, 0, 0, 0);
		this.jPanelformulaCabeceraSerie.add(jButtonformulaCabeceraSerieBusqueda, this.gridBagConstraintsCabeceraSerie);
	}

	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 1;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelformulaCabeceraSerie.add(jscrollPaneformulaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 0;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_formulaCabeceraSerie.add(jLabelcon_formulaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 2;
		this.gridBagConstraintsCabeceraSerie.ipadx = 0;
		this.gridBagConstraintsCabeceraSerie.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_formulaCabeceraSerie.add(jButtoncon_formulaCabeceraSerieBusqueda, this.gridBagConstraintsCabeceraSerie);
	}

	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 1;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_formulaCabeceraSerie.add(jCheckBoxcon_formulaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 0;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_totalizarCabeceraSerie.add(jLabelcon_totalizarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		//this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = 2;
		this.gridBagConstraintsCabeceraSerie.ipadx = 0;
		this.gridBagConstraintsCabeceraSerie.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_totalizarCabeceraSerie.add(jButtoncon_totalizarCabeceraSerieBusqueda, this.gridBagConstraintsCabeceraSerie);
	}

	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCabeceraSerie.gridy = 0;
	this.gridBagConstraintsCabeceraSerie.gridx = 1;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_totalizarCabeceraSerie.add(jCheckBoxcon_totalizarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCabeceraSerie.gridy = iYPanelCamposCabeceraSerie;
	this.gridBagConstraintsCabeceraSerie.gridx = iXPanelCamposCabeceraSerie++;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCabeceraSerie.add(this.jPanelidCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(iXPanelCamposCabeceraSerie % 1==0) {
		iXPanelCamposCabeceraSerie=0;
		iYPanelCamposCabeceraSerie++;
	}
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCabeceraSerie.gridy = iYPanelCamposCabeceraSerie;
	this.gridBagConstraintsCabeceraSerie.gridx = iXPanelCamposCabeceraSerie++;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCabeceraSerie.add(this.jPanelnombreCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(iXPanelCamposCabeceraSerie % 1==0) {
		iXPanelCamposCabeceraSerie=0;
		iYPanelCamposCabeceraSerie++;
	}
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCabeceraSerie.gridy = iYPanelCamposCabeceraSerie;
	this.gridBagConstraintsCabeceraSerie.gridx = iXPanelCamposCabeceraSerie++;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCabeceraSerie.add(this.jPanelformulaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(iXPanelCamposCabeceraSerie % 1==0) {
		iXPanelCamposCabeceraSerie=0;
		iYPanelCamposCabeceraSerie++;
	}
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCabeceraSerie.gridy = iYPanelCamposCabeceraSerie;
	this.gridBagConstraintsCabeceraSerie.gridx = iXPanelCamposCabeceraSerie++;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCabeceraSerie.add(this.jPanelcon_formulaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(iXPanelCamposCabeceraSerie % 1==0) {
		iXPanelCamposCabeceraSerie=0;
		iYPanelCamposCabeceraSerie++;
	}
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCabeceraSerie.gridy = iYPanelCamposCabeceraSerie;
	this.gridBagConstraintsCabeceraSerie.gridx = iXPanelCamposCabeceraSerie++;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCabeceraSerie.add(this.jPanelcon_totalizarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(iXPanelCamposCabeceraSerie % 1==0) {
		iXPanelCamposCabeceraSerie=0;
		iYPanelCamposCabeceraSerie++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCabeceraSerie.gridy = iYPanelCamposOcultosCabeceraSerie;
	this.gridBagConstraintsCabeceraSerie.gridx = iXPanelCamposOcultosCabeceraSerie++;
	this.gridBagConstraintsCabeceraSerie.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCabeceraSerie.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCabeceraSerie.add(this.jPanelid_empresaCabeceraSerie, this.gridBagConstraintsCabeceraSerie);



	if(iXPanelCamposOcultosCabeceraSerie % 1==0) {
		iXPanelCamposOcultosCabeceraSerie=0;
		iYPanelCamposOcultosCabeceraSerie++;
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
			
		GridBagLayout gridaBagLayoutAccionesCabeceraSerie= new GridBagLayout();
		this.jPanelAccionesCabeceraSerie.setLayout(gridaBagLayoutAccionesCabeceraSerie);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCabeceraSerie= new GridBagLayout();
		this.jPanelAccionesFormularioCabeceraSerie.setLayout(gridaBagLayoutAccionesFormularioCabeceraSerie);
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCabeceraSerie.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCabeceraSerie.add(this.jComboBoxTiposAccionesFormularioCabeceraSerie, this.gridBagConstraintsCabeceraSerie);

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCabeceraSerie.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCabeceraSerie.add(this.jCheckBoxPostAccionNuevoCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCabeceraSerie.add(this.jCheckBoxPostAccionSinCerrarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cabeceraserieSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cabeceraserieSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCabeceraSerie.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCabeceraSerie.add(this.jCheckBoxPostAccionSinMensajeCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccion++;
			
		this.jPanelAccionesCabeceraSerie.add(this.jButtonModificarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);							

		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCabeceraSerie.gridy = 0;
		this.gridBagConstraintsCabeceraSerie.gridx =iPosXAccion++;
			
		this.jPanelAccionesCabeceraSerie.add(this.jButtonEliminarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
			
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = 0;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccion++;
		
		this.jPanelAccionesCabeceraSerie.add(this.jButtonActualizarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);


		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = 0;		
		this.gridBagConstraintsCabeceraSerie.gridx = iPosXAccion++;
		
		this.jPanelAccionesCabeceraSerie.add(this.jButtonGuardarCambiosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);	
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = 0;		
		this.gridBagConstraintsCabeceraSerie.gridx =iPosXAccion++;
		
		this.jPanelAccionesCabeceraSerie.add(this.jButtonCancelarCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCabeceraSerie = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCabeceraSerie);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cabeceraserieSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();						
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCabeceraSerie.gridx = 0;		
			//this.gridBagConstraintsCabeceraSerie.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCabeceraSerie.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCabeceraSerie.gridx =0;
		this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCabeceraSerie.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CabeceraSerieJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCabeceraSerie = new CabeceraSerieBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cabecera Serie DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cabecera Serie DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cabecera Serie Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CabeceraSerieModel cabeceraserieModel=new CabeceraSerieModel(this);
			
			//SI USARA CLASE INTERNA
			//CabeceraSerieModel.CabeceraSerieFocusTraversalPolicy cabeceraserieFocusTraversalPolicy = cabeceraserieModel.new CabeceraSerieFocusTraversalPolicy(this);
			
			//cabeceraserieFocusTraversalPolicy.setcabeceraserieJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cabeceraserieModel);
			
			
			this.jContentPaneDetalleCabeceraSerie = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCabeceraSerie = new GridBagLayout();	
			this.jContentPaneDetalleCabeceraSerie.setLayout(gridaBagLayoutDetalleCabeceraSerie);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCabeceraSerie = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
				this.gridBagConstraintsCabeceraSerie.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCabeceraSerie.gridx = 0;
					
				
				this.jContentPaneDetalleCabeceraSerie.add(jTtoolBarDetalleCabeceraSerie, gridBagConstraintsCabeceraSerie);								
				
}
			
			this.jScrollPanelDatosEdicionCabeceraSerie=   new JScrollPane(jContentPaneDetalleCabeceraSerie,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCabeceraSerie.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCabeceraSerie.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCabeceraSerie.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCabeceraSerie=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCabeceraSerie.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCabeceraSerie.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCabeceraSerie.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCabeceraSerie.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCabeceraSerie.gridx = 0;
	        
			this.jContentPaneDetalleCabeceraSerie.add(jPanelCamposCabeceraSerie, gridBagConstraintsCabeceraSerie);
			
			
			
			
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
						&& cabeceraserieSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cabeceraserieSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCabeceraSerie= new GridBagConstraints();
						this.gridBagConstraintsCabeceraSerie.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCabeceraSerie.gridx = 0;
						this.jContentPaneDetalleCabeceraSerie.add(this.jTabbedPaneRelacionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCabeceraSerie.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCabeceraSerie.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
					this.gridBagConstraintsCabeceraSerie.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCabeceraSerie.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCabeceraSerie.gridx = 0;
					
				
					this.jContentPaneDetalleCabeceraSerie.add(jPanelCamposOcultosCabeceraSerie, gridBagConstraintsCabeceraSerie);
				
					this.jPanelCamposOcultosCabeceraSerie.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCabeceraSerie.gridx = 0;
	        this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCabeceraSerie.add(this.jPanelAccionesFormularioCabeceraSerie, this.gridBagConstraintsCabeceraSerie);							
			
			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
	        this.gridBagConstraintsCabeceraSerie.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCabeceraSerie.gridx = 0;
	        
			
			this.jContentPaneDetalleCabeceraSerie.add(this.jPanelAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCabeceraSerie);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCabeceraSerie=   new JScrollPane(this.jPanelCamposCabeceraSerie,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCabeceraSerie.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCabeceraSerie.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCabeceraSerie.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCabeceraSerie.gridx = 0;
			this.gridBagConstraintsCabeceraSerie.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCabeceraSerie.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCabeceraSerie.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCabeceraSerie.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCabeceraSerie, this.gridBagConstraintsCabeceraSerie);			
			
			this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
			this.gridBagConstraintsCabeceraSerie.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCabeceraSerie.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
			
			
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		
			
		this.gridBagConstraintsCabeceraSerie = new GridBagConstraints();
		this.gridBagConstraintsCabeceraSerie.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCabeceraSerie.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCabeceraSerie, this.gridBagConstraintsCabeceraSerie);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCabeceraSerie;//jContentPane;
		
		return jScrollPanelDatosEdicionCabeceraSerie;
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
