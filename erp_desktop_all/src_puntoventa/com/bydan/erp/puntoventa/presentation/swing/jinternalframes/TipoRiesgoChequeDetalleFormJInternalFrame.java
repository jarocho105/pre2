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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoRiesgoChequeConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoRiesgoChequeDetalleFormJInternalFrame extends TipoRiesgoChequeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRiesgoCheque;
	
	protected JMenuBar jmenuBarDetalleTipoRiesgoCheque;
	
	protected JMenu jmenuDetalleTipoRiesgoCheque;
	protected JMenu jmenuDetalleArchivoTipoRiesgoCheque;
	protected JMenu jmenuDetalleAccionesTipoRiesgoCheque;
	protected JMenu jmenuDetalleDatosTipoRiesgoCheque;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRiesgoCheque;	
	protected GridBagConstraints gridBagConstraintsTipoRiesgoCheque;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRiesgoChequeBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRiesgoCheque;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean;
	
	

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
		
	
	public TipoRiesgoChequeLogic tiporiesgochequeLogic;
	
	public JScrollPane jScrollPanelDatosTipoRiesgoCheque;
	public JScrollPane jScrollPanelDatosEdicionTipoRiesgoCheque;
	public JScrollPane jScrollPanelDatosGeneralTipoRiesgoCheque;
	
	protected JPanel jPanelCamposTipoRiesgoCheque;    
	protected JPanel jPanelCamposOcultosTipoRiesgoCheque;    	
	protected JPanel jPanelAccionesTipoRiesgoCheque;
	protected JPanel jPanelAccionesFormularioTipoRiesgoCheque;
    
	
	
	protected Integer iXPanelCamposTipoRiesgoCheque=0;
	protected Integer iYPanelCamposTipoRiesgoCheque=0;
	
	protected Integer iXPanelCamposOcultosTipoRiesgoCheque=0;
	protected Integer iYPanelCamposOcultosTipoRiesgoCheque=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRiesgoCheque;
	public JButton jButtonModificarTipoRiesgoCheque;
	public JButton jButtonActualizarTipoRiesgoCheque;
    public JButton jButtonEliminarTipoRiesgoCheque;
	public JButton jButtonCancelarTipoRiesgoCheque;
    public JButton jButtonGuardarCambiosTipoRiesgoCheque;
	public JButton jButtonGuardarCambiosTablaTipoRiesgoCheque;
	protected JButton jButtonCerrarTipoRiesgoCheque;
	
	
	protected JButton jButtonProcesarInformacionTipoRiesgoCheque;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRiesgoCheque;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRiesgoCheque;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRiesgoCheque;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRiesgoCheque;
	protected JButton jButtonModificarToolBarTipoRiesgoCheque;
	protected JButton jButtonActualizarToolBarTipoRiesgoCheque;
    protected JButton jButtonEliminarToolBarTipoRiesgoCheque;
	protected JButton jButtonCancelarToolBarTipoRiesgoCheque;
    protected JButton jButtonGuardarCambiosToolBarTipoRiesgoCheque;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRiesgoCheque;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRiesgoCheque;
	protected JButton jButtonCerrarToolBarTipoRiesgoCheque;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRiesgoCheque;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRiesgoCheque;
	protected JMenuItem jMenuItemModificarTipoRiesgoCheque;
	protected JMenuItem jMenuItemActualizarTipoRiesgoCheque;
    protected JMenuItem jMenuItemEliminarTipoRiesgoCheque;
	protected JMenuItem jMenuItemCancelarTipoRiesgoCheque;
    protected JMenuItem jMenuItemGuardarCambiosTipoRiesgoCheque;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRiesgoCheque;
	protected JMenuItem jMenuItemCerrarTipoRiesgoCheque;
	protected JMenuItem jMenuItemDetalleCerrarTipoRiesgoCheque;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRiesgoCheque;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRiesgoCheque;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRiesgoCheque;
	protected JMenuItem jMenuItemMostrarOcultarTipoRiesgoCheque;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRiesgoCheque;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRiesgoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRiesgoCheque;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRiesgoCheque;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRiesgoCheque;
	public JLabel jLabelIdTipoRiesgoCheque;
	public JTextFieldMe jTextFieldidTipoRiesgoCheque;
	public JButton jButtonidTipoRiesgoChequeBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRiesgoCheque;
	public JLabel jLabelnombreTipoRiesgoCheque;
	public JTextArea jTextAreanombreTipoRiesgoCheque;
	public JScrollPane jscrollPanenombreTipoRiesgoCheque;
	public JButton jButtonnombreTipoRiesgoChequeBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoRiesgoCheque;
	public JLabel jLabeldescripcionTipoRiesgoCheque;
	public JTextArea jTextAreadescripcionTipoRiesgoCheque;
	public JScrollPane jscrollPanedescripcionTipoRiesgoCheque;
	public JButton jButtondescripcionTipoRiesgoChequeBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRiesgoCheque;
	
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
	
	public TipoRiesgoChequeDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRiesgoCheque=new JPanel();
				this.jPanelAccionesFormularioTipoRiesgoCheque=new JPanel();
				this.jmenuBarDetalleTipoRiesgoCheque=new JMenuBar();
				this.jTtoolBarDetalleTipoRiesgoCheque=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRiesgoChequeDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoChequeDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRiesgoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRiesgoCheque() {
		return this.jButtonActualizarToolBarTipoRiesgoCheque;
	}
	
	public JButton getjButtonEliminarToolBarTipoRiesgoCheque() {
		return this.jButtonEliminarToolBarTipoRiesgoCheque;
	}
	
	public JButton getjButtonCancelarToolBarTipoRiesgoCheque() {
		return this.jButtonCancelarToolBarTipoRiesgoCheque;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRiesgoCheque() {
		return this.jButtonProcesarInformacionTipoRiesgoCheque;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRiesgoCheque)	{
		this.jButtonProcesarInformacionTipoRiesgoCheque = jButtonProcesarInformacionTipoRiesgoCheque;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRiesgoCheque() {
		return this.jComboBoxTiposAccionesTipoRiesgoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRiesgoCheque(
			JComboBox jComboBoxTiposRelacionesTipoRiesgoCheque) {
		this.jComboBoxTiposRelacionesTipoRiesgoCheque = jComboBoxTiposRelacionesTipoRiesgoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRiesgoCheque(
			JComboBox jComboBoxTiposAccionesTipoRiesgoCheque) {
		this.jComboBoxTiposAccionesTipoRiesgoCheque = jComboBoxTiposAccionesTipoRiesgoCheque;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRiesgoCheque() {
		return this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRiesgoCheque(
			JComboBox jComboBoxTiposAccionesFormularioTipoRiesgoCheque) {
		this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque = jComboBoxTiposAccionesFormularioTipoRiesgoCheque;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporiesgochequeSessionBean=new TipoRiesgoChequeSessionBean();
		
		this.tiporiesgochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporiesgochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporiesgochequeSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRiesgoChequeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Riesgo Cheque MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRiesgoChequeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRiesgoCheque= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRiesgoCheque=new JButtonMe();
				this.jButtonModificarToolBarTipoRiesgoCheque=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRiesgoCheque,this.jTtoolBarDetalleTipoRiesgoCheque,
							"actualizar","actualizar","Actualizar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRiesgoCheque,this.jTtoolBarDetalleTipoRiesgoCheque,
							"eliminar","eliminar","Eliminar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRiesgoCheque,this.jTtoolBarDetalleTipoRiesgoCheque,
							"cancelar","cancelar","Cancelar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRiesgoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRiesgoCheque,this.jTtoolBarDetalleTipoRiesgoCheque,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRiesgoCheque=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRiesgoCheque=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRiesgoCheque=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRiesgoCheque=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRiesgoCheque=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRiesgoCheque= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRiesgoCheque.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRiesgoCheque,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRiesgoCheque= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRiesgoCheque.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRiesgoCheque,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRiesgoCheque= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRiesgoCheque.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRiesgoCheque,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRiesgoCheque= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRiesgoCheque.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRiesgoCheque,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRiesgoCheque= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRiesgoCheque.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRiesgoCheque,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRiesgoCheque= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRiesgoCheque.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRiesgoCheque,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRiesgoCheque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRiesgoCheque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRiesgoCheque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRiesgoCheque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRiesgoCheque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRiesgoCheque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRiesgoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRiesgoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRiesgoCheque,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRiesgoCheque.add(this.jMenuItemDetalleCerrarTipoRiesgoCheque);
		
		this.jmenuDetalleAccionesTipoRiesgoCheque.add(this.jMenuItemActualizarTipoRiesgoCheque);
		this.jmenuDetalleAccionesTipoRiesgoCheque.add(this.jMenuItemEliminarTipoRiesgoCheque);
		this.jmenuDetalleAccionesTipoRiesgoCheque.add(this.jMenuItemCancelarTipoRiesgoCheque);		
		
		//this.jmenuDetalleDatosTipoRiesgoCheque.add(this.jMenuItemDetalleAbrirOrderByTipoRiesgoCheque);				
		this.jmenuDetalleDatosTipoRiesgoCheque.add(this.jMenuItemDetalleMostarOcultarTipoRiesgoCheque);				
				
		//this.jmenuDetalleAccionesTipoRiesgoCheque.add(this.jMenuItemGuardarCambiosTipoRiesgoCheque);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRiesgoCheque.add(this.jmenuDetalleArchivoTipoRiesgoCheque);		
		this.jmenuBarDetalleTipoRiesgoCheque.add(this.jmenuDetalleAccionesTipoRiesgoCheque);		
		this.jmenuBarDetalleTipoRiesgoCheque.add(this.jmenuDetalleDatosTipoRiesgoCheque);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRiesgoCheque.add(this.jmenuDetalleTipoRiesgoCheque);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRiesgoCheque);				
	}
	
	
	public void inicializarElementosCamposTipoRiesgoCheque() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRiesgoCheque = new JLabelMe();
		jLabelIdTipoRiesgoCheque.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRiesgoCheque = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRiesgoCheque.setToolTipText(TipoRiesgoChequeConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRiesgoCheque= new GridBagLayout();

		this.jPanelidTipoRiesgoCheque.setLayout(this.gridaBagLayoutTipoRiesgoCheque);

		jTextFieldidTipoRiesgoCheque = new JTextFieldMe();
		jTextFieldidTipoRiesgoCheque.setText("Id");

		jTextFieldidTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoRiesgoCheque = new JLabelMe();
		this.jLabelnombreTipoRiesgoCheque.setText(""+TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRiesgoCheque.setToolTipText("Nombre");
		this.jLabelnombreTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRiesgoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRiesgoCheque.setToolTipText(TipoRiesgoChequeConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRiesgoCheque = new GridBagLayout();
		this.jPanelnombreTipoRiesgoCheque.setLayout(this.gridaBagLayoutTipoRiesgoCheque);


		jTextAreanombreTipoRiesgoCheque= new JTextAreaMe();
		jTextAreanombreTipoRiesgoCheque.setEnabled(false);
		jTextAreanombreTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRiesgoCheque.setLineWrap(true);
		jTextAreanombreTipoRiesgoCheque.setWrapStyleWord(true);
		jTextAreanombreTipoRiesgoCheque.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRiesgoCheque.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRiesgoCheque = new JScrollPane(jTextAreanombreTipoRiesgoCheque);
		jscrollPanenombreTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRiesgoChequeBusqueda= new JButtonMe();
		this.jButtonnombreTipoRiesgoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRiesgoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRiesgoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRiesgoChequeBusqueda.setText("U");
		this.jButtonnombreTipoRiesgoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRiesgoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRiesgoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRiesgoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRiesgoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRiesgoChequeBusqueda"));

		if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRiesgoChequeBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoRiesgoCheque = new JLabelMe();
		this.jLabeldescripcionTipoRiesgoCheque.setText(""+TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoRiesgoCheque.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoRiesgoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoRiesgoCheque.setToolTipText(TipoRiesgoChequeConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoRiesgoCheque = new GridBagLayout();
		this.jPaneldescripcionTipoRiesgoCheque.setLayout(this.gridaBagLayoutTipoRiesgoCheque);


		jTextAreadescripcionTipoRiesgoCheque= new JTextAreaMe();
		jTextAreadescripcionTipoRiesgoCheque.setEnabled(false);
		jTextAreadescripcionTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoRiesgoCheque.setLineWrap(true);
		jTextAreadescripcionTipoRiesgoCheque.setWrapStyleWord(true);
		jTextAreadescripcionTipoRiesgoCheque.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoRiesgoCheque.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoRiesgoCheque = new JScrollPane(jTextAreadescripcionTipoRiesgoCheque);
		jscrollPanedescripcionTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoRiesgoChequeBusqueda= new JButtonMe();
		this.jButtondescripcionTipoRiesgoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoRiesgoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoRiesgoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoRiesgoChequeBusqueda.setText("U");
		this.jButtondescripcionTipoRiesgoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoRiesgoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoRiesgoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoRiesgoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoRiesgoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoRiesgoChequeBusqueda"));

		if(this.tiporiesgochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoRiesgoChequeBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRiesgoCheque() {
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
		//this.jInternalFrameDetalleTipoRiesgoCheque = new TipoRiesgoChequeBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Riesgo Cheque DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRiesgoCheque= new GridBagLayout();
		

		
		String sToolTipTipoRiesgoCheque="";
		sToolTipTipoRiesgoCheque=TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRiesgoCheque+="(PuntoVenta.TipoRiesgoCheque)";
		}
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRiesgoCheque+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRiesgoCheque = new JButtonMe();
		this.jButtonModificarTipoRiesgoCheque = new JButtonMe();
        this.jButtonActualizarTipoRiesgoCheque = new JButtonMe();
        this.jButtonEliminarTipoRiesgoCheque = new JButtonMe();
        this.jButtonCancelarTipoRiesgoCheque = new JButtonMe();
        this.jButtonGuardarCambiosTipoRiesgoCheque = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque = new JButtonMe();
		this.jButtonCerrarTipoRiesgoCheque = new JButtonMe();
		
		this.jScrollPanelDatosTipoRiesgoCheque = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRiesgoCheque = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRiesgoCheque = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Riesgo Cheque";
		
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Cheques" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRiesgoCheque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRiesgoCheque.setName("jPanelCamposTipoRiesgoCheque"); 

		this.jPanelCamposOcultosTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRiesgoCheque.setName("jPanelCamposOcultosTipoRiesgoCheque"); 

        this.jPanelAccionesTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRiesgoCheque.setToolTipText("Acciones");
        this.jPanelAccionesTipoRiesgoCheque.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRiesgoCheque.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRiesgoCheque.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRiesgoCheque.setText("Nuevo");
		this.jButtonModificarTipoRiesgoCheque.setText("Editar");
        this.jButtonActualizarTipoRiesgoCheque.setText("Actualizar");
        this.jButtonEliminarTipoRiesgoCheque.setText("Eliminar");
        this.jButtonCancelarTipoRiesgoCheque.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRiesgoCheque.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.setText("Guardar");
		this.jButtonCerrarTipoRiesgoCheque.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRiesgoCheque,"nuevo_button","Nuevo",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRiesgoCheque,"modificar_button","Editar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRiesgoCheque,"actualizar_button","Actualizar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRiesgoCheque,"eliminar_button","Eliminar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRiesgoCheque,"cancelar_button","Cancelar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRiesgoCheque,"guardarcambios_button","Guardar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRiesgoCheque,"guardarcambiostabla_button","Guardar",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRiesgoCheque,"cerrar_button","Salir",this.tiporiesgochequeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRiesgoCheque.setToolTipText("Nuevo"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRiesgoCheque.setToolTipText("Editar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRiesgoCheque.setToolTipText("Actualizar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRiesgoCheque.setToolTipText("Eliminar)"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRiesgoCheque.setToolTipText("Cancelar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRiesgoCheque.setToolTipText("Guardar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.setToolTipText("Guardar"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRiesgoCheque.setToolTipText("Salir"+" "+TipoRiesgoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRiesgoCheque";
		inputMap = this.jButtonNuevoTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRiesgoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRiesgoCheque"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRiesgoCheque";
		inputMap = this.jButtonActualizarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRiesgoCheque"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRiesgoCheque";
		inputMap = this.jButtonEliminarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRiesgoCheque"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRiesgoCheque";
		inputMap = this.jButtonCancelarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRiesgoCheque"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRiesgoCheque";
		inputMap = this.jButtonCerrarTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRiesgoCheque"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRiesgoCheque";
		inputMap = this.jButtonGuardarCambiosTablaTipoRiesgoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRiesgoCheque"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRiesgoCheque = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRiesgoCheque.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRiesgoCheque.setToolTipText("Nuevo TipoRiesgoCheque");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque.setToolTipText("Sin Cerrar Ventana TipoRiesgoCheque");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRiesgoCheque.setText("Accion");
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRiesgoCheque = new JLabelMe();
		
		this.jLabelAccionesTipoRiesgoCheque.setText("Acciones");		
		this.jLabelAccionesTipoRiesgoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRiesgoCheque();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRiesgoCheque();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRiesgoCheque=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRiesgoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRiesgoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRiesgoCheque = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRiesgoCheque = new GridBagLayout();
		
		this.jPanelCamposTipoRiesgoCheque.setLayout(gridaBagLayoutCamposTipoRiesgoCheque);
		this.jPanelCamposOcultosTipoRiesgoCheque.setLayout(gridaBagLayoutCamposOcultosTipoRiesgoCheque);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRiesgoCheque.add(jLabelIdTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);



	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = 1;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRiesgoCheque.add(jTextFieldidTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);


	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRiesgoCheque.add(jLabelnombreTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 2;
		this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
		this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRiesgoCheque.add(jButtonnombreTipoRiesgoChequeBusqueda, this.gridBagConstraintsTipoRiesgoCheque);
	}

	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = 1;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRiesgoCheque.add(jscrollPanenombreTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);


	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoRiesgoCheque.add(jLabeldescripcionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 2;
		this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
		this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoRiesgoCheque.add(jButtondescripcionTipoRiesgoChequeBusqueda, this.gridBagConstraintsTipoRiesgoCheque);
	}

	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = 1;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoRiesgoCheque.add(jscrollPanedescripcionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = iYPanelCamposTipoRiesgoCheque;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = iXPanelCamposTipoRiesgoCheque++;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRiesgoCheque.add(this.jPanelidTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);



	if(iXPanelCamposTipoRiesgoCheque % 1==0) {
		iXPanelCamposTipoRiesgoCheque=0;
		iYPanelCamposTipoRiesgoCheque++;
	}
	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = iYPanelCamposTipoRiesgoCheque;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = iXPanelCamposTipoRiesgoCheque++;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRiesgoCheque.add(this.jPanelnombreTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);



	if(iXPanelCamposTipoRiesgoCheque % 1==0) {
		iXPanelCamposTipoRiesgoCheque=0;
		iYPanelCamposTipoRiesgoCheque++;
	}
	this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRiesgoCheque.gridy = iYPanelCamposTipoRiesgoCheque;
	this.gridBagConstraintsTipoRiesgoCheque.gridx = iXPanelCamposTipoRiesgoCheque++;
	this.gridBagConstraintsTipoRiesgoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRiesgoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRiesgoCheque.add(this.jPaneldescripcionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);



	if(iXPanelCamposTipoRiesgoCheque % 1==0) {
		iXPanelCamposTipoRiesgoCheque=0;
		iYPanelCamposTipoRiesgoCheque++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRiesgoCheque= new GridBagLayout();
		this.jPanelAccionesTipoRiesgoCheque.setLayout(gridaBagLayoutAccionesTipoRiesgoCheque);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRiesgoCheque= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRiesgoCheque.setLayout(gridaBagLayoutAccionesFormularioTipoRiesgoCheque);
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRiesgoCheque.add(this.jComboBoxTiposAccionesFormularioTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);

		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRiesgoCheque.add(this.jCheckBoxPostAccionNuevoTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRiesgoCheque.add(this.jCheckBoxPostAccionSinCerrarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporiesgochequeSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRiesgoCheque.add(this.jCheckBoxPostAccionSinMensajeTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRiesgoCheque.add(this.jButtonModificarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);							

		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCheque.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRiesgoCheque.add(this.jButtonEliminarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
			
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRiesgoCheque.add(this.jButtonActualizarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);


		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRiesgoCheque.add(this.jButtonGuardarCambiosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);	
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = 0;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRiesgoCheque.add(this.jButtonCancelarTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRiesgoCheque = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRiesgoCheque);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporiesgochequeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();						
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;		
			//this.gridBagConstraintsTipoRiesgoCheque.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRiesgoCheque.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRiesgoCheque.gridx =0;
		this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRiesgoCheque.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRiesgoChequeJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRiesgoCheque = new TipoRiesgoChequeBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Riesgo Cheque DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Riesgo Cheque DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Riesgo Cheque Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRiesgoChequeModel tiporiesgochequeModel=new TipoRiesgoChequeModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRiesgoChequeModel.TipoRiesgoChequeFocusTraversalPolicy tiporiesgochequeFocusTraversalPolicy = tiporiesgochequeModel.new TipoRiesgoChequeFocusTraversalPolicy(this);
			
			//tiporiesgochequeFocusTraversalPolicy.settiporiesgochequeJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporiesgochequeModel);
			
			
			this.jContentPaneDetalleTipoRiesgoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRiesgoCheque = new GridBagLayout();	
			this.jContentPaneDetalleTipoRiesgoCheque.setLayout(gridaBagLayoutDetalleTipoRiesgoCheque);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRiesgoCheque = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRiesgoCheque.add(jTtoolBarDetalleTipoRiesgoCheque, gridBagConstraintsTipoRiesgoCheque);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRiesgoCheque=   new JScrollPane(jContentPaneDetalleTipoRiesgoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRiesgoCheque=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
	        
			this.jContentPaneDetalleTipoRiesgoCheque.add(jPanelCamposTipoRiesgoCheque, gridBagConstraintsTipoRiesgoCheque);
			
			
			
			
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
						&& tiporiesgochequeSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					
					if(this.tiporiesgochequeSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRiesgoCheque= new GridBagConstraints();
						this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
						this.jContentPaneDetalleTipoRiesgoCheque.add(this.jTabbedPaneRelacionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRiesgoCheque.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRiesgoCheque.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
					this.gridBagConstraintsTipoRiesgoCheque.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRiesgoCheque.add(jPanelCamposOcultosTipoRiesgoCheque, gridBagConstraintsTipoRiesgoCheque);
				
					this.jPanelCamposOcultosTipoRiesgoCheque.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
	        this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRiesgoCheque.add(this.jPanelAccionesFormularioTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);							
			
			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
	        this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRiesgoCheque.add(this.jPanelAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRiesgoCheque);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRiesgoCheque=   new JScrollPane(this.jPanelCamposTipoRiesgoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRiesgoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
			this.gridBagConstraintsTipoRiesgoCheque.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRiesgoCheque.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRiesgoCheque.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);			
			
			this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
			
			
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		
			
		this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCheque.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCheque.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRiesgoCheque, this.gridBagConstraintsTipoRiesgoCheque);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRiesgoCheque;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRiesgoCheque;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRiesgoChequeJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsTipoRiesgoCheque = new GridBagConstraints();
				//this.gridBagConstraintsTipoRiesgoCheque.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRiesgoCheque.gridx = 0;
				//this.jContentPaneDetalleTipoRiesgoCheque.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRiesgoCheque);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRiesgoCheque.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRiesgoCheque.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesTipoRiesgoCheque.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<TipoRiesgoCheque> tiporiesgocheques,TipoRiesgoCheque tiporiesgocheque,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.tiporiesgochequeLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.settiporiesgochequesForeignKey(tiporiesgocheques);
					formapagopuntoventaBeanSwingJInternalFrame.settiporiesgochequeForeignKey(tiporiesgocheque);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTipoRiesgoCheque(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidTipoRiesgoChequeActual(tiporiesgocheque.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRiesgoCheque(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_tipo_riesgo_chequeFK_IdTipoRiesgoCheque(tiporiesgocheque.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRiesgoChequeForeignKey(tiporiesgocheque,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRiesgoCheque");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRiesgoCheque");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

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
