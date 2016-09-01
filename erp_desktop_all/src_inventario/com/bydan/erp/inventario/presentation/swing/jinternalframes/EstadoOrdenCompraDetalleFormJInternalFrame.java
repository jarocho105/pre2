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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.EstadoOrdenCompraConstantesFunciones;

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
public class EstadoOrdenCompraDetalleFormJInternalFrame extends EstadoOrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoOrdenCompra;
	
	protected JMenuBar jmenuBarDetalleEstadoOrdenCompra;
	
	protected JMenu jmenuDetalleEstadoOrdenCompra;
	protected JMenu jmenuDetalleArchivoEstadoOrdenCompra;
	protected JMenu jmenuDetalleAccionesEstadoOrdenCompra;
	protected JMenu jmenuDetalleDatosEstadoOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsEstadoOrdenCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoOrdenCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoOrdenCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoOrdenCompraSessionBean estadoordencompraSessionBean;
	
	

	public OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame=null;
	public OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOrdenCompra=false;
	public OrdenCompraSessionBean ordencompraSessionBean;
	
		
	
	public EstadoOrdenCompraLogic estadoordencompraLogic;
	
	public JScrollPane jScrollPanelDatosEstadoOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionEstadoOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralEstadoOrdenCompra;
	
	protected JPanel jPanelCamposEstadoOrdenCompra;    
	protected JPanel jPanelCamposOcultosEstadoOrdenCompra;    	
	protected JPanel jPanelAccionesEstadoOrdenCompra;
	protected JPanel jPanelAccionesFormularioEstadoOrdenCompra;
    
	
	
	protected Integer iXPanelCamposEstadoOrdenCompra=0;
	protected Integer iYPanelCamposEstadoOrdenCompra=0;
	
	protected Integer iXPanelCamposOcultosEstadoOrdenCompra=0;
	protected Integer iYPanelCamposOcultosEstadoOrdenCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoOrdenCompra;
	public JButton jButtonModificarEstadoOrdenCompra;
	public JButton jButtonActualizarEstadoOrdenCompra;
    public JButton jButtonEliminarEstadoOrdenCompra;
	public JButton jButtonCancelarEstadoOrdenCompra;
    public JButton jButtonGuardarCambiosEstadoOrdenCompra;
	public JButton jButtonGuardarCambiosTablaEstadoOrdenCompra;
	protected JButton jButtonCerrarEstadoOrdenCompra;
	
	
	protected JButton jButtonProcesarInformacionEstadoOrdenCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoOrdenCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoOrdenCompra;
	protected JButton jButtonModificarToolBarEstadoOrdenCompra;
	protected JButton jButtonActualizarToolBarEstadoOrdenCompra;
    protected JButton jButtonEliminarToolBarEstadoOrdenCompra;
	protected JButton jButtonCancelarToolBarEstadoOrdenCompra;
    protected JButton jButtonGuardarCambiosToolBarEstadoOrdenCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoOrdenCompra;
	protected JButton jButtonCerrarToolBarEstadoOrdenCompra;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoOrdenCompra;
	protected JMenuItem jMenuItemModificarEstadoOrdenCompra;
	protected JMenuItem jMenuItemActualizarEstadoOrdenCompra;
    protected JMenuItem jMenuItemEliminarEstadoOrdenCompra;
	protected JMenuItem jMenuItemCancelarEstadoOrdenCompra;
    protected JMenuItem jMenuItemGuardarCambiosEstadoOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoOrdenCompra;
	protected JMenuItem jMenuItemCerrarEstadoOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarEstadoOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoOrdenCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarEstadoOrdenCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoOrdenCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoOrdenCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoOrdenCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoOrdenCompra;
	public JLabel jLabelIdEstadoOrdenCompra;
	public JTextFieldMe jTextFieldidEstadoOrdenCompra;
	public JButton jButtonidEstadoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoOrdenCompra;
	public JLabel jLabelcodigoEstadoOrdenCompra;
	public JTextField jTextFieldcodigoEstadoOrdenCompra;
	public JButton jButtoncodigoEstadoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoOrdenCompra;
	public JLabel jLabelnombreEstadoOrdenCompra;
	public JTextArea jTextAreanombreEstadoOrdenCompra;
	public JScrollPane jscrollPanenombreEstadoOrdenCompra;
	public JButton jButtonnombreEstadoOrdenCompraBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoOrdenCompra;
	
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
	
	public EstadoOrdenCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoOrdenCompra=new JPanel();
				this.jPanelAccionesFormularioEstadoOrdenCompra=new JPanel();
				this.jmenuBarDetalleEstadoOrdenCompra=new JMenuBar();
				this.jTtoolBarDetalleEstadoOrdenCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoOrdenCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoOrdenCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoOrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoOrdenCompra() {
		return this.jButtonActualizarToolBarEstadoOrdenCompra;
	}
	
	public JButton getjButtonEliminarToolBarEstadoOrdenCompra() {
		return this.jButtonEliminarToolBarEstadoOrdenCompra;
	}
	
	public JButton getjButtonCancelarToolBarEstadoOrdenCompra() {
		return this.jButtonCancelarToolBarEstadoOrdenCompra;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoOrdenCompra() {
		return this.jButtonProcesarInformacionEstadoOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoOrdenCompra)	{
		this.jButtonProcesarInformacionEstadoOrdenCompra = jButtonProcesarInformacionEstadoOrdenCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoOrdenCompra() {
		return this.jComboBoxTiposAccionesEstadoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoOrdenCompra(
			JComboBox jComboBoxTiposRelacionesEstadoOrdenCompra) {
		this.jComboBoxTiposRelacionesEstadoOrdenCompra = jComboBoxTiposRelacionesEstadoOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoOrdenCompra(
			JComboBox jComboBoxTiposAccionesEstadoOrdenCompra) {
		this.jComboBoxTiposAccionesEstadoOrdenCompra = jComboBoxTiposAccionesEstadoOrdenCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoOrdenCompra() {
		return this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoOrdenCompra(
			JComboBox jComboBoxTiposAccionesFormularioEstadoOrdenCompra) {
		this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra = jComboBoxTiposAccionesFormularioEstadoOrdenCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoordencompraSessionBean=new EstadoOrdenCompraSessionBean();
		
		this.estadoordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoordencompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.ordencompraSessionBean=new OrdenCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoOrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Orden Compra MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoOrdenCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoOrdenCompra=new JButtonMe();
				this.jButtonModificarToolBarEstadoOrdenCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoOrdenCompra,this.jTtoolBarDetalleEstadoOrdenCompra,
							"actualizar","actualizar","Actualizar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoOrdenCompra,this.jTtoolBarDetalleEstadoOrdenCompra,
							"eliminar","eliminar","Eliminar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoOrdenCompra,this.jTtoolBarDetalleEstadoOrdenCompra,
							"cancelar","cancelar","Cancelar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoOrdenCompra,this.jTtoolBarDetalleEstadoOrdenCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoOrdenCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoOrdenCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoOrdenCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoOrdenCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoOrdenCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoOrdenCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoOrdenCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoOrdenCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoOrdenCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoOrdenCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoOrdenCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoOrdenCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoOrdenCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoOrdenCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoOrdenCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoOrdenCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoOrdenCompra.add(this.jMenuItemDetalleCerrarEstadoOrdenCompra);
		
		this.jmenuDetalleAccionesEstadoOrdenCompra.add(this.jMenuItemActualizarEstadoOrdenCompra);
		this.jmenuDetalleAccionesEstadoOrdenCompra.add(this.jMenuItemEliminarEstadoOrdenCompra);
		this.jmenuDetalleAccionesEstadoOrdenCompra.add(this.jMenuItemCancelarEstadoOrdenCompra);		
		
		//this.jmenuDetalleDatosEstadoOrdenCompra.add(this.jMenuItemDetalleAbrirOrderByEstadoOrdenCompra);				
		this.jmenuDetalleDatosEstadoOrdenCompra.add(this.jMenuItemDetalleMostarOcultarEstadoOrdenCompra);				
				
		//this.jmenuDetalleAccionesEstadoOrdenCompra.add(this.jMenuItemGuardarCambiosEstadoOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoOrdenCompra.add(this.jmenuDetalleArchivoEstadoOrdenCompra);		
		this.jmenuBarDetalleEstadoOrdenCompra.add(this.jmenuDetalleAccionesEstadoOrdenCompra);		
		this.jmenuBarDetalleEstadoOrdenCompra.add(this.jmenuDetalleDatosEstadoOrdenCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoOrdenCompra.add(this.jmenuDetalleEstadoOrdenCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoOrdenCompra);				
	}
	
	
	public void inicializarElementosCamposEstadoOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoOrdenCompra = new JLabelMe();
		jLabelIdEstadoOrdenCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoOrdenCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoOrdenCompra.setToolTipText(EstadoOrdenCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoOrdenCompra= new GridBagLayout();

		this.jPanelidEstadoOrdenCompra.setLayout(this.gridaBagLayoutEstadoOrdenCompra);

		jTextFieldidEstadoOrdenCompra = new JTextFieldMe();
		jTextFieldidEstadoOrdenCompra.setText("Id");

		jTextFieldidEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoOrdenCompra = new JLabelMe();
		this.jLabelcodigoEstadoOrdenCompra.setText(""+EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoOrdenCompra.setToolTipText("Codigo");
		this.jLabelcodigoEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoOrdenCompra.setToolTipText(EstadoOrdenCompraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoOrdenCompra = new GridBagLayout();
		this.jPanelcodigoEstadoOrdenCompra.setLayout(this.gridaBagLayoutEstadoOrdenCompra);


		jTextFieldcodigoEstadoOrdenCompra= new JTextFieldMe();

		jTextFieldcodigoEstadoOrdenCompra.setEnabled(false);
		jTextFieldcodigoEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoOrdenCompraBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoOrdenCompraBusqueda.setText("U");
		this.jButtoncodigoEstadoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoOrdenCompraBusqueda"));

		if(this.estadoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoOrdenCompra = new JLabelMe();
		this.jLabelnombreEstadoOrdenCompra.setText(""+EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoOrdenCompra.setToolTipText("Nombre");
		this.jLabelnombreEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoOrdenCompra.setToolTipText(EstadoOrdenCompraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoOrdenCompra = new GridBagLayout();
		this.jPanelnombreEstadoOrdenCompra.setLayout(this.gridaBagLayoutEstadoOrdenCompra);


		jTextAreanombreEstadoOrdenCompra= new JTextAreaMe();
		jTextAreanombreEstadoOrdenCompra.setEnabled(false);
		jTextAreanombreEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoOrdenCompra.setLineWrap(true);
		jTextAreanombreEstadoOrdenCompra.setWrapStyleWord(true);
		jTextAreanombreEstadoOrdenCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoOrdenCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoOrdenCompra = new JScrollPane(jTextAreanombreEstadoOrdenCompra);
		jscrollPanenombreEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnombreEstadoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoOrdenCompraBusqueda.setText("U");
		this.jButtonnombreEstadoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoOrdenCompraBusqueda"));

		if(this.estadoordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoOrdenCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoOrdenCompra() {
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
		//this.jInternalFrameDetalleEstadoOrdenCompra = new EstadoOrdenCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Orden Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoOrdenCompra= new GridBagLayout();
		

		
		String sToolTipEstadoOrdenCompra="";
		sToolTipEstadoOrdenCompra=EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoOrdenCompra+="(Inventario.EstadoOrdenCompra)";
		}
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoOrdenCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoOrdenCompra = new JButtonMe();
		this.jButtonModificarEstadoOrdenCompra = new JButtonMe();
        this.jButtonActualizarEstadoOrdenCompra = new JButtonMe();
        this.jButtonEliminarEstadoOrdenCompra = new JButtonMe();
        this.jButtonCancelarEstadoOrdenCompra = new JButtonMe();
        this.jButtonGuardarCambiosEstadoOrdenCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra = new JButtonMe();
		this.jButtonCerrarEstadoOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosEstadoOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoOrdenCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoOrdenCompra = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Orden Compra";
		
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Orden Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoOrdenCompra.setName("jPanelCamposEstadoOrdenCompra"); 

		this.jPanelCamposOcultosEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoOrdenCompra.setName("jPanelCamposOcultosEstadoOrdenCompra"); 

        this.jPanelAccionesEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesEstadoOrdenCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoOrdenCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoOrdenCompra.setText("Nuevo");
		this.jButtonModificarEstadoOrdenCompra.setText("Editar");
        this.jButtonActualizarEstadoOrdenCompra.setText("Actualizar");
        this.jButtonEliminarEstadoOrdenCompra.setText("Eliminar");
        this.jButtonCancelarEstadoOrdenCompra.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoOrdenCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.setText("Guardar");
		this.jButtonCerrarEstadoOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoOrdenCompra,"nuevo_button","Nuevo",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoOrdenCompra,"modificar_button","Editar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoOrdenCompra,"actualizar_button","Actualizar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoOrdenCompra,"eliminar_button","Eliminar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoOrdenCompra,"cancelar_button","Cancelar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoOrdenCompra,"guardarcambios_button","Guardar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoOrdenCompra,"guardarcambiostabla_button","Guardar",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoOrdenCompra,"cerrar_button","Salir",this.estadoordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoOrdenCompra.setToolTipText("Nuevo"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoOrdenCompra.setToolTipText("Editar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoOrdenCompra.setToolTipText("Actualizar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoOrdenCompra.setToolTipText("Eliminar)"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoOrdenCompra.setToolTipText("Cancelar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoOrdenCompra.setToolTipText("Guardar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.setToolTipText("Guardar"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoOrdenCompra.setToolTipText("Salir"+" "+EstadoOrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoOrdenCompra";
		inputMap = this.jButtonNuevoEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoOrdenCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoOrdenCompra";
		inputMap = this.jButtonActualizarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoOrdenCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoOrdenCompra";
		inputMap = this.jButtonEliminarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoOrdenCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoOrdenCompra";
		inputMap = this.jButtonCancelarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoOrdenCompra"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoOrdenCompra";
		inputMap = this.jButtonCerrarEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaEstadoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoOrdenCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoOrdenCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoOrdenCompra.setToolTipText("Nuevo EstadoOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra.setToolTipText("Sin Cerrar Ventana EstadoOrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesEstadoOrdenCompra.setText("Acciones");		
		this.jLabelAccionesEstadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoOrdenCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoOrdenCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoOrdenCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoOrdenCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoOrdenCompra = new GridBagLayout();
		
		this.jPanelCamposEstadoOrdenCompra.setLayout(gridaBagLayoutCamposEstadoOrdenCompra);
		this.jPanelCamposOcultosEstadoOrdenCompra.setLayout(gridaBagLayoutCamposOcultosEstadoOrdenCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoOrdenCompra.add(jLabelIdEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);



	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = 1;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoOrdenCompra.add(jTextFieldidEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);


	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoOrdenCompra.add(jLabelcodigoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 2;
		this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoOrdenCompra.add(jButtoncodigoEstadoOrdenCompraBusqueda, this.gridBagConstraintsEstadoOrdenCompra);
	}

	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = 1;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoOrdenCompra.add(jTextFieldcodigoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);


	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoOrdenCompra.add(jLabelnombreEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 2;
		this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
		this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoOrdenCompra.add(jButtonnombreEstadoOrdenCompraBusqueda, this.gridBagConstraintsEstadoOrdenCompra);
	}

	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = 1;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoOrdenCompra.add(jscrollPanenombreEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = iYPanelCamposEstadoOrdenCompra;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = iXPanelCamposEstadoOrdenCompra++;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoOrdenCompra.add(this.jPanelidEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);



	if(iXPanelCamposEstadoOrdenCompra % 1==0) {
		iXPanelCamposEstadoOrdenCompra=0;
		iYPanelCamposEstadoOrdenCompra++;
	}
	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = iYPanelCamposEstadoOrdenCompra;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = iXPanelCamposEstadoOrdenCompra++;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoOrdenCompra.add(this.jPanelcodigoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);



	if(iXPanelCamposEstadoOrdenCompra % 1==0) {
		iXPanelCamposEstadoOrdenCompra=0;
		iYPanelCamposEstadoOrdenCompra++;
	}
	this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoOrdenCompra.gridy = iYPanelCamposEstadoOrdenCompra;
	this.gridBagConstraintsEstadoOrdenCompra.gridx = iXPanelCamposEstadoOrdenCompra++;
	this.gridBagConstraintsEstadoOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoOrdenCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoOrdenCompra.add(this.jPanelnombreEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);



	if(iXPanelCamposEstadoOrdenCompra % 1==0) {
		iXPanelCamposEstadoOrdenCompra=0;
		iYPanelCamposEstadoOrdenCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoOrdenCompra= new GridBagLayout();
		this.jPanelAccionesEstadoOrdenCompra.setLayout(gridaBagLayoutAccionesEstadoOrdenCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoOrdenCompra= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoOrdenCompra.setLayout(gridaBagLayoutAccionesFormularioEstadoOrdenCompra);
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoOrdenCompra.add(this.jComboBoxTiposAccionesFormularioEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);

		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoOrdenCompra.add(this.jCheckBoxPostAccionNuevoEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoOrdenCompra.add(this.jCheckBoxPostAccionSinCerrarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoordencompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoordencompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoOrdenCompra.add(this.jCheckBoxPostAccionSinMensajeEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoOrdenCompra.add(this.jButtonModificarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);							

		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;
		this.gridBagConstraintsEstadoOrdenCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoOrdenCompra.add(this.jButtonEliminarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
			
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoOrdenCompra.add(this.jButtonActualizarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);


		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoOrdenCompra.add(this.jButtonGuardarCambiosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);	
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = 0;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoOrdenCompra.add(this.jButtonCancelarEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoOrdenCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsEstadoOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoOrdenCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoOrdenCompra.gridx =0;
		this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoOrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoOrdenCompra = new EstadoOrdenCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Orden Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Orden Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Orden Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoOrdenCompraModel estadoordencompraModel=new EstadoOrdenCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoOrdenCompraModel.EstadoOrdenCompraFocusTraversalPolicy estadoordencompraFocusTraversalPolicy = estadoordencompraModel.new EstadoOrdenCompraFocusTraversalPolicy(this);
			
			//estadoordencompraFocusTraversalPolicy.setestadoordencompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoordencompraModel);
			
			
			this.jContentPaneDetalleEstadoOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoOrdenCompra = new GridBagLayout();	
			this.jContentPaneDetalleEstadoOrdenCompra.setLayout(gridaBagLayoutDetalleEstadoOrdenCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoOrdenCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
				this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoOrdenCompra.add(jTtoolBarDetalleEstadoOrdenCompra, gridBagConstraintsEstadoOrdenCompra);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoOrdenCompra=   new JScrollPane(jContentPaneDetalleEstadoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
	        
			this.jContentPaneDetalleEstadoOrdenCompra.add(jPanelCamposEstadoOrdenCompra, gridBagConstraintsEstadoOrdenCompra);
			
			
			
			
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
						&& estadoordencompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameOrdenCompra(this.puedeCargarPorParteOrdenCompra,false,-1);
					
					if(this.estadoordencompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoOrdenCompra= new GridBagConstraints();
						this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
						this.jContentPaneDetalleEstadoOrdenCompra.add(this.jTabbedPaneRelacionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoOrdenCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameOrdenCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoOrdenCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
					this.gridBagConstraintsEstadoOrdenCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoOrdenCompra.add(jPanelCamposOcultosEstadoOrdenCompra, gridBagConstraintsEstadoOrdenCompra);
				
					this.jPanelCamposOcultosEstadoOrdenCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
	        this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoOrdenCompra.add(this.jPanelAccionesFormularioEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);							
			
			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
	        this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoOrdenCompra.add(this.jPanelAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoOrdenCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoOrdenCompra=   new JScrollPane(this.jPanelCamposEstadoOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
			this.gridBagConstraintsEstadoOrdenCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoOrdenCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoOrdenCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);			
			
			this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
			
			
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		
			
		this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsEstadoOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoOrdenCompra, this.gridBagConstraintsEstadoOrdenCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoOrdenCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoOrdenCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ordencompraSessionBean=new OrdenCompraSessionBean();
		this.ordencompraSessionBean.setConGuardarRelaciones(true);
		this.ordencompraSessionBean.setEsGuardarRelacionado(true);

		this.ordencompraBeanSwingJInternalFrame=null;//new OrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ordencompraBeanSwingJInternalFramePopup=new OrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ordencompraSessionBean.getEsGuardarRelacionado()) {

				OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ordencompraSessionBean.setEsGuardarRelacionado(true);

				this.ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.ordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ordencompraBeanSwingJInternalFrame.setordencompraSessionBean(this.ordencompraSessionBean);

				//this.gridBagConstraintsEstadoOrdenCompra = new GridBagConstraints();
				//this.gridBagConstraintsEstadoOrdenCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoOrdenCompra.gridx = 0;
				//this.jContentPaneDetalleEstadoOrdenCompra.add(this.ordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoOrdenCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoOrdenCompra.add("OrdenCompras",this.ordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoOrdenCompra.setComponentAt(iIndexTab,this.ordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ordencompraSessionBean.setEsGuardarRelacionado(false);
				this.ordencompraBeanSwingJInternalFrame=null;//new OrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOrdenCompra) {
					this.jTabbedPaneRelacionesEstadoOrdenCompra.add("OrdenCompras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarOrdenCompraBeanSwingJInternalFrame(List<EstadoOrdenCompra> estadoordencompras,EstadoOrdenCompra estadoordencompra,OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ordencompraBeanSwingJInternalFrame=new OrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ordencompraBeanSwingJInternalFrame.getOrdenCompraLogic().setConnexion(this.estadoordencompraLogic.getConnexion());

					ordencompraBeanSwingJInternalFrame.setestadoordencomprasForeignKey(estadoordencompras);
					ordencompraBeanSwingJInternalFrame.setestadoordencompraForeignKey(estadoordencompra);
					ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoOrdenCompra(true);
					ordencompraBeanSwingJInternalFrame.ordencompraSessionBean.setlidEstadoOrdenCompraActual(estadoordencompra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyOrdenCompra(ordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					ordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoOrdenCompra(true);
					ordencompraBeanSwingJInternalFrame.setid_estado_orden_compraFK_IdEstadoOrdenCompra(estadoordencompra.getId());

					if(!this.conCargarFormDetalle) {
						ordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoOrdenCompraForeignKey(estadoordencompra,1,false,true,true);
					ordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoOrdenCompra");
					ordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoOrdenCompra");
					ordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenCompra(true);
					ordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOrdenCompra("n",ordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, ordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					ordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenCompra("relacionado");
					} else {
						ordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenCompra("no_relacionado");
					}

					ordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionOrdenCompra().setVisible(false);

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
