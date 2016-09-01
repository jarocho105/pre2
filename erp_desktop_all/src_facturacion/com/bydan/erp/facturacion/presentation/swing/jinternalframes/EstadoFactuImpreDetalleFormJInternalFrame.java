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



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.facturacion.util.EstadoFactuImpreConstantesFunciones;

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
public class EstadoFactuImpreDetalleFormJInternalFrame extends EstadoFactuImpreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoFactuImpre;
	
	protected JMenuBar jmenuBarDetalleEstadoFactuImpre;
	
	protected JMenu jmenuDetalleEstadoFactuImpre;
	protected JMenu jmenuDetalleArchivoEstadoFactuImpre;
	protected JMenu jmenuDetalleAccionesEstadoFactuImpre;
	protected JMenu jmenuDetalleDatosEstadoFactuImpre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoFactuImpre;	
	protected GridBagConstraints gridBagConstraintsEstadoFactuImpre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoFactuImpreBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoFactuImpre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoFactuImpreSessionBean estadofactuimpreSessionBean;
	
	

	public FacturaImpresionBeanSwingJInternalFrame facturaimpresionBeanSwingJInternalFrame=null;
	public FacturaImpresionBeanSwingJInternalFrame facturaimpresionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaImpresion=false;
	public FacturaImpresionSessionBean facturaimpresionSessionBean;
	
		
	
	public EstadoFactuImpreLogic estadofactuimpreLogic;
	
	public JScrollPane jScrollPanelDatosEstadoFactuImpre;
	public JScrollPane jScrollPanelDatosEdicionEstadoFactuImpre;
	public JScrollPane jScrollPanelDatosGeneralEstadoFactuImpre;
	
	protected JPanel jPanelCamposEstadoFactuImpre;    
	protected JPanel jPanelCamposOcultosEstadoFactuImpre;    	
	protected JPanel jPanelAccionesEstadoFactuImpre;
	protected JPanel jPanelAccionesFormularioEstadoFactuImpre;
    
	
	
	protected Integer iXPanelCamposEstadoFactuImpre=0;
	protected Integer iYPanelCamposEstadoFactuImpre=0;
	
	protected Integer iXPanelCamposOcultosEstadoFactuImpre=0;
	protected Integer iYPanelCamposOcultosEstadoFactuImpre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoFactuImpre;
	public JButton jButtonModificarEstadoFactuImpre;
	public JButton jButtonActualizarEstadoFactuImpre;
    public JButton jButtonEliminarEstadoFactuImpre;
	public JButton jButtonCancelarEstadoFactuImpre;
    public JButton jButtonGuardarCambiosEstadoFactuImpre;
	public JButton jButtonGuardarCambiosTablaEstadoFactuImpre;
	protected JButton jButtonCerrarEstadoFactuImpre;
	
	
	protected JButton jButtonProcesarInformacionEstadoFactuImpre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoFactuImpre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoFactuImpre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoFactuImpre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoFactuImpre;
	protected JButton jButtonModificarToolBarEstadoFactuImpre;
	protected JButton jButtonActualizarToolBarEstadoFactuImpre;
    protected JButton jButtonEliminarToolBarEstadoFactuImpre;
	protected JButton jButtonCancelarToolBarEstadoFactuImpre;
    protected JButton jButtonGuardarCambiosToolBarEstadoFactuImpre;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoFactuImpre;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoFactuImpre;
	protected JButton jButtonCerrarToolBarEstadoFactuImpre;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoFactuImpre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoFactuImpre;
	protected JMenuItem jMenuItemModificarEstadoFactuImpre;
	protected JMenuItem jMenuItemActualizarEstadoFactuImpre;
    protected JMenuItem jMenuItemEliminarEstadoFactuImpre;
	protected JMenuItem jMenuItemCancelarEstadoFactuImpre;
    protected JMenuItem jMenuItemGuardarCambiosEstadoFactuImpre;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoFactuImpre;
	protected JMenuItem jMenuItemCerrarEstadoFactuImpre;
	protected JMenuItem jMenuItemDetalleCerrarEstadoFactuImpre;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoFactuImpre;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoFactuImpre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoFactuImpre;
	protected JMenuItem jMenuItemMostrarOcultarEstadoFactuImpre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoFactuImpre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoFactuImpre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoFactuImpre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoFactuImpre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoFactuImpre;
	public JLabel jLabelIdEstadoFactuImpre;
	public JLabel jLabelidEstadoFactuImpre;
	public JButton jButtonidEstadoFactuImpreBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoFactuImpre;
	public JLabel jLabelcodigoEstadoFactuImpre;
	public JTextField jTextFieldcodigoEstadoFactuImpre;
	public JButton jButtoncodigoEstadoFactuImpreBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoFactuImpre;
	public JLabel jLabelnombreEstadoFactuImpre;
	public JTextArea jTextAreanombreEstadoFactuImpre;
	public JScrollPane jscrollPanenombreEstadoFactuImpre;
	public JButton jButtonnombreEstadoFactuImpreBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoFactuImpre;
	
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
	
	public EstadoFactuImpreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoFactuImpre=new JPanel();
				this.jPanelAccionesFormularioEstadoFactuImpre=new JPanel();
				this.jmenuBarDetalleEstadoFactuImpre=new JMenuBar();
				this.jTtoolBarDetalleEstadoFactuImpre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoFactuImpreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoFactuImpreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoFactuImpre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoFactuImpre() {
		return this.jButtonActualizarToolBarEstadoFactuImpre;
	}
	
	public JButton getjButtonEliminarToolBarEstadoFactuImpre() {
		return this.jButtonEliminarToolBarEstadoFactuImpre;
	}
	
	public JButton getjButtonCancelarToolBarEstadoFactuImpre() {
		return this.jButtonCancelarToolBarEstadoFactuImpre;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoFactuImpre() {
		return this.jButtonProcesarInformacionEstadoFactuImpre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoFactuImpre)	{
		this.jButtonProcesarInformacionEstadoFactuImpre = jButtonProcesarInformacionEstadoFactuImpre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoFactuImpre() {
		return this.jComboBoxTiposAccionesEstadoFactuImpre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoFactuImpre(
			JComboBox jComboBoxTiposRelacionesEstadoFactuImpre) {
		this.jComboBoxTiposRelacionesEstadoFactuImpre = jComboBoxTiposRelacionesEstadoFactuImpre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoFactuImpre(
			JComboBox jComboBoxTiposAccionesEstadoFactuImpre) {
		this.jComboBoxTiposAccionesEstadoFactuImpre = jComboBoxTiposAccionesEstadoFactuImpre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoFactuImpre() {
		return this.jComboBoxTiposAccionesFormularioEstadoFactuImpre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoFactuImpre(
			JComboBox jComboBoxTiposAccionesFormularioEstadoFactuImpre) {
		this.jComboBoxTiposAccionesFormularioEstadoFactuImpre = jComboBoxTiposAccionesFormularioEstadoFactuImpre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadofactuimpreSessionBean=new EstadoFactuImpreSessionBean();
		
		this.estadofactuimpreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadofactuimpreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadofactuimpreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoFactuImpreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Factu Impre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoFactuImpreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoFactuImpre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoFactuImpre=new JButtonMe();
				this.jButtonModificarToolBarEstadoFactuImpre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoFactuImpre,this.jTtoolBarDetalleEstadoFactuImpre,
							"actualizar","actualizar","Actualizar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoFactuImpre,this.jTtoolBarDetalleEstadoFactuImpre,
							"eliminar","eliminar","Eliminar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoFactuImpre,this.jTtoolBarDetalleEstadoFactuImpre,
							"cancelar","cancelar","Cancelar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoFactuImpre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoFactuImpre,this.jTtoolBarDetalleEstadoFactuImpre,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoFactuImpre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoFactuImpre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoFactuImpre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoFactuImpre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoFactuImpre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoFactuImpre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoFactuImpre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoFactuImpre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoFactuImpre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoFactuImpre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoFactuImpre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoFactuImpre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoFactuImpre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoFactuImpre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoFactuImpre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoFactuImpre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoFactuImpre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoFactuImpre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoFactuImpre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoFactuImpre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoFactuImpre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoFactuImpre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoFactuImpre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoFactuImpre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoFactuImpre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoFactuImpre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoFactuImpre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoFactuImpre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoFactuImpre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoFactuImpre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoFactuImpre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoFactuImpre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoFactuImpre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoFactuImpre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoFactuImpre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoFactuImpre.add(this.jMenuItemDetalleCerrarEstadoFactuImpre);
		
		this.jmenuDetalleAccionesEstadoFactuImpre.add(this.jMenuItemActualizarEstadoFactuImpre);
		this.jmenuDetalleAccionesEstadoFactuImpre.add(this.jMenuItemEliminarEstadoFactuImpre);
		this.jmenuDetalleAccionesEstadoFactuImpre.add(this.jMenuItemCancelarEstadoFactuImpre);		
		
		//this.jmenuDetalleDatosEstadoFactuImpre.add(this.jMenuItemDetalleAbrirOrderByEstadoFactuImpre);				
		this.jmenuDetalleDatosEstadoFactuImpre.add(this.jMenuItemDetalleMostarOcultarEstadoFactuImpre);				
				
		//this.jmenuDetalleAccionesEstadoFactuImpre.add(this.jMenuItemGuardarCambiosEstadoFactuImpre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoFactuImpre.add(this.jmenuDetalleArchivoEstadoFactuImpre);		
		this.jmenuBarDetalleEstadoFactuImpre.add(this.jmenuDetalleAccionesEstadoFactuImpre);		
		this.jmenuBarDetalleEstadoFactuImpre.add(this.jmenuDetalleDatosEstadoFactuImpre);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoFactuImpre.add(this.jmenuDetalleEstadoFactuImpre);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoFactuImpre);				
	}
	
	
	public void inicializarElementosCamposEstadoFactuImpre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoFactuImpre = new JLabelMe();
		jLabelIdEstadoFactuImpre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoFactuImpre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoFactuImpre.setToolTipText(EstadoFactuImpreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoFactuImpre= new GridBagLayout();

		this.jPanelidEstadoFactuImpre.setLayout(this.gridaBagLayoutEstadoFactuImpre);

		jLabelidEstadoFactuImpre = new JLabel();
		jLabelidEstadoFactuImpre.setText("Id");

		jLabelidEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoFactuImpre = new JLabelMe();
		this.jLabelcodigoEstadoFactuImpre.setText(""+EstadoFactuImpreConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoFactuImpre.setToolTipText("Codigo");
		this.jLabelcodigoEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoFactuImpre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoFactuImpre.setToolTipText(EstadoFactuImpreConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoFactuImpre = new GridBagLayout();
		this.jPanelcodigoEstadoFactuImpre.setLayout(this.gridaBagLayoutEstadoFactuImpre);


		jTextFieldcodigoEstadoFactuImpre= new JTextFieldMe();

		jTextFieldcodigoEstadoFactuImpre.setEnabled(false);
		jTextFieldcodigoEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoFactuImpreBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoFactuImpreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoFactuImpreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoFactuImpreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoFactuImpreBusqueda.setText("U");
		this.jButtoncodigoEstadoFactuImpreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoFactuImpreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoFactuImpreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoFactuImpre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoFactuImpre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoFactuImpreBusqueda"));

		if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoFactuImpreBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoFactuImpre = new JLabelMe();
		this.jLabelnombreEstadoFactuImpre.setText(""+EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoFactuImpre.setToolTipText("Nombre");
		this.jLabelnombreEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoFactuImpre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoFactuImpre.setToolTipText(EstadoFactuImpreConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoFactuImpre = new GridBagLayout();
		this.jPanelnombreEstadoFactuImpre.setLayout(this.gridaBagLayoutEstadoFactuImpre);


		jTextAreanombreEstadoFactuImpre= new JTextAreaMe();
		jTextAreanombreEstadoFactuImpre.setEnabled(false);
		jTextAreanombreEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoFactuImpre.setLineWrap(true);
		jTextAreanombreEstadoFactuImpre.setWrapStyleWord(true);
		jTextAreanombreEstadoFactuImpre.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoFactuImpre.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoFactuImpre = new JScrollPane(jTextAreanombreEstadoFactuImpre);
		jscrollPanenombreEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoFactuImpreBusqueda= new JButtonMe();
		this.jButtonnombreEstadoFactuImpreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFactuImpreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoFactuImpreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoFactuImpreBusqueda.setText("U");
		this.jButtonnombreEstadoFactuImpreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoFactuImpreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoFactuImpreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoFactuImpre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoFactuImpre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoFactuImpreBusqueda"));

		if(this.estadofactuimpreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoFactuImpreBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoFactuImpre() {
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
		//this.jInternalFrameDetalleEstadoFactuImpre = new EstadoFactuImpreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Factu Impre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoFactuImpre= new GridBagLayout();
		

		
		String sToolTipEstadoFactuImpre="";
		sToolTipEstadoFactuImpre=EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoFactuImpre+="(Facturacion.EstadoFactuImpre)";
		}
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoFactuImpre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoFactuImpre = new JButtonMe();
		this.jButtonModificarEstadoFactuImpre = new JButtonMe();
        this.jButtonActualizarEstadoFactuImpre = new JButtonMe();
        this.jButtonEliminarEstadoFactuImpre = new JButtonMe();
        this.jButtonCancelarEstadoFactuImpre = new JButtonMe();
        this.jButtonGuardarCambiosEstadoFactuImpre = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoFactuImpre = new JButtonMe();
		this.jButtonCerrarEstadoFactuImpre = new JButtonMe();
		
		this.jScrollPanelDatosEstadoFactuImpre = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoFactuImpre = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoFactuImpre = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Factu Impre";
		
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Factu Impres" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoFactuImpre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoFactuImpre.setName("jPanelCamposEstadoFactuImpre"); 

		this.jPanelCamposOcultosEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoFactuImpre.setName("jPanelCamposOcultosEstadoFactuImpre"); 

        this.jPanelAccionesEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoFactuImpre.setToolTipText("Acciones");
        this.jPanelAccionesEstadoFactuImpre.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoFactuImpre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoFactuImpre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoFactuImpre.setText("Nuevo");
		this.jButtonModificarEstadoFactuImpre.setText("Editar");
        this.jButtonActualizarEstadoFactuImpre.setText("Actualizar");
        this.jButtonEliminarEstadoFactuImpre.setText("Eliminar");
        this.jButtonCancelarEstadoFactuImpre.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoFactuImpre.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.setText("Guardar");
		this.jButtonCerrarEstadoFactuImpre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoFactuImpre,"nuevo_button","Nuevo",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoFactuImpre,"modificar_button","Editar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoFactuImpre,"actualizar_button","Actualizar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoFactuImpre,"eliminar_button","Eliminar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoFactuImpre,"cancelar_button","Cancelar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoFactuImpre,"guardarcambios_button","Guardar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoFactuImpre,"guardarcambiostabla_button","Guardar",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoFactuImpre,"cerrar_button","Salir",this.estadofactuimpreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoFactuImpre.setToolTipText("Nuevo"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoFactuImpre.setToolTipText("Editar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoFactuImpre.setToolTipText("Actualizar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoFactuImpre.setToolTipText("Eliminar)"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoFactuImpre.setToolTipText("Cancelar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoFactuImpre.setToolTipText("Guardar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.setToolTipText("Guardar"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoFactuImpre.setToolTipText("Salir"+" "+EstadoFactuImpreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoFactuImpre";
		inputMap = this.jButtonNuevoEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoFactuImpre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoFactuImpre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoFactuImpre";
		inputMap = this.jButtonActualizarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoFactuImpre"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoFactuImpre";
		inputMap = this.jButtonEliminarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoFactuImpre"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoFactuImpre";
		inputMap = this.jButtonCancelarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoFactuImpre"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoFactuImpre";
		inputMap = this.jButtonCerrarEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoFactuImpre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoFactuImpre";
		inputMap = this.jButtonGuardarCambiosTablaEstadoFactuImpre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoFactuImpre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoFactuImpre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoFactuImpre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoFactuImpre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoFactuImpre.setToolTipText("Nuevo EstadoFactuImpre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoFactuImpre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoFactuImpre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoFactuImpre.setToolTipText("Sin Cerrar Ventana EstadoFactuImpre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoFactuImpre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoFactuImpre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoFactuImpre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoFactuImpre.setText("Accion");
		this.jComboBoxTiposAccionesEstadoFactuImpre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoFactuImpre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoFactuImpre = new JLabelMe();
		
		this.jLabelAccionesEstadoFactuImpre.setText("Acciones");		
		this.jLabelAccionesEstadoFactuImpre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFactuImpre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoFactuImpre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoFactuImpre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoFactuImpre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoFactuImpre=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoFactuImpre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoFactuImpre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoFactuImpre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFactuImpre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoFactuImpre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoFactuImpre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoFactuImpre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoFactuImpre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoFactuImpre = new GridBagLayout();
		
		this.jPanelCamposEstadoFactuImpre.setLayout(gridaBagLayoutCamposEstadoFactuImpre);
		this.jPanelCamposOcultosEstadoFactuImpre.setLayout(gridaBagLayoutCamposOcultosEstadoFactuImpre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
	this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoFactuImpre.add(jLabelIdEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);



	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
	this.gridBagConstraintsEstadoFactuImpre.gridx = 1;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoFactuImpre.add(jLabelidEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);


	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
	this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoFactuImpre.add(jLabelcodigoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
		this.gridBagConstraintsEstadoFactuImpre.gridx = 2;
		this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
		this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoFactuImpre.add(jButtoncodigoEstadoFactuImpreBusqueda, this.gridBagConstraintsEstadoFactuImpre);
	}

	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
	this.gridBagConstraintsEstadoFactuImpre.gridx = 1;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoFactuImpre.add(jTextFieldcodigoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);


	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
	this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoFactuImpre.add(jLabelnombreEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		//this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
		this.gridBagConstraintsEstadoFactuImpre.gridx = 2;
		this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
		this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoFactuImpre.add(jButtonnombreEstadoFactuImpreBusqueda, this.gridBagConstraintsEstadoFactuImpre);
	}

	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
	this.gridBagConstraintsEstadoFactuImpre.gridx = 1;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoFactuImpre.add(jscrollPanenombreEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFactuImpre.gridy = iYPanelCamposEstadoFactuImpre;
	this.gridBagConstraintsEstadoFactuImpre.gridx = iXPanelCamposEstadoFactuImpre++;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFactuImpre.add(this.jPanelidEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);



	if(iXPanelCamposEstadoFactuImpre % 1==0) {
		iXPanelCamposEstadoFactuImpre=0;
		iYPanelCamposEstadoFactuImpre++;
	}
	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFactuImpre.gridy = iYPanelCamposEstadoFactuImpre;
	this.gridBagConstraintsEstadoFactuImpre.gridx = iXPanelCamposEstadoFactuImpre++;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFactuImpre.add(this.jPanelcodigoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);



	if(iXPanelCamposEstadoFactuImpre % 1==0) {
		iXPanelCamposEstadoFactuImpre=0;
		iYPanelCamposEstadoFactuImpre++;
	}
	this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoFactuImpre.gridy = iYPanelCamposEstadoFactuImpre;
	this.gridBagConstraintsEstadoFactuImpre.gridx = iXPanelCamposEstadoFactuImpre++;
	this.gridBagConstraintsEstadoFactuImpre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoFactuImpre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoFactuImpre.add(this.jPanelnombreEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);



	if(iXPanelCamposEstadoFactuImpre % 1==0) {
		iXPanelCamposEstadoFactuImpre=0;
		iYPanelCamposEstadoFactuImpre++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoFactuImpre= new GridBagLayout();
		this.jPanelAccionesEstadoFactuImpre.setLayout(gridaBagLayoutAccionesEstadoFactuImpre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoFactuImpre= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoFactuImpre.setLayout(gridaBagLayoutAccionesFormularioEstadoFactuImpre);
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFactuImpre.add(this.jComboBoxTiposAccionesFormularioEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);

		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoFactuImpre.add(this.jCheckBoxPostAccionNuevoEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFactuImpre.add(this.jCheckBoxPostAccionSinCerrarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadofactuimpreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadofactuimpreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoFactuImpre.add(this.jCheckBoxPostAccionSinMensajeEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoFactuImpre.add(this.jButtonModificarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);							

		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;
		this.gridBagConstraintsEstadoFactuImpre.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoFactuImpre.add(this.jButtonEliminarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
			
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFactuImpre.add(this.jButtonActualizarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);


		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoFactuImpre.add(this.jButtonGuardarCambiosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);	
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = 0;		
		this.gridBagConstraintsEstadoFactuImpre.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoFactuImpre.add(this.jButtonCancelarEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoFactuImpre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoFactuImpre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadofactuimpreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();						
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoFactuImpre.gridx = 0;		
			//this.gridBagConstraintsEstadoFactuImpre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoFactuImpre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoFactuImpre.gridx =0;
		this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoFactuImpre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoFactuImpreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoFactuImpre = new EstadoFactuImpreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Factu Impre DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Factu Impre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Factu Impre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoFactuImpreModel estadofactuimpreModel=new EstadoFactuImpreModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoFactuImpreModel.EstadoFactuImpreFocusTraversalPolicy estadofactuimpreFocusTraversalPolicy = estadofactuimpreModel.new EstadoFactuImpreFocusTraversalPolicy(this);
			
			//estadofactuimpreFocusTraversalPolicy.setestadofactuimpreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadofactuimpreModel);
			
			
			this.jContentPaneDetalleEstadoFactuImpre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoFactuImpre = new GridBagLayout();	
			this.jContentPaneDetalleEstadoFactuImpre.setLayout(gridaBagLayoutDetalleEstadoFactuImpre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoFactuImpre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
				this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoFactuImpre.add(jTtoolBarDetalleEstadoFactuImpre, gridBagConstraintsEstadoFactuImpre);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoFactuImpre=   new JScrollPane(jContentPaneDetalleEstadoFactuImpre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFactuImpre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFactuImpre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFactuImpre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoFactuImpre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoFactuImpre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFactuImpre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoFactuImpre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
	        
			this.jContentPaneDetalleEstadoFactuImpre.add(jPanelCamposEstadoFactuImpre, gridBagConstraintsEstadoFactuImpre);
			
			
			
			
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
						&& estadofactuimpreSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFacturaImpresion(this.puedeCargarPorParteFacturaImpresion,false,-1);
					
					if(this.estadofactuimpreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoFactuImpre= new GridBagConstraints();
						this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
						this.jContentPaneDetalleEstadoFactuImpre.add(this.jTabbedPaneRelacionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoFactuImpre.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFacturaImpresion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoFactuImpre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
					this.gridBagConstraintsEstadoFactuImpre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoFactuImpre.add(jPanelCamposOcultosEstadoFactuImpre, gridBagConstraintsEstadoFactuImpre);
				
					this.jPanelCamposOcultosEstadoFactuImpre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
	        this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoFactuImpre.add(this.jPanelAccionesFormularioEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);							
			
			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
	        this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoFactuImpre.add(this.jPanelAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoFactuImpre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoFactuImpre=   new JScrollPane(this.jPanelCamposEstadoFactuImpre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoFactuImpre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFactuImpre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoFactuImpre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
			this.gridBagConstraintsEstadoFactuImpre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoFactuImpre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoFactuImpre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);			
			
			this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
			this.gridBagConstraintsEstadoFactuImpre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
			
			
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		
			
		this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
		this.gridBagConstraintsEstadoFactuImpre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoFactuImpre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoFactuImpre, this.gridBagConstraintsEstadoFactuImpre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoFactuImpre;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoFactuImpre;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFacturaImpresion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaimpresionSessionBean=new FacturaImpresionSessionBean();
		this.facturaimpresionSessionBean.setConGuardarRelaciones(false);
		this.facturaimpresionSessionBean.setEsGuardarRelacionado(true);

		this.facturaimpresionBeanSwingJInternalFrame=null;//new FacturaImpresionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaimpresionBeanSwingJInternalFramePopup=new FacturaImpresionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaimpresionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {

				FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaImpresionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoFactuImpreJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaimpresionSessionBean.setEsGuardarRelacionado(true);

				this.facturaimpresionBeanSwingJInternalFrame=new FacturaImpresionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.facturaimpresionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaimpresionBeanSwingJInternalFrame.setfacturaimpresionSessionBean(this.facturaimpresionSessionBean);

				//this.gridBagConstraintsEstadoFactuImpre = new GridBagConstraints();
				//this.gridBagConstraintsEstadoFactuImpre.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoFactuImpre.gridx = 0;
				//this.jContentPaneDetalleEstadoFactuImpre.add(this.facturaimpresionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoFactuImpre);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoFactuImpre.add("Factura Impresiones",this.facturaimpresionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoFactuImpre.setComponentAt(iIndexTab,this.facturaimpresionBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaImpresionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaimpresionSessionBean.setEsGuardarRelacionado(false);
				this.facturaimpresionBeanSwingJInternalFrame=null;//new FacturaImpresionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaimpresionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaImpresion) {
					this.jTabbedPaneRelacionesEstadoFactuImpre.add("Factura Impresiones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaImpresionBeanSwingJInternalFrame(List<EstadoFactuImpre> estadofactuimpres,EstadoFactuImpre estadofactuimpre,FacturaImpresionBeanSwingJInternalFrame facturaimpresionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaimpresionBeanSwingJInternalFrame=new FacturaImpresionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaimpresionBeanSwingJInternalFrame.getFacturaImpresionLogic().setConnexion(this.estadofactuimpreLogic.getConnexion());

					facturaimpresionBeanSwingJInternalFrame.setestadofactuimpresForeignKey(estadofactuimpres);
					facturaimpresionBeanSwingJInternalFrame.setestadofactuimpreForeignKey(estadofactuimpre);
					facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.setisBusquedaDesdeForeignKeySesionEstadoFactuImpre(true);
					facturaimpresionBeanSwingJInternalFrame.facturaimpresionSessionBean.setlidEstadoFactuImpreActual(estadofactuimpre.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaimpresionBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaImpresion(facturaimpresionBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaimpresionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoFactuImpre(true);
					facturaimpresionBeanSwingJInternalFrame.setid_estado_factu_impreFK_IdEstadoFactuImpre(estadofactuimpre.getId());

					if(!this.conCargarFormDetalle) {
						facturaimpresionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaimpresionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoFactuImpreForeignKey(estadofactuimpre,1,false,true,true);
					facturaimpresionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaimpresionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoFactuImpre");
					facturaimpresionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoFactuImpre");
					facturaimpresionBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaImpresion(true);
					facturaimpresionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaImpresion("n",facturaimpresionBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaimpresionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaimpresionBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaimpresionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaimpresionBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaImpresion("relacionado");
					} else {
						facturaimpresionBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaImpresion("no_relacionado");
					}

					facturaimpresionBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaImpresion().setVisible(false);

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
