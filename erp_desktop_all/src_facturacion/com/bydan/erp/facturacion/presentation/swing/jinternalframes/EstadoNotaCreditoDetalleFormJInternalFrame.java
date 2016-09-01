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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoNotaCreditoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoNotaCreditoDetalleFormJInternalFrame extends EstadoNotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoNotaCredito;
	
	protected JMenuBar jmenuBarDetalleEstadoNotaCredito;
	
	protected JMenu jmenuDetalleEstadoNotaCredito;
	protected JMenu jmenuDetalleArchivoEstadoNotaCredito;
	protected JMenu jmenuDetalleAccionesEstadoNotaCredito;
	protected JMenu jmenuDetalleDatosEstadoNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoNotaCredito;	
	protected GridBagConstraints gridBagConstraintsEstadoNotaCredito;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoNotaCreditoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoNotaCredito;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoNotaCreditoSessionBean estadonotacreditoSessionBean;
	
	

	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;
	public NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoSoli=false;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;

	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;
	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoPuntoVenta=false;
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
	
		
	
	public EstadoNotaCreditoLogic estadonotacreditoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionEstadoNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralEstadoNotaCredito;
	
	protected JPanel jPanelCamposEstadoNotaCredito;    
	protected JPanel jPanelCamposOcultosEstadoNotaCredito;    	
	protected JPanel jPanelAccionesEstadoNotaCredito;
	protected JPanel jPanelAccionesFormularioEstadoNotaCredito;
    
	
	
	protected Integer iXPanelCamposEstadoNotaCredito=0;
	protected Integer iYPanelCamposEstadoNotaCredito=0;
	
	protected Integer iXPanelCamposOcultosEstadoNotaCredito=0;
	protected Integer iYPanelCamposOcultosEstadoNotaCredito=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoNotaCredito;
	public JButton jButtonModificarEstadoNotaCredito;
	public JButton jButtonActualizarEstadoNotaCredito;
    public JButton jButtonEliminarEstadoNotaCredito;
	public JButton jButtonCancelarEstadoNotaCredito;
    public JButton jButtonGuardarCambiosEstadoNotaCredito;
	public JButton jButtonGuardarCambiosTablaEstadoNotaCredito;
	protected JButton jButtonCerrarEstadoNotaCredito;
	
	
	protected JButton jButtonProcesarInformacionEstadoNotaCredito;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoNotaCredito;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoNotaCredito;
	protected JButton jButtonModificarToolBarEstadoNotaCredito;
	protected JButton jButtonActualizarToolBarEstadoNotaCredito;
    protected JButton jButtonEliminarToolBarEstadoNotaCredito;
	protected JButton jButtonCancelarToolBarEstadoNotaCredito;
    protected JButton jButtonGuardarCambiosToolBarEstadoNotaCredito;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoNotaCredito;
	protected JButton jButtonCerrarToolBarEstadoNotaCredito;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoNotaCredito;
	protected JMenuItem jMenuItemModificarEstadoNotaCredito;
	protected JMenuItem jMenuItemActualizarEstadoNotaCredito;
    protected JMenuItem jMenuItemEliminarEstadoNotaCredito;
	protected JMenuItem jMenuItemCancelarEstadoNotaCredito;
    protected JMenuItem jMenuItemGuardarCambiosEstadoNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoNotaCredito;
	protected JMenuItem jMenuItemCerrarEstadoNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarEstadoNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoNotaCredito;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarEstadoNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoNotaCredito;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoNotaCredito;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoNotaCredito;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoNotaCredito;
	public JLabel jLabelIdEstadoNotaCredito;
	public JTextFieldMe jTextFieldidEstadoNotaCredito;
	public JButton jButtonidEstadoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoNotaCredito;
	public JLabel jLabelcodigoEstadoNotaCredito;
	public JTextField jTextFieldcodigoEstadoNotaCredito;
	public JButton jButtoncodigoEstadoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoNotaCredito;
	public JLabel jLabelnombreEstadoNotaCredito;
	public JTextArea jTextAreanombreEstadoNotaCredito;
	public JScrollPane jscrollPanenombreEstadoNotaCredito;
	public JButton jButtonnombreEstadoNotaCreditoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoNotaCredito;
	
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
	
	public EstadoNotaCreditoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoNotaCredito=new JPanel();
				this.jPanelAccionesFormularioEstadoNotaCredito=new JPanel();
				this.jmenuBarDetalleEstadoNotaCredito=new JMenuBar();
				this.jTtoolBarDetalleEstadoNotaCredito=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoNotaCreditoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNotaCreditoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoNotaCredito() {
		return this.jButtonActualizarToolBarEstadoNotaCredito;
	}
	
	public JButton getjButtonEliminarToolBarEstadoNotaCredito() {
		return this.jButtonEliminarToolBarEstadoNotaCredito;
	}
	
	public JButton getjButtonCancelarToolBarEstadoNotaCredito() {
		return this.jButtonCancelarToolBarEstadoNotaCredito;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoNotaCredito() {
		return this.jButtonProcesarInformacionEstadoNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoNotaCredito)	{
		this.jButtonProcesarInformacionEstadoNotaCredito = jButtonProcesarInformacionEstadoNotaCredito;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoNotaCredito() {
		return this.jComboBoxTiposAccionesEstadoNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoNotaCredito(
			JComboBox jComboBoxTiposRelacionesEstadoNotaCredito) {
		this.jComboBoxTiposRelacionesEstadoNotaCredito = jComboBoxTiposRelacionesEstadoNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoNotaCredito(
			JComboBox jComboBoxTiposAccionesEstadoNotaCredito) {
		this.jComboBoxTiposAccionesEstadoNotaCredito = jComboBoxTiposAccionesEstadoNotaCredito;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoNotaCredito() {
		return this.jComboBoxTiposAccionesFormularioEstadoNotaCredito;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoNotaCredito(
			JComboBox jComboBoxTiposAccionesFormularioEstadoNotaCredito) {
		this.jComboBoxTiposAccionesFormularioEstadoNotaCredito = jComboBoxTiposAccionesFormularioEstadoNotaCredito;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
		
		this.estadonotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadonotacreditoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		//this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoNotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoNotaCredito= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoNotaCredito=new JButtonMe();
				this.jButtonModificarToolBarEstadoNotaCredito=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoNotaCredito,this.jTtoolBarDetalleEstadoNotaCredito,
							"actualizar","actualizar","Actualizar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoNotaCredito,this.jTtoolBarDetalleEstadoNotaCredito,
							"eliminar","eliminar","Eliminar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoNotaCredito,this.jTtoolBarDetalleEstadoNotaCredito,
							"cancelar","cancelar","Cancelar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoNotaCredito,this.jTtoolBarDetalleEstadoNotaCredito,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoNotaCredito=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoNotaCredito=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoNotaCredito=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoNotaCredito=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoNotaCredito=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoNotaCredito= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoNotaCredito.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoNotaCredito,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoNotaCredito= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoNotaCredito.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoNotaCredito,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoNotaCredito= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoNotaCredito.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoNotaCredito,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoNotaCredito= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoNotaCredito.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoNotaCredito,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoNotaCredito.add(this.jMenuItemDetalleCerrarEstadoNotaCredito);
		
		this.jmenuDetalleAccionesEstadoNotaCredito.add(this.jMenuItemActualizarEstadoNotaCredito);
		this.jmenuDetalleAccionesEstadoNotaCredito.add(this.jMenuItemEliminarEstadoNotaCredito);
		this.jmenuDetalleAccionesEstadoNotaCredito.add(this.jMenuItemCancelarEstadoNotaCredito);		
		
		//this.jmenuDetalleDatosEstadoNotaCredito.add(this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito);				
		this.jmenuDetalleDatosEstadoNotaCredito.add(this.jMenuItemDetalleMostarOcultarEstadoNotaCredito);				
				
		//this.jmenuDetalleAccionesEstadoNotaCredito.add(this.jMenuItemGuardarCambiosEstadoNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoNotaCredito.add(this.jmenuDetalleArchivoEstadoNotaCredito);		
		this.jmenuBarDetalleEstadoNotaCredito.add(this.jmenuDetalleAccionesEstadoNotaCredito);		
		this.jmenuBarDetalleEstadoNotaCredito.add(this.jmenuDetalleDatosEstadoNotaCredito);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoNotaCredito.add(this.jmenuDetalleEstadoNotaCredito);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoNotaCredito);				
	}
	
	
	public void inicializarElementosCamposEstadoNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoNotaCredito = new JLabelMe();
		jLabelIdEstadoNotaCredito.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoNotaCredito = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoNotaCredito.setToolTipText(EstadoNotaCreditoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoNotaCredito= new GridBagLayout();

		this.jPanelidEstadoNotaCredito.setLayout(this.gridaBagLayoutEstadoNotaCredito);

		jTextFieldidEstadoNotaCredito = new JTextFieldMe();
		jTextFieldidEstadoNotaCredito.setText("Id");

		jTextFieldidEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoNotaCredito = new JLabelMe();
		this.jLabelcodigoEstadoNotaCredito.setText(""+EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoNotaCredito.setToolTipText("Codigo");
		this.jLabelcodigoEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoNotaCredito.setToolTipText(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoNotaCredito = new GridBagLayout();
		this.jPanelcodigoEstadoNotaCredito.setLayout(this.gridaBagLayoutEstadoNotaCredito);


		jTextFieldcodigoEstadoNotaCredito= new JTextFieldMe();

		jTextFieldcodigoEstadoNotaCredito.setEnabled(false);
		jTextFieldcodigoEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoNotaCreditoBusqueda.setText("U");
		this.jButtoncodigoEstadoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoNotaCreditoBusqueda"));

		if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoNotaCredito = new JLabelMe();
		this.jLabelnombreEstadoNotaCredito.setText(""+EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoNotaCredito.setToolTipText("Nombre");
		this.jLabelnombreEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoNotaCredito.setToolTipText(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoNotaCredito = new GridBagLayout();
		this.jPanelnombreEstadoNotaCredito.setLayout(this.gridaBagLayoutEstadoNotaCredito);


		jTextAreanombreEstadoNotaCredito= new JTextAreaMe();
		jTextAreanombreEstadoNotaCredito.setEnabled(false);
		jTextAreanombreEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoNotaCredito.setLineWrap(true);
		jTextAreanombreEstadoNotaCredito.setWrapStyleWord(true);
		jTextAreanombreEstadoNotaCredito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoNotaCredito.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoNotaCredito = new JScrollPane(jTextAreanombreEstadoNotaCredito);
		jscrollPanenombreEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoNotaCreditoBusqueda.setText("U");
		this.jButtonnombreEstadoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoNotaCreditoBusqueda"));

		if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoNotaCreditoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoNotaCredito() {
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
		//this.jInternalFrameDetalleEstadoNotaCredito = new EstadoNotaCreditoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoNotaCredito= new GridBagLayout();
		

		
		String sToolTipEstadoNotaCredito="";
		sToolTipEstadoNotaCredito=EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoNotaCredito+="(Facturacion.EstadoNotaCredito)";
		}
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoNotaCredito+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoNotaCredito = new JButtonMe();
		this.jButtonModificarEstadoNotaCredito = new JButtonMe();
        this.jButtonActualizarEstadoNotaCredito = new JButtonMe();
        this.jButtonEliminarEstadoNotaCredito = new JButtonMe();
        this.jButtonCancelarEstadoNotaCredito = new JButtonMe();
        this.jButtonGuardarCambiosEstadoNotaCredito = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoNotaCredito = new JButtonMe();
		this.jButtonCerrarEstadoNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosEstadoNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoNotaCredito = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoNotaCredito = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Nota Credito";
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoNotaCredito.setName("jPanelCamposEstadoNotaCredito"); 

		this.jPanelCamposOcultosEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoNotaCredito.setName("jPanelCamposOcultosEstadoNotaCredito"); 

        this.jPanelAccionesEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesEstadoNotaCredito.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoNotaCredito.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoNotaCredito.setText("Nuevo");
		this.jButtonModificarEstadoNotaCredito.setText("Editar");
        this.jButtonActualizarEstadoNotaCredito.setText("Actualizar");
        this.jButtonEliminarEstadoNotaCredito.setText("Eliminar");
        this.jButtonCancelarEstadoNotaCredito.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoNotaCredito.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.setText("Guardar");
		this.jButtonCerrarEstadoNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoNotaCredito,"nuevo_button","Nuevo",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoNotaCredito,"modificar_button","Editar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoNotaCredito,"actualizar_button","Actualizar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoNotaCredito,"eliminar_button","Eliminar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoNotaCredito,"cancelar_button","Cancelar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoNotaCredito,"guardarcambios_button","Guardar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoNotaCredito,"guardarcambiostabla_button","Guardar",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoNotaCredito,"cerrar_button","Salir",this.estadonotacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoNotaCredito.setToolTipText("Nuevo"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoNotaCredito.setToolTipText("Editar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoNotaCredito.setToolTipText("Actualizar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoNotaCredito.setToolTipText("Eliminar)"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoNotaCredito.setToolTipText("Cancelar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoNotaCredito.setToolTipText("Guardar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.setToolTipText("Guardar"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoNotaCredito.setToolTipText("Salir"+" "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoNotaCredito";
		inputMap = this.jButtonNuevoEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoNotaCredito"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoNotaCredito";
		inputMap = this.jButtonActualizarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoNotaCredito"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoNotaCredito";
		inputMap = this.jButtonEliminarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoNotaCredito"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoNotaCredito";
		inputMap = this.jButtonCancelarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoNotaCredito"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoNotaCredito";
		inputMap = this.jButtonCerrarEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaEstadoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoNotaCredito"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoNotaCredito.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoNotaCredito.setToolTipText("Nuevo EstadoNotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoNotaCredito.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoNotaCredito.setToolTipText("Sin Cerrar Ventana EstadoNotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoNotaCredito.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoNotaCredito.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesEstadoNotaCredito.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoNotaCredito = new JLabelMe();
		
		this.jLabelAccionesEstadoNotaCredito.setText("Acciones");		
		this.jLabelAccionesEstadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoNotaCredito();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoNotaCredito();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoNotaCredito=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoNotaCredito = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoNotaCredito = new GridBagLayout();
		
		this.jPanelCamposEstadoNotaCredito.setLayout(gridaBagLayoutCamposEstadoNotaCredito);
		this.jPanelCamposOcultosEstadoNotaCredito.setLayout(gridaBagLayoutCamposOcultosEstadoNotaCredito);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
	this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoNotaCredito.add(jLabelIdEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);



	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
	this.gridBagConstraintsEstadoNotaCredito.gridx = 1;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoNotaCredito.add(jTextFieldidEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);


	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
	this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoNotaCredito.add(jLabelcodigoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
		this.gridBagConstraintsEstadoNotaCredito.gridx = 2;
		this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
		this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoNotaCredito.add(jButtoncodigoEstadoNotaCreditoBusqueda, this.gridBagConstraintsEstadoNotaCredito);
	}

	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
	this.gridBagConstraintsEstadoNotaCredito.gridx = 1;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoNotaCredito.add(jTextFieldcodigoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);


	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
	this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoNotaCredito.add(jLabelnombreEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
		this.gridBagConstraintsEstadoNotaCredito.gridx = 2;
		this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
		this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoNotaCredito.add(jButtonnombreEstadoNotaCreditoBusqueda, this.gridBagConstraintsEstadoNotaCredito);
	}

	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
	this.gridBagConstraintsEstadoNotaCredito.gridx = 1;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoNotaCredito.add(jscrollPanenombreEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNotaCredito.gridy = iYPanelCamposEstadoNotaCredito;
	this.gridBagConstraintsEstadoNotaCredito.gridx = iXPanelCamposEstadoNotaCredito++;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNotaCredito.add(this.jPanelidEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);



	if(iXPanelCamposEstadoNotaCredito % 1==0) {
		iXPanelCamposEstadoNotaCredito=0;
		iYPanelCamposEstadoNotaCredito++;
	}
	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNotaCredito.gridy = iYPanelCamposEstadoNotaCredito;
	this.gridBagConstraintsEstadoNotaCredito.gridx = iXPanelCamposEstadoNotaCredito++;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNotaCredito.add(this.jPanelcodigoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);



	if(iXPanelCamposEstadoNotaCredito % 1==0) {
		iXPanelCamposEstadoNotaCredito=0;
		iYPanelCamposEstadoNotaCredito++;
	}
	this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNotaCredito.gridy = iYPanelCamposEstadoNotaCredito;
	this.gridBagConstraintsEstadoNotaCredito.gridx = iXPanelCamposEstadoNotaCredito++;
	this.gridBagConstraintsEstadoNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNotaCredito.add(this.jPanelnombreEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);



	if(iXPanelCamposEstadoNotaCredito % 1==0) {
		iXPanelCamposEstadoNotaCredito=0;
		iYPanelCamposEstadoNotaCredito++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoNotaCredito= new GridBagLayout();
		this.jPanelAccionesEstadoNotaCredito.setLayout(gridaBagLayoutAccionesEstadoNotaCredito);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoNotaCredito= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoNotaCredito.setLayout(gridaBagLayoutAccionesFormularioEstadoNotaCredito);
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoNotaCredito.add(this.jComboBoxTiposAccionesFormularioEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);

		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoNotaCredito.add(this.jCheckBoxPostAccionNuevoEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoNotaCredito.add(this.jCheckBoxPostAccionSinCerrarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoNotaCredito.add(this.jCheckBoxPostAccionSinMensajeEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoNotaCredito.add(this.jButtonModificarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);							

		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;
		this.gridBagConstraintsEstadoNotaCredito.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoNotaCredito.add(this.jButtonEliminarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
			
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoNotaCredito.add(this.jButtonActualizarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);


		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoNotaCredito.add(this.jButtonGuardarCambiosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);	
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = 0;		
		this.gridBagConstraintsEstadoNotaCredito.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoNotaCredito.add(this.jButtonCancelarEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoNotaCredito);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoNotaCredito.gridx = 0;		
			//this.gridBagConstraintsEstadoNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoNotaCredito.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoNotaCredito.gridx =0;
		this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoNotaCredito = new EstadoNotaCreditoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoNotaCreditoModel estadonotacreditoModel=new EstadoNotaCreditoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoNotaCreditoModel.EstadoNotaCreditoFocusTraversalPolicy estadonotacreditoFocusTraversalPolicy = estadonotacreditoModel.new EstadoNotaCreditoFocusTraversalPolicy(this);
			
			//estadonotacreditoFocusTraversalPolicy.setestadonotacreditoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadonotacreditoModel);
			
			
			this.jContentPaneDetalleEstadoNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoNotaCredito = new GridBagLayout();	
			this.jContentPaneDetalleEstadoNotaCredito.setLayout(gridaBagLayoutDetalleEstadoNotaCredito);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoNotaCredito = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoNotaCredito.add(jTtoolBarDetalleEstadoNotaCredito, gridBagConstraintsEstadoNotaCredito);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoNotaCredito=   new JScrollPane(jContentPaneDetalleEstadoNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
	        
			this.jContentPaneDetalleEstadoNotaCredito.add(jPanelCamposEstadoNotaCredito, gridBagConstraintsEstadoNotaCredito);
			
			
			
			
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
						&& estadonotacreditoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(this.puedeCargarPorParteNotaCreditoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(this.puedeCargarPorParteNotaCreditoSoli,false,-1);
					
					if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoNotaCredito= new GridBagConstraints();
						this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
						this.jContentPaneDetalleEstadoNotaCredito.add(this.jTabbedPaneRelacionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoNotaCredito.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoNotaCredito.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
					this.gridBagConstraintsEstadoNotaCredito.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoNotaCredito.add(jPanelCamposOcultosEstadoNotaCredito, gridBagConstraintsEstadoNotaCredito);
				
					this.jPanelCamposOcultosEstadoNotaCredito.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
	        this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoNotaCredito.add(this.jPanelAccionesFormularioEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);							
			
			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
	        this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoNotaCredito.add(this.jPanelAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoNotaCredito);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoNotaCredito=   new JScrollPane(this.jPanelCamposEstadoNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
			this.gridBagConstraintsEstadoNotaCredito.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoNotaCredito.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoNotaCredito.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);			
			
			this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsEstadoNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
			
			
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		
			
		this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsEstadoNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoNotaCredito, this.gridBagConstraintsEstadoNotaCredito);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoNotaCredito;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoNotaCredito;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaSessionBean(this.notacreditopuntoventaSessionBean);

				//this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
				//this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
				//this.jContentPaneDetalleEstadoNotaCredito.add(this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoNotaCredito);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoNotaCredito.add("Nota Creditos",this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoNotaCredito.setComponentAt(iIndexTab,this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesEstadoNotaCredito.add("Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		this.notacreditosoliSessionBean.setConGuardarRelaciones(true);
		this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditosoliBeanSwingJInternalFrame.setnotacreditosoliSessionBean(this.notacreditosoliSessionBean);

				//this.gridBagConstraintsEstadoNotaCredito = new GridBagConstraints();
				//this.gridBagConstraintsEstadoNotaCredito.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoNotaCredito.gridx = 0;
				//this.jContentPaneDetalleEstadoNotaCredito.add(this.notacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoNotaCredito);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoNotaCredito.add("Solicitud Nota Creditos",this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoNotaCredito.setComponentAt(iIndexTab,this.notacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.notacreditosoliBeanSwingJInternalFrame=null;//new NotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoSoli) {
					this.jTabbedPaneRelacionesEstadoNotaCredito.add("Solicitud Nota Creditos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNotaCreditoSoliBeanSwingJInternalFrame(List<EstadoNotaCredito> estadonotacreditos,EstadoNotaCredito estadonotacredito,NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditosoliBeanSwingJInternalFrame=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditosoliBeanSwingJInternalFrame.getNotaCreditoSoliLogic().setConnexion(this.estadonotacreditoLogic.getConnexion());

					notacreditosoliBeanSwingJInternalFrame.setestadonotacreditosolisForeignKey(estadonotacreditos);
					notacreditosoliBeanSwingJInternalFrame.setestadonotacreditosoliForeignKey(estadonotacredito);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionEstadoNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setlidEstadoNotaCreditoSoliActual(estadonotacredito.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoSoli(notacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.setid_estado_nota_creditoFK_IdEstadoNotaCreditoSoli(estadonotacredito.getId());

					if(!this.conCargarFormDetalle) {
						notacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoNotaCreditoSoliForeignKey(estadonotacredito,1,false,true,true);
					notacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoNotaCredito");
					notacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoNotaCredito");
					notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(true);
					notacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoSoli("n",notacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("relacionado");
					} else {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");
					}

					notacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoSoli().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<EstadoNotaCredito> estadonotacreditos,EstadoNotaCredito estadonotacredito,NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().setConnexion(this.estadonotacreditoLogic.getConnexion());

					notacreditopuntoventaBeanSwingJInternalFrame.setestadonotacreditopuntoventasForeignKey(estadonotacreditos);
					notacreditopuntoventaBeanSwingJInternalFrame.setestadonotacreditopuntoventaForeignKey(estadonotacredito);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setlidEstadoNotaCreditoPuntoVentaActual(estadonotacredito.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoPuntoVenta(notacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setid_estado_nota_credito_punto_ventaFK_IdEstadoNotaCreditoPuntoVenta(estadonotacredito.getId());

					if(!this.conCargarFormDetalle) {
						notacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoNotaCreditoPuntoVentaForeignKey(estadonotacredito,1,false,true,true);
					notacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoNotaCredito");
					notacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoNotaCredito");
					notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoPuntoVenta("n",notacreditopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("relacionado");
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");
					}

					notacreditopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoPuntoVenta().setVisible(false);

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
