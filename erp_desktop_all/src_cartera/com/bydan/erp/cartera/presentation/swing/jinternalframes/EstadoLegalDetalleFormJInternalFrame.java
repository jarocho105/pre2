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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.EstadoLegalConstantesFunciones;

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
public class EstadoLegalDetalleFormJInternalFrame extends EstadoLegalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoLegal;
	
	protected JMenuBar jmenuBarDetalleEstadoLegal;
	
	protected JMenu jmenuDetalleEstadoLegal;
	protected JMenu jmenuDetalleArchivoEstadoLegal;
	protected JMenu jmenuDetalleAccionesEstadoLegal;
	protected JMenu jmenuDetalleDatosEstadoLegal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoLegal;	
	protected GridBagConstraints gridBagConstraintsEstadoLegal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoLegalBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoLegal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoLegalSessionBean estadolegalSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
		
	
	public EstadoLegalLogic estadolegalLogic;
	
	public JScrollPane jScrollPanelDatosEstadoLegal;
	public JScrollPane jScrollPanelDatosEdicionEstadoLegal;
	public JScrollPane jScrollPanelDatosGeneralEstadoLegal;
	
	protected JPanel jPanelCamposEstadoLegal;    
	protected JPanel jPanelCamposOcultosEstadoLegal;    	
	protected JPanel jPanelAccionesEstadoLegal;
	protected JPanel jPanelAccionesFormularioEstadoLegal;
    
	
	
	protected Integer iXPanelCamposEstadoLegal=0;
	protected Integer iYPanelCamposEstadoLegal=0;
	
	protected Integer iXPanelCamposOcultosEstadoLegal=0;
	protected Integer iYPanelCamposOcultosEstadoLegal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoLegal;
	public JButton jButtonModificarEstadoLegal;
	public JButton jButtonActualizarEstadoLegal;
    public JButton jButtonEliminarEstadoLegal;
	public JButton jButtonCancelarEstadoLegal;
    public JButton jButtonGuardarCambiosEstadoLegal;
	public JButton jButtonGuardarCambiosTablaEstadoLegal;
	protected JButton jButtonCerrarEstadoLegal;
	
	
	protected JButton jButtonProcesarInformacionEstadoLegal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoLegal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoLegal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoLegal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoLegal;
	protected JButton jButtonModificarToolBarEstadoLegal;
	protected JButton jButtonActualizarToolBarEstadoLegal;
    protected JButton jButtonEliminarToolBarEstadoLegal;
	protected JButton jButtonCancelarToolBarEstadoLegal;
    protected JButton jButtonGuardarCambiosToolBarEstadoLegal;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoLegal;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoLegal;
	protected JButton jButtonCerrarToolBarEstadoLegal;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoLegal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoLegal;
	protected JMenuItem jMenuItemModificarEstadoLegal;
	protected JMenuItem jMenuItemActualizarEstadoLegal;
    protected JMenuItem jMenuItemEliminarEstadoLegal;
	protected JMenuItem jMenuItemCancelarEstadoLegal;
    protected JMenuItem jMenuItemGuardarCambiosEstadoLegal;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoLegal;
	protected JMenuItem jMenuItemCerrarEstadoLegal;
	protected JMenuItem jMenuItemDetalleCerrarEstadoLegal;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoLegal;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoLegal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoLegal;
	protected JMenuItem jMenuItemMostrarOcultarEstadoLegal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoLegal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoLegal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoLegal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoLegal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoLegal;
	public JLabel jLabelIdEstadoLegal;
	public JTextFieldMe jTextFieldidEstadoLegal;
	public JButton jButtonidEstadoLegalBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoLegal;
	public JLabel jLabelcodigoEstadoLegal;
	public JTextField jTextFieldcodigoEstadoLegal;
	public JButton jButtoncodigoEstadoLegalBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoLegal;
	public JLabel jLabelnombreEstadoLegal;
	public JTextArea jTextAreanombreEstadoLegal;
	public JScrollPane jscrollPanenombreEstadoLegal;
	public JButton jButtonnombreEstadoLegalBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoLegal;
	
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
	
	public EstadoLegalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoLegal=new JPanel();
				this.jPanelAccionesFormularioEstadoLegal=new JPanel();
				this.jmenuBarDetalleEstadoLegal=new JMenuBar();
				this.jTtoolBarDetalleEstadoLegal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoLegalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoLegalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoLegal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoLegal() {
		return this.jButtonActualizarToolBarEstadoLegal;
	}
	
	public JButton getjButtonEliminarToolBarEstadoLegal() {
		return this.jButtonEliminarToolBarEstadoLegal;
	}
	
	public JButton getjButtonCancelarToolBarEstadoLegal() {
		return this.jButtonCancelarToolBarEstadoLegal;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoLegal() {
		return this.jButtonProcesarInformacionEstadoLegal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoLegal)	{
		this.jButtonProcesarInformacionEstadoLegal = jButtonProcesarInformacionEstadoLegal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoLegal() {
		return this.jComboBoxTiposAccionesEstadoLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoLegal(
			JComboBox jComboBoxTiposRelacionesEstadoLegal) {
		this.jComboBoxTiposRelacionesEstadoLegal = jComboBoxTiposRelacionesEstadoLegal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoLegal(
			JComboBox jComboBoxTiposAccionesEstadoLegal) {
		this.jComboBoxTiposAccionesEstadoLegal = jComboBoxTiposAccionesEstadoLegal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoLegal() {
		return this.jComboBoxTiposAccionesFormularioEstadoLegal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoLegal(
			JComboBox jComboBoxTiposAccionesFormularioEstadoLegal) {
		this.jComboBoxTiposAccionesFormularioEstadoLegal = jComboBoxTiposAccionesFormularioEstadoLegal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadolegalSessionBean=new EstadoLegalSessionBean();
		
		this.estadolegalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadolegalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadolegalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.subclienteSessionBean=new SubClienteSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoLegalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Legal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoLegalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoLegal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoLegal=new JButtonMe();
				this.jButtonModificarToolBarEstadoLegal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoLegal,this.jTtoolBarDetalleEstadoLegal,
							"actualizar","actualizar","Actualizar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoLegal,this.jTtoolBarDetalleEstadoLegal,
							"eliminar","eliminar","Eliminar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoLegal,this.jTtoolBarDetalleEstadoLegal,
							"cancelar","cancelar","Cancelar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoLegal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoLegal,this.jTtoolBarDetalleEstadoLegal,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoLegal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoLegal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoLegal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoLegal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoLegal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoLegal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoLegal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoLegal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoLegal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoLegal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoLegal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoLegal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoLegal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoLegal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoLegal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoLegal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoLegal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoLegal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoLegal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoLegal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoLegal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoLegal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoLegal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoLegal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoLegal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoLegal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoLegal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoLegal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoLegal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoLegal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoLegal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoLegal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoLegal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoLegal.add(this.jMenuItemDetalleCerrarEstadoLegal);
		
		this.jmenuDetalleAccionesEstadoLegal.add(this.jMenuItemActualizarEstadoLegal);
		this.jmenuDetalleAccionesEstadoLegal.add(this.jMenuItemEliminarEstadoLegal);
		this.jmenuDetalleAccionesEstadoLegal.add(this.jMenuItemCancelarEstadoLegal);		
		
		//this.jmenuDetalleDatosEstadoLegal.add(this.jMenuItemDetalleAbrirOrderByEstadoLegal);				
		this.jmenuDetalleDatosEstadoLegal.add(this.jMenuItemDetalleMostarOcultarEstadoLegal);				
				
		//this.jmenuDetalleAccionesEstadoLegal.add(this.jMenuItemGuardarCambiosEstadoLegal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoLegal.add(this.jmenuDetalleArchivoEstadoLegal);		
		this.jmenuBarDetalleEstadoLegal.add(this.jmenuDetalleAccionesEstadoLegal);		
		this.jmenuBarDetalleEstadoLegal.add(this.jmenuDetalleDatosEstadoLegal);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoLegal.add(this.jmenuDetalleEstadoLegal);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoLegal);				
	}
	
	
	public void inicializarElementosCamposEstadoLegal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoLegal = new JLabelMe();
		jLabelIdEstadoLegal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoLegal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoLegal.setToolTipText(EstadoLegalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoLegal= new GridBagLayout();

		this.jPanelidEstadoLegal.setLayout(this.gridaBagLayoutEstadoLegal);

		jTextFieldidEstadoLegal = new JTextFieldMe();
		jTextFieldidEstadoLegal.setText("Id");

		jTextFieldidEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoLegal = new JLabelMe();
		this.jLabelcodigoEstadoLegal.setText(""+EstadoLegalConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoLegal.setToolTipText("Codigo");
		this.jLabelcodigoEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoLegal.setToolTipText(EstadoLegalConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoLegal = new GridBagLayout();
		this.jPanelcodigoEstadoLegal.setLayout(this.gridaBagLayoutEstadoLegal);


		jTextFieldcodigoEstadoLegal= new JTextFieldMe();

		jTextFieldcodigoEstadoLegal.setEnabled(false);
		jTextFieldcodigoEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoLegalBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoLegalBusqueda.setText("U");
		this.jButtoncodigoEstadoLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoLegalBusqueda"));

		if(this.estadolegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoLegalBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoLegal = new JLabelMe();
		this.jLabelnombreEstadoLegal.setText(""+EstadoLegalConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoLegal.setToolTipText("Nombre");
		this.jLabelnombreEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoLegal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoLegal.setToolTipText(EstadoLegalConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoLegal = new GridBagLayout();
		this.jPanelnombreEstadoLegal.setLayout(this.gridaBagLayoutEstadoLegal);


		jTextAreanombreEstadoLegal= new JTextAreaMe();
		jTextAreanombreEstadoLegal.setEnabled(false);
		jTextAreanombreEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoLegal.setLineWrap(true);
		jTextAreanombreEstadoLegal.setWrapStyleWord(true);
		jTextAreanombreEstadoLegal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoLegal.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoLegal = new JScrollPane(jTextAreanombreEstadoLegal);
		jscrollPanenombreEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoLegalBusqueda= new JButtonMe();
		this.jButtonnombreEstadoLegalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoLegalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoLegalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoLegalBusqueda.setText("U");
		this.jButtonnombreEstadoLegalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoLegalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoLegalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoLegal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoLegal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoLegalBusqueda"));

		if(this.estadolegalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoLegalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoLegal() {
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
		//this.jInternalFrameDetalleEstadoLegal = new EstadoLegalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Legal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoLegal= new GridBagLayout();
		

		
		String sToolTipEstadoLegal="";
		sToolTipEstadoLegal=EstadoLegalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoLegal+="(Cartera.EstadoLegal)";
		}
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoLegal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoLegal = new JButtonMe();
		this.jButtonModificarEstadoLegal = new JButtonMe();
        this.jButtonActualizarEstadoLegal = new JButtonMe();
        this.jButtonEliminarEstadoLegal = new JButtonMe();
        this.jButtonCancelarEstadoLegal = new JButtonMe();
        this.jButtonGuardarCambiosEstadoLegal = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoLegal = new JButtonMe();
		this.jButtonCerrarEstadoLegal = new JButtonMe();
		
		this.jScrollPanelDatosEstadoLegal = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoLegal = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoLegal = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Legal";
		
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Legales" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoLegal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoLegal.setName("jPanelCamposEstadoLegal"); 

		this.jPanelCamposOcultosEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoLegal.setName("jPanelCamposOcultosEstadoLegal"); 

        this.jPanelAccionesEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoLegal.setToolTipText("Acciones");
        this.jPanelAccionesEstadoLegal.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoLegal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoLegal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoLegal.setText("Nuevo");
		this.jButtonModificarEstadoLegal.setText("Editar");
        this.jButtonActualizarEstadoLegal.setText("Actualizar");
        this.jButtonEliminarEstadoLegal.setText("Eliminar");
        this.jButtonCancelarEstadoLegal.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoLegal.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoLegal.setText("Guardar");
		this.jButtonCerrarEstadoLegal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoLegal,"nuevo_button","Nuevo",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoLegal,"modificar_button","Editar",this.estadolegalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoLegal,"actualizar_button","Actualizar",this.estadolegalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoLegal,"eliminar_button","Eliminar",this.estadolegalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoLegal,"cancelar_button","Cancelar",this.estadolegalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoLegal,"guardarcambios_button","Guardar",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoLegal,"guardarcambiostabla_button","Guardar",this.estadolegalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoLegal,"cerrar_button","Salir",this.estadolegalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoLegal.setToolTipText("Nuevo"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoLegal.setToolTipText("Editar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoLegal.setToolTipText("Actualizar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoLegal.setToolTipText("Eliminar)"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoLegal.setToolTipText("Cancelar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoLegal.setToolTipText("Guardar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoLegal.setToolTipText("Guardar"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoLegal.setToolTipText("Salir"+" "+EstadoLegalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoLegal";
		inputMap = this.jButtonNuevoEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoLegal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoLegal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoLegal";
		inputMap = this.jButtonActualizarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoLegal"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoLegal";
		inputMap = this.jButtonEliminarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoLegal"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoLegal";
		inputMap = this.jButtonCancelarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoLegal"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoLegal";
		inputMap = this.jButtonCerrarEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoLegal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoLegal";
		inputMap = this.jButtonGuardarCambiosTablaEstadoLegal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoLegal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoLegal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoLegal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoLegal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoLegal.setToolTipText("Nuevo EstadoLegal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoLegal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoLegal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoLegal.setToolTipText("Sin Cerrar Ventana EstadoLegal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoLegal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoLegal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoLegal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoLegal.setText("Accion");
		this.jComboBoxTiposAccionesEstadoLegal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoLegal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoLegal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoLegal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoLegal = new JLabelMe();
		
		this.jLabelAccionesEstadoLegal.setText("Acciones");		
		this.jLabelAccionesEstadoLegal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoLegal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoLegal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoLegal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoLegal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoLegal=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoLegal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoLegal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoLegal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoLegal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoLegal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoLegal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoLegal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoLegal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoLegal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoLegal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoLegal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoLegal = new GridBagLayout();
		
		this.jPanelCamposEstadoLegal.setLayout(gridaBagLayoutCamposEstadoLegal);
		this.jPanelCamposOcultosEstadoLegal.setLayout(gridaBagLayoutCamposOcultosEstadoLegal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoLegal.gridy = 0;
	this.gridBagConstraintsEstadoLegal.gridx = 0;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoLegal.add(jLabelIdEstadoLegal, this.gridBagConstraintsEstadoLegal);



	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoLegal.gridy = 0;
	this.gridBagConstraintsEstadoLegal.gridx = 1;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoLegal.add(jTextFieldidEstadoLegal, this.gridBagConstraintsEstadoLegal);


	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoLegal.gridy = 0;
	this.gridBagConstraintsEstadoLegal.gridx = 0;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoLegal.add(jLabelcodigoEstadoLegal, this.gridBagConstraintsEstadoLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		//this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = 0;
		this.gridBagConstraintsEstadoLegal.gridx = 2;
		this.gridBagConstraintsEstadoLegal.ipadx = 0;
		this.gridBagConstraintsEstadoLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoLegal.add(jButtoncodigoEstadoLegalBusqueda, this.gridBagConstraintsEstadoLegal);
	}

	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoLegal.gridy = 0;
	this.gridBagConstraintsEstadoLegal.gridx = 1;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoLegal.add(jTextFieldcodigoEstadoLegal, this.gridBagConstraintsEstadoLegal);


	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoLegal.gridy = 0;
	this.gridBagConstraintsEstadoLegal.gridx = 0;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoLegal.add(jLabelnombreEstadoLegal, this.gridBagConstraintsEstadoLegal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		//this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoLegal.gridy = 0;
		this.gridBagConstraintsEstadoLegal.gridx = 2;
		this.gridBagConstraintsEstadoLegal.ipadx = 0;
		this.gridBagConstraintsEstadoLegal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoLegal.add(jButtonnombreEstadoLegalBusqueda, this.gridBagConstraintsEstadoLegal);
	}

	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoLegal.gridy = 0;
	this.gridBagConstraintsEstadoLegal.gridx = 1;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoLegal.add(jscrollPanenombreEstadoLegal, this.gridBagConstraintsEstadoLegal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoLegal.gridy = iYPanelCamposEstadoLegal;
	this.gridBagConstraintsEstadoLegal.gridx = iXPanelCamposEstadoLegal++;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoLegal.add(this.jPanelidEstadoLegal, this.gridBagConstraintsEstadoLegal);



	if(iXPanelCamposEstadoLegal % 1==0) {
		iXPanelCamposEstadoLegal=0;
		iYPanelCamposEstadoLegal++;
	}
	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoLegal.gridy = iYPanelCamposEstadoLegal;
	this.gridBagConstraintsEstadoLegal.gridx = iXPanelCamposEstadoLegal++;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoLegal.add(this.jPanelcodigoEstadoLegal, this.gridBagConstraintsEstadoLegal);



	if(iXPanelCamposEstadoLegal % 1==0) {
		iXPanelCamposEstadoLegal=0;
		iYPanelCamposEstadoLegal++;
	}
	this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoLegal.gridy = iYPanelCamposEstadoLegal;
	this.gridBagConstraintsEstadoLegal.gridx = iXPanelCamposEstadoLegal++;
	this.gridBagConstraintsEstadoLegal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoLegal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoLegal.add(this.jPanelnombreEstadoLegal, this.gridBagConstraintsEstadoLegal);



	if(iXPanelCamposEstadoLegal % 1==0) {
		iXPanelCamposEstadoLegal=0;
		iYPanelCamposEstadoLegal++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoLegal= new GridBagLayout();
		this.jPanelAccionesEstadoLegal.setLayout(gridaBagLayoutAccionesEstadoLegal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoLegal= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoLegal.setLayout(gridaBagLayoutAccionesFormularioEstadoLegal);
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoLegal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoLegal.add(this.jComboBoxTiposAccionesFormularioEstadoLegal, this.gridBagConstraintsEstadoLegal);

		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoLegal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoLegal.add(this.jCheckBoxPostAccionNuevoEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoLegal.add(this.jCheckBoxPostAccionSinCerrarEstadoLegal, this.gridBagConstraintsEstadoLegal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadolegalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadolegalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoLegal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoLegal.add(this.jCheckBoxPostAccionSinMensajeEstadoLegal, this.gridBagConstraintsEstadoLegal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = 0;
		this.gridBagConstraintsEstadoLegal.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoLegal.add(this.jButtonModificarEstadoLegal, this.gridBagConstraintsEstadoLegal);							

		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoLegal.gridy = 0;
		this.gridBagConstraintsEstadoLegal.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoLegal.add(this.jButtonEliminarEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
			
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = 0;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoLegal.add(this.jButtonActualizarEstadoLegal, this.gridBagConstraintsEstadoLegal);


		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = 0;		
		this.gridBagConstraintsEstadoLegal.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoLegal.add(this.jButtonGuardarCambiosEstadoLegal, this.gridBagConstraintsEstadoLegal);	
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = 0;		
		this.gridBagConstraintsEstadoLegal.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoLegal.add(this.jButtonCancelarEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoLegal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoLegal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadolegalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();						
			this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoLegal.gridx = 0;		
			//this.gridBagConstraintsEstadoLegal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoLegal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoLegal.gridx =0;
		this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoLegal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoLegal, this.gridBagConstraintsEstadoLegal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoLegalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoLegal = new EstadoLegalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Legal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Legal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Legal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoLegalModel estadolegalModel=new EstadoLegalModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoLegalModel.EstadoLegalFocusTraversalPolicy estadolegalFocusTraversalPolicy = estadolegalModel.new EstadoLegalFocusTraversalPolicy(this);
			
			//estadolegalFocusTraversalPolicy.setestadolegalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadolegalModel);
			
			
			this.jContentPaneDetalleEstadoLegal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoLegal = new GridBagLayout();	
			this.jContentPaneDetalleEstadoLegal.setLayout(gridaBagLayoutDetalleEstadoLegal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoLegal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoLegal.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoLegal.add(jTtoolBarDetalleEstadoLegal, gridBagConstraintsEstadoLegal);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoLegal=   new JScrollPane(jContentPaneDetalleEstadoLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoLegal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoLegal.gridx = 0;
	        
			this.jContentPaneDetalleEstadoLegal.add(jPanelCamposEstadoLegal, gridBagConstraintsEstadoLegal);
			
			
			
			
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
						&& estadolegalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					
					if(this.estadolegalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoLegal= new GridBagConstraints();
						this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoLegal.gridx = 0;
						this.jContentPaneDetalleEstadoLegal.add(this.jTabbedPaneRelacionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoLegal.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoLegal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
					this.gridBagConstraintsEstadoLegal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoLegal.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoLegal.add(jPanelCamposOcultosEstadoLegal, gridBagConstraintsEstadoLegal);
				
					this.jPanelCamposOcultosEstadoLegal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsEstadoLegal.gridx = 0;
	        this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoLegal.add(this.jPanelAccionesFormularioEstadoLegal, this.gridBagConstraintsEstadoLegal);							
			
			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
	        this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsEstadoLegal.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoLegal.add(this.jPanelAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoLegal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoLegal=   new JScrollPane(this.jPanelCamposEstadoLegal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoLegal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoLegal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoLegal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoLegal.gridx = 0;
			this.gridBagConstraintsEstadoLegal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoLegal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoLegal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoLegal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoLegal, this.gridBagConstraintsEstadoLegal);			
			
			this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
			this.gridBagConstraintsEstadoLegal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoLegal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoLegal, this.gridBagConstraintsEstadoLegal);
			
			
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoLegal, this.gridBagConstraintsEstadoLegal);
		
			
		this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
		this.gridBagConstraintsEstadoLegal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoLegal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoLegal, this.gridBagConstraintsEstadoLegal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoLegal;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoLegal;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				//this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoLegal.gridx = 0;
				//this.jContentPaneDetalleEstadoLegal.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoLegal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoLegal.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoLegal.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesEstadoLegal.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				//this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoLegal.gridx = 0;
				//this.jContentPaneDetalleEstadoLegal.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoLegal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoLegal.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoLegal.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesEstadoLegal.add("Parametro Cartera Defectos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoLegalJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsEstadoLegal = new GridBagConstraints();
				//this.gridBagConstraintsEstadoLegal.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoLegal.gridx = 0;
				//this.jContentPaneDetalleEstadoLegal.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoLegal);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoLegal.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoLegal.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesEstadoLegal.add("Sub Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<EstadoLegal> estadolegals,EstadoLegal estadolegal,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.estadolegalLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setestadolegalsForeignKey(estadolegals);
					clienteBeanSwingJInternalFrame.setestadolegalForeignKey(estadolegal);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoLegal(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidEstadoLegalActual(estadolegal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoLegal(true);
					clienteBeanSwingJInternalFrame.setid_estado_legalFK_IdEstadoLegal(estadolegal.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoLegalForeignKey(estadolegal,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoLegal");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoLegal");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSubClienteBeanSwingJInternalFrame(List<EstadoLegal> estadolegals,EstadoLegal estadolegal,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.estadolegalLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.setestadolegalsForeignKey(estadolegals);
					subclienteBeanSwingJInternalFrame.setestadolegalForeignKey(estadolegal);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoLegal(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidEstadoLegalActual(estadolegal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoLegal(true);
					subclienteBeanSwingJInternalFrame.setid_estado_legalFK_IdEstadoLegal(estadolegal.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoLegalForeignKey(estadolegal,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoLegal");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoLegal");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<EstadoLegal> estadolegals,EstadoLegal estadolegal,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.estadolegalLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.setestadolegalsForeignKey(estadolegals);
					parametrocarteradefectoBeanSwingJInternalFrame.setestadolegalForeignKey(estadolegal);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoLegal(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidEstadoLegalActual(estadolegal.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoLegal(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_estado_legalFK_IdEstadoLegal(estadolegal.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoLegalForeignKey(estadolegal,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoLegal");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoLegal");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

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
