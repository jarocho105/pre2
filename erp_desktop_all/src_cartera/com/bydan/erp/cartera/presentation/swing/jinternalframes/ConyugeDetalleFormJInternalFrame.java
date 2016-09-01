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
import com.bydan.erp.cartera.util.ConyugeConstantesFunciones;

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
public class ConyugeDetalleFormJInternalFrame extends ConyugeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConyuge;
	
	protected JMenuBar jmenuBarDetalleConyuge;
	
	protected JMenu jmenuDetalleConyuge;
	protected JMenu jmenuDetalleArchivoConyuge;
	protected JMenu jmenuDetalleAccionesConyuge;
	protected JMenu jmenuDetalleDatosConyuge;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConyuge;	
	protected GridBagConstraints gridBagConstraintsConyuge;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConyugeBeanSwingJInternalFrameAdditional jInternalFrameDetalleConyuge;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";
	
	public ConyugeSessionBean conyugeSessionBean;
	
	
	
	
	public ClienteSessionBean clienteSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;	
	
	public ConyugeLogic conyugeLogic;
	
	public JScrollPane jScrollPanelDatosConyuge;
	public JScrollPane jScrollPanelDatosEdicionConyuge;
	public JScrollPane jScrollPanelDatosGeneralConyuge;
	
	protected JPanel jPanelCamposConyuge;    
	protected JPanel jPanelCamposOcultosConyuge;    	
	protected JPanel jPanelAccionesConyuge;
	protected JPanel jPanelAccionesFormularioConyuge;
    
	
	
	protected Integer iXPanelCamposConyuge=0;
	protected Integer iYPanelCamposConyuge=0;
	
	protected Integer iXPanelCamposOcultosConyuge=0;
	protected Integer iYPanelCamposOcultosConyuge=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConyuge;
	public JButton jButtonModificarConyuge;
	public JButton jButtonActualizarConyuge;
    public JButton jButtonEliminarConyuge;
	public JButton jButtonCancelarConyuge;
    public JButton jButtonGuardarCambiosConyuge;
	public JButton jButtonGuardarCambiosTablaConyuge;
	protected JButton jButtonCerrarConyuge;
	
	
	protected JButton jButtonProcesarInformacionConyuge;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConyuge;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConyuge;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConyuge;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConyuge;
	protected JButton jButtonModificarToolBarConyuge;
	protected JButton jButtonActualizarToolBarConyuge;
    protected JButton jButtonEliminarToolBarConyuge;
	protected JButton jButtonCancelarToolBarConyuge;
    protected JButton jButtonGuardarCambiosToolBarConyuge;
	protected JButton jButtonGuardarCambiosTablaToolBarConyuge;
	protected JButton jButtonMostrarOcultarTablaToolBarConyuge;
	protected JButton jButtonCerrarToolBarConyuge;
	
	protected JButton jButtonProcesarInformacionToolBarConyuge;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConyuge;
	protected JMenuItem jMenuItemModificarConyuge;
	protected JMenuItem jMenuItemActualizarConyuge;
    protected JMenuItem jMenuItemEliminarConyuge;
	protected JMenuItem jMenuItemCancelarConyuge;
    protected JMenuItem jMenuItemGuardarCambiosConyuge;
	protected JMenuItem jMenuItemGuardarCambiosTablaConyuge;
	protected JMenuItem jMenuItemCerrarConyuge;
	protected JMenuItem jMenuItemDetalleCerrarConyuge;
	protected JMenuItem jMenuItemDetalleMostarOcultarConyuge;
	
	protected JMenuItem jMenuItemProcesarInformacionConyuge;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConyuge;
	protected JMenuItem jMenuItemMostrarOcultarConyuge;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConyuge;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConyuge;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConyuge;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConyuge;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidentificacionConyuge;
	public JLabel jLabelidentificacionConyuge;
	public JTextField jTextFieldidentificacionConyuge;
	public JButton jButtonidentificacionConyugeBusqueda= new JButtonMe();

	public JPanel jPanelapellidopaternoConyuge;
	public JLabel jLabelapellidopaternoConyuge;
	public JTextArea jTextAreaapellidopaternoConyuge;
	public JScrollPane jscrollPaneapellidopaternoConyuge;
	public JButton jButtonapellidopaternoConyugeBusqueda= new JButtonMe();

	public JPanel jPanelapellidomaternoConyuge;
	public JLabel jLabelapellidomaternoConyuge;
	public JTextArea jTextAreaapellidomaternoConyuge;
	public JScrollPane jscrollPaneapellidomaternoConyuge;
	public JButton jButtonapellidomaternoConyugeBusqueda= new JButtonMe();

	public JPanel jPanelprimernombreConyuge;
	public JLabel jLabelprimernombreConyuge;
	public JTextArea jTextAreaprimernombreConyuge;
	public JScrollPane jscrollPaneprimernombreConyuge;
	public JButton jButtonprimernombreConyugeBusqueda= new JButtonMe();

	public JPanel jPanelsegundonombreConyuge;
	public JLabel jLabelsegundonombreConyuge;
	public JTextArea jTextAreasegundonombreConyuge;
	public JScrollPane jscrollPanesegundonombreConyuge;
	public JButton jButtonsegundonombreConyugeBusqueda= new JButtonMe();

	public JPanel jPanelnombrecortoConyuge;
	public JLabel jLabelnombrecortoConyuge;
	public JTextArea jTextAreanombrecortoConyuge;
	public JScrollPane jscrollPanenombrecortoConyuge;
	public JButton jButtonnombrecortoConyugeBusqueda= new JButtonMe();

	public JPanel jPanelesactivoConyuge;
	public JLabel jLabelesactivoConyuge;
	public JCheckBox jCheckBoxesactivoConyuge;
	public JButton jButtonesactivoConyugeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_clienteConyuge;
	public JLabel jLabelid_clienteConyuge;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteConyuge;
	public JButton jButtonid_clienteConyuge= new JButtonMe();
	public JButton jButtonid_clienteConyugeUpdate= new JButtonMe();
	public JButton jButtonid_clienteConyugeBusqueda= new JButtonMe();

	public JPanel jPanelidvaloridentificacionConyuge;
	public JLabel jLabelidvaloridentificacionConyuge;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxidvaloridentificacionConyuge;
	public JButton jButtonidvaloridentificacionConyuge= new JButtonMe();
	public JButton jButtonidvaloridentificacionConyugeUpdate= new JButtonMe();
	public JButton jButtonidvaloridentificacionConyugeBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConyuge;
	
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
	public int iHeightFormulario=1034;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConyugeDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConyuge=new JPanel();
				this.jPanelAccionesFormularioConyuge=new JPanel();
				this.jmenuBarDetalleConyuge=new JMenuBar();
				this.jTtoolBarDetalleConyuge=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConyugeDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConyugeDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Conyuge No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConyuge() {
		return this.jButtonActualizarToolBarConyuge;
	}
	
	public JButton getjButtonEliminarToolBarConyuge() {
		return this.jButtonEliminarToolBarConyuge;
	}
	
	public JButton getjButtonCancelarToolBarConyuge() {
		return this.jButtonCancelarToolBarConyuge;
	}		
	
	public JButton getjButtonProcesarInformacionConyuge() {
		return this.jButtonProcesarInformacionConyuge;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConyuge)	{
		this.jButtonProcesarInformacionConyuge = jButtonProcesarInformacionConyuge;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConyuge() {
		return this.jComboBoxTiposAccionesConyuge;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConyuge(
			JComboBox jComboBoxTiposRelacionesConyuge) {
		this.jComboBoxTiposRelacionesConyuge = jComboBoxTiposRelacionesConyuge;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConyuge(
			JComboBox jComboBoxTiposAccionesConyuge) {
		this.jComboBoxTiposAccionesConyuge = jComboBoxTiposAccionesConyuge;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConyuge() {
		return this.jComboBoxTiposAccionesFormularioConyuge;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConyuge(
			JComboBox jComboBoxTiposAccionesFormularioConyuge) {
		this.jComboBoxTiposAccionesFormularioConyuge = jComboBoxTiposAccionesFormularioConyuge;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.conyugeSessionBean=new ConyugeSessionBean();
		
		this.conyugeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conyugeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.conyugeSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConyugeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConyugeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Conyuge MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
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
	
		ConyugeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConyuge= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConyuge=new JButtonMe();
				this.jButtonModificarToolBarConyuge=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConyuge,this.jTtoolBarDetalleConyuge,
							"actualizar","actualizar","Actualizar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConyuge,this.jTtoolBarDetalleConyuge,
							"eliminar","eliminar","Eliminar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConyuge,this.jTtoolBarDetalleConyuge,
							"cancelar","cancelar","Cancelar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConyuge=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConyuge,this.jTtoolBarDetalleConyuge,
							"guardarcambios","guardarcambios","Guardar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConyuge,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConyuge,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConyuge,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConyuge=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConyuge=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConyuge=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConyuge=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConyuge=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConyuge= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConyuge.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConyuge,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConyuge= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConyuge.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConyuge,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConyuge= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConyuge.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConyuge,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConyuge= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConyuge.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConyuge,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConyuge= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConyuge.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConyuge,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConyuge= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConyuge.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConyuge,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConyuge= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConyuge.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConyuge,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConyuge= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConyuge.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConyuge,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConyuge= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConyuge.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConyuge,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConyuge= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConyuge.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConyuge,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConyuge.add(this.jMenuItemDetalleCerrarConyuge);
		
		this.jmenuDetalleAccionesConyuge.add(this.jMenuItemActualizarConyuge);
		this.jmenuDetalleAccionesConyuge.add(this.jMenuItemEliminarConyuge);
		this.jmenuDetalleAccionesConyuge.add(this.jMenuItemCancelarConyuge);		
		
		//this.jmenuDetalleDatosConyuge.add(this.jMenuItemDetalleAbrirOrderByConyuge);				
		this.jmenuDetalleDatosConyuge.add(this.jMenuItemDetalleMostarOcultarConyuge);				
				
		//this.jmenuDetalleAccionesConyuge.add(this.jMenuItemGuardarCambiosConyuge);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConyuge.add(this.jmenuDetalleArchivoConyuge);		
		this.jmenuBarDetalleConyuge.add(this.jmenuDetalleAccionesConyuge);		
		this.jmenuBarDetalleConyuge.add(this.jmenuDetalleDatosConyuge);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConyuge);				
	}
	
	
	public void inicializarElementosCamposConyuge() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelidentificacionConyuge = new JLabelMe();
		this.jLabelidentificacionConyuge.setText(""+ConyugeConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionConyuge.setToolTipText("Identificacion");
		this.jLabelidentificacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelidentificacionConyuge.setLayout(this.gridaBagLayoutConyuge);


		jTextFieldidentificacionConyuge= new JTextFieldMe();

		jTextFieldidentificacionConyuge.setEnabled(false);
		jTextFieldidentificacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionConyugeBusqueda= new JButtonMe();
		this.jButtonidentificacionConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionConyugeBusqueda.setText("U");
		this.jButtonidentificacionConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionConyugeBusqueda.setVisible(false);		}


					
		this.jLabelapellidopaternoConyuge = new JLabelMe();
		this.jLabelapellidopaternoConyuge.setText(""+ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO+" : *");
		this.jLabelapellidopaternoConyuge.setToolTipText("Apellido Paterno");
		this.jLabelapellidopaternoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidopaternoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidopaternoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidopaternoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidopaternoConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidopaternoConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelapellidopaternoConyuge.setLayout(this.gridaBagLayoutConyuge);


		jTextAreaapellidopaternoConyuge= new JTextAreaMe();
		jTextAreaapellidopaternoConyuge.setEnabled(false);
		jTextAreaapellidopaternoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidopaternoConyuge.setLineWrap(true);
		jTextAreaapellidopaternoConyuge.setWrapStyleWord(true);
		jTextAreaapellidopaternoConyuge.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidopaternoConyuge.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidopaternoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidopaternoConyuge = new JScrollPane(jTextAreaapellidopaternoConyuge);
		jscrollPaneapellidopaternoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidopaternoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidopaternoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidopaternoConyugeBusqueda= new JButtonMe();
		this.jButtonapellidopaternoConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidopaternoConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidopaternoConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidopaternoConyugeBusqueda.setText("U");
		this.jButtonapellidopaternoConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidopaternoConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidopaternoConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidopaternoConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidopaternoConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidopaternoConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidopaternoConyugeBusqueda.setVisible(false);		}


					
		this.jLabelapellidomaternoConyuge = new JLabelMe();
		this.jLabelapellidomaternoConyuge.setText(""+ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO+" : *");
		this.jLabelapellidomaternoConyuge.setToolTipText("Apellido Materno");
		this.jLabelapellidomaternoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidomaternoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelapellidomaternoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidomaternoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidomaternoConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidomaternoConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelapellidomaternoConyuge.setLayout(this.gridaBagLayoutConyuge);


		jTextAreaapellidomaternoConyuge= new JTextAreaMe();
		jTextAreaapellidomaternoConyuge.setEnabled(false);
		jTextAreaapellidomaternoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidomaternoConyuge.setLineWrap(true);
		jTextAreaapellidomaternoConyuge.setWrapStyleWord(true);
		jTextAreaapellidomaternoConyuge.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidomaternoConyuge.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidomaternoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidomaternoConyuge = new JScrollPane(jTextAreaapellidomaternoConyuge);
		jscrollPaneapellidomaternoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidomaternoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidomaternoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidomaternoConyugeBusqueda= new JButtonMe();
		this.jButtonapellidomaternoConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidomaternoConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidomaternoConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidomaternoConyugeBusqueda.setText("U");
		this.jButtonapellidomaternoConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidomaternoConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidomaternoConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidomaternoConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidomaternoConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidomaternoConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidomaternoConyugeBusqueda.setVisible(false);		}


					
		this.jLabelprimernombreConyuge = new JLabelMe();
		this.jLabelprimernombreConyuge.setText(""+ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE+" : *");
		this.jLabelprimernombreConyuge.setToolTipText("Primer Nombre");
		this.jLabelprimernombreConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprimernombreConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprimernombreConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprimernombreConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprimernombreConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprimernombreConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelprimernombreConyuge.setLayout(this.gridaBagLayoutConyuge);


		jTextAreaprimernombreConyuge= new JTextAreaMe();
		jTextAreaprimernombreConyuge.setEnabled(false);
		jTextAreaprimernombreConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprimernombreConyuge.setLineWrap(true);
		jTextAreaprimernombreConyuge.setWrapStyleWord(true);
		jTextAreaprimernombreConyuge.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprimernombreConyuge.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaprimernombreConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprimernombreConyuge = new JScrollPane(jTextAreaprimernombreConyuge);
		jscrollPaneprimernombreConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprimernombreConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprimernombreConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprimernombreConyugeBusqueda= new JButtonMe();
		this.jButtonprimernombreConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprimernombreConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprimernombreConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprimernombreConyugeBusqueda.setText("U");
		this.jButtonprimernombreConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprimernombreConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprimernombreConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprimernombreConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprimernombreConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"primernombreConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprimernombreConyugeBusqueda.setVisible(false);		}


					
		this.jLabelsegundonombreConyuge = new JLabelMe();
		this.jLabelsegundonombreConyuge.setText(""+ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE+" : *");
		this.jLabelsegundonombreConyuge.setToolTipText("Segundo Nombre");
		this.jLabelsegundonombreConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegundonombreConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsegundonombreConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsegundonombreConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsegundonombreConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsegundonombreConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelsegundonombreConyuge.setLayout(this.gridaBagLayoutConyuge);


		jTextAreasegundonombreConyuge= new JTextAreaMe();
		jTextAreasegundonombreConyuge.setEnabled(false);
		jTextAreasegundonombreConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasegundonombreConyuge.setLineWrap(true);
		jTextAreasegundonombreConyuge.setWrapStyleWord(true);
		jTextAreasegundonombreConyuge.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasegundonombreConyuge.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreasegundonombreConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesegundonombreConyuge = new JScrollPane(jTextAreasegundonombreConyuge);
		jscrollPanesegundonombreConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesegundonombreConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanesegundonombreConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonsegundonombreConyugeBusqueda= new JButtonMe();
		this.jButtonsegundonombreConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegundonombreConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsegundonombreConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsegundonombreConyugeBusqueda.setText("U");
		this.jButtonsegundonombreConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsegundonombreConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsegundonombreConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasegundonombreConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasegundonombreConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"segundonombreConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsegundonombreConyugeBusqueda.setVisible(false);		}


					
		this.jLabelnombrecortoConyuge = new JLabelMe();
		this.jLabelnombrecortoConyuge.setText(""+ConyugeConstantesFunciones.LABEL_NOMBRECORTO+" : *");
		this.jLabelnombrecortoConyuge.setToolTipText("Nombre Corto");
		this.jLabelnombrecortoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrecortoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrecortoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrecortoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrecortoConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrecortoConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_NOMBRECORTO);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelnombrecortoConyuge.setLayout(this.gridaBagLayoutConyuge);


		jTextAreanombrecortoConyuge= new JTextAreaMe();
		jTextAreanombrecortoConyuge.setEnabled(false);
		jTextAreanombrecortoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrecortoConyuge.setLineWrap(true);
		jTextAreanombrecortoConyuge.setWrapStyleWord(true);
		jTextAreanombrecortoConyuge.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrecortoConyuge.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreanombrecortoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrecortoConyuge = new JScrollPane(jTextAreanombrecortoConyuge);
		jscrollPanenombrecortoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrecortoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrecortoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrecortoConyugeBusqueda= new JButtonMe();
		this.jButtonnombrecortoConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrecortoConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrecortoConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrecortoConyugeBusqueda.setText("U");
		this.jButtonnombrecortoConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrecortoConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrecortoConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrecortoConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrecortoConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrecortoConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrecortoConyugeBusqueda.setVisible(false);		}


					
		this.jLabelesactivoConyuge = new JLabelMe();
		this.jLabelesactivoConyuge.setText(""+ConyugeConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabelesactivoConyuge.setToolTipText("Es Activo");
		this.jLabelesactivoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesactivoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesactivoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesactivoConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesactivoConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelesactivoConyuge.setLayout(this.gridaBagLayoutConyuge);


		jCheckBoxesactivoConyuge= new JCheckBoxMe();
		jCheckBoxesactivoConyuge.setEnabled(false);

		jCheckBoxesactivoConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesactivoConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesactivoConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesactivoConyugeBusqueda= new JButtonMe();
		this.jButtonesactivoConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesactivoConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesactivoConyugeBusqueda.setText("U");
		this.jButtonesactivoConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesactivoConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesactivoConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesactivoConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesactivoConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esactivoConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesactivoConyugeBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConyuge() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_clienteConyuge = new JLabelMe();
		this.jLabelid_clienteConyuge.setText(""+ConyugeConstantesFunciones.LABEL_ID+" : *");
		this.jLabelid_clienteConyuge.setToolTipText("Id");
		this.jLabelid_clienteConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelid_clienteConyuge.setLayout(this.gridaBagLayoutConyuge);


		jComboBoxid_clienteConyuge= new JComboBoxMe();
		jComboBoxid_clienteConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteConyuge= new JButtonMe();
		this.jButtonid_clienteConyuge.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConyuge.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConyuge.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConyuge.setText("Buscar");
		this.jButtonid_clienteConyuge.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteConyuge.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConyuge,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConyuge"));

		this.jButtonid_clienteConyugeBusqueda= new JButtonMe();
		this.jButtonid_clienteConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteConyugeBusqueda.setText("U");
		this.jButtonid_clienteConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteConyugeBusqueda.setVisible(false);		}

		this.jButtonid_clienteConyugeUpdate= new JButtonMe();
		this.jButtonid_clienteConyugeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConyugeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConyugeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteConyugeUpdate.setText("U");
		this.jButtonid_clienteConyugeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteConyugeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConyugeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConyugeUpdate"));



					
		this.jLabelidvaloridentificacionConyuge = new JLabelMe();
		this.jLabelidvaloridentificacionConyuge.setText(""+ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelidvaloridentificacionConyuge.setToolTipText("Tipo Identificacion");
		this.jLabelidvaloridentificacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvaloridentificacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelidvaloridentificacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelidvaloridentificacionConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidvaloridentificacionConyuge=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidvaloridentificacionConyuge.setToolTipText(ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutConyuge = new GridBagLayout();
		this.jPanelidvaloridentificacionConyuge.setLayout(this.gridaBagLayoutConyuge);


		jComboBoxidvaloridentificacionConyuge= new JComboBoxMe();
		jComboBoxidvaloridentificacionConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxidvaloridentificacionConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxidvaloridentificacionConyuge,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidvaloridentificacionConyuge= new JButtonMe();
		this.jButtonidvaloridentificacionConyuge.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvaloridentificacionConyuge.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvaloridentificacionConyuge.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonidvaloridentificacionConyuge.setText("Buscar");
		this.jButtonidvaloridentificacionConyuge.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonidvaloridentificacionConyuge.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvaloridentificacionConyuge,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxidvaloridentificacionConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvaloridentificacionConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvaloridentificacionConyuge"));

		this.jButtonidvaloridentificacionConyugeBusqueda= new JButtonMe();
		this.jButtonidvaloridentificacionConyugeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionConyugeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionConyugeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvaloridentificacionConyugeBusqueda.setText("U");
		this.jButtonidvaloridentificacionConyugeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidvaloridentificacionConyugeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvaloridentificacionConyugeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxidvaloridentificacionConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvaloridentificacionConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvaloridentificacionConyugeBusqueda"));

		if(this.conyugeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidvaloridentificacionConyugeBusqueda.setVisible(false);		}

		this.jButtonidvaloridentificacionConyugeUpdate= new JButtonMe();
		this.jButtonidvaloridentificacionConyugeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionConyugeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidvaloridentificacionConyugeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidvaloridentificacionConyugeUpdate.setText("U");
		this.jButtonidvaloridentificacionConyugeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonidvaloridentificacionConyugeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidvaloridentificacionConyugeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxidvaloridentificacionConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxidvaloridentificacionConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"idvaloridentificacionConyugeUpdate"));



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
		//this.jInternalFrameDetalleConyuge = new ConyugeBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Conyuge DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConyuge= new GridBagLayout();
		

		
		String sToolTipConyuge="";
		sToolTipConyuge=ConyugeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConyuge+="(Cartera.Conyuge)";
		}
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			sToolTipConyuge+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConyuge = new JButtonMe();
		this.jButtonModificarConyuge = new JButtonMe();
        this.jButtonActualizarConyuge = new JButtonMe();
        this.jButtonEliminarConyuge = new JButtonMe();
        this.jButtonCancelarConyuge = new JButtonMe();
        this.jButtonGuardarCambiosConyuge = new JButtonMe();
		this.jButtonGuardarCambiosTablaConyuge = new JButtonMe();
		this.jButtonCerrarConyuge = new JButtonMe();
		
		this.jScrollPanelDatosConyuge = new JScrollPane();   
        this.jScrollPanelDatosEdicionConyuge = new JScrollPane();
		this.jScrollPanelDatosGeneralConyuge = new JScrollPane();
				
		
		
		this.jPanelCamposConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Conyuge";
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Conyuges" + this.sPath));
		} else {
			this.jScrollPanelDatosConyuge.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConyuge.setName("jPanelCamposConyuge"); 

		this.jPanelCamposOcultosConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConyuge.setName("jPanelCamposOcultosConyuge"); 

        this.jPanelAccionesConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConyuge.setToolTipText("Acciones");
        this.jPanelAccionesConyuge.setName("Acciones"); 

		this.jPanelAccionesFormularioConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConyuge.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConyuge.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConyuge, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConyuge.setText("Nuevo");
		this.jButtonModificarConyuge.setText("Editar");
        this.jButtonActualizarConyuge.setText("Actualizar");
        this.jButtonEliminarConyuge.setText("Eliminar");
        this.jButtonCancelarConyuge.setText("Cancelar");
        this.jButtonGuardarCambiosConyuge.setText("Guardar");
		this.jButtonGuardarCambiosTablaConyuge.setText("Guardar");
		this.jButtonCerrarConyuge.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConyuge,"nuevo_button","Nuevo",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConyuge,"modificar_button","Editar",this.conyugeSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConyuge,"actualizar_button","Actualizar",this.conyugeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConyuge,"eliminar_button","Eliminar",this.conyugeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConyuge,"cancelar_button","Cancelar",this.conyugeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConyuge,"guardarcambios_button","Guardar",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConyuge,"guardarcambiostabla_button","Guardar",this.conyugeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConyuge,"cerrar_button","Salir",this.conyugeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConyuge, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConyuge.setToolTipText("Nuevo"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConyuge.setToolTipText("Editar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConyuge.setToolTipText("Actualizar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConyuge.setToolTipText("Eliminar)"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConyuge.setToolTipText("Cancelar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConyuge.setToolTipText("Guardar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConyuge.setToolTipText("Guardar"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConyuge.setToolTipText("Salir"+" "+ConyugeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConyuge";
		inputMap = this.jButtonNuevoConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConyuge.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConyuge"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConyuge";
		inputMap = this.jButtonActualizarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConyuge"));
		
		//ELIMINAR
		sMapKey = "EliminarConyuge";
		inputMap = this.jButtonEliminarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConyuge"));
		
		//CANCELAR	
		sMapKey = "CancelarConyuge";
		inputMap = this.jButtonCancelarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConyuge"));
		
		//CERRAR		
		sMapKey = "CerrarConyuge";
		inputMap = this.jButtonCerrarConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConyuge"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConyuge";
		inputMap = this.jButtonGuardarCambiosTablaConyuge.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConyuge.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConyuge"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConyuge = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConyuge.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConyuge.setToolTipText("Nuevo Conyuge");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConyuge = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConyuge.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConyuge.setToolTipText("Sin Cerrar Ventana Conyuge");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConyuge, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConyuge = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConyuge.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConyuge.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConyuge, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConyuge = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConyuge.setText("Accion");
		this.jComboBoxTiposAccionesConyuge.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConyuge = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConyuge.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConyuge.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConyuge = new JLabelMe();
		
		this.jLabelAccionesConyuge.setText("Acciones");		
		this.jLabelAccionesConyuge.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConyuge.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConyuge.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConyuge();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConyuge();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConyuge=new JTabbedPane();
		this.jTabbedPaneRelacionesConyuge.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConyuge,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConyuge.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConyuge.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConyuge.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConyuge, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConyuge.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConyuge.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConyuge.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConyuge, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConyuge = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConyuge = new GridBagLayout();
		
		this.jPanelCamposConyuge.setLayout(gridaBagLayoutCamposConyuge);
		this.jPanelCamposOcultosConyuge.setLayout(gridaBagLayoutCamposOcultosConyuge);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteConyuge.add(jLabelid_clienteConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 2;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteConyuge.add(jButtonid_clienteConyuge, this.gridBagConstraintsConyuge);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 3;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteConyuge.add(jButtonid_clienteConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 4;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteConyuge.add(jButtonid_clienteConyugeUpdate, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteConyuge.add(jComboBoxid_clienteConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidvaloridentificacionConyuge.add(jLabelidvaloridentificacionConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvaloridentificacionConyuge.add(jButtonidvaloridentificacionConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 3;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelidvaloridentificacionConyuge.add(jButtonidvaloridentificacionConyugeUpdate, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidvaloridentificacionConyuge.add(jComboBoxidvaloridentificacionConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionConyuge.add(jLabelidentificacionConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionConyuge.add(jButtonidentificacionConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionConyuge.add(jTextFieldidentificacionConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidopaternoConyuge.add(jLabelapellidopaternoConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidopaternoConyuge.add(jButtonapellidopaternoConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidopaternoConyuge.add(jscrollPaneapellidopaternoConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidomaternoConyuge.add(jLabelapellidomaternoConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidomaternoConyuge.add(jButtonapellidomaternoConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidomaternoConyuge.add(jscrollPaneapellidomaternoConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprimernombreConyuge.add(jLabelprimernombreConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelprimernombreConyuge.add(jButtonprimernombreConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprimernombreConyuge.add(jscrollPaneprimernombreConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsegundonombreConyuge.add(jLabelsegundonombreConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelsegundonombreConyuge.add(jButtonsegundonombreConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsegundonombreConyuge.add(jscrollPanesegundonombreConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrecortoConyuge.add(jLabelnombrecortoConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrecortoConyuge.add(jButtonnombrecortoConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrecortoConyuge.add(jscrollPanenombrecortoConyuge, this.gridBagConstraintsConyuge);


	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 0;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesactivoConyuge.add(jLabelesactivoConyuge, this.gridBagConstraintsConyuge);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		//this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = 2;
		this.gridBagConstraintsConyuge.ipadx = 0;
		this.gridBagConstraintsConyuge.insets = new Insets(0, 0, 0, 0);
		this.jPanelesactivoConyuge.add(jButtonesactivoConyugeBusqueda, this.gridBagConstraintsConyuge);
	}

	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConyuge.gridy = 0;
	this.gridBagConstraintsConyuge.gridx = 1;
	this.gridBagConstraintsConyuge.ipadx = 0;
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesactivoConyuge.add(jCheckBoxesactivoConyuge, this.gridBagConstraintsConyuge);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelid_clienteConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelidvaloridentificacionConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelidentificacionConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelapellidopaternoConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelapellidomaternoConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelprimernombreConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelsegundonombreConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelnombrecortoConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
	}
	this.gridBagConstraintsConyuge = new GridBagConstraints();
	this.gridBagConstraintsConyuge.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConyuge.gridy = iYPanelCamposConyuge;
	this.gridBagConstraintsConyuge.gridx = iXPanelCamposConyuge++;
	this.gridBagConstraintsConyuge.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConyuge.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConyuge.add(this.jPanelesactivoConyuge, this.gridBagConstraintsConyuge);



	if(iXPanelCamposConyuge % 1==0) {
		iXPanelCamposConyuge=0;
		iYPanelCamposConyuge++;
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
			
		GridBagLayout gridaBagLayoutAccionesConyuge= new GridBagLayout();
		this.jPanelAccionesConyuge.setLayout(gridaBagLayoutAccionesConyuge);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConyuge= new GridBagLayout();
		this.jPanelAccionesFormularioConyuge.setLayout(gridaBagLayoutAccionesFormularioConyuge);
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConyuge.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConyuge.add(this.jComboBoxTiposAccionesFormularioConyuge, this.gridBagConstraintsConyuge);

			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConyuge.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConyuge.add(this.jCheckBoxPostAccionSinCerrarConyuge, this.gridBagConstraintsConyuge);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConyuge.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConyuge.add(this.jCheckBoxPostAccionSinMensajeConyuge, this.gridBagConstraintsConyuge);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx = iPosXAccion++;
			
		this.jPanelAccionesConyuge.add(this.jButtonModificarConyuge, this.gridBagConstraintsConyuge);							

		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConyuge.gridy = 0;
		this.gridBagConstraintsConyuge.gridx =iPosXAccion++;
			
		this.jPanelAccionesConyuge.add(this.jButtonEliminarConyuge, this.gridBagConstraintsConyuge);
		
			
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = 0;		
		this.gridBagConstraintsConyuge.gridx = iPosXAccion++;
		
		this.jPanelAccionesConyuge.add(this.jButtonActualizarConyuge, this.gridBagConstraintsConyuge);


		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = 0;		
		this.gridBagConstraintsConyuge.gridx = iPosXAccion++;
		
		this.jPanelAccionesConyuge.add(this.jButtonGuardarCambiosConyuge, this.gridBagConstraintsConyuge);	
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = 0;		
		this.gridBagConstraintsConyuge.gridx =iPosXAccion++;
		
		this.jPanelAccionesConyuge.add(this.jButtonCancelarConyuge, this.gridBagConstraintsConyuge);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConyuge = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConyuge);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConyuge = new GridBagConstraints();						
			this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConyuge.gridx = 0;		
			//this.gridBagConstraintsConyuge.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConyuge.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConyuge.gridx =0;
		this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConyuge.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConyuge, this.gridBagConstraintsConyuge);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConyugeJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConyuge = new ConyugeBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Conyuge DATOS");
			
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
			
	        //this.setTitle("[FOR] - Conyuge DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conyuge Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConyugeModel conyugeModel=new ConyugeModel(this);
			
			//SI USARA CLASE INTERNA
			//ConyugeModel.ConyugeFocusTraversalPolicy conyugeFocusTraversalPolicy = conyugeModel.new ConyugeFocusTraversalPolicy(this);
			
			//conyugeFocusTraversalPolicy.setconyugeJInternalFrame(this);
			
			this.setFocusTraversalPolicy(conyugeModel);
			
			
			this.jContentPaneDetalleConyuge = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConyuge = new GridBagLayout();	
			this.jContentPaneDetalleConyuge.setLayout(gridaBagLayoutDetalleConyuge);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConyuge = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConyuge = new GridBagConstraints();
				this.gridBagConstraintsConyuge.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConyuge.gridx = 0;
					
				
				this.jContentPaneDetalleConyuge.add(jTtoolBarDetalleConyuge, gridBagConstraintsConyuge);								
				
}
			
			this.jScrollPanelDatosEdicionConyuge=   new JScrollPane(jContentPaneDetalleConyuge,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConyuge.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConyuge.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConyuge.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConyuge=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConyuge.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConyuge.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConyuge.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConyuge.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConyuge.gridx = 0;
	        
			this.jContentPaneDetalleConyuge.add(jPanelCamposConyuge, gridBagConstraintsConyuge);
			
			
			
			
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
						&& conyugeSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.conyugeSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConyuge= new GridBagConstraints();
						this.gridBagConstraintsConyuge.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConyuge.gridx = 0;
						this.jContentPaneDetalleConyuge.add(this.jTabbedPaneRelacionesConyuge, this.gridBagConstraintsConyuge);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConyuge.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConyuge.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConyuge = new GridBagConstraints();
					this.gridBagConstraintsConyuge.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConyuge.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConyuge.gridx = 0;
					
				
					this.jContentPaneDetalleConyuge.add(jPanelCamposOcultosConyuge, gridBagConstraintsConyuge);
				
					this.jPanelCamposOcultosConyuge.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConyuge.gridx = 0;
	        this.gridBagConstraintsConyuge.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConyuge.add(this.jPanelAccionesFormularioConyuge, this.gridBagConstraintsConyuge);							
			
			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
	        this.gridBagConstraintsConyuge.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConyuge.gridx = 0;
	        
			
			this.jContentPaneDetalleConyuge.add(this.jPanelAccionesConyuge, this.gridBagConstraintsConyuge);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConyuge);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConyuge=   new JScrollPane(this.jPanelCamposConyuge,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConyuge.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConyuge.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConyuge.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConyuge.gridx = 0;
			this.gridBagConstraintsConyuge.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConyuge.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConyuge.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConyuge, this.gridBagConstraintsConyuge);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConyuge.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConyuge, this.gridBagConstraintsConyuge);			
			
			this.gridBagConstraintsConyuge = new GridBagConstraints();
			this.gridBagConstraintsConyuge.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConyuge.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConyuge, this.gridBagConstraintsConyuge);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConyuge, this.gridBagConstraintsConyuge);
			
			
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConyuge, this.gridBagConstraintsConyuge);
		
			
		this.gridBagConstraintsConyuge = new GridBagConstraints();
		this.gridBagConstraintsConyuge.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConyuge.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConyuge, this.gridBagConstraintsConyuge);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConyuge;//jContentPane;
		
		return jScrollPanelDatosEdicionConyuge;
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
