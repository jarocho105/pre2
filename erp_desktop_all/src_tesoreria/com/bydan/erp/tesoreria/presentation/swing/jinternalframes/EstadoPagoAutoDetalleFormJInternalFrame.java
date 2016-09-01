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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.EstadoPagoAutoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class EstadoPagoAutoDetalleFormJInternalFrame extends EstadoPagoAutoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoPagoAuto;
	
	protected JMenuBar jmenuBarDetalleEstadoPagoAuto;
	
	protected JMenu jmenuDetalleEstadoPagoAuto;
	protected JMenu jmenuDetalleArchivoEstadoPagoAuto;
	protected JMenu jmenuDetalleAccionesEstadoPagoAuto;
	protected JMenu jmenuDetalleDatosEstadoPagoAuto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoPagoAuto;	
	protected GridBagConstraints gridBagConstraintsEstadoPagoAuto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoPagoAutoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoPagoAuto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoPagoAutoSessionBean estadopagoautoSessionBean;
	
	

	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;
	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePagoAuto=false;
	public PagoAutoSessionBean pagoautoSessionBean;
	
		
	
	public EstadoPagoAutoLogic estadopagoautoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoPagoAuto;
	public JScrollPane jScrollPanelDatosEdicionEstadoPagoAuto;
	public JScrollPane jScrollPanelDatosGeneralEstadoPagoAuto;
	
	protected JPanel jPanelCamposEstadoPagoAuto;    
	protected JPanel jPanelCamposOcultosEstadoPagoAuto;    	
	protected JPanel jPanelAccionesEstadoPagoAuto;
	protected JPanel jPanelAccionesFormularioEstadoPagoAuto;
    
	
	
	protected Integer iXPanelCamposEstadoPagoAuto=0;
	protected Integer iYPanelCamposEstadoPagoAuto=0;
	
	protected Integer iXPanelCamposOcultosEstadoPagoAuto=0;
	protected Integer iYPanelCamposOcultosEstadoPagoAuto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoPagoAuto;
	public JButton jButtonModificarEstadoPagoAuto;
	public JButton jButtonActualizarEstadoPagoAuto;
    public JButton jButtonEliminarEstadoPagoAuto;
	public JButton jButtonCancelarEstadoPagoAuto;
    public JButton jButtonGuardarCambiosEstadoPagoAuto;
	public JButton jButtonGuardarCambiosTablaEstadoPagoAuto;
	protected JButton jButtonCerrarEstadoPagoAuto;
	
	
	protected JButton jButtonProcesarInformacionEstadoPagoAuto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoPagoAuto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoPagoAuto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoPagoAuto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoPagoAuto;
	protected JButton jButtonModificarToolBarEstadoPagoAuto;
	protected JButton jButtonActualizarToolBarEstadoPagoAuto;
    protected JButton jButtonEliminarToolBarEstadoPagoAuto;
	protected JButton jButtonCancelarToolBarEstadoPagoAuto;
    protected JButton jButtonGuardarCambiosToolBarEstadoPagoAuto;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoPagoAuto;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoPagoAuto;
	protected JButton jButtonCerrarToolBarEstadoPagoAuto;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoPagoAuto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoPagoAuto;
	protected JMenuItem jMenuItemModificarEstadoPagoAuto;
	protected JMenuItem jMenuItemActualizarEstadoPagoAuto;
    protected JMenuItem jMenuItemEliminarEstadoPagoAuto;
	protected JMenuItem jMenuItemCancelarEstadoPagoAuto;
    protected JMenuItem jMenuItemGuardarCambiosEstadoPagoAuto;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoPagoAuto;
	protected JMenuItem jMenuItemCerrarEstadoPagoAuto;
	protected JMenuItem jMenuItemDetalleCerrarEstadoPagoAuto;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoPagoAuto;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoPagoAuto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoPagoAuto;
	protected JMenuItem jMenuItemMostrarOcultarEstadoPagoAuto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoPagoAuto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoPagoAuto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoPagoAuto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoPagoAuto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoPagoAuto;
	public JLabel jLabelIdEstadoPagoAuto;
	public JTextFieldMe jTextFieldidEstadoPagoAuto;
	public JButton jButtonidEstadoPagoAutoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoPagoAuto;
	public JLabel jLabelnombreEstadoPagoAuto;
	public JTextArea jTextAreanombreEstadoPagoAuto;
	public JScrollPane jscrollPanenombreEstadoPagoAuto;
	public JButton jButtonnombreEstadoPagoAutoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoPagoAuto;
	
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
	
	public EstadoPagoAutoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoPagoAuto=new JPanel();
				this.jPanelAccionesFormularioEstadoPagoAuto=new JPanel();
				this.jmenuBarDetalleEstadoPagoAuto=new JMenuBar();
				this.jTtoolBarDetalleEstadoPagoAuto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoPagoAutoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoPagoAutoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoPagoAuto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoPagoAuto() {
		return this.jButtonActualizarToolBarEstadoPagoAuto;
	}
	
	public JButton getjButtonEliminarToolBarEstadoPagoAuto() {
		return this.jButtonEliminarToolBarEstadoPagoAuto;
	}
	
	public JButton getjButtonCancelarToolBarEstadoPagoAuto() {
		return this.jButtonCancelarToolBarEstadoPagoAuto;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoPagoAuto() {
		return this.jButtonProcesarInformacionEstadoPagoAuto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoPagoAuto)	{
		this.jButtonProcesarInformacionEstadoPagoAuto = jButtonProcesarInformacionEstadoPagoAuto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoPagoAuto() {
		return this.jComboBoxTiposAccionesEstadoPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoPagoAuto(
			JComboBox jComboBoxTiposRelacionesEstadoPagoAuto) {
		this.jComboBoxTiposRelacionesEstadoPagoAuto = jComboBoxTiposRelacionesEstadoPagoAuto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoPagoAuto(
			JComboBox jComboBoxTiposAccionesEstadoPagoAuto) {
		this.jComboBoxTiposAccionesEstadoPagoAuto = jComboBoxTiposAccionesEstadoPagoAuto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoPagoAuto() {
		return this.jComboBoxTiposAccionesFormularioEstadoPagoAuto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoPagoAuto(
			JComboBox jComboBoxTiposAccionesFormularioEstadoPagoAuto) {
		this.jComboBoxTiposAccionesFormularioEstadoPagoAuto = jComboBoxTiposAccionesFormularioEstadoPagoAuto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
		
		this.estadopagoautoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopagoautoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadopagoautoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pagoautoSessionBean=new PagoAutoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoPagoAutoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Pago Automatico MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoPagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoPagoAuto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoPagoAuto=new JButtonMe();
				this.jButtonModificarToolBarEstadoPagoAuto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoPagoAuto,this.jTtoolBarDetalleEstadoPagoAuto,
							"actualizar","actualizar","Actualizar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoPagoAuto,this.jTtoolBarDetalleEstadoPagoAuto,
							"eliminar","eliminar","Eliminar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoPagoAuto,this.jTtoolBarDetalleEstadoPagoAuto,
							"cancelar","cancelar","Cancelar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoPagoAuto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoPagoAuto,this.jTtoolBarDetalleEstadoPagoAuto,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoPagoAuto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoPagoAuto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoPagoAuto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoPagoAuto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoPagoAuto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoPagoAuto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoPagoAuto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoPagoAuto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoPagoAuto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoPagoAuto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoPagoAuto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoPagoAuto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoPagoAuto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoPagoAuto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoPagoAuto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoPagoAuto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoPagoAuto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoPagoAuto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoPagoAuto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoPagoAuto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoPagoAuto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoPagoAuto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoPagoAuto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoPagoAuto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoPagoAuto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoPagoAuto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoPagoAuto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoPagoAuto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoPagoAuto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoPagoAuto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoPagoAuto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoPagoAuto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoPagoAuto.add(this.jMenuItemDetalleCerrarEstadoPagoAuto);
		
		this.jmenuDetalleAccionesEstadoPagoAuto.add(this.jMenuItemActualizarEstadoPagoAuto);
		this.jmenuDetalleAccionesEstadoPagoAuto.add(this.jMenuItemEliminarEstadoPagoAuto);
		this.jmenuDetalleAccionesEstadoPagoAuto.add(this.jMenuItemCancelarEstadoPagoAuto);		
		
		//this.jmenuDetalleDatosEstadoPagoAuto.add(this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto);				
		this.jmenuDetalleDatosEstadoPagoAuto.add(this.jMenuItemDetalleMostarOcultarEstadoPagoAuto);				
				
		//this.jmenuDetalleAccionesEstadoPagoAuto.add(this.jMenuItemGuardarCambiosEstadoPagoAuto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoPagoAuto.add(this.jmenuDetalleArchivoEstadoPagoAuto);		
		this.jmenuBarDetalleEstadoPagoAuto.add(this.jmenuDetalleAccionesEstadoPagoAuto);		
		this.jmenuBarDetalleEstadoPagoAuto.add(this.jmenuDetalleDatosEstadoPagoAuto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoPagoAuto.add(this.jmenuDetalleEstadoPagoAuto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoPagoAuto);				
	}
	
	
	public void inicializarElementosCamposEstadoPagoAuto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoPagoAuto = new JLabelMe();
		jLabelIdEstadoPagoAuto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoPagoAuto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoPagoAuto.setToolTipText(EstadoPagoAutoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoPagoAuto= new GridBagLayout();

		this.jPanelidEstadoPagoAuto.setLayout(this.gridaBagLayoutEstadoPagoAuto);

		jTextFieldidEstadoPagoAuto = new JTextFieldMe();
		jTextFieldidEstadoPagoAuto.setText("Id");

		jTextFieldidEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEstadoPagoAuto = new JLabelMe();
		this.jLabelnombreEstadoPagoAuto.setText(""+EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoPagoAuto.setToolTipText("Nombre");
		this.jLabelnombreEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoPagoAuto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoPagoAuto.setToolTipText(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoPagoAuto = new GridBagLayout();
		this.jPanelnombreEstadoPagoAuto.setLayout(this.gridaBagLayoutEstadoPagoAuto);


		jTextAreanombreEstadoPagoAuto= new JTextAreaMe();
		jTextAreanombreEstadoPagoAuto.setEnabled(false);
		jTextAreanombreEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoPagoAuto.setLineWrap(true);
		jTextAreanombreEstadoPagoAuto.setWrapStyleWord(true);
		jTextAreanombreEstadoPagoAuto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoPagoAuto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoPagoAuto = new JScrollPane(jTextAreanombreEstadoPagoAuto);
		jscrollPanenombreEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoPagoAutoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoPagoAutoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPagoAutoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoPagoAutoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoPagoAutoBusqueda.setText("U");
		this.jButtonnombreEstadoPagoAutoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoPagoAutoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoPagoAutoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoPagoAutoBusqueda"));

		if(this.estadopagoautoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoPagoAutoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoPagoAuto() {
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
		//this.jInternalFrameDetalleEstadoPagoAuto = new EstadoPagoAutoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Pago Automatico DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoPagoAuto= new GridBagLayout();
		

		
		String sToolTipEstadoPagoAuto="";
		sToolTipEstadoPagoAuto=EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoPagoAuto+="(Tesoreria.EstadoPagoAuto)";
		}
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoPagoAuto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoPagoAuto = new JButtonMe();
		this.jButtonModificarEstadoPagoAuto = new JButtonMe();
        this.jButtonActualizarEstadoPagoAuto = new JButtonMe();
        this.jButtonEliminarEstadoPagoAuto = new JButtonMe();
        this.jButtonCancelarEstadoPagoAuto = new JButtonMe();
        this.jButtonGuardarCambiosEstadoPagoAuto = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoPagoAuto = new JButtonMe();
		this.jButtonCerrarEstadoPagoAuto = new JButtonMe();
		
		this.jScrollPanelDatosEstadoPagoAuto = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoPagoAuto = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoPagoAuto = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Pago Automatico";
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Pago Automaticos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoPagoAuto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoPagoAuto.setName("jPanelCamposEstadoPagoAuto"); 

		this.jPanelCamposOcultosEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoPagoAuto.setName("jPanelCamposOcultosEstadoPagoAuto"); 

        this.jPanelAccionesEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoPagoAuto.setToolTipText("Acciones");
        this.jPanelAccionesEstadoPagoAuto.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoPagoAuto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoPagoAuto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoPagoAuto.setText("Nuevo");
		this.jButtonModificarEstadoPagoAuto.setText("Editar");
        this.jButtonActualizarEstadoPagoAuto.setText("Actualizar");
        this.jButtonEliminarEstadoPagoAuto.setText("Eliminar");
        this.jButtonCancelarEstadoPagoAuto.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoPagoAuto.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.setText("Guardar");
		this.jButtonCerrarEstadoPagoAuto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoPagoAuto,"nuevo_button","Nuevo",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoPagoAuto,"modificar_button","Editar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoPagoAuto,"actualizar_button","Actualizar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoPagoAuto,"eliminar_button","Eliminar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoPagoAuto,"cancelar_button","Cancelar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoPagoAuto,"guardarcambios_button","Guardar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoPagoAuto,"guardarcambiostabla_button","Guardar",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoPagoAuto,"cerrar_button","Salir",this.estadopagoautoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoPagoAuto.setToolTipText("Nuevo"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoPagoAuto.setToolTipText("Editar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoPagoAuto.setToolTipText("Actualizar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoPagoAuto.setToolTipText("Eliminar)"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoPagoAuto.setToolTipText("Cancelar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoPagoAuto.setToolTipText("Guardar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.setToolTipText("Guardar"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoPagoAuto.setToolTipText("Salir"+" "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoPagoAuto";
		inputMap = this.jButtonNuevoEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoPagoAuto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoPagoAuto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoPagoAuto";
		inputMap = this.jButtonActualizarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoPagoAuto"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoPagoAuto";
		inputMap = this.jButtonEliminarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoPagoAuto"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoPagoAuto";
		inputMap = this.jButtonCancelarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoPagoAuto"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoPagoAuto";
		inputMap = this.jButtonCerrarEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoPagoAuto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoPagoAuto";
		inputMap = this.jButtonGuardarCambiosTablaEstadoPagoAuto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoPagoAuto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoPagoAuto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoPagoAuto.setToolTipText("Nuevo EstadoPagoAuto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoPagoAuto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoPagoAuto.setToolTipText("Sin Cerrar Ventana EstadoPagoAuto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoPagoAuto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoPagoAuto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoPagoAuto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoPagoAuto.setText("Accion");
		this.jComboBoxTiposAccionesEstadoPagoAuto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoPagoAuto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoPagoAuto = new JLabelMe();
		
		this.jLabelAccionesEstadoPagoAuto.setText("Acciones");		
		this.jLabelAccionesEstadoPagoAuto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPagoAuto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoPagoAuto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoPagoAuto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoPagoAuto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoPagoAuto=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoPagoAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoPagoAuto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoPagoAuto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPagoAuto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoPagoAuto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoPagoAuto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoPagoAuto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoPagoAuto = new GridBagLayout();
		
		this.jPanelCamposEstadoPagoAuto.setLayout(gridaBagLayoutCamposEstadoPagoAuto);
		this.jPanelCamposOcultosEstadoPagoAuto.setLayout(gridaBagLayoutCamposOcultosEstadoPagoAuto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
	this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
	this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
	this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoPagoAuto.add(jLabelIdEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);



	this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
	this.gridBagConstraintsEstadoPagoAuto.gridx = 1;
	this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
	this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoPagoAuto.add(jTextFieldidEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);


	this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
	this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
	this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
	this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoPagoAuto.add(jLabelnombreEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		//this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
		this.gridBagConstraintsEstadoPagoAuto.gridx = 2;
		this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
		this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoPagoAuto.add(jButtonnombreEstadoPagoAutoBusqueda, this.gridBagConstraintsEstadoPagoAuto);
	}

	this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
	this.gridBagConstraintsEstadoPagoAuto.gridx = 1;
	this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
	this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoPagoAuto.add(jscrollPanenombreEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPagoAuto.gridy = iYPanelCamposEstadoPagoAuto;
	this.gridBagConstraintsEstadoPagoAuto.gridx = iXPanelCamposEstadoPagoAuto++;
	this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPagoAuto.add(this.jPanelidEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);



	if(iXPanelCamposEstadoPagoAuto % 1==0) {
		iXPanelCamposEstadoPagoAuto=0;
		iYPanelCamposEstadoPagoAuto++;
	}
	this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoPagoAuto.gridy = iYPanelCamposEstadoPagoAuto;
	this.gridBagConstraintsEstadoPagoAuto.gridx = iXPanelCamposEstadoPagoAuto++;
	this.gridBagConstraintsEstadoPagoAuto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoPagoAuto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoPagoAuto.add(this.jPanelnombreEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);



	if(iXPanelCamposEstadoPagoAuto % 1==0) {
		iXPanelCamposEstadoPagoAuto=0;
		iYPanelCamposEstadoPagoAuto++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoPagoAuto= new GridBagLayout();
		this.jPanelAccionesEstadoPagoAuto.setLayout(gridaBagLayoutAccionesEstadoPagoAuto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoPagoAuto= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoPagoAuto.setLayout(gridaBagLayoutAccionesFormularioEstadoPagoAuto);
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPagoAuto.add(this.jComboBoxTiposAccionesFormularioEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);

		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoPagoAuto.add(this.jCheckBoxPostAccionNuevoEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPagoAuto.add(this.jCheckBoxPostAccionSinCerrarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoPagoAuto.add(this.jCheckBoxPostAccionSinMensajeEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoPagoAuto.add(this.jButtonModificarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);							

		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;
		this.gridBagConstraintsEstadoPagoAuto.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoPagoAuto.add(this.jButtonEliminarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
			
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPagoAuto.add(this.jButtonActualizarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);


		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoPagoAuto.add(this.jButtonGuardarCambiosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);	
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = 0;		
		this.gridBagConstraintsEstadoPagoAuto.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoPagoAuto.add(this.jButtonCancelarEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoPagoAuto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoPagoAuto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();						
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoPagoAuto.gridx = 0;		
			//this.gridBagConstraintsEstadoPagoAuto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoPagoAuto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoPagoAuto.gridx =0;
		this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoPagoAuto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoPagoAuto = new EstadoPagoAutoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Pago Automatico DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Pago Automatico DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Pago Automatico Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoPagoAutoModel estadopagoautoModel=new EstadoPagoAutoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoPagoAutoModel.EstadoPagoAutoFocusTraversalPolicy estadopagoautoFocusTraversalPolicy = estadopagoautoModel.new EstadoPagoAutoFocusTraversalPolicy(this);
			
			//estadopagoautoFocusTraversalPolicy.setestadopagoautoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadopagoautoModel);
			
			
			this.jContentPaneDetalleEstadoPagoAuto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoPagoAuto = new GridBagLayout();	
			this.jContentPaneDetalleEstadoPagoAuto.setLayout(gridaBagLayoutDetalleEstadoPagoAuto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoPagoAuto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
				this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoPagoAuto.add(jTtoolBarDetalleEstadoPagoAuto, gridBagConstraintsEstadoPagoAuto);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoPagoAuto=   new JScrollPane(jContentPaneDetalleEstadoPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoPagoAuto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
	        
			this.jContentPaneDetalleEstadoPagoAuto.add(jPanelCamposEstadoPagoAuto, gridBagConstraintsEstadoPagoAuto);
			
			
			
			
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
						&& estadopagoautoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(this.puedeCargarPorPartePagoAuto,false,-1);
					
					if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoPagoAuto= new GridBagConstraints();
						this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
						this.jContentPaneDetalleEstadoPagoAuto.add(this.jTabbedPaneRelacionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoPagoAuto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoPagoAuto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
					this.gridBagConstraintsEstadoPagoAuto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoPagoAuto.add(jPanelCamposOcultosEstadoPagoAuto, gridBagConstraintsEstadoPagoAuto);
				
					this.jPanelCamposOcultosEstadoPagoAuto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
	        this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoPagoAuto.add(this.jPanelAccionesFormularioEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);							
			
			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
	        this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoPagoAuto.add(this.jPanelAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoPagoAuto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoPagoAuto=   new JScrollPane(this.jPanelCamposEstadoPagoAuto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoPagoAuto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPagoAuto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoPagoAuto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
			this.gridBagConstraintsEstadoPagoAuto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoPagoAuto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoPagoAuto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);			
			
			this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
			this.gridBagConstraintsEstadoPagoAuto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
			
			
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		
			
		this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
		this.gridBagConstraintsEstadoPagoAuto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoPagoAuto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoPagoAuto, this.gridBagConstraintsEstadoPagoAuto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoPagoAuto;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoPagoAuto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePagoAuto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pagoautoSessionBean=new PagoAutoSessionBean();
		this.pagoautoSessionBean.setConGuardarRelaciones(false);
		this.pagoautoSessionBean.setEsGuardarRelacionado(true);

		this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pagoautoBeanSwingJInternalFramePopup=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pagoautoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {

				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoPagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pagoautoSessionBean.setEsGuardarRelacionado(true);

				this.pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pagoautoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pagoautoBeanSwingJInternalFrame.setpagoautoSessionBean(this.pagoautoSessionBean);

				//this.gridBagConstraintsEstadoPagoAuto = new GridBagConstraints();
				//this.gridBagConstraintsEstadoPagoAuto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoPagoAuto.gridx = 0;
				//this.jContentPaneDetalleEstadoPagoAuto.add(this.pagoautoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoPagoAuto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoPagoAuto.add("Pago Autos",this.pagoautoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoPagoAuto.setComponentAt(iIndexTab,this.pagoautoBeanSwingJInternalFrame.getContentPane());
				}

				//PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pagoautoSessionBean.setEsGuardarRelacionado(false);
				this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePagoAuto) {
					this.jTabbedPaneRelacionesEstadoPagoAuto.add("Pago Autos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPagoAutoBeanSwingJInternalFrame(List<EstadoPagoAuto> estadopagoautos,EstadoPagoAuto estadopagoauto,PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pagoautoBeanSwingJInternalFrame.getPagoAutoLogic().setConnexion(this.estadopagoautoLogic.getConnexion());

					pagoautoBeanSwingJInternalFrame.setestadopagoautosForeignKey(estadopagoautos);
					pagoautoBeanSwingJInternalFrame.setestadopagoautoForeignKey(estadopagoauto);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPagoAuto(true);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setlidEstadoPagoAutoActual(estadopagoauto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pagoautoBeanSwingJInternalFrame.cargarCombosForeignKeyPagoAuto(pagoautoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pagoautoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoPagoAuto(true);
					pagoautoBeanSwingJInternalFrame.setid_estado_pago_autoFK_IdEstadoPagoAuto(estadopagoauto.getId());

					if(!this.conCargarFormDetalle) {
						pagoautoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pagoautoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoPagoAutoForeignKey(estadopagoauto,1,false,true,true);
					pagoautoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pagoautoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoPagoAuto");
					pagoautoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoPagoAuto");
					pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(true);
					pagoautoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPagoAuto("n",pagoautoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pagoautoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pagoautoBeanSwingJInternalFrame.setAutoscrolls(true);
					pagoautoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("relacionado");
					} else {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("no_relacionado");
					}

					pagoautoBeanSwingJInternalFrame.getjButtonRecargarInformacionPagoAuto().setVisible(false);

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
