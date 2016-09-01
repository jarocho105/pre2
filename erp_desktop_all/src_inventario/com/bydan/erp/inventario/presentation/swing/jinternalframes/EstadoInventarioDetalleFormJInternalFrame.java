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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.EstadoInventarioConstantesFunciones;

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
public class EstadoInventarioDetalleFormJInternalFrame extends EstadoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoInventario;
	
	protected JMenuBar jmenuBarDetalleEstadoInventario;
	
	protected JMenu jmenuDetalleEstadoInventario;
	protected JMenu jmenuDetalleArchivoEstadoInventario;
	protected JMenu jmenuDetalleAccionesEstadoInventario;
	protected JMenu jmenuDetalleDatosEstadoInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoInventario;	
	protected GridBagConstraints gridBagConstraintsEstadoInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoInventarioSessionBean estadoinventarioSessionBean;
	
	

	public TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame=null;
	public TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransferencia=false;
	public TransferenciaSessionBean transferenciaSessionBean;

	public CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame=null;
	public CompraBeanSwingJInternalFrame compraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCompra=false;
	public CompraSessionBean compraSessionBean;
	
		
	
	public EstadoInventarioLogic estadoinventarioLogic;
	
	public JScrollPane jScrollPanelDatosEstadoInventario;
	public JScrollPane jScrollPanelDatosEdicionEstadoInventario;
	public JScrollPane jScrollPanelDatosGeneralEstadoInventario;
	
	protected JPanel jPanelCamposEstadoInventario;    
	protected JPanel jPanelCamposOcultosEstadoInventario;    	
	protected JPanel jPanelAccionesEstadoInventario;
	protected JPanel jPanelAccionesFormularioEstadoInventario;
    
	
	
	protected Integer iXPanelCamposEstadoInventario=0;
	protected Integer iYPanelCamposEstadoInventario=0;
	
	protected Integer iXPanelCamposOcultosEstadoInventario=0;
	protected Integer iYPanelCamposOcultosEstadoInventario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoInventario;
	public JButton jButtonModificarEstadoInventario;
	public JButton jButtonActualizarEstadoInventario;
    public JButton jButtonEliminarEstadoInventario;
	public JButton jButtonCancelarEstadoInventario;
    public JButton jButtonGuardarCambiosEstadoInventario;
	public JButton jButtonGuardarCambiosTablaEstadoInventario;
	protected JButton jButtonCerrarEstadoInventario;
	
	
	protected JButton jButtonProcesarInformacionEstadoInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoInventario;
	protected JButton jButtonModificarToolBarEstadoInventario;
	protected JButton jButtonActualizarToolBarEstadoInventario;
    protected JButton jButtonEliminarToolBarEstadoInventario;
	protected JButton jButtonCancelarToolBarEstadoInventario;
    protected JButton jButtonGuardarCambiosToolBarEstadoInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoInventario;
	protected JButton jButtonCerrarToolBarEstadoInventario;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoInventario;
	protected JMenuItem jMenuItemModificarEstadoInventario;
	protected JMenuItem jMenuItemActualizarEstadoInventario;
    protected JMenuItem jMenuItemEliminarEstadoInventario;
	protected JMenuItem jMenuItemCancelarEstadoInventario;
    protected JMenuItem jMenuItemGuardarCambiosEstadoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoInventario;
	protected JMenuItem jMenuItemCerrarEstadoInventario;
	protected JMenuItem jMenuItemDetalleCerrarEstadoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoInventario;
	protected JMenuItem jMenuItemMostrarOcultarEstadoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoInventario;
	public JLabel jLabelIdEstadoInventario;
	public JTextFieldMe jTextFieldidEstadoInventario;
	public JButton jButtonidEstadoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoInventario;
	public JLabel jLabelcodigoEstadoInventario;
	public JTextField jTextFieldcodigoEstadoInventario;
	public JButton jButtoncodigoEstadoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoInventario;
	public JLabel jLabelnombreEstadoInventario;
	public JTextArea jTextAreanombreEstadoInventario;
	public JScrollPane jscrollPanenombreEstadoInventario;
	public JButton jButtonnombreEstadoInventarioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoInventario;
	
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
	
	public EstadoInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoInventario=new JPanel();
				this.jPanelAccionesFormularioEstadoInventario=new JPanel();
				this.jmenuBarDetalleEstadoInventario=new JMenuBar();
				this.jTtoolBarDetalleEstadoInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoInventario() {
		return this.jButtonActualizarToolBarEstadoInventario;
	}
	
	public JButton getjButtonEliminarToolBarEstadoInventario() {
		return this.jButtonEliminarToolBarEstadoInventario;
	}
	
	public JButton getjButtonCancelarToolBarEstadoInventario() {
		return this.jButtonCancelarToolBarEstadoInventario;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoInventario() {
		return this.jButtonProcesarInformacionEstadoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoInventario)	{
		this.jButtonProcesarInformacionEstadoInventario = jButtonProcesarInformacionEstadoInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoInventario() {
		return this.jComboBoxTiposAccionesEstadoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoInventario(
			JComboBox jComboBoxTiposRelacionesEstadoInventario) {
		this.jComboBoxTiposRelacionesEstadoInventario = jComboBoxTiposRelacionesEstadoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoInventario(
			JComboBox jComboBoxTiposAccionesEstadoInventario) {
		this.jComboBoxTiposAccionesEstadoInventario = jComboBoxTiposAccionesEstadoInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoInventario() {
		return this.jComboBoxTiposAccionesFormularioEstadoInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoInventario(
			JComboBox jComboBoxTiposAccionesFormularioEstadoInventario) {
		this.jComboBoxTiposAccionesFormularioEstadoInventario = jComboBoxTiposAccionesFormularioEstadoInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoinventarioSessionBean=new EstadoInventarioSessionBean();
		
		this.estadoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transferenciaSessionBean=new TransferenciaSessionBean();
		//this.compraSessionBean=new CompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoInventario=new JButtonMe();
				this.jButtonModificarToolBarEstadoInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoInventario,this.jTtoolBarDetalleEstadoInventario,
							"actualizar","actualizar","Actualizar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoInventario,this.jTtoolBarDetalleEstadoInventario,
							"eliminar","eliminar","Eliminar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoInventario,this.jTtoolBarDetalleEstadoInventario,
							"cancelar","cancelar","Cancelar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoInventario,this.jTtoolBarDetalleEstadoInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoInventario.add(this.jMenuItemDetalleCerrarEstadoInventario);
		
		this.jmenuDetalleAccionesEstadoInventario.add(this.jMenuItemActualizarEstadoInventario);
		this.jmenuDetalleAccionesEstadoInventario.add(this.jMenuItemEliminarEstadoInventario);
		this.jmenuDetalleAccionesEstadoInventario.add(this.jMenuItemCancelarEstadoInventario);		
		
		//this.jmenuDetalleDatosEstadoInventario.add(this.jMenuItemDetalleAbrirOrderByEstadoInventario);				
		this.jmenuDetalleDatosEstadoInventario.add(this.jMenuItemDetalleMostarOcultarEstadoInventario);				
				
		//this.jmenuDetalleAccionesEstadoInventario.add(this.jMenuItemGuardarCambiosEstadoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoInventario.add(this.jmenuDetalleArchivoEstadoInventario);		
		this.jmenuBarDetalleEstadoInventario.add(this.jmenuDetalleAccionesEstadoInventario);		
		this.jmenuBarDetalleEstadoInventario.add(this.jmenuDetalleDatosEstadoInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoInventario.add(this.jmenuDetalleEstadoInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoInventario);				
	}
	
	
	public void inicializarElementosCamposEstadoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoInventario = new JLabelMe();
		jLabelIdEstadoInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoInventario.setToolTipText(EstadoInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoInventario= new GridBagLayout();

		this.jPanelidEstadoInventario.setLayout(this.gridaBagLayoutEstadoInventario);

		jTextFieldidEstadoInventario = new JTextFieldMe();
		jTextFieldidEstadoInventario.setText("Id");

		jTextFieldidEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoInventario = new JLabelMe();
		this.jLabelcodigoEstadoInventario.setText(""+EstadoInventarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoInventario.setToolTipText("Codigo");
		this.jLabelcodigoEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoInventario.setToolTipText(EstadoInventarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoInventario = new GridBagLayout();
		this.jPanelcodigoEstadoInventario.setLayout(this.gridaBagLayoutEstadoInventario);


		jTextFieldcodigoEstadoInventario= new JTextFieldMe();

		jTextFieldcodigoEstadoInventario.setEnabled(false);
		jTextFieldcodigoEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoInventarioBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoInventarioBusqueda.setText("U");
		this.jButtoncodigoEstadoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoInventarioBusqueda"));

		if(this.estadoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoInventario = new JLabelMe();
		this.jLabelnombreEstadoInventario.setText(""+EstadoInventarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoInventario.setToolTipText("Nombre");
		this.jLabelnombreEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoInventario.setToolTipText(EstadoInventarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoInventario = new GridBagLayout();
		this.jPanelnombreEstadoInventario.setLayout(this.gridaBagLayoutEstadoInventario);


		jTextAreanombreEstadoInventario= new JTextAreaMe();
		jTextAreanombreEstadoInventario.setEnabled(false);
		jTextAreanombreEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoInventario.setLineWrap(true);
		jTextAreanombreEstadoInventario.setWrapStyleWord(true);
		jTextAreanombreEstadoInventario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoInventario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoInventario = new JScrollPane(jTextAreanombreEstadoInventario);
		jscrollPanenombreEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoInventarioBusqueda= new JButtonMe();
		this.jButtonnombreEstadoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoInventarioBusqueda.setText("U");
		this.jButtonnombreEstadoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoInventarioBusqueda"));

		if(this.estadoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoInventario() {
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
		//this.jInternalFrameDetalleEstadoInventario = new EstadoInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoInventario= new GridBagLayout();
		

		
		String sToolTipEstadoInventario="";
		sToolTipEstadoInventario=EstadoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoInventario+="(Inventario.EstadoInventario)";
		}
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoInventario = new JButtonMe();
		this.jButtonModificarEstadoInventario = new JButtonMe();
        this.jButtonActualizarEstadoInventario = new JButtonMe();
        this.jButtonEliminarEstadoInventario = new JButtonMe();
        this.jButtonCancelarEstadoInventario = new JButtonMe();
        this.jButtonGuardarCambiosEstadoInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoInventario = new JButtonMe();
		this.jButtonCerrarEstadoInventario = new JButtonMe();
		
		this.jScrollPanelDatosEstadoInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoInventario = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Inventario";
		
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoInventario.setName("jPanelCamposEstadoInventario"); 

		this.jPanelCamposOcultosEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoInventario.setName("jPanelCamposOcultosEstadoInventario"); 

        this.jPanelAccionesEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoInventario.setToolTipText("Acciones");
        this.jPanelAccionesEstadoInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoInventario.setText("Nuevo");
		this.jButtonModificarEstadoInventario.setText("Editar");
        this.jButtonActualizarEstadoInventario.setText("Actualizar");
        this.jButtonEliminarEstadoInventario.setText("Eliminar");
        this.jButtonCancelarEstadoInventario.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoInventario.setText("Guardar");
		this.jButtonCerrarEstadoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoInventario,"nuevo_button","Nuevo",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoInventario,"modificar_button","Editar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoInventario,"actualizar_button","Actualizar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoInventario,"eliminar_button","Eliminar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoInventario,"cancelar_button","Cancelar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoInventario,"guardarcambios_button","Guardar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoInventario,"guardarcambiostabla_button","Guardar",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoInventario,"cerrar_button","Salir",this.estadoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoInventario.setToolTipText("Nuevo"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoInventario.setToolTipText("Editar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoInventario.setToolTipText("Actualizar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoInventario.setToolTipText("Eliminar)"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoInventario.setToolTipText("Cancelar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoInventario.setToolTipText("Guardar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoInventario.setToolTipText("Guardar"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoInventario.setToolTipText("Salir"+" "+EstadoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoInventario";
		inputMap = this.jButtonNuevoEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoInventario";
		inputMap = this.jButtonActualizarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoInventario";
		inputMap = this.jButtonEliminarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoInventario";
		inputMap = this.jButtonCancelarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoInventario"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoInventario";
		inputMap = this.jButtonCerrarEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoInventario";
		inputMap = this.jButtonGuardarCambiosTablaEstadoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoInventario.setToolTipText("Nuevo EstadoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoInventario.setToolTipText("Sin Cerrar Ventana EstadoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoInventario.setText("Accion");
		this.jComboBoxTiposAccionesEstadoInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoInventario = new JLabelMe();
		
		this.jLabelAccionesEstadoInventario.setText("Acciones");		
		this.jLabelAccionesEstadoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoInventario = new GridBagLayout();
		
		this.jPanelCamposEstadoInventario.setLayout(gridaBagLayoutCamposEstadoInventario);
		this.jPanelCamposOcultosEstadoInventario.setLayout(gridaBagLayoutCamposOcultosEstadoInventario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoInventario.gridy = 0;
	this.gridBagConstraintsEstadoInventario.gridx = 0;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoInventario.add(jLabelIdEstadoInventario, this.gridBagConstraintsEstadoInventario);



	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoInventario.gridy = 0;
	this.gridBagConstraintsEstadoInventario.gridx = 1;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoInventario.add(jTextFieldidEstadoInventario, this.gridBagConstraintsEstadoInventario);


	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoInventario.gridy = 0;
	this.gridBagConstraintsEstadoInventario.gridx = 0;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoInventario.add(jLabelcodigoEstadoInventario, this.gridBagConstraintsEstadoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = 0;
		this.gridBagConstraintsEstadoInventario.gridx = 2;
		this.gridBagConstraintsEstadoInventario.ipadx = 0;
		this.gridBagConstraintsEstadoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoInventario.add(jButtoncodigoEstadoInventarioBusqueda, this.gridBagConstraintsEstadoInventario);
	}

	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoInventario.gridy = 0;
	this.gridBagConstraintsEstadoInventario.gridx = 1;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoInventario.add(jTextFieldcodigoEstadoInventario, this.gridBagConstraintsEstadoInventario);


	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoInventario.gridy = 0;
	this.gridBagConstraintsEstadoInventario.gridx = 0;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoInventario.add(jLabelnombreEstadoInventario, this.gridBagConstraintsEstadoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		//this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoInventario.gridy = 0;
		this.gridBagConstraintsEstadoInventario.gridx = 2;
		this.gridBagConstraintsEstadoInventario.ipadx = 0;
		this.gridBagConstraintsEstadoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoInventario.add(jButtonnombreEstadoInventarioBusqueda, this.gridBagConstraintsEstadoInventario);
	}

	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoInventario.gridy = 0;
	this.gridBagConstraintsEstadoInventario.gridx = 1;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoInventario.add(jscrollPanenombreEstadoInventario, this.gridBagConstraintsEstadoInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoInventario.gridy = iYPanelCamposEstadoInventario;
	this.gridBagConstraintsEstadoInventario.gridx = iXPanelCamposEstadoInventario++;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoInventario.add(this.jPanelidEstadoInventario, this.gridBagConstraintsEstadoInventario);



	if(iXPanelCamposEstadoInventario % 1==0) {
		iXPanelCamposEstadoInventario=0;
		iYPanelCamposEstadoInventario++;
	}
	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoInventario.gridy = iYPanelCamposEstadoInventario;
	this.gridBagConstraintsEstadoInventario.gridx = iXPanelCamposEstadoInventario++;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoInventario.add(this.jPanelcodigoEstadoInventario, this.gridBagConstraintsEstadoInventario);



	if(iXPanelCamposEstadoInventario % 1==0) {
		iXPanelCamposEstadoInventario=0;
		iYPanelCamposEstadoInventario++;
	}
	this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoInventario.gridy = iYPanelCamposEstadoInventario;
	this.gridBagConstraintsEstadoInventario.gridx = iXPanelCamposEstadoInventario++;
	this.gridBagConstraintsEstadoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoInventario.add(this.jPanelnombreEstadoInventario, this.gridBagConstraintsEstadoInventario);



	if(iXPanelCamposEstadoInventario % 1==0) {
		iXPanelCamposEstadoInventario=0;
		iYPanelCamposEstadoInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoInventario= new GridBagLayout();
		this.jPanelAccionesEstadoInventario.setLayout(gridaBagLayoutAccionesEstadoInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoInventario= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoInventario.setLayout(gridaBagLayoutAccionesFormularioEstadoInventario);
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoInventario.add(this.jComboBoxTiposAccionesFormularioEstadoInventario, this.gridBagConstraintsEstadoInventario);

		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoInventario.add(this.jCheckBoxPostAccionNuevoEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoInventario.add(this.jCheckBoxPostAccionSinCerrarEstadoInventario, this.gridBagConstraintsEstadoInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoInventario.add(this.jCheckBoxPostAccionSinMensajeEstadoInventario, this.gridBagConstraintsEstadoInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = 0;
		this.gridBagConstraintsEstadoInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoInventario.add(this.jButtonModificarEstadoInventario, this.gridBagConstraintsEstadoInventario);							

		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoInventario.gridy = 0;
		this.gridBagConstraintsEstadoInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoInventario.add(this.jButtonEliminarEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
			
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoInventario.add(this.jButtonActualizarEstadoInventario, this.gridBagConstraintsEstadoInventario);


		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoInventario.add(this.jButtonGuardarCambiosEstadoInventario, this.gridBagConstraintsEstadoInventario);	
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = 0;		
		this.gridBagConstraintsEstadoInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoInventario.add(this.jButtonCancelarEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();						
			this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoInventario.gridx = 0;		
			//this.gridBagConstraintsEstadoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoInventario.gridx =0;
		this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoInventario, this.gridBagConstraintsEstadoInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoInventario = new EstadoInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoInventarioModel estadoinventarioModel=new EstadoInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoInventarioModel.EstadoInventarioFocusTraversalPolicy estadoinventarioFocusTraversalPolicy = estadoinventarioModel.new EstadoInventarioFocusTraversalPolicy(this);
			
			//estadoinventarioFocusTraversalPolicy.setestadoinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoinventarioModel);
			
			
			this.jContentPaneDetalleEstadoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoInventario = new GridBagLayout();	
			this.jContentPaneDetalleEstadoInventario.setLayout(gridaBagLayoutDetalleEstadoInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
				this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoInventario.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoInventario.add(jTtoolBarDetalleEstadoInventario, gridBagConstraintsEstadoInventario);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoInventario=   new JScrollPane(jContentPaneDetalleEstadoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoInventario.gridx = 0;
	        
			this.jContentPaneDetalleEstadoInventario.add(jPanelCamposEstadoInventario, gridBagConstraintsEstadoInventario);
			
			
			
			
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
						&& estadoinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCompra(this.puedeCargarPorParteCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransferencia(this.puedeCargarPorParteTransferencia,false,-1);
					
					if(this.estadoinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoInventario= new GridBagConstraints();
						this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoInventario.gridx = 0;
						this.jContentPaneDetalleEstadoInventario.add(this.jTabbedPaneRelacionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
					this.gridBagConstraintsEstadoInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoInventario.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoInventario.add(jPanelCamposOcultosEstadoInventario, gridBagConstraintsEstadoInventario);
				
					this.jPanelCamposOcultosEstadoInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoInventario.gridx = 0;
	        this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoInventario.add(this.jPanelAccionesFormularioEstadoInventario, this.gridBagConstraintsEstadoInventario);							
			
			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
	        this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoInventario.add(this.jPanelAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoInventario=   new JScrollPane(this.jPanelCamposEstadoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoInventario.gridx = 0;
			this.gridBagConstraintsEstadoInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoInventario, this.gridBagConstraintsEstadoInventario);			
			
			this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
			this.gridBagConstraintsEstadoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoInventario, this.gridBagConstraintsEstadoInventario);
			
			
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoInventario, this.gridBagConstraintsEstadoInventario);
		
			
		this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
		this.gridBagConstraintsEstadoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoInventario, this.gridBagConstraintsEstadoInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.compraSessionBean=new CompraSessionBean();
		this.compraSessionBean.setConGuardarRelaciones(true);
		this.compraSessionBean.setEsGuardarRelacionado(true);

		this.compraBeanSwingJInternalFrame=null;//new CompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.compraBeanSwingJInternalFramePopup=new CompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.compraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.compraSessionBean.getEsGuardarRelacionado()) {

				CompraJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				CompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.compraSessionBean.setEsGuardarRelacionado(true);

				this.compraBeanSwingJInternalFrame=new CompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.compraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.compraBeanSwingJInternalFrame.setcompraSessionBean(this.compraSessionBean);

				//this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
				//this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoInventario.gridx = 0;
				//this.jContentPaneDetalleEstadoInventario.add(this.compraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoInventario.add("Compras",this.compraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoInventario.setComponentAt(iIndexTab,this.compraBeanSwingJInternalFrame.getContentPane());
				}

				//CompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.compraSessionBean.setEsGuardarRelacionado(false);
				this.compraBeanSwingJInternalFrame=null;//new CompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.compraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCompra) {
					this.jTabbedPaneRelacionesEstadoInventario.add("Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transferenciaSessionBean=new TransferenciaSessionBean();
		this.transferenciaSessionBean.setConGuardarRelaciones(true);
		this.transferenciaSessionBean.setEsGuardarRelacionado(true);

		this.transferenciaBeanSwingJInternalFrame=null;//new TransferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transferenciaBeanSwingJInternalFramePopup=new TransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transferenciaSessionBean.getEsGuardarRelacionado()) {

				TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transferenciaSessionBean.setEsGuardarRelacionado(true);

				this.transferenciaBeanSwingJInternalFrame=new TransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.transferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transferenciaBeanSwingJInternalFrame.settransferenciaSessionBean(this.transferenciaSessionBean);

				//this.gridBagConstraintsEstadoInventario = new GridBagConstraints();
				//this.gridBagConstraintsEstadoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoInventario.gridx = 0;
				//this.jContentPaneDetalleEstadoInventario.add(this.transferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoInventario.add("Transferencias",this.transferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoInventario.setComponentAt(iIndexTab,this.transferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transferenciaSessionBean.setEsGuardarRelacionado(false);
				this.transferenciaBeanSwingJInternalFrame=null;//new TransferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransferencia) {
					this.jTabbedPaneRelacionesEstadoInventario.add("Transferencias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransferenciaBeanSwingJInternalFrame(List<EstadoInventario> estadoinventarios,EstadoInventario estadoinventario,TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transferenciaBeanSwingJInternalFrame=new TransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transferenciaBeanSwingJInternalFrame.getTransferenciaLogic().setConnexion(this.estadoinventarioLogic.getConnexion());

					transferenciaBeanSwingJInternalFrame.setestadoinventariosForeignKey(estadoinventarios);
					transferenciaBeanSwingJInternalFrame.setestadoinventarioForeignKey(estadoinventario);
					transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoInventario(true);
					transferenciaBeanSwingJInternalFrame.transferenciaSessionBean.setlidEstadoInventarioActual(estadoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyTransferencia(transferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					transferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoInventario(true);
					transferenciaBeanSwingJInternalFrame.setid_estado_inventarioFK_IdEstadoInventario(estadoinventario.getId());

					if(!this.conCargarFormDetalle) {
						transferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transferenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoInventarioForeignKey(estadoinventario,1,false,true,true);
					transferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoInventario");
					transferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoInventario");
					transferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransferencia(true);
					transferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransferencia("n",transferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, transferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					transferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTransferencia("relacionado");
					} else {
						transferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTransferencia("no_relacionado");
					}

					transferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionTransferencia().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCompraBeanSwingJInternalFrame(List<EstadoInventario> estadoinventarios,EstadoInventario estadoinventario,CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//compraBeanSwingJInternalFrame=new CompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					compraBeanSwingJInternalFrame.getCompraLogic().setConnexion(this.estadoinventarioLogic.getConnexion());

					compraBeanSwingJInternalFrame.setestadoinventariosForeignKey(estadoinventarios);
					compraBeanSwingJInternalFrame.setestadoinventarioForeignKey(estadoinventario);
					compraBeanSwingJInternalFrame.compraSessionBean.setisBusquedaDesdeForeignKeySesionEstadoInventario(true);
					compraBeanSwingJInternalFrame.compraSessionBean.setlidEstadoInventarioActual(estadoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					compraBeanSwingJInternalFrame.cargarCombosForeignKeyCompra(compraBeanSwingJInternalFrame.isCargarCombosDependencia);
					compraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoInventario(true);
					compraBeanSwingJInternalFrame.setid_estado_inventarioFK_IdEstadoInventario(estadoinventario.getId());

					if(!this.conCargarFormDetalle) {
						compraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					compraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoInventarioForeignKey(estadoinventario,1,false,true,true);
					compraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					compraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoInventario");
					compraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoInventario");
					compraBeanSwingJInternalFrame.inicializarActualizarBindingTablaCompra(true);
					compraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCompra("n",compraBeanSwingJInternalFrame.isGuardarCambiosEnLote, compraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					compraBeanSwingJInternalFrame.setAutoscrolls(true);
					compraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						compraBeanSwingJInternalFrame.actualizarEstadoPanelsCompra("relacionado");
					} else {
						compraBeanSwingJInternalFrame.actualizarEstadoPanelsCompra("no_relacionado");
					}

					compraBeanSwingJInternalFrame.getjButtonRecargarInformacionCompra().setVisible(false);

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
